package kotlinx.coroutines.p368c1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C6080v;
import p351k.C5856n;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.c1.g */
public class C6013g {

    /* renamed from: f */
    static final AtomicReferenceFieldUpdater f16963f;

    /* renamed from: g */
    static final AtomicReferenceFieldUpdater f16964g;

    /* renamed from: h */
    private static final AtomicReferenceFieldUpdater f16965h;
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.c1.g$a */
    public static abstract class C6014a extends C6002c<C6013g> {

        /* renamed from: b */
        public C6013g f16966b;

        /* renamed from: c */
        public final C6013g f16967c;

        public C6014a(C6013g gVar) {
            C5956g.m24501f(gVar, "newNode");
            this.f16967c = gVar;
        }

        /* renamed from: f */
        public void mo17049b(C6013g gVar, Object obj) {
            C5956g.m24501f(gVar, "affected");
            boolean z = obj == null;
            C6013g gVar2 = z ? this.f16967c : this.f16966b;
            if (gVar2 != null && C6013g.f16963f.compareAndSet(gVar, this, gVar2) && z) {
                C6013g gVar3 = this.f16967c;
                C6013g gVar4 = this.f16966b;
                if (gVar4 != null) {
                    gVar3.m24602j(gVar4);
                } else {
                    C5956g.m24506k();
                    throw null;
                }
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C6013g> cls2 = C6013g.class;
        f16963f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f16964g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f16965h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* renamed from: g */
    private final C6013g m24600g(C6013g gVar, C6018i iVar) {
        Object obj;
        while (true) {
            C6013g gVar2 = null;
            while (true) {
                obj = gVar._next;
                if (obj == iVar) {
                    return gVar;
                }
                if (obj instanceof C6018i) {
                    ((C6018i) obj).mo17048a(gVar);
                } else if (!(obj instanceof C6019j)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof C6019j) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj != null) {
                            gVar2 = gVar;
                            gVar = (C6013g) obj;
                        } else {
                            throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } else if (obj2 == gVar) {
                        return null;
                    } else {
                        if (f16964g.compareAndSet(this, obj2, gVar) && !(gVar._prev instanceof C6019j)) {
                            return null;
                        }
                    }
                } else if (gVar2 != null) {
                    break;
                } else {
                    gVar = C6012f.m24598b(gVar._prev);
                }
            }
            gVar.m24604p();
            f16963f.compareAndSet(gVar2, gVar, ((C6019j) obj).f16977a);
            gVar = gVar2;
        }
    }

    /* renamed from: i */
    private final C6013g m24601i() {
        C6013g gVar = this;
        while (!(gVar instanceof C6011e)) {
            gVar = gVar.mo17062m();
            if (C6080v.m24813a()) {
                if (!(gVar != this)) {
                    throw new AssertionError();
                }
            }
        }
        return gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m24602j(C6013g gVar) {
        Object obj;
        do {
            obj = gVar._prev;
            if ((obj instanceof C6019j) || mo17061l() != gVar) {
                return;
            }
        } while (!f16964g.compareAndSet(gVar, obj, this));
        if (!(mo17061l() instanceof C6019j)) {
            return;
        }
        if (obj != null) {
            gVar.m24600g((C6013g) obj, (C6018i) null);
            return;
        }
        throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: k */
    private final void m24603k(C6013g gVar) {
        mo17064o();
        gVar.m24600g(C6012f.m24598b(this._prev), (C6018i) null);
    }

    /* renamed from: p */
    private final C6013g m24604p() {
        Object obj;
        C6013g gVar;
        do {
            obj = this._prev;
            if (obj instanceof C6019j) {
                return ((C6019j) obj).f16977a;
            }
            if (obj == this) {
                gVar = m24601i();
            } else if (obj != null) {
                gVar = (C6013g) obj;
            } else {
                throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f16964g.compareAndSet(this, obj, gVar.m24605r()));
        return (C6013g) obj;
    }

    /* renamed from: r */
    private final C6019j m24605r() {
        C6019j jVar = (C6019j) this._removedRef;
        if (jVar != null) {
            return jVar;
        }
        C6019j jVar2 = new C6019j(this);
        f16965h.lazySet(this, jVar2);
        return jVar2;
    }

    /* renamed from: f */
    public final boolean mo17060f(C6013g gVar) {
        C5956g.m24501f(gVar, "node");
        f16964g.lazySet(gVar, this);
        f16963f.lazySet(gVar, this);
        while (mo17061l() == this) {
            if (f16963f.compareAndSet(this, this, gVar)) {
                gVar.m24602j(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final Object mo17061l() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C6018i)) {
                return obj;
            }
            ((C6018i) obj).mo17048a(this);
        }
    }

    /* renamed from: m */
    public final C6013g mo17062m() {
        return C6012f.m24598b(mo17061l());
    }

    /* renamed from: n */
    public final Object mo17063n() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof C6019j) {
                return obj;
            }
            if (obj != null) {
                C6013g gVar = (C6013g) obj;
                if (gVar.mo17061l() == this) {
                    return obj;
                }
                m24600g(gVar, (C6018i) null);
            } else {
                throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    /* renamed from: o */
    public final void mo17064o() {
        Object l;
        C6013g p = m24604p();
        Object obj = this._next;
        if (obj != null) {
            C6013g gVar = ((C6019j) obj).f16977a;
            while (true) {
                C6013g gVar2 = null;
                while (true) {
                    Object l2 = gVar.mo17061l();
                    if (l2 instanceof C6019j) {
                        gVar.m24604p();
                        gVar = ((C6019j) l2).f16977a;
                    } else {
                        l = p.mo17061l();
                        if (l instanceof C6019j) {
                            if (gVar2 != null) {
                                break;
                            }
                            p = C6012f.m24598b(p._prev);
                        } else if (l != this) {
                            if (l != null) {
                                C6013g gVar3 = (C6013g) l;
                                if (gVar3 != gVar) {
                                    C6013g gVar4 = gVar3;
                                    gVar2 = p;
                                    p = gVar4;
                                } else {
                                    return;
                                }
                            } else {
                                throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                            }
                        } else if (f16963f.compareAndSet(p, this, gVar)) {
                            return;
                        }
                    }
                }
                p.m24604p();
                f16963f.compareAndSet(gVar2, p, ((C6019j) l).f16977a);
                p = gVar2;
            }
        } else {
            throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
        }
    }

    /* renamed from: q */
    public boolean mo17059q() {
        Object l;
        C6013g gVar;
        do {
            l = mo17061l();
            if ((l instanceof C6019j) || l == this) {
                return false;
            }
            if (l != null) {
                gVar = (C6013g) l;
            } else {
                throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f16963f.compareAndSet(this, l, gVar.m24605r()));
        m24603k(gVar);
        return true;
    }

    /* renamed from: s */
    public final int mo17065s(C6013g gVar, C6013g gVar2, C6014a aVar) {
        C5956g.m24501f(gVar, "node");
        C5956g.m24501f(gVar2, "next");
        C5956g.m24501f(aVar, "condAdd");
        f16964g.lazySet(gVar, this);
        f16963f.lazySet(gVar, gVar2);
        aVar.f16966b = gVar2;
        if (!f16963f.compareAndSet(this, gVar2, aVar)) {
            return 0;
        }
        return aVar.mo17048a(this) == null ? 1 : 2;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
