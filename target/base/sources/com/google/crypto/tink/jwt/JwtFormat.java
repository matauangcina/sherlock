package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Base64;
import com.google.gson.JsonObject;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.security.InvalidAlgorithmParameterException;
import java.util.Optional;
/* loaded from: classes.dex */
final class JwtFormat {

    /* loaded from: classes.dex */
    static class Parts {
        String header;
        String payload;
        byte[] signatureOrMac;
        String unsignedCompact;

        Parts(String unsignedCompact, byte[] signatureOrMac, String header, String payload) {
            this.unsignedCompact = unsignedCompact;
            this.signatureOrMac = signatureOrMac;
            this.header = header;
            this.payload = payload;
        }
    }

    private JwtFormat() {
    }

    static boolean isValidUrlsafeBase64Char(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || ((c >= '0' && c <= '9') || c == '-' || c == '_');
    }

    static void validateUtf8(byte[] data) throws JwtInvalidException {
        CharsetDecoder decoder = Util.UTF_8.newDecoder();
        try {
            decoder.decode(ByteBuffer.wrap(data));
        } catch (CharacterCodingException ex) {
            throw new JwtInvalidException(ex.getMessage());
        }
    }

    static byte[] strictUrlSafeDecode(String encodedData) throws JwtInvalidException {
        for (int i = 0; i < encodedData.length(); i++) {
            char c = encodedData.charAt(i);
            if (!isValidUrlsafeBase64Char(c)) {
                throw new JwtInvalidException("invalid encoding");
            }
        }
        try {
            return Base64.urlSafeDecode(encodedData);
        } catch (IllegalArgumentException ex) {
            throw new JwtInvalidException("invalid encoding: " + ex);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void validateAlgorithm(String algo) throws InvalidAlgorithmParameterException {
        char c;
        switch (algo.hashCode()) {
            case 66245349:
                if (algo.equals("ES256")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 66246401:
                if (algo.equals("ES384")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 66248104:
                if (algo.equals("ES512")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 69015912:
                if (algo.equals("HS256")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 69016964:
                if (algo.equals("HS384")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 69018667:
                if (algo.equals("HS512")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 76404080:
                if (algo.equals("PS256")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 76405132:
                if (algo.equals("PS384")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 76406835:
                if (algo.equals("PS512")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 78251122:
                if (algo.equals("RS256")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 78252174:
                if (algo.equals("RS384")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 78253877:
                if (algo.equals("RS512")) {
                    c = '\b';
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
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
                return;
            default:
                throw new InvalidAlgorithmParameterException("invalid algorithm: " + algo);
        }
    }

    static String createHeader(String algorithm, Optional<String> typeHeader, Optional<String> kid) throws InvalidAlgorithmParameterException {
        validateAlgorithm(algorithm);
        JsonObject header = new JsonObject();
        if (kid.isPresent()) {
            header.addProperty("kid", kid.get());
        }
        header.addProperty("alg", algorithm);
        if (typeHeader.isPresent()) {
            header.addProperty("typ", typeHeader.get());
        }
        return Base64.urlSafeEncode(header.toString().getBytes(Util.UTF_8));
    }

    private static void validateKidInHeader(String expectedKid, JsonObject parsedHeader) throws JwtInvalidException {
        String kid = getStringHeader(parsedHeader, "kid");
        if (!kid.equals(expectedKid)) {
            throw new JwtInvalidException("invalid kid in header");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void validateHeader(String expectedAlgorithm, Optional<String> tinkKid, Optional<String> customKid, JsonObject parsedHeader) throws InvalidAlgorithmParameterException, JwtInvalidException {
        validateAlgorithm(expectedAlgorithm);
        String algorithm = getStringHeader(parsedHeader, "alg");
        if (!algorithm.equals(expectedAlgorithm)) {
            throw new InvalidAlgorithmParameterException(String.format("invalid algorithm; expected %s, got %s", expectedAlgorithm, algorithm));
        }
        if (parsedHeader.has("crit")) {
            throw new JwtInvalidException("all tokens with crit headers are rejected");
        }
        if (tinkKid.isPresent() && customKid.isPresent()) {
            throw new JwtInvalidException("custom_kid can only be set for RAW keys.");
        }
        boolean headerHasKid = parsedHeader.has("kid");
        if (tinkKid.isPresent()) {
            if (!headerHasKid) {
                throw new JwtInvalidException("missing kid in header");
            }
            validateKidInHeader(tinkKid.get(), parsedHeader);
        }
        if (customKid.isPresent() && headerHasKid) {
            validateKidInHeader(customKid.get(), parsedHeader);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Optional<String> getTypeHeader(JsonObject header) throws JwtInvalidException {
        if (header.has("typ")) {
            return Optional.of(getStringHeader(header, "typ"));
        }
        return Optional.empty();
    }

    private static String getStringHeader(JsonObject header, String name) throws JwtInvalidException {
        if (!header.has(name)) {
            throw new JwtInvalidException("header " + name + " does not exist");
        }
        if (!header.get(name).isJsonPrimitive() || !header.get(name).getAsJsonPrimitive().isString()) {
            throw new JwtInvalidException("header " + name + " is not a string");
        }
        return header.get(name).getAsString();
    }

    static String decodeHeader(String headerStr) throws JwtInvalidException {
        byte[] data = strictUrlSafeDecode(headerStr);
        validateUtf8(data);
        return new String(data, Util.UTF_8);
    }

    static String encodePayload(String jsonPayload) {
        return Base64.urlSafeEncode(jsonPayload.getBytes(Util.UTF_8));
    }

    static String decodePayload(String payloadStr) throws JwtInvalidException {
        byte[] data = strictUrlSafeDecode(payloadStr);
        validateUtf8(data);
        return new String(data, Util.UTF_8);
    }

    static String encodeSignature(byte[] signature) {
        return Base64.urlSafeEncode(signature);
    }

    static byte[] decodeSignature(String signatureStr) throws JwtInvalidException {
        return strictUrlSafeDecode(signatureStr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Optional<String> getKid(int keyId, OutputPrefixType prefix) throws JwtInvalidException {
        if (prefix == OutputPrefixType.RAW) {
            return Optional.empty();
        }
        if (prefix == OutputPrefixType.TINK) {
            byte[] bigEndianKeyId = ByteBuffer.allocate(4).putInt(keyId).array();
            return Optional.of(Base64.urlSafeEncode(bigEndianKeyId));
        }
        throw new JwtInvalidException("unsupported output prefix type");
    }

    static Optional<Integer> getKeyId(String kid) {
        byte[] encodedKeyId = Base64.urlSafeDecode(kid);
        if (encodedKeyId.length != 4) {
            return Optional.empty();
        }
        return Optional.of(Integer.valueOf(ByteBuffer.wrap(encodedKeyId).getInt()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Parts splitSignedCompact(String signedCompact) throws JwtInvalidException {
        validateASCII(signedCompact);
        int sigPos = signedCompact.lastIndexOf(46);
        if (sigPos < 0) {
            throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        String unsignedCompact = signedCompact.substring(0, sigPos);
        String encodedMac = signedCompact.substring(sigPos + 1);
        byte[] mac = decodeSignature(encodedMac);
        int payloadPos = unsignedCompact.indexOf(46);
        if (payloadPos < 0) {
            throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        String encodedHeader = unsignedCompact.substring(0, payloadPos);
        String encodedPayload = unsignedCompact.substring(payloadPos + 1);
        if (encodedPayload.indexOf(46) > 0) {
            throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        String header = decodeHeader(encodedHeader);
        String payload = decodePayload(encodedPayload);
        return new Parts(unsignedCompact, mac, header, payload);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String createUnsignedCompact(String algorithm, Optional<String> kid, RawJwt rawJwt) throws InvalidAlgorithmParameterException, JwtInvalidException {
        String jsonPayload = rawJwt.getJsonPayload();
        Optional<String> typeHeader = rawJwt.hasTypeHeader() ? Optional.of(rawJwt.getTypeHeader()) : Optional.empty();
        return createHeader(algorithm, typeHeader, kid) + "." + encodePayload(jsonPayload);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String createSignedCompact(String unsignedCompact, byte[] signature) {
        return unsignedCompact + "." + encodeSignature(signature);
    }

    static void validateASCII(String data) throws JwtInvalidException {
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if ((c & 128) > 0) {
                throw new JwtInvalidException("Non ascii character");
            }
        }
    }
}
