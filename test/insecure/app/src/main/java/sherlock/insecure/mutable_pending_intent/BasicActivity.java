package sherlock.insecure.mutable_pending_intent;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import sherlock.insecure.databinding.ActivityBasicBinding;

public class BasicActivity extends AppCompatActivity {

    private static final String EXTRA_TITLE = "sherlock.test.mutable_pending_intent.title";
    private static final String UNSAFE = "unsafe";
    private static final String SAFE = "safe";
    private static final int REQUEST_CODE = 1001;
    private ActivityBasicBinding binding;

    public static Intent newIntent(Context packageContext, String title) {
        Intent i = new Intent(packageContext, BasicActivity.class);
        i.putExtra(EXTRA_TITLE, title);
        return i;
    }

    private void sendImplicitBroadcast(PendingIntent pi) {
        Intent i = new Intent("sherlock.test.MUTABLE_PENDING_INTENT_BROADCAST");
        i.putExtra(UNSAFE, pi);
        sendBroadcast(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBasicBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.title.setText(getIntent().getStringExtra(EXTRA_TITLE));

        binding.basicOneUnsafe.setOnClickListener(v1 -> {
            Intent emptyBase = new Intent();
            PendingIntent bad = PendingIntent.getActivity(this, REQUEST_CODE, emptyBase, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_MUTABLE);
            Intent badIntent = new Intent("sherlock.test.MUTABLE_PENDING_INTENT_EMPTY");
            badIntent.putExtra(UNSAFE, bad);
            startActivity(badIntent);
            Toast.makeText(this, "Wrapper intent sent!", Toast.LENGTH_SHORT).show();
        });

        binding.basicTwoUnsafe.setOnClickListener(v1 -> {
            PendingIntent bad = PendingIntent.getActivity(this, REQUEST_CODE, new Intent("sherlock.test.IMPLICIT_BASE_INTENT"), PendingIntent.FLAG_MUTABLE);
            Bundle bundle = new Bundle();
            bundle.putParcelable("pending_intent", bad);
            Intent badIntent = new Intent("sherlock.test.MUTABLE_PENDING_INTENT_IMPLICIT");
            badIntent.putExtra("bundle", bundle);
            startActivity(badIntent);
            Toast.makeText(this, "Wrapper intent sent!", Toast.LENGTH_SHORT).show();
        });

        binding.basicThreeUnsafe.setOnClickListener(v1 -> {
            PendingIntent bad = PendingIntent.getActivity(this, REQUEST_CODE, new Intent(), PendingIntent.FLAG_MUTABLE);
            sendImplicitBroadcast(bad);
            Toast.makeText(this, "Wrapper intent sent!", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}