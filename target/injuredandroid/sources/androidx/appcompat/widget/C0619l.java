package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
/* renamed from: androidx.appcompat.widget.l */
/* loaded from: classes.dex */
class C0619l {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InputConnection m7365a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof InterfaceC0591d1) {
                    editorInfo.hintText = ((InterfaceC0591d1) parent).m7480a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }
}
