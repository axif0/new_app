package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;

/* renamed from: com.google.android.gms.common.api.m */
public final class C1609m implements Parcelable.Creator<Scope> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1664b.m7884u(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            int h = C1664b.m7871h(n);
            if (h == 1) {
                i = C1664b.m7879p(parcel, n);
            } else if (h != 2) {
                C1664b.m7883t(parcel, n);
            } else {
                str = C1664b.m7866c(parcel, n);
            }
        }
        C1664b.m7870g(parcel, u);
        return new Scope(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
