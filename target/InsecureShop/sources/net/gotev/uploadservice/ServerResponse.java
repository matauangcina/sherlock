package net.gotev.uploadservice;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public class ServerResponse implements Parcelable {
    public static final Parcelable.Creator<ServerResponse> CREATOR = new Parcelable.Creator<ServerResponse>() { // from class: net.gotev.uploadservice.ServerResponse.1
        @Override // android.os.Parcelable.Creator
        public ServerResponse createFromParcel(Parcel in) {
            return new ServerResponse(in);
        }

        @Override // android.os.Parcelable.Creator
        public ServerResponse[] newArray(int size) {
            return new ServerResponse[size];
        }
    };
    private byte[] body;
    private LinkedHashMap<String, String> headers;
    private int httpCode;

    public ServerResponse(int httpCode, byte[] body, LinkedHashMap<String, String> headers) {
        this.httpCode = httpCode;
        if (body != null && body.length > 0) {
            this.body = body;
        } else {
            this.body = new byte[1];
        }
        if (headers != null && !headers.isEmpty()) {
            this.headers = headers;
        } else {
            this.headers = new LinkedHashMap<>(1);
        }
    }

    protected ServerResponse(Parcel in) {
        this.httpCode = in.readInt();
        byte[] bArr = new byte[in.readInt()];
        this.body = bArr;
        in.readByteArray(bArr);
        this.headers = (LinkedHashMap) in.readSerializable();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(this.httpCode);
        parcel.writeInt(this.body.length);
        parcel.writeByteArray(this.body);
        parcel.writeSerializable(this.headers);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getHttpCode() {
        return this.httpCode;
    }

    public byte[] getBody() {
        return this.body;
    }

    public String getBodyAsString() {
        return new String(this.body);
    }

    public LinkedHashMap<String, String> getHeaders() {
        return this.headers;
    }
}
