package p054b.p059c.p060a.p061a.p063b;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1679r;
/* renamed from: b.c.a.a.b.b */
/* loaded from: classes.dex */
public class DialogFragmentC1145b extends DialogFragment {

    /* renamed from: f */
    private Dialog f3855f = null;

    /* renamed from: g */
    private DialogInterface.OnCancelListener f3856g = null;

    /* renamed from: a */
    public static DialogFragmentC1145b m4805a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC1145b dialogFragmentC1145b = new DialogFragmentC1145b();
        C1679r.m3630i(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC1145b.f3855f = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC1145b.f3856g = onCancelListener;
        }
        return dialogFragmentC1145b;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3856g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f3855f == null) {
            setShowsDialog(false);
        }
        return this.f3855f;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
