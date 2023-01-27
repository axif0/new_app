package p148g.p189d.p190a.p232c.p241f.p247f;

import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.l1 */
public final class C4647l1 extends C4895z6<C4647l1, C4648a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4647l1 zzd;
    private static volatile C4810u8<C4647l1> zze;
    private C4581h7<C4666m1> zzc = C4895z6.m20787A();

    /* renamed from: g.d.a.c.f.f.l1$a */
    public static final class C4648a extends C4895z6.C4897b<C4647l1, C4648a> implements C4693n8 {
        private C4648a() {
            super(C4647l1.zzd);
        }

        /* synthetic */ C4648a(C4630k1 k1Var) {
            this();
        }
    }

    static {
        C4647l1 l1Var = new C4647l1();
        zzd = l1Var;
        C4895z6.m20793u(C4647l1.class, l1Var);
    }

    private C4647l1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4630k1.f14210a[i - 1]) {
            case 1:
                return new C4647l1();
            case 2:
                return new C4648a((C4630k1) null);
            case 3:
                return C4895z6.m20791s(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C4666m1.class});
            case 4:
                return zzd;
            case 5:
                C4810u8<C4647l1> u8Var = zze;
                if (u8Var == null) {
                    synchronized (C4647l1.class) {
                        u8Var = zze;
                        if (u8Var == null) {
                            u8Var = new C4895z6.C4896a<>(zzd);
                            zze = u8Var;
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
