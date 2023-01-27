package p148g.p189d.p190a.p200b.p213m0.p215i;

import android.os.Parcel;
import android.os.Parcelable;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.m0.i.j */
public final class C4090j extends C4087h {
    public static final Parcelable.Creator<C4090j> CREATOR = new C4091a();

    /* renamed from: g */
    public final String f12896g;

    /* renamed from: h */
    public final String f12897h;

    /* renamed from: g.d.a.b.m0.i.j$a */
    static class C4091a implements Parcelable.Creator<C4090j> {
        C4091a() {
        }

        /* renamed from: a */
        public C4090j createFromParcel(Parcel parcel) {
            return new C4090j(parcel);
        }

        /* renamed from: b */
        public C4090j[] newArray(int i) {
            return new C4090j[i];
        }
    }

    C4090j(Parcel parcel) {
        super(parcel.readString());
        this.f12896g = parcel.readString();
        this.f12897h = parcel.readString();
    }

    public C4090j(String str, String str2, String str3) {
        super(str);
        this.f12896g = str2;
        this.f12897h = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4090j.class != obj.getClass()) {
            return false;
        }
        C4090j jVar = (C4090j) obj;
        return this.f12893f.equals(jVar.f12893f) && C4284w.m18236b(this.f12896g, jVar.f12896g) && C4284w.m18236b(this.f12897h, jVar.f12897h);
    }

    public int hashCode() {
        int hashCode = (527 + this.f12893f.hashCode()) * 31;
        String str = this.f12896g;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12897h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12893f);
        parcel.writeString(this.f12896g);
        parcel.writeString(this.f12897h);
    }
}
