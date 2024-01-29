package com.test.test;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
/* loaded from: classes4.dex */
public class UlalaActivity extends AppCompatActivity {
    private static final String TAG = "UlalaActivity";
    ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.test.test.UlalaActivity$$ExternalSyntheticLambda0
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            UlalaActivity.this.m241lambda$new$0$comtesttestUlalaActivity((ActivityResult) obj);
        }
    });

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1365R.layout.activity_ulala);
        Intent intent = getIntent();
        Uri uri = intent.getData();
        Log.d(TAG, "Data Uri: " + uri);
        Log.d(TAG, "Intent action: " + intent.getAction());
        if ("android.intent.action.VIEW".equals(intent.getAction()) && uri != null) {
            Log.d(TAG, "Pass 1...");
            if ("test".equals(uri.getScheme()) && "deeplink".equals(uri.getHost()) && "/ulala".equals(uri.getPath())) {
                Log.d(TAG, "Pass 2...");
                Intent i = new Intent("com.test.test.ACTION");
                Log.d(TAG, "Pass 3...");
                getPackageManager();
                if (getPackageManager().resolveActivity(i, 0) != null) {
                    Log.d(TAG, "Resolve: " + getPackageManager().resolveActivity(i, 0));
                    Log.d(TAG, "Ready to launch intent...");
                    this.launcher.launch(i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$com-test-test-UlalaActivity  reason: not valid java name */
    public /* synthetic */ void m241lambda$new$0$comtesttestUlalaActivity(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Log.d(TAG, "Data: " + result.getData().getData());
            setResult(-1, result.getData());
            finish();
        }
    }
}
