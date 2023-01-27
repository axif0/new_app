package p148g.p189d.p190a.p200b.p204k0.p209s;

import java.io.IOException;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3922k;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.s.h */
abstract class C3989h {

    /* renamed from: a */
    private final C3985d f12420a = new C3985d();

    /* renamed from: b */
    private C3927n f12421b;

    /* renamed from: c */
    private C3917g f12422c;

    /* renamed from: d */
    private C3987f f12423d;

    /* renamed from: e */
    private long f12424e;

    /* renamed from: f */
    private long f12425f;

    /* renamed from: g */
    private long f12426g;

    /* renamed from: h */
    private int f12427h;

    /* renamed from: i */
    private int f12428i;

    /* renamed from: j */
    private C3991b f12429j;

    /* renamed from: k */
    private long f12430k;

    /* renamed from: l */
    private boolean f12431l;

    /* renamed from: m */
    private boolean f12432m;

    /* renamed from: g.d.a.b.k0.s.h$b */
    static class C3991b {

        /* renamed from: a */
        C4109n f12433a;

        /* renamed from: b */
        C3987f f12434b;

        C3991b() {
        }
    }

    /* renamed from: g.d.a.b.k0.s.h$c */
    private static final class C3992c implements C3987f {
        private C3992c() {
        }

        /* renamed from: a */
        public long mo12814a(C3916f fVar) throws IOException, InterruptedException {
            return -1;
        }

        /* renamed from: b */
        public C3923l mo12815b() {
            return new C3923l.C3925b(-9223372036854775807L);
        }

        /* renamed from: c */
        public long mo12816c(long j) {
            return 0;
        }
    }

    /* renamed from: g */
    private int m16805g(C3916f fVar) throws IOException, InterruptedException {
        boolean z = true;
        while (z) {
            if (!this.f12420a.mo12831d(fVar)) {
                this.f12427h = 3;
                return -1;
            }
            this.f12430k = fVar.mo12729k() - this.f12425f;
            z = mo12825h(this.f12420a.mo12830c(), this.f12425f, this.f12429j);
            if (z) {
                this.f12425f = fVar.mo12729k();
            }
        }
        C4109n nVar = this.f12429j.f12433a;
        this.f12428i = nVar.f12962x;
        if (!this.f12432m) {
            this.f12421b.mo12737d(nVar);
            this.f12432m = true;
        }
        C3987f fVar2 = this.f12429j.f12434b;
        if (fVar2 != null) {
            this.f12423d = fVar2;
        } else if (fVar.mo12722d() == -1) {
            this.f12423d = new C3992c();
        } else {
            C3986e b = this.f12420a.mo12829b();
            this.f12423d = new C3979a(this.f12425f, fVar.mo12722d(), this, b.f12413e + b.f12414f, b.f12411c);
        }
        this.f12429j = null;
        this.f12427h = 2;
        this.f12420a.mo12833f();
        return 0;
    }

    /* renamed from: i */
    private int m16806i(C3916f fVar, C3922k kVar) throws IOException, InterruptedException {
        C3916f fVar2 = fVar;
        long a = this.f12423d.mo12814a(fVar2);
        if (a >= 0) {
            kVar.f11909a = a;
            return 1;
        }
        if (a < -1) {
            mo12839d(-(a + 2));
        }
        if (!this.f12431l) {
            this.f12422c.mo12743b(this.f12423d.mo12815b());
            this.f12431l = true;
        }
        if (this.f12430k > 0 || this.f12420a.mo12831d(fVar2)) {
            this.f12430k = 0;
            C4274m c = this.f12420a.mo12830c();
            long e = mo12824e(c);
            if (e >= 0) {
                long j = this.f12426g;
                if (j + e >= this.f12424e) {
                    long a2 = mo12836a(j);
                    this.f12421b.mo12734a(c, c.mo13459d());
                    this.f12421b.mo12736c(a2, 1, c.mo13459d(), 0, (C3927n.C3928a) null);
                    this.f12424e = -1;
                }
            }
            this.f12426g += e;
            return 0;
        }
        this.f12427h = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo12836a(long j) {
        return (j * 1000000) / ((long) this.f12428i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo12837b(long j) {
        return (((long) this.f12428i) * j) / 1000000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo12838c(C3917g gVar, C3927n nVar) {
        this.f12422c = gVar;
        this.f12421b = nVar;
        mo12826j(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo12839d(long j) {
        this.f12426g = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract long mo12824e(C4274m mVar);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo12840f(C3916f fVar, C3922k kVar) throws IOException, InterruptedException {
        int i = this.f12427h;
        if (i == 0) {
            return m16805g(fVar);
        }
        if (i == 1) {
            fVar.mo12724f((int) this.f12425f);
            this.f12427h = 2;
            return 0;
        } else if (i == 2) {
            return m16806i(fVar, kVar);
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo12825h(C4274m mVar, long j, C3991b bVar) throws IOException, InterruptedException;

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo12826j(boolean z) {
        int i;
        if (z) {
            this.f12429j = new C3991b();
            this.f12425f = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.f12427h = i;
        this.f12424e = -1;
        this.f12426g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo12841k(long j, long j2) {
        this.f12420a.mo12832e();
        if (j == 0) {
            mo12826j(!this.f12431l);
        } else if (this.f12427h != 0) {
            this.f12424e = this.f12423d.mo12816c(j2);
            this.f12427h = 2;
        }
    }
}
