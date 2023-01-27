package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.stats.e */
public final class C1677e implements Parcelable.Creator<WakeLockEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1664b.m7884u(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            switch (C1664b.m7871h(n)) {
                case 1:
                    i = C1664b.m7879p(parcel2, n);
                    break;
                case 2:
                    j = C1664b.m7880q(parcel2, n);
                    break;
                case 4:
                    str = C1664b.m7866c(parcel2, n);
                    break;
                case 5:
                    i3 = C1664b.m7879p(parcel2, n);
                    break;
                case 6:
                    arrayList = C1664b.m7867d(parcel2, n);
                    break;
                case 8:
                    j2 = C1664b.m7880q(parcel2, n);
                    break;
                case 10:
                    str3 = C1664b.m7866c(parcel2, n);
                    break;
                case 11:
                    i2 = C1664b.m7879p(parcel2, n);
                    break;
                case 12:
                    str2 = C1664b.m7866c(parcel2, n);
                    break;
                case 13:
                    str4 = C1664b.m7866c(parcel2, n);
                    break;
                case 14:
                    i4 = C1664b.m7879p(parcel2, n);
                    break;
                case 15:
                    f = C1664b.m7875l(parcel2, n);
                    break;
                case 16:
                    j3 = C1664b.m7880q(parcel2, n);
                    break;
                case 17:
                    str5 = C1664b.m7866c(parcel2, n);
                    break;
                case 18:
                    z = C1664b.m7872i(parcel2, n);
                    break;
                default:
                    C1664b.m7883t(parcel2, n);
                    break;
            }
        }
        C1664b.m7870g(parcel2, u);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
