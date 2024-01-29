package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import p000a.p035j.C0297c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C0811k implements LayoutInflater.Factory2 {

    /* renamed from: f */
    private final AbstractC0814m f2917f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C0811k(AbstractC0814m abstractC0814m) {
        this.f2917f = abstractC0814m;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (C0807g.class.getName().equals(str)) {
            return new C0807g(context, attributeSet, this.f2917f);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0297c.Fragment);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(C0297c.Fragment_android_name);
            }
            int resourceId = obtainStyledAttributes.getResourceId(C0297c.Fragment_android_id, -1);
            String string = obtainStyledAttributes.getString(C0297c.Fragment_android_tag);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !C0809i.m6451b(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id = view != null ? view.getId() : 0;
            if (id == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment m6380W = resourceId != -1 ? this.f2917f.m6380W(resourceId) : null;
            if (m6380W == null && string != null) {
                m6380W = this.f2917f.m6378X(string);
            }
            if (m6380W == null && id != -1) {
                m6380W = this.f2917f.m6380W(id);
            }
            if (AbstractC0814m.m6342p0(2)) {
                Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + m6380W);
            }
            if (m6380W == null) {
                m6380W = this.f2917f.m6364e0().mo6321a(context.getClassLoader(), attributeValue);
                m6380W.f2816r = true;
                m6380W.f2778A = resourceId != 0 ? resourceId : id;
                m6380W.f2779B = id;
                m6380W.f2780C = string;
                m6380W.f2817s = true;
                AbstractC0814m abstractC0814m = this.f2917f;
                m6380W.f2821w = abstractC0814m;
                AbstractC0810j<?> abstractC0810j = abstractC0814m.f2942o;
                m6380W.f2822x = abstractC0810j;
                m6380W.mo5997q0(abstractC0810j.m6445g(), attributeSet, m6380W.f2805g);
                this.f2917f.m6367d(m6380W);
                this.f2917f.m6322z0(m6380W);
            } else if (m6380W.f2817s) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            } else {
                m6380W.f2817s = true;
                AbstractC0810j<?> abstractC0810j2 = this.f2917f.f2942o;
                m6380W.f2822x = abstractC0810j2;
                m6380W.mo5997q0(abstractC0810j2.m6445g(), attributeSet, m6380W.f2805g);
            }
            AbstractC0814m abstractC0814m2 = this.f2917f;
            if (abstractC0814m2.f2941n >= 1 || !m6380W.f2816r) {
                this.f2917f.m6322z0(m6380W);
            } else {
                abstractC0814m2.m6423A0(m6380W, 1);
            }
            View view2 = m6380W.f2789L;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (m6380W.f2789L.getTag() == null) {
                    m6380W.f2789L.setTag(string);
                }
                return m6380W.f2789L;
            }
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
