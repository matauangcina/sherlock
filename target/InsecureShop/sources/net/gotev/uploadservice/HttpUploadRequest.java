package net.gotev.uploadservice;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import net.gotev.uploadservice.HttpUploadRequest;
/* loaded from: classes.dex */
public abstract class HttpUploadRequest<B extends HttpUploadRequest<B>> extends UploadRequest<B> {
    protected final HttpUploadTaskParameters httpParams;

    public HttpUploadRequest(Context context, String uploadId, String serverUrl) throws MalformedURLException, IllegalArgumentException {
        super(context, uploadId, serverUrl);
        this.httpParams = new HttpUploadTaskParameters();
        if (!this.params.getServerUrl().startsWith("http://") && !this.params.getServerUrl().startsWith("https://")) {
            throw new IllegalArgumentException("Specify either http:// or https:// as protocol");
        }
        new URL(this.params.getServerUrl());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.gotev.uploadservice.UploadRequest
    public void initializeIntent(Intent intent) {
        super.initializeIntent(intent);
        intent.putExtra("httpTaskParameters", this.httpParams);
    }

    public B addHeader(String headerName, String headerValue) {
        this.httpParams.addRequestHeader(headerName, headerValue);
        return (B) self();
    }

    public B setBasicAuth(String username, String password) {
        String auth = Base64.encodeToString((username + ":" + password).getBytes(), 2);
        HttpUploadTaskParameters httpUploadTaskParameters = this.httpParams;
        httpUploadTaskParameters.addRequestHeader("Authorization", "Basic " + auth);
        return (B) self();
    }

    public B addParameter(String paramName, String paramValue) {
        this.httpParams.addRequestParameter(paramName, paramValue);
        return (B) self();
    }

    public B addArrayParameter(String paramName, String... array) {
        for (String value : array) {
            this.httpParams.addRequestParameter(paramName, value);
        }
        return (B) self();
    }

    public B addArrayParameter(String paramName, List<String> list) {
        for (String value : list) {
            this.httpParams.addRequestParameter(paramName, value);
        }
        return (B) self();
    }

    public B setMethod(String method) {
        this.httpParams.setMethod(method);
        return (B) self();
    }

    public B setCustomUserAgent(String customUserAgent) {
        this.httpParams.setCustomUserAgent(customUserAgent);
        return (B) self();
    }

    public B setUsesFixedLengthStreamingMode(boolean fixedLength) {
        this.httpParams.setUsesFixedLengthStreamingMode(fixedLength);
        return (B) self();
    }
}
