package androidx.core.content.p052d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p019g.C0121c;
import p000a.p019g.p025h.C0154d;
/* renamed from: androidx.core.content.d.c */
/* loaded from: classes.dex */
public class C0744c {

    /* renamed from: androidx.core.content.d.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0745a {
    }

    /* renamed from: androidx.core.content.d.c$b */
    /* loaded from: classes.dex */
    public static final class C0746b implements InterfaceC0745a {

        /* renamed from: a */
        private final C0747c[] f2653a;

        public C0746b(C0747c[] c0747cArr) {
            this.f2653a = c0747cArr;
        }

        /* renamed from: a */
        public C0747c[] m6822a() {
            return this.f2653a;
        }
    }

    /* renamed from: androidx.core.content.d.c$c */
    /* loaded from: classes.dex */
    public static final class C0747c {

        /* renamed from: a */
        private final String f2654a;

        /* renamed from: b */
        private int f2655b;

        /* renamed from: c */
        private boolean f2656c;

        /* renamed from: d */
        private String f2657d;

        /* renamed from: e */
        private int f2658e;

        /* renamed from: f */
        private int f2659f;

        public C0747c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2654a = str;
            this.f2655b = i;
            this.f2656c = z;
            this.f2657d = str2;
            this.f2658e = i2;
            this.f2659f = i3;
        }

        /* renamed from: a */
        public String m6821a() {
            return this.f2654a;
        }

        /* renamed from: b */
        public int m6820b() {
            return this.f2659f;
        }

        /* renamed from: c */
        public int m6819c() {
            return this.f2658e;
        }

        /* renamed from: d */
        public String m6818d() {
            return this.f2657d;
        }

        /* renamed from: e */
        public int m6817e() {
            return this.f2655b;
        }

        /* renamed from: f */
        public boolean m6816f() {
            return this.f2656c;
        }
    }

    /* renamed from: androidx.core.content.d.c$d */
    /* loaded from: classes.dex */
    public static final class C0748d implements InterfaceC0745a {

        /* renamed from: a */
        private final C0154d f2660a;

        /* renamed from: b */
        private final int f2661b;

        /* renamed from: c */
        private final int f2662c;

        /* renamed from: d */
        private final String f2663d;

        public C0748d(C0154d c0154d, int i, int i2, String str) {
            this.f2660a = c0154d;
            this.f2662c = i;
            this.f2661b = i2;
            this.f2663d = str;
        }

        /* renamed from: a */
        public int m6815a() {
            return this.f2662c;
        }

        /* renamed from: b */
        public C0154d m6814b() {
            return this.f2660a;
        }

        /* renamed from: c */
        public String m6813c() {
            return this.f2663d;
        }

        /* renamed from: d */
        public int m6812d() {
            return this.f2661b;
        }
    }

    /* renamed from: a */
    private static int m6830a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: b */
    public static InterfaceC0745a m6829b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m6827d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m6828c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m6830a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m6823h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m6823h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static InterfaceC0745a m6827d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m6826e(xmlPullParser, resources);
        }
        m6824g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static InterfaceC0745a m6826e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0121c.FontFamily);
        String string = obtainAttributes.getString(C0121c.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0121c.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0121c.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0121c.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0121c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0121c.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = obtainAttributes.getString(C0121c.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m6824g(xmlPullParser);
            }
            return new C0748d(new C0154d(string, string2, string3, m6828c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m6825f(xmlPullParser, resources));
                } else {
                    m6824g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0746b((C0747c[]) arrayList.toArray(new C0747c[arrayList.size()]));
    }

    /* renamed from: f */
    private static C0747c m6825f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0121c.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0121c.FontFamilyFont_fontWeight) ? C0121c.FontFamilyFont_fontWeight : C0121c.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C0121c.FontFamilyFont_fontStyle) ? C0121c.FontFamilyFont_fontStyle : C0121c.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C0121c.FontFamilyFont_ttcIndex) ? C0121c.FontFamilyFont_ttcIndex : C0121c.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C0121c.FontFamilyFont_fontVariationSettings) ? C0121c.FontFamilyFont_fontVariationSettings : C0121c.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C0121c.FontFamilyFont_font) ? C0121c.FontFamilyFont_font : C0121c.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m6824g(xmlPullParser);
        }
        return new C0747c(string2, i, z, string, i3, resourceId);
    }

    /* renamed from: g */
    private static void m6824g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m6823h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
