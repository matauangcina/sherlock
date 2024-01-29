package com.google.firebase.database.p124p.p127g0;

import com.google.firebase.database.C2307c;
import java.util.regex.Pattern;
/* renamed from: com.google.firebase.database.p.g0.m */
/* loaded from: classes.dex */
public class C2473m {

    /* renamed from: a */
    private static final Pattern f6457a = Pattern.compile("[\\[\\]\\.#$]");

    static {
        Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");
    }

    /* renamed from: a */
    private static boolean m1514a(String str) {
        return !f6457a.matcher(str).find();
    }

    /* renamed from: b */
    public static void m1513b(String str) {
        if (m1514a(str)) {
            return;
        }
        throw new C2307c("Invalid Firebase Database path: " + str + ". Firebase Database paths must not contain '.', '#', '$', '[', or ']'");
    }

    /* renamed from: c */
    public static void m1512c(String str) {
        int i;
        if (!str.startsWith(".info")) {
            i = str.startsWith("/.info") ? 6 : 6;
            m1513b(str);
        }
        i = 5;
        str = str.substring(i);
        m1513b(str);
    }
}
