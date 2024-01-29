package net.gotev.uploadservice;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import net.gotev.uploadservice.schemehandlers.SchemeHandler;
import net.gotev.uploadservice.schemehandlers.SchemeHandlerFactory;
/* loaded from: classes.dex */
public class UploadFile implements Parcelable {
    public static final Parcelable.Creator<UploadFile> CREATOR = new Parcelable.Creator<UploadFile>() { // from class: net.gotev.uploadservice.UploadFile.1
        @Override // android.os.Parcelable.Creator
        public UploadFile createFromParcel(Parcel in) {
            return new UploadFile(in);
        }

        @Override // android.os.Parcelable.Creator
        public UploadFile[] newArray(int size) {
            return new UploadFile[size];
        }
    };
    protected final SchemeHandler handler;
    protected final String path;
    private LinkedHashMap<String, String> properties;

    public UploadFile(String path) throws FileNotFoundException {
        this.properties = new LinkedHashMap<>();
        if (path == null || "".equals(path)) {
            throw new IllegalArgumentException("Please specify a file path!");
        }
        if (!SchemeHandlerFactory.getInstance().isSupported(path)) {
            throw new UnsupportedOperationException("Unsupported scheme: " + path);
        }
        this.path = path;
        try {
            this.handler = SchemeHandlerFactory.getInstance().get(path);
        } catch (Exception exc) {
            throw new RuntimeException(exc);
        }
    }

    public long length(Context context) {
        return this.handler.getLength(context);
    }

    public final InputStream getStream(Context context) throws FileNotFoundException {
        return this.handler.getInputStream(context);
    }

    public final String getContentType(Context context) {
        return this.handler.getContentType(context);
    }

    public final String getName(Context context) {
        return this.handler.getName(context);
    }

    public final String getPath() {
        return this.path;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int arg1) {
        parcel.writeString(this.path);
        parcel.writeSerializable(this.properties);
    }

    private UploadFile(Parcel in) {
        this.properties = new LinkedHashMap<>();
        this.path = in.readString();
        this.properties = (LinkedHashMap) in.readSerializable();
        try {
            this.handler = SchemeHandlerFactory.getInstance().get(this.path);
        } catch (Exception exc) {
            throw new RuntimeException(exc);
        }
    }

    public void setProperty(String key, String value) {
        this.properties.put(key, value);
    }

    public String getProperty(String key) {
        return this.properties.get(key);
    }

    public String getProperty(String key, String defaultValue) {
        String val = this.properties.get(key);
        if (val == null) {
            return defaultValue;
        }
        return val;
    }
}
