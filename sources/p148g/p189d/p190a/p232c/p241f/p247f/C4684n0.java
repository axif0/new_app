package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.n0 */
public final class C4684n0 extends C4895z6<C4684n0, C4685a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4684n0 zzj;
    private static volatile C4810u8<C4684n0> zzk;
    private int zzc;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private C4645l0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    /* renamed from: g.d.a.c.f.f.n0$a */
    public static final class C4685a extends C4895z6.C4897b<C4684n0, C4685a> implements C4693n8 {
        private C4685a() {
            super(C4684n0.zzj);
        }

        /* synthetic */ C4685a(C4719p0 p0Var) {
            this();
        }

        /* renamed from: v */
        public final C4685a mo14475v(String str) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4684n0) this.f14678g).m19981C(str);
            return this;
        }
    }

    static {
        C4684n0 n0Var = new C4684n0();
        zzj = n0Var;
        C4895z6.m20793u(C4684n0.class, n0Var);
    }

    private C4684n0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m19981C(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* renamed from: M */
    public static C4685a m19982M() {
        return (C4685a) zzj.mo14812w();
    }

    /* renamed from: D */
    public final boolean mo14467D() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: E */
    public final int mo14468E() {
        return this.zzd;
    }

    /* renamed from: F */
    public final String mo14469F() {
        return this.zze;
    }

    /* renamed from: G */
    public final C4645l0 mo14470G() {
        C4645l0 l0Var = this.zzf;
        return l0Var == null ? C4645l0.m19852M() : l0Var;
    }

    /* renamed from: I */
    public final boolean mo14471I() {
        return this.zzg;
    }

    /* renamed from: J */
    public final boolean mo14472J() {
        return this.zzh;
    }

    /* renamed from: K */
    public final boolean mo14473K() {
        return (this.zzc & 32) != 0;
    }

    /* renamed from: L */
    public final boolean mo14474L() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4719p0.f14360a[i - 1]) {
            case 1:
                return new C4684n0();
            case 2:
                return new C4685a((C4719p0) null);
            case 3:
                return C4895z6.m20791s(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                C4810u8<C4684n0> u8Var = zzk;
                if (u8Var == null) {
                    synchronized (C4684n0.class) {
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
