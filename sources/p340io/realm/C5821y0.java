package p340io.realm;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p048d.p049a.p050a.p051a.p067n.p070c.C3004a;
import p340io.realm.C5632b;
import p340io.realm.exceptions.RealmException;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.y0 */
public class C5821y0 extends C3004a implements C5720n, C5824z0 {

    /* renamed from: i */
    private static final OsObjectSchemaInfo f16861i = m24301n0();

    /* renamed from: g */
    private C5822a f16862g;

    /* renamed from: h */
    private C5642c0<C3004a> f16863h;

    /* renamed from: io.realm.y0$a */
    static final class C5822a extends C5704c {

        /* renamed from: e */
        long f16864e;

        /* renamed from: f */
        long f16865f;

        /* renamed from: g */
        long f16866g;

        /* renamed from: h */
        long f16867h;

        /* renamed from: i */
        long f16868i;

        /* renamed from: j */
        long f16869j;

        /* renamed from: k */
        long f16870k;

        C5822a(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo b = osSchemaInfo.mo16474b("AcademicCalendar");
            this.f16865f = mo16618b("id", "id", b);
            this.f16866g = mo16618b("date", "date", b);
            this.f16867h = mo16618b("eventDay", "eventDay", b);
            this.f16868i = mo16618b("event", "event", b);
            this.f16869j = mo16618b("year", "year", b);
            this.f16870k = mo16618b("semester", "semester", b);
            this.f16864e = b.mo16429c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo16217c(C5704c cVar, C5704c cVar2) {
            C5822a aVar = (C5822a) cVar;
            C5822a aVar2 = (C5822a) cVar2;
            aVar2.f16865f = aVar.f16865f;
            aVar2.f16866g = aVar.f16866g;
            aVar2.f16867h = aVar.f16867h;
            aVar2.f16868i = aVar.f16868i;
            aVar2.f16869j = aVar.f16869j;
            aVar2.f16870k = aVar.f16870k;
            aVar2.f16864e = aVar.f16864e;
        }
    }

    C5821y0() {
        this.f16863h.mo16262k();
    }

    /* renamed from: k0 */
    public static C3004a m24298k0(C5648d0 d0Var, C5822a aVar, C3004a aVar2, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        C5720n nVar = map.get(aVar2);
        if (nVar != null) {
            return (C3004a) nVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C3004a.class), aVar.f16864e, set);
        osObjectBuilder.mo16648o(aVar.f16865f, Long.valueOf(aVar2.mo10366a()));
        osObjectBuilder.mo16652u(aVar.f16866g, aVar2.mo10358J());
        osObjectBuilder.mo16652u(aVar.f16867h, aVar2.mo10359K());
        osObjectBuilder.mo16652u(aVar.f16868i, aVar2.mo10377u());
        osObjectBuilder.mo16652u(aVar.f16869j, aVar2.mo10378x());
        osObjectBuilder.mo16652u(aVar.f16870k, aVar2.mo10357F());
        C5821y0 p0 = m24303p0(d0Var, osObjectBuilder.mo16653w());
        map.put(aVar2, p0);
        return p0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p048d.p049a.p050a.p051a.p067n.p070c.C3004a m24299l0(p340io.realm.C5648d0 r8, p340io.realm.C5821y0.C5822a r9, p048d.p049a.p050a.p051a.p067n.p070c.C3004a r10, boolean r11, java.util.Map<p340io.realm.C5763l0, p340io.realm.internal.C5720n> r12, java.util.Set<p340io.realm.C5781q> r13) {
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
            d.a.a.a.n.c.a r1 = (p048d.p049a.p050a.p051a.p067n.p070c.C3004a) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0086
            java.lang.Class<d.a.a.a.n.c.a> r2 = p048d.p049a.p050a.p051a.p067n.p070c.C3004a.class
            io.realm.internal.Table r2 = r8.mo16276q0(r2)
            long r3 = r9.f16865f
            long r5 = r10.mo10366a()
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
            io.realm.y0 r1 = new io.realm.y0     // Catch:{ all -> 0x0081 }
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
            m24304q0(r1, r2, r3, r4, r5, r6)
            goto L_0x0098
        L_0x0094:
            d.a.a.a.n.c.a r7 = m24298k0(r8, r9, r10, r11, r12, r13)
        L_0x0098:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5821y0.m24299l0(io.realm.d0, io.realm.y0$a, d.a.a.a.n.c.a, boolean, java.util.Map, java.util.Set):d.a.a.a.n.c.a");
    }

