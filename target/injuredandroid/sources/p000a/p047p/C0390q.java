package p000a.p047p;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p047p.AbstractC0377m;
/* renamed from: a.p.q */
/* loaded from: classes.dex */
public class C0390q extends AbstractC0377m {

    /* renamed from: Q */
    int f1023Q;

    /* renamed from: O */
    private ArrayList<AbstractC0377m> f1021O = new ArrayList<>();

    /* renamed from: P */
    private boolean f1022P = true;

    /* renamed from: R */
    boolean f1024R = false;

    /* renamed from: S */
    private int f1025S = 0;

    /* renamed from: a.p.q$a */
    /* loaded from: classes.dex */
    class C0391a extends C0385n {

        /* renamed from: a */
        final /* synthetic */ AbstractC0377m f1026a;

        C0391a(C0390q c0390q, AbstractC0377m abstractC0377m) {
            this.f1026a = abstractC0377m;
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: e */
        public void mo8232e(AbstractC0377m abstractC0377m) {
            this.f1026a.mo8262T();
            abstractC0377m.mo8265P(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.p.q$b */
    /* loaded from: classes.dex */
    public static class C0392b extends C0385n {

        /* renamed from: a */
        C0390q f1027a;

        C0392b(C0390q c0390q) {
            this.f1027a = c0390q;
        }

        @Override // p000a.p047p.C0385n, p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: a */
        public void mo8233a(AbstractC0377m abstractC0377m) {
            C0390q c0390q = this.f1027a;
            if (c0390q.f1024R) {
                return;
            }
            c0390q.m8297a0();
            this.f1027a.f1024R = true;
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: e */
        public void mo8232e(AbstractC0377m abstractC0377m) {
            C0390q c0390q = this.f1027a;
            int i = c0390q.f1023Q - 1;
            c0390q.f1023Q = i;
            if (i == 0) {
                c0390q.f1024R = false;
                c0390q.m8289p();
            }
            abstractC0377m.mo8265P(this);
        }
    }

    /* renamed from: f0 */
    private void m8248f0(AbstractC0377m abstractC0377m) {
        this.f1021O.add(abstractC0377m);
        abstractC0377m.f1002w = this;
    }

    /* renamed from: o0 */
    private void m8234o0() {
        C0392b c0392b = new C0392b(this);
        Iterator<AbstractC0377m> it = this.f1021O.iterator();
        while (it.hasNext()) {
            it.next().mo8255a(c0392b);
        }
        this.f1023Q = this.f1021O.size();
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: N */
    public void mo8266N(View view) {
        super.mo8266N(view);
        int size = this.f1021O.size();
        for (int i = 0; i < size; i++) {
            this.f1021O.get(i).mo8266N(view);
        }
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: R */
    public void mo8263R(View view) {
        super.mo8263R(view);
        int size = this.f1021O.size();
        for (int i = 0; i < size; i++) {
            this.f1021O.get(i).mo8263R(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: T */
    public void mo8262T() {
        if (this.f1021O.isEmpty()) {
            m8297a0();
            m8289p();
            return;
        }
        m8234o0();
        if (this.f1022P) {
            Iterator<AbstractC0377m> it = this.f1021O.iterator();
            while (it.hasNext()) {
                it.next().mo8262T();
            }
            return;
        }
        for (int i = 1; i < this.f1021O.size(); i++) {
            this.f1021O.get(i - 1).mo8255a(new C0391a(this, this.f1021O.get(i)));
        }
        AbstractC0377m abstractC0377m = this.f1021O.get(0);
        if (abstractC0377m != null) {
            abstractC0377m.mo8262T();
        }
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: U */
    public /* bridge */ /* synthetic */ AbstractC0377m mo8261U(long j) {
        m8240k0(j);
        return this;
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: V */
    public void mo8260V(AbstractC0377m.AbstractC0382e abstractC0382e) {
        super.mo8260V(abstractC0382e);
        this.f1025S |= 8;
        int size = this.f1021O.size();
        for (int i = 0; i < size; i++) {
            this.f1021O.get(i).mo8260V(abstractC0382e);
        }
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: X */
    public void mo8258X(AbstractC0362g abstractC0362g) {
        super.mo8258X(abstractC0362g);
        this.f1025S |= 4;
        if (this.f1021O != null) {
            for (int i = 0; i < this.f1021O.size(); i++) {
                this.f1021O.get(i).mo8258X(abstractC0362g);
            }
        }
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: Y */
    public void mo8257Y(AbstractC0389p abstractC0389p) {
        super.mo8257Y(abstractC0389p);
        this.f1025S |= 2;
        int size = this.f1021O.size();
        for (int i = 0; i < size; i++) {
            this.f1021O.get(i).mo8257Y(abstractC0389p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: b0 */
    public String mo8253b0(String str) {
        String mo8253b0 = super.mo8253b0(str);
        for (int i = 0; i < this.f1021O.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo8253b0);
            sb.append("\n");
            sb.append(this.f1021O.get(i).mo8253b0(str + "  "));
            mo8253b0 = sb.toString();
        }
        return mo8253b0;
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: c0 */
    public C0390q mo8255a(AbstractC0377m.InterfaceC0383f interfaceC0383f) {
        super.mo8255a(interfaceC0383f);
        return this;
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: d0 */
    public C0390q mo8254b(View view) {
        for (int i = 0; i < this.f1021O.size(); i++) {
            this.f1021O.get(i).mo8254b(view);
        }
        super.mo8254b(view);
        return this;
    }

    /* renamed from: e0 */
    public C0390q m8250e0(AbstractC0377m abstractC0377m) {
        m8248f0(abstractC0377m);
        long j = this.f987h;
        if (j >= 0) {
            abstractC0377m.mo8261U(j);
        }
        if ((this.f1025S & 1) != 0) {
            abstractC0377m.mo8259W(m8286s());
        }
        if ((this.f1025S & 2) != 0) {
            abstractC0377m.mo8257Y(m8282w());
        }
        if ((this.f1025S & 4) != 0) {
            abstractC0377m.mo8258X(m8283v());
        }
        if ((this.f1025S & 8) != 0) {
            abstractC0377m.mo8260V(m8287r());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: f */
    public void mo8249f() {
        super.mo8249f();
        int size = this.f1021O.size();
        for (int i = 0; i < size; i++) {
            this.f1021O.get(i).mo8249f();
        }
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: g */
    public void mo8247g(C0394s c0394s) {
        if (m8306G(c0394s.f1032b)) {
            Iterator<AbstractC0377m> it = this.f1021O.iterator();
            while (it.hasNext()) {
                AbstractC0377m next = it.next();
                if (next.m8306G(c0394s.f1032b)) {
                    next.mo8247g(c0394s);
                    c0394s.f1033c.add(next);
                }
            }
        }
    }

    /* renamed from: g0 */
    public AbstractC0377m m8246g0(int i) {
        if (i < 0 || i >= this.f1021O.size()) {
            return null;
        }
        return this.f1021O.get(i);
    }

    /* renamed from: h0 */
    public int m8245h0() {
        return this.f1021O.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: i */
    public void mo8244i(C0394s c0394s) {
        super.mo8244i(c0394s);
        int size = this.f1021O.size();
        for (int i = 0; i < size; i++) {
            this.f1021O.get(i).mo8244i(c0394s);
        }
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: i0 */
    public C0390q mo8265P(AbstractC0377m.InterfaceC0383f interfaceC0383f) {
        super.mo8265P(interfaceC0383f);
        return this;
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: j */
    public void mo8242j(C0394s c0394s) {
        if (m8306G(c0394s.f1032b)) {
            Iterator<AbstractC0377m> it = this.f1021O.iterator();
            while (it.hasNext()) {
                AbstractC0377m next = it.next();
                if (next.m8306G(c0394s.f1032b)) {
                    next.mo8242j(c0394s);
                    c0394s.f1033c.add(next);
                }
            }
        }
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: j0 */
    public C0390q mo8264Q(View view) {
        for (int i = 0; i < this.f1021O.size(); i++) {
            this.f1021O.get(i).mo8264Q(view);
        }
        super.mo8264Q(view);
        return this;
    }

    /* renamed from: k0 */
    public C0390q m8240k0(long j) {
        ArrayList<AbstractC0377m> arrayList;
        super.mo8261U(j);
        if (this.f987h >= 0 && (arrayList = this.f1021O) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1021O.get(i).mo8261U(j);
            }
        }
        return this;
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: l0 */
    public C0390q mo8259W(TimeInterpolator timeInterpolator) {
        this.f1025S |= 1;
        ArrayList<AbstractC0377m> arrayList = this.f1021O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1021O.get(i).mo8259W(timeInterpolator);
            }
        }
        super.mo8259W(timeInterpolator);
        return this;
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: m */
    public AbstractC0377m clone() {
        C0390q c0390q = (C0390q) super.clone();
        c0390q.f1021O = new ArrayList<>();
        int size = this.f1021O.size();
        for (int i = 0; i < size; i++) {
            c0390q.m8248f0(this.f1021O.get(i).clone());
        }
        return c0390q;
    }

    /* renamed from: m0 */
    public C0390q m8237m0(int i) {
        if (i == 0) {
            this.f1022P = true;
        } else if (i != 1) {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        } else {
            this.f1022P = false;
        }
        return this;
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: n0 */
    public C0390q mo8256Z(long j) {
        super.mo8256Z(j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: o */
    public void mo8235o(ViewGroup viewGroup, C0395t c0395t, C0395t c0395t2, ArrayList<C0394s> arrayList, ArrayList<C0394s> arrayList2) {
        long m8280y = m8280y();
        int size = this.f1021O.size();
        for (int i = 0; i < size; i++) {
            AbstractC0377m abstractC0377m = this.f1021O.get(i);
            if (m8280y > 0 && (this.f1022P || i == 0)) {
                long m8280y2 = abstractC0377m.m8280y();
                if (m8280y2 > 0) {
                    abstractC0377m.mo8256Z(m8280y2 + m8280y);
                } else {
                    abstractC0377m.mo8256Z(m8280y);
                }
            }
            abstractC0377m.mo8235o(viewGroup, c0395t, c0395t2, arrayList, arrayList2);
        }
    }
}
