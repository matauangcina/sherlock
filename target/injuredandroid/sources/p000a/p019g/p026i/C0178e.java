package p000a.p019g.p026i;

import java.util.Locale;
/* renamed from: a.g.i.e */
/* loaded from: classes.dex */
public final class C0178e {

    /* renamed from: a */
    public static final InterfaceC0177d f629a = new C0183e(null, false);

    /* renamed from: b */
    public static final InterfaceC0177d f630b = new C0183e(null, true);

    /* renamed from: c */
    public static final InterfaceC0177d f631c = new C0183e(C0180b.f635a, false);

    /* renamed from: d */
    public static final InterfaceC0177d f632d = new C0183e(C0180b.f635a, true);

    /* renamed from: a.g.i.e$a */
    /* loaded from: classes.dex */
    private static class C0179a implements InterfaceC0181c {

        /* renamed from: b */
        static final C0179a f633b = new C0179a(true);

        /* renamed from: a */
        private final boolean f634a;

        private C0179a(boolean z) {
            this.f634a = z;
        }

        @Override // p000a.p019g.p026i.C0178e.InterfaceC0181c
        /* renamed from: a */
        public int mo8882a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int m8884a = C0178e.m8884a(Character.getDirectionality(charSequence.charAt(i)));
                if (m8884a != 0) {
                    if (m8884a != 1) {
                        continue;
                        i++;
                    } else if (!this.f634a) {
                        return 1;
                    }
                } else if (this.f634a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f634a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: a.g.i.e$b */
    /* loaded from: classes.dex */
    private static class C0180b implements InterfaceC0181c {

        /* renamed from: a */
        static final C0180b f635a = new C0180b();

        private C0180b() {
        }

        @Override // p000a.p019g.p026i.C0178e.InterfaceC0181c
        /* renamed from: a */
        public int mo8882a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0178e.m8883b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.g.i.e$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0181c {
        /* renamed from: a */
        int mo8882a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: a.g.i.e$d */
    /* loaded from: classes.dex */
    private static abstract class AbstractC0182d implements InterfaceC0177d {

        /* renamed from: a */
        private final InterfaceC0181c f636a;

        AbstractC0182d(InterfaceC0181c interfaceC0181c) {
            this.f636a = interfaceC0181c;
        }

        /* renamed from: c */
        private boolean m8880c(CharSequence charSequence, int i, int i2) {
            int mo8882a = this.f636a.mo8882a(charSequence, i, i2);
            if (mo8882a != 0) {
                if (mo8882a != 1) {
                    return mo8879b();
                }
                return false;
            }
            return true;
        }

        @Override // p000a.p019g.p026i.InterfaceC0177d
        /* renamed from: a */
        public boolean mo8881a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f636a == null ? mo8879b() : m8880c(charSequence, i, i2);
        }

        /* renamed from: b */
        protected abstract boolean mo8879b();
    }

    /* renamed from: a.g.i.e$e */
    /* loaded from: classes.dex */
    private static class C0183e extends AbstractC0182d {

        /* renamed from: b */
        private final boolean f637b;

        C0183e(InterfaceC0181c interfaceC0181c, boolean z) {
            super(interfaceC0181c);
            this.f637b = z;
        }

        @Override // p000a.p019g.p026i.C0178e.AbstractC0182d
        /* renamed from: b */
        protected boolean mo8879b() {
            return this.f637b;
        }
    }

    /* renamed from: a.g.i.e$f */
    /* loaded from: classes.dex */
    private static class C0184f extends AbstractC0182d {

        /* renamed from: b */
        static final C0184f f638b = new C0184f();

        C0184f() {
            super(null);
        }

        @Override // p000a.p019g.p026i.C0178e.AbstractC0182d
        /* renamed from: b */
        protected boolean mo8879b() {
            return C0185f.m8877b(Locale.getDefault()) == 1;
        }
    }

    static {
        C0179a c0179a = C0179a.f633b;
        C0184f c0184f = C0184f.f638b;
    }

    /* renamed from: a */
    static int m8884a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m8883b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
