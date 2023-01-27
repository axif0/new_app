package p340io.realm;

import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import p048d.p049a.p050a.p051a.p067n.p070c.C3007d;
import p340io.realm.C5632b;
import p340io.realm.exceptions.RealmException;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.e1 */
public class C5653e1 extends C3007d implements C5720n, C5659f1 {

    /* renamed from: m */
    private static final OsObjectSchemaInfo f16290m = m23449v0();

    /* renamed from: k */
    private C5654a f16291k;

    /* renamed from: l */
    private C5642c0<C3007d> f16292l;

    /* renamed from: io.realm.e1$a */
    static final class C5654a extends C5704c {

        /* renamed from: e */
        long f16293e;

        /* renamed from: f */
        long f16294f;

        /* renamed from: g */
        long f16295g;

        /* renamed from: h */
        long f16296h;

        /* renamed from: i */
        long f16297i;

        /* renamed from: j */
        long f16298j;

        /* renamed from: k */
        long f16299k;

        /* renamed from: l */
        long f16300l;

        /* renamed from: m */
        long f16301m;

        /* renamed from: n */
        long f16302n;

        /* renamed from: o */
        long f16303o;

        C5654a(OsSchemaInfo osSchemaInfo) {
            super(10);
            OsObjectSchemaInfo b = osSchemaInfo.mo16474b("Notification");
            this.f16294f = mo16618b("id", "id", b);
            this.f16295g = mo16618b("system_user_id", "system_user_id", b);
            this.f16296h = mo16618b("notification_id", "notification_id", b);
            this.f16297i = mo16618b("is_read", "is_read", b);
            this.f16298j = mo16618b("synced", "synced", b);
            this.f16299k = mo16618b("is_received", "is_received", b);
            this.f16300l = mo16618b("title", "title", b);
            this.f16301m = mo16618b("message", "message", b);
            this.f16302n = mo16618b("time", "time", b);
            this.f16303o = mo16618b("notification_time", "notification_time", b);
            this.f16293e = b.mo16429c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo16217c(C5704c cVar, C5704c cVar2) {
            C5654a aVar = (C5654a) cVar;
            C5654a aVar2 = (C5654a) cVar2;
            aVar2.f16294f = aVar.f16294f;
            aVar2.f16295g = aVar.f16295g;
            aVar2.f16296h = aVar.f16296h;
            aVar2.f16297i = aVar.f16297i;
            aVar2.f16298j = aVar.f16298j;
            aVar2.f16299k = aVar.f16299k;
            aVar2.f16300l = aVar.f16300l;
            aVar2.f16301m = aVar.f16301m;
            aVar2.f16302n = aVar.f16302n;
            aVar2.f16303o = aVar.f16303o;
            aVar2.f16293e = aVar.f16293e;
        }
    }

    C5653e1() {
        this.f16292l.mo16262k();
    }

    /* renamed from: s0 */
    public static C3007d m23446s0(C5648d0 d0Var, C5654a aVar, C3007d dVar, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        C5720n nVar = map.get(dVar);
        if (nVar != null) {
            return (C3007d) nVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C3007d.class), aVar.f16293e, set);
        osObjectBuilder.mo16648o(aVar.f16294f, Long.valueOf(dVar.mo10436a()));
        osObjectBuilder.mo16648o(aVar.f16295g, Long.valueOf(dVar.mo10449h()));
        osObjectBuilder.mo16648o(aVar.f16296h, Long.valueOf(dVar.mo10445f()));
        osObjectBuilder.mo16643a(aVar.f16297i, Boolean.valueOf(dVar.mo10453j()));
        osObjectBuilder.mo16643a(aVar.f16298j, Boolean.valueOf(dVar.mo10456l()));
        osObjectBuilder.mo16643a(aVar.f16299k, Boolean.valueOf(dVar.mo10451i()));
        osObjectBuilder.mo16652u(aVar.f16300l, dVar.mo10438b());
        osObjectBuilder.mo16652u(aVar.f16301m, dVar.mo10443e());
        osObjectBuilder.mo16652u(aVar.f16302n, dVar.mo10447g());
        osObjectBuilder.mo16645h(aVar.f16303o, dVar.mo10441d());
        C5653e1 x0 = m23451x0(d0Var, osObjectBuilder.mo16653w());
        map.put(dVar, x0);
        return x0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p048d.p049a.p050a.p051a.p067n.p070c.C3007d m23447t0(p340io.realm.C5648d0 r8, p340io.realm.C5653e1.C5654a r9, p048d.p049a.p050a.p051a.p067n.p070c.C3007d r10, boolean r11, java.util.Map<p340io.realm.C5763l0, p340io.realm.internal.C5720n> r12, java.util.Set<p340io.realm.C5781q> r13) {
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
            d.a.a.a.n.c.d r1 = (p048d.p049a.p050a.p051a.p067n.p070c.C3007d) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0086
            java.lang.Class<d.a.a.a.n.c.d> r2 = p048d.p049a.p050a.p051a.p067n.p070c.C3007d.class
            io.realm.internal.Table r2 = r8.mo16276q0(r2)
            long r3 = r9.f16294f
            long r5 = r10.mo10436a()
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
            io.realm.e1 r1 = new io.realm.e1     // Catch:{ all -> 0x0081 }
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
            m23452y0(r1, r2, r3, r4, r5, r6)
            goto L_0x0098
        L_0x0094:
            d.a.a.a.n.c.d r7 = m23446s0(r8, r9, r10, r11, r12, r13)
        L_0x0098:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5653e1.m23447t0(io.realm.d0, io.realm.e1$a, d.a.a.a.n.c.d, boolean, java.util.Map, java.util.Set):d.a.a.a.n.c.d");
    }

