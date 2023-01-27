package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p240e.C4403b;
import p148g.p189d.p190a.p232c.p241f.p247f.C4552g;

/* renamed from: g.d.a.c.f.f.a0 */
final class C4443a0 extends C4552g.C4553a {

    /* renamed from: j */
    private final /* synthetic */ String f13966j;

    /* renamed from: k */
    private final /* synthetic */ String f13967k;

    /* renamed from: l */
    private final /* synthetic */ Object f13968l;

    /* renamed from: m */
    private final /* synthetic */ boolean f13969m;

    /* renamed from: n */
    private final /* synthetic */ C4552g f13970n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4443a0(C4552g gVar, String str, String str2, Object obj, boolean z) {
        super(gVar);
        this.f13970n = gVar;
        this.f13966j = str;
        this.f13967k = str2;
        this.f13968l = obj;
        this.f13969m = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13770a() throws RemoteException {
        this.f13970n.f14119h.setUserProperty(this.f13966j, this.f13967k, C4403b.m18643S0(this.f13968l), this.f13969m, this.f14120f);
    }
}
