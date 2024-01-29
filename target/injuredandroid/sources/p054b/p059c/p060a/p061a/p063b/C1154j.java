package p054b.p059c.p060a.p061a.p063b;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0814m;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0793c;
import com.google.android.gms.common.internal.C1679r;
/* renamed from: b.c.a.a.b.j */
/* loaded from: classes.dex */
public class C1154j extends DialogInterface$OnCancelListenerC0793c {

    /* renamed from: p0 */
    private Dialog f3871p0 = null;

    /* renamed from: q0 */
    private DialogInterface.OnCancelListener f3872q0 = null;

    /* renamed from: B1 */
    public static C1154j m4769B1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C1154j c1154j = new C1154j();
        C1679r.m3630i(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c1154j.f3871p0 = dialog2;
        if (onCancelListener != null) {
            c1154j.f3872q0 = onCancelListener;
        }
        return c1154j;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0793c
    /* renamed from: A1 */
    public void mo4770A1(AbstractC0814m abstractC0814m, String str) {
        super.mo4770A1(abstractC0814m, str);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0793c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3872q0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0793c
    /* renamed from: w1 */
    public Dialog mo3012w1(Bundle bundle) {
        if (this.f3871p0 == null) {
            m6495y1(false);
        }
        return this.f3871p0;
    }
}
