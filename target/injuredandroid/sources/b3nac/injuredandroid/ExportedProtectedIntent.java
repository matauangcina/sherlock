package b3nac.injuredandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActivityC0453c;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
/* loaded from: classes.dex */
public class ExportedProtectedIntent extends ActivityC0453c {
    /* renamed from: F */
    private void m4130F(Intent intent) {
        Intent intent2 = (Intent) intent.getParcelableExtra("access_protected_component");
        if (intent2.resolveActivity(getPackageManager()).getPackageName().equals("b3nac.injuredandroid")) {
            startActivity(intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static /* synthetic */ void m4129G(View view) {
        Snackbar m2647X = Snackbar.m2647X(view, "Replace with your own action", 0);
        m2647X.m2646Y("Action", null);
        m2647X.mo2650N();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_exported_protected_intent);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View.OnClickListener() { // from class: b3nac.injuredandroid.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportedProtectedIntent.m4129G(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0797d, android.app.Activity
    public void onResume() {
        super.onResume();
        m4130F(getIntent());
    }
}
