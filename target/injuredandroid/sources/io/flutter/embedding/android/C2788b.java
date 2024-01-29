package io.flutter.embedding.android;

import android.graphics.Matrix;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import io.flutter.embedding.engine.renderer.C2919a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: io.flutter.embedding.android.b */
/* loaded from: classes.dex */
public class C2788b {

    /* renamed from: d */
    private static final Matrix f6912d = new Matrix();

    /* renamed from: a */
    private final C2919a f6913a;

    /* renamed from: b */
    private final C2812k f6914b = C2812k.m625a();

    /* renamed from: c */
    private final boolean f6915c;

    public C2788b(C2919a c2919a, boolean z) {
        this.f6913a = c2919a;
        this.f6915c = z;
    }

    /* renamed from: a */
    private void m734a(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer) {
        float[] fArr;
        long j;
        double d;
        double d2;
        double d3;
        InputDevice.MotionRange motionRange;
        if (i2 == -1) {
            return;
        }
        long m619d = this.f6915c ? this.f6914b.m623c(motionEvent).m619d() : 0L;
        int m732c = m732c(motionEvent.getToolType(i));
        int i4 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        byteBuffer.putLong(m619d);
        byteBuffer.putLong(motionEvent.getEventTime() * 1000);
        byteBuffer.putLong(i2);
        byteBuffer.putLong(m732c);
        byteBuffer.putLong(i4);
        byteBuffer.putLong(motionEvent.getPointerId(i));
        byteBuffer.putLong(0L);
        matrix.mapPoints(new float[]{motionEvent.getX(i), motionEvent.getY(i)});
        byteBuffer.putDouble(fArr[0]);
        byteBuffer.putDouble(fArr[1]);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        if (m732c == 1) {
            j = motionEvent.getButtonState() & 31;
            if (j == 0 && motionEvent.getSource() == 8194 && (i2 == 4 || i2 == 5)) {
                j = 1;
            }
        } else {
            j = m732c == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        byteBuffer.putLong(j);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i));
        double d4 = 1.0d;
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d = 0.0d;
        } else {
            double min = motionRange.getMin();
            d4 = motionRange.getMax();
            d = min;
        }
        byteBuffer.putDouble(d);
        byteBuffer.putDouble(d4);
        if (m732c == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i));
            d2 = 0.0d;
        } else {
            d2 = 0.0d;
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(motionEvent.getSize(i));
        byteBuffer.putDouble(motionEvent.getToolMajor(i));
        byteBuffer.putDouble(motionEvent.getToolMinor(i));
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i));
        if (m732c == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i));
        } else {
            byteBuffer.putDouble(d2);
        }
        byteBuffer.putLong(i3);
        if (i4 == 1) {
            byteBuffer.putDouble(-motionEvent.getAxisValue(10));
            d3 = -motionEvent.getAxisValue(9);
        } else {
            d3 = 0.0d;
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d3);
    }

    /* renamed from: b */
    private int m733b(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 5) {
            return 4;
        }
        if (i == 6) {
            return 6;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 7) {
            return 3;
        }
        if (i == 3) {
            return 0;
        }
        return i == 8 ? 3 : -1;
    }

    /* renamed from: c */
    private int m732c(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? 4 : 3;
                }
                return 1;
            }
            return 2;
        }
        return 0;
    }

    /* renamed from: d */
    public boolean m731d(MotionEvent motionEvent) {
        boolean z = Build.VERSION.SDK_INT >= 18 && motionEvent.isFromSource(2);
        boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (z && z2) {
            int m733b = m733b(motionEvent.getActionMasked());
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 29 * 8);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            m734a(motionEvent, motionEvent.getActionIndex(), m733b, 0, f6912d, allocateDirect);
            if (allocateDirect.position() % 232 == 0) {
                this.f6913a.m382g(allocateDirect, allocateDirect.position());
                return true;
            }
            throw new AssertionError("Packet position is not on field boundary.");
        }
        return false;
    }

    /* renamed from: e */
    public boolean m730e(MotionEvent motionEvent) {
        return m729f(motionEvent, f6912d);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m729f(android.view.MotionEvent r13, android.graphics.Matrix r14) {
        /*
            r12 = this;
            int r0 = r13.getPointerCount()
            int r1 = r0 * 29
            int r1 = r1 * 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order(r2)
            int r2 = r13.getActionMasked()
            int r3 = r13.getActionMasked()
            int r9 = r12.m733b(r3)
            r3 = 0
            r10 = 1
            if (r2 == 0) goto L27
            r4 = 5
            if (r2 != r4) goto L25
            goto L27
        L25:
            r4 = 0
            goto L28
        L27:
            r4 = 1
        L28:
            if (r4 != 0) goto L31
            if (r2 == r10) goto L2f
            r5 = 6
            if (r2 != r5) goto L31
        L2f:
            r2 = 1
            goto L32
        L31:
            r2 = 0
        L32:
            if (r4 == 0) goto L42
        L34:
            int r4 = r13.getActionIndex()
            r6 = 0
            r2 = r12
            r3 = r13
            r5 = r9
            r7 = r14
            r8 = r1
            r2.m734a(r3, r4, r5, r6, r7, r8)
            goto L6f
        L42:
            r11 = 0
            if (r2 == 0) goto L60
        L45:
            if (r11 >= r0) goto L34
            int r2 = r13.getActionIndex()
            if (r11 == r2) goto L5d
            int r2 = r13.getToolType(r11)
            if (r2 != r10) goto L5d
            r5 = 5
            r6 = 1
            r2 = r12
            r3 = r13
            r4 = r11
            r7 = r14
            r8 = r1
            r2.m734a(r3, r4, r5, r6, r7, r8)
        L5d:
            int r11 = r11 + 1
            goto L45
        L60:
            if (r11 >= r0) goto L6f
            r6 = 0
            r2 = r12
            r3 = r13
            r4 = r11
            r5 = r9
            r7 = r14
            r8 = r1
            r2.m734a(r3, r4, r5, r6, r7, r8)
            int r11 = r11 + 1
            goto L60
        L6f:
            int r13 = r1.position()
            int r13 = r13 % 232
            if (r13 != 0) goto L81
            io.flutter.embedding.engine.renderer.a r13 = r12.f6913a
            int r14 = r1.position()
            r13.m382g(r1, r14)
            return r10
        L81:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            java.lang.String r14 = "Packet position is not on field boundary"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.C2788b.m729f(android.view.MotionEvent, android.graphics.Matrix):boolean");
    }
}
