package net.gotev.uploadservice;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class UploadNotificationConfig implements Parcelable {
    public static final Parcelable.Creator<UploadNotificationConfig> CREATOR = new Parcelable.Creator<UploadNotificationConfig>() { // from class: net.gotev.uploadservice.UploadNotificationConfig.1
        @Override // android.os.Parcelable.Creator
        public UploadNotificationConfig createFromParcel(Parcel in) {
            return new UploadNotificationConfig(in);
        }

        @Override // android.os.Parcelable.Creator
        public UploadNotificationConfig[] newArray(int size) {
            return new UploadNotificationConfig[size];
        }
    };
    private boolean autoClearOnCancel;
    private boolean autoClearOnError;
    private boolean autoClearOnSuccess;
    private String cancelled;
    private int cancelledIconColorResourceID;
    private int cancelledIconResourceID;
    private boolean clearOnAction;
    private Intent clickIntent;
    private String completed;
    private int completedIconColorResourceID;
    private int completedIconResourceID;
    private String error;
    private int errorIconColorResourceID;
    private int errorIconResourceID;
    private int iconColorResourceID;
    private int iconResourceID;
    private String inProgress;
    private boolean ringToneEnabled;
    private String title;

    public UploadNotificationConfig() {
        this.iconResourceID = 17301589;
        this.completedIconResourceID = 17301589;
        this.errorIconResourceID = 17301589;
        this.cancelledIconResourceID = 17301589;
        this.iconColorResourceID = 0;
        this.completedIconColorResourceID = 0;
        this.errorIconColorResourceID = 0;
        this.cancelledIconColorResourceID = 0;
        this.title = "File Upload";
        this.inProgress = "Uploading at [[UPLOAD_RATE]] ([[PROGRESS]])";
        this.completed = "Upload completed successfully in [[ELAPSED_TIME]]";
        this.error = "Error during upload";
        this.cancelled = "Upload cancelled";
        this.autoClearOnSuccess = false;
        this.autoClearOnError = false;
        this.autoClearOnCancel = false;
        this.clearOnAction = false;
        this.clickIntent = null;
        this.ringToneEnabled = true;
    }

    public final UploadNotificationConfig setIcon(int resourceID) {
        this.iconResourceID = resourceID;
        return this;
    }

    public final UploadNotificationConfig setCompletedIcon(int resourceID) {
        this.completedIconResourceID = resourceID;
        return this;
    }

    public final UploadNotificationConfig setErrorIcon(int resourceID) {
        this.errorIconResourceID = resourceID;
        return this;
    }

    public final UploadNotificationConfig setCancelledIcon(int resourceID) {
        this.cancelledIconResourceID = resourceID;
        return this;
    }

    public final UploadNotificationConfig setIconColor(int resourceID) {
        this.iconColorResourceID = resourceID;
        return this;
    }

    public final UploadNotificationConfig setCompletedIconColor(int resourceID) {
        this.completedIconColorResourceID = resourceID;
        return this;
    }

    public final UploadNotificationConfig setErrorIconColor(int resourceID) {
        this.errorIconColorResourceID = resourceID;
        return this;
    }

    public final UploadNotificationConfig setCancelledIconColor(int resourceID) {
        this.cancelledIconColorResourceID = resourceID;
        return this;
    }

    public final UploadNotificationConfig setTitle(String title) {
        this.title = title;
        return this;
    }

    public final UploadNotificationConfig setInProgressMessage(String message) {
        this.inProgress = message;
        return this;
    }

    public final UploadNotificationConfig setErrorMessage(String message) {
        this.error = message;
        return this;
    }

    public final UploadNotificationConfig setCompletedMessage(String message) {
        this.completed = message;
        return this;
    }

    public final UploadNotificationConfig setCancelledMessage(String message) {
        this.cancelled = message;
        return this;
    }

    public final UploadNotificationConfig setAutoClearOnSuccess(boolean clear) {
        this.autoClearOnSuccess = clear;
        return this;
    }

    public final UploadNotificationConfig setAutoClearOnError(boolean clear) {
        this.autoClearOnError = clear;
        return this;
    }

    public final UploadNotificationConfig setAutoClearOnCancel(boolean clear) {
        this.autoClearOnCancel = clear;
        return this;
    }

    public final UploadNotificationConfig setClearOnAction(boolean clear) {
        this.clearOnAction = clear;
        return this;
    }

    public final UploadNotificationConfig setClickIntent(Intent clickIntent) {
        this.clickIntent = clickIntent;
        return this;
    }

    public final UploadNotificationConfig setRingToneEnabled(Boolean enabled) {
        this.ringToneEnabled = enabled.booleanValue();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getIconResourceID() {
        return this.iconResourceID;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getCompletedIconResourceID() {
        return this.completedIconResourceID;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getErrorIconResourceID() {
        return this.errorIconResourceID;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getCancelledIconResourceID() {
        return this.cancelledIconResourceID;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getIconColorResourceID() {
        return this.iconColorResourceID;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getCompletedIconColorResourceID() {
        return this.completedIconColorResourceID;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getErrorIconColorResourceID() {
        return this.errorIconColorResourceID;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getCancelledIconColorResourceID() {
        return this.cancelledIconColorResourceID;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String getInProgressMessage() {
        return this.inProgress;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String getCompletedMessage() {
        return this.completed;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String getErrorMessage() {
        return this.error;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String getCancelledMessage() {
        return this.cancelled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean isAutoClearOnSuccess() {
        return this.autoClearOnSuccess;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean isAutoClearOnError() {
        return this.autoClearOnError;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean isAutoClearOnCancel() {
        return this.autoClearOnCancel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean isClearOnAction() {
        return this.clearOnAction;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean isRingToneEnabled() {
        return this.ringToneEnabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PendingIntent getPendingIntent(Context context) {
        Intent intent = this.clickIntent;
        if (intent == null) {
            return PendingIntent.getBroadcast(context, 0, new Intent(), 134217728);
        }
        return PendingIntent.getActivity(context, 1, intent, 134217728);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int arg1) {
        parcel.writeInt(this.iconResourceID);
        parcel.writeInt(this.completedIconResourceID);
        parcel.writeInt(this.errorIconResourceID);
        parcel.writeInt(this.cancelledIconResourceID);
        parcel.writeInt(this.iconColorResourceID);
        parcel.writeInt(this.completedIconColorResourceID);
        parcel.writeInt(this.errorIconColorResourceID);
        parcel.writeInt(this.cancelledIconColorResourceID);
        parcel.writeString(this.title);
        parcel.writeString(this.inProgress);
        parcel.writeString(this.completed);
        parcel.writeString(this.error);
        parcel.writeString(this.cancelled);
        parcel.writeByte(this.autoClearOnSuccess ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.autoClearOnError ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.autoClearOnCancel ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.clearOnAction ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.ringToneEnabled ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.clickIntent, 0);
    }

    private UploadNotificationConfig(Parcel in) {
        this.iconResourceID = in.readInt();
        this.completedIconResourceID = in.readInt();
        this.errorIconResourceID = in.readInt();
        this.cancelledIconResourceID = in.readInt();
        this.iconColorResourceID = in.readInt();
        this.completedIconColorResourceID = in.readInt();
        this.errorIconColorResourceID = in.readInt();
        this.cancelledIconColorResourceID = in.readInt();
        this.title = in.readString();
        this.inProgress = in.readString();
        this.completed = in.readString();
        this.error = in.readString();
        this.cancelled = in.readString();
        this.autoClearOnSuccess = in.readByte() == 1;
        this.autoClearOnError = in.readByte() == 1;
        this.autoClearOnCancel = in.readByte() == 1;
        this.clearOnAction = in.readByte() == 1;
        this.ringToneEnabled = in.readByte() == 1;
        this.clickIntent = (Intent) in.readParcelable(Intent.class.getClassLoader());
    }
}
