package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g.d.a.e.a.c.n0 */
public abstract class C5117n0 extends C5111k0 implements C5119o0 {
    /* renamed from: r */
    public static C5119o0 m21507r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof C5119o0 ? (C5119o0) queryLocalInterface : new C5115m0(iBinder);
    }
}
