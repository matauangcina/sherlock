package p000a.p019g.p026i;

import android.text.SpannableStringBuilder;
import java.util.Locale;
/* renamed from: a.g.i.a */
/* loaded from: classes.dex */
public final class C0170a {

    /* renamed from: d */
    static final InterfaceC0177d f599d = C0178e.f631c;

    /* renamed from: e */
    private static final String f600e = Character.toString(8206);

    /* renamed from: f */
    private static final String f601f = Character.toString(8207);

    /* renamed from: g */
    static final C0170a f602g = new C0170a(false, 2, f599d);

    /* renamed from: h */
    static final C0170a f603h = new C0170a(true, 2, f599d);

    /* renamed from: a */
    private final boolean f604a;

    /* renamed from: b */
    private final int f605b;

    /* renamed from: c */
    private final InterfaceC0177d f606c;

    /* renamed from: a.g.i.a$a */
    /* loaded from: classes.dex */
    public static final class C0171a {

        /* renamed from: a */
        private boolean f607a;

        /* renamed from: b */
        private int f608b;

        /* renamed from: c */
        private InterfaceC0177d f609c;

        public C0171a() {
            m8908c(C0170a.m8915e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C0170a m8909b(boolean z) {
            return z ? C0170a.f603h : C0170a.f602g;
        }

        /* renamed from: c */
        private void m8908c(boolean z) {
            this.f607a = z;
            this.f609c = C0170a.f599d;
            this.f608b = 2;
        }

        /* renamed from: a */
        public C0170a m8910a() {
            return (this.f608b == 2 && this.f609c == C0170a.f599d) ? m8909b(this.f607a) : new C0170a(this.f607a, this.f608b, this.f609c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.g.i.a$b */
    /* loaded from: classes.dex */
    public static class C0172b {

        /* renamed from: f */
        private static final byte[] f610f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f611a;

        /* renamed from: b */
        private final boolean f612b;

        /* renamed from: c */
        private final int f613c;

        /* renamed from: d */
        private int f614d;

        /* renamed from: e */
        private char f615e;

        static {
            for (int i = 0; i < 1792; i++) {
                f610f[i] = Character.getDirectionality(i);
            }
        }

        C0172b(CharSequence charSequence, boolean z) {
            this.f611a = charSequence;
            this.f612b = z;
            this.f613c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m8905c(char c) {
            return c < 1792 ? f610f[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m8902f() {
            char charAt;
            int i = this.f614d;
            do {
                int i2 = this.f614d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f611a;
                int i3 = i2 - 1;
                this.f614d = i3;
                charAt = charSequence.charAt(i3);
                this.f615e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f614d = i;
            this.f615e = ';';
            return (byte) 13;
        }

        /* renamed from: g */
        private byte m8901g() {
            char charAt;
            do {
                int i = this.f614d;
                if (i >= this.f613c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f611a;
                this.f614d = i + 1;
                charAt = charSequence.charAt(i);
                this.f615e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        private byte m8900h() {
            char charAt;
            int i = this.f614d;
            while (true) {
                int i2 = this.f614d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f611a;
                int i3 = i2 - 1;
                this.f614d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f615e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    char c = this.f615e;
                    do {
                        int i4 = this.f614d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f611a;
                            int i5 = i4 - 1;
                            this.f614d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f615e = charAt;
                        }
                    } while (charAt != c);
                }
            }
            this.f614d = i;
            this.f615e = '>';
            return (byte) 13;
        }

        /* renamed from: i */
        private byte m8899i() {
            char charAt;
            int i = this.f614d;
            while (true) {
                int i2 = this.f614d;
                if (i2 >= this.f613c) {
                    this.f614d = i;
                    this.f615e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f611a;
                this.f614d = i2 + 1;
                char charAt2 = charSequence.charAt(i2);
                this.f615e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    char c = this.f615e;
                    do {
                        int i3 = this.f614d;
                        if (i3 < this.f613c) {
                            CharSequence charSequence2 = this.f611a;
                            this.f614d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f615e = charAt;
                        }
                    } while (charAt != c);
                }
            }
        }

        /* renamed from: a */
        byte m8907a() {
            char charAt = this.f611a.charAt(this.f614d - 1);
            this.f615e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f611a, this.f614d);
                this.f614d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f614d--;
            byte m8905c = m8905c(this.f615e);
            if (this.f612b) {
                char c = this.f615e;
                return c == '>' ? m8900h() : c == ';' ? m8902f() : m8905c;
            }
            return m8905c;
        }

        /* renamed from: b */
        byte m8906b() {
            char charAt = this.f611a.charAt(this.f614d);
            this.f615e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f611a, this.f614d);
                this.f614d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f614d++;
            byte m8905c = m8905c(this.f615e);
            if (this.f612b) {
                char c = this.f615e;
                return c == '<' ? m8899i() : c == '&' ? m8901g() : m8905c;
            }
            return m8905c;
        }

        /* renamed from: d */
        int m8904d() {
            this.f614d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f614d < this.f613c && i == 0) {
                byte m8906b = m8906b();
                if (m8906b != 0) {
                    if (m8906b == 1 || m8906b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (m8906b != 9) {
                        switch (m8906b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f614d > 0) {
                switch (m8907a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* renamed from: e */
        int m8903e() {
            this.f614d = this.f613c;
            int i = 0;
            int i2 = 0;
            while (this.f614d > 0) {
                byte m8907a = m8907a();
                if (m8907a != 0) {
                    if (m8907a == 1 || m8907a == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            i2 = i;
                        }
                    } else if (m8907a != 9) {
                        switch (m8907a) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    i2 = i;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            }
            return 0;
        }
    }

    C0170a(boolean z, int i, InterfaceC0177d interfaceC0177d) {
        this.f604a = z;
        this.f605b = i;
        this.f606c = interfaceC0177d;
    }

    /* renamed from: a */
    private static int m8919a(CharSequence charSequence) {
        return new C0172b(charSequence, false).m8904d();
    }

    /* renamed from: b */
    private static int m8918b(CharSequence charSequence) {
        return new C0172b(charSequence, false).m8903e();
    }

    /* renamed from: c */
    public static C0170a m8917c() {
        return new C0171a().m8910a();
    }

    /* renamed from: e */
    static boolean m8915e(Locale locale) {
        return C0185f.m8877b(locale) == 1;
    }

    /* renamed from: f */
    private String m8914f(CharSequence charSequence, InterfaceC0177d interfaceC0177d) {
        boolean mo8881a = interfaceC0177d.mo8881a(charSequence, 0, charSequence.length());
        return (this.f604a || !(mo8881a || m8918b(charSequence) == 1)) ? this.f604a ? (!mo8881a || m8918b(charSequence) == -1) ? f601f : "" : "" : f600e;
    }

    /* renamed from: g */
    private String m8913g(CharSequence charSequence, InterfaceC0177d interfaceC0177d) {
        boolean mo8881a = interfaceC0177d.mo8881a(charSequence, 0, charSequence.length());
        return (this.f604a || !(mo8881a || m8919a(charSequence) == 1)) ? this.f604a ? (!mo8881a || m8919a(charSequence) == -1) ? f601f : "" : "" : f600e;
    }

    /* renamed from: d */
    public boolean m8916d() {
        return (this.f605b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence m8912h(CharSequence charSequence) {
        return m8911i(charSequence, this.f606c, true);
    }

    /* renamed from: i */
    public CharSequence m8911i(CharSequence charSequence, InterfaceC0177d interfaceC0177d, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean mo8881a = interfaceC0177d.mo8881a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m8916d() && z) {
            spannableStringBuilder.append((CharSequence) m8913g(charSequence, mo8881a ? C0178e.f630b : C0178e.f629a));
        }
        if (mo8881a != this.f604a) {
            spannableStringBuilder.append(mo8881a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) m8914f(charSequence, mo8881a ? C0178e.f630b : C0178e.f629a));
        }
        return spannableStringBuilder;
    }
}
