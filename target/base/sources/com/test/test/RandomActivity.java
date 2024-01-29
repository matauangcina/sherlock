package com.test.test;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
/* loaded from: classes4.dex */
public class RandomActivity extends AppCompatActivity {
    ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.test.test.RandomActivity$$ExternalSyntheticLambda0
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            RandomActivity.this.m240lambda$new$0$comtesttestRandomActivity((ActivityResult) obj);
        }
    });

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent("com.test.test.ACTION");
        if (getPackageManager().resolveActivity(i, 0) != null) {
            this.launcher.launch(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$com-test-test-RandomActivity  reason: not valid java name */
    public /* synthetic */ void m240lambda$new$0$comtesttestRandomActivity(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            setResult(result.getResultCode(), data);
            finish();
        }
    }
}
