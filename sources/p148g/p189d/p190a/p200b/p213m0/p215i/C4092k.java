package p148g.p189d.p190a.p200b.p213m0.p215i;

import android.os.Parcel;
import android.os.Parcelable;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.m0.i.k */
public final class C4092k extends C4087h {
    public static final Parcelable.Creator<C4092k> CREATOR = new C4093a();

    /* renamed from: g */
    public final String f12898g;

    /* renamed from: h */
    public final String f12899h;

    /* renamed from: g.d.a.b.m0.i.k$a */
    static class C4093a implements Parcelable.Creator<C4092k> {
        C4093a() {
        }

        /* renamed from: a */
        public C4092k createFromParcel(Parcel parcel) {
            return new C4092k(parcel);
        }

        /* renamed from: b */
        public C4092k[] newArray(int i) {
            return new C4092k[i];
        }
    }

    C4092k(Parcel parcel) {
        super(parcel.readString());
        this.f12898g = parcel.readString();
        this.f12899h = parcel.readString();
    }

    public C4092k(String str, String str2, String str3) {
        super(str);
        this.f12898g = str2;
        this.f12899h = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4092k.class != obj.getClass()) {
            return false;
        }
        C4092k kVar = (C4092k) obj;
        return this.f12893f.equals(kVar.f12893f) && C4284w.m18236b(this.f12898g, kVar.f12898g) && C4284w.m18236b(this.f12899h, kVar.f12899h);
    }

    public int hashCode() {
        int hashCode = (527 + this.f12893f.hashCode()) * 31;
        String str = this.f12898g;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12899h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12893f);
        parcel.writeString(this.f12898g);
        parcel.writeString(this.f12899h);
    }
}
