package p148g.p189d.p190a.p232c.p248g.p249b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;

/* renamed from: g.d.a.c.g.b.c */
public final class C4913c implements Parcelable.Creator<C4912b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1664b.m7884u(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            int h = C1664b.m7871h(n);
            if (h == 1) {
                i = C1664b.m7879p(parcel, n);
            } else if (h == 2) {
                i2 = C1664b.m7879p(parcel, n);
            } else if (h != 3) {
                C1664b.m7883t(parcel, n);
            } else {
                intent = (Intent) C1664b.m7865b(parcel, n, Intent.CREATOR);
            }
        }
        C1664b.m7870g(parcel, u);
        return new C4912b(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4912b[i];
    }
}
