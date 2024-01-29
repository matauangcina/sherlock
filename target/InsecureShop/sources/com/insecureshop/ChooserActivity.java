package com.insecureshop;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChooserActivity.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014¨\u0006\u000e"}, m19d2 = {"Lcom/insecureshop/ChooserActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "getFilename", "", "uri", "Landroid/net/Uri;", "makeTempCopy", "fileUri", "original_filename", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class ChooserActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0893R.layout.activity_chooser);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        if (intent.getExtras() != null) {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("android.intent.extra.STREAM");
            if (parcelableExtra == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.net.Uri");
            }
            Uri uri = Uri.fromFile(new File(((Uri) parcelableExtra).toString()));
            Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.fromFile(File(uri.toString()))");
            makeTempCopy(uri, getFilename(uri));
        }
    }

    private final Uri makeTempCopy(Uri fileUri, String original_filename) {
        try {
            StringBuilder sb = new StringBuilder();
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            Intrinsics.checkExpressionValueIsNotNull(externalStorageDirectory, "Environment.getExternalStorageDirectory()");
            sb.append(externalStorageDirectory.getAbsolutePath());
            sb.append(File.separator);
            sb.append("insecureshop");
            String path = sb.toString();
            File directory = new File(path);
            if (!directory.exists()) {
                directory.mkdirs();
            }
            File fileTemp = new File(path, original_filename);
            fileTemp.createNewFile();
            Uri fromFile = Uri.fromFile(fileTemp);
            InputStream openInputStream = getContentResolver().openInputStream(fileUri);
            OutputStream openOutputStream = getContentResolver().openOutputStream(fromFile);
            byte[] bArr = new byte[8192];
            while (true) {
                Integer len = openInputStream != null ? Integer.valueOf(openInputStream.read(bArr)) : null;
                if (len != null && len.intValue() == -1) {
                }
                if (len != null) {
                    int it = len.intValue();
                    if (openOutputStream != null) {
                        openOutputStream.write(bArr, 0, it);
                    }
                }
            }
        } catch (Exception e) {
            return null;
        }
    }

    public final String getFilename(Uri uri) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        String fileName = null;
        Context context = getApplicationContext();
        String scheme = uri.getScheme();
        if (Intrinsics.areEqual(scheme, "file")) {
            return uri.getLastPathSegment();
        }
        if (Intrinsics.areEqual(scheme, "content")) {
            String[] proj = {"_display_name"};
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Cursor cursor = context.getContentResolver().query(uri, proj, null, null, null);
            if (cursor != null && cursor.getCount() != 0) {
                int columnIndex = cursor.getColumnIndexOrThrow("_display_name");
                cursor.moveToFirst();
                return cursor.getString(columnIndex);
            }
            return fileName;
        }
        return fileName;
    }
}
