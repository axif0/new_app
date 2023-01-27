package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g.d.a.c.f.f.f5 */
public abstract class C4541f5 extends C4751r0 implements C4501d2 {
    /* renamed from: r */
    public static C4501d2 m19399r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof C4501d2 ? (C4501d2) queryLocalInterface : new C4522e4(iBinder);
    }
}
