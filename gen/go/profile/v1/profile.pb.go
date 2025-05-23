// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.36.6
// 	protoc        (unknown)
// source: profile/v1/profile.proto

package profilev1

import (
	_ "buf.build/gen/go/bufbuild/protovalidate/protocolbuffers/go/buf/validate"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	timestamppb "google.golang.org/protobuf/types/known/timestamppb"
	reflect "reflect"
	sync "sync"
	unsafe "unsafe"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type CreateProfileRequest struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	UserId        string                 `protobuf:"bytes,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	FullName      string                 `protobuf:"bytes,2,opt,name=full_name,json=fullName,proto3" json:"full_name,omitempty"`
	Email         string                 `protobuf:"bytes,3,opt,name=email,proto3" json:"email,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *CreateProfileRequest) Reset() {
	*x = CreateProfileRequest{}
	mi := &file_profile_v1_profile_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *CreateProfileRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateProfileRequest) ProtoMessage() {}

func (x *CreateProfileRequest) ProtoReflect() protoreflect.Message {
	mi := &file_profile_v1_profile_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateProfileRequest.ProtoReflect.Descriptor instead.
func (*CreateProfileRequest) Descriptor() ([]byte, []int) {
	return file_profile_v1_profile_proto_rawDescGZIP(), []int{0}
}

func (x *CreateProfileRequest) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *CreateProfileRequest) GetFullName() string {
	if x != nil {
		return x.FullName
	}
	return ""
}

func (x *CreateProfileRequest) GetEmail() string {
	if x != nil {
		return x.Email
	}
	return ""
}

type CreateProfileResponse struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	ProfileId     string                 `protobuf:"bytes,1,opt,name=profile_id,json=profileId,proto3" json:"profile_id,omitempty"`
	UserId        string                 `protobuf:"bytes,2,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *CreateProfileResponse) Reset() {
	*x = CreateProfileResponse{}
	mi := &file_profile_v1_profile_proto_msgTypes[1]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *CreateProfileResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateProfileResponse) ProtoMessage() {}

func (x *CreateProfileResponse) ProtoReflect() protoreflect.Message {
	mi := &file_profile_v1_profile_proto_msgTypes[1]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateProfileResponse.ProtoReflect.Descriptor instead.
func (*CreateProfileResponse) Descriptor() ([]byte, []int) {
	return file_profile_v1_profile_proto_rawDescGZIP(), []int{1}
}

func (x *CreateProfileResponse) GetProfileId() string {
	if x != nil {
		return x.ProfileId
	}
	return ""
}

func (x *CreateProfileResponse) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

type GetProfileRequest struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	UserId        string                 `protobuf:"bytes,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *GetProfileRequest) Reset() {
	*x = GetProfileRequest{}
	mi := &file_profile_v1_profile_proto_msgTypes[2]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *GetProfileRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetProfileRequest) ProtoMessage() {}

func (x *GetProfileRequest) ProtoReflect() protoreflect.Message {
	mi := &file_profile_v1_profile_proto_msgTypes[2]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetProfileRequest.ProtoReflect.Descriptor instead.
func (*GetProfileRequest) Descriptor() ([]byte, []int) {
	return file_profile_v1_profile_proto_rawDescGZIP(), []int{2}
}

func (x *GetProfileRequest) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

type GetProfileResponse struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	ProfileId     string                 `protobuf:"bytes,1,opt,name=profile_id,json=profileId,proto3" json:"profile_id,omitempty"`
	UserId        string                 `protobuf:"bytes,2,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	Username      string                 `protobuf:"bytes,3,opt,name=username,proto3" json:"username,omitempty"`
	FullName      string                 `protobuf:"bytes,4,opt,name=full_name,json=fullName,proto3" json:"full_name,omitempty"`
	Email         string                 `protobuf:"bytes,5,opt,name=email,proto3" json:"email,omitempty"`
	Bio           string                 `protobuf:"bytes,6,opt,name=bio,proto3" json:"bio,omitempty"`
	Avatar        string                 `protobuf:"bytes,7,opt,name=avatar,proto3" json:"avatar,omitempty"`
	CreatedAt     *timestamppb.Timestamp `protobuf:"bytes,8,opt,name=created_at,json=createdAt,proto3" json:"created_at,omitempty"`
	UpdatedAt     *timestamppb.Timestamp `protobuf:"bytes,9,opt,name=updated_at,json=updatedAt,proto3" json:"updated_at,omitempty"`
	DeletedAt     *timestamppb.Timestamp `protobuf:"bytes,10,opt,name=deleted_at,json=deletedAt,proto3" json:"deleted_at,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *GetProfileResponse) Reset() {
	*x = GetProfileResponse{}
	mi := &file_profile_v1_profile_proto_msgTypes[3]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *GetProfileResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetProfileResponse) ProtoMessage() {}

