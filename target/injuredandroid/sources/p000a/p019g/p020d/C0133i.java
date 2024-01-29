package p000a.p019g.p020d;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.p052d.C0744c;
import java.io.IOException;
import java.io.InputStream;
import p000a.p019g.p025h.C0161f;
/* renamed from: a.g.d.i */
/* loaded from: classes.dex */
public class C0133i extends C0134j {
    @Override // p000a.p019g.p020d.C0134j
    /* renamed from: b */
    public Typeface mo8995b(Context context, C0744c.C0746b c0746b, Resources resources, int i) {
        try {
            C0744c.C0747c[] m6822a = c0746b.m6822a();
            int length = m6822a.length;
            FontFamily.Builder builder = null;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    break;
                }
                C0744c.C0747c c0747c = m6822a[i2];
                try {
                    Font.Builder weight = new Font.Builder(resources, c0747c.m6820b()).setWeight(c0747c.m6817e());
                    if (!c0747c.m6816f()) {
                        i3 = 0;
                    }
                    Font build = weight.setSlant(i3).setTtcIndex(c0747c.m6819c()).setFontVariationSettings(c0747c.m6818d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i2++;
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p000a.p019g.p020d.C0134j
    /* renamed from: c */
    public Typeface mo8994c(Context context, CancellationSignal cancellationSignal, C0161f.C0163b[] c0163bArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = c0163bArr.length;
            FontFamily.Builder builder = null;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    if (builder == null) {
                        return null;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
                }
                C0161f.C0163b c0163b = c0163bArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c0163b.m8927d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(c0163b.m8926e());
                        if (!c0163b.m8925f()) {
                            i3 = 0;
                        }
                        Font build = weight.setSlant(i3).setTtcIndex(c0163b.m8928c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                        if (openFileDescriptor == null) {
                        }
                    } catch (Throwable th) {
                        if (openFileDescriptor != null) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                        break;
                    }
                } else {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                }
                openFileDescriptor.close();
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p019g.p020d.C0134j
    /* renamed from: d */
    public Typeface mo8993d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p000a.p019g.p020d.C0134j
    /* renamed from: e */
    public Typeface mo8992e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p019g.p020d.C0134j
    /* renamed from: h */
    public C0161f.C0163b mo8989h(C0161f.C0163b[] c0163bArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
