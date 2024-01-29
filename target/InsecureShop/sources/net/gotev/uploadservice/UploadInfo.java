package net.gotev.uploadservice;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class UploadInfo implements Parcelable {
    public static final Parcelable.Creator<UploadInfo> CREATOR = new Parcelable.Creator<UploadInfo>() { // from class: net.gotev.uploadservice.UploadInfo.1
        @Override // android.os.Parcelable.Creator
        public UploadInfo createFromParcel(Parcel in) {
            return new UploadInfo(in);
        }

        @Override // android.os.Parcelable.Creator
        public UploadInfo[] newArray(int size) {
            return new UploadInfo[size];
        }
    };
    private long currentTime;
    private int numberOfRetries;
    private long startTime;
    private ArrayList<String> successfullyUploadedFiles;
    private long totalBytes;
    private int totalFiles;
    private String uploadId;
    private long uploadedBytes;

    /* JADX INFO: Access modifiers changed from: protected */
    public UploadInfo(String uploadId) {
        this.successfullyUploadedFiles = new ArrayList<>();
        this.uploadId = uploadId;
        this.startTime = 0L;
        this.currentTime = 0L;
        this.uploadedBytes = 0L;
        this.totalBytes = 0L;
        this.numberOfRetries = 0;
        this.totalFiles = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public UploadInfo(String uploadId, long startTime, long uploadedBytes, long totalBytes, int numberOfRetries, List<String> uploadedFiles, int totalFiles) {
        this.successfullyUploadedFiles = new ArrayList<>();
        this.uploadId = uploadId;
        this.startTime = startTime;
        this.currentTime = new Date().getTime();
        this.uploadedBytes = uploadedBytes;
        this.totalBytes = totalBytes;
        this.numberOfRetries = numberOfRetries;
        this.totalFiles = totalFiles;
        if (uploadedFiles != null && !uploadedFiles.isEmpty()) {
            this.successfullyUploadedFiles.addAll(uploadedFiles);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int arg1) {
        parcel.writeString(this.uploadId);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.currentTime);
        parcel.writeLong(this.uploadedBytes);
        parcel.writeLong(this.totalBytes);
        parcel.writeInt(this.numberOfRetries);
        parcel.writeInt(this.totalFiles);
        parcel.writeStringList(this.successfullyUploadedFiles);
    }

    private UploadInfo(Parcel in) {
        this.successfullyUploadedFiles = new ArrayList<>();
        this.uploadId = in.readString();
        this.startTime = in.readLong();
        this.currentTime = in.readLong();
        this.uploadedBytes = in.readLong();
        this.totalBytes = in.readLong();
        this.numberOfRetries = in.readInt();
        this.totalFiles = in.readInt();
        in.readStringList(this.successfullyUploadedFiles);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getUploadId() {
        return this.uploadId;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getElapsedTime() {
        return this.currentTime - this.startTime;
    }

    public String getElapsedTimeString() {
        int elapsedSeconds = (int) (getElapsedTime() / 1000);
        if (elapsedSeconds == 0) {
            return "0s";
        }
        int minutes = elapsedSeconds / 60;
        int elapsedSeconds2 = elapsedSeconds - (minutes * 60);
        if (minutes == 0) {
            return elapsedSeconds2 + "s";
        }
        return minutes + "m " + elapsedSeconds2 + "s";
    }

    public double getUploadRate() {
        long elapsedTime = getElapsedTime();
        if (elapsedTime < 1000) {
            return 0.0d;
        }
        double d = this.uploadedBytes;
        Double.isNaN(d);
        double d2 = elapsedTime / 1000;
        Double.isNaN(d2);
        return ((d / 1024.0d) * 8.0d) / d2;
    }

    public String getUploadRateString() {
        double uploadRate = getUploadRate();
        if (uploadRate < 1.0d) {
            return ((int) (1000.0d * uploadRate)) + " bit/s";
        } else if (uploadRate >= 1024.0d) {
            return ((int) (uploadRate / 1024.0d)) + " Mbit/s";
        } else {
            return ((int) uploadRate) + " Kbit/s";
        }
    }

    public ArrayList<String> getSuccessfullyUploadedFiles() {
        return this.successfullyUploadedFiles;
    }

    public long getUploadedBytes() {
        return this.uploadedBytes;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public int getProgressPercent() {
        long j = this.totalBytes;
        if (j == 0) {
            return 0;
        }
        return (int) ((this.uploadedBytes * 100) / j);
    }

    public int getNumberOfRetries() {
        return this.numberOfRetries;
    }

    public int getTotalFiles() {
        return this.totalFiles;
    }
}
