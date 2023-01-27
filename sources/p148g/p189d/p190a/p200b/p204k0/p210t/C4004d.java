package p148g.p189d.p190a.p200b.p204k0.p210t;

import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3914d;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4262c;
import p148g.p189d.p190a.p200b.p230r0.C4273l;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.t.d */
public final class C4004d implements C4008h {

    /* renamed from: r */
    private static final byte[] f12477r = {73, 68, 51};

    /* renamed from: a */
    private final boolean f12478a;

    /* renamed from: b */
    private final C4273l f12479b;

    /* renamed from: c */
    private final C4274m f12480c;

    /* renamed from: d */
    private final String f12481d;

    /* renamed from: e */
    private String f12482e;

    /* renamed from: f */
    private C3927n f12483f;

    /* renamed from: g */
    private C3927n f12484g;

    /* renamed from: h */
    private int f12485h;

    /* renamed from: i */
    private int f12486i;

    /* renamed from: j */
    private int f12487j;

    /* renamed from: k */
    private boolean f12488k;

    /* renamed from: l */
    private boolean f12489l;

    /* renamed from: m */
    private long f12490m;

    /* renamed from: n */
    private int f12491n;

    /* renamed from: o */
    private long f12492o;

    /* renamed from: p */
    private C3927n f12493p;

    /* renamed from: q */
    private long f12494q;

    public C4004d(boolean z) {
        this(z, (String) null);
    }

    public C4004d(boolean z, String str) {
        this.f12479b = new C4273l(new byte[7]);
        this.f12480c = new C4274m(Arrays.copyOf(f12477r, 10));
        m16867k();
        this.f12478a = z;
        this.f12481d = str;
    }

    /* renamed from: b */
    private boolean m16862b(C4274m mVar, byte[] bArr, int i) {
        int min = Math.min(mVar.mo13456a(), i - this.f12486i);
        mVar.mo13462g(bArr, this.f12486i, min);
        int i2 = this.f12486i + min;
        this.f12486i = i2;
        return i2 == i;
    }

    /* renamed from: g */
    private void m16863g(C4274m mVar) {
        int i;
        byte[] bArr = mVar.f13643a;
        int c = mVar.mo13458c();
        int d = mVar.mo13459d();
        while (c < d) {
            int i2 = c + 1;
            byte b = bArr[c] & 255;
            if (this.f12487j != 512 || b < 240 || b == 255) {
                int i3 = this.f12487j;
                byte b2 = b | i3;
                if (b2 != 329) {
                    if (b2 == 511) {
                        this.f12487j = 512;
                    } else if (b2 == 836) {
                        i = 1024;
                    } else if (b2 == 1075) {
                        m16869m();
                    } else if (i3 != 256) {
                        this.f12487j = 256;
                        i2--;
                    }
                    c = i2;
                } else {
                    i = 768;
                }
                this.f12487j = i;
                c = i2;
            } else {
                boolean z = true;
                if ((b & 1) != 0) {
                    z = false;
                }
                this.f12488k = z;
                m16868l();
            }
            mVar.mo13454J(i2);
            return;
        }
        mVar.mo13454J(c);
    }

    /* renamed from: h */
    private void m16864h() throws C4313u {
        this.f12479b.mo13441m(0);
        if (!this.f12489l) {
            int h = this.f12479b.mo13436h(2) + 1;
            if (h != 2) {
                Log.w("AdtsReader", "Detected audio object type: " + h + ", but assuming AAC LC.");
                h = 2;
            }
            int h2 = this.f12479b.mo13436h(4);
            this.f12479b.mo13443o(1);
            byte[] a = C4262c.m18079a(h, h2, this.f12479b.mo13436h(3));
            Pair<Integer, Integer> f = C4262c.m18084f(a);
            C4109n h3 = C4109n.m17338h(this.f12482e, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) f.second).intValue(), ((Integer) f.first).intValue(), Collections.singletonList(a), (C3900a) null, 0, this.f12481d);
            this.f12490m = 1024000000 / ((long) h3.f12962x);
            this.f12483f.mo12737d(h3);
            this.f12489l = true;
        } else {
            this.f12479b.mo13443o(10);
        }
        this.f12479b.mo13443o(4);
        int h4 = (this.f12479b.mo13436h(13) - 2) - 5;
        if (this.f12488k) {
            h4 -= 2;
        }
        m16870n(this.f12483f, this.f12490m, 0, h4);
    }

    /* renamed from: i */
    private void m16865i() {
        this.f12484g.mo12734a(this.f12480c, 10);
        this.f12480c.mo13454J(6);
        m16870n(this.f12484g, 0, 10, this.f12480c.mo13478w() + 10);
    }

    /* renamed from: j */
    private void m16866j(C4274m mVar) {
        int min = Math.min(mVar.mo13456a(), this.f12491n - this.f12486i);
        this.f12493p.mo12734a(mVar, min);
        int i = this.f12486i + min;
        this.f12486i = i;
        int i2 = this.f12491n;
        if (i == i2) {
            this.f12493p.mo12736c(this.f12492o, 1, i2, 0, (C3927n.C3928a) null);
            this.f12492o += this.f12494q;
            m16867k();
        }
    }

    /* renamed from: k */
    private void m16867k() {
        this.f12485h = 0;
        this.f12486i = 0;
        this.f12487j = 256;
    }

    /* renamed from: l */
    private void m16868l() {
        this.f12485h = 2;
        this.f12486i = 0;
    }

    /* renamed from: m */
    private void m16869m() {
        this.f12485h = 1;
        this.f12486i = f12477r.length;
        this.f12491n = 0;
        this.f12480c.mo13454J(0);
    }

    /* renamed from: n */
    private void m16870n(C3927n nVar, long j, int i, int i2) {
        this.f12485h = 3;
        this.f12486i = i;
        this.f12493p = nVar;
        this.f12494q = j;
        this.f12491n = i2;
    }

    /* renamed from: a */
    public void mo12847a() {
        m16867k();
    }

    /* renamed from: c */
    public void mo12848c(C4274m mVar) throws C4313u {
        while (mVar.mo13456a() > 0) {
            int i = this.f12485h;
            if (i == 0) {
                m16863g(mVar);
            } else if (i != 1) {
                if (i == 2) {
                    if (m16862b(mVar, this.f12479b.f13639a, this.f12488k ? 7 : 5)) {
                        m16864h();
                    }
                } else if (i == 3) {
                    m16866j(mVar);
                }
            } else if (m16862b(mVar, this.f12480c.f13643a, 10)) {
                m16865i();
            }
        }
    }

    /* renamed from: d */
    public void mo12849d(long j, boolean z) {
        this.f12492o = j;
    }

    /* renamed from: e */
    public void mo12850e() {
    }

    /* renamed from: f */
    public void mo12851f(C3917g gVar, C4031w.C4035d dVar) {
        dVar.mo12886a();
        this.f12482e = dVar.mo12887b();
        this.f12483f = gVar.mo12745m(dVar.mo12888c(), 1);
        if (this.f12478a) {
            dVar.mo12886a();
            C3927n m = gVar.mo12745m(dVar.mo12888c(), 4);
            this.f12484g = m;
            m.mo12737d(C4109n.m17341k(dVar.mo12887b(), "application/id3", (String) null, -1, (C3900a) null));
            return;
        }
        this.f12484g = new C3914d();
    }
}
