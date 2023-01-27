package p148g.p189d.p190a.p200b.p204k0.p210t;

import java.io.IOException;
import p148g.p189d.p190a.p200b.p204k0.C3915e;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3922k;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.t.a */
public final class C4001a implements C3915e {

    /* renamed from: e */
    private static final int f12455e = C4284w.m18249o("ID3");

    /* renamed from: a */
    private final long f12456a;

    /* renamed from: b */
    private final C4002b f12457b;

    /* renamed from: c */
    private final C4274m f12458c;

    /* renamed from: d */
    private boolean f12459d;

    public C4001a() {
        this(0);
    }

    public C4001a(long j) {
        this.f12456a = j;
        this.f12457b = new C4002b();
        this.f12458c = new C4274m(2786);
    }

    /* renamed from: a */
    public void mo12738a() {
    }

    /* renamed from: b */
    public void mo12739b(C3917g gVar) {
        this.f12457b.mo12851f(gVar, new C4031w.C4035d(0, 1));
        gVar.mo12744c();
        gVar.mo12743b(new C3923l.C3925b(-9223372036854775807L));
    }

    /* renamed from: c */
    public void mo12740c(long j, long j2) {
        this.f12459d = false;
        this.f12457b.mo12847a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r8.mo12723e();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if ((r4 - r3) < 8192) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12741d(p148g.p189d.p190a.p200b.p204k0.C3916f r8) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r7 = this;
            g.d.a.b.r0.m r0 = new g.d.a.b.r0.m
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f13643a
            r8.mo12727i(r4, r2, r1)
            r0.mo13454J(r2)
            int r4 = r0.mo13445A()
            int r5 = f12455e
            if (r4 == r5) goto L_0x0058
            r8.mo12723e()
            r8.mo12728j(r3)
            r4 = r3
        L_0x0020:
            r1 = 0
        L_0x0021:
            byte[] r5 = r0.f13643a
            r6 = 5
            r8.mo12727i(r5, r2, r6)
            r0.mo13454J(r2)
            int r5 = r0.mo13448D()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0042
            r8.mo12723e()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x003e
            return r2
        L_0x003e:
            r8.mo12728j(r4)
            goto L_0x0020
        L_0x0042:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x0048
            return r5
        L_0x0048:
            byte[] r5 = r0.f13643a
            int r5 = p148g.p189d.p190a.p200b.p201h0.C3849a.m16081e(r5)
            r6 = -1
            if (r5 != r6) goto L_0x0052
            return r2
        L_0x0052:
            int r5 = r5 + -5
            r8.mo12728j(r5)
            goto L_0x0021
        L_0x0058:
            r4 = 3
            r0.mo13455K(r4)
            int r4 = r0.mo13478w()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.mo12728j(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p210t.C4001a.mo12741d(g.d.a.b.k0.f):boolean");
    }

    /* renamed from: h */
    public int mo12742h(C3916f fVar, C3922k kVar) throws IOException, InterruptedException {
        int a = fVar.mo12719a(this.f12458c.f13643a, 0, 2786);
        if (a == -1) {
            return -1;
        }
        this.f12458c.mo13454J(0);
        this.f12458c.mo13453I(a);
        if (!this.f12459d) {
            this.f12457b.mo12849d(this.f12456a, true);
            this.f12459d = true;
        }
        this.f12457b.mo12848c(this.f12458c);
        return 0;
    }
}
