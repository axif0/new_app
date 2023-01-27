package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;
import p148g.p189d.p190a.p232c.p237d.C4370d;

/* renamed from: com.google.android.gms.common.internal.z */
public final class C1672z extends C1663a {
    public static final Parcelable.Creator<C1672z> CREATOR = new C1612a0();

    /* renamed from: f */
    Bundle f5542f;

    /* renamed from: g */
    C4370d[] f5543g;

    public C1672z() {
    }

    C1672z(Bundle bundle, C4370d[] dVarArr) {
        this.f5542f = bundle;
        this.f5543g = dVarArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7891e(parcel, 1, this.f5542f, false);
        C1666c.m7902p(parcel, 2, this.f5543g, i, false);
        C1666c.m7888b(parcel, a);
    }
}
