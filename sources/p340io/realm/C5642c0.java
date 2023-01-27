package p340io.realm;

import java.util.List;
import p340io.realm.C5763l0;
import p340io.realm.internal.C5714k;
import p340io.realm.internal.C5717l;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsObject;
import p340io.realm.internal.OsSharedRealm;
import p340io.realm.internal.UncheckedRow;

/* renamed from: io.realm.c0 */
public final class C5642c0<E extends C5763l0> implements C5717l.C5718a {

    /* renamed from: h */
    private static C5644b f16266h = new C5644b();

    /* renamed from: a */
    private boolean f16267a = true;

    /* renamed from: b */
    private C5722p f16268b;

    /* renamed from: c */
    private OsObject f16269c;

    /* renamed from: d */
    private C5632b f16270d;

    /* renamed from: e */
    private boolean f16271e;

    /* renamed from: f */
    private List<String> f16272f;

    /* renamed from: g */
    private C5714k<OsObject.C5682b> f16273g = new C5714k<>();

    /* renamed from: io.realm.c0$b */
    private static class C5644b implements C5714k.C5715a<OsObject.C5682b> {
        private C5644b() {
        }

        /* renamed from: b */
        public void mo16266a(OsObject.C5682b bVar, Object obj) {
            bVar.mo16428a((C5763l0) obj, (C5795u) null);
        }
    }

    public C5642c0(E e) {
    }

    /* renamed from: h */
    private void m23377h() {
        this.f16273g.mo16631c(f16266h);
    }

    /* renamed from: i */
    private void m23378i() {
        OsSharedRealm osSharedRealm = this.f16270d.f16249i;
        if (osSharedRealm != null && !osSharedRealm.isClosed() && this.f16268b.mo16582A() && this.f16269c == null) {
            OsObject osObject = new OsObject(this.f16270d.f16249i, (UncheckedRow) this.f16268b);
            this.f16269c = osObject;
            osObject.setObserverPairs(this.f16273g);
            this.f16273g = null;
        }
    }

    /* renamed from: a */
    public void mo16254a(C5722p pVar) {
        this.f16268b = pVar;
        m23377h();
        if (pVar.mo16582A()) {
            m23378i();
        }
    }

    /* renamed from: b */
    public void mo16255b(C5763l0 l0Var) {
        if (!C5771n0.m24128T(l0Var) || !C5771n0.m24127S(l0Var)) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        } else if (((C5720n) l0Var).mo16212L().mo16258e() != mo16258e()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
    }

    /* renamed from: c */
    public boolean mo16256c() {
        return this.f16271e;
    }

    /* renamed from: d */
    public List<String> mo16257d() {
        return this.f16272f;
    }

    /* renamed from: e */
    public C5632b mo16258e() {
        return this.f16270d;
    }

    /* renamed from: f */
    public C5722p mo16259f() {
        return this.f16268b;
    }

    /* renamed from: g */
    public boolean mo16260g() {
        return this.f16267a;
    }

    /* renamed from: j */
    public void mo16261j(boolean z) {
        this.f16271e = z;
    }

    /* renamed from: k */
    public void mo16262k() {
        this.f16267a = false;
        this.f16272f = null;
    }

    /* renamed from: l */
    public void mo16263l(List<String> list) {
        this.f16272f = list;
    }

    /* renamed from: m */
    public void mo16264m(C5632b bVar) {
        this.f16270d = bVar;
    }

    /* renamed from: n */
    public void mo16265n(C5722p pVar) {
        this.f16268b = pVar;
    }
}
