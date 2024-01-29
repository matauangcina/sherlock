package b3nac.injuredandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.ActivityC0453c;
/* loaded from: classes.dex */
public class TestBroadcastReceiver extends ActivityC0453c {

    /* renamed from: b3nac.injuredandroid.TestBroadcastReceiver$b */
    /* loaded from: classes.dex */
    private class C1483b extends BroadcastReceiver {
        private C1483b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ((WebView) TestBroadcastReceiver.this.findViewById(R.id.Bob)).loadUrl(intent.getExtras().getString("url"));
        }
    }

    /* renamed from: F */
    public void m4071F() {
        Intent intent = new Intent(getApplicationContext(), FlagFiveReceiver.class);
        intent.setAction("com.b3nac.injuredandroid.intent.action.CUSTOM_INTENT");
        intent.putExtra("url", "Hi");
        sendBroadcast(intent);
    }

    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerReceiver(new C1483b(), new IntentFilter("com.b3nac.injuredandroid.intent.action.CUSTOM_INTENT"));
        m4071F();
    }
}
