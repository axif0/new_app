package p148g.p189d.p190a.p232c.p241f.p247f;

import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.y0 */
public final class C4867y0 extends C4895z6<C4867y0, C4868a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4867y0 zzf;
    private static volatile C4810u8<C4867y0> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    /* renamed from: g.d.a.c.f.f.y0$a */
    public static final class C4868a extends C4895z6.C4897b<C4867y0, C4868a> implements C4693n8 {
        private C4868a() {
            super(C4867y0.zzf);
        }

        /* synthetic */ C4868a(C4592i1 i1Var) {
            this();
        }

        /* renamed from: v */
        public final C4868a mo14745v(int i) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4867y0) this.f14678g).m20606B(i);
            return this;
        }

        /* renamed from: x */
        public final C4868a mo14746x(long j) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4867y0) this.f14678g).m20607C(j);
            return this;
        }
    }

    static {
        C4867y0 y0Var = new C4867y0();
        zzf = y0Var;
        C4895z6.m20793u(C4867y0.class, y0Var);
    }

    private C4867y0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m20606B(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m20607C(long j) {
        this.zzc |= 2;
        this.zze = j;
    }

    /* renamed from: K */
    public static C4868a m20610K() {
        return (C4868a) zzf.mo14812w();
    }

    /* renamed from: F */
    public final boolean mo14741F() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: G */
    public final int mo14742G() {
        return this.zzd;
    }

    /* renamed from: I */
    public final boolean mo14743I() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: J */
    public final long mo14744J() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4592i1.f14178a[i - 1]) {
            case 1:
                return new C4867y0();
            case 2:
                return new C4868a((C4592i1) null);
            case 3:
                return C4895z6.m20791s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C4810u8<C4867y0> u8Var = zzg;
                if (u8Var == null) {
                    synchronized (C4867y0.class) {
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
