package sherlock.poc;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        textView = new TextView(this);
        setContentView(textView);

        Intent i = new Intent();
        i.setAction("{{ intent_action }}");
        i.setData(Uri.parse("{{ deeplink }}"));
        launcher.launch(i);
    }

    ActivityResultLauncher<Intent> launcher = registerForActivityResult(
        new ActivityResultContracts.StartActivityForResult(),
        result -> {
            if (result.getResultCode() == {{ result_code }}) {
                Uri uri = result.getData().getData();
                Cursor c = getContentResolver().query(uri, null, null, null, null);
                if (c.getCount() == 0) {
                    textView.setText("Selected content provider is empty.");
                    return;
                }
                c.moveToFirst();
                StringBuilder sb = new StringBuilder();
                while (!c.isAfterLast()) {
                    for (int i = 0; i < c.getColumnCount(); i++) {
                        String data = c.getColumnName(i) + ":" + c.getString(i) + ",";
                        sb.append(data);
                    }
                    c.moveToNext();
                }
                textView.setText(sb);
            }
        }
    );
}