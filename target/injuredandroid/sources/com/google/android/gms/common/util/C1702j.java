package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/* renamed from: com.google.android.gms.common.util.j */
/* loaded from: classes.dex */
public class C1702j {

    /* renamed from: a */
    private static String f4868a;

    /* renamed from: b */
    private static int f4869b;

    /* renamed from: a */
    public static String m3546a() {
        if (f4868a == null) {
            if (f4869b == 0) {
                f4869b = Process.myPid();
            }
            f4868a = m3545b(f4869b);
        }
        return f4868a;
    }

    /* renamed from: b */
    private static String m3545b(int i) {
        Throwable th;
        BufferedReader bufferedReader;
        String str = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReader = m3544c(sb.toString());
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        try {
            str = bufferedReader.readLine().trim();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
            C1700h.m3555a(bufferedReader);
            throw th;
        }
        C1700h.m3555a(bufferedReader);
        return str;
    }

    /* renamed from: c */
    private static BufferedReader m3544c(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
