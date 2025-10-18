-- 1️⃣ Insert features if they don't exist
INSERT INTO Features (Id, Key, Description)
VALUES
    (gen_random_uuid(), 'storage_limit_gb', 'Maximum storage in GB')
ON CONFLICT (Key) DO NOTHING;

INSERT INTO Features (Id, Key, Description)
VALUES
    (gen_random_uuid(), 'vpn_enabled', 'Whether VPN is enabled for this plan')
ON CONFLICT (Key) DO NOTHING;

-- 2️⃣ Insert the Free plan
INSERT INTO Plans (Id, Name, Price, Description)
VALUES
    (gen_random_uuid(), 'Free', 0.00, 'Free plan with limited features');

-- 3️⃣ Link features to the Free plan
-- Get the Free plan ID
WITH free_plan AS (
    SELECT Id FROM Plans WHERE Name = 'Free' LIMIT 1
), 
storage_feature AS (
    SELECT Id AS FeatureID FROM Features WHERE Key = 'storage_limit_gb'
),
vpn_feature AS (
    SELECT Id AS FeatureID FROM Features WHERE Key = 'vpn_enabled'
)
-- Insert storage feature
INSERT INTO PlansFeatures (PlanID, FeatureID, FeatureValue, IsEnabled)
SELECT free_plan.Id, storage_feature.FeatureID, '10', true
FROM free_plan, storage_feature
ON CONFLICT (PlanID, FeatureID) DO NOTHING;

-- Insert VPN feature (disabled)
INSERT INTO PlansFeatures (PlanID, FeatureID, FeatureValue, IsEnabled)
SELECT free_plan.Id, vpn_feature.FeatureID, 'false', false
FROM free_plan, vpn_feature
ON CONFLICT (PlanID, FeatureID) DO NOTHING;
