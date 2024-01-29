package net.gotev.uploadservice;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class BroadcastData implements Parcelable {
    public static final Parcelable.Creator<BroadcastData> CREATOR = new Parcelable.Creator<BroadcastData>() { // from class: net.gotev.uploadservice.BroadcastData.1
        @Override // android.os.Parcelable.Creator
        public BroadcastData createFromParcel(Parcel in) {
            return new BroadcastData(in);
        }

        @Override // android.os.Parcelable.Creator
        public BroadcastData[] newArray(int size) {
            return new BroadcastData[size];
        }
    };
    private Exception exception;
    private ServerResponse serverResponse;
    private Status status;
    private UploadInfo uploadInfo;

    /* loaded from: classes.dex */
    public enum Status {
        IN_PROGRESS,
        ERROR,
        COMPLETED,
        CANCELLED
    }

    public BroadcastData() {
    }

    public Intent getIntent() {
        Intent intent = new Intent(UploadService.getActionBroadcast());
        intent.putExtra("broadcastData", this);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(this.status.ordinal());
        parcel.writeSerializable(this.exception);
        parcel.writeParcelable(this.uploadInfo, flags);
        parcel.writeParcelable(this.serverResponse, flags);
    }

    private BroadcastData(Parcel in) {
        this.status = Status.values()[in.readInt()];
        this.exception = (Exception) in.readSerializable();
        this.uploadInfo = (UploadInfo) in.readParcelable(UploadInfo.class.getClassLoader());
        this.serverResponse = (ServerResponse) in.readParcelable(ServerResponse.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Status getStatus() {
        Status status = this.status;
        if (status == null) {
            String simpleName = getClass().getSimpleName();
            Logger.error(simpleName, "Status not defined! Returning " + Status.CANCELLED);
            return Status.CANCELLED;
        }
        return status;
    }

    public BroadcastData setStatus(Status status) {
        this.status = status;
        return this;
    }

    public Exception getException() {
        return this.exception;
    }

    public BroadcastData setException(Exception exception) {
        this.exception = exception;
        return this;
    }

    public UploadInfo getUploadInfo() {
        return this.uploadInfo;
    }

    public BroadcastData setUploadInfo(UploadInfo uploadInfo) {
        this.uploadInfo = uploadInfo;
        return this;
    }

    public ServerResponse getServerResponse() {
        return this.serverResponse;
    }

    public BroadcastData setServerResponse(ServerResponse serverResponse) {
        this.serverResponse = serverResponse;
        return this;
    }
}
