package p148g.p189d.p190a.p200b.p204k0.p210t;

import android.util.Log;
import java.util.Collections;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4270k;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4275n;

/* renamed from: g.d.a.b.k0.t.k */
public final class C4015k implements C4008h {

    /* renamed from: a */
    private final C4026t f12581a;

    /* renamed from: b */
    private String f12582b;

    /* renamed from: c */
    private C3927n f12583c;

    /* renamed from: d */
    private C4016a f12584d;

    /* renamed from: e */
    private boolean f12585e;

    /* renamed from: f */
    private final boolean[] f12586f = new boolean[3];

    /* renamed from: g */
    private final C4020o f12587g = new C4020o(32, 128);

    /* renamed from: h */
    private final C4020o f12588h = new C4020o(33, 128);

    /* renamed from: i */
    private final C4020o f12589i = new C4020o(34, 128);

    /* renamed from: j */
    private final C4020o f12590j = new C4020o(39, 128);

    /* renamed from: k */
    private final C4020o f12591k = new C4020o(40, 128);

    /* renamed from: l */
    private long f12592l;

    /* renamed from: m */
    private long f12593m;

    /* renamed from: n */
    private final C4274m f12594n = new C4274m();

    /* renamed from: g.d.a.b.k0.t.k$a */
    private static final class C4016a {

        /* renamed from: a */
        private final C3927n f12595a;

        /* renamed from: b */
        private long f12596b;

        /* renamed from: c */
        private boolean f12597c;

        /* renamed from: d */
        private int f12598d;

        /* renamed from: e */
        private long f12599e;

        /* renamed from: f */
        private boolean f12600f;

        /* renamed from: g */
        private boolean f12601g;

        /* renamed from: h */
        private boolean f12602h;

        /* renamed from: i */
        private boolean f12603i;

        /* renamed from: j */
        private boolean f12604j;

        /* renamed from: k */
        private long f12605k;

        /* renamed from: l */
        private long f12606l;

        /* renamed from: m */
        private boolean f12607m;

        public C4016a(C3927n nVar) {
            this.f12595a = nVar;
        }

        /* renamed from: b */
        private void m16941b(int i) {
            boolean z = this.f12607m;
            int i2 = (int) (this.f12596b - this.f12605k);
            this.f12595a.mo12736c(this.f12606l, z ? 1 : 0, i2, i, (C3927n.C3928a) null);
        }

        /* renamed from: a */
        public void mo12868a(long j, int i) {
            if (this.f12604j && this.f12601g) {
                this.f12607m = this.f12597c;
                this.f12604j = false;
            } else if (this.f12602h || this.f12601g) {
                if (this.f12603i) {
                    m16941b(i + ((int) (j - this.f12596b)));
                }
                this.f12605k = this.f12596b;
                this.f12606l = this.f12599e;
                this.f12603i = true;
                this.f12607m = this.f12597c;
            }
        }

        /* renamed from: c */
        public void mo12869c(byte[] bArr, int i, int i2) {
            if (this.f12600f) {
                int i3 = this.f12598d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    this.f12601g = (bArr[i4] & 128) != 0;
                    this.f12600f = false;
                    return;
                }
                this.f12598d = i3 + (i2 - i);
            }
        }

        /* renamed from: d */
        public void mo12870d() {
            this.f12600f = false;
            this.f12601g = false;
            this.f12602h = false;
            this.f12603i = false;
            this.f12604j = false;
        }

