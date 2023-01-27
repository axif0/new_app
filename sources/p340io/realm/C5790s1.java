package p340io.realm;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p340io.realm.C5632b;
import p340io.realm.C5775o1;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsList;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.objectstore.OsObjectBuilder;
import p340io.realm.p347v1.p348b.C5809c;
import p340io.realm.p347v1.p348b.C5811e;

/* renamed from: io.realm.s1 */
public class C5790s1 extends C5811e implements C5720n, C5794t1 {

    /* renamed from: f */
    private static final OsObjectSchemaInfo f16788f = m24215Y();

    /* renamed from: c */
    private C5791a f16789c;

    /* renamed from: d */
    private C5642c0<C5811e> f16790d;

    /* renamed from: e */
    private C5751j0<C5809c> f16791e;

    /* renamed from: io.realm.s1$a */
    static final class C5791a extends C5704c {

        /* renamed from: e */
        long f16792e;

        /* renamed from: f */
        long f16793f;

        /* renamed from: g */
        long f16794g;

        C5791a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b = osSchemaInfo.mo16474b("__Role");
            this.f16793f = mo16618b("name", "name", b);
            this.f16794g = mo16618b("members", "members", b);
            this.f16792e = b.mo16429c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo16217c(C5704c cVar, C5704c cVar2) {
            C5791a aVar = (C5791a) cVar;
            C5791a aVar2 = (C5791a) cVar2;
            aVar2.f16793f = aVar.f16793f;
            aVar2.f16794g = aVar.f16794g;
            aVar2.f16792e = aVar.f16792e;
        }
    }

    C5790s1() {
        this.f16790d.mo16262k();
    }

    /* renamed from: V */
    public static C5811e m24212V(C5648d0 d0Var, C5791a aVar, C5811e eVar, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        C5720n nVar = map.get(eVar);
        if (nVar != null) {
            return (C5811e) nVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C5811e.class), aVar.f16792e, set);
        osObjectBuilder.mo16652u(aVar.f16793f, eVar.mo16790c());
        C5790s1 a0 = m24217a0(d0Var, osObjectBuilder.mo16653w());
        map.put(eVar, a0);
        C5751j0<C5809c> C = eVar.mo16788C();
        if (C != null) {
            C5751j0<C5809c> C2 = a0.mo16788C();
            C2.clear();
            for (int i = 0; i < C.size(); i++) {
                C5809c cVar = C.get(i);
                C5809c cVar2 = (C5809c) map.get(cVar);
                if (cVar2 == null) {
                    cVar2 = C5775o1.m24140W(d0Var, (C5775o1.C5776a) d0Var.mo16219H().mo16773b(C5809c.class), cVar, z, map, set);
                }
                C2.add(cVar2);
            }
        }
        return a0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p340io.realm.p347v1.p348b.C5811e m24213W(p340io.realm.C5648d0 r8, p340io.realm.C5790s1.C5791a r9, p340io.realm.p347v1.p348b.C5811e r10, boolean r11, java.util.Map<p340io.realm.C5763l0, p340io.realm.internal.C5720n> r12, java.util.Set<p340io.realm.C5781q> r13) {
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
            io.realm.v1.b.e r1 = (p340io.realm.p347v1.p348b.C5811e) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0086
            java.lang.Class<io.realm.v1.b.e> r2 = p340io.realm.p347v1.p348b.C5811e.class
            io.realm.internal.Table r2 = r8.mo16276q0(r2)
            long r3 = r9.f16793f
            java.lang.String r5 = r10.mo16790c()
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
            io.realm.s1 r1 = new io.realm.s1     // Catch:{ all -> 0x0081 }
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
            m24218b0(r1, r2, r3, r4, r5, r6)
            goto L_0x0098
        L_0x0094:
            io.realm.v1.b.e r7 = m24212V(r8, r9, r10, r11, r12, r13)
        L_0x0098:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5790s1.m24213W(io.realm.d0, io.realm.s1$a, io.realm.v1.b.e, boolean, java.util.Map, java.util.Set):io.realm.v1.b.e");
    }

    /* renamed from: X */
    public static C5791a m24214X(OsSchemaInfo osSchemaInfo) {
        return new C5791a(osSchemaInfo);
    }

    /* renamed from: Y */
    private static OsObjectSchemaInfo m24215Y() {
        OsObjectSchemaInfo.C5685b bVar = new OsObjectSchemaInfo.C5685b("__Role", 2, 0);
        bVar.mo16434c("name", RealmFieldType.STRING, true, true, true);
        bVar.mo16433b("members", RealmFieldType.LIST, "__User");
        return bVar.mo16435d();
    }

    /* renamed from: Z */
    public static OsObjectSchemaInfo m24216Z() {
        return f16788f;
    }

    /* renamed from: a0 */
    private static C5790s1 m24217a0(C5632b bVar, C5722p pVar) {
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        eVar.mo16245g(bVar, pVar, bVar.mo16219H().mo16773b(C5811e.class), false, Collections.emptyList());
        C5790s1 s1Var = new C5790s1();
        eVar.mo16239a();
        return s1Var;
    }

