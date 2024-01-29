package io.flutter.embedding.engine.p159i;

import android.os.Bundle;
import io.flutter.embedding.engine.p149e.C2832a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.C1512e;
import p108c.p109a.p110c.p111a.C1515h;
import p108c.p109a.p110c.p111a.C1516i;
/* renamed from: io.flutter.embedding.engine.i.m */
/* loaded from: classes.dex */
public class C2907m {

    /* renamed from: a */
    public final C1516i f7208a;

    /* renamed from: b */
    private InterfaceC2914f f7209b;

    /* renamed from: c */
    private final C1516i.InterfaceC1520c f7210c = new C2908a();

    /* renamed from: io.flutter.embedding.engine.i.m$a */
    /* loaded from: classes.dex */
    class C2908a implements C1516i.InterfaceC1520c {
        C2908a() {
        }

        @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1520c
        /* renamed from: b */
        public void mo160b(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
            String message;
            Bundle bundle;
            if (C2907m.this.f7209b == null) {
                return;
            }
            String str = c1515h.f4547a;
            Object obj = c1515h.f4548b;
            C1499b.m4050d("TextInputChannel", "Received '" + str + "' message.");
            char c = 65535;
            switch (str.hashCode()) {
                case -1779068172:
                    if (str.equals("TextInput.setPlatformViewClient")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1015421462:
                    if (str.equals("TextInput.setEditingState")) {
                        c = 5;
                        break;
                    }
                    break;
                case -37561188:
                    if (str.equals("TextInput.setClient")) {
                        c = 2;
                        break;
                    }
                    break;
                case 270476819:
                    if (str.equals("TextInput.hide")) {
                        c = 1;
                        break;
                    }
                    break;
                case 270803918:
                    if (str.equals("TextInput.show")) {
                        c = 0;
                        break;
                    }
                    break;
                case 649192816:
                    if (str.equals("TextInput.sendAppPrivateCommand")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1204752139:
                    if (str.equals("TextInput.setEditableSizeAndTransform")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1727570905:
                    if (str.equals("TextInput.finishAutofillContext")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1904427655:
                    if (str.equals("TextInput.clearClient")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2113369584:
                    if (str.equals("TextInput.requestAutofill")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            try {
                switch (c) {
                    case 0:
                        C2907m.this.f7209b.mo304a();
                        break;
                    case 1:
                        C2907m.this.f7209b.mo295j();
                        break;
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            C2907m.this.f7209b.mo302c(jSONArray.getInt(0), C2909b.m397a(jSONArray.getJSONObject(1)));
                            interfaceC1521d.mo419c(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e) {
                            message = e.getMessage();
                            interfaceC1521d.mo420b("error", message, null);
                            return;
                        }
                    case 3:
                        C2907m.this.f7209b.mo297h();
                        break;
                    case 4:
                        C2907m.this.f7209b.mo299f(((Integer) obj).intValue());
                        return;
                    case 5:
                        C2907m.this.f7209b.mo301d(C2913e.m391a((JSONObject) obj));
                        interfaceC1521d.mo419c(null);
                        return;
                    case 6:
                        JSONObject jSONObject = (JSONObject) obj;
                        double d = jSONObject.getDouble("width");
                        double d2 = jSONObject.getDouble("height");
                        JSONArray jSONArray2 = jSONObject.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i = 0; i < 16; i++) {
                            dArr[i] = jSONArray2.getDouble(i);
                        }
                        C2907m.this.f7209b.mo298g(d, d2, dArr);
                        return;
                    case 7:
                        C2907m.this.f7209b.mo303b();
                        break;
                    case '\b':
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        C2907m.this.f7209b.mo300e(string, bundle);
                        interfaceC1521d.mo419c(null);
                        return;
                    case '\t':
                        C2907m.this.f7209b.mo296i(((Boolean) obj).booleanValue());
                        break;
                    default:
                        interfaceC1521d.mo421a();
                        return;
                }
                interfaceC1521d.mo419c(null);
            } catch (JSONException e2) {
                message = e2.getMessage();
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.m$b */
    /* loaded from: classes.dex */
    public static class C2909b {

        /* renamed from: a */
        public final boolean f7212a;

        /* renamed from: b */
        public final boolean f7213b;

        /* renamed from: c */
        public final boolean f7214c;

        /* renamed from: d */
        public final EnumC2912d f7215d;

        /* renamed from: e */
        public final C2911c f7216e;

        /* renamed from: f */
        public final Integer f7217f;

        /* renamed from: g */
        public final String f7218g;

        /* renamed from: h */
        public final C2910a f7219h;

        /* renamed from: i */
        public final C2909b[] f7220i;

        /* renamed from: io.flutter.embedding.engine.i.m$b$a */
        /* loaded from: classes.dex */
        public static class C2910a {

            /* renamed from: a */
            public final String f7221a;

            /* renamed from: b */
            public final String[] f7222b;

            /* renamed from: c */
            public final C2913e f7223c;

            public C2910a(String str, String[] strArr, C2913e c2913e) {
                this.f7221a = str;
                this.f7222b = strArr;
                this.f7223c = c2913e;
            }

            /* renamed from: a */
            public static C2910a m395a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                int length = jSONArray.length();
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = m394b(jSONArray.getString(i));
                }
                return new C2910a(string, strArr, C2913e.m391a(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
                if (r16.equals("password") != false) goto L10;
             */
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String m394b(java.lang.String r16) {
                /*
                    Method dump skipped, instructions count: 740
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.p159i.C2907m.C2909b.C2910a.m394b(java.lang.String):java.lang.String");
            }
        }

        public C2909b(boolean z, boolean z2, boolean z3, EnumC2912d enumC2912d, C2911c c2911c, Integer num, String str, C2910a c2910a, C2909b[] c2909bArr) {
            this.f7212a = z;
            this.f7213b = z2;
            this.f7214c = z3;
            this.f7215d = enumC2912d;
            this.f7216e = c2911c;
            this.f7217f = num;
            this.f7218g = str;
            this.f7219h = c2910a;
            this.f7220i = c2909bArr;
        }

        /* renamed from: a */
        public static C2909b m397a(JSONObject jSONObject) {
            C2909b[] c2909bArr;
            String string = jSONObject.getString("inputAction");
            if (string != null) {
                if (jSONObject.isNull("fields")) {
                    c2909bArr = null;
                } else {
                    JSONArray jSONArray = jSONObject.getJSONArray("fields");
                    int length = jSONArray.length();
                    C2909b[] c2909bArr2 = new C2909b[length];
                    for (int i = 0; i < length; i++) {
                        c2909bArr2[i] = m397a(jSONArray.getJSONObject(i));
                    }
                    c2909bArr = c2909bArr2;
                }
                return new C2909b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), EnumC2912d.m392d(jSONObject.getString("textCapitalization")), C2911c.m393a(jSONObject.getJSONObject("inputType")), m396b(string), jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : C2910a.m395a(jSONObject.getJSONObject("autofill")), c2909bArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
            if (r11.equals("TextInputAction.newline") != false) goto L6;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.Integer m396b(java.lang.String r11) {
            /*
                int r0 = r11.hashCode()
                r1 = 7
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 6
                r7 = 0
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 1
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                switch(r0) {
                    case -810971940: goto L68;
                    case -737377923: goto L5e;
                    case -737089298: goto L54;
                    case -737080013: goto L4a;
                    case -736940669: goto L40;
                    case 469250275: goto L36;
                    case 1241689507: goto L2c;
                    case 1539450297: goto L23;
                    case 2110497650: goto L18;
                    default: goto L17;
                }
            L17:
                goto L72
            L18:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L72
                r7 = 8
                goto L73
            L23:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L72
                goto L73
            L2c:
                java.lang.String r0 = "TextInputAction.go"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L72
                r7 = 4
                goto L73
            L36:
                java.lang.String r0 = "TextInputAction.search"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L72
                r7 = 5
                goto L73
            L40:
                java.lang.String r0 = "TextInputAction.send"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L72
                r7 = 6
                goto L73
            L4a:
                java.lang.String r0 = "TextInputAction.none"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L72
                r7 = 1
                goto L73
            L54:
                java.lang.String r0 = "TextInputAction.next"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L72
                r7 = 7
                goto L73
            L5e:
                java.lang.String r0 = "TextInputAction.done"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L72
                r7 = 3
                goto L73
            L68:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L72
                r7 = 2
                goto L73
            L72:
                r7 = -1
            L73:
                switch(r7) {
                    case 0: goto L96;
                    case 1: goto L96;
                    case 2: goto L95;
                    case 3: goto L90;
                    case 4: goto L8b;
                    case 5: goto L86;
                    case 6: goto L81;
                    case 7: goto L7c;
                    case 8: goto L77;
                    default: goto L76;
                }
            L76:
                return r8
            L77:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
                return r11
            L7c:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
                return r11
            L81:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
                return r11
            L86:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
                return r11
            L8b:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
                return r11
            L90:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
                return r11
            L95:
                return r8
            L96:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.p159i.C2907m.C2909b.m396b(java.lang.String):java.lang.Integer");
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.m$c */
    /* loaded from: classes.dex */
    public static class C2911c {

        /* renamed from: a */
        public final EnumC2915g f7224a;

        /* renamed from: b */
        public final boolean f7225b;

        /* renamed from: c */
        public final boolean f7226c;

        public C2911c(EnumC2915g enumC2915g, boolean z, boolean z2) {
            this.f7224a = enumC2915g;
            this.f7225b = z;
            this.f7226c = z2;
        }

        /* renamed from: a */
        public static C2911c m393a(JSONObject jSONObject) {
            return new C2911c(EnumC2915g.m390d(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.m$d */
    /* loaded from: classes.dex */
    public enum EnumC2912d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        

        /* renamed from: f */
        private final String f7232f;

        EnumC2912d(String str) {
            this.f7232f = str;
        }

        /* renamed from: d */
        static EnumC2912d m392d(String str) {
            EnumC2912d[] values;
            for (EnumC2912d enumC2912d : values()) {
                if (enumC2912d.f7232f.equals(str)) {
                    return enumC2912d;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.m$e */
    /* loaded from: classes.dex */
    public static class C2913e {

        /* renamed from: a */
        public final String f7233a;

        /* renamed from: b */
        public final int f7234b;

        /* renamed from: c */
        public final int f7235c;

        /* renamed from: d */
        public final int f7236d;

        /* renamed from: e */
        public final int f7237e;

        public C2913e(String str, int i, int i2, int i3, int i4) {
            if (!(i == -1 && i2 == -1) && (i < 0 || i2 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i) + ", " + String.valueOf(i2) + ")");
            } else if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i3 >= i4)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
            } else if (i4 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i3));
            } else if (i > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i));
            } else if (i2 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i2));
            } else {
                this.f7233a = str;
                this.f7234b = i;
                this.f7235c = i2;
                this.f7236d = i3;
                this.f7237e = i4;
            }
        }

        /* renamed from: a */
        public static C2913e m391a(JSONObject jSONObject) {
            return new C2913e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.m$f */
    /* loaded from: classes.dex */
    public interface InterfaceC2914f {
        /* renamed from: a */
        void mo304a();

        /* renamed from: b */
        void mo303b();

        /* renamed from: c */
        void mo302c(int i, C2909b c2909b);

        /* renamed from: d */
        void mo301d(C2913e c2913e);

        /* renamed from: e */
        void mo300e(String str, Bundle bundle);

        /* renamed from: f */
        void mo299f(int i);

        /* renamed from: g */
        void mo298g(double d, double d2, double[] dArr);

        /* renamed from: h */
        void mo297h();

        /* renamed from: i */
        void mo296i(boolean z);

        /* renamed from: j */
        void mo295j();
    }

    /* renamed from: io.flutter.embedding.engine.i.m$g */
    /* loaded from: classes.dex */
    public enum EnumC2915g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword");
        

        /* renamed from: f */
        private final String f7249f;

        EnumC2915g(String str) {
            this.f7249f = str;
        }

        /* renamed from: d */
        static EnumC2915g m390d(String str) {
            EnumC2915g[] values;
            for (EnumC2915g enumC2915g : values()) {
                if (enumC2915g.f7249f.equals(str)) {
                    return enumC2915g;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public C2907m(C2832a c2832a) {
        C1516i c1516i = new C1516i(c2832a, "flutter/textinput", C1512e.f4546a);
        this.f7208a = c1516i;
        c1516i.m4034e(this.f7210c);
    }

    /* renamed from: b */
    private static HashMap<Object, Object> m411b(String str, int i, int i2, int i3, int i4) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i));
        hashMap.put("selectionExtent", Integer.valueOf(i2));
        hashMap.put("composingBase", Integer.valueOf(i3));
        hashMap.put("composingExtent", Integer.valueOf(i4));
        return hashMap;
    }

    /* renamed from: c */
    public void m410c(int i) {
        C1499b.m4050d("TextInputChannel", "Sending 'done' message.");
        this.f7208a.m4036c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.done"));
    }

    /* renamed from: d */
    public void m409d(int i) {
        C1499b.m4050d("TextInputChannel", "Sending 'go' message.");
        this.f7208a.m4036c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.go"));
    }

    /* renamed from: e */
    public void m408e(int i) {
        C1499b.m4050d("TextInputChannel", "Sending 'newline' message.");
        this.f7208a.m4036c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.newline"));
    }

    /* renamed from: f */
    public void m407f(int i) {
        C1499b.m4050d("TextInputChannel", "Sending 'next' message.");
        this.f7208a.m4036c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.next"));
    }

    /* renamed from: g */
    public void m406g(int i, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f7208a.m4036c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i), hashMap));
    }

    /* renamed from: h */
    public void m405h(int i) {
        C1499b.m4050d("TextInputChannel", "Sending 'previous' message.");
        this.f7208a.m4036c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.previous"));
    }

    /* renamed from: i */
    public void m404i() {
        this.f7208a.m4036c("TextInputClient.requestExistingInputState", null);
    }

    /* renamed from: j */
    public void m403j(int i) {
        C1499b.m4050d("TextInputChannel", "Sending 'search' message.");
        this.f7208a.m4036c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.search"));
    }

    /* renamed from: k */
    public void m402k(int i) {
        C1499b.m4050d("TextInputChannel", "Sending 'send' message.");
        this.f7208a.m4036c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.send"));
    }

    /* renamed from: l */
    public void m401l(InterfaceC2914f interfaceC2914f) {
        this.f7209b = interfaceC2914f;
    }

    /* renamed from: m */
    public void m400m(int i) {
        C1499b.m4050d("TextInputChannel", "Sending 'unspecified' message.");
        this.f7208a.m4036c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.unspecified"));
    }

    /* renamed from: n */
    public void m399n(int i, String str, int i2, int i3, int i4, int i5) {
        C1499b.m4050d("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i2 + "\nSelection end: " + i3 + "\nComposing start: " + i4 + "\nComposing end: " + i5);
        this.f7208a.m4036c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i), m411b(str, i2, i3, i4, i5)));
    }

    /* renamed from: o */
    public void m398o(int i, HashMap<String, C2913e> hashMap) {
        C1499b.m4050d("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, C2913e> entry : hashMap.entrySet()) {
            C2913e value = entry.getValue();
            hashMap2.put(entry.getKey(), m411b(value.f7233a, value.f7234b, value.f7235c, -1, -1));
        }
        this.f7208a.m4036c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i), hashMap2));
    }
}
