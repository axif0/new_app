package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.List;
import p148g.p189d.p190a.p232c.p241f.p247f.C4499d1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.c1 */
public final class C4481c1 extends C4895z6<C4481c1, C4482a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4481c1 zzd;
    private static volatile C4810u8<C4481c1> zze;
    private C4581h7<C4499d1> zzc = C4895z6.m20787A();

    /* renamed from: g.d.a.c.f.f.c1$a */
    public static final class C4482a extends C4895z6.C4897b<C4481c1, C4482a> implements C4693n8 {
        private C4482a() {
            super(C4481c1.zzd);
        }

        /* synthetic */ C4482a(C4592i1 i1Var) {
            this();
        }

        /* renamed from: v */
        public final C4482a mo13872v(C4499d1.C4500a aVar) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4481c1) this.f14678g).m18937E((C4499d1) ((C4895z6) aVar.mo14350h()));
            return this;
        }

        /* renamed from: x */
        public final C4499d1 mo13873x(int i) {
            return ((C4481c1) this.f14678g).mo13870B(0);
        }
    }

    static {
        C4481c1 c1Var = new C4481c1();
        zzd = c1Var;
        C4895z6.m20793u(C4481c1.class, c1Var);
    }

    private C4481c1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m18937E(C4499d1 d1Var) {
        d1Var.getClass();
        C4581h7<C4499d1> h7Var = this.zzc;
        if (!h7Var.mo14223a()) {
            this.zzc = C4895z6.m20789p(h7Var);
        }
        this.zzc.add(d1Var);
    }

    /* renamed from: F */
    public static C4482a m18938F() {
        return (C4482a) zzd.mo14812w();
    }

    /* renamed from: B */
    public final C4499d1 mo13870B(int i) {
        return this.zzc.get(0);
    }

    /* renamed from: C */
    public final List<C4499d1> mo13871C() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4592i1.f14178a[i - 1]) {
            case 1:
                return new C4481c1();
            case 2:
                return new C4482a((C4592i1) null);
            case 3:
                return C4895z6.m20791s(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C4499d1.class});
            case 4:
                return zzd;
            case 5:
                C4810u8<C4481c1> u8Var = zze;
                if (u8Var == null) {
                    synchronized (C4481c1.class) {
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
