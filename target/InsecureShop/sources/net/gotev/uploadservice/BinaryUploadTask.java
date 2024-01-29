package net.gotev.uploadservice;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import net.gotev.uploadservice.http.BodyWriter;
/* loaded from: classes.dex */
public class BinaryUploadTask extends HttpUploadTask {
    @Override // net.gotev.uploadservice.HttpUploadTask
    protected long getBodyLength() throws UnsupportedEncodingException {
        return this.params.getFiles().get(0).length(this.service);
    }

    @Override // net.gotev.uploadservice.http.HttpConnection.RequestBodyDelegate
    public void onBodyReady(BodyWriter bodyWriter) throws IOException {
        bodyWriter.writeStream(this.params.getFiles().get(0).getStream(this.service), this);
    }

    @Override // net.gotev.uploadservice.UploadTask
    protected void onSuccessfulUpload() {
        addSuccessfullyUploadedFile(this.params.getFiles().get(0).getPath());
        this.params.getFiles().clear();
    }
}
