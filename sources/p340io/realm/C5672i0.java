package p340io.realm;

import android.content.Context;
import com.karumi.dexter.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p340io.realm.C5648d0;
import p340io.realm.annotations.RealmModule;
import p340io.realm.exceptions.RealmException;
import p340io.realm.exceptions.RealmFileException;
import p340io.realm.internal.C5719m;
import p340io.realm.internal.C5721o;
import p340io.realm.internal.OsRealmConfig;
import p340io.realm.internal.Util;
import p340io.realm.internal.p342t.C5737a;
import p340io.realm.internal.p342t.C5738b;
import p340io.realm.p346u1.C5797a;
import p340io.realm.p346u1.C5802b;

/* renamed from: io.realm.i0 */
public class C5672i0 {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final Object f16342p;

    /* renamed from: q */
    protected static final C5721o f16343q;

    /* renamed from: r */
    private static Boolean f16344r;

    /* renamed from: a */
    private final File f16345a;

    /* renamed from: b */
    private final String f16346b;

    /* renamed from: c */
    private final String f16347c;

    /* renamed from: d */
    private final String f16348d;

    /* renamed from: e */
    private final byte[] f16349e;

    /* renamed from: f */
    private final long f16350f;

    /* renamed from: g */
    private final C5758k0 f16351g;

    /* renamed from: h */
    private final boolean f16352h;

    /* renamed from: i */
    private final OsRealmConfig.C5688c f16353i;

    /* renamed from: j */
    private final C5721o f16354j;

    /* renamed from: k */
    private final C5802b f16355k;

    /* renamed from: l */
    private final C5648d0.C5649a f16356l;

    /* renamed from: m */
    private final boolean f16357m;

    /* renamed from: n */
    private final CompactOnLaunchCallback f16358n;

    /* renamed from: o */
    private final boolean f16359o;

    /* renamed from: io.realm.i0$a */
    public static class C5673a {

        /* renamed from: a */
        private File f16360a;

        /* renamed from: b */
        private String f16361b;

        /* renamed from: c */
        private String f16362c;

        /* renamed from: d */
        private byte[] f16363d;

        /* renamed from: e */
        private long f16364e;

        /* renamed from: f */
        private C5758k0 f16365f;

        /* renamed from: g */
        private boolean f16366g;

        /* renamed from: h */
        private OsRealmConfig.C5688c f16367h;

        /* renamed from: i */
        private HashSet<Object> f16368i;

        /* renamed from: j */
        private HashSet<Class<? extends C5763l0>> f16369j;

        /* renamed from: k */
        private C5802b f16370k;

        /* renamed from: l */
        private C5648d0.C5649a f16371l;

        /* renamed from: m */
        private boolean f16372m;

        /* renamed from: n */
        private CompactOnLaunchCallback f16373n;

        public C5673a() {
            this(C5632b.f16244l);
        }

        C5673a(Context context) {
            this.f16368i = new HashSet<>();
            this.f16369j = new HashSet<>();
            if (context != null) {
                C5719m.m23888a(context);
                m23570e(context);
                return;
            }
            throw new IllegalStateException("Call `Realm.init(Context)` before creating a RealmConfiguration");
        }

        /* renamed from: c */
        private void m23569c(Object obj) {
            if (!obj.getClass().isAnnotationPresent(RealmModule.class)) {
                throw new IllegalArgumentException(obj.getClass().getCanonicalName() + " is not a RealmModule. Add @RealmModule to the class definition.");
            }
        }

        /* renamed from: e */
        private void m23570e(Context context) {
            this.f16360a = context.getFilesDir();
            this.f16361b = "default.realm";
            this.f16363d = null;
            this.f16364e = 0;
            this.f16365f = null;
            this.f16366g = false;
            this.f16367h = OsRealmConfig.C5688c.FULL;
            this.f16372m = false;
            this.f16373n = null;
            if (C5672i0.f16342p != null) {
                this.f16368i.add(C5672i0.f16342p);
            }
        }

