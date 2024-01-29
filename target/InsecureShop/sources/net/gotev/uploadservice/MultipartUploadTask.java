package net.gotev.uploadservice;

import android.content.Intent;
import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import net.gotev.uploadservice.http.BodyWriter;
/* loaded from: classes.dex */
public class MultipartUploadTask extends HttpUploadTask {
    private static final String BOUNDARY_SIGNATURE = "-------AndroidUploadService";
    private static final String NEW_LINE = "\r\n";
    protected static final String PARAM_UTF8_CHARSET = "multipartUtf8Charset";
    protected static final String PROPERTY_CONTENT_TYPE = "httpContentType";
    protected static final String PROPERTY_PARAM_NAME = "httpParamName";
    protected static final String PROPERTY_REMOTE_FILE_NAME = "httpRemoteFileName";
    private static final String TWO_HYPHENS = "--";
    private static final Charset US_ASCII = Charset.forName("US-ASCII");
    private byte[] boundaryBytes;
    private Charset charset;
    private byte[] trailerBytes;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.gotev.uploadservice.HttpUploadTask, net.gotev.uploadservice.UploadTask
    public void init(UploadService service, Intent intent) throws IOException {
        super.init(service, intent);
        String boundary = BOUNDARY_SIGNATURE + System.currentTimeMillis();
        this.boundaryBytes = ("\r\n--" + boundary + NEW_LINE).getBytes(US_ASCII);
        this.trailerBytes = ("\r\n--" + boundary + TWO_HYPHENS + NEW_LINE).getBytes(US_ASCII);
        this.charset = intent.getBooleanExtra(PARAM_UTF8_CHARSET, false) ? Charset.forName(Key.STRING_CHARSET_NAME) : US_ASCII;
        if (this.params.getFiles().size() <= 1) {
            this.httpParams.addRequestHeader("Connection", "close");
        } else {
            this.httpParams.addRequestHeader("Connection", "Keep-Alive");
        }
        this.httpParams.addRequestHeader("Content-Type", "multipart/form-data; boundary=" + boundary);
    }

    @Override // net.gotev.uploadservice.HttpUploadTask
    protected long getBodyLength() throws UnsupportedEncodingException {
        return getRequestParametersLength() + getFilesLength() + this.trailerBytes.length;
    }

    @Override // net.gotev.uploadservice.http.HttpConnection.RequestBodyDelegate
    public void onBodyReady(BodyWriter bodyWriter) throws IOException {
        writeRequestParameters(bodyWriter);
        writeFiles(bodyWriter);
        bodyWriter.write(this.trailerBytes);
    }

    private long getFilesLength() throws UnsupportedEncodingException {
        long total = 0;
        for (UploadFile file : this.params.getFiles()) {
            total += getTotalMultipartBytes(file);
        }
        return total;
    }

    private long getRequestParametersLength() throws UnsupportedEncodingException {
        long parametersBytes = 0;
        if (!this.httpParams.getRequestParameters().isEmpty()) {
            for (NameValue parameter : this.httpParams.getRequestParameters()) {
                parametersBytes += this.boundaryBytes.length + getMultipartBytes(parameter).length;
            }
        }
        return parametersBytes;
    }

    private byte[] getMultipartBytes(NameValue parameter) throws UnsupportedEncodingException {
        return ("Content-Disposition: form-data; name=\"" + parameter.getName() + "\"" + NEW_LINE + NEW_LINE + parameter.getValue()).getBytes(this.charset);
    }

    private byte[] getMultipartHeader(UploadFile file) throws UnsupportedEncodingException {
        String header = "Content-Disposition: form-data; name=\"" + file.getProperty(PROPERTY_PARAM_NAME) + "\"; filename=\"" + file.getProperty(PROPERTY_REMOTE_FILE_NAME) + "\"" + NEW_LINE + "Content-Type: " + file.getProperty(PROPERTY_CONTENT_TYPE) + NEW_LINE + NEW_LINE;
        return header.getBytes(this.charset);
    }

    private long getTotalMultipartBytes(UploadFile file) throws UnsupportedEncodingException {
        return this.boundaryBytes.length + getMultipartHeader(file).length + file.length(this.service);
    }

    private void writeRequestParameters(BodyWriter bodyWriter) throws IOException {
        if (!this.httpParams.getRequestParameters().isEmpty()) {
            for (NameValue parameter : this.httpParams.getRequestParameters()) {
                bodyWriter.write(this.boundaryBytes);
                byte[] formItemBytes = getMultipartBytes(parameter);
                bodyWriter.write(formItemBytes);
                this.uploadedBytes += this.boundaryBytes.length + formItemBytes.length;
                broadcastProgress(this.uploadedBytes, this.totalBytes);
            }
        }
    }

    private void writeFiles(BodyWriter bodyWriter) throws IOException {
        for (UploadFile file : this.params.getFiles()) {
            if (this.shouldContinue) {
                bodyWriter.write(this.boundaryBytes);
                byte[] headerBytes = getMultipartHeader(file);
                bodyWriter.write(headerBytes);
                this.uploadedBytes += this.boundaryBytes.length + headerBytes.length;
                broadcastProgress(this.uploadedBytes, this.totalBytes);
                InputStream stream = file.getStream(this.service);
                bodyWriter.writeStream(stream, this);
                stream.close();
            } else {
                return;
            }
        }
    }

    @Override // net.gotev.uploadservice.UploadTask
    protected void onSuccessfulUpload() {
        for (UploadFile file : this.params.getFiles()) {
            addSuccessfullyUploadedFile(file.getPath());
        }
        this.params.getFiles().clear();
    }
}
