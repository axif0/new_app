package p148g.p189d.p190a.p232c.p241f.p247f;

import p148g.p189d.p190a.p232c.p241f.p247f.C4536f1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.x0 */
public final class C4850x0 extends C4895z6<C4850x0, C4851a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4850x0 zzh;
    private static volatile C4810u8<C4850x0> zzi;
    private int zzc;
    private int zzd;
    private C4536f1 zze;
    private C4536f1 zzf;
    private boolean zzg;

    /* renamed from: g.d.a.c.f.f.x0$a */
    public static final class C4851a extends C4895z6.C4897b<C4850x0, C4851a> implements C4693n8 {
        private C4851a() {
            super(C4850x0.zzh);
        }

        /* synthetic */ C4851a(C4592i1 i1Var) {
            this();
        }

        /* renamed from: v */
        public final C4851a mo14724v(int i) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4850x0) this.f14678g).m20555B(i);
            return this;
        }

        /* renamed from: x */
        public final C4851a mo14725x(C4536f1.C4537a aVar) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4850x0) this.f14678g).m20559F((C4536f1) ((C4895z6) aVar.mo14350h()));
            return this;
        }

        /* renamed from: y */
        public final C4851a mo14726y(C4536f1 f1Var) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4850x0) this.f14678g).m20562L(f1Var);
            return this;
        }

        /* renamed from: z */
        public final C4851a mo14727z(boolean z) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4850x0) this.f14678g).m20560G(z);
            return this;
        }
    }

    static {
        C4850x0 x0Var = new C4850x0();
        zzh = x0Var;
        C4895z6.m20793u(C4850x0.class, x0Var);
    }

    private C4850x0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m20555B(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m20559F(C4536f1 f1Var) {
        f1Var.getClass();
        this.zze = f1Var;
        this.zzc |= 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m20560G(boolean z) {
        this.zzc |= 8;
        this.zzg = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final void m20562L(C4536f1 f1Var) {
        f1Var.getClass();
        this.zzf = f1Var;
        this.zzc |= 4;
    }

    /* renamed from: T */
    public static C4851a m20563T() {
        return (C4851a) zzh.mo14812w();
    }

    /* renamed from: I */
    public final boolean mo14717I() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: J */
    public final int mo14718J() {
        return this.zzd;
    }

    /* renamed from: M */
    public final C4536f1 mo14719M() {
        C4536f1 f1Var = this.zze;
        return f1Var == null ? C4536f1.m19370d0() : f1Var;
    }

    /* renamed from: N */
    public final boolean mo14720N() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: O */
    public final C4536f1 mo14721O() {
        C4536f1 f1Var = this.zzf;
        return f1Var == null ? C4536f1.m19370d0() : f1Var;
    }

    /* renamed from: P */
    public final boolean mo14722P() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: R */
    public final boolean mo14723R() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4592i1.f14178a[i - 1]) {
            case 1:
                return new C4850x0();
            case 2:
                return new C4851a((C4592i1) null);
            case 3:
                return C4895z6.m20791s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C4810u8<C4850x0> u8Var = zzi;
                if (u8Var == null) {
                    synchronized (C4850x0.class) {
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
