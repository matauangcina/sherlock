package com.google.firebase.database.p130q;

import android.util.Log;
import com.google.firebase.database.p130q.InterfaceC2567d;
import java.util.List;
/* renamed from: com.google.firebase.database.q.a */
/* loaded from: classes.dex */
public class C2563a extends C2564b {
    public C2563a(InterfaceC2567d.EnumC2568a enumC2568a, List<String> list) {
        super(enumC2568a, list);
    }

    @Override // com.google.firebase.database.p130q.C2564b
    /* renamed from: c */
    protected String mo1185c(InterfaceC2567d.EnumC2568a enumC2568a, String str, String str2, long j) {
        return str2;
    }

    @Override // com.google.firebase.database.p130q.C2564b
    /* renamed from: d */
    protected void mo1184d(String str, String str2) {
        Log.d(str, str2);
    }

    @Override // com.google.firebase.database.p130q.C2564b
    /* renamed from: e */
    protected void mo1183e(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // com.google.firebase.database.p130q.C2564b
    /* renamed from: f */
    protected void mo1182f(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.google.firebase.database.p130q.C2564b
    /* renamed from: h */
    protected void mo1180h(String str, String str2) {
        Log.w(str, str2);
    }
}
