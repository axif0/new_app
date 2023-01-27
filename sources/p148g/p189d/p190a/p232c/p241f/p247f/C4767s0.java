package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.s0 */
public final class C4767s0 extends C4895z6<C4767s0, C4768a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4767s0 zzh;
    private static volatile C4810u8<C4767s0> zzi;
    private int zzc;
    private String zzd = BuildConfig.FLAVOR;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    /* renamed from: g.d.a.c.f.f.s0$a */
    public static final class C4768a extends C4895z6.C4897b<C4767s0, C4768a> implements C4693n8 {
        private C4768a() {
            super(C4767s0.zzh);
        }

        /* synthetic */ C4768a(C4834w0 w0Var) {
            this();
        }

        /* renamed from: A */
        public final boolean mo14590A() {
            return ((C4767s0) this.f14678g).mo14588G();
        }

        /* renamed from: B */
        public final int mo14591B() {
            return ((C4767s0) this.f14678g).mo14589I();
        }

        /* renamed from: v */
        public final C4768a mo14592v(String str) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4767s0) this.f14678g).m20312D(str);
            return this;
        }

        /* renamed from: x */
        public final String mo14593x() {
            return ((C4767s0) this.f14678g).mo14585B();
        }

        /* renamed from: y */
        public final boolean mo14594y() {
            return ((C4767s0) this.f14678g).mo14586E();
        }

        /* renamed from: z */
        public final boolean mo14595z() {
            return ((C4767s0) this.f14678g).mo14587F();
        }
    }

    static {
        C4767s0 s0Var = new C4767s0();
        zzh = s0Var;
        C4895z6.m20793u(C4767s0.class, s0Var);
    }

    private C4767s0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m20312D(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* renamed from: B */
    public final String mo14585B() {
        return this.zzd;
    }

    /* renamed from: E */
    public final boolean mo14586E() {
        return this.zze;
    }

    /* renamed from: F */
    public final boolean mo14587F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean mo14588G() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: I */
    public final int mo14589I() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4834w0.f14602a[i - 1]) {
            case 1:
                return new C4767s0();
            case 2:
                return new C4768a((C4834w0) null);
            case 3:
                return C4895z6.m20791s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C4810u8<C4767s0> u8Var = zzi;
                if (u8Var == null) {
                    synchronized (C4767s0.class) {
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
