package p340io.realm;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p340io.realm.C5648d0;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5710g;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.CheckedRow;
import p340io.realm.internal.OsObjectStore;
import p340io.realm.internal.OsRealmConfig;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.OsSharedRealm;
import p340io.realm.internal.Table;
import p340io.realm.internal.UncheckedRow;
import p340io.realm.internal.Util;
import p340io.realm.internal.async.C5701b;
import p340io.realm.log.RealmLog;

/* renamed from: io.realm.b */
abstract class C5632b implements Closeable {

    /* renamed from: l */
    static volatile Context f16244l;

    /* renamed from: m */
    public static final C5638f f16245m = new C5638f();

    /* renamed from: f */
    final long f16246f;

    /* renamed from: g */
    protected final C5672i0 f16247g;

    /* renamed from: h */
    private C5661g0 f16248h;

    /* renamed from: i */
    public OsSharedRealm f16249i;

    /* renamed from: j */
    private boolean f16250j;

    /* renamed from: k */
    private OsSharedRealm.SchemaChangedCallback f16251k;

    /* renamed from: io.realm.b$a */
    class C5633a implements OsSharedRealm.SchemaChangedCallback {
        C5633a() {
        }

        public void onSchemaChanged() {
            C5786r0 H = C5632b.this.mo16219H();
            if (H != null) {
                H.mo16779i();
            }
        }
    }

    /* renamed from: io.realm.b$b */
    class C5634b implements OsSharedRealm.InitializationCallback {

        /* renamed from: a */
        final /* synthetic */ C5648d0.C5649a f16253a;

        C5634b(C5648d0.C5649a aVar) {
            this.f16253a = aVar;
        }

        public void onInit(OsSharedRealm osSharedRealm) {
            this.f16253a.mo356a(C5648d0.m23425k0(osSharedRealm));
        }
    }

    /* renamed from: io.realm.b$c */
    class C5635c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C5672i0 f16255f;

        /* renamed from: g */
        final /* synthetic */ AtomicBoolean f16256g;

        C5635c(C5672i0 i0Var, AtomicBoolean atomicBoolean) {
            this.f16255f = i0Var;
            this.f16256g = atomicBoolean;
        }

