package p148g.p189d.p190a.p200b.p213m0.p215i;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.m0.i.d */
public final class C4078d extends C4087h {
    public static final Parcelable.Creator<C4078d> CREATOR = new C4079a();

    /* renamed from: g */
    public final String f12876g;

    /* renamed from: h */
    public final boolean f12877h;

    /* renamed from: i */
    public final boolean f12878i;

    /* renamed from: j */
    public final String[] f12879j;

    /* renamed from: k */
    private final C4087h[] f12880k;

    /* renamed from: g.d.a.b.m0.i.d$a */
    static class C4079a implements Parcelable.Creator<C4078d> {
        C4079a() {
        }

        /* renamed from: a */
        public C4078d createFromParcel(Parcel parcel) {
            return new C4078d(parcel);
        }

        /* renamed from: b */
        public C4078d[] newArray(int i) {
            return new C4078d[i];
        }
    }

    C4078d(Parcel parcel) {
        super("CTOC");
        this.f12876g = parcel.readString();
        boolean z = true;
        this.f12877h = parcel.readByte() != 0;
        this.f12878i = parcel.readByte() == 0 ? false : z;
        this.f12879j = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f12880k = new C4087h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f12880k[i] = (C4087h) parcel.readParcelable(C4087h.class.getClassLoader());
        }
    }

    public C4078d(String str, boolean z, boolean z2, String[] strArr, C4087h[] hVarArr) {
        super("CTOC");
        this.f12876g = str;
        this.f12877h = z;
        this.f12878i = z2;
        this.f12879j = strArr;
        this.f12880k = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4078d.class != obj.getClass()) {
            return false;
        }
        C4078d dVar = (C4078d) obj;
        return this.f12877h == dVar.f12877h && this.f12878i == dVar.f12878i && C4284w.m18236b(this.f12876g, dVar.f12876g) && Arrays.equals(this.f12879j, dVar.f12879j) && Arrays.equals(this.f12880k, dVar.f12880k);
    }

    public int hashCode() {
        int i = (((true + (this.f12877h ? 1 : 0)) * 31) + (this.f12878i ? 1 : 0)) * 31;
        String str = this.f12876g;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12876g);
        parcel.writeByte(this.f12877h ? (byte) 1 : 0);
        parcel.writeByte(this.f12878i ? (byte) 1 : 0);
        parcel.writeStringArray(this.f12879j);
        parcel.writeInt(this.f12880k.length);
        for (C4087h writeParcelable : this.f12880k) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