func (x *GetProfileResponse) ProtoReflect() protoreflect.Message {
	mi := &file_profile_v1_profile_proto_msgTypes[3]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetProfileResponse.ProtoReflect.Descriptor instead.
func (*GetProfileResponse) Descriptor() ([]byte, []int) {
	return file_profile_v1_profile_proto_rawDescGZIP(), []int{3}
}

func (x *GetProfileResponse) GetProfileId() string {
	if x != nil {
		return x.ProfileId
	}
	return ""
}

func (x *GetProfileResponse) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *GetProfileResponse) GetUsername() string {
	if x != nil {
		return x.Username
	}
	return ""
}

func (x *GetProfileResponse) GetFullName() string {
	if x != nil {
		return x.FullName
	}
	return ""
}

func (x *GetProfileResponse) GetEmail() string {
	if x != nil {
		return x.Email
	}
	return ""
}

func (x *GetProfileResponse) GetBio() string {
	if x != nil {
		return x.Bio
	}
	return ""
}

func (x *GetProfileResponse) GetAvatar() string {
	if x != nil {
		return x.Avatar
	}
	return ""
}

func (x *GetProfileResponse) GetCreatedAt() *timestamppb.Timestamp {
	if x != nil {
		return x.CreatedAt
	}
	return nil
}

func (x *GetProfileResponse) GetUpdatedAt() *timestamppb.Timestamp {
	if x != nil {
		return x.UpdatedAt
	}
	return nil
}

func (x *GetProfileResponse) GetDeletedAt() *timestamppb.Timestamp {
	if x != nil {
		return x.DeletedAt
	}
	return nil
}

type UpdateProfileRequest struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	UserId        string                 `protobuf:"bytes,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	FullName      string                 `protobuf:"bytes,2,opt,name=full_name,json=fullName,proto3" json:"full_name,omitempty"`
	Email         string                 `protobuf:"bytes,3,opt,name=email,proto3" json:"email,omitempty"`
	Bio           string                 `protobuf:"bytes,4,opt,name=bio,proto3" json:"bio,omitempty"`
	Avatar        string                 `protobuf:"bytes,5,opt,name=avatar,proto3" json:"avatar,omitempty"`
	Username      string                 `protobuf:"bytes,6,opt,name=username,proto3" json:"username,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *UpdateProfileRequest) Reset() {
	*x = UpdateProfileRequest{}
	mi := &file_profile_v1_profile_proto_msgTypes[4]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *UpdateProfileRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateProfileRequest) ProtoMessage() {}

func (x *UpdateProfileRequest) ProtoReflect() protoreflect.Message {
	mi := &file_profile_v1_profile_proto_msgTypes[4]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateProfileRequest.ProtoReflect.Descriptor instead.
func (*UpdateProfileRequest) Descriptor() ([]byte, []int) {
	return file_profile_v1_profile_proto_rawDescGZIP(), []int{4}
}

func (x *UpdateProfileRequest) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *UpdateProfileRequest) GetFullName() string {
	if x != nil {
		return x.FullName
	}
	return ""
}

func (x *UpdateProfileRequest) GetEmail() string {
	if x != nil {
		return x.Email
	}
	return ""
}

func (x *UpdateProfileRequest) GetBio() string {
	if x != nil {
		return x.Bio
	}
	return ""
}

func (x *UpdateProfileRequest) GetAvatar() string {
	if x != nil {
		return x.Avatar
	}
	return ""
}

func (x *UpdateProfileRequest) GetUsername() string {
	if x != nil {
		return x.Username
	}
	return ""
}

type UpdateProfileResponse struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	ProfileId     string                 `protobuf:"bytes,1,opt,name=profile_id,json=profileId,proto3" json:"profile_id,omitempty"`
	UserId        string                 `protobuf:"bytes,2,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *UpdateProfileResponse) Reset() {
	*x = UpdateProfileResponse{}
	mi := &file_profile_v1_profile_proto_msgTypes[5]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *UpdateProfileResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateProfileResponse) ProtoMessage() {}

func (x *UpdateProfileResponse) ProtoReflect() protoreflect.Message {
	mi := &file_profile_v1_profile_proto_msgTypes[5]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateProfileResponse.ProtoReflect.Descriptor instead.
func (*UpdateProfileResponse) Descriptor() ([]byte, []int) {
	return file_profile_v1_profile_proto_rawDescGZIP(), []int{5}
}

func (x *UpdateProfileResponse) GetProfileId() string {
	if x != nil {
		return x.ProfileId
	}
	return ""
}

func (x *UpdateProfileResponse) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

type DeleteProfileRequest struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	UserId        string                 `protobuf:"bytes,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *DeleteProfileRequest) Reset() {
	*x = DeleteProfileRequest{}
	mi := &file_profile_v1_profile_proto_msgTypes[6]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *DeleteProfileRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteProfileRequest) ProtoMessage() {}

