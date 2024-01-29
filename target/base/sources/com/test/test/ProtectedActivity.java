package com.test.test;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
/* loaded from: classes4.dex */
public class ProtectedActivity extends AppCompatActivity {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1365R.layout.activity_protected);
        Uri testProviderUri = Uri.parse("content://com.test.test.TestProvider/crimes");
        Cursor cursor = getContentResolver().query(testProviderUri, null, null, null, null);
        try {
            if (cursor == null) {
                throw new AssertionError();
            }
            if (cursor.getCount() == 0) {
                if (cursor == null) {
                    throw new AssertionError();
                }
                cursor.close();
                return;
            }
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Log.d("ProtectedActivity", cursor.getColumnName(1));
                cursor.moveToNext();
            }
            if (cursor == null) {
                throw new AssertionError();
            }
            cursor.close();
        } catch (Throwable th) {
            if (cursor == null) {
                throw new AssertionError();
            }
            cursor.close();
            throw th;
        }
    }
}
