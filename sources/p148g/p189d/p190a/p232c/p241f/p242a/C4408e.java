package p148g.p189d.p190a.p232c.p241f.p242a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g.d.a.c.f.a.e */
public abstract class C4408e extends C4405b implements C4407d {
    /* renamed from: n */
    public static C4407d m18651n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C4407d ? (C4407d) queryLocalInterface : new C4409f(iBinder);
    }
}
