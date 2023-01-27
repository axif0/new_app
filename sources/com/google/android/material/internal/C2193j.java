package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: com.google.android.material.internal.j */
public class C2193j extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<C2193j> CREATOR = new C2194a();

    /* renamed from: com.google.android.material.internal.j$a */
    static class C2194a implements Parcelable.ClassLoaderCreator<C2193j> {
        C2194a() {
        }

        /* renamed from: a */
        public C2193j createFromParcel(Parcel parcel) {
            return new C2193j(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public C2193j createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C2193j(parcel, classLoader);
        }

        /* renamed from: c */
        public C2193j[] newArray(int i) {
            return new C2193j[i];
        }
    }

    public C2193j() {
    }

    public C2193j(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
