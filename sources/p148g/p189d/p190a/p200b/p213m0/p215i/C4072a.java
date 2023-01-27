package p148g.p189d.p190a.p200b.p213m0.p215i;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.m0.i.a */
public final class C4072a extends C4087h {
    public static final Parcelable.Creator<C4072a> CREATOR = new C4073a();

    /* renamed from: g */
    public final String f12865g;

    /* renamed from: h */
    public final String f12866h;

    /* renamed from: i */
    public final int f12867i;

    /* renamed from: j */
    public final byte[] f12868j;

    /* renamed from: g.d.a.b.m0.i.a$a */
    static class C4073a implements Parcelable.Creator<C4072a> {
        C4073a() {
        }

        /* renamed from: a */
        public C4072a createFromParcel(Parcel parcel) {
            return new C4072a(parcel);
        }

        /* renamed from: b */
        public C4072a[] newArray(int i) {
            return new C4072a[i];
        }
    }

    C4072a(Parcel parcel) {
        super("APIC");
        this.f12865g = parcel.readString();
        this.f12866h = parcel.readString();
        this.f12867i = parcel.readInt();
        this.f12868j = parcel.createByteArray();
    }

    public C4072a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f12865g = str;
        this.f12866h = str2;
        this.f12867i = i;
        this.f12868j = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4072a.class != obj.getClass()) {
            return false;
        }
        C4072a aVar = (C4072a) obj;
        return this.f12867i == aVar.f12867i && C4284w.m18236b(this.f12865g, aVar.f12865g) && C4284w.m18236b(this.f12866h, aVar.f12866h) && Arrays.equals(this.f12868j, aVar.f12868j);
    }

    public int hashCode() {
        int i = (527 + this.f12867i) * 31;
        String str = this.f12865g;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12866h;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f12868j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12865g);
        parcel.writeString(this.f12866h);
        parcel.writeInt(this.f12867i);
        parcel.writeByteArray(this.f12868j);
    }
}
