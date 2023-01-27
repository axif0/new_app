package p340io.realm;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p340io.realm.C5632b;
import p340io.realm.C5790s1;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.objectstore.OsObjectBuilder;
import p340io.realm.p347v1.p348b.C5809c;
import p340io.realm.p347v1.p348b.C5811e;

/* renamed from: io.realm.o1 */
public class C5775o1 extends C5809c implements C5720n, C5780p1 {

    /* renamed from: e */
    private static final OsObjectSchemaInfo f16759e = m24142Y();

    /* renamed from: c */
    private C5776a f16760c;

    /* renamed from: d */
    private C5642c0<C5809c> f16761d;

    /* renamed from: io.realm.o1$a */
    static final class C5776a extends C5704c {

        /* renamed from: e */
        long f16762e;

        /* renamed from: f */
        long f16763f;

        /* renamed from: g */
        long f16764g;

        C5776a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b = osSchemaInfo.mo16474b("__User");
            this.f16763f = mo16618b("id", "id", b);
            this.f16764g = mo16618b("role", "role", b);
            mo16617a(osSchemaInfo, "roles", "__Role", "members");
            this.f16762e = b.mo16429c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo16217c(C5704c cVar, C5704c cVar2) {
            C5776a aVar = (C5776a) cVar;
            C5776a aVar2 = (C5776a) cVar2;
            aVar2.f16763f = aVar.f16763f;
            aVar2.f16764g = aVar.f16764g;
            aVar2.f16762e = aVar.f16762e;
        }
    }

    C5775o1() {
        this.f16761d.mo16262k();
    }

    /* renamed from: V */
    public static C5809c m24139V(C5648d0 d0Var, C5776a aVar, C5809c cVar, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        C5811e W;
        C5720n nVar = map.get(cVar);
        if (nVar != null) {
            return (C5809c) nVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C5809c.class), aVar.f16762e, set);
        osObjectBuilder.mo16652u(aVar.f16763f, cVar.mo16754a());
        C5775o1 a0 = m24144a0(d0Var, osObjectBuilder.mo16653w());
        map.put(cVar, a0);
        C5811e m = cVar.mo16758m();
        if (m == null) {
            W = null;
        } else {
            C5811e eVar = (C5811e) map.get(m);
            if (eVar != null) {
                a0.mo16755b0(eVar);
                return a0;
            }
            W = C5790s1.m24213W(d0Var, (C5790s1.C5791a) d0Var.mo16219H().mo16773b(C5811e.class), m, z, map, set);
        }
        a0.mo16755b0(W);
        return a0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p340io.realm.p347v1.p348b.C5809c m24140W(p340io.realm.C5648d0 r8, p340io.realm.C5775o1.C5776a r9, p340io.realm.p347v1.p348b.C5809c r10, boolean r11, java.util.Map<p340io.realm.C5763l0, p340io.realm.internal.C5720n> r12, java.util.Set<p340io.realm.C5781q> r13) {
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
            io.realm.v1.b.c r1 = (p340io.realm.p347v1.p348b.C5809c) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0086
            java.lang.Class<io.realm.v1.b.c> r2 = p340io.realm.p347v1.p348b.C5809c.class
            io.realm.internal.Table r2 = r8.mo16276q0(r2)
            long r3 = r9.f16763f
            java.lang.String r5 = r10.mo16754a()
            long r3 = r2.mo16547d(r3, r5)
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
            io.realm.o1 r1 = new io.realm.o1     // Catch:{ all -> 0x0081 }
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
            m24145c0(r1, r2, r3, r4, r5, r6)
            goto L_0x0098
        L_0x0094:
            io.realm.v1.b.c r7 = m24139V(r8, r9, r10, r11, r12, r13)
        L_0x0098:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5775o1.m24140W(io.realm.d0, io.realm.o1$a, io.realm.v1.b.c, boolean, java.util.Map, java.util.Set):io.realm.v1.b.c");
    }

    /* renamed from: X */
    public static C5776a m24141X(OsSchemaInfo osSchemaInfo) {
        return new C5776a(osSchemaInfo);
    }

    /* renamed from: Y */
    private static OsObjectSchemaInfo m24142Y() {
        OsObjectSchemaInfo.C5685b bVar = new OsObjectSchemaInfo.C5685b("__User", 2, 1);
        bVar.mo16434c("id", RealmFieldType.STRING, true, true, true);
        bVar.mo16433b("role", RealmFieldType.OBJECT, "__Role");
        bVar.mo16432a("roles", "__Role", "members");
        return bVar.mo16435d();
    }

    /* renamed from: Z */
    public static OsObjectSchemaInfo m24143Z() {
        return f16759e;
    }

    /* renamed from: a0 */
    private static C5775o1 m24144a0(C5632b bVar, C5722p pVar) {
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        eVar.mo16245g(bVar, pVar, bVar.mo16219H().mo16773b(C5809c.class), false, Collections.emptyList());
        C5775o1 o1Var = new C5775o1();
        eVar.mo16239a();
        return o1Var;
    }

