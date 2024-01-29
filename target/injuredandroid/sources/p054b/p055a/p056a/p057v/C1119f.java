package p054b.p055a.p056a.p057v;

import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import p054b.p055a.p056a.AbstractC1094m;
@Deprecated
/* renamed from: b.a.a.v.f */
/* loaded from: classes.dex */
public class C1119f implements InterfaceC1123i {

    /* renamed from: a */
    protected final HttpClient f3825a;

    /* renamed from: b.a.a.v.f$a */
    /* loaded from: classes.dex */
    public static final class C1120a extends HttpEntityEnclosingRequestBase {
        public C1120a(String str) {
            setURI(URI.create(str));
        }

        public String getMethod() {
            return "PATCH";
        }
    }

    public C1119f(HttpClient httpClient) {
        this.f3825a = httpClient;
    }

    /* renamed from: b */
    static HttpUriRequest m4884b(AbstractC1094m<?> abstractC1094m, Map<String, String> map) {
        switch (abstractC1094m.m4983A()) {
            case -1:
                byte[] m4980D = abstractC1094m.m4980D();
                if (m4980D != null) {
                    HttpPost httpPost = new HttpPost(abstractC1094m.m4972L());
                    httpPost.addHeader("Content-Type", abstractC1094m.m4979E());
                    httpPost.setEntity(new ByteArrayEntity(m4980D));
                    return httpPost;
                }
                return new HttpGet(abstractC1094m.m4972L());
            case 0:
                return new HttpGet(abstractC1094m.m4972L());
            case 1:
                HttpPost httpPost2 = new HttpPost(abstractC1094m.m4972L());
                httpPost2.addHeader("Content-Type", abstractC1094m.m4950w());
                m4882d(httpPost2, abstractC1094m);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(abstractC1094m.m4972L());
                httpPut.addHeader("Content-Type", abstractC1094m.m4950w());
                m4882d(httpPut, abstractC1094m);
                return httpPut;
            case 3:
                return new HttpDelete(abstractC1094m.m4972L());
            case 4:
                return new HttpHead(abstractC1094m.m4972L());
            case 5:
                return new HttpOptions(abstractC1094m.m4972L());
            case 6:
                return new HttpTrace(abstractC1094m.m4972L());
            case 7:
                C1120a c1120a = new C1120a(abstractC1094m.m4972L());
                c1120a.addHeader("Content-Type", abstractC1094m.m4950w());
                m4882d(c1120a, abstractC1094m);
                return c1120a;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    /* renamed from: d */
    private static void m4882d(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, AbstractC1094m<?> abstractC1094m) {
        byte[] m4951u = abstractC1094m.m4951u();
        if (m4951u != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(m4951u));
        }
    }

    /* renamed from: e */
    private static void m4881e(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    @Override // p054b.p055a.p056a.p057v.InterfaceC1123i
    /* renamed from: a */
    public HttpResponse mo4868a(AbstractC1094m<?> abstractC1094m, Map<String, String> map) {
        HttpUriRequest m4884b = m4884b(abstractC1094m, map);
        m4881e(m4884b, map);
        m4881e(m4884b, abstractC1094m.m4947z());
        m4883c(m4884b);
        HttpParams params = m4884b.getParams();
        int m4974J = abstractC1094m.m4974J();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, m4974J);
        return this.f3825a.execute(m4884b);
    }

    /* renamed from: c */
    protected void m4883c(HttpUriRequest httpUriRequest) {
    }
}
