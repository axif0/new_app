package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import java.util.List;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.k0 */
public final class C4628k0 extends C4895z6<C4628k0, C4629a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4628k0 zzl;
    private static volatile C4810u8<C4628k0> zzm;
    private int zzc;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private C4581h7<C4645l0> zzf = C4895z6.m20787A();
    private boolean zzg;
    private C4663m0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* renamed from: g.d.a.c.f.f.k0$a */
    public static final class C4629a extends C4895z6.C4897b<C4628k0, C4629a> implements C4693n8 {
        private C4629a() {
            super(C4628k0.zzl);
        }

        /* synthetic */ C4629a(C4719p0 p0Var) {
            this();
        }

        /* renamed from: A */
        public final int mo14323A() {
            return ((C4628k0) this.f14678g).mo14316L();
        }

        /* renamed from: v */
        public final C4629a mo14324v(int i, C4645l0 l0Var) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4628k0) this.f14678g).m19787C(i, l0Var);
            return this;
        }

        /* renamed from: x */
        public final C4629a mo14325x(String str) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4628k0) this.f14678g).m19790F(str);
            return this;
        }

        /* renamed from: y */
        public final C4645l0 mo14326y(int i) {
            return ((C4628k0) this.f14678g).mo14311B(i);
        }

        /* renamed from: z */
        public final String mo14327z() {
            return ((C4628k0) this.f14678g).mo14314J();
        }
    }

    static {
        C4628k0 k0Var = new C4628k0();
        zzl = k0Var;
        C4895z6.m20793u(C4628k0.class, k0Var);
    }

    private C4628k0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m19787C(int i, C4645l0 l0Var) {
        l0Var.getClass();
        C4581h7<C4645l0> h7Var = this.zzf;
        if (!h7Var.mo14223a()) {
            this.zzf = C4895z6.m20789p(h7Var);
        }
        this.zzf.set(i, l0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m19790F(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* renamed from: U */
    public static C4629a m19791U() {
        return (C4629a) zzl.mo14812w();
    }

    /* renamed from: B */
    public final C4645l0 mo14311B(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: G */
    public final boolean mo14312G() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: I */
    public final int mo14313I() {
        return this.zzd;
    }

    /* renamed from: J */
    public final String mo14314J() {
        return this.zze;
    }

    /* renamed from: K */
    public final List<C4645l0> mo14315K() {
        return this.zzf;
    }

    /* renamed from: L */
    public final int mo14316L() {
        return this.zzf.size();
    }

    /* renamed from: M */
    public final boolean mo14317M() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: N */
    public final C4663m0 mo14318N() {
        C4663m0 m0Var = this.zzh;
        return m0Var == null ? C4663m0.m19935M() : m0Var;
    }

    /* renamed from: O */
    public final boolean mo14319O() {
        return this.zzi;
    }

    /* renamed from: P */
    public final boolean mo14320P() {
        return this.zzj;
    }

    /* renamed from: R */
    public final boolean mo14321R() {
        return (this.zzc & 64) != 0;
    }

    /* renamed from: T */
    public final boolean mo14322T() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4719p0.f14360a[i - 1]) {
            case 1:
                return new C4628k0();
            case 2:
                return new C4629a((C4719p0) null);
            case 3:
                return C4895z6.m20791s(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", C4645l0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                C4810u8<C4628k0> u8Var = zzm;
                if (u8Var == null) {
                    synchronized (C4628k0.class) {
                        u8Var = zzm;
                        if (u8Var == null) {
                            u8Var = new C4895z6.C4896a<>(zzl);
                            zzm = u8Var;
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
