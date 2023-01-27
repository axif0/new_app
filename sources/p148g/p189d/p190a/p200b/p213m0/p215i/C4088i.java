package p148g.p189d.p190a.p200b.p213m0.p215i;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.m0.i.i */
public final class C4088i extends C4087h {
    public static final Parcelable.Creator<C4088i> CREATOR = new C4089a();

    /* renamed from: g */
    public final String f12894g;

    /* renamed from: h */
    public final byte[] f12895h;

    /* renamed from: g.d.a.b.m0.i.i$a */
    static class C4089a implements Parcelable.Creator<C4088i> {
        C4089a() {
        }

        /* renamed from: a */
        public C4088i createFromParcel(Parcel parcel) {
            return new C4088i(parcel);
        }

        /* renamed from: b */
        public C4088i[] newArray(int i) {
            return new C4088i[i];
        }
    }

    C4088i(Parcel parcel) {
        super("PRIV");
        this.f12894g = parcel.readString();
        this.f12895h = parcel.createByteArray();
    }

    public C4088i(String str, byte[] bArr) {
        super("PRIV");
        this.f12894g = str;
        this.f12895h = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4088i.class != obj.getClass()) {
            return false;
        }
        C4088i iVar = (C4088i) obj;
        return C4284w.m18236b(this.f12894g, iVar.f12894g) && Arrays.equals(this.f12895h, iVar.f12895h);
    }

    public int hashCode() {
        String str = this.f12894g;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f12895h);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12894g);
        parcel.writeByteArray(this.f12895h);
    }
}
