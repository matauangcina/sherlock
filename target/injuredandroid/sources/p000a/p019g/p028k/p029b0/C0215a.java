package p000a.p019g.p028k.p029b0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* renamed from: a.g.k.b0.a */
/* loaded from: classes.dex */
public final class C0215a extends ClickableSpan {

    /* renamed from: f */
    private final int f685f;

    /* renamed from: g */
    private final C0217c f686g;

    /* renamed from: h */
    private final int f687h;

    public C0215a(int i, C0217c c0217c, int i2) {
        this.f685f = i;
        this.f686g = c0217c;
        this.f687h = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f685f);
        this.f686g.m8786N(this.f687h, bundle);
    }
}
