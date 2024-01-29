package com.test.test;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* loaded from: classes4.dex */
public class AnotherRandomActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 99;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent("com.test.test.ACTION");
        if (getPackageManager().resolveActivity(i, 0) != null) {
            startActivityForResult(i, REQUEST_CODE);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && requestCode == REQUEST_CODE) {
            setResult(resultCode, data);
            finish();
        }
    }
}
