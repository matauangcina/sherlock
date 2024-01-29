package p000a.p047p;

import android.view.ViewGroup;
/* renamed from: a.p.l */
/* loaded from: classes.dex */
public class C0375l {

    /* renamed from: a */
    private ViewGroup f968a;

    /* renamed from: b */
    private Runnable f969b;

    /* renamed from: b */
    public static C0375l m8314b(ViewGroup viewGroup) {
        return (C0375l) viewGroup.getTag(C0368j.transition_current_scene);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m8313c(ViewGroup viewGroup, C0375l c0375l) {
        viewGroup.setTag(C0368j.transition_current_scene, c0375l);
    }

    /* renamed from: a */
    public void m8315a() {
        Runnable runnable;
        if (m8314b(this.f968a) != this || (runnable = this.f969b) == null) {
            return;
        }
        runnable.run();
    }
}
