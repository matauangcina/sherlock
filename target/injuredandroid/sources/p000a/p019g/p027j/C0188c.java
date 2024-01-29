package p000a.p019g.p027j;

import android.util.Log;
import java.io.Writer;
@Deprecated
/* renamed from: a.g.j.c */
/* loaded from: classes.dex */
public class C0188c extends Writer {

    /* renamed from: f */
    private final String f640f;

    /* renamed from: g */
    private StringBuilder f641g = new StringBuilder(128);

    public C0188c(String str) {
        this.f640f = str;
    }

    /* renamed from: a */
    private void m8874a() {
        if (this.f641g.length() > 0) {
            Log.d(this.f640f, this.f641g.toString());
            StringBuilder sb = this.f641g;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m8874a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m8874a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m8874a();
            } else {
                this.f641g.append(c);
            }
        }
    }
}
