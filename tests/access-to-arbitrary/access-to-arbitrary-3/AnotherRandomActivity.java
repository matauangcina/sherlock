package com.test.test;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class AnotherRandomActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 99;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent("com.test.test.ACTION");
        if (getPackageManager().resolveActivity(i, 0) != null) {
            startActivityForResult(i, REQUEST_CODE);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent bad) {
        super.onActivityResult(requestCode, resultCode, bad);
        if (resultCode == -1 && requestCode == REQUEST_CODE) {
            setResult(resultCode, bad);
            finish();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent good) {
        super.onActivityResult(requestCode, resultCode, good);
        if (resultCode == -1 && requestCode == REQUEST_CODE) {
            good = good.removeFlags(3);
            setResult(resultCode, good);
            finish();
        }
    }
}