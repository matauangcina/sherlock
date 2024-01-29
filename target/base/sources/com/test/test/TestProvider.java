package com.test.test;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.test.test.database.CrimeBaseHelper;
/* loaded from: classes4.dex */
public class TestProvider extends android.content.ContentProvider {
    private static final String AUTHORITY = "com.test.test.TestProvider";
    private static final String TABLE_NAME = "crimes";
    private static final UriMatcher uriMatcher;
    private SQLiteDatabase mDatabase;

    static {
        UriMatcher uriMatcher2 = new UriMatcher(-1);
        uriMatcher = uriMatcher2;
        uriMatcher2.addURI(AUTHORITY, "crimes", 1);
        uriMatcher2.addURI(AUTHORITY, "crimes/#", 2);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        SQLiteDatabase writableDatabase = new CrimeBaseHelper(context).getWritableDatabase();
        this.mDatabase = writableDatabase;
        return writableDatabase != null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        SQLiteQueryBuilder queryBuilder = new SQLiteQueryBuilder();
        queryBuilder.setTables("crimes");
        switch (uriMatcher.match(uri)) {
            case 1:
                if (TextUtils.isEmpty(sortOrder)) {
                    sortOrder = "_ID ASC";
                    break;
                }
                break;
            case 2:
                selection = selection + "_ID = " + uri.getLastPathSegment();
                break;
        }
        Cursor c = queryBuilder.query(this.mDatabase, projection, selection, selectionArgs, null, null, sortOrder);
        c.setNotificationUri(getContext().getContentResolver(), uri);
        return c;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
