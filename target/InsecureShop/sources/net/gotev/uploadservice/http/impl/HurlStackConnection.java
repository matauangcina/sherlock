package net.gotev.uploadservice.http.impl;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import net.gotev.uploadservice.Logger;
import net.gotev.uploadservice.NameValue;
import net.gotev.uploadservice.ServerResponse;
import net.gotev.uploadservice.UploadService;
import net.gotev.uploadservice.http.HttpConnection;
/* loaded from: classes.dex */
public class HurlStackConnection implements HttpConnection {
    private static final String LOG_TAG = HurlStackConnection.class.getSimpleName();
    private HttpURLConnection mConnection;

    public HurlStackConnection(String method, String url, boolean followRedirects, boolean useCaches, int connectTimeout, int readTimeout) throws IOException {
        Logger.debug(getClass().getSimpleName(), "creating new connection");
        URL urlObj = new URL(url);
        if (urlObj.getProtocol().equals("https")) {
            this.mConnection = (HttpsURLConnection) urlObj.openConnection();
        } else {
            this.mConnection = (HttpURLConnection) urlObj.openConnection();
        }
        this.mConnection.setDoInput(true);
        this.mConnection.setDoOutput(true);
        this.mConnection.setConnectTimeout(connectTimeout);
        this.mConnection.setReadTimeout(readTimeout);
        this.mConnection.setUseCaches(useCaches);
        this.mConnection.setInstanceFollowRedirects(followRedirects);
        this.mConnection.setRequestMethod(method);
    }

    @Override // net.gotev.uploadservice.http.HttpConnection
    public HttpConnection setHeaders(List<NameValue> requestHeaders) throws IOException {
        for (NameValue param : requestHeaders) {
            this.mConnection.setRequestProperty(param.getName(), param.getValue());
        }
        return this;
    }

    @Override // net.gotev.uploadservice.http.HttpConnection
    public HttpConnection setTotalBodyBytes(long totalBodyBytes, boolean isFixedLengthStreamingMode) {
        if (isFixedLengthStreamingMode) {
            if (Build.VERSION.SDK_INT >= 19) {
                this.mConnection.setFixedLengthStreamingMode(totalBodyBytes);
            } else if (totalBodyBytes > 2147483647L) {
                throw new RuntimeException("You need Android API version 19 or newer to upload more than 2GB in a single request using fixed size content length. Try switching to chunked mode instead, but make sure your server side supports it!");
            } else {
                this.mConnection.setFixedLengthStreamingMode((int) totalBodyBytes);
            }
        } else {
            this.mConnection.setChunkedStreamingMode(0);
        }
        return this;
    }

    private byte[] getServerResponseBody() throws IOException {
        InputStream stream = null;
        try {
            stream = this.mConnection.getResponseCode() / 100 == 2 ? this.mConnection.getInputStream() : this.mConnection.getErrorStream();
            return getResponseBodyAsByteArray(stream);
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (Exception exc) {
                    Logger.error(LOG_TAG, "Error while closing server response stream", exc);
                }
            }
        }
    }

    private byte[] getResponseBodyAsByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[UploadService.BUFFER_SIZE];
        while (true) {
            try {
                int bytesRead = inputStream.read(buffer, 0, buffer.length);
                if (bytesRead <= 0) {
                    break;
                }
                byteStream.write(buffer, 0, bytesRead);
            } catch (Exception e) {
            }
        }
        return byteStream.toByteArray();
    }

    private LinkedHashMap<String, String> getServerResponseHeaders() throws IOException {
        Map<String, List<String>> headers = this.mConnection.getHeaderFields();
        if (headers == null) {
            return null;
        }
        LinkedHashMap<String, String> out = new LinkedHashMap<>(headers.size());
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            if (entry.getKey() != null) {
                StringBuilder headerValue = new StringBuilder();
                for (String value : entry.getValue()) {
                    headerValue.append(value);
                }
                out.put(entry.getKey(), headerValue.toString());
            }
        }
        return out;
    }

    @Override // net.gotev.uploadservice.http.HttpConnection
    public ServerResponse getResponse(HttpConnection.RequestBodyDelegate delegate) throws IOException {
        HurlBodyWriter bodyWriter = new HurlBodyWriter(this.mConnection.getOutputStream());
        delegate.onBodyReady(bodyWriter);
        bodyWriter.flush();
        return new ServerResponse(this.mConnection.getResponseCode(), getServerResponseBody(), getServerResponseHeaders());
    }

    @Override // net.gotev.uploadservice.http.HttpConnection
    public void close() {
        Logger.debug(getClass().getSimpleName(), "closing connection");
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (Exception e) {
            }
            try {
                this.mConnection.getOutputStream().flush();
                this.mConnection.getOutputStream().close();
            } catch (Exception e2) {
            }
            try {
                this.mConnection.disconnect();
            } catch (Exception exc) {
                Logger.error(LOG_TAG, "Error while closing connection", exc);
            }
        }
    }
}
