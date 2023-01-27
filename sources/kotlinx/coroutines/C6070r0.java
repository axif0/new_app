package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C6060n0;
import kotlinx.coroutines.p368c1.C6012f;
import kotlinx.coroutines.p368c1.C6013g;
import kotlinx.coroutines.p368c1.C6018i;
import p351k.C5856n;
import p351k.C5859q;
import p351k.p355t.C5899f;
import p351k.p361v.p362c.C5937l;
import p351k.p361v.p362c.C5941p;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.r0 */
public class C6070r0 implements C6060n0 {

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f17029f = AtomicReferenceFieldUpdater.newUpdater(C6070r0.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: kotlinx.coroutines.r0$a */
    private static final class C6071a implements C6052j0 {
        private volatile Object _exceptionsHolder;

        /* renamed from: f */
        private final C6077t0 f17030f;
        public volatile boolean isCompleting;
        public volatile Throwable rootCause;

        /* renamed from: a */
        public C6077t0 mo17042a() {
            return this.f17030f;
        }

        /* renamed from: b */
        public final boolean mo17160b() {
            return this.rootCause != null;
        }

        /* renamed from: d */
        public boolean mo17043d() {
            return this.rootCause == null;
        }

        public String toString() {
            return "Finishing[cancelling=" + mo17160b() + ", completing=" + this.isCompleting + ", rootCause=" + this.rootCause + ", exceptions=" + this._exceptionsHolder + ", list=" + mo17042a() + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.r0$b */
    public static final class C6072b extends C6013g.C6014a {

        /* renamed from: d */
        final /* synthetic */ C6070r0 f17031d;

        /* renamed from: e */
        final /* synthetic */ Object f17032e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6072b(C6013g gVar, C6013g gVar2, C6070r0 r0Var, Object obj) {
            super(gVar2);
            this.f17031d = r0Var;
            this.f17032e = obj;
        }

        /* renamed from: g */
        public Object mo17050d(C6013g gVar) {
            C5956g.m24501f(gVar, "affected");
            if (this.f17031d.mo17153i() == this.f17032e) {
                return null;
            }
            return C6012f.m24597a();
        }
    }

    /* renamed from: h */
    private final boolean m24782h(Object obj, C6077t0 t0Var, C6068q0<?> q0Var) {
        int s;
        C6072b bVar = new C6072b(q0Var, q0Var, this, obj);
        do {
            Object n = t0Var.mo17063n();
            if (n != null) {
                s = ((C6013g) n).mo17065s(q0Var, t0Var, bVar);
                if (s == 1) {
                    return true;
                }
            } else {
                throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (s != 2);
        return false;
    }

    /* renamed from: j */
    private final C6068q0<?> m24783j(C5937l<? super Throwable, C5859q> lVar, boolean z) {
        boolean z2 = true;
        C6066p0 p0Var = null;
        if (z) {
            if (lVar instanceof C6066p0) {
                p0Var = lVar;
            }
            C6066p0 p0Var2 = p0Var;
            if (p0Var2 != null) {
                if (p0Var2.f17028i != this) {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                } else if (p0Var2 != null) {
                    return p0Var2;
                }
            }
            return new C6056l0(this, lVar);
        }
        if (lVar instanceof C6068q0) {
            p0Var = lVar;
        }
        C6068q0<?> q0Var = p0Var;
        if (q0Var != null) {
            if (q0Var.f17028i != this || (q0Var instanceof C6066p0)) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (q0Var != null) {
                return q0Var;
            }
        }
        return new C6058m0(this, lVar);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.i0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m24784m(kotlinx.coroutines.C5999c0 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.t0 r0 = new kotlinx.coroutines.t0
            r0.<init>()
            boolean r1 = r3.mo17043d()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.i0 r1 = new kotlinx.coroutines.i0
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f17029f
            r1.compareAndSet(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6070r0.m24784m(kotlinx.coroutines.c0):void");
    }

    /* renamed from: n */
    private final void m24785n(C6068q0<?> q0Var) {
        q0Var.mo17060f(new C6077t0());
        f17029f.compareAndSet(this, q0Var, q0Var.mo17062m());
    }

    /* renamed from: p */
    private final int m24786p(Object obj) {
        if (obj instanceof C5999c0) {
            if (((C5999c0) obj).mo17043d()) {
                return 0;
            }
            if (!f17029f.compareAndSet(this, obj, C6074s0.f17034a)) {
                return -1;
            }
            mo17155l();
            return 1;
        } else if (!(obj instanceof C6050i0)) {
            return 0;
        } else {
            if (!f17029f.compareAndSet(this, obj, ((C6050i0) obj).mo17042a())) {
                return -1;
            }
            mo17155l();
            return 1;
        }
    }

    /* renamed from: q */
    private final String m24787q(Object obj) {
        if (!(obj instanceof C6071a)) {
            return obj instanceof C6052j0 ? ((C6052j0) obj).mo17043d() ? "Active" : "New" : obj instanceof C6049i ? "Cancelled" : "Completed";
        }
        C6071a aVar = (C6071a) obj;
        return aVar.mo17160b() ? "Cancelling" : aVar.isCompleting ? "Completing" : "Active";
    }

    /* renamed from: s */
    public static /* synthetic */ CancellationException m24788s(C6070r0 r0Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return r0Var.mo17157r(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: d */
    public boolean mo17140d() {
        Object i = mo17153i();
        return (i instanceof C6052j0) && ((C6052j0) i).mo17043d();
    }

    /* renamed from: e */
    public final C5996b0 mo17141e(boolean z, boolean z2, C5937l<? super Throwable, C5859q> lVar) {
        Throwable th;
        C5956g.m24501f(lVar, "handler");
        Throwable th2 = null;
        C6068q0<?> q0Var = null;
        while (true) {
            Object i = mo17153i();
            if (i instanceof C5999c0) {
                C5999c0 c0Var = (C5999c0) i;
                if (c0Var.mo17043d()) {
                    if (q0Var == null) {
                        q0Var = m24783j(lVar, z);
                    }
                    if (f17029f.compareAndSet(this, i, q0Var)) {
                        return q0Var;
                    }
                } else {
                    m24784m(c0Var);
                }
            } else if (i instanceof C6052j0) {
                C6077t0 a = ((C6052j0) i).mo17042a();
                if (a != null) {
                    C5996b0 b0Var = C6079u0.f17037f;
                    if (!z || !(i instanceof C6071a)) {
                        th = null;
                    } else {
                        synchronized (i) {
                            th = ((C6071a) i).rootCause;
                            if (th == null) {
                                if (q0Var == null) {
                                    q0Var = m24783j(lVar, z);
                                }
                                if (m24782h(i, a, q0Var)) {
                                    if (th == null) {
                                        return q0Var;
                                    }
                                    b0Var = q0Var;
                                }
                            }
                            C5859q qVar = C5859q.f16886a;
                        }
                    }
                    if (th != null) {
                        if (z2) {
                            lVar.mo16990c(th);
                        }
                        return b0Var;
                    }
                    if (q0Var == null) {
                        q0Var = m24783j(lVar, z);
                    }
                    if (m24782h(i, a, q0Var)) {
                        return q0Var;
                    }
                } else if (i != null) {
                    m24785n((C6068q0) i);
                } else {
                    throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
                }
            } else {
                if (z2) {
                    if (!(i instanceof C6049i)) {
                        i = null;
                    }
                    C6049i iVar = (C6049i) i;
                    if (iVar != null) {
                        th2 = iVar.f17015a;
                    }
                    lVar.mo16990c(th2);
                }
                return C6079u0.f17037f;
            }
        }
    }

    /* renamed from: f */
    public final CancellationException mo17142f() {
        Object i = mo17153i();
        if (i instanceof C6071a) {
            Throwable th = ((C6071a) i).rootCause;
            if (th != null) {
                CancellationException r = mo17157r(th, C6082w.m24816a(this) + " is cancelling");
                if (r != null) {
                    return r;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (i instanceof C6052j0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (i instanceof C6049i) {
            return m24788s(this, ((C6049i) i).f17015a, (String) null, 1, (Object) null);
        } else {
            return new C6064o0(C6082w.m24816a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    public <R> R fold(R r, C5941p<? super R, ? super C5899f.C5902b, ? extends R> pVar) {
        C5956g.m24501f(pVar, "operation");
        return C6060n0.C6061a.m24764a(this, r, pVar);
    }

    public <E extends C5899f.C5902b> E get(C5899f.C5904c<E> cVar) {
        C5956g.m24501f(cVar, "key");
        return C6060n0.C6061a.m24765b(this, cVar);
    }

    public final C5899f.C5904c<?> getKey() {
        return C6060n0.f17024e;
    }

    /* renamed from: i */
    public final Object mo17153i() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C6018i)) {
                return obj;
            }
            ((C6018i) obj).mo17048a(this);
        }
    }

    /* renamed from: k */
    public String mo17154k() {
        return C6082w.m24816a(this);
    }

    /* renamed from: l */
    public void mo17155l() {
    }

    public C5899f minusKey(C5899f.C5904c<?> cVar) {
        C5956g.m24501f(cVar, "key");
        return C6060n0.C6061a.m24767d(this, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d A[ADDED_TO_REGION] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17156o(kotlinx.coroutines.C6068q0<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "node"
            p351k.p361v.p363d.C5956g.m24501f(r4, r0)
        L_0x0005:
            java.lang.Object r0 = r3.mo17153i()
            boolean r1 = r0 instanceof kotlinx.coroutines.C6068q0
            if (r1 == 0) goto L_0x001d
            if (r0 == r4) goto L_0x0010
            return
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f17029f
            kotlinx.coroutines.c0 r2 = kotlinx.coroutines.C6074s0.f17034a
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L_0x0005
            return
        L_0x001d:
            boolean r1 = r0 instanceof kotlinx.coroutines.C6052j0
            if (r1 == 0) goto L_0x002c
            kotlinx.coroutines.j0 r0 = (kotlinx.coroutines.C6052j0) r0
            kotlinx.coroutines.t0 r0 = r0.mo17042a()
            if (r0 == 0) goto L_0x002c
            r4.mo17059q()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6070r0.mo17156o(kotlinx.coroutines.q0):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final CancellationException mo17157r(Throwable th, String str) {
        C5956g.m24501f(th, "$this$toCancellationException");
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                str = C6082w.m24816a(th) + " was cancelled";
            }
            cancellationException = new C6064o0(str, th, this);
        }
        return cancellationException;
    }

    public final boolean start() {
        int p;
        do {
            p = m24786p(mo17153i());
            if (p == 0) {
                return false;
            }
        } while (p != 1);
        return true;
    }

    /* renamed from: t */
    public final String mo17158t() {
        return mo17154k() + '{' + m24787q(mo17153i()) + '}';
    }

    public String toString() {
        return mo17158t() + '@' + C6082w.m24817b(this);
    }
}
