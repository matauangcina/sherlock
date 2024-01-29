package net.gotev.uploadservice.http;

import java.io.IOException;
import java.util.List;
import net.gotev.uploadservice.NameValue;
import net.gotev.uploadservice.ServerResponse;
/* loaded from: classes.dex */
public interface HttpConnection {

    /* loaded from: classes.dex */
    public interface RequestBodyDelegate {
        void onBodyReady(BodyWriter bodyWriter) throws IOException;
    }

    void close();

    ServerResponse getResponse(RequestBodyDelegate requestBodyDelegate) throws IOException;

    HttpConnection setHeaders(List<NameValue> list) throws IOException;

    HttpConnection setTotalBodyBytes(long j, boolean z);
}
