package p340io.realm;

import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import p048d.p049a.p050a.p051a.p067n.p070c.C3006c;
import p340io.realm.C5632b;
import p340io.realm.exceptions.RealmException;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.c1 */
public class C5645c1 extends C3006c implements C5720n, C5650d1 {

    /* renamed from: h */
    private static final OsObjectSchemaInfo f16274h = m23396j0();

    /* renamed from: f */
    private C5646a f16275f;

    /* renamed from: g */
    private C5642c0<C3006c> f16276g;

    /* renamed from: io.realm.c1$a */
    static final class C5646a extends C5704c {

        /* renamed from: e */
        long f16277e;

        /* renamed from: f */
        long f16278f;

        /* renamed from: g */
        long f16279g;

        /* renamed from: h */
        long f16280h;

        /* renamed from: i */
        long f16281i;

        /* renamed from: j */
        long f16282j;

        C5646a(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo b = osSchemaInfo.mo16474b("FragmentData");
            this.f16278f = mo16618b("id", "id", b);
            this.f16279g = mo16618b("user_system_id", "user_system_id", b);
            this.f16280h = mo16618b("endpoint", "endpoint", b);
            this.f16281i = mo16618b("data", "data", b);
            this.f16282j = mo16618b("data_date", "data_date", b);
            this.f16277e = b.mo16429c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo16217c(C5704c cVar, C5704c cVar2) {
            C5646a aVar = (C5646a) cVar;
            C5646a aVar2 = (C5646a) cVar2;
            aVar2.f16278f = aVar.f16278f;
            aVar2.f16279g = aVar.f16279g;
            aVar2.f16280h = aVar.f16280h;
            aVar2.f16281i = aVar.f16281i;
            aVar2.f16282j = aVar.f16282j;
            aVar2.f16277e = aVar.f16277e;
        }
    }

    C5645c1() {
        this.f16276g.mo16262k();
    }

    /* renamed from: g0 */
    public static C3006c m23393g0(C5648d0 d0Var, C5646a aVar, C3006c cVar, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        C5720n nVar = map.get(cVar);
        if (nVar != null) {
            return (C3006c) nVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C3006c.class), aVar.f16277e, set);
        osObjectBuilder.mo16648o(aVar.f16278f, Long.valueOf(cVar.mo10422a()));
        osObjectBuilder.mo16648o(aVar.f16279g, Long.valueOf(cVar.mo10415O()));
        osObjectBuilder.mo16652u(aVar.f16280h, cVar.mo10413B());
        osObjectBuilder.mo16652u(aVar.f16281i, cVar.mo10414E());
        osObjectBuilder.mo16645h(aVar.f16282j, cVar.mo10429s());
        C5645c1 l0 = m23398l0(d0Var, osObjectBuilder.mo16653w());
        map.put(cVar, l0);
        return l0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p048d.p049a.p050a.p051a.p067n.p070c.C3006c m23394h0(p340io.realm.C5648d0 r8, p340io.realm.C5645c1.C5646a r9, p048d.p049a.p050a.p051a.p067n.p070c.C3006c r10, boolean r11, java.util.Map<p340io.realm.C5763l0, p340io.realm.internal.C5720n> r12, java.util.Set<p340io.realm.C5781q> r13) {
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
            d.a.a.a.n.c.c r1 = (p048d.p049a.p050a.p051a.p067n.p070c.C3006c) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0086
            java.lang.Class<d.a.a.a.n.c.c> r2 = p048d.p049a.p050a.p051a.p067n.p070c.C3006c.class
            io.realm.internal.Table r2 = r8.mo16276q0(r2)
            long r3 = r9.f16278f
            long r5 = r10.mo10422a()
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
            io.realm.c1 r1 = new io.realm.c1     // Catch:{ all -> 0x0081 }
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
            m23399m0(r1, r2, r3, r4, r5, r6)
            goto L_0x0098
        L_0x0094:
            d.a.a.a.n.c.c r7 = m23393g0(r8, r9, r10, r11, r12, r13)
        L_0x0098:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5645c1.m23394h0(io.realm.d0, io.realm.c1$a, d.a.a.a.n.c.c, boolean, java.util.Map, java.util.Set):d.a.a.a.n.c.c");
    }

