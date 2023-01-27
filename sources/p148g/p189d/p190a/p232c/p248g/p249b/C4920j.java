package p148g.p189d.p190a.p232c.p248g.p249b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1659p;
import com.google.android.gms.common.internal.p037t.C1664b;

/* renamed from: g.d.a.c.g.b.j */
public final class C4920j implements Parcelable.Creator<C4919i> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1664b.m7884u(parcel);
        int i = 0;
        C1659p pVar = null;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            int h = C1664b.m7871h(n);
            if (h == 1) {
                i = C1664b.m7879p(parcel, n);
            } else if (h != 2) {
                C1664b.m7883t(parcel, n);
            } else {
                pVar = (C1659p) C1664b.m7865b(parcel, n, C1659p.CREATOR);
            }
        }
        C1664b.m7870g(parcel, u);
        return new C4919i(i, pVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4919i[i];
    }
}
