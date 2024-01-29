package com.google.firebase.database.p132s;

import android.util.Base64;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: com.google.firebase.database.s.f */
/* loaded from: classes.dex */
class C2619f {

    /* renamed from: a */
    private URI f6787a;

    /* renamed from: b */
    private String f6788b;

    /* renamed from: c */
    private String f6789c;

    /* renamed from: d */
    private Map<String, String> f6790d;

    public C2619f(URI uri, String str, Map<String, String> map) {
        this.f6787a = null;
        this.f6788b = null;
        this.f6789c = null;
        this.f6790d = null;
        this.f6787a = uri;
        this.f6788b = str;
        this.f6790d = map;
        this.f6789c = m1022a();
    }

    /* renamed from: a */
    private String m1022a() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) m1019d(0, 255);
        }
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: b */
    private String m1021b(LinkedHashMap<String, String> linkedHashMap) {
        String str = new String();
        for (String str2 : linkedHashMap.keySet()) {
            str = str + str2 + ": " + linkedHashMap.get(str2) + "\r\n";
        }
        return str;
    }

    /* renamed from: d */
    private int m1019d(int i, int i2) {
        return (int) ((Math.random() * i2) + i);
    }

    /* renamed from: c */
    public byte[] m1020c() {
        String path = this.f6787a.getPath();
        String query = this.f6787a.getQuery();
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append(query == null ? "" : "?" + query);
        String sb2 = sb.toString();
        String host = this.f6787a.getHost();
        if (this.f6787a.getPort() != -1) {
            host = host + ":" + this.f6787a.getPort();
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.f6789c);
        String str = this.f6788b;
        if (str != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", str);
        }
        Map<String, String> map = this.f6790d;
        if (map != null) {
            for (String str2 : map.keySet()) {
                if (!linkedHashMap.containsKey(str2)) {
                    linkedHashMap.put(str2, this.f6790d.get(str2));
                }
            }
        }
        byte[] bytes = ((("GET " + sb2 + " HTTP/1.1\r\n") + m1021b(linkedHashMap)) + "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    /* renamed from: e */
    public void m1018e(HashMap<String, String> hashMap) {
        if (!"websocket".equals(hashMap.get("upgrade"))) {
            throw new C2618e("connection failed: missing header field in server handshake: Upgrade");
        }
        if (!"upgrade".equals(hashMap.get("connection"))) {
            throw new C2618e("connection failed: missing header field in server handshake: Connection");
        }
    }

    /* renamed from: f */
    public void m1017f(String str) {
        int parseInt = Integer.parseInt(str.substring(9, 12));
        if (parseInt == 407) {
            throw new C2618e("connection failed: proxy authentication not supported");
        }
        if (parseInt == 404) {
            throw new C2618e("connection failed: 404 not found");
        }
        if (parseInt == 101) {
            return;
        }
        throw new C2618e("connection failed: unknown status code " + parseInt);
    }
}
