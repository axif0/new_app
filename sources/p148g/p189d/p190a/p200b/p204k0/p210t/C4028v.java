package p148g.p189d.p190a.p200b.p204k0.p210t;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p204k0.C3915e;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3922k;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4273l;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4282u;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.t.v */
public final class C4028v implements C3915e {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final long f12689m = ((long) C4284w.m18249o("AC-3"));
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final long f12690n = ((long) C4284w.m18249o("EAC3"));
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final long f12691o = ((long) C4284w.m18249o("HEVC"));
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f12692a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<C4282u> f12693b;

    /* renamed from: c */
    private final C4274m f12694c;

    /* renamed from: d */
    private final SparseIntArray f12695d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4031w.C4034c f12696e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SparseArray<C4031w> f12697f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final SparseBooleanArray f12698g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3917g f12699h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f12700i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f12701j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C4031w f12702k;

    /* renamed from: l */
    private int f12703l;

    /* renamed from: g.d.a.b.k0.t.v$a */
    private class C4029a implements C4024r {

        /* renamed from: a */
        private final C4273l f12704a = new C4273l(new byte[4]);

        public C4029a() {
        }

        /* renamed from: b */
        public void mo12882b(C4282u uVar, C3917g gVar, C4031w.C4035d dVar) {
        }

        /* renamed from: c */
        public void mo12883c(C4274m mVar) {
            if (mVar.mo13479x() == 0) {
                mVar.mo13455K(7);
                int a = mVar.mo13456a() / 4;
                for (int i = 0; i < a; i++) {
                    mVar.mo13461f(this.f12704a, 4);
                    int h = this.f12704a.mo13436h(16);
                    this.f12704a.mo13443o(3);
                    if (h == 0) {
                        this.f12704a.mo13443o(13);
                    } else {
                        int h2 = this.f12704a.mo13436h(13);
                        C4028v.this.f12697f.put(h2, new C4025s(new C4030b(h2)));
                        C4028v.m17006j(C4028v.this);
                    }
                }
                if (C4028v.this.f12692a != 2) {
                    C4028v.this.f12697f.remove(0);
                }
            }
        }
    }

    /* renamed from: g.d.a.b.k0.t.v$b */
    private class C4030b implements C4024r {

        /* renamed from: a */
        private final C4273l f12706a = new C4273l(new byte[5]);

        /* renamed from: b */
        private final SparseArray<C4031w> f12707b = new SparseArray<>();

        /* renamed from: c */
        private final SparseIntArray f12708c = new SparseIntArray();

        /* renamed from: d */
        private final int f12709d;

        public C4030b(int i) {
            this.f12709d = i;
        }

        /* renamed from: a */
        private C4031w.C4033b m17026a(C4274m mVar, int i) {
            int c = mVar.mo13458c();
            int i2 = i + c;
            String str = null;
            ArrayList arrayList = null;
            int i3 = -1;
            while (mVar.mo13458c() < i2) {
                int x = mVar.mo13479x();
                int c2 = mVar.mo13458c() + mVar.mo13479x();
                if (x == 5) {
                    long z = mVar.mo13481z();
                    if (z != C4028v.f12689m) {
                        if (z != C4028v.f12690n) {
                            if (z == C4028v.f12691o) {
                                i3 = 36;
                            }
                            mVar.mo13455K(c2 - mVar.mo13458c());
                        }
                        i3 = 135;
                        mVar.mo13455K(c2 - mVar.mo13458c());
                    }
                } else if (x != 106) {
                    if (x != 122) {
                        if (x == 123) {
                            i3 = 138;
                        } else if (x == 10) {
                            str = mVar.mo13476u(3).trim();
                        } else if (x == 89) {
                            arrayList = new ArrayList();
                            while (mVar.mo13458c() < c2) {
                                String trim = mVar.mo13476u(3).trim();
                                int x2 = mVar.mo13479x();
                                byte[] bArr = new byte[4];
                                mVar.mo13462g(bArr, 0, 4);
                                arrayList.add(new C4031w.C4032a(trim, x2, bArr));
                            }
                            i3 = 89;
                        }
                        mVar.mo13455K(c2 - mVar.mo13458c());
                    }
                    i3 = 135;
                    mVar.mo13455K(c2 - mVar.mo13458c());
                }
                i3 = 129;
                mVar.mo13455K(c2 - mVar.mo13458c());
            }
            mVar.mo13454J(i2);
            return new C4031w.C4033b(i3, str, arrayList, Arrays.copyOfRange(mVar.f13643a, c, i2));
        }

