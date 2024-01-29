package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.android.gms.common.util.C1703k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: b.c.a.a.d.c.z1 */
/* loaded from: classes.dex */
public final class C1264z1 extends AbstractC1684a {
    public static final Parcelable.Creator<C1264z1> CREATOR = new C1186b2();

    /* renamed from: f */
    private final int f4030f;

    /* renamed from: g */
    private List<String> f4031g;

    public C1264z1() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1264z1(int i, List<String> list) {
        List<String> emptyList;
        this.f4030f = i;
        if (list == null || list.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.set(i2, C1703k.m3543a(list.get(i2)));
            }
            emptyList = Collections.unmodifiableList(list);
        }
        this.f4031g = emptyList;
    }

    private C1264z1(List<String> list) {
        this.f4030f = 1;
        this.f4031g = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f4031g.addAll(list);
    }

    /* renamed from: b */
    public static C1264z1 m4632b(C1264z1 c1264z1) {
        return new C1264z1(c1264z1 != null ? c1264z1.f4031g : null);
    }

    /* renamed from: c */
    public static C1264z1 m4631c() {
        return new C1264z1(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3591g(parcel, 1, this.f4030f);
        C1687c.m3586l(parcel, 2, this.f4031g, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
