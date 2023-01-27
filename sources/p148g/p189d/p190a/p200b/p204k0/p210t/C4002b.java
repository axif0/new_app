package p148g.p189d.p190a.p200b.p204k0.p210t;

import java.util.List;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p201h0.C3849a;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4273l;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.t.b */
public final class C4002b implements C4008h {

    /* renamed from: a */
    private final C4273l f12460a;

    /* renamed from: b */
    private final C4274m f12461b;

    /* renamed from: c */
    private final String f12462c;

    /* renamed from: d */
    private String f12463d;

    /* renamed from: e */
    private C3927n f12464e;

    /* renamed from: f */
    private int f12465f;

    /* renamed from: g */
    private int f12466g;

    /* renamed from: h */
    private boolean f12467h;

    /* renamed from: i */
    private long f12468i;

    /* renamed from: j */
    private C4109n f12469j;

    /* renamed from: k */
    private int f12470k;

    /* renamed from: l */
    private long f12471l;

    public C4002b() {
        this((String) null);
    }

    public C4002b(String str) {
        C4273l lVar = new C4273l(new byte[128]);
        this.f12460a = lVar;
        this.f12461b = new C4274m(lVar.f13639a);
        this.f12465f = 0;
        this.f12462c = str;
    }

    /* renamed from: b */
    private boolean m16849b(C4274m mVar, byte[] bArr, int i) {
        int min = Math.min(mVar.mo13456a(), i - this.f12466g);
        mVar.mo13462g(bArr, this.f12466g, min);
        int i2 = this.f12466g + min;
        this.f12466g = i2;
        return i2 == i;
    }

    /* renamed from: g */
    private void m16850g() {
        this.f12460a.mo13441m(0);
        C3849a.C3851b d = C3849a.m16080d(this.f12460a);
        C4109n nVar = this.f12469j;
        if (!(nVar != null && d.f11595c == nVar.f12961w && d.f11594b == nVar.f12962x && d.f11593a == nVar.f12949k)) {
            C4109n h = C4109n.m17338h(this.f12463d, d.f11593a, (String) null, -1, -1, d.f11595c, d.f11594b, (List<byte[]>) null, (C3900a) null, 0, this.f12462c);
            this.f12469j = h;
            this.f12464e.mo12737d(h);
        }
        this.f12470k = d.f11596d;
        this.f12468i = (((long) d.f11597e) * 1000000) / ((long) this.f12469j.f12962x);
    }

    /* renamed from: h */
    private boolean m16851h(C4274m mVar) {
        while (true) {
            boolean z = false;
            if (mVar.mo13456a() <= 0) {
                return false;
            }
            if (this.f12467h) {
                int x = mVar.mo13479x();
                if (x == 119) {
                    this.f12467h = false;
                    return true;
                } else if (x != 11) {
                    this.f12467h = z;
                }
            } else if (mVar.mo13479x() != 11) {
                this.f12467h = z;
            }
            z = true;
            this.f12467h = z;
        }
    }

    /* renamed from: a */
    public void mo12847a() {
        this.f12465f = 0;
        this.f12466g = 0;
        this.f12467h = false;
    }

    /* renamed from: c */
    public void mo12848c(C4274m mVar) {
        while (mVar.mo13456a() > 0) {
            int i = this.f12465f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(mVar.mo13456a(), this.f12470k - this.f12466g);
                        this.f12464e.mo12734a(mVar, min);
                        int i2 = this.f12466g + min;
                        this.f12466g = i2;
                        int i3 = this.f12470k;
                        if (i2 == i3) {
                            this.f12464e.mo12736c(this.f12471l, 1, i3, 0, (C3927n.C3928a) null);
                            this.f12471l += this.f12468i;
                            this.f12465f = 0;
                        }
                    }
                } else if (m16849b(mVar, this.f12461b.f13643a, 128)) {
                    m16850g();
                    this.f12461b.mo13454J(0);
                    this.f12464e.mo12734a(this.f12461b, 128);
                    this.f12465f = 2;
                }
            } else if (m16851h(mVar)) {
                this.f12465f = 1;
                byte[] bArr = this.f12461b.f13643a;
                bArr[0] = 11;
                bArr[1] = 119;
                this.f12466g = 2;
            }
        }
    }

    /* renamed from: d */
    public void mo12849d(long j, boolean z) {
        this.f12471l = j;
    }

    /* renamed from: e */
    public void mo12850e() {
    }

    /* renamed from: f */
    public void mo12851f(C3917g gVar, C4031w.C4035d dVar) {
        dVar.mo12886a();
        this.f12463d = dVar.mo12887b();
        this.f12464e = gVar.mo12745m(dVar.mo12888c(), 1);
    }
}
