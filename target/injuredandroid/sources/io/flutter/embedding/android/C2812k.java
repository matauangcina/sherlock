package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: io.flutter.embedding.android.k */
/* loaded from: classes.dex */
public final class C2812k {

    /* renamed from: c */
    private static C2812k f6986c;

    /* renamed from: a */
    private final LongSparseArray<MotionEvent> f6987a = new LongSparseArray<>();

    /* renamed from: b */
    private final PriorityQueue<Long> f6988b = new PriorityQueue<>();

    /* renamed from: io.flutter.embedding.android.k$a */
    /* loaded from: classes.dex */
    public static class C2813a {

        /* renamed from: b */
        private static final AtomicLong f6989b = new AtomicLong(0);

        /* renamed from: a */
        private final long f6990a;

        private C2813a(long j) {
            this.f6990a = j;
        }

        /* renamed from: b */
        public static C2813a m621b() {
            return m620c(f6989b.incrementAndGet());
        }

        /* renamed from: c */
        public static C2813a m620c(long j) {
            return new C2813a(j);
        }

        /* renamed from: d */
        public long m619d() {
            return this.f6990a;
        }
    }

    private C2812k() {
    }

    /* renamed from: a */
    public static C2812k m625a() {
        if (f6986c == null) {
            f6986c = new C2812k();
        }
        return f6986c;
    }

    /* renamed from: b */
    public MotionEvent m624b(C2813a c2813a) {
        while (!this.f6988b.isEmpty() && this.f6988b.peek().longValue() < c2813a.f6990a) {
            this.f6987a.remove(this.f6988b.poll().longValue());
        }
        if (!this.f6988b.isEmpty() && this.f6988b.peek().longValue() == c2813a.f6990a) {
            this.f6988b.poll();
        }
        MotionEvent motionEvent = this.f6987a.get(c2813a.f6990a);
        this.f6987a.remove(c2813a.f6990a);
        return motionEvent;
    }

    /* renamed from: c */
    public C2813a m623c(MotionEvent motionEvent) {
        C2813a m621b = C2813a.m621b();
        this.f6987a.put(m621b.f6990a, MotionEvent.obtain(motionEvent));
        this.f6988b.add(Long.valueOf(m621b.f6990a));
        return m621b;
    }
}
