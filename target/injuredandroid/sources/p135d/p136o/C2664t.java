package p135d.p136o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p135d.p142s.p144d.C2725g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.o.t */
/* loaded from: classes.dex */
public final class C2664t implements Map, Serializable {

    /* renamed from: f */
    public static final C2664t f6824f = new C2664t();

    private C2664t() {
    }

    /* renamed from: a */
    public boolean m933a(Void r2) {
        C2725g.m881e(r2, "value");
        return false;
    }

    /* renamed from: b */
    public Void m932b(Object obj) {
        return null;
    }

    /* renamed from: c */
    public Set<Map.Entry> m931c() {
        return C2665u.f6825f;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m933a((Void) obj);
        }
        return false;
    }

    /* renamed from: d */
    public Set<Object> m930d() {
        return C2665u.f6825f;
    }

    /* renamed from: e */
    public int m929e() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return m931c();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public Collection m928f() {
        return C2663s.f6823f;
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        return m932b(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return m930d();
    }

    @Override // java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m929e();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m928f();
    }
}
