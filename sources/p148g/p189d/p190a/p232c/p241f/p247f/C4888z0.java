package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p232c.p241f.p247f.C4462b1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.z0 */
public final class C4888z0 extends C4895z6<C4888z0, C4889a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4888z0 zzi;
    private static volatile C4810u8<C4888z0> zzj;
    private int zzc;
    private C4581h7<C4462b1> zzd = C4895z6.m20787A();
    private String zze = BuildConfig.FLAVOR;
    private long zzf;
    private long zzg;
    private int zzh;

    /* renamed from: g.d.a.c.f.f.z0$a */
    public static final class C4889a extends C4895z6.C4897b<C4888z0, C4889a> implements C4693n8 {
        private C4889a() {
            super(C4888z0.zzi);
        }

        /* synthetic */ C4889a(C4592i1 i1Var) {
            this();
        }

        /* renamed from: A */
        public final C4889a mo14791A(C4462b1 b1Var) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4888z0) this.f14678g).m20746N(b1Var);
            return this;
        }

        /* renamed from: B */
        public final C4889a mo14792B(Iterable<? extends C4462b1> iterable) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4888z0) this.f14678g).m20747O(iterable);
            return this;
        }

        /* renamed from: C */
        public final C4889a mo14793C(String str) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4888z0) this.f14678g).m20748P(str);
            return this;
        }

        /* renamed from: D */
        public final C4462b1 mo14794D(int i) {
            return ((C4888z0) this.f14678g).mo14781B(i);
        }

        /* renamed from: E */
        public final List<C4462b1> mo14795E() {
            return Collections.unmodifiableList(((C4888z0) this.f14678g).mo14782C());
        }

        /* renamed from: F */
        public final int mo14796F() {
            return ((C4888z0) this.f14678g).mo14783R();
        }

        /* renamed from: G */
        public final C4889a mo14797G(int i) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4888z0) this.f14678g).m20749T(i);
            return this;
        }

        /* renamed from: I */
        public final C4889a mo14798I(long j) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4888z0) this.f14678g).m20750U(j);
            return this;
        }

        /* renamed from: J */
        public final C4889a mo14799J() {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4888z0) this.f14678g).m20755g0();
            return this;
        }

        /* renamed from: K */
        public final String mo14800K() {
            return ((C4888z0) this.f14678g).mo14784W();
        }

        /* renamed from: L */
        public final long mo14801L() {
            return ((C4888z0) this.f14678g).mo14786Y();
        }

        /* renamed from: M */
        public final long mo14802M() {
            return ((C4888z0) this.f14678g).mo14788a0();
        }

        /* renamed from: v */
        public final C4889a mo14803v(int i, C4462b1.C4463a aVar) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4888z0) this.f14678g).m20737D(i, (C4462b1) ((C4895z6) aVar.mo14350h()));
            return this;
        }

        /* renamed from: x */
        public final C4889a mo14804x(int i, C4462b1 b1Var) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4888z0) this.f14678g).m20737D(i, b1Var);
            return this;
        }

        /* renamed from: y */
        public final C4889a mo14805y(long j) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4888z0) this.f14678g).m20738E(j);
            return this;
        }

        /* renamed from: z */
        public final C4889a mo14806z(C4462b1.C4463a aVar) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4888z0) this.f14678g).m20746N((C4462b1) ((C4895z6) aVar.mo14350h()));
            return this;
        }
    }

    static {
        C4888z0 z0Var = new C4888z0();
        zzi = z0Var;
        C4895z6.m20793u(C4888z0.class, z0Var);
    }

    private C4888z0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m20737D(int i, C4462b1 b1Var) {
        b1Var.getClass();
        m20754f0();
        this.zzd.set(i, b1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m20738E(long j) {
        this.zzc |= 2;
        this.zzf = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final void m20746N(C4462b1 b1Var) {
        b1Var.getClass();
        m20754f0();
        this.zzd.add(b1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void m20747O(Iterable<? extends C4462b1> iterable) {
        m20754f0();
        C4614j5.m19656j(iterable, this.zzd);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void m20748P(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public final void m20749T(int i) {
        m20754f0();
        this.zzd.remove(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public final void m20750U(long j) {
        this.zzc |= 4;
        this.zzg = j;
    }

    /* renamed from: d0 */
    public static C4889a m20752d0() {
        return (C4889a) zzi.mo14812w();
    }

    /* renamed from: f0 */
    private final void m20754f0() {
        C4581h7<C4462b1> h7Var = this.zzd;
        if (!h7Var.mo14223a()) {
            this.zzd = C4895z6.m20789p(h7Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m20755g0() {
        this.zzd = C4895z6.m20787A();
    }

    /* renamed from: B */
    public final C4462b1 mo14781B(int i) {
        return this.zzd.get(i);
    }

    /* renamed from: C */
    public final List<C4462b1> mo14782C() {
        return this.zzd;
    }

    /* renamed from: R */
    public final int mo14783R() {
        return this.zzd.size();
    }

    /* renamed from: W */
    public final String mo14784W() {
        return this.zze;
    }

    /* renamed from: X */
    public final boolean mo14785X() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: Y */
    public final long mo14786Y() {
        return this.zzf;
    }

    /* renamed from: Z */
    public final boolean mo14787Z() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: a0 */
    public final long mo14788a0() {
        return this.zzg;
    }

    /* renamed from: b0 */
    public final boolean mo14789b0() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: c0 */
    public final int mo14790c0() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4592i1.f14178a[i - 1]) {
            case 1:
                return new C4888z0();
            case 2:
                return new C4889a((C4592i1) null);
            case 3:
                return C4895z6.m20791s(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", C4462b1.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                C4810u8<C4888z0> u8Var = zzj;
                if (u8Var == null) {
                    synchronized (C4888z0.class) {
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
