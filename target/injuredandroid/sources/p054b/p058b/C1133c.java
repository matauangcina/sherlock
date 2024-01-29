package p054b.p058b;

import android.content.Context;
import android.webkit.WebView;
/* renamed from: b.b.c */
/* loaded from: classes.dex */
public class C1133c extends WebView {

    /* renamed from: f */
    private InterfaceC1134a f3839f;

    /* renamed from: b.b.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1134a {
        /* renamed from: a */
        void mo4815a(int i, int i2, int i3, int i4);
    }

    public C1133c(Context context) {
        super(context);
    }

    public InterfaceC1134a getOnScrollChangedCallback() {
        return this.f3839f;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC1134a interfaceC1134a = this.f3839f;
        if (interfaceC1134a != null) {
            interfaceC1134a.mo4815a(i, i2, i3, i4);
        }
    }

    public void setOnScrollChangedCallback(InterfaceC1134a interfaceC1134a) {
        this.f3839f = interfaceC1134a;
    }
}
