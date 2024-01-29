package io.flutter.embedding.engine.p159i;

import io.flutter.embedding.engine.p149e.C2832a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p108c.p109a.p110c.p111a.C1512e;
import p108c.p109a.p110c.p111a.C1516i;
/* renamed from: io.flutter.embedding.engine.i.h */
/* loaded from: classes.dex */
public class C2881h {

    /* renamed from: a */
    public final C1516i f7119a;

    /* renamed from: b */
    private InterfaceC2889h f7120b;

    /* renamed from: c */
    final C1516i.InterfaceC1520c f7121c = new C2882a();

    /* renamed from: io.flutter.embedding.engine.i.h$a */
    /* loaded from: classes.dex */
    class C2882a implements C1516i.InterfaceC1520c {
        C2882a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0107 A[Catch: JSONException -> 0x01d4, TryCatch #2 {JSONException -> 0x01d4, blocks: (B:6:0x002c, B:7:0x0030, B:44:0x00ab, B:45:0x00b0, B:46:0x00c9, B:47:0x00d8, B:48:0x00dd, B:50:0x00e1, B:54:0x00fb, B:56:0x0107, B:52:0x00e6, B:57:0x0114, B:66:0x0140, B:87:0x01a1, B:92:0x01ba, B:64:0x0137, B:65:0x013b, B:73:0x0163, B:78:0x017f, B:85:0x019c, B:90:0x01b5, B:95:0x01ce, B:9:0x0035, B:12:0x0040, B:15:0x004a, B:18:0x0055, B:21:0x005f, B:24:0x006a, B:27:0x0074, B:30:0x007e, B:33:0x0088, B:36:0x0092, B:39:0x009d, B:75:0x0168), top: B:100:0x002c, inners: #3, #7, #8, #9 }] */
        @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1520c
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo160b(p108c.p109a.p110c.p111a.C1515h r6, p108c.p109a.p110c.p111a.C1516i.InterfaceC1521d r7) {
            /*
                Method dump skipped, instructions count: 566
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.p159i.C2881h.C2882a.mo160b(c.a.c.a.h, c.a.c.a.i$d):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.embedding.engine.i.h$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2883b {

        /* renamed from: a */
        static final /* synthetic */ int[] f7123a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7124b;

        static {
            int[] iArr = new int[EnumC2892k.values().length];
            f7124b = iArr;
            try {
                iArr[EnumC2892k.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7124b[EnumC2892k.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC2887f.values().length];
            f7123a = iArr2;
            try {
                iArr2[EnumC2887f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7123a[EnumC2887f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7123a[EnumC2887f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7123a[EnumC2887f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.h$c */
    /* loaded from: classes.dex */
    public static class C2884c {

        /* renamed from: a */
        public final int f7125a;

        /* renamed from: b */
        public final String f7126b;

        public C2884c(int i, String str) {
            this.f7125a = i;
            this.f7126b = str;
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.h$d */
    /* loaded from: classes.dex */
    public enum EnumC2885d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        

        /* renamed from: f */
        private String f7130f;

        EnumC2885d(String str) {
            this.f7130f = str;
        }

        /* renamed from: d */
        static EnumC2885d m448d(String str) {
            EnumC2885d[] values;
            for (EnumC2885d enumC2885d : values()) {
                if (enumC2885d.f7130f.equals(str)) {
                    return enumC2885d;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.h$e */
    /* loaded from: classes.dex */
    public enum EnumC2886e {
        PLAIN_TEXT("text/plain");
        

        /* renamed from: f */
        private String f7133f;

        EnumC2886e(String str) {
            this.f7133f = str;
        }

        /* renamed from: d */
        static EnumC2886e m447d(String str) {
            EnumC2886e[] values;
            for (EnumC2886e enumC2886e : values()) {
                if (enumC2886e.f7133f.equals(str)) {
                    return enumC2886e;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.h$f */
    /* loaded from: classes.dex */
    public enum EnumC2887f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        

        /* renamed from: f */
        private String f7139f;

        EnumC2887f(String str) {
            this.f7139f = str;
        }

        /* renamed from: d */
        static EnumC2887f m446d(String str) {
            EnumC2887f[] values;
            for (EnumC2887f enumC2887f : values()) {
                if (enumC2887f.f7139f.equals(str)) {
                    return enumC2887f;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.h$g */
    /* loaded from: classes.dex */
    public enum EnumC2888g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        

        /* renamed from: f */
        private final String f7146f;

        EnumC2888g(String str) {
            this.f7146f = str;
        }

        /* renamed from: d */
        static EnumC2888g m445d(String str) {
            EnumC2888g[] values;
            String str2;
            for (EnumC2888g enumC2888g : values()) {
                if ((enumC2888g.f7146f == null && str == null) || ((str2 = enumC2888g.f7146f) != null && str2.equals(str))) {
                    return enumC2888g;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.h$h */
    /* loaded from: classes.dex */
    public interface InterfaceC2889h {
        /* renamed from: b */
        void mo256b();

        /* renamed from: c */
        void mo255c(EnumC2890i enumC2890i);

        /* renamed from: d */
        void mo254d(List<EnumC2892k> list);

        /* renamed from: e */
        void mo253e();

        /* renamed from: f */
        void mo252f(String str);

        /* renamed from: g */
        void mo251g(C2891j c2891j);

        /* renamed from: h */
        void mo250h(int i);

        /* renamed from: i */
        void mo249i(C2884c c2884c);

        /* renamed from: j */
        void mo248j(EnumC2888g enumC2888g);

        /* renamed from: k */
        boolean mo247k();

        /* renamed from: l */
        CharSequence mo246l(EnumC2886e enumC2886e);
    }

    /* renamed from: io.flutter.embedding.engine.i.h$i */
    /* loaded from: classes.dex */
    public enum EnumC2890i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        

        /* renamed from: f */
        private final String f7150f;

        EnumC2890i(String str) {
            this.f7150f = str;
        }

        /* renamed from: d */
        static EnumC2890i m444d(String str) {
            EnumC2890i[] values;
            for (EnumC2890i enumC2890i : values()) {
                if (enumC2890i.f7150f.equals(str)) {
                    return enumC2890i;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.h$j */
    /* loaded from: classes.dex */
    public static class C2891j {

        /* renamed from: a */
        public final Integer f7151a;

        /* renamed from: b */
        public final EnumC2885d f7152b;

        /* renamed from: c */
        public final Integer f7153c;

        /* renamed from: d */
        public final EnumC2885d f7154d;

        /* renamed from: e */
        public final Integer f7155e;

        public C2891j(Integer num, EnumC2885d enumC2885d, Integer num2, EnumC2885d enumC2885d2, Integer num3) {
            this.f7151a = num;
            this.f7152b = enumC2885d;
            this.f7153c = num2;
            this.f7154d = enumC2885d2;
            this.f7155e = num3;
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.h$k */
    /* loaded from: classes.dex */
    public enum EnumC2892k {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        

        /* renamed from: f */
        private String f7159f;

        EnumC2892k(String str) {
            this.f7159f = str;
        }

        /* renamed from: d */
        static EnumC2892k m443d(String str) {
            EnumC2892k[] values;
            for (EnumC2892k enumC2892k : values()) {
                if (enumC2892k.f7159f.equals(str)) {
                    return enumC2892k;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public C2881h(C2832a c2832a) {
        C1516i c1516i = new C1516i(c2832a, "flutter/platform", C1512e.f4546a);
        this.f7119a = c1516i;
        c1516i.m4034e(this.f7121c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public C2884c m453f(JSONObject jSONObject) {
        int i = jSONObject.getInt("primaryColor");
        if (i != 0) {
            i |= -16777216;
        }
        return new C2884c(i, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053 A[RETURN] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m452g(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L38
            java.lang.String r4 = r10.getString(r1)
            io.flutter.embedding.engine.i.h$f r4 = io.flutter.embedding.engine.p159i.C2881h.EnumC2887f.m446d(r4)
            int[] r8 = io.flutter.embedding.engine.p159i.C2881h.C2883b.f7123a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L2a
            if (r4 == r5) goto L27
            goto L32
        L27:
            r2 = r2 | 8
            goto L32
        L2a:
            r2 = r2 | 2
            goto L32
        L2d:
            r2 = r2 | 4
            goto L32
        L30:
            r2 = r2 | 1
        L32:
            if (r3 != 0) goto L35
            r3 = r2
        L35:
            int r1 = r1 + 1
            goto L4
        L38:
            if (r2 == 0) goto L57
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L4c;
                case 5: goto L4a;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L49;
                case 9: goto L4d;
                case 10: goto L46;
                case 11: goto L45;
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L42;
                default: goto L41;
            }
        L41:
            goto L53
        L42:
            r10 = 13
            return r10
        L45:
            return r6
        L46:
            r10 = 11
            return r10
        L49:
            return r1
        L4a:
            r10 = 12
        L4c:
            return r10
        L4d:
            if (r3 == r6) goto L56
            if (r3 == r5) goto L55
            if (r3 == r1) goto L54
        L53:
            return r7
        L54:
            return r1
        L55:
            return r10
        L56:
            return r0
        L57:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.p159i.C2881h.m452g(org.json.JSONArray):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public C2891j m451h(JSONObject jSONObject) {
        EnumC2885d m448d = !jSONObject.isNull("systemNavigationBarIconBrightness") ? EnumC2885d.m448d(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer valueOf = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null;
        return new C2891j(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? EnumC2885d.m448d(jSONObject.getString("statusBarIconBrightness")) : null, valueOf, m448d, jSONObject.isNull("systemNavigationBarDividerColor") ? null : Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public List<EnumC2892k> m450i(JSONArray jSONArray) {
        EnumC2892k enumC2892k;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            int i2 = C2883b.f7124b[EnumC2892k.m443d(jSONArray.getString(i)).ordinal()];
            if (i2 == 1) {
                enumC2892k = EnumC2892k.TOP_OVERLAYS;
            } else if (i2 == 2) {
                enumC2892k = EnumC2892k.BOTTOM_OVERLAYS;
            }
            arrayList.add(enumC2892k);
        }
        return arrayList;
    }

    /* renamed from: j */
    public void m449j(InterfaceC2889h interfaceC2889h) {
        this.f7120b = interfaceC2889h;
    }
}
