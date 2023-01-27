package p340io.realm;

import android.content.Context;
import android.os.SystemClock;
import com.karumi.dexter.BuildConfig;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p340io.realm.C5672i0;
import p340io.realm.exceptions.RealmException;
import p340io.realm.exceptions.RealmMigrationNeededException;
import p340io.realm.exceptions.RealmPrimaryKeyConstraintException;
import p340io.realm.internal.C5703b;
import p340io.realm.internal.C5713j;
import p340io.realm.internal.C5719m;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5721o;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.OsSharedRealm;
import p340io.realm.internal.Table;
import p340io.realm.internal.Util;
import p340io.realm.log.RealmLog;

/* renamed from: io.realm.d0 */
public class C5648d0 extends C5632b {

    /* renamed from: o */
    private static final Object f16283o = new Object();

    /* renamed from: p */
    private static C5672i0 f16284p;

    /* renamed from: n */
    private final C5786r0 f16285n;

    /* renamed from: io.realm.d0$a */
    public interface C5649a {
        /* renamed from: a */
        void mo356a(C5648d0 d0Var);
    }

    private C5648d0(C5661g0 g0Var) {
        super(g0Var, m23423i0(g0Var.mo16298i().mo16318n()));
        this.f16285n = new C5777p(this, new C5703b(this.f16247g.mo16318n(), this.f16249i.getSchemaInfo()));
        if (this.f16247g.mo16321q()) {
            C5721o n = this.f16247g.mo16318n();
            for (Class<? extends C5763l0> g : n.mo16147f()) {
                String o = Table.m23720o(n.mo16640g(g));
                if (!this.f16249i.hasTable(o)) {
                    this.f16249i.close();
                    throw new RealmMigrationNeededException(this.f16247g.mo16315k(), String.format(Locale.US, "Cannot open the read only Realm. '%s' is missing.", new Object[]{Table.m23719g(o)}));
                }
            }
        }
    }

    private C5648d0(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.f16285n = new C5777p(this, new C5703b(this.f16247g.mo16318n(), osSharedRealm.getSchemaInfo()));
    }

