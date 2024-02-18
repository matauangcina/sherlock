package com.test.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent bad = getIntent();
        // ruleid: insecure-set-result-1
        setResult(RESULT_OK, bad);

        Intent good = getIntent();
        good = good.removeFlags(3);
        // ok: insecure-set-result-1
        setResult(RESULT_OK, good);
    }
}