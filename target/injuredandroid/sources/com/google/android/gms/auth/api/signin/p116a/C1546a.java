package com.google.android.gms.auth.api.signin.p116a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.C1679r;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
/* renamed from: com.google.android.gms.auth.api.signin.a.a */
/* loaded from: classes.dex */
public class C1546a {

    /* renamed from: c */
    private static final Lock f4590c = new ReentrantLock();

    /* renamed from: d */
    private static C1546a f4591d;

    /* renamed from: a */
    private final Lock f4592a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f4593b;

    private C1546a(Context context) {
        this.f4593b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C1546a m3977a(Context context) {
        C1679r.m3631h(context);
        f4590c.lock();
        try {
            if (f4591d == null) {
                f4591d = new C1546a(context.getApplicationContext());
            }
            return f4591d;
        } finally {
            f4590c.unlock();
        }
    }

    /* renamed from: c */
    private static String m3975c(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: d */
    private final GoogleSignInAccount m3974d(String str) {
        String m3973e;
        if (!TextUtils.isEmpty(str) && (m3973e = m3973e(m3975c("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.m3979t(m3973e);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    private final String m3973e(String str) {
        this.f4592a.lock();
        try {
            return this.f4593b.getString(str, null);
        } finally {
            this.f4592a.unlock();
        }
    }

    /* renamed from: b */
    public GoogleSignInAccount m3976b() {
        return m3974d(m3973e("defaultGoogleSignInAccount"));
    }
}
