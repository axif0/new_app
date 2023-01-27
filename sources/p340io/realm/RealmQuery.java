package p340io.realm;

import java.util.Date;
import java.util.Locale;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5724r;
import p340io.realm.internal.OsResults;
import p340io.realm.internal.Table;
import p340io.realm.internal.TableQuery;
import p340io.realm.internal.core.DescriptorOrdering;
import p340io.realm.internal.p341s.C5730c;
import p340io.realm.internal.sync.C5736a;

/* renamed from: io.realm.RealmQuery */
public class RealmQuery<E> {

    /* renamed from: a */
    private final Table f16195a;

    /* renamed from: b */
    private final C5632b f16196b;

    /* renamed from: c */
    private final TableQuery f16197c;

    /* renamed from: d */
    private final C5778p0 f16198d;

    /* renamed from: e */
    private Class<E> f16199e;

    /* renamed from: f */
    private String f16200f;

    /* renamed from: g */
    private final boolean f16201g;

    /* renamed from: h */
    private DescriptorOrdering f16202h = new DescriptorOrdering();

    /* renamed from: io.realm.RealmQuery$a */
    static /* synthetic */ class C5616a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16203a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                io.realm.RealmFieldType[] r0 = p340io.realm.RealmFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16203a = r0
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.INTEGER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16203a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16203a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p340io.realm.RealmQuery.C5616a.<clinit>():void");
        }
    }

    private RealmQuery(C5648d0 d0Var, Class<E> cls) {
        TableQuery tableQuery;
        this.f16196b = d0Var;
        this.f16199e = cls;
        boolean z = !m23269r(cls);
        this.f16201g = z;
        if (z) {
            tableQuery = null;
            this.f16198d = null;
            this.f16195a = null;
        } else {
            C5778p0 d = d0Var.mo16219H().mo16775d(cls);
            this.f16198d = d;
            Table e = d.mo16763e();
            this.f16195a = e;
            tableQuery = e.mo16543B();
        }
        this.f16197c = tableQuery;
    }

    /* renamed from: b */
    static <E extends C5763l0> RealmQuery<E> m23262b(C5648d0 d0Var, Class<E> cls) {
        return new RealmQuery<>(d0Var, cls);
    }

    /* renamed from: c */
    private C5782q0<E> m23263c(TableQuery tableQuery, DescriptorOrdering descriptorOrdering, boolean z, C5736a aVar) {
        OsResults x = aVar.mo16676d() ? C5724r.m23945x(this.f16196b.f16249i, tableQuery, descriptorOrdering, aVar) : OsResults.m23685e(this.f16196b.f16249i, tableQuery, descriptorOrdering);
        C5782q0<E> q0Var = m23270s() ? new C5782q0<>(this.f16196b, x, this.f16200f) : new C5782q0<>(this.f16196b, x, this.f16199e);
        if (z) {
            q0Var.mo16765o();
        }
        return q0Var;
    }

    /* renamed from: i */
    private RealmQuery<E> m23264i(String str, Boolean bool) {
        C5730c c = this.f16198d.mo16752c(str, RealmFieldType.BOOLEAN);
        if (bool == null) {
            this.f16197c.mo16576h(c.mo16659e(), c.mo16662h());
        } else {
            this.f16197c.mo16571c(c.mo16659e(), c.mo16662h(), bool.booleanValue());
        }
        return this;
    }

    /* renamed from: j */
    private RealmQuery<E> m23265j(String str, Byte b) {
        C5730c c = this.f16198d.mo16752c(str, RealmFieldType.INTEGER);
        if (b == null) {
            this.f16197c.mo16576h(c.mo16659e(), c.mo16662h());
        } else {
            this.f16197c.mo16569a(c.mo16659e(), c.mo16662h(), (long) b.byteValue());
        }
        return this;
    }

    /* renamed from: k */
    private RealmQuery<E> m23266k(String str, Long l) {
        C5730c c = this.f16198d.mo16752c(str, RealmFieldType.INTEGER);
        if (l == null) {
            this.f16197c.mo16576h(c.mo16659e(), c.mo16662h());
        } else {
            this.f16197c.mo16569a(c.mo16659e(), c.mo16662h(), l.longValue());
        }
        return this;
    }

    /* renamed from: l */
    private RealmQuery<E> m23267l(String str, String str2, C5651e eVar) {
        C5730c c = this.f16198d.mo16752c(str, RealmFieldType.STRING);
        this.f16197c.mo16570b(c.mo16659e(), c.mo16662h(), str2, eVar);
        return this;
    }

    /* renamed from: o */
    private long m23268o() {
        if (this.f16202h.mo16624a()) {
            return this.f16197c.mo16572d();
        }
        C5720n nVar = (C5720n) mo16163m().mo16834d(null);
        if (nVar != null) {
            return nVar.mo16212L().mo16259f().mo16589g();
        }
        return -1;
    }

    /* renamed from: r */
    private static boolean m23269r(Class<?> cls) {
        return C5763l0.class.isAssignableFrom(cls);
    }

    /* renamed from: s */
    private boolean m23270s() {
        return this.f16200f != null;
    }

    /* renamed from: a */
    public RealmQuery<E> mo16157a() {
        this.f16196b.mo16228j();
        return this;
    }

    /* renamed from: d */
    public RealmQuery<E> mo16158d(String str, Boolean bool) {
        this.f16196b.mo16228j();
        m23264i(str, bool);
        return this;
    }

    /* renamed from: e */
    public RealmQuery<E> mo16159e(String str, Byte b) {
        this.f16196b.mo16228j();
        m23265j(str, b);
        return this;
    }

    /* renamed from: f */
    public RealmQuery<E> mo16160f(String str, Long l) {
        this.f16196b.mo16228j();
        m23266k(str, l);
        return this;
    }

    /* renamed from: g */
    public RealmQuery<E> mo16161g(String str, String str2) {
        mo16162h(str, str2, C5651e.SENSITIVE);
        return this;
    }

    /* renamed from: h */
    public RealmQuery<E> mo16162h(String str, String str2, C5651e eVar) {
        this.f16196b.mo16228j();
        m23267l(str, str2, eVar);
        return this;
    }

    /* renamed from: m */
    public C5782q0<E> mo16163m() {
        this.f16196b.mo16228j();
        return m23263c(this.f16197c, this.f16202h, true, C5736a.f16570d);
    }

    /* renamed from: n */
    public E mo16164n() {
        this.f16196b.mo16228j();
        if (this.f16201g) {
            return null;
        }
        long o = m23268o();
        if (o < 0) {
            return null;
        }
        return this.f16196b.mo16232u(this.f16199e, this.f16200f, o);
    }

    /* renamed from: p */
    public RealmQuery<E> mo16165p(String str, Date date) {
        this.f16196b.mo16228j();
        C5730c c = this.f16198d.mo16752c(str, RealmFieldType.DATE);
        this.f16197c.mo16574f(c.mo16659e(), c.mo16662h(), date);
        return this;
    }

    /* renamed from: q */
    public RealmQuery<E> mo16166q(String str, long j) {
        this.f16196b.mo16228j();
        C5730c c = this.f16198d.mo16752c(str, RealmFieldType.INTEGER);
        this.f16197c.mo16575g(c.mo16659e(), c.mo16662h(), j);
        return this;
    }

    /* renamed from: t */
    public RealmQuery<E> mo16167t(String str, long j) {
        this.f16196b.mo16228j();
        C5730c c = this.f16198d.mo16752c(str, RealmFieldType.INTEGER);
        this.f16197c.mo16577i(c.mo16659e(), c.mo16662h(), j);
        return this;
    }

    /* renamed from: u */
    public Number mo16168u(String str) {
        this.f16196b.mo16228j();
        long a = this.f16198d.mo16760a(str);
        int i = C5616a.f16203a[this.f16195a.mo16553k(a).ordinal()];
        if (i == 1) {
            return this.f16197c.mo16580l(a);
        }
        if (i == 2) {
            return this.f16197c.mo16579k(a);
        }
        if (i == 3) {
            return this.f16197c.mo16578j(a);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s': type mismatch - %s expected.", new Object[]{str, "int, float or double"}));
    }
}
