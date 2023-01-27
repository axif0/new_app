package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C1613b;
import p148g.p189d.p190a.p232c.p237d.C4379j;

/* renamed from: com.google.android.gms.measurement.internal.z3 */
public final class C2021z3 extends C1613b<C1961u3> {
    public C2021z3(Context context, Looper looper, C1613b.C1614a aVar, C1613b.C1615b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo6460c() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* renamed from: e */
    public final /* synthetic */ IInterface mo6462e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C1961u3 ? (C1961u3) queryLocalInterface : new C1985w3(iBinder);
    }

    /* renamed from: g */
    public final int mo6464g() {
        return C4379j.f13918a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final String mo6471p() {
        return "com.google.android.gms.measurement.START";
    }
}