    /* renamed from: u0 */
    public static C5654a m23448u0(OsSchemaInfo osSchemaInfo) {
        return new C5654a(osSchemaInfo);
    }

    /* renamed from: v0 */
    private static OsObjectSchemaInfo m23449v0() {
        OsObjectSchemaInfo.C5685b bVar = new OsObjectSchemaInfo.C5685b("Notification", 10, 0);
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
    public static OsObjectSchemaInfo m23450w0() {
        return f16290m;
    }

    /* renamed from: x0 */
    private static C5653e1 m23451x0(C5632b bVar, C5722p pVar) {
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        eVar.mo16245g(bVar, pVar, bVar.mo16219H().mo16773b(C3007d.class), false, Collections.emptyList());
        C5653e1 e1Var = new C5653e1();
        eVar.mo16239a();
        return e1Var;
    }

    /* renamed from: y0 */
    static C3007d m23452y0(C5648d0 d0Var, C5654a aVar, C3007d dVar, C3007d dVar2, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C3007d.class), aVar.f16293e, set);
        osObjectBuilder.mo16648o(aVar.f16294f, Long.valueOf(dVar2.mo10436a()));
        osObjectBuilder.mo16648o(aVar.f16295g, Long.valueOf(dVar2.mo10449h()));
        osObjectBuilder.mo16648o(aVar.f16296h, Long.valueOf(dVar2.mo10445f()));
        osObjectBuilder.mo16643a(aVar.f16297i, Boolean.valueOf(dVar2.mo10453j()));
        osObjectBuilder.mo16643a(aVar.f16298j, Boolean.valueOf(dVar2.mo10456l()));
        osObjectBuilder.mo16643a(aVar.f16299k, Boolean.valueOf(dVar2.mo10451i()));
        osObjectBuilder.mo16652u(aVar.f16300l, dVar2.mo10438b());
        osObjectBuilder.mo16652u(aVar.f16301m, dVar2.mo10443e());
        osObjectBuilder.mo16652u(aVar.f16302n, dVar2.mo10447g());
        osObjectBuilder.mo16645h(aVar.f16303o, dVar2.mo10441d());
        osObjectBuilder.mo16654x();
        return dVar;
    }

    /* renamed from: L */
    public C5642c0<?> mo16212L() {
        return this.f16292l;
    }

    /* renamed from: Q */
    public void mo16213Q() {
        if (this.f16292l == null) {
            C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
            this.f16291k = (C5654a) eVar.mo16241c();
            C5642c0<C3007d> c0Var = new C5642c0<>(this);
            this.f16292l = c0Var;
            c0Var.mo16264m(eVar.mo16243e());
            this.f16292l.mo16265n(eVar.mo16244f());
            this.f16292l.mo16261j(eVar.mo16240b());
            this.f16292l.mo16263l(eVar.mo16242d());
        }
    }

