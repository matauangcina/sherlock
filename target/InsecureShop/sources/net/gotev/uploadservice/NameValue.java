package net.gotev.uploadservice;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class NameValue implements Parcelable {
    public static final Parcelable.Creator<NameValue> CREATOR = new Parcelable.Creator<NameValue>() { // from class: net.gotev.uploadservice.NameValue.1
        @Override // android.os.Parcelable.Creator
        public NameValue createFromParcel(Parcel in) {
            return new NameValue(in);
        }

        @Override // android.os.Parcelable.Creator
        public NameValue[] newArray(int size) {
            return new NameValue[size];
        }
    };
    private final String name;
    private final String value;

    public NameValue(String name, String value, boolean asciiOnly) {
        if (asciiOnly && (!isAllASCII(name) || !isAllASCII(value))) {
            throw new IllegalArgumentException("Header " + name + " must be ASCII only! Read http://stackoverflow.com/a/4410331");
        }
        this.name = name;
        this.value = value;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object object) {
        if (object instanceof NameValue) {
            NameValue other = (NameValue) object;
            boolean areEqual = this.name.equals(other.name) && this.value.equals(other.value);
            return areEqual;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int arg1) {
        parcel.writeString(this.name);
        parcel.writeString(this.value);
    }

    private NameValue(Parcel in) {
        this.name = in.readString();
        this.value = in.readString();
    }

    private static boolean isAllASCII(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            int c = input.charAt(i);
            if (c > 127) {
                return false;
            }
        }
        return true;
    }
}
