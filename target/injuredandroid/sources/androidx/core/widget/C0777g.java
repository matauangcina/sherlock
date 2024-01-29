package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;
/* renamed from: androidx.core.widget.g */
/* loaded from: classes.dex */
public final class C0777g {
    /* renamed from: a */
    public static void m6645a(ListView listView, int i) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            listView.scrollListBy(i);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition == -1 || (childAt = listView.getChildAt(0)) == null) {
            return;
        }
        listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
    }
}
