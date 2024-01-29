package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p000a.p014d.C0066a;
/* renamed from: androidx.versionedparcelable.b */
/* loaded from: classes.dex */
class C1072b extends AbstractC1071a {

    /* renamed from: d */
    private final SparseIntArray f3703d;

    /* renamed from: e */
    private final Parcel f3704e;

    /* renamed from: f */
    private final int f3705f;

    /* renamed from: g */
    private final int f3706g;

    /* renamed from: h */
    private final String f3707h;

    /* renamed from: i */
    private int f3708i;

    /* renamed from: j */
    private int f3709j;

    /* renamed from: k */
    private int f3710k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1072b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0066a(), new C0066a(), new C0066a());
    }

    private C1072b(Parcel parcel, int i, int i2, String str, C0066a<String, Method> c0066a, C0066a<String, Method> c0066a2, C0066a<String, Class> c0066a3) {
        super(c0066a, c0066a2, c0066a3);
        this.f3703d = new SparseIntArray();
        this.f3708i = -1;
        this.f3709j = 0;
        this.f3710k = -1;
        this.f3704e = parcel;
        this.f3705f = i;
        this.f3706g = i2;
        this.f3709j = i;
        this.f3707h = str;
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: A */
    public void mo5023A(byte[] bArr) {
        if (bArr == null) {
            this.f3704e.writeInt(-1);
            return;
        }
        this.f3704e.writeInt(bArr.length);
        this.f3704e.writeByteArray(bArr);
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: C */
    protected void mo5022C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3704e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: E */
    public void mo5021E(int i) {
        this.f3704e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: G */
    public void mo5020G(Parcelable parcelable) {
        this.f3704e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: I */
    public void mo5019I(String str) {
        this.f3704e.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: a */
    public void mo5018a() {
        int i = this.f3708i;
        if (i >= 0) {
            int i2 = this.f3703d.get(i);
            int dataPosition = this.f3704e.dataPosition();
            this.f3704e.setDataPosition(i2);
            this.f3704e.writeInt(dataPosition - i2);
            this.f3704e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: b */
    protected AbstractC1071a mo5017b() {
        Parcel parcel = this.f3704e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3709j;
        if (i == this.f3705f) {
            i = this.f3706g;
        }
        int i2 = i;
        return new C1072b(parcel, dataPosition, i2, this.f3707h + "  ", this.f3700a, this.f3701b, this.f3702c);
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: g */
    public boolean mo5016g() {
        return this.f3704e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: i */
    public byte[] mo5015i() {
        int readInt = this.f3704e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3704e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: k */
    protected CharSequence mo5014k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3704e);
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: m */
    public boolean mo5013m(int i) {
        while (this.f3709j < this.f3706g) {
            int i2 = this.f3710k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f3704e.setDataPosition(this.f3709j);
            int readInt = this.f3704e.readInt();
            this.f3710k = this.f3704e.readInt();
            this.f3709j += readInt;
        }
        return this.f3710k == i;
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: o */
    public int mo5012o() {
        return this.f3704e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: q */
    public <T extends Parcelable> T mo5011q() {
        return (T) this.f3704e.readParcelable(C1072b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: s */
    public String mo5010s() {
        return this.f3704e.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: w */
    public void mo5009w(int i) {
        mo5018a();
        this.f3708i = i;
        this.f3703d.put(i, this.f3704e.dataPosition());
        mo5021E(0);
        mo5021E(i);
    }

    @Override // androidx.versionedparcelable.AbstractC1071a
    /* renamed from: y */
    public void mo5008y(boolean z) {
        this.f3704e.writeInt(z ? 1 : 0);
    }
}
