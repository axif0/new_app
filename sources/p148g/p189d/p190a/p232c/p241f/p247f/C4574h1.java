package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.h1 */
public final class C4574h1 extends C4895z6<C4574h1, C4575a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4574h1 zzj;
    private static volatile C4810u8<C4574h1> zzk;
    private int zzc;
    private long zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;
    private float zzh;
    private double zzi;

    /* renamed from: g.d.a.c.f.f.h1$a */
    public static final class C4575a extends C4895z6.C4897b<C4574h1, C4575a> implements C4693n8 {
        private C4575a() {
            super(C4574h1.zzj);
        }

        /* synthetic */ C4575a(C4592i1 i1Var) {
            this();
        }

        /* renamed from: A */
        public final C4575a mo14212A() {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4574h1) this.f14678g).m19559d0();
            return this;
        }

        /* renamed from: B */
        public final C4575a mo14213B(long j) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4574h1) this.f14678g).m19550L(j);
            return this;
        }

        /* renamed from: C */
        public final C4575a mo14214C(String str) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4574h1) this.f14678g).m19554P(str);
            return this;
        }

        /* renamed from: D */
        public final C4575a mo14215D() {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4574h1) this.f14678g).m19560e0();
            return this;
        }

        /* renamed from: v */
        public final C4575a mo14216v() {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4574h1) this.f14678g).m19558c0();
            return this;
        }

        /* renamed from: x */
        public final C4575a mo14217x(double d) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4574h1) this.f14678g).m19543B(d);
            return this;
        }

        /* renamed from: y */
        public final C4575a mo14218y(long j) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4574h1) this.f14678g).m19544C(j);
            return this;
        }

        /* renamed from: z */
        public final C4575a mo14219z(String str) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4574h1) this.f14678g).m19549I(str);
            return this;
        }
    }

    static {
        C4574h1 h1Var = new C4574h1();
        zzj = h1Var;
        C4895z6.m20793u(C4574h1.class, h1Var);
    }

    private C4574h1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m19543B(double d) {
        this.zzc |= 32;
        this.zzi = d;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m19544C(long j) {
        this.zzc |= 1;
        this.zzd = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public final void m19549I(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final void m19550L(long j) {
        this.zzc |= 8;
        this.zzg = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void m19554P(String str) {
        str.getClass();
        this.zzc |= 4;
        this.zzf = str;
    }

    /* renamed from: a0 */
    public static C4575a m19556a0() {
        return (C4575a) zzj.mo14812w();
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public final void m19558c0() {
        this.zzc &= -5;
        this.zzf = zzj.zzf;
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public final void m19559d0() {
        this.zzc &= -9;
        this.zzg = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public final void m19560e0() {
        this.zzc &= -33;
        this.zzi = 0.0d;
    }

    /* renamed from: J */
    public final boolean mo14203J() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: K */
    public final long mo14204K() {
        return this.zzd;
    }

    /* renamed from: R */
    public final String mo14205R() {
        return this.zze;
    }

    /* renamed from: U */
    public final boolean mo14206U() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: V */
    public final String mo14207V() {
        return this.zzf;
    }

    /* renamed from: W */
    public final boolean mo14208W() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: X */
    public final long mo14209X() {
        return this.zzg;
    }

    /* renamed from: Y */
    public final boolean mo14210Y() {
        return (this.zzc & 32) != 0;
    }

    /* renamed from: Z */
    public final double mo14211Z() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4592i1.f14178a[i - 1]) {
            case 1:
                return new C4574h1();
            case 2:
                return new C4575a((C4592i1) null);
            case 3:
                return C4895z6.m20791s(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                C4810u8<C4574h1> u8Var = zzk;
                if (u8Var == null) {
                    synchronized (C4574h1.class) {
                        u8Var = zzk;
                        if (u8Var == null) {
                            u8Var = new C4895z6.C4896a<>(zzj);
                            zzk = u8Var;
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
