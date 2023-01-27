package p340io.realm;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p340io.realm.C5632b;
import p340io.realm.C5768m1;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsList;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.objectstore.OsObjectBuilder;
import p340io.realm.p347v1.p348b.C5807a;
import p340io.realm.p347v1.p348b.C5808b;

/* renamed from: io.realm.k1 */
public class C5759k1 extends C5807a implements C5720n, C5764l1 {

    /* renamed from: f */
    private static final OsObjectSchemaInfo f16603f = m24059Y();

    /* renamed from: c */
    private C5760a f16604c;

    /* renamed from: d */
    private C5642c0<C5807a> f16605d;

    /* renamed from: e */
    private C5751j0<C5808b> f16606e;

    /* renamed from: io.realm.k1$a */
    static final class C5760a extends C5704c {

        /* renamed from: e */
        long f16607e;

        /* renamed from: f */
        long f16608f;

        /* renamed from: g */
        long f16609g;

        C5760a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b = osSchemaInfo.mo16474b("__Class");
            this.f16608f = mo16618b("name", "name", b);
            this.f16609g = mo16618b("permissions", "permissions", b);
            this.f16607e = b.mo16429c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo16217c(C5704c cVar, C5704c cVar2) {
            C5760a aVar = (C5760a) cVar;
            C5760a aVar2 = (C5760a) cVar2;
            aVar2.f16608f = aVar.f16608f;
            aVar2.f16609g = aVar.f16609g;
            aVar2.f16607e = aVar.f16607e;
        }
    }

    C5759k1() {
        this.f16605d.mo16262k();
    }

    /* renamed from: V */
    public static C5807a m24056V(C5648d0 d0Var, C5760a aVar, C5807a aVar2, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        C5720n nVar = map.get(aVar2);
        if (nVar != null) {
            return (C5807a) nVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C5807a.class), aVar.f16607e, set);
        osObjectBuilder.mo16652u(aVar.f16608f, aVar2.mo16722c());
        C5759k1 a0 = m24061a0(d0Var, osObjectBuilder.mo16653w());
        map.put(aVar2, a0);
        C5751j0<C5808b> k = aVar2.mo16725k();
        if (k != null) {
            C5751j0<C5808b> k2 = a0.mo16725k();
            k2.clear();
            for (int i = 0; i < k.size(); i++) {
                C5808b bVar = k.get(i);
                C5808b bVar2 = (C5808b) map.get(bVar);
                if (bVar2 == null) {
                    bVar2 = C5768m1.m24104V(d0Var, (C5768m1.C5769a) d0Var.mo16219H().mo16773b(C5808b.class), bVar, z, map, set);
                }
                k2.add(bVar2);
            }
        }
        return a0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p340io.realm.p347v1.p348b.C5807a m24057W(p340io.realm.C5648d0 r8, p340io.realm.C5759k1.C5760a r9, p340io.realm.p347v1.p348b.C5807a r10, boolean r11, java.util.Map<p340io.realm.C5763l0, p340io.realm.internal.C5720n> r12, java.util.Set<p340io.realm.C5781q> r13) {
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
            io.realm.v1.b.a r1 = (p340io.realm.p347v1.p348b.C5807a) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0086
            java.lang.Class<io.realm.v1.b.a> r2 = p340io.realm.p347v1.p348b.C5807a.class
            io.realm.internal.Table r2 = r8.mo16276q0(r2)
            long r3 = r9.f16608f
            java.lang.String r5 = r10.mo16722c()
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
            io.realm.k1 r1 = new io.realm.k1     // Catch:{ all -> 0x0081 }
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
            m24062b0(r1, r2, r3, r4, r5, r6)
            goto L_0x0098
        L_0x0094:
            io.realm.v1.b.a r7 = m24056V(r8, r9, r10, r11, r12, r13)
        L_0x0098:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5759k1.m24057W(io.realm.d0, io.realm.k1$a, io.realm.v1.b.a, boolean, java.util.Map, java.util.Set):io.realm.v1.b.a");
    }

    /* renamed from: X */
    public static C5760a m24058X(OsSchemaInfo osSchemaInfo) {
        return new C5760a(osSchemaInfo);
    }

    /* renamed from: Y */
    private static OsObjectSchemaInfo m24059Y() {
        OsObjectSchemaInfo.C5685b bVar = new OsObjectSchemaInfo.C5685b("__Class", 2, 0);
        bVar.mo16434c("name", RealmFieldType.STRING, true, true, true);
        bVar.mo16433b("permissions", RealmFieldType.LIST, "__Permission");
        return bVar.mo16435d();
    }

    /* renamed from: Z */
    public static OsObjectSchemaInfo m24060Z() {
        return f16603f;
    }

    /* renamed from: a0 */
    private static C5759k1 m24061a0(C5632b bVar, C5722p pVar) {
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        eVar.mo16245g(bVar, pVar, bVar.mo16219H().mo16773b(C5807a.class), false, Collections.emptyList());
        C5759k1 k1Var = new C5759k1();
        eVar.mo16239a();
        return k1Var;
    }

