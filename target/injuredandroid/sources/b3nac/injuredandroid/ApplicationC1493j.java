package b3nac.injuredandroid;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import p000a.p045o.p046a.C0323b;
import p000a.p045o.p046a.SharedPreferencesC0317a;
import p135d.p142s.p144d.C2723e;
import p135d.p142s.p144d.C2725g;
/* renamed from: b3nac.injuredandroid.j */
/* loaded from: classes.dex */
public final class ApplicationC1493j extends Application {

    /* renamed from: i */
    private static Context f4522i;

    /* renamed from: j */
    public static final C1494a f4523j = new C1494a(null);

    /* renamed from: f */
    private final String f4524f = "b3nac.injuredandroid.encrypted";

    /* renamed from: g */
    private C0323b f4525g;

    /* renamed from: h */
    private final SharedPreferences f4526h;

    /* renamed from: b3nac.injuredandroid.j$a */
    /* loaded from: classes.dex */
    public static final class C1494a {
        private C1494a() {
        }

        public /* synthetic */ C1494a(C2723e c2723e) {
            this();
        }

        /* renamed from: a */
        public final void m4062a(Context context) {
            C2725g.m881e(context, "con");
            ApplicationC1493j.f4522i = context;
        }
    }

    public ApplicationC1493j() {
        Context context = f4522i;
        if (context == null) {
            C2725g.m872n("context");
            throw null;
        }
        C0323b.C0325b c0325b = new C0323b.C0325b(context, "_androidx_security_master_key_");
        c0325b.m8382c(C0323b.EnumC0326c.AES256_GCM);
        C0323b m8384a = c0325b.m8384a();
        C2725g.m882d(m8384a, "MasterKey.Builder(contex…cheme.AES256_GCM).build()");
        this.f4525g = m8384a;
        Context context2 = f4522i;
        if (context2 == null) {
            C2725g.m872n("context");
            throw null;
        }
        SharedPreferences m8400a = SharedPreferencesC0317a.m8400a(context2, this.f4524f, m8384a, SharedPreferencesC0317a.EnumC0321d.AES256_SIV, SharedPreferencesC0317a.EnumC0322e.AES256_GCM);
        C2725g.m882d(m8400a, "EncryptedSharedPreferenc…ryptionScheme.AES256_GCM)");
        this.f4526h = m8400a;
    }

    /* renamed from: b */
    public final void m4065b(Context context, String str, boolean z) {
        C2725g.m881e(context, "context");
        C2725g.m881e(str, "string");
        SharedPreferences.Editor edit = this.f4526h.edit();
        edit.putBoolean(str, z).apply();
        edit.clear();
    }

    /* renamed from: c */
    public final String m4064c(String str, String str2) {
        C2725g.m881e(str, "s");
        C2725g.m881e(str2, "s1");
        return this.f4526h.getString(str, str2);
    }

    /* renamed from: d */
    public final void m4063d(Context context, String str, String str2) {
        C2725g.m881e(context, "context");
        C2725g.m881e(str, "string");
        SharedPreferences.Editor edit = this.f4526h.edit();
        edit.putString(str, str2).apply();
        edit.clear();
    }
}
