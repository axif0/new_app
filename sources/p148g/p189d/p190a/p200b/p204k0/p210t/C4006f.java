package p148g.p189d.p190a.p200b.p204k0.p210t;

import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p201h0.C3879i;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.t.f */
public final class C4006f implements C4008h {

    /* renamed from: a */
    private final C4274m f12497a = new C4274m(new byte[18]);

    /* renamed from: b */
    private final String f12498b;

    /* renamed from: c */
    private String f12499c;

    /* renamed from: d */
    private C3927n f12500d;

    /* renamed from: e */
    private int f12501e = 0;

    /* renamed from: f */
    private int f12502f;

    /* renamed from: g */
    private int f12503g;

    /* renamed from: h */
    private long f12504h;

    /* renamed from: i */
    private C4109n f12505i;

    /* renamed from: j */
    private int f12506j;

    /* renamed from: k */
    private long f12507k;

    public C4006f(String str) {
        this.f12498b = str;
    }

    /* renamed from: b */
    private boolean m16880b(C4274m mVar, byte[] bArr, int i) {
        int min = Math.min(mVar.mo13456a(), i - this.f12502f);
        mVar.mo13462g(bArr, this.f12502f, min);
        int i2 = this.f12502f + min;
        this.f12502f = i2;
        return i2 == i;
    }

    /* renamed from: g */
    private void m16881g() {
        byte[] bArr = this.f12497a.f13643a;
        if (this.f12505i == null) {
            C4109n g = C3879i.m16218g(bArr, this.f12499c, this.f12498b, (C3900a) null);
            this.f12505i = g;
            this.f12500d.mo12737d(g);
        }
        this.f12506j = C3879i.m16212a(bArr);
        this.f12504h = (long) ((int) ((((long) C3879i.m16217f(bArr)) * 1000000) / ((long) this.f12505i.f12962x)));
    }

    /* renamed from: h */
    private boolean m16882h(C4274m mVar) {
        while (mVar.mo13456a() > 0) {
            int i = this.f12503g << 8;
            this.f12503g = i;
            int x = i | mVar.mo13479x();
            this.f12503g = x;
            if (C3879i.m16215d(x)) {
                byte[] bArr = this.f12497a.f13643a;
                int i2 = this.f12503g;
                bArr[0] = (byte) ((i2 >> 24) & 255);
                bArr[1] = (byte) ((i2 >> 16) & 255);
                bArr[2] = (byte) ((i2 >> 8) & 255);
                bArr[3] = (byte) (i2 & 255);
                this.f12502f = 4;
                this.f12503g = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo12847a() {
        this.f12501e = 0;
        this.f12502f = 0;
        this.f12503g = 0;
    }

    /* renamed from: c */
    public void mo12848c(C4274m mVar) {
        while (mVar.mo13456a() > 0) {
            int i = this.f12501e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(mVar.mo13456a(), this.f12506j - this.f12502f);
                        this.f12500d.mo12734a(mVar, min);
                        int i2 = this.f12502f + min;
                        this.f12502f = i2;
                        int i3 = this.f12506j;
                        if (i2 == i3) {
                            this.f12500d.mo12736c(this.f12507k, 1, i3, 0, (C3927n.C3928a) null);
                            this.f12507k += this.f12504h;
                            this.f12501e = 0;
                        }
                    }
                } else if (m16880b(mVar, this.f12497a.f13643a, 18)) {
                    m16881g();
                    this.f12497a.mo13454J(0);
                    this.f12500d.mo12734a(this.f12497a, 18);
                    this.f12501e = 2;
                }
            } else if (m16882h(mVar)) {
                this.f12501e = 1;
            }
        }
    }

    /* renamed from: d */
    public void mo12849d(long j, boolean z) {
        this.f12507k = j;
    }

    /* renamed from: e */
    public void mo12850e() {
    }

    /* renamed from: f */
    public void mo12851f(C3917g gVar, C4031w.C4035d dVar) {
        dVar.mo12886a();
        this.f12499c = dVar.mo12887b();
        this.f12500d = gVar.mo12745m(dVar.mo12888c(), 1);
    }
}
