package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;

/* renamed from: g.d.a.c.f.f.e */
public final class C4515e extends C1663a {
    public static final Parcelable.Creator<C4515e> CREATOR = new C4572h();

    /* renamed from: f */
    public final long f14069f;

    /* renamed from: g */
    public final long f14070g;

    /* renamed from: h */
    public final boolean f14071h;

    /* renamed from: i */
    public final String f14072i;

    /* renamed from: j */
    public final String f14073j;

    /* renamed from: k */
    public final String f14074k;

    /* renamed from: l */
    public final Bundle f14075l;

    public C4515e(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f14069f = j;
        this.f14070g = j2;
        this.f14071h = z;
        this.f14072i = str;
        this.f14073j = str2;
        this.f14074k = str3;
        this.f14075l = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7897k(parcel, 1, this.f14069f);
        C1666c.m7897k(parcel, 2, this.f14070g);
        C1666c.m7889c(parcel, 3, this.f14071h);
        C1666c.m7900n(parcel, 4, this.f14072i, false);
        C1666c.m7900n(parcel, 5, this.f14073j, false);
        C1666c.m7900n(parcel, 6, this.f14074k, false);
        C1666c.m7891e(parcel, 7, this.f14075l, false);
        C1666c.m7888b(parcel, a);
    }
}
