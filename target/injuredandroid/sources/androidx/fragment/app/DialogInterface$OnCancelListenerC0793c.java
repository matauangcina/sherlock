package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public class DialogInterface$OnCancelListenerC0793c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: b0 */
    private Handler f2863b0;

    /* renamed from: c0 */
    private Runnable f2864c0 = new RunnableC0794a();

    /* renamed from: d0 */
    private DialogInterface.OnCancelListener f2865d0 = new DialogInterface$OnCancelListenerC0795b();

    /* renamed from: e0 */
    private DialogInterface.OnDismissListener f2866e0 = new DialogInterface$OnDismissListenerC0796c();

    /* renamed from: f0 */
    private int f2867f0 = 0;

    /* renamed from: g0 */
    private int f2868g0 = 0;

    /* renamed from: h0 */
    private boolean f2869h0 = true;

    /* renamed from: i0 */
    private boolean f2870i0 = true;

    /* renamed from: j0 */
    private int f2871j0 = -1;

    /* renamed from: k0 */
    private boolean f2872k0;

    /* renamed from: l0 */
    private Dialog f2873l0;

    /* renamed from: m0 */
    private boolean f2874m0;

    /* renamed from: n0 */
    private boolean f2875n0;

    /* renamed from: o0 */
    private boolean f2876o0;

    /* renamed from: androidx.fragment.app.c$a */
    /* loaded from: classes.dex */
    class RunnableC0794a implements Runnable {
        RunnableC0794a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterface$OnCancelListenerC0793c.this.f2866e0.onDismiss(DialogInterface$OnCancelListenerC0793c.this.f2873l0);
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    /* loaded from: classes.dex */
    class DialogInterface$OnCancelListenerC0795b implements DialogInterface.OnCancelListener {
        DialogInterface$OnCancelListenerC0795b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterface$OnCancelListenerC0793c.this.f2873l0 != null) {
                DialogInterface$OnCancelListenerC0793c dialogInterface$OnCancelListenerC0793c = DialogInterface$OnCancelListenerC0793c.this;
                dialogInterface$OnCancelListenerC0793c.onCancel(dialogInterface$OnCancelListenerC0793c.f2873l0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    /* loaded from: classes.dex */
    class DialogInterface$OnDismissListenerC0796c implements DialogInterface.OnDismissListener {
        DialogInterface$OnDismissListenerC0796c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterface$OnCancelListenerC0793c.this.f2873l0 != null) {
                DialogInterface$OnCancelListenerC0793c dialogInterface$OnCancelListenerC0793c = DialogInterface$OnCancelListenerC0793c.this;
                dialogInterface$OnCancelListenerC0793c.onDismiss(dialogInterface$OnCancelListenerC0793c.f2873l0);
            }
        }
    }

    /* renamed from: t1 */
    private void m6499t1(boolean z, boolean z2) {
        if (this.f2875n0) {
            return;
        }
        this.f2875n0 = true;
        this.f2876o0 = false;
        Dialog dialog = this.f2873l0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2873l0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f2863b0.getLooper()) {
                    onDismiss(this.f2873l0);
                } else {
                    this.f2863b0.post(this.f2864c0);
                }
            }
        }
        this.f2874m0 = true;
        if (this.f2871j0 >= 0) {
            m6617C().m6417D0(this.f2871j0, 1);
            this.f2871j0 = -1;
            return;
        }
        AbstractC0835t m6357i = m6617C().m6357i();
        m6357i.mo6234n(this);
        if (z) {
            m6357i.mo6239i();
        } else {
            m6357i.mo6240h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: A0 */
    public void mo3010A0(Bundle bundle) {
        super.mo3010A0(bundle);
        Dialog dialog = this.f2873l0;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i = this.f2867f0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f2868g0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f2869h0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f2870i0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f2871j0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: A1 */
    public void mo4770A1(AbstractC0814m abstractC0814m, String str) {
        this.f2875n0 = false;
        this.f2876o0 = true;
        AbstractC0835t m6357i = abstractC0814m.m6357i();
        m6357i.m6244d(this, str);
        m6357i.mo6240h();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: B0 */
    public void mo3034B0() {
        super.mo3034B0();
        Dialog dialog = this.f2873l0;
        if (dialog != null) {
            this.f2874m0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: C0 */
    public void mo3032C0() {
        super.mo3032C0();
        Dialog dialog = this.f2873l0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Y */
    public void mo6505Y(Bundle bundle) {
        Bundle bundle2;
        super.mo6505Y(bundle);
        if (this.f2870i0) {
            View m6597N = m6597N();
            if (this.f2873l0 != null) {
                if (m6597N != null) {
                    if (m6597N.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    this.f2873l0.setContentView(m6597N);
                }
                ActivityC0797d m6555k = m6555k();
                if (m6555k != null) {
                    this.f2873l0.setOwnerActivity(m6555k);
                }
                this.f2873l0.setCancelable(this.f2869h0);
                this.f2873l0.setOnCancelListener(this.f2865d0);
                this.f2873l0.setOnDismissListener(this.f2866e0);
                if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                    return;
                }
                this.f2873l0.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: b0 */
    public void mo6000b0(Context context) {
        super.mo6000b0(context);
        if (this.f2876o0) {
            return;
        }
        this.f2875n0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e0 */
    public void mo3009e0(Bundle bundle) {
        super.mo3009e0(bundle);
        this.f2863b0 = new Handler();
        this.f2870i0 = this.f2779B == 0;
        if (bundle != null) {
            this.f2867f0 = bundle.getInt("android:style", 0);
            this.f2868g0 = bundle.getInt("android:theme", 0);
            this.f2869h0 = bundle.getBoolean("android:cancelable", true);
            this.f2870i0 = bundle.getBoolean("android:showsDialog", this.f2870i0);
            this.f2871j0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: l0 */
    public void mo5998l0() {
        super.mo5998l0();
        Dialog dialog = this.f2873l0;
        if (dialog != null) {
            this.f2874m0 = true;
            dialog.setOnDismissListener(null);
            this.f2873l0.dismiss();
            if (!this.f2875n0) {
                onDismiss(this.f2873l0);
            }
            this.f2873l0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: m0 */
    public void mo6504m0() {
        super.mo6504m0();
        if (this.f2876o0 || this.f2875n0) {
            return;
        }
        this.f2875n0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: n0 */
    public LayoutInflater mo6503n0(Bundle bundle) {
        LayoutInflater mo6503n0 = super.mo6503n0(bundle);
        if (!this.f2870i0 || this.f2872k0) {
            return mo6503n0;
        }
        try {
            this.f2872k0 = true;
            Dialog mo3012w1 = mo3012w1(bundle);
            this.f2873l0 = mo3012w1;
            m6494z1(mo3012w1, this.f2867f0);
            this.f2872k0 = false;
            return mo6503n0.cloneInContext(m6496x1().getContext());
        } catch (Throwable th) {
            this.f2872k0 = false;
            throw th;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2874m0) {
            return;
        }
        m6499t1(true, true);
    }

    /* renamed from: s1 */
    public void m6500s1() {
        m6499t1(false, false);
    }

    /* renamed from: u1 */
    public Dialog m6498u1() {
        return this.f2873l0;
    }

    /* renamed from: v1 */
    public int m6497v1() {
        return this.f2868g0;
    }

    /* renamed from: w1 */
    public Dialog mo3012w1(Bundle bundle) {
        return new Dialog(m6567d1(), m6497v1());
    }

    /* renamed from: x1 */
    public final Dialog m6496x1() {
        Dialog m6498u1 = m6498u1();
        if (m6498u1 != null) {
            return m6498u1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: y1 */
    public void m6495y1(boolean z) {
        this.f2870i0 = z;
    }

    /* renamed from: z1 */
    public void m6494z1(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }
}
