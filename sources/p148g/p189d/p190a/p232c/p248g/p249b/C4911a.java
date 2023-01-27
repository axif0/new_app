package p148g.p189d.p190a.p232c.p248g.p249b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.p036a.C1545a;
import com.google.android.gms.common.api.C1562f;
import com.google.android.gms.common.api.C1563g;
import com.google.android.gms.common.internal.C1613b;
import com.google.android.gms.common.internal.C1627c;
import com.google.android.gms.common.internal.C1637g;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.internal.C1659p;
import p148g.p189d.p190a.p232c.p237d.C4379j;
import p148g.p189d.p190a.p232c.p248g.C4910a;
import p148g.p189d.p190a.p232c.p248g.C4926f;

/* renamed from: g.d.a.c.g.b.a */
public class C4911a extends C1637g<C4917g> implements C4926f {

    /* renamed from: A */
    private final Bundle f14717A;

    /* renamed from: B */
    private Integer f14718B;

    /* renamed from: y */
    private final boolean f14719y;

    /* renamed from: z */
    private final C1627c f14720z;

    private C4911a(Context context, Looper looper, boolean z, C1627c cVar, Bundle bundle, C1562f fVar, C1563g gVar) {
        super(context, looper, 44, cVar, fVar, gVar);
        this.f14719y = true;
        this.f14720z = cVar;
        this.f14717A = bundle;
        this.f14718B = cVar.mo6502d();
    }

    public C4911a(Context context, Looper looper, boolean z, C1627c cVar, C4910a aVar, C1562f fVar, C1563g gVar) {
        this(context, looper, true, cVar, m20862k0(cVar), fVar, gVar);
    }

    /* renamed from: k0 */
    public static Bundle m20862k0(C1627c cVar) {
        C4910a h = cVar.mo6506h();
        Integer d = cVar.mo6502d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", cVar.mo6499a());
        if (d != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", d.intValue());
        }
        if (h != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", h.mo14835h());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", h.mo14834g());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", h.mo14832e());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", h.mo14833f());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", h.mo14830c());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", h.mo14836i());
            if (h.mo14829b() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", h.mo14829b().longValue());
            }
            if (h.mo14831d() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", h.mo14831d().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo6460c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public /* synthetic */ IInterface mo6462e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C4917g ? (C4917g) queryLocalInterface : new C4918h(iBinder);
    }

    /* renamed from: g */
    public int mo6464g() {
        return C4379j.f13918a;
    }

    /* renamed from: h */
    public final void mo14837h(C4915e eVar) {
        C1658o.m7846k(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f14720z.mo6500b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b.name)) {
                googleSignInAccount = C1545a.m7490a(mo6478x()).mo6302b();
            }
            ((C4917g) mo6447B()).mo14846D0(new C4919i(new C1659p(b, this.f14718B.intValue(), googleSignInAccount)), eVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                eVar.mo6433Q(new C4921k(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: n */
    public final void mo14838n() {
        mo6468l(new C1613b.C1617d());
    }

    /* renamed from: o */
    public boolean mo6470o() {
        return this.f14719y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public String mo6471p() {
        return "com.google.android.gms.signin.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Bundle mo6479y() {
        if (!mo6478x().getPackageName().equals(this.f14720z.mo6504f())) {
            this.f14717A.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f14720z.mo6504f());
        }
        return this.f14717A;
    }
}
