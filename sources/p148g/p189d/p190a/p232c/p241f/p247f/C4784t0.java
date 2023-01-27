package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p232c.p241f.p247f.C4767s0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.t0 */
public final class C4784t0 extends C4895z6<C4784t0, C4785a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4784t0 zzm;
    private static volatile C4810u8<C4784t0> zzn;
    private int zzc;
    private long zzd;
    private String zze = BuildConfig.FLAVOR;
    private int zzf;
    private C4581h7<C4801u0> zzg = C4895z6.m20787A();
    private C4581h7<C4767s0> zzh = C4895z6.m20787A();
    private C4581h7<C4608j0> zzi = C4895z6.m20787A();
    private String zzj = BuildConfig.FLAVOR;
    private boolean zzk;
    private C4581h7<C4647l1> zzl = C4895z6.m20787A();

    /* renamed from: g.d.a.c.f.f.t0$a */
    public static final class C4785a extends C4895z6.C4897b<C4784t0, C4785a> implements C4693n8 {
        private C4785a() {
            super(C4784t0.zzm);
        }

        /* synthetic */ C4785a(C4834w0 w0Var) {
            this();
        }

        /* renamed from: A */
        public final C4785a mo14646A() {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4784t0) this.f14678g).m20409T();
            return this;
        }

        /* renamed from: v */
        public final int mo14647v() {
            return ((C4784t0) this.f14678g).mo14643L();
        }

        /* renamed from: x */
        public final C4767s0 mo14648x(int i) {
            return ((C4784t0) this.f14678g).mo14637B(i);
        }

        /* renamed from: y */
        public final C4785a mo14649y(int i, C4767s0.C4768a aVar) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4784t0) this.f14678g).m20403C(i, (C4767s0) ((C4895z6) aVar.mo14350h()));
            return this;
        }

        /* renamed from: z */
        public final List<C4608j0> mo14650z() {
            return Collections.unmodifiableList(((C4784t0) this.f14678g).mo14644M());
        }
    }

    static {
        C4784t0 t0Var = new C4784t0();
        zzm = t0Var;
        C4895z6.m20793u(C4784t0.class, t0Var);
    }

    private C4784t0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m20403C(int i, C4767s0 s0Var) {
        s0Var.getClass();
        C4581h7<C4767s0> h7Var = this.zzh;
        if (!h7Var.mo14223a()) {
            this.zzh = C4895z6.m20789p(h7Var);
        }
        this.zzh.set(i, s0Var);
    }

    /* renamed from: O */
    public static C4785a m20406O() {
        return (C4785a) zzm.mo14812w();
    }

    /* renamed from: P */
    public static C4784t0 m20407P() {
        return zzm;
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public final void m20409T() {
        this.zzi = C4895z6.m20787A();
    }

    /* renamed from: B */
    public final C4767s0 mo14637B(int i) {
        return this.zzh.get(i);
    }

    /* renamed from: F */
    public final boolean mo14638F() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: G */
    public final long mo14639G() {
        return this.zzd;
    }

    /* renamed from: I */
    public final boolean mo14640I() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: J */
    public final String mo14641J() {
        return this.zze;
    }

    /* renamed from: K */
    public final List<C4801u0> mo14642K() {
        return this.zzg;
    }

    /* renamed from: L */
    public final int mo14643L() {
        return this.zzh.size();
    }

    /* renamed from: M */
    public final List<C4608j0> mo14644M() {
        return this.zzi;
    }

    /* renamed from: N */
    public final boolean mo14645N() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4834w0.f14602a[i - 1]) {
            case 1:
                return new C4784t0();
            case 2:
                return new C4785a((C4834w0) null);
            case 3:
                return C4895z6.m20791s(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", C4801u0.class, "zzh", C4767s0.class, "zzi", C4608j0.class, "zzj", "zzk", "zzl", C4647l1.class});
            case 4:
                return zzm;
            case 5:
                C4810u8<C4784t0> u8Var = zzn;
                if (u8Var == null) {
                    synchronized (C4784t0.class) {
                        u8Var = zzn;
                        if (u8Var == null) {
                            u8Var = new C4895z6.C4896a<>(zzm);
                            zzn = u8Var;
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
