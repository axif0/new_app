package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.C1547a;
import com.google.android.gms.common.api.C1561e;
import com.google.android.gms.common.api.C1562f;
import com.google.android.gms.common.api.C1563g;
import com.google.android.gms.common.api.C1608l;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1613b;
import com.google.android.gms.common.internal.C1642i;
import com.google.android.gms.common.internal.C1644j;
import com.google.android.gms.common.internal.C1655n;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.internal.C1661r;
import com.google.android.gms.common.util.C1679b;
import com.google.android.gms.common.util.C1689l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p086f.p102e.C3190a;
import p086f.p102e.C3192b;
import p148g.p189d.p190a.p232c.p237d.C4366b;
import p148g.p189d.p190a.p232c.p237d.C4370d;
import p148g.p189d.p190a.p232c.p237d.C4372e;
import p148g.p189d.p190a.p232c.p241f.p243b.C4413d;
import p148g.p189d.p190a.p232c.p251i.C4941i;

/* renamed from: com.google.android.gms.common.api.internal.b */
public class C1572b implements Handler.Callback {

    /* renamed from: r */
    public static final Status f5340r = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final Status f5341s = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final Object f5342t = new Object();

    /* renamed from: u */
    private static C1572b f5343u;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f5344f = 5000;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f5345g = 120000;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f5346h = 10000;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Context f5347i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C4372e f5348j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1642i f5349k;

    /* renamed from: l */
    private final AtomicInteger f5350l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Map<C1580d0<?>, C1573a<?>> f5351m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C1589j f5352n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Set<C1580d0<?>> f5353o;

