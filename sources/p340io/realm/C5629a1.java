package p340io.realm;

import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import p048d.p049a.p050a.p051a.p067n.p070c.C3005b;
import p340io.realm.C5632b;
import p340io.realm.exceptions.RealmException;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.a1 */
public class C5629a1 extends C3005b implements C5720n, C5640b1 {

    /* renamed from: m */
    private static final OsObjectSchemaInfo f16224m = m23309v0();

    /* renamed from: k */
    private C5630a f16225k;

    /* renamed from: l */
    private C5642c0<C3005b> f16226l;

    /* renamed from: io.realm.a1$a */
    static final class C5630a extends C5704c {

        /* renamed from: e */
        long f16227e;

        /* renamed from: f */
        long f16228f;

        /* renamed from: g */
        long f16229g;

        /* renamed from: h */
        long f16230h;

        /* renamed from: i */
        long f16231i;

        /* renamed from: j */
        long f16232j;

        /* renamed from: k */
        long f16233k;

        /* renamed from: l */
        long f16234l;

        /* renamed from: m */
        long f16235m;

        /* renamed from: n */
        long f16236n;

        /* renamed from: o */
        long f16237o;

        C5630a(OsSchemaInfo osSchemaInfo) {
            super(10);
            OsObjectSchemaInfo b = osSchemaInfo.mo16474b("FacultyNotification");
            this.f16228f = mo16618b("id", "id", b);
            this.f16229g = mo16618b("system_user_id", "system_user_id", b);
            this.f16230h = mo16618b("notification_id", "notification_id", b);
            this.f16231i = mo16618b("is_read", "is_read", b);
            this.f16232j = mo16618b("synced", "synced", b);
            this.f16233k = mo16618b("is_received", "is_received", b);
            this.f16234l = mo16618b("title", "title", b);
            this.f16235m = mo16618b("message", "message", b);
            this.f16236n = mo16618b("time", "time", b);
            this.f16237o = mo16618b("notification_time", "notification_time", b);
            this.f16227e = b.mo16429c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo16217c(C5704c cVar, C5704c cVar2) {
            C5630a aVar = (C5630a) cVar;
            C5630a aVar2 = (C5630a) cVar2;
            aVar2.f16228f = aVar.f16228f;
            aVar2.f16229g = aVar.f16229g;
            aVar2.f16230h = aVar.f16230h;
            aVar2.f16231i = aVar.f16231i;
            aVar2.f16232j = aVar.f16232j;
            aVar2.f16233k = aVar.f16233k;
            aVar2.f16234l = aVar.f16234l;
            aVar2.f16235m = aVar.f16235m;
            aVar2.f16236n = aVar.f16236n;
            aVar2.f16237o = aVar.f16237o;
            aVar2.f16227e = aVar.f16227e;
        }
    }

    C5629a1() {
        this.f16226l.mo16262k();
    }

    /* renamed from: s0 */
    public static C3005b m23306s0(C5648d0 d0Var, C5630a aVar, C3005b bVar, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        C5720n nVar = map.get(bVar);
        if (nVar != null) {
            return (C3005b) nVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C3005b.class), aVar.f16227e, set);
        osObjectBuilder.mo16648o(aVar.f16228f, Long.valueOf(bVar.mo10385a()));
        osObjectBuilder.mo16648o(aVar.f16229g, Long.valueOf(bVar.mo10398h()));
        osObjectBuilder.mo16648o(aVar.f16230h, Long.valueOf(bVar.mo10394f()));
        osObjectBuilder.mo16643a(aVar.f16231i, Boolean.valueOf(bVar.mo10402j()));
        osObjectBuilder.mo16643a(aVar.f16232j, Boolean.valueOf(bVar.mo10405l()));
        osObjectBuilder.mo16643a(aVar.f16233k, Boolean.valueOf(bVar.mo10400i()));
        osObjectBuilder.mo16652u(aVar.f16234l, bVar.mo10387b());
        osObjectBuilder.mo16652u(aVar.f16235m, bVar.mo10392e());
        osObjectBuilder.mo16652u(aVar.f16236n, bVar.mo10396g());
        osObjectBuilder.mo16645h(aVar.f16237o, bVar.mo10390d());
        C5629a1 x0 = m23311x0(d0Var, osObjectBuilder.mo16653w());
        map.put(bVar, x0);
        return x0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p048d.p049a.p050a.p051a.p067n.p070c.C3005b m23307t0(p340io.realm.C5648d0 r8, p340io.realm.C5629a1.C5630a r9, p048d.p049a.p050a.p051a.p067n.p070c.C3005b r10, boolean r11, java.util.Map<p340io.realm.C5763l0, p340io.realm.internal.C5720n> r12, java.util.Set<p340io.realm.C5781q> r13) {
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
            d.a.a.a.n.c.b r1 = (p048d.p049a.p050a.p051a.p067n.p070c.C3005b) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0086
            java.lang.Class<d.a.a.a.n.c.b> r2 = p048d.p049a.p050a.p051a.p067n.p070c.C3005b.class
            io.realm.internal.Table r2 = r8.mo16276q0(r2)
            long r3 = r9.f16228f
            long r5 = r10.mo10385a()
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
            io.realm.a1 r1 = new io.realm.a1     // Catch:{ all -> 0x0081 }
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
            m23312y0(r1, r2, r3, r4, r5, r6)
            goto L_0x0098
        L_0x0094:
            d.a.a.a.n.c.b r7 = m23306s0(r8, r9, r10, r11, r12, r13)
        L_0x0098:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5629a1.m23307t0(io.realm.d0, io.realm.a1$a, d.a.a.a.n.c.b, boolean, java.util.Map, java.util.Set):d.a.a.a.n.c.b");
    }

