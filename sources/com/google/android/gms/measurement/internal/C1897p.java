package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;

/* renamed from: com.google.android.gms.measurement.internal.p */
public final class C1897p implements Parcelable.Creator<C1873n> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1664b.m7884u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            if (C1664b.m7871h(n) != 2) {
                C1664b.m7883t(parcel, n);
            } else {
                bundle = C1664b.m7864a(parcel, n);
            }
        }
        C1664b.m7870g(parcel, u);
        return new C1873n(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1873n[i];
    }
}
