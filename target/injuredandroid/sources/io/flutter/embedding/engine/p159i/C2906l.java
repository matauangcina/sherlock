package io.flutter.embedding.engine.p159i;

import io.flutter.embedding.engine.p149e.C2832a;
import java.util.HashMap;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.C1500a;
import p108c.p109a.p110c.p111a.C1511d;
/* renamed from: io.flutter.embedding.engine.i.l */
/* loaded from: classes.dex */
public class C2906l {

    /* renamed from: a */
    public final C1500a<Object> f7207a;

    public C2906l(C2832a c2832a) {
        this.f7207a = new C1500a<>(c2832a, "flutter/system", C1511d.f4545a);
    }

    /* renamed from: a */
    public void m413a() {
        C1499b.m4050d("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f7207a.m4045c(hashMap);
    }
}
