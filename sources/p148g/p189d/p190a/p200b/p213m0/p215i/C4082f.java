package p148g.p189d.p190a.p200b.p213m0.p215i;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.m0.i.f */
public final class C4082f extends C4087h {
    public static final Parcelable.Creator<C4082f> CREATOR = new C4083a();

    /* renamed from: g */
    public final String f12884g;

    /* renamed from: h */
    public final String f12885h;

    /* renamed from: i */
    public final String f12886i;

    /* renamed from: j */
    public final byte[] f12887j;

    /* renamed from: g.d.a.b.m0.i.f$a */
    static class C4083a implements Parcelable.Creator<C4082f> {
        C4083a() {
        }

        /* renamed from: a */
        public C4082f createFromParcel(Parcel parcel) {
            return new C4082f(parcel);
        }

        /* renamed from: b */
        public C4082f[] newArray(int i) {
            return new C4082f[i];
        }
    }

    C4082f(Parcel parcel) {
        super("GEOB");
        this.f12884g = parcel.readString();
        this.f12885h = parcel.readString();
        this.f12886i = parcel.readString();
        this.f12887j = parcel.createByteArray();
    }

    public C4082f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f12884g = str;
        this.f12885h = str2;
        this.f12886i = str3;
        this.f12887j = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4082f.class != obj.getClass()) {
            return false;
        }
        C4082f fVar = (C4082f) obj;
        return C4284w.m18236b(this.f12884g, fVar.f12884g) && C4284w.m18236b(this.f12885h, fVar.f12885h) && C4284w.m18236b(this.f12886i, fVar.f12886i) && Arrays.equals(this.f12887j, fVar.f12887j);
    }

    public int hashCode() {
        String str = this.f12884g;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12885h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12886i;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f12887j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12884g);
        parcel.writeString(this.f12885h);
        parcel.writeString(this.f12886i);
        parcel.writeByteArray(this.f12887j);
    }
}
