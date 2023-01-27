package p148g.p189d.p190a.p200b.p204k0.p210t;

import java.util.List;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3921j;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.t.n */
public final class C4019n implements C4008h {

    /* renamed from: a */
    private final C4274m f12634a;

    /* renamed from: b */
    private final C3921j f12635b;

    /* renamed from: c */
    private final String f12636c;

    /* renamed from: d */
    private String f12637d;

    /* renamed from: e */
    private C3927n f12638e;

    /* renamed from: f */
    private int f12639f;

    /* renamed from: g */
    private int f12640g;

    /* renamed from: h */
    private boolean f12641h;

    /* renamed from: i */
    private boolean f12642i;

    /* renamed from: j */
    private long f12643j;

    /* renamed from: k */
    private int f12644k;

    /* renamed from: l */
    private long f12645l;

    public C4019n() {
        this((String) null);
    }

    public C4019n(String str) {
        this.f12639f = 0;
        C4274m mVar = new C4274m(4);
        this.f12634a = mVar;
        mVar.f13643a[0] = -1;
        this.f12635b = new C3921j();
        this.f12636c = str;
    }

    /* renamed from: b */
    private void m16964b(C4274m mVar) {
        byte[] bArr = mVar.f13643a;
        int d = mVar.mo13459d();
        for (int c = mVar.mo13458c(); c < d; c++) {
            boolean z = (bArr[c] & 255) == 255;
            boolean z2 = this.f12642i && (bArr[c] & 224) == 224;
            this.f12642i = z;
            if (z2) {
                mVar.mo13454J(c + 1);
                this.f12642i = false;
                this.f12634a.f13643a[1] = bArr[c];
                this.f12640g = 2;
                this.f12639f = 1;
                return;
            }
        }
        mVar.mo13454J(d);
    }

    /* renamed from: g */
    private void m16965g(C4274m mVar) {
        int min = Math.min(mVar.mo13456a(), this.f12644k - this.f12640g);
        this.f12638e.mo12734a(mVar, min);
        int i = this.f12640g + min;
        this.f12640g = i;
        int i2 = this.f12644k;
        if (i >= i2) {
            this.f12638e.mo12736c(this.f12645l, 1, i2, 0, (C3927n.C3928a) null);
            this.f12645l += this.f12643j;
            this.f12640g = 0;
            this.f12639f = 0;
        }
    }

    /* renamed from: h */
    private void m16966h(C4274m mVar) {
        int min = Math.min(mVar.mo13456a(), 4 - this.f12640g);
        mVar.mo13462g(this.f12634a.f13643a, this.f12640g, min);
        int i = this.f12640g + min;
        this.f12640g = i;
        if (i >= 4) {
            this.f12634a.mo13454J(0);
            if (!C3921j.m16470b(this.f12634a.mo13464i(), this.f12635b)) {
                this.f12640g = 0;
                this.f12639f = 1;
                return;
            }
            C3921j jVar = this.f12635b;
            this.f12644k = jVar.f11904c;
            if (!this.f12641h) {
                int i2 = jVar.f11905d;
                this.f12643j = (((long) jVar.f11908g) * 1000000) / ((long) i2);
                this.f12638e.mo12737d(C4109n.m17338h(this.f12637d, jVar.f11903b, (String) null, -1, 4096, jVar.f11906e, i2, (List<byte[]>) null, (C3900a) null, 0, this.f12636c));
                this.f12641h = true;
            }
            this.f12634a.mo13454J(0);
            this.f12638e.mo12734a(this.f12634a, 4);
            this.f12639f = 2;
        }
    }

    /* renamed from: a */
    public void mo12847a() {
        this.f12639f = 0;
        this.f12640g = 0;
        this.f12642i = false;
    }

    /* renamed from: c */
    public void mo12848c(C4274m mVar) {
        while (mVar.mo13456a() > 0) {
            int i = this.f12639f;
            if (i == 0) {
                m16964b(mVar);
            } else if (i == 1) {
                m16966h(mVar);
            } else if (i == 2) {
                m16965g(mVar);
            }
        }
    }

    /* renamed from: d */
    public void mo12849d(long j, boolean z) {
        this.f12645l = j;
    }

    /* renamed from: e */
    public void mo12850e() {
    }

    /* renamed from: f */
    public void mo12851f(C3917g gVar, C4031w.C4035d dVar) {
        dVar.mo12886a();
        this.f12637d = dVar.mo12887b();
        this.f12638e = gVar.mo12745m(dVar.mo12888c(), 1);
    }
}
