package net.gotev.uploadservice;

import android.content.Context;
/* loaded from: classes.dex */
public interface UploadStatusDelegate {
    void onCancelled(Context context, UploadInfo uploadInfo);

    void onCompleted(Context context, UploadInfo uploadInfo, ServerResponse serverResponse);

    void onError(Context context, UploadInfo uploadInfo, Exception exc);

    void onProgress(Context context, UploadInfo uploadInfo);
}
