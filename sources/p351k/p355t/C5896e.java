package p351k.p355t;

import p351k.p355t.C5899f;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.t.e */
public interface C5896e extends C5899f.C5902b {

    /* renamed from: c */
    public static final C5898b f16896c = C5898b.f16897a;

    /* renamed from: k.t.e$a */
    public static final class C5897a {
        /* renamed from: a */
        public static <E extends C5899f.C5902b> E m24434a(C5896e eVar, C5899f.C5904c<E> cVar) {
            C5956g.m24500e(cVar, "key");
            if (cVar instanceof C5892b) {
                C5892b bVar = (C5892b) cVar;
                if (!bVar.mo16961a(eVar.getKey())) {
                    return null;
                }
                E b = bVar.mo16962b(eVar);
                if (!(b instanceof C5899f.C5902b)) {
                    return null;
                }
                return b;
            } else if (C5896e.f16896c != cVar) {
                return null;
            } else {
                if (eVar != null) {
                    return eVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type E");
            }
        }

        /* renamed from: b */
        public static C5899f m24435b(C5896e eVar, C5899f.C5904c<?> cVar) {
            C5956g.m24500e(cVar, "key");
            if (!(cVar instanceof C5892b)) {
                return C5896e.f16896c == cVar ? C5905g.f16899f : eVar;
            }
            C5892b bVar = (C5892b) cVar;
            return (!bVar.mo16961a(eVar.getKey()) || bVar.mo16962b(eVar) == null) ? eVar : C5905g.f16899f;
        }

        /* renamed from: c */
        public static void m24436c(C5896e eVar, C5895d<?> dVar) {
            C5956g.m24500e(dVar, "continuation");
        }
    }

    /* renamed from: k.t.e$b */
    public static final class C5898b implements C5899f.C5904c<C5896e> {

        /* renamed from: a */
        static final /* synthetic */ C5898b f16897a = new C5898b();

        private C5898b() {
        }
    }

    /* renamed from: a */
    void mo16970a(C5895d<?> dVar);

    /* renamed from: b */
    <T> C5895d<T> mo16971b(C5895d<? super T> dVar);
}
