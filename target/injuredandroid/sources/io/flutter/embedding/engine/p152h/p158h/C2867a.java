package io.flutter.embedding.engine.p152h.p158h;

import io.flutter.embedding.engine.C2820a;
import p108c.p109a.C1499b;
/* renamed from: io.flutter.embedding.engine.h.h.a */
/* loaded from: classes.dex */
public class C2867a {
    /* renamed from: a */
    public static void m487a(C2820a c2820a) {
        try {
            Class.forName("io.flutter.plugins.GeneratedPluginRegistrant").getDeclaredMethod("registerWith", C2820a.class).invoke(null, c2820a);
        } catch (Exception unused) {
            C1499b.m4049e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + c2820a + ") but could not find and invoke the GeneratedPluginRegistrant.");
        }
    }
}
