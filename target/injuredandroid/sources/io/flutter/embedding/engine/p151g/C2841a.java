package io.flutter.embedding.engine.p151g;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: io.flutter.embedding.engine.g.a */
/* loaded from: classes.dex */
final class C2841a {

    /* renamed from: a */
    static final String f7064a = C2843c.class.getName() + ".aot-shared-library-name";

    /* renamed from: b */
    static final String f7065b = C2843c.class.getName() + ".vm-snapshot-data";

    /* renamed from: c */
    static final String f7066c = C2843c.class.getName() + ".isolate-snapshot-data";

    /* renamed from: d */
    static final String f7067d = C2843c.class.getName() + ".flutter-assets-dir";

    /* renamed from: a */
    private static ApplicationInfo m540a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static String m539b(ApplicationInfo applicationInfo, Context context) {
        int i;
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null && (i = bundle.getInt("io.flutter.network-policy", 0)) > 0) {
            JSONArray jSONArray = new JSONArray();
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                xml.next();
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        if (xml.getName().equals("domain-config")) {
                            m535f(xml, jSONArray, false);
                        }
                    }
                }
                return jSONArray.toString();
            } catch (IOException | XmlPullParserException unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static String m538c(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, null);
    }

    /* renamed from: d */
    public static C2842b m537d(Context context) {
        ApplicationInfo m540a = m540a(context);
        return new C2842b(m538c(m540a.metaData, f7064a), m538c(m540a.metaData, f7065b), m538c(m540a.metaData, f7066c), m538c(m540a.metaData, f7067d), m539b(m540a, context), m540a.nativeLibraryDir, Build.VERSION.SDK_INT >= 23 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : true);
    }

    /* renamed from: e */
    private static void m536e(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 4) {
            throw new IllegalStateException("Expected text");
        }
        String trim = xmlResourceParser.getText().trim();
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(trim);
        jSONArray2.put(attributeBooleanValue);
        jSONArray2.put(z);
        jSONArray.put(jSONArray2);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 3) {
            throw new IllegalStateException("Expected end of domain tag");
        }
    }

    /* renamed from: f */
    private static void m535f(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    m536e(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    m535f(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    m534g(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    /* renamed from: g */
    private static void m534g(XmlResourceParser xmlResourceParser) {
        String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlResourceParser.getName() == name) {
                return;
            }
            eventType = xmlResourceParser.next();
        }
    }
}
