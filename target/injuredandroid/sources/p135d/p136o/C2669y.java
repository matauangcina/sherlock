package p135d.p136o;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.Collections;
import java.util.Map;
import p135d.C2638i;
import p135d.p142s.p144d.C2725g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.o.y */
/* loaded from: classes.dex */
public class C2669y extends C2668x {
    /* renamed from: a */
    public static int m922a(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Reader.READ_DONE;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m921b(C2638i<? extends K, ? extends V> c2638i) {
        C2725g.m881e(c2638i, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(c2638i.m974c(), c2638i.m973d());
        C2725g.m882d(singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m920c(Map<? extends K, ? extends V> map) {
        C2725g.m881e(map, "$this$toSingletonMap");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C2725g.m882d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
