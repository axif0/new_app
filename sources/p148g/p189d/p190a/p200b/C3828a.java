package p148g.p189d.p190a.p200b;

import java.io.IOException;
import p148g.p189d.p190a.p200b.p202i0.C3895e;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p203j0.C3906c;
import p148g.p189d.p190a.p200b.p217n0.C4141j;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4268i;

/* renamed from: g.d.a.b.a */
public abstract class C3828a implements C3829a0, C3831b0 {

    /* renamed from: f */
    private final int f11520f;

    /* renamed from: g */
    private C3833c0 f11521g;

    /* renamed from: h */
    private int f11522h;

    /* renamed from: i */
    private int f11523i;

    /* renamed from: j */
    private C4141j f11524j;

    /* renamed from: k */
    private long f11525k;

    /* renamed from: l */
    private boolean f11526l = true;

    /* renamed from: m */
    private boolean f11527m;

    public C3828a(int i) {
        this.f11520f = i;
    }

    /* renamed from: H */
    protected static boolean m15879H(C3906c<?> cVar, C3900a aVar) {
        if (aVar == null) {
            return true;
        }
        if (cVar == null) {
            return false;
        }
        return cVar.mo12708b(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo12405A(boolean z) throws C3848h {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract void mo12406B(long j, boolean z) throws C3848h;

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo12407C() throws C3848h {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo12408D() throws C3848h {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo12409E(C4109n[] nVarArr, long j) throws C3848h {
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final int mo12410F(C4150o oVar, C3895e eVar, boolean z) {
        int a = this.f11524j.mo13086a(oVar, eVar, z);
        if (a == -4) {
            if (eVar.mo12659o()) {
                this.f11526l = true;
                return this.f11527m ? -4 : -3;
            }
            eVar.f11823i += this.f11525k;
        } else if (a == -5) {
            C4109n nVar = oVar.f13171a;
            long j = nVar.f12939B;
            if (j != Long.MAX_VALUE) {
                oVar.f13171a = nVar.mo13060e(j + this.f11525k);
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public int mo12411G(long j) {
        return this.f11524j.mo13088c(j - this.f11525k);
    }

    /* renamed from: b */
    public int mo12412b() throws C3848h {
        return 0;
    }

    /* renamed from: e */
    public final void mo12413e(int i) {
        this.f11522h = i;
    }

    /* renamed from: f */
    public final void mo12414f() {
        boolean z = true;
        if (this.f11523i != 1) {
            z = false;
        }
        C4260a.m18074f(z);
        this.f11523i = 0;
        this.f11524j = null;
        this.f11527m = false;
        mo12433z();
    }

    public final int getState() {
        return this.f11523i;
    }

    /* renamed from: i */
    public final int mo12416i() {
        return this.f11520f;
    }

    /* renamed from: j */
    public final boolean mo12417j() {
        return this.f11526l;
    }

    /* renamed from: k */
    public final void mo12418k(C3833c0 c0Var, C4109n[] nVarArr, C4141j jVar, long j, boolean z, long j2) throws C3848h {
        C4260a.m18074f(this.f11523i == 0);
        this.f11521g = c0Var;
        this.f11523i = 1;
        mo12405A(z);
        mo12429v(nVarArr, jVar, j2);
        mo12406B(j, z);
    }

    /* renamed from: m */
    public void mo12419m(int i, Object obj) throws C3848h {
    }

    /* renamed from: n */
    public final C4141j mo12420n() {
        return this.f11524j;
    }

    /* renamed from: o */
    public final void mo12421o() {
        this.f11527m = true;
    }

    /* renamed from: p */
    public final void mo12422p() throws IOException {
        this.f11524j.mo13087b();
    }

    /* renamed from: q */
    public final void mo12423q(long j) throws C3848h {
        this.f11527m = false;
        this.f11526l = false;
        mo12406B(j, false);
    }

    /* renamed from: r */
    public final boolean mo12424r() {
        return this.f11527m;
    }

    /* renamed from: s */
    public C4268i mo12425s() {
        return null;
    }

    public final void start() throws C3848h {
        boolean z = true;
        if (this.f11523i != 1) {
            z = false;
        }
        C4260a.m18074f(z);
        this.f11523i = 2;
        mo12407C();
    }

    public final void stop() throws C3848h {
        C4260a.m18074f(this.f11523i == 2);
        this.f11523i = 1;
        mo12408D();
    }

    /* renamed from: t */
    public final C3831b0 mo12428t() {
        return this;
    }

    /* renamed from: v */
    public final void mo12429v(C4109n[] nVarArr, C4141j jVar, long j) throws C3848h {
        C4260a.m18074f(!this.f11527m);
        this.f11524j = jVar;
        this.f11526l = false;
        this.f11525k = j;
        mo12409E(nVarArr, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final C3833c0 mo12430w() {
        return this.f11521g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo12431x() {
        return this.f11522h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo12432y() {
        return this.f11526l ? this.f11527m : this.f11524j.mo13090g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo12433z();
}
