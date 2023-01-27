package p148g.p189d.p190a.p200b.p204k0.p210t;

import android.util.SparseArray;
import java.io.IOException;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p204k0.C3915e;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p230r0.C4273l;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4282u;

/* renamed from: g.d.a.b.k0.t.q */
public final class C4022q implements C3915e {

    /* renamed from: a */
    private final C4282u f12663a;

    /* renamed from: b */
    private final SparseArray<C4023a> f12664b;

    /* renamed from: c */
    private final C4274m f12665c;

    /* renamed from: d */
    private boolean f12666d;

    /* renamed from: e */
    private boolean f12667e;

    /* renamed from: f */
    private boolean f12668f;

    /* renamed from: g */
    private C3917g f12669g;

    /* renamed from: g.d.a.b.k0.t.q$a */
    private static final class C4023a {

        /* renamed from: a */
        private final C4008h f12670a;

        /* renamed from: b */
        private final C4282u f12671b;

        /* renamed from: c */
        private final C4273l f12672c = new C4273l(new byte[64]);

        /* renamed from: d */
        private boolean f12673d;

        /* renamed from: e */
        private boolean f12674e;

        /* renamed from: f */
        private boolean f12675f;

        /* renamed from: g */
        private int f12676g;

        /* renamed from: h */
        private long f12677h;

        public C4023a(C4008h hVar, C4282u uVar) {
            this.f12670a = hVar;
            this.f12671b = uVar;
        }

        /* renamed from: b */
        private void m16989b() {
            this.f12672c.mo13443o(8);
            this.f12673d = this.f12672c.mo13435g();
            this.f12674e = this.f12672c.mo13435g();
            this.f12672c.mo13443o(6);
            this.f12676g = this.f12672c.mo13436h(8);
        }

        /* renamed from: c */
        private void m16990c() {
            this.f12677h = 0;
            if (this.f12673d) {
                this.f12672c.mo13443o(4);
                this.f12672c.mo13443o(1);
                this.f12672c.mo13443o(1);
                long h = (((long) this.f12672c.mo13436h(3)) << 30) | ((long) (this.f12672c.mo13436h(15) << 15)) | ((long) this.f12672c.mo13436h(15));
                this.f12672c.mo13443o(1);
                if (!this.f12675f && this.f12674e) {
                    this.f12672c.mo13443o(4);
                    this.f12672c.mo13443o(1);
                    this.f12672c.mo13443o(1);
                    this.f12672c.mo13443o(1);
                    this.f12671b.mo13498b((((long) this.f12672c.mo13436h(3)) << 30) | ((long) (this.f12672c.mo13436h(15) << 15)) | ((long) this.f12672c.mo13436h(15)));
                    this.f12675f = true;
                }
                this.f12677h = this.f12671b.mo13498b(h);
            }
        }

        /* renamed from: a */
        public void mo12880a(C4274m mVar) throws C4313u {
            mVar.mo13462g(this.f12672c.f13639a, 0, 3);
            this.f12672c.mo13441m(0);
            m16989b();
            mVar.mo13462g(this.f12672c.f13639a, 0, this.f12676g);
            this.f12672c.mo13441m(0);
            m16990c();
            this.f12670a.mo12849d(this.f12677h, true);
            this.f12670a.mo12848c(mVar);
            this.f12670a.mo12850e();
        }

        /* renamed from: d */
        public void mo12881d() {
            this.f12675f = false;
            this.f12670a.mo12847a();
        }
    }

    public C4022q() {
        this(new C4282u(0));
    }

    public C4022q(C4282u uVar) {
        this.f12663a = uVar;
        this.f12665c = new C4274m(4096);
        this.f12664b = new SparseArray<>();
    }

    /* renamed from: a */
    public void mo12738a() {
    }

    /* renamed from: b */
    public void mo12739b(C3917g gVar) {
        this.f12669g = gVar;
        gVar.mo12743b(new C3923l.C3925b(-9223372036854775807L));
    }

    /* renamed from: c */
    public void mo12740c(long j, long j2) {
        this.f12663a.mo13502g();
        for (int i = 0; i < this.f12664b.size(); i++) {
            this.f12664b.valueAt(i).mo12881d();
        }
    }

