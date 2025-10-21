
DROP TABLE ContactUs;

-- Drop indexes for Blogs
DROP INDEX IF EXISTS idx_blogs_tags;
DROP INDEX IF EXISTS idx_blogs_title_tsvector;
DROP INDEX IF EXISTS idx_blogs_status_created_at;

-- Drop Blogs table
DROP TABLE IF EXISTS Blogs;

-- Optional: Drop indexes for NewsLetters (if you want to recreate them)
DROP INDEX IF EXISTS idx_newsletters_active;
DROP INDEX IF EXISTS idx_newsletters_subscribed_at;
DROP INDEX IF EXISTS idx_newsletters_unsubscribed_at;

-- Drop NewsLetters table
DROP TABLE IF EXISTS NewsLetters;



DROP INDEX IF EXISTS idx_permissions_shared_with;
DROP INDEX IF EXISTS idx_files_share_id;
DROP INDEX IF EXISTS idx_files_owner_id;
DROP INDEX IF EXISTS idx_files_parent_id;

DROP TABLE IF EXISTS FilePermissions;
DROP TABLE IF EXISTS FileFavorites;
DROP TABLE IF EXISTS Files;