    /* renamed from: c0 */
    static C5809c m24145c0(C5648d0 d0Var, C5776a aVar, C5809c cVar, C5809c cVar2, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C5809c.class), aVar.f16762e, set);
        osObjectBuilder.mo16652u(aVar.f16763f, cVar2.mo16754a());
        C5811e m = cVar2.mo16758m();
        if (m == null) {
            osObjectBuilder.mo16649q(aVar.f16764g);
        } else {
            C5811e eVar = (C5811e) map.get(m);
            if (eVar != null) {
                osObjectBuilder.mo16650r(aVar.f16764g, eVar);
            } else {
                osObjectBuilder.mo16650r(aVar.f16764g, C5790s1.m24213W(d0Var, (C5790s1.C5791a) d0Var.mo16219H().mo16773b(C5811e.class), m, true, map, set));
            }
        }
        osObjectBuilder.mo16654x();
        return cVar;
    }

    /* renamed from: L */
    public C5642c0<?> mo16212L() {
        return this.f16761d;
    }

    /* renamed from: Q */
    public void mo16213Q() {
        if (this.f16761d == null) {
            C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
            this.f16760c = (C5776a) eVar.mo16241c();
            C5642c0<C5809c> c0Var = new C5642c0<>(this);
            this.f16761d = c0Var;
            c0Var.mo16264m(eVar.mo16243e());
            this.f16761d.mo16265n(eVar.mo16244f());
            this.f16761d.mo16261j(eVar.mo16240b());
            this.f16761d.mo16263l(eVar.mo16242d());
        }
    }

    /* renamed from: a */
    public String mo16754a() {
        this.f16761d.mo16258e().mo16228j();
        return this.f16761d.mo16259f().mo16604v(this.f16760c.f16763f);
    }

    /* renamed from: b0 */
    public void mo16755b0(C5811e eVar) {
        if (!this.f16761d.mo16260g()) {
            this.f16761d.mo16258e().mo16228j();
            if (eVar == null) {
                this.f16761d.mo16259f().mo16587J(this.f16760c.f16764g);
                return;
            }
            this.f16761d.mo16255b(eVar);
            this.f16761d.mo16259f().mo16605w(this.f16760c.f16764g, ((C5720n) eVar).mo16212L().mo16259f().mo16589g());
        } else if (this.f16761d.mo16256c() && !this.f16761d.mo16257d().contains("role")) {
            if (eVar != null && !C5771n0.m24127S(eVar)) {
                eVar = (C5811e) ((C5648d0) this.f16761d.mo16258e()).mo16272g0(eVar, new C5781q[0]);
            }
            C5722p f = this.f16761d.mo16259f();
            if (eVar == null) {
                f.mo16587J(this.f16760c.f16764g);
                return;
            }
            this.f16761d.mo16255b(eVar);
            f.mo16592k().mo16564v(this.f16760c.f16764g, f.mo16589g(), ((C5720n) eVar).mo16212L().mo16259f().mo16589g(), true);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5775o1.class != obj.getClass()) {
            return false;
        }
        C5775o1 o1Var = (C5775o1) obj;
        String D = this.f16761d.mo16258e().mo16218D();
        String D2 = o1Var.f16761d.mo16258e().mo16218D();
        if (D == null ? D2 != null : !D.equals(D2)) {
            return false;
        }
        String m = this.f16761d.mo16259f().mo16592k().mo16555m();
        String m2 = o1Var.f16761d.mo16259f().mo16592k().mo16555m();
        if (m == null ? m2 == null : m.equals(m2)) {
            return this.f16761d.mo16259f().mo16589g() == o1Var.f16761d.mo16259f().mo16589g();
        }
        return false;
    }

    public int hashCode() {
        String D = this.f16761d.mo16258e().mo16218D();
        String m = this.f16761d.mo16259f().mo16592k().mo16555m();
        long g = this.f16761d.mo16259f().mo16589g();
        int i = 0;
        int hashCode = (527 + (D != null ? D.hashCode() : 0)) * 31;
        if (m != null) {
            i = m.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((g >>> 32) ^ g));
    }

    /* renamed from: m */
    public C5811e mo16758m() {
        this.f16761d.mo16258e().mo16228j();
        if (this.f16761d.mo16259f().mo16346l(this.f16760c.f16764g)) {
            return null;
        }
        return (C5811e) this.f16761d.mo16258e().mo16231t(C5811e.class, this.f16761d.mo16259f().mo16601s(this.f16760c.f16764g), false, Collections.emptyList());
    }

    public String toString() {
        if (!C5771n0.m24128T(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PermissionUser = proxy[");
        sb.append("{id:");
        sb.append(mo16754a());
        sb.append("}");
        sb.append(",");
        sb.append("{role:");
        sb.append(mo16758m() != null ? "Role" : "null");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
