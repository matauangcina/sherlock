package io.flutter.plugin.platform;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import io.flutter.view.C2974c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.plugin.platform.c */
/* loaded from: classes.dex */
public class C2948c {

    /* renamed from: a */
    private C2974c f7361a;

    /* renamed from: a */
    public boolean m279a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        C2974c c2974c = this.f7361a;
        if (c2974c == null) {
            return false;
        }
        return c2974c.m105r(view, view2, accessibilityEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m278b(C2974c c2974c) {
        this.f7361a = c2974c;
    }
}
