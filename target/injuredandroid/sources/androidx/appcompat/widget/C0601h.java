package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C0779i;
import p000a.p001a.p002k.p003a.C0010a;
/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
public class C0601h extends CheckedTextView {

    /* renamed from: g */
    private static final int[] f2011g = {16843016};

    /* renamed from: f */
    private final C0670y f2012f;

    public C0601h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0601h(Context context, AttributeSet attributeSet, int i) {
        super(C0648t0.m7263b(context), attributeSet, i);
        C0670y c0670y = new C0670y(this);
        this.f2012f = c0670y;
        c0670y.m7154m(attributeSet, i);
        this.f2012f.m7165b();
        C0665w0 m7213u = C0665w0.m7213u(getContext(), attributeSet, f2011g, i, 0);
        setCheckMarkDrawable(m7213u.m7227g(0));
        m7213u.m7212v();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0670y c0670y = this.f2012f;
        if (c0670y != null) {
            c0670y.m7165b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0619l.m7365a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0010a.m9577d(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0779i.m6626p(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0670y c0670y = this.f2012f;
        if (c0670y != null) {
            c0670y.m7151p(context, i);
        }
    }
}
