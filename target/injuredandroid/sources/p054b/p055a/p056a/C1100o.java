package p054b.p055a.p056a;

import p054b.p055a.p056a.InterfaceC1078b;
/* renamed from: b.a.a.o */
/* loaded from: classes.dex */
public class C1100o<T> {

    /* renamed from: a */
    public final T f3789a;

    /* renamed from: b */
    public final InterfaceC1078b.C1079a f3790b;

    /* renamed from: c */
    public final C1107t f3791c;

    /* renamed from: d */
    public boolean f3792d;

    /* renamed from: b.a.a.o$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1101a {
        /* renamed from: a */
        void mo4136a(C1107t c1107t);
    }

    /* renamed from: b.a.a.o$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1102b<T> {
        /* renamed from: a */
        void mo4138a(T t);
    }

    private C1100o(C1107t c1107t) {
        this.f3792d = false;
        this.f3789a = null;
        this.f3790b = null;
        this.f3791c = c1107t;
    }

    private C1100o(T t, InterfaceC1078b.C1079a c1079a) {
        this.f3792d = false;
        this.f3789a = t;
        this.f3790b = c1079a;
        this.f3791c = null;
    }

    /* renamed from: a */
    public static <T> C1100o<T> m4938a(C1107t c1107t) {
        return new C1100o<>(c1107t);
    }

    /* renamed from: c */
    public static <T> C1100o<T> m4936c(T t, InterfaceC1078b.C1079a c1079a) {
        return new C1100o<>(t, c1079a);
    }

    /* renamed from: b */
    public boolean m4937b() {
        return this.f3791c == null;
    }
}
