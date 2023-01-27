package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;
import com.google.android.gms.common.internal.p037t.C1666c;

/* renamed from: com.google.firebase.messaging.r */
public class C2648r implements Parcelable.Creator<C2645q> {
    /* renamed from: c */
    static void m11791c(C2645q qVar, Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7891e(parcel, 2, qVar.f8454f, false);
        C1666c.m7888b(parcel, a);
    }

    /* renamed from: a */
    public C2645q createFromParcel(Parcel parcel) {
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
        return new C2645q(bundle);
    }

    /* renamed from: b */
    public C2645q[] newArray(int i) {
        return new C2645q[i];
    }
}
