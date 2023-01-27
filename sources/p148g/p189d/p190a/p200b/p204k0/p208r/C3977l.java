package p148g.p189d.p190a.p200b.p204k0.p208r;

import java.io.IOException;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.r.l */
final class C3977l {

    /* renamed from: a */
    public C3962c f12354a;

    /* renamed from: b */
    public long f12355b;

    /* renamed from: c */
    public long f12356c;

    /* renamed from: d */
    public long f12357d;

    /* renamed from: e */
    public int f12358e;

    /* renamed from: f */
    public int f12359f;

    /* renamed from: g */
    public long[] f12360g;

    /* renamed from: h */
    public int[] f12361h;

    /* renamed from: i */
    public int[] f12362i;

    /* renamed from: j */
    public int[] f12363j;

    /* renamed from: k */
    public long[] f12364k;

    /* renamed from: l */
    public boolean[] f12365l;

    /* renamed from: m */
    public boolean f12366m;

    /* renamed from: n */
    public boolean[] f12367n;

    /* renamed from: o */
    public C3976k f12368o;

    /* renamed from: p */
    public int f12369p;

    /* renamed from: q */
    public C4274m f12370q;

    /* renamed from: r */
    public boolean f12371r;

    /* renamed from: s */
    public long f12372s;

    C3977l() {
    }

    /* renamed from: a */
    public void mo12806a(C3916f fVar) throws IOException, InterruptedException {
        fVar.readFully(this.f12370q.f13643a, 0, this.f12369p);
        this.f12370q.mo13454J(0);
        this.f12371r = false;
    }

    /* renamed from: b */
    public void mo12807b(C4274m mVar) {
        mVar.mo13462g(this.f12370q.f13643a, 0, this.f12369p);
        this.f12370q.mo13454J(0);
        this.f12371r = false;
    }

    /* renamed from: c */
    public long mo12808c(int i) {
        return this.f12364k[i] + ((long) this.f12363j[i]);
    }

    /* renamed from: d */
    public void mo12809d(int i) {
        C4274m mVar = this.f12370q;
        if (mVar == null || mVar.mo13459d() < i) {
            this.f12370q = new C4274m(i);
        }
        this.f12369p = i;
        this.f12366m = true;
        this.f12371r = true;
    }

    /* renamed from: e */
    public void mo12810e(int i, int i2) {
        this.f12358e = i;
        this.f12359f = i2;
        int[] iArr = this.f12361h;
        if (iArr == null || iArr.length < i) {
            this.f12360g = new long[i];
            this.f12361h = new int[i];
        }
        int[] iArr2 = this.f12362i;
        if (iArr2 == null || iArr2.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f12362i = new int[i3];
            this.f12363j = new int[i3];
            this.f12364k = new long[i3];
            this.f12365l = new boolean[i3];
            this.f12367n = new boolean[i3];
        }
    }

    /* renamed from: f */
    public void mo12811f() {
        this.f12358e = 0;
        this.f12372s = 0;
        this.f12366m = false;
        this.f12371r = false;
        this.f12368o = null;
    }
}
