package net.gotev.uploadservice;

import android.content.Context;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.List;
/* loaded from: classes.dex */
public class BinaryUploadRequest extends HttpUploadRequest<BinaryUploadRequest> {
    @Override // net.gotev.uploadservice.HttpUploadRequest
    public /* bridge */ /* synthetic */ BinaryUploadRequest addArrayParameter(String str, List list) {
        return addArrayParameter(str, (List<String>) list);
    }

    public BinaryUploadRequest(Context context, String uploadId, String serverUrl) throws IllegalArgumentException, MalformedURLException {
        super(context, uploadId, serverUrl);
    }

    public BinaryUploadRequest(Context context, String serverUrl) throws MalformedURLException, IllegalArgumentException {
        this(context, null, serverUrl);
    }

    @Override // net.gotev.uploadservice.UploadRequest
    protected Class<? extends UploadTask> getTaskClass() {
        return BinaryUploadTask.class;
    }

    public BinaryUploadRequest setFileToUpload(String path) throws FileNotFoundException {
        this.params.getFiles().clear();
        this.params.addFile(new UploadFile(path));
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.gotev.uploadservice.HttpUploadRequest
    public BinaryUploadRequest addParameter(String paramName, String paramValue) {
        logDoesNotSupportParameters();
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.gotev.uploadservice.HttpUploadRequest
    public BinaryUploadRequest addArrayParameter(String paramName, String... array) {
        logDoesNotSupportParameters();
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.gotev.uploadservice.HttpUploadRequest
    public BinaryUploadRequest addArrayParameter(String paramName, List<String> list) {
        logDoesNotSupportParameters();
        return this;
    }

    @Override // net.gotev.uploadservice.UploadRequest
    public String startUpload() {
        if (this.params.getFiles().isEmpty()) {
            throw new IllegalArgumentException("Set the file to be used in the request body first!");
        }
        return super.startUpload();
    }

    private void logDoesNotSupportParameters() {
        Logger.error(getClass().getSimpleName(), "This upload method does not support adding parameters");
    }
}
