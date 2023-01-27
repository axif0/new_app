package p148g.p189d.p190a.p200b.p213m0.p216j;

import android.os.Parcel;
import android.os.Parcelable;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4282u;

/* renamed from: g.d.a.b.m0.j.g */
public final class C4107g extends C4096b {
    public static final Parcelable.Creator<C4107g> CREATOR = new C4108a();

    /* renamed from: f */
    public final long f12936f;

    /* renamed from: g */
    public final long f12937g;

    /* renamed from: g.d.a.b.m0.j.g$a */
    static class C4108a implements Parcelable.Creator<C4107g> {
        C4108a() {
        }

        /* renamed from: a */
        public C4107g createFromParcel(Parcel parcel) {
            return new C4107g(parcel.readLong(), parcel.readLong(), (C4108a) null);
        }

        /* renamed from: b */
        public C4107g[] newArray(int i) {
            return new C4107g[i];
        }
    }

    private C4107g(long j, long j2) {
        this.f12936f = j;
        this.f12937g = j2;
    }

    /* synthetic */ C4107g(long j, long j2, C4108a aVar) {
        this(j, j2);
    }

    /* renamed from: a */
    static C4107g m17329a(C4274m mVar, long j, C4282u uVar) {
        long b = m17330b(mVar, j);
        return new C4107g(b, uVar.mo13498b(b));
    }

    /* renamed from: b */
    static long m17330b(C4274m mVar, long j) {
        long x = (long) mVar.mo13479x();
        if ((128 & x) != 0) {
            return 8589934591L & ((((x & 1) << 32) | mVar.mo13481z()) + j);
        }
        return -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12936f);
        parcel.writeLong(this.f12937g);
    }
}
