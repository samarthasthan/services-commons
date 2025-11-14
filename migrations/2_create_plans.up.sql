CREATE TABLE Plans (
    Id BIGSERIAL PRIMARY KEY,                       
    External_Id VARCHAR(20) UNIQUE, 
    Name varchar(255) NOT NULL,        -- "Free", "Pro", etc.
    Price decimal(10, 2) NOT NULL,     -- Monthly cost
    Description text,
    CreatedAt timestamp NOT NULL DEFAULT now(),
    UpdatedAt timestamp NOT NULL DEFAULT now()
);

CREATE TABLE Features (
    Id BIGSERIAL PRIMARY KEY,                       
    External_Id VARCHAR(20) UNIQUE, 
    Key varchar(255) UNIQUE NOT NULL,  -- "storage_limit_gb"
    Description text
);

CREATE TABLE PlansFeatures (
    Id BIGSERIAL PRIMARY KEY,                       
    External_Id VARCHAR(20) UNIQUE, 
    PlanID BIGSERIAL NOT NULL REFERENCES Plans(Id) ON DELETE CASCADE,
    FeatureID BIGSERIAL NOT NULL REFERENCES Features(Id) ON DELETE CASCADE,
    FeatureValue varchar(255),
    IsEnabled boolean NOT NULL DEFAULT true,
    CreatedAt timestamp NOT NULL DEFAULT now(),
    UpdatedAt timestamp NOT NULL DEFAULT now(),
    UNIQUE (PlanID, FeatureID)  -- prevent duplicate features per plan
);


CREATE TABLE Subscriptions (
    Id BIGSERIAL PRIMARY KEY,                       
    External_Id VARCHAR(20) UNIQUE, 
    UserID BIGSERIAL NOT NULL REFERENCES Users(Id) ON DELETE CASCADE,
    PlanID BIGSERIAL NOT NULL REFERENCES Plans(Id) ON DELETE CASCADE,
    StartDate timestamp NOT NULL DEFAULT now(),
    EndDate timestamp,
    IsActive boolean NOT NULL DEFAULT true
);

CREATE UNIQUE INDEX unique_active_subscription
ON Subscriptions(UserID)
WHERE IsActive = true;


