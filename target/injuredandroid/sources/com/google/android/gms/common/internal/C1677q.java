package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.google.android.gms.common.internal.q */
/* loaded from: classes.dex */
public final class C1677q {

    /* renamed from: com.google.android.gms.common.internal.q$a */
    /* loaded from: classes.dex */
    public static final class C1678a {

        /* renamed from: a */
        private final List<String> f4845a;

        /* renamed from: b */
        private final Object f4846b;

        private C1678a(Object obj) {
            C1679r.m3631h(obj);
            this.f4846b = obj;
            this.f4845a = new ArrayList();
        }

        /* renamed from: a */
        public final C1678a m3639a(String str, Object obj) {
            List<String> list = this.f4845a;
            C1679r.m3631h(str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f4846b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f4845a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f4845a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m3642a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: b */
    public static int m3641b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C1678a m3640c(Object obj) {
        return new C1678a(obj);
    }
}
