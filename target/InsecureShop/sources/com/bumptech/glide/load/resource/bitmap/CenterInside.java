package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public class CenterInside extends BitmapTransformation {

    /* renamed from: ID */
    private static final String f60ID = "com.bumptech.glide.load.resource.bitmap.CenterInside";
    private static final byte[] ID_BYTES = f60ID.getBytes(CHARSET);

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
        return TransformationUtils.centerInside(pool, toTransform, outWidth, outHeight);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object o) {
        return o instanceof CenterInside;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return f60ID.hashCode();
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }
}
