package oversecured.ovaa.services;

import android.app.IntentService;
import android.content.Intent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
/* loaded from: classes5.dex */
public class InsecureLoggerService extends IntentService {
    private static final String ACTION_DUMP = "oversecured.ovaa.action.DUMP";
    private static final String EXTRA_FILE = "oversecured.ovaa.extra.file";

    public InsecureLoggerService() {
        super("InsecureLoggerService");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (intent != null && ACTION_DUMP.equals(intent.getAction())) {
            dumpLogs(getDumpFile(intent));
        }
    }

    private File getDumpFile(Intent intent) {
        Object file = intent.getExtras().get(EXTRA_FILE);
        if (file instanceof String) {
            return new File((String) file);
        }
        if (file instanceof File) {
            return (File) file;
        }
        throw new IllegalArgumentException();
    }

    private void dumpLogs(File toFile) {
        try {
            Process logcatProcess = Runtime.getRuntime().exec("logcat -d");
            BufferedReader reader = new BufferedReader(new InputStreamReader(logcatProcess.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(toFile));
            while (true) {
                String line = reader.readLine();
                if (line != null) {
                    writer.append((CharSequence) line).append('\n');
                } else {
                    writer.flush();
                    writer.close();
                    reader.close();
                    return;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
