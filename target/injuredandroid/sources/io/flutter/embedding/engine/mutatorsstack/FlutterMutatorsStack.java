package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FlutterMutatorsStack {
    private List<C2916a> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$a */
    /* loaded from: classes.dex */
    public class C2916a {

        /* renamed from: a */
        private Matrix f7250a;

        public C2916a(FlutterMutatorsStack flutterMutatorsStack, Matrix matrix) {
            EnumC2917b enumC2917b = EnumC2917b.TRANSFORM;
            this.f7250a = matrix;
        }

        public C2916a(FlutterMutatorsStack flutterMutatorsStack, Rect rect) {
            EnumC2917b enumC2917b = EnumC2917b.CLIP_RECT;
        }

        public C2916a(FlutterMutatorsStack flutterMutatorsStack, Rect rect, float[] fArr) {
            EnumC2917b enumC2917b = EnumC2917b.CLIP_RRECT;
        }

        /* renamed from: a */
        public Matrix m389a() {
            return this.f7250a;
        }
    }

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$b */
    /* loaded from: classes.dex */
    public enum EnumC2917b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<C2916a> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int i, int i2, int i3, int i4, float[] fArr) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.mutators.add(new C2916a(this, rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i, int i2, int i3, int i4) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.mutators.add(new C2916a(this, rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        C2916a c2916a = new C2916a(this, matrix);
        this.mutators.add(c2916a);
        this.finalMatrix.preConcat(c2916a.m389a());
    }
}
