package p054b.p055a.p056a;
/* renamed from: b.a.a.e */
/* loaded from: classes.dex */
public class C1084e implements InterfaceC1104q {

    /* renamed from: a */
    private int f3736a;

    /* renamed from: b */
    private int f3737b;

    /* renamed from: c */
    private final int f3738c;

    /* renamed from: d */
    private final float f3739d;

    public C1084e() {
        this(2500, 1, 1.0f);
    }

    public C1084e(int i, int i2, float f) {
        this.f3736a = i;
        this.f3738c = i2;
        this.f3739d = f;
    }

    @Override // p054b.p055a.p056a.InterfaceC1104q
    /* renamed from: a */
    public void mo4932a(C1107t c1107t) {
        this.f3737b++;
        int i = this.f3736a;
        this.f3736a = i + ((int) (i * this.f3739d));
        if (!m4993d()) {
            throw c1107t;
        }
    }

    @Override // p054b.p055a.p056a.InterfaceC1104q
    /* renamed from: b */
    public int mo4931b() {
        return this.f3736a;
    }

    @Override // p054b.p055a.p056a.InterfaceC1104q
    /* renamed from: c */
    public int mo4930c() {
        return this.f3737b;
    }

    /* renamed from: d */
    protected boolean m4993d() {
        return this.f3737b <= this.f3738c;
    }
}
