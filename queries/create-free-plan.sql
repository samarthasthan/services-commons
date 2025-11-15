INSERT INTO Features (Key, Description, External_Id)
VALUES
    ('storage_limit_gb', 'Maximum storage in GB', 'B')
ON CONFLICT (Key) DO NOTHING;

INSERT INTO Features (Key, Description, External_Id)
VALUES
    ('vpn_enabled', 'Whether VPN is enabled for this plan', 'C')
ON CONFLICT (Key) DO NOTHING;



INSERT INTO Plans (Name, Price, Description, External_Id)
VALUES ('Free', 0.00, 'Free plan with limited features', 'B');


WITH free_plan AS (
    SELECT Id FROM Plans WHERE Name = 'Free'
),
storage_feature AS (
    SELECT Id FROM Features WHERE Key = 'storage_limit_gb'
)
INSERT INTO PlansFeatures (PlanID, FeatureID, FeatureValue, IsEnabled)
SELECT free_plan.Id, storage_feature.Id, '10', true
FROM free_plan, storage_feature
ON CONFLICT (PlanID, FeatureID) DO NOTHING;


WITH free_plan AS (
    SELECT Id FROM Plans WHERE Name = 'Free'
),
vpn_feature AS (
    SELECT Id FROM Features WHERE Key = 'vpn_enabled'
)
INSERT INTO PlansFeatures (PlanID, FeatureID, FeatureValue, IsEnabled)
SELECT free_plan.Id, vpn_feature.Id, 'false', false
FROM free_plan, vpn_feature
ON CONFLICT (PlanID, FeatureID) DO NOTHING;
