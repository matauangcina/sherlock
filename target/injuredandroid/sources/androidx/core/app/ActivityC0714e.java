package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.C0876k;
import androidx.lifecycle.FragmentC0885r;
import androidx.lifecycle.InterfaceC0875j;
import p000a.p014d.C0079g;
import p000a.p019g.p028k.C0237e;
/* renamed from: androidx.core.app.e */
/* loaded from: classes.dex */
public class ActivityC0714e extends Activity implements InterfaceC0875j, C0237e.InterfaceC0238a {

    /* renamed from: f */
    private C0876k f2558f;

    public ActivityC0714e() {
        new C0079g();
        this.f2558f = new C0876k(this);
    }

    @Override // p000a.p019g.p028k.C0237e.InterfaceC0238a
    /* renamed from: b */
    public boolean mo6979b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0237e.m8702d(decorView, keyEvent)) {
            return C0237e.m8701e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0237e.m8702d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0885r.m6091f(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f2558f.m6114k(AbstractC0868e.EnumC0870b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
