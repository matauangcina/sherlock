package p135d;

import java.io.Serializable;
import p135d.p142s.p144d.C2725g;
/* renamed from: d.i */
/* loaded from: classes.dex */
public final class C2638i<A, B> implements Serializable {

    /* renamed from: f */
    private final A f6815f;

    /* renamed from: g */
    private final B f6816g;

    public C2638i(A a, B b) {
        this.f6815f = a;
        this.f6816g = b;
    }

    /* renamed from: a */
    public final A m976a() {
        return this.f6815f;
    }

    /* renamed from: b */
    public final B m975b() {
        return this.f6816g;
    }

    /* renamed from: c */
    public final A m974c() {
        return this.f6815f;
    }

    /* renamed from: d */
    public final B m973d() {
        return this.f6816g;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2638i) {
                C2638i c2638i = (C2638i) obj;
                return C2725g.m885a(this.f6815f, c2638i.f6815f) && C2725g.m885a(this.f6816g, c2638i.f6816g);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a = this.f6815f;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f6816g;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f6815f + ", " + this.f6816g + ')';
    }
}
