package p148g.p189d.p190a.p200b.p213m0.p215i;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: g.d.a.b.m0.i.b */
public final class C4074b extends C4087h {
    public static final Parcelable.Creator<C4074b> CREATOR = new C4075a();

    /* renamed from: g */
    public final byte[] f12869g;

    /* renamed from: g.d.a.b.m0.i.b$a */
    static class C4075a implements Parcelable.Creator<C4074b> {
        C4075a() {
        }

        /* renamed from: a */
        public C4074b createFromParcel(Parcel parcel) {
            return new C4074b(parcel);
        }

        /* renamed from: b */
        public C4074b[] newArray(int i) {
            return new C4074b[i];
        }
    }

    C4074b(Parcel parcel) {
        super(parcel.readString());
        this.f12869g = parcel.createByteArray();
    }

    public C4074b(String str, byte[] bArr) {
        super(str);
        this.f12869g = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4074b.class != obj.getClass()) {
            return false;
        }
        C4074b bVar = (C4074b) obj;
        return this.f12893f.equals(bVar.f12893f) && Arrays.equals(this.f12869g, bVar.f12869g);
    }

    public int hashCode() {
        return ((527 + this.f12893f.hashCode()) * 31) + Arrays.hashCode(this.f12869g);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12893f);
        parcel.writeByteArray(this.f12869g);
    }
}
