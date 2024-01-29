package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
class C0576b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1946a;

    public C0576b(ActionBarContainer actionBarContainer) {
        this.f1946a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1946a;
        if (actionBarContainer.f1705m) {
            Drawable drawable = actionBarContainer.f1704l;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1702j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1946a;
        Drawable drawable3 = actionBarContainer2.f1703k;
        if (drawable3 == null || !actionBarContainer2.f1706n) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1946a;
        if (actionBarContainer.f1705m) {
            drawable = actionBarContainer.f1704l;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f1702j;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
