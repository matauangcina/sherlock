package com.insecureshop;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.text.StringsKt;
/* compiled from: CustomReceiver.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, m19d2 = {"Lcom/insecureshop/CustomReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class CustomReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        String stringExtra = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("web_url");
        String str = stringExtra;
        if (!(str == null || StringsKt.isBlank(str))) {
            Intent intent2 = new Intent(context, WebView2Activity.class);
            intent2.putExtra("url", stringExtra);
            if (context != null) {
                context.startActivity(intent2);
            }
        }
    }
}
