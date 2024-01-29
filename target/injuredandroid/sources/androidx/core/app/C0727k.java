package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
/* renamed from: androidx.core.app.k */
/* loaded from: classes.dex */
public class C0727k {

    /* renamed from: a */
    CharSequence f2634a;

    /* renamed from: b */
    IconCompat f2635b;

    /* renamed from: c */
    String f2636c;

    /* renamed from: d */
    String f2637d;

    /* renamed from: e */
    boolean f2638e;

    /* renamed from: f */
    boolean f2639f;

    /* renamed from: a */
    public IconCompat m6913a() {
        return this.f2635b;
    }

    /* renamed from: b */
    public String m6912b() {
        return this.f2637d;
    }

    /* renamed from: c */
    public CharSequence m6911c() {
        return this.f2634a;
    }

    /* renamed from: d */
    public String m6910d() {
        return this.f2636c;
    }

    /* renamed from: e */
    public boolean m6909e() {
        return this.f2638e;
    }

    /* renamed from: f */
    public boolean m6908f() {
        return this.f2639f;
    }

    /* renamed from: g */
    public String m6907g() {
        String str = this.f2636c;
        if (str != null) {
            return str;
        }
        if (this.f2634a != null) {
            return "name:" + ((Object) this.f2634a);
        }
        return "";
    }

    /* renamed from: h */
    public Person m6906h() {
        return new Person.Builder().setName(m6911c()).setIcon(m6913a() != null ? m6913a().m6764n() : null).setUri(m6910d()).setKey(m6912b()).setBot(m6909e()).setImportant(m6908f()).build();
    }
}
