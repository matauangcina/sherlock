package com.google.firebase.database.p122o.p123m;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.firebase.database.o.m.b */
/* loaded from: classes.dex */
public class C2406b extends Reader {

    /* renamed from: f */
    private List<String> f6331f;

    /* renamed from: g */
    private boolean f6332g = false;

    /* renamed from: h */
    private int f6333h;

    /* renamed from: j */
    private int f6335j = this.f6333h;

    /* renamed from: i */
    private int f6334i;

    /* renamed from: k */
    private int f6336k = this.f6334i;

    /* renamed from: l */
    private boolean f6337l = false;

    public C2406b() {
        this.f6331f = null;
        this.f6331f = new ArrayList();
    }

    /* renamed from: b */
    private long m1762b(long j) {
        long j2 = 0;
        while (this.f6334i < this.f6331f.size() && j2 < j) {
            long j3 = j - j2;
            long m1759e = m1759e();
            if (j3 < m1759e) {
                this.f6333h = (int) (this.f6333h + j3);
                j2 += j3;
            } else {
                j2 += m1759e;
                this.f6333h = 0;
                this.f6334i++;
            }
        }
        return j2;
    }

    /* renamed from: c */
    private void m1761c() {
        if (this.f6332g) {
            throw new IOException("Stream already closed");
        }
        if (!this.f6337l) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    /* renamed from: d */
    private String m1760d() {
        if (this.f6334i < this.f6331f.size()) {
            return this.f6331f.get(this.f6334i);
        }
        return null;
    }

    /* renamed from: e */
    private int m1759e() {
        String m1760d = m1760d();
        if (m1760d == null) {
            return 0;
        }
        return m1760d.length() - this.f6333h;
    }

    /* renamed from: a */
    public void m1763a(String str) {
        if (this.f6337l) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() > 0) {
            this.f6331f.add(str);
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m1761c();
        this.f6332g = true;
    }

    /* renamed from: f */
    public void m1758f() {
        if (this.f6337l) {
            throw new IllegalStateException("Trying to freeze frozen StringListReader");
        }
        this.f6337l = true;
    }

    @Override // java.io.Reader
    public void mark(int i) {
        m1761c();
        this.f6335j = this.f6333h;
        this.f6336k = this.f6334i;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        m1761c();
        String m1760d = m1760d();
        if (m1760d == null) {
            return -1;
        }
        char charAt = m1760d.charAt(this.f6333h);
        m1762b(1L);
        return charAt;
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) {
        m1761c();
        int remaining = charBuffer.remaining();
        String m1760d = m1760d();
        int i = 0;
        while (remaining > 0 && m1760d != null) {
            int min = Math.min(m1760d.length() - this.f6333h, remaining);
            int i2 = this.f6333h;
            charBuffer.put(this.f6331f.get(this.f6334i), i2, i2 + min);
            remaining -= min;
            i += min;
            m1762b(min);
            m1760d = m1760d();
        }
        if (i > 0 || m1760d != null) {
            return i;
        }
        return -1;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        m1761c();
        String m1760d = m1760d();
        int i3 = 0;
        while (m1760d != null && i3 < i2) {
            int min = Math.min(m1759e(), i2 - i3);
            int i4 = this.f6333h;
            m1760d.getChars(i4, i4 + min, cArr, i + i3);
            i3 += min;
            m1762b(min);
            m1760d = m1760d();
        }
        if (i3 > 0 || m1760d != null) {
            return i3;
        }
        return -1;
    }

    @Override // java.io.Reader
    public boolean ready() {
        m1761c();
        return true;
    }

    @Override // java.io.Reader
    public void reset() {
        this.f6333h = this.f6335j;
        this.f6334i = this.f6336k;
    }

    @Override // java.io.Reader
    public long skip(long j) {
        m1761c();
        return m1762b(j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f6331f) {
            sb.append(str);
        }
        return sb.toString();
    }
}
