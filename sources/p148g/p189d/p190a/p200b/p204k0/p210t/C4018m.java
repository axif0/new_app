package p148g.p189d.p190a.p200b.p204k0.p210t;

import android.util.Pair;
import java.util.Collections;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4262c;
import p148g.p189d.p190a.p200b.p230r0.C4273l;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.t.m */
public final class C4018m implements C4008h {

    /* renamed from: a */
    private final String f12614a;

    /* renamed from: b */
    private final C4274m f12615b;

    /* renamed from: c */
    private final C4273l f12616c;

    /* renamed from: d */
    private C3927n f12617d;

    /* renamed from: e */
    private C4109n f12618e;

    /* renamed from: f */
    private String f12619f;

    /* renamed from: g */
    private int f12620g;

    /* renamed from: h */
    private int f12621h;

    /* renamed from: i */
    private int f12622i;

    /* renamed from: j */
    private int f12623j;

    /* renamed from: k */
    private long f12624k;

    /* renamed from: l */
    private boolean f12625l;

    /* renamed from: m */
    private int f12626m;

    /* renamed from: n */
    private int f12627n;

    /* renamed from: o */
    private int f12628o;

    /* renamed from: p */
    private boolean f12629p;

    /* renamed from: q */
    private long f12630q;

    /* renamed from: r */
    private int f12631r;

    /* renamed from: s */
    private long f12632s;

    /* renamed from: t */
    private int f12633t;

    public C4018m(String str) {
        this.f12614a = str;
        C4274m mVar = new C4274m(1024);
        this.f12615b = mVar;
        this.f12616c = new C4273l(mVar.f13643a);
    }

    /* renamed from: b */
    private static long m16951b(C4273l lVar) {
        return (long) lVar.mo13436h((lVar.mo13436h(2) + 1) * 8);
    }

    /* renamed from: g */
    private void m16952g(C4273l lVar) throws C4313u {
        if (!lVar.mo13435g()) {
            this.f12625l = true;
            m16957l(lVar);
        } else if (!this.f12625l) {
            return;
        }
        if (this.f12626m != 0) {
            throw new C4313u();
        } else if (this.f12627n == 0) {
            m16956k(lVar, m16955j(lVar));
            if (this.f12629p) {
                lVar.mo13443o((int) this.f12630q);
            }
        } else {
            throw new C4313u();
        }
    }

    /* renamed from: h */
    private int m16953h(C4273l lVar) throws C4313u {
        int b = lVar.mo13430b();
        Pair<Integer, Integer> e = C4262c.m18083e(lVar, true);
        this.f12631r = ((Integer) e.first).intValue();
        this.f12633t = ((Integer) e.second).intValue();
        return b - lVar.mo13430b();
    }

    /* renamed from: i */
    private void m16954i(C4273l lVar) {
        int i;
        int h = lVar.mo13436h(3);
        this.f12628o = h;
        if (h == 0) {
            i = 8;
        } else if (h == 1) {
            i = 9;
        } else if (h == 3 || h == 4 || h == 5) {
            lVar.mo13443o(6);
            return;
        } else if (h == 6 || h == 7) {
            lVar.mo13443o(1);
            return;
        } else {
            return;
        }
        lVar.mo13443o(i);
    }

    /* renamed from: j */
    private int m16955j(C4273l lVar) throws C4313u {
        int h;
        if (this.f12628o == 0) {
            int i = 0;
            do {
                h = lVar.mo13436h(8);
                i += h;
            } while (h == 255);
            return i;
        }
        throw new C4313u();
    }

    /* renamed from: k */
    private void m16956k(C4273l lVar, int i) {
        int e = lVar.mo13433e();
        if ((e & 7) == 0) {
            this.f12615b.mo13454J(e >> 3);
        } else {
            lVar.mo13437i(this.f12615b.f13643a, 0, i * 8);
            this.f12615b.mo13454J(0);
        }
        this.f12617d.mo12734a(this.f12615b, i);
        this.f12617d.mo12736c(this.f12624k, 1, i, 0, (C3927n.C3928a) null);
        this.f12624k += this.f12632s;
    }

