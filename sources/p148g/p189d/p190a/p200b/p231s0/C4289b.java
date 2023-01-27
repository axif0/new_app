package p148g.p189d.p190a.p200b.p231s0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: g.d.a.b.s0.b */
public final class C4289b implements Parcelable {
    public static final Parcelable.Creator<C4289b> CREATOR = new C4290a();

    /* renamed from: f */
    public final int f13678f;

    /* renamed from: g */
    public final int f13679g;

    /* renamed from: h */
    public final int f13680h;

    /* renamed from: i */
    public final byte[] f13681i;

    /* renamed from: j */
    private int f13682j;

    /* renamed from: g.d.a.b.s0.b$a */
    static class C4290a implements Parcelable.Creator<C4289b> {
        C4290a() {
        }

        /* renamed from: a */
        public C4289b createFromParcel(Parcel parcel) {
            return new C4289b(parcel);
        }

        /* renamed from: b */
        public C4289b[] newArray(int i) {
            return new C4289b[0];
        }
    }

    public C4289b(int i, int i2, int i3, byte[] bArr) {
        this.f13678f = i;
        this.f13679g = i2;
        this.f13680h = i3;
        this.f13681i = bArr;
    }

    C4289b(Parcel parcel) {
        this.f13678f = parcel.readInt();
        this.f13679g = parcel.readInt();
        this.f13680h = parcel.readInt();
        this.f13681i = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4289b.class != obj.getClass()) {
            return false;
        }
        C4289b bVar = (C4289b) obj;
        return this.f13678f == bVar.f13678f && this.f13679g == bVar.f13679g && this.f13680h == bVar.f13680h && Arrays.equals(this.f13681i, bVar.f13681i);
    }

    public int hashCode() {
        if (this.f13682j == 0) {
            this.f13682j = ((((((527 + this.f13678f) * 31) + this.f13679g) * 31) + this.f13680h) * 31) + Arrays.hashCode(this.f13681i);
        }
        return this.f13682j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f13678f);
        sb.append(", ");
        sb.append(this.f13679g);
        sb.append(", ");
        sb.append(this.f13680h);
        sb.append(", ");
        sb.append(this.f13681i != null);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13678f);
        parcel.writeInt(this.f13679g);
        parcel.writeInt(this.f13680h);
        parcel.writeInt(this.f13681i != null ? 1 : 0);
        byte[] bArr = this.f13681i;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
