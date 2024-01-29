package p135d.p142s.p144d;

import p135d.p146u.InterfaceC2742a;
import p135d.p146u.InterfaceC2747e;
/* renamed from: d.s.d.l */
/* loaded from: classes.dex */
public abstract class AbstractC2730l extends AbstractC2718a implements InterfaceC2747e {
    public AbstractC2730l() {
    }

    public AbstractC2730l(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2730l) {
            AbstractC2730l abstractC2730l = (AbstractC2730l) obj;
            return m890h().equals(abstractC2730l.m890h()) && m891g().equals(abstractC2730l.m891g()) && m889j().equals(abstractC2730l.m889j()) && C2725g.m885a(m892f(), abstractC2730l.m892f());
        } else if (obj instanceof InterfaceC2747e) {
            return obj.equals(m893d());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((m890h().hashCode() * 31) + m891g().hashCode()) * 31) + m889j().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p135d.p142s.p144d.AbstractC2718a
    /* renamed from: k */
    public InterfaceC2747e mo869i() {
        return (InterfaceC2747e) super.mo869i();
    }

    public String toString() {
        InterfaceC2742a m893d = m893d();
        if (m893d != this) {
            return m893d.toString();
        }
        return "property " + m891g() + " (Kotlin reflection is not available)";
    }
}
