package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputMethodManager;
import com.google.crypto.tink.shaded.protobuf.Reader;
import io.flutter.embedding.android.C2786a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.p159i.C2907m;
import io.flutter.plugin.editing.C2931c;
import p108c.p109a.C1499b;
/* renamed from: io.flutter.plugin.editing.b */
/* loaded from: classes.dex */
class C2930b extends BaseInputConnection implements C2931c.InterfaceC2933b {

    /* renamed from: a */
    private final View f7293a;

    /* renamed from: b */
    private final int f7294b;

    /* renamed from: c */
    private final C2907m f7295c;

    /* renamed from: d */
    private final C2786a f7296d;

    /* renamed from: e */
    private final C2931c f7297e;

    /* renamed from: f */
    private final EditorInfo f7298f;

    /* renamed from: g */
    private ExtractedTextRequest f7299g;

    /* renamed from: h */
    private boolean f7300h;

    /* renamed from: i */
    private CursorAnchorInfo.Builder f7301i;

    /* renamed from: j */
    private ExtractedText f7302j;

    /* renamed from: k */
    private InputMethodManager f7303k;

    /* renamed from: l */
    private final Layout f7304l;

    /* renamed from: m */
    private C2929a f7305m;

    public C2930b(View view, int i, C2907m c2907m, C2786a c2786a, C2931c c2931c, EditorInfo editorInfo) {
        this(view, i, c2907m, c2786a, c2931c, editorInfo, new FlutterJNI());
    }

