package p148g.p189d.p190a.p232c.p248g.p249b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1660q;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;
import p148g.p189d.p190a.p232c.p237d.C4366b;

/* renamed from: g.d.a.c.g.b.k */
public final class C4921k extends C1663a {
    public static final Parcelable.Creator<C4921k> CREATOR = new C4922l();

    /* renamed from: f */
    private final int f14726f;

    /* renamed from: g */
    private final C4366b f14727g;

    /* renamed from: h */
    private final C1660q f14728h;

    public C4921k(int i) {
        this(new C4366b(8, (PendingIntent) null), (C1660q) null);
    }

    C4921k(int i, C4366b bVar, C1660q qVar) {
        this.f14726f = i;
        this.f14727g = bVar;
        this.f14728h = qVar;
    }

    private C4921k(C4366b bVar, C1660q qVar) {
        this(1, bVar, (C1660q) null);
    }

    /* renamed from: d */
    public final C4366b mo14850d() {
        return this.f14727g;
    }

    /* renamed from: f */
    public final C1660q mo14851f() {
        return this.f14728h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7896j(parcel, 1, this.f14726f);
        C1666c.m7899m(parcel, 2, this.f14727g, i, false);
        C1666c.m7899m(parcel, 3, this.f14728h, i, false);
        C1666c.m7888b(parcel, a);
    }
}
