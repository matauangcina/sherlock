package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import io.flutter.embedding.engine.p159i.C2907m;
import java.util.ArrayList;
import java.util.Iterator;
import p108c.p109a.C1499b;
/* renamed from: io.flutter.plugin.editing.c */
/* loaded from: classes.dex */
class C2931c extends SpannableStringBuilder {

    /* renamed from: f */
    private int f7306f = 0;

    /* renamed from: g */
    private int f7307g = 0;

    /* renamed from: h */
    private ArrayList<InterfaceC2933b> f7308h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<InterfaceC2933b> f7309i = new ArrayList<>();

    /* renamed from: j */
    private String f7310j;

    /* renamed from: k */
    private String f7311k;

    /* renamed from: l */
    private int f7312l;

    /* renamed from: m */
    private int f7313m;

    /* renamed from: n */
    private int f7314n;

    /* renamed from: o */
    private int f7315o;

    /* renamed from: p */
    private BaseInputConnection f7316p;

    /* renamed from: io.flutter.plugin.editing.c$a */
    /* loaded from: classes.dex */
    class C2932a extends BaseInputConnection {

        /* renamed from: a */
        final /* synthetic */ Editable f7317a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2932a(C2931c c2931c, View view, boolean z, Editable editable) {
            super(view, z);
            this.f7317a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f7317a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugin.editing.c$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2933b {
        /* renamed from: a */
        void mo330a(boolean z, boolean z2, boolean z3);
    }

    public C2931c(C2907m.C2913e c2913e, View view) {
        if (c2913e != null) {
            m338l(c2913e);
        }
        this.f7316p = new C2932a(this, view, true, this);
    }

    /* renamed from: h */
    private void m342h(InterfaceC2933b interfaceC2933b, boolean z, boolean z2, boolean z3) {
        this.f7307g++;
        interfaceC2933b.mo330a(z, z2, z3);
        this.f7307g--;
    }

    /* renamed from: i */
    private void m341i(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            Iterator<InterfaceC2933b> it = this.f7308h.iterator();
            while (it.hasNext()) {
                m342h(it.next(), z, z2, z3);
            }
        }
    }

    /* renamed from: a */
    public void m349a(InterfaceC2933b interfaceC2933b) {
        ArrayList<InterfaceC2933b> arrayList;
        if (this.f7307g > 0) {
            C1499b.m4052b("ListenableEditingState", "adding a listener " + interfaceC2933b.toString() + " in a listener callback");
        }
        if (this.f7306f > 0) {
            C1499b.m4049e("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f7309i;
        } else {
            arrayList = this.f7308h;
        }
        arrayList.add(interfaceC2933b);
    }

    /* renamed from: b */
    public void m348b() {
        this.f7306f++;
        if (this.f7307g > 0) {
            C1499b.m4052b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f7306f != 1 || this.f7308h.isEmpty()) {
            return;
        }
        this.f7311k = toString();
        this.f7312l = m343g();
        this.f7313m = m344f();
        this.f7314n = m345e();
        this.f7315o = m346d();
    }

    /* renamed from: c */
    public void m347c() {
        int i = this.f7306f;
        if (i == 0) {
            C1499b.m4052b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i == 1) {
            Iterator<InterfaceC2933b> it = this.f7309i.iterator();
            while (it.hasNext()) {
                m342h(it.next(), true, true, true);
            }
            if (!this.f7308h.isEmpty()) {
                C1499b.m4050d("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f7308h.size()) + " listener(s)");
                boolean z = false;
                m341i(!toString().equals(this.f7311k), (this.f7312l == m343g() && this.f7313m == m344f()) ? false : true, (this.f7314n == m345e() && this.f7315o == m346d()) ? true : true);
            }
        }
        this.f7308h.addAll(this.f7309i);
        this.f7309i.clear();
        this.f7306f--;
    }

    /* renamed from: d */
    public final int m346d() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    /* renamed from: e */
    public final int m345e() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    /* renamed from: f */
    public final int m344f() {
        return Selection.getSelectionEnd(this);
    }

    /* renamed from: g */
    public final int m343g() {
        return Selection.getSelectionStart(this);
    }

    /* renamed from: j */
    public void m340j(InterfaceC2933b interfaceC2933b) {
        if (this.f7307g > 0) {
            C1499b.m4052b("ListenableEditingState", "removing a listener " + interfaceC2933b.toString() + " in a listener callback");
        }
        this.f7308h.remove(interfaceC2933b);
        if (this.f7306f > 0) {
            this.f7309i.remove(interfaceC2933b);
        }
    }

    /* renamed from: k */
    public void m339k(int i, int i2) {
        if (i < 0 || i >= i2) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f7316p.setComposingRegion(i, i2);
        }
    }

    /* renamed from: l */
    public void m338l(C2907m.C2913e c2913e) {
        m348b();
        replace(0, length(), (CharSequence) c2913e.f7233a);
        int i = c2913e.f7234b;
        if (i >= 0) {
            Selection.setSelection(this, i, c2913e.f7235c);
        } else {
            Selection.removeSelection(this);
        }
        m339k(c2913e.f7236d, c2913e.f7237e);
        m347c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f7307g > 0) {
            C1499b.m4052b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        int i5 = i2 - i;
        boolean z = true;
        boolean z2 = i5 != i4 - i3;
        for (int i6 = 0; i6 < i5 && !z2; i6++) {
            z2 |= charAt(i + i6) != charSequence.charAt(i3 + i6);
        }
        if (z2) {
            this.f7310j = null;
        }
        int m343g = m343g();
        int m344f = m344f();
        int m345e = m345e();
        int m346d = m346d();
        SpannableStringBuilder replace = super.replace(i, i2, charSequence, i3, i4);
        if (this.f7306f > 0) {
            return replace;
        }
        boolean z3 = (m343g() == m343g && m344f() == m344f) ? false : true;
        if (m345e() == m345e && m346d() == m346d) {
            z = false;
        }
        m341i(z2, z3, z);
        return replace;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f7310j;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f7310j = spannableStringBuilder;
        return spannableStringBuilder;
    }
}