    /* renamed from: u0 */
    public static C5630a m23308u0(OsSchemaInfo osSchemaInfo) {
        return new C5630a(osSchemaInfo);
    }

    /* renamed from: v0 */
    private static OsObjectSchemaInfo m23309v0() {
        OsObjectSchemaInfo.C5685b bVar = new OsObjectSchemaInfo.C5685b("FacultyNotification", 10, 0);
        OsObjectSchemaInfo.C5685b bVar2 = bVar;
        bVar2.mo16434c("id", RealmFieldType.INTEGER, true, true, true);
        bVar2.mo16434c("system_user_id", RealmFieldType.INTEGER, false, false, true);
        bVar2.mo16434c("notification_id", RealmFieldType.INTEGER, false, false, true);
        bVar2.mo16434c("is_read", RealmFieldType.BOOLEAN, false, false, true);
        bVar2.mo16434c("synced", RealmFieldType.BOOLEAN, false, false, true);
        bVar2.mo16434c("is_received", RealmFieldType.BOOLEAN, false, false, true);
        bVar2.mo16434c("title", RealmFieldType.STRING, false, false, false);
        bVar2.mo16434c("message", RealmFieldType.STRING, false, false, false);
        bVar2.mo16434c("time", RealmFieldType.STRING, false, false, false);
        bVar2.mo16434c("notification_time", RealmFieldType.DATE, false, false, false);
        return bVar.mo16435d();
    }

    /* renamed from: w0 */
    public static OsObjectSchemaInfo m23310w0() {
        return f16224m;
    }

    /* renamed from: x0 */
    private static C5629a1 m23311x0(C5632b bVar, C5722p pVar) {
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        eVar.mo16245g(bVar, pVar, bVar.mo16219H().mo16773b(C3005b.class), false, Collections.emptyList());
        C5629a1 a1Var = new C5629a1();
        eVar.mo16239a();
        return a1Var;
    }