func (x *DeleteProfileRequest) ProtoReflect() protoreflect.Message {
	mi := &file_profile_v1_profile_proto_msgTypes[6]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteProfileRequest.ProtoReflect.Descriptor instead.
func (*DeleteProfileRequest) Descriptor() ([]byte, []int) {
	return file_profile_v1_profile_proto_rawDescGZIP(), []int{6}
}

func (x *DeleteProfileRequest) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

type DeleteProfileResponse struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	IsDone        bool                   `protobuf:"varint,1,opt,name=is_done,json=isDone,proto3" json:"is_done,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *DeleteProfileResponse) Reset() {
	*x = DeleteProfileResponse{}
	mi := &file_profile_v1_profile_proto_msgTypes[7]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *DeleteProfileResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteProfileResponse) ProtoMessage() {}

func (x *DeleteProfileResponse) ProtoReflect() protoreflect.Message {
	mi := &file_profile_v1_profile_proto_msgTypes[7]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteProfileResponse.ProtoReflect.Descriptor instead.
func (*DeleteProfileResponse) Descriptor() ([]byte, []int) {
	return file_profile_v1_profile_proto_rawDescGZIP(), []int{7}
}

func (x *DeleteProfileResponse) GetIsDone() bool {
	if x != nil {
		return x.IsDone
	}
	return false
}

type UnDeleteeProfileRequest struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	UserId        string                 `protobuf:"bytes,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *UnDeleteeProfileRequest) Reset() {
	*x = UnDeleteeProfileRequest{}
	mi := &file_profile_v1_profile_proto_msgTypes[8]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *UnDeleteeProfileRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UnDeleteeProfileRequest) ProtoMessage() {}