        /* renamed from: e */
        public void mo12871e(long j, int i, int i2, long j2) {
            boolean z = false;
            this.f12601g = false;
            this.f12602h = false;
            this.f12599e = j2;
            this.f12598d = 0;
            this.f12596b = j;
            if (i2 >= 32) {
                if (!this.f12604j && this.f12603i) {
                    m16941b(i);
                    this.f12603i = false;
                }
                if (i2 <= 34) {
                    this.f12602h = !this.f12604j;
                    this.f12604j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.f12597c = z2;
            if (z2 || i2 <= 9) {
                z = true;
            }
            this.f12600f = z;
        }
    }

    public C4015k(C4026t tVar) {
        this.f12581a = tVar;
    }

    /* renamed from: b */
    private void m16930b(long j, int i, int i2, long j2) {
        if (this.f12585e) {
            this.f12584d.mo12868a(j, i);
        } else {
            this.f12587g.mo12873b(i2);
            this.f12588h.mo12873b(i2);
            this.f12589i.mo12873b(i2);
            if (this.f12587g.mo12874c() && this.f12588h.mo12874c() && this.f12589i.mo12874c()) {
                this.f12583c.mo12737d(m16932h(this.f12582b, this.f12587g, this.f12588h, this.f12589i));
                this.f12585e = true;
            }
        }
        if (this.f12590j.mo12873b(i2)) {
            C4020o oVar = this.f12590j;
            this.f12594n.mo13452H(this.f12590j.f12649d, C4270k.m18128k(oVar.f12649d, oVar.f12650e));
            this.f12594n.mo13455K(5);
            this.f12581a.mo12884a(j2, this.f12594n);
        }
        if (this.f12591k.mo12873b(i2)) {
            C4020o oVar2 = this.f12591k;
            this.f12594n.mo13452H(this.f12591k.f12649d, C4270k.m18128k(oVar2.f12649d, oVar2.f12650e));
            this.f12594n.mo13455K(5);
            this.f12581a.mo12884a(j2, this.f12594n);
        }
    }

    /* renamed from: g */
    private void m16931g(byte[] bArr, int i, int i2) {
        if (this.f12585e) {
            this.f12584d.mo12869c(bArr, i, i2);
        } else {
            this.f12587g.mo12872a(bArr, i, i2);
            this.f12588h.mo12872a(bArr, i, i2);
            this.f12589i.mo12872a(bArr, i, i2);
        }
        this.f12590j.mo12872a(bArr, i, i2);
        this.f12591k.mo12872a(bArr, i, i2);
    }

    /* renamed from: h */
    private static C4109n m16932h(String str, C4020o oVar, C4020o oVar2, C4020o oVar3) {
        float f;
        C4020o oVar4 = oVar;
        C4020o oVar5 = oVar2;
        C4020o oVar6 = oVar3;
        int i = oVar4.f12650e;
        byte[] bArr = new byte[(oVar5.f12650e + i + oVar6.f12650e)];
        System.arraycopy(oVar4.f12649d, 0, bArr, 0, i);
        System.arraycopy(oVar5.f12649d, 0, bArr, oVar4.f12650e, oVar5.f12650e);
        System.arraycopy(oVar6.f12649d, 0, bArr, oVar4.f12650e + oVar5.f12650e, oVar6.f12650e);
        C4275n nVar = new C4275n(oVar5.f12649d, 0, oVar5.f12650e);
        nVar.mo13490l(44);
        int e = nVar.mo13485e(3);
        nVar.mo13489k();
        nVar.mo13490l(88);
        nVar.mo13490l(8);
        int i2 = 0;
        for (int i3 = 0; i3 < e; i3++) {
            if (nVar.mo13484d()) {
                i2 += 89;
            }
            if (nVar.mo13484d()) {
                i2 += 8;
            }
        }
        nVar.mo13490l(i2);
        if (e > 0) {
            nVar.mo13490l((8 - e) * 2);
        }
        nVar.mo13487h();
        int h = nVar.mo13487h();
        if (h == 3) {
            nVar.mo13489k();
        }
        int h2 = nVar.mo13487h();
        int h3 = nVar.mo13487h();
        if (nVar.mo13484d()) {
            int h4 = nVar.mo13487h();
            int h5 = nVar.mo13487h();
            int h6 = nVar.mo13487h();
            int h7 = nVar.mo13487h();
            h2 -= ((h == 1 || h == 2) ? 2 : 1) * (h4 + h5);
            h3 -= (h == 1 ? 2 : 1) * (h6 + h7);
        }
        int i4 = h2;
        int i5 = h3;
        nVar.mo13487h();
        nVar.mo13487h();
        int h8 = nVar.mo13487h();
        int i6 = nVar.mo13484d() ? 0 : e;
        while (true) {
            nVar.mo13487h();
            nVar.mo13487h();
            nVar.mo13487h();
            if (i6 > e) {
                break;
            }
            i6++;
        }
        nVar.mo13487h();
        nVar.mo13487h();
        nVar.mo13487h();
        if (nVar.mo13484d() && nVar.mo13484d()) {
            m16933i(nVar);
        }
        nVar.mo13490l(2);
        if (nVar.mo13484d()) {
            nVar.mo13490l(8);
            nVar.mo13487h();
            nVar.mo13487h();
            nVar.mo13489k();
        }
        m16934j(nVar);
        if (nVar.mo13484d()) {
            for (int i7 = 0; i7 < nVar.mo13487h(); i7++) {
                nVar.mo13490l(h8 + 4 + 1);
            }
        }
        nVar.mo13490l(2);
        float f2 = 1.0f;
        if (nVar.mo13484d() && nVar.mo13484d()) {
            int e2 = nVar.mo13485e(8);
            if (e2 == 255) {
                int e3 = nVar.mo13485e(16);
                int e4 = nVar.mo13485e(16);
                if (!(e3 == 0 || e4 == 0)) {
                    f2 = ((float) e3) / ((float) e4);
                }
                f = f2;
            } else {
                float[] fArr = C4270k.f13623b;
                if (e2 < fArr.length) {
                    f = fArr[e2];
                } else {
                    Log.w("H265Reader", "Unexpected aspect_ratio_idc value: " + e2);
                }
            }
            return C4109n.m17346p(str, "video/hevc", (String) null, -1, -1, i4, i5, -1.0f, Collections.singletonList(bArr), -1, f, (C3900a) null);
        }
        f = 1.0f;
        return C4109n.m17346p(str, "video/hevc", (String) null, -1, -1, i4, i5, -1.0f, Collections.singletonList(bArr), -1, f, (C3900a) null);
    }

    /* renamed from: i */
    private static void m16933i(C4275n nVar) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!nVar.mo13484d()) {
                    nVar.mo13487h();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        nVar.mo13486g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        nVar.mo13486g();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* renamed from: j */
    private static void m16934j(C4275n nVar) {
        int h = nVar.mo13487h();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < h; i2++) {
            if (i2 != 0) {
                z = nVar.mo13484d();
            }
            if (z) {
                nVar.mo13489k();
                nVar.mo13487h();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (nVar.mo13484d()) {
                        nVar.mo13489k();
                    }
                }
            } else {
                int h2 = nVar.mo13487h();
                int h3 = nVar.mo13487h();
                int i4 = h2 + h3;
                for (int i5 = 0; i5 < h2; i5++) {
                    nVar.mo13487h();
                    nVar.mo13489k();
                }
                for (int i6 = 0; i6 < h3; i6++) {
                    nVar.mo13487h();
                    nVar.mo13489k();
                }
                i = i4;
            }
        }
    }

    /* renamed from: k */
    private void m16935k(long j, int i, int i2, long j2) {
        if (this.f12585e) {
            this.f12584d.mo12871e(j, i, i2, j2);
        } else {
            this.f12587g.mo12876e(i2);
            this.f12588h.mo12876e(i2);
            this.f12589i.mo12876e(i2);
        }
        this.f12590j.mo12876e(i2);
        this.f12591k.mo12876e(i2);
    }

    /* renamed from: a */
    public void mo12847a() {
        C4270k.m18118a(this.f12586f);
        this.f12587g.mo12875d();
        this.f12588h.mo12875d();
        this.f12589i.mo12875d();
        this.f12590j.mo12875d();
        this.f12591k.mo12875d();
        this.f12584d.mo12870d();
        this.f12592l = 0;
    }

    /* renamed from: c */
    public void mo12848c(C4274m mVar) {
        C4274m mVar2 = mVar;
        while (mVar.mo13456a() > 0) {
            int c = mVar.mo13458c();
            int d = mVar.mo13459d();
            byte[] bArr = mVar2.f13643a;
            this.f12592l += (long) mVar.mo13456a();
            this.f12583c.mo12734a(mVar2, mVar.mo13456a());
            while (true) {
                if (c < d) {
                    int c2 = C4270k.m18120c(bArr, c, d, this.f12586f);
                    if (c2 == d) {
                        m16931g(bArr, c, d);
                        return;
                    }
                    int e = C4270k.m18122e(bArr, c2);
                    int i = c2 - c;
                    if (i > 0) {
                        m16931g(bArr, c, c2);
                    }
                    int i2 = d - c2;
                    long j = this.f12592l - ((long) i2);
                    int i3 = i < 0 ? -i : 0;
                    long j2 = j;
                    int i4 = i2;
                    m16930b(j2, i4, i3, this.f12593m);
                    m16935k(j2, i4, e, this.f12593m);
                    c = c2 + 3;
                }
            }
        }
    }

    /* renamed from: d */
    public void mo12849d(long j, boolean z) {
        this.f12593m = j;
    }

    /* renamed from: e */
    public void mo12850e() {
    }

    /* renamed from: f */
    public void mo12851f(C3917g gVar, C4031w.C4035d dVar) {
        dVar.mo12886a();
        this.f12582b = dVar.mo12887b();
        C3927n m = gVar.mo12745m(dVar.mo12888c(), 2);
        this.f12583c = m;
        this.f12584d = new C4016a(m);
        this.f12581a.mo12885b(gVar, dVar);
    }
}
