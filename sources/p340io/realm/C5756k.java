package p340io.realm;

import p340io.realm.C5661g0;
import p340io.realm.internal.OsObjectStore;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.OsSharedRealm;

/* renamed from: io.realm.k */
public class C5756k extends C5632b {

    /* renamed from: n */
    private final C5786r0 f16600n = new C5792t(this);

    /* renamed from: io.realm.k$a */
    class C5757a implements C5661g0.C5663b {

        /* renamed from: a */
        final /* synthetic */ C5661g0 f16601a;

        C5757a(C5661g0 g0Var) {
            this.f16601a = g0Var;
        }

        /* renamed from: a */
        public void mo16302a(int i) {
            if (i <= 0 && !this.f16601a.mo16298i().mo16321q() && OsObjectStore.m23671c(C5756k.this.f16249i) == -1) {
                C5756k.this.f16249i.beginTransaction();
                if (OsObjectStore.m23671c(C5756k.this.f16249i) == -1) {
                    OsObjectStore.m23672d(C5756k.this.f16249i, -1);
                }
                C5756k.this.f16249i.commitTransaction();
            }
        }
    }

    private C5756k(C5661g0 g0Var) {
        super(g0Var, (OsSchemaInfo) null);
        C5661g0.m23501k(g0Var.mo16298i(), new C5757a(g0Var));
    }

    private C5756k(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
    }

    /* renamed from: X */
    static C5756k m24051X(C5661g0 g0Var) {
        return new C5756k(g0Var);
    }

    /* renamed from: a0 */
    static C5756k m24052a0(OsSharedRealm osSharedRealm) {
        return new C5756k(osSharedRealm);
    }

    /* renamed from: H */
    public C5786r0 mo16219H() {
        return this.f16600n;
    }
}
