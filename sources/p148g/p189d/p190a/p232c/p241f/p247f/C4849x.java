package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p240e.C4403b;
import p148g.p189d.p190a.p232c.p241f.p247f.C4552g;

/* renamed from: g.d.a.c.f.f.x */
final class C4849x extends C4552g.C4553a {

    /* renamed from: j */
    private final /* synthetic */ int f14622j = 5;

    /* renamed from: k */
    private final /* synthetic */ String f14623k;

    /* renamed from: l */
    private final /* synthetic */ Object f14624l;

    /* renamed from: m */
    private final /* synthetic */ C4552g f14625m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4849x(C4552g gVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f14625m = gVar;
        this.f14623k = str;
        this.f14624l = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13770a() throws RemoteException {
        this.f14625m.f14119h.logHealthData(this.f14622j, this.f14623k, C4403b.m18643S0(this.f14624l), C4403b.m18643S0(null), C4403b.m18643S0(null));
    }
}
