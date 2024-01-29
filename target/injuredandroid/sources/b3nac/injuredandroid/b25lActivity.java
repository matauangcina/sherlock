package b3nac.injuredandroid;

import android.os.Bundle;
import androidx.appcompat.app.ActivityC0453c;
/* loaded from: classes.dex */
public final class b25lActivity extends ActivityC0453c {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_b25l);
        ApplicationC1493j.f4523j.m4062a(this);
        new FlagsOverview().m4082M(true);
        new ApplicationC1493j().m4065b(this, "flagTwoButtonColor", true);
    }
}
