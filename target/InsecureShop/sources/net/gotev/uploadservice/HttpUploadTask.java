package net.gotev.uploadservice;

import android.content.Intent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import net.gotev.uploadservice.http.BodyWriter;
import net.gotev.uploadservice.http.HttpConnection;
/* loaded from: classes.dex */
public abstract class HttpUploadTask extends UploadTask implements HttpConnection.RequestBodyDelegate, BodyWriter.OnStreamWriteListener {
    private static final String LOG_TAG = HttpUploadTask.class.getSimpleName();
    private HttpConnection connection;
    protected HttpUploadTaskParameters httpParams = null;

    protected abstract long getBodyLength() throws UnsupportedEncodingException;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.gotev.uploadservice.UploadTask
    public void init(UploadService service, Intent intent) throws IOException {
        super.init(service, intent);
        this.httpParams = (HttpUploadTaskParameters) intent.getParcelableExtra("httpTaskParameters");
    }

    @Override // net.gotev.uploadservice.UploadTask
    protected void upload() throws Exception {
        String str = LOG_TAG;
        Logger.debug(str, "Starting upload task with ID " + this.params.getId());
        try {
            getSuccessfullyUploadedFiles().clear();
            this.uploadedBytes = 0L;
            this.totalBytes = getBodyLength();
            if (this.httpParams.isCustomUserAgentDefined()) {
                this.httpParams.addRequestHeader("User-Agent", this.httpParams.getCustomUserAgent());
            }
            HttpConnection totalBodyBytes = UploadService.HTTP_STACK.createNewConnection(this.httpParams.getMethod(), this.params.getServerUrl()).setHeaders(this.httpParams.getRequestHeaders()).setTotalBodyBytes(this.totalBytes, this.httpParams.isUsesFixedLengthStreamingMode());
            this.connection = totalBodyBytes;
            ServerResponse response = totalBodyBytes.getResponse(this);
            String str2 = LOG_TAG;
            Logger.debug(str2, "Server responded with HTTP " + response.getHttpCode() + " to upload with ID: " + this.params.getId());
            if (this.shouldContinue) {
                broadcastCompleted(response);
            }
        } finally {
            HttpConnection httpConnection = this.connection;
            if (httpConnection != null) {
                httpConnection.close();
            }
        }
    }

    @Override // net.gotev.uploadservice.http.BodyWriter.OnStreamWriteListener
    public boolean shouldContinueWriting() {
        return this.shouldContinue;
    }

    @Override // net.gotev.uploadservice.http.BodyWriter.OnStreamWriteListener
    public void onBytesWritten(int bytesWritten) {
        this.uploadedBytes += bytesWritten;
        broadcastProgress(this.uploadedBytes, this.totalBytes);
    }
}
