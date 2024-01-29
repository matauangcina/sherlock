package net.gotev.uploadservice;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class UploadTaskParameters implements Parcelable {
    public static final Parcelable.Creator<UploadTaskParameters> CREATOR = new Parcelable.Creator<UploadTaskParameters>() { // from class: net.gotev.uploadservice.UploadTaskParameters.1
        @Override // android.os.Parcelable.Creator
        public UploadTaskParameters createFromParcel(Parcel in) {
            return new UploadTaskParameters(in);
        }

        @Override // android.os.Parcelable.Creator
        public UploadTaskParameters[] newArray(int size) {
            return new UploadTaskParameters[size];
        }
    };
    private boolean autoDeleteSuccessfullyUploadedFiles;
    private ArrayList<UploadFile> files;

    /* renamed from: id */
    private String f128id;
    private int maxRetries;
    private UploadNotificationConfig notificationConfig;
    private String serverUrl;

    public UploadTaskParameters() {
        this.maxRetries = 0;
        this.autoDeleteSuccessfullyUploadedFiles = false;
        this.files = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int arg1) {
        parcel.writeString(this.f128id);
        parcel.writeString(this.serverUrl);
        parcel.writeInt(this.maxRetries);
        parcel.writeByte(this.autoDeleteSuccessfullyUploadedFiles ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.notificationConfig, 0);
        parcel.writeList(this.files);
    }

    private UploadTaskParameters(Parcel in) {
        this.maxRetries = 0;
        this.autoDeleteSuccessfullyUploadedFiles = false;
        this.files = new ArrayList<>();
        this.f128id = in.readString();
        this.serverUrl = in.readString();
        this.maxRetries = in.readInt();
        this.autoDeleteSuccessfullyUploadedFiles = in.readByte() == 1;
        this.notificationConfig = (UploadNotificationConfig) in.readParcelable(UploadNotificationConfig.class.getClassLoader());
        in.readList(this.files, UploadFile.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void addFile(UploadFile file) throws FileNotFoundException {
        this.files.add(file);
    }

    public List<UploadFile> getFiles() {
        return this.files;
    }

    public UploadNotificationConfig getNotificationConfig() {
        return this.notificationConfig;
    }

    public UploadTaskParameters setNotificationConfig(UploadNotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
        return this;
    }

    public String getId() {
        return this.f128id;
    }

    public UploadTaskParameters setId(String id) {
        this.f128id = id;
        return this;
    }

    public String getServerUrl() {
        return this.serverUrl;
    }

    public UploadTaskParameters setServerUrl(String url) {
        this.serverUrl = url;
        return this;
    }

    public int getMaxRetries() {
        return this.maxRetries;
    }

    public UploadTaskParameters setMaxRetries(int maxRetries) {
        if (maxRetries < 0) {
            this.maxRetries = 0;
        } else {
            this.maxRetries = maxRetries;
        }
        return this;
    }

    public boolean isAutoDeleteSuccessfullyUploadedFiles() {
        return this.autoDeleteSuccessfullyUploadedFiles;
    }

    public UploadTaskParameters setAutoDeleteSuccessfullyUploadedFiles(boolean autoDeleteSuccessfullyUploadedFiles) {
        this.autoDeleteSuccessfullyUploadedFiles = autoDeleteSuccessfullyUploadedFiles;
        return this;
    }
}