    /* renamed from: y0 */
    static C3005b m23312y0(C5648d0 d0Var, C5630a aVar, C3005b bVar, C3005b bVar2, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C3005b.class), aVar.f16227e, set);
        osObjectBuilder.mo16648o(aVar.f16228f, Long.valueOf(bVar2.mo10385a()));
        osObjectBuilder.mo16648o(aVar.f16229g, Long.valueOf(bVar2.mo10398h()));
        osObjectBuilder.mo16648o(aVar.f16230h, Long.valueOf(bVar2.mo10394f()));
        osObjectBuilder.mo16643a(aVar.f16231i, Boolean.valueOf(bVar2.mo10402j()));
        osObjectBuilder.mo16643a(aVar.f16232j, Boolean.valueOf(bVar2.mo10405l()));
        osObjectBuilder.mo16643a(aVar.f16233k, Boolean.valueOf(bVar2.mo10400i()));
        osObjectBuilder.mo16652u(aVar.f16234l, bVar2.mo10387b());
        osObjectBuilder.mo16652u(aVar.f16235m, bVar2.mo10392e());
        osObjectBuilder.mo16652u(aVar.f16236n, bVar2.mo10396g());
        osObjectBuilder.mo16645h(aVar.f16237o, bVar2.mo10390d());
        osObjectBuilder.mo16654x();
        return bVar;
    }

    /* renamed from: L */
    public C5642c0<?> mo16212L() {
        return this.f16226l;
    }

    /* renamed from: Q */
    public void mo16213Q() {
        if (this.f16226l == null) {
            C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
            this.f16225k = (C5630a) eVar.mo16241c();
            C5642c0<C3005b> c0Var = new C5642c0<>(this);
            this.f16226l = c0Var;
            c0Var.mo16264m(eVar.mo16243e());
            this.f16226l.mo16265n(eVar.mo16244f());
            this.f16226l.mo16261j(eVar.mo16240b());
            this.f16226l.mo16263l(eVar.mo16242d());
        }
    }

    /* renamed from: Y */
    public void mo10383Y(long j) {
        if (!this.f16226l.mo16260g()) {
            this.f16226l.mo16258e().mo16228j();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    /* renamed from: Z */
    public void mo10384Z(boolean z) {
        if (!this.f16226l.mo16260g()) {
            this.f16226l.mo16258e().mo16228j();
            this.f16226l.mo16259f().mo16598o(this.f16225k.f16231i, z);
        } else if (this.f16226l.mo16256c()) {
            C5722p f = this.f16226l.mo16259f();
            f.mo16592k().mo16561t(this.f16225k.f16231i, f.mo16589g(), z, true);
        }
    }

    /* renamed from: a */
    public long mo10385a() {
        this.f16226l.mo16258e().mo16228j();
        return this.f16226l.mo16259f().mo16603u(this.f16225k.f16228f);
    }

    /* renamed from: a0 */
    public void mo10386a0(boolean z) {
        if (!this.f16226l.mo16260g()) {
            this.f16226l.mo16258e().mo16228j();
            this.f16226l.mo16259f().mo16598o(this.f16225k.f16233k, z);
        } else if (this.f16226l.mo16256c()) {
            C5722p f = this.f16226l.mo16259f();
            f.mo16592k().mo16561t(this.f16225k.f16233k, f.mo16589g(), z, true);
        }
    }

    /* renamed from: b */
    public String mo10387b() {
        this.f16226l.mo16258e().mo16228j();
        return this.f16226l.mo16259f().mo16604v(this.f16225k.f16234l);
    }

    /* renamed from: b0 */
    public void mo10388b0(String str) {
        if (!this.f16226l.mo16260g()) {
            this.f16226l.mo16258e().mo16228j();
            if (str == null) {
                this.f16226l.mo16259f().mo16347m(this.f16225k.f16235m);
            } else {
                this.f16226l.mo16259f().mo16590h(this.f16225k.f16235m, str);
            }
        } else if (this.f16226l.mo16256c()) {
            C5722p f = this.f16226l.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16225k.f16235m, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16225k.f16235m, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: c0 */
    public void mo10389c0(long j) {
        if (!this.f16226l.mo16260g()) {
            this.f16226l.mo16258e().mo16228j();
            this.f16226l.mo16259f().mo16607z(this.f16225k.f16230h, j);
        } else if (this.f16226l.mo16256c()) {
            C5722p f = this.f16226l.mo16259f();
            f.mo16592k().mo16565w(this.f16225k.f16230h, f.mo16589g(), j, true);
        }
    }

    /* renamed from: d */
    public Date mo10390d() {
        this.f16226l.mo16258e().mo16228j();
        if (this.f16226l.mo16259f().mo16345E(this.f16225k.f16237o)) {
            return null;
        }
        return this.f16226l.mo16259f().mo16583B(this.f16225k.f16237o);
    }

    /* renamed from: d0 */
    public void mo10391d0(Date date) {
        if (!this.f16226l.mo16260g()) {
            this.f16226l.mo16258e().mo16228j();
            if (date == null) {
                this.f16226l.mo16259f().mo16347m(this.f16225k.f16237o);
            } else {
                this.f16226l.mo16259f().mo16585G(this.f16225k.f16237o, date);
            }
        } else if (this.f16226l.mo16256c()) {
            C5722p f = this.f16226l.mo16259f();
            if (date == null) {
                f.mo16592k().mo16566x(this.f16225k.f16237o, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16563u(this.f16225k.f16237o, f.mo16589g(), date, true);
            }
        }
    }

    /* renamed from: e */
    public String mo10392e() {
        this.f16226l.mo16258e().mo16228j();
        return this.f16226l.mo16259f().mo16604v(this.f16225k.f16235m);
    }

    /* renamed from: e0 */
    public void mo10393e0(boolean z) {
        if (!this.f16226l.mo16260g()) {
            this.f16226l.mo16258e().mo16228j();
            this.f16226l.mo16259f().mo16598o(this.f16225k.f16232j, z);
        } else if (this.f16226l.mo16256c()) {
            C5722p f = this.f16226l.mo16259f();
            f.mo16592k().mo16561t(this.f16225k.f16232j, f.mo16589g(), z, true);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5629a1.class != obj.getClass()) {
            return false;
        }
        C5629a1 a1Var = (C5629a1) obj;
        String D = this.f16226l.mo16258e().mo16218D();
        String D2 = a1Var.f16226l.mo16258e().mo16218D();
        if (D == null ? D2 != null : !D.equals(D2)) {
            return false;
        }
        String m = this.f16226l.mo16259f().mo16592k().mo16555m();
        String m2 = a1Var.f16226l.mo16259f().mo16592k().mo16555m();
        if (m == null ? m2 == null : m.equals(m2)) {
            return this.f16226l.mo16259f().mo16589g() == a1Var.f16226l.mo16259f().mo16589g();
        }
        return false;
    }

    /* renamed from: f */
    public long mo10394f() {
        this.f16226l.mo16258e().mo16228j();
        return this.f16226l.mo16259f().mo16603u(this.f16225k.f16230h);
    }

    /* renamed from: f0 */
    public void mo10395f0(long j) {
        if (!this.f16226l.mo16260g()) {
            this.f16226l.mo16258e().mo16228j();
            this.f16226l.mo16259f().mo16607z(this.f16225k.f16229g, j);
        } else if (this.f16226l.mo16256c()) {
            C5722p f = this.f16226l.mo16259f();
            f.mo16592k().mo16565w(this.f16225k.f16229g, f.mo16589g(), j, true);
        }
    }

    /* renamed from: g */
    public String mo10396g() {
        this.f16226l.mo16258e().mo16228j();
        return this.f16226l.mo16259f().mo16604v(this.f16225k.f16236n);
    }

    /* renamed from: g0 */
    public void mo10397g0(String str) {
        if (!this.f16226l.mo16260g()) {
            this.f16226l.mo16258e().mo16228j();
            if (str == null) {
                this.f16226l.mo16259f().mo16347m(this.f16225k.f16236n);
            } else {
                this.f16226l.mo16259f().mo16590h(this.f16225k.f16236n, str);
            }
        } else if (this.f16226l.mo16256c()) {
            C5722p f = this.f16226l.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16225k.f16236n, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16225k.f16236n, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: h */
    public long mo10398h() {
        this.f16226l.mo16258e().mo16228j();
        return this.f16226l.mo16259f().mo16603u(this.f16225k.f16229g);
    }

    /* renamed from: h0 */
    public void mo10399h0(String str) {
        if (!this.f16226l.mo16260g()) {
            this.f16226l.mo16258e().mo16228j();
            if (str == null) {
                this.f16226l.mo16259f().mo16347m(this.f16225k.f16234l);
            } else {
                this.f16226l.mo16259f().mo16590h(this.f16225k.f16234l, str);
            }
        } else if (this.f16226l.mo16256c()) {
            C5722p f = this.f16226l.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16225k.f16234l, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16225k.f16234l, f.mo16589g(), str, true);
            }
        }
    }

    public int hashCode() {
        String D = this.f16226l.mo16258e().mo16218D();
        String m = this.f16226l.mo16259f().mo16592k().mo16555m();
        long g = this.f16226l.mo16259f().mo16589g();
        int i = 0;
        int hashCode = (527 + (D != null ? D.hashCode() : 0)) * 31;
        if (m != null) {
            i = m.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((g >>> 32) ^ g));
    }

    /* renamed from: i */
    public boolean mo10400i() {
        this.f16226l.mo16258e().mo16228j();
        return this.f16226l.mo16259f().mo16600r(this.f16225k.f16233k);
    }

    /* renamed from: j */
    public boolean mo10402j() {
        this.f16226l.mo16258e().mo16228j();
        return this.f16226l.mo16259f().mo16600r(this.f16225k.f16231i);
    }

    /* renamed from: l */
    public boolean mo10405l() {
        this.f16226l.mo16258e().mo16228j();
        return this.f16226l.mo16259f().mo16600r(this.f16225k.f16232j);
    }

    public String toString() {
        if (!C5771n0.m24128T(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("FacultyNotification = proxy[");
        sb.append("{id:");
        sb.append(mo10385a());
        sb.append("}");
        sb.append(",");
        sb.append("{system_user_id:");
        sb.append(mo10398h());
        sb.append("}");
        sb.append(",");
        sb.append("{notification_id:");
        sb.append(mo10394f());
        sb.append("}");
        sb.append(",");
        sb.append("{is_read:");
        sb.append(mo10402j());
        sb.append("}");
        sb.append(",");
        sb.append("{synced:");
        sb.append(mo10405l());
        sb.append("}");
        sb.append(",");
        sb.append("{is_received:");
        sb.append(mo10400i());
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        Object obj = "null";
        sb.append(mo10387b() != null ? mo10387b() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{message:");
        sb.append(mo10392e() != null ? mo10392e() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{time:");
        sb.append(mo10396g() != null ? mo10396g() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{notification_time:");
        Object obj2 = obj;
        if (mo10390d() != null) {
            obj2 = mo10390d();
        }
        sb.append(obj2);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
