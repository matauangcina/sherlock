package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0451b;
import androidx.appcompat.view.menu.InterfaceC0522m;
import p000a.p001a.C0006g;
/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
class DialogInterface$OnKeyListenerC0510h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0522m.InterfaceC0523a {

    /* renamed from: f */
    private C0507g f1611f;

    /* renamed from: g */
    private DialogInterfaceC0451b f1612g;

    /* renamed from: h */
    C0504e f1613h;

    /* renamed from: i */
    private InterfaceC0522m.InterfaceC0523a f1614i;

    public DialogInterface$OnKeyListenerC0510h(C0507g c0507g) {
        this.f1611f = c0507g;
    }

    /* renamed from: a */
    public void m7808a() {
        DialogInterfaceC0451b dialogInterfaceC0451b = this.f1612g;
        if (dialogInterfaceC0451b != null) {
            dialogInterfaceC0451b.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m.InterfaceC0523a
    /* renamed from: b */
    public void mo7494b(C0507g c0507g, boolean z) {
        if (z || c0507g == this.f1611f) {
            m7808a();
        }
        InterfaceC0522m.InterfaceC0523a interfaceC0523a = this.f1614i;
        if (interfaceC0523a != null) {
            interfaceC0523a.mo7494b(c0507g, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m.InterfaceC0523a
    /* renamed from: c */
    public boolean mo7493c(C0507g c0507g) {
        InterfaceC0522m.InterfaceC0523a interfaceC0523a = this.f1614i;
        if (interfaceC0523a != null) {
            return interfaceC0523a.mo7493c(c0507g);
        }
        return false;
    }

    /* renamed from: d */
    public void m7807d(IBinder iBinder) {
        C0507g c0507g = this.f1611f;
        DialogInterfaceC0451b.C0452a c0452a = new DialogInterfaceC0451b.C0452a(c0507g.m7814u());
        C0504e c0504e = new C0504e(c0452a.m8087b(), C0006g.abc_list_menu_item_layout);
        this.f1613h = c0504e;
        c0504e.mo7580k(this);
        this.f1611f.m7832b(this.f1613h);
        c0452a.m8086c(this.f1613h.m7863a(), this);
        View m7810y = c0507g.m7810y();
        if (m7810y != null) {
            c0452a.m8085d(m7810y);
        } else {
            c0452a.m8084e(c0507g.m7812w());
            c0452a.m8081h(c0507g.m7811x());
        }
        c0452a.m8083f(this);
        DialogInterfaceC0451b m8088a = c0452a.m8088a();
        this.f1612g = m8088a;
        m8088a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1612g.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1612g.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1611f.m7848L((C0511i) this.f1613h.m7863a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1613h.mo7517b(this.f1611f, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1612g.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1612g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1611f.m7826e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1611f.performShortcut(i, keyEvent, 0);
    }
}
