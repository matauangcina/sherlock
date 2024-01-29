package com.test.test;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* loaded from: classes4.dex */
public class TestActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent bad = getIntent();
        setResult(-1, bad);
        Intent good = getIntent();
        good = good.removeFlags(3);
        setResult(-1, good);
        finish();
    }
}
