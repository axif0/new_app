package p340io.realm.internal;

import java.lang.ref.WeakReference;
import java.util.Date;
import p340io.realm.C5669h0;
import p340io.realm.RealmFieldType;

/* renamed from: io.realm.internal.l */
public class C5717l implements C5722p {

    /* renamed from: f */
    private OsSharedRealm f16518f;

    /* renamed from: g */
    private OsResults f16519g;

    /* renamed from: h */
    private C5669h0<C5717l> f16520h;

    /* renamed from: i */
    private WeakReference<C5718a> f16521i;

    /* renamed from: j */
    private boolean f16522j;

    /* renamed from: io.realm.internal.l$a */
    public interface C5718a {
        /* renamed from: a */
        void mo16254a(C5722p pVar);
    }

    /* renamed from: a */
    private void m23858a() {
        this.f16519g.mo16457o(this, this.f16520h);
        this.f16519g = null;
        this.f16520h = null;
        this.f16518f.removePendingRow(this);
    }

    /* renamed from: c */
    private void m23859c() {
        C5722p pVar;
        WeakReference<C5718a> weakReference = this.f16521i;
        if (weakReference != null) {
            C5718a aVar = (C5718a) weakReference.get();
            if (aVar == null) {
                m23858a();
            } else if (this.f16519g.mo16454l()) {
                UncheckedRow g = this.f16519g.mo16449g();
                m23858a();
                if (g != null) {
                    pVar = g;
                    if (this.f16522j) {
                        pVar = CheckedRow.m23596e(g);
                    }
                } else {
                    pVar = C5710g.INSTANCE;
                }
                aVar.mo16254a(pVar);
            } else {
                m23858a();
            }
        } else {
            throw new IllegalStateException("The 'frontEnd' has not been set.");
        }
    }

    /* renamed from: A */
    public boolean mo16582A() {
        return false;
    }

    /* renamed from: B */
    public Date mo16583B(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: D */
    public OsList mo16344D(long j, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: E */
    public boolean mo16345E(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: F */
    public String mo16584F(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: G */
    public void mo16585G(long j, Date date) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: H */
    public RealmFieldType mo16586H(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: J */
    public void mo16587J(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: b */
    public void mo16638b() {
        if (this.f16519g != null) {
            m23859c();
            return;
        }
        throw new IllegalStateException("The query has been executed. This 'PendingRow' is not valid anymore.");
    }

    /* renamed from: g */
    public long mo16589g() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: h */
    public void mo16590h(long j, String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: j */
    public long mo16591j() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: k */
    public Table mo16592k() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: l */
    public boolean mo16346l(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: m */
    public void mo16347m(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: n */
    public byte[] mo16593n(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: o */
    public void mo16598o(long j, boolean z) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: q */
    public double mo16599q(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: r */
    public boolean mo16600r(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: s */
    public long mo16601s(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: t */
    public float mo16602t(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: u */
    public long mo16603u(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: v */
    public String mo16604v(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: w */
    public void mo16605w(long j, long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: x */
    public long mo16606x(String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: y */
    public OsList mo16368y(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    /* renamed from: z */
    public void mo16607z(long j, long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
}
