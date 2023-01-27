package p340io.realm;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p048d.p049a.p050a.p051a.p079t.p080b.C3112d;
import p340io.realm.C5632b;
import p340io.realm.exceptions.RealmException;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.g1 */
public class C5666g1 extends C3112d implements C5720n, C5670h1 {

    /* renamed from: h */
    private static final OsObjectSchemaInfo f16328h = m23517i0();

    /* renamed from: f */
    private C5667a f16329f;

    /* renamed from: g */
    private C5642c0<C3112d> f16330g;

    /* renamed from: io.realm.g1$a */
    static final class C5667a extends C5704c {

        /* renamed from: e */
        long f16331e;

        /* renamed from: f */
        long f16332f;

        /* renamed from: g */
        long f16333g;

        /* renamed from: h */
        long f16334h;

        /* renamed from: i */
        long f16335i;

        /* renamed from: j */
        long f16336j;

        C5667a(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo b = osSchemaInfo.mo16474b("YouTubeVideo");
            this.f16332f = mo16618b("id", "id", b);
            this.f16333g = mo16618b("youtube_id", "youtube_id", b);
            this.f16334h = mo16618b("title", "title", b);
            this.f16335i = mo16618b("dateUpload", "dateUpload", b);
            this.f16336j = mo16618b("views", "views", b);
            this.f16331e = b.mo16429c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo16217c(C5704c cVar, C5704c cVar2) {
            C5667a aVar = (C5667a) cVar;
            C5667a aVar2 = (C5667a) cVar2;
            aVar2.f16332f = aVar.f16332f;
            aVar2.f16333g = aVar.f16333g;
            aVar2.f16334h = aVar.f16334h;
            aVar2.f16335i = aVar.f16335i;
            aVar2.f16336j = aVar.f16336j;
            aVar2.f16331e = aVar.f16331e;
        }
    }

    C5666g1() {
        this.f16330g.mo16262k();
    }