    /* renamed from: i0 */
    public static C5646a m23395i0(OsSchemaInfo osSchemaInfo) {
        return new C5646a(osSchemaInfo);
    }

    /* renamed from: j0 */
    private static OsObjectSchemaInfo m23396j0() {
        OsObjectSchemaInfo.C5685b bVar = new OsObjectSchemaInfo.C5685b("FragmentData", 5, 0);
        OsObjectSchemaInfo.C5685b bVar2 = bVar;
        bVar2.mo16434c("id", RealmFieldType.INTEGER, true, true, true);
        bVar2.mo16434c("user_system_id", RealmFieldType.INTEGER, false, false, true);
        bVar2.mo16434c("endpoint", RealmFieldType.STRING, false, false, false);
        bVar2.mo16434c("data", RealmFieldType.STRING, false, false, false);
        bVar2.mo16434c("data_date", RealmFieldType.DATE, false, false, false);
        return bVar.mo16435d();
    }

    /* renamed from: k0 */
    public static OsObjectSchemaInfo m23397k0() {
        return f16274h;
    }

    /* renamed from: l0 */
    private static C5645c1 m23398l0(C5632b bVar, C5722p pVar) {
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        eVar.mo16245g(bVar, pVar, bVar.mo16219H().mo16773b(C3006c.class), false, Collections.emptyList());
        C5645c1 c1Var = new C5645c1();
        eVar.mo16239a();
        return c1Var;
    }