    /* renamed from: b0 */
    static C5811e m24218b0(C5648d0 d0Var, C5791a aVar, C5811e eVar, C5811e eVar2, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C5811e.class), aVar.f16792e, set);
        osObjectBuilder.mo16652u(aVar.f16793f, eVar2.mo16790c());
        C5751j0<C5809c> C = eVar2.mo16788C();
        if (C != null) {
            C5751j0 j0Var = new C5751j0();
            for (int i = 0; i < C.size(); i++) {
                C5809c cVar = C.get(i);
                C5809c cVar2 = (C5809c) map.get(cVar);
                if (cVar2 == null) {
                    cVar2 = C5775o1.m24140W(d0Var, (C5775o1.C5776a) d0Var.mo16219H().mo16773b(C5809c.class), cVar, true, map, set);
                }
                j0Var.add(cVar2);
            }
            osObjectBuilder.mo16651t(aVar.f16794g, j0Var);
        } else {
            osObjectBuilder.mo16651t(aVar.f16794g, new C5751j0());
        }
        osObjectBuilder.mo16654x();
        return eVar;
    }

    /* renamed from: C */
    public C5751j0<C5809c> mo16788C() {
        this.f16790d.mo16258e().mo16228j();
        C5751j0<C5809c> j0Var = this.f16791e;
        if (j0Var != null) {
            return j0Var;
        }
        C5751j0<C5809c> j0Var2 = new C5751j0<>(C5809c.class, this.f16790d.mo16259f().mo16368y(this.f16789c.f16794g), this.f16790d.mo16258e());
        this.f16791e = j0Var2;
        return j0Var2;
    }

    /* renamed from: L */
    public C5642c0<?> mo16212L() {
        return this.f16790d;
    }

    /* renamed from: Q */
    public void mo16213Q() {
        if (this.f16790d == null) {
            C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
            this.f16789c = (C5791a) eVar.mo16241c();
            C5642c0<C5811e> c0Var = new C5642c0<>(this);
            this.f16790d = c0Var;
            c0Var.mo16264m(eVar.mo16243e());
            this.f16790d.mo16265n(eVar.mo16244f());
            this.f16790d.mo16261j(eVar.mo16240b());
            this.f16790d.mo16263l(eVar.mo16242d());
        }
    }

    /* renamed from: U */
    public void mo16789U(C5751j0<C5809c> j0Var) {
        int i = 0;
        if (this.f16790d.mo16260g()) {
            if (!this.f16790d.mo16256c() || this.f16790d.mo16257d().contains("members")) {
                return;
            }
            if (j0Var != null && !j0Var.mo16154s()) {
                C5648d0 d0Var = (C5648d0) this.f16790d.mo16258e();
                C5751j0<C5809c> j0Var2 = new C5751j0<>();
                Iterator<C5809c> it = j0Var.iterator();
                while (it.hasNext()) {
                    C5809c next = it.next();
                    if (next != null && !C5771n0.m24127S(next)) {
                        next = (C5809c) d0Var.mo16272g0(next, new C5781q[0]);
                    }
                    j0Var2.add(next);
                }
                j0Var = j0Var2;
            }
        }
        this.f16790d.mo16258e().mo16228j();
        OsList y = this.f16790d.mo16259f().mo16368y(this.f16789c.f16794g);
        if (j0Var == null || ((long) j0Var.size()) != y.mo16396I()) {
            y.mo16421y();
            if (j0Var != null) {
                int size = j0Var.size();
                while (i < size) {
                    C5809c cVar = j0Var.get(i);
                    this.f16790d.mo16255b(cVar);
                    y.mo16406j(((C5720n) cVar).mo16212L().mo16259f().mo16589g());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = j0Var.size();
        while (i < size2) {
            C5809c cVar2 = j0Var.get(i);
            this.f16790d.mo16255b(cVar2);
            y.mo16394G((long) i, ((C5720n) cVar2).mo16212L().mo16259f().mo16589g());
            i++;
        }
    }

    /* renamed from: c */
    public String mo16790c() {
        this.f16790d.mo16258e().mo16228j();
        return this.f16790d.mo16259f().mo16604v(this.f16789c.f16793f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5790s1.class != obj.getClass()) {
            return false;
        }
        C5790s1 s1Var = (C5790s1) obj;
        String D = this.f16790d.mo16258e().mo16218D();
        String D2 = s1Var.f16790d.mo16258e().mo16218D();
        if (D == null ? D2 != null : !D.equals(D2)) {
            return false;
        }
        String m = this.f16790d.mo16259f().mo16592k().mo16555m();
        String m2 = s1Var.f16790d.mo16259f().mo16592k().mo16555m();
        if (m == null ? m2 == null : m.equals(m2)) {
            return this.f16790d.mo16259f().mo16589g() == s1Var.f16790d.mo16259f().mo16589g();
        }
        return false;
    }

    public int hashCode() {
        String D = this.f16790d.mo16258e().mo16218D();
        String m = this.f16790d.mo16259f().mo16592k().mo16555m();
        long g = this.f16790d.mo16259f().mo16589g();
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
        return "Role = proxy[" + "{name:" + mo16790c() + "}" + "," + "{members:" + "RealmList<PermissionUser>[" + mo16788C().size() + "]" + "}" + "]";
    }
}
