package p054b.p059c.p094b.p096b;

import java.math.RoundingMode;
import java.util.Arrays;
import p054b.p059c.p094b.p095a.C1402c;
import p054b.p059c.p094b.p095a.C1403d;
import p054b.p059c.p094b.p097c.C1410a;
/* renamed from: b.c.b.b.a */
/* loaded from: classes.dex */
public abstract class AbstractC1405a {

    /* renamed from: a */
    private static final AbstractC1405a f4330a = new C1408c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.c.b.b.a$a */
    /* loaded from: classes.dex */
    public static final class C1406a {

        /* renamed from: a */
        private final String f4331a;

        /* renamed from: b */
        private final char[] f4332b;

        /* renamed from: c */
        final int f4333c;

        /* renamed from: d */
        final int f4334d;

        /* renamed from: e */
        final int f4335e;

        /* renamed from: f */
        final int f4336f;

        /* renamed from: g */
        private final byte[] f4337g;

        C1406a(String str, char[] cArr) {
            C1403d.m4226g(str);
            this.f4331a = str;
            C1403d.m4226g(cArr);
            this.f4332b = cArr;
            try {
                int m4213d = C1410a.m4213d(cArr.length, RoundingMode.UNNECESSARY);
                this.f4334d = m4213d;
                int min = Math.min(8, Integer.lowestOneBit(m4213d));
                try {
                    this.f4335e = 8 / min;
                    this.f4336f = this.f4334d / min;
                    this.f4333c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        C1403d.m4230c(c < 128, "Non-ASCII character: %s", c);
                        C1403d.m4230c(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.f4337g = bArr;
                    boolean[] zArr = new boolean[this.f4335e];
                    for (int i2 = 0; i2 < this.f4336f; i2++) {
                        zArr[C1410a.m4216a(i2 * 8, this.f4334d, RoundingMode.CEILING)] = true;
                    }
                } catch (ArithmeticException e) {
                    throw new IllegalArgumentException("Illegal alphabet " + new String(cArr), e);
                }
            } catch (ArithmeticException e2) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
            }
        }

        /* renamed from: b */
        char m4220b(int i) {
            return this.f4332b[i];
        }

        /* renamed from: c */
        public boolean m4219c(char c) {
            byte[] bArr = this.f4337g;
            return c < bArr.length && bArr[c] != -1;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1406a) {
                return Arrays.equals(this.f4332b, ((C1406a) obj).f4332b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f4332b);
        }

        public String toString() {
            return this.f4331a;
        }
    }

    /* renamed from: b.c.b.b.a$b */
    /* loaded from: classes.dex */
    static final class C1407b extends C1409d {

        /* renamed from: d */
        final char[] f4338d;

        private C1407b(C1406a c1406a) {
            super(c1406a, null);
            this.f4338d = new char[512];
            C1403d.m4232a(c1406a.f4332b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.f4338d[i] = c1406a.m4220b(i >>> 4);
                this.f4338d[i | 256] = c1406a.m4220b(i & 15);
            }
        }

        C1407b(String str, String str2) {
            this(new C1406a(str, str2.toCharArray()));
        }

        @Override // p054b.p059c.p094b.p096b.AbstractC1405a.C1409d
        /* renamed from: c */
        AbstractC1405a mo4217c(C1406a c1406a, Character ch) {
            return new C1407b(c1406a);
        }
    }

    /* renamed from: b.c.b.b.a$c */
    /* loaded from: classes.dex */
    static final class C1408c extends C1409d {
        private C1408c(C1406a c1406a, Character ch) {
            super(c1406a, ch);
            C1403d.m4232a(c1406a.f4332b.length == 64);
        }

        C1408c(String str, String str2, Character ch) {
            this(new C1406a(str, str2.toCharArray()), ch);
        }

        @Override // p054b.p059c.p094b.p096b.AbstractC1405a.C1409d
        /* renamed from: c */
        AbstractC1405a mo4217c(C1406a c1406a, Character ch) {
            return new C1408c(c1406a, ch);
        }
    }

    /* renamed from: b.c.b.b.a$d */
    /* loaded from: classes.dex */
    static class C1409d extends AbstractC1405a {

        /* renamed from: b */
        final C1406a f4339b;

        /* renamed from: c */
        final Character f4340c;

        C1409d(C1406a c1406a, Character ch) {
            C1403d.m4226g(c1406a);
            this.f4339b = c1406a;
            C1403d.m4228e(ch == null || !c1406a.m4219c(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f4340c = ch;
        }

        C1409d(String str, String str2, Character ch) {
            this(new C1406a(str, str2.toCharArray()), ch);
        }

        @Override // p054b.p059c.p094b.p096b.AbstractC1405a
        /* renamed from: b */
        public AbstractC1405a mo4218b() {
            return this.f4340c == null ? this : mo4217c(this.f4339b, null);
        }

        /* renamed from: c */
        AbstractC1405a mo4217c(C1406a c1406a, Character ch) {
            return new C1409d(c1406a, ch);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1409d) {
                C1409d c1409d = (C1409d) obj;
                return this.f4339b.equals(c1409d.f4339b) && C1402c.m4234a(this.f4340c, c1409d.f4340c);
            }
            return false;
        }

        public int hashCode() {
            return this.f4339b.hashCode() ^ C1402c.m4233b(this.f4340c);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f4339b.toString());
            if (8 % this.f4339b.f4334d != 0) {
                if (this.f4340c == null) {
                    str = ".omitPadding()";
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f4340c);
                    str = "')";
                }
                sb.append(str);
            }
            return sb.toString();
        }
    }

    static {
        new C1408c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new C1409d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new C1409d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        new C1407b("base16()", "0123456789ABCDEF");
    }

    AbstractC1405a() {
    }

    /* renamed from: a */
    public static AbstractC1405a m4222a() {
        return f4330a;
    }

    /* renamed from: b */
    public abstract AbstractC1405a mo4218b();
}
