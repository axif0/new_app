package p148g.p189d.p190a.p232c.p241f.p247f;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p240e.C4403b;
import p148g.p189d.p190a.p232c.p241f.p247f.C4552g;

/* renamed from: g.d.a.c.f.f.d0 */
final class C4498d0 extends C4552g.C4553a {

    /* renamed from: j */
    private final /* synthetic */ Bundle f14024j;

    /* renamed from: k */
    private final /* synthetic */ Activity f14025k;

    /* renamed from: l */
    private final /* synthetic */ C4552g.C4554b f14026l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4498d0(C4552g.C4554b bVar, Bundle bundle, Activity activity) {
        super(C4552g.this);
        this.f14026l = bVar;
        this.f14024j = bundle;
        this.f14025k = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13770a() throws RemoteException {
        Bundle bundle;
        if (this.f14024j != null) {
            bundle = new Bundle();
            if (this.f14024j.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f14024j.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        C4552g.this.f14119h.onActivityCreated(C4403b.m18643S0(this.f14025k), bundle, this.f14121g);
    }
}
