package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.List;
import p148g.p189d.p190a.p232c.p241f.p247f.C4628k0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4684n0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.j0 */
public final class C4608j0 extends C4895z6<C4608j0, C4609a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4608j0 zzi;
    private static volatile C4810u8<C4608j0> zzj;
    private int zzc;
    private int zzd;
    private C4581h7<C4684n0> zze = C4895z6.m20787A();
    private C4581h7<C4628k0> zzf = C4895z6.m20787A();
    private boolean zzg;
    private boolean zzh;

    /* renamed from: g.d.a.c.f.f.j0$a */
    public static final class C4609a extends C4895z6.C4897b<C4608j0, C4609a> implements C4693n8 {
        private C4609a() {
            super(C4608j0.zzi);
        }

        /* synthetic */ C4609a(C4719p0 p0Var) {
            this();
        }

        /* renamed from: A */
        public final int mo14258A() {
            return ((C4608j0) this.f14678g).mo14257N();
        }

        /* renamed from: B */
        public final C4628k0 mo14259B(int i) {
            return ((C4608j0) this.f14678g).mo14253J(i);
        }

        /* renamed from: v */
        public final int mo14260v() {
            return ((C4608j0) this.f14678g).mo14255L();
        }

        /* renamed from: x */
        public final C4609a mo14261x(int i, C4628k0.C4629a aVar) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4608j0) this.f14678g).m19633C(i, (C4628k0) ((C4895z6) aVar.mo14350h()));
            return this;
        }

        /* renamed from: y */
        public final C4609a mo14262y(int i, C4684n0.C4685a aVar) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4608j0) this.f14678g).m19634D(i, (C4684n0) ((C4895z6) aVar.mo14350h()));
            return this;
        }

        /* renamed from: z */
        public final C4684n0 mo14263z(int i) {
            return ((C4608j0) this.f14678g).mo14250B(i);
        }
    }

    static {
        C4608j0 j0Var = new C4608j0();
        zzi = j0Var;
        C4895z6.m20793u(C4608j0.class, j0Var);
    }

    private C4608j0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m19633C(int i, C4628k0 k0Var) {
        k0Var.getClass();
        C4581h7<C4628k0> h7Var = this.zzf;
        if (!h7Var.mo14223a()) {
            this.zzf = C4895z6.m20789p(h7Var);
        }
        this.zzf.set(i, k0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m19634D(int i, C4684n0 n0Var) {
        n0Var.getClass();
        C4581h7<C4684n0> h7Var = this.zze;
        if (!h7Var.mo14223a()) {
            this.zze = C4895z6.m20789p(h7Var);
        }
        this.zze.set(i, n0Var);
    }

    /* renamed from: B */
    public final C4684n0 mo14250B(int i) {
        return this.zze.get(i);
    }

    /* renamed from: G */
    public final boolean mo14251G() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: I */
    public final int mo14252I() {
        return this.zzd;
    }

    /* renamed from: J */
    public final C4628k0 mo14253J(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: K */
    public final List<C4684n0> mo14254K() {
        return this.zze;
    }

    /* renamed from: L */
    public final int mo14255L() {
        return this.zze.size();
    }

    /* renamed from: M */
    public final List<C4628k0> mo14256M() {
        return this.zzf;
    }

    /* renamed from: N */
    public final int mo14257N() {
        return this.zzf.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4719p0.f14360a[i - 1]) {
            case 1:
                return new C4608j0();
            case 2:
                return new C4609a((C4719p0) null);
            case 3:
                return C4895z6.m20791s(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", C4684n0.class, "zzf", C4628k0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                C4810u8<C4608j0> u8Var = zzj;
                if (u8Var == null) {
                    synchronized (C4608j0.class) {
                        u8Var = zzj;
                        if (u8Var == null) {
                            u8Var = new C4895z6.C4896a<>(zzi);
                            zzj = u8Var;
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
