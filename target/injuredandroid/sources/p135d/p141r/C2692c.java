package p135d.p141r;

import java.io.BufferedReader;
import java.io.Reader;
import p135d.C2643n;
import p135d.p142s.p143c.InterfaceC2706l;
import p135d.p142s.p144d.C2725g;
import p135d.p147v.C2753f;
import p135d.p147v.InterfaceC2749b;
/* renamed from: d.r.c */
/* loaded from: classes.dex */
public final class C2692c {
    /* renamed from: a */
    public static final void m896a(Reader reader, InterfaceC2706l<? super String, C2643n> interfaceC2706l) {
        C2725g.m881e(reader, "$this$forEachLine");
        C2725g.m881e(interfaceC2706l, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            for (String str : m895b(bufferedReader)) {
                interfaceC2706l.mo776c(str);
            }
            C2643n c2643n = C2643n.f6821a;
            C2689a.m899a(bufferedReader, null);
        } finally {
        }
    }

    /* renamed from: b */
    public static final InterfaceC2749b<String> m895b(BufferedReader bufferedReader) {
        InterfaceC2749b<String> m833a;
        C2725g.m881e(bufferedReader, "$this$lineSequence");
        m833a = C2753f.m833a(new C2690b(bufferedReader));
        return m833a;
    }
}
