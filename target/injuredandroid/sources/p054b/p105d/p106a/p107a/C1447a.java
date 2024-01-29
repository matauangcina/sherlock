package p054b.p105d.p106a.p107a;

import io.flutter.embedding.engine.p152h.InterfaceC2849a;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import javax.net.ssl.HttpsURLConnection;
import p108c.p109a.p110c.p111a.C1515h;
import p108c.p109a.p110c.p111a.C1516i;
import p135d.p136o.C2654j;
import p135d.p136o.C2661q;
import p135d.p142s.p144d.C2725g;
import p135d.p142s.p144d.C2733o;
import p135d.p148w.C2763e;
/* renamed from: b.d.a.a.a */
/* loaded from: classes.dex */
public final class C1447a implements C1516i.InterfaceC1520c, InterfaceC2849a {

    /* renamed from: a */
    private C1516i f4377a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.d.a.a.a$a */
    /* loaded from: classes.dex */
    public static final class C1448a<T, U> implements BiConsumer<String, String> {

        /* renamed from: a */
        final /* synthetic */ HttpsURLConnection f4378a;

        C1448a(HttpsURLConnection httpsURLConnection) {
            this.f4378a = httpsURLConnection;
        }

        @Override // java.util.function.BiConsumer
        /* renamed from: a */
        public final void accept(String str, String str2) {
            C2725g.m881e(str, "key");
            C2725g.m881e(str2, "value");
            this.f4378a.setRequestProperty(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.d.a.a.a$b */
    /* loaded from: classes.dex */
    public static final class C1449b<T> implements Supplier<Boolean> {

        /* renamed from: b */
        final /* synthetic */ String f4380b;

        /* renamed from: c */
        final /* synthetic */ List f4381c;

        /* renamed from: d */
        final /* synthetic */ Map f4382d;

        /* renamed from: e */
        final /* synthetic */ int f4383e;

        /* renamed from: f */
        final /* synthetic */ String f4384f;

        C1449b(String str, List list, Map map, int i, String str2) {
            this.f4380b = str;
            this.f4381c = list;
            this.f4382d = map;
            this.f4383e = i;
            this.f4384f = str2;
        }

        @Override // java.util.function.Supplier
        /* renamed from: a */
        public final Boolean get() {
            return Boolean.valueOf(C1447a.this.m4158a(this.f4380b, this.f4381c, this.f4382d, this.f4383e, this.f4384f));
        }
    }

    /* renamed from: d */
    private final String m4157d(String str, int i, Map<String, String> map, String str2) {
        URLConnection openConnection = new URL(str).openConnection();
        if (openConnection != null) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            map.forEach(new C1448a(httpsURLConnection));
            httpsURLConnection.connect();
            Certificate certificate = httpsURLConnection.getServerCertificates()[0];
            if (certificate != null) {
                httpsURLConnection.disconnect();
                byte[] encoded = certificate.getEncoded();
                C2725g.m882d(encoded, "cert.getEncoded()");
                return m4155g(str2, encoded);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.Certificate");
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
    }

    /* renamed from: e */
    private final void m4156e(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        Object obj = c1515h.f4548b;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Any> /* = java.util.HashMap<kotlin.String, kotlin.Any> */");
        }
        HashMap hashMap = (HashMap) obj;
        Object obj2 = hashMap.get("url");
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str = (String) obj2;
        Object obj3 = hashMap.get("fingerprints");
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        }
        List list = (List) obj3;
        Object obj4 = hashMap.get("headers");
        if (obj4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        }
        Map map = (Map) obj4;
        Object obj5 = hashMap.get("timeout");
        if (obj5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        int intValue = ((Integer) obj5).intValue();
        Object obj6 = hashMap.get("type");
        if (obj6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj7 = CompletableFuture.supplyAsync(new C1449b(str, list, map, intValue, (String) obj6)).get();
        C2725g.m882d(obj7, "CompletableFuture.supply…s, timeout, type) }.get()");
        if (((Boolean) obj7).booleanValue()) {
            interfaceC1521d.mo419c("CONNECTION_SECURE");
        } else {
            interfaceC1521d.mo420b("CONNECTION_NOT_SECURE", "Connection is not secure", "Fingerprint doesn't match");
        }
    }

    /* renamed from: g */
    private final String m4155g(String str, byte[] bArr) {
        String m944k;
        byte[] digest = MessageDigest.getInstance(str).digest(bArr);
        C2725g.m882d(digest, "MessageDigest\n          …           .digest(input)");
        ArrayList arrayList = new ArrayList(digest.length);
        for (byte b : digest) {
            C2733o c2733o = C2733o.f6855a;
            String format = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            C2725g.m882d(format, "java.lang.String.format(format, *args)");
            arrayList.add(format);
        }
        m944k = C2661q.m944k(arrayList, "", null, null, 0, null, null, 62, null);
        return m944k;
    }

    /* renamed from: a */
    public final boolean m4158a(String str, List<String> list, Map<String, String> map, int i, String str2) {
        int m948g;
        C2725g.m881e(str, "serverURL");
        C2725g.m881e(list, "allowedFingerprints");
        C2725g.m881e(map, "httpHeaderArgs");
        C2725g.m881e(str2, "type");
        String m4157d = m4157d(str, i, map, str2);
        m948g = C2654j.m948g(list, 10);
        ArrayList arrayList = new ArrayList(m948g);
        for (String str3 : list) {
            if (str3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String upperCase = str3.toUpperCase();
            C2725g.m882d(upperCase, "(this as java.lang.String).toUpperCase()");
            arrayList.add(new C2763e("\\s").m818a(upperCase, ""));
        }
        return arrayList.contains(m4157d);
    }

    @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1520c
    /* renamed from: b */
    public void mo160b(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        C2725g.m881e(c1515h, "call");
        C2725g.m881e(interfaceC1521d, "result");
        try {
            String str = c1515h.f4547a;
            if (str != null && str.hashCode() == 94627080 && str.equals("check")) {
                m4156e(c1515h, interfaceC1521d);
            }
            interfaceC1521d.mo421a();
        } catch (Exception e) {
            interfaceC1521d.mo420b(e.toString(), "", "");
        }
    }

    @Override // io.flutter.embedding.engine.p152h.InterfaceC2849a
    /* renamed from: c */
    public void mo152c(InterfaceC2849a.C2851b c2851b) {
        C2725g.m881e(c2851b, "flutterPluginBinding");
        C1516i c1516i = new C1516i(c2851b.m521c().m605h(), "ssl_pinning_plugin");
        this.f4377a = c1516i;
        if (c1516i != null) {
            c1516i.m4034e(this);
        } else {
            C2725g.m872n("channel");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.p152h.InterfaceC2849a
    /* renamed from: f */
    public void mo151f(InterfaceC2849a.C2851b c2851b) {
        C2725g.m881e(c2851b, "binding");
        C1516i c1516i = this.f4377a;
        if (c1516i != null) {
            c1516i.m4034e(null);
        } else {
            C2725g.m872n("channel");
            throw null;
        }
    }
}
