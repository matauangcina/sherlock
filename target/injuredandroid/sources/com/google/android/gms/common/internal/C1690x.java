package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.x */
/* loaded from: classes.dex */
public final class C1690x extends AbstractDialogInterface$OnClickListenerC1654f {

    /* renamed from: f */
    private final /* synthetic */ Intent f4859f;

    /* renamed from: g */
    private final /* synthetic */ Activity f4860g;

    /* renamed from: h */
    private final /* synthetic */ int f4861h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1690x(Intent intent, Activity activity, int i) {
        this.f4859f = intent;
        this.f4860g = activity;
        this.f4861h = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC1654f
    /* renamed from: b */
    public final void mo3573b() {
        Intent intent = this.f4859f;
        if (intent != null) {
            this.f4860g.startActivityForResult(intent, this.f4861h);
        }
    }
}
