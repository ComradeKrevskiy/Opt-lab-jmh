package forBenchmark;

public final class protobufDTO {
    private protobufDTO() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface myDTOOrBuilder extends
            // @@protoc_insertion_point(interface_extends:forBenchmark.myDTO)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required int64 Id = 1;</code>
         * @return Whether the id field is set.
         */
        boolean hasId();
        /**
         * <code>required int64 Id = 1;</code>
         * @return The id.
         */
        long getId();

        /**
         * <code>required string Fname = 2;</code>
         * @return Whether the fname field is set.
         */
        boolean hasFname();
        /**
         * <code>required string Fname = 2;</code>
         * @return The fname.
         */
        java.lang.String getFname();
        /**
         * <code>required string Fname = 2;</code>
         * @return The bytes for fname.
         */
        com.google.protobuf.ByteString
        getFnameBytes();

        /**
         * <code>required string Lname = 3;</code>
         * @return Whether the lname field is set.
         */
        boolean hasLname();
        /**
         * <code>required string Lname = 3;</code>
         * @return The lname.
         */
        java.lang.String getLname();
        /**
         * <code>required string Lname = 3;</code>
         * @return The bytes for lname.
         */
        com.google.protobuf.ByteString
        getLnameBytes();

        /**
         * <code>required bool Dormestery_payed = 4;</code>
         * @return Whether the dormesteryPayed field is set.
         */
        boolean hasDormesteryPayed();
        /**
         * <code>required bool Dormestery_payed = 4;</code>
         * @return The dormesteryPayed.
         */
        boolean getDormesteryPayed();

