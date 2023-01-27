package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.List;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.g1 */
public final class C4556g1 extends C4895z6<C4556g1, C4557a> implements C4693n8 {
    /* access modifiers changed from: private */
    public static final C4556g1 zzf;
    private static volatile C4810u8<C4556g1> zzg;
    private int zzc;
    private int zzd;
    private C4598i7 zze = C4895z6.m20796z();

    /* renamed from: g.d.a.c.f.f.g1$a */
    public static final class C4557a extends C4895z6.C4897b<C4556g1, C4557a> implements C4693n8 {
        private C4557a() {
            super(C4556g1.zzf);
        }

        /* synthetic */ C4557a(C4592i1 i1Var) {
            this();
        }

        /* renamed from: v */
        public final C4557a mo14171v(int i) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4556g1) this.f14678g).m19492I(i);
            return this;
        }

        /* renamed from: x */
        public final C4557a mo14172x(Iterable<? extends Long> iterable) {
            if (this.f14679h) {
                mo14816s();
                this.f14679h = false;
            }
            ((C4556g1) this.f14678g).m19491E(iterable);
            return this;
        }
    }

    static {
        C4556g1 g1Var = new C4556g1();
        zzf = g1Var;
        C4895z6.m20793u(C4556g1.class, g1Var);
    }

    private C4556g1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m19491E(Iterable<? extends Long> iterable) {
        C4598i7 i7Var = this.zze;
        if (!i7Var.mo14223a()) {
            this.zze = C4895z6.m20790q(i7Var);
        }
        C4614j5.m19656j(iterable, this.zze);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public final void m19492I(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* renamed from: L */
    public static C4557a m19493L() {
        return (C4557a) zzf.mo14812w();
    }

    /* renamed from: B */
    public final long mo14166B(int i) {
        return this.zze.mo14243g(i);
    }

    /* renamed from: F */
    public final boolean mo14167F() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: G */
    public final int mo14168G() {
        return this.zzd;
    }

    /* renamed from: J */
    public final List<Long> mo14169J() {
        return this.zze;
    }

    /* renamed from: K */
    public final int mo14170K() {
        return this.zze.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo13771r(int i, Object obj, Object obj2) {
        switch (C4592i1.f14178a[i - 1]) {
            case 1:
                return new C4556g1();
            case 2:
                return new C4557a((C4592i1) null);
            case 3:
                return C4895z6.m20791s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C4810u8<C4556g1> u8Var = zzg;
                if (u8Var == null) {
                    synchronized (C4556g1.class) {
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