    /* renamed from: b0 */
    static C5807a m24062b0(C5648d0 d0Var, C5760a aVar, C5807a aVar2, C5807a aVar3, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C5807a.class), aVar.f16607e, set);
        osObjectBuilder.mo16652u(aVar.f16608f, aVar3.mo16722c());
        C5751j0<C5808b> k = aVar3.mo16725k();
        if (k != null) {
            C5751j0 j0Var = new C5751j0();
            for (int i = 0; i < k.size(); i++) {
                C5808b bVar = k.get(i);
                C5808b bVar2 = (C5808b) map.get(bVar);
                if (bVar2 == null) {
                    bVar2 = C5768m1.m24104V(d0Var, (C5768m1.C5769a) d0Var.mo16219H().mo16773b(C5808b.class), bVar, true, map, set);
                }
                j0Var.add(bVar2);
            }
            osObjectBuilder.mo16651t(aVar.f16609g, j0Var);
        } else {
            osObjectBuilder.mo16651t(aVar.f16609g, new C5751j0());
        }
        osObjectBuilder.mo16654x();
        return aVar2;
    }

    /* renamed from: L */
    public C5642c0<?> mo16212L() {
        return this.f16605d;
    }

    /* renamed from: Q */
    public void mo16213Q() {
        if (this.f16605d == null) {
            C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
            this.f16604c = (C5760a) eVar.mo16241c();
            C5642c0<C5807a> c0Var = new C5642c0<>(this);
            this.f16605d = c0Var;
            c0Var.mo16264m(eVar.mo16243e());
            this.f16605d.mo16265n(eVar.mo16244f());
            this.f16605d.mo16261j(eVar.mo16240b());
            this.f16605d.mo16263l(eVar.mo16242d());
        }
    }

    /* renamed from: U */
    public void mo16721U(C5751j0<C5808b> j0Var) {
        int i = 0;
        if (this.f16605d.mo16260g()) {
            if (!this.f16605d.mo16256c() || this.f16605d.mo16257d().contains("permissions")) {
                return;
            }
            if (j0Var != null && !j0Var.mo16154s()) {
                C5648d0 d0Var = (C5648d0) this.f16605d.mo16258e();
                C5751j0<C5808b> j0Var2 = new C5751j0<>();
                Iterator<C5808b> it = j0Var.iterator();
                while (it.hasNext()) {
                    C5808b next = it.next();
                    if (next != null && !C5771n0.m24127S(next)) {
                        next = (C5808b) d0Var.mo16272g0(next, new C5781q[0]);
                    }
                    j0Var2.add(next);
                }
                j0Var = j0Var2;
            }
        }
        this.f16605d.mo16258e().mo16228j();
        OsList y = this.f16605d.mo16259f().mo16368y(this.f16604c.f16609g);
        if (j0Var == null || ((long) j0Var.size()) != y.mo16396I()) {
            y.mo16421y();
            if (j0Var != null) {
                int size = j0Var.size();
                while (i < size) {
                    C5808b bVar = j0Var.get(i);
                    this.f16605d.mo16255b(bVar);
                    y.mo16406j(((C5720n) bVar).mo16212L().mo16259f().mo16589g());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = j0Var.size();
        while (i < size2) {
            C5808b bVar2 = j0Var.get(i);
            this.f16605d.mo16255b(bVar2);
            y.mo16394G((long) i, ((C5720n) bVar2).mo16212L().mo16259f().mo16589g());
            i++;
        }
    }

    /* renamed from: c */
    public String mo16722c() {
        this.f16605d.mo16258e().mo16228j();
        return this.f16605d.mo16259f().mo16604v(this.f16604c.f16608f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5759k1.class != obj.getClass()) {
            return false;
        }
        C5759k1 k1Var = (C5759k1) obj;
        String D = this.f16605d.mo16258e().mo16218D();
        String D2 = k1Var.f16605d.mo16258e().mo16218D();
        if (D == null ? D2 != null : !D.equals(D2)) {
            return false;
        }
        String m = this.f16605d.mo16259f().mo16592k().mo16555m();
        String m2 = k1Var.f16605d.mo16259f().mo16592k().mo16555m();
        if (m == null ? m2 == null : m.equals(m2)) {
            return this.f16605d.mo16259f().mo16589g() == k1Var.f16605d.mo16259f().mo16589g();
        }
        return false;
    }

    public int hashCode() {
        String D = this.f16605d.mo16258e().mo16218D();
        String m = this.f16605d.mo16259f().mo16592k().mo16555m();
        long g = this.f16605d.mo16259f().mo16589g();
        int i = 0;
        int hashCode = (527 + (D != null ? D.hashCode() : 0)) * 31;
        if (m != null) {
            i = m.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((g >>> 32) ^ g));
    }

    /* renamed from: k */
    public C5751j0<C5808b> mo16725k() {
        this.f16605d.mo16258e().mo16228j();
        C5751j0<C5808b> j0Var = this.f16606e;
        if (j0Var != null) {
            return j0Var;
        }
        C5751j0<C5808b> j0Var2 = new C5751j0<>(C5808b.class, this.f16605d.mo16259f().mo16368y(this.f16604c.f16609g), this.f16605d.mo16258e());
        this.f16606e = j0Var2;
        return j0Var2;
    }

    public String toString() {
        if (!C5771n0.m24128T(this)) {
            return "Invalid object";
        }
        return "ClassPermissions = proxy[" + "{name:" + mo16722c() + "}" + "," + "{permissions:" + "RealmList<Permission>[" + mo16725k().size() + "]" + "}" + "]";
    }
}
