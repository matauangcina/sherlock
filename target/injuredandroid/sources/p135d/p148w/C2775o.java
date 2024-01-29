package p135d.p148w;

import java.util.Collection;
import java.util.Iterator;
import p135d.p136o.AbstractC2666v;
import p135d.p142s.p144d.C2725g;
import p135d.p145t.C2737c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.w.o */
/* loaded from: classes.dex */
public class C2775o extends C2774n {
    /* renamed from: f */
    public static final boolean m806f(CharSequence charSequence) {
        boolean z;
        C2725g.m881e(charSequence, "$this$isBlank");
        if (charSequence.length() != 0) {
            C2737c m795j = C2776p.m795j(charSequence);
            if (!(m795j instanceof Collection) || !((Collection) m795j).isEmpty()) {
                Iterator<Integer> it = m795j.iterator();
                while (it.hasNext()) {
                    if (!C2758a.m826a(charSequence.charAt(((AbstractC2666v) it).mo853b()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static final boolean m805g(String str, int i, String str2, int i2, int i3, boolean z) {
        C2725g.m881e(str, "$this$regionMatches");
        C2725g.m881e(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }
}
