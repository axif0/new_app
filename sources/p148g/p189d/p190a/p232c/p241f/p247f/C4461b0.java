package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.Bundle;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p241f.p247f.C4552g;

/* renamed from: g.d.a.c.f.f.b0 */
final class C4461b0 extends C4552g.C4553a {

    /* renamed from: j */
    private final /* synthetic */ Long f13982j;

    /* renamed from: k */
    private final /* synthetic */ String f13983k;

    /* renamed from: l */
    private final /* synthetic */ String f13984l;

    /* renamed from: m */
    private final /* synthetic */ Bundle f13985m;

    /* renamed from: n */
    private final /* synthetic */ boolean f13986n;

    /* renamed from: o */
    private final /* synthetic */ boolean f13987o;

    /* renamed from: p */
    private final /* synthetic */ C4552g f13988p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4461b0(C4552g gVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(gVar);
        this.f13988p = gVar;
        this.f13982j = l;
        this.f13983k = str;
        this.f13984l = str2;
        this.f13985m = bundle;
        this.f13986n = z;
        this.f13987o = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13770a() throws RemoteException {
        Long l = this.f13982j;
        this.f13988p.f14119h.logEvent(this.f13983k, this.f13984l, this.f13985m, this.f13986n, this.f13987o, l == null ? this.f14120f : l.longValue());
    }
}
