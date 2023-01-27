package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C2096a;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.f */
public class C2104f implements C2096a.C2099c {
    public static final Parcelable.Creator<C2104f> CREATOR = new C2105a();

    /* renamed from: f */
    private final long f6973f;

    /* renamed from: com.google.android.material.datepicker.f$a */
    static class C2105a implements Parcelable.Creator<C2104f> {
        C2105a() {
        }

        /* renamed from: a */
        public C2104f createFromParcel(Parcel parcel) {
            return new C2104f(parcel.readLong(), (C2105a) null);
        }

        /* renamed from: b */
        public C2104f[] newArray(int i) {
            return new C2104f[i];
        }
    }

    private C2104f(long j) {
        this.f6973f = j;
    }

    /* synthetic */ C2104f(long j, C2105a aVar) {
        this(j);
    }

    /* renamed from: a */
    public static C2104f m9836a(long j) {
        return new C2104f(j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2104f) && this.f6973f == ((C2104f) obj).f6973f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6973f)});
    }

    /* renamed from: u */
    public boolean mo8187u(long j) {
        return j >= this.f6973f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f6973f);
    }
}
