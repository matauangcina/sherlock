package p000a.p030h.p031a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p000a.p030h.p031a.C0277b;
/* renamed from: a.h.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0274a extends BaseAdapter implements Filterable, C0277b.InterfaceC0278a {

    /* renamed from: f */
    protected boolean f757f;

    /* renamed from: g */
    protected boolean f758g;

    /* renamed from: h */
    protected Cursor f759h;

    /* renamed from: i */
    protected Context f760i;

    /* renamed from: j */
    protected int f761j;

    /* renamed from: k */
    protected C0275a f762k;

    /* renamed from: l */
    protected DataSetObserver f763l;

    /* renamed from: m */
    protected C0277b f764m;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.h.a.a$a */
    /* loaded from: classes.dex */
    public class C0275a extends ContentObserver {
        C0275a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC0274a.this.m8526i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.h.a.a$b */
    /* loaded from: classes.dex */
    public class C0276b extends DataSetObserver {
        C0276b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC0274a abstractC0274a = AbstractC0274a.this;
            abstractC0274a.f757f = true;
            abstractC0274a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0274a abstractC0274a = AbstractC0274a.this;
            abstractC0274a.f757f = false;
            abstractC0274a.notifyDataSetInvalidated();
        }
    }

    public AbstractC0274a(Context context, Cursor cursor, boolean z) {
        m8527f(context, cursor, z ? 1 : 2);
    }

    @Override // p000a.p030h.p031a.C0277b.InterfaceC0278a
    /* renamed from: a */
    public void mo7294a(Cursor cursor) {
        Cursor m8525j = m8525j(cursor);
        if (m8525j != null) {
            m8525j.close();
        }
    }

    @Override // p000a.p030h.p031a.C0277b.InterfaceC0278a
    /* renamed from: b */
    public Cursor mo8524b() {
        return this.f759h;
    }

    @Override // p000a.p030h.p031a.C0277b.InterfaceC0278a
    /* renamed from: c */
    public abstract CharSequence mo7293c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo7291e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    void m8527f(Context context, Cursor cursor, int i) {
        C0276b c0276b;
        if ((i & 1) == 1) {
            i |= 2;
            this.f758g = true;
        } else {
            this.f758g = false;
        }
        boolean z = cursor != null;
        this.f759h = cursor;
        this.f757f = z;
        this.f760i = context;
        this.f761j = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f762k = new C0275a();
            c0276b = new C0276b();
        } else {
            c0276b = null;
            this.f762k = null;
        }
        this.f763l = c0276b;
        if (z) {
            C0275a c0275a = this.f762k;
            if (c0275a != null) {
                cursor.registerContentObserver(c0275a);
            }
            DataSetObserver dataSetObserver = this.f763l;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo8523g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f757f || (cursor = this.f759h) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f757f) {
            this.f759h.moveToPosition(i);
            if (view == null) {
                view = mo8523g(this.f760i, this.f759h, viewGroup);
            }
            mo7291e(view, this.f760i, this.f759h);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f764m == null) {
            this.f764m = new C0277b(this);
        }
        return this.f764m;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f757f || (cursor = this.f759h) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f759h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f757f && (cursor = this.f759h) != null && cursor.moveToPosition(i)) {
            return this.f759h.getLong(this.f761j);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f757f) {
            if (this.f759h.moveToPosition(i)) {
                if (view == null) {
                    view = mo7290h(this.f760i, this.f759h, viewGroup);
                }
                mo7291e(view, this.f760i, this.f759h);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    /* renamed from: h */
    public abstract View mo7290h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: i */
    protected void m8526i() {
        Cursor cursor;
        if (!this.f758g || (cursor = this.f759h) == null || cursor.isClosed()) {
            return;
        }
        this.f757f = this.f759h.requery();
    }

    /* renamed from: j */
    public Cursor m8525j(Cursor cursor) {
        Cursor cursor2 = this.f759h;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0275a c0275a = this.f762k;
            if (c0275a != null) {
                cursor2.unregisterContentObserver(c0275a);
            }
            DataSetObserver dataSetObserver = this.f763l;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f759h = cursor;
        if (cursor != null) {
            C0275a c0275a2 = this.f762k;
            if (c0275a2 != null) {
                cursor.registerContentObserver(c0275a2);
            }
            DataSetObserver dataSetObserver2 = this.f763l;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f761j = cursor.getColumnIndexOrThrow("_id");
            this.f757f = true;
            notifyDataSetChanged();
        } else {
            this.f761j = -1;
            this.f757f = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
