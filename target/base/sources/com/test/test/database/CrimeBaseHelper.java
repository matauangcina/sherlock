package com.test.test.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* loaded from: classes3.dex */
public class CrimeBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "crimeBase.db";
    public static final int VERSION = 1;

    public CrimeBaseHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table crimes( _id integer primary key autoincrement, uuid, title, date, solved, suspect_id, suspect, phone_num)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
