package com.google.firebase.database.p130q;

import com.google.firebase.database.p130q.InterfaceC2567d;
import java.io.PrintWriter;
import java.io.StringWriter;
/* renamed from: com.google.firebase.database.q.c */
/* loaded from: classes.dex */
public class C2566c {

    /* renamed from: a */
    private final InterfaceC2567d f6691a;

    /* renamed from: b */
    private final String f6692b;

    /* renamed from: c */
    private final String f6693c;

    public C2566c(InterfaceC2567d interfaceC2567d, String str) {
        this(interfaceC2567d, str, null);
    }

    public C2566c(InterfaceC2567d interfaceC2567d, String str, String str2) {
        this.f6691a = interfaceC2567d;
        this.f6692b = str;
        this.f6693c = str2;
    }

    /* renamed from: d */
    private static String m1176d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: g */
    private long m1173g() {
        return System.currentTimeMillis();
    }

    /* renamed from: h */
    private String m1172h(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.f6693c == null) {
            return str;
        }
        return this.f6693c + " - " + str;
    }

    /* renamed from: a */
    public void m1179a(String str, Throwable th, Object... objArr) {
        if (m1174f()) {
            String m1172h = m1172h(str, objArr);
            if (th != null) {
                m1172h = m1172h + "\n" + m1176d(th);
            }
            this.f6691a.mo1169a(InterfaceC2567d.EnumC2568a.DEBUG, this.f6692b, m1172h, m1173g());
        }
    }

    /* renamed from: b */
    public void m1178b(String str, Object... objArr) {
        m1179a(str, null, objArr);
    }

    /* renamed from: c */
    public void m1177c(String str, Throwable th) {
        this.f6691a.mo1169a(InterfaceC2567d.EnumC2568a.ERROR, this.f6692b, m1172h(str, new Object[0]) + "\n" + m1176d(th), m1173g());
    }

    /* renamed from: e */
    public void m1175e(String str) {
        this.f6691a.mo1169a(InterfaceC2567d.EnumC2568a.INFO, this.f6692b, m1172h(str, new Object[0]), m1173g());
    }

    /* renamed from: f */
    public boolean m1174f() {
        return this.f6691a.mo1168b().ordinal() <= InterfaceC2567d.EnumC2568a.DEBUG.ordinal();
    }

    /* renamed from: i */
    public void m1171i(String str) {
        m1170j(str, null);
    }

    /* renamed from: j */
    public void m1170j(String str, Throwable th) {
        String m1172h = m1172h(str, new Object[0]);
        if (th != null) {
            m1172h = m1172h + "\n" + m1176d(th);
        }
        this.f6691a.mo1169a(InterfaceC2567d.EnumC2568a.WARN, this.f6692b, m1172h, m1173g());
    }
}
