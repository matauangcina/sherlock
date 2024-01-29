package net.gotev.uploadservice;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class HttpUploadTaskParameters implements Parcelable {
    public static final Parcelable.Creator<HttpUploadTaskParameters> CREATOR = new Parcelable.Creator<HttpUploadTaskParameters>() { // from class: net.gotev.uploadservice.HttpUploadTaskParameters.1
        @Override // android.os.Parcelable.Creator
        public HttpUploadTaskParameters createFromParcel(Parcel in) {
            return new HttpUploadTaskParameters(in);
        }

        @Override // android.os.Parcelable.Creator
        public HttpUploadTaskParameters[] newArray(int size) {
            return new HttpUploadTaskParameters[size];
        }
    };
    protected static final String PARAM_HTTP_TASK_PARAMETERS = "httpTaskParameters";
    private String customUserAgent;
    private String method;
    private ArrayList<NameValue> requestHeaders;
    private ArrayList<NameValue> requestParameters;
    private boolean usesFixedLengthStreamingMode;

    public HttpUploadTaskParameters() {
        this.method = "POST";
        this.usesFixedLengthStreamingMode = true;
        this.requestHeaders = new ArrayList<>();
        this.requestParameters = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int arg1) {
        parcel.writeString(this.method);
        parcel.writeString(this.customUserAgent);
        parcel.writeByte(this.usesFixedLengthStreamingMode ? (byte) 1 : (byte) 0);
        parcel.writeList(this.requestHeaders);
        parcel.writeList(this.requestParameters);
    }

    private HttpUploadTaskParameters(Parcel in) {
        this.method = "POST";
        this.usesFixedLengthStreamingMode = true;
        this.requestHeaders = new ArrayList<>();
        this.requestParameters = new ArrayList<>();
        this.method = in.readString();
        this.customUserAgent = in.readString();
        this.usesFixedLengthStreamingMode = in.readByte() == 1;
        in.readList(this.requestHeaders, NameValue.class.getClassLoader());
        in.readList(this.requestParameters, NameValue.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void addRequestHeader(String name, String value) {
        this.requestHeaders.add(new NameValue(name, value, true));
    }

    public void addRequestParameter(String name, String value) {
        this.requestParameters.add(new NameValue(name, value, false));
    }

    public List<NameValue> getRequestHeaders() {
        return this.requestHeaders;
    }

    public List<NameValue> getRequestParameters() {
        return this.requestParameters;
    }

    public String getMethod() {
        return this.method;
    }

    public HttpUploadTaskParameters setMethod(String method) {
        if (method != null && method.length() > 0) {
            this.method = method;
        }
        return this;
    }

    public boolean isUsesFixedLengthStreamingMode() {
        return this.usesFixedLengthStreamingMode;
    }

    public HttpUploadTaskParameters setUsesFixedLengthStreamingMode(boolean usesFixedLengthStreamingMode) {
        this.usesFixedLengthStreamingMode = usesFixedLengthStreamingMode;
        return this;
    }

    public String getCustomUserAgent() {
        return this.customUserAgent;
    }

    public boolean isCustomUserAgentDefined() {
        String str = this.customUserAgent;
        return (str == null || "".equals(str)) ? false : true;
    }

    public HttpUploadTaskParameters setCustomUserAgent(String customUserAgent) {
        this.customUserAgent = customUserAgent;
        return this;
    }
}
