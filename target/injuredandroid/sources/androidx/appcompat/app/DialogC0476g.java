package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p001a.C0000a;
import p000a.p001a.p007n.AbstractC0030b;
import p000a.p019g.p028k.C0237e;
/* renamed from: androidx.appcompat.app.g */
/* loaded from: classes.dex */
public class DialogC0476g extends Dialog implements InterfaceC0454d {

    /* renamed from: f */
    private AbstractC0455e f1392f;

    /* renamed from: g */
    private final C0237e.InterfaceC0238a f1393g;

    /* renamed from: androidx.appcompat.app.g$a */
    /* loaded from: classes.dex */
    class C0477a implements C0237e.InterfaceC0238a {
        C0477a() {
        }

        @Override // p000a.p019g.p028k.C0237e.InterfaceC0238a
        /* renamed from: b */
        public boolean mo6979b(KeyEvent keyEvent) {
            return DialogC0476g.this.m7961e(keyEvent);
        }
    }

    public DialogC0476g(Context context, int i) {
        super(context, m7964b(context, i));
        this.f1393g = new C0477a();
        AbstractC0455e m7965a = m7965a();
        m7965a.mo8050G(m7964b(context, i));
        m7965a.mo7996s(null);
    }

    /* renamed from: b */
    private static int m7964b(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C0000a.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    /* renamed from: a */
    public AbstractC0455e m7965a() {
        if (this.f1392f == null) {
            this.f1392f = AbstractC0455e.m8066h(this, this);
        }
        return this.f1392f;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m7965a().mo8022c(view, layoutParams);
    }

    @Override // androidx.appcompat.app.InterfaceC0454d
    /* renamed from: c */
    public void mo7963c(AbstractC0030b abstractC0030b) {
    }

    @Override // androidx.appcompat.app.InterfaceC0454d
    /* renamed from: d */
    public void mo7962d(AbstractC0030b abstractC0030b) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0237e.m8701e(this.f1393g, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: e */
    boolean m7961e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    public boolean m7960f(int i) {
        return m7965a().mo8061A(i);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m7965a().mo8013i(i);
    }

    @Override // androidx.appcompat.app.InterfaceC0454d
    /* renamed from: g */
    public AbstractC0030b mo7959g(AbstractC0030b.InterfaceC0031a interfaceC0031a) {
        return null;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m7965a().mo8002o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m7965a().mo8004n();
        super.onCreate(bundle);
        m7965a().mo7996s(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m7965a().mo7984y();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m7965a().mo8059B(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m7965a().mo8057C(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m7965a().mo8055D(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m7965a().mo8048H(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m7965a().mo8048H(charSequence);
    }
}
