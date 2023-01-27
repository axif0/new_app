package p340io.realm;

import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import p340io.realm.C5632b;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.objectstore.OsObjectBuilder;
import p340io.realm.p347v1.C5805a;

/* renamed from: io.realm.i1 */
public class C5674i1 extends C5805a implements C5720n, C5755j1 {

    /* renamed from: m */
    private static final OsObjectSchemaInfo f16374m = m23579X();

    /* renamed from: k */
    private C5675a f16375k;

    /* renamed from: l */
    private C5642c0<C5805a> f16376l;

    /* renamed from: io.realm.i1$a */
    static final class C5675a extends C5704c {

        /* renamed from: e */
        long f16377e;

        /* renamed from: f */
        long f16378f;

        /* renamed from: g */
        long f16379g;

        /* renamed from: h */
        long f16380h;

        /* renamed from: i */
        long f16381i;

        /* renamed from: j */
        long f16382j;

        /* renamed from: k */
        long f16383k;

        /* renamed from: l */
        long f16384l;

        /* renamed from: m */
        long f16385m;

        /* renamed from: n */
        long f16386n;

        /* renamed from: o */
        long f16387o;

        C5675a(OsSchemaInfo osSchemaInfo) {
            super(10);
            OsObjectSchemaInfo b = osSchemaInfo.mo16474b("__ResultSets");
            this.f16378f = mo16618b("name", "name", b);
            this.f16379g = mo16618b("status", "status", b);
            this.f16380h = mo16618b("errorMessage", "error_message", b);
            this.f16381i = mo16618b("matchesProperty", "matches_property", b);
            this.f16382j = mo16618b("query", "query", b);
            this.f16383k = mo16618b("queryParseCounter", "query_parse_counter", b);
            this.f16384l = mo16618b("createdAt", "created_at", b);
            this.f16385m = mo16618b("updatedAt", "updated_at", b);
            this.f16386n = mo16618b("expiresAt", "expires_at", b);
            this.f16387o = mo16618b("timeToLive", "time_to_live", b);
            this.f16377e = b.mo16429c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo16217c(C5704c cVar, C5704c cVar2) {
            C5675a aVar = (C5675a) cVar;
            C5675a aVar2 = (C5675a) cVar2;
            aVar2.f16378f = aVar.f16378f;
            aVar2.f16379g = aVar.f16379g;
            aVar2.f16380h = aVar.f16380h;
            aVar2.f16381i = aVar.f16381i;
            aVar2.f16382j = aVar.f16382j;
            aVar2.f16383k = aVar.f16383k;
            aVar2.f16384l = aVar.f16384l;
            aVar2.f16385m = aVar.f16385m;
            aVar2.f16386n = aVar.f16386n;
            aVar2.f16387o = aVar.f16387o;
            aVar2.f16377e = aVar.f16377e;
        }
    }

    C5674i1() {
        this.f16376l.mo16262k();
    }

    /* renamed from: U */
    public static C5805a m23576U(C5648d0 d0Var, C5675a aVar, C5805a aVar2, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        C5720n nVar = map.get(aVar2);
        if (nVar != null) {
            return (C5805a) nVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.mo16276q0(C5805a.class), aVar.f16377e, set);
        osObjectBuilder.mo16652u(aVar.f16378f, aVar2.mo16337c());
        osObjectBuilder.mo16646j(aVar.f16379g, Byte.valueOf(aVar2.mo16342w()));
        osObjectBuilder.mo16652u(aVar.f16380h, aVar2.mo16336R());
        osObjectBuilder.mo16652u(aVar.f16381i, aVar2.mo16343z());
        osObjectBuilder.mo16652u(aVar.f16382j, aVar2.mo16332A());
        osObjectBuilder.mo16647m(aVar.f16383k, Integer.valueOf(aVar2.mo16340n()));
        osObjectBuilder.mo16645h(aVar.f16384l, aVar2.mo16341v());
        osObjectBuilder.mo16645h(aVar.f16385m, aVar2.mo16335P());
        osObjectBuilder.mo16645h(aVar.f16386n, aVar2.mo16334M());
        osObjectBuilder.mo16648o(aVar.f16387o, aVar2.mo16333H());
        C5674i1 Z = m23581Z(d0Var, osObjectBuilder.mo16653w());
        map.put(aVar2, Z);
        return Z;
    }

    /* renamed from: V */
    public static C5805a m23577V(C5648d0 d0Var, C5675a aVar, C5805a aVar2, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        if (aVar2 instanceof C5720n) {
            C5720n nVar = (C5720n) aVar2;
            if (nVar.mo16212L().mo16258e() != null) {
                C5632b e = nVar.mo16212L().mo16258e();
                if (e.f16246f != d0Var.f16246f) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (e.mo16218D().equals(d0Var.mo16218D())) {
                    return aVar2;
                }
            }
        }
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        C5720n nVar2 = map.get(aVar2);
        return nVar2 != null ? (C5805a) nVar2 : m23576U(d0Var, aVar, aVar2, z, map, set);
    }

    /* renamed from: W */
    public static C5675a m23578W(OsSchemaInfo osSchemaInfo) {
        return new C5675a(osSchemaInfo);
    }

