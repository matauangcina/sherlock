package com.test.test;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class RandomActivity extends AppCompatActivity {
    ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.test.test.RandomActivity$$ExternalSyntheticLambda0
        @Override
        public final void onActivityResult(Object obj) {
            RandomActivity.this.m240lambda$new$0$comtesttestRandomActivity((ActivityResult) obj);
        }
    });

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent("com.test.test.ACTION");
        if (getPackageManager().resolveActivity(i, 0) != null) {
            this.launcher.launch(i);
        }
    }

    public void m240lambda$new$0$comtesttestRandomActivity(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            // ruleid: insecure-set-result-4
            setResult(result.getResultCode(), data);
            finish();
        }
    }

    public void m240lambda$new$0$comtesttestRandomActivity(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            data = data.removeFlags(3);
            // ok: insecure-set-result-4
            setResult(result.getResultCode(), data);
            finish();
        }
    }
}