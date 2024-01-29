package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC0522m;
import androidx.appcompat.view.menu.InterfaceC0524n;
import java.util.ArrayList;
/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public abstract class AbstractC0496b implements InterfaceC0522m {

    /* renamed from: f */
    protected Context f1519f;

    /* renamed from: g */
    protected Context f1520g;

    /* renamed from: h */
    protected C0507g f1521h;

    /* renamed from: i */
    protected LayoutInflater f1522i;

    /* renamed from: j */
    private InterfaceC0522m.InterfaceC0523a f1523j;

    /* renamed from: k */
    private int f1524k;

    /* renamed from: l */
    private int f1525l;

    /* renamed from: m */
    protected InterfaceC0524n f1526m;

    public AbstractC0496b(Context context, int i, int i2) {
        this.f1519f = context;
        this.f1522i = LayoutInflater.from(context);
        this.f1524k = i;
        this.f1525l = i2;
    }

    /* renamed from: a */
    protected void m7880a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1526m).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: b */
    public void mo7517b(C0507g c0507g, boolean z) {
        InterfaceC0522m.InterfaceC0523a interfaceC0523a = this.f1523j;
        if (interfaceC0523a != null) {
            interfaceC0523a.mo7494b(c0507g, z);
        }
    }

    /* renamed from: c */
    public abstract void mo7516c(C0511i c0511i, InterfaceC0524n.InterfaceC0525a interfaceC0525a);

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: d */
    public void mo7515d(Context context, C0507g c0507g) {
        this.f1520g = context;
        LayoutInflater.from(context);
        this.f1521h = c0507g;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: e */
    public boolean mo7514e(SubMenuC0531r subMenuC0531r) {
        InterfaceC0522m.InterfaceC0523a interfaceC0523a = this.f1523j;
        if (interfaceC0523a != null) {
            return interfaceC0523a.mo7493c(subMenuC0531r);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: f */
    public void mo7513f(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1526m;
        if (viewGroup == null) {
            return;
        }
        C0507g c0507g = this.f1521h;
        int i = 0;
        if (c0507g != null) {
            c0507g.m7816r();
            ArrayList<C0511i> m7852E = this.f1521h.m7852E();
            int size = m7852E.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0511i c0511i = m7852E.get(i3);
                if (mo7508q(i2, c0511i)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C0511i itemData = childAt instanceof InterfaceC0524n.InterfaceC0525a ? ((InterfaceC0524n.InterfaceC0525a) childAt).getItemData() : null;
                    View mo7510n = mo7510n(c0511i, childAt, viewGroup);
                    if (c0511i != itemData) {
                        mo7510n.setPressed(false);
                        mo7510n.jumpDrawablesToCurrentState();
                    }
                    if (mo7510n != childAt) {
                        m7880a(mo7510n, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo7511l(viewGroup, i)) {
                i++;
            }
        }
    }

    /* renamed from: h */
    public InterfaceC0524n.InterfaceC0525a m7879h(ViewGroup viewGroup) {
        return (InterfaceC0524n.InterfaceC0525a) this.f1522i.inflate(this.f1525l, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: i */
    public boolean mo7582i(C0507g c0507g, C0511i c0511i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: j */
    public boolean mo7581j(C0507g c0507g, C0511i c0511i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: k */
    public void mo7580k(InterfaceC0522m.InterfaceC0523a interfaceC0523a) {
        this.f1523j = interfaceC0523a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo7511l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: m */
    public InterfaceC0522m.InterfaceC0523a m7878m() {
        return this.f1523j;
    }

    /* renamed from: n */
    public View mo7510n(C0511i c0511i, View view, ViewGroup viewGroup) {
        InterfaceC0524n.InterfaceC0525a m7879h = view instanceof InterfaceC0524n.InterfaceC0525a ? (InterfaceC0524n.InterfaceC0525a) view : m7879h(viewGroup);
        mo7516c(c0511i, m7879h);
        return (View) m7879h;
    }

    /* renamed from: o */
    public InterfaceC0524n mo7509o(ViewGroup viewGroup) {
        if (this.f1526m == null) {
            InterfaceC0524n interfaceC0524n = (InterfaceC0524n) this.f1522i.inflate(this.f1524k, viewGroup, false);
            this.f1526m = interfaceC0524n;
            interfaceC0524n.mo2797b(this.f1521h);
            mo7513f(true);
        }
        return this.f1526m;
    }

    /* renamed from: p */
    public void m7877p(int i) {
    }

    /* renamed from: q */
    public abstract boolean mo7508q(int i, C0511i c0511i);
}
