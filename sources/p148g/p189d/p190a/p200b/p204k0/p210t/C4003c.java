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

/* renamed from: g.d.a.b.k0.t.c */
public final class C4003c implements C3915e {

    /* renamed from: e */
    private static final int f12472e = C4284w.m18249o("ID3");

    /* renamed from: a */
    private final long f12473a;

    /* renamed from: b */
    private final C4004d f12474b;

    /* renamed from: c */
    private final C4274m f12475c;

    /* renamed from: d */
    private boolean f12476d;

    public C4003c() {
        this(0);
    }

    public C4003c(long j) {
        this.f12473a = j;
        this.f12474b = new C4004d(true);
        this.f12475c = new C4274m(200);
    }

    /* renamed from: a */
    public void mo12738a() {
    }

    /* renamed from: b */
    public void mo12739b(C3917g gVar) {
        this.f12474b.mo12851f(gVar, new C4031w.C4035d(0, 1));
        gVar.mo12744c();
        gVar.mo12743b(new C3923l.C3925b(-9223372036854775807L));
    }

    /* renamed from: c */
    public void mo12740c(long j, long j2) {
        this.f12476d = false;
        this.f12474b.mo12847a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        r11.mo12723e();
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
        if ((r5 - r4) < 8192) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12741d(p148g.p189d.p190a.p200b.p204k0.C3916f r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r10 = this;
            g.d.a.b.r0.m r0 = new g.d.a.b.r0.m
            r1 = 10
            r0.<init>((int) r1)
            g.d.a.b.r0.l r2 = new g.d.a.b.r0.l
            byte[] r3 = r0.f13643a
            r2.<init>(r3)
            r3 = 0
            r4 = 0
        L_0x0010:
            byte[] r5 = r0.f13643a
            r11.mo12727i(r5, r3, r1)
            r0.mo13454J(r3)
            int r5 = r0.mo13445A()
            int r6 = f12472e
            if (r5 == r6) goto L_0x0074
            r11.mo12723e()
            r11.mo12728j(r4)
            r5 = r4
        L_0x0027:
            r1 = 0
            r6 = 0
        L_0x0029:
            byte[] r7 = r0.f13643a
            r8 = 2
            r11.mo12727i(r7, r3, r8)
            r0.mo13454J(r3)
            int r7 = r0.mo13448D()
            r8 = 65526(0xfff6, float:9.1821E-41)
            r7 = r7 & r8
            r8 = 65520(0xfff0, float:9.1813E-41)
            if (r7 == r8) goto L_0x004f
            r11.mo12723e()
            int r5 = r5 + 1
            int r1 = r5 - r4
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r6) goto L_0x004b
            return r3
        L_0x004b:
            r11.mo12728j(r5)
            goto L_0x0027
        L_0x004f:
            r7 = 1
            int r1 = r1 + r7
            r8 = 4
            if (r1 < r8) goto L_0x0059
            r9 = 188(0xbc, float:2.63E-43)
            if (r6 <= r9) goto L_0x0059
            return r7
        L_0x0059:
            byte[] r7 = r0.f13643a
            r11.mo12727i(r7, r3, r8)
            r7 = 14
            r2.mo13441m(r7)
            r7 = 13
            int r7 = r2.mo13436h(r7)
            r8 = 6
            if (r7 > r8) goto L_0x006d
            return r3
        L_0x006d:
            int r8 = r7 + -6
            r11.mo12728j(r8)
            int r6 = r6 + r7
            goto L_0x0029
        L_0x0074:
            r5 = 3
            r0.mo13455K(r5)
            int r5 = r0.mo13478w()
            int r6 = r5 + 10
            int r4 = r4 + r6
            r11.mo12728j(r5)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p210t.C4003c.mo12741d(g.d.a.b.k0.f):boolean");
    }

    /* renamed from: h */
    public int mo12742h(C3916f fVar, C3922k kVar) throws IOException, InterruptedException {
        int a = fVar.mo12719a(this.f12475c.f13643a, 0, 200);
        if (a == -1) {
            return -1;
        }
        this.f12475c.mo13454J(0);
        this.f12475c.mo13453I(a);
        if (!this.f12476d) {
            this.f12474b.mo12849d(this.f12473a, true);
            this.f12476d = true;
        }
        this.f12474b.mo12848c(this.f12475c);
        return 0;
    }
}