    /* renamed from: m0 */
    public static C5822a m24300m0(OsSchemaInfo osSchemaInfo) {
        return new C5822a(osSchemaInfo);
    }

    /* renamed from: n0 */
    private static OsObjectSchemaInfo m24301n0() {
        OsObjectSchemaInfo.C5685b bVar = new OsObjectSchemaInfo.C5685b("AcademicCalendar", 6, 0);
        OsObjectSchemaInfo.C5685b bVar2 = bVar;
        bVar2.mo16434c("id", RealmFieldType.INTEGER, true, true, true);
        bVar2.mo16434c("date", RealmFieldType.STRING, false, false, false);
        bVar2.mo16434c("eventDay", RealmFieldType.STRING, false, false, false);
        bVar2.mo16434c("event", RealmFieldType.STRING, false, false, false);
        bVar2.mo16434c("year", RealmFieldType.STRING, false, false, false);
        bVar2.mo16434c("semester", RealmFieldType.STRING, false, false, false);
        return bVar.mo16435d();
    }

    /* renamed from: o0 */
    public static OsObjectSchemaInfo m24302o0() {
        return f16861i;
    }

    /* renamed from: p0 */
    private static C5821y0 m24303p0(C5632b bVar, C5722p pVar) {
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        eVar.mo16245g(bVar, pVar, bVar.mo16219H().mo16773b(C3004a.class), false, Collections.emptyList());
        C5821y0 y0Var = new C5821y0();
        eVar.mo16239a();
        return y0Var;
    }

