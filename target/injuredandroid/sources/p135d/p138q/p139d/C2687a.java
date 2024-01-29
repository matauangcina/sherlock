package p135d.p138q.p139d;

import p135d.p138q.C2683a;
import p135d.p142s.p144d.C2725g;
/* renamed from: d.q.d.a */
/* loaded from: classes.dex */
public class C2687a extends C2683a {
    @Override // p135d.p138q.C2683a
    /* renamed from: a */
    public void mo900a(Throwable th, Throwable th2) {
        C2725g.m881e(th, "cause");
        C2725g.m881e(th2, "exception");
        th.addSuppressed(th2);
    }
}
