package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.a1 */
public final class C4444a1 extends C4895z6<C4444a1, C4445a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4444a1 zzf;
    private static volatile C4810u8<C4444a1> zzg;
    private int zzc;
    private String zzd = BuildConfig.FLAVOR;
    private long zze;

    /* renamed from: g.d.a.c.f.f.a1$a */
    public static final class C4445a extends C4895z6.C4897b<C4444a1, C4445a> implements C4693n8 {
        private C4445a() {
            super(C4444a1.zzf);
        }

        /* synthetic */ C4445a(C4592i1 i1Var) {
            this();
        }
    }

    static {
        C4444a1 a1Var = new C4444a1();
        zzf = a1Var;
        C4895z6.m20793u(C4444a1.class, a1Var);
    }

    private C4444a1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4592i1.f14178a[i - 1]) {
            case 1:
                return new C4444a1();
            case 2:
                return new C4445a((C4592i1) null);
            case 3:
                return C4895z6.m20791s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C4810u8<C4444a1> u8Var = zzg;
                if (u8Var == null) {
                    synchronized (C4444a1.class) {
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