func (x *UnDeleteeProfileRequest) ProtoReflect() protoreflect.Message {
	mi := &file_profile_v1_profile_proto_msgTypes[8]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UnDeleteeProfileRequest.ProtoReflect.Descriptor instead.
func (*UnDeleteeProfileRequest) Descriptor() ([]byte, []int) {
	return file_profile_v1_profile_proto_rawDescGZIP(), []int{8}
}

func (x *UnDeleteeProfileRequest) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

type UnDeleteeProfileResponse struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	IsDone        bool                   `protobuf:"varint,1,opt,name=is_done,json=isDone,proto3" json:"is_done,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *UnDeleteeProfileResponse) Reset() {
	*x = UnDeleteeProfileResponse{}
	mi := &file_profile_v1_profile_proto_msgTypes[9]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *UnDeleteeProfileResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UnDeleteeProfileResponse) ProtoMessage() {}

func (x *UnDeleteeProfileResponse) ProtoReflect() protoreflect.Message {
	mi := &file_profile_v1_profile_proto_msgTypes[9]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UnDeleteeProfileResponse.ProtoReflect.Descriptor instead.
func (*UnDeleteeProfileResponse) Descriptor() ([]byte, []int) {
	return file_profile_v1_profile_proto_rawDescGZIP(), []int{9}
}

func (x *UnDeleteeProfileResponse) GetIsDone() bool {
	if x != nil {
		return x.IsDone
	}
	return false
}

var File_profile_v1_profile_proto protoreflect.FileDescriptor

const file_profile_v1_profile_proto_rawDesc = "" +
	"\n" +
	"\x18profile/v1/profile.proto\x12\n" +
	"profile.v1\x1a\x1bbuf/validate/validate.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"~\n" +
	"\x14CreateProfileRequest\x12!\n" +
	"\auser_id\x18\x01 \x01(\tB\b\xbaH\x05r\x03\xb0\x01\x01R\x06userId\x12$\n" +
	"\tfull_name\x18\x02 \x01(\tB\a\xbaH\x04r\x02\x10\x01R\bfullName\x12\x1d\n" +
	"\x05email\x18\x03 \x01(\tB\a\xbaH\x04r\x02`\x01R\x05email\"O\n" +
	"\x15CreateProfileResponse\x12\x1d\n" +
	"\n" +
	"profile_id\x18\x01 \x01(\tR\tprofileId\x12\x17\n" +
	"\auser_id\x18\x02 \x01(\tR\x06userId\"6\n" +
	"\x11GetProfileRequest\x12!\n" +
	"\auser_id\x18\x01 \x01(\tB\b\xbaH\x05r\x03\xb0\x01\x01R\x06userId\"\xf6\x02\n" +
	"\x12GetProfileResponse\x12\x1d\n" +
	"\n" +
	"profile_id\x18\x01 \x01(\tR\tprofileId\x12\x17\n" +
	"\auser_id\x18\x02 \x01(\tR\x06userId\x12\x1a\n" +
	"\busername\x18\x03 \x01(\tR\busername\x12\x1b\n" +
	"\tfull_name\x18\x04 \x01(\tR\bfullName\x12\x14\n" +
	"\x05email\x18\x05 \x01(\tR\x05email\x12\x10\n" +
	"\x03bio\x18\x06 \x01(\tR\x03bio\x12\x16\n" +
	"\x06avatar\x18\a \x01(\tR\x06avatar\x129\n" +
	"\n" +
	"created_at\x18\b \x01(\v2\x1a.google.protobuf.TimestampR\tcreatedAt\x129\n" +
	"\n" +
	"updated_at\x18\t \x01(\v2\x1a.google.protobuf.TimestampR\tupdatedAt\x129\n" +
	"\n" +
	"deleted_at\x18\n" +
	" \x01(\v2\x1a.google.protobuf.TimestampR\tdeletedAt\"\xb2\x01\n" +
	"\x14UpdateProfileRequest\x12!\n" +
	"\auser_id\x18\x01 \x01(\tB\b\xbaH\x05r\x03\xb0\x01\x01R\x06userId\x12\x1b\n" +
	"\tfull_name\x18\x02 \x01(\tR\bfullName\x12\x14\n" +
	"\x05email\x18\x03 \x01(\tR\x05email\x12\x10\n" +
	"\x03bio\x18\x04 \x01(\tR\x03bio\x12\x16\n" +
	"\x06avatar\x18\x05 \x01(\tR\x06avatar\x12\x1a\n" +
	"\busername\x18\x06 \x01(\tR\busername\"O\n" +
	"\x15UpdateProfileResponse\x12\x1d\n" +
	"\n" +
	"profile_id\x18\x01 \x01(\tR\tprofileId\x12\x17\n" +
	"\auser_id\x18\x02 \x01(\tR\x06userId\"9\n" +
	"\x14DeleteProfileRequest\x12!\n" +
	"\auser_id\x18\x01 \x01(\tB\b\xbaH\x05r\x03\xb0\x01\x01R\x06userId\"0\n" +
	"\x15DeleteProfileResponse\x12\x17\n" +
	"\ais_done\x18\x01 \x01(\bR\x06isDone\"<\n" +
	"\x17UnDeleteeProfileRequest\x12!\n" +
	"\auser_id\x18\x01 \x01(\tB\b\xbaH\x05r\x03\xb0\x01\x01R\x06userId\"3\n" +
	"\x18UnDeleteeProfileResponse\x12\x17\n" +
	"\ais_done\x18\x01 \x01(\bR\x06isDone2\xbd\x03\n" +
	"\x0eProfileService\x12T\n" +
	"\rCreateProfile\x12 .profile.v1.CreateProfileRequest\x1a!.profile.v1.CreateProfileResponse\x12K\n" +
	"\n" +
	"GetProfile\x12\x1d.profile.v1.GetProfileRequest\x1a\x1e.profile.v1.GetProfileResponse\x12T\n" +
	"\rUpdateProfile\x12 .profile.v1.UpdateProfileRequest\x1a!.profile.v1.UpdateProfileResponse\x12T\n" +
	"\rDeleteProfile\x12 .profile.v1.DeleteProfileRequest\x1a!.profile.v1.DeleteProfileResponse\x12\\\n" +
	"\x0fUnDeleteProfile\x12#.profile.v1.UnDeleteeProfileRequest\x1a$.profile.v1.UnDeleteeProfileResponseB\xbc\x01\n" +
	"\x1ccom.samarthasthan.profile.v1B\fProfileProtoP\x01ZEgithub.com/samarthasthan/services-commons/gen/go/profile/v1;profilev1\xa2\x02\x03PXX\xaa\x02\n" +
	"Profile.V1\xca\x02\n" +
	"Profile\\V1\xe2\x02\x16Profile\\V1\\GPBMetadata\xea\x02\vProfile::V1b\x06proto3"

var (
	file_profile_v1_profile_proto_rawDescOnce sync.Once
	file_profile_v1_profile_proto_rawDescData []byte
)

func file_profile_v1_profile_proto_rawDescGZIP() []byte {
	file_profile_v1_profile_proto_rawDescOnce.Do(func() {
		file_profile_v1_profile_proto_rawDescData = protoimpl.X.CompressGZIP(unsafe.Slice(unsafe.StringData(file_profile_v1_profile_proto_rawDesc), len(file_profile_v1_profile_proto_rawDesc)))
	})
	return file_profile_v1_profile_proto_rawDescData
}

var file_profile_v1_profile_proto_msgTypes = make([]protoimpl.MessageInfo, 10)
var file_profile_v1_profile_proto_goTypes = []any{
	(*CreateProfileRequest)(nil),     // 0: profile.v1.CreateProfileRequest
	(*CreateProfileResponse)(nil),    // 1: profile.v1.CreateProfileResponse
	(*GetProfileRequest)(nil),        // 2: profile.v1.GetProfileRequest
	(*GetProfileResponse)(nil),       // 3: profile.v1.GetProfileResponse
	(*UpdateProfileRequest)(nil),     // 4: profile.v1.UpdateProfileRequest
	(*UpdateProfileResponse)(nil),    // 5: profile.v1.UpdateProfileResponse
	(*DeleteProfileRequest)(nil),     // 6: profile.v1.DeleteProfileRequest
	(*DeleteProfileResponse)(nil),    // 7: profile.v1.DeleteProfileResponse
	(*UnDeleteeProfileRequest)(nil),  // 8: profile.v1.UnDeleteeProfileRequest
	(*UnDeleteeProfileResponse)(nil), // 9: profile.v1.UnDeleteeProfileResponse
	(*timestamppb.Timestamp)(nil),    // 10: google.protobuf.Timestamp
}
var file_profile_v1_profile_proto_depIdxs = []int32{
	10, // 0: profile.v1.GetProfileResponse.created_at:type_name -> google.protobuf.Timestamp
	10, // 1: profile.v1.GetProfileResponse.updated_at:type_name -> google.protobuf.Timestamp
	10, // 2: profile.v1.GetProfileResponse.deleted_at:type_name -> google.protobuf.Timestamp
	0,  // 3: profile.v1.ProfileService.CreateProfile:input_type -> profile.v1.CreateProfileRequest
	2,  // 4: profile.v1.ProfileService.GetProfile:input_type -> profile.v1.GetProfileRequest
	4,  // 5: profile.v1.ProfileService.UpdateProfile:input_type -> profile.v1.UpdateProfileRequest
	6,  // 6: profile.v1.ProfileService.DeleteProfile:input_type -> profile.v1.DeleteProfileRequest
	8,  // 7: profile.v1.ProfileService.UnDeleteProfile:input_type -> profile.v1.UnDeleteeProfileRequest
	1,  // 8: profile.v1.ProfileService.CreateProfile:output_type -> profile.v1.CreateProfileResponse
	3,  // 9: profile.v1.ProfileService.GetProfile:output_type -> profile.v1.GetProfileResponse
	5,  // 10: profile.v1.ProfileService.UpdateProfile:output_type -> profile.v1.UpdateProfileResponse
	7,  // 11: profile.v1.ProfileService.DeleteProfile:output_type -> profile.v1.DeleteProfileResponse
	9,  // 12: profile.v1.ProfileService.UnDeleteProfile:output_type -> profile.v1.UnDeleteeProfileResponse
	8,  // [8:13] is the sub-list for method output_type
	3,  // [3:8] is the sub-list for method input_type
	3,  // [3:3] is the sub-list for extension type_name
	3,  // [3:3] is the sub-list for extension extendee
	0,  // [0:3] is the sub-list for field type_name
}

func init() { file_profile_v1_profile_proto_init() }
func file_profile_v1_profile_proto_init() {
	if File_profile_v1_profile_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: unsafe.Slice(unsafe.StringData(file_profile_v1_profile_proto_rawDesc), len(file_profile_v1_profile_proto_rawDesc)),
			NumEnums:      0,
			NumMessages:   10,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_profile_v1_profile_proto_goTypes,
		DependencyIndexes: file_profile_v1_profile_proto_depIdxs,
		MessageInfos:      file_profile_v1_profile_proto_msgTypes,
	}.Build()
	File_profile_v1_profile_proto = out.File
	file_profile_v1_profile_proto_goTypes = nil
	file_profile_v1_profile_proto_depIdxs = nil
}
