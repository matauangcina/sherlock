package kotlin.random;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: XorWowRandom.kt */
@Metadata(m23d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00122\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0012B\u0017\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B7\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m22d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "seed1", "", "seed2", "(II)V", "x", "y", "z", "w", "v", "addend", "(IIIIII)V", "nextBits", "bitCount", "nextInt", "Companion", "kotlin-stdlib"}, m21k = 1, m20mv = {1, 8, 0}, m18xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class XorWowRandom extends Random implements Serializable {
    private static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    private int addend;

    /* renamed from: v */
    private int f385v;

    /* renamed from: w */
    private int f386w;

    /* renamed from: x */
    private int f387x;

    /* renamed from: y */
    private int f388y;

    /* renamed from: z */
    private int f389z;

    public XorWowRandom(int x, int y, int z, int w, int v, int addend) {
        this.f387x = x;
        this.f388y = y;
        this.f389z = z;
        this.f386w = w;
        this.f385v = v;
        this.addend = addend;
        if (!(((((x | y) | z) | w) | v) != 0)) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i = 0; i < 64; i++) {
            nextInt();
        }
    }

    public XorWowRandom(int seed1, int seed2) {
        this(seed1, seed2, 0, 0, ~seed1, (seed1 << 10) ^ (seed2 >>> 4));
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        int t = this.f387x;
        int t2 = t ^ (t >>> 2);
        this.f387x = this.f388y;
        this.f388y = this.f389z;
        this.f389z = this.f386w;
        int v0 = this.f385v;
        this.f386w = v0;
        int t3 = (((t2 << 1) ^ t2) ^ v0) ^ (v0 << 4);
        this.f385v = t3;
        int i = this.addend + 362437;
        this.addend = i;
        return i + t3;
    }

    @Override // kotlin.random.Random
    public int nextBits(int bitCount) {
        return RandomKt.takeUpperBits(nextInt(), bitCount);
    }

    /* compiled from: XorWowRandom.kt */
    @Metadata(m23d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m22d2 = {"Lkotlin/random/XorWowRandom$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, m21k = 1, m20mv = {1, 8, 0}, m18xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes5.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
