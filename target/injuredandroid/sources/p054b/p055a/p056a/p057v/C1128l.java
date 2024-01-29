package p054b.p055a.p056a.p057v;

import java.io.UnsupportedEncodingException;
import p054b.p055a.p056a.AbstractC1094m;
import p054b.p055a.p056a.C1092k;
import p054b.p055a.p056a.C1100o;
/* renamed from: b.a.a.v.l */
/* loaded from: classes.dex */
public class C1128l extends AbstractC1094m<String> {

    /* renamed from: u */
    private final Object f3834u;

    /* renamed from: v */
    private C1100o.InterfaceC1102b<String> f3835v;

    public C1128l(int i, String str, C1100o.InterfaceC1102b<String> interfaceC1102b, C1100o.InterfaceC1101a interfaceC1101a) {
        super(i, str, interfaceC1101a);
        this.f3834u = new Object();
        this.f3835v = interfaceC1102b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p054b.p055a.p056a.AbstractC1094m
    /* renamed from: S */
    public C1100o<String> mo4855S(C1092k c1092k) {
        String str;
        try {
            str = new String(c1092k.f3752a, C1121g.m4877d(c1092k.f3753b));
        } catch (UnsupportedEncodingException unused) {
            str = new String(c1092k.f3752a);
        }
        return C1100o.m4936c(str, C1121g.m4878c(c1092k));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p054b.p055a.p056a.AbstractC1094m
    /* renamed from: a0 */
    public void mo4853i(String str) {
        C1100o.InterfaceC1102b<String> interfaceC1102b;
        synchronized (this.f3834u) {
            interfaceC1102b = this.f3835v;
        }
        if (interfaceC1102b != null) {
            interfaceC1102b.mo4138a(str);
        }
    }
}
