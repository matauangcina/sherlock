package com.test.test.database;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.test.test.database.CrimeDbSchema;
import java.util.Date;
import java.util.UUID;
/* loaded from: classes3.dex */
public class CrimeCursorWrapper extends CursorWrapper {
    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Columns.UUID));
        String title = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Columns.TITLE));
        long date = getLong(getColumnIndex(CrimeDbSchema.CrimeTable.Columns.DATE));
        int isSolved = getInt(getColumnIndex(CrimeDbSchema.CrimeTable.Columns.SOLVED));
        String suspect = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Columns.SUSPECT));
        String phoneNum = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Columns.PHONE_NUM));
        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setSolved(isSolved != 0);
        crime.setSuspect(suspect);
        crime.setPhoneNum(phoneNum);
        return crime;
    }
}
