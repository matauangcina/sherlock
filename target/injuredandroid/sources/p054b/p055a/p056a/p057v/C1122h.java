package p054b.p055a.p056a.p057v;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import p054b.p055a.p056a.C1088g;
/* renamed from: b.a.a.v.h */
/* loaded from: classes.dex */
public final class C1122h {

    /* renamed from: a */
    private final int f3826a;

    /* renamed from: b */
    private final List<C1088g> f3827b;

    /* renamed from: c */
    private final int f3828c;

    /* renamed from: d */
    private final InputStream f3829d;

    public C1122h(int i, List<C1088g> list) {
        this(i, list, -1, null);
    }

    public C1122h(int i, List<C1088g> list, int i2, InputStream inputStream) {
        this.f3826a = i;
        this.f3827b = list;
        this.f3828c = i2;
        this.f3829d = inputStream;
    }

    /* renamed from: a */
    public final InputStream m4872a() {
        return this.f3829d;
    }

    /* renamed from: b */
    public final int m4871b() {
        return this.f3828c;
    }

    /* renamed from: c */
    public final List<C1088g> m4870c() {
        return Collections.unmodifiableList(this.f3827b);
    }

    /* renamed from: d */
    public final int m4869d() {
        return this.f3826a;
    }
}