    /* renamed from: Y */
    public void mo10434Y(long j) {
        if (!this.f16292l.mo16260g()) {
            this.f16292l.mo16258e().mo16228j();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    /* renamed from: Z */
    public void mo10435Z(boolean z) {
        if (!this.f16292l.mo16260g()) {
            this.f16292l.mo16258e().mo16228j();
            this.f16292l.mo16259f().mo16598o(this.f16291k.f16297i, z);
        } else if (this.f16292l.mo16256c()) {
            C5722p f = this.f16292l.mo16259f();
            f.mo16592k().mo16561t(this.f16291k.f16297i, f.mo16589g(), z, true);
        }
    }

    /* renamed from: a */
    public long mo10436a() {
        this.f16292l.mo16258e().mo16228j();
        return this.f16292l.mo16259f().mo16603u(this.f16291k.f16294f);
    }

    /* renamed from: a0 */
    public void mo10437a0(boolean z) {
        if (!this.f16292l.mo16260g()) {
            this.f16292l.mo16258e().mo16228j();
            this.f16292l.mo16259f().mo16598o(this.f16291k.f16299k, z);
        } else if (this.f16292l.mo16256c()) {
            C5722p f = this.f16292l.mo16259f();
            f.mo16592k().mo16561t(this.f16291k.f16299k, f.mo16589g(), z, true);
        }
    }

    /* renamed from: b */
    public String mo10438b() {
        this.f16292l.mo16258e().mo16228j();
        return this.f16292l.mo16259f().mo16604v(this.f16291k.f16300l);
    }

    /* renamed from: b0 */
    public void mo10439b0(String str) {
        if (!this.f16292l.mo16260g()) {
            this.f16292l.mo16258e().mo16228j();
            if (str == null) {
                this.f16292l.mo16259f().mo16347m(this.f16291k.f16301m);
            } else {
                this.f16292l.mo16259f().mo16590h(this.f16291k.f16301m, str);
            }
        } else if (this.f16292l.mo16256c()) {
            C5722p f = this.f16292l.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16291k.f16301m, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16291k.f16301m, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: c0 */
    public void mo10440c0(long j) {
        if (!this.f16292l.mo16260g()) {
            this.f16292l.mo16258e().mo16228j();
            this.f16292l.mo16259f().mo16607z(this.f16291k.f16296h, j);
        } else if (this.f16292l.mo16256c()) {
            C5722p f = this.f16292l.mo16259f();
            f.mo16592k().mo16565w(this.f16291k.f16296h, f.mo16589g(), j, true);
        }
    }

    /* renamed from: d */
    public Date mo10441d() {
        this.f16292l.mo16258e().mo16228j();
        if (this.f16292l.mo16259f().mo16345E(this.f16291k.f16303o)) {
            return null;
        }
        return this.f16292l.mo16259f().mo16583B(this.f16291k.f16303o);
    }

    /* renamed from: d0 */
    public void mo10442d0(Date date) {
        if (!this.f16292l.mo16260g()) {
            this.f16292l.mo16258e().mo16228j();
            if (date == null) {
                this.f16292l.mo16259f().mo16347m(this.f16291k.f16303o);
            } else {
                this.f16292l.mo16259f().mo16585G(this.f16291k.f16303o, date);
            }
        } else if (this.f16292l.mo16256c()) {
            C5722p f = this.f16292l.mo16259f();
            if (date == null) {
                f.mo16592k().mo16566x(this.f16291k.f16303o, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16563u(this.f16291k.f16303o, f.mo16589g(), date, true);
            }
        }
    }

    /* renamed from: e */
    public String mo10443e() {
        this.f16292l.mo16258e().mo16228j();
        return this.f16292l.mo16259f().mo16604v(this.f16291k.f16301m);
    }

    /* renamed from: e0 */
    public void mo10444e0(boolean z) {
        if (!this.f16292l.mo16260g()) {
            this.f16292l.mo16258e().mo16228j();
            this.f16292l.mo16259f().mo16598o(this.f16291k.f16298j, z);
        } else if (this.f16292l.mo16256c()) {
            C5722p f = this.f16292l.mo16259f();
            f.mo16592k().mo16561t(this.f16291k.f16298j, f.mo16589g(), z, true);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5653e1.class != obj.getClass()) {
            return false;
        }
        C5653e1 e1Var = (C5653e1) obj;
        String D = this.f16292l.mo16258e().mo16218D();
        String D2 = e1Var.f16292l.mo16258e().mo16218D();
        if (D == null ? D2 != null : !D.equals(D2)) {
            return false;
        }
        String m = this.f16292l.mo16259f().mo16592k().mo16555m();
        String m2 = e1Var.f16292l.mo16259f().mo16592k().mo16555m();
        if (m == null ? m2 == null : m.equals(m2)) {
            return this.f16292l.mo16259f().mo16589g() == e1Var.f16292l.mo16259f().mo16589g();
        }
        return false;
    }

    /* renamed from: f */
    public long mo10445f() {
        this.f16292l.mo16258e().mo16228j();
        return this.f16292l.mo16259f().mo16603u(this.f16291k.f16296h);
    }

    /* renamed from: f0 */
    public void mo10446f0(long j) {
        if (!this.f16292l.mo16260g()) {
            this.f16292l.mo16258e().mo16228j();
            this.f16292l.mo16259f().mo16607z(this.f16291k.f16295g, j);
        } else if (this.f16292l.mo16256c()) {
            C5722p f = this.f16292l.mo16259f();
            f.mo16592k().mo16565w(this.f16291k.f16295g, f.mo16589g(), j, true);
        }
    }

    /* renamed from: g */
    public String mo10447g() {
        this.f16292l.mo16258e().mo16228j();
        return this.f16292l.mo16259f().mo16604v(this.f16291k.f16302n);
    }

    /* renamed from: g0 */
    public void mo10448g0(String str) {
        if (!this.f16292l.mo16260g()) {
            this.f16292l.mo16258e().mo16228j();
            if (str == null) {
                this.f16292l.mo16259f().mo16347m(this.f16291k.f16302n);
            } else {
                this.f16292l.mo16259f().mo16590h(this.f16291k.f16302n, str);
            }
        } else if (this.f16292l.mo16256c()) {
            C5722p f = this.f16292l.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16291k.f16302n, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16291k.f16302n, f.mo16589g(), str, true);
            }
        }
    }

    /* renamed from: h */
    public long mo10449h() {
        this.f16292l.mo16258e().mo16228j();
        return this.f16292l.mo16259f().mo16603u(this.f16291k.f16295g);
    }

    /* renamed from: h0 */
    public void mo10450h0(String str) {
        if (!this.f16292l.mo16260g()) {
            this.f16292l.mo16258e().mo16228j();
            if (str == null) {
                this.f16292l.mo16259f().mo16347m(this.f16291k.f16300l);
            } else {
                this.f16292l.mo16259f().mo16590h(this.f16291k.f16300l, str);
            }
        } else if (this.f16292l.mo16256c()) {
            C5722p f = this.f16292l.mo16259f();
            if (str == null) {
                f.mo16592k().mo16566x(this.f16291k.f16300l, f.mo16589g(), true);
            } else {
                f.mo16592k().mo16567y(this.f16291k.f16300l, f.mo16589g(), str, true);
            }
        }
    }

    public int hashCode() {
        String D = this.f16292l.mo16258e().mo16218D();
        String m = this.f16292l.mo16259f().mo16592k().mo16555m();
        long g = this.f16292l.mo16259f().mo16589g();
        int i = 0;
        int hashCode = (527 + (D != null ? D.hashCode() : 0)) * 31;
        if (m != null) {
            i = m.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((g >>> 32) ^ g));
    }

    /* renamed from: i */
    public boolean mo10451i() {
        this.f16292l.mo16258e().mo16228j();
        return this.f16292l.mo16259f().mo16600r(this.f16291k.f16299k);
    }

    /* renamed from: j */
    public boolean mo10453j() {
        this.f16292l.mo16258e().mo16228j();
        return this.f16292l.mo16259f().mo16600r(this.f16291k.f16297i);
    }

    /* renamed from: l */
    public boolean mo10456l() {
        this.f16292l.mo16258e().mo16228j();
        return this.f16292l.mo16259f().mo16600r(this.f16291k.f16298j);
    }

    public String toString() {
        if (!C5771n0.m24128T(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Notification = proxy[");
        sb.append("{id:");
        sb.append(mo10436a());
        sb.append("}");
        sb.append(",");
        sb.append("{system_user_id:");
        sb.append(mo10449h());
        sb.append("}");
        sb.append(",");
        sb.append("{notification_id:");
        sb.append(mo10445f());
        sb.append("}");
        sb.append(",");
        sb.append("{is_read:");
        sb.append(mo10453j());
        sb.append("}");
        sb.append(",");
        sb.append("{synced:");
        sb.append(mo10456l());
        sb.append("}");
        sb.append(",");
        sb.append("{is_received:");
        sb.append(mo10451i());
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        Object obj = "null";
        sb.append(mo10438b() != null ? mo10438b() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{message:");
        sb.append(mo10443e() != null ? mo10443e() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{time:");
        sb.append(mo10447g() != null ? mo10447g() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{notification_time:");
        Object obj2 = obj;
        if (mo10441d() != null) {
            obj2 = mo10441d();
        }
        sb.append(obj2);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