        /* renamed from: a */
        public final C5673a mo16327a(Object obj) {
            if (obj != null) {
                m23569c(obj);
                this.f16368i.add(obj);
            }
            return this;
        }

        /* renamed from: b */
        public C5672i0 mo16328b() {
            if (this.f16372m) {
                if (this.f16371l != null) {
                    throw new IllegalStateException("This Realm is marked as read-only. Read-only Realms cannot use initialData(Realm.Transaction).");
                } else if (this.f16362c == null) {
                    throw new IllegalStateException("Only Realms provided using 'assetFile(path)' can be marked read-only. No such Realm was provided.");
                } else if (this.f16366g) {
                    throw new IllegalStateException("'deleteRealmIfMigrationNeeded()' and read-only Realms cannot be combined");
                } else if (this.f16373n != null) {
                    throw new IllegalStateException("'compactOnLaunch()' and read-only Realms cannot be combined");
                }
            }
            if (this.f16370k == null && C5672i0.m23551s()) {
                this.f16370k = new C5797a();
            }
            C5672i0 i0Var = r2;
            C5672i0 i0Var2 = new C5672i0(this.f16360a, this.f16361b, C5672i0.m23549d(new File(this.f16360a, this.f16361b)), this.f16362c, this.f16363d, this.f16364e, this.f16365f, this.f16366g, this.f16367h, C5672i0.m23548b(this.f16368i, this.f16369j), this.f16370k, this.f16371l, this.f16372m, this.f16373n, false);
            return i0Var;
        }

        /* renamed from: d */
        public C5673a mo16329d() {
            String str = this.f16362c;
            if (str == null || str.length() == 0) {
                this.f16366g = true;
                return this;
            }
            throw new IllegalStateException("Realm cannot clear its schema when previously configured to use an asset file by calling assetFile().");
        }

