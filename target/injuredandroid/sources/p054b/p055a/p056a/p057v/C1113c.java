package p054b.p055a.p056a.p057v;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p054b.p055a.p056a.AbstractC1094m;
import p054b.p055a.p056a.C1088g;
import p054b.p055a.p056a.C1105r;
import p054b.p055a.p056a.C1107t;
import p054b.p055a.p056a.C1108u;
import p054b.p055a.p056a.InterfaceC1078b;
import p054b.p055a.p056a.InterfaceC1089h;
import p054b.p055a.p056a.InterfaceC1104q;
/* renamed from: b.a.a.v.c */
/* loaded from: classes.dex */
public class C1113c implements InterfaceC1089h {

    /* renamed from: c */
    protected static final boolean f3803c = C1108u.f3794b;

    /* renamed from: a */
    private final AbstractC1112b f3804a;

    /* renamed from: b */
    protected final C1114d f3805b;

    public C1113c(AbstractC1112b abstractC1112b) {
        this(abstractC1112b, new C1114d(4096));
    }

    public C1113c(AbstractC1112b abstractC1112b, C1114d c1114d) {
        this.f3804a = abstractC1112b;
        this.f3805b = c1114d;
    }

    @Deprecated
    public C1113c(InterfaceC1123i interfaceC1123i) {
        this(interfaceC1123i, new C1114d(4096));
    }

    @Deprecated
    public C1113c(InterfaceC1123i interfaceC1123i, C1114d c1114d) {
        this.f3804a = new C1111a(interfaceC1123i);
        this.f3805b = c1114d;
    }

    /* renamed from: b */
    private static void m4919b(String str, AbstractC1094m<?> abstractC1094m, C1107t c1107t) {
        InterfaceC1104q m4975I = abstractC1094m.m4975I();
        int m4974J = abstractC1094m.m4974J();
        try {
            m4975I.mo4932a(c1107t);
            abstractC1094m.m4957e(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(m4974J)));
        } catch (C1107t e) {
            abstractC1094m.m4957e(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(m4974J)));
            throw e;
        }
    }

    /* renamed from: c */
    private static List<C1088g> m4918c(List<C1088g> list, InterfaceC1078b.C1079a c1079a) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (C1088g c1088g : list) {
                treeSet.add(c1088g.m4992a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<C1088g> list2 = c1079a.f3724h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (C1088g c1088g2 : c1079a.f3724h) {
                    if (!treeSet.contains(c1088g2.m4992a())) {
                        arrayList.add(c1088g2);
                    }
                }
            }
        } else if (!c1079a.f3723g.isEmpty()) {
            for (Map.Entry<String, String> entry : c1079a.f3723g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new C1088g(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private Map<String, String> m4917d(InterfaceC1078b.C1079a c1079a) {
        if (c1079a == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = c1079a.f3718b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j = c1079a.f3720d;
        if (j > 0) {
            hashMap.put("If-Modified-Since", C1121g.m4880a(j));
        }
        return hashMap;
    }

    /* renamed from: e */
    private byte[] m4916e(InputStream inputStream, int i) {
        C1127k c1127k = new C1127k(this.f3805b, i);
        try {
            if (inputStream != null) {
                byte[] m4914a = this.f3805b.m4914a(1024);
                while (true) {
                    int read = inputStream.read(m4914a);
                    if (read == -1) {
                        break;
                    }
                    c1127k.write(m4914a, 0, read);
                }
                byte[] byteArray = c1127k.toByteArray();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        C1108u.m4924e("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.f3805b.m4913b(m4914a);
                c1127k.close();
                return byteArray;
            }
            throw new C1105r();
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    C1108u.m4924e("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.f3805b.m4913b(null);
            c1127k.close();
            throw th;
        }
    }

    /* renamed from: f */
    private void m4915f(long j, AbstractC1094m<?> abstractC1094m, byte[] bArr, int i) {
        if (f3803c || j > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = abstractC1094m;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(abstractC1094m.m4975I().mo4930c());
            C1108u.m4927b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
        throw new java.io.IOException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v5 */
    @Override // p054b.p055a.p056a.InterfaceC1089h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p054b.p055a.p056a.C1092k mo4920a(p054b.p055a.p056a.AbstractC1094m<?> r29) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p054b.p055a.p056a.p057v.C1113c.mo4920a(b.a.a.m):b.a.a.k");
    }
}
