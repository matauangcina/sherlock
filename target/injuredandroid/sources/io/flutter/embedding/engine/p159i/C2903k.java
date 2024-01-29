package io.flutter.embedding.engine.p159i;

import io.flutter.embedding.engine.p149e.C2832a;
import java.util.HashMap;
import java.util.Map;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.C1500a;
import p108c.p109a.p110c.p111a.C1511d;
/* renamed from: io.flutter.embedding.engine.i.k */
/* loaded from: classes.dex */
public class C2903k {

    /* renamed from: a */
    public final C1500a<Object> f7200a;

    /* renamed from: io.flutter.embedding.engine.i.k$a */
    /* loaded from: classes.dex */
    public static class C2904a {

        /* renamed from: a */
        private final C1500a<Object> f7201a;

        /* renamed from: b */
        private Map<String, Object> f7202b = new HashMap();

        C2904a(C1500a<Object> c1500a) {
            this.f7201a = c1500a;
        }

        /* renamed from: a */
        public void m417a() {
            C1499b.m4050d("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f7202b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f7202b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f7202b.get("platformBrightness"));
            this.f7201a.m4045c(this.f7202b);
        }

        /* renamed from: b */
        public C2904a m416b(EnumC2905b enumC2905b) {
            this.f7202b.put("platformBrightness", enumC2905b.f7206f);
            return this;
        }

        /* renamed from: c */
        public C2904a m415c(float f) {
            this.f7202b.put("textScaleFactor", Float.valueOf(f));
            return this;
        }

        /* renamed from: d */
        public C2904a m414d(boolean z) {
            this.f7202b.put("alwaysUse24HourFormat", Boolean.valueOf(z));
            return this;
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.k$b */
    /* loaded from: classes.dex */
    public enum EnumC2905b {
        light("light"),
        dark("dark");
        

        /* renamed from: f */
        public String f7206f;

        EnumC2905b(String str) {
            this.f7206f = str;
        }
    }

    public C2903k(C2832a c2832a) {
        this.f7200a = new C1500a<>(c2832a, "flutter/settings", C1511d.f4545a);
    }

    /* renamed from: a */
    public C2904a m418a() {
        return new C2904a(this.f7200a);
    }
}
