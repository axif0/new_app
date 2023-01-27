package p148g.p189d.p190a.p200b.p230r0;

import p148g.p189d.p190a.p200b.C3830b;
import p148g.p189d.p190a.p200b.C4315w;

/* renamed from: g.d.a.b.r0.r */
public final class C4279r implements C4268i {

    /* renamed from: f */
    private final C4261b f13650f;

    /* renamed from: g */
    private boolean f13651g;

    /* renamed from: h */
    private long f13652h;

    /* renamed from: i */
    private long f13653i;

    /* renamed from: j */
    private C4315w f13654j = C4315w.f13800d;

    public C4279r(C4261b bVar) {
        this.f13650f = bVar;
    }

    /* renamed from: a */
    public void mo13494a(long j) {
        this.f13652h = j;
        if (this.f13651g) {
            this.f13653i = this.f13650f.mo13411a();
        }
    }

    /* renamed from: b */
    public void mo13495b() {
        if (!this.f13651g) {
            this.f13653i = this.f13650f.mo13411a();
            this.f13651g = true;
        }
    }

    /* renamed from: c */
    public void mo13496c() {
        if (this.f13651g) {
            mo13494a(mo12465u());
            this.f13651g = false;
        }
    }

    /* renamed from: d */
    public C4315w mo12458d() {
        return this.f13654j;
    }

    /* renamed from: h */
    public C4315w mo12462h(C4315w wVar) {
        if (this.f13651g) {
            mo13494a(mo12465u());
        }
        this.f13654j = wVar;
        return wVar;
    }

    /* renamed from: u */
    public long mo12465u() {
        long j = this.f13652h;
        if (!this.f13651g) {
            return j;
        }
        long a = this.f13650f.mo13411a() - this.f13653i;
        C4315w wVar = this.f13654j;
        return j + (wVar.f13801a == 1.0f ? C3830b.m15922a(a) : wVar.mo13587a(a));
    }
}
