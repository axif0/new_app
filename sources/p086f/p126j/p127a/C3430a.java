package p086f.p126j.p127a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f.j.a.a */
public abstract class C3430a implements Parcelable {
    public static final Parcelable.Creator<C3430a> CREATOR = new C3432b();

    /* renamed from: g */
    public static final C3430a f10749g = new C3431a();

    /* renamed from: f */
    private final Parcelable f10750f;

    /* renamed from: f.j.a.a$a */
    static class C3431a extends C3430a {
        C3431a() {
            super((C3431a) null);
        }
    }

    /* renamed from: f.j.a.a$b */
    static class C3432b implements Parcelable.ClassLoaderCreator<C3430a> {
        C3432b() {
        }

        /* renamed from: a */
        public C3430a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public C3430a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C3430a.f10749g;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public C3430a[] newArray(int i) {
            return new C3430a[i];
        }
    }

    private C3430a() {
        this.f10750f = null;
    }

    protected C3430a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f10750f = readParcelable == null ? f10749g : readParcelable;
    }

    protected C3430a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f10750f = parcelable == f10749g ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ C3430a(C3431a aVar) {
        this();
    }

    /* renamed from: a */
    public final Parcelable mo11760a() {
        return this.f10750f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10750f, i);
    }
}
