package p148g.p189d.p190a.p232c.p241f.p247f;

import android.app.Activity;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p240e.C4403b;
import p148g.p189d.p190a.p232c.p241f.p247f.C4552g;

/* renamed from: g.d.a.c.f.f.g0 */
final class C4555g0 extends C4552g.C4553a {

    /* renamed from: j */
    private final /* synthetic */ Activity f14125j;

    /* renamed from: k */
    private final /* synthetic */ C4514df f14126k;

    /* renamed from: l */
    private final /* synthetic */ C4552g.C4554b f14127l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4555g0(C4552g.C4554b bVar, Activity activity, C4514df dfVar) {
        super(C4552g.this);
        this.f14127l = bVar;
        this.f14125j = activity;
        this.f14126k = dfVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13770a() throws RemoteException {
        C4552g.this.f14119h.onActivitySaveInstanceState(C4403b.m18643S0(this.f14125j), this.f14126k, this.f14121g);
    }
}
