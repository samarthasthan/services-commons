CREATE TABLE Reports (
    Id BIGSERIAL PRIMARY KEY,                       
    External_Id VARCHAR(11) UNIQUE, 

    File_Id BIGSERIAL NOT NULL REFERENCES Files(Id) ON DELETE CASCADE,
    User_Id BIGSERIAL NOT NULL REFERENCES Users(Id) ON DELETE CASCADE,

    -- Predefined category enum (add new ones easily later)
    Category VARCHAR(50) NOT NULL CHECK (
        Category IN (
            'NSFW',
            'Illegal',
            'Spam',
            'Copyright Violation',
            'Harassment',
            'Malware',
            'Other'
        )
    ),

    -- Optional user explanation
    Description TEXT,

    -- Moderation status
    Status VARCHAR(20) NOT NULL DEFAULT 'Pending' CHECK (
        Status IN ('Pending', 'Reviewed', 'Resolved', 'Rejected')
    ),

    -- Optional moderator info
    Reviewed_By BIGSERIAL REFERENCES Users(Id) ON DELETE SET NULL,
    Review_Notes TEXT,

    Created_At TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    Updated_At TIMESTAMPTZ DEFAULT NOW(),

    CONSTRAINT unique_user_file_report UNIQUE (File_Id, User_Id)
);

-- Indexes for performance
CREATE INDEX idx_report_file_id ON Reports(File_Id);
CREATE INDEX idx_report_status ON Reports(Status);
CREATE INDEX idx_report_category ON Reports(Category);
