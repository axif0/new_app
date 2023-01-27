package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.C1547a;
import com.google.android.gms.common.api.C1562f;
import com.google.android.gms.common.api.C1563g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1627c;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.internal.C1660q;
import java.util.Set;
import p148g.p189d.p190a.p232c.p237d.C4366b;
import p148g.p189d.p190a.p232c.p248g.C4910a;
import p148g.p189d.p190a.p232c.p248g.C4923c;
import p148g.p189d.p190a.p232c.p248g.C4926f;
import p148g.p189d.p190a.p232c.p248g.p249b.C4914d;
import p148g.p189d.p190a.p232c.p248g.p249b.C4921k;

/* renamed from: com.google.android.gms.common.api.internal.v */
public final class C1601v extends C4914d implements C1562f, C1563g {

    /* renamed from: h */
    private static C1547a.C1548a<? extends C4926f, C4910a> f5411h = C4923c.f14731c;

    /* renamed from: a */
    private final Context f5412a;

    /* renamed from: b */
    private final Handler f5413b;

    /* renamed from: c */
    private final C1547a.C1548a<? extends C4926f, C4910a> f5414c;

    /* renamed from: d */
    private Set<Scope> f5415d;

    /* renamed from: e */
    private C1627c f5416e;

    /* renamed from: f */
    private C4926f f5417f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1604y f5418g;

    public C1601v(Context context, Handler handler, C1627c cVar) {
        this(context, handler, cVar, f5411h);
    }

    public C1601v(Context context, Handler handler, C1627c cVar, C1547a.C1548a<? extends C4926f, C4910a> aVar) {
        this.f5412a = context;
        this.f5413b = handler;
        C1658o.m7846k(cVar, "ClientSettings must not be null");
        this.f5416e = cVar;
        this.f5415d = cVar.mo6505g();
        this.f5414c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public final void m7655X0(C4921k kVar) {
        C4366b d = kVar.mo14850d();
        if (d.mo13679j()) {
            C1660q f = kVar.mo14851f();
            d = f.mo6560f();
            if (!d.mo13679j()) {
                String valueOf = String.valueOf(d);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                this.f5418g.mo6401c(f.mo6558d(), this.f5415d);
                this.f5417f.mo6337m();
            }
        }
        this.f5418g.mo6400b(d);
        this.f5417f.mo6337m();
    }

    /* renamed from: Q */
    public final void mo6433Q(C4921k kVar) {
        this.f5413b.post(new C1603x(this, kVar));
    }

    /* renamed from: V0 */
    public final void mo6434V0(C1604y yVar) {
        C4926f fVar = this.f5417f;
        if (fVar != null) {
            fVar.mo6337m();
        }
        this.f5416e.mo6507i(Integer.valueOf(System.identityHashCode(this)));
        C1547a.C1548a<? extends C4926f, C4910a> aVar = this.f5414c;
        Context context = this.f5412a;
        Looper looper = this.f5413b.getLooper();
        C1627c cVar = this.f5416e;
        this.f5417f = (C4926f) aVar.mo6325a(context, looper, cVar, cVar.mo6506h(), this, this);
        this.f5418g = yVar;
        Set<Scope> set = this.f5415d;
        if (set == null || set.isEmpty()) {
            this.f5413b.post(new C1602w(this));
        } else {
            this.f5417f.mo14838n();
        }
    }

    /* renamed from: W0 */
    public final void mo6435W0() {
        C4926f fVar = this.f5417f;
        if (fVar != null) {
            fVar.mo6337m();
        }
    }

    /* renamed from: n */
    public final void mo6349n(int i) {
        this.f5417f.mo6337m();
    }

    /* renamed from: r */
    public final void mo6351r(C4366b bVar) {
        this.f5418g.mo6400b(bVar);
    }

    /* renamed from: w */
    public final void mo6350w(Bundle bundle) {
        this.f5417f.mo14837h(this);
    }
}
