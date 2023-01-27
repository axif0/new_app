package p148g.p189d.p190a.p200b;

import p148g.p189d.p190a.p200b.p230r0.C4261b;
import p148g.p189d.p190a.p200b.p230r0.C4268i;
import p148g.p189d.p190a.p200b.p230r0.C4279r;

/* renamed from: g.d.a.b.f */
final class C3838f implements C4268i {

    /* renamed from: f */
    private final C4279r f11546f;

    /* renamed from: g */
    private final C3839a f11547g;

    /* renamed from: h */
    private C3829a0 f11548h;

    /* renamed from: i */
    private C4268i f11549i;

    /* renamed from: g.d.a.b.f$a */
    public interface C3839a {
        /* renamed from: b */
        void mo12466b(C4315w wVar);
    }

    public C3838f(C3839a aVar, C4261b bVar) {
        this.f11547g = aVar;
        this.f11546f = new C4279r(bVar);
    }

    /* renamed from: a */
    private void m15947a() {
        this.f11546f.mo13494a(this.f11549i.mo12465u());
        C4315w d = this.f11549i.mo12458d();
        if (!d.equals(this.f11546f.mo12458d())) {
            this.f11546f.mo12462h(d);
            this.f11547g.mo12466b(d);
        }
    }

    /* renamed from: b */
    private boolean m15948b() {
        C3829a0 a0Var = this.f11548h;
        return a0Var != null && !a0Var.mo12434c() && (this.f11548h.mo12435g() || !this.f11548h.mo12417j());
    }

    /* renamed from: c */
    public void mo12457c(C3829a0 a0Var) {
        if (a0Var == this.f11548h) {
            this.f11549i = null;
            this.f11548h = null;
        }
    }

    /* renamed from: d */
    public C4315w mo12458d() {
        C4268i iVar = this.f11549i;
        return iVar != null ? iVar.mo12458d() : this.f11546f.mo12458d();
    }

    /* renamed from: e */
    public void mo12459e(C3829a0 a0Var) throws C3848h {
        C4268i iVar;
        C4268i s = a0Var.mo12425s();
        if (s != null && s != (iVar = this.f11549i)) {
            if (iVar == null) {
                this.f11549i = s;
                this.f11548h = a0Var;
                s.mo12462h(this.f11546f.mo12458d());
                m15947a();
                return;
            }
            throw C3848h.m16076c(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    /* renamed from: f */
    public void mo12460f(long j) {
        this.f11546f.mo13494a(j);
    }

    /* renamed from: g */
    public void mo12461g() {
        this.f11546f.mo13495b();
    }

    /* renamed from: h */
    public C4315w mo12462h(C4315w wVar) {
        C4268i iVar = this.f11549i;
        if (iVar != null) {
            wVar = iVar.mo12462h(wVar);
        }
        this.f11546f.mo12462h(wVar);
        this.f11547g.mo12466b(wVar);
        return wVar;
    }

    /* renamed from: i */
    public void mo12463i() {
        this.f11546f.mo13496c();
    }

    /* renamed from: j */
    public long mo12464j() {
        if (!m15948b()) {
            return this.f11546f.mo12465u();
        }
        m15947a();
        return this.f11549i.mo12465u();
    }

    /* renamed from: u */
    public long mo12465u() {
        return m15948b() ? this.f11549i.mo12465u() : this.f11546f.mo12465u();
    }
}
