package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0734a;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: androidx.core.app.n */
/* loaded from: classes.dex */
public final class C0730n implements Iterable<Intent> {

    /* renamed from: f */
    private final ArrayList<Intent> f2640f = new ArrayList<>();

    /* renamed from: g */
    private final Context f2641g;

    /* renamed from: androidx.core.app.n$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0731a {
        /* renamed from: e */
        Intent mo6886e();
    }

    private C0730n(Context context) {
        this.f2641g = context;
    }

    /* renamed from: i */
    public static C0730n m6889i(Context context) {
        return new C0730n(context);
    }

    /* renamed from: d */
    public C0730n m6893d(Intent intent) {
        this.f2640f.add(intent);
        return this;
    }

    /* renamed from: e */
    public C0730n m6892e(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f2641g.getPackageManager());
        }
        if (component != null) {
            m6890g(component);
        }
        m6893d(intent);
        return this;
    }

    /* renamed from: f */
    public C0730n m6891f(Activity activity) {
        Intent mo6886e = activity instanceof InterfaceC0731a ? ((InterfaceC0731a) activity).mo6886e() : null;
        if (mo6886e == null) {
            mo6886e = C0715f.m6978a(activity);
        }
        if (mo6886e != null) {
            ComponentName component = mo6886e.getComponent();
            if (component == null) {
                component = mo6886e.resolveActivity(this.f2641g.getPackageManager());
            }
            m6890g(component);
            m6893d(mo6886e);
        }
        return this;
    }

    /* renamed from: g */
    public C0730n m6890g(ComponentName componentName) {
        int size = this.f2640f.size();
        try {
            Context context = this.f2641g;
            while (true) {
                Intent m6977b = C0715f.m6977b(context, componentName);
                if (m6977b == null) {
                    return this;
                }
                this.f2640f.add(size, m6977b);
                context = this.f2641g;
                componentName = m6977b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2640f.iterator();
    }

    /* renamed from: l */
    public void m6888l() {
        m6887m(null);
    }

    /* renamed from: m */
    public void m6887m(Bundle bundle) {
        if (this.f2640f.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f2640f;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C0734a.m6870h(this.f2641g, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f2641g.startActivity(intent);
    }
}
