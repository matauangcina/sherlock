package net.gotev.uploadservice;

import android.content.Context;
import android.content.Intent;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
/* loaded from: classes.dex */
public class MultipartUploadRequest extends HttpUploadRequest<MultipartUploadRequest> {
    private static final String LOG_TAG = MultipartUploadRequest.class.getSimpleName();
    private boolean isUtf8Charset;

    public MultipartUploadRequest(Context context, String uploadId, String serverUrl) throws IllegalArgumentException, MalformedURLException {
        super(context, uploadId, serverUrl);
        this.isUtf8Charset = false;
    }

    public MultipartUploadRequest(Context context, String serverUrl) throws MalformedURLException, IllegalArgumentException {
        this(context, null, serverUrl);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.gotev.uploadservice.HttpUploadRequest, net.gotev.uploadservice.UploadRequest
    public void initializeIntent(Intent intent) {
        super.initializeIntent(intent);
        intent.putExtra("multipartUtf8Charset", this.isUtf8Charset);
    }

    @Override // net.gotev.uploadservice.UploadRequest
    protected Class<? extends UploadTask> getTaskClass() {
        return MultipartUploadTask.class;
    }

    public MultipartUploadRequest addFileToUpload(String filePath, String parameterName, String fileName, String contentType) throws FileNotFoundException, IllegalArgumentException {
        UploadFile file = new UploadFile(filePath);
        String filePath2 = file.getPath();
        if (parameterName == null || "".equals(parameterName)) {
            throw new IllegalArgumentException("Please specify parameterName value for file: " + filePath2);
        }
        file.setProperty("httpParamName", parameterName);
        if (contentType == null || contentType.isEmpty()) {
            contentType = file.getContentType(this.context);
            String str = LOG_TAG;
            Logger.debug(str, "Auto-detected MIME type for " + filePath2 + " is: " + contentType);
        } else {
            String str2 = LOG_TAG;
            Logger.debug(str2, "Content Type set for " + filePath2 + " is: " + contentType);
        }
        file.setProperty("httpContentType", contentType);
        if (fileName == null || "".equals(fileName)) {
            fileName = file.getName(this.context);
            String str3 = LOG_TAG;
            Logger.debug(str3, "Using original file name: " + fileName);
        } else {
            String str4 = LOG_TAG;
            Logger.debug(str4, "Using custom file name: " + fileName);
        }
        file.setProperty("httpRemoteFileName", fileName);
        this.params.addFile(file);
        return this;
    }

    public MultipartUploadRequest addFileToUpload(String path, String parameterName, String fileName) throws FileNotFoundException, IllegalArgumentException {
        return addFileToUpload(path, parameterName, fileName, null);
    }

    public MultipartUploadRequest addFileToUpload(String path, String parameterName) throws FileNotFoundException, IllegalArgumentException {
        return addFileToUpload(path, parameterName, null, null);
    }

    public MultipartUploadRequest setUtf8Charset() {
        this.isUtf8Charset = true;
        return this;
    }
}
