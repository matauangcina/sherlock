package net.gotev.uploadservice;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Handler;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.load.Key;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.gotev.uploadservice.BroadcastData;
/* loaded from: classes.dex */
public abstract class UploadTask implements Runnable {
    protected static final int TASK_COMPLETED_SUCCESSFULLY = 200;
    private int attempts;
    private long lastProgressNotificationTime;
    private Handler mainThreadHandler;
    private NotificationCompat.Builder notification;
    private int notificationId;
    private NotificationManager notificationManager;
    protected UploadService service;
    protected long totalBytes;
    protected long uploadedBytes;
    private static final String LOG_TAG = UploadTask.class.getSimpleName();
    protected static final byte[] EMPTY_RESPONSE = "".getBytes(Charset.forName(Key.STRING_CHARSET_NAME));
    protected UploadTaskParameters params = null;
    private final List<String> successfullyUploadedFiles = new ArrayList();
    protected boolean shouldContinue = true;
    private final long startTime = new Date().getTime();

    protected abstract void upload() throws Exception;

    protected void onSuccessfulUpload() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(UploadService service, Intent intent) throws IOException {
        this.notificationManager = (NotificationManager) service.getSystemService("notification");
        this.notification = new NotificationCompat.Builder(service);
        this.service = service;
        this.mainThreadHandler = new Handler(service.getMainLooper());
        this.params = (UploadTaskParameters) intent.getParcelableExtra("taskParameters");
    }

