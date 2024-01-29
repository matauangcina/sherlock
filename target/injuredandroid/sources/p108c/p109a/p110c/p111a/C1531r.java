package p108c.p109a.p110c.p111a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p108c.p109a.p110c.p111a.C1529q;
/* renamed from: c.a.c.a.r */
/* loaded from: classes.dex */
public final class C1531r implements InterfaceC1522j {

    /* renamed from: b */
    public static final C1531r f4561b = new C1531r(C1529q.f4558a);

    /* renamed from: a */
    private final C1529q f4562a;

    public C1531r(C1529q c1529q) {
        this.f4562a = c1529q;
    }

    /* renamed from: g */
    private static String m4007g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1522j
    /* renamed from: a */
    public ByteBuffer mo4013a(Object obj) {
        C1529q.C1530a c1530a = new C1529q.C1530a();
        c1530a.write(0);
        this.f4562a.m4015o(c1530a, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c1530a.size());
        allocateDirect.put(c1530a.m4014a(), 0, c1530a.size());
        return allocateDirect;
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1522j
    /* renamed from: b */
    public ByteBuffer mo4012b(String str, String str2, Object obj, String str3) {
        C1529q.C1530a c1530a = new C1529q.C1530a();
        c1530a.write(1);
        this.f4562a.m4015o(c1530a, str);
        this.f4562a.m4015o(c1530a, str2);
        if (obj instanceof Throwable) {
            this.f4562a.m4015o(c1530a, m4007g((Throwable) obj));
        } else {
            this.f4562a.m4015o(c1530a, obj);
        }
        this.f4562a.m4015o(c1530a, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c1530a.size());
        allocateDirect.put(c1530a.m4014a(), 0, c1530a.size());
        return allocateDirect;
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1522j
    /* renamed from: c */
    public ByteBuffer mo4011c(String str, String str2, Object obj) {
        C1529q.C1530a c1530a = new C1529q.C1530a();
        c1530a.write(1);
        this.f4562a.m4015o(c1530a, str);
        this.f4562a.m4015o(c1530a, str2);
        if (obj instanceof Throwable) {
            this.f4562a.m4015o(c1530a, m4007g((Throwable) obj));
        } else {
            this.f4562a.m4015o(c1530a, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c1530a.size());
        allocateDirect.put(c1530a.m4014a(), 0, c1530a.size());
        return allocateDirect;
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1522j
    /* renamed from: d */
    public C1515h mo4010d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object m4024f = this.f4562a.m4024f(byteBuffer);
        Object m4024f2 = this.f4562a.m4024f(byteBuffer);
        if (!(m4024f instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new C1515h((String) m4024f, m4024f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 == 1) goto L8;
     */
    @Override // p108c.p109a.p110c.p111a.InterfaceC1522j
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo4009e(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L4a
            goto L1e
        L11:
            c.a.c.a.q r0 = r4.f4562a
            java.lang.Object r0 = r0.m4024f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            c.a.c.a.q r0 = r4.f4562a
            java.lang.Object r0 = r0.m4024f(r5)
            c.a.c.a.q r1 = r4.f4562a
            java.lang.Object r1 = r1.m4024f(r5)
            c.a.c.a.q r2 = r4.f4562a
            java.lang.Object r2 = r2.m4024f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L4a
            if (r1 == 0) goto L3a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L4a
        L3a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L4a
            c.a.c.a.c r5 = new c.a.c.a.c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p108c.p109a.p110c.p111a.C1531r.mo4009e(java.nio.ByteBuffer):java.lang.Object");
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1522j
    /* renamed from: f */
    public ByteBuffer mo4008f(C1515h c1515h) {
        C1529q.C1530a c1530a = new C1529q.C1530a();
        this.f4562a.m4015o(c1530a, c1515h.f4547a);
        this.f4562a.m4015o(c1530a, c1515h.f4548b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c1530a.size());
        allocateDirect.put(c1530a.m4014a(), 0, c1530a.size());
        return allocateDirect;
    }
}
