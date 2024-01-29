package p000a.p032i.p034b;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* renamed from: a.i.b.b */
/* loaded from: classes.dex */
class C0287b {

    /* renamed from: a.i.b.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0288a<T> {
        /* renamed from: a */
        void mo8468a(T t, Rect rect);
    }

    /* renamed from: a.i.b.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0289b<T, V> {
        /* renamed from: a */
        V mo8467a(T t, int i);

        /* renamed from: b */
        int mo8466b(T t);
    }

    /* renamed from: a.i.b.b$c */
    /* loaded from: classes.dex */
    private static class C0290c<T> implements Comparator<T> {

        /* renamed from: f */
        private final Rect f787f = new Rect();

        /* renamed from: g */
        private final Rect f788g = new Rect();

        /* renamed from: h */
        private final boolean f789h;

        /* renamed from: i */
        private final InterfaceC0288a<T> f790i;

        C0290c(boolean z, InterfaceC0288a<T> interfaceC0288a) {
            this.f789h = z;
            this.f790i = interfaceC0288a;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f787f;
            Rect rect2 = this.f788g;
            this.f790i.mo8468a(t, rect);
            this.f790i.mo8468a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f789h ? 1 : -1;
            } else if (i3 > i4) {
                return this.f789h ? -1 : 1;
            } else {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    return this.f789h ? 1 : -1;
                } else if (i7 > i8) {
                    return this.f789h ? -1 : 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m8483a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean m8482b = m8482b(i, rect, rect2);
        if (m8482b(i, rect, rect3) || !m8482b) {
            return false;
        }
        return !m8474j(i, rect, rect3) || i == 17 || i == 66 || m8473k(i, rect, rect2) < m8471m(i, rect, rect3);
    }

    /* renamed from: b */
    private static boolean m8482b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <L, T> T m8481c(L r7, p000a.p032i.p034b.C0287b.InterfaceC0289b<L, T> r8, p000a.p032i.p034b.C0287b.InterfaceC0288a<T> r9, T r10, android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L38
            r1 = 33
            if (r12 == r1) goto L2e
            r1 = 66
            if (r12 == r1) goto L26
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L1e
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
            goto L34
        L1e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L26:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
            goto L3e
        L2e:
            int r1 = r11.height()
            int r1 = r1 + 1
        L34:
            r0.offset(r2, r1)
            goto L41
        L38:
            int r1 = r11.width()
            int r1 = r1 + 1
        L3e:
            r0.offset(r1, r2)
        L41:
            r1 = 0
            int r3 = r8.mo8466b(r7)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
        L4b:
            if (r2 >= r3) goto L64
            java.lang.Object r5 = r8.mo8467a(r7, r2)
            if (r5 != r10) goto L54
            goto L61
        L54:
            r9.mo8468a(r5, r4)
            boolean r6 = m8476h(r12, r11, r4, r0)
            if (r6 == 0) goto L61
            r0.set(r4)
            r1 = r5
        L61:
            int r2 = r2 + 1
            goto L4b
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p032i.p034b.C0287b.m8481c(java.lang.Object, a.i.b.b$b, a.i.b.b$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    /* renamed from: d */
    public static <L, T> T m8480d(L l, InterfaceC0289b<L, T> interfaceC0289b, InterfaceC0288a<T> interfaceC0288a, T t, int i, boolean z, boolean z2) {
        int mo8466b = interfaceC0289b.mo8466b(l);
        ArrayList arrayList = new ArrayList(mo8466b);
        for (int i2 = 0; i2 < mo8466b; i2++) {
            arrayList.add(interfaceC0289b.mo8467a(l, i2));
        }
        Collections.sort(arrayList, new C0290c(z, interfaceC0288a));
        if (i != 1) {
            if (i == 2) {
                return (T) m8479e(t, arrayList, z2);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) m8478f(t, arrayList, z2);
    }

    /* renamed from: e */
    private static <T> T m8479e(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    private static <T> T m8478f(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    private static int m8477g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    private static boolean m8476h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (m8475i(rect, rect2, i)) {
            if (m8475i(rect, rect3, i) && !m8483a(i, rect, rect2, rect3)) {
                return !m8483a(i, rect, rect3, rect2) && m8477g(m8473k(i, rect, rect2), m8469o(i, rect, rect2)) < m8477g(m8473k(i, rect, rect3), m8469o(i, rect, rect3));
            }
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m8475i(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: j */
    private static boolean m8474j(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        } else if (i == 33) {
            return rect.top >= rect2.bottom;
        } else if (i == 66) {
            return rect.right <= rect2.left;
        } else if (i == 130) {
            return rect.bottom <= rect2.top;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: k */
    private static int m8473k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m8472l(i, rect, rect2));
    }

    /* renamed from: l */
    private static int m8472l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    /* renamed from: m */
    private static int m8471m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m8470n(i, rect, rect2));
    }

    /* renamed from: n */
    private static int m8470n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    /* renamed from: o */
    private static int m8469o(int i, Rect rect, Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = rect.left + (rect.width() / 2);
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i2 + (height2 / 2)));
        }
        height = rect.top + (rect.height() / 2);
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i2 + (height2 / 2)));
    }
}
