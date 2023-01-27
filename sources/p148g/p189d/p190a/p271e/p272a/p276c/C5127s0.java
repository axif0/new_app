package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g.d.a.e.a.c.s0 */
public abstract class C5127s0 extends C5111k0 implements C5129t0 {
    /* renamed from: r */
    public static C5129t0 m21548r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof C5129t0 ? (C5129t0) queryLocalInterface : new C5125r0(iBinder);
    }
}
