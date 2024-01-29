package com.test.test.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import com.test.test.database.CrimeDbSchema;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* loaded from: classes3.dex */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mContext;
    private SQLiteDatabase mDatabase;

    private CrimeLab(Context context) {
        this.mContext = context.getApplicationContext();
        this.mDatabase = new CrimeBaseHelper(this.mContext).getWritableDatabase();
    }

    public void addCrime(Crime crime) {
        ContentValues values = getContentValues(crime);
        this.mDatabase.insert(CrimeDbSchema.CrimeTable.NAME, null, values);
    }

    public void deleteCrime(Crime crime) {
        this.mDatabase.delete(CrimeDbSchema.CrimeTable.NAME, "uuid = ?", new String[]{crime.getId().toString()});
    }

    public List<Crime> getCrimes() {
        List<Crime> crimes = new ArrayList<>();
        CrimeCursorWrapper cursor = queryCrimes(null, null);
        try {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                crimes.add(cursor.getCrime());
                cursor.moveToNext();
            }
            return crimes;
        } finally {
            cursor.close();
        }
    }

    public Crime getCrime(UUID id) {
        CrimeCursorWrapper cursor = queryCrimes("uuid = ?", new String[]{id.toString()});
        try {
            if (cursor.getCount() != 0) {
                cursor.moveToFirst();
                return cursor.getCrime();
            }
            cursor.close();
            return null;
        } finally {
            cursor.close();
        }
    }

    public File getPhotoFile(Crime crime) {
        File externalFilesDir = this.mContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (externalFilesDir == null) {
            return null;
        }
        return new File(externalFilesDir, crime.getPhotoFilename());
    }

    public void updateCrime(Crime crime) {
        String uuidString = crime.getId().toString();
        ContentValues values = getContentValues(crime);
        this.mDatabase.update(CrimeDbSchema.CrimeTable.NAME, values, "uuid = ?", new String[]{uuidString});
    }

    private static ContentValues getContentValues(Crime crime) {
        ContentValues values = new ContentValues();
        values.put(CrimeDbSchema.CrimeTable.Columns.UUID, crime.getId().toString());
        values.put(CrimeDbSchema.CrimeTable.Columns.TITLE, crime.getTitle());
        values.put(CrimeDbSchema.CrimeTable.Columns.DATE, Long.valueOf(crime.getDate().getTime()));
        values.put(CrimeDbSchema.CrimeTable.Columns.SOLVED, Integer.valueOf(crime.isSolved() ? 1 : 0));
        values.put(CrimeDbSchema.CrimeTable.Columns.SUSPECT_ID, crime.getSuspectId());
        values.put(CrimeDbSchema.CrimeTable.Columns.SUSPECT, crime.getSuspect());
        values.put(CrimeDbSchema.CrimeTable.Columns.PHONE_NUM, crime.getPhoneNum());
        return values;
    }

    private CrimeCursorWrapper queryCrimes(String whereClause, String[] whereArgs) {
        Cursor cursor = this.mDatabase.query(CrimeDbSchema.CrimeTable.NAME, null, whereClause, whereArgs, null, null, null);
        return new CrimeCursorWrapper(cursor);
    }

    public static CrimeLab getInstance(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
}