    /* renamed from: q0 */
    static C3004a m24304q0(C5648d0 d0Var, C5822a aVar, C3004a aVar2, C3004a aVar3, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C3004a.class), aVar.f16864e, set);
        osObjectBuilder.mo16648o(aVar.f16865f, Long.valueOf(aVar3.mo10366a()));
        osObjectBuilder.mo16652u(aVar.f16866g, aVar3.mo10358J());
        osObjectBuilder.mo16652u(aVar.f16867h, aVar3.mo10359K());
        osObjectBuilder.mo16652u(aVar.f16868i, aVar3.mo10377u());
        osObjectBuilder.mo16652u(aVar.f16869j, aVar3.mo10378x());
        osObjectBuilder.mo16652u(aVar.f16870k, aVar3.mo10357F());
        osObjectBuilder.mo16654x();
        return aVar2;
    }

    /* renamed from: F */
    public String mo10357F() {
        this.f16863h.mo16258e().mo16228j();
        return this.f16863h.mo16259f().mo16604v(this.f16862g.f16870k);
    }

    /* renamed from: J */
    public String mo10358J() {
        this.f16863h.mo16258e().mo16228j();
        return this.f16863h.mo16259f().mo16604v(this.f16862g.f16866g);
    }

    /* renamed from: K */
    public String mo10359K() {
        this.f16863h.mo16258e().mo16228j();
        return this.f16863h.mo16259f().mo16604v(this.f16862g.f16867h);
    }

    /* renamed from: L */
    public C5642c0<?> mo16212L() {
        return this.f16863h;
    }

    /* renamed from: Q */
    public void mo16213Q() {
        if (this.f16863h == null) {
            C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
            this.f16862g = (C5822a) eVar.mo16241c();
            C5642c0<C3004a> c0Var = new C5642c0<>(this);
            this.f16863h = c0Var;
            c0Var.mo16264m(eVar.mo16243e());
            this.f16863h.mo16265n(eVar.mo16244f());
            this.f16863h.mo16261j(eVar.mo16240b());
            this.f16863h.mo16263l(eVar.mo16242d());
        }
    }

    /* renamed from: Y */
    public void mo10364Y(String str) {
        if (!this.f16863h.mo16260g()) {
            this.f16863h.mo16258e().mo16228j();
            if (str == null) {
                this.f16863h.mo16259f().mo16347m(this.f16862g.f16866g);
            } else {
                this.f16863h.mo16259f().mo16590h(this.f16862g.f16866g, str);
            }
        } else if (this.f16863h.mo16256c()) {
            C5722p f = this.f16863h.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16862g.f16866g, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16862g.f16866g, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: Z */
    public void mo10365Z(String str) {
        if (!this.f16863h.mo16260g()) {
            this.f16863h.mo16258e().mo16228j();
            if (str == null) {
                this.f16863h.mo16259f().mo16347m(this.f16862g.f16868i);
            } else {
                this.f16863h.mo16259f().mo16590h(this.f16862g.f16868i, str);
            }
        } else if (this.f16863h.mo16256c()) {
            C5722p f = this.f16863h.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16862g.f16868i, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16862g.f16868i, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: a */
    public long mo10366a() {
        this.f16863h.mo16258e().mo16228j();
        return this.f16863h.mo16259f().mo16603u(this.f16862g.f16865f);
    }

    /* renamed from: a0 */
    public void mo10367a0(String str) {
        if (!this.f16863h.mo16260g()) {
            this.f16863h.mo16258e().mo16228j();
            if (str == null) {
                this.f16863h.mo16259f().mo16347m(this.f16862g.f16867h);
            } else {
                this.f16863h.mo16259f().mo16590h(this.f16862g.f16867h, str);
            }
        } else if (this.f16863h.mo16256c()) {
            C5722p f = this.f16863h.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16862g.f16867h, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16862g.f16867h, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: b0 */
    public void mo10368b0(long j) {
        if (!this.f16863h.mo16260g()) {
            this.f16863h.mo16258e().mo16228j();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    /* renamed from: c0 */
    public void mo10369c0(String str) {
        if (!this.f16863h.mo16260g()) {
            this.f16863h.mo16258e().mo16228j();
            if (str == null) {
                this.f16863h.mo16259f().mo16347m(this.f16862g.f16870k);
            } else {
                this.f16863h.mo16259f().mo16590h(this.f16862g.f16870k, str);
            }
        } else if (this.f16863h.mo16256c()) {
            C5722p f = this.f16863h.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16862g.f16870k, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16862g.f16870k, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: d0 */
    public void mo10370d0(String str) {
        if (!this.f16863h.mo16260g()) {
            this.f16863h.mo16258e().mo16228j();
            if (str == null) {
                this.f16863h.mo16259f().mo16347m(this.f16862g.f16869j);
            } else {
                this.f16863h.mo16259f().mo16590h(this.f16862g.f16869j, str);
            }
        } else if (this.f16863h.mo16256c()) {
            C5722p f = this.f16863h.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16862g.f16869j, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16862g.f16869j, f.mo16589g(), str, true);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5821y0.class != obj.getClass()) {
            return false;
        }
        C5821y0 y0Var = (C5821y0) obj;
        String D = this.f16863h.mo16258e().mo16218D();
        String D2 = y0Var.f16863h.mo16258e().mo16218D();
        if (D == null ? D2 != null : !D.equals(D2)) {
            return false;
        }
        String m = this.f16863h.mo16259f().mo16592k().mo16555m();
        String m2 = y0Var.f16863h.mo16259f().mo16592k().mo16555m();
        if (m == null ? m2 == null : m.equals(m2)) {
            return this.f16863h.mo16259f().mo16589g() == y0Var.f16863h.mo16259f().mo16589g();
        }
        return false;
    }

    public int hashCode() {
        String D = this.f16863h.mo16258e().mo16218D();
        String m = this.f16863h.mo16259f().mo16592k().mo16555m();
        long g = this.f16863h.mo16259f().mo16589g();
        int i = 0;
        int hashCode = (527 + (D != null ? D.hashCode() : 0)) * 31;
        if (m != null) {
            i = m.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((g >>> 32) ^ g));
    }

    public String toString() {
        if (!C5771n0.m24128T(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("AcademicCalendar = proxy[");
        sb.append("{id:");
        sb.append(mo10366a());
        sb.append("}");
        sb.append(",");
        sb.append("{date:");
        String str = "null";
        sb.append(mo10358J() != null ? mo10358J() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{eventDay:");
        sb.append(mo10359K() != null ? mo10359K() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{event:");
        sb.append(mo10377u() != null ? mo10377u() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{year:");
        sb.append(mo10378x() != null ? mo10378x() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{semester:");
        if (mo10357F() != null) {
            str = mo10357F();
        }
        sb.append(str);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public String mo10377u() {
        this.f16863h.mo16258e().mo16228j();
        return this.f16863h.mo16259f().mo16604v(this.f16862g.f16868i);
    }

    /* renamed from: x */
    public String mo10378x() {
        this.f16863h.mo16258e().mo16228j();
        return this.f16863h.mo16259f().mo16604v(this.f16862g.f16869j);
    }
}
