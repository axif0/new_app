package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;

/* renamed from: com.google.android.gms.measurement.internal.da */
public final class C1764da implements Parcelable.Creator<C1776ea> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1664b.m7884u(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            switch (C1664b.m7871h(n)) {
                case 1:
                    i = C1664b.m7879p(parcel2, n);
                    break;
                case 2:
                    str = C1664b.m7866c(parcel2, n);
                    break;
                case 3:
                    j = C1664b.m7880q(parcel2, n);
                    break;
                case 4:
                    l = C1664b.m7881r(parcel2, n);
                    break;
                case 5:
                    f = C1664b.m7876m(parcel2, n);
                    break;
                case 6:
                    str2 = C1664b.m7866c(parcel2, n);
                    break;
                case 7:
                    str3 = C1664b.m7866c(parcel2, n);
                    break;
                case 8:
                    d = C1664b.m7874k(parcel2, n);
                    break;
                default:
                    C1664b.m7883t(parcel2, n);
                    break;
            }
        }
        C1664b.m7870g(parcel2, u);
        return new C1776ea(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1776ea[i];
    }
}