    /* renamed from: m0 */
    static C3006c m23399m0(C5648d0 d0Var, C5646a aVar, C3006c cVar, C3006c cVar2, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C3006c.class), aVar.f16277e, set);
        osObjectBuilder.mo16648o(aVar.f16278f, Long.valueOf(cVar2.mo10422a()));
        osObjectBuilder.mo16648o(aVar.f16279g, Long.valueOf(cVar2.mo10415O()));
        osObjectBuilder.mo16652u(aVar.f16280h, cVar2.mo10413B());
        osObjectBuilder.mo16652u(aVar.f16281i, cVar2.mo10414E());
        osObjectBuilder.mo16645h(aVar.f16282j, cVar2.mo10429s());
        osObjectBuilder.mo16654x();
        return cVar;
    }

    /* renamed from: B */
    public String mo10413B() {
        this.f16276g.mo16258e().mo16228j();
        return this.f16276g.mo16259f().mo16604v(this.f16275f.f16280h);
    }

    /* renamed from: E */
    public String mo10414E() {
        this.f16276g.mo16258e().mo16228j();
        return this.f16276g.mo16259f().mo16604v(this.f16275f.f16281i);
    }

    /* renamed from: L */
    public C5642c0<?> mo16212L() {
        return this.f16276g;
    }

    /* renamed from: O */
    public long mo10415O() {
        this.f16276g.mo16258e().mo16228j();
        return this.f16276g.mo16259f().mo16603u(this.f16275f.f16279g);
    }

    /* renamed from: Q */
    public void mo16213Q() {
        if (this.f16276g == null) {
            C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
            this.f16275f = (C5646a) eVar.mo16241c();
            C5642c0<C3006c> c0Var = new C5642c0<>(this);
            this.f16276g = c0Var;
            c0Var.mo16264m(eVar.mo16243e());
            this.f16276g.mo16265n(eVar.mo16244f());
            this.f16276g.mo16261j(eVar.mo16240b());
            this.f16276g.mo16263l(eVar.mo16242d());
        }
    }

    /* renamed from: W */
    public void mo10418W(String str) {
        if (!this.f16276g.mo16260g()) {
            this.f16276g.mo16258e().mo16228j();
            if (str == null) {
                this.f16276g.mo16259f().mo16347m(this.f16275f.f16281i);
            } else {
                this.f16276g.mo16259f().mo16590h(this.f16275f.f16281i, str);
            }
        } else if (this.f16276g.mo16256c()) {
            C5722p f = this.f16276g.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16275f.f16281i, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16275f.f16281i, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: X */
    public void mo10419X(Date date) {
        if (!this.f16276g.mo16260g()) {
            this.f16276g.mo16258e().mo16228j();
            if (date == null) {
                this.f16276g.mo16259f().mo16347m(this.f16275f.f16282j);
            } else {
                this.f16276g.mo16259f().mo16585G(this.f16275f.f16282j, date);
            }
        } else if (this.f16276g.mo16256c()) {
            C5722p f = this.f16276g.mo16259f();
            if (date == null) {
                f.mo16592k().mo16566x(this.f16275f.f16282j, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16563u(this.f16275f.f16282j, f.mo16589g(), date, true);
            }
        }
    }

    /* renamed from: Y */
    public void mo10420Y(String str) {
        if (!this.f16276g.mo16260g()) {
            this.f16276g.mo16258e().mo16228j();
            if (str == null) {
                this.f16276g.mo16259f().mo16347m(this.f16275f.f16280h);
            } else {
                this.f16276g.mo16259f().mo16590h(this.f16275f.f16280h, str);
            }
        } else if (this.f16276g.mo16256c()) {
            C5722p f = this.f16276g.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16275f.f16280h, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16275f.f16280h, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: Z */
    public void mo10421Z(long j) {
        if (!this.f16276g.mo16260g()) {
            this.f16276g.mo16258e().mo16228j();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    /* renamed from: a */
    public long mo10422a() {
        this.f16276g.mo16258e().mo16228j();
        return this.f16276g.mo16259f().mo16603u(this.f16275f.f16278f);
    }

    /* renamed from: a0 */
    public void mo10423a0(long j) {
        if (!this.f16276g.mo16260g()) {
            this.f16276g.mo16258e().mo16228j();
            this.f16276g.mo16259f().mo16607z(this.f16275f.f16279g, j);
        } else if (this.f16276g.mo16256c()) {
            C5722p f = this.f16276g.mo16259f();
            f.mo16592k().mo16565w(this.f16275f.f16279g, f.mo16589g(), j, true);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5645c1.class != obj.getClass()) {
            return false;
        }
        C5645c1 c1Var = (C5645c1) obj;
        String D = this.f16276g.mo16258e().mo16218D();
        String D2 = c1Var.f16276g.mo16258e().mo16218D();
        if (D == null ? D2 != null : !D.equals(D2)) {
            return false;
        }
        String m = this.f16276g.mo16259f().mo16592k().mo16555m();
        String m2 = c1Var.f16276g.mo16259f().mo16592k().mo16555m();
        if (m == null ? m2 == null : m.equals(m2)) {
            return this.f16276g.mo16259f().mo16589g() == c1Var.f16276g.mo16259f().mo16589g();
        }
        return false;
    }

    public int hashCode() {
        String D = this.f16276g.mo16258e().mo16218D();
        String m = this.f16276g.mo16259f().mo16592k().mo16555m();
        long g = this.f16276g.mo16259f().mo16589g();
        int i = 0;
        int hashCode = (527 + (D != null ? D.hashCode() : 0)) * 31;
        if (m != null) {
            i = m.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((g >>> 32) ^ g));
    }

    /* renamed from: s */
    public Date mo10429s() {
        this.f16276g.mo16258e().mo16228j();
        if (this.f16276g.mo16259f().mo16345E(this.f16275f.f16282j)) {
            return null;
        }
        return this.f16276g.mo16259f().mo16583B(this.f16275f.f16282j);
    }

    public String toString() {
        if (!C5771n0.m24128T(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("FragmentData = proxy[");
        sb.append("{id:");
        sb.append(mo10422a());
        sb.append("}");
        sb.append(",");
        sb.append("{user_system_id:");
        sb.append(mo10415O());
        sb.append("}");
        sb.append(",");
        sb.append("{endpoint:");
        Object obj = "null";
        sb.append(mo10413B() != null ? mo10413B() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{data:");
        sb.append(mo10414E() != null ? mo10414E() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{data_date:");
        Object obj2 = obj;
        if (mo10429s() != null) {
            obj2 = mo10429s();
        }
        sb.append(obj2);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
