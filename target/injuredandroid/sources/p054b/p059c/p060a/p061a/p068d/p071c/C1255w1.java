package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: b.c.a.a.d.c.w1 */
/* loaded from: classes.dex */
public final class C1255w1 extends AbstractC1684a {
    public static final Parcelable.Creator<C1255w1> CREATOR = new C1252v1();

    /* renamed from: f */
    private List<C1249u1> f4017f;

    public C1255w1() {
        this.f4017f = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1255w1(List<C1249u1> list) {
        this.f4017f = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    /* renamed from: b */
    public static C1255w1 m4643b(C1255w1 c1255w1) {
        List<C1249u1> list = c1255w1.f4017f;
        C1255w1 c1255w12 = new C1255w1();
        if (list != null) {
            c1255w12.f4017f.addAll(list);
        }
        return c1255w12;
    }

    /* renamed from: c */
    public final List<C1249u1> m4642c() {
        return this.f4017f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3584n(parcel, 2, this.f4017f, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
