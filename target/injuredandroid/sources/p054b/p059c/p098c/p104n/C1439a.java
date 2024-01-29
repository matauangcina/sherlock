package p054b.p059c.p098c.p104n;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.c.c.n.a */
/* loaded from: classes.dex */
public final class C1439a extends AbstractC1444f {

    /* renamed from: a */
    private final String f4373a;

    /* renamed from: b */
    private final String f4374b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1439a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f4373a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f4374b = str2;
    }

    @Override // p054b.p059c.p098c.p104n.AbstractC1444f
    /* renamed from: b */
    public String mo4161b() {
        return this.f4373a;
    }

    @Override // p054b.p059c.p098c.p104n.AbstractC1444f
    /* renamed from: c */
    public String mo4160c() {
        return this.f4374b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1444f) {
            AbstractC1444f abstractC1444f = (AbstractC1444f) obj;
            return this.f4373a.equals(abstractC1444f.mo4161b()) && this.f4374b.equals(abstractC1444f.mo4160c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4373a.hashCode() ^ 1000003) * 1000003) ^ this.f4374b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f4373a + ", version=" + this.f4374b + "}";
    }
}
