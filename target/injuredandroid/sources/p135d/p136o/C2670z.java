package p135d.p136o;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p135d.C2638i;
import p135d.p142s.p144d.C2725g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.o.z */
/* loaded from: classes.dex */
public class C2670z extends C2669y {
    /* renamed from: d */
    public static final <K, V> Map<K, V> m919d() {
        C2664t c2664t = C2664t.f6824f;
        if (c2664t != null) {
            return c2664t;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static final <K, V> Map<K, V> m918e(Map<K, ? extends V> map) {
        C2725g.m881e(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C2669y.m920c(map) : m919d();
    }

    /* renamed from: f */
    public static final <K, V> void m917f(Map<? super K, ? super V> map, Iterable<? extends C2638i<? extends K, ? extends V>> iterable) {
        C2725g.m881e(map, "$this$putAll");
        C2725g.m881e(iterable, "pairs");
        for (C2638i<? extends K, ? extends V> c2638i : iterable) {
            map.put((K) c2638i.m976a(), (V) c2638i.m975b());
        }
    }

    /* renamed from: g */
    public static <K, V> Map<K, V> m916g(Iterable<? extends C2638i<? extends K, ? extends V>> iterable) {
        C2725g.m881e(iterable, "$this$toMap");
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m915h(iterable, linkedHashMap);
            return m918e(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size != 0) {
            if (size == 1) {
                return C2669y.m921b(iterable instanceof List ? (C2638i<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2667w.m924a(collection.size()));
            m915h(iterable, linkedHashMap2);
            return linkedHashMap2;
        }
        return m919d();
    }

    /* renamed from: h */
    public static final <K, V, M extends Map<? super K, ? super V>> M m915h(Iterable<? extends C2638i<? extends K, ? extends V>> iterable, M m) {
        C2725g.m881e(iterable, "$this$toMap");
        C2725g.m881e(m, "destination");
        m917f(m, iterable);
        return m;
    }
}