        /* renamed from: b */
        public void mo12882b(C4282u uVar, C3917g gVar, C4031w.C4035d dVar) {
        }

        /* renamed from: c */
        public void mo12883c(C4274m mVar) {
            C4282u uVar;
            C4274m mVar2 = mVar;
            if (mVar.mo13479x() == 2) {
                int i = 0;
                if (C4028v.this.f12692a == 1 || C4028v.this.f12692a == 2 || C4028v.this.f12700i == 1) {
                    uVar = (C4282u) C4028v.this.f12693b.get(0);
                } else {
                    uVar = new C4282u(((C4282u) C4028v.this.f12693b.get(0)).mo13499c());
                    C4028v.this.f12693b.add(uVar);
                }
                mVar2.mo13455K(2);
                int D = mVar.mo13448D();
                int i2 = 5;
                mVar2.mo13455K(5);
                mVar2.mo13461f(this.f12706a, 2);
                int i3 = 4;
                this.f12706a.mo13443o(4);
                mVar2.mo13455K(this.f12706a.mo13436h(12));
                if (C4028v.this.f12692a == 2 && C4028v.this.f12702k == null) {
                    C4031w.C4033b bVar = new C4031w.C4033b(21, (String) null, (List<C4031w.C4032a>) null, new byte[0]);
                    C4028v vVar = C4028v.this;
                    C4031w unused = vVar.f12702k = vVar.f12696e.mo12853b(21, bVar);
                    C4028v.this.f12702k.mo12878b(uVar, C4028v.this.f12699h, new C4031w.C4035d(D, 21, 8192));
                }
                this.f12707b.clear();
                this.f12708c.clear();
                int a = mVar.mo13456a();
                while (a > 0) {
                    mVar2.mo13461f(this.f12706a, i2);
                    int h = this.f12706a.mo13436h(8);
                    this.f12706a.mo13443o(3);
                    int h2 = this.f12706a.mo13436h(13);
                    this.f12706a.mo13443o(i3);
                    int h3 = this.f12706a.mo13436h(12);
                    C4031w.C4033b a2 = m17026a(mVar2, h3);
                    if (h == 6) {
                        h = a2.f12713a;
                    }
                    a -= h3 + 5;
                    int i4 = C4028v.this.f12692a == 2 ? h : h2;
                    if (!C4028v.this.f12698g.get(i4)) {
                        C4031w n = (C4028v.this.f12692a == 2 && h == 21) ? C4028v.this.f12702k : C4028v.this.f12696e.mo12853b(h, a2);
                        if (C4028v.this.f12692a != 2 || h2 < this.f12708c.get(i4, 8192)) {
                            this.f12708c.put(i4, h2);
                            this.f12707b.put(i4, n);
                        }
                    }
                    i2 = 5;
                    i3 = 4;
                }
                int size = this.f12708c.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = this.f12708c.keyAt(i5);
                    C4028v.this.f12698g.put(keyAt, true);
                    C4031w valueAt = this.f12707b.valueAt(i5);
                    if (valueAt != null) {
                        if (valueAt != C4028v.this.f12702k) {
                            valueAt.mo12878b(uVar, C4028v.this.f12699h, new C4031w.C4035d(D, keyAt, 8192));
                        }
                        C4028v.this.f12697f.put(this.f12708c.valueAt(i5), valueAt);
                    }
                }
                if (C4028v.this.f12692a != 2) {
                    C4028v.this.f12697f.remove(this.f12709d);
                    C4028v vVar2 = C4028v.this;
                    if (vVar2.f12692a != 1) {
                        i = C4028v.this.f12700i - 1;
                    }
                    int unused2 = vVar2.f12700i = i;
                    if (C4028v.this.f12700i == 0) {
                        C4028v.this.f12699h.mo12744c();
                    } else {
                        return;
                    }
                } else if (!C4028v.this.f12701j) {
                    C4028v.this.f12699h.mo12744c();
                    int unused3 = C4028v.this.f12700i = 0;
                } else {
                    return;
                }
                boolean unused4 = C4028v.this.f12701j = true;
            }
        }
    }

    public C4028v(int i, int i2) {
        this(i, new C4282u(0), new C4005e(i2));
    }

    public C4028v(int i, C4282u uVar, C4031w.C4034c cVar) {
        C4260a.m18073e(cVar);
        this.f12696e = cVar;
        this.f12692a = i;
        if (i == 1 || i == 2) {
            this.f12693b = Collections.singletonList(uVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f12693b = arrayList;
            arrayList.add(uVar);
        }
        this.f12694c = new C4274m(new byte[9400], 0);
        this.f12698g = new SparseBooleanArray();
        this.f12697f = new SparseArray<>();
        this.f12695d = new SparseIntArray();
        m17018v();
    }

    /* renamed from: j */
    static /* synthetic */ int m17006j(C4028v vVar) {
        int i = vVar.f12700i;
        vVar.f12700i = i + 1;
        return i;
    }

    /* renamed from: v */
    private void m17018v() {
        this.f12698g.clear();
        this.f12697f.clear();
        SparseArray<C4031w> a = this.f12696e.mo12852a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f12697f.put(a.keyAt(i), a.valueAt(i));
        }
        this.f12697f.put(0, new C4025s(new C4029a()));
        this.f12702k = null;
    }

    /* renamed from: a */
    public void mo12738a() {
    }

    /* renamed from: b */
    public void mo12739b(C3917g gVar) {
        this.f12699h = gVar;
        gVar.mo12743b(new C3923l.C3925b(-9223372036854775807L));
    }

    /* renamed from: c */
    public void mo12740c(long j, long j2) {
        int size = this.f12693b.size();
        for (int i = 0; i < size; i++) {
            this.f12693b.get(i).mo13502g();
        }
        this.f12694c.mo13450F();
        this.f12695d.clear();
        m17018v();
        this.f12703l = 0;
    }

    /* renamed from: d */
    public boolean mo12741d(C3916f fVar) throws IOException, InterruptedException {
        byte[] bArr = this.f12694c.f13643a;
        fVar.mo12727i(bArr, 0, 940);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 != 5) {
                if (bArr[(i2 * 188) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            fVar.mo12724f(i);
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public int mo12742h(C3916f fVar, C3922k kVar) throws IOException, InterruptedException {
        C4274m mVar = this.f12694c;
        byte[] bArr = mVar.f13643a;
        if (9400 - mVar.mo13458c() < 188) {
            int a = this.f12694c.mo13456a();
            if (a > 0) {
                System.arraycopy(bArr, this.f12694c.mo13458c(), bArr, 0, a);
            }
            this.f12694c.mo13452H(bArr, a);
        }
        while (this.f12694c.mo13456a() < 188) {
            int d = this.f12694c.mo13459d();
            int a2 = fVar.mo12719a(bArr, d, 9400 - d);
            if (a2 == -1) {
                return -1;
            }
            this.f12694c.mo13453I(d + a2);
        }
        int d2 = this.f12694c.mo13459d();
        int c = this.f12694c.mo13458c();
        int i = c;
        while (i < d2 && bArr[i] != 71) {
            i++;
        }
        this.f12694c.mo13454J(i);
        int i2 = i + 188;
        if (i2 > d2) {
            int i3 = this.f12703l + (i - c);
            this.f12703l = i3;
            if (this.f12692a != 2 || i3 <= 376) {
                return 0;
            }
            throw new C4313u("Cannot find sync byte. Most likely not a Transport Stream.");
        }
        this.f12703l = 0;
        int i4 = this.f12694c.mo13464i();
        if ((8388608 & i4) == 0) {
            boolean z = (4194304 & i4) != 0;
            int i5 = (2096896 & i4) >> 8;
            boolean z2 = (i4 & 32) != 0;
            C4031w wVar = (i4 & 16) != 0 ? this.f12697f.get(i5) : null;
            if (wVar != null) {
                if (this.f12692a != 2) {
                    int i6 = i4 & 15;
                    int i7 = this.f12695d.get(i5, i6 - 1);
                    this.f12695d.put(i5, i6);
                    if (i7 != i6) {
                        if (i6 != ((i7 + 1) & 15)) {
                            wVar.mo12877a();
                        }
                    }
                }
                if (z2) {
                    this.f12694c.mo13455K(this.f12694c.mo13479x());
                }
                this.f12694c.mo13453I(i2);
                wVar.mo12879c(this.f12694c, z);
                this.f12694c.mo13453I(d2);
            }
        }
        this.f12694c.mo13454J(i2);
        return 0;
    }
}
