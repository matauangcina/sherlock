package p054b.p058b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import java.util.Map;
import p054b.p058b.C1135d;
import p108c.p109a.p110c.p111a.C1515h;
import p108c.p109a.p110c.p111a.C1516i;
import p108c.p109a.p110c.p111a.InterfaceC1523k;
import p108c.p109a.p110c.p111a.InterfaceC1525m;
/* renamed from: b.b.b */
/* loaded from: classes.dex */
public class C1131b implements C1516i.InterfaceC1520c, InterfaceC1523k {

    /* renamed from: c */
    static C1516i f3836c;

    /* renamed from: a */
    private Activity f3837a;

    /* renamed from: b */
    private C1135d f3838b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.b.b$a */
    /* loaded from: classes.dex */
    public class C1132a implements ValueCallback<Boolean> {
        C1132a(C1131b c1131b) {
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
        }
    }

    private C1131b(Activity activity) {
        this.f3837a = activity;
    }

    /* renamed from: c */
    private void m4849c(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        C1135d c1135d = this.f3838b;
        if (c1135d != null) {
            c1135d.m4829e(c1515h, interfaceC1521d);
        }
    }

    /* renamed from: d */
    private FrameLayout.LayoutParams m4848d(C1515h c1515h) {
        Map map = (Map) c1515h.m4040a("rect");
        if (map != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m4845g(this.f3837a, ((Number) map.get("width")).intValue()), m4845g(this.f3837a, ((Number) map.get("height")).intValue()));
            layoutParams.setMargins(m4845g(this.f3837a, ((Number) map.get("left")).intValue()), m4845g(this.f3837a, ((Number) map.get("top")).intValue()), 0, 0);
            return layoutParams;
        }
        Display defaultDisplay = this.f3837a.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return new FrameLayout.LayoutParams(point.x, point.y);
    }

    /* renamed from: e */
    private void m4847e(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(new C1132a(this));
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
        interfaceC1521d.mo419c(null);
    }

    /* renamed from: f */
    private void m4846f(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        C1135d c1135d = this.f3838b;
        if (c1135d != null) {
            c1135d.m4825i(c1515h, interfaceC1521d);
            this.f3838b = null;
        }
    }

    /* renamed from: g */
    private int m4845g(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: h */
    private void m4844h(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        C1135d c1135d = this.f3838b;
        if (c1135d != null) {
            c1135d.m4824j(c1515h, interfaceC1521d);
        }
    }

    /* renamed from: i */
    private void m4843i(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        C1135d c1135d = this.f3838b;
        if (c1135d != null) {
            c1135d.m4823k(c1515h, interfaceC1521d);
        }
    }

    /* renamed from: j */
    private void m4842j(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        C1135d c1135d = this.f3838b;
        if (c1135d != null) {
            c1135d.m4822l(c1515h, interfaceC1521d);
        }
    }

    /* renamed from: k */
    private void m4841k(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        boolean booleanValue = ((Boolean) c1515h.m4040a("hidden")).booleanValue();
        String str = (String) c1515h.m4040a("url");
        String str2 = (String) c1515h.m4040a("userAgent");
        boolean booleanValue2 = ((Boolean) c1515h.m4040a("withJavascript")).booleanValue();
        boolean booleanValue3 = ((Boolean) c1515h.m4040a("clearCache")).booleanValue();
        boolean booleanValue4 = ((Boolean) c1515h.m4040a("clearCookies")).booleanValue();
        boolean booleanValue5 = ((Boolean) c1515h.m4040a("withZoom")).booleanValue();
        boolean booleanValue6 = ((Boolean) c1515h.m4040a("withLocalStorage")).booleanValue();
        boolean booleanValue7 = ((Boolean) c1515h.m4040a("supportMultipleWindows")).booleanValue();
        boolean booleanValue8 = ((Boolean) c1515h.m4040a("appCacheEnabled")).booleanValue();
        Map<String, String> map = (Map) c1515h.m4040a("headers");
        boolean booleanValue9 = ((Boolean) c1515h.m4040a("scrollBar")).booleanValue();
        boolean booleanValue10 = ((Boolean) c1515h.m4040a("allowFileURLs")).booleanValue();
        C1135d c1135d = this.f3838b;
        if (c1135d == null || c1135d.f3842c) {
            this.f3838b = new C1135d(this.f3837a);
        }
        this.f3837a.addContentView(this.f3838b.f3843d, m4848d(c1515h));
        this.f3838b.m4821m(booleanValue2, booleanValue3, booleanValue, booleanValue4, str2, str, map, booleanValue5, booleanValue6, booleanValue9, booleanValue7, booleanValue8, booleanValue10);
        interfaceC1521d.mo419c(null);
    }

    /* renamed from: l */
    public static void m4840l(InterfaceC1525m interfaceC1525m) {
        f3836c = new C1516i(interfaceC1525m.mo490h(), "flutter_webview_plugin");
        C1131b c1131b = new C1131b(interfaceC1525m.mo491g());
        interfaceC1525m.mo495a(c1131b);
        f3836c.m4034e(c1131b);
    }

    /* renamed from: m */
    private void m4839m(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        C1135d c1135d = this.f3838b;
        if (c1135d != null) {
            c1135d.m4820n(c1515h, interfaceC1521d);
        }
    }

    /* renamed from: n */
    private void m4838n(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        if (this.f3838b != null) {
            this.f3838b.m4819o((String) c1515h.m4040a("url"));
        }
    }

    /* renamed from: o */
    private void m4837o(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        if (this.f3838b != null) {
            this.f3838b.m4818p(m4848d(c1515h));
        }
        interfaceC1521d.mo419c(null);
    }

    /* renamed from: p */
    private void m4836p(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        C1135d c1135d = this.f3838b;
        if (c1135d != null) {
            c1135d.m4817q(c1515h, interfaceC1521d);
        }
    }

    /* renamed from: q */
    private void m4835q(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        C1135d c1135d = this.f3838b;
        if (c1135d != null) {
            c1135d.m4816r(c1515h, interfaceC1521d);
        }
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1523k
    /* renamed from: a */
    public boolean mo4032a(int i, int i2, Intent intent) {
        C1135d.C1141f c1141f;
        C1135d c1135d = this.f3838b;
        if (c1135d == null || (c1141f = c1135d.f3844e) == null) {
            return false;
        }
        return c1141f.m4812a(i, i2, intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1520c
    /* renamed from: b */
    public void mo160b(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        char c;
        String str = c1515h.f4547a;
        switch (str.hashCode()) {
            case -1747898362:
                if (str.equals("cleanCookies")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1109843021:
                if (str.equals("launch")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -948122918:
                if (str.equals("stopLoading")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -934641255:
                if (str.equals("reload")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -934437708:
                if (str.equals("resize")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -677145915:
                if (str.equals("forward")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3015911:
                if (str.equals("back")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3125404:
                if (str.equals("eval")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3202370:
                if (str.equals("hide")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3529469:
                if (str.equals("show")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 94756344:
                if (str.equals("close")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 375437590:
                if (str.equals("reloadUrl")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                m4841k(c1515h, interfaceC1521d);
                return;
            case 1:
                m4846f(c1515h, interfaceC1521d);
                return;
            case 2:
                m4844h(c1515h, interfaceC1521d);
                return;
            case 3:
                m4837o(c1515h, interfaceC1521d);
                return;
            case 4:
                m4839m(c1515h, interfaceC1521d);
                return;
            case 5:
                m4849c(c1515h, interfaceC1521d);
                return;
            case 6:
                m4843i(c1515h, interfaceC1521d);
                return;
            case 7:
                m4842j(c1515h, interfaceC1521d);
                return;
            case '\b':
                m4836p(c1515h, interfaceC1521d);
                return;
            case '\t':
                m4838n(c1515h, interfaceC1521d);
                return;
            case '\n':
                m4835q(c1515h, interfaceC1521d);
                return;
            case 11:
                m4847e(c1515h, interfaceC1521d);
                return;
            default:
                interfaceC1521d.mo421a();
                return;
        }
    }
}
