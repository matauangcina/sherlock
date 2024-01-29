package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0578b1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0704a;
import androidx.core.app.C0715f;
import androidx.core.app.C0730n;
import androidx.fragment.app.ActivityC0797d;
import p000a.p001a.p007n.AbstractC0030b;
/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes.dex */
public class ActivityC0453c extends ActivityC0797d implements InterfaceC0454d, C0730n.InterfaceC0731a {

    /* renamed from: u */
    private AbstractC0455e f1292u;

    /* renamed from: v */
    private Resources f1293v;

    /* renamed from: B */
    private boolean m8079B(int i, KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    /* renamed from: A */
    public boolean m8080A() {
        Intent mo6886e = mo6886e();
        if (mo6886e != null) {
            if (!m8076E(mo6886e)) {
                m8077D(mo6886e);
                return true;
            }
            C0730n m6889i = C0730n.m6889i(this);
            m8073w(m6889i);
            m8071y(m6889i);
            m6889i.m6888l();
            try {
                C0704a.m6995j(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public void m8078C(Toolbar toolbar) {
        m8075u().mo8052F(toolbar);
    }

    /* renamed from: D */
    public void m8077D(Intent intent) {
        C0715f.m6974e(this, intent);
    }

    /* renamed from: E */
    public boolean m8076E(Intent intent) {
        return C0715f.m6973f(this, intent);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m8075u().mo8022c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        m8075u().mo8017f(context);
    }

    @Override // androidx.appcompat.app.InterfaceC0454d
    /* renamed from: c */
    public void mo7963c(AbstractC0030b abstractC0030b) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0447a m8074v = m8074v();
        if (getWindow().hasFeature(0)) {
            if (m8074v == null || !m8074v.mo7953g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.appcompat.app.InterfaceC0454d
    /* renamed from: d */
    public void mo7962d(AbstractC0030b abstractC0030b) {
    }

    @Override // androidx.core.app.ActivityC0714e, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0447a m8074v = m8074v();
        if (keyCode == 82 && m8074v != null && m8074v.mo7950p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.core.app.C0730n.InterfaceC0731a
    /* renamed from: e */
    public Intent mo6886e() {
        return C0715f.m6978a(this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m8075u().mo8013i(i);
    }

    @Override // androidx.appcompat.app.InterfaceC0454d
    /* renamed from: g */
    public AbstractC0030b mo7959g(AbstractC0030b.InterfaceC0031a interfaceC0031a) {
        return null;
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m8075u().mo8008l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f1293v == null && C0578b1.m7529b()) {
            this.f1293v = new C0578b1(this, super.getResources());
        }
        Resources resources = this.f1293v;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m8075u().mo8002o();
    }

    @Override // androidx.fragment.app.ActivityC0797d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1293v != null) {
            this.f1293v.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        m8075u().mo7998r(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m8070z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        AbstractC0455e m8075u = m8075u();
        m8075u.mo8004n();
        m8075u.mo7996s(bundle);
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0797d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m8075u().mo7994t();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m8079B(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0797d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0447a m8074v = m8074v();
        if (menuItem.getItemId() != 16908332 || m8074v == null || (m8074v.mo7922j() & 4) == 0) {
            return false;
        }
        return m8080A();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.ActivityC0797d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m8075u().mo7992u(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0797d, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m8075u().mo7990v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m8075u().mo7988w(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0797d, android.app.Activity
    public void onStart() {
        super.onStart();
        m8075u().mo7986x();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0797d, android.app.Activity
    public void onStop() {
        super.onStop();
        m8075u().mo7984y();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m8075u().mo8048H(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0447a m8074v = m8074v();
        if (getWindow().hasFeature(0)) {
            if (m8074v == null || !m8074v.mo7949q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m8075u().mo8059B(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m8075u().mo8057C(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m8075u().mo8055D(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        m8075u().mo8050G(i);
    }

    @Override // androidx.fragment.app.ActivityC0797d
    /* renamed from: t */
    public void mo6485t() {
        m8075u().mo8002o();
    }

    /* renamed from: u */
    public AbstractC0455e m8075u() {
        if (this.f1292u == null) {
            this.f1292u = AbstractC0455e.m8067g(this, this);
        }
        return this.f1292u;
    }

    /* renamed from: v */
    public AbstractC0447a m8074v() {
        return m8075u().mo8006m();
    }

    /* renamed from: w */
    public void m8073w(C0730n c0730n) {
        c0730n.m6891f(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public void m8072x(int i) {
    }

    /* renamed from: y */
    public void m8071y(C0730n c0730n) {
    }

    @Deprecated
    /* renamed from: z */
    public void m8070z() {
    }
}
