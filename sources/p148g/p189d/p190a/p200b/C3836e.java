package p148g.p189d.p190a.p200b;

import p148g.p189d.p190a.p200b.p217n0.C4146n;
import p148g.p189d.p190a.p200b.p228p0.C4231f;
import p148g.p189d.p190a.p200b.p229q0.C4237b;
import p148g.p189d.p190a.p200b.p229q0.C4242f;
import p148g.p189d.p190a.p200b.p230r0.C4277p;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.e */
public class C3836e implements C4235q {

    /* renamed from: a */
    private final C4242f f11532a;

    /* renamed from: b */
    private final long f11533b;

    /* renamed from: c */
    private final long f11534c;

    /* renamed from: d */
    private final long f11535d;

    /* renamed from: e */
    private final long f11536e;

    /* renamed from: f */
    private final int f11537f;

    /* renamed from: g */
    private final boolean f11538g;

    /* renamed from: h */
    private final C4277p f11539h;

    /* renamed from: i */
    private int f11540i;

    /* renamed from: j */
    private boolean f11541j;

    public C3836e() {
        this(new C4242f(true, 65536));
    }

    public C3836e(C4242f fVar) {
        this(fVar, 15000, 30000, 2500, 5000, -1, true);
    }

    public C3836e(C4242f fVar, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(fVar, i, i2, i3, i4, i5, z, (C4277p) null);
    }

    public C3836e(C4242f fVar, int i, int i2, int i3, int i4, int i5, boolean z, C4277p pVar) {
        this.f11532a = fVar;
        this.f11533b = ((long) i) * 1000;
        this.f11534c = ((long) i2) * 1000;
        this.f11535d = ((long) i3) * 1000;
        this.f11536e = ((long) i4) * 1000;
        this.f11537f = i5;
        this.f11538g = z;
        this.f11539h = pVar;
    }

    /* renamed from: k */
    private void m15936k(boolean z) {
        this.f11540i = 0;
        C4277p pVar = this.f11539h;
        if (pVar == null || !this.f11541j) {
            this.f11541j = false;
            if (z) {
                this.f11532a.mo13377g();
                return;
            }
            return;
        }
        pVar.mo13493b(0);
        throw null;
    }

    /* renamed from: a */
    public boolean mo12445a(long j, float f, boolean z) {
        long s = C4284w.m18253s(j, f);
        long j2 = z ? this.f11536e : this.f11535d;
        return j2 <= 0 || s >= j2 || (!this.f11538g && this.f11532a.mo13376f() >= this.f11540i);
    }

    /* renamed from: b */
    public boolean mo12446b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo12447c(long j, float f) {
        boolean z;
        boolean z2 = true;
        boolean z3 = this.f11532a.mo13376f() >= this.f11540i;
        boolean z4 = this.f11541j;
        if (!this.f11538g ? z3 || (j >= this.f11533b && (j > this.f11534c || !z4)) : j >= this.f11533b && (j > this.f11534c || !z4 || z3)) {
            z2 = false;
        }
        this.f11541j = z2;
        C4277p pVar = this.f11539h;
        if (pVar == null || (z = this.f11541j) == z4) {
            return this.f11541j;
        }
        if (z) {
            pVar.mo13492a(0);
            throw null;
        }
        pVar.mo13493b(0);
        throw null;
    }

    /* renamed from: d */
    public void mo12448d(C3829a0[] a0VarArr, C4146n nVar, C4231f fVar) {
        int i = this.f11537f;
        if (i == -1) {
            i = mo12454j(a0VarArr, fVar);
        }
        this.f11540i = i;
        this.f11532a.mo13378h(i);
    }

    /* renamed from: e */
    public void mo12449e() {
        m15936k(true);
    }

    /* renamed from: f */
    public C4237b mo12450f() {
        return this.f11532a;
    }

    /* renamed from: g */
    public void mo12451g() {
        m15936k(true);
    }

    /* renamed from: h */
    public long mo12452h() {
        return 0;
    }

    /* renamed from: i */
    public void mo12453i() {
        m15936k(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12454j(C3829a0[] a0VarArr, C4231f fVar) {
        int i = 0;
        for (int i2 = 0; i2 < a0VarArr.length; i2++) {
            if (fVar.mo13357a(i2) != null) {
                i += C4284w.m18248n(a0VarArr[i2].mo12416i());
            }
        }
        return i;
    }
}
