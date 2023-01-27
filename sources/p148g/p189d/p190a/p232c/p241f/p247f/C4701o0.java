package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import java.util.List;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.o0 */
public final class C4701o0 extends C4895z6<C4701o0, C4702a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4701o0 zzh;
    private static volatile C4810u8<C4701o0> zzi;
    private int zzc;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private boolean zzf;
    private C4581h7<String> zzg = C4895z6.m20787A();

    /* renamed from: g.d.a.c.f.f.o0$a */
    public static final class C4702a extends C4895z6.C4897b<C4701o0, C4702a> implements C4693n8 {
        private C4702a() {
            super(C4701o0.zzh);
        }

        /* synthetic */ C4702a(C4719p0 p0Var) {
            this();
        }
    }

    /* renamed from: g.d.a.c.f.f.o0$b */
    public enum C4703b implements C4525e7 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        

        /* renamed from: f */
        private final int f14349f;

        private C4703b(int i) {
            this.f14349f = i;
        }

        /* renamed from: e */
        public static C4703b m20026e(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        /* renamed from: g */
        public static C4563g7 m20027g() {
            return C4818v0.f14580a;
        }

        /* renamed from: a */
        public final int mo14085a() {
            return this.f14349f;
        }

        public final String toString() {
            return "<" + C4703b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14349f + " name=" + name() + '>';
        }
    }

    static {
        C4701o0 o0Var = new C4701o0();
        zzh = o0Var;
        C4895z6.m20793u(C4701o0.class, o0Var);
    }

    private C4701o0() {
    }

    /* renamed from: K */
    public static C4701o0 m20015K() {
        return zzh;
    }

    /* renamed from: B */
    public final boolean mo14486B() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: C */
    public final C4703b mo14487C() {
        C4703b e = C4703b.m20026e(this.zzd);
        return e == null ? C4703b.UNKNOWN_MATCH_TYPE : e;
    }

    /* renamed from: D */
    public final boolean mo14488D() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: E */
    public final String mo14489E() {
        return this.zze;
    }

    /* renamed from: F */
    public final boolean mo14490F() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: G */
    public final boolean mo14491G() {
        return this.zzf;
    }

    /* renamed from: I */
    public final List<String> mo14492I() {
        return this.zzg;
    }

    /* renamed from: J */
    public final int mo14493J() {
        return this.zzg.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4719p0.f14360a[i - 1]) {
            case 1:
                return new C4701o0();
            case 2:
                return new C4702a((C4719p0) null);
            case 3:
                return C4895z6.m20791s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", C4703b.m20027g(), "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C4810u8<C4701o0> u8Var = zzi;
                if (u8Var == null) {
                    synchronized (C4701o0.class) {
                        u8Var = zzi;
                        if (u8Var == null) {
                            u8Var = new C4895z6.C4896a<>(zzh);
                            zzi = u8Var;
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
