package kotlin.random;

import kotlin.Metadata;
/* compiled from: XorWowRandom.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B7\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m19d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "seed1", "", "seed2", "(II)V", "x", "y", "z", "w", "v", "addend", "(IIIIII)V", "nextBits", "bitCount", "nextInt", "kotlin-stdlib"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class XorWowRandom extends Random {
    private int addend;

    /* renamed from: v */
    private int f114v;

    /* renamed from: w */
    private int f115w;

    /* renamed from: x */
    private int f116x;

    /* renamed from: y */
    private int f117y;

    /* renamed from: z */
    private int f118z;

    public XorWowRandom(int x, int y, int z, int w, int v, int addend) {
        this.f116x = x;
        this.f117y = y;
        this.f118z = z;
        this.f115w = w;
        this.f114v = v;
        this.addend = addend;
        if (!(((((x | y) | z) | w) | v) != 0)) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i = 0; i < 64; i++) {
            nextInt();
        }
    }

    public XorWowRandom(int seed1, int seed2) {
        this(seed1, seed2, 0, 0, seed1 ^ (-1), (seed1 << 10) ^ (seed2 >>> 4));
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        int t = this.f116x;
        int t2 = t ^ (t >>> 2);
        this.f116x = this.f117y;
        this.f117y = this.f118z;
        this.f118z = this.f115w;
        int v0 = this.f114v;
        this.f115w = v0;
        int t3 = (((t2 << 1) ^ t2) ^ v0) ^ (v0 << 4);
        this.f114v = t3;
        int i = this.addend + 362437;
        this.addend = i;
        return i + t3;
    }

    @Override // kotlin.random.Random
    public int nextBits(int bitCount) {
        return RandomKt.takeUpperBits(nextInt(), bitCount);
    }
}
