package com.test.test;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* loaded from: classes4.dex */
public class BlablaActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 1337;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1365R.layout.activity_main);
        Intent i = new Intent("com.test.test.TEST");
        startActivityForResult(i, REQUEST_CODE);
        Intent data1 = getIntent();
        data1.putExtra("blablabla", "blablabla");
        setResult(-1, data1);
        Intent data2 = new Intent();
        data2.putExtra("blablabla", "blablabla");
        setResult(-1, data2);
        Intent data3 = getIntent();
        data3.putExtra("blablabla", "blablabla");
        data3 = data3.removeFlags(3);
        setResult(-1, data3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && requestCode == REQUEST_CODE) {
            setResult(resultCode, data);
        }
    }
}
