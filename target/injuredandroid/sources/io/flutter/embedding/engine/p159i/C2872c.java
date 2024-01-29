package io.flutter.embedding.engine.p159i;

import android.os.Build;
import android.view.InputDevice;
import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.C1500a;
import p108c.p109a.p110c.p111a.C1511d;
import p108c.p109a.p110c.p111a.InterfaceC1507b;
/* renamed from: io.flutter.embedding.engine.i.c */
/* loaded from: classes.dex */
public class C2872c {

    /* renamed from: a */
    private InterfaceC2873a f7108a;

    /* renamed from: b */
    public final C1500a<Object> f7109b;

    /* renamed from: io.flutter.embedding.engine.i.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2873a {
        /* renamed from: a */
        void mo471a(KeyEvent keyEvent);

        /* renamed from: b */
        void mo470b(KeyEvent keyEvent);
    }

    /* renamed from: io.flutter.embedding.engine.i.c$b */
    /* loaded from: classes.dex */
    public static class C2874b {

        /* renamed from: a */
        public final KeyEvent f7110a;

        /* renamed from: b */
        public final Character f7111b;

        public C2874b(KeyEvent keyEvent, Character ch) {
            this.f7110a = keyEvent;
            this.f7111b = ch;
        }
    }

    public C2872c(InterfaceC1507b interfaceC1507b) {
        this.f7109b = new C1500a<>(interfaceC1507b, "flutter/keyevent", C1511d.f4545a);
    }

    /* renamed from: b */
    private void m476b(C2874b c2874b, Map<String, Object> map) {
        int i;
        map.put("flags", Integer.valueOf(c2874b.f7110a.getFlags()));
        int i2 = 0;
        map.put("plainCodePoint", Integer.valueOf(c2874b.f7110a.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(c2874b.f7110a.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(c2874b.f7110a.getKeyCode()));
        map.put("scanCode", Integer.valueOf(c2874b.f7110a.getScanCode()));
        map.put("metaState", Integer.valueOf(c2874b.f7110a.getMetaState()));
        Character ch = c2874b.f7111b;
        if (ch != null) {
            map.put("character", ch.toString());
        }
        map.put("source", Integer.valueOf(c2874b.f7110a.getSource()));
        InputDevice device = InputDevice.getDevice(c2874b.f7110a.getDeviceId());
        if (device == null || Build.VERSION.SDK_INT < 19) {
            i = 0;
        } else {
            i2 = device.getVendorId();
            i = device.getProductId();
        }
        map.put("vendorId", Integer.valueOf(i2));
        map.put("productId", Integer.valueOf(i));
        map.put("deviceId", Integer.valueOf(c2874b.f7110a.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(c2874b.f7110a.getRepeatCount()));
    }

    /* renamed from: a */
    C1500a.InterfaceC1506e<Object> m477a(final KeyEvent keyEvent) {
        return new C1500a.InterfaceC1506e() { // from class: io.flutter.embedding.engine.i.a
            @Override // p108c.p109a.p110c.p111a.C1500a.InterfaceC1506e
            /* renamed from: a */
            public final void mo486a(Object obj) {
                C2872c.this.m473e(keyEvent, obj);
            }
        };
    }

    /* renamed from: c */
    public void m475c(C2874b c2874b) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", "keydown");
        hashMap.put("keymap", "android");
        m476b(c2874b, hashMap);
        this.f7109b.m4044d(hashMap, m477a(c2874b.f7110a));
    }

    /* renamed from: d */
    public void m474d(C2874b c2874b) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", "keyup");
        hashMap.put("keymap", "android");
        m476b(c2874b, hashMap);
        this.f7109b.m4044d(hashMap, m477a(c2874b.f7110a));
    }

    /* renamed from: e */
    public /* synthetic */ void m473e(KeyEvent keyEvent, Object obj) {
        InterfaceC2873a interfaceC2873a = this.f7108a;
        if (interfaceC2873a == null) {
            return;
        }
        try {
            if (obj == null) {
                interfaceC2873a.mo470b(keyEvent);
            } else if (((JSONObject) obj).getBoolean("handled")) {
                this.f7108a.mo471a(keyEvent);
            } else {
                this.f7108a.mo470b(keyEvent);
            }
        } catch (JSONException e) {
            C1499b.m4052b("KeyEventChannel", "Unable to unpack JSON message: " + e);
            this.f7108a.mo470b(keyEvent);
        }
    }

    /* renamed from: f */
    public void m472f(InterfaceC2873a interfaceC2873a) {
        this.f7108a = interfaceC2873a;
    }
}
