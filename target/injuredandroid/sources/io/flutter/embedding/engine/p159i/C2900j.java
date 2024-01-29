package io.flutter.embedding.engine.p159i;

import io.flutter.embedding.engine.p149e.C2832a;
import java.util.HashMap;
import java.util.Map;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.C1515h;
import p108c.p109a.p110c.p111a.C1516i;
import p108c.p109a.p110c.p111a.C1531r;
/* renamed from: io.flutter.embedding.engine.i.j */
/* loaded from: classes.dex */
public class C2900j {

    /* renamed from: a */
    public final boolean f7190a;

    /* renamed from: b */
    private byte[] f7191b;

    /* renamed from: c */
    private C1516i f7192c;

    /* renamed from: d */
    private C1516i.InterfaceC1521d f7193d;

    /* renamed from: e */
    private boolean f7194e;

    /* renamed from: f */
    private boolean f7195f;

    /* renamed from: g */
    private final C1516i.InterfaceC1520c f7196g;

    /* renamed from: io.flutter.embedding.engine.i.j$a */
    /* loaded from: classes.dex */
    class C2901a implements C1516i.InterfaceC1521d {

        /* renamed from: a */
        final /* synthetic */ byte[] f7197a;

        C2901a(byte[] bArr) {
            this.f7197a = bArr;
        }

        @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1521d
        /* renamed from: a */
        public void mo421a() {
        }

        @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1521d
        /* renamed from: b */
        public void mo420b(String str, String str2, Object obj) {
            C1499b.m4052b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1521d
        /* renamed from: c */
        public void mo419c(Object obj) {
            C2900j.this.f7191b = this.f7197a;
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.j$b */
    /* loaded from: classes.dex */
    class C2902b implements C1516i.InterfaceC1520c {
        C2902b() {
        }

        @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1520c
        /* renamed from: b */
        public void mo160b(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
            char c;
            Map map;
            String str = c1515h.f4547a;
            Object obj = c1515h.f4548b;
            int hashCode = str.hashCode();
            if (hashCode != 102230) {
                if (hashCode == 111375 && str.equals("put")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (str.equals("get")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                C2900j.this.f7191b = (byte[]) obj;
                map = null;
            } else if (c != 1) {
                interfaceC1521d.mo421a();
                return;
            } else {
                C2900j.this.f7195f = true;
                if (!C2900j.this.f7194e) {
                    C2900j c2900j = C2900j.this;
                    if (c2900j.f7190a) {
                        c2900j.f7193d = interfaceC1521d;
                        return;
                    }
                }
                C2900j c2900j2 = C2900j.this;
                map = c2900j2.m423i(c2900j2.f7191b);
            }
            interfaceC1521d.mo419c(map);
        }
    }

    C2900j(C1516i c1516i, boolean z) {
        this.f7194e = false;
        this.f7195f = false;
        C2902b c2902b = new C2902b();
        this.f7196g = c2902b;
        this.f7192c = c1516i;
        this.f7190a = z;
        c1516i.m4034e(c2902b);
    }

    public C2900j(C2832a c2832a, boolean z) {
        this(new C1516i(c2832a, "flutter/restoration", C1531r.f4561b), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public Map<String, Object> m423i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    /* renamed from: g */
    public void m425g() {
        this.f7191b = null;
    }

    /* renamed from: h */
    public byte[] m424h() {
        return this.f7191b;
    }

    /* renamed from: j */
    public void m422j(byte[] bArr) {
        this.f7194e = true;
        C1516i.InterfaceC1521d interfaceC1521d = this.f7193d;
        if (interfaceC1521d != null) {
            interfaceC1521d.mo419c(m423i(bArr));
            this.f7193d = null;
        } else if (this.f7195f) {
            this.f7192c.m4035d("push", m423i(bArr), new C2901a(bArr));
            return;
        }
        this.f7191b = bArr;
    }
}
