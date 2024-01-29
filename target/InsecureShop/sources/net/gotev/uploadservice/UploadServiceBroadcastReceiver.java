package net.gotev.uploadservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import net.gotev.uploadservice.BroadcastData;
/* loaded from: classes.dex */
public class UploadServiceBroadcastReceiver extends BroadcastReceiver implements UploadStatusDelegate {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !UploadService.getActionBroadcast().equals(intent.getAction())) {
            return;
        }
        BroadcastData data = (BroadcastData) intent.getParcelableExtra("broadcastData");
        if (data == null) {
            Logger.error(getClass().getSimpleName(), "Missing intent parameter: broadcastData");
            return;
        }
        int i = C09211.$SwitchMap$net$gotev$uploadservice$BroadcastData$Status[data.getStatus().ordinal()];
        if (i == 1) {
            onError(context, data.getUploadInfo(), data.getException());
        } else if (i == 2) {
            onCompleted(context, data.getUploadInfo(), data.getServerResponse());
        } else if (i == 3) {
            onProgress(context, data.getUploadInfo());
        } else if (i == 4) {
            onCancelled(context, data.getUploadInfo());
        }
    }

    /* renamed from: net.gotev.uploadservice.UploadServiceBroadcastReceiver$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C09211 {
        static final /* synthetic */ int[] $SwitchMap$net$gotev$uploadservice$BroadcastData$Status;

        static {
            int[] iArr = new int[BroadcastData.Status.values().length];
            $SwitchMap$net$gotev$uploadservice$BroadcastData$Status = iArr;
            try {
                iArr[BroadcastData.Status.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$net$gotev$uploadservice$BroadcastData$Status[BroadcastData.Status.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$net$gotev$uploadservice$BroadcastData$Status[BroadcastData.Status.IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$net$gotev$uploadservice$BroadcastData$Status[BroadcastData.Status.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public void register(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(UploadService.getActionBroadcast());
        context.registerReceiver(this, intentFilter);
    }

    public void unregister(Context context) {
        context.unregisterReceiver(this);
    }

    @Override // net.gotev.uploadservice.UploadStatusDelegate
    public void onProgress(Context context, UploadInfo uploadInfo) {
    }

    @Override // net.gotev.uploadservice.UploadStatusDelegate
    public void onError(Context context, UploadInfo uploadInfo, Exception exception) {
    }

    @Override // net.gotev.uploadservice.UploadStatusDelegate
    public void onCompleted(Context context, UploadInfo uploadInfo, ServerResponse serverResponse) {
    }

    @Override // net.gotev.uploadservice.UploadStatusDelegate
    public void onCancelled(Context context, UploadInfo uploadInfo) {
    }
}