        public void run() {
            this.f16256g.set(Util.m23788a(this.f16255f.mo16315k(), this.f16255f.mo16316l(), this.f16255f.mo16317m()));
        }
    }

    /* renamed from: io.realm.b$d */
    class C5636d implements OsSharedRealm.MigrationCallback {

        /* renamed from: a */
        final /* synthetic */ C5758k0 f16257a;

        C5636d(C5758k0 k0Var) {
            this.f16257a = k0Var;
        }

        public void onMigrationNeeded(OsSharedRealm osSharedRealm, long j, long j2) {
            this.f16257a.mo16720a(C5756k.m24052a0(osSharedRealm), j, j2);
        }
    }

    /* renamed from: io.realm.b$e */
    public static final class C5637e {

        /* renamed from: a */
        private C5632b f16258a;

        /* renamed from: b */
        private C5722p f16259b;

        /* renamed from: c */
        private C5704c f16260c;

        /* renamed from: d */
        private boolean f16261d;

        /* renamed from: e */
        private List<String> f16262e;

        /* renamed from: a */
        public void mo16239a() {
            this.f16258a = null;
            this.f16259b = null;
            this.f16260c = null;
            this.f16261d = false;
            this.f16262e = null;
        }

        /* renamed from: b */
        public boolean mo16240b() {
            return this.f16261d;
        }

        /* renamed from: c */
        public C5704c mo16241c() {
            return this.f16260c;
        }

        /* renamed from: d */
        public List<String> mo16242d() {
            return this.f16262e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C5632b mo16243e() {
            return this.f16258a;
        }

        /* renamed from: f */
        public C5722p mo16244f() {
            return this.f16259b;
        }

        /* renamed from: g */
        public void mo16245g(C5632b bVar, C5722p pVar, C5704c cVar, boolean z, List<String> list) {
            this.f16258a = bVar;
            this.f16259b = pVar;
            this.f16260c = cVar;
            this.f16261d = z;
            this.f16262e = list;
        }
    }

    /* renamed from: io.realm.b$f */
    static final class C5638f extends ThreadLocal<C5637e> {
        C5638f() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C5637e initialValue() {
            return new C5637e();
        }
    }

    static {
        C5701b.m23804c();
    }

    C5632b(C5661g0 g0Var, OsSchemaInfo osSchemaInfo) {
        this(g0Var.mo16298i(), osSchemaInfo);
        this.f16248h = g0Var;
    }

    C5632b(C5672i0 i0Var, OsSchemaInfo osSchemaInfo) {
        this.f16251k = new C5633a();
        this.f16246f = Thread.currentThread().getId();
        this.f16247g = i0Var;
        C5634b bVar = null;
        this.f16248h = null;
        OsSharedRealm.MigrationCallback o = (osSchemaInfo == null || i0Var.mo16314i() == null) ? null : m23336o(i0Var.mo16314i());
        C5648d0.C5649a h = i0Var.mo16312h();
        bVar = h != null ? new C5634b(h) : bVar;
        OsRealmConfig.C5687b bVar2 = new OsRealmConfig.C5687b(i0Var);
        bVar2.mo16441c(new File(f16244l.getFilesDir(), ".realm.temp"));
        bVar2.mo16439a(true);
        bVar2.mo16443e(o);
        bVar2.mo16444f(osSchemaInfo);
        bVar2.mo16442d(bVar);
        OsSharedRealm instance = OsSharedRealm.getInstance(bVar2);
        this.f16249i = instance;
        this.f16250j = true;
        instance.registerSchemaChangedCallback(this.f16251k);
    }

    C5632b(OsSharedRealm osSharedRealm) {
        this.f16251k = new C5633a();
        this.f16246f = Thread.currentThread().getId();
        this.f16247g = osSharedRealm.getConfiguration();
        this.f16248h = null;
        this.f16249i = osSharedRealm;
        this.f16250j = false;
    }

    /* renamed from: o */
    private static OsSharedRealm.MigrationCallback m23336o(C5758k0 k0Var) {
        return new C5636d(k0Var);
    }

    /* renamed from: q */
    static boolean m23337q(C5672i0 i0Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        if (OsObjectStore.m23669a(i0Var, new C5635c(i0Var, atomicBoolean))) {
            return atomicBoolean.get();
        }
        throw new IllegalStateException("It's not allowed to delete the file associated with an open Realm. Remember to close() all the instances of the Realm before deleting its file: " + i0Var.mo16315k());
    }

    /* renamed from: D */
    public String mo16218D() {
        return this.f16247g.mo16315k();
    }

    /* renamed from: H */
    public abstract C5786r0 mo16219H();

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public OsSharedRealm mo16220J() {
        return this.f16249i;
    }

    /* renamed from: Q */
    public boolean mo16221Q() {
        if (this.f16246f == Thread.currentThread().getId()) {
            OsSharedRealm osSharedRealm = this.f16249i;
            return osSharedRealm == null || osSharedRealm.isClosed();
        }
        throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
    }

    /* renamed from: S */
    public boolean mo16222S() {
        mo16228j();
        return this.f16249i.isInTransaction();
    }

    /* renamed from: V */
    public void mo16223V() {
        mo16228j();
        if (!mo16222S()) {
            this.f16249i.refresh();
            return;
        }
        throw new IllegalStateException("Cannot refresh a Realm instance inside a transaction.");
    }

    /* renamed from: a */
    public void mo16224a() {
        mo16228j();
        this.f16249i.beginTransaction();
    }

    public void close() {
        if (this.f16246f == Thread.currentThread().getId()) {
            C5661g0 g0Var = this.f16248h;
            if (g0Var != null) {
                g0Var.mo16300m(this);
            } else {
                mo16230r();
            }
        } else {
            throw new IllegalStateException("Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.");
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        OsSharedRealm osSharedRealm;
        if (this.f16250j && (osSharedRealm = this.f16249i) != null && !osSharedRealm.isClosed()) {
            RealmLog.m24088n("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", this.f16247g.mo16315k());
            C5661g0 g0Var = this.f16248h;
            if (g0Var != null) {
                g0Var.mo16299l();
            }
        }
        super.finalize();
    }

    /* renamed from: h */
    public void mo16227h() {
        mo16228j();
        this.f16249i.cancelTransaction();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo16228j() {
        OsSharedRealm osSharedRealm = this.f16249i;
        if (osSharedRealm == null || osSharedRealm.isClosed()) {
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        } else if (this.f16246f != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
    }

    /* renamed from: m */
    public void mo16229m() {
        mo16228j();
        this.f16249i.commitTransaction();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo16230r() {
        this.f16248h = null;
        OsSharedRealm osSharedRealm = this.f16249i;
        if (osSharedRealm != null && this.f16250j) {
            osSharedRealm.close();
            this.f16249i = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public <E extends C5763l0> E mo16231t(Class<E> cls, long j, boolean z, List<String> list) {
        return this.f16247g.mo16318n().mo16149i(cls, this, mo16219H().mo16776e(cls).mo16558p(j), mo16219H().mo16773b(cls), z, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public <E extends C5763l0> E mo16232u(Class<E> cls, String str, long j) {
        boolean z = str != null;
        Table f = z ? mo16219H().mo16777f(str) : mo16219H().mo16776e(cls);
        if (z) {
            return new C5761l(this, j != -1 ? f.mo16548e(j) : C5710g.INSTANCE);
        }
        return this.f16247g.mo16318n().mo16149i(cls, this, j != -1 ? f.mo16558p(j) : C5710g.INSTANCE, mo16219H().mo16773b(cls), false, Collections.emptyList());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public <E extends C5763l0> E mo16233w(Class<E> cls, String str, UncheckedRow uncheckedRow) {
        if (str != null) {
            return new C5761l(this, CheckedRow.m23596e(uncheckedRow));
        }
        return this.f16247g.mo16318n().mo16149i(cls, this, uncheckedRow, mo16219H().mo16773b(cls), false, Collections.emptyList());
    }

    /* renamed from: x */
    public C5672i0 mo16234x() {
        return this.f16247g;
    }
}
