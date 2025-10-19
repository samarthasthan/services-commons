

CREATE TABLE Thumbnails (
    Id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    File_Id UUID NOT NULL REFERENCES Files(Id) ON DELETE CASCADE,
    Label VARCHAR(50) NOT NULL,           -- e.g., small, medium, large
    Width INT NOT NULL,                   -- pixel width
    Height INT NOT NULL,                  -- pixel height
    Format VARCHAR(10) NOT NULL,          -- e.g., jpg, webp
    Size BIGINT NOT NULL,                 -- file size in bytes
    S3_Key VARCHAR(1024) NOT NULL,        -- S3 object key or URL
    Is_Public BOOLEAN NOT NULL DEFAULT FALSE,
    Created_At INT NOT NULL DEFAULT (EXTRACT(EPOCH FROM CURRENT_TIMESTAMP)),
    Updated_At INT
);

-- Optional: add an index for faster lookup by file
CREATE INDEX idx_thumbnails_file_id ON Thumbnails(File_Id);