package p135d.p142s.p144d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p135d.C2638i;
import p135d.C2640k;
import p135d.p136o.C2651g;
import p135d.p136o.C2653i;
import p135d.p136o.C2654j;
import p135d.p136o.C2669y;
import p135d.p136o.C2670z;
import p135d.p142s.C2693a;
import p135d.p142s.p143c.InterfaceC2695a;
import p135d.p142s.p143c.InterfaceC2696b;
import p135d.p142s.p143c.InterfaceC2697c;
import p135d.p142s.p143c.InterfaceC2698d;
import p135d.p142s.p143c.InterfaceC2699e;
import p135d.p142s.p143c.InterfaceC2700f;
import p135d.p142s.p143c.InterfaceC2701g;
import p135d.p142s.p143c.InterfaceC2702h;
import p135d.p142s.p143c.InterfaceC2703i;
import p135d.p142s.p143c.InterfaceC2704j;
import p135d.p142s.p143c.InterfaceC2705k;
import p135d.p142s.p143c.InterfaceC2706l;
import p135d.p142s.p143c.InterfaceC2707m;
import p135d.p142s.p143c.InterfaceC2708n;
import p135d.p142s.p143c.InterfaceC2709o;
import p135d.p142s.p143c.InterfaceC2710p;
import p135d.p142s.p143c.InterfaceC2711q;
import p135d.p142s.p143c.InterfaceC2712r;
import p135d.p142s.p143c.InterfaceC2713s;
import p135d.p142s.p143c.InterfaceC2714t;
import p135d.p142s.p143c.InterfaceC2715u;
import p135d.p142s.p143c.InterfaceC2716v;
import p135d.p142s.p143c.InterfaceC2717w;
import p135d.p146u.InterfaceC2743b;
import p135d.p148w.C2776p;
/* renamed from: d.s.d.c */
/* loaded from: classes.dex */
public final class C2721c implements InterfaceC2743b<Object>, InterfaceC2720b {

    /* renamed from: b */
    private static final Map<Class<? extends Object<?>>, Integer> f6847b;

    /* renamed from: c */
    private static final HashMap<String, String> f6848c;

    /* renamed from: d */
    private static final HashMap<String, String> f6849d;

    /* renamed from: e */
    private static final HashMap<String, String> f6850e;

    /* renamed from: a */
    private final Class<?> f6851a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List m951d;
        int m948g;
        Map<Class<? extends Object<?>>, Integer> m916g;
        int m922a;
        String m798G;
        String m798G2;
        int i = 0;
        m951d = C2653i.m951d(InterfaceC2695a.class, InterfaceC2706l.class, InterfaceC2710p.class, InterfaceC2711q.class, InterfaceC2712r.class, InterfaceC2713s.class, InterfaceC2714t.class, InterfaceC2715u.class, InterfaceC2716v.class, InterfaceC2717w.class, InterfaceC2696b.class, InterfaceC2697c.class, InterfaceC2698d.class, InterfaceC2699e.class, InterfaceC2700f.class, InterfaceC2701g.class, InterfaceC2702h.class, InterfaceC2703i.class, InterfaceC2704j.class, InterfaceC2705k.class, InterfaceC2707m.class, InterfaceC2708n.class, InterfaceC2709o.class);
        m948g = C2654j.m948g(m951d, 10);
        ArrayList arrayList = new ArrayList(m948g);
        for (Object obj : m951d) {
            int i2 = i + 1;
            if (i < 0) {
                C2651g.m960f();
                throw null;
            } else {
                arrayList.add(C2640k.m971a((Class) obj, Integer.valueOf(i)));
                i = i2;
            }
        }
        m916g = C2670z.m916g(arrayList);
        f6847b = m916g;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f6848c = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f6849d = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(f6848c);
        hashMap3.putAll(f6849d);
        Collection<String> values = f6848c.values();
        C2725g.m882d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C2725g.m882d(str, "kotlinName");
            m798G2 = C2776p.m798G(str, '.', null, 2, null);
            sb.append(m798G2);
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C2638i m971a = C2640k.m971a(sb2, str + ".Companion");
            hashMap3.put(m971a.m974c(), m971a.m973d());
        }
        for (Map.Entry<Class<? extends Object<?>>, Integer> entry : f6847b.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f6850e = hashMap3;
        m922a = C2669y.m922a(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m922a);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            m798G = C2776p.m798G((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, m798G);
        }
    }

    public C2721c(Class<?> cls) {
        C2725g.m881e(cls, "jClass");
        this.f6851a = cls;
    }

    @Override // p135d.p142s.p144d.InterfaceC2720b
    /* renamed from: a */
    public Class<?> mo871a() {
        return this.f6851a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2721c) && C2725g.m885a(C2693a.m894a(this), C2693a.m894a((InterfaceC2743b) obj));
    }

    public int hashCode() {
        return C2693a.m894a(this).hashCode();
    }

    public String toString() {
        return mo871a().toString() + " (Kotlin reflection is not available)";
    }
}
