package androidx.core.content.p052d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: androidx.core.content.d.b */
/* loaded from: classes.dex */
public final class C0743b {

    /* renamed from: a */
    private final Shader f2650a;

    /* renamed from: b */
    private final ColorStateList f2651b;

    /* renamed from: c */
    private int f2652c;

    private C0743b(Shader shader, ColorStateList colorStateList, int i) {
        this.f2650a = shader;
        this.f2651b = colorStateList;
        this.f2652c = i;
    }

    /* renamed from: a */
    private static C0743b m6842a(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c != 0) {
                if (c == 1) {
                    return m6839d(C0749d.m6810b(resources, xml, asAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return m6840c(C0742a.m6849b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C0743b m6841b(int i) {
        return new C0743b(null, null, i);
    }

    /* renamed from: c */
    static C0743b m6840c(ColorStateList colorStateList) {
        return new C0743b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C0743b m6839d(Shader shader) {
        return new C0743b(shader, null, 0);
    }

    /* renamed from: g */
    public static C0743b m6836g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m6842a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int m6838e() {
        return this.f2652c;
    }

    /* renamed from: f */
    public Shader m6837f() {
        return this.f2650a;
    }

    /* renamed from: h */
    public boolean m6835h() {
        return this.f2650a != null;
    }

    /* renamed from: i */
    public boolean m6834i() {
        ColorStateList colorStateList;
        return this.f2650a == null && (colorStateList = this.f2651b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m6833j(int[] iArr) {
        if (m6834i()) {
            ColorStateList colorStateList = this.f2651b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2652c) {
                this.f2652c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m6832k(int i) {
        this.f2652c = i;
    }

    /* renamed from: l */
    public boolean m6831l() {
        return m6835h() || this.f2652c != 0;
    }
}
