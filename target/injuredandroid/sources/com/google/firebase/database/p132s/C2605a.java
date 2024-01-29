package com.google.firebase.database.p132s;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.firebase.database.s.a */
/* loaded from: classes.dex */
class C2605a {

    /* renamed from: com.google.firebase.database.s.a$a */
    /* loaded from: classes.dex */
    static class C2606a implements InterfaceC2607b {

        /* renamed from: b */
        private int f6760b = 0;

        /* renamed from: a */
        private List<byte[]> f6759a = new ArrayList();

        C2606a() {
        }

        @Override // com.google.firebase.database.p132s.C2605a.InterfaceC2607b
        /* renamed from: a */
        public boolean mo1050a(byte[] bArr) {
            this.f6759a.add(bArr);
            this.f6760b += bArr.length;
            return true;
        }

        @Override // com.google.firebase.database.p132s.C2605a.InterfaceC2607b
        /* renamed from: b */
        public C2620g mo1049b() {
            byte[] bArr = new byte[this.f6760b];
            int i = 0;
            for (int i2 = 0; i2 < this.f6759a.size(); i2++) {
                byte[] bArr2 = this.f6759a.get(i2);
                System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
                i += bArr2.length;
            }
            return new C2620g(bArr);
        }
    }

    /* renamed from: com.google.firebase.database.s.a$b */
    /* loaded from: classes.dex */
    interface InterfaceC2607b {
        /* renamed from: a */
        boolean mo1050a(byte[] bArr);

        /* renamed from: b */
        C2620g mo1049b();
    }

    /* renamed from: com.google.firebase.database.s.a$c */
    /* loaded from: classes.dex */
    static class C2608c implements InterfaceC2607b {

        /* renamed from: c */
        private static ThreadLocal<CharsetDecoder> f6761c = new C2609a();

        /* renamed from: a */
        private StringBuilder f6762a = new StringBuilder();

        /* renamed from: b */
        private ByteBuffer f6763b;

        /* renamed from: com.google.firebase.database.s.a$c$a */
        /* loaded from: classes.dex */
        class C2609a extends ThreadLocal<CharsetDecoder> {
            C2609a() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: a */
            public CharsetDecoder initialValue() {
                CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
                newDecoder.onMalformedInput(CodingErrorAction.REPORT);
                newDecoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newDecoder;
            }
        }

        /* renamed from: com.google.firebase.database.s.a$c$b */
        /* loaded from: classes.dex */
        class C2610b extends ThreadLocal<CharsetEncoder> {
            C2610b() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: a */
            public CharsetEncoder initialValue() {
                CharsetEncoder newEncoder = Charset.forName("UTF8").newEncoder();
                newEncoder.onMalformedInput(CodingErrorAction.REPORT);
                newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newEncoder;
            }
        }

        static {
            new C2610b();
        }

        C2608c() {
        }

        /* renamed from: c */
        private String m1048c(byte[] bArr) {
            try {
                return f6761c.get().decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException unused) {
                return null;
            }
        }

        @Override // com.google.firebase.database.p132s.C2605a.InterfaceC2607b
        /* renamed from: a */
        public boolean mo1050a(byte[] bArr) {
            String m1048c = m1048c(bArr);
            if (m1048c != null) {
                this.f6762a.append(m1048c);
                return true;
            }
            return false;
        }

        @Override // com.google.firebase.database.p132s.C2605a.InterfaceC2607b
        /* renamed from: b */
        public C2620g mo1049b() {
            if (this.f6763b != null) {
                return null;
            }
            return new C2620g(this.f6762a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC2607b m1051a(byte b) {
        return b == 2 ? new C2606a() : new C2608c();
    }
}
