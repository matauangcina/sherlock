package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.Immutable;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
@Immutable
/* loaded from: classes.dex */
public final class RawJwt {
    private static final long MAX_TIMESTAMP_VALUE = 253402300799L;
    private final JsonObject payload;
    private final Optional<String> typeHeader;

    private RawJwt(Builder builder) {
        if (!builder.payload.has("exp") && !builder.withoutExpiration) {
            throw new IllegalArgumentException("neither setExpiration() nor withoutExpiration() was called");
        }
        if (builder.payload.has("exp") && builder.withoutExpiration) {
            throw new IllegalArgumentException("setExpiration() and withoutExpiration() must not be called together");
        }
        this.typeHeader = builder.typeHeader;
        this.payload = builder.payload.deepCopy();
    }

    private RawJwt(Optional<String> typeHeader, String jsonPayload) throws JwtInvalidException {
        this.typeHeader = typeHeader;
        this.payload = JsonUtil.parseJson(jsonPayload);
        validateStringClaim("iss");
        validateStringClaim("sub");
        validateStringClaim("jti");
        validateTimestampClaim("exp");
        validateTimestampClaim("nbf");
        validateTimestampClaim("iat");
        validateAudienceClaim();
    }

    private void validateStringClaim(String name) throws JwtInvalidException {
        if (!this.payload.has(name)) {
            return;
        }
        if (!this.payload.get(name).isJsonPrimitive() || !this.payload.get(name).getAsJsonPrimitive().isString()) {
            throw new JwtInvalidException("invalid JWT payload: claim " + name + " is not a string.");
        }
    }

    private void validateTimestampClaim(String name) throws JwtInvalidException {
        if (!this.payload.has(name)) {
            return;
        }
        if (!this.payload.get(name).isJsonPrimitive() || !this.payload.get(name).getAsJsonPrimitive().isNumber()) {
            throw new JwtInvalidException("invalid JWT payload: claim " + name + " is not a number.");
        }
        double timestamp = this.payload.get(name).getAsJsonPrimitive().getAsDouble();
        if (timestamp > 2.53402300799E11d || timestamp < 0.0d) {
            throw new JwtInvalidException("invalid JWT payload: claim " + name + " has an invalid timestamp");
        }
    }

