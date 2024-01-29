package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C1581e;
import p054b.p059c.p060a.p061a.p063b.C1144a;
import p054b.p059c.p060a.p061a.p063b.C1147d;
@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: f */
    private int f4594f = 0;

    /* renamed from: a */
    public static PendingIntent m3972a(Context context, PendingIntent pendingIntent, int i) {
        return PendingIntent.getActivity(context, 0, m3971b(context, pendingIntent, i, true), 134217728);
    }

    /* renamed from: b */
    public static Intent m3971b(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f4594f = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C1581e m3892f = C1581e.m3892f(this);
                if (i2 == -1) {
                    m3892f.m3878t();
                } else if (i2 == 0) {
                    m3892f.m3896b(new C1144a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f4594f = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f4594f = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4594f = bundle.getInt("resolution");
        }
        if (this.f4594f != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else if (pendingIntent == null) {
                    C1147d.m4800l().m4799m(this, num.intValue(), 2, this);
                    this.f4594f = 1;
                    return;
                } else {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.f4594f = 1;
                        return;
                    } catch (IntentSender.SendIntentException e) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    }
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f4594f);
        super.onSaveInstanceState(bundle);
    }
}
