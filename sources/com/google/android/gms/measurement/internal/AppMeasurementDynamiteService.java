package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;
import p086f.p102e.C3190a;
import p148g.p189d.p190a.p232c.p240e.C4400a;
import p148g.p189d.p190a.p232c.p240e.C4403b;
import p148g.p189d.p190a.p232c.p241f.p247f.C4460b;
import p148g.p189d.p190a.p232c.p241f.p247f.C4479c;
import p148g.p189d.p190a.p232c.p241f.p247f.C4515e;
import p148g.p189d.p190a.p232c.p241f.p247f.C4533ef;
import p148g.p189d.p190a.p232c.p241f.p247f.C4571gf;
import p148g.p189d.p190a.p232c.p241f.p247f.C4602ib;

@DynamiteApi
public class AppMeasurementDynamiteService extends C4533ef {

    /* renamed from: a */
    C1807h5 f5608a = null;

    /* renamed from: b */
    private Map<Integer, C1832j6> f5609b = new C3190a();

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$a */
    class C1715a implements C1832j6 {

        /* renamed from: a */
        private C4460b f5610a;

        C1715a(C4460b bVar) {
            this.f5610a = bVar;
        }

        /* renamed from: a */
        public final void mo6683a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f5610a.mo13810O(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f5608a.mo6709i().mo6767H().mo6886b("Event listener threw exception", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b */
    class C1716b implements C1844k6 {

        /* renamed from: a */
        private C4460b f5612a;

        C1716b(C4460b bVar) {
            this.f5612a = bVar;
        }

        /* renamed from: a */
        public final void mo6684a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f5612a.mo13810O(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f5608a.mo6709i().mo6767H().mo6886b("Event interceptor threw exception", e);
            }
        }
    }

    /* renamed from: r */
    private final void m8044r() {
        if (this.f5608a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: w */
    private final void m8045w(C4571gf gfVar, String str) {
        this.f5608a.mo7024G().mo6989R(gfVar, str);
    }

    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        m8044r();
        this.f5608a.mo7036S().mo6687z(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        m8044r();
        this.f5608a.mo7023F().mo7215y0(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) throws RemoteException {
        m8044r();
        this.f5608a.mo7023F().mo7191R((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j) throws RemoteException {
        m8044r();
        this.f5608a.mo7036S().mo6685D(str, j);
    }

    public void generateEventId(C4571gf gfVar) throws RemoteException {
        m8044r();
        this.f5608a.mo7024G().mo6987P(gfVar, this.f5608a.mo7024G().mo6976E0());
    }

    public void getAppInstanceId(C4571gf gfVar) throws RemoteException {
        m8044r();
        this.f5608a.mo6706e().mo6703y(new C1796g6(this, gfVar));
    }

    public void getCachedAppInstanceId(C4571gf gfVar) throws RemoteException {
        m8044r();
        m8045w(gfVar, this.f5608a.mo7023F().mo7207j0());
    }

    public void getConditionalUserProperties(String str, String str2, C4571gf gfVar) throws RemoteException {
        m8044r();
        this.f5608a.mo6706e().mo6703y(new C1824ia(this, gfVar, str, str2));
    }

    public void getCurrentScreenClass(C4571gf gfVar) throws RemoteException {
        m8044r();
        m8045w(gfVar, this.f5608a.mo7023F().mo7210m0());
    }

    public void getCurrentScreenName(C4571gf gfVar) throws RemoteException {
        m8044r();
        m8045w(gfVar, this.f5608a.mo7023F().mo7209l0());
    }

    public void getGmpAppId(C4571gf gfVar) throws RemoteException {
        m8044r();
        m8045w(gfVar, this.f5608a.mo7023F().mo7211n0());
    }

    public void getMaxUserProperties(String str, C4571gf gfVar) throws RemoteException {
        m8044r();
        this.f5608a.mo7023F();
        C1658o.m7841f(str);
        this.f5608a.mo7024G().mo6986O(gfVar, 25);
    }

    public void getTestFlag(C4571gf gfVar, int i) throws RemoteException {
        m8044r();
        if (i == 0) {
            this.f5608a.mo7024G().mo6989R(gfVar, this.f5608a.mo7023F().mo7203f0());
        } else if (i == 1) {
            this.f5608a.mo7024G().mo6987P(gfVar, this.f5608a.mo7023F().mo7204g0().longValue());
        } else if (i == 2) {
            C1788fa G = this.f5608a.mo7024G();
            double doubleValue = this.f5608a.mo7023F().mo7206i0().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                gfVar.mo14082g(bundle);
            } catch (RemoteException e) {
                G.f5634a.mo6709i().mo6767H().mo6886b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.f5608a.mo7024G().mo6986O(gfVar, this.f5608a.mo7023F().mo7205h0().intValue());
        } else if (i == 4) {
            this.f5608a.mo7024G().mo6991T(gfVar, this.f5608a.mo7023F().mo7202e0().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C4571gf gfVar) throws RemoteException {
        m8044r();
        this.f5608a.mo6706e().mo6703y(new C1797g7(this, gfVar, str, str2, z));
    }

    public void initForTests(Map map) throws RemoteException {
        m8044r();
    }

    public void initialize(C4400a aVar, C4515e eVar, long j) throws RemoteException {
        Context context = (Context) C4403b.m18644w(aVar);
        C1807h5 h5Var = this.f5608a;
        if (h5Var == null) {
            this.f5608a = C1807h5.m8537a(context, eVar, Long.valueOf(j));
        } else {
            h5Var.mo6709i().mo6767H().mo6885a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(C4571gf gfVar) throws RemoteException {
        m8044r();
        this.f5608a.mo6706e().mo6703y(new C1811h9(this, gfVar));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        m8044r();
        this.f5608a.mo7023F().mo7196Y(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C4571gf gfVar, long j) throws RemoteException {
        Bundle bundle2;
        m8044r();
        C1658o.m7841f(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f5608a.mo6706e().mo6703y(new C1798g8(this, gfVar, new C1933s(str2, new C1873n(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, C4400a aVar, C4400a aVar2, C4400a aVar3) throws RemoteException {
        m8044r();
        Object obj = null;
        Object w = aVar == null ? null : C4403b.m18644w(aVar);
        Object w2 = aVar2 == null ? null : C4403b.m18644w(aVar2);
        if (aVar3 != null) {
            obj = C4403b.m18644w(aVar3);
        }
        this.f5608a.mo6709i().mo6762A(i, true, false, str, w, w2, obj);
    }

    public void onActivityCreated(C4400a aVar, Bundle bundle, long j) throws RemoteException {
        m8044r();
        C1833j7 j7Var = this.f5608a.mo7023F().f5996c;
        if (j7Var != null) {
            this.f5608a.mo7023F().mo7201d0();
            j7Var.onActivityCreated((Activity) C4403b.m18644w(aVar), bundle);
        }
    }

    public void onActivityDestroyed(C4400a aVar, long j) throws RemoteException {
        m8044r();
        C1833j7 j7Var = this.f5608a.mo7023F().f5996c;
        if (j7Var != null) {
            this.f5608a.mo7023F().mo7201d0();
            j7Var.onActivityDestroyed((Activity) C4403b.m18644w(aVar));
        }
    }

    public void onActivityPaused(C4400a aVar, long j) throws RemoteException {
        m8044r();
        C1833j7 j7Var = this.f5608a.mo7023F().f5996c;
        if (j7Var != null) {
            this.f5608a.mo7023F().mo7201d0();
            j7Var.onActivityPaused((Activity) C4403b.m18644w(aVar));
        }
    }

    public void onActivityResumed(C4400a aVar, long j) throws RemoteException {
        m8044r();
        C1833j7 j7Var = this.f5608a.mo7023F().f5996c;
        if (j7Var != null) {
            this.f5608a.mo7023F().mo7201d0();
            j7Var.onActivityResumed((Activity) C4403b.m18644w(aVar));
        }
    }

    public void onActivitySaveInstanceState(C4400a aVar, C4571gf gfVar, long j) throws RemoteException {
        m8044r();
        C1833j7 j7Var = this.f5608a.mo7023F().f5996c;
        Bundle bundle = new Bundle();
        if (j7Var != null) {
            this.f5608a.mo7023F().mo7201d0();
            j7Var.onActivitySaveInstanceState((Activity) C4403b.m18644w(aVar), bundle);
        }
        try {
            gfVar.mo14082g(bundle);
        } catch (RemoteException e) {
            this.f5608a.mo6709i().mo6767H().mo6886b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(C4400a aVar, long j) throws RemoteException {
        m8044r();
        C1833j7 j7Var = this.f5608a.mo7023F().f5996c;
        if (j7Var != null) {
            this.f5608a.mo7023F().mo7201d0();
            j7Var.onActivityStarted((Activity) C4403b.m18644w(aVar));
        }
    }

    public void onActivityStopped(C4400a aVar, long j) throws RemoteException {
        m8044r();
        C1833j7 j7Var = this.f5608a.mo7023F().f5996c;
        if (j7Var != null) {
            this.f5608a.mo7023F().mo7201d0();
            j7Var.onActivityStopped((Activity) C4403b.m18644w(aVar));
        }
    }

    public void performAction(Bundle bundle, C4571gf gfVar, long j) throws RemoteException {
        m8044r();
        gfVar.mo14082g((Bundle) null);
    }

    public void registerOnMeasurementEventListener(C4460b bVar) throws RemoteException {
        m8044r();
        C1832j6 j6Var = this.f5609b.get(Integer.valueOf(bVar.mo13811a()));
        if (j6Var == null) {
            j6Var = new C1715a(bVar);
            this.f5609b.put(Integer.valueOf(bVar.mo13811a()), j6Var);
        }
        this.f5608a.mo7023F().mo7189L(j6Var);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        m8044r();
        C1856l6 F = this.f5608a.mo7023F();
        F.mo7192T((String) null);
        F.mo6706e().mo6703y(new C1976v6(F, j));
    }

    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        m8044r();
        if (bundle == null) {
            this.f5608a.mo6709i().mo6764E().mo6885a("Conditional user property must not be null");
        } else {
            this.f5608a.mo7023F().mo7186H(bundle, j);
        }
    }

    public void setConsent(Bundle bundle, long j) throws RemoteException {
        m8044r();
        C1856l6 F = this.f5608a.mo7023F();
        if (C4602ib.m19620b() && F.mo6712l().mo7422z((String) null, C1957u.f6338P0)) {
            F.mo6965w();
            String f = C1765e.m8337f(bundle);
            if (f != null) {
                F.mo6709i().mo6769J().mo6886b("Ignoring invalid consent setting", f);
                F.mo6709i().mo6769J().mo6885a("Valid consent values are 'granted', 'denied'");
            }
            F.mo7188J(C1765e.m8340j(bundle), 10, j);
        }
    }

    public void setCurrentScreen(C4400a aVar, String str, String str2, long j) throws RemoteException {
        m8044r();
        this.f5608a.mo7032O().mo7350I((Activity) C4403b.m18644w(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        m8044r();
        C1856l6 F = this.f5608a.mo7023F();
        F.mo6965w();
        F.mo6706e().mo6703y(new C1845k7(F, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        m8044r();
        C1856l6 F = this.f5608a.mo7023F();
        F.mo6706e().mo6703y(new C1892o6(F, bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(C4460b bVar) throws RemoteException {
        m8044r();
        C1856l6 F = this.f5608a.mo7023F();
        C1716b bVar2 = new C1716b(bVar);
        F.mo6965w();
        F.mo6706e().mo6703y(new C2000x6(F, bVar2));
    }

    public void setInstanceIdProvider(C4479c cVar) throws RemoteException {
        m8044r();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        m8044r();
        this.f5608a.mo7023F().mo7191R(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        m8044r();
        C1856l6 F = this.f5608a.mo7023F();
        F.mo6706e().mo6703y(new C1940s6(F, j));
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        m8044r();
        C1856l6 F = this.f5608a.mo7023F();
        F.mo6706e().mo6703y(new C1928r6(F, j));
    }

    public void setUserId(String str, long j) throws RemoteException {
        m8044r();
        this.f5608a.mo7023F().mo7199b0((String) null, "_id", str, true, j);
    }

    public void setUserProperty(String str, String str2, C4400a aVar, boolean z, long j) throws RemoteException {
        m8044r();
        this.f5608a.mo7023F().mo7199b0(str, str2, C4403b.m18644w(aVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C4460b bVar) throws RemoteException {
        m8044r();
        C1832j6 remove = this.f5609b.remove(Integer.valueOf(bVar.mo13811a()));
        if (remove == null) {
            remove = new C1715a(bVar);
        }
        this.f5608a.mo7023F().mo7213t0(remove);
    }
}
