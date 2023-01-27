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
import p340io.realm.p347v1.p348b.C5808b;
import p340io.realm.p347v1.p348b.C5811e;

/* renamed from: io.realm.m1 */
public class C5768m1 extends C5808b implements C5720n, C5772n1 {

    /* renamed from: k */
    private static final OsObjectSchemaInfo f16747k = m24106X();

    /* renamed from: i */
    private C5769a f16748i;

    /* renamed from: j */
    private C5642c0<C5808b> f16749j;

    /* renamed from: io.realm.m1$a */
    static final class C5769a extends C5704c {

        /* renamed from: e */
        long f16750e;

        /* renamed from: f */
        long f16751f;

        /* renamed from: g */
        long f16752g;

        /* renamed from: h */
        long f16753h;

        /* renamed from: i */
        long f16754i;

        /* renamed from: j */
        long f16755j;

        /* renamed from: k */
        long f16756k;

        /* renamed from: l */
        long f16757l;

        /* renamed from: m */
        long f16758m;

        C5769a(OsSchemaInfo osSchemaInfo) {
            super(8);
            OsObjectSchemaInfo b = osSchemaInfo.mo16474b("__Permission");
            this.f16751f = mo16618b("role", "role", b);
            this.f16752g = mo16618b("canRead", "canRead", b);
            this.f16753h = mo16618b("canUpdate", "canUpdate", b);
            this.f16754i = mo16618b("canDelete", "canDelete", b);
            this.f16755j = mo16618b("canSetPermissions", "canSetPermissions", b);
            this.f16756k = mo16618b("canQuery", "canQuery", b);
            this.f16757l = mo16618b("canCreate", "canCreate", b);
            this.f16758m = mo16618b("canModifySchema", "canModifySchema", b);
            this.f16750e = b.mo16429c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo16217c(C5704c cVar, C5704c cVar2) {
            C5769a aVar = (C5769a) cVar;
            C5769a aVar2 = (C5769a) cVar2;
            aVar2.f16751f = aVar.f16751f;
            aVar2.f16752g = aVar.f16752g;
            aVar2.f16753h = aVar.f16753h;
            aVar2.f16754i = aVar.f16754i;
            aVar2.f16755j = aVar.f16755j;
            aVar2.f16756k = aVar.f16756k;
            aVar2.f16757l = aVar.f16757l;
            aVar2.f16758m = aVar.f16758m;
            aVar2.f16750e = aVar.f16750e;
        }
    }

    C5768m1() {
        this.f16749j.mo16262k();
    }

    /* renamed from: U */
    public static C5808b m24103U(C5648d0 d0Var, C5769a aVar, C5808b bVar, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        C5811e W;
        C5720n nVar = map.get(bVar);
        if (nVar != null) {
            return (C5808b) nVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C5808b.class), aVar.f16750e, set);
        osObjectBuilder.mo16643a(aVar.f16752g, Boolean.valueOf(bVar.mo16749t()));
        osObjectBuilder.mo16643a(aVar.f16753h, Boolean.valueOf(bVar.mo16747p()));
        osObjectBuilder.mo16643a(aVar.f16754i, Boolean.valueOf(bVar.mo16740G()));
        osObjectBuilder.mo16643a(aVar.f16755j, Boolean.valueOf(bVar.mo16748q()));
        osObjectBuilder.mo16643a(aVar.f16756k, Boolean.valueOf(bVar.mo16741I()));
        osObjectBuilder.mo16643a(aVar.f16757l, Boolean.valueOf(bVar.mo16739D()));
        osObjectBuilder.mo16643a(aVar.f16758m, Boolean.valueOf(bVar.mo16746o()));
        C5768m1 Z = m24108Z(d0Var, osObjectBuilder.mo16653w());
        map.put(bVar, Z);
        C5811e m = bVar.mo16745m();
        if (m == null) {
            W = null;
        } else {
            C5811e eVar = (C5811e) map.get(m);
            if (eVar != null) {
                Z.mo16742a0(eVar);
                return Z;
            }
            W = C5790s1.m24213W(d0Var, (C5790s1.C5791a) d0Var.mo16219H().mo16773b(C5811e.class), m, z, map, set);
        }
        Z.mo16742a0(W);
        return Z;
    }