    /* renamed from: d */
    public boolean mo12741d(C3916f fVar) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        fVar.mo12727i(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        fVar.mo12728j(bArr[13] & 7);
        fVar.mo12727i(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a9  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo12742h(p148g.p189d.p190a.p200b.p204k0.C3916f r10, p148g.p189d.p190a.p200b.p204k0.C3922k r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r9 = this;
            g.d.a.b.r0.m r11 = r9.f12665c
            byte[] r11 = r11.f13643a
            r0 = 0
            r1 = 4
            r2 = 1
            boolean r11 = r10.mo12725g(r11, r0, r1, r2)
            r1 = -1
            if (r11 != 0) goto L_0x000f
            return r1
        L_0x000f:
            g.d.a.b.r0.m r11 = r9.f12665c
            r11.mo13454J(r0)
            g.d.a.b.r0.m r11 = r9.f12665c
            int r11 = r11.mo13464i()
            r3 = 441(0x1b9, float:6.18E-43)
            if (r11 != r3) goto L_0x001f
            return r1
        L_0x001f:
            r1 = 442(0x1ba, float:6.2E-43)
            if (r11 != r1) goto L_0x0041
            g.d.a.b.r0.m r11 = r9.f12665c
            byte[] r11 = r11.f13643a
            r1 = 10
            r10.mo12727i(r11, r0, r1)
            g.d.a.b.r0.m r11 = r9.f12665c
            r1 = 9
            r11.mo13454J(r1)
            g.d.a.b.r0.m r11 = r9.f12665c
            int r11 = r11.mo13479x()
            r11 = r11 & 7
            int r11 = r11 + 14
        L_0x003d:
            r10.mo12724f(r11)
            return r0
        L_0x0041:
            r1 = 443(0x1bb, float:6.21E-43)
            r3 = 2
            r4 = 6
            if (r11 != r1) goto L_0x005b
            g.d.a.b.r0.m r11 = r9.f12665c
            byte[] r11 = r11.f13643a
            r10.mo12727i(r11, r0, r3)
            g.d.a.b.r0.m r11 = r9.f12665c
            r11.mo13454J(r0)
            g.d.a.b.r0.m r11 = r9.f12665c
            int r11 = r11.mo13448D()
            int r11 = r11 + r4
            goto L_0x003d
        L_0x005b:
            r1 = r11 & -256(0xffffffffffffff00, float:NaN)
            int r1 = r1 >> 8
            if (r1 == r2) goto L_0x0065
            r10.mo12724f(r2)
            return r0
        L_0x0065:
            r11 = r11 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<g.d.a.b.k0.t.q$a> r1 = r9.f12664b
            java.lang.Object r1 = r1.get(r11)
            g.d.a.b.k0.t.q$a r1 = (p148g.p189d.p190a.p200b.p204k0.p210t.C4022q.C4023a) r1
            boolean r5 = r9.f12666d
            if (r5 != 0) goto L_0x00db
            if (r1 != 0) goto L_0x00c1
            r5 = 0
            boolean r6 = r9.f12667e
            if (r6 != 0) goto L_0x0086
            r6 = 189(0xbd, float:2.65E-43)
            if (r11 != r6) goto L_0x0086
            g.d.a.b.k0.t.b r5 = new g.d.a.b.k0.t.b
            r5.<init>()
        L_0x0083:
            r9.f12667e = r2
            goto L_0x00a7
        L_0x0086:
            boolean r6 = r9.f12667e
            if (r6 != 0) goto L_0x0096
            r6 = r11 & 224(0xe0, float:3.14E-43)
            r7 = 192(0xc0, float:2.69E-43)
            if (r6 != r7) goto L_0x0096
            g.d.a.b.k0.t.n r5 = new g.d.a.b.k0.t.n
            r5.<init>()
            goto L_0x0083
        L_0x0096:
            boolean r6 = r9.f12668f
            if (r6 != 0) goto L_0x00a7
            r6 = r11 & 240(0xf0, float:3.36E-43)
            r7 = 224(0xe0, float:3.14E-43)
            if (r6 != r7) goto L_0x00a7
            g.d.a.b.k0.t.i r5 = new g.d.a.b.k0.t.i
            r5.<init>()
            r9.f12668f = r2
        L_0x00a7:
            if (r5 == 0) goto L_0x00c1
            g.d.a.b.k0.t.w$d r1 = new g.d.a.b.k0.t.w$d
            r6 = 256(0x100, float:3.59E-43)
            r1.<init>(r11, r6)
            g.d.a.b.k0.g r6 = r9.f12669g
            r5.mo12851f(r6, r1)
            g.d.a.b.k0.t.q$a r1 = new g.d.a.b.k0.t.q$a
            g.d.a.b.r0.u r6 = r9.f12663a
            r1.<init>(r5, r6)
            android.util.SparseArray<g.d.a.b.k0.t.q$a> r5 = r9.f12664b
            r5.put(r11, r1)
        L_0x00c1:
            boolean r11 = r9.f12667e
            if (r11 == 0) goto L_0x00c9
            boolean r11 = r9.f12668f
            if (r11 != 0) goto L_0x00d4
        L_0x00c9:
            long r5 = r10.mo12729k()
            r7 = 1048576(0x100000, double:5.180654E-318)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x00db
        L_0x00d4:
            r9.f12666d = r2
            g.d.a.b.k0.g r11 = r9.f12669g
            r11.mo12744c()
        L_0x00db:
            g.d.a.b.r0.m r11 = r9.f12665c
            byte[] r11 = r11.f13643a
            r10.mo12727i(r11, r0, r3)
            g.d.a.b.r0.m r11 = r9.f12665c
            r11.mo13454J(r0)
            g.d.a.b.r0.m r11 = r9.f12665c
            int r11 = r11.mo13448D()
            int r11 = r11 + r4
            if (r1 != 0) goto L_0x00f4
            r10.mo12724f(r11)
            goto L_0x0113
        L_0x00f4:
            g.d.a.b.r0.m r2 = r9.f12665c
            r2.mo13451G(r11)
            g.d.a.b.r0.m r2 = r9.f12665c
            byte[] r2 = r2.f13643a
            r10.readFully(r2, r0, r11)
            g.d.a.b.r0.m r10 = r9.f12665c
            r10.mo13454J(r4)
            g.d.a.b.r0.m r10 = r9.f12665c
            r1.mo12880a(r10)
            g.d.a.b.r0.m r10 = r9.f12665c
            int r11 = r10.mo13457b()
            r10.mo13453I(r11)
        L_0x0113:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p210t.C4022q.mo12742h(g.d.a.b.k0.f, g.d.a.b.k0.k):int");
    }
}
