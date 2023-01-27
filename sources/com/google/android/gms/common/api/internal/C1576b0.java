package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1558b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1572b;
import p148g.p189d.p190a.p232c.p251i.C4941i;

/* renamed from: com.google.android.gms.common.api.internal.b0 */
abstract class C1576b0<T> extends C1600u {

    /* renamed from: a */
    protected final C4941i<T> f5377a;

    public C1576b0(int i, C4941i<T> iVar) {
        super(i);
        this.f5377a = iVar;
    }

    /* renamed from: b */
    public void mo6402b(Status status) {
        this.f5377a.mo14886d(new C1558b(status));
    }

    /* renamed from: c */
    public final void mo6403c(C1572b.C1573a<?> aVar) throws DeadObjectException {
        try {
            mo6405i(aVar);
        } catch (DeadObjectException e) {
            mo6402b(C1591l.m7643a(e));
            throw e;
        } catch (RemoteException e2) {
            mo6402b(C1591l.m7643a(e2));
        } catch (RuntimeException e3) {
            mo6404e(e3);
        }
    }

    /* renamed from: e */
    public void mo6404e(RuntimeException runtimeException) {
        this.f5377a.mo14886d(runtimeException);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo6405i(C1572b.C1573a<?> aVar) throws RemoteException;
}
