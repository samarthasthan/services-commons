CREATE TABLE Users (
    Id BIGSERIAL PRIMARY KEY,                       
    External_Id VARCHAR(11) UNIQUE, 
    Full_Name VARCHAR(255) NOT NULL,            
    Email VARCHAR(255) NOT NULL UNIQUE,        
    Password VARCHAR(255) NOT NULL,         
    Role VARCHAR(50) NOT NULL DEFAULT 'user',
    IsVerified BOOLEAN NOT NULL DEFAULT FALSE,
    Created_At INT NOT NULL DEFAULT (EXTRACT(EPOCH FROM CURRENT_TIMESTAMP)), 
    Updated_At INT NOT NULL DEFAULT (EXTRACT(EPOCH FROM CURRENT_TIMESTAMP)),
    Deleted_At INT NULL                 
);


CREATE TABLE ContactUs (
    Id BIGSERIAL PRIMARY KEY,                       
    External_Id VARCHAR(11) UNIQUE, 
    FullName VARCHAR(100) NOT NULL,
    WorkEmail VARCHAR(255) NOT NULL,
    CountryRegion VARCHAR(100) NOT NULL,
    CompanyWebsite TEXT,
    JobFunction VARCHAR(100),
    Message TEXT NOT NULL,
    CreatedAt TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Blogs (
    Id BIGSERIAL PRIMARY KEY,                       
    External_Id VARCHAR(11) UNIQUE, 
    Author_Id BIGSERIAL NOT NULL REFERENCES Users(Id) ON DELETE CASCADE,
    Title VARCHAR(255) NOT NULL,
    Slug VARCHAR(255) NOT NULL UNIQUE,
    Thumbnail TEXT,
    Content JSONB NOT NULL,   -- stores TipTap JSON
    Tags TEXT[] DEFAULT '{}', -- array of tags
    Status SMALLINT NOT NULL DEFAULT 1, -- 0=unspecified, 1=draft, 2=published, 3=archived
    Created_At INT NOT NULL DEFAULT (EXTRACT(EPOCH FROM CURRENT_TIMESTAMP)),
    Updated_At INT NOT NULL DEFAULT (EXTRACT(EPOCH FROM CURRENT_TIMESTAMP)),
    Deleted_At INT NULL
);

CREATE TABLE NewsLetters (
    Id BIGSERIAL PRIMARY KEY,                       
    External_Id VARCHAR(11) UNIQUE, 
    Email VARCHAR(255) UNIQUE NOT NULL,
    Status SMALLINT NOT NULL DEFAULT 1,        -- 1=subscribed, 2=unsubscribed
    Subscribed_At INT NOT NULL DEFAULT (EXTRACT(EPOCH FROM CURRENT_TIMESTAMP)),
    Unsubscribed_At INT NULL,
    Created_At INT NOT NULL DEFAULT (EXTRACT(EPOCH FROM CURRENT_TIMESTAMP)),
    Updated_At INT NOT NULL DEFAULT (EXTRACT(EPOCH FROM CURRENT_TIMESTAMP)),
    Deleted_At INT NULL
);


CREATE INDEX idx_blogs_tags ON Blogs USING GIN (tags);
CREATE INDEX idx_blogs_title_tsvector ON Blogs USING GIN (to_tsvector('english', Title));
CREATE INDEX idx_blogs_status_created_at ON Blogs (Status, Created_At DESC);


-- 1. Active subscribers (Status = 1 and not deleted)
CREATE INDEX idx_newsletters_active 
ON NewsLetters (Email) 
WHERE Status = 1 AND Deleted_At IS NULL;

-- 2. Quickly sort/filter by subscription date
CREATE INDEX idx_newsletters_subscribed_at 
ON NewsLetters (Subscribed_At);

-- 3. Optionally, track recently unsubscribed
CREATE INDEX idx_newsletters_unsubscribed_at 
ON NewsLetters (Unsubscribed_At) 
WHERE Unsubscribed_At IS NOT NULL;



CREATE TABLE Files (
    Id BIGSERIAL PRIMARY KEY,                       
    External_Id VARCHAR(11) UNIQUE, 
    Owner_Id BIGSERIAL NOT NULL REFERENCES Users(Id) ON DELETE CASCADE,
    Name VARCHAR(255) NOT NULL,
    Type VARCHAR(10) NOT NULL CHECK (Type IN ('file', 'folder')), -- "file" or "folder"
    Parent_Id BIGSERIAL REFERENCES Files(Id) ON DELETE CASCADE, -- null = root
    Content_Type VARCHAR(255),
    Size BIGINT NOT NULL,
    Location VARCHAR(1024) NOT NULL, 
    Is_Public BOOLEAN NOT NULL DEFAULT FALSE,
    Share_Id UUID UNIQUE, -- only if shared publicly
    Created_At INT NOT NULL DEFAULT (EXTRACT(EPOCH FROM CURRENT_TIMESTAMP)),
    Updated_At INT,
    Deleted_At INT
);


CREATE TABLE FilePermissions (
    File_Id BIGSERIAL NOT NULL REFERENCES Files(Id) ON DELETE CASCADE,
    Shared_With BIGSERIAL NOT NULL REFERENCES Users(Id) ON DELETE CASCADE,
    Granted_At INT NOT NULL DEFAULT (EXTRACT(EPOCH FROM CURRENT_TIMESTAMP)),
    PRIMARY KEY (File_Id, Shared_With)
);

CREATE TABLE FileFavorites (
    User_Id BIGSERIAL NOT NULL REFERENCES Users(Id) ON DELETE CASCADE,
    File_Id BIGSERIAL NOT NULL REFERENCES Files(Id) ON DELETE CASCADE,
    PRIMARY KEY (User_Id, File_Id)
);

CREATE INDEX idx_favorites_user_id ON FileFavorites(User_Id);

CREATE INDEX idx_favorites_file_id ON FileFavorites(File_Id);

CREATE INDEX idx_files_owner_id ON Files(Owner_Id);

CREATE UNIQUE INDEX idx_files_share_id ON Files(Share_Id);

CREATE INDEX idx_permissions_shared_with ON FilePermissions(Shared_With);


CREATE INDEX idx_files_parent_id ON Files(Parent_Id);