    /* renamed from: V */
    public static C5808b m24104V(C5648d0 d0Var, C5769a aVar, C5808b bVar, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        if (bVar instanceof C5720n) {
            C5720n nVar = (C5720n) bVar;
            if (nVar.mo16212L().mo16258e() != null) {
                C5632b e = nVar.mo16212L().mo16258e();
                if (e.f16246f != d0Var.f16246f) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (e.mo16218D().equals(d0Var.mo16218D())) {
                    return bVar;
                }
            }
        }
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        C5720n nVar2 = map.get(bVar);
        return nVar2 != null ? (C5808b) nVar2 : m24103U(d0Var, aVar, bVar, z, map, set);
    }

    /* renamed from: W */
    public static C5769a m24105W(OsSchemaInfo osSchemaInfo) {
        return new C5769a(osSchemaInfo);
    }

    /* renamed from: X */
    private static OsObjectSchemaInfo m24106X() {
        OsObjectSchemaInfo.C5685b bVar = new OsObjectSchemaInfo.C5685b("__Permission", 8, 0);
        bVar.mo16433b("role", RealmFieldType.OBJECT, "__Role");
        OsObjectSchemaInfo.C5685b bVar2 = bVar;
        bVar2.mo16434c("canRead", RealmFieldType.BOOLEAN, false, false, true);
        bVar2.mo16434c("canUpdate", RealmFieldType.BOOLEAN, false, false, true);
        bVar2.mo16434c("canDelete", RealmFieldType.BOOLEAN, false, false, true);
        bVar2.mo16434c("canSetPermissions", RealmFieldType.BOOLEAN, false, false, true);
        bVar2.mo16434c("canQuery", RealmFieldType.BOOLEAN, false, false, true);
        bVar2.mo16434c("canCreate", RealmFieldType.BOOLEAN, false, false, true);
        bVar2.mo16434c("canModifySchema", RealmFieldType.BOOLEAN, false, false, true);
        return bVar.mo16435d();
    }

    /* renamed from: Y */
    public static OsObjectSchemaInfo m24107Y() {
        return f16747k;
    }

    /* renamed from: Z */
    private static C5768m1 m24108Z(C5632b bVar, C5722p pVar) {
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        eVar.mo16245g(bVar, pVar, bVar.mo16219H().mo16773b(C5808b.class), false, Collections.emptyList());
        C5768m1 m1Var = new C5768m1();
        eVar.mo16239a();
        return m1Var;
    }

    /* renamed from: D */
    public boolean mo16739D() {
        this.f16749j.mo16258e().mo16228j();
        return this.f16749j.mo16259f().mo16600r(this.f16748i.f16757l);
    }

    /* renamed from: G */
    public boolean mo16740G() {
        this.f16749j.mo16258e().mo16228j();
        return this.f16749j.mo16259f().mo16600r(this.f16748i.f16754i);
    }

    /* renamed from: I */
    public boolean mo16741I() {
        this.f16749j.mo16258e().mo16228j();
        return this.f16749j.mo16259f().mo16600r(this.f16748i.f16756k);
    }

    /* renamed from: L */
    public C5642c0<?> mo16212L() {
        return this.f16749j;
    }

    /* renamed from: Q */
    public void mo16213Q() {
        if (this.f16749j == null) {
            C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
            this.f16748i = (C5769a) eVar.mo16241c();
            C5642c0<C5808b> c0Var = new C5642c0<>(this);
            this.f16749j = c0Var;
            c0Var.mo16264m(eVar.mo16243e());
            this.f16749j.mo16265n(eVar.mo16244f());
            this.f16749j.mo16261j(eVar.mo16240b());
            this.f16749j.mo16263l(eVar.mo16242d());
        }
    }

