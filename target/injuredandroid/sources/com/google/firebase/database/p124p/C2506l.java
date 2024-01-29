package com.google.firebase.database.p124p;

import com.google.firebase.database.C2307c;
import com.google.firebase.database.p131r.C2570b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* renamed from: com.google.firebase.database.p.l */
/* loaded from: classes.dex */
public class C2506l implements Iterable<C2570b>, Comparable<C2506l> {

    /* renamed from: i */
    private static final C2506l f6529i = new C2506l("");

    /* renamed from: f */
    private final C2570b[] f6530f;

    /* renamed from: g */
    private final int f6531g;

    /* renamed from: h */
    private final int f6532h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.l$a */
    /* loaded from: classes.dex */
    public class C2507a implements Iterator<C2570b> {

        /* renamed from: f */
        int f6533f;

        C2507a() {
            this.f6533f = C2506l.this.f6531g;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public C2570b next() {
            if (hasNext()) {
                C2570b[] c2570bArr = C2506l.this.f6530f;
                int i = this.f6533f;
                C2570b c2570b = c2570bArr[i];
                this.f6533f = i + 1;
                return c2570b;
            }
            throw new NoSuchElementException("No more elements.");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6533f < C2506l.this.f6532h;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }
    }

    public C2506l(String str) {
        String[] split = str.split("/", -1);
        int i = 0;
        for (String str2 : split) {
            if (str2.length() > 0) {
                i++;
            }
        }
        this.f6530f = new C2570b[i];
        int i2 = 0;
        for (String str3 : split) {
            if (str3.length() > 0) {
                this.f6530f[i2] = C2570b.m1162g(str3);
                i2++;
            }
        }
        this.f6531g = 0;
        this.f6532h = this.f6530f.length;
    }

    public C2506l(List<String> list) {
        this.f6530f = new C2570b[list.size()];
        int i = 0;
        for (String str : list) {
            this.f6530f[i] = C2570b.m1162g(str);
            i++;
        }
        this.f6531g = 0;
        this.f6532h = list.size();
    }

    public C2506l(C2570b... c2570bArr) {
        this.f6530f = (C2570b[]) Arrays.copyOf(c2570bArr, c2570bArr.length);
        this.f6531g = 0;
        this.f6532h = c2570bArr.length;
        for (C2570b c2570b : c2570bArr) {
        }
    }

    private C2506l(C2570b[] c2570bArr, int i, int i2) {
        this.f6530f = c2570bArr;
        this.f6531g = i;
        this.f6532h = i2;
    }

    /* renamed from: w */
    public static C2506l m1385w() {
        return f6529i;
    }

    /* renamed from: z */
    public static C2506l m1382z(C2506l c2506l, C2506l c2506l2) {
        C2570b m1384x = c2506l.m1384x();
        C2570b m1384x2 = c2506l2.m1384x();
        if (m1384x == null) {
            return c2506l2;
        }
        if (m1384x.equals(m1384x2)) {
            return m1382z(c2506l.m1396A(), c2506l2.m1396A());
        }
        throw new C2307c("INTERNAL ERROR: " + c2506l2 + " is not contained in " + c2506l);
    }

    /* renamed from: A */
    public C2506l m1396A() {
        int i = this.f6531g;
        if (!isEmpty()) {
            i++;
        }
        return new C2506l(this.f6530f, i, this.f6532h);
    }

    /* renamed from: B */
    public String m1395B() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = this.f6531g; i < this.f6532h; i++) {
            if (i > this.f6531g) {
                sb.append("/");
            }
            sb.append(this.f6530f[i].m1164e());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2506l) {
            if (this == obj) {
                return true;
            }
            C2506l c2506l = (C2506l) obj;
            if (size() != c2506l.size()) {
                return false;
            }
            int i = this.f6531g;
            for (int i2 = c2506l.f6531g; i < this.f6532h && i2 < c2506l.f6532h; i2++) {
                if (!this.f6530f[i].equals(c2506l.f6530f[i2])) {
                    return false;
                }
                i++;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public List<String> m1391g() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<C2570b> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m1164e());
        }
        return arrayList;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = this.f6531g; i2 < this.f6532h; i2++) {
            i = (i * 37) + this.f6530f[i2].hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public C2506l m1390i(C2506l c2506l) {
        int size = size() + c2506l.size();
        C2570b[] c2570bArr = new C2570b[size];
        System.arraycopy(this.f6530f, this.f6531g, c2570bArr, 0, size());
        System.arraycopy(c2506l.f6530f, c2506l.f6531g, c2570bArr, size(), c2506l.size());
        return new C2506l(c2570bArr, 0, size);
    }

    public boolean isEmpty() {
        return this.f6531g >= this.f6532h;
    }

    @Override // java.lang.Iterable
    public Iterator<C2570b> iterator() {
        return new C2507a();
    }

    /* renamed from: l */
    public C2506l m1389l(C2570b c2570b) {
        int size = size();
        int i = size + 1;
        C2570b[] c2570bArr = new C2570b[i];
        System.arraycopy(this.f6530f, this.f6531g, c2570bArr, 0, size);
        c2570bArr[size] = c2570b;
        return new C2506l(c2570bArr, 0, i);
    }

    @Override // java.lang.Comparable
    /* renamed from: m */
    public int compareTo(C2506l c2506l) {
        int i = this.f6531g;
        int i2 = c2506l.f6531g;
        while (i < this.f6532h && i2 < c2506l.f6532h) {
            int compareTo = this.f6530f[i].compareTo(c2506l.f6530f[i2]);
            if (compareTo != 0) {
                return compareTo;
            }
            i++;
            i2++;
        }
        if (i == this.f6532h && i2 == c2506l.f6532h) {
            return 0;
        }
        return i == this.f6532h ? -1 : 1;
    }

    /* renamed from: s */
    public boolean m1387s(C2506l c2506l) {
        if (size() > c2506l.size()) {
            return false;
        }
        int i = this.f6531g;
        int i2 = c2506l.f6531g;
        while (i < this.f6532h) {
            if (!this.f6530f[i].equals(c2506l.f6530f[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public int size() {
        return this.f6532h - this.f6531g;
    }

    public String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = this.f6531g; i < this.f6532h; i++) {
            sb.append("/");
            sb.append(this.f6530f[i].m1164e());
        }
        return sb.toString();
    }

    /* renamed from: u */
    public C2570b m1386u() {
        if (isEmpty()) {
            return null;
        }
        return this.f6530f[this.f6532h - 1];
    }

    /* renamed from: x */
    public C2570b m1384x() {
        if (isEmpty()) {
            return null;
        }
        return this.f6530f[this.f6531g];
    }

    /* renamed from: y */
    public C2506l m1383y() {
        if (isEmpty()) {
            return null;
        }
        return new C2506l(this.f6530f, this.f6531g, this.f6532h - 1);
    }
}