    private void validateAudienceClaim() throws JwtInvalidException {
        if (!this.payload.has("aud")) {
            return;
        }
        if (this.payload.get("aud").isJsonPrimitive() && this.payload.get("aud").getAsJsonPrimitive().isString()) {
            return;
        }
        List<String> audiences = getAudiences();
        if (audiences.size() < 1) {
            throw new JwtInvalidException("invalid JWT payload: claim aud is present but empty.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RawJwt fromJsonPayload(Optional<String> typeHeader, String jsonPayload) throws JwtInvalidException {
        return new RawJwt(typeHeader, jsonPayload);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private final JsonObject payload;
        private Optional<String> typeHeader;
        private boolean withoutExpiration;

        private Builder() {
            this.typeHeader = Optional.empty();
            this.withoutExpiration = false;
            this.payload = new JsonObject();
        }

        public Builder setTypeHeader(String value) {
            this.typeHeader = Optional.of(value);
            return this;
        }

        public Builder setIssuer(String value) {
            if (!JsonUtil.isValidString(value)) {
                throw new IllegalArgumentException();
            }
            this.payload.add("iss", new JsonPrimitive(value));
            return this;
        }

        public Builder setSubject(String value) {
            if (!JsonUtil.isValidString(value)) {
                throw new IllegalArgumentException();
            }
            this.payload.add("sub", new JsonPrimitive(value));
            return this;
        }

        public Builder setAudience(String value) {
            if (this.payload.has("aud") && this.payload.get("aud").isJsonArray()) {
                throw new IllegalArgumentException("setAudience can't be used together with setAudiences or addAudience");
            }
            if (!JsonUtil.isValidString(value)) {
                throw new IllegalArgumentException("invalid string");
            }
            this.payload.add("aud", new JsonPrimitive(value));
            return this;
        }

        public Builder setAudiences(List<String> values) {
            if (this.payload.has("aud") && !this.payload.get("aud").isJsonArray()) {
                throw new IllegalArgumentException("setAudiences can't be used together with setAudience");
            }
            if (values.isEmpty()) {
                throw new IllegalArgumentException("audiences must not be empty");
            }
            JsonArray audiences = new JsonArray();
            for (String value : values) {
                if (!JsonUtil.isValidString(value)) {
                    throw new IllegalArgumentException("invalid string");
                }
                audiences.add(value);
            }
            this.payload.add("aud", audiences);
            return this;
        }

        public Builder addAudience(String value) {
            JsonArray audiences;
            if (!JsonUtil.isValidString(value)) {
                throw new IllegalArgumentException("invalid string");
            }
            if (this.payload.has("aud")) {
                JsonElement aud = this.payload.get("aud");
                if (!aud.isJsonArray()) {
                    throw new IllegalArgumentException("addAudience can't be used together with setAudience");
                }
                audiences = aud.getAsJsonArray();
            } else {
                audiences = new JsonArray();
            }
            audiences.add(value);
            this.payload.add("aud", audiences);
            return this;
        }

        public Builder setJwtId(String value) {
            if (!JsonUtil.isValidString(value)) {
                throw new IllegalArgumentException();
            }
            this.payload.add("jti", new JsonPrimitive(value));
            return this;
        }

        private void setTimestampClaim(String name, Instant value) {
            long timestamp = value.getEpochSecond();
            if (timestamp > RawJwt.MAX_TIMESTAMP_VALUE || timestamp < 0) {
                throw new IllegalArgumentException("timestamp of claim " + name + " is out of range");
            }
            this.payload.add(name, new JsonPrimitive(Long.valueOf(timestamp)));
        }

        public Builder setExpiration(Instant value) {
            setTimestampClaim("exp", value);
            return this;
        }

        public Builder withoutExpiration() {
            this.withoutExpiration = true;
            return this;
        }

        public Builder setNotBefore(Instant value) {
            setTimestampClaim("nbf", value);
            return this;
        }

        public Builder setIssuedAt(Instant value) {
            setTimestampClaim("iat", value);
            return this;
        }

        public Builder addBooleanClaim(String name, boolean value) {
            JwtNames.validate(name);
            this.payload.add(name, new JsonPrimitive(Boolean.valueOf(value)));
            return this;
        }

        public Builder addNumberClaim(String name, double value) {
            JwtNames.validate(name);
            this.payload.add(name, new JsonPrimitive(Double.valueOf(value)));
            return this;
        }

        public Builder addStringClaim(String name, String value) {
            if (!JsonUtil.isValidString(value)) {
                throw new IllegalArgumentException();
            }
            JwtNames.validate(name);
            this.payload.add(name, new JsonPrimitive(value));
            return this;
        }

        public Builder addNullClaim(String name) {
            JwtNames.validate(name);
            this.payload.add(name, JsonNull.INSTANCE);
            return this;
        }

        public Builder addJsonObjectClaim(String name, String encodedJsonObject) throws JwtInvalidException {
            JwtNames.validate(name);
            this.payload.add(name, JsonUtil.parseJson(encodedJsonObject));
            return this;
        }

        public Builder addJsonArrayClaim(String name, String encodedJsonArray) throws JwtInvalidException {
            JwtNames.validate(name);
            this.payload.add(name, JsonUtil.parseJsonArray(encodedJsonArray));
            return this;
        }

        public RawJwt build() {
            return new RawJwt(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getJsonPayload() {
        return this.payload.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasBooleanClaim(String name) {
        JwtNames.validate(name);
        return this.payload.has(name) && this.payload.get(name).isJsonPrimitive() && this.payload.get(name).getAsJsonPrimitive().isBoolean();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean getBooleanClaim(String name) throws JwtInvalidException {
        JwtNames.validate(name);
        if (!this.payload.has(name)) {
            throw new JwtInvalidException("claim " + name + " does not exist");
        }
        if (!this.payload.get(name).isJsonPrimitive() || !this.payload.get(name).getAsJsonPrimitive().isBoolean()) {
            throw new JwtInvalidException("claim " + name + " is not a boolean");
        }
        return Boolean.valueOf(this.payload.get(name).getAsBoolean());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasNumberClaim(String name) {
        JwtNames.validate(name);
        return this.payload.has(name) && this.payload.get(name).isJsonPrimitive() && this.payload.get(name).getAsJsonPrimitive().isNumber();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Double getNumberClaim(String name) throws JwtInvalidException {
        JwtNames.validate(name);
        if (!this.payload.has(name)) {
            throw new JwtInvalidException("claim " + name + " does not exist");
        }
        if (!this.payload.get(name).isJsonPrimitive() || !this.payload.get(name).getAsJsonPrimitive().isNumber()) {
            throw new JwtInvalidException("claim " + name + " is not a number");
        }
        return Double.valueOf(this.payload.get(name).getAsDouble());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasStringClaim(String name) {
        JwtNames.validate(name);
        return this.payload.has(name) && this.payload.get(name).isJsonPrimitive() && this.payload.get(name).getAsJsonPrimitive().isString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getStringClaim(String name) throws JwtInvalidException {
        JwtNames.validate(name);
        return getStringClaimInternal(name);
    }

    private String getStringClaimInternal(String name) throws JwtInvalidException {
        if (!this.payload.has(name)) {
            throw new JwtInvalidException("claim " + name + " does not exist");
        }
        if (!this.payload.get(name).isJsonPrimitive() || !this.payload.get(name).getAsJsonPrimitive().isString()) {
            throw new JwtInvalidException("claim " + name + " is not a string");
        }
        return this.payload.get(name).getAsString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isNullClaim(String name) {
        JwtNames.validate(name);
        try {
            return JsonNull.INSTANCE.equals(this.payload.get(name));
        } catch (JsonParseException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasJsonObjectClaim(String name) {
        JwtNames.validate(name);
        return this.payload.has(name) && this.payload.get(name).isJsonObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getJsonObjectClaim(String name) throws JwtInvalidException {
        JwtNames.validate(name);
        if (!this.payload.has(name)) {
            throw new JwtInvalidException("claim " + name + " does not exist");
        }
        if (!this.payload.get(name).isJsonObject()) {
            throw new JwtInvalidException("claim " + name + " is not a JSON object");
        }
        return this.payload.get(name).getAsJsonObject().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasJsonArrayClaim(String name) {
        JwtNames.validate(name);
        return this.payload.has(name) && this.payload.get(name).isJsonArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getJsonArrayClaim(String name) throws JwtInvalidException {
        JwtNames.validate(name);
        if (!this.payload.has(name)) {
            throw new JwtInvalidException("claim " + name + " does not exist");
        }
        if (!this.payload.get(name).isJsonArray()) {
            throw new JwtInvalidException("claim " + name + " is not a JSON array");
        }
        return this.payload.get(name).getAsJsonArray().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasTypeHeader() {
        return this.typeHeader.isPresent();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getTypeHeader() throws JwtInvalidException {
        if (!this.typeHeader.isPresent()) {
            throw new JwtInvalidException("type header is not set");
        }
        return this.typeHeader.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasIssuer() {
        return this.payload.has("iss");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getIssuer() throws JwtInvalidException {
        return getStringClaimInternal("iss");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasSubject() {
        return this.payload.has("sub");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getSubject() throws JwtInvalidException {
        return getStringClaimInternal("sub");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasJwtId() {
        return this.payload.has("jti");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getJwtId() throws JwtInvalidException {
        return getStringClaimInternal("jti");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasAudiences() {
        return this.payload.has("aud");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> getAudiences() throws JwtInvalidException {
        if (!hasAudiences()) {
            throw new JwtInvalidException("claim aud does not exist");
        }
        JsonElement aud = this.payload.get("aud");
        if (aud.isJsonPrimitive()) {
            if (!aud.getAsJsonPrimitive().isString()) {
                throw new JwtInvalidException(String.format("invalid audience: got %s; want a string", aud));
            }
            return Collections.unmodifiableList(Arrays.asList(aud.getAsString()));
        } else if (!aud.isJsonArray()) {
            throw new JwtInvalidException("claim aud is not a string or a JSON array");
        } else {
            JsonArray audiences = aud.getAsJsonArray();
            List<String> result = new ArrayList<>(audiences.size());
            for (int i = 0; i < audiences.size(); i++) {
                if (!audiences.get(i).isJsonPrimitive() || !audiences.get(i).getAsJsonPrimitive().isString()) {
                    throw new JwtInvalidException(String.format("invalid audience: got %s; want a string", audiences.get(i)));
                }
                String audience = audiences.get(i).getAsString();
                result.add(audience);
            }
            return Collections.unmodifiableList(result);
        }
    }

    private Instant getInstant(String name) throws JwtInvalidException {
        if (!this.payload.has(name)) {
            throw new JwtInvalidException("claim " + name + " does not exist");
        }
        if (!this.payload.get(name).isJsonPrimitive() || !this.payload.get(name).getAsJsonPrimitive().isNumber()) {
            throw new JwtInvalidException("claim " + name + " is not a timestamp");
        }
        try {
            double millis = this.payload.get(name).getAsJsonPrimitive().getAsDouble() * 1000.0d;
            return Instant.ofEpochMilli((long) millis);
        } catch (NumberFormatException ex) {
            throw new JwtInvalidException("claim " + name + " is not a timestamp: " + ex);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasExpiration() {
        return this.payload.has("exp");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Instant getExpiration() throws JwtInvalidException {
        return getInstant("exp");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasNotBefore() {
        return this.payload.has("nbf");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Instant getNotBefore() throws JwtInvalidException {
        return getInstant("nbf");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasIssuedAt() {
        return this.payload.has("iat");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Instant getIssuedAt() throws JwtInvalidException {
        return getInstant("iat");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<String> customClaimNames() {
        HashSet<String> names = new HashSet<>();
        for (String name : this.payload.keySet()) {
            if (!JwtNames.isRegisteredName(name)) {
                names.add(name);
            }
        }
        return Collections.unmodifiableSet(names);
    }

    public String toString() {
        JsonObject header = new JsonObject();
        if (this.typeHeader.isPresent()) {
            header.add("typ", new JsonPrimitive(this.typeHeader.get()));
        }
        return header + "." + this.payload;
    }
}
