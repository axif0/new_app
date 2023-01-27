package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C6060n0;
import kotlinx.coroutines.p368c1.C6020k;
import p351k.C5859q;
import p351k.p355t.C5895d;
import p351k.p355t.C5899f;
import p351k.p355t.p357i.p358a.C5913d;
import p351k.p361v.p362c.C5937l;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.f */
public class C6043f<T> extends C5993a0<T> implements C6039e<T>, C5913d {

    /* renamed from: j */
    private static final AtomicIntegerFieldUpdater f17006j = AtomicIntegerFieldUpdater.newUpdater(C6043f.class, "_decision");

    /* renamed from: k */
    private static final AtomicReferenceFieldUpdater f17007k = AtomicReferenceFieldUpdater.newUpdater(C6043f.class, Object.class, "_state");
    private volatile int _decision = 0;
    private volatile Object _state = C5992a.f16943f;

    /* renamed from: h */
    private final C5899f f17008h;

    /* renamed from: i */
    private final C5895d<T> f17009i;
    private volatile C5996b0 parentHandle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6043f(C5895d<? super T> dVar, int i) {
        super(i);
        C5956g.m24501f(dVar, "delegate");
        this.f17009i = dVar;
        this.f17008h = dVar.mo16969c();
    }

    /* renamed from: l */
    private final void m24716l(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: n */
    private final void m24717n(int i) {
        if (!m24723y()) {
            C6089z.m24845b(this, i);
        }
    }

    /* renamed from: o */
    private final void m24718o() {
        C5996b0 b0Var = this.parentHandle;
        if (b0Var != null) {
            b0Var.mo17041h();
            this.parentHandle = C6079u0.f17037f;
        }
    }

    /* renamed from: s */
    private final void m24719s() {
        C6060n0 n0Var;
        if (!mo17125t() && (n0Var = (C6060n0) this.f17009i.mo16969c().get(C6060n0.f17024e)) != null) {
            n0Var.start();
            C5996b0 c = C6060n0.C6061a.m24766c(n0Var, true, false, new C6047h(n0Var, this), 2, (Object) null);
            this.parentHandle = c;
            if (mo17125t()) {
                c.mo17041h();
                this.parentHandle = C6079u0.f17037f;
            }
        }
    }

    /* renamed from: u */
    private final C5998c m24720u(C5937l<? super Throwable, C5859q> lVar) {
        return lVar instanceof C5998c ? (C5998c) lVar : new C6054k0(lVar);
    }

    /* renamed from: v */
    private final void m24721v(C5937l<? super Throwable, C5859q> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    /* renamed from: x */
    private final C6045g m24722x(Object obj, int i) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof C6081v0)) {
                if (obj2 instanceof C6045g) {
                    C6045g gVar = (C6045g) obj2;
                    if (gVar.mo17130b()) {
                        return gVar;
                    }
                }
                m24716l(obj);
                throw null;
            }
        } while (!f17007k.compareAndSet(this, obj2, obj));
        m24718o();
        m24717n(i);
        return null;
    }

    /* renamed from: y */
    private final boolean m24723y() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f17006j.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: z */
    private final boolean m24724z() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f17006j.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: a */
    public C5913d mo16975a() {
        C5895d<T> dVar = this.f17009i;
        if (!(dVar instanceof C5913d)) {
            dVar = null;
        }
        return (C5913d) dVar;
    }

    /* renamed from: b */
    public void mo16968b(Object obj) {
        m24722x(C6051j.m24752a(obj), this.f16944g);
    }

    /* renamed from: c */
    public C5899f mo16969c() {
        return this.f17008h;
    }

    /* renamed from: d */
    public void mo17109d(C5937l<? super Throwable, C5859q> lVar) {
        Object obj;
        C5956g.m24501f(lVar, "handler");
        Throwable th = null;
        C5998c cVar = null;
        do {
            obj = this._state;
            if (obj instanceof C5992a) {
                if (cVar == null) {
                    cVar = m24720u(lVar);
                }
            } else if (obj instanceof C5998c) {
                m24721v(lVar, obj);
                throw null;
            } else if (!(obj instanceof C6045g)) {
                return;
            } else {
                if (((C6045g) obj).mo17132a()) {
                    try {
                        if (!(obj instanceof C6049i)) {
                            obj = null;
                        }
                        C6049i iVar = (C6049i) obj;
                        if (iVar != null) {
                            th = iVar.f17015a;
                        }
                        lVar.mo16990c(th);
                        return;
                    } catch (Throwable th2) {
                        C6069r.m24780a(mo16969c(), new C6059n("Exception in cancellation handler for " + this, th2));
                        return;
                    }
                } else {
                    m24721v(lVar, obj);
                    throw null;
                }
            }
        } while (!f17007k.compareAndSet(this, obj, cVar));
    }

    /* renamed from: e */
    public StackTraceElement mo16976e() {
        return null;
    }

    /* renamed from: f */
    public void mo17033f(Object obj, Throwable th) {
        C5956g.m24501f(th, "cause");
        if (obj instanceof C6055l) {
            try {
                ((C6055l) obj).f17020b.mo16990c(th);
            } catch (Throwable th2) {
                C5899f c = mo16969c();
                C6069r.m24780a(c, new C6059n("Exception in cancellation handler for " + this, th2));
            }
        }
    }

    /* renamed from: g */
    public final C5895d<T> mo17034g() {
        return this.f17009i;
    }

    /* renamed from: i */
    public <T> T mo17036i(Object obj) {
        return obj instanceof C6053k ? ((C6053k) obj).f17017a : obj instanceof C6055l ? ((C6055l) obj).f17019a : obj;
    }

    /* renamed from: k */
    public Object mo17038k() {
        return mo17124r();
    }

    /* renamed from: m */
    public boolean mo17121m(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C6081v0)) {
                return false;
            }
            z = obj instanceof C5998c;
        } while (!f17007k.compareAndSet(this, obj, new C6045g(this, th, z)));
        if (z) {
            try {
                ((C5998c) obj).mo17099a(th);
            } catch (Throwable th2) {
                C5899f c = mo16969c();
                C6069r.m24780a(c, new C6059n("Exception in cancellation handler for " + this, th2));
            }
        }
        m24718o();
        m24717n(0);
        return true;
    }

    /* renamed from: p */
    public Throwable mo17122p(C6060n0 n0Var) {
        C5956g.m24501f(n0Var, "parent");
        return n0Var.mo17142f();
    }

    /* renamed from: q */
    public final Object mo17123q() {
        C6060n0 n0Var;
        m24719s();
        if (m24724z()) {
            return C5909d.m24447b();
        }
        Object r = mo17124r();
        if (r instanceof C6049i) {
            throw C6020k.m24642j(((C6049i) r).f17015a, this);
        } else if (this.f16944g != 1 || (n0Var = (C6060n0) mo16969c().get(C6060n0.f17024e)) == null || n0Var.mo17140d()) {
            return mo17036i(r);
        } else {
            CancellationException f = n0Var.mo17142f();
            mo17033f(r, f);
            throw C6020k.m24642j(f, this);
        }
    }

    /* renamed from: r */
    public final Object mo17124r() {
        return this._state;
    }

    /* renamed from: t */
    public boolean mo17125t() {
        return !(mo17124r() instanceof C6081v0);
    }

    public String toString() {
        return mo17127w() + '(' + C6082w.m24818c(this.f17009i) + "){" + mo17124r() + "}@" + C6082w.m24817b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public String mo17127w() {
        return "CancellableContinuation";
    }
}
