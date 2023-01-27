package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1644j;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;
import p148g.p189d.p190a.p232c.p237d.C4366b;

/* renamed from: com.google.android.gms.common.internal.q */
public class C1660q extends C1663a {
    public static final Parcelable.Creator<C1660q> CREATOR = new C1671y();

    /* renamed from: f */
    private final int f5529f;

    /* renamed from: g */
    private IBinder f5530g;

    /* renamed from: h */
    private C4366b f5531h;

    /* renamed from: i */
    private boolean f5532i;

    /* renamed from: j */
    private boolean f5533j;

    C1660q(int i, IBinder iBinder, C4366b bVar, boolean z, boolean z2) {
        this.f5529f = i;
        this.f5530g = iBinder;
        this.f5531h = bVar;
        this.f5532i = z;
        this.f5533j = z2;
    }

    /* renamed from: d */
    public C1644j mo6558d() {
        return C1644j.C1645a.m7818r(this.f5530g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1660q)) {
            return false;
        }
        C1660q qVar = (C1660q) obj;
        return this.f5531h.equals(qVar.f5531h) && mo6558d().equals(qVar.mo6558d());
    }

    /* renamed from: f */
    public C4366b mo6560f() {
        return this.f5531h;
    }

    /* renamed from: h */
    public boolean mo6561h() {
        return this.f5532i;
    }

    /* renamed from: i */
    public boolean mo6562i() {
        return this.f5533j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7896j(parcel, 1, this.f5529f);
        C1666c.m7895i(parcel, 2, this.f5530g, false);
        C1666c.m7899m(parcel, 3, mo6560f(), i, false);
        C1666c.m7889c(parcel, 4, mo6561h());
        C1666c.m7889c(parcel, 5, mo6562i());
        C1666c.m7888b(parcel, a);
    }
}
