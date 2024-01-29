package com.test.test;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* loaded from: classes4.dex */
public class DeepLinkActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1365R.layout.activity_main);
        Intent bad = new Intent();
        bad.setAction("com.example.custom_action");
        bad.putExtra("token", "blabla");
        bad.putExtra("refreshToken", "blabla");
        Intent good = new Intent();
        good.setAction("com.example.custom_action");
        good.putExtra("token", "blabla");
        good.putExtra("refreshToken", "blabla");
        sendBroadcast(good, "com.example.user_permission");
        Intent good1 = new Intent();
        good1.setAction("com.example.custom_action");
        good1 = good1.setClassName("com.example2", "com.example2.UserInfoHandler");
        good1.putExtra("token", "blabla");
        good1.putExtra("refreshToken", "blabla");
        sendBroadcast(good1);
    }
}
