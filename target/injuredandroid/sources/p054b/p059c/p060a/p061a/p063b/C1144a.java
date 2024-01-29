package p054b.p059c.p060a.p061a.p063b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1677q;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.b.a */
/* loaded from: classes.dex */
public final class C1144a extends AbstractC1684a {

    /* renamed from: f */
    private final int f3851f;

    /* renamed from: g */
    private final int f3852g;

    /* renamed from: h */
    private final PendingIntent f3853h;

    /* renamed from: i */
    private final String f3854i;

    /* renamed from: j */
    public static final C1144a f3850j = new C1144a(0);
    public static final Parcelable.Creator<C1144a> CREATOR = new C1159n();

    public C1144a(int i) {
        this(i, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1144a(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f3851f = i;
        this.f3852g = i2;
        this.f3853h = pendingIntent;
        this.f3854i = str;
    }

    public C1144a(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public C1144a(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static String m4806n(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            default:
                                StringBuilder sb = new StringBuilder(31);
                                sb.append("UNKNOWN_ERROR_CODE(");
                                sb.append(i);
                                sb.append(")");
                                return sb.toString();
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    /* renamed from: b */
    public final int m4811b() {
        return this.f3852g;
    }

    /* renamed from: c */
    public final String m4810c() {
        return this.f3854i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1144a) {
            C1144a c1144a = (C1144a) obj;
            return this.f3852g == c1144a.f3852g && C1677q.m3642a(this.f3853h, c1144a.f3853h) && C1677q.m3642a(this.f3854i, c1144a.f3854i);
        }
        return false;
    }

    /* renamed from: h */
    public final PendingIntent m4809h() {
        return this.f3853h;
    }

    public final int hashCode() {
        return C1677q.m3641b(Integer.valueOf(this.f3852g), this.f3853h, this.f3854i);
    }

    /* renamed from: j */
    public final boolean m4808j() {
        return (this.f3852g == 0 || this.f3853h == null) ? false : true;
    }

    /* renamed from: k */
    public final boolean m4807k() {
        return this.f3852g == 0;
    }

    public final String toString() {
        C1677q.C1678a m3640c = C1677q.m3640c(this);
        m3640c.m3639a("statusCode", m4806n(this.f3852g));
        m3640c.m3639a("resolution", this.f3853h);
        m3640c.m3639a("message", this.f3854i);
        return m3640c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3591g(parcel, 1, this.f3851f);
        C1687c.m3591g(parcel, 2, m4811b());
        C1687c.m3588j(parcel, 3, m4809h(), i, false);
        C1687c.m3587k(parcel, 4, m4810c(), false);
        C1687c.m3596b(parcel, m3597a);
    }
}
