package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;
import p148g.p189d.p190a.p232c.p237d.C4370d;

/* renamed from: com.google.android.gms.common.internal.a0 */
public final class C1612a0 implements Parcelable.Creator<C1672z> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1664b.m7884u(parcel);
        Bundle bundle = null;
        C4370d[] dVarArr = null;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            int h = C1664b.m7871h(n);
            if (h == 1) {
                bundle = C1664b.m7864a(parcel, n);
            } else if (h != 2) {
                C1664b.m7883t(parcel, n);
            } else {
                dVarArr = (C4370d[]) C1664b.m7868e(parcel, n, C4370d.CREATOR);
            }
        }
        C1664b.m7870g(parcel, u);
        return new C1672z(bundle, dVarArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1672z[i];
    }
}