    /* renamed from: a0 */
    public void mo16742a0(C5811e eVar) {
        if (!this.f16749j.mo16260g()) {
            this.f16749j.mo16258e().mo16228j();
            if (eVar == null) {
                this.f16749j.mo16259f().mo16587J(this.f16748i.f16751f);
                return;
            }
            this.f16749j.mo16255b(eVar);
            this.f16749j.mo16259f().mo16605w(this.f16748i.f16751f, ((C5720n) eVar).mo16212L().mo16259f().mo16589g());
        } else if (this.f16749j.mo16256c() && !this.f16749j.mo16257d().contains("role")) {
            if (eVar != null && !C5771n0.m24127S(eVar)) {
                eVar = (C5811e) ((C5648d0) this.f16749j.mo16258e()).mo16272g0(eVar, new C5781q[0]);
            }
            C5722p f = this.f16749j.mo16259f();
            if (eVar == null) {
                f.mo16587J(this.f16748i.f16751f);
                return;
            }
            this.f16749j.mo16255b(eVar);
            f.mo16592k().mo16564v(this.f16748i.f16751f, f.mo16589g(), ((C5720n) eVar).mo16212L().mo16259f().mo16589g(), true);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5768m1.class != obj.getClass()) {
            return false;
        }
        C5768m1 m1Var = (C5768m1) obj;
        String D = this.f16749j.mo16258e().mo16218D();
        String D2 = m1Var.f16749j.mo16258e().mo16218D();
        if (D == null ? D2 != null : !D.equals(D2)) {
            return false;
        }
        String m = this.f16749j.mo16259f().mo16592k().mo16555m();
        String m2 = m1Var.f16749j.mo16259f().mo16592k().mo16555m();
        if (m == null ? m2 == null : m.equals(m2)) {
            return this.f16749j.mo16259f().mo16589g() == m1Var.f16749j.mo16259f().mo16589g();
        }
        return false;
    }

    public int hashCode() {
        String D = this.f16749j.mo16258e().mo16218D();
        String m = this.f16749j.mo16259f().mo16592k().mo16555m();
        long g = this.f16749j.mo16259f().mo16589g();
        int i = 0;
        int hashCode = (527 + (D != null ? D.hashCode() : 0)) * 31;
        if (m != null) {
            i = m.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((g >>> 32) ^ g));
    }

    /* renamed from: m */
    public C5811e mo16745m() {
        this.f16749j.mo16258e().mo16228j();
        if (this.f16749j.mo16259f().mo16346l(this.f16748i.f16751f)) {
            return null;
        }
        return (C5811e) this.f16749j.mo16258e().mo16231t(C5811e.class, this.f16749j.mo16259f().mo16601s(this.f16748i.f16751f), false, Collections.emptyList());
    }

    /* renamed from: o */
    public boolean mo16746o() {
        this.f16749j.mo16258e().mo16228j();
        return this.f16749j.mo16259f().mo16600r(this.f16748i.f16758m);
    }

    /* renamed from: p */
    public boolean mo16747p() {
        this.f16749j.mo16258e().mo16228j();
        return this.f16749j.mo16259f().mo16600r(this.f16748i.f16753h);
    }

    /* renamed from: q */
    public boolean mo16748q() {
        this.f16749j.mo16258e().mo16228j();
        return this.f16749j.mo16259f().mo16600r(this.f16748i.f16755j);
    }

    /* renamed from: t */
    public boolean mo16749t() {
        this.f16749j.mo16258e().mo16228j();
        return this.f16749j.mo16259f().mo16600r(this.f16748i.f16752g);
    }

    public String toString() {
        if (!C5771n0.m24128T(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Permission = proxy[");
        sb.append("{role:");
        sb.append(mo16745m() != null ? "Role" : "null");
        sb.append("}");
        sb.append(",");
        sb.append("{canRead:");
        sb.append(mo16749t());
        sb.append("}");
        sb.append(",");
        sb.append("{canUpdate:");
        sb.append(mo16747p());
        sb.append("}");
        sb.append(",");
        sb.append("{canDelete:");
        sb.append(mo16740G());
        sb.append("}");
        sb.append(",");
        sb.append("{canSetPermissions:");
        sb.append(mo16748q());
        sb.append("}");
        sb.append(",");
        sb.append("{canQuery:");
        sb.append(mo16741I());
        sb.append("}");
        sb.append(",");
        sb.append("{canCreate:");
        sb.append(mo16739D());
        sb.append("}");
        sb.append(",");
        sb.append("{canModifySchema:");
        sb.append(mo16746o());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
