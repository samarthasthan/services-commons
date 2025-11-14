INSERT INTO Features (Key, Description, ExternalId)
VALUES
    ('storage_limit_gb', 'Maximum storage in GB', 'B')
ON CONFLICT (Key) DO NOTHING;

INSERT INTO Features (Key, Description, ExternalId)
VALUES
    ('vpn_enabled', 'Whether VPN is enabled for this plan', 'C')
ON CONFLICT (Key) DO NOTHING;


