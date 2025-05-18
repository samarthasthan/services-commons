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
