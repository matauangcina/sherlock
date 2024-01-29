package p000a.p032i.p033a;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: a.i.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0280a implements Parcelable {

    /* renamed from: f */
    private final Parcelable f772f;

    /* renamed from: g */
    public static final AbstractC0280a f771g = new C0281a();
    public static final Parcelable.Creator<AbstractC0280a> CREATOR = new C0282b();

    /* renamed from: a.i.a.a$a */
    /* loaded from: classes.dex */
    class C0281a extends AbstractC0280a {
        C0281a() {
            super((C0281a) null);
        }
    }

    /* renamed from: a.i.a.a$b */
    /* loaded from: classes.dex */
    class C0282b implements Parcelable.ClassLoaderCreator<AbstractC0280a> {
        C0282b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AbstractC0280a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public AbstractC0280a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC0280a.f771g;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public AbstractC0280a[] newArray(int i) {
            return new AbstractC0280a[i];
        }
    }

    private AbstractC0280a() {
        this.f772f = null;
    }

    /* synthetic */ AbstractC0280a(C0281a c0281a) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0280a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f772f = readParcelable == null ? f771g : readParcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0280a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f772f = parcelable == f771g ? null : parcelable;
    }

    /* renamed from: a */
    public final Parcelable m8522a() {
        return this.f772f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f772f, i);
    }
}
