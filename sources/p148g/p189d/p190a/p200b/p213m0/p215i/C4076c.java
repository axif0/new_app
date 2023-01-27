package p148g.p189d.p190a.p200b.p213m0.p215i;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.m0.i.c */
public final class C4076c extends C4087h {
    public static final Parcelable.Creator<C4076c> CREATOR = new C4077a();

    /* renamed from: g */
    public final String f12870g;

    /* renamed from: h */
    public final int f12871h;

    /* renamed from: i */
    public final int f12872i;

    /* renamed from: j */
    public final long f12873j;

    /* renamed from: k */
    public final long f12874k;

    /* renamed from: l */
    private final C4087h[] f12875l;

    /* renamed from: g.d.a.b.m0.i.c$a */
    static class C4077a implements Parcelable.Creator<C4076c> {
        C4077a() {
        }

        /* renamed from: a */
        public C4076c createFromParcel(Parcel parcel) {
            return new C4076c(parcel);
        }

        /* renamed from: b */
        public C4076c[] newArray(int i) {
            return new C4076c[i];
        }
    }

    C4076c(Parcel parcel) {
        super("CHAP");
        this.f12870g = parcel.readString();
        this.f12871h = parcel.readInt();
        this.f12872i = parcel.readInt();
        this.f12873j = parcel.readLong();
        this.f12874k = parcel.readLong();
        int readInt = parcel.readInt();
        this.f12875l = new C4087h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f12875l[i] = (C4087h) parcel.readParcelable(C4087h.class.getClassLoader());
        }
    }

    public C4076c(String str, int i, int i2, long j, long j2, C4087h[] hVarArr) {
        super("CHAP");
        this.f12870g = str;
        this.f12871h = i;
        this.f12872i = i2;
        this.f12873j = j;
        this.f12874k = j2;
        this.f12875l = hVarArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4076c.class != obj.getClass()) {
            return false;
        }
        C4076c cVar = (C4076c) obj;
        return this.f12871h == cVar.f12871h && this.f12872i == cVar.f12872i && this.f12873j == cVar.f12873j && this.f12874k == cVar.f12874k && C4284w.m18236b(this.f12870g, cVar.f12870g) && Arrays.equals(this.f12875l, cVar.f12875l);
    }

    public int hashCode() {
        int i = (((((((527 + this.f12871h) * 31) + this.f12872i) * 31) + ((int) this.f12873j)) * 31) + ((int) this.f12874k)) * 31;
        String str = this.f12870g;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12870g);
        parcel.writeInt(this.f12871h);
        parcel.writeInt(this.f12872i);
        parcel.writeLong(this.f12873j);
        parcel.writeLong(this.f12874k);
        parcel.writeInt(this.f12875l.length);
        for (C4087h writeParcelable : this.f12875l) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
