package p054b.p055a.p056a.p057v;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* renamed from: b.a.a.v.d */
/* loaded from: classes.dex */
public class C1114d {

    /* renamed from: e */
    protected static final Comparator<byte[]> f3806e = new C1115a();

    /* renamed from: a */
    private final List<byte[]> f3807a = new ArrayList();

    /* renamed from: b */
    private final List<byte[]> f3808b = new ArrayList(64);

    /* renamed from: c */
    private int f3809c = 0;

    /* renamed from: d */
    private final int f3810d;

    /* renamed from: b.a.a.v.d$a */
    /* loaded from: classes.dex */
    class C1115a implements Comparator<byte[]> {
        C1115a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public C1114d(int i) {
        this.f3810d = i;
    }

    /* renamed from: c */
    private synchronized void m4912c() {
        while (this.f3809c > this.f3810d) {
            byte[] remove = this.f3807a.remove(0);
            this.f3808b.remove(remove);
            this.f3809c -= remove.length;
        }
    }

    /* renamed from: a */
    public synchronized byte[] m4914a(int i) {
        for (int i2 = 0; i2 < this.f3808b.size(); i2++) {
            byte[] bArr = this.f3808b.get(i2);
            if (bArr.length >= i) {
                this.f3809c -= bArr.length;
                this.f3808b.remove(i2);
                this.f3807a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* renamed from: b */
    public synchronized void m4913b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f3810d) {
                this.f3807a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f3808b, bArr, f3806e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f3808b.add(binarySearch, bArr);
                this.f3809c += bArr.length;
                m4912c();
            }
        }
    }
}
