package p054b.p055a.p056a.p057v;

import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p054b.p055a.p056a.AbstractC1094m;
import p054b.p055a.p056a.C1088g;
/* renamed from: b.a.a.v.j */
/* loaded from: classes.dex */
public class C1124j extends AbstractC1112b {

    /* renamed from: a */
    private final InterfaceC1126b f3830a;

    /* renamed from: b */
    private final SSLSocketFactory f3831b;

    /* renamed from: b.a.a.v.j$a */
    /* loaded from: classes.dex */
    static class C1125a extends FilterInputStream {

        /* renamed from: f */
        private final HttpURLConnection f3832f;

        C1125a(HttpURLConnection httpURLConnection) {
            super(C1124j.m4860i(httpURLConnection));
            this.f3832f = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            this.f3832f.disconnect();
        }
    }

    /* renamed from: b.a.a.v.j$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1126b {
        /* renamed from: a */
        String m4857a(String str);
    }

    public C1124j() {
        this(null);
    }

    public C1124j(InterfaceC1126b interfaceC1126b) {
        this(interfaceC1126b, null);
    }

    public C1124j(InterfaceC1126b interfaceC1126b, SSLSocketFactory sSLSocketFactory) {
        this.f3830a = interfaceC1126b;
        this.f3831b = sSLSocketFactory;
    }

    /* renamed from: d */
    private static void m4865d(HttpURLConnection httpURLConnection, AbstractC1094m<?> abstractC1094m, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", abstractC1094m.m4950w());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    /* renamed from: e */
    private static void m4864e(HttpURLConnection httpURLConnection, AbstractC1094m<?> abstractC1094m) {
        byte[] m4951u = abstractC1094m.m4951u();
        if (m4951u != null) {
            m4865d(httpURLConnection, abstractC1094m, m4951u);
        }
    }

    /* renamed from: f */
    static List<C1088g> m4863f(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new C1088g(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static boolean m4861h(int i, int i2) {
        return (i == 4 || (100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static InputStream m4860i(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* renamed from: j */
    private HttpURLConnection m4859j(URL url, AbstractC1094m<?> abstractC1094m) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection m4862g = m4862g(url);
        int m4974J = abstractC1094m.m4974J();
        m4862g.setConnectTimeout(m4974J);
        m4862g.setReadTimeout(m4974J);
        m4862g.setUseCaches(false);
        m4862g.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f3831b) != null) {
            ((HttpsURLConnection) m4862g).setSSLSocketFactory(sSLSocketFactory);
        }
        return m4862g;
    }

    /* renamed from: k */
    static void m4858k(HttpURLConnection httpURLConnection, AbstractC1094m<?> abstractC1094m) {
        String str;
        String str2;
        switch (abstractC1094m.m4983A()) {
            case -1:
                byte[] m4980D = abstractC1094m.m4980D();
                if (m4980D != null) {
                    httpURLConnection.setRequestMethod("POST");
                    m4865d(httpURLConnection, abstractC1094m, m4980D);
                    return;
                }
                return;
            case 0:
                str = "GET";
                httpURLConnection.setRequestMethod(str);
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m4864e(httpURLConnection, abstractC1094m);
                return;
            case 2:
                str2 = "PUT";
                httpURLConnection.setRequestMethod(str2);
                m4864e(httpURLConnection, abstractC1094m);
                return;
            case 3:
                str = "DELETE";
                httpURLConnection.setRequestMethod(str);
                return;
            case 4:
                str = "HEAD";
                httpURLConnection.setRequestMethod(str);
                return;
            case 5:
                str = "OPTIONS";
                httpURLConnection.setRequestMethod(str);
                return;
            case 6:
                str = "TRACE";
                httpURLConnection.setRequestMethod(str);
                return;
            case 7:
                str2 = "PATCH";
                httpURLConnection.setRequestMethod(str2);
                m4864e(httpURLConnection, abstractC1094m);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    @Override // p054b.p055a.p056a.p057v.AbstractC1112b
    /* renamed from: b */
    public C1122h mo4867b(AbstractC1094m<?> abstractC1094m, Map<String, String> map) {
        String m4972L = abstractC1094m.m4972L();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(abstractC1094m.m4947z());
        InterfaceC1126b interfaceC1126b = this.f3830a;
        if (interfaceC1126b != null) {
            String m4857a = interfaceC1126b.m4857a(m4972L);
            if (m4857a == null) {
                throw new IOException("URL blocked by rewriter: " + m4972L);
            }
            m4972L = m4857a;
        }
        HttpURLConnection m4859j = m4859j(new URL(m4972L), abstractC1094m);
        try {
            for (String str : hashMap.keySet()) {
                m4859j.setRequestProperty(str, (String) hashMap.get(str));
            }
            m4858k(m4859j, abstractC1094m);
            int responseCode = m4859j.getResponseCode();
            if (responseCode != -1) {
                if (m4861h(abstractC1094m.m4983A(), responseCode)) {
                    return new C1122h(responseCode, m4863f(m4859j.getHeaderFields()), m4859j.getContentLength(), new C1125a(m4859j));
                }
                C1122h c1122h = new C1122h(responseCode, m4863f(m4859j.getHeaderFields()));
                m4859j.disconnect();
                return c1122h;
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th) {
            if (0 == 0) {
                m4859j.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: g */
    protected HttpURLConnection m4862g(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }
}
