package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.m1 */
public final class C4666m1 extends C4895z6<C4666m1, C4667a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4666m1 zzk;
    private static volatile C4810u8<C4666m1> zzl;
    private int zzc;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private boolean zzf;
    private long zzg;
    private double zzh;
    private C4581h7<C4666m1> zzi = C4895z6.m20787A();
    private String zzj = BuildConfig.FLAVOR;

    /* renamed from: g.d.a.c.f.f.m1$a */
    public static final class C4667a extends C4895z6.C4897b<C4666m1, C4667a> implements C4693n8 {
        private C4667a() {
            super(C4666m1.zzk);
        }

        /* synthetic */ C4667a(C4630k1 k1Var) {
            this();
        }
    }

    /* renamed from: g.d.a.c.f.f.m1$b */
    public enum C4668b implements C4525e7 {
        UNDEFINED(0),
        NULL(1),
        STRING(2),
        NUMBER(3),
        BOOLEAN(4),
        LIST(5),
        MAP(6),
        STATEMENT(7);
        

        /* renamed from: f */
        private final int f14274f;

        private C4668b(int i) {
            this.f14274f = i;
        }

        /* renamed from: e */
        public static C4668b m19953e(int i) {
            switch (i) {
                case 0:
                    return UNDEFINED;
                case 1:
                    return NULL;
                case 2:
                    return STRING;
                case 3:
                    return NUMBER;
                case 4:
                    return BOOLEAN;
                case 5:
                    return LIST;
                case 6:
                    return MAP;
                case 7:
                    return STATEMENT;
                default:
                    return null;
            }
        }

        /* renamed from: g */
        public static C4563g7 m19954g() {
            return C4704o1.f14350a;
        }

        /* renamed from: a */
        public final int mo14085a() {
            return this.f14274f;
        }

        public final String toString() {
            return "<" + C4668b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14274f + " name=" + name() + '>';
        }
    }

    static {
        C4666m1 m1Var = new C4666m1();
        zzk = m1Var;
        C4895z6.m20793u(C4666m1.class, m1Var);
    }

    private C4666m1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        Class<C4666m1> cls = C4666m1.class;
        switch (C4630k1.f14210a[i - 1]) {
            case 1:
                return new C4666m1();
            case 2:
                return new C4667a((C4630k1) null);
            case 3:
                return C4895z6.m20791s(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005က\u0004\u0006\u001b\u0007ဈ\u0005", new Object[]{"zzc", "zzd", C4668b.m19954g(), "zze", "zzf", "zzg", "zzh", "zzi", cls, "zzj"});
            case 4:
                return zzk;
            case 5:
                C4810u8<C4666m1> u8Var = zzl;
                if (u8Var == null) {
                    synchronized (cls) {
                        u8Var = zzl;
                        if (u8Var == null) {
                            u8Var = new C4895z6.C4896a<>(zzk);
                            zzl = u8Var;
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
