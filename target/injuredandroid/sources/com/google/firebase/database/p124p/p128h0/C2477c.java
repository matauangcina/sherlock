package com.google.firebase.database.p124p.p128h0;

import com.google.firebase.database.p124p.p128h0.InterfaceC2479e;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2587i;
import com.google.firebase.database.p131r.InterfaceC2594n;
/* renamed from: com.google.firebase.database.p.h0.c */
/* loaded from: classes.dex */
public class C2477c {

    /* renamed from: a */
    private final InterfaceC2479e.EnumC2480a f6464a;

    /* renamed from: b */
    private final C2587i f6465b;

    /* renamed from: c */
    private final C2587i f6466c;

    /* renamed from: d */
    private final C2570b f6467d;

    private C2477c(InterfaceC2479e.EnumC2480a enumC2480a, C2587i c2587i, C2570b c2570b, C2570b c2570b2, C2587i c2587i2) {
        this.f6464a = enumC2480a;
        this.f6465b = c2587i;
        this.f6467d = c2570b;
        this.f6466c = c2587i2;
    }

    /* renamed from: b */
    public static C2477c m1500b(C2570b c2570b, C2587i c2587i) {
        return new C2477c(InterfaceC2479e.EnumC2480a.CHILD_ADDED, c2587i, c2570b, null, null);
    }

    /* renamed from: c */
    public static C2477c m1499c(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
        return m1500b(c2570b, C2587i.m1108e(interfaceC2594n));
    }

    /* renamed from: d */
    public static C2477c m1498d(C2570b c2570b, C2587i c2587i, C2587i c2587i2) {
        return new C2477c(InterfaceC2479e.EnumC2480a.CHILD_CHANGED, c2587i, c2570b, null, c2587i2);
    }

    /* renamed from: e */
    public static C2477c m1497e(C2570b c2570b, InterfaceC2594n interfaceC2594n, InterfaceC2594n interfaceC2594n2) {
        return m1498d(c2570b, C2587i.m1108e(interfaceC2594n), C2587i.m1108e(interfaceC2594n2));
    }

    /* renamed from: f */
    public static C2477c m1496f(C2570b c2570b, C2587i c2587i) {
        return new C2477c(InterfaceC2479e.EnumC2480a.CHILD_MOVED, c2587i, c2570b, null, null);
    }

    /* renamed from: g */
    public static C2477c m1495g(C2570b c2570b, C2587i c2587i) {
        return new C2477c(InterfaceC2479e.EnumC2480a.CHILD_REMOVED, c2587i, c2570b, null, null);
    }

    /* renamed from: h */
    public static C2477c m1494h(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
        return m1495g(c2570b, C2587i.m1108e(interfaceC2594n));
    }

    /* renamed from: m */
    public static C2477c m1489m(C2587i c2587i) {
        return new C2477c(InterfaceC2479e.EnumC2480a.VALUE, c2587i, null, null, null);
    }

    /* renamed from: a */
    public C2477c m1501a(C2570b c2570b) {
        return new C2477c(this.f6464a, this.f6465b, this.f6467d, c2570b, this.f6466c);
    }

    /* renamed from: i */
    public C2570b m1493i() {
        return this.f6467d;
    }

    /* renamed from: j */
    public InterfaceC2479e.EnumC2480a m1492j() {
        return this.f6464a;
    }

    /* renamed from: k */
    public C2587i m1491k() {
        return this.f6465b;
    }

    /* renamed from: l */
    public C2587i m1490l() {
        return this.f6466c;
    }

    public String toString() {
        return "Change: " + this.f6464a + " " + this.f6467d;
    }
}