    /* renamed from: X */
    private static void m23419X(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            if (!filesDir.exists()) {
                try {
                    filesDir.mkdirs();
                } catch (SecurityException unused) {
                }
            } else {
                return;
            }
        }
        if (filesDir == null || !filesDir.exists()) {
            long[] jArr = {1, 2, 5, 10, 16};
            long j = 0;
            int i = -1;
            do {
                if (context.getFilesDir() != null && context.getFilesDir().exists()) {
                    break;
                }
                i++;
                long j2 = jArr[Math.min(i, 4)];
                SystemClock.sleep(j2);
                j += j2;
            } while (j <= 200);
        }
        if (context.getFilesDir() == null || !context.getFilesDir().exists()) {
            throw new IllegalStateException("Context.getFilesDir() returns " + context.getFilesDir() + " which is not an existing directory. See https://issuetracker.google.com/issues/36918154");
        }
    }

    /* renamed from: a0 */
    private void m23420a0(Class<? extends C5763l0> cls) {
        if (this.f16249i.getSchemaInfo().mo16474b(this.f16247g.mo16318n().mo16640g(cls)).mo16430d() == null) {
            throw new IllegalArgumentException("A RealmObject with no @PrimaryKey cannot be updated: " + cls.toString());
        }
    }

    /* renamed from: e0 */
    private <E extends C5763l0> void m23421e0(E e) {
        if (e == null) {
            throw new IllegalArgumentException("Null objects cannot be copied into Realm.");
        }
    }

    /* renamed from: f0 */
    private <E extends C5763l0> E m23422f0(E e, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        mo16228j();
        if (mo16222S()) {
            try {
                return this.f16247g.mo16318n().mo16144b(this, e, z, map, set);
            } catch (IllegalStateException e2) {
                if (e2.getMessage().startsWith("Attempting to create an object of type")) {
                    throw new RealmPrimaryKeyConstraintException(e2.getMessage());
                }
                throw e2;
            }
        } else {
            throw new IllegalStateException("`copyOrUpdate` can only be called inside a write transaction.");
        }
    }

    /* renamed from: i0 */
    private static OsSchemaInfo m23423i0(C5721o oVar) {
        return new OsSchemaInfo(oVar.mo16146d().values());
    }

    /* renamed from: j0 */
    static C5648d0 m23424j0(C5661g0 g0Var) {
        return new C5648d0(g0Var);
    }

    /* renamed from: k0 */
    static C5648d0 m23425k0(OsSharedRealm osSharedRealm) {
        return new C5648d0(osSharedRealm);
    }

    /* renamed from: n0 */
    public static C5672i0 m23426n0() {
        C5672i0 i0Var;
        synchronized (f16283o) {
            i0Var = f16284p;
        }
        return i0Var;
    }

    /* renamed from: o0 */
    public static C5648d0 m23427o0() {
        C5672i0 n0 = m23426n0();
        if (n0 != null) {
            return (C5648d0) C5661g0.m23495d(n0, C5648d0.class);
        }
        if (C5632b.f16244l == null) {
            throw new IllegalStateException("Call `Realm.init(Context)` before calling this method.");
        }
        throw new IllegalStateException("Set default configuration by using `Realm.setDefaultConfiguration(RealmConfiguration)`.");
    }

    /* renamed from: p0 */
    public static Object m23428p0() {
        try {
            Constructor constructor = Class.forName("io.realm.DefaultRealmModule").getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (InvocationTargetException e) {
            throw new RealmException("Could not create an instance of " + "io.realm.DefaultRealmModule", e);
        } catch (InstantiationException e2) {
            throw new RealmException("Could not create an instance of " + "io.realm.DefaultRealmModule", e2);
        } catch (IllegalAccessException e3) {
            throw new RealmException("Could not create an instance of " + "io.realm.DefaultRealmModule", e3);
        }
    }

    /* renamed from: r0 */
    public static synchronized void m23429r0(Context context) {
        synchronized (C5648d0.class) {
            m23430s0(context, BuildConfig.FLAVOR);
        }
    }

    /* renamed from: s0 */
    private static void m23430s0(Context context, String str) {
        if (C5632b.f16244l != null) {
            return;
        }
        if (context != null) {
            m23419X(context);
            C5719m.m23888a(context);
            m23431t0(new C5672i0.C5673a(context).mo16328b());
            C5713j.getSyncFacadeIfPossible().initialize(context, str);
            if (context.getApplicationContext() != null) {
                C5632b.f16244l = context.getApplicationContext();
            } else {
                C5632b.f16244l = context;
            }
            OsSharedRealm.initialize(new File(context.getFilesDir(), ".realm.temp"));
            return;
        }
        throw new IllegalArgumentException("Non-null context required.");
    }

    /* renamed from: t0 */
    public static void m23431t0(C5672i0 i0Var) {
        if (i0Var != null) {
            synchronized (f16283o) {
                f16284p = i0Var;
            }
            return;
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    /* renamed from: H */
    public C5786r0 mo16219H() {
        return this.f16285n;
    }

    /* renamed from: g0 */
    public <E extends C5763l0> E mo16272g0(E e, C5781q... qVarArr) {
        m23421e0(e);
        return m23422f0(e, false, new HashMap(), Util.m23794g(qVarArr));
    }

    /* renamed from: h0 */
    public <E extends C5763l0> E mo16273h0(E e, C5781q... qVarArr) {
        m23421e0(e);
        m23420a0(e.getClass());
        return m23422f0(e, true, new HashMap(), Util.m23794g(qVarArr));
    }

    /* renamed from: l0 */
    public void mo16274l0(Class<? extends C5763l0> cls) {
        mo16228j();
        if (!this.f16249i.isPartial()) {
            this.f16285n.mo16776e(cls).mo16545b(this.f16249i.isPartial());
            return;
        }
        throw new IllegalStateException("This API is not supported by partially synchronized Realms. Either unsubscribe using 'Realm.unsubscribeAsync()' or delete the objects using a query and 'RealmResults.deleteAllFromRealm()'");
    }

    /* renamed from: m0 */
    public void mo16275m0(C5649a aVar) {
        if (aVar != null) {
            mo16224a();
            try {
                aVar.mo356a(this);
                mo16229m();
            } catch (Throwable th) {
                if (mo16222S()) {
                    mo16227h();
                } else {
                    RealmLog.m24088n("Could not cancel transaction, not currently in a transaction.", new Object[0]);
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Transaction should not be null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public Table mo16276q0(Class<? extends C5763l0> cls) {
        return this.f16285n.mo16776e(cls);
    }

    /* renamed from: u0 */
    public <E extends C5763l0> RealmQuery<E> mo16277u0(Class<E> cls) {
        mo16228j();
        return RealmQuery.m23262b(this, cls);
    }
}
