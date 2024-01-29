package p054b.p059c.p060a.p061a.p068d.p071c;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.Arrays;
/* renamed from: b.c.a.a.d.c.a0 */
/* loaded from: classes.dex */
public final class C1180a0<K, V> {

    /* renamed from: a */
    private Object[] f3892a;

    /* renamed from: b */
    private int f3893b;

    public C1180a0() {
        this(4);
    }

    private C1180a0(int i) {
        this.f3892a = new Object[8];
        this.f3893b = 0;
    }

    /* renamed from: a */
    public final C1180a0<K, V> m4736a(K k, V v) {
        int i = (this.f3893b + 1) << 1;
        Object[] objArr = this.f3892a;
        if (i > objArr.length) {
            int length = objArr.length;
            if (i < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                i2 = Integer.highestOneBit(i - 1) << 1;
            }
            if (i2 < 0) {
                i2 = Reader.READ_DONE;
            }
            this.f3892a = Arrays.copyOf(objArr, i2);
        }
        C1250v.m4648a(k, v);
        Object[] objArr2 = this.f3892a;
        int i3 = this.f3893b;
        objArr2[i3 * 2] = k;
        objArr2[(i3 * 2) + 1] = v;
        this.f3893b = i3 + 1;
        return this;
    }

    /* renamed from: b */
    public final AbstractC1184b0<K, V> m4735b() {
        return C1200f0.m4718e(this.f3893b, this.f3892a);
    }
}
