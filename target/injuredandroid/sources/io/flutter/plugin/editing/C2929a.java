package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;
/* renamed from: io.flutter.plugin.editing.a */
/* loaded from: classes.dex */
class C2929a {

    /* renamed from: a */
    private final FlutterJNI f7292a;

    public C2929a(FlutterJNI flutterJNI) {
        this.f7292a = flutterJNI;
    }

    /* renamed from: a */
    public int m361a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = length - 1;
        if (i >= i2) {
            return length;
        }
        int codePointAt = Character.codePointAt(charSequence, i);
        int charCount = Character.charCount(codePointAt);
        int i3 = i + charCount;
        int i4 = 0;
        if (i3 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (Character.codePointAt(charSequence, i3) == 13) {
                charCount++;
            }
            return i + charCount;
        } else if (m355g(codePointAt)) {
            if (i3 >= i2 || !m355g(Character.codePointAt(charSequence, i3))) {
                return i3;
            }
            int i5 = i;
            while (i5 > 0 && m355g(Character.codePointBefore(charSequence, i))) {
                i5 -= Character.charCount(Character.codePointBefore(charSequence, i));
                i4++;
            }
            if (i4 % 2 == 0) {
                charCount += 2;
            }
            return i + charCount;
        } else {
            if (m356f(codePointAt)) {
                charCount += Character.charCount(codePointAt);
            }
            if (codePointAt == 8419) {
                int codePointBefore = Character.codePointBefore(charSequence, i3);
                int charCount2 = i3 + Character.charCount(codePointBefore);
                if (charCount2 < length && m353i(codePointBefore)) {
                    int codePointAt2 = Character.codePointAt(charSequence, charCount2);
                    if (m356f(codePointAt2)) {
                        charCount += Character.charCount(codePointBefore) + Character.charCount(codePointAt2);
                    }
                } else if (m356f(codePointBefore)) {
                    charCount += Character.charCount(codePointBefore);
                }
                return i + charCount;
            }
            if (m359c(codePointAt)) {
                boolean z = false;
                int i6 = 0;
                do {
                    if (z) {
                        charCount += Character.charCount(codePointAt) + i6 + 1;
                        z = false;
                    }
                    if (m358d(codePointAt)) {
                        break;
                    }
                    if (i3 < length) {
                        codePointAt = Character.codePointAt(charSequence, i3);
                        i3 += Character.charCount(codePointAt);
                        if (codePointAt != 8419) {
                            if (!m358d(codePointAt) && !m353i(codePointAt)) {
                                if (codePointAt == 8205) {
                                    codePointAt = Character.codePointAt(charSequence, i3);
                                    i3 += Character.charCount(codePointAt);
                                    if (i3 < length && m353i(codePointAt)) {
                                        codePointAt = Character.codePointAt(charSequence, i3);
                                        int charCount3 = Character.charCount(codePointAt);
                                        i3 += Character.charCount(codePointAt);
                                        i6 = charCount3;
                                        z = true;
                                        if (i3 < length || !z) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        z = true;
                                    }
                                }
                            } else {
                                charCount += Character.charCount(codePointAt) + 0;
                                break;
                            }
                        } else {
                            int codePointBefore2 = Character.codePointBefore(charSequence, i3);
                            int charCount4 = i3 + Character.charCount(codePointBefore2);
                            if (charCount4 < length && m353i(codePointBefore2)) {
                                int codePointAt3 = Character.codePointAt(charSequence, charCount4);
                                if (m356f(codePointAt3)) {
                                    charCount += Character.charCount(codePointBefore2) + Character.charCount(codePointAt3);
                                }
                            } else if (m356f(codePointBefore2)) {
                                charCount += Character.charCount(codePointBefore2);
                            }
                            return i + charCount;
                        }
                    }
                    i6 = 0;
                    if (i3 < length) {
                        break;
                    }
                } while (m359c(codePointAt));
            }
            return i + charCount;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014c A[EDGE_INSN: B:100:0x014c->B:94:0x014c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m360b(java.lang.CharSequence r9, int r10) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.C2929a.m360b(java.lang.CharSequence, int):int");
    }

    /* renamed from: c */
    public boolean m359c(int i) {
        return this.f7292a.nativeFlutterTextUtilsIsEmoji(i);
    }

    /* renamed from: d */
    public boolean m358d(int i) {
        return this.f7292a.nativeFlutterTextUtilsIsEmojiModifier(i);
    }

    /* renamed from: e */
    public boolean m357e(int i) {
        return this.f7292a.nativeFlutterTextUtilsIsEmojiModifierBase(i);
    }

    /* renamed from: f */
    public boolean m356f(int i) {
        return (48 <= i && i <= 57) || i == 35 || i == 42;
    }

    /* renamed from: g */
    public boolean m355g(int i) {
        return this.f7292a.nativeFlutterTextUtilsIsRegionalIndicator(i);
    }

    /* renamed from: h */
    public boolean m354h(int i) {
        return 917536 <= i && i <= 917630;
    }

    /* renamed from: i */
    public boolean m353i(int i) {
        return this.f7292a.nativeFlutterTextUtilsIsVariationSelector(i);
    }
}
