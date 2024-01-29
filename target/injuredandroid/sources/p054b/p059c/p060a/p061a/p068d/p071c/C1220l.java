package p054b.p059c.p060a.p061a.p068d.p071c;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* renamed from: b.c.a.a.d.c.l */
/* loaded from: classes.dex */
public final class C1220l {

    /* renamed from: a */
    private final AbstractC1191d f3962a;

    /* renamed from: b */
    private final InterfaceC1235q f3963b;

    /* renamed from: c */
    private final int f3964c;

    private C1220l(InterfaceC1235q interfaceC1235q) {
        this(interfaceC1235q, false, C1207h.f3946b, Reader.READ_DONE);
    }

    private C1220l(InterfaceC1235q interfaceC1235q, boolean z, AbstractC1191d abstractC1191d, int i) {
        this.f3963b = interfaceC1235q;
        this.f3962a = abstractC1191d;
        this.f3964c = Reader.READ_DONE;
    }

    /* renamed from: b */
    public static C1220l m4702b(char c) {
        C1199f c1199f = new C1199f('.');
        C1223m.m4697c(c1199f);
        return new C1220l(new C1229o(c1199f));
    }

    /* renamed from: c */
    public final List<String> m4701c(CharSequence charSequence) {
        C1223m.m4697c(charSequence);
        Iterator<String> mo4677a = this.f3963b.mo4677a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (mo4677a.hasNext()) {
            arrayList.add(mo4677a.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
