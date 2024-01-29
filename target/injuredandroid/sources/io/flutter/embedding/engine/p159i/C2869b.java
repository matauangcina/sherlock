package io.flutter.embedding.engine.p159i;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.p149e.C2832a;
import io.flutter.view.C2974c;
import java.util.HashMap;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.C1500a;
import p108c.p109a.p110c.p111a.C1529q;
/* renamed from: io.flutter.embedding.engine.i.b */
/* loaded from: classes.dex */
public class C2869b {

    /* renamed from: a */
    public final C1500a<Object> f7103a;

    /* renamed from: b */
    public final FlutterJNI f7104b;

    /* renamed from: c */
    private InterfaceC2871b f7105c;

    /* renamed from: d */
    private final C1500a.InterfaceC1505d<Object> f7106d = new C2870a();

    /* renamed from: io.flutter.embedding.engine.i.b$a */
    /* loaded from: classes.dex */
    class C2870a implements C1500a.InterfaceC1505d<Object> {
        C2870a() {
        }

        @Override // p108c.p109a.p110c.p111a.C1500a.InterfaceC1505d
        /* renamed from: a */
        public void mo478a(Object obj, C1500a.InterfaceC1506e<Object> interfaceC1506e) {
            String str;
            if (C2869b.this.f7105c == null) {
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str2 = (String) hashMap.get("type");
            HashMap hashMap2 = (HashMap) hashMap.get("data");
            C1499b.m4050d("AccessibilityChannel", "Received " + str2 + " message.");
            char c = 65535;
            switch (str2.hashCode()) {
                case -1140076541:
                    if (str2.equals("tooltip")) {
                        c = 3;
                        break;
                    }
                    break;
                case -649620375:
                    if (str2.equals("announce")) {
                        c = 0;
                        break;
                    }
                    break;
                case 114595:
                    if (str2.equals("tap")) {
                        c = 1;
                        break;
                    }
                    break;
                case 114203431:
                    if (str2.equals("longPress")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    C2869b.this.f7105c.mo96a(str3);
                }
            } else if (c == 1) {
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    C2869b.this.f7105c.mo91f(num.intValue());
                }
            } else if (c == 2) {
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    C2869b.this.f7105c.mo93d(num2.intValue());
                }
            } else if (c == 3 && (str = (String) hashMap2.get("message")) != null) {
                C2869b.this.f7105c.mo94c(str);
            }
            interfaceC1506e.mo486a(null);
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2871b extends FlutterJNI.InterfaceC2818a {
        /* renamed from: a */
        void mo96a(String str);

        /* renamed from: c */
        void mo94c(String str);

        /* renamed from: d */
        void mo93d(int i);

        /* renamed from: f */
        void mo91f(int i);
    }

    public C2869b(C2832a c2832a, FlutterJNI flutterJNI) {
        C1500a<Object> c1500a = new C1500a<>(c2832a, "flutter/accessibility", C1529q.f4558a);
        this.f7103a = c1500a;
        c1500a.m4043e(this.f7106d);
        this.f7104b = flutterJNI;
    }

    /* renamed from: b */
    public void m484b(int i, C2974c.EnumC2980f enumC2980f) {
        this.f7104b.dispatchSemanticsAction(i, enumC2980f);
    }

    /* renamed from: c */
    public void m483c(int i, C2974c.EnumC2980f enumC2980f, Object obj) {
        this.f7104b.dispatchSemanticsAction(i, enumC2980f, obj);
    }

    /* renamed from: d */
    public void m482d() {
        this.f7104b.setSemanticsEnabled(false);
    }

    /* renamed from: e */
    public void m481e() {
        this.f7104b.setSemanticsEnabled(true);
    }

    /* renamed from: f */
    public void m480f(int i) {
        this.f7104b.setAccessibilityFeatures(i);
    }

    /* renamed from: g */
    public void m479g(InterfaceC2871b interfaceC2871b) {
        this.f7105c = interfaceC2871b;
        this.f7104b.setAccessibilityDelegate(interfaceC2871b);
    }
}
