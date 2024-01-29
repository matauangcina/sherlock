package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
/* renamed from: androidx.navigation.p */
/* loaded from: classes.dex */
public abstract class AbstractC0934p<T> {

    /* renamed from: b */
    public static final AbstractC0934p<Integer> f3273b = new C0937c(false);

    /* renamed from: c */
    public static final AbstractC0934p<Integer> f3274c = new C0938d(false);

    /* renamed from: d */
    public static final AbstractC0934p<int[]> f3275d = new C0939e(true);

    /* renamed from: e */
    public static final AbstractC0934p<Long> f3276e = new C0940f(false);

    /* renamed from: f */
    public static final AbstractC0934p<long[]> f3277f = new C0941g(true);

    /* renamed from: g */
    public static final AbstractC0934p<Float> f3278g = new C0942h(false);

    /* renamed from: h */
    public static final AbstractC0934p<float[]> f3279h = new C0943i(true);

    /* renamed from: i */
    public static final AbstractC0934p<Boolean> f3280i = new C0944j(false);

    /* renamed from: j */
    public static final AbstractC0934p<boolean[]> f3281j = new C0945k(true);

    /* renamed from: k */
    public static final AbstractC0934p<String> f3282k = new C0935a(true);

    /* renamed from: l */
    public static final AbstractC0934p<String[]> f3283l = new C0936b(true);

    /* renamed from: a */
    private final boolean f3284a;

