package com.google.android.material.color.utilities;
/* loaded from: classes.dex */
public final class CorePalette {

    /* renamed from: a1 */
    public TonalPalette f145a1;

    /* renamed from: a2 */
    public TonalPalette f146a2;

    /* renamed from: a3 */
    public TonalPalette f147a3;
    public TonalPalette error;

    /* renamed from: n1 */
    public TonalPalette f148n1;

    /* renamed from: n2 */
    public TonalPalette f149n2;

    /* renamed from: of */
    public static CorePalette m121of(int argb) {
        return new CorePalette(argb, false);
    }

    public static CorePalette contentOf(int argb) {
        return new CorePalette(argb, true);
    }

    private CorePalette(int argb, boolean isContent) {
        Hct hct = Hct.fromInt(argb);
        double hue = hct.getHue();
        double chroma = hct.getChroma();
        if (isContent) {
            this.f145a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f146a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f147a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f148n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f149n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f145a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f146a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f147a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f148n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f149n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }
}
