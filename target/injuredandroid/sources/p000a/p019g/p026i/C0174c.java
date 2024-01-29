package p000a.p019g.p026i;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p000a.p019g.p027j.C0189d;
/* renamed from: a.g.i.c */
/* loaded from: classes.dex */
public class C0174c implements Spannable {

    /* renamed from: f */
    private final Spannable f618f;

    /* renamed from: g */
    private final C0175a f619g;

    /* renamed from: h */
    private final PrecomputedText f620h;

    /* renamed from: a.g.i.c$a */
    /* loaded from: classes.dex */
    public static final class C0175a {

        /* renamed from: a */
        private final TextPaint f621a;

        /* renamed from: b */
        private final TextDirectionHeuristic f622b;

        /* renamed from: c */
        private final int f623c;

        /* renamed from: d */
        private final int f624d;

        /* renamed from: a.g.i.c$a$a */
        /* loaded from: classes.dex */
        public static class C0176a {

            /* renamed from: a */
            private final TextPaint f625a;

            /* renamed from: b */
            private TextDirectionHeuristic f626b;

            /* renamed from: c */
            private int f627c;

            /* renamed from: d */
            private int f628d;

            public C0176a(TextPaint textPaint) {
                this.f625a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f627c = 1;
                    this.f628d = 1;
                } else {
                    this.f628d = 0;
                    this.f627c = 0;
                }
                this.f626b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            /* renamed from: a */
            public C0175a m8888a() {
                return new C0175a(this.f625a, this.f626b, this.f627c, this.f628d);
            }

            /* renamed from: b */
            public C0176a m8887b(int i) {
                this.f627c = i;
                return this;
            }

            /* renamed from: c */
            public C0176a m8886c(int i) {
                this.f628d = i;
                return this;
            }

            /* renamed from: d */
            public C0176a m8885d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f626b = textDirectionHeuristic;
                return this;
            }
        }

        public C0175a(PrecomputedText.Params params) {
            this.f621a = params.getTextPaint();
            this.f622b = params.getTextDirection();
            this.f623c = params.getBreakStrategy();
            this.f624d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }

        C0175a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f621a = textPaint;
            this.f622b = textDirectionHeuristic;
            this.f623c = i;
            this.f624d = i2;
        }

        /* renamed from: a */
        public boolean m8893a(C0175a c0175a) {
            if ((Build.VERSION.SDK_INT < 23 || (this.f623c == c0175a.m8892b() && this.f624d == c0175a.m8891c())) && this.f621a.getTextSize() == c0175a.m8889e().getTextSize() && this.f621a.getTextScaleX() == c0175a.m8889e().getTextScaleX() && this.f621a.getTextSkewX() == c0175a.m8889e().getTextSkewX()) {
                if ((Build.VERSION.SDK_INT < 21 || (this.f621a.getLetterSpacing() == c0175a.m8889e().getLetterSpacing() && TextUtils.equals(this.f621a.getFontFeatureSettings(), c0175a.m8889e().getFontFeatureSettings()))) && this.f621a.getFlags() == c0175a.m8889e().getFlags()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 24) {
                        if (!this.f621a.getTextLocales().equals(c0175a.m8889e().getTextLocales())) {
                            return false;
                        }
                    } else if (i >= 17 && !this.f621a.getTextLocale().equals(c0175a.m8889e().getTextLocale())) {
                        return false;
                    }
                    return this.f621a.getTypeface() == null ? c0175a.m8889e().getTypeface() == null : this.f621a.getTypeface().equals(c0175a.m8889e().getTypeface());
                }
                return false;
            }
            return false;
        }

        /* renamed from: b */
        public int m8892b() {
            return this.f623c;
        }

        /* renamed from: c */
        public int m8891c() {
            return this.f624d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m8890d() {
            return this.f622b;
        }

        /* renamed from: e */
        public TextPaint m8889e() {
            return this.f621a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0175a) {
                C0175a c0175a = (C0175a) obj;
                if (m8893a(c0175a)) {
                    return Build.VERSION.SDK_INT < 18 || this.f622b == c0175a.m8890d();
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C0189d.m8872b(Float.valueOf(this.f621a.getTextSize()), Float.valueOf(this.f621a.getTextScaleX()), Float.valueOf(this.f621a.getTextSkewX()), Float.valueOf(this.f621a.getLetterSpacing()), Integer.valueOf(this.f621a.getFlags()), this.f621a.getTextLocales(), this.f621a.getTypeface(), Boolean.valueOf(this.f621a.isElegantTextHeight()), this.f622b, Integer.valueOf(this.f623c), Integer.valueOf(this.f624d));
            }
            if (i >= 21) {
                return C0189d.m8872b(Float.valueOf(this.f621a.getTextSize()), Float.valueOf(this.f621a.getTextScaleX()), Float.valueOf(this.f621a.getTextSkewX()), Float.valueOf(this.f621a.getLetterSpacing()), Integer.valueOf(this.f621a.getFlags()), this.f621a.getTextLocale(), this.f621a.getTypeface(), Boolean.valueOf(this.f621a.isElegantTextHeight()), this.f622b, Integer.valueOf(this.f623c), Integer.valueOf(this.f624d));
            }
            if (i < 18 && i < 17) {
                return C0189d.m8872b(Float.valueOf(this.f621a.getTextSize()), Float.valueOf(this.f621a.getTextScaleX()), Float.valueOf(this.f621a.getTextSkewX()), Integer.valueOf(this.f621a.getFlags()), this.f621a.getTypeface(), this.f622b, Integer.valueOf(this.f623c), Integer.valueOf(this.f624d));
            }
            return C0189d.m8872b(Float.valueOf(this.f621a.getTextSize()), Float.valueOf(this.f621a.getTextScaleX()), Float.valueOf(this.f621a.getTextSkewX()), Integer.valueOf(this.f621a.getFlags()), this.f621a.getTextLocale(), this.f621a.getTypeface(), this.f622b, Integer.valueOf(this.f623c), Integer.valueOf(this.f624d));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p019g.p026i.C0174c.C0175a.toString():java.lang.String");
        }
    }

    /* renamed from: a */
    public C0175a m8895a() {
        return this.f619g;
    }

    /* renamed from: b */
    public PrecomputedText m8894b() {
        Spannable spannable = this.f618f;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f618f.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f618f.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f618f.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f618f.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f620h.getSpans(i, i2, cls) : (T[]) this.f618f.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f618f.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f618f.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f620h.removeSpan(obj);
        } else {
            this.f618f.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f620h.setSpan(obj, i, i2, i3);
        } else {
            this.f618f.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f618f.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f618f.toString();
    }
}
