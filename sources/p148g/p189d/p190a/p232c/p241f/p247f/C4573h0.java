package p148g.p189d.p190a.p232c.p241f.p247f;

import android.app.Activity;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p240e.C4403b;
import p148g.p189d.p190a.p232c.p241f.p247f.C4552g;

/* renamed from: g.d.a.c.f.f.h0 */
final class C4573h0 extends C4552g.C4553a {

    /* renamed from: j */
    private final /* synthetic */ Activity f14157j;

    /* renamed from: k */
    private final /* synthetic */ C4552g.C4554b f14158k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4573h0(C4552g.C4554b bVar, Activity activity) {
        super(C4552g.this);
        this.f14158k = bVar;
        this.f14157j = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13770a() throws RemoteException {
        C4552g.this.f14119h.onActivityStopped(C4403b.m18643S0(this.f14157j), this.f14121g);
    }
}
