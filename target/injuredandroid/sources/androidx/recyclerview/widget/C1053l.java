package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
class C1053l {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m5140a(RecyclerView.C0968a0 c0968a0, AbstractC1048j abstractC1048j, View view, View view2, RecyclerView.AbstractC0988o abstractC0988o, boolean z) {
        if (abstractC0988o.m5633J() == 0 || c0968a0.m5745b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return Math.min(abstractC1048j.mo5153n(), abstractC1048j.mo5163d(view2) - abstractC1048j.mo5160g(view));
        }
        return Math.abs(abstractC0988o.m5591h0(view) - abstractC0988o.m5591h0(view2)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m5139b(RecyclerView.C0968a0 c0968a0, AbstractC1048j abstractC1048j, View view, View view2, RecyclerView.AbstractC0988o abstractC0988o, boolean z, boolean z2) {
        if (abstractC0988o.m5633J() == 0 || c0968a0.m5745b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (c0968a0.m5745b() - Math.max(abstractC0988o.m5591h0(view), abstractC0988o.m5591h0(view2))) - 1) : Math.max(0, Math.min(abstractC0988o.m5591h0(view), abstractC0988o.m5591h0(view2)));
        if (z) {
            return Math.round((max * (Math.abs(abstractC1048j.mo5163d(view2) - abstractC1048j.mo5160g(view)) / (Math.abs(abstractC0988o.m5591h0(view) - abstractC0988o.m5591h0(view2)) + 1))) + (abstractC1048j.mo5154m() - abstractC1048j.mo5160g(view)));
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m5138c(RecyclerView.C0968a0 c0968a0, AbstractC1048j abstractC1048j, View view, View view2, RecyclerView.AbstractC0988o abstractC0988o, boolean z) {
        if (abstractC0988o.m5633J() == 0 || c0968a0.m5745b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return (int) (((abstractC1048j.mo5163d(view2) - abstractC1048j.mo5160g(view)) / (Math.abs(abstractC0988o.m5591h0(view) - abstractC0988o.m5591h0(view2)) + 1)) * c0968a0.m5745b());
        }
        return c0968a0.m5745b();
    }
}
