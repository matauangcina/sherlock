package p108c.p109a.p110c.p111a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: c.a.c.a.s */
/* loaded from: classes.dex */
public final class C1532s implements InterfaceC1514g<String> {

    /* renamed from: a */
    private static final Charset f4563a = Charset.forName("UTF8");

    /* renamed from: b */
    public static final C1532s f4564b = new C1532s();

    private C1532s() {
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1514g
    /* renamed from: c */
    public String mo4005b(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i = 0;
        }
        return new String(bArr, i, remaining, f4563a);
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1514g
    /* renamed from: d */
    public ByteBuffer mo4006a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f4563a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
