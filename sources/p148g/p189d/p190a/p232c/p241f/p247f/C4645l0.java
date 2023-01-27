package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.l0 */
public final class C4645l0 extends C4895z6<C4645l0, C4646a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4645l0 zzh;
    private static volatile C4810u8<C4645l0> zzi;
    private int zzc;
    private C4701o0 zzd;
    private C4663m0 zze;
    private boolean zzf;
    private String zzg = BuildConfig.FLAVOR;

    /* renamed from: g.d.a.c.f.f.l0$a */
    public static final class C4646a extends C4895z6.C4897b<C4645l0, C4646a> implements C4693n8 {
        private C4646a() {
            super(C4645l0.zzh);
        }

        /* synthetic */ C4646a(C4719p0 p0Var) {
            this();
        }

        /* renamed from: v */
        public final C4646a mo14376v(String str) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4645l0) this.f14678g).m19851C(str);
            return this;
        }
    }

    static {
        C4645l0 l0Var = new C4645l0();
        zzh = l0Var;
        C4895z6.m20793u(C4645l0.class, l0Var);
    }

    private C4645l0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m19851C(String str) {
        str.getClass();
        this.zzc |= 8;
        this.zzg = str;
    }

    /* renamed from: M */
    public static C4645l0 m19852M() {
        return zzh;
    }

    /* renamed from: D */
    public final boolean mo14368D() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: E */
    public final C4701o0 mo14369E() {
        C4701o0 o0Var = this.zzd;
        return o0Var == null ? C4701o0.m20015K() : o0Var;
    }

    /* renamed from: F */
    public final boolean mo14370F() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: G */
    public final C4663m0 mo14371G() {
        C4663m0 m0Var = this.zze;
        return m0Var == null ? C4663m0.m19935M() : m0Var;
    }

    /* renamed from: I */
    public final boolean mo14372I() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: J */
    public final boolean mo14373J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final boolean mo14374K() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: L */
    public final String mo14375L() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4719p0.f14360a[i - 1]) {
            case 1:
                return new C4645l0();
            case 2:
                return new C4646a((C4719p0) null);
            case 3:
                return C4895z6.m20791s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C4810u8<C4645l0> u8Var = zzi;
                if (u8Var == null) {
                    synchronized (C4645l0.class) {
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
