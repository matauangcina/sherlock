package net.gotev.uploadservice;

import android.content.Context;
import android.content.Intent;
import java.util.UUID;
import net.gotev.uploadservice.UploadRequest;
/* loaded from: classes.dex */
public abstract class UploadRequest<B extends UploadRequest<B>> {
    private static final String LOG_TAG = UploadRequest.class.getSimpleName();
    protected final Context context;
    protected UploadStatusDelegate delegate;
    protected final UploadTaskParameters params = new UploadTaskParameters();

    protected abstract Class<? extends UploadTask> getTaskClass();

    public UploadRequest(Context context, String uploadId, String serverUrl) throws IllegalArgumentException {
        if (context == null) {
            throw new IllegalArgumentException("Context MUST not be null!");
        }
        if (serverUrl == null || "".equals(serverUrl)) {
            throw new IllegalArgumentException("Server URL cannot be null or empty");
        }
        this.context = context;
        if (uploadId == null || uploadId.isEmpty()) {
            Logger.debug(LOG_TAG, "null or empty upload ID. Generating it");
            this.params.setId(UUID.randomUUID().toString());
        } else {
            Logger.debug(LOG_TAG, "setting provided upload ID");
            this.params.setId(uploadId);
        }
        this.params.setServerUrl(serverUrl);
        String str = LOG_TAG;
        Logger.debug(str, "Created new upload request to " + this.params.getServerUrl() + " with ID: " + this.params.getId());
    }

    public String startUpload() {
        UploadService.setUploadStatusDelegate(this.params.getId(), this.delegate);
        Intent intent = new Intent(this.context, UploadService.class);
        initializeIntent(intent);
        intent.setAction(UploadService.getActionUpload());
        this.context.startService(intent);
        return this.params.getId();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void initializeIntent(Intent intent) {
        intent.putExtra("taskParameters", this.params);
        Class taskClass = getTaskClass();
        if (taskClass == null) {
            throw new RuntimeException("The request must specify a task class!");
        }
        intent.putExtra("taskClass", taskClass.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final B self() {
        return this;
    }

    public B setNotificationConfig(UploadNotificationConfig config) {
        this.params.setNotificationConfig(config);
        return self();
    }

    public B setAutoDeleteFilesAfterSuccessfulUpload(boolean autoDeleteFiles) {
        this.params.setAutoDeleteSuccessfullyUploadedFiles(autoDeleteFiles);
        return self();
    }

    public B setMaxRetries(int maxRetries) {
        this.params.setMaxRetries(maxRetries);
        return self();
    }

    public B setDelegate(UploadStatusDelegate delegate) {
        this.delegate = delegate;
        return self();
    }
}
