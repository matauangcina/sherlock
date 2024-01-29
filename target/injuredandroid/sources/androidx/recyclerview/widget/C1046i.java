package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1017a;
import java.util.List;
/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
class C1046i {

    /* renamed from: a */
    final InterfaceC1047a f3661a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1047a {
        /* renamed from: a */
        void mo5170a(C1017a.C1019b c1019b);

        /* renamed from: b */
        C1017a.C1019b mo5169b(int i, int i2, int i3, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1046i(InterfaceC1047a interfaceC1047a) {
        this.f3661a = interfaceC1047a;
    }

    /* renamed from: a */
    private int m5176a(List<C1017a.C1019b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f3531a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m5174c(List<C1017a.C1019b> list, int i, C1017a.C1019b c1019b, int i2, C1017a.C1019b c1019b2) {
        int i3 = c1019b.f3534d < c1019b2.f3532b ? -1 : 0;
        if (c1019b.f3532b < c1019b2.f3532b) {
            i3++;
        }
        int i4 = c1019b2.f3532b;
        int i5 = c1019b.f3532b;
        if (i4 <= i5) {
            c1019b.f3532b = i5 + c1019b2.f3534d;
        }
        int i6 = c1019b2.f3532b;
        int i7 = c1019b.f3534d;
        if (i6 <= i7) {
            c1019b.f3534d = i7 + c1019b2.f3534d;
        }
        c1019b2.f3532b += i3;
        list.set(i, c1019b2);
        list.set(i2, c1019b);
    }

    /* renamed from: d */
    private void m5173d(List<C1017a.C1019b> list, int i, int i2) {
        C1017a.C1019b c1019b = list.get(i);
        C1017a.C1019b c1019b2 = list.get(i2);
        int i3 = c1019b2.f3531a;
        if (i3 == 1) {
            m5174c(list, i, c1019b, i2, c1019b2);
        } else if (i3 == 2) {
            m5172e(list, i, c1019b, i2, c1019b2);
        } else if (i3 != 4) {
        } else {
            m5171f(list, i, c1019b, i2, c1019b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m5175b(List<C1017a.C1019b> list) {
        while (true) {
            int m5176a = m5176a(list);
            if (m5176a == -1) {
                return;
            }
            m5173d(list, m5176a, m5176a + 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009e, code lost:
        if (r0 > r14.f3532b) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c8, code lost:
        if (r0 >= r14.f3532b) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ca, code lost:
        r12.f3534d = r0 - r14.f3534d;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m5172e(java.util.List<androidx.recyclerview.widget.C1017a.C1019b> r10, int r11, androidx.recyclerview.widget.C1017a.C1019b r12, int r13, androidx.recyclerview.widget.C1017a.C1019b r14) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1046i.m5172e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m5171f(java.util.List<androidx.recyclerview.widget.C1017a.C1019b> r9, int r10, androidx.recyclerview.widget.C1017a.C1019b r11, int r12, androidx.recyclerview.widget.C1017a.C1019b r13) {
        /*
            r8 = this;
            int r0 = r11.f3534d
            int r1 = r13.f3532b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f3532b = r1
            goto L20
        Ld:
            int r5 = r13.f3534d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.f3534d = r5
            androidx.recyclerview.widget.i$a r0 = r8.f3661a
            int r1 = r11.f3532b
            java.lang.Object r5 = r13.f3533c
            androidx.recyclerview.widget.a$b r0 = r0.mo5169b(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f3532b
            int r5 = r13.f3532b
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f3532b = r5
            goto L41
        L2b:
            int r6 = r13.f3534d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.i$a r3 = r8.f3661a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f3533c
            androidx.recyclerview.widget.a$b r3 = r3.mo5169b(r2, r1, r5, r4)
            int r1 = r13.f3534d
            int r1 = r1 - r5
            r13.f3534d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f3534d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.i$a r11 = r8.f3661a
            r11.mo5170a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1046i.m5171f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
