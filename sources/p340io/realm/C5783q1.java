package p340io.realm;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p340io.realm.C5632b;
import p340io.realm.C5768m1;
import p340io.realm.exceptions.RealmException;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsList;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.objectstore.OsObjectBuilder;
import p340io.realm.p347v1.p348b.C5808b;
import p340io.realm.p347v1.p348b.C5810d;

/* renamed from: io.realm.q1 */
public class C5783q1 extends C5810d implements C5720n, C5787r1 {

    /* renamed from: f */
    private static final OsObjectSchemaInfo f16771f = m24166Z();

    /* renamed from: c */
    private C5784a f16772c;

    /* renamed from: d */
    private C5642c0<C5810d> f16773d;

    /* renamed from: e */
    private C5751j0<C5808b> f16774e;

    /* renamed from: io.realm.q1$a */
    static final class C5784a extends C5704c {

        /* renamed from: e */
        long f16775e;

        /* renamed from: f */
        long f16776f;

        /* renamed from: g */
        long f16777g;

        C5784a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b = osSchemaInfo.mo16474b("__Realm");
            this.f16776f = mo16618b("id", "id", b);
            this.f16777g = mo16618b("permissions", "permissions", b);
            this.f16775e = b.mo16429c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo16217c(C5704c cVar, C5704c cVar2) {
            C5784a aVar = (C5784a) cVar;
            C5784a aVar2 = (C5784a) cVar2;
            aVar2.f16776f = aVar.f16776f;
            aVar2.f16777g = aVar.f16777g;
            aVar2.f16775e = aVar.f16775e;
        }
    }

    C5783q1() {
        this.f16773d.mo16262k();
    }

