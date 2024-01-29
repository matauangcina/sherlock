package p054b.p055a.p056a;

import android.content.Intent;
/* renamed from: b.a.a.a */
/* loaded from: classes.dex */
public class C1077a extends C1107t {

    /* renamed from: f */
    private Intent f3716f;

    public C1077a(C1092k c1092k) {
        super(c1092k);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f3716f != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
