package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.InterfaceC0895w;
import p000a.p019g.p027j.C0194i;
/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public class C0808h {

    /* renamed from: a */
    private final AbstractC0810j<?> f2911a;

    private C0808h(AbstractC0810j<?> abstractC0810j) {
        this.f2911a = abstractC0810j;
    }

    /* renamed from: b */
    public static C0808h m6475b(AbstractC0810j<?> abstractC0810j) {
        C0194i.m8865d(abstractC0810j, "callbacks == null");
        return new C0808h(abstractC0810j);
    }

    /* renamed from: a */
    public void m6476a(Fragment fragment) {
        AbstractC0810j<?> abstractC0810j = this.f2911a;
        abstractC0810j.f2916i.m6361g(abstractC0810j, abstractC0810j, fragment);
    }

    /* renamed from: c */
    public void m6474c() {
        this.f2911a.f2916i.m6339r();
    }

    /* renamed from: d */
    public void m6473d(Configuration configuration) {
        this.f2911a.f2916i.m6337s(configuration);
    }

    /* renamed from: e */
    public boolean m6472e(MenuItem menuItem) {
        return this.f2911a.f2916i.m6335t(menuItem);
    }

    /* renamed from: f */
    public void m6471f() {
        this.f2911a.f2916i.m6333u();
    }

    /* renamed from: g */
    public boolean m6470g(Menu menu, MenuInflater menuInflater) {
        return this.f2911a.f2916i.m6331v(menu, menuInflater);
    }

    /* renamed from: h */
    public void m6469h() {
        this.f2911a.f2916i.m6329w();
    }

    /* renamed from: i */
    public void m6468i() {
        this.f2911a.f2916i.m6325y();
    }

    /* renamed from: j */
    public void m6467j(boolean z) {
        this.f2911a.f2916i.m6323z(z);
    }

    /* renamed from: k */
    public boolean m6466k(MenuItem menuItem) {
        return this.f2911a.f2916i.m6424A(menuItem);
    }

    /* renamed from: l */
    public void m6465l(Menu menu) {
        this.f2911a.f2916i.m6422B(menu);
    }

    /* renamed from: m */
    public void m6464m() {
        this.f2911a.f2916i.m6418D();
    }

    /* renamed from: n */
    public void m6463n(boolean z) {
        this.f2911a.f2916i.m6416E(z);
    }

    /* renamed from: o */
    public boolean m6462o(Menu menu) {
        return this.f2911a.f2916i.m6414F(menu);
    }

    /* renamed from: p */
    public void m6461p() {
        this.f2911a.f2916i.m6410H();
    }

    /* renamed from: q */
    public void m6460q() {
        this.f2911a.f2916i.m6408I();
    }

    /* renamed from: r */
    public void m6459r() {
        this.f2911a.f2916i.m6404K();
    }

    /* renamed from: s */
    public boolean m6458s() {
        return this.f2911a.f2916i.m6392Q(true);
    }

    /* renamed from: t */
    public Fragment m6457t(String str) {
        return this.f2911a.f2916i.m6376Y(str);
    }

    /* renamed from: u */
    public AbstractC0814m m6456u() {
        return this.f2911a.f2916i;
    }

    /* renamed from: v */
    public void m6455v() {
        this.f2911a.f2916i.m6421B0();
    }

    /* renamed from: w */
    public View m6454w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2911a.f2916i.m6360g0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: x */
    public void m6453x(Parcelable parcelable) {
        AbstractC0810j<?> abstractC0810j = this.f2911a;
        if (!(abstractC0810j instanceof InterfaceC0895w)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        abstractC0810j.f2916i.m6395O0(parcelable);
    }

    /* renamed from: y */
    public Parcelable m6452y() {
        return this.f2911a.f2916i.m6391Q0();
    }
}
