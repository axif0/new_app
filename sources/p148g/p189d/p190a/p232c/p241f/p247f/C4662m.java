package p148g.p189d.p190a.p232c.p241f.p247f;

import android.app.Activity;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p240e.C4403b;
import p148g.p189d.p190a.p232c.p241f.p247f.C4552g;

/* renamed from: g.d.a.c.f.f.m */
final class C4662m extends C4552g.C4553a {

    /* renamed from: j */
    private final /* synthetic */ Activity f14254j;

    /* renamed from: k */
    private final /* synthetic */ String f14255k;

    /* renamed from: l */
    private final /* synthetic */ String f14256l;

    /* renamed from: m */
    private final /* synthetic */ C4552g f14257m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4662m(C4552g gVar, Activity activity, String str, String str2) {
        super(gVar);
        this.f14257m = gVar;
        this.f14254j = activity;
        this.f14255k = str;
        this.f14256l = str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13770a() throws RemoteException {
        this.f14257m.f14119h.setCurrentScreen(C4403b.m18643S0(this.f14254j), this.f14255k, this.f14256l, this.f14120f);
    }
}
