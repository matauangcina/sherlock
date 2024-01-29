package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public class FitCenter extends BitmapTransformation {

    /* renamed from: ID */
    private static final String f63ID = "com.bumptech.glide.load.resource.bitmap.FitCenter";
    private static final byte[] ID_BYTES = f63ID.getBytes(CHARSET);

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
        return TransformationUtils.fitCenter(pool, toTransform, outWidth, outHeight);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object o) {
        return o instanceof FitCenter;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return f63ID.hashCode();
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }
}