    /* renamed from: W */
    public static C5810d m24163W(C5648d0 d0Var, C5784a aVar, C5810d dVar, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        C5720n nVar = map.get(dVar);
        if (nVar != null) {
            return (C5810d) nVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C5810d.class), aVar.f16775e, set);
        osObjectBuilder.mo16647m(aVar.f16776f, Integer.valueOf(dVar.mo16768a()));
        C5783q1 b0 = m24168b0(d0Var, osObjectBuilder.mo16653w());
        map.put(dVar, b0);
        C5751j0<C5808b> k = dVar.mo16771k();
        if (k != null) {
            C5751j0<C5808b> k2 = b0.mo16771k();
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
        return b0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p340io.realm.p347v1.p348b.C5810d m24164X(p340io.realm.C5648d0 r8, p340io.realm.C5783q1.C5784a r9, p340io.realm.p347v1.p348b.C5810d r10, boolean r11, java.util.Map<p340io.realm.C5763l0, p340io.realm.internal.C5720n> r12, java.util.Set<p340io.realm.C5781q> r13) {
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
            io.realm.v1.b.d r1 = (p340io.realm.p347v1.p348b.C5810d) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0087
            java.lang.Class<io.realm.v1.b.d> r2 = p340io.realm.p347v1.p348b.C5810d.class
            io.realm.internal.Table r2 = r8.mo16276q0(r2)
            long r3 = r9.f16776f
            int r5 = r10.mo16768a()
            long r5 = (long) r5
            long r3 = r2.mo16546c(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0067
            r0 = 0
            goto L_0x0088
        L_0x0067:
            io.realm.internal.UncheckedRow r3 = r2.mo16558p(r3)     // Catch:{ all -> 0x0082 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0082 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.mo16245g(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0082 }
            io.realm.q1 r1 = new io.realm.q1     // Catch:{ all -> 0x0082 }
            r1.<init>()     // Catch:{ all -> 0x0082 }
            r12.put(r10, r1)     // Catch:{ all -> 0x0082 }
            r0.mo16239a()
            goto L_0x0087
        L_0x0082:
            r8 = move-exception
            r0.mo16239a()
            throw r8
        L_0x0087:
            r0 = r11
        L_0x0088:
            r7 = r1
            if (r0 == 0) goto L_0x0095
            r1 = r8
            r2 = r9
            r3 = r7
            r4 = r10
            r5 = r12
            r6 = r13
            m24169c0(r1, r2, r3, r4, r5, r6)
            goto L_0x0099
        L_0x0095:
            io.realm.v1.b.d r7 = m24163W(r8, r9, r10, r11, r12, r13)
        L_0x0099:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5783q1.m24164X(io.realm.d0, io.realm.q1$a, io.realm.v1.b.d, boolean, java.util.Map, java.util.Set):io.realm.v1.b.d");
    }

    /* renamed from: Y */
    public static C5784a m24165Y(OsSchemaInfo osSchemaInfo) {
        return new C5784a(osSchemaInfo);
    }

    /* renamed from: Z */
    private static OsObjectSchemaInfo m24166Z() {
        OsObjectSchemaInfo.C5685b bVar = new OsObjectSchemaInfo.C5685b("__Realm", 2, 0);
        bVar.mo16434c("id", RealmFieldType.INTEGER, true, true, true);
        bVar.mo16433b("permissions", RealmFieldType.LIST, "__Permission");
        return bVar.mo16435d();
    }

    /* renamed from: a0 */
    public static OsObjectSchemaInfo m24167a0() {
        return f16771f;
    }

    /* renamed from: b0 */
    private static C5783q1 m24168b0(C5632b bVar, C5722p pVar) {
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        eVar.mo16245g(bVar, pVar, bVar.mo16219H().mo16773b(C5810d.class), false, Collections.emptyList());
        C5783q1 q1Var = new C5783q1();
        eVar.mo16239a();
        return q1Var;
    }

    /* renamed from: c0 */
    static C5810d m24169c0(C5648d0 d0Var, C5784a aVar, C5810d dVar, C5810d dVar2, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C5810d.class), aVar.f16775e, set);
        osObjectBuilder.mo16647m(aVar.f16776f, Integer.valueOf(dVar2.mo16768a()));
        C5751j0<C5808b> k = dVar2.mo16771k();
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
            osObjectBuilder.mo16651t(aVar.f16777g, j0Var);
        } else {
            osObjectBuilder.mo16651t(aVar.f16777g, new C5751j0());
        }
        osObjectBuilder.mo16654x();
        return dVar;
    }

    /* renamed from: L */
    public C5642c0<?> mo16212L() {
        return this.f16773d;
    }

    /* renamed from: Q */
    public void mo16213Q() {
        if (this.f16773d == null) {
            C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
            this.f16772c = (C5784a) eVar.mo16241c();
            C5642c0<C5810d> c0Var = new C5642c0<>(this);
            this.f16773d = c0Var;
            c0Var.mo16264m(eVar.mo16243e());
            this.f16773d.mo16265n(eVar.mo16244f());
            this.f16773d.mo16261j(eVar.mo16240b());
            this.f16773d.mo16263l(eVar.mo16242d());
        }
    }

    /* renamed from: U */
    public void mo16766U(int i) {
        if (!this.f16773d.mo16260g()) {
            this.f16773d.mo16258e().mo16228j();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    /* renamed from: V */
    public void mo16767V(C5751j0<C5808b> j0Var) {
        int i = 0;
        if (this.f16773d.mo16260g()) {
            if (!this.f16773d.mo16256c() || this.f16773d.mo16257d().contains("permissions")) {
                return;
            }
            if (j0Var != null && !j0Var.mo16154s()) {
                C5648d0 d0Var = (C5648d0) this.f16773d.mo16258e();
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
        this.f16773d.mo16258e().mo16228j();
        OsList y = this.f16773d.mo16259f().mo16368y(this.f16772c.f16777g);
        if (j0Var == null || ((long) j0Var.size()) != y.mo16396I()) {
            y.mo16421y();
            if (j0Var != null) {
                int size = j0Var.size();
                while (i < size) {
                    C5808b bVar = j0Var.get(i);
                    this.f16773d.mo16255b(bVar);
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
            this.f16773d.mo16255b(bVar2);
            y.mo16394G((long) i, ((C5720n) bVar2).mo16212L().mo16259f().mo16589g());
            i++;
        }
    }

    /* renamed from: a */
    public int mo16768a() {
        this.f16773d.mo16258e().mo16228j();
        return (int) this.f16773d.mo16259f().mo16603u(this.f16772c.f16776f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5783q1.class != obj.getClass()) {
            return false;
        }
        C5783q1 q1Var = (C5783q1) obj;
        String D = this.f16773d.mo16258e().mo16218D();
        String D2 = q1Var.f16773d.mo16258e().mo16218D();
        if (D == null ? D2 != null : !D.equals(D2)) {
            return false;
        }
        String m = this.f16773d.mo16259f().mo16592k().mo16555m();
        String m2 = q1Var.f16773d.mo16259f().mo16592k().mo16555m();
        if (m == null ? m2 == null : m.equals(m2)) {
            return this.f16773d.mo16259f().mo16589g() == q1Var.f16773d.mo16259f().mo16589g();
        }
        return false;
    }

    public int hashCode() {
        String D = this.f16773d.mo16258e().mo16218D();
        String m = this.f16773d.mo16259f().mo16592k().mo16555m();
        long g = this.f16773d.mo16259f().mo16589g();
        int i = 0;
        int hashCode = (527 + (D != null ? D.hashCode() : 0)) * 31;
        if (m != null) {
            i = m.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((g >>> 32) ^ g));
    }

    /* renamed from: k */
    public C5751j0<C5808b> mo16771k() {
        this.f16773d.mo16258e().mo16228j();
        C5751j0<C5808b> j0Var = this.f16774e;
        if (j0Var != null) {
            return j0Var;
        }
        C5751j0<C5808b> j0Var2 = new C5751j0<>(C5808b.class, this.f16773d.mo16259f().mo16368y(this.f16772c.f16777g), this.f16773d.mo16258e());
        this.f16774e = j0Var2;
        return j0Var2;
    }

    public String toString() {
        if (!C5771n0.m24128T(this)) {
            return "Invalid object";
        }
        return "RealmPermissions = proxy[" + "{id:" + mo16768a() + "}" + "," + "{permissions:" + "RealmList<Permission>[" + mo16771k().size() + "]" + "}" + "]";
    }
}
