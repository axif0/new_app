package p148g.p189d.p190a.p232c.p237d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;

/* renamed from: g.d.a.c.d.r */
public final class C4391r implements Parcelable.Creator<C4370d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1664b.m7884u(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            int h = C1664b.m7871h(n);
            if (h == 1) {
                str = C1664b.m7866c(parcel, n);
            } else if (h == 2) {
                i = C1664b.m7879p(parcel, n);
            } else if (h != 3) {
                C1664b.m7883t(parcel, n);
            } else {
                j = C1664b.m7880q(parcel, n);
            }
        }
        C1664b.m7870g(parcel, u);
        return new C4370d(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4370d[i];
    }
}
