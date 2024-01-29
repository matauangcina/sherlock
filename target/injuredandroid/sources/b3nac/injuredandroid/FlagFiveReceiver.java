package b3nac.injuredandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import p135d.p142s.p144d.C2725g;
import p135d.p148w.C2766h;
/* loaded from: classes.dex */
public final class FlagFiveReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static int f4427a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        int i;
        String m809e;
        String m809e2;
        C2725g.m881e(context, "context");
        C2725g.m881e(intent, "intent");
        ApplicationC1493j.f4523j.m4062a(context);
        int i2 = f4427a;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            m809e = C2766h.m809e("\n    Action: " + intent.getAction() + "\n\n    ");
            sb.append(m809e);
            m809e2 = C2766h.m809e("\n    URI: " + intent.toUri(1) + "\n\n    ");
            sb.append(m809e2);
            str = sb.toString();
            C2725g.m882d(str, "sb.toString()");
            Log.d("DUDE!:", str);
        } else {
            str = "Keep trying!";
            if (i2 != 1) {
                if (i2 != 2) {
                    Toast.makeText(context, "Keep trying!", 1).show();
                    return;
                }
                new FlagsOverview().m4087H(true);
                new ApplicationC1493j().m4065b(context, "flagFiveButtonColor", true);
                Toast.makeText(context, "You are a winner " + C1495k.m4061a("Zkdlt0WwtLQ="), 1).show();
                i = 0;
                f4427a = i;
            }
        }
        Toast.makeText(context, str, 1).show();
        i = f4427a + 1;
        f4427a = i;
    }
}
