package p054b.p055a.p056a.p057v;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import p054b.p055a.p056a.AbstractC1094m;
import p054b.p055a.p056a.C1088g;
/* renamed from: b.a.a.v.b */
/* loaded from: classes.dex */
public abstract class AbstractC1112b implements InterfaceC1123i {
    @Override // p054b.p055a.p056a.p057v.InterfaceC1123i
    @Deprecated
    /* renamed from: a */
    public final HttpResponse mo4868a(AbstractC1094m<?> abstractC1094m, Map<String, String> map) {
        C1122h mo4867b = mo4867b(abstractC1094m, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), mo4867b.m4869d(), ""));
        ArrayList arrayList = new ArrayList();
        for (C1088g c1088g : mo4867b.m4870c()) {
            arrayList.add(new BasicHeader(c1088g.m4992a(), c1088g.m4991b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream m4872a = mo4867b.m4872a();
        if (m4872a != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(m4872a);
            basicHttpEntity.setContentLength(mo4867b.m4871b());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    /* renamed from: b */
    public abstract C1122h mo4867b(AbstractC1094m<?> abstractC1094m, Map<String, String> map);
}
