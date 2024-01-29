package p000a.p019g.p027j;
/* renamed from: a.g.j.e */
/* loaded from: classes.dex */
public class C0190e<F, S> {

    /* renamed from: a */
    public final F f642a;

    /* renamed from: b */
    public final S f643b;

    public boolean equals(Object obj) {
        if (obj instanceof C0190e) {
            C0190e c0190e = (C0190e) obj;
            return C0189d.m8873a(c0190e.f642a, this.f642a) && C0189d.m8873a(c0190e.f643b, this.f643b);
        }
        return false;
    }

    public int hashCode() {
        F f = this.f642a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f643b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f642a + " " + this.f643b + "}";
    }
}
