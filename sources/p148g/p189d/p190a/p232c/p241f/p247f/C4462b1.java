package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import java.util.List;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.b1 */
public final class C4462b1 extends C4895z6<C4462b1, C4463a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4462b1 zzj;
    private static volatile C4810u8<C4462b1> zzk;
    private int zzc;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private long zzf;
    private float zzg;
    private double zzh;
    private C4581h7<C4462b1> zzi = C4895z6.m20787A();

    /* renamed from: g.d.a.c.f.f.b1$a */
    public static final class C4463a extends C4895z6.C4897b<C4462b1, C4463a> implements C4693n8 {
        private C4463a() {
            super(C4462b1.zzj);
        }

        /* synthetic */ C4463a(C4592i1 i1Var) {
            this();
        }

        /* renamed from: A */
        public final C4463a mo13824A(Iterable<? extends C4462b1> iterable) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4462b1) this.f14678g).m18750K(iterable);
            return this;
        }

        /* renamed from: B */
        public final C4463a mo13825B(String str) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4462b1) this.f14678g).m18751L(str);
            return this;
        }

        /* renamed from: C */
        public final C4463a mo13826C() {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4462b1) this.f14678g).m18761j0();
            return this;
        }

        /* renamed from: D */
        public final C4463a mo13827D(String str) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4462b1) this.f14678g).m18754R(str);
            return this;
        }

        /* renamed from: E */
        public final C4463a mo13828E() {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4462b1) this.f14678g).m18762k0();
            return this;
        }

        /* renamed from: F */
        public final int mo13829F() {
            return ((C4462b1) this.f14678g).mo13823f0();
        }

        /* renamed from: G */
        public final C4463a mo13830G() {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4462b1) this.f14678g).m18764m0();
            return this;
        }

        /* renamed from: v */
        public final C4463a mo13831v() {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4462b1) this.f14678g).m18760i0();
            return this;
        }

        /* renamed from: x */
        public final C4463a mo13832x(double d) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4462b1) this.f14678g).m18742B(d);
            return this;
        }

        /* renamed from: y */
        public final C4463a mo13833y(long j) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4462b1) this.f14678g).m18743C(j);
            return this;
        }

        /* renamed from: z */
        public final C4463a mo13834z(C4463a aVar) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4462b1) this.f14678g).m18757X((C4462b1) ((C4895z6) aVar.mo14350h()));
            return this;
        }
    }

    static {
        C4462b1 b1Var = new C4462b1();
        zzj = b1Var;
        C4895z6.m20793u(C4462b1.class, b1Var);
    }

    private C4462b1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m18742B(double d) {
        this.zzc |= 16;
        this.zzh = d;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m18743C(long j) {
        this.zzc |= 4;
        this.zzf = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final void m18750K(Iterable<? extends C4462b1> iterable) {
        m18763l0();
        C4614j5.m19656j(iterable, this.zzi);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final void m18751L(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final void m18754R(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public final void m18757X(C4462b1 b1Var) {
        b1Var.getClass();
        m18763l0();
        this.zzi.add(b1Var);
    }

    /* renamed from: g0 */
    public static C4463a m18758g0() {
        return (C4463a) zzj.mo14812w();
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public final void m18760i0() {
        this.zzc &= -3;
        this.zze = zzj.zze;
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public final void m18761j0() {
        this.zzc &= -5;
        this.zzf = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public final void m18762k0() {
        this.zzc &= -17;
        this.zzh = 0.0d;
    }

    /* renamed from: l0 */
    private final void m18763l0() {
        C4581h7<C4462b1> h7Var = this.zzi;
        if (!h7Var.mo14223a()) {
            this.zzi = C4895z6.m20789p(h7Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public final void m18764m0() {
        this.zzi = C4895z6.m20787A();
    }

    /* renamed from: M */
    public final boolean mo13812M() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: N */
    public final String mo13813N() {
        return this.zzd;
    }

    /* renamed from: U */
    public final boolean mo13814U() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: V */
    public final String mo13815V() {
        return this.zze;
    }

    /* renamed from: Y */
    public final boolean mo13816Y() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: Z */
    public final long mo13817Z() {
        return this.zzf;
    }

    /* renamed from: a0 */
    public final boolean mo13818a0() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: b0 */
    public final float mo13819b0() {
        return this.zzg;
    }

    /* renamed from: c0 */
    public final boolean mo13820c0() {
        return (this.zzc & 16) != 0;
    }

    /* renamed from: d0 */
    public final double mo13821d0() {
        return this.zzh;
    }

    /* renamed from: e0 */
    public final List<C4462b1> mo13822e0() {
        return this.zzi;
    }

    /* renamed from: f0 */
    public final int mo13823f0() {
        return this.zzi.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        Class<C4462b1> cls = C4462b1.class;
        switch (C4592i1.f14178a[i - 1]) {
            case 1:
                return new C4462b1();
            case 2:
                return new C4463a((C4592i1) null);
            case 3:
                return C4895z6.m20791s(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", cls});
            case 4:
                return zzj;
            case 5:
                C4810u8<C4462b1> u8Var = zzk;
                if (u8Var == null) {
                    synchronized (cls) {
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
