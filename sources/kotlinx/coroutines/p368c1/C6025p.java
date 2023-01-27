package kotlinx.coroutines.p368c1;

import kotlinx.coroutines.C6085x0;
import p351k.C5856n;
import p351k.p355t.C5899f;
import p351k.p361v.p362c.C5941p;
import p351k.p361v.p363d.C5956g;
import p351k.p361v.p363d.C5957h;

/* renamed from: kotlinx.coroutines.c1.p */
public final class C6025p {

    /* renamed from: a */
    private static final C6021l f16980a = new C6021l("ZERO");

    /* renamed from: b */
    private static final C5941p<Object, C5899f.C5902b, Object> f16981b = C6026a.f16985f;

    /* renamed from: c */
    private static final C5941p<C6085x0<?>, C5899f.C5902b, C6085x0<?>> f16982c = C6027b.f16986f;

    /* renamed from: d */
    private static final C5941p<C6032s, C5899f.C5902b, C6032s> f16983d = C6029d.f16988f;

    /* renamed from: e */
    private static final C5941p<C6032s, C5899f.C5902b, C6032s> f16984e = C6028c.f16987f;

    /* renamed from: kotlinx.coroutines.c1.p$a */
    static final class C6026a extends C5957h implements C5941p<Object, C5899f.C5902b, Object> {

        /* renamed from: f */
        public static final C6026a f16985f = new C6026a();

        C6026a() {
            super(2);
        }

        /* renamed from: d */
        public final Object mo16966a(Object obj, C5899f.C5902b bVar) {
            C5956g.m24501f(bVar, "element");
            if (!(bVar instanceof C6085x0)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: kotlinx.coroutines.c1.p$b */
    static final class C6027b extends C5957h implements C5941p<C6085x0<?>, C5899f.C5902b, C6085x0<?>> {

        /* renamed from: f */
        public static final C6027b f16986f = new C6027b();

        C6027b() {
            super(2);
        }

        /* renamed from: d */
        public final C6085x0<?> mo16966a(C6085x0<?> x0Var, C5899f.C5902b bVar) {
            C5956g.m24501f(bVar, "element");
            if (x0Var != null) {
                return x0Var;
            }
            if (!(bVar instanceof C6085x0)) {
                bVar = null;
            }
            return (C6085x0) bVar;
        }
    }

    /* renamed from: kotlinx.coroutines.c1.p$c */
    static final class C6028c extends C5957h implements C5941p<C6032s, C5899f.C5902b, C6032s> {

        /* renamed from: f */
        public static final C6028c f16987f = new C6028c();

        C6028c() {
            super(2);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo16966a(Object obj, Object obj2) {
            C6032s sVar = (C6032s) obj;
            mo17081d(sVar, (C5899f.C5902b) obj2);
            return sVar;
        }

        /* renamed from: d */
        public final C6032s mo17081d(C6032s sVar, C5899f.C5902b bVar) {
            C5956g.m24501f(sVar, "state");
            C5956g.m24501f(bVar, "element");
            if (bVar instanceof C6085x0) {
                ((C6085x0) bVar).mo17163c(sVar.mo17096b(), sVar.mo17098d());
            }
            return sVar;
        }
    }

    /* renamed from: kotlinx.coroutines.c1.p$d */
    static final class C6029d extends C5957h implements C5941p<C6032s, C5899f.C5902b, C6032s> {

        /* renamed from: f */
        public static final C6029d f16988f = new C6029d();

        C6029d() {
            super(2);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo16966a(Object obj, Object obj2) {
            C6032s sVar = (C6032s) obj;
            mo17082d(sVar, (C5899f.C5902b) obj2);
            return sVar;
        }

        /* renamed from: d */
        public final C6032s mo17082d(C6032s sVar, C5899f.C5902b bVar) {
            C5956g.m24501f(sVar, "state");
            C5956g.m24501f(bVar, "element");
            if (bVar instanceof C6085x0) {
                sVar.mo17095a(((C6085x0) bVar).mo17165g(sVar.mo17096b()));
            }
            return sVar;
        }
    }

    /* renamed from: a */
    public static final void m24647a(C5899f fVar, Object obj) {
        C5956g.m24501f(fVar, "context");
        if (obj != f16980a) {
            if (obj instanceof C6032s) {
                ((C6032s) obj).mo17097c();
                fVar.fold(obj, f16984e);
                return;
            }
            Object fold = fVar.fold(null, f16982c);
            if (fold != null) {
                ((C6085x0) fold).mo17163c(fVar, obj);
                return;
            }
            throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    /* renamed from: b */
    public static final Object m24648b(C5899f fVar) {
        C5956g.m24501f(fVar, "context");
        Object fold = fVar.fold(0, f16981b);
        if (fold != null) {
            return fold;
        }
        C5956g.m24506k();
        throw null;
    }

    /* renamed from: c */
    public static final Object m24649c(C5899f fVar, Object obj) {
        C5956g.m24501f(fVar, "context");
        if (obj == null) {
            obj = m24648b(fVar);
        }
        if (obj == 0) {
            return f16980a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new C6032s(fVar, ((Number) obj).intValue()), f16983d);
        }
        if (obj != null) {
            return ((C6085x0) obj).mo17165g(fVar);
        }
        throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }
}
