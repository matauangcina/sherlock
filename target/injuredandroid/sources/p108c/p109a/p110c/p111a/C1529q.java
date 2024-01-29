package p108c.p109a.p110c.p111a;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: c.a.c.a.q */
/* loaded from: classes.dex */
public class C1529q implements InterfaceC1514g<Object> {

    /* renamed from: a */
    public static final C1529q f4558a = new C1529q();

    /* renamed from: b */
    private static final boolean f4559b;

    /* renamed from: c */
    private static final Charset f4560c;

    /* renamed from: c.a.c.a.q$a */
    /* loaded from: classes.dex */
    static final class C1530a extends ByteArrayOutputStream {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public byte[] m4014a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        f4559b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f4560c = Charset.forName("UTF8");
    }

    /* renamed from: c */
    protected static final void m4027c(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position() % i;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i) - position);
        }
    }

    /* renamed from: d */
    protected static final byte[] m4026d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[m4025e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: e */
    protected static final int m4025e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i = byteBuffer.get() & 255;
            return i < 254 ? i : i == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* renamed from: h */
    protected static final void m4022h(ByteArrayOutputStream byteArrayOutputStream, int i) {
        int size = byteArrayOutputStream.size() % i;
        if (size != 0) {
            for (int i2 = 0; i2 < i - size; i2++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    /* renamed from: i */
    protected static final void m4021i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        m4016n(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    protected static final void m4020j(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f4559b) {
            byteArrayOutputStream.write(i);
            i >>>= 8;
        } else {
            byteArrayOutputStream.write(i >>> 8);
        }
        byteArrayOutputStream.write(i);
    }

    /* renamed from: k */
    protected static final void m4019k(ByteArrayOutputStream byteArrayOutputStream, double d) {
        m4017m(byteArrayOutputStream, Double.doubleToLongBits(d));
    }

    /* renamed from: l */
    protected static final void m4018l(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f4559b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i >>> 16);
            i >>>= 24;
        } else {
            byteArrayOutputStream.write(i >>> 24);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 8);
        }
        byteArrayOutputStream.write(i);
    }

    /* renamed from: m */
    protected static final void m4017m(ByteArrayOutputStream byteArrayOutputStream, long j) {
        if (f4559b) {
            byteArrayOutputStream.write((byte) j);
            byteArrayOutputStream.write((byte) (j >>> 8));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 48));
            j >>>= 56;
        } else {
            byteArrayOutputStream.write((byte) (j >>> 56));
            byteArrayOutputStream.write((byte) (j >>> 48));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 8));
        }
        byteArrayOutputStream.write((byte) j);
    }

    /* renamed from: n */
    protected static final void m4016n(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (i < 254) {
            byteArrayOutputStream.write(i);
        } else if (i <= 65535) {
            byteArrayOutputStream.write(254);
            m4020j(byteArrayOutputStream, i);
        } else {
            byteArrayOutputStream.write(255);
            m4018l(byteArrayOutputStream, i);
        }
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1514g
    /* renamed from: a */
    public ByteBuffer mo4006a(Object obj) {
        if (obj == null) {
            return null;
        }
        C1530a c1530a = new C1530a();
        m4015o(c1530a, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c1530a.size());
        allocateDirect.put(c1530a.m4014a(), 0, c1530a.size());
        return allocateDirect;
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1514g
    /* renamed from: b */
    public Object mo4005b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object m4024f = m4024f(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return m4024f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final Object m4024f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return m4023g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* renamed from: g */
    protected Object m4023g(byte b, ByteBuffer byteBuffer) {
        int m4025e;
        long[] jArr;
        int i = 0;
        switch (b) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                return new BigInteger(new String(m4026d(byteBuffer), f4560c), 16);
            case 6:
                m4027c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new String(m4026d(byteBuffer), f4560c);
            case 8:
                return m4026d(byteBuffer);
            case 9:
                int m4025e2 = m4025e(byteBuffer);
                int[] iArr = new int[m4025e2];
                m4027c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position(byteBuffer.position() + (m4025e2 * 4));
                return iArr;
            case 10:
                m4025e = m4025e(byteBuffer);
                long[] jArr2 = new long[m4025e];
                m4027c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr2);
                jArr = jArr2;
                break;
            case 11:
                m4025e = m4025e(byteBuffer);
                double[] dArr = new double[m4025e];
                m4027c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                jArr = dArr;
                break;
            case 12:
                int m4025e3 = m4025e(byteBuffer);
                ArrayList arrayList = new ArrayList(m4025e3);
                while (i < m4025e3) {
                    arrayList.add(m4024f(byteBuffer));
                    i++;
                }
                return arrayList;
            case 13:
                int m4025e4 = m4025e(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i < m4025e4) {
                    hashMap.put(m4024f(byteBuffer), m4024f(byteBuffer));
                    i++;
                }
                return hashMap;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        byteBuffer.position(byteBuffer.position() + (m4025e * 8));
        return jArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void m4015o(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
        } else if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m4018l(byteArrayOutputStream, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                m4017m(byteArrayOutputStream, ((Long) obj).longValue());
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                m4022h(byteArrayOutputStream, 8);
                m4019k(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else if (!(obj instanceof BigInteger)) {
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            } else {
                byteArrayOutputStream.write(5);
                m4021i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(f4560c));
            }
        } else if (obj instanceof String) {
            byteArrayOutputStream.write(7);
            m4021i(byteArrayOutputStream, ((String) obj).getBytes(f4560c));
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            m4021i(byteArrayOutputStream, (byte[]) obj);
        } else if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            m4016n(byteArrayOutputStream, iArr.length);
            m4022h(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i < length) {
                m4018l(byteArrayOutputStream, iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            m4016n(byteArrayOutputStream, jArr.length);
            m4022h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i < length2) {
                m4017m(byteArrayOutputStream, jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            m4016n(byteArrayOutputStream, dArr.length);
            m4022h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i < length3) {
                m4019k(byteArrayOutputStream, dArr[i]);
                i++;
            }
        } else if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List<Object> list = (List) obj;
            m4016n(byteArrayOutputStream, list.size());
            for (Object obj2 : list) {
                m4015o(byteArrayOutputStream, obj2);
            }
        } else if (!(obj instanceof Map)) {
            throw new IllegalArgumentException("Unsupported value: " + obj);
        } else {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            m4016n(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                m4015o(byteArrayOutputStream, entry.getKey());
                m4015o(byteArrayOutputStream, entry.getValue());
            }
        }
    }
}
