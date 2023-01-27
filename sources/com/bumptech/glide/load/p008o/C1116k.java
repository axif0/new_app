package com.bumptech.glide.load.p008o;

import android.util.Log;
import com.bumptech.glide.C0967d;
import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1006m;
import com.bumptech.glide.load.p008o.C1101h;
import com.bumptech.glide.load.p008o.C1132p;
import com.bumptech.glide.load.p008o.p010b0.C1066a;
import com.bumptech.glide.load.p008o.p010b0.C1069b;
import com.bumptech.glide.load.p008o.p010b0.C1079h;
import com.bumptech.glide.load.p008o.p011c0.C1089a;
import com.bumptech.glide.p025q.C1366g;
import com.bumptech.glide.p029s.C1397f;
import com.bumptech.glide.p029s.C1401j;
import com.bumptech.glide.p029s.p030l.C1404a;
import java.util.Map;
import java.util.concurrent.Executor;
import p086f.p111h.p121l.C3346e;

/* renamed from: com.bumptech.glide.load.o.k */
public class C1116k implements C1129m, C1079h.C1080a, C1132p.C1133a {

    /* renamed from: i */
    private static final boolean f4197i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C1137s f4198a;

    /* renamed from: b */
    private final C1131o f4199b;

    /* renamed from: c */
    private final C1079h f4200c;

    /* renamed from: d */
    private final C1119b f4201d;

    /* renamed from: e */
    private final C1144y f4202e;

    /* renamed from: f */
    private final C1121c f4203f;

    /* renamed from: g */
    private final C1117a f4204g;

    /* renamed from: h */
    private final C1035a f4205h;

    /* renamed from: com.bumptech.glide.load.o.k$a */
    static class C1117a {

        /* renamed from: a */
        final C1101h.C1106e f4206a;

        /* renamed from: b */
        final C3346e<C1101h<?>> f4207b = C1404a.m6996d(150, new C1118a());

        /* renamed from: c */
        private int f4208c;

        /* renamed from: com.bumptech.glide.load.o.k$a$a */
        class C1118a implements C1404a.C1408d<C1101h<?>> {
            C1118a() {
            }

            /* renamed from: b */
            public C1101h<?> mo5304a() {
                C1117a aVar = C1117a.this;
                return new C1101h<>(aVar.f4206a, aVar.f4207b);
            }
        }

