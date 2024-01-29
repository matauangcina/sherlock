package com.google.android.gms.common.util;

import java.io.Closeable;
import java.io.IOException;
@Deprecated
/* renamed from: com.google.android.gms.common.util.h */
/* loaded from: classes.dex */
public final class C1700h {
    /* renamed from: a */
    public static void m3555a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