    /* renamed from: l */
    private void m16957l(C4273l lVar) throws C4313u {
        boolean g;
        C4273l lVar2 = lVar;
        int h = lVar2.mo13436h(1);
        int h2 = h == 1 ? lVar2.mo13436h(1) : 0;
        this.f12626m = h2;
        if (h2 == 0) {
            if (h == 1) {
                m16951b(lVar);
            }
            if (lVar.mo13435g()) {
                this.f12627n = lVar2.mo13436h(6);
                int h3 = lVar2.mo13436h(4);
                int h4 = lVar2.mo13436h(3);
                if (h3 == 0 && h4 == 0) {
                    if (h == 0) {
                        int e = lVar.mo13433e();
                        int h5 = m16953h(lVar);
                        lVar2.mo13441m(e);
                        byte[] bArr = new byte[((h5 + 7) / 8)];
                        lVar2.mo13437i(bArr, 0, h5);
                        C4109n h6 = C4109n.m17338h(this.f12619f, "audio/mp4a-latm", (String) null, -1, -1, this.f12633t, this.f12631r, Collections.singletonList(bArr), (C3900a) null, 0, this.f12614a);
                        if (!h6.equals(this.f12618e)) {
                            this.f12618e = h6;
                            this.f12632s = 1024000000 / ((long) h6.f12962x);
                            this.f12617d.mo12737d(h6);
                        }
                    } else {
                        lVar2.mo13443o(((int) m16951b(lVar)) - m16953h(lVar));
                    }
                    m16954i(lVar);
                    boolean g2 = lVar.mo13435g();
                    this.f12629p = g2;
                    this.f12630q = 0;
                    if (g2) {
                        if (h == 1) {
                            this.f12630q = m16951b(lVar);
                        } else {
                            do {
                                g = lVar.mo13435g();
                                this.f12630q = (this.f12630q << 8) + ((long) lVar2.mo13436h(8));
                            } while (g);
                        }
                    }
                    if (lVar.mo13435g()) {
                        lVar2.mo13443o(8);
                        return;
                    }
                    return;
                }
                throw new C4313u();
            }
            throw new C4313u();
        }
        throw new C4313u();
    }

    /* renamed from: m */
    private void m16958m(int i) {
        this.f12615b.mo13451G(i);
        this.f12616c.mo13439k(this.f12615b.f13643a);
    }

    /* renamed from: a */
    public void mo12847a() {
        this.f12620g = 0;
        this.f12625l = false;
    }

    /* renamed from: c */
    public void mo12848c(C4274m mVar) throws C4313u {
        while (mVar.mo13456a() > 0) {
            int i = this.f12620g;
            if (i != 0) {
                if (i == 1) {
                    int x = mVar.mo13479x();
                    if ((x & 224) == 224) {
                        this.f12623j = x;
                        this.f12620g = 2;
                    } else if (x == 86) {
                    }
                } else if (i == 2) {
                    int x2 = ((this.f12623j & -225) << 8) | mVar.mo13479x();
                    this.f12622i = x2;
                    if (x2 > this.f12615b.f13643a.length) {
                        m16958m(x2);
                    }
                    this.f12621h = 0;
                    this.f12620g = 3;
                } else if (i == 3) {
                    int min = Math.min(mVar.mo13456a(), this.f12622i - this.f12621h);
                    mVar.mo13462g(this.f12616c.f13639a, this.f12621h, min);
                    int i2 = this.f12621h + min;
                    this.f12621h = i2;
                    if (i2 == this.f12622i) {
                        this.f12616c.mo13441m(0);
                        m16952g(this.f12616c);
                    }
                }
                this.f12620g = 0;
            } else if (mVar.mo13479x() == 86) {
                this.f12620g = 1;
            }
        }
    }

    /* renamed from: d */
    public void mo12849d(long j, boolean z) {
        this.f12624k = j;
    }

    /* renamed from: e */
    public void mo12850e() {
    }

    /* renamed from: f */
    public void mo12851f(C3917g gVar, C4031w.C4035d dVar) {
        dVar.mo12886a();
        this.f12617d = gVar.mo12745m(dVar.mo12888c(), 1);
        this.f12619f = dVar.mo12887b();
    }
}
