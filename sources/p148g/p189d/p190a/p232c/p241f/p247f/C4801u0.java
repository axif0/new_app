package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.u0 */
public final class C4801u0 extends C4895z6<C4801u0, C4802a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4801u0 zzf;
    private static volatile C4810u8<C4801u0> zzg;
    private int zzc;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;

    /* renamed from: g.d.a.c.f.f.u0$a */
    public static final class C4802a extends C4895z6.C4897b<C4801u0, C4802a> implements C4693n8 {
        private C4802a() {
            super(C4801u0.zzf);
        }

        /* synthetic */ C4802a(C4834w0 w0Var) {
            this();
        }
    }

    static {
        C4801u0 u0Var = new C4801u0();
        zzf = u0Var;
        C4895z6.m20793u(C4801u0.class, u0Var);
    }

    private C4801u0() {
    }

    /* renamed from: B */
    public final String mo14663B() {
        return this.zzd;
    }

    /* renamed from: C */
    public final String mo14664C() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4834w0.f14602a[i - 1]) {
            case 1:
                return new C4801u0();
            case 2:
                return new C4802a((C4834w0) null);
            case 3:
                return C4895z6.m20791s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C4810u8<C4801u0> u8Var = zzg;
                if (u8Var == null) {
                    synchronized (C4801u0.class) {
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
