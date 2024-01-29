package io.flutter.embedding.engine.p159i;

import android.os.Build;
import io.flutter.embedding.engine.p149e.C2832a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.C1512e;
import p108c.p109a.p110c.p111a.C1516i;
/* renamed from: io.flutter.embedding.engine.i.e */
/* loaded from: classes.dex */
public class C2876e {

    /* renamed from: a */
    public final C1516i f7113a;

    public C2876e(C2832a c2832a) {
        this.f7113a = new C1516i(c2832a, "flutter/localization", C1512e.f4546a);
    }

    /* renamed from: a */
    public void m465a(List<Locale> list) {
        C1499b.m4050d("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            C1499b.m4050d("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "");
            arrayList.add(locale.getVariant());
        }
        this.f7113a.m4036c("setLocale", arrayList);
    }
}
