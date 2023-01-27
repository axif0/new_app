package p148g.p189d.p190a.p200b.p213m0.p216j;

import android.os.Parcel;
import android.os.Parcelable;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.m0.j.a */
public final class C4094a extends C4096b {
    public static final Parcelable.Creator<C4094a> CREATOR = new C4095a();

    /* renamed from: f */
    public final long f12900f;

    /* renamed from: g */
    public final long f12901g;

    /* renamed from: h */
    public final byte[] f12902h;

    /* renamed from: g.d.a.b.m0.j.a$a */
    static class C4095a implements Parcelable.Creator<C4094a> {
        C4095a() {
        }

        /* renamed from: a */
        public C4094a createFromParcel(Parcel parcel) {
            return new C4094a(parcel, (C4095a) null);
        }

        /* renamed from: b */
        public C4094a[] newArray(int i) {
            return new C4094a[i];
        }
    }

    private C4094a(long j, byte[] bArr, long j2) {
        this.f12900f = j2;
        this.f12901g = j;
        this.f12902h = bArr;
    }

    private C4094a(Parcel parcel) {
        this.f12900f = parcel.readLong();
        this.f12901g = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f12902h = bArr;
        parcel.readByteArray(bArr);
    }

    /* synthetic */ C4094a(Parcel parcel, C4095a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    static C4094a m17305a(C4274m mVar, int i, long j) {
        long z = mVar.mo13481z();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        mVar.mo13462g(bArr, 0, i2);
        return new C4094a(z, bArr, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12900f);
        parcel.writeLong(this.f12901g);
        parcel.writeInt(this.f12902h.length);
        parcel.writeByteArray(this.f12902h);
    }
}
