package p148g.p189d.p190a.p200b.p213m0.p214h;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.p213m0.C4059a;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.m0.h.a */
public final class C4069a implements C4059a.C4061b {
    public static final Parcelable.Creator<C4069a> CREATOR = new C4070a();

    /* renamed from: f */
    public final String f12858f;

    /* renamed from: g */
    public final String f12859g;

    /* renamed from: h */
    public final long f12860h;

    /* renamed from: i */
    public final long f12861i;

    /* renamed from: j */
    public final long f12862j;

    /* renamed from: k */
    public final byte[] f12863k;

    /* renamed from: l */
    private int f12864l;

    /* renamed from: g.d.a.b.m0.h.a$a */
    static class C4070a implements Parcelable.Creator<C4069a> {
        C4070a() {
        }

        /* renamed from: a */
        public C4069a createFromParcel(Parcel parcel) {
            return new C4069a(parcel);
        }

        /* renamed from: b */
        public C4069a[] newArray(int i) {
            return new C4069a[i];
        }
    }

    C4069a(Parcel parcel) {
        this.f12858f = parcel.readString();
        this.f12859g = parcel.readString();
        this.f12861i = parcel.readLong();
        this.f12860h = parcel.readLong();
        this.f12862j = parcel.readLong();
        this.f12863k = parcel.createByteArray();
    }

    public C4069a(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        this.f12858f = str;
        this.f12859g = str2;
        this.f12860h = j;
        this.f12862j = j2;
        this.f12863k = bArr;
        this.f12861i = j3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4069a.class != obj.getClass()) {
            return false;
        }
        C4069a aVar = (C4069a) obj;
        return this.f12861i == aVar.f12861i && this.f12860h == aVar.f12860h && this.f12862j == aVar.f12862j && C4284w.m18236b(this.f12858f, aVar.f12858f) && C4284w.m18236b(this.f12859g, aVar.f12859g) && Arrays.equals(this.f12863k, aVar.f12863k);
    }

    public int hashCode() {
        if (this.f12864l == 0) {
            String str = this.f12858f;
            int i = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f12859g;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.f12861i;
            long j2 = this.f12860h;
            long j3 = this.f12862j;
            this.f12864l = ((((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.f12863k);
        }
        return this.f12864l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12858f);
        parcel.writeString(this.f12859g);
        parcel.writeLong(this.f12861i);
        parcel.writeLong(this.f12860h);
        parcel.writeLong(this.f12862j);
        parcel.writeByteArray(this.f12863k);
    }
}
