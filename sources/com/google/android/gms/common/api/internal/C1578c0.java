package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1572b;
import p148g.p189d.p190a.p232c.p237d.C4370d;
import p148g.p189d.p190a.p232c.p251i.C4941i;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
public final class C1578c0 extends C1576b0<Boolean> {

    /* renamed from: b */
    private final C1583f<?> f5383b;

    public C1578c0(C1583f<?> fVar, C4941i<Boolean> iVar) {
        super(4, iVar);
        this.f5383b = fVar;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo6406d(C1588i iVar, boolean z) {
    }

    /* renamed from: g */
    public final C4370d[] mo6407g(C1572b.C1573a<?> aVar) {
        C1599t tVar = aVar.mo6393x().get(this.f5383b);
        if (tVar == null) {
            return null;
        }
        return tVar.f5409a.mo6418b();
    }

    /* renamed from: h */
    public final boolean mo6408h(C1572b.C1573a<?> aVar) {
        C1599t tVar = aVar.mo6393x().get(this.f5383b);
        if (tVar == null) {
            return false;
        }
        tVar.f5409a.mo6420d();
        throw null;
    }

    /* renamed from: i */
    public final void mo6405i(C1572b.C1573a<?> aVar) throws RemoteException {
        C1599t remove = aVar.mo6393x().remove(this.f5383b);
        if (remove != null) {
            remove.f5410b.mo6422a(aVar.mo6390l(), this.f5377a);
            remove.f5409a.mo6417a();
            return;
        }
        this.f5377a.mo14887e(Boolean.FALSE);
    }
}
