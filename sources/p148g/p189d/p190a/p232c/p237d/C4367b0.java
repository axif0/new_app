package p148g.p189d.p190a.p232c.p237d;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;

/* renamed from: g.d.a.c.d.b0 */
public final class C4367b0 implements Parcelable.Creator<C4365a0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1664b.m7884u(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            int h = C1664b.m7871h(n);
            if (h == 1) {
                str = C1664b.m7866c(parcel, n);
            } else if (h == 2) {
                iBinder = C1664b.m7878o(parcel, n);
            } else if (h == 3) {
                z = C1664b.m7872i(parcel, n);
            } else if (h != 4) {
                C1664b.m7883t(parcel, n);
            } else {
                z2 = C1664b.m7872i(parcel, n);
            }
        }
        C1664b.m7870g(parcel, u);
        return new C4365a0(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4365a0[i];
    }
}
