package com.test.test;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.test.test.database.Crime;
import com.test.test.database.CrimeDbSchema;
import com.test.test.database.CrimeLab;
/* loaded from: classes4.dex */
public class MainActivity extends AppCompatActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1365R.layout.activity_main);
        Crime crime = new Crime();
        crime.setSuspect("Suspect Bambang");
        crime.setSuspectId(CrimeDbSchema.CrimeTable.Columns.SUSPECT_ID);
        crime.setSolved(true);
        crime.setTitle("Eating leftovers from the fridge!");
        crime.setPhoneNum("081526354635");
        CrimeLab.getInstance(this).addCrime(crime);
        setResult(-1, getIntent());
    }
}