        /* renamed from: f */
        public C5673a mo16330f(String str) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("A non-empty filename must be provided");
            }
            this.f16361b = str;
            return this;
        }

        /* renamed from: g */
        public C5673a mo16331g(long j) {
            if (j >= 0) {
                this.f16364e = j;
                return this;
            }
            throw new IllegalArgumentException("Realm schema version numbers must be 0 (zero) or higher. Yours was: " + j);
        }
    }

    static {
        C5721o oVar;
        Object p0 = C5648d0.m23428p0();
        f16342p = p0;
        if (p0 != null) {
            oVar = m23550j(p0.getClass().getCanonicalName());
            if (!oVar.mo16150j()) {
                throw new ExceptionInInitializerError("RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://realm.io/news/android-installation-change/");
            }
        } else {
            oVar = null;
        }
        f16343q = oVar;
    }

    protected C5672i0(File file, String str, String str2, String str3, byte[] bArr, long j, C5758k0 k0Var, boolean z, OsRealmConfig.C5688c cVar, C5721o oVar, C5802b bVar, C5648d0.C5649a aVar, boolean z2, CompactOnLaunchCallback compactOnLaunchCallback, boolean z3) {
        this.f16345a = file;
        this.f16346b = str;
        this.f16347c = str2;
        this.f16348d = str3;
        this.f16349e = bArr;
        this.f16350f = j;
        this.f16351g = k0Var;
        this.f16352h = z;
        this.f16353i = cVar;
        this.f16354j = oVar;
        this.f16355k = bVar;
        this.f16356l = aVar;
        this.f16357m = z2;
        this.f16358n = compactOnLaunchCallback;
        this.f16359o = z3;
    }

    /* renamed from: b */
    protected static C5721o m23548b(Set<Object> set, Set<Class<? extends C5763l0>> set2) {
        if (set2.size() > 0) {
            return new C5738b(f16343q, set2);
        }
        if (set.size() == 1) {
            return m23550j(set.iterator().next().getClass().getCanonicalName());
        }
        C5721o[] oVarArr = new C5721o[set.size()];
        int i = 0;
        for (Object obj : set) {
            oVarArr[i] = m23550j(obj.getClass().getCanonicalName());
            i++;
        }
        return new C5737a(oVarArr);
    }

    /* renamed from: d */
    protected static String m23549d(File file) {
        try {
            return file.getCanonicalPath();
        } catch (IOException e) {
            RealmFileException.Kind kind = RealmFileException.Kind.ACCESS_ERROR;
            throw new RealmFileException(kind, "Could not resolve the canonical path to the Realm file: " + file.getAbsolutePath(), e);
        }
    }

    /* renamed from: j */
    private static C5721o m23550j(String str) {
        String[] split = str.split("\\.");
        String str2 = split[split.length - 1];
        String format = String.format(Locale.US, "io.realm.%s%s", new Object[]{str2, "Mediator"});
        try {
            Constructor constructor = Class.forName(format).getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return (C5721o) constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            throw new RealmException("Could not find " + format, e);
        } catch (InvocationTargetException e2) {
            throw new RealmException("Could not create an instance of " + format, e2);
        } catch (InstantiationException e3) {
            throw new RealmException("Could not create an instance of " + format, e3);
        } catch (IllegalAccessException e4) {
            throw new RealmException("Could not create an instance of " + format, e4);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized boolean m23551s() {
        /*
            java.lang.Class<io.realm.i0> r0 = p340io.realm.C5672i0.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f16344r     // Catch:{ all -> 0x001d }
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = "io.reactivex.Flowable"
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0011 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0011 }
            f16344r = r1     // Catch:{ ClassNotFoundException -> 0x0011 }
            goto L_0x0015
        L_0x0011:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x001d }
            f16344r = r1     // Catch:{ all -> 0x001d }
        L_0x0015:
            java.lang.Boolean r1 = f16344r     // Catch:{ all -> 0x001d }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x001d }
            monitor-exit(r0)
            return r1
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5672i0.m23551s():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo16307c() {
        return this.f16348d;
    }

    /* renamed from: e */
    public CompactOnLaunchCallback mo16308e() {
        return this.f16358n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5672i0 i0Var = (C5672i0) obj;
        if (this.f16350f != i0Var.f16350f || this.f16352h != i0Var.f16352h || this.f16357m != i0Var.f16357m || this.f16359o != i0Var.f16359o) {
            return false;
        }
        File file = this.f16345a;
        if (file == null ? i0Var.f16345a != null : !file.equals(i0Var.f16345a)) {
            return false;
        }
        String str = this.f16346b;
        if (str == null ? i0Var.f16346b != null : !str.equals(i0Var.f16346b)) {
            return false;
        }
        if (!this.f16347c.equals(i0Var.f16347c)) {
            return false;
        }
        String str2 = this.f16348d;
        if (str2 == null ? i0Var.f16348d != null : !str2.equals(i0Var.f16348d)) {
            return false;
        }
        if (!Arrays.equals(this.f16349e, i0Var.f16349e)) {
            return false;
        }
        C5758k0 k0Var = this.f16351g;
        if (k0Var == null ? i0Var.f16351g != null : !k0Var.equals(i0Var.f16351g)) {
            return false;
        }
        if (this.f16353i != i0Var.f16353i || !this.f16354j.equals(i0Var.f16354j)) {
            return false;
        }
        C5802b bVar = this.f16355k;
        if (bVar == null ? i0Var.f16355k != null : !bVar.equals(i0Var.f16355k)) {
            return false;
        }
        C5648d0.C5649a aVar = this.f16356l;
        if (aVar == null ? i0Var.f16356l != null : !aVar.equals(i0Var.f16356l)) {
            return false;
        }
        CompactOnLaunchCallback compactOnLaunchCallback = this.f16358n;
        CompactOnLaunchCallback compactOnLaunchCallback2 = i0Var.f16358n;
        return compactOnLaunchCallback != null ? compactOnLaunchCallback.equals(compactOnLaunchCallback2) : compactOnLaunchCallback2 == null;
    }

    /* renamed from: f */
    public OsRealmConfig.C5688c mo16310f() {
        return this.f16353i;
    }

    /* renamed from: g */
    public byte[] mo16311g() {
        byte[] bArr = this.f16349e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C5648d0.C5649a mo16312h() {
        return this.f16356l;
    }

    public int hashCode() {
        File file = this.f16345a;
        int i = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        String str = this.f16346b;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f16347c.hashCode()) * 31;
        String str2 = this.f16348d;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        long j = this.f16350f;
        int hashCode4 = (((((hashCode2 + hashCode3) * 31) + Arrays.hashCode(this.f16349e)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C5758k0 k0Var = this.f16351g;
        int hashCode5 = (((((((hashCode4 + (k0Var != null ? k0Var.hashCode() : 0)) * 31) + (this.f16352h ? 1 : 0)) * 31) + this.f16353i.hashCode()) * 31) + this.f16354j.hashCode()) * 31;
        C5802b bVar = this.f16355k;
        int hashCode6 = (hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C5648d0.C5649a aVar = this.f16356l;
        int hashCode7 = (((hashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31) + (this.f16357m ? 1 : 0)) * 31;
        CompactOnLaunchCallback compactOnLaunchCallback = this.f16358n;
        if (compactOnLaunchCallback != null) {
            i = compactOnLaunchCallback.hashCode();
        }
        return ((hashCode7 + i) * 31) + (this.f16359o ? 1 : 0);
    }

    /* renamed from: i */
    public C5758k0 mo16314i() {
        return this.f16351g;
    }

    /* renamed from: k */
    public String mo16315k() {
        return this.f16347c;
    }

    /* renamed from: l */
    public File mo16316l() {
        return this.f16345a;
    }

    /* renamed from: m */
    public String mo16317m() {
        return this.f16346b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C5721o mo16318n() {
        return this.f16354j;
    }

    /* renamed from: o */
    public long mo16319o() {
        return this.f16350f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo16320p() {
        return !Util.m23792e(this.f16348d);
    }

    /* renamed from: q */
    public boolean mo16321q() {
        return this.f16357m;
    }

    /* renamed from: r */
    public boolean mo16322r() {
        return this.f16359o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo16323t() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("realmDirectory: ");
        File file = this.f16345a;
        sb.append(file != null ? file.toString() : BuildConfig.FLAVOR);
        sb.append("\n");
        sb.append("realmFileName : ");
        sb.append(this.f16346b);
        sb.append("\n");
        sb.append("canonicalPath: ");
        sb.append(this.f16347c);
        sb.append("\n");
        sb.append("key: ");
        sb.append("[length: ");
        sb.append(this.f16349e == null ? 0 : 64);
        sb.append("]");
        sb.append("\n");
        sb.append("schemaVersion: ");
        sb.append(Long.toString(this.f16350f));
        sb.append("\n");
        sb.append("migration: ");
        sb.append(this.f16351g);
        sb.append("\n");
        sb.append("deleteRealmIfMigrationNeeded: ");
        sb.append(this.f16352h);
        sb.append("\n");
        sb.append("durability: ");
        sb.append(this.f16353i);
        sb.append("\n");
        sb.append("schemaMediator: ");
        sb.append(this.f16354j);
        sb.append("\n");
        sb.append("readOnly: ");
        sb.append(this.f16357m);
        sb.append("\n");
        sb.append("compactOnLaunch: ");
        sb.append(this.f16358n);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo16325u() {
        return new File(this.f16347c).exists();
    }

    /* renamed from: v */
    public boolean mo16326v() {
        return this.f16352h;
    }
}