    /* renamed from: f0 */
    public static C3112d m23514f0(C5648d0 d0Var, C5667a aVar, C3112d dVar, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        C5720n nVar = map.get(dVar);
        if (nVar != null) {
            return (C3112d) nVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C3112d.class), aVar.f16331e, set);
        osObjectBuilder.mo16648o(aVar.f16332f, Long.valueOf(dVar.mo10721a()));
        osObjectBuilder.mo16652u(aVar.f16333g, dVar.mo10714N());
        osObjectBuilder.mo16652u(aVar.f16334h, dVar.mo10723b());
        osObjectBuilder.mo16652u(aVar.f16335i, dVar.mo10729y());
        osObjectBuilder.mo16652u(aVar.f16336j, dVar.mo10728r());
        C5666g1 k0 = m23519k0(d0Var, osObjectBuilder.mo16653w());
        map.put(dVar, k0);
        return k0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p048d.p049a.p050a.p051a.p079t.p080b.C3112d m23515g0(p340io.realm.C5648d0 r8, p340io.realm.C5666g1.C5667a r9, p048d.p049a.p050a.p051a.p079t.p080b.C3112d r10, boolean r11, java.util.Map<p340io.realm.C5763l0, p340io.realm.internal.C5720n> r12, java.util.Set<p340io.realm.C5781q> r13) {
        /*
            boolean r0 = r10 instanceof p340io.realm.internal.C5720n
            if (r0 == 0) goto L_0x0038
            r0 = r10
            io.realm.internal.n r0 = (p340io.realm.internal.C5720n) r0
            io.realm.c0 r1 = r0.mo16212L()
            io.realm.b r1 = r1.mo16258e()
            if (r1 == 0) goto L_0x0038
            io.realm.c0 r0 = r0.mo16212L()
            io.realm.b r0 = r0.mo16258e()
            long r1 = r0.f16246f
            long r3 = r8.f16246f
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0030
            java.lang.String r0 = r0.mo16218D()
            java.lang.String r1 = r8.mo16218D()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            return r10
        L_0x0030:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L_0x0038:
            io.realm.b$f r0 = p340io.realm.C5632b.f16245m
            java.lang.Object r0 = r0.get()
            io.realm.b$e r0 = (p340io.realm.C5632b.C5637e) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.n r1 = (p340io.realm.internal.C5720n) r1
            if (r1 == 0) goto L_0x004b
            d.a.a.a.t.b.d r1 = (p048d.p049a.p050a.p051a.p079t.p080b.C3112d) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0086
            java.lang.Class<d.a.a.a.t.b.d> r2 = p048d.p049a.p050a.p051a.p079t.p080b.C3112d.class
            io.realm.internal.Table r2 = r8.mo16276q0(r2)
            long r3 = r9.f16332f
            long r5 = r10.mo10721a()
            long r3 = r2.mo16546c(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0066
            r0 = 0
            goto L_0x0087
        L_0x0066:
            io.realm.internal.UncheckedRow r3 = r2.mo16558p(r3)     // Catch:{ all -> 0x0081 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0081 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.mo16245g(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0081 }
            io.realm.g1 r1 = new io.realm.g1     // Catch:{ all -> 0x0081 }
            r1.<init>()     // Catch:{ all -> 0x0081 }
            r12.put(r10, r1)     // Catch:{ all -> 0x0081 }
            r0.mo16239a()
            goto L_0x0086
        L_0x0081:
            r8 = move-exception
            r0.mo16239a()
            throw r8
        L_0x0086:
            r0 = r11
        L_0x0087:
            r7 = r1
            if (r0 == 0) goto L_0x0094
            r1 = r8
            r2 = r9
            r3 = r7
            r4 = r10
            r5 = r12
            r6 = r13
            m23520l0(r1, r2, r3, r4, r5, r6)
            goto L_0x0098
        L_0x0094:
            d.a.a.a.t.b.d r7 = m23514f0(r8, r9, r10, r11, r12, r13)
        L_0x0098:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5666g1.m23515g0(io.realm.d0, io.realm.g1$a, d.a.a.a.t.b.d, boolean, java.util.Map, java.util.Set):d.a.a.a.t.b.d");
    }

    /* renamed from: h0 */
    public static C5667a m23516h0(OsSchemaInfo osSchemaInfo) {
        return new C5667a(osSchemaInfo);
    }

    /* renamed from: i0 */
    private static OsObjectSchemaInfo m23517i0() {
        OsObjectSchemaInfo.C5685b bVar = new OsObjectSchemaInfo.C5685b("YouTubeVideo", 5, 0);
        OsObjectSchemaInfo.C5685b bVar2 = bVar;
        bVar2.mo16434c("id", RealmFieldType.INTEGER, true, true, true);
        bVar2.mo16434c("youtube_id", RealmFieldType.STRING, false, false, false);
        bVar2.mo16434c("title", RealmFieldType.STRING, false, false, false);
        bVar2.mo16434c("dateUpload", RealmFieldType.STRING, false, false, false);
        bVar2.mo16434c("views", RealmFieldType.STRING, false, false, false);
        return bVar.mo16435d();
    }

    /* renamed from: j0 */
    public static OsObjectSchemaInfo m23518j0() {
        return f16328h;
    }

    /* renamed from: k0 */
    private static C5666g1 m23519k0(C5632b bVar, C5722p pVar) {
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        eVar.mo16245g(bVar, pVar, bVar.mo16219H().mo16773b(C3112d.class), false, Collections.emptyList());
        C5666g1 g1Var = new C5666g1();
        eVar.mo16239a();
        return g1Var;
    }

    /* renamed from: l0 */
    static C3112d m23520l0(C5648d0 d0Var, C5667a aVar, C3112d dVar, C3112d dVar2, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C3112d.class), aVar.f16331e, set);
        osObjectBuilder.mo16648o(aVar.f16332f, Long.valueOf(dVar2.mo10721a()));
        osObjectBuilder.mo16652u(aVar.f16333g, dVar2.mo10714N());
        osObjectBuilder.mo16652u(aVar.f16334h, dVar2.mo10723b());
        osObjectBuilder.mo16652u(aVar.f16335i, dVar2.mo10729y());
        osObjectBuilder.mo16652u(aVar.f16336j, dVar2.mo10728r());
        osObjectBuilder.mo16654x();
        return dVar;
    }

    /* renamed from: L */
    public C5642c0<?> mo16212L() {
        return this.f16330g;
    }

    /* renamed from: N */
    public String mo10714N() {
        this.f16330g.mo16258e().mo16228j();
        return this.f16330g.mo16259f().mo16604v(this.f16329f.f16333g);
    }

    /* renamed from: Q */
    public void mo16213Q() {
        if (this.f16330g == null) {
            C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
            this.f16329f = (C5667a) eVar.mo16241c();
            C5642c0<C3112d> c0Var = new C5642c0<>(this);
            this.f16330g = c0Var;
            c0Var.mo16264m(eVar.mo16243e());
            this.f16330g.mo16265n(eVar.mo16244f());
            this.f16330g.mo16261j(eVar.mo16240b());
            this.f16330g.mo16263l(eVar.mo16242d());
        }
    }

