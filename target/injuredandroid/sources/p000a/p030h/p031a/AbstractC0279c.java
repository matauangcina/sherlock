package p000a.p030h.p031a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: a.h.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC0279c extends AbstractC0274a {

    /* renamed from: n */
    private int f768n;

    /* renamed from: o */
    private int f769o;

    /* renamed from: p */
    private LayoutInflater f770p;

    @Deprecated
    public AbstractC0279c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f769o = i;
        this.f768n = i;
        this.f770p = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p000a.p030h.p031a.AbstractC0274a
    /* renamed from: g */
    public View mo8523g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f770p.inflate(this.f769o, viewGroup, false);
    }

    @Override // p000a.p030h.p031a.AbstractC0274a
    /* renamed from: h */
    public View mo7290h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f770p.inflate(this.f768n, viewGroup, false);
    }
}
