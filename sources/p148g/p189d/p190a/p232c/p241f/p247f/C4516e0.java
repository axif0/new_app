package p148g.p189d.p190a.p232c.p241f.p247f;

import android.app.Activity;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p240e.C4403b;
import p148g.p189d.p190a.p232c.p241f.p247f.C4552g;

/* renamed from: g.d.a.c.f.f.e0 */
final class C4516e0 extends C4552g.C4553a {

    /* renamed from: j */
    private final /* synthetic */ Activity f14076j;

    /* renamed from: k */
    private final /* synthetic */ C4552g.C4554b f14077k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4516e0(C4552g.C4554b bVar, Activity activity) {
        super(C4552g.this);
        this.f14077k = bVar;
        this.f14076j = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13770a() throws RemoteException {
        C4552g.this.f14119h.onActivityPaused(C4403b.m18643S0(this.f14076j), this.f14121g);
    }
}
