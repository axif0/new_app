package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import p148g.p189d.p190a.p232c.p241f.p245d.C4421b;

/* renamed from: com.google.android.gms.common.internal.k0 */
public abstract class C1650k0 extends C4421b implements C1647j0 {
    /* renamed from: r */
    public static C1647j0 m7825r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof C1647j0 ? (C1647j0) queryLocalInterface : new C1652l0(iBinder);
    }
}
