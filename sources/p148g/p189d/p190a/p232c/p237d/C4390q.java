package p148g.p189d.p190a.p232c.p237d;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1664b;

/* renamed from: g.d.a.c.d.q */
public final class C4390q implements Parcelable.Creator<C4366b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1664b.m7884u(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < u) {
            int n = C1664b.m7877n(parcel);
            int h = C1664b.m7871h(n);
            if (h == 1) {
                i = C1664b.m7879p(parcel, n);
            } else if (h == 2) {
                i2 = C1664b.m7879p(parcel, n);
            } else if (h == 3) {
                pendingIntent = (PendingIntent) C1664b.m7865b(parcel, n, PendingIntent.CREATOR);
            } else if (h != 4) {
                C1664b.m7883t(parcel, n);
            } else {
                str = C1664b.m7866c(parcel, n);
            }
        }
        C1664b.m7870g(parcel, u);
        return new C4366b(i, i2, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4366b[i];
    }
}
