package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;
@Keep
/* loaded from: classes.dex */
public class FlutterOverlaySurface {

    /* renamed from: id */
    private final int f6998id;
    private final Surface surface;

    public FlutterOverlaySurface(int i, Surface surface) {
        this.f6998id = i;
        this.surface = surface;
    }

    public int getId() {
        return this.f6998id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