    /* renamed from: X */
    private static OsObjectSchemaInfo m23579X() {
        OsObjectSchemaInfo.C5685b bVar = new OsObjectSchemaInfo.C5685b("__ResultSets", 10, 0);
        OsObjectSchemaInfo.C5685b bVar2 = bVar;
        bVar2.mo16434c("name", RealmFieldType.STRING, false, true, true);
        bVar2.mo16434c("status", RealmFieldType.INTEGER, false, false, true);
        bVar2.mo16434c("error_message", RealmFieldType.STRING, false, false, true);
        bVar2.mo16434c("matches_property", RealmFieldType.STRING, false, false, true);
        bVar2.mo16434c("query", RealmFieldType.STRING, false, false, true);
        bVar2.mo16434c("query_parse_counter", RealmFieldType.INTEGER, false, false, true);
        bVar2.mo16434c("created_at", RealmFieldType.DATE, false, false, true);
        bVar2.mo16434c("updated_at", RealmFieldType.DATE, false, false, true);
        bVar2.mo16434c("expires_at", RealmFieldType.DATE, false, false, false);
        bVar2.mo16434c("time_to_live", RealmFieldType.INTEGER, false, false, false);
        return bVar.mo16435d();
    }

    /* renamed from: Y */
    public static OsObjectSchemaInfo m23580Y() {
        return f16374m;
    }

    /* renamed from: Z */
    private static C5674i1 m23581Z(C5632b bVar, C5722p pVar) {
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        eVar.mo16245g(bVar, pVar, bVar.mo16219H().mo16773b(C5805a.class), false, Collections.emptyList());
        C5674i1 i1Var = new C5674i1();
        eVar.mo16239a();
        return i1Var;
    }

    /* renamed from: A */
    public String mo16332A() {
        this.f16376l.mo16258e().mo16228j();
        return this.f16376l.mo16259f().mo16604v(this.f16375k.f16382j);
    }

    /* renamed from: H */
    public Long mo16333H() {
        this.f16376l.mo16258e().mo16228j();
        if (this.f16376l.mo16259f().mo16345E(this.f16375k.f16387o)) {
            return null;
        }
        return Long.valueOf(this.f16376l.mo16259f().mo16603u(this.f16375k.f16387o));
    }

    /* renamed from: L */
    public C5642c0<?> mo16212L() {
        return this.f16376l;
    }

    /* renamed from: M */
    public Date mo16334M() {
        this.f16376l.mo16258e().mo16228j();
        if (this.f16376l.mo16259f().mo16345E(this.f16375k.f16386n)) {
            return null;
        }
        return this.f16376l.mo16259f().mo16583B(this.f16375k.f16386n);
    }

    /* renamed from: P */
    public Date mo16335P() {
        this.f16376l.mo16258e().mo16228j();
        return this.f16376l.mo16259f().mo16583B(this.f16375k.f16385m);
    }

    /* renamed from: Q */
    public void mo16213Q() {
        if (this.f16376l == null) {
            C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
            this.f16375k = (C5675a) eVar.mo16241c();
            C5642c0<C5805a> c0Var = new C5642c0<>(this);
            this.f16376l = c0Var;
            c0Var.mo16264m(eVar.mo16243e());
            this.f16376l.mo16265n(eVar.mo16244f());
            this.f16376l.mo16261j(eVar.mo16240b());
            this.f16376l.mo16263l(eVar.mo16242d());
        }
    }

    /* renamed from: R */
    public String mo16336R() {
        this.f16376l.mo16258e().mo16228j();
        return this.f16376l.mo16259f().mo16604v(this.f16375k.f16380h);
    }

    /* renamed from: c */
    public String mo16337c() {
        this.f16376l.mo16258e().mo16228j();
        return this.f16376l.mo16259f().mo16604v(this.f16375k.f16378f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5674i1.class != obj.getClass()) {
            return false;
        }
        C5674i1 i1Var = (C5674i1) obj;
        String D = this.f16376l.mo16258e().mo16218D();
        String D2 = i1Var.f16376l.mo16258e().mo16218D();
        if (D == null ? D2 != null : !D.equals(D2)) {
            return false;
        }
        String m = this.f16376l.mo16259f().mo16592k().mo16555m();
        String m2 = i1Var.f16376l.mo16259f().mo16592k().mo16555m();
        if (m == null ? m2 == null : m.equals(m2)) {
            return this.f16376l.mo16259f().mo16589g() == i1Var.f16376l.mo16259f().mo16589g();
        }
        return false;
    }

    public int hashCode() {
        String D = this.f16376l.mo16258e().mo16218D();
        String m = this.f16376l.mo16259f().mo16592k().mo16555m();
        long g = this.f16376l.mo16259f().mo16589g();
        int i = 0;
        int hashCode = (527 + (D != null ? D.hashCode() : 0)) * 31;
        if (m != null) {
            i = m.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((g >>> 32) ^ g));
    }

    /* renamed from: n */
    public int mo16340n() {
        this.f16376l.mo16258e().mo16228j();
        return (int) this.f16376l.mo16259f().mo16603u(this.f16375k.f16383k);
    }

    /* renamed from: v */
    public Date mo16341v() {
        this.f16376l.mo16258e().mo16228j();
        return this.f16376l.mo16259f().mo16583B(this.f16375k.f16384l);
    }

    /* renamed from: w */
    public byte mo16342w() {
        this.f16376l.mo16258e().mo16228j();
        return (byte) ((int) this.f16376l.mo16259f().mo16603u(this.f16375k.f16379g));
    }

    /* renamed from: z */
    public String mo16343z() {
        this.f16376l.mo16258e().mo16228j();
        return this.f16376l.mo16259f().mo16604v(this.f16375k.f16381i);
    }
}
