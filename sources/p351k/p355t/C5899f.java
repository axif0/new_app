package p351k.p355t;

import p351k.p361v.p362c.C5941p;
import p351k.p361v.p363d.C5956g;
import p351k.p361v.p363d.C5957h;

/* renamed from: k.t.f */
public interface C5899f {

    /* renamed from: k.t.f$a */
    public static final class C5900a {

        /* renamed from: k.t.f$a$a */
        static final class C5901a extends C5957h implements C5941p<C5899f, C5902b, C5899f> {

            /* renamed from: f */
            public static final C5901a f16898f = new C5901a();

            C5901a() {
                super(2);
            }

            /* renamed from: d */
            public final C5899f mo16966a(C5899f fVar, C5902b bVar) {
                C5956g.m24500e(fVar, "acc");
                C5956g.m24500e(bVar, "element");
                C5899f minusKey = fVar.minusKey(bVar.getKey());
                if (minusKey == C5905g.f16899f) {
                    return bVar;
                }
                C5896e eVar = (C5896e) minusKey.get(C5896e.f16896c);
                if (eVar == null) {
                    return new C5893c(minusKey, bVar);
                }
                C5899f minusKey2 = minusKey.minusKey(C5896e.f16896c);
                return minusKey2 == C5905g.f16899f ? new C5893c(bVar, eVar) : new C5893c(new C5893c(minusKey2, bVar), eVar);
            }
        }

        /* renamed from: a */
        public static C5899f m24437a(C5899f fVar, C5899f fVar2) {
            C5956g.m24500e(fVar2, "context");
            return fVar2 == C5905g.f16899f ? fVar : (C5899f) fVar2.fold(fVar, C5901a.f16898f);
        }
    }

    /* renamed from: k.t.f$b */
    public interface C5902b extends C5899f {

        /* renamed from: k.t.f$b$a */
        public static final class C5903a {
            /* renamed from: a */
            public static <R> R m24440a(C5902b bVar, R r, C5941p<? super R, ? super C5902b, ? extends R> pVar) {
                C5956g.m24500e(pVar, "operation");
                return pVar.mo16966a(r, bVar);
            }

            /* renamed from: b */
            public static <E extends C5902b> E m24441b(C5902b bVar, C5904c<E> cVar) {
                C5956g.m24500e(cVar, "key");
                if (!C5956g.m24496a(bVar.getKey(), cVar)) {
                    return null;
                }
                if (bVar != null) {
                    return bVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type E");
            }

            /* renamed from: c */
            public static C5899f m24442c(C5902b bVar, C5904c<?> cVar) {
                C5956g.m24500e(cVar, "key");
                return C5956g.m24496a(bVar.getKey(), cVar) ? C5905g.f16899f : bVar;
            }

            /* renamed from: d */
            public static C5899f m24443d(C5902b bVar, C5899f fVar) {
                C5956g.m24500e(fVar, "context");
                return C5900a.m24437a(bVar, fVar);
            }
        }

        <E extends C5902b> E get(C5904c<E> cVar);

        C5904c<?> getKey();
    }

    /* renamed from: k.t.f$c */
    public interface C5904c<E extends C5902b> {
    }

    <R> R fold(R r, C5941p<? super R, ? super C5902b, ? extends R> pVar);

    <E extends C5902b> E get(C5904c<E> cVar);

    C5899f minusKey(C5904c<?> cVar);
}
