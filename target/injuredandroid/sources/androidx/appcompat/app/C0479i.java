package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AbstractC0447a;
import androidx.appcompat.view.menu.C0507g;
import androidx.appcompat.view.menu.InterfaceC0522m;
import androidx.appcompat.widget.C0667x0;
import androidx.appcompat.widget.InterfaceC0590d0;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p000a.p001a.p007n.Window$CallbackC0042i;
import p000a.p019g.p028k.C0252s;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.i */
/* loaded from: classes.dex */
public class C0479i extends AbstractC0447a {

    /* renamed from: a */
    InterfaceC0590d0 f1403a;

    /* renamed from: b */
    boolean f1404b;

    /* renamed from: c */
    Window.Callback f1405c;

    /* renamed from: d */
    private boolean f1406d;

    /* renamed from: e */
    private boolean f1407e;

    /* renamed from: f */
    private ArrayList<AbstractC0447a.InterfaceC0449b> f1408f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f1409g = new RunnableC0480a();

    /* renamed from: h */
    private final Toolbar.InterfaceC0568f f1410h = new C0481b();

    /* renamed from: androidx.appcompat.app.i$a */
    /* loaded from: classes.dex */
    class RunnableC0480a implements Runnable {
        RunnableC0480a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0479i.this.m7946x();
        }
    }

    /* renamed from: androidx.appcompat.app.i$b */
    /* loaded from: classes.dex */
    class C0481b implements Toolbar.InterfaceC0568f {
        C0481b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0568f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0479i.this.f1405c.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.i$c */
    /* loaded from: classes.dex */
    public final class C0482c implements InterfaceC0522m.InterfaceC0523a {

        /* renamed from: f */
        private boolean f1413f;

        C0482c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m.InterfaceC0523a
        /* renamed from: b */
        public void mo7494b(C0507g c0507g, boolean z) {
            if (this.f1413f) {
                return;
            }
            this.f1413f = true;
            C0479i.this.f1403a.mo7190i();
            Window.Callback callback = C0479i.this.f1405c;
            if (callback != null) {
                callback.onPanelClosed(108, c0507g);
            }
            this.f1413f = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m.InterfaceC0523a
        /* renamed from: c */
        public boolean mo7493c(C0507g c0507g) {
            Window.Callback callback = C0479i.this.f1405c;
            if (callback != null) {
                callback.onMenuOpened(108, c0507g);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.i$d */
    /* loaded from: classes.dex */
    public final class C0483d implements C0507g.InterfaceC0508a {
        C0483d() {
        }

        @Override // androidx.appcompat.view.menu.C0507g.InterfaceC0508a
        /* renamed from: a */
        public boolean mo7687a(C0507g c0507g, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0507g.InterfaceC0508a
        /* renamed from: b */
        public void mo7686b(C0507g c0507g) {
            C0479i c0479i = C0479i.this;
            if (c0479i.f1405c != null) {
                if (c0479i.f1403a.mo7197b()) {
                    C0479i.this.f1405c.onPanelClosed(108, c0507g);
                } else if (C0479i.this.f1405c.onPreparePanel(0, null, c0507g)) {
                    C0479i.this.f1405c.onMenuOpened(108, c0507g);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.app.i$e */
    /* loaded from: classes.dex */
    private class C0484e extends Window$CallbackC0042i {
        public C0484e(Window.Callback callback) {
            super(callback);
        }

        @Override // p000a.p001a.p007n.Window$CallbackC0042i, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(C0479i.this.f1403a.mo7196c()) : super.onCreatePanelView(i);
        }

        @Override // p000a.p001a.p007n.Window$CallbackC0042i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0479i c0479i = C0479i.this;
                if (!c0479i.f1404b) {
                    c0479i.f1403a.mo7195d();
                    C0479i.this.f1404b = true;
                }
            }
            return onPreparePanel;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0479i(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f1403a = new C0667x0(toolbar, false);
        C0484e c0484e = new C0484e(callback);
        this.f1405c = c0484e;
        this.f1403a.setWindowCallback(c0484e);
        toolbar.setOnMenuItemClickListener(this.f1410h);
        this.f1403a.setWindowTitle(charSequence);
    }

    /* renamed from: v */
    private Menu m7948v() {
        if (!this.f1406d) {
            this.f1403a.mo7189j(new C0482c(), new C0483d());
            this.f1406d = true;
        }
        return this.f1403a.mo7181r();
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: g */
    public boolean mo7953g() {
        return this.f1403a.mo7193f();
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: h */
    public boolean mo7924h() {
        if (this.f1403a.mo7184o()) {
            this.f1403a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: i */
    public void mo7923i(boolean z) {
        if (z == this.f1407e) {
            return;
        }
        this.f1407e = z;
        int size = this.f1408f.size();
        for (int i = 0; i < size; i++) {
            this.f1408f.get(i).m8096a(z);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: j */
    public int mo7922j() {
        return this.f1403a.mo7182q();
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: k */
    public Context mo7921k() {
        return this.f1403a.mo7196c();
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: l */
    public boolean mo7952l() {
        this.f1403a.mo7186m().removeCallbacks(this.f1409g);
        C0252s.m8638Y(this.f1403a.mo7186m(), this.f1409g);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: m */
    public void mo7920m(Configuration configuration) {
        super.mo7920m(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: n */
    public void mo7951n() {
        this.f1403a.mo7186m().removeCallbacks(this.f1409g);
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: o */
    public boolean mo7919o(int i, KeyEvent keyEvent) {
        Menu m7948v = m7948v();
        if (m7948v != null) {
            m7948v.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return m7948v.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: p */
    public boolean mo7950p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo7949q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: q */
    public boolean mo7949q() {
        return this.f1403a.mo7192g();
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: r */
    public void mo7918r(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: s */
    public void mo7917s(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: t */
    public void mo7916t(CharSequence charSequence) {
        this.f1403a.setWindowTitle(charSequence);
    }

    /* renamed from: w */
    public Window.Callback m7947w() {
        return this.f1405c;
    }

    /* renamed from: x */
    void m7946x() {
        Menu m7948v = m7948v();
        C0507g c0507g = m7948v instanceof C0507g ? (C0507g) m7948v : null;
        if (c0507g != null) {
            c0507g.m7827d0();
        }
        try {
            m7948v.clear();
            if (!this.f1405c.onCreatePanelMenu(0, m7948v) || !this.f1405c.onPreparePanel(0, null, m7948v)) {
                m7948v.clear();
            }
        } finally {
            if (c0507g != null) {
                c0507g.m7829c0();
            }
        }
    }
}
