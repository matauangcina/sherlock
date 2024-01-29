package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p000a.p019g.p027j.C0194i;
/* renamed from: androidx.appcompat.widget.x */
/* loaded from: classes.dex */
final class C0666x {

    /* renamed from: a */
    private TextView f2236a;

    /* renamed from: b */
    private TextClassifier f2237b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0666x(TextView textView) {
        C0194i.m8866c(textView);
        this.f2236a = textView;
    }

    /* renamed from: a */
    public TextClassifier m7211a() {
        TextClassifier textClassifier = this.f2237b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f2236a.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    /* renamed from: b */
    public void m7210b(TextClassifier textClassifier) {
        this.f2237b = textClassifier;
    }
}
