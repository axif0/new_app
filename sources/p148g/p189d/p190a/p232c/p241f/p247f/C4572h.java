package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;

/* renamed from: g.d.a.c.f.f.h */
public final class C4572h implements Parcelable.Creator<C4515e> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1664b.m7884u(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            switch (C1664b.m7871h(n)) {
                case 1:
                    j = C1664b.m7880q(parcel2, n);
                    break;
                case 2:
                    j2 = C1664b.m7880q(parcel2, n);
                    break;
                case 3:
                    z = C1664b.m7872i(parcel2, n);
                    break;
                case 4:
                    str = C1664b.m7866c(parcel2, n);
                    break;
                case 5:
                    str2 = C1664b.m7866c(parcel2, n);
                    break;
                case 6:
                    str3 = C1664b.m7866c(parcel2, n);
                    break;
                case 7:
                    bundle = C1664b.m7864a(parcel2, n);
                    break;
                default:
                    C1664b.m7883t(parcel2, n);
                    break;
            }
        }
        C1664b.m7870g(parcel2, u);
        return new C4515e(j, j2, z, str, str2, str3, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4515e[i];
    }
}
