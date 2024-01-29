package p054b.p055a.p056a.p057v;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;
import p054b.p055a.p056a.AbstractC1094m;
import p054b.p055a.p056a.C1088g;
/* renamed from: b.a.a.v.a */
/* loaded from: classes.dex */
class C1111a extends AbstractC1112b {

    /* renamed from: a */
    private final InterfaceC1123i f3802a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1111a(InterfaceC1123i interfaceC1123i) {
        this.f3802a = interfaceC1123i;
    }

    @Override // p054b.p055a.p056a.p057v.AbstractC1112b
    /* renamed from: b */
    public C1122h mo4867b(AbstractC1094m<?> abstractC1094m, Map<String, String> map) {
        try {
            HttpResponse mo4868a = this.f3802a.mo4868a(abstractC1094m, map);
            int statusCode = mo4868a.getStatusLine().getStatusCode();
            Header[] allHeaders = mo4868a.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new C1088g(header.getName(), header.getValue()));
            }
            if (mo4868a.getEntity() == null) {
                return new C1122h(statusCode, arrayList);
            }
            long contentLength = mo4868a.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new C1122h(statusCode, arrayList, (int) mo4868a.getEntity().getContentLength(), mo4868a.getEntity().getContent());
            }
            throw new IOException("Response too large: " + contentLength);
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
