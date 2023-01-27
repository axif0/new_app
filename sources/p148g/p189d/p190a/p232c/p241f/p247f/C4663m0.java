package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.m0 */
public final class C4663m0 extends C4895z6<C4663m0, C4665b> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4663m0 zzi;
    private static volatile C4810u8<C4663m0> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;

    /* renamed from: g.d.a.c.f.f.m0$a */
    public enum C4664a implements C4525e7 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        

        /* renamed from: f */
        private final int f14264f;

        private C4664a(int i) {
            this.f14264f = i;
        }

        /* renamed from: e */
        public static C4664a m19948e(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        /* renamed from: g */
        public static C4563g7 m19949g() {
            return C4735q0.f14409a;
        }

        /* renamed from: a */
        public final int mo14085a() {
            return this.f14264f;
        }

        public final String toString() {
            return "<" + C4664a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14264f + " name=" + name() + '>';
        }
    }

    /* renamed from: g.d.a.c.f.f.m0$b */
    public static final class C4665b extends C4895z6.C4897b<C4663m0, C4665b> implements C4693n8 {
        private C4665b() {
            super(C4663m0.zzi);
        }

        /* synthetic */ C4665b(C4719p0 p0Var) {
            this();
        }
    }

    static {
        C4663m0 m0Var = new C4663m0();
        zzi = m0Var;
        C4895z6.m20793u(C4663m0.class, m0Var);
    }

    private C4663m0() {
    }

    /* renamed from: M */
    public static C4663m0 m19935M() {
        return zzi;
    }

    /* renamed from: B */
    public final boolean mo14438B() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: C */
    public final C4664a mo14439C() {
        C4664a e = C4664a.m19948e(this.zzd);
        return e == null ? C4664a.UNKNOWN_COMPARISON_TYPE : e;
    }

    /* renamed from: D */
    public final boolean mo14440D() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: E */
    public final boolean mo14441E() {
        return this.zze;
    }

    /* renamed from: F */
    public final boolean mo14442F() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: G */
    public final String mo14443G() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo14444I() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: J */
    public final String mo14445J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final boolean mo14446K() {
        return (this.zzc & 16) != 0;
    }

    /* renamed from: L */
    public final String mo14447L() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4719p0.f14360a[i - 1]) {
            case 1:
                return new C4663m0();
            case 2:
                return new C4665b((C4719p0) null);
            case 3:
                return C4895z6.m20791s(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", C4664a.m19949g(), "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                C4810u8<C4663m0> u8Var = zzj;
                if (u8Var == null) {
                    synchronized (C4663m0.class) {
                        u8Var = zzj;
                        if (u8Var == null) {
                            u8Var = new C4895z6.C4896a<>(zzi);
                            zzj = u8Var;
                        }
                    }
                }
                return u8Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
