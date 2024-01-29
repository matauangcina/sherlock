package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.JsonParser;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class JsonUtil {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isValidString(String s) {
        return JsonParser.isValidString(s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JsonObject parseJson(String jsonString) throws JwtInvalidException {
        try {
            return JsonParser.parse(jsonString).getAsJsonObject();
        } catch (JsonParseException | IOException | IllegalStateException ex) {
            throw new JwtInvalidException("invalid JSON: " + ex);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JsonArray parseJsonArray(String jsonString) throws JwtInvalidException {
        try {
            return JsonParser.parse(jsonString).getAsJsonArray();
        } catch (JsonParseException | IOException | IllegalStateException ex) {
            throw new JwtInvalidException("invalid JSON: " + ex);
        }
    }

    private JsonUtil() {
    }
}
