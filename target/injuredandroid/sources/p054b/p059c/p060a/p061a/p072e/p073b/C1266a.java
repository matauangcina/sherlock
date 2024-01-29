package p054b.p059c.p060a.p061a.p072e.p073b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.p116a.C1546a;
import com.google.android.gms.common.api.InterfaceC1565f;
import com.google.android.gms.common.api.InterfaceC1566g;
import com.google.android.gms.common.internal.AbstractC1634c;
import com.google.android.gms.common.internal.AbstractC1658h;
import com.google.android.gms.common.internal.C1648d;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.C1680s;
import p054b.p059c.p060a.p061a.p063b.C1151g;
import p054b.p059c.p060a.p061a.p072e.C1265a;
import p054b.p059c.p060a.p061a.p072e.InterfaceC1280e;
/* renamed from: b.c.a.a.e.b.a */
/* loaded from: classes.dex */
public class C1266a extends AbstractC1658h<InterfaceC1271f> implements InterfaceC1280e {

    /* renamed from: A */
    private Integer f4042A;

    /* renamed from: x */
    private final boolean f4043x;

    /* renamed from: y */
    private final C1648d f4044y;

    /* renamed from: z */
    private final Bundle f4045z;

    private C1266a(Context context, Looper looper, boolean z, C1648d c1648d, Bundle bundle, InterfaceC1565f interfaceC1565f, InterfaceC1566g interfaceC1566g) {
        super(context, looper, 44, c1648d, interfaceC1565f, interfaceC1566g);
        this.f4043x = true;
        this.f4044y = c1648d;
        this.f4045z = bundle;
        this.f4042A = c1648d.m3720d();
    }

    public C1266a(Context context, Looper looper, boolean z, C1648d c1648d, C1265a c1265a, InterfaceC1565f interfaceC1565f, InterfaceC1566g interfaceC1566g) {
        this(context, looper, true, c1648d, m4621k0(c1648d), interfaceC1565f, interfaceC1566g);
    }

    /* renamed from: k0 */
    public static Bundle m4621k0(C1648d c1648d) {
        C1265a m3716h = c1648d.m3716h();
        Integer m3720d = c1648d.m3720d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c1648d.m3723a());
        if (m3720d != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m3720d.intValue());
        }
        if (m3716h != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", m3716h.m4623j());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", m3716h.m4624i());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", m3716h.m4626g());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", m3716h.m4625h());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", m3716h.m4629d());
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", m3716h.m4628e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", m3716h.m4622k());
            if (m3716h.m4630b() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", m3716h.m4630b().longValue());
            }
            if (m3716h.m4627f() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", m3716h.m4627f().longValue());
            }
        }
        return bundle;
    }

    @Override // p054b.p059c.p060a.p061a.p072e.InterfaceC1280e
    /* renamed from: a */
    public final void mo4612a() {
        m3741o(new AbstractC1634c.C1638d());
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: f */
    protected String mo2217f() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: h */
    protected /* synthetic */ IInterface mo2216h(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof InterfaceC1271f ? (InterfaceC1271f) queryLocalInterface : new C1273h(iBinder);
    }

    @Override // p054b.p059c.p060a.p061a.p072e.InterfaceC1280e
    /* renamed from: i */
    public final void mo4611i(InterfaceC1269d interfaceC1269d) {
        C1679r.m3630i(interfaceC1269d, "Expecting a valid ISignInCallbacks");
        try {
            Account m3722b = this.f4044y.m3722b();
            ((InterfaceC1271f) m3775C()).mo4615R(new C1275j(new C1680s(m3722b, this.f4042A.intValue(), "<<default account>>".equals(m3722b.name) ? C1546a.m3977a(m3735y()).m3976b() : null)), interfaceC1269d);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC1269d.mo3903D(new C1277l(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1658h, com.google.android.gms.common.internal.AbstractC1634c, com.google.android.gms.common.api.C1548a.InterfaceC1556f
    /* renamed from: k */
    public int mo2214k() {
        return C1151g.f3867a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c, com.google.android.gms.common.api.C1548a.InterfaceC1556f
    /* renamed from: q */
    public boolean mo3739q() {
        return this.f4043x;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: r */
    protected String mo2213r() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: z */
    public Bundle mo2211z() {
        if (!m3735y().getPackageName().equals(this.f4044y.m3718f())) {
            this.f4045z.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f4044y.m3718f());
        }
        return this.f4045z;
    }
}
