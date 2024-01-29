package p000a.p019g.p028k;

import android.os.Build;
import android.view.ViewGroup;
import p000a.p019g.C0120b;
/* renamed from: a.g.k.u */
/* loaded from: classes.dex */
public final class C0265u {
    /* renamed from: a */
    public static boolean m8546a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C0120b.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0252s.m8658E(viewGroup) == null) ? false : true;
    }
}
