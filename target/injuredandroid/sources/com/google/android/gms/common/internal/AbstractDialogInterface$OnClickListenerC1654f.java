package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
/* renamed from: com.google.android.gms.common.internal.f */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterface$OnClickListenerC1654f implements DialogInterface.OnClickListener {
    /* renamed from: a */
    public static AbstractDialogInterface$OnClickListenerC1654f m3700a(Activity activity, Intent intent, int i) {
        return new C1690x(intent, activity, i);
    }

    /* renamed from: b */
    protected abstract void mo3573b();

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo3573b();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
