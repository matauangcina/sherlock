package net.gotev.uploadservice;

import android.util.Log;
import net.gotev.uploadservice.Logger;
/* loaded from: classes.dex */
public class DefaultLoggerDelegate implements Logger.LoggerDelegate {
    private static final String TAG = "UploadService";

    @Override // net.gotev.uploadservice.Logger.LoggerDelegate
    public void error(String tag, String message) {
        Log.e(TAG, tag + " - " + message);
    }

    @Override // net.gotev.uploadservice.Logger.LoggerDelegate
    public void error(String tag, String message, Throwable exception) {
        Log.e(TAG, tag + " - " + message, exception);
    }

    @Override // net.gotev.uploadservice.Logger.LoggerDelegate
    public void debug(String tag, String message) {
        Log.d(TAG, tag + " - " + message);
    }

    @Override // net.gotev.uploadservice.Logger.LoggerDelegate
    public void info(String tag, String message) {
        Log.i(TAG, tag + " - " + message);
    }
}
