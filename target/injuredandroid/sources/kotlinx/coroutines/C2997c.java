package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p135d.p137p.InterfaceC2676d;
import p135d.p142s.p144d.C2725g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C2997c {
    /* renamed from: a */
    public static final void m1a(InterfaceC2676d interfaceC2676d, CancellationException cancellationException) {
        C2725g.m880f(interfaceC2676d, "$this$cancel");
        InterfaceC2993a interfaceC2993a = (InterfaceC2993a) interfaceC2676d.get(InterfaceC2993a.f7567e);
        if (interfaceC2993a != null) {
            interfaceC2993a.m5a(cancellationException);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m0b(InterfaceC2676d interfaceC2676d, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C2996b.m3a(interfaceC2676d, cancellationException);
    }
}
