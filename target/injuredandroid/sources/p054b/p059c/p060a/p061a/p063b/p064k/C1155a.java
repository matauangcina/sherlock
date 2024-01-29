package p054b.p059c.p060a.p061a.p063b.p064k;

import android.util.Log;
import com.google.android.gms.common.internal.C1663j;
import java.util.Locale;
/* renamed from: b.c.a.a.b.k.a */
/* loaded from: classes.dex */
public class C1155a {

    /* renamed from: a */
    private final String f3873a;

    /* renamed from: b */
    private final String f3874b;

    /* renamed from: c */
    private final int f3875c;

    private C1155a(String str, String str2) {
        this.f3874b = str2;
        this.f3873a = str;
        new C1663j(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f3873a, i)) {
            i++;
        }
        this.f3875c = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1155a(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r0 = r8.length
            if (r0 != 0) goto L6
            java.lang.String r8 = ""
            goto L36
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            int r1 = r8.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L28
            r3 = r8[r2]
            int r4 = r0.length()
            r5 = 1
            if (r4 <= r5) goto L22
            java.lang.String r4 = ","
            r0.append(r4)
        L22:
            r0.append(r3)
            int r2 = r2 + 1
            goto L12
        L28:
            r8 = 93
            r0.append(r8)
            r8 = 32
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L36:
            r6.<init>(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p054b.p059c.p060a.p061a.p063b.p064k.C1155a.<init>(java.lang.String, java.lang.String[]):void");
    }

    /* renamed from: c */
    private final String m4766c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f3874b.concat(str);
    }

    /* renamed from: a */
    public void m4768a(String str, Throwable th, Object... objArr) {
        Log.e(this.f3873a, m4766c(str, objArr), th);
    }

    /* renamed from: b */
    public void m4767b(String str, Object... objArr) {
        Log.e(this.f3873a, m4766c(str, objArr));
    }

    /* renamed from: d */
    public void m4765d(String str, Object... objArr) {
        Log.i(this.f3873a, m4766c(str, objArr));
    }

    /* renamed from: e */
    public boolean m4764e(int i) {
        return this.f3875c <= i;
    }

    /* renamed from: f */
    public void m4763f(String str, Object... objArr) {
        if (m4764e(2)) {
            Log.v(this.f3873a, m4766c(str, objArr));
        }
    }

    /* renamed from: g */
    public void m4762g(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f3873a, m4766c(str, objArr), th);
    }

    /* renamed from: h */
    public void m4761h(Throwable th) {
        Log.wtf(this.f3873a, th);
    }
}
