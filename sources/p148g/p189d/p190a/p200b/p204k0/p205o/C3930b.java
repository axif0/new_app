package p148g.p189d.p190a.p200b.p204k0.p205o;

import java.io.IOException;
import p148g.p189d.p190a.p200b.p204k0.C3915e;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3922k;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.o.b */
public final class C3930b implements C3915e {

    /* renamed from: p */
    private static final int f11925p = C4284w.m18249o("FLV");

    /* renamed from: a */
    private final C4274m f11926a = new C4274m(4);

    /* renamed from: b */
    private final C4274m f11927b = new C4274m(9);

    /* renamed from: c */
    private final C4274m f11928c = new C4274m(11);

    /* renamed from: d */
    private final C4274m f11929d = new C4274m();

    /* renamed from: e */
    private final C3931c f11930e = new C3931c();

    /* renamed from: f */
    private C3917g f11931f;

    /* renamed from: g */
    private int f11932g = 1;

    /* renamed from: h */
    private long f11933h = -9223372036854775807L;

    /* renamed from: i */
    private int f11934i;

    /* renamed from: j */
    private int f11935j;

    /* renamed from: k */
    private int f11936k;

    /* renamed from: l */
    private long f11937l;

    /* renamed from: m */
    private boolean f11938m;

    /* renamed from: n */
    private C3929a f11939n;

    /* renamed from: o */
    private C3934e f11940o;

    /* renamed from: e */
    private void m16484e() {
        if (!this.f11938m) {
            this.f11931f.mo12743b(new C3923l.C3925b(-9223372036854775807L));
            this.f11938m = true;
        }
        if (this.f11933h == -9223372036854775807L) {
            this.f11933h = this.f11930e.mo12760d() == -9223372036854775807L ? -this.f11937l : 0;
        }
    }

    /* renamed from: f */
    private C4274m m16485f(C3916f fVar) throws IOException, InterruptedException {
        if (this.f11936k > this.f11929d.mo13457b()) {
            C4274m mVar = this.f11929d;
            mVar.mo13452H(new byte[Math.max(mVar.mo13457b() * 2, this.f11936k)], 0);
        } else {
            this.f11929d.mo13454J(0);
        }
        this.f11929d.mo13453I(this.f11936k);
        fVar.readFully(this.f11929d.f13643a, 0, this.f11936k);
        return this.f11929d;
    }

    /* renamed from: g */
    private boolean m16486g(C3916f fVar) throws IOException, InterruptedException {
        boolean z = false;
        if (!fVar.mo12721c(this.f11927b.f13643a, 0, 9, true)) {
            return false;
        }
        this.f11927b.mo13454J(0);
        this.f11927b.mo13455K(4);
        int x = this.f11927b.mo13479x();
        boolean z2 = (x & 4) != 0;
        if ((x & 1) != 0) {
            z = true;
        }
        if (z2 && this.f11939n == null) {
            this.f11939n = new C3929a(this.f11931f.mo12745m(8, 1));
        }
        if (z && this.f11940o == null) {
            this.f11940o = new C3934e(this.f11931f.mo12745m(9, 2));
        }
        this.f11931f.mo12744c();
        this.f11934i = (this.f11927b.mo13464i() - 9) + 4;
        this.f11932g = 2;
        return true;
    }

    /* renamed from: i */
    private boolean m16487i(C3916f fVar) throws IOException, InterruptedException {
        C3932d dVar;
        boolean z = true;
        if (this.f11935j == 8 && this.f11939n != null) {
            m16484e();
            dVar = this.f11939n;
        } else if (this.f11935j == 9 && this.f11940o != null) {
            m16484e();
            dVar = this.f11940o;
        } else if (this.f11935j != 18 || this.f11938m) {
            fVar.mo12724f(this.f11936k);
            z = false;
            this.f11934i = 4;
            this.f11932g = 2;
            return z;
        } else {
            this.f11930e.mo12761a(m16485f(fVar), this.f11937l);
            long d = this.f11930e.mo12760d();
            if (d != -9223372036854775807L) {
                this.f11931f.mo12743b(new C3923l.C3925b(d));
                this.f11938m = true;
            }
            this.f11934i = 4;
            this.f11932g = 2;
            return z;
        }
        dVar.mo12761a(m16485f(fVar), this.f11933h + this.f11937l);
        this.f11934i = 4;
        this.f11932g = 2;
        return z;
    }

    /* renamed from: j */
    private boolean m16488j(C3916f fVar) throws IOException, InterruptedException {
        if (!fVar.mo12721c(this.f11928c.f13643a, 0, 11, true)) {
            return false;
        }
        this.f11928c.mo13454J(0);
        this.f11935j = this.f11928c.mo13479x();
        this.f11936k = this.f11928c.mo13445A();
        this.f11937l = (long) this.f11928c.mo13445A();
        this.f11937l = (((long) (this.f11928c.mo13479x() << 24)) | this.f11937l) * 1000;
        this.f11928c.mo13455K(3);
        this.f11932g = 4;
        return true;
    }

    /* renamed from: k */
    private void m16489k(C3916f fVar) throws IOException, InterruptedException {
        fVar.mo12724f(this.f11934i);
        this.f11934i = 0;
        this.f11932g = 3;
    }

    /* renamed from: a */
    public void mo12738a() {
    }

    /* renamed from: b */
    public void mo12739b(C3917g gVar) {
        this.f11931f = gVar;
    }

    /* renamed from: c */
    public void mo12740c(long j, long j2) {
        this.f11932g = 1;
        this.f11933h = -9223372036854775807L;
        this.f11934i = 0;
    }

    /* renamed from: d */
    public boolean mo12741d(C3916f fVar) throws IOException, InterruptedException {
        fVar.mo12727i(this.f11926a.f13643a, 0, 3);
        this.f11926a.mo13454J(0);
        if (this.f11926a.mo13445A() != f11925p) {
            return false;
        }
        fVar.mo12727i(this.f11926a.f13643a, 0, 2);
        this.f11926a.mo13454J(0);
        if ((this.f11926a.mo13448D() & 250) != 0) {
            return false;
        }
        fVar.mo12727i(this.f11926a.f13643a, 0, 4);
        this.f11926a.mo13454J(0);
        int i = this.f11926a.mo13464i();
        fVar.mo12723e();
        fVar.mo12728j(i);
        fVar.mo12727i(this.f11926a.f13643a, 0, 4);
        this.f11926a.mo13454J(0);
        return this.f11926a.mo13464i() == 0;
    }

    /* renamed from: h */
    public int mo12742h(C3916f fVar, C3922k kVar) throws IOException, InterruptedException {
        while (true) {
            int i = this.f11932g;
            if (i != 1) {
                if (i == 2) {
                    m16489k(fVar);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    } else if (m16487i(fVar)) {
                        return 0;
                    }
                } else if (!m16488j(fVar)) {
                    return -1;
                }
            } else if (!m16486g(fVar)) {
                return -1;
            }
        }
    }
}
