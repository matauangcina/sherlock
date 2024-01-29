package com.google.crypto.tink.jwt;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.proto.JwtEcdsaAlgorithm;
import com.google.crypto.tink.proto.JwtEcdsaPublicKey;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey;
import com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.Base64;
import com.google.crypto.tink.tinkkey.KeyAccess;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Optional;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class JwkSetConverter {
    private static final String JWT_ECDSA_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey";
    private static final String JWT_RSA_SSA_PKCS1_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey";
    private static final String JWT_RSA_SSA_PSS_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String fromPublicKeysetHandle(KeysetHandle handle) throws IOException, GeneralSecurityException {
        char c;
        JsonArray keys = new JsonArray();
        for (int i = 0; i < handle.size(); i++) {
            KeysetHandle.Entry entry = handle.getAt(i);
            if (entry.getStatus() == KeyStatus.ENABLED) {
                Key publicKey = entry.getKey();
                if (!(publicKey instanceof LegacyProtoKey)) {
                    throw new GeneralSecurityException("only LegacyProtoKey is currently supported");
                }
                LegacyProtoKey protoKey = (LegacyProtoKey) publicKey;
                ProtoKeySerialization protoKeySerialization = protoKey.getSerialization(null);
                if (protoKeySerialization.getOutputPrefixType() != OutputPrefixType.RAW && protoKeySerialization.getOutputPrefixType() != OutputPrefixType.TINK) {
                    throw new GeneralSecurityException("only OutputPrefixType RAW and TINK are supported");
                }
                if (protoKeySerialization.getKeyMaterialType() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    throw new GeneralSecurityException("only public keys can be converted");
                }
                String typeUrl = protoKeySerialization.getTypeUrl();
                switch (typeUrl.hashCode()) {
                    case -1204668709:
                        if (typeUrl.equals(JWT_ECDSA_PUBLIC_KEY_URL)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 516334794:
                        if (typeUrl.equals(JWT_RSA_SSA_PKCS1_PUBLIC_KEY_URL)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1174255008:
                        if (typeUrl.equals(JWT_RSA_SSA_PSS_PUBLIC_KEY_URL)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        keys.add(convertJwtEcdsaKey(protoKeySerialization));
                        continue;
                    case 1:
                        keys.add(convertJwtRsaSsaPkcs1(protoKeySerialization));
                        continue;
                    case 2:
                        keys.add(convertJwtRsaSsaPss(protoKeySerialization));
                        continue;
                    default:
                        throw new GeneralSecurityException(String.format("key type %s is not supported", protoKeySerialization.getTypeUrl()));
                }
            }
        }
        JsonObject jwkSet = new JsonObject();
        jwkSet.add("keys", keys);
        return jwkSet.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
        if (r8.equals("ES") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.crypto.tink.KeysetHandle toPublicKeysetHandle(java.lang.String r11) throws java.io.IOException, java.security.GeneralSecurityException {
        /*
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader     // Catch: java.lang.StackOverflowError -> Lc7 com.google.gson.JsonParseException -> Lc9 java.lang.IllegalStateException -> Lcb
            java.io.StringReader r1 = new java.io.StringReader     // Catch: java.lang.StackOverflowError -> Lc7 com.google.gson.JsonParseException -> Lc9 java.lang.IllegalStateException -> Lcb
            r1.<init>(r11)     // Catch: java.lang.StackOverflowError -> Lc7 com.google.gson.JsonParseException -> Lc9 java.lang.IllegalStateException -> Lcb
            r0.<init>(r1)     // Catch: java.lang.StackOverflowError -> Lc7 com.google.gson.JsonParseException -> Lc9 java.lang.IllegalStateException -> Lcb
            r1 = 0
            r0.setLenient(r1)     // Catch: java.lang.StackOverflowError -> Lc7 com.google.gson.JsonParseException -> Lc9 java.lang.IllegalStateException -> Lcb
            com.google.gson.JsonElement r2 = com.google.gson.internal.Streams.parse(r0)     // Catch: java.lang.StackOverflowError -> Lc7 com.google.gson.JsonParseException -> Lc9 java.lang.IllegalStateException -> Lcb
            com.google.gson.JsonObject r2 = r2.getAsJsonObject()     // Catch: java.lang.StackOverflowError -> Lc7 com.google.gson.JsonParseException -> Lc9 java.lang.IllegalStateException -> Lcb
            r0 = r2
            com.google.crypto.tink.KeysetHandle$Builder r2 = com.google.crypto.tink.KeysetHandle.newBuilder()
            java.lang.String r3 = "keys"
            com.google.gson.JsonElement r3 = r0.get(r3)
            com.google.gson.JsonArray r3 = r3.getAsJsonArray()
            java.util.Iterator r4 = r3.iterator()
        L2a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lad
            java.lang.Object r5 = r4.next()
            com.google.gson.JsonElement r5 = (com.google.gson.JsonElement) r5
            com.google.gson.JsonObject r6 = r5.getAsJsonObject()
            java.lang.String r7 = "alg"
            java.lang.String r8 = getStringItem(r6, r7)
            r9 = 2
            java.lang.String r8 = r8.substring(r1, r9)
            int r10 = r8.hashCode()
            switch(r10) {
                case 2222: goto L61;
                case 2563: goto L57;
                case 2625: goto L4d;
                default: goto L4c;
            }
        L4c:
            goto L6a
        L4d:
            java.lang.String r9 = "RS"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L4c
            r9 = r1
            goto L6b
        L57:
            java.lang.String r9 = "PS"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L4c
            r9 = 1
            goto L6b
        L61:
            java.lang.String r10 = "ES"
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L4c
            goto L6b
        L6a:
            r9 = -1
        L6b:
            switch(r9) {
                case 0: goto L95;
                case 1: goto L90;
                case 2: goto L8b;
                default: goto L6e;
            }
        L6e:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "unexpected alg value: "
            java.lang.StringBuilder r4 = r4.append(r9)
            java.lang.String r7 = getStringItem(r6, r7)
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
        L8b:
            com.google.crypto.tink.internal.ProtoKeySerialization r7 = convertToEcdsaKey(r6)
            goto L9a
        L90:
            com.google.crypto.tink.internal.ProtoKeySerialization r7 = convertToRsaSsaPssKey(r6)
            goto L9a
        L95:
            com.google.crypto.tink.internal.ProtoKeySerialization r7 = convertToRsaSsaPkcs1Key(r6)
        L9a:
            com.google.crypto.tink.internal.LegacyProtoKey r9 = new com.google.crypto.tink.internal.LegacyProtoKey
            r10 = 0
            r9.<init>(r7, r10)
            com.google.crypto.tink.KeysetHandle$Builder$Entry r9 = com.google.crypto.tink.KeysetHandle.importKey(r9)
            com.google.crypto.tink.KeysetHandle$Builder$Entry r9 = r9.withRandomId()
            r2.addEntry(r9)
            goto L2a
        Lad:
            int r4 = r2.size()
            if (r4 <= 0) goto Lbf
            com.google.crypto.tink.KeysetHandle$Builder$Entry r1 = r2.getAt(r1)
            r1.makePrimary()
            com.google.crypto.tink.KeysetHandle r1 = r2.build()
            return r1
        Lbf:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r4 = "empty keyset"
            r1.<init>(r4)
            throw r1
        Lc7:
            r0 = move-exception
            goto Lcc
        Lc9:
            r0 = move-exception
            goto Lcc
        Lcb:
            r0 = move-exception
        Lcc:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "JWK set is invalid JSON"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.jwt.JwkSetConverter.toPublicKeysetHandle(java.lang.String):com.google.crypto.tink.KeysetHandle");
    }

    private static Optional<String> getKid(@Nullable Integer idRequirement) {
        if (idRequirement == null) {
            return Optional.empty();
        }
        byte[] bigEndianKeyId = ByteBuffer.allocate(4).putInt(idRequirement.intValue()).array();
        return Optional.of(Base64.urlSafeEncode(bigEndianKeyId));
    }

    private static JsonObject convertJwtEcdsaKey(ProtoKeySerialization protoKeySerialization) throws GeneralSecurityException {
        String alg;
        String crv;
        try {
            JwtEcdsaPublicKey jwtEcdsaPublicKey = JwtEcdsaPublicKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            switch (C10111.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[jwtEcdsaPublicKey.getAlgorithm().ordinal()]) {
                case 1:
                    alg = "ES256";
                    crv = "P-256";
                    break;
                case 2:
                    alg = "ES384";
                    crv = "P-384";
                    break;
                case 3:
                    alg = "ES512";
                    crv = "P-521";
                    break;
                default:
                    throw new GeneralSecurityException("unknown algorithm");
            }
            JsonObject jsonKey = new JsonObject();
            jsonKey.addProperty("kty", "EC");
            jsonKey.addProperty("crv", crv);
            jsonKey.addProperty("x", Base64.urlSafeEncode(jwtEcdsaPublicKey.getX().toByteArray()));
            jsonKey.addProperty("y", Base64.urlSafeEncode(jwtEcdsaPublicKey.getY().toByteArray()));
            jsonKey.addProperty("use", "sig");
            jsonKey.addProperty("alg", alg);
            JsonArray keyOps = new JsonArray();
            keyOps.add("verify");
            jsonKey.add("key_ops", keyOps);
            Optional<String> kid = getKid(protoKeySerialization.getIdRequirementOrNull());
            if (kid.isPresent()) {
                jsonKey.addProperty("kid", kid.get());
            } else if (jwtEcdsaPublicKey.hasCustomKid()) {
                jsonKey.addProperty("kid", jwtEcdsaPublicKey.getCustomKid().getValue());
            }
            return jsonKey;
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("failed to parse value as JwtEcdsaPublicKey proto", e);
        }
    }

    private static JsonObject convertJwtRsaSsaPkcs1(ProtoKeySerialization protoKeySerialization) throws GeneralSecurityException {
        String alg;
        try {
            JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey = JwtRsaSsaPkcs1PublicKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            switch (C10111.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm[jwtRsaSsaPkcs1PublicKey.getAlgorithm().ordinal()]) {
                case 1:
                    alg = "RS256";
                    break;
                case 2:
                    alg = "RS384";
                    break;
                case 3:
                    alg = "RS512";
                    break;
                default:
                    throw new GeneralSecurityException("unknown algorithm");
            }
            JsonObject jsonKey = new JsonObject();
            jsonKey.addProperty("kty", "RSA");
            jsonKey.addProperty("n", Base64.urlSafeEncode(jwtRsaSsaPkcs1PublicKey.getN().toByteArray()));
            jsonKey.addProperty("e", Base64.urlSafeEncode(jwtRsaSsaPkcs1PublicKey.getE().toByteArray()));
            jsonKey.addProperty("use", "sig");
            jsonKey.addProperty("alg", alg);
            JsonArray keyOps = new JsonArray();
            keyOps.add("verify");
            jsonKey.add("key_ops", keyOps);
            Optional<String> kid = getKid(protoKeySerialization.getIdRequirementOrNull());
            if (kid.isPresent()) {
                jsonKey.addProperty("kid", kid.get());
            } else if (jwtRsaSsaPkcs1PublicKey.hasCustomKid()) {
                jsonKey.addProperty("kid", jwtRsaSsaPkcs1PublicKey.getCustomKid().getValue());
            }
            return jsonKey;
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("failed to parse value as JwtRsaSsaPkcs1PublicKey proto", e);
        }
    }

    private static JsonObject convertJwtRsaSsaPss(ProtoKeySerialization protoKeySerialization) throws GeneralSecurityException {
        String alg;
        try {
            JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey = JwtRsaSsaPssPublicKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            switch (C10111.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[jwtRsaSsaPssPublicKey.getAlgorithm().ordinal()]) {
                case 1:
                    alg = "PS256";
                    break;
                case 2:
                    alg = "PS384";
                    break;
                case 3:
                    alg = "PS512";
                    break;
                default:
                    throw new GeneralSecurityException("unknown algorithm");
            }
            JsonObject jsonKey = new JsonObject();
            jsonKey.addProperty("kty", "RSA");
            jsonKey.addProperty("n", Base64.urlSafeEncode(jwtRsaSsaPssPublicKey.getN().toByteArray()));
            jsonKey.addProperty("e", Base64.urlSafeEncode(jwtRsaSsaPssPublicKey.getE().toByteArray()));
            jsonKey.addProperty("use", "sig");
            jsonKey.addProperty("alg", alg);
            JsonArray keyOps = new JsonArray();
            keyOps.add("verify");
            jsonKey.add("key_ops", keyOps);
            Optional<String> kid = getKid(protoKeySerialization.getIdRequirementOrNull());
            if (kid.isPresent()) {
                jsonKey.addProperty("kid", kid.get());
            } else if (jwtRsaSsaPssPublicKey.hasCustomKid()) {
                jsonKey.addProperty("kid", jwtRsaSsaPssPublicKey.getCustomKid().getValue());
            }
            return jsonKey;
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("failed to parse value as JwtRsaSsaPssPublicKey proto", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.jwt.JwkSetConverter$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C10111 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm;

        static {
            int[] iArr = new int[JwtRsaSsaPssAlgorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm = iArr;
            try {
                iArr[JwtRsaSsaPssAlgorithm.PS256.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[JwtRsaSsaPssAlgorithm.PS384.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[JwtRsaSsaPssAlgorithm.PS512.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            int[] iArr2 = new int[JwtRsaSsaPkcs1Algorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm = iArr2;
            try {
                iArr2[JwtRsaSsaPkcs1Algorithm.RS256.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm[JwtRsaSsaPkcs1Algorithm.RS384.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm[JwtRsaSsaPkcs1Algorithm.RS512.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            int[] iArr3 = new int[JwtEcdsaAlgorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = iArr3;
            try {
                iArr3[JwtEcdsaAlgorithm.ES256.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[JwtEcdsaAlgorithm.ES384.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[JwtEcdsaAlgorithm.ES512.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    private static String getStringItem(JsonObject obj, String name) throws GeneralSecurityException {
        if (!obj.has(name)) {
            throw new GeneralSecurityException(name + " not found");
        }
        if (!obj.get(name).isJsonPrimitive() || !obj.get(name).getAsJsonPrimitive().isString()) {
            throw new GeneralSecurityException(name + " is not a string");
        }
        return obj.get(name).getAsString();
    }

    private static void expectStringItem(JsonObject obj, String name, String expectedValue) throws GeneralSecurityException {
        String value = getStringItem(obj, name);
        if (!value.equals(expectedValue)) {
            throw new GeneralSecurityException("unexpected " + name + " value: " + value);
        }
    }

    private static void validateUseIsSig(JsonObject jsonKey) throws GeneralSecurityException {
        if (jsonKey.has("use")) {
            expectStringItem(jsonKey, "use", "sig");
        }
    }

    private static void validateKeyOpsIsVerify(JsonObject jsonKey) throws GeneralSecurityException {
        if (!jsonKey.has("key_ops")) {
            return;
        }
        if (!jsonKey.get("key_ops").isJsonArray()) {
            throw new GeneralSecurityException("key_ops is not an array");
        }
        JsonArray keyOps = jsonKey.get("key_ops").getAsJsonArray();
        if (keyOps.size() != 1) {
            throw new GeneralSecurityException("key_ops must contain exactly one element");
        }
        if (!keyOps.get(0).isJsonPrimitive() || !keyOps.get(0).getAsJsonPrimitive().isString()) {
            throw new GeneralSecurityException("key_ops is not a string");
        }
        if (!keyOps.get(0).getAsString().equals("verify")) {
            throw new GeneralSecurityException("unexpected keyOps value: " + keyOps.get(0).getAsString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static ProtoKeySerialization convertToRsaSsaPkcs1Key(JsonObject jsonKey) throws GeneralSecurityException {
        char c;
        JwtRsaSsaPkcs1Algorithm algorithm;
        String stringItem = getStringItem(jsonKey, "alg");
        switch (stringItem.hashCode()) {
            case 78251122:
                if (stringItem.equals("RS256")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 78252174:
                if (stringItem.equals("RS384")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 78253877:
                if (stringItem.equals("RS512")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                algorithm = JwtRsaSsaPkcs1Algorithm.RS256;
                break;
            case 1:
                algorithm = JwtRsaSsaPkcs1Algorithm.RS384;
                break;
            case 2:
                algorithm = JwtRsaSsaPkcs1Algorithm.RS512;
                break;
            default:
                throw new GeneralSecurityException("Unknown Rsa Algorithm: " + getStringItem(jsonKey, "alg"));
        }
        if (jsonKey.has("p") || jsonKey.has("q") || jsonKey.has("dp") || jsonKey.has("dq") || jsonKey.has("d") || jsonKey.has("qi")) {
            throw new UnsupportedOperationException("importing RSA private keys is not implemented");
        }
        expectStringItem(jsonKey, "kty", "RSA");
        validateUseIsSig(jsonKey);
        validateKeyOpsIsVerify(jsonKey);
        JwtRsaSsaPkcs1PublicKey.Builder pkcs1PubKeyBuilder = JwtRsaSsaPkcs1PublicKey.newBuilder().setVersion(0).setAlgorithm(algorithm).setE(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(jsonKey, "e")))).setN(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(jsonKey, "n"))));
        if (jsonKey.has("kid")) {
            pkcs1PubKeyBuilder.setCustomKid((JwtRsaSsaPkcs1PublicKey.CustomKid) JwtRsaSsaPkcs1PublicKey.CustomKid.newBuilder().setValue(getStringItem(jsonKey, "kid")).build());
        }
        return ProtoKeySerialization.create(JWT_RSA_SSA_PKCS1_PUBLIC_KEY_URL, ((JwtRsaSsaPkcs1PublicKey) pkcs1PubKeyBuilder.build()).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, OutputPrefixType.RAW, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static ProtoKeySerialization convertToRsaSsaPssKey(JsonObject jsonKey) throws GeneralSecurityException {
        char c;
        JwtRsaSsaPssAlgorithm algorithm;
        String stringItem = getStringItem(jsonKey, "alg");
        switch (stringItem.hashCode()) {
            case 76404080:
                if (stringItem.equals("PS256")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 76405132:
                if (stringItem.equals("PS384")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 76406835:
                if (stringItem.equals("PS512")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                algorithm = JwtRsaSsaPssAlgorithm.PS256;
                break;
            case 1:
                algorithm = JwtRsaSsaPssAlgorithm.PS384;
                break;
            case 2:
                algorithm = JwtRsaSsaPssAlgorithm.PS512;
                break;
            default:
                throw new GeneralSecurityException("Unknown Rsa Algorithm: " + getStringItem(jsonKey, "alg"));
        }
        if (jsonKey.has("p") || jsonKey.has("q") || jsonKey.has("dq") || jsonKey.has("dq") || jsonKey.has("d") || jsonKey.has("qi")) {
            throw new UnsupportedOperationException("importing RSA private keys is not implemented");
        }
        expectStringItem(jsonKey, "kty", "RSA");
        validateUseIsSig(jsonKey);
        validateKeyOpsIsVerify(jsonKey);
        JwtRsaSsaPssPublicKey.Builder pssPubKeyBuilder = JwtRsaSsaPssPublicKey.newBuilder().setVersion(0).setAlgorithm(algorithm).setE(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(jsonKey, "e")))).setN(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(jsonKey, "n"))));
        if (jsonKey.has("kid")) {
            pssPubKeyBuilder.setCustomKid((JwtRsaSsaPssPublicKey.CustomKid) JwtRsaSsaPssPublicKey.CustomKid.newBuilder().setValue(getStringItem(jsonKey, "kid")).build());
        }
        return ProtoKeySerialization.create(JWT_RSA_SSA_PSS_PUBLIC_KEY_URL, ((JwtRsaSsaPssPublicKey) pssPubKeyBuilder.build()).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, OutputPrefixType.RAW, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static ProtoKeySerialization convertToEcdsaKey(JsonObject jsonKey) throws GeneralSecurityException {
        char c;
        JwtEcdsaAlgorithm algorithm;
        String stringItem = getStringItem(jsonKey, "alg");
        switch (stringItem.hashCode()) {
            case 66245349:
                if (stringItem.equals("ES256")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 66246401:
                if (stringItem.equals("ES384")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 66248104:
                if (stringItem.equals("ES512")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                expectStringItem(jsonKey, "crv", "P-256");
                algorithm = JwtEcdsaAlgorithm.ES256;
                break;
            case 1:
                expectStringItem(jsonKey, "crv", "P-384");
                algorithm = JwtEcdsaAlgorithm.ES384;
                break;
            case 2:
                expectStringItem(jsonKey, "crv", "P-521");
                algorithm = JwtEcdsaAlgorithm.ES512;
                break;
            default:
                throw new GeneralSecurityException("Unknown Ecdsa Algorithm: " + getStringItem(jsonKey, "alg"));
        }
        if (jsonKey.has("d")) {
            throw new UnsupportedOperationException("importing ECDSA private keys is not implemented");
        }
        expectStringItem(jsonKey, "kty", "EC");
        validateUseIsSig(jsonKey);
        validateKeyOpsIsVerify(jsonKey);
        JwtEcdsaPublicKey.Builder ecdsaPubKeyBuilder = JwtEcdsaPublicKey.newBuilder().setVersion(0).setAlgorithm(algorithm).setX(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(jsonKey, "x")))).setY(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(jsonKey, "y"))));
        if (jsonKey.has("kid")) {
            ecdsaPubKeyBuilder.setCustomKid((JwtEcdsaPublicKey.CustomKid) JwtEcdsaPublicKey.CustomKid.newBuilder().setValue(getStringItem(jsonKey, "kid")).build());
        }
        return ProtoKeySerialization.create(JWT_ECDSA_PUBLIC_KEY_URL, ((JwtEcdsaPublicKey) ecdsaPubKeyBuilder.build()).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, OutputPrefixType.RAW, null);
    }

    @Deprecated
    public static String fromKeysetHandle(KeysetHandle handle, KeyAccess keyAccess) throws IOException, GeneralSecurityException {
        return fromPublicKeysetHandle(handle);
    }

    @Deprecated
    public static KeysetHandle toKeysetHandle(String jwkSet, KeyAccess keyAccess) throws IOException, GeneralSecurityException {
        return toPublicKeysetHandle(jwkSet);
    }

    private JwkSetConverter() {
    }
}
