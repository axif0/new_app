package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;

/* renamed from: com.google.android.gms.common.api.n */
public final class C1610n implements Parcelable.Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1664b.m7884u(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            int h = C1664b.m7871h(n);
            if (h == 1) {
                i2 = C1664b.m7879p(parcel, n);
            } else if (h == 2) {
                str = C1664b.m7866c(parcel, n);
            } else if (h == 3) {
                pendingIntent = (PendingIntent) C1664b.m7865b(parcel, n, PendingIntent.CREATOR);
            } else if (h != 1000) {
                C1664b.m7883t(parcel, n);
            } else {
                i = C1664b.m7879p(parcel, n);
            }
        }
        C1664b.m7870g(parcel, u);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
