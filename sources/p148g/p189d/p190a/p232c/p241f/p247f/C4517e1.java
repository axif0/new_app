package p148g.p189d.p190a.p232c.p241f.p247f;

import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.e1 */
public final class C4517e1 extends C4895z6<C4517e1, C4519b> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4517e1 zzf;
    private static volatile C4810u8<C4517e1> zzg;
    private int zzc;
    private int zzd = 1;
    private C4581h7<C4444a1> zze = C4895z6.m20787A();

    /* renamed from: g.d.a.c.f.f.e1$a */
    public enum C4518a implements C4525e7 {
        RADS(1),
        PROVISIONING(2);
        

        /* renamed from: f */
        private final int f14081f;

        private C4518a(int i) {
            this.f14081f = i;
        }

        /* renamed from: e */
        public static C4518a m19299e(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        /* renamed from: g */
        public static C4563g7 m19300g() {
            return C4610j1.f14191a;
        }

        /* renamed from: a */
        public final int mo14085a() {
            return this.f14081f;
        }

        public final String toString() {
            return "<" + C4518a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14081f + " name=" + name() + '>';
        }
    }

    /* renamed from: g.d.a.c.f.f.e1$b */
    public static final class C4519b extends C4895z6.C4897b<C4517e1, C4519b> implements C4693n8 {
        private C4519b() {
            super(C4517e1.zzf);
        }

        /* synthetic */ C4519b(C4592i1 i1Var) {
            this();
        }
    }

    static {
        C4517e1 e1Var = new C4517e1();
        zzf = e1Var;
        C4895z6.m20793u(C4517e1.class, e1Var);
    }

    private C4517e1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4592i1.f14178a[i - 1]) {
            case 1:
                return new C4517e1();
            case 2:
                return new C4519b((C4592i1) null);
            case 3:
                return C4895z6.m20791s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", C4518a.m19300g(), "zze", C4444a1.class});
            case 4:
                return zzf;
            case 5:
                C4810u8<C4517e1> u8Var = zzg;
                if (u8Var == null) {
                    synchronized (C4517e1.class) {
                        u8Var = zzg;
                        if (u8Var == null) {
                            u8Var = new C4895z6.C4896a<>(zzf);
                            zzg = u8Var;
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
