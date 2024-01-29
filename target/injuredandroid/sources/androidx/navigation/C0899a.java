package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.app.C0707b;
import androidx.core.content.C0734a;
import androidx.navigation.AbstractC0952r;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@AbstractC0952r.InterfaceC0954b("activity")
/* renamed from: androidx.navigation.a */
/* loaded from: classes.dex */
public class C0899a extends AbstractC0952r<C0900a> {

    /* renamed from: a */
    private Context f3171a;

    /* renamed from: b */
    private Activity f3172b;

    /* renamed from: androidx.navigation.a$a */
    /* loaded from: classes.dex */
    public static class C0900a extends C0925j {

        /* renamed from: n */
        private Intent f3173n;

        /* renamed from: o */
        private String f3174o;

        public C0900a(AbstractC0952r<? extends C0900a> abstractC0952r) {
            super(abstractC0952r);
        }

        @Override // androidx.navigation.C0925j
        /* renamed from: D */
        boolean mo5963D() {
            return false;
        }

        /* renamed from: E */
        public final String m6050E() {
            Intent intent = this.f3173n;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        /* renamed from: F */
        public final ComponentName m6049F() {
            Intent intent = this.f3173n;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        /* renamed from: G */
        public final String m6048G() {
            return this.f3174o;
        }

        /* renamed from: H */
        public final Intent m6047H() {
            return this.f3173n;
        }

        /* renamed from: I */
        public final C0900a m6046I(String str) {
            if (this.f3173n == null) {
                this.f3173n = new Intent();
            }
            this.f3173n.setAction(str);
            return this;
        }

        /* renamed from: J */
        public final C0900a m6045J(ComponentName componentName) {
            if (this.f3173n == null) {
                this.f3173n = new Intent();
            }
            this.f3173n.setComponent(componentName);
            return this;
        }

        /* renamed from: K */
        public final C0900a m6044K(Uri uri) {
            if (this.f3173n == null) {
                this.f3173n = new Intent();
            }
            this.f3173n.setData(uri);
            return this;
        }

        /* renamed from: L */
        public final C0900a m6043L(String str) {
            this.f3174o = str;
            return this;
        }

        /* renamed from: M */
        public final C0900a m6042M(String str) {
            if (this.f3173n == null) {
                this.f3173n = new Intent();
            }
            this.f3173n.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.C0925j
        public String toString() {
            String m6050E;
            ComponentName m6049F = m6049F();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (m6049F == null) {
                m6050E = m6050E();
                if (m6050E != null) {
                    sb.append(" action=");
                }
                return sb.toString();
            }
            sb.append(" class=");
            m6050E = m6049F.getClassName();
            sb.append(m6050E);
            return sb.toString();
        }

        @Override // androidx.navigation.C0925j
        /* renamed from: y */
        public void mo5941y(Context context, AttributeSet attributeSet) {
            super.mo5941y(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0957u.ActivityNavigator);
            String string = obtainAttributes.getString(C0957u.ActivityNavigator_targetPackage);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            m6042M(string);
            String string2 = obtainAttributes.getString(C0957u.ActivityNavigator_android_name);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                m6045J(new ComponentName(context, string2));
            }
            m6046I(obtainAttributes.getString(C0957u.ActivityNavigator_action));
            String string3 = obtainAttributes.getString(C0957u.ActivityNavigator_data);
            if (string3 != null) {
                m6044K(Uri.parse(string3));
            }
            m6043L(obtainAttributes.getString(C0957u.ActivityNavigator_dataPattern));
            obtainAttributes.recycle();
        }
    }

    /* renamed from: androidx.navigation.a$b */
    /* loaded from: classes.dex */
    public static final class C0901b implements AbstractC0952r.InterfaceC0953a {

        /* renamed from: a */
        private final int f3175a;

        /* renamed from: b */
        private final C0707b f3176b;

        /* renamed from: a */
        public C0707b m6041a() {
            return this.f3176b;
        }

        /* renamed from: b */
        public int m6040b() {
            return this.f3175a;
        }
    }

    public C0899a(Context context) {
        this.f3171a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f3172b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: e */
    public boolean mo5851e() {
        Activity activity = this.f3172b;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: f */
    public C0900a mo5855a() {
        return new C0900a(this);
    }

    /* renamed from: g */
    final Context m6052g() {
        return this.f3171a;
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: h */
    public C0925j mo5854b(C0900a c0900a, Bundle bundle, C0932o c0932o, AbstractC0952r.InterfaceC0953a interfaceC0953a) {
        C0707b m6041a;
        Intent intent;
        int intExtra;
        if (c0900a.m6047H() == null) {
            throw new IllegalStateException("Destination " + c0900a.m5956s() + " does not have an Intent set.");
        }
        Intent intent2 = new Intent(c0900a.m6047H());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String m6048G = c0900a.m6048G();
            if (!TextUtils.isEmpty(m6048G)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(m6048G);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!bundle.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + m6048G);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z = interfaceC0953a instanceof C0901b;
        if (z) {
            intent2.addFlags(((C0901b) interfaceC0953a).m6040b());
        }
        if (!(this.f3171a instanceof Activity)) {
            intent2.addFlags(268435456);
        }
        if (c0932o != null && c0932o.m5919g()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.f3172b;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c0900a.m5956s());
        Resources resources = m6052g().getResources();
        if (c0932o != null) {
            int m5923c = c0932o.m5923c();
            int m5922d = c0932o.m5922d();
            if ((m5923c <= 0 || !resources.getResourceTypeName(m5923c).equals("animator")) && (m5922d <= 0 || !resources.getResourceTypeName(m5922d).equals("animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", m5923c);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", m5922d);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(m5923c) + " and popExit resource " + resources.getResourceName(m5922d) + "when launching " + c0900a);
            }
        }
        if (!z || (m6041a = ((C0901b) interfaceC0953a).m6041a()) == null) {
            this.f3171a.startActivity(intent2);
        } else {
            C0734a.m6869i(this.f3171a, intent2, m6041a.m6991a());
        }
        if (c0932o == null || this.f3172b == null) {
            return null;
        }
        int m5925a = c0932o.m5925a();
        int m5924b = c0932o.m5924b();
        if ((m5925a <= 0 || !resources.getResourceTypeName(m5925a).equals("animator")) && (m5924b <= 0 || !resources.getResourceTypeName(m5924b).equals("animator"))) {
            if (m5925a >= 0 || m5924b >= 0) {
                this.f3172b.overridePendingTransition(Math.max(m5925a, 0), Math.max(m5924b, 0));
                return null;
            }
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(m5925a) + " and exit resource " + resources.getResourceName(m5924b) + "when launching " + c0900a);
        return null;
    }
}