    @Override // java.lang.Runnable
    public final void run() {
        createNotification(new UploadInfo(this.params.getId()));
        this.attempts = 0;
        int errorDelay = UploadService.INITIAL_RETRY_WAIT_TIME;
        while (this.attempts <= this.params.getMaxRetries() && this.shouldContinue) {
            this.attempts++;
            try {
                upload();
                break;
            } catch (Exception exc) {
                if (!this.shouldContinue) {
                    break;
                } else if (this.attempts > this.params.getMaxRetries()) {
                    broadcastError(exc);
                } else {
                    Logger.error(LOG_TAG, "Error in uploadId " + this.params.getId() + " on attempt " + this.attempts + ". Waiting " + (errorDelay / 1000) + "s before next attempt. ", exc);
                    long beforeSleepTs = System.currentTimeMillis();
                    while (this.shouldContinue && System.currentTimeMillis() < errorDelay + beforeSleepTs) {
                        try {
                            Thread.sleep(2000L);
                        } catch (Throwable th) {
                        }
                    }
                    errorDelay *= UploadService.BACKOFF_MULTIPLIER;
                    if (errorDelay > UploadService.MAX_RETRY_WAIT_TIME) {
                        errorDelay = UploadService.MAX_RETRY_WAIT_TIME;
                    }
                }
            }
        }
        if (!this.shouldContinue) {
            broadcastCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final UploadTask setLastProgressNotificationTime(long lastProgressNotificationTime) {
        this.lastProgressNotificationTime = lastProgressNotificationTime;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final UploadTask setNotificationId(int notificationId) {
        this.notificationId = notificationId;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void broadcastProgress(long uploadedBytes, long totalBytes) {
        long currentTime = System.currentTimeMillis();
        if (currentTime < this.lastProgressNotificationTime + 166) {
            return;
        }
        setLastProgressNotificationTime(currentTime);
        String str = LOG_TAG;
        Logger.debug(str, "Broadcasting upload progress for " + this.params.getId() + ": " + uploadedBytes + " bytes of " + totalBytes);
        final UploadInfo uploadInfo = new UploadInfo(this.params.getId(), this.startTime, uploadedBytes, totalBytes, this.attempts + (-1), this.successfullyUploadedFiles, this.params.getFiles().size() + this.successfullyUploadedFiles.size());
        BroadcastData data = new BroadcastData().setStatus(BroadcastData.Status.IN_PROGRESS).setUploadInfo(uploadInfo);
        final UploadStatusDelegate delegate = UploadService.getUploadStatusDelegate(this.params.getId());
        if (delegate != null) {
            this.mainThreadHandler.post(new Runnable() { // from class: net.gotev.uploadservice.UploadTask.1
                @Override // java.lang.Runnable
                public void run() {
                    delegate.onProgress(UploadTask.this.service, uploadInfo);
                }
            });
        } else {
            this.service.sendBroadcast(data.getIntent());
        }
        updateNotificationProgress(uploadInfo);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void broadcastCompleted(final ServerResponse response) {
        boolean successfulUpload = response.getHttpCode() / 100 == 2;
        if (successfulUpload) {
            onSuccessfulUpload();
            if (this.params.isAutoDeleteSuccessfullyUploadedFiles() && !this.successfullyUploadedFiles.isEmpty()) {
                for (String filePath : this.successfullyUploadedFiles) {
                    deleteFile(new File(filePath));
                }
            }
        }
        String str = LOG_TAG;
        Logger.debug(str, "Broadcasting upload completed for " + this.params.getId());
        final UploadInfo uploadInfo = new UploadInfo(this.params.getId(), this.startTime, this.uploadedBytes, this.totalBytes, this.attempts + (-1), this.successfullyUploadedFiles, this.params.getFiles().size());
        final UploadStatusDelegate delegate = UploadService.getUploadStatusDelegate(this.params.getId());
        if (delegate != null) {
            this.mainThreadHandler.post(new Runnable() { // from class: net.gotev.uploadservice.UploadTask.2
                @Override // java.lang.Runnable
                public void run() {
                    delegate.onCompleted(UploadTask.this.service, uploadInfo, response);
                }
            });
        } else {
            BroadcastData data = new BroadcastData().setStatus(BroadcastData.Status.COMPLETED).setUploadInfo(uploadInfo).setServerResponse(response);
            this.service.sendBroadcast(data.getIntent());
        }
        UploadNotificationConfig notificationConfig = this.params.getNotificationConfig();
        if (notificationConfig != null) {
            if (successfulUpload) {
                updateNotification(uploadInfo, notificationConfig.getCompletedMessage(), notificationConfig.isAutoClearOnSuccess(), notificationConfig.getCompletedIconResourceID(), notificationConfig.getCompletedIconColorResourceID());
            } else {
                updateNotification(uploadInfo, notificationConfig.getErrorMessage(), notificationConfig.isAutoClearOnError(), notificationConfig.getErrorIconResourceID(), notificationConfig.getErrorIconColorResourceID());
            }
        }
        this.service.taskCompleted(this.params.getId());
    }

    protected final void broadcastCancelled() {
        String str = LOG_TAG;
        Logger.debug(str, "Broadcasting cancellation for upload with ID: " + this.params.getId());
        final UploadInfo uploadInfo = new UploadInfo(this.params.getId(), this.startTime, this.uploadedBytes, this.totalBytes, this.attempts + (-1), this.successfullyUploadedFiles, this.params.getFiles().size());
        BroadcastData data = new BroadcastData().setStatus(BroadcastData.Status.CANCELLED).setUploadInfo(uploadInfo);
        final UploadStatusDelegate delegate = UploadService.getUploadStatusDelegate(this.params.getId());
        if (delegate != null) {
            this.mainThreadHandler.post(new Runnable() { // from class: net.gotev.uploadservice.UploadTask.3
                @Override // java.lang.Runnable
                public void run() {
                    delegate.onCancelled(UploadTask.this.service, uploadInfo);
                }
            });
        } else {
            this.service.sendBroadcast(data.getIntent());
        }
        UploadNotificationConfig notificationConfig = this.params.getNotificationConfig();
        if (notificationConfig != null) {
            updateNotification(uploadInfo, notificationConfig.getCancelledMessage(), notificationConfig.isAutoClearOnCancel(), notificationConfig.getCancelledIconResourceID(), notificationConfig.getCancelledIconColorResourceID());
        }
        this.service.taskCompleted(this.params.getId());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void addSuccessfullyUploadedFile(String absolutePath) {
        if (!this.successfullyUploadedFiles.contains(absolutePath)) {
            this.successfullyUploadedFiles.add(absolutePath);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<String> getSuccessfullyUploadedFiles() {
        return this.successfullyUploadedFiles;
    }

    private void broadcastError(final Exception exception) {
        String str = LOG_TAG;
        Logger.info(str, "Broadcasting error for upload with ID: " + this.params.getId() + ". " + exception.getMessage());
        final UploadInfo uploadInfo = new UploadInfo(this.params.getId(), this.startTime, this.uploadedBytes, this.totalBytes, this.attempts + (-1), this.successfullyUploadedFiles, this.params.getFiles().size());
        BroadcastData data = new BroadcastData().setStatus(BroadcastData.Status.ERROR).setUploadInfo(uploadInfo).setException(exception);
        final UploadStatusDelegate delegate = UploadService.getUploadStatusDelegate(this.params.getId());
        if (delegate != null) {
            this.mainThreadHandler.post(new Runnable() { // from class: net.gotev.uploadservice.UploadTask.4
                @Override // java.lang.Runnable
                public void run() {
                    delegate.onError(UploadTask.this.service, uploadInfo, exception);
                }
            });
        } else {
            this.service.sendBroadcast(data.getIntent());
        }
        UploadNotificationConfig notificationConfig = this.params.getNotificationConfig();
        if (notificationConfig != null && notificationConfig.getErrorMessage() != null) {
            updateNotification(uploadInfo, notificationConfig.getErrorMessage(), notificationConfig.isAutoClearOnError(), notificationConfig.getErrorIconResourceID(), notificationConfig.getErrorIconColorResourceID());
        }
        this.service.taskCompleted(this.params.getId());
    }

    private void createNotification(UploadInfo uploadInfo) {
        if (this.params.getNotificationConfig() == null || this.params.getNotificationConfig().getInProgressMessage() == null) {
            return;
        }
        this.notification.setContentTitle(Placeholders.replace(this.params.getNotificationConfig().getTitle(), uploadInfo)).setContentText(Placeholders.replace(this.params.getNotificationConfig().getInProgressMessage(), uploadInfo)).setContentIntent(this.params.getNotificationConfig().getPendingIntent(this.service)).setSmallIcon(this.params.getNotificationConfig().getIconResourceID()).setColor(this.params.getNotificationConfig().getIconColorResourceID()).setGroup(UploadService.NAMESPACE).setProgress(100, 0, true).setOngoing(true);
        Notification builtNotification = this.notification.build();
        if (this.service.holdForegroundNotification(this.params.getId(), builtNotification)) {
            this.notificationManager.cancel(this.notificationId);
        } else {
            this.notificationManager.notify(this.notificationId, builtNotification);
        }
    }

    private void updateNotificationProgress(UploadInfo uploadInfo) {
        if (this.params.getNotificationConfig() == null || this.params.getNotificationConfig().getInProgressMessage() == null) {
            return;
        }
        this.notification.setContentTitle(Placeholders.replace(this.params.getNotificationConfig().getTitle(), uploadInfo)).setContentText(Placeholders.replace(this.params.getNotificationConfig().getInProgressMessage(), uploadInfo)).setContentIntent(this.params.getNotificationConfig().getPendingIntent(this.service)).setSmallIcon(this.params.getNotificationConfig().getIconResourceID()).setColor(this.params.getNotificationConfig().getIconColorResourceID()).setGroup(UploadService.NAMESPACE).setProgress((int) uploadInfo.getTotalBytes(), (int) uploadInfo.getUploadedBytes(), false).setOngoing(true);
        Notification builtNotification = this.notification.build();
        if (this.service.holdForegroundNotification(this.params.getId(), builtNotification)) {
            this.notificationManager.cancel(this.notificationId);
        } else {
            this.notificationManager.notify(this.notificationId, builtNotification);
        }
    }

    private void setRingtone() {
        if (this.params.getNotificationConfig().isRingToneEnabled()) {
            this.notification.setSound(RingtoneManager.getActualDefaultRingtoneUri(this.service, 2));
            this.notification.setOnlyAlertOnce(false);
        }
    }

    private void updateNotification(UploadInfo uploadInfo, String message, boolean autoClearOnSuccess, int iconResourceID, int iconColorResourceID) {
        if (this.params.getNotificationConfig() == null) {
            return;
        }
        this.notificationManager.cancel(this.notificationId);
        if (message != null && !autoClearOnSuccess) {
            this.notification.setContentTitle(Placeholders.replace(this.params.getNotificationConfig().getTitle(), uploadInfo)).setContentText(Placeholders.replace(message, uploadInfo)).setContentIntent(this.params.getNotificationConfig().getPendingIntent(this.service)).setAutoCancel(this.params.getNotificationConfig().isClearOnAction()).setSmallIcon(iconResourceID).setColor(iconColorResourceID).setGroup(UploadService.NAMESPACE).setProgress(0, 0, false).setOngoing(false);
            setRingtone();
            this.notificationManager.notify(this.notificationId + 1, this.notification.build());
        }
    }

    private boolean deleteFile(File fileToDelete) {
        boolean deleted = false;
        try {
            deleted = fileToDelete.delete();
            if (!deleted) {
                String str = LOG_TAG;
                Logger.error(str, "Unable to delete: " + fileToDelete.getAbsolutePath());
            } else {
                String str2 = LOG_TAG;
                Logger.info(str2, "Successfully deleted: " + fileToDelete.getAbsolutePath());
            }
        } catch (Exception exc) {
            String str3 = LOG_TAG;
            Logger.error(str3, "Error while deleting: " + fileToDelete.getAbsolutePath() + " Check if you granted: android.permission.WRITE_EXTERNAL_STORAGE", exc);
        }
        return deleted;
    }

    public final void cancel() {
        this.shouldContinue = false;
    }
}
