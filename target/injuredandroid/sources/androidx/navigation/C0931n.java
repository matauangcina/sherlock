package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.C0904d;
import androidx.navigation.C0920h;
import androidx.navigation.C0932o;
import androidx.navigation.p053v.C0958a;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: androidx.navigation.n */
/* loaded from: classes.dex */
public final class C0931n {

    /* renamed from: c */
    private static final ThreadLocal<TypedValue> f3256c = new ThreadLocal<>();

    /* renamed from: a */
    private Context f3257a;

    /* renamed from: b */
    private C0955s f3258b;

    public C0931n(Context context, C0955s c0955s) {
        this.f3257a = context;
        this.f3258b = c0955s;
    }

    /* renamed from: a */
    private static AbstractC0934p m5933a(TypedValue typedValue, AbstractC0934p abstractC0934p, AbstractC0934p abstractC0934p2, String str, String str2) {
        if (abstractC0934p == null || abstractC0934p == abstractC0934p2) {
            return abstractC0934p != null ? abstractC0934p : abstractC0934p2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    /* renamed from: b */
    private C0925j m5932b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) {
        int depth;
        C0925j mo5855a = this.f3258b.m5846e(xmlResourceParser.getName()).mo5855a();
        mo5855a.mo5941y(this.f3257a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    m5927g(resources, mo5855a, attributeSet, i);
                } else if ("deepLink".equals(name)) {
                    m5926h(resources, mo5855a, attributeSet);
                } else if ("action".equals(name)) {
                    m5930d(resources, mo5855a, attributeSet, xmlResourceParser, i);
                } else if ("include".equals(name) && (mo5855a instanceof C0927k)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0957u.NavInclude);
                    ((C0927k) mo5855a).m5949E(m5931c(obtainAttributes.getResourceId(C0957u.NavInclude_graph, 0)));
                    obtainAttributes.recycle();
                } else if (mo5855a instanceof C0927k) {
                    ((C0927k) mo5855a).m5949E(m5932b(resources, xmlResourceParser, attributeSet, i));
                }
            }
        }
        return mo5855a;
    }

    /* renamed from: d */
    private void m5930d(Resources resources, C0925j c0925j, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i) {
        int depth;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0958a.NavAction);
        int resourceId = obtainAttributes.getResourceId(C0958a.NavAction_android_id, 0);
        C0903c c0903c = new C0903c(obtainAttributes.getResourceId(C0958a.NavAction_destination, 0));
        C0932o.C0933a c0933a = new C0932o.C0933a();
        c0933a.m5915d(obtainAttributes.getBoolean(C0958a.NavAction_launchSingleTop, false));
        c0933a.m5912g(obtainAttributes.getResourceId(C0958a.NavAction_popUpTo, -1), obtainAttributes.getBoolean(C0958a.NavAction_popUpToInclusive, false));
        c0933a.m5917b(obtainAttributes.getResourceId(C0958a.NavAction_enterAnim, -1));
        c0933a.m5916c(obtainAttributes.getResourceId(C0958a.NavAction_exitAnim, -1));
        c0933a.m5914e(obtainAttributes.getResourceId(C0958a.NavAction_popEnterAnim, -1));
        c0933a.m5913f(obtainAttributes.getResourceId(C0958a.NavAction_popExitAnim, -1));
        c0903c.m6038b(c0933a.m5918a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2 && "argument".equals(xmlResourceParser.getName())) {
                m5928f(resources, bundle, attributeSet, i);
            }
        }
        if (!bundle.isEmpty()) {
            c0903c.m6039a(bundle);
        }
        c0925j.m5953z(resourceId, c0903c);
        obtainAttributes.recycle();
    }

    /* renamed from: e */
    private C0904d m5929e(TypedArray typedArray, Resources resources, int i) {
        float f;
        int dimension;
        C0904d.C0905a c0905a = new C0904d.C0905a();
        c0905a.m6031c(typedArray.getBoolean(C0958a.NavArgument_nullable, false));
        TypedValue typedValue = f3256c.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f3256c.set(typedValue);
        }
        String string = typedArray.getString(C0958a.NavArgument_argType);
        Object obj = null;
        AbstractC0934p<Integer> m5911a = string != null ? AbstractC0934p.m5911a(string, resources.getResourcePackageName(i)) : null;
        if (typedArray.getValue(C0958a.NavArgument_android_defaultValue, typedValue)) {
            AbstractC0934p<Integer> abstractC0934p = AbstractC0934p.f3274c;
            if (m5911a == abstractC0934p) {
                dimension = typedValue.resourceId;
                if (dimension == 0) {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + m5911a.mo5865c() + ". Must be a reference to a resource.");
                    }
                    obj = 0;
                }
                obj = Integer.valueOf(dimension);
            } else {
                int i2 = typedValue.resourceId;
                if (i2 != 0) {
                    if (m5911a != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + m5911a.mo5865c() + ". You must use a \"" + AbstractC0934p.f3274c.mo5865c() + "\" type to reference other resources.");
                    }
                    m5911a = abstractC0934p;
                    obj = Integer.valueOf(i2);
                } else if (m5911a == AbstractC0934p.f3282k) {
                    obj = typedArray.getString(C0958a.NavArgument_android_defaultValue);
                } else {
                    int i3 = typedValue.type;
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                m5911a = m5933a(typedValue, m5911a, AbstractC0934p.f3273b, string, "dimension");
                                dimension = (int) typedValue.getDimension(resources.getDisplayMetrics());
                            } else if (i3 == 18) {
                                m5911a = m5933a(typedValue, m5911a, AbstractC0934p.f3280i, string, "boolean");
                                obj = Boolean.valueOf(typedValue.data != 0);
                            } else if (i3 < 16 || i3 > 31) {
                                throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                            } else {
                                AbstractC0934p<Float> abstractC0934p2 = AbstractC0934p.f3278g;
                                if (m5911a == abstractC0934p2) {
                                    m5911a = m5933a(typedValue, m5911a, abstractC0934p2, string, "float");
                                    f = typedValue.data;
                                } else {
                                    m5911a = m5933a(typedValue, m5911a, AbstractC0934p.f3273b, string, "integer");
                                    dimension = typedValue.data;
                                }
                            }
                            obj = Integer.valueOf(dimension);
                        } else {
                            m5911a = m5933a(typedValue, m5911a, AbstractC0934p.f3278g, string, "float");
                            f = typedValue.getFloat();
                        }
                        obj = Float.valueOf(f);
                    } else {
                        String charSequence = typedValue.string.toString();
                        if (m5911a == null) {
                            m5911a = AbstractC0934p.m5910d(charSequence);
                        }
                        obj = m5911a.mo5864h(charSequence);
                    }
                }
            }
        }
        if (obj != null) {
            c0905a.m6032b(obj);
        }
        if (m5911a != null) {
            c0905a.m6030d(m5911a);
        }
        return c0905a.m6033a();
    }

    /* renamed from: f */
    private void m5928f(Resources resources, Bundle bundle, AttributeSet attributeSet, int i) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0958a.NavArgument);
        String string = obtainAttributes.getString(C0958a.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        C0904d m5929e = m5929e(obtainAttributes, resources, i);
        if (m5929e.m6036b()) {
            m5929e.m6035c(string, bundle);
        }
        obtainAttributes.recycle();
    }

    /* renamed from: g */
    private void m5927g(Resources resources, C0925j c0925j, AttributeSet attributeSet, int i) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0958a.NavArgument);
        String string = obtainAttributes.getString(C0958a.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        c0925j.m5962d(string, m5929e(obtainAttributes, resources, i));
        obtainAttributes.recycle();
    }

    /* renamed from: h */
    private void m5926h(Resources resources, C0925j c0925j, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0958a.NavDeepLink);
        String string = obtainAttributes.getString(C0958a.NavDeepLink_uri);
        String string2 = obtainAttributes.getString(C0958a.NavDeepLink_action);
        String string3 = obtainAttributes.getString(C0958a.NavDeepLink_mimeType);
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        C0920h.C0921a c0921a = new C0920h.C0921a();
        if (string != null) {
            c0921a.m5976d(string.replace("${applicationId}", this.f3257a.getPackageName()));
        }
        if (!TextUtils.isEmpty(string2)) {
            c0921a.m5978b(string2.replace("${applicationId}", this.f3257a.getPackageName()));
        }
        if (string3 != null) {
            c0921a.m5977c(string3.replace("${applicationId}", this.f3257a.getPackageName()));
        }
        c0925j.m5961e(c0921a.m5979a());
        obtainAttributes.recycle();
    }

    /* renamed from: c */
    public C0927k m5931c(int i) {
        int next;
        Resources resources = this.f3257a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        while (true) {
            try {
                try {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        }
        if (next == 2) {
            String name = xml.getName();
            C0925j m5932b = m5932b(resources, xml, asAttributeSet, i);
            if (m5932b instanceof C0927k) {
                return (C0927k) m5932b;
            }
            throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
        }
        throw new XmlPullParserException("No start tag found");
    }
}
