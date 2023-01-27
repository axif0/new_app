package p148g.p189d.p190a.p252d.p255c0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p086f.p102e.C3203g;
import p086f.p126j.p127a.C3430a;

/* renamed from: g.d.a.d.c0.a */
public class C4996a extends C3430a {
    public static final Parcelable.Creator<C4996a> CREATOR = new C4997a();

    /* renamed from: h */
    public final C3203g<String, Bundle> f14926h;

    /* renamed from: g.d.a.d.c0.a$a */
    static class C4997a implements Parcelable.ClassLoaderCreator<C4996a> {
        C4997a() {
        }

        /* renamed from: a */
        public C4996a createFromParcel(Parcel parcel) {
            return new C4996a(parcel, (ClassLoader) null, (C4997a) null);
        }

        /* renamed from: b */
        public C4996a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C4996a(parcel, classLoader, (C4997a) null);
        }

        /* renamed from: c */
        public C4996a[] newArray(int i) {
            return new C4996a[i];
        }
    }

    private C4996a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f14926h = new C3203g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f14926h.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ C4996a(Parcel parcel, ClassLoader classLoader, C4997a aVar) {
        this(parcel, classLoader);
    }

    public C4996a(Parcelable parcelable) {
        super(parcelable);
        this.f14926h = new C3203g<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f14926h + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f14926h.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f14926h.mo11139i(i2);
            bundleArr[i2] = this.f14926h.mo11141m(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
