package p054b.p055a.p056a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: b.a.a.k */
/* loaded from: classes.dex */
public class C1092k {

    /* renamed from: a */
    public final byte[] f3752a;

    /* renamed from: b */
    public final Map<String, String> f3753b;

    /* renamed from: c */
    public final List<C1088g> f3754c;

    /* renamed from: d */
    public final boolean f3755d;

    private C1092k(int i, byte[] bArr, Map<String, String> map, List<C1088g> list, boolean z, long j) {
        this.f3752a = bArr;
        this.f3753b = map;
        this.f3754c = list == null ? null : Collections.unmodifiableList(list);
        this.f3755d = z;
    }

    @Deprecated
    public C1092k(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m4985a(map), z, j);
    }

    public C1092k(int i, byte[] bArr, boolean z, long j, List<C1088g> list) {
        this(i, bArr, m4984b(list), list, z, j);
    }

    @Deprecated
    public C1092k(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    /* renamed from: a */
    private static List<C1088g> m4985a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new C1088g(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: b */
    private static Map<String, String> m4984b(List<C1088g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C1088g c1088g : list) {
            treeMap.put(c1088g.m4992a(), c1088g.m4991b());
        }
        return treeMap;
    }
}