        C1117a(C1101h.C1106e eVar) {
            this.f4206a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C1101h<R> mo5387a(C0967d dVar, Object obj, C1130n nVar, C0998g gVar, int i, int i2, Class<?> cls, Class<R> cls2, C0969f fVar, C1112j jVar, Map<Class<?>, C1006m<?>> map, boolean z, boolean z2, boolean z3, C1002i iVar, C1101h.C1103b<R> bVar) {
            C1101h<R> b = this.f4207b.mo5909b();
            C1401j.m6972d(b);
            C1101h<R> hVar = b;
            int i3 = this.f4208c;
            int i4 = i3;
            this.f4208c = i3 + 1;
            hVar.mo5362t(dVar, obj, nVar, gVar, i, i2, cls, cls2, fVar, jVar, map, z, z2, z3, iVar, bVar, i4);
            return hVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.k$b */
    static class C1119b {

        /* renamed from: a */
        final C1089a f4210a;

        /* renamed from: b */
        final C1089a f4211b;

        /* renamed from: c */
        final C1089a f4212c;

        /* renamed from: d */
        final C1089a f4213d;

        /* renamed from: e */
        final C1129m f4214e;

        /* renamed from: f */
        final C1132p.C1133a f4215f;

        /* renamed from: g */
        final C3346e<C1123l<?>> f4216g = C1404a.m6996d(150, new C1120a());

        /* renamed from: com.bumptech.glide.load.o.k$b$a */
        class C1120a implements C1404a.C1408d<C1123l<?>> {
            C1120a() {
            }

            /* renamed from: b */
            public C1123l<?> mo5304a() {
                C1119b bVar = C1119b.this;
                return new C1123l(bVar.f4210a, bVar.f4211b, bVar.f4212c, bVar.f4213d, bVar.f4214e, bVar.f4215f, bVar.f4216g);
            }
        }

        C1119b(C1089a aVar, C1089a aVar2, C1089a aVar3, C1089a aVar4, C1129m mVar, C1132p.C1133a aVar5) {
            this.f4210a = aVar;
            this.f4211b = aVar2;
            this.f4212c = aVar3;
            this.f4213d = aVar4;
            this.f4214e = mVar;
            this.f4215f = aVar5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C1123l<R> mo5389a(C0998g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
            C1123l<R> b = this.f4216g.mo5909b();
            C1401j.m6972d(b);
            C1123l<R> lVar = b;
            lVar.mo5398l(gVar, z, z2, z3, z4);
            return lVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.k$c */
    private static class C1121c implements C1101h.C1106e {

        /* renamed from: a */
        private final C1066a.C1067a f4218a;

        /* renamed from: b */
        private volatile C1066a f4219b;

        C1121c(C1066a.C1067a aVar) {
            this.f4218a = aVar;
        }

        /* renamed from: a */
        public C1066a mo5371a() {
            if (this.f4219b == null) {
                synchronized (this) {
                    if (this.f4219b == null) {
                        this.f4219b = this.f4218a.mo5280a();
                    }
                    if (this.f4219b == null) {
                        this.f4219b = new C1069b();
                    }
                }
            }
            return this.f4219b;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.k$d */
    public class C1122d {

        /* renamed from: a */
        private final C1123l<?> f4220a;

        /* renamed from: b */
        private final C1366g f4221b;

        C1122d(C1366g gVar, C1123l<?> lVar) {
            this.f4221b = gVar;
            this.f4220a = lVar;
        }

        /* renamed from: a */
        public void mo5391a() {
            synchronized (C1116k.this) {
                this.f4220a.mo5402r(this.f4221b);
            }
        }
    }

    C1116k(C1079h hVar, C1066a.C1067a aVar, C1089a aVar2, C1089a aVar3, C1089a aVar4, C1089a aVar5, C1137s sVar, C1131o oVar, C1035a aVar6, C1119b bVar, C1117a aVar7, C1144y yVar, boolean z) {
        this.f4200c = hVar;
        C1066a.C1067a aVar8 = aVar;
        this.f4203f = new C1121c(aVar);
        C1035a aVar9 = aVar6 == null ? new C1035a(z) : aVar6;
        this.f4205h = aVar9;
        aVar9.mo5214f(this);
        this.f4199b = oVar == null ? new C1131o() : oVar;
        this.f4198a = sVar == null ? new C1137s() : sVar;
        this.f4201d = bVar == null ? new C1119b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f4204g = aVar7 == null ? new C1117a(this.f4203f) : aVar7;
        this.f4202e = yVar == null ? new C1144y() : yVar;
        hVar.mo5288c(this);
    }

    public C1116k(C1079h hVar, C1066a.C1067a aVar, C1089a aVar2, C1089a aVar3, C1089a aVar4, C1089a aVar5, boolean z) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, (C1137s) null, (C1131o) null, (C1035a) null, (C1119b) null, (C1117a) null, (C1144y) null, z);
    }

    /* renamed from: e */
    private C1132p<?> m5938e(C0998g gVar) {
        C1141v<?> e = this.f4200c.mo5290e(gVar);
        if (e == null) {
            return null;
        }
        return e instanceof C1132p ? (C1132p) e : new C1132p<>(e, true, true, gVar, this);
    }

    /* renamed from: g */
    private C1132p<?> m5939g(C0998g gVar) {
        C1132p<?> e = this.f4205h.mo5213e(gVar);
        if (e != null) {
            e.mo5419a();
        }
        return e;
    }

    /* renamed from: h */
    private C1132p<?> m5940h(C0998g gVar) {
        C1132p<?> e = m5938e(gVar);
        if (e != null) {
            e.mo5419a();
            this.f4205h.mo5209a(gVar, e);
        }
        return e;
    }

    /* renamed from: i */
    private C1132p<?> m5941i(C1130n nVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        C1132p<?> g = m5939g(nVar);
        if (g != null) {
            if (f4197i) {
                m5942j("Loaded resource from active resources", j, nVar);
            }
            return g;
        }
        C1132p<?> h = m5940h(nVar);
        if (h == null) {
            return null;
        }
        if (f4197i) {
            m5942j("Loaded resource from cache", j, nVar);
        }
        return h;
    }

    /* renamed from: j */
    private static void m5942j(String str, long j, C0998g gVar) {
        Log.v("Engine", str + " in " + C1397f.m6955a(j) + "ms, key: " + gVar);
    }

    /* renamed from: l */
    private <R> C1122d m5943l(C0967d dVar, Object obj, C0998g gVar, int i, int i2, Class<?> cls, Class<R> cls2, C0969f fVar, C1112j jVar, Map<Class<?>, C1006m<?>> map, boolean z, boolean z2, C1002i iVar, boolean z3, boolean z4, boolean z5, boolean z6, C1366g gVar2, Executor executor, C1130n nVar, long j) {
        C1366g gVar3 = gVar2;
        Executor executor2 = executor;
        C1130n nVar2 = nVar;
        long j2 = j;
        C1123l<?> a = this.f4198a.mo5443a(nVar2, z6);
        if (a != null) {
            a.mo5392d(gVar3, executor2);
            if (f4197i) {
                m5942j("Added to existing load", j2, nVar2);
            }
            return new C1122d(gVar3, a);
        }
        C1123l a2 = this.f4201d.mo5389a(nVar, z3, z4, z5, z6);
        C1123l lVar = a2;
        C1130n nVar3 = nVar2;
        C1101h<R> a3 = this.f4204g.mo5387a(dVar, obj, nVar, gVar, i, i2, cls, cls2, fVar, jVar, map, z, z2, z6, iVar, a2);
        this.f4198a.mo5444c(nVar3, lVar);
        C1123l lVar2 = lVar;
        C1130n nVar4 = nVar3;
        C1366g gVar4 = gVar2;
        lVar2.mo5392d(gVar4, executor);
        lVar2.mo5403s(a3);
        if (f4197i) {
            m5942j("Started new load", j, nVar4);
        }
        return new C1122d(gVar4, lVar2);
    }

    /* renamed from: a */
    public void mo5296a(C1141v<?> vVar) {
        this.f4202e.mo5451a(vVar);
    }

    /* renamed from: b */
    public synchronized void mo5382b(C1123l<?> lVar, C0998g gVar, C1132p<?> pVar) {
        if (pVar != null) {
            if (pVar.mo5424f()) {
                this.f4205h.mo5209a(gVar, pVar);
            }
        }
        this.f4198a.mo5445d(gVar, lVar);
    }

    /* renamed from: c */
    public synchronized void mo5383c(C1123l<?> lVar, C0998g gVar) {
        this.f4198a.mo5445d(gVar, lVar);
    }

    /* renamed from: d */
    public void mo5384d(C0998g gVar, C1132p<?> pVar) {
        this.f4205h.mo5212d(gVar);
        if (pVar.mo5424f()) {
            this.f4200c.mo5289d(gVar, pVar);
        } else {
            this.f4202e.mo5451a(pVar);
        }
    }

    /* renamed from: f */
    public <R> C1122d mo5385f(C0967d dVar, Object obj, C0998g gVar, int i, int i2, Class<?> cls, Class<R> cls2, C0969f fVar, C1112j jVar, Map<Class<?>, C1006m<?>> map, boolean z, boolean z2, C1002i iVar, boolean z3, boolean z4, boolean z5, boolean z6, C1366g gVar2, Executor executor) {
        long b = f4197i ? C1397f.m6956b() : 0;
        C1130n a = this.f4199b.mo5418a(obj, gVar, i, i2, map, cls, cls2, iVar);
        synchronized (this) {
            C1132p<?> i3 = m5941i(a, z3, b);
            if (i3 == null) {
                C1122d l = m5943l(dVar, obj, gVar, i, i2, cls, cls2, fVar, jVar, map, z, z2, iVar, z3, z4, z5, z6, gVar2, executor, a, b);
                return l;
            }
            gVar2.mo5833b(i3, C0992a.MEMORY_CACHE);
            return null;
        }
    }

    /* renamed from: k */
    public void mo5386k(C1141v<?> vVar) {
        if (vVar instanceof C1132p) {
            ((C1132p) vVar).mo5425g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }
}
