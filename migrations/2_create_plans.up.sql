CREATE TABLE Plans (
    Id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
    Name varchar(255) NOT NULL,        -- "Free", "Pro", etc.
    Price decimal(10, 2) NOT NULL,     -- Monthly cost
    Description text,
    CreatedAt timestamp NOT NULL DEFAULT now(),
    UpdatedAt timestamp NOT NULL DEFAULT now()
);

CREATE TABLE Features (
    Id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
    Key varchar(255) UNIQUE NOT NULL,  -- "storage_limit_gb"
    Description text
);

CREATE TABLE PlansFeatures (
    Id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
    PlanID uuid NOT NULL REFERENCES Plans(Id) ON DELETE CASCADE,
    FeatureID uuid NOT NULL REFERENCES Features(Id) ON DELETE CASCADE,
    FeatureValue varchar(255),
    IsEnabled boolean NOT NULL DEFAULT true,
    CreatedAt timestamp NOT NULL DEFAULT now(),
    UpdatedAt timestamp NOT NULL DEFAULT now(),
    UNIQUE (PlanID, FeatureID)  -- prevent duplicate features per plan
);


CREATE TABLE Subscriptions (
    Id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
    UserID uuid NOT NULL REFERENCES Users(Id) ON DELETE CASCADE,
    PlanID uuid NOT NULL REFERENCES Plans(Id) ON DELETE CASCADE,
    StartDate timestamp NOT NULL DEFAULT now(),
    EndDate timestamp,
    IsActive boolean NOT NULL DEFAULT true
);

CREATE UNIQUE INDEX unique_active_subscription
ON Subscriptions(UserID)
WHERE IsActive = true;


