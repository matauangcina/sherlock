package com.google.firebase.database.p130q;

import com.google.firebase.database.p130q.InterfaceC2567d;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: com.google.firebase.database.q.b */
/* loaded from: classes.dex */
public class C2564b implements InterfaceC2567d {

    /* renamed from: a */
    private final Set<String> f6688a;

    /* renamed from: b */
    private final InterfaceC2567d.EnumC2568a f6689b;

    /* renamed from: com.google.firebase.database.q.b$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C2565a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6690a;

        static {
            int[] iArr = new int[InterfaceC2567d.EnumC2568a.values().length];
            f6690a = iArr;
            try {
                iArr[InterfaceC2567d.EnumC2568a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6690a[InterfaceC2567d.EnumC2568a.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6690a[InterfaceC2567d.EnumC2568a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6690a[InterfaceC2567d.EnumC2568a.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C2564b(InterfaceC2567d.EnumC2568a enumC2568a, List<String> list) {
        if (list != null) {
            this.f6688a = new HashSet(list);
        } else {
            this.f6688a = null;
        }
        this.f6689b = enumC2568a;
    }

    @Override // com.google.firebase.database.p130q.InterfaceC2567d
    /* renamed from: a */
    public void mo1169a(InterfaceC2567d.EnumC2568a enumC2568a, String str, String str2, long j) {
        if (m1181g(enumC2568a, str)) {
            String mo1185c = mo1185c(enumC2568a, str, str2, j);
            int i = C2565a.f6690a[enumC2568a.ordinal()];
            if (i == 1) {
                mo1183e(str, mo1185c);
            } else if (i == 2) {
                mo1180h(str, mo1185c);
            } else if (i == 3) {
                mo1182f(str, mo1185c);
            } else if (i != 4) {
                throw new RuntimeException("Should not reach here!");
            } else {
                mo1184d(str, mo1185c);
            }
        }
    }

    @Override // com.google.firebase.database.p130q.InterfaceC2567d
    /* renamed from: b */
    public InterfaceC2567d.EnumC2568a mo1168b() {
        return this.f6689b;
    }

    /* renamed from: c */
    protected abstract String mo1185c(InterfaceC2567d.EnumC2568a enumC2568a, String str, String str2, long j);

    /* renamed from: d */
    protected abstract void mo1184d(String str, String str2);

    /* renamed from: e */
    protected abstract void mo1183e(String str, String str2);

    /* renamed from: f */
    protected abstract void mo1182f(String str, String str2);

    /* renamed from: g */
    protected boolean m1181g(InterfaceC2567d.EnumC2568a enumC2568a, String str) {
        return enumC2568a.ordinal() >= this.f6689b.ordinal() && (this.f6688a == null || enumC2568a.ordinal() > InterfaceC2567d.EnumC2568a.DEBUG.ordinal() || this.f6688a.contains(str));
    }

    /* renamed from: h */
    protected abstract void mo1180h(String str, String str2);
}
