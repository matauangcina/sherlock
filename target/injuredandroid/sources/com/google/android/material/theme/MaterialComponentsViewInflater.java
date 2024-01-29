package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.C0594f;
import androidx.appcompat.widget.C0598g;
import androidx.appcompat.widget.C0645s;
import androidx.appcompat.widget.C0674z;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p054b.p059c.p060a.p075b.p081o.C1365a;
import p054b.p059c.p060a.p075b.p090w.C1384a;
@Keep
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    private static int floatingToolbarItemBackgroundResId = -1;

    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected C0594f createButton(Context context, AttributeSet attributeSet) {
        return shouldInflateAppCompatButton(context, attributeSet) ? new C0594f(context, attributeSet) : new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected C0598g createCheckBox(Context context, AttributeSet attributeSet) {
        return new C1365a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected C0645s createRadioButton(Context context, AttributeSet attributeSet) {
        return new C1384a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected C0674z createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    protected boolean shouldInflateAppCompatButton(Context context, AttributeSet attributeSet) {
        int i = Build.VERSION.SDK_INT;
        if (i == 23 || i == 24 || i == 25) {
            if (floatingToolbarItemBackgroundResId == -1) {
                floatingToolbarItemBackgroundResId = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
            }
            int i2 = floatingToolbarItemBackgroundResId;
            if (i2 != 0 && i2 != -1) {
                for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
                    if (attributeSet.getAttributeNameResource(i3) == 16842964) {
                        if (floatingToolbarItemBackgroundResId == attributeSet.getAttributeListValue(i3, null, 0)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
}