        /**
         * <code>required int64 Mark = 5;</code>
         * @return Whether the mark field is set.
         */
        boolean hasMark();
        /**
         * <code>required int64 Mark = 5;</code>
         * @return The mark.
         */
        long getMark();
    }
    /**
     * Protobuf type {@code forBenchmark.myDTO}
     */
    public static final class myDTO extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:forBenchmark.myDTO)
            myDTOOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use myDTO.newBuilder() to construct.
        private myDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private myDTO() {
            fname_ = "";
            lname_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new myDTO();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private myDTO(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {
                            bitField0_ |= 0x00000001;
                            id_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000002;
                            fname_ = bs;
                            break;
                        }
                        case 26: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000004;
                            lname_ = bs;
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            dormesteryPayed_ = input.readBool();
                            break;
                        }
                        case 40: {
                            bitField0_ |= 0x00000010;
                            mark_ = input.readInt64();
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return forBenchmark.protobufDTO.internal_static_forBenchmark_myDTO_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return forBenchmark.protobufDTO.internal_static_forBenchmark_myDTO_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            forBenchmark.protobufDTO.myDTO.class, forBenchmark.protobufDTO.myDTO.Builder.class);
        }

        private int bitField0_;
        public static final int ID_FIELD_NUMBER = 1;
        private long id_;
        /**
         * <code>required int64 Id = 1;</code>
         * @return Whether the id field is set.
         */
        @java.lang.Override
        public boolean hasId() {
            return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>required int64 Id = 1;</code>
         * @return The id.
         */
        @java.lang.Override
        public long getId() {
            return id_;
        }

        public static final int FNAME_FIELD_NUMBER = 2;
        private volatile java.lang.Object fname_;
        /**
         * <code>required string Fname = 2;</code>
         * @return Whether the fname field is set.
         */
        @java.lang.Override
        public boolean hasFname() {
            return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <code>required string Fname = 2;</code>
         * @return The fname.
         */
        @java.lang.Override
        public java.lang.String getFname() {
            java.lang.Object ref = fname_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    fname_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string Fname = 2;</code>
         * @return The bytes for fname.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString
        getFnameBytes() {
            java.lang.Object ref = fname_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                fname_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int LNAME_FIELD_NUMBER = 3;
        private volatile java.lang.Object lname_;
        /**
         * <code>required string Lname = 3;</code>
         * @return Whether the lname field is set.
         */
        @java.lang.Override
        public boolean hasLname() {
            return ((bitField0_ & 0x00000004) != 0);
        }
        /**
         * <code>required string Lname = 3;</code>
         * @return The lname.
         */
        @java.lang.Override
        public java.lang.String getLname() {
            java.lang.Object ref = lname_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    lname_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string Lname = 3;</code>
         * @return The bytes for lname.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString
        getLnameBytes() {
            java.lang.Object ref = lname_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                lname_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int DORMESTERY_PAYED_FIELD_NUMBER = 4;
        private boolean dormesteryPayed_;
        /**
         * <code>required bool Dormestery_payed = 4;</code>
         * @return Whether the dormesteryPayed field is set.
         */
        @java.lang.Override
        public boolean hasDormesteryPayed() {
            return ((bitField0_ & 0x00000008) != 0);
        }
        /**
         * <code>required bool Dormestery_payed = 4;</code>
         * @return The dormesteryPayed.
         */
        @java.lang.Override
        public boolean getDormesteryPayed() {
            return dormesteryPayed_;
        }

        public static final int MARK_FIELD_NUMBER = 5;
        private long mark_;
        /**
         * <code>required int64 Mark = 5;</code>
         * @return Whether the mark field is set.
         */
        @java.lang.Override
        public boolean hasMark() {
            return ((bitField0_ & 0x00000010) != 0);
        }
        /**
         * <code>required int64 Mark = 5;</code>
         * @return The mark.
         */
        @java.lang.Override
        public long getMark() {
            return mark_;
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasId()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasFname()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasLname()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDormesteryPayed()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasMark()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) != 0)) {
                output.writeInt64(1, id_);
            }
            if (((bitField0_ & 0x00000002) != 0)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fname_);
            }
            if (((bitField0_ & 0x00000004) != 0)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lname_);
            }
            if (((bitField0_ & 0x00000008) != 0)) {
                output.writeBool(4, dormesteryPayed_);
            }
            if (((bitField0_ & 0x00000010) != 0)) {
                output.writeInt64(5, mark_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, id_);
            }
            if (((bitField0_ & 0x00000002) != 0)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fname_);
            }
            if (((bitField0_ & 0x00000004) != 0)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lname_);
            }
            if (((bitField0_ & 0x00000008) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(4, dormesteryPayed_);
            }
            if (((bitField0_ & 0x00000010) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(5, mark_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof forBenchmark.protobufDTO.myDTO)) {
                return super.equals(obj);
            }
            forBenchmark.protobufDTO.myDTO other = (forBenchmark.protobufDTO.myDTO) obj;

            if (hasId() != other.hasId()) return false;
            if (hasId()) {
                if (getId()
                        != other.getId()) return false;
            }
            if (hasFname() != other.hasFname()) return false;
            if (hasFname()) {
                if (!getFname()
                        .equals(other.getFname())) return false;
            }
            if (hasLname() != other.hasLname()) return false;
            if (hasLname()) {
                if (!getLname()
                        .equals(other.getLname())) return false;
            }
            if (hasDormesteryPayed() != other.hasDormesteryPayed()) return false;
            if (hasDormesteryPayed()) {
                if (getDormesteryPayed()
                        != other.getDormesteryPayed()) return false;
            }
            if (hasMark() != other.hasMark()) return false;
            if (hasMark()) {
                if (getMark()
                        != other.getMark()) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasId()) {
                hash = (37 * hash) + ID_FIELD_NUMBER;
                hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                        getId());
            }
            if (hasFname()) {
                hash = (37 * hash) + FNAME_FIELD_NUMBER;
                hash = (53 * hash) + getFname().hashCode();
            }
            if (hasLname()) {
                hash = (37 * hash) + LNAME_FIELD_NUMBER;
                hash = (53 * hash) + getLname().hashCode();
            }
            if (hasDormesteryPayed()) {
                hash = (37 * hash) + DORMESTERY_PAYED_FIELD_NUMBER;
                hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                        getDormesteryPayed());
            }
            if (hasMark()) {
                hash = (37 * hash) + MARK_FIELD_NUMBER;
                hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                        getMark());
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static forBenchmark.protobufDTO.myDTO parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static forBenchmark.protobufDTO.myDTO parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static forBenchmark.protobufDTO.myDTO parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static forBenchmark.protobufDTO.myDTO parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static forBenchmark.protobufDTO.myDTO parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static forBenchmark.protobufDTO.myDTO parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static forBenchmark.protobufDTO.myDTO parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static forBenchmark.protobufDTO.myDTO parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static forBenchmark.protobufDTO.myDTO parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static forBenchmark.protobufDTO.myDTO parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static forBenchmark.protobufDTO.myDTO parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static forBenchmark.protobufDTO.myDTO parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(forBenchmark.protobufDTO.myDTO prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code forBenchmark.myDTO}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:forBenchmark.myDTO)
                forBenchmark.protobufDTO.myDTOOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return forBenchmark.protobufDTO.internal_static_forBenchmark_myDTO_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return forBenchmark.protobufDTO.internal_static_forBenchmark_myDTO_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                forBenchmark.protobufDTO.myDTO.class, forBenchmark.protobufDTO.myDTO.Builder.class);
            }

            // Construct using forBenchmark.protobufDTO.myDTO.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                id_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                fname_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                lname_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                dormesteryPayed_ = false;
                bitField0_ = (bitField0_ & ~0x00000008);
                mark_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000010);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return forBenchmark.protobufDTO.internal_static_forBenchmark_myDTO_descriptor;
            }

            @java.lang.Override
            public forBenchmark.protobufDTO.myDTO getDefaultInstanceForType() {
                return forBenchmark.protobufDTO.myDTO.getDefaultInstance();
            }

            @java.lang.Override
            public forBenchmark.protobufDTO.myDTO build() {
                forBenchmark.protobufDTO.myDTO result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public forBenchmark.protobufDTO.myDTO buildPartial() {
                forBenchmark.protobufDTO.myDTO result = new forBenchmark.protobufDTO.myDTO(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.id_ = id_;
                    to_bitField0_ |= 0x00000001;
                }
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.fname_ = fname_;
                if (((from_bitField0_ & 0x00000004) != 0)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.lname_ = lname_;
                if (((from_bitField0_ & 0x00000008) != 0)) {
                    result.dormesteryPayed_ = dormesteryPayed_;
                    to_bitField0_ |= 0x00000008;
                }
                if (((from_bitField0_ & 0x00000010) != 0)) {
                    result.mark_ = mark_;
                    to_bitField0_ |= 0x00000010;
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof forBenchmark.protobufDTO.myDTO) {
                    return mergeFrom((forBenchmark.protobufDTO.myDTO)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(forBenchmark.protobufDTO.myDTO other) {
                if (other == forBenchmark.protobufDTO.myDTO.getDefaultInstance()) return this;
                if (other.hasId()) {
                    setId(other.getId());
                }
                if (other.hasFname()) {
                    bitField0_ |= 0x00000002;
                    fname_ = other.fname_;
                    onChanged();
                }
                if (other.hasLname()) {
                    bitField0_ |= 0x00000004;
                    lname_ = other.lname_;
                    onChanged();
                }
                if (other.hasDormesteryPayed()) {
                    setDormesteryPayed(other.getDormesteryPayed());
                }
                if (other.hasMark()) {
                    setMark(other.getMark());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                if (!hasFname()) {
                    return false;
                }
                if (!hasLname()) {
                    return false;
                }
                if (!hasDormesteryPayed()) {
                    return false;
                }
                if (!hasMark()) {
                    return false;
                }
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                forBenchmark.protobufDTO.myDTO parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (forBenchmark.protobufDTO.myDTO) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private long id_ ;
            /**
             * <code>required int64 Id = 1;</code>
             * @return Whether the id field is set.
             */
            @java.lang.Override
            public boolean hasId() {
                return ((bitField0_ & 0x00000001) != 0);
            }
            /**
             * <code>required int64 Id = 1;</code>
             * @return The id.
             */
            @java.lang.Override
            public long getId() {
                return id_;
            }
            /**
             * <code>required int64 Id = 1;</code>
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(long value) {
                bitField0_ |= 0x00000001;
                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int64 Id = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                id_ = 0L;
                onChanged();
                return this;
            }

            private java.lang.Object fname_ = "";
            /**
             * <code>required string Fname = 2;</code>
             * @return Whether the fname field is set.
             */
            public boolean hasFname() {
                return ((bitField0_ & 0x00000002) != 0);
            }
            /**
             * <code>required string Fname = 2;</code>
             * @return The fname.
             */
            public java.lang.String getFname() {
                java.lang.Object ref = fname_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        fname_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string Fname = 2;</code>
             * @return The bytes for fname.
             */
            public com.google.protobuf.ByteString
            getFnameBytes() {
                java.lang.Object ref = fname_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    fname_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string Fname = 2;</code>
             * @param value The fname to set.
             * @return This builder for chaining.
             */
            public Builder setFname(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                fname_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string Fname = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearFname() {
                bitField0_ = (bitField0_ & ~0x00000002);
                fname_ = getDefaultInstance().getFname();
                onChanged();
                return this;
            }
            /**
             * <code>required string Fname = 2;</code>
             * @param value The bytes for fname to set.
             * @return This builder for chaining.
             */
            public Builder setFnameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                fname_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object lname_ = "";
            /**
             * <code>required string Lname = 3;</code>
             * @return Whether the lname field is set.
             */
            public boolean hasLname() {
                return ((bitField0_ & 0x00000004) != 0);
            }
            /**
             * <code>required string Lname = 3;</code>
             * @return The lname.
             */
            public java.lang.String getLname() {
                java.lang.Object ref = lname_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        lname_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string Lname = 3;</code>
             * @return The bytes for lname.
             */
            public com.google.protobuf.ByteString
            getLnameBytes() {
                java.lang.Object ref = lname_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    lname_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string Lname = 3;</code>
             * @param value The lname to set.
             * @return This builder for chaining.
             */
            public Builder setLname(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                lname_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string Lname = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearLname() {
                bitField0_ = (bitField0_ & ~0x00000004);
                lname_ = getDefaultInstance().getLname();
                onChanged();
                return this;
            }
            /**
             * <code>required string Lname = 3;</code>
             * @param value The bytes for lname to set.
             * @return This builder for chaining.
             */
            public Builder setLnameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                lname_ = value;
                onChanged();
                return this;
            }

            private boolean dormesteryPayed_ ;
            /**
             * <code>required bool Dormestery_payed = 4;</code>
             * @return Whether the dormesteryPayed field is set.
             */
            @java.lang.Override
            public boolean hasDormesteryPayed() {
                return ((bitField0_ & 0x00000008) != 0);
            }
            /**
             * <code>required bool Dormestery_payed = 4;</code>
             * @return The dormesteryPayed.
             */
            @java.lang.Override
            public boolean getDormesteryPayed() {
                return dormesteryPayed_;
            }
            /**
             * <code>required bool Dormestery_payed = 4;</code>
             * @param value The dormesteryPayed to set.
             * @return This builder for chaining.
             */
            public Builder setDormesteryPayed(boolean value) {
                bitField0_ |= 0x00000008;
                dormesteryPayed_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required bool Dormestery_payed = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearDormesteryPayed() {
                bitField0_ = (bitField0_ & ~0x00000008);
                dormesteryPayed_ = false;
                onChanged();
                return this;
            }

            private long mark_ ;
            /**
             * <code>required int64 Mark = 5;</code>
             * @return Whether the mark field is set.
             */
            @java.lang.Override
            public boolean hasMark() {
                return ((bitField0_ & 0x00000010) != 0);
            }
            /**
             * <code>required int64 Mark = 5;</code>
             * @return The mark.
             */
            @java.lang.Override
            public long getMark() {
                return mark_;
            }
            /**
             * <code>required int64 Mark = 5;</code>
             * @param value The mark to set.
             * @return This builder for chaining.
             */
            public Builder setMark(long value) {
                bitField0_ |= 0x00000010;
                mark_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int64 Mark = 5;</code>
             * @return This builder for chaining.
             */
            public Builder clearMark() {
                bitField0_ = (bitField0_ & ~0x00000010);
                mark_ = 0L;
                onChanged();
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:forBenchmark.myDTO)
        }

        // @@protoc_insertion_point(class_scope:forBenchmark.myDTO)
        private static final forBenchmark.protobufDTO.myDTO DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new forBenchmark.protobufDTO.myDTO();
        }

        public static forBenchmark.protobufDTO.myDTO getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @java.lang.Deprecated public static final com.google.protobuf.Parser<myDTO>
                PARSER = new com.google.protobuf.AbstractParser<myDTO>() {
            @java.lang.Override
            public myDTO parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new myDTO(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<myDTO> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<myDTO> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public forBenchmark.protobufDTO.myDTO getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_forBenchmark_myDTO_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_forBenchmark_myDTO_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\010my.proto\022\014forBenchmark\"Y\n\005myDTO\022\n\n\002Id\030" +
                        "\001 \002(\003\022\r\n\005Fname\030\002 \002(\t\022\r\n\005Lname\030\003 \002(\t\022\030\n\020D" +
                        "ormestery_payed\030\004 \002(\010\022\014\n\004Mark\030\005 \002(\003B\rB\013p" +
                        "rotobufDTO"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        });
        internal_static_forBenchmark_myDTO_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_forBenchmark_myDTO_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_forBenchmark_myDTO_descriptor,
                new java.lang.String[] { "Id", "Fname", "Lname", "DormesteryPayed", "Mark", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
