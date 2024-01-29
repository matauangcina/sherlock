package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC0522m;
import androidx.appcompat.view.menu.InterfaceC0524n;
import java.util.ArrayList;
import p000a.p001a.C0006g;
/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public class C0504e implements InterfaceC0522m, AdapterView.OnItemClickListener {

    /* renamed from: f */
    Context f1567f;

    /* renamed from: g */
    LayoutInflater f1568g;

    /* renamed from: h */
    C0507g f1569h;

    /* renamed from: i */
    ExpandedMenuView f1570i;

    /* renamed from: j */
    int f1571j;

    /* renamed from: k */
    int f1572k;

    /* renamed from: l */
    int f1573l;

    /* renamed from: m */
    private InterfaceC0522m.InterfaceC0523a f1574m;

    /* renamed from: n */
    C0505a f1575n;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes.dex */
    public class C0505a extends BaseAdapter {

        /* renamed from: f */
        private int f1576f = -1;

        public C0505a() {
            m7861a();
        }

        /* renamed from: a */
        void m7861a() {
            C0511i m7813v = C0504e.this.f1569h.m7813v();
            if (m7813v != null) {
                ArrayList<C0511i> m7809z = C0504e.this.f1569h.m7809z();
                int size = m7809z.size();
                for (int i = 0; i < size; i++) {
                    if (m7809z.get(i) == m7813v) {
                        this.f1576f = i;
                        return;
                    }
                }
            }
            this.f1576f = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public C0511i getItem(int i) {
            ArrayList<C0511i> m7809z = C0504e.this.f1569h.m7809z();
            int i2 = i + C0504e.this.f1571j;
            int i3 = this.f1576f;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return m7809z.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0504e.this.f1569h.m7809z().size() - C0504e.this.f1571j;
            return this.f1576f < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0504e c0504e = C0504e.this;
                view = c0504e.f1568g.inflate(c0504e.f1573l, viewGroup, false);
            }
            ((InterfaceC0524n.InterfaceC0525a) view).mo2798e(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m7861a();
            super.notifyDataSetChanged();
        }
    }

    public C0504e(int i, int i2) {
        this.f1573l = i;
        this.f1572k = i2;
    }

    public C0504e(Context context, int i) {
        this(i, 0);
        this.f1567f = context;
        this.f1568g = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m7863a() {
        if (this.f1575n == null) {
            this.f1575n = new C0505a();
        }
        return this.f1575n;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: b */
    public void mo7517b(C0507g c0507g, boolean z) {
        InterfaceC0522m.InterfaceC0523a interfaceC0523a = this.f1574m;
        if (interfaceC0523a != null) {
            interfaceC0523a.mo7494b(c0507g, z);
        }
    }

    /* renamed from: c */
    public InterfaceC0524n m7862c(ViewGroup viewGroup) {
        if (this.f1570i == null) {
            this.f1570i = (ExpandedMenuView) this.f1568g.inflate(C0006g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1575n == null) {
                this.f1575n = new C0505a();
            }
            this.f1570i.setAdapter((ListAdapter) this.f1575n);
            this.f1570i.setOnItemClickListener(this);
        }
        return this.f1570i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7515d(android.content.Context r3, androidx.appcompat.view.menu.C0507g r4) {
        /*
            r2 = this;
            int r0 = r2.f1572k
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f1572k
            r0.<init>(r3, r1)
            r2.f1567f = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f1568g = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f1567f
            if (r0 == 0) goto L23
            r2.f1567f = r3
            android.view.LayoutInflater r0 = r2.f1568g
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f1569h = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f1575n
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0504e.mo7515d(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: e */
    public boolean mo7514e(SubMenuC0531r subMenuC0531r) {
        if (subMenuC0531r.hasVisibleItems()) {
            new DialogInterface$OnKeyListenerC0510h(subMenuC0531r).m7807d(null);
            InterfaceC0522m.InterfaceC0523a interfaceC0523a = this.f1574m;
            if (interfaceC0523a != null) {
                interfaceC0523a.mo7493c(subMenuC0531r);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: f */
    public void mo7513f(boolean z) {
        C0505a c0505a = this.f1575n;
        if (c0505a != null) {
            c0505a.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: g */
    public boolean mo7512g() {
        return false;
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
        this.f1574m = interfaceC0523a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1569h.m7847M(this.f1575n.getItem(i), this, 0);
    }
}
