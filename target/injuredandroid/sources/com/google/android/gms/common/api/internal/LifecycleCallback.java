package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: f */
    protected final InterfaceC1588g f4630f;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(InterfaceC1588g interfaceC1588g) {
        this.f4630f = interfaceC1588g;
    }

    /* renamed from: b */
    public static InterfaceC1588g m3922b(Activity activity) {
        return m3921c(new C1586f(activity));
    }

    /* renamed from: c */
    protected static InterfaceC1588g m3921c(C1586f c1586f) {
        if (c1586f.m3829c()) {
            return C1614s0.m3782r1(c1586f.m3830b());
        }
        if (c1586f.m3828d()) {
            return FragmentC1610q0.m3792d(c1586f.m3831a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC1588g getChimeraLifecycleFragmentImpl(C1586f c1586f) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void m3923a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: d */
    public void m3920d(int i, int i2, Intent intent) {
    }

    /* renamed from: e */
    public void m3919e(Bundle bundle) {
    }

    /* renamed from: f */
    public void m3918f() {
    }

    /* renamed from: g */
    public void m3917g() {
    }

    /* renamed from: h */
    public void m3916h(Bundle bundle) {
    }

    /* renamed from: i */
    public void m3915i() {
    }

    /* renamed from: j */
    public void mo3914j() {
    }
}
