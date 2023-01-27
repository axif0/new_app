package p148g.p189d.p190a.p232c.p248g.p249b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1660q;
import com.google.android.gms.common.internal.p037t.C1664b;
import p148g.p189d.p190a.p232c.p237d.C4366b;

/* renamed from: g.d.a.c.g.b.l */
public final class C4922l implements Parcelable.Creator<C4921k> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1664b.m7884u(parcel);
        C4366b bVar = null;
        C1660q qVar = null;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            int h = C1664b.m7871h(n);
            if (h == 1) {
                i = C1664b.m7879p(parcel, n);
            } else if (h == 2) {
                bVar = (C4366b) C1664b.m7865b(parcel, n, C4366b.CREATOR);
            } else if (h != 3) {
                C1664b.m7883t(parcel, n);
            } else {
                qVar = (C1660q) C1664b.m7865b(parcel, n, C1660q.CREATOR);
            }
        }
        C1664b.m7870g(parcel, u);
        return new C4921k(i, bVar, qVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4921k[i];
    }
}
