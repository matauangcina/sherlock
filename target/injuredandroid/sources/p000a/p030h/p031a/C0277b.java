package p000a.p030h.p031a;

import android.database.Cursor;
import android.widget.Filter;
/* renamed from: a.h.a.b */
/* loaded from: classes.dex */
class C0277b extends Filter {

    /* renamed from: a */
    InterfaceC0278a f767a;

    /* renamed from: a.h.a.b$a */
    /* loaded from: classes.dex */
    interface InterfaceC0278a {
        /* renamed from: a */
        void mo7294a(Cursor cursor);

        /* renamed from: b */
        Cursor mo8524b();

        /* renamed from: c */
        CharSequence mo7293c(Cursor cursor);

        /* renamed from: d */
        Cursor mo7292d(CharSequence charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0277b(InterfaceC0278a interfaceC0278a) {
        this.f767a = interfaceC0278a;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f767a.mo7293c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo7292d = this.f767a.mo7292d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo7292d != null) {
            filterResults.count = mo7292d.getCount();
        } else {
            filterResults.count = 0;
            mo7292d = null;
        }
        filterResults.values = mo7292d;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo8524b = this.f767a.mo8524b();
        Object obj = filterResults.values;
        if (obj == null || obj == mo8524b) {
            return;
        }
        this.f767a.mo7294a((Cursor) obj);
    }
}
