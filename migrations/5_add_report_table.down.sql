-- Drop indexes first (safe order)
DROP INDEX IF EXISTS idx_report_category;
DROP INDEX IF EXISTS idx_report_status;
DROP INDEX IF EXISTS idx_report_file_id;

-- Drop the Reports table
DROP TABLE IF EXISTS Reports;