    /* renamed from: p */
    private final Set<C1580d0<?>> f5354p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Handler f5355q;

    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public class C1573a<O extends C1547a.C1551d> implements C1562f, C1563g {

        /* renamed from: a */
        private final Queue<C1591l> f5356a = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1547a.C1555f f5357b;

        /* renamed from: c */
        private final C1547a.C1549b f5358c;

        /* renamed from: d */
        private final C1580d0<O> f5359d;

        /* renamed from: e */
        private final C1588i f5360e;

        /* renamed from: f */
        private final Set<C1582e0> f5361f = new HashSet();

        /* renamed from: g */
        private final Map<C1583f<?>, C1599t> f5362g = new HashMap();

        /* renamed from: h */
        private final int f5363h;

        /* renamed from: i */
        private final C1601v f5364i;

        /* renamed from: j */
        private boolean f5365j;

        /* renamed from: k */
        private final List<C1574b> f5366k = new ArrayList();

        /* renamed from: l */
        private C4366b f5367l = null;

        public C1573a(C1561e<O> eVar) {
            C1547a.C1555f c = eVar.mo6346c(C1572b.this.f5355q.getLooper(), this);
            this.f5357b = c;
            this.f5358c = c instanceof C1661r ? ((C1661r) c).mo6564k0() : c;
            this.f5359d = eVar.mo6348e();
            this.f5360e = new C1588i();
            this.f5363h = eVar.mo6345b();
            if (this.f5357b.mo6338o()) {
                this.f5364i = eVar.mo6347d(C1572b.this.f5347i, C1572b.this.f5355q);
            } else {
                this.f5364i = null;
            }
        }

        /* renamed from: A */
        private final void m7568A() {
            if (this.f5365j) {
                C1572b.this.f5355q.removeMessages(11, this.f5359d);
                C1572b.this.f5355q.removeMessages(9, this.f5359d);
                this.f5365j = false;
            }
        }

        /* renamed from: B */
        private final void m7569B() {
            C1572b.this.f5355q.removeMessages(12, this.f5359d);
            C1572b.this.f5355q.sendMessageDelayed(C1572b.this.f5355q.obtainMessage(12, this.f5359d), C1572b.this.f5346h);
        }

        /* renamed from: E */
        private final void m7570E(C1591l lVar) {
            lVar.mo6406d(this.f5360e, mo6386d());
            try {
                lVar.mo6403c(this);
            } catch (DeadObjectException unused) {
                mo6349n(1);
                this.f5357b.mo6337m();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: F */
        public final boolean m7571F(boolean z) {
            C1658o.m7838c(C1572b.this.f5355q);
            if (!this.f5357b.mo6329b() || this.f5362g.size() != 0) {
                return false;
            }
            if (this.f5360e.mo6423b()) {
                if (z) {
                    m7569B();
                }
                return false;
            }
            this.f5357b.mo6337m();
            return true;
        }

        /* renamed from: K */
        private final boolean m7575K(C4366b bVar) {
            synchronized (C1572b.f5342t) {
                if (C1572b.this.f5352n != null) {
                    if (C1572b.this.f5353o.contains(this.f5359d)) {
                        C1572b.this.f5352n.mo6416a(bVar, this.f5363h);
                        throw null;
                    }
                }
            }
            return false;
        }

        /* renamed from: L */
        private final void m7576L(C4366b bVar) {
            for (C1582e0 next : this.f5361f) {
                String str = null;
                if (C1655n.m7832a(bVar, C4366b.f13896j)) {
                    str = this.f5357b.mo6335k();
                }
                next.mo6412a(this.f5359d, bVar, str);
            }
            this.f5361f.clear();
        }

        /* renamed from: f */
        private final C4370d m7577f(C4370d[] dVarArr) {
            if (!(dVarArr == null || dVarArr.length == 0)) {
                C4370d[] j = this.f5357b.mo6334j();
                if (j == null) {
                    j = new C4370d[0];
                }
                C3190a aVar = new C3190a(j.length);
                for (C4370d dVar : j) {
                    aVar.put(dVar.mo13689d(), Long.valueOf(dVar.mo13691f()));
                }
                for (C4370d dVar2 : dVarArr) {
                    if (!aVar.containsKey(dVar2.mo13689d()) || ((Long) aVar.get(dVar2.mo13689d())).longValue() < dVar2.mo13691f()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public final void m7579h(C1574b bVar) {
            if (!this.f5366k.contains(bVar) || this.f5365j) {
                return;
            }
            if (!this.f5357b.mo6329b()) {
                mo6383a();
            } else {
                m7586u();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public final void m7582p(C1574b bVar) {
            C4370d[] g;
            if (this.f5366k.remove(bVar)) {
                C1572b.this.f5355q.removeMessages(15, bVar);
                C1572b.this.f5355q.removeMessages(16, bVar);
                C4370d b = bVar.f5370b;
                ArrayList arrayList = new ArrayList(this.f5356a.size());
                for (C1591l lVar : this.f5356a) {
                    if ((lVar instanceof C1600u) && (g = ((C1600u) lVar).mo6407g(this)) != null && C1679b.m7935b(g, b)) {
                        arrayList.add(lVar);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    C1591l lVar2 = (C1591l) obj;
                    this.f5356a.remove(lVar2);
                    lVar2.mo6404e(new C1608l(b));
                }
            }
        }

        /* renamed from: q */
        private final boolean m7583q(C1591l lVar) {
            if (!(lVar instanceof C1600u)) {
                m7570E(lVar);
                return true;
            }
            C1600u uVar = (C1600u) lVar;
            C4370d f = m7577f(uVar.mo6407g(this));
            if (f == null) {
                m7570E(lVar);
                return true;
            } else if (uVar.mo6408h(this)) {
                C1574b bVar = new C1574b(this.f5359d, f, (C1592m) null);
                int indexOf = this.f5366k.indexOf(bVar);
                if (indexOf >= 0) {
                    C1574b bVar2 = this.f5366k.get(indexOf);
                    C1572b.this.f5355q.removeMessages(15, bVar2);
                    C1572b.this.f5355q.sendMessageDelayed(Message.obtain(C1572b.this.f5355q, 15, bVar2), C1572b.this.f5344f);
                    return false;
                }
                this.f5366k.add(bVar);
                C1572b.this.f5355q.sendMessageDelayed(Message.obtain(C1572b.this.f5355q, 15, bVar), C1572b.this.f5344f);
                C1572b.this.f5355q.sendMessageDelayed(Message.obtain(C1572b.this.f5355q, 16, bVar), C1572b.this.f5345g);
                C4366b bVar3 = new C4366b(2, (PendingIntent) null);
                if (m7575K(bVar3)) {
                    return false;
                }
                C1572b.this.mo6378i(bVar3, this.f5363h);
                return false;
            } else {
                uVar.mo6404e(new C1608l(f));
                return false;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public final void m7584s() {
            mo6394y();
            m7576L(C4366b.f13896j);
            m7568A();
            Iterator<C1599t> it = this.f5362g.values().iterator();
            while (it.hasNext()) {
                C1599t next = it.next();
                if (m7577f(next.f5409a.mo6418b()) == null) {
                    try {
                        next.f5409a.mo6419c(this.f5358c, new C4941i());
                    } catch (DeadObjectException unused) {
                        mo6349n(1);
                        this.f5357b.mo6337m();
                    } catch (RemoteException unused2) {
                    }
                }
                it.remove();
            }
            m7586u();
            m7569B();
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public final void m7585t() {
            mo6394y();
            this.f5365j = true;
            this.f5360e.mo6425d();
            C1572b.this.f5355q.sendMessageDelayed(Message.obtain(C1572b.this.f5355q, 9, this.f5359d), C1572b.this.f5344f);
            C1572b.this.f5355q.sendMessageDelayed(Message.obtain(C1572b.this.f5355q, 11, this.f5359d), C1572b.this.f5345g);
            C1572b.this.f5349k.mo6546a();
        }

        /* renamed from: u */
        private final void m7586u() {
            ArrayList arrayList = new ArrayList(this.f5356a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C1591l lVar = (C1591l) obj;
                if (!this.f5357b.mo6329b()) {
                    return;
                }
                if (m7583q(lVar)) {
                    this.f5356a.remove(lVar);
                }
            }
        }

        /* renamed from: C */
        public final boolean mo6380C() {
            return m7571F(true);
        }

        /* renamed from: D */
        public final void mo6381D(Status status) {
            C1658o.m7838c(C1572b.this.f5355q);
            for (C1591l b : this.f5356a) {
                b.mo6402b(status);
            }
            this.f5356a.clear();
        }

        /* renamed from: J */
        public final void mo6382J(C4366b bVar) {
            C1658o.m7838c(C1572b.this.f5355q);
            this.f5357b.mo6337m();
            mo6351r(bVar);
        }

        /* renamed from: a */
        public final void mo6383a() {
            C1658o.m7838c(C1572b.this.f5355q);
            if (!this.f5357b.mo6329b() && !this.f5357b.mo6333i()) {
                int b = C1572b.this.f5349k.mo6547b(C1572b.this.f5347i, this.f5357b);
                if (b != 0) {
                    mo6351r(new C4366b(b, (PendingIntent) null));
                    return;
                }
                C1575c cVar = new C1575c(this.f5357b, this.f5359d);
                if (this.f5357b.mo6338o()) {
                    this.f5364i.mo6434V0(cVar);
                }
                this.f5357b.mo6336l(cVar);
            }
        }

        /* renamed from: b */
        public final int mo6384b() {
            return this.f5363h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final boolean mo6385c() {
            return this.f5357b.mo6329b();
        }

        /* renamed from: d */
        public final boolean mo6386d() {
            return this.f5357b.mo6338o();
        }

        /* renamed from: e */
        public final void mo6387e() {
            C1658o.m7838c(C1572b.this.f5355q);
            if (this.f5365j) {
                mo6383a();
            }
        }

        /* renamed from: i */
        public final void mo6388i(C1591l lVar) {
            C1658o.m7838c(C1572b.this.f5355q);
            if (!this.f5357b.mo6329b()) {
                this.f5356a.add(lVar);
                C4366b bVar = this.f5367l;
                if (bVar == null || !bVar.mo13678i()) {
                    mo6383a();
                } else {
                    mo6351r(this.f5367l);
                }
            } else if (m7583q(lVar)) {
                m7569B();
            } else {
                this.f5356a.add(lVar);
            }
        }

        /* renamed from: j */
        public final void mo6389j(C1582e0 e0Var) {
            C1658o.m7838c(C1572b.this.f5355q);
            this.f5361f.add(e0Var);
        }

        /* renamed from: l */
        public final C1547a.C1555f mo6390l() {
            return this.f5357b;
        }

        /* renamed from: m */
        public final void mo6391m() {
            C1658o.m7838c(C1572b.this.f5355q);
            if (this.f5365j) {
                m7568A();
                mo6381D(C1572b.this.f5348j.mo13698g(C1572b.this.f5347i) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f5357b.mo6337m();
            }
        }

        /* renamed from: n */
        public final void mo6349n(int i) {
            if (Looper.myLooper() == C1572b.this.f5355q.getLooper()) {
                m7585t();
            } else {
                C1572b.this.f5355q.post(new C1594o(this));
            }
        }

        /* renamed from: r */
        public final void mo6351r(C4366b bVar) {
            C1658o.m7838c(C1572b.this.f5355q);
            C1601v vVar = this.f5364i;
            if (vVar != null) {
                vVar.mo6435W0();
            }
            mo6394y();
            C1572b.this.f5349k.mo6546a();
            m7576L(bVar);
            if (bVar.mo13673d() == 4) {
                mo6381D(C1572b.f5341s);
            } else if (this.f5356a.isEmpty()) {
                this.f5367l = bVar;
            } else if (!m7575K(bVar) && !C1572b.this.mo6378i(bVar, this.f5363h)) {
                if (bVar.mo13673d() == 18) {
                    this.f5365j = true;
                }
                if (this.f5365j) {
                    C1572b.this.f5355q.sendMessageDelayed(Message.obtain(C1572b.this.f5355q, 9, this.f5359d), C1572b.this.f5344f);
                    return;
                }
                String a = this.f5359d.mo6409a();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 38);
                sb.append("API: ");
                sb.append(a);
                sb.append(" is not available on this device.");
                mo6381D(new Status(17, sb.toString()));
            }
        }

        /* renamed from: v */
        public final void mo6392v() {
            C1658o.m7838c(C1572b.this.f5355q);
            mo6381D(C1572b.f5340r);
            this.f5360e.mo6424c();
            for (C1583f c0Var : (C1583f[]) this.f5362g.keySet().toArray(new C1583f[this.f5362g.size()])) {
                mo6388i(new C1578c0(c0Var, new C4941i()));
            }
            m7576L(new C4366b(4));
            if (this.f5357b.mo6329b()) {
                this.f5357b.mo6328a(new C1595p(this));
            }
        }

        /* renamed from: w */
        public final void mo6350w(Bundle bundle) {
            if (Looper.myLooper() == C1572b.this.f5355q.getLooper()) {
                m7584s();
            } else {
                C1572b.this.f5355q.post(new C1593n(this));
            }
        }

        /* renamed from: x */
        public final Map<C1583f<?>, C1599t> mo6393x() {
            return this.f5362g;
        }

        /* renamed from: y */
        public final void mo6394y() {
            C1658o.m7838c(C1572b.this.f5355q);
            this.f5367l = null;
        }

        /* renamed from: z */
        public final C4366b mo6395z() {
            C1658o.m7838c(C1572b.this.f5355q);
            return this.f5367l;
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.b$b */
    private static class C1574b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1580d0<?> f5369a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C4370d f5370b;

        private C1574b(C1580d0<?> d0Var, C4370d dVar) {
            this.f5369a = d0Var;
            this.f5370b = dVar;
        }

        /* synthetic */ C1574b(C1580d0 d0Var, C4370d dVar, C1592m mVar) {
            this(d0Var, dVar);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C1574b)) {
                C1574b bVar = (C1574b) obj;
                return C1655n.m7832a(this.f5369a, bVar.f5369a) && C1655n.m7832a(this.f5370b, bVar.f5370b);
            }
        }

        public final int hashCode() {
            return C1655n.m7833b(this.f5369a, this.f5370b);
        }

        public final String toString() {
            C1655n.C1656a c = C1655n.m7834c(this);
            c.mo6552a("key", this.f5369a);
            c.mo6552a("feature", this.f5370b);
            return c.toString();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.b$c */
    private class C1575c implements C1604y, C1613b.C1616c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1547a.C1555f f5371a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1580d0<?> f5372b;

        /* renamed from: c */
        private C1644j f5373c = null;

        /* renamed from: d */
        private Set<Scope> f5374d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f5375e = false;

        public C1575c(C1547a.C1555f fVar, C1580d0<?> d0Var) {
            this.f5371a = fVar;
            this.f5372b = d0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public final void m7611g() {
            C1644j jVar;
            if (this.f5375e && (jVar = this.f5373c) != null) {
                this.f5371a.mo6330d(jVar, this.f5374d);
            }
        }

        /* renamed from: a */
        public final void mo6399a(C4366b bVar) {
            C1572b.this.f5355q.post(new C1597r(this, bVar));
        }

        /* renamed from: b */
        public final void mo6400b(C4366b bVar) {
            ((C1573a) C1572b.this.f5351m.get(this.f5372b)).mo6382J(bVar);
        }

        /* renamed from: c */
        public final void mo6401c(C1644j jVar, Set<Scope> set) {
            if (jVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo6400b(new C4366b(4));
                return;
            }
            this.f5373c = jVar;
            this.f5374d = set;
            m7611g();
        }
    }

    private C1572b(Context context, Looper looper, C4372e eVar) {
        new AtomicInteger(1);
        this.f5350l = new AtomicInteger(0);
        this.f5351m = new ConcurrentHashMap(5, 0.75f, 1);
        this.f5352n = null;
        this.f5353o = new C3192b();
        this.f5354p = new C3192b();
        this.f5347i = context;
        this.f5355q = new C4413d(looper, this);
        this.f5348j = eVar;
        this.f5349k = new C1642i(eVar);
        Handler handler = this.f5355q;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: d */
    public static C1572b m7553d(Context context) {
        C1572b bVar;
        synchronized (f5342t) {
            if (f5343u == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f5343u = new C1572b(context.getApplicationContext(), handlerThread.getLooper(), C4372e.m18564m());
            }
            bVar = f5343u;
        }
        return bVar;
    }

    /* renamed from: e */
    private final void m7554e(C1561e<?> eVar) {
        C1580d0<?> e = eVar.mo6348e();
        C1573a aVar = this.f5351m.get(e);
        if (aVar == null) {
            aVar = new C1573a(eVar);
            this.f5351m.put(e, aVar);
        }
        if (aVar.mo6386d()) {
            this.f5354p.add(e);
        }
        aVar.mo6383a();
    }

    /* renamed from: b */
    public final void mo6376b(C4366b bVar, int i) {
        if (!mo6378i(bVar, i)) {
            Handler handler = this.f5355q;
            handler.sendMessage(handler.obtainMessage(5, i, 0, bVar));
        }
    }

    public boolean handleMessage(Message message) {
        C4941i<Boolean> iVar;
        Boolean bool;
        int i = message.what;
        long j = 300000;
        C1573a aVar = null;
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f5346h = j;
                this.f5355q.removeMessages(12);
                for (C1580d0<?> obtainMessage : this.f5351m.keySet()) {
                    Handler handler = this.f5355q;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f5346h);
                }
                break;
            case 2:
                C1582e0 e0Var = (C1582e0) message.obj;
                Iterator<C1580d0<?>> it = e0Var.mo6413b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C1580d0 next = it.next();
                        C1573a aVar2 = this.f5351m.get(next);
                        if (aVar2 == null) {
                            e0Var.mo6412a(next, new C4366b(13), (String) null);
                            break;
                        } else if (aVar2.mo6385c()) {
                            e0Var.mo6412a(next, C4366b.f13896j, aVar2.mo6390l().mo6335k());
                        } else if (aVar2.mo6395z() != null) {
                            e0Var.mo6412a(next, aVar2.mo6395z(), (String) null);
                        } else {
                            aVar2.mo6389j(e0Var);
                            aVar2.mo6383a();
                        }
                    }
                }
            case 3:
                for (C1573a next2 : this.f5351m.values()) {
                    next2.mo6394y();
                    next2.mo6383a();
                }
                break;
            case 4:
            case 8:
            case 13:
                C1598s sVar = (C1598s) message.obj;
                C1573a aVar3 = this.f5351m.get(sVar.f5408c.mo6348e());
                if (aVar3 == null) {
                    m7554e(sVar.f5408c);
                    aVar3 = this.f5351m.get(sVar.f5408c.mo6348e());
                }
                if (aVar3.mo6386d() && this.f5350l.get() != sVar.f5407b) {
                    sVar.f5406a.mo6402b(f5340r);
                    aVar3.mo6392v();
                    break;
                } else {
                    aVar3.mo6388i(sVar.f5406a);
                    break;
                }
            case 5:
                int i2 = message.arg1;
                C4366b bVar = (C4366b) message.obj;
                Iterator<C1573a<?>> it2 = this.f5351m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C1573a next3 = it2.next();
                        if (next3.mo6384b() == i2) {
                            aVar = next3;
                        }
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String e = this.f5348j.mo13697e(bVar.mo13673d());
                    String f = bVar.mo13675f();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(e).length() + 69 + String.valueOf(f).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(e);
                    sb2.append(": ");
                    sb2.append(f);
                    aVar.mo6381D(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (C1689l.m7958a() && (this.f5347i.getApplicationContext() instanceof Application)) {
                    C1569a.m7544c((Application) this.f5347i.getApplicationContext());
                    C1569a.m7543b().mo6361a(new C1592m(this));
                    if (!C1569a.m7543b().mo6363f(true)) {
                        this.f5346h = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m7554e((C1561e) message.obj);
                break;
            case 9:
                if (this.f5351m.containsKey(message.obj)) {
                    this.f5351m.get(message.obj).mo6387e();
                    break;
                }
                break;
            case 10:
                for (C1580d0<?> remove : this.f5354p) {
                    this.f5351m.remove(remove).mo6392v();
                }
                this.f5354p.clear();
                break;
            case 11:
                if (this.f5351m.containsKey(message.obj)) {
                    this.f5351m.get(message.obj).mo6391m();
                    break;
                }
                break;
            case 12:
                if (this.f5351m.containsKey(message.obj)) {
                    this.f5351m.get(message.obj).mo6380C();
                    break;
                }
                break;
            case 14:
                C1590k kVar = (C1590k) message.obj;
                C1580d0<?> b = kVar.mo6427b();
                if (!this.f5351m.containsKey(b)) {
                    iVar = kVar.mo6426a();
                    bool = Boolean.FALSE;
                } else {
                    boolean k = this.f5351m.get(b).m7571F(false);
                    iVar = kVar.mo6426a();
                    bool = Boolean.valueOf(k);
                }
                iVar.mo14885c(bool);
                break;
            case 15:
                C1574b bVar2 = (C1574b) message.obj;
                if (this.f5351m.containsKey(bVar2.f5369a)) {
                    this.f5351m.get(bVar2.f5369a).m7579h(bVar2);
                    break;
                }
                break;
            case 16:
                C1574b bVar3 = (C1574b) message.obj;
                if (this.f5351m.containsKey(bVar3.f5369a)) {
                    this.f5351m.get(bVar3.f5369a).m7582p(bVar3);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo6378i(C4366b bVar, int i) {
        return this.f5348j.mo13706t(this.f5347i, bVar, i);
    }

    /* renamed from: q */
    public final void mo6379q() {
        Handler handler = this.f5355q;
        handler.sendMessage(handler.obtainMessage(3));
    }
}
