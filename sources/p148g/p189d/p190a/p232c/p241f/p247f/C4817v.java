package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.Bundle;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p241f.p247f.C4552g;

/* renamed from: g.d.a.c.f.f.v */
final class C4817v extends C4552g.C4553a {

    /* renamed from: j */
    private final /* synthetic */ String f14575j;

    /* renamed from: k */
    private final /* synthetic */ String f14576k;

    /* renamed from: l */
    private final /* synthetic */ boolean f14577l;

    /* renamed from: m */
    private final /* synthetic */ C4514df f14578m;

    /* renamed from: n */
    private final /* synthetic */ C4552g f14579n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4817v(C4552g gVar, String str, String str2, boolean z, C4514df dfVar) {
        super(gVar);
        this.f14579n = gVar;
        this.f14575j = str;
        this.f14576k = str2;
        this.f14577l = z;
        this.f14578m = dfVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13770a() throws RemoteException {
        this.f14579n.f14119h.getUserProperties(this.f14575j, this.f14576k, this.f14577l, this.f14578m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14157b() {
        this.f14578m.mo14082g((Bundle) null);
    }
}