    public C2930b(View view, int i, C2907m c2907m, C2786a c2786a, C2931c c2931c, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f7300h = false;
        this.f7302j = new ExtractedText();
        this.f7293a = view;
        this.f7294b = i;
        this.f7295c = c2907m;
        this.f7297e = c2931c;
        c2931c.m349a(this);
        this.f7298f = editorInfo;
        this.f7296d = c2786a;
        this.f7305m = new C2929a(flutterJNI);
        this.f7304l = new DynamicLayout(this.f7297e, new TextPaint(), Reader.READ_DONE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f7303k = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    /* renamed from: b */
    private boolean m352b(int i) {
        if (i == 16908319) {
            setSelection(0, this.f7297e.length());
            return true;
        } else if (i == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f7297e);
            int selectionEnd = Selection.getSelectionEnd(this.f7297e);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f7293a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f7297e.subSequence(min, max)));
                this.f7297e.delete(min, max);
                setSelection(min, min);
            }
            return true;
        } else if (i == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f7297e);
            int selectionEnd2 = Selection.getSelectionEnd(this.f7297e);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f7293a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f7297e.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        } else if (i == 16908322) {
            ClipData primaryClip = ((ClipboardManager) this.f7293a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f7293a.getContext());
                int max2 = Math.max(0, Selection.getSelectionStart(this.f7297e));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.f7297e));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.f7297e.delete(min2, max4);
                }
                this.f7297e.insert(min2, coerceToText);
                int length = min2 + coerceToText.length();
                setSelection(length, length);
            }
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    private CursorAnchorInfo m351c() {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        CursorAnchorInfo.Builder builder = this.f7301i;
        if (builder == null) {
            this.f7301i = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f7301i.setSelectionRange(this.f7297e.m343g(), this.f7297e.m344f());
        int m345e = this.f7297e.m345e();
        int m346d = this.f7297e.m346d();
        if (m345e < 0 || m346d <= m345e) {
            this.f7301i.setComposingText(-1, "");
        } else {
            this.f7301i.setComposingText(m345e, this.f7297e.toString().subSequence(m345e, m346d));
        }
        return this.f7301i.build();
    }

    /* renamed from: d */
    private ExtractedText m350d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f7302j;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f7297e.m343g();
        this.f7302j.selectionEnd = this.f7297e.m344f();
        this.f7302j.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f7297e.toString() : this.f7297e;
        return this.f7302j;
    }

    @Override // io.flutter.plugin.editing.C2931c.InterfaceC2933b
    /* renamed from: a */
    public void mo330a(boolean z, boolean z2, boolean z3) {
        this.f7303k.updateSelection(this.f7293a, this.f7297e.m343g(), this.f7297e.m344f(), this.f7297e.m345e(), this.f7297e.m346d());
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        ExtractedTextRequest extractedTextRequest = this.f7299g;
        if (extractedTextRequest != null) {
            this.f7303k.updateExtractedText(this.f7293a, extractedTextRequest.token, m350d(extractedTextRequest));
        }
        if (this.f7300h) {
            this.f7303k.updateCursorAnchorInfo(this.f7293a, m351c());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f7297e.m348b();
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        return super.clearMetaKeyStates(i);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f7297e.m340j(this);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        if (this.f7297e.m343g() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return super.deleteSurroundingTextInCodePoints(i, i2);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f7297e.m347c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f7297e;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        if (z == (this.f7299g == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z ? "on" : "off");
            C1499b.m4053a("InputConnectionAdaptor", sb.toString());
        }
        this.f7299g = z ? extractedTextRequest : null;
        return m350d(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        beginBatchEdit();
        boolean m352b = m352b(i);
        endBatchEdit();
        return m352b;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        if (i == 0) {
            this.f7295c.m400m(this.f7294b);
        } else if (i == 1) {
            this.f7295c.m408e(this.f7294b);
        } else if (i == 2) {
            this.f7295c.m409d(this.f7294b);
        } else if (i == 3) {
            this.f7295c.m403j(this.f7294b);
        } else if (i == 4) {
            this.f7295c.m402k(this.f7294b);
        } else if (i == 5) {
            this.f7295c.m407f(this.f7294b);
        } else if (i != 7) {
            this.f7295c.m410c(this.f7294b);
        } else {
            this.f7295c.m405h(this.f7294b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f7295c.m406g(this.f7294b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if ((i & 1) != 0) {
            this.f7303k.updateCursorAnchorInfo(this.f7293a, m351c());
        }
        boolean z = (i & 2) != 0;
        if (z != this.f7300h) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z ? "on" : "off");
            C1499b.m4053a("InputConnectionAdaptor", sb.toString());
        }
        this.f7300h = z;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        C2786a c2786a = this.f7296d;
        if (c2786a == null || c2786a.m743c(keyEvent) || !this.f7296d.m742d(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                if (keyEvent.getAction() == 1 && (keyEvent.getKeyCode() == 59 || keyEvent.getKeyCode() == 60)) {
                    int selectionEnd = Selection.getSelectionEnd(this.f7297e);
                    setSelection(selectionEnd, selectionEnd);
                    return true;
                }
                return false;
            } else if (keyEvent.getKeyCode() == 21) {
                int selectionStart = Selection.getSelectionStart(this.f7297e);
                int selectionEnd2 = Selection.getSelectionEnd(this.f7297e);
                if (selectionStart != selectionEnd2 || keyEvent.isShiftPressed()) {
                    setSelection(selectionStart, Math.max(this.f7305m.m360b(this.f7297e, selectionEnd2), 0));
                } else {
                    int max = Math.max(this.f7305m.m360b(this.f7297e, selectionStart), 0);
                    setSelection(max, max);
                }
                return true;
            } else if (keyEvent.getKeyCode() == 22) {
                int selectionStart2 = Selection.getSelectionStart(this.f7297e);
                int selectionEnd3 = Selection.getSelectionEnd(this.f7297e);
                if (selectionStart2 != selectionEnd3 || keyEvent.isShiftPressed()) {
                    setSelection(selectionStart2, Math.min(this.f7305m.m361a(this.f7297e, selectionEnd3), this.f7297e.length()));
                } else {
                    int min = Math.min(this.f7305m.m361a(this.f7297e, selectionStart2), this.f7297e.length());
                    setSelection(min, min);
                }
                return true;
            } else if (keyEvent.getKeyCode() == 19) {
                if (Selection.getSelectionStart(this.f7297e) != Selection.getSelectionEnd(this.f7297e) || keyEvent.isShiftPressed()) {
                    Selection.extendUp(this.f7297e, this.f7304l);
                    setSelection(Selection.getSelectionStart(this.f7297e), Selection.getSelectionEnd(this.f7297e));
                } else {
                    Selection.moveUp(this.f7297e, this.f7304l);
                    int selectionStart3 = Selection.getSelectionStart(this.f7297e);
                    setSelection(selectionStart3, selectionStart3);
                }
                return true;
            } else if (keyEvent.getKeyCode() == 20) {
                if (Selection.getSelectionStart(this.f7297e) != Selection.getSelectionEnd(this.f7297e) || keyEvent.isShiftPressed()) {
                    Selection.extendDown(this.f7297e, this.f7304l);
                    setSelection(Selection.getSelectionStart(this.f7297e), Selection.getSelectionEnd(this.f7297e));
                } else {
                    Selection.moveDown(this.f7297e, this.f7304l);
                    int selectionStart4 = Selection.getSelectionStart(this.f7297e);
                    setSelection(selectionStart4, selectionStart4);
                }
                return true;
            } else {
                if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                    EditorInfo editorInfo = this.f7298f;
                    if ((131072 & editorInfo.inputType) == 0) {
                        performEditorAction(editorInfo.imeOptions & 255);
                        return true;
                    }
                }
                int unicodeChar = keyEvent.getUnicodeChar();
                if (unicodeChar == 0) {
                    return false;
                }
                int max2 = Math.max(0, Selection.getSelectionStart(this.f7297e));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.f7297e));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.f7297e.delete(min2, max4);
                }
                this.f7297e.insert(min2, (CharSequence) String.valueOf((char) unicodeChar));
                int i = min2 + 1;
                setSelection(i, i);
                return true;
            }
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        return super.setComposingRegion(i, i2);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i) : super.setComposingText(charSequence, i);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        beginBatchEdit();
        boolean selection = super.setSelection(i, i2);
        endBatchEdit();
        return selection;
    }
}
