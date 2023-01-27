package p148g.p189d.p190a.p200b.p204k0.p209s;

import java.io.IOException;
import java.util.ArrayList;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.p209s.C3989h;
import p148g.p189d.p190a.p200b.p204k0.p209s.C3996k;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.s.j */
final class C3994j extends C3989h {

    /* renamed from: n */
    private C3995a f12439n;

    /* renamed from: o */
    private int f12440o;

    /* renamed from: p */
    private boolean f12441p;

    /* renamed from: q */
    private C3996k.C4000d f12442q;

    /* renamed from: r */
    private C3996k.C3998b f12443r;

    /* renamed from: g.d.a.b.k0.s.j$a */
    static final class C3995a {

        /* renamed from: a */
        public final C3996k.C4000d f12444a;

        /* renamed from: b */
        public final byte[] f12445b;

        /* renamed from: c */
        public final C3996k.C3999c[] f12446c;

        /* renamed from: d */
        public final int f12447d;

        public C3995a(C3996k.C4000d dVar, C3996k.C3998b bVar, byte[] bArr, C3996k.C3999c[] cVarArr, int i) {
            this.f12444a = dVar;
            this.f12445b = bArr;
            this.f12446c = cVarArr;
            this.f12447d = i;
        }
    }

    C3994j() {
    }

    /* renamed from: l */
    static void m16824l(C4274m mVar, long j) {
        mVar.mo13453I(mVar.mo13459d() + 4);
        mVar.f13643a[mVar.mo13459d() - 4] = (byte) ((int) (j & 255));
        mVar.f13643a[mVar.mo13459d() - 3] = (byte) ((int) ((j >>> 8) & 255));
        mVar.f13643a[mVar.mo13459d() - 2] = (byte) ((int) ((j >>> 16) & 255));
        mVar.f13643a[mVar.mo13459d() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    /* renamed from: m */
    private static int m16825m(byte b, C3995a aVar) {
        return !aVar.f12446c[m16826n(b, aVar.f12447d, 1)].f12448a ? aVar.f12444a.f12452d : aVar.f12444a.f12453e;
    }

    /* renamed from: n */
    static int m16826n(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    /* renamed from: p */
    public static boolean m16827p(C4274m mVar) {
        try {
            return C3996k.m16843k(1, mVar, true);
        } catch (C4313u unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo12839d(long j) {
        super.mo12839d(j);
        int i = 0;
        this.f12441p = j != 0;
        C3996k.C4000d dVar = this.f12442q;
        if (dVar != null) {
            i = dVar.f12452d;
        }
        this.f12440o = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo12824e(C4274m mVar) {
        byte[] bArr = mVar.f13643a;
        int i = 0;
        if ((bArr[0] & 1) == 1) {
            return -1;
        }
        int m = m16825m(bArr[0], this.f12439n);
        if (this.f12441p) {
            i = (this.f12440o + m) / 4;
        }
        long j = (long) i;
        m16824l(mVar, j);
        this.f12441p = true;
        this.f12440o = m;
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo12825h(C4274m mVar, long j, C3989h.C3991b bVar) throws IOException, InterruptedException {
        if (this.f12439n != null) {
            return false;
        }
        C3995a o = mo12846o(mVar);
        this.f12439n = o;
        if (o == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f12439n.f12444a.f12454f);
        arrayList.add(this.f12439n.f12445b);
        C3996k.C4000d dVar = this.f12439n.f12444a;
        bVar.f12433a = C4109n.m17338h((String) null, "audio/vorbis", (String) null, dVar.f12451c, -1, dVar.f12449a, (int) dVar.f12450b, arrayList, (C3900a) null, 0, (String) null);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo12826j(boolean z) {
        super.mo12826j(z);
        if (z) {
            this.f12439n = null;
            this.f12442q = null;
            this.f12443r = null;
        }
        this.f12440o = 0;
        this.f12441p = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C3995a mo12846o(C4274m mVar) throws IOException {
        if (this.f12442q == null) {
            this.f12442q = C3996k.m16841i(mVar);
            return null;
        } else if (this.f12443r == null) {
            this.f12443r = C3996k.m16840h(mVar);
            return null;
        } else {
            byte[] bArr = new byte[mVar.mo13459d()];
            System.arraycopy(mVar.f13643a, 0, bArr, 0, mVar.mo13459d());
            C3996k.C3999c[] j = C3996k.m16842j(mVar, this.f12442q.f12449a);
            return new C3995a(this.f12442q, this.f12443r, bArr, j, C3996k.m16833a(j.length - 1));
        }
    }
}
