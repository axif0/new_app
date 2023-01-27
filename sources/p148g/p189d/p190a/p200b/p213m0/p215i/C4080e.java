package p148g.p189d.p190a.p200b.p213m0.p215i;

import android.os.Parcel;
import android.os.Parcelable;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.m0.i.e */
public final class C4080e extends C4087h {
    public static final Parcelable.Creator<C4080e> CREATOR = new C4081a();

    /* renamed from: g */
    public final String f12881g;

    /* renamed from: h */
    public final String f12882h;

    /* renamed from: i */
    public final String f12883i;

    /* renamed from: g.d.a.b.m0.i.e$a */
    static class C4081a implements Parcelable.Creator<C4080e> {
        C4081a() {
        }

        /* renamed from: a */
        public C4080e createFromParcel(Parcel parcel) {
            return new C4080e(parcel);
        }

        /* renamed from: b */
        public C4080e[] newArray(int i) {
            return new C4080e[i];
        }
    }

    C4080e(Parcel parcel) {
        super("COMM");
        this.f12881g = parcel.readString();
        this.f12882h = parcel.readString();
        this.f12883i = parcel.readString();
    }

    public C4080e(String str, String str2, String str3) {
        super("COMM");
        this.f12881g = str;
        this.f12882h = str2;
        this.f12883i = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4080e.class != obj.getClass()) {
            return false;
        }
        C4080e eVar = (C4080e) obj;
        return C4284w.m18236b(this.f12882h, eVar.f12882h) && C4284w.m18236b(this.f12881g, eVar.f12881g) && C4284w.m18236b(this.f12883i, eVar.f12883i);
    }

    public int hashCode() {
        String str = this.f12881g;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12882h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12883i;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12893f);
        parcel.writeString(this.f12881g);
        parcel.writeString(this.f12883i);
    }
}
