package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0524n;
import java.util.ArrayList;
/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public class C0506f extends BaseAdapter {

    /* renamed from: f */
    C0507g f1578f;

    /* renamed from: g */
    private int f1579g = -1;

    /* renamed from: h */
    private boolean f1580h;

    /* renamed from: i */
    private final boolean f1581i;

    /* renamed from: j */
    private final LayoutInflater f1582j;

    /* renamed from: k */
    private final int f1583k;

    public C0506f(C0507g c0507g, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1581i = z;
        this.f1582j = layoutInflater;
        this.f1578f = c0507g;
        this.f1583k = i;
        m7859a();
    }

    /* renamed from: a */
    void m7859a() {
        C0511i m7813v = this.f1578f.m7813v();
        if (m7813v != null) {
            ArrayList<C0511i> m7809z = this.f1578f.m7809z();
            int size = m7809z.size();
            for (int i = 0; i < size; i++) {
                if (m7809z.get(i) == m7813v) {
                    this.f1579g = i;
                    return;
                }
            }
        }
        this.f1579g = -1;
    }

    /* renamed from: b */
    public C0507g m7858b() {
        return this.f1578f;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public C0511i getItem(int i) {
        ArrayList<C0511i> m7809z = this.f1581i ? this.f1578f.m7809z() : this.f1578f.m7852E();
        int i2 = this.f1579g;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return m7809z.get(i);
    }

    /* renamed from: d */
    public void m7856d(boolean z) {
        this.f1580h = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0511i> m7809z = this.f1581i ? this.f1578f.m7809z() : this.f1578f.m7852E();
        int i = this.f1579g;
        int size = m7809z.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1582j.inflate(this.f1583k, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1578f.mo7739F() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC0524n.InterfaceC0525a interfaceC0525a = (InterfaceC0524n.InterfaceC0525a) view;
        if (this.f1580h) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0525a.mo2798e(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m7859a();
        super.notifyDataSetChanged();
    }
}
