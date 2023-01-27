package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.Bundle;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p241f.p247f.C4552g;

/* renamed from: g.d.a.c.f.f.l */
final class C4644l extends C4552g.C4553a {

    /* renamed from: j */
    private final /* synthetic */ String f14243j;

    /* renamed from: k */
    private final /* synthetic */ String f14244k;

    /* renamed from: l */
    private final /* synthetic */ Bundle f14245l;

    /* renamed from: m */
    private final /* synthetic */ C4552g f14246m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4644l(C4552g gVar, String str, String str2, Bundle bundle) {
        super(gVar);
        this.f14246m = gVar;
        this.f14243j = str;
        this.f14244k = str2;
        this.f14245l = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13770a() throws RemoteException {
        this.f14246m.f14119h.clearConditionalUserProperty(this.f14243j, this.f14244k, this.f14245l);
    }
}
