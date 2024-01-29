package p054b.p059c.p060a.p075b.p085r;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* renamed from: b.c.a.b.r.a */
/* loaded from: classes.dex */
public class View$OnTouchListenerC1378a implements View.OnTouchListener {

    /* renamed from: f */
    private final Dialog f4276f;

    /* renamed from: g */
    private final int f4277g;

    /* renamed from: h */
    private final int f4278h;

    /* renamed from: i */
    private final int f4279i;

    public View$OnTouchListenerC1378a(Dialog dialog, Rect rect) {
        this.f4276f = dialog;
        this.f4277g = rect.left;
        this.f4278h = rect.top;
        this.f4279i = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f4277g + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f4278h + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(4);
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f4279i;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f4276f.onTouchEvent(obtain);
    }
}
