package p000a.p014d;

import java.util.LinkedHashMap;
import java.util.Locale;
/* renamed from: a.d.e */
/* loaded from: classes.dex */
public class C0072e<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f222a;

    /* renamed from: b */
    private int f223b;

    /* renamed from: c */
    private int f224c;

    /* renamed from: d */
    private int f225d;

    /* renamed from: e */
    private int f226e;

    /* renamed from: f */
    private int f227f;

    /* renamed from: g */
    private int f228g;

    /* renamed from: h */
    private int f229h;

    public C0072e(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f224c = i;
        this.f222a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: e */
    private int m9365e(K k, V v) {
        int m9364f = m9364f(k, v);
        if (m9364f >= 0) {
            return m9364f;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: a */
    protected V m9369a(K k) {
        return null;
    }

    /* renamed from: b */
    protected void m9368b(boolean z, K k, V v, V v2) {
    }

    /* renamed from: c */
    public final V m9367c(K k) {
        V put;
        if (k != null) {
            synchronized (this) {
                V v = this.f222a.get(k);
                if (v != null) {
                    this.f228g++;
                    return v;
                }
                this.f229h++;
                V m9369a = m9369a(k);
                if (m9369a == null) {
                    return null;
                }
                synchronized (this) {
                    this.f226e++;
                    put = this.f222a.put(k, m9369a);
                    if (put != null) {
                        this.f222a.put(k, put);
                    } else {
                        this.f223b += m9365e(k, m9369a);
                    }
                }
                if (put != null) {
                    m9368b(false, k, m9369a, put);
                    return put;
                }
                m9363g(this.f224c);
                return m9369a;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: d */
    public final V m9366d(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f225d++;
            this.f223b += m9365e(k, v);
            put = this.f222a.put(k, v);
            if (put != null) {
                this.f223b -= m9365e(k, put);
            }
        }
        if (put != null) {
            m9368b(false, k, put, v);
        }
        m9363g(this.f224c);
        return put;
    }

    /* renamed from: f */
    protected int m9364f(K k, V v) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m9363g(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f223b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f222a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f223b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f223b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f222a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f222a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f222a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f223b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.m9365e(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f223b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f227f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f227f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.m9368b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p014d.C0072e.m9363g(int):void");
    }

    public final synchronized String toString() {
        int i;
        i = this.f228g + this.f229h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f224c), Integer.valueOf(this.f228g), Integer.valueOf(this.f229h), Integer.valueOf(i != 0 ? (this.f228g * 100) / i : 0));
    }
}
