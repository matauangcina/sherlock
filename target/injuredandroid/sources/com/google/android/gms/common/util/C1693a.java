package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.C1677q;
/* renamed from: com.google.android.gms.common.util.a */
/* loaded from: classes.dex */
public final class C1693a {
    /* renamed from: a */
    public static <T> boolean m3569a(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (C1677q.m3642a(tArr[i], t)) {
                break;
            } else {
                i++;
            }
        }
        return i >= 0;
    }
}
