package b3nac.injuredandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.ActivityC0453c;
/* loaded from: classes.dex */
public class XSSTextActivity extends ActivityC0453c {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_xsstext);
    }

    public void submitText(View view) {
        Intent intent = new Intent(this, DisplayPostXSS.class);
        intent.putExtra("com.b3nac.injuredandroid.DisplayPostXSS", ((EditText) findViewById(R.id.editText)).getText().toString());
        startActivity(intent);
    }
}