    /* renamed from: androidx.navigation.p$a */
    /* loaded from: classes.dex */
    class C0935a extends AbstractC0934p<String> {
        C0935a(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return "string";
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ String mo5864h(String str) {
            m5905k(str);
            return str;
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public String mo5866b(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        /* renamed from: k */
        public String m5905k(String str) {
            return str;
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: androidx.navigation.p$b */
    /* loaded from: classes.dex */
    class C0936b extends AbstractC0934p<String[]> {
        C0936b(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return "string[]";
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ String[] mo5864h(String str) {
            m5902k(str);
            throw null;
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public String[] mo5866b(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        /* renamed from: k */
        public String[] m5902k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    /* renamed from: androidx.navigation.p$c */
    /* loaded from: classes.dex */
    class C0937c extends AbstractC0934p<Integer> {
        C0937c(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return "integer";
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public Integer mo5866b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: k */
        public Integer mo5864h(String str) {
            return Integer.valueOf(str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str));
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* renamed from: androidx.navigation.p$d */
    /* loaded from: classes.dex */
    class C0938d extends AbstractC0934p<Integer> {
        C0938d(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return "reference";
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public Integer mo5866b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: k */
        public Integer mo5864h(String str) {
            return Integer.valueOf(str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str));
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* renamed from: androidx.navigation.p$e */
    /* loaded from: classes.dex */
    class C0939e extends AbstractC0934p<int[]> {
        C0939e(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return "integer[]";
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ int[] mo5864h(String str) {
            m5893k(str);
            throw null;
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public int[] mo5866b(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        /* renamed from: k */
        public int[] m5893k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    /* renamed from: androidx.navigation.p$f */
    /* loaded from: classes.dex */
    class C0940f extends AbstractC0934p<Long> {
        C0940f(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return "long";
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public Long mo5866b(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: k */
        public Long mo5864h(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            return Long.valueOf(str.startsWith("0x") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str));
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, Long l) {
            bundle.putLong(str, l.longValue());
        }
    }

    /* renamed from: androidx.navigation.p$g */
    /* loaded from: classes.dex */
    class C0941g extends AbstractC0934p<long[]> {
        C0941g(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return "long[]";
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ long[] mo5864h(String str) {
            m5887k(str);
            throw null;
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public long[] mo5866b(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        /* renamed from: k */
        public long[] m5887k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    /* renamed from: androidx.navigation.p$h */
    /* loaded from: classes.dex */
    class C0942h extends AbstractC0934p<Float> {
        C0942h(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return "float";
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public Float mo5866b(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: k */
        public Float mo5864h(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, Float f) {
            bundle.putFloat(str, f.floatValue());
        }
    }

    /* renamed from: androidx.navigation.p$i */
    /* loaded from: classes.dex */
    class C0943i extends AbstractC0934p<float[]> {
        C0943i(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return "float[]";
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ float[] mo5864h(String str) {
            m5881k(str);
            throw null;
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public float[] mo5866b(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        /* renamed from: k */
        public float[] m5881k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    /* renamed from: androidx.navigation.p$j */
    /* loaded from: classes.dex */
    class C0944j extends AbstractC0934p<Boolean> {
        C0944j(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return "boolean";
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public Boolean mo5866b(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: k */
        public Boolean mo5864h(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    /* renamed from: androidx.navigation.p$k */
    /* loaded from: classes.dex */
    class C0945k extends AbstractC0934p<boolean[]> {
        C0945k(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return "boolean[]";
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ boolean[] mo5864h(String str) {
            m5875k(str);
            throw null;
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public boolean[] mo5866b(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        /* renamed from: k */
        public boolean[] m5875k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* renamed from: androidx.navigation.p$l */
    /* loaded from: classes.dex */
    public static final class C0946l<D extends Enum> extends C0950p<D> {

        /* renamed from: n */
        private final Class<D> f3285n;

        public C0946l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.f3285n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        @Override // androidx.navigation.AbstractC0934p.C0950p, androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return this.f3285n.getName();
        }

        @Override // androidx.navigation.AbstractC0934p.C0950p
        /* renamed from: m */
        public D mo5861k(String str) {
            D[] enumConstants;
            for (D d : this.f3285n.getEnumConstants()) {
                if (d.name().equals(str)) {
                    return d;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f3285n.getName() + ".");
        }
    }

    /* renamed from: androidx.navigation.p$m */
    /* loaded from: classes.dex */
    public static final class C0947m<D extends Parcelable> extends AbstractC0934p<D[]> {

        /* renamed from: m */
        private final Class<D[]> f3286m;

        public C0947m(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
            try {
                this.f3286m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return this.f3286m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0947m.class != obj.getClass()) {
                return false;
            }
            return this.f3286m.equals(((C0947m) obj).f3286m);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo5864h(String str) {
            m5871k(str);
            throw null;
        }

        public int hashCode() {
            return this.f3286m.hashCode();
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public D[] mo5866b(Bundle bundle, String str) {
            return (D[]) ((Parcelable[]) bundle.get(str));
        }

        /* renamed from: k */
        public D[] m5871k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, D[] dArr) {
            this.f3286m.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    /* renamed from: androidx.navigation.p$n */
    /* loaded from: classes.dex */
    public static final class C0948n<D> extends AbstractC0934p<D> {

        /* renamed from: m */
        private final Class<D> f3287m;

        public C0948n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f3287m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: b */
        public D mo5866b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return this.f3287m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0948n.class != obj.getClass()) {
                return false;
            }
            return this.f3287m.equals(((C0948n) obj).f3287m);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: h */
        public D mo5864h(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.f3287m.hashCode();
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: i */
        public void mo5863i(Bundle bundle, String str, D d) {
            this.f3287m.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }
    }

    /* renamed from: androidx.navigation.p$o */
    /* loaded from: classes.dex */
    public static final class C0949o<D extends Serializable> extends AbstractC0934p<D[]> {

        /* renamed from: m */
        private final Class<D[]> f3288m;

        public C0949o(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            try {
                this.f3288m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return this.f3288m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0949o.class != obj.getClass()) {
                return false;
            }
            return this.f3288m.equals(((C0949o) obj).f3288m);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo5864h(String str) {
            m5868k(str);
            throw null;
        }

        public int hashCode() {
            return this.f3288m.hashCode();
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public D[] mo5866b(Bundle bundle, String str) {
            return (D[]) ((Serializable[]) bundle.get(str));
        }

        /* renamed from: k */
        public D[] m5868k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, D[] dArr) {
            this.f3288m.cast(dArr);
            bundle.putSerializable(str, dArr);
        }
    }

    /* renamed from: androidx.navigation.p$p */
    /* loaded from: classes.dex */
    public static class C0950p<D extends Serializable> extends AbstractC0934p<D> {

        /* renamed from: m */
        private final Class<D> f3289m;

        public C0950p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (!cls.isEnum()) {
                this.f3289m = cls;
            } else {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
        }

        C0950p(boolean z, Class<D> cls) {
            super(z);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f3289m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: c */
        public String mo5865c() {
            return this.f3289m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0950p) {
                return this.f3289m.equals(((C0950p) obj).f3289m);
            }
            return false;
        }

        public int hashCode() {
            return this.f3289m.hashCode();
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: j */
        public D mo5866b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: k */
        public D mo5864h(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0934p
        /* renamed from: l */
        public void mo5863i(Bundle bundle, String str, D d) {
            this.f3289m.cast(d);
            bundle.putSerializable(str, d);
        }
    }

    AbstractC0934p(boolean z) {
        this.f3284a = z;
    }

    /* renamed from: a */
    public static AbstractC0934p<?> m5911a(String str, String str2) {
        String str3;
        if (f3273b.mo5865c().equals(str)) {
            return f3273b;
        }
        if (f3275d.mo5865c().equals(str)) {
            return f3275d;
        }
        if (f3276e.mo5865c().equals(str)) {
            return f3276e;
        }
        if (f3277f.mo5865c().equals(str)) {
            return f3277f;
        }
        if (f3280i.mo5865c().equals(str)) {
            return f3280i;
        }
        if (f3281j.mo5865c().equals(str)) {
            return f3281j;
        }
        if (f3282k.mo5865c().equals(str)) {
            return f3282k;
        }
        if (f3283l.mo5865c().equals(str)) {
            return f3283l;
        }
        if (f3278g.mo5865c().equals(str)) {
            return f3278g;
        }
        if (f3279h.mo5865c().equals(str)) {
            return f3279h;
        }
        if (f3274c.mo5865c().equals(str)) {
            return f3274c;
        }
        if (str == null || str.isEmpty()) {
            return f3282k;
        }
        try {
            if (!str.startsWith(".") || str2 == null) {
                str3 = str;
            } else {
                str3 = str2 + str;
            }
            if (str.endsWith("[]")) {
                str3 = str3.substring(0, str3.length() - 2);
                Class<?> cls = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new C0947m(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new C0949o(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new C0948n(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new C0946l(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new C0950p(cls2);
                }
            }
            throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static AbstractC0934p m5910d(String str) {
        try {
            try {
                try {
                    try {
                        f3273b.mo5864h(str);
                        return f3273b;
                    } catch (IllegalArgumentException unused) {
                        return f3282k;
                    }
                } catch (IllegalArgumentException unused2) {
                    f3278g.mo5864h(str);
                    return f3278g;
                }
            } catch (IllegalArgumentException unused3) {
                f3280i.mo5864h(str);
                return f3280i;
            }
        } catch (IllegalArgumentException unused4) {
            f3276e.mo5864h(str);
            return f3276e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static AbstractC0934p m5909e(Object obj) {
        if (obj instanceof Integer) {
            return f3273b;
        }
        if (obj instanceof int[]) {
            return f3275d;
        }
        if (obj instanceof Long) {
            return f3276e;
        }
        if (obj instanceof long[]) {
            return f3277f;
        }
        if (obj instanceof Float) {
            return f3278g;
        }
        if (obj instanceof float[]) {
            return f3279h;
        }
        if (obj instanceof Boolean) {
            return f3280i;
        }
        if (obj instanceof boolean[]) {
            return f3281j;
        }
        if ((obj instanceof String) || obj == null) {
            return f3282k;
        }
        if (obj instanceof String[]) {
            return f3283l;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new C0947m(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new C0949o(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new C0948n(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new C0946l(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new C0950p(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    /* renamed from: b */
    public abstract T mo5866b(Bundle bundle, String str);

    /* renamed from: c */
    public abstract String mo5865c();

    /* renamed from: f */
    public boolean m5908f() {
        return this.f3284a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public T m5907g(Bundle bundle, String str, String str2) {
        T mo5864h = mo5864h(str2);
        mo5863i(bundle, str, mo5864h);
        return mo5864h;
    }

    /* renamed from: h */
    public abstract T mo5864h(String str);

    /* renamed from: i */
    public abstract void mo5863i(Bundle bundle, String str, T t);

    public String toString() {
        return mo5865c();
    }
}
