package p135d.p141r;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p135d.p142s.p144d.C2725g;
import p135d.p147v.InterfaceC2749b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.r.b */
/* loaded from: classes.dex */
public final class C2690b implements InterfaceC2749b<String> {

    /* renamed from: a */
    private final BufferedReader f6835a;

    /* renamed from: d.r.b$a */
    /* loaded from: classes.dex */
    public static final class C2691a implements Iterator<String> {

        /* renamed from: f */
        private String f6836f;

        /* renamed from: g */
        private boolean f6837g;

        C2691a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.f6836f;
                this.f6836f = null;
                C2725g.m883c(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6836f == null && !this.f6837g) {
                String readLine = C2690b.this.f6835a.readLine();
                this.f6836f = readLine;
                if (readLine == null) {
                    this.f6837g = true;
                }
            }
            return this.f6836f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2690b(BufferedReader bufferedReader) {
        C2725g.m881e(bufferedReader, "reader");
        this.f6835a = bufferedReader;
    }

    @Override // p135d.p147v.InterfaceC2749b
    public Iterator<String> iterator() {
        return new C2691a();
    }
}
