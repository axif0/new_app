package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.ka */
public final class C1848ka implements Parcelable.Creator<C1860la> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1664b.m7884u(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j6 = -2147483648L;
        String str9 = BuildConfig.FLAVOR;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            switch (C1664b.m7871h(n)) {
                case 2:
                    str = C1664b.m7866c(parcel2, n);
                    break;
                case 3:
                    str2 = C1664b.m7866c(parcel2, n);
                    break;
                case 4:
                    str3 = C1664b.m7866c(parcel2, n);
                    break;
                case 5:
                    str4 = C1664b.m7866c(parcel2, n);
                    break;
                case 6:
                    j = C1664b.m7880q(parcel2, n);
                    break;
                case 7:
                    j2 = C1664b.m7880q(parcel2, n);
                    break;
                case 8:
                    str5 = C1664b.m7866c(parcel2, n);
                    break;
                case 9:
                    z = C1664b.m7872i(parcel2, n);
                    break;
                case 10:
                    z2 = C1664b.m7872i(parcel2, n);
                    break;
                case 11:
                    j6 = C1664b.m7880q(parcel2, n);
                    break;
                case 12:
                    str6 = C1664b.m7866c(parcel2, n);
                    break;
                case 13:
                    j3 = C1664b.m7880q(parcel2, n);
                    break;
                case 14:
                    j4 = C1664b.m7880q(parcel2, n);
                    break;
                case 15:
                    i = C1664b.m7879p(parcel2, n);
                    break;
                case 16:
                    z3 = C1664b.m7872i(parcel2, n);
                    break;
                case 17:
                    z4 = C1664b.m7872i(parcel2, n);
                    break;
                case 18:
                    z5 = C1664b.m7872i(parcel2, n);
                    break;
                case 19:
                    str7 = C1664b.m7866c(parcel2, n);
                    break;
                case 21:
                    bool = C1664b.m7873j(parcel2, n);
                    break;
                case 22:
                    j5 = C1664b.m7880q(parcel2, n);
                    break;
                case 23:
                    arrayList = C1664b.m7867d(parcel2, n);
                    break;
                case 24:
                    str8 = C1664b.m7866c(parcel2, n);
                    break;
                case 25:
                    str9 = C1664b.m7866c(parcel2, n);
                    break;
                default:
                    C1664b.m7883t(parcel2, n);
                    break;
            }
        }
        C1664b.m7870g(parcel2, u);
        return new C1860la(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, (List<String>) arrayList, str8, str9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1860la[i];
    }
}
