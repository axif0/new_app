package p148g.p189d.p190a.p232c.p236c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;

/* renamed from: g.d.a.c.c.f */
public final class C4343f implements Parcelable.Creator<C4332a> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1664b.m7884u(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            if (C1664b.m7871h(n) != 1) {
                C1664b.m7883t(parcel, n);
            } else {
                intent = (Intent) C1664b.m7865b(parcel, n, Intent.CREATOR);
            }
        }
        C1664b.m7870g(parcel, u);
        return new C4332a(intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4332a[i];
    }
}