    /* renamed from: V */
    public void mo10716V(String str) {
        if (!this.f16330g.mo16260g()) {
            this.f16330g.mo16258e().mo16228j();
            if (str == null) {
                this.f16330g.mo16259f().mo16347m(this.f16329f.f16335i);
            } else {
                this.f16330g.mo16259f().mo16590h(this.f16329f.f16335i, str);
            }
        } else if (this.f16330g.mo16256c()) {
            C5722p f = this.f16330g.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16329f.f16335i, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16329f.f16335i, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: W */
    public void mo10717W(long j) {
        if (!this.f16330g.mo16260g()) {
            this.f16330g.mo16258e().mo16228j();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    /* renamed from: X */
    public void mo10718X(String str) {
        if (!this.f16330g.mo16260g()) {
            this.f16330g.mo16258e().mo16228j();
            if (str == null) {
                this.f16330g.mo16259f().mo16347m(this.f16329f.f16334h);
            } else {
                this.f16330g.mo16259f().mo16590h(this.f16329f.f16334h, str);
            }
        } else if (this.f16330g.mo16256c()) {
            C5722p f = this.f16330g.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16329f.f16334h, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16329f.f16334h, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: Y */
    public void mo10719Y(String str) {
        if (!this.f16330g.mo16260g()) {
            this.f16330g.mo16258e().mo16228j();
            if (str == null) {
                this.f16330g.mo16259f().mo16347m(this.f16329f.f16336j);
            } else {
                this.f16330g.mo16259f().mo16590h(this.f16329f.f16336j, str);
            }
        } else if (this.f16330g.mo16256c()) {
            C5722p f = this.f16330g.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16329f.f16336j, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16329f.f16336j, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: Z */
    public void mo10720Z(String str) {
        if (!this.f16330g.mo16260g()) {
            this.f16330g.mo16258e().mo16228j();
            if (str == null) {
                this.f16330g.mo16259f().mo16347m(this.f16329f.f16333g);
            } else {
                this.f16330g.mo16259f().mo16590h(this.f16329f.f16333g, str);
            }
        } else if (this.f16330g.mo16256c()) {
            C5722p f = this.f16330g.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16329f.f16333g, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16329f.f16333g, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: a */
    public long mo10721a() {
        this.f16330g.mo16258e().mo16228j();
        return this.f16330g.mo16259f().mo16603u(this.f16329f.f16332f);
    }

    /* renamed from: b */
    public String mo10723b() {
        this.f16330g.mo16258e().mo16228j();
        return this.f16330g.mo16259f().mo16604v(this.f16329f.f16334h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5666g1.class != obj.getClass()) {
            return false;
        }
        C5666g1 g1Var = (C5666g1) obj;
        String D = this.f16330g.mo16258e().mo16218D();
        String D2 = g1Var.f16330g.mo16258e().mo16218D();
        if (D == null ? D2 != null : !D.equals(D2)) {
            return false;
        }
        String m = this.f16330g.mo16259f().mo16592k().mo16555m();
        String m2 = g1Var.f16330g.mo16259f().mo16592k().mo16555m();
        if (m == null ? m2 == null : m.equals(m2)) {
            return this.f16330g.mo16259f().mo16589g() == g1Var.f16330g.mo16259f().mo16589g();
        }
        return false;
    }

    public int hashCode() {
        String D = this.f16330g.mo16258e().mo16218D();
        String m = this.f16330g.mo16259f().mo16592k().mo16555m();
        long g = this.f16330g.mo16259f().mo16589g();
        int i = 0;
        int hashCode = (527 + (D != null ? D.hashCode() : 0)) * 31;
        if (m != null) {
            i = m.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((g >>> 32) ^ g));
    }

    /* renamed from: r */
    public String mo10728r() {
        this.f16330g.mo16258e().mo16228j();
        return this.f16330g.mo16259f().mo16604v(this.f16329f.f16336j);
    }

    public String toString() {
        if (!C5771n0.m24128T(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("YouTubeVideo = proxy[");
        sb.append("{id:");
        sb.append(mo10721a());
        sb.append("}");
        sb.append(",");
        sb.append("{youtube_id:");
        String str = "null";
        sb.append(mo10714N() != null ? mo10714N() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(mo10723b() != null ? mo10723b() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{dateUpload:");
        sb.append(mo10729y() != null ? mo10729y() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{views:");
        if (mo10728r() != null) {
            str = mo10728r();
        }
        sb.append(str);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: y */
    public String mo10729y() {
        this.f16330g.mo16258e().mo16228j();
        return this.f16330g.mo16259f().mo16604v(this.f16329f.f16335i);
    }
}
