# Directories
PROTO_DIR := proto
PROTO_VALIDATE_DIR := buf
GEN_DIR := gen

GO_OUT := $(GEN_DIR)/go
JAVA_OUT := $(GEN_DIR)/java
JS_OUT := $(GEN_DIR)/js

PROTO_FILES := $(shell find $(PROTO_DIR) -name "*.proto")
PROTO_VALIDATE_FILES := $(shell find $(PROTO_VALIDATE_DIR) -name "*.proto")

# Tools (you might need to install these)
PROTOC := protoc
PROTOC_GEN_GO := protoc-gen-go
PROTOC_GEN_GO_GRPC := protoc-gen-go-grpc
PROTOC_GEN_GRPC_JAVA := protoc-gen-grpc-java

# Code generation targets
.PHONY: all clean go java js


clean:
	@echo "Cleaning generated code..."
	rm -rf $(GEN_DIR)

PROTOC_GEN_TS_PROTO=./node_modules/.bin/protoc-gen-ts_proto

gen-ts:
	npx protoc \
		--plugin=$(PROTOC_GEN_TS_PROTO) \
		--ts_proto_out=$(JS_OUT) \
		--ts_proto_opt=outputServices=grpc-js,outputClientImpl=grpc-js \
		-I $(PROTO_DIR) \
		-I $(PROTO_VALIDATE_DIR) \
		$(PROTO_FILES) $(PROTO_VALIDATE_FILES)

db-up:
	@docker compose --env-file .env -f build/docker-compose.yml up -d

db-down:
	@docker compose --env-file .env -f build/docker-compose.yml down


# Make migrations
migrate-up:
	@echo "Making migrations..."
	@migrate -path ./migrations -database "postgres://root:2Jes25VIViLf5SDm9i2fQl5esYrTx7UyIWwK5N09vnjH6iGehD@localhost:5432/frubay?sslmode=disable" -verbose up	
	@echo "Migrations completed."

# Delete migrations
migrate-down:
	@echo "Deleting migrations..."
	@migrate -path ./migrations -database "postgres://postgres:postgres@localhost:5432/frubay?sslmode=disable" -verbose down

# up 1 means next one migration if current version is on 1 it will migrate version 2
# down 1 means migrate down to last version, down 2 means migrate down two versions
# goto means migrate to specific version like goto 0 means down to version 0, goto 1 means migrate to version 1
# force 1 means force set the version to 1 without running migrations

migrate-db:
	@echo "Making migrations..."
	@migrate -path ./migrations -database "postgres://postgres:postgres@localhost:5432/frubay?sslmode=disable" -verbose up 1
	@echo "Migrations completed."

migrate-db-down:
	@echo "Making migrations..."
	@migrate -path ./migrations -database "postgres://postgres:postgres@localhost:5432/frubay?sslmode=disable" -verbose force 1
	@echo "Migrations completed."


