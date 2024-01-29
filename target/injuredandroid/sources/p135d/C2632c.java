package p135d;

import p135d.p142s.p144d.C2725g;
/* renamed from: d.c */
/* loaded from: classes.dex */
public final class C2632c implements Comparable<C2632c> {

    /* renamed from: j */
    public static final C2632c f6810j = C2633d.m979a();

    /* renamed from: f */
    private final int f6811f;

    /* renamed from: g */
    private final int f6812g;

    /* renamed from: h */
    private final int f6813h;

    /* renamed from: i */
    private final int f6814i;

    public C2632c(int i, int i2, int i3) {
        this.f6812g = i;
        this.f6813h = i2;
        this.f6814i = i3;
        this.f6811f = m980e(i, i2, i3);
    }

    /* renamed from: e */
    private final int m980e(int i, int i2, int i3) {
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(C2632c c2632c) {
        C2725g.m881e(c2632c, "other");
        return this.f6811f - c2632c.f6811f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2632c)) {
            obj = null;
        }
        C2632c c2632c = (C2632c) obj;
        return c2632c != null && this.f6811f == c2632c.f6811f;
    }

    public int hashCode() {
        return this.f6811f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6812g);
        sb.append('.');
        sb.append(this.f6813h);
        sb.append('.');
        sb.append(this.f6814i);
        return sb.toString();
    }
}
