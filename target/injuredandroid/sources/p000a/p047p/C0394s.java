package p000a.p047p;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* renamed from: a.p.s */
/* loaded from: classes.dex */
public class C0394s {

    /* renamed from: b */
    public View f1032b;

    /* renamed from: a */
    public final Map<String, Object> f1031a = new HashMap();

    /* renamed from: c */
    final ArrayList<AbstractC0377m> f1033c = new ArrayList<>();

    @Deprecated
    public C0394s() {
    }

    public C0394s(View view) {
        this.f1032b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0394s) {
            C0394s c0394s = (C0394s) obj;
            return this.f1032b == c0394s.f1032b && this.f1031a.equals(c0394s.f1031a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f1032b.hashCode() * 31) + this.f1031a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1032b + "\n") + "    values:";
        for (String str2 : this.f1031a.keySet()) {
            str = str + "    " + str2 + ": " + this.f1031a.get(str2) + "\n";
        }
        return str;
    }
}
