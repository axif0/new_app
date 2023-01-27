package p148g.p189d.p190a.p200b.p217n0;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4150o;
import p148g.p189d.p190a.p200b.p202i0.C3890b;
import p148g.p189d.p190a.p200b.p202i0.C3895e;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p217n0.C4136h;
import p148g.p189d.p190a.p200b.p229q0.C4236a;
import p148g.p189d.p190a.p200b.p229q0.C4237b;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.n0.i */
public final class C4138i implements C3927n {

    /* renamed from: a */
    private final C4237b f13127a;

    /* renamed from: b */
    private final int f13128b;

    /* renamed from: c */
    private final C4136h f13129c = new C4136h();

    /* renamed from: d */
    private final C4136h.C4137a f13130d = new C4136h.C4137a();

    /* renamed from: e */
    private final C4274m f13131e = new C4274m(32);

    /* renamed from: f */
    private C4139a f13132f;

    /* renamed from: g */
    private C4139a f13133g;

    /* renamed from: h */
    private C4139a f13134h;

    /* renamed from: i */
    private C4109n f13135i;

    /* renamed from: j */
    private boolean f13136j;

    /* renamed from: k */
    private C4109n f13137k;

    /* renamed from: l */
    private long f13138l;

    /* renamed from: m */
    private long f13139m;

    /* renamed from: n */
    private boolean f13140n;

    /* renamed from: o */
    private C4140b f13141o;

    /* renamed from: g.d.a.b.n0.i$a */
    private static final class C4139a {

        /* renamed from: a */
        public final long f13142a;

        /* renamed from: b */
        public final long f13143b;

        /* renamed from: c */
        public boolean f13144c;

        /* renamed from: d */
        public C4236a f13145d;

        /* renamed from: e */
        public C4139a f13146e;

        public C4139a(long j, int i) {
            this.f13142a = j;
            this.f13143b = j + ((long) i);
        }

        /* renamed from: a */
        public C4139a mo13170a() {
            this.f13145d = null;
            C4139a aVar = this.f13146e;
            this.f13146e = null;
            return aVar;
        }

        /* renamed from: b */
        public void mo13171b(C4236a aVar, C4139a aVar2) {
            this.f13145d = aVar;
            this.f13146e = aVar2;
            this.f13144c = true;
        }

        /* renamed from: c */
        public int mo13172c(long j) {
            return ((int) (j - this.f13142a)) + this.f13145d.f13538b;
        }
    }

    /* renamed from: g.d.a.b.n0.i$b */
    public interface C4140b {
        /* renamed from: k */
        void mo13102k(C4109n nVar);
    }

    public C4138i(C4237b bVar) {
        this.f13127a = bVar;
        this.f13128b = bVar.mo13368e();
        C4139a aVar = new C4139a(0, this.f13128b);
        this.f13132f = aVar;
        this.f13133g = aVar;
        this.f13134h = aVar;
    }

    /* renamed from: e */
    private void m17514e(long j) {
        while (true) {
            C4139a aVar = this.f13133g;
            if (j >= aVar.f13143b) {
                this.f13133g = aVar.f13146e;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    private void m17515h(C4139a aVar) {
        if (aVar.f13144c) {
            C4139a aVar2 = this.f13134h;
            int i = (aVar2.f13144c ? 1 : 0) + (((int) (aVar2.f13142a - aVar.f13142a)) / this.f13128b);
            C4236a[] aVarArr = new C4236a[i];
            for (int i2 = 0; i2 < i; i2++) {
                aVarArr[i2] = aVar.f13145d;
                aVar = aVar.mo13170a();
            }
            this.f13127a.mo13366c(aVarArr);
        }
    }

    /* renamed from: i */
    private void m17516i(long j) {
        C4139a aVar;
        if (j != -1) {
            while (true) {
                aVar = this.f13132f;
                if (j < aVar.f13143b) {
                    break;
                }
                this.f13127a.mo13365b(aVar.f13145d);
                this.f13132f = this.f13132f.mo13170a();
            }
            if (this.f13133g.f13142a < aVar.f13142a) {
                this.f13133g = aVar;
            }
        }
    }

    /* renamed from: l */
    private static C4109n m17517l(C4109n nVar, long j) {
        if (nVar == null) {
            return null;
        }
        if (j == 0) {
            return nVar;
        }
        long j2 = nVar.f12939B;
        return j2 != Long.MAX_VALUE ? nVar.mo13060e(j2 + j) : nVar;
    }

    /* renamed from: r */
    private void m17518r(int i) {
        long j = this.f13139m + ((long) i);
        this.f13139m = j;
        C4139a aVar = this.f13134h;
        if (j == aVar.f13143b) {
            this.f13134h = aVar.f13146e;
        }
    }

    /* renamed from: s */
    private int m17519s(int i) {
        C4139a aVar = this.f13134h;
        if (!aVar.f13144c) {
            aVar.mo13171b(this.f13127a.mo13367d(), new C4139a(this.f13134h.f13143b, this.f13128b));
        }
        return Math.min(i, (int) (this.f13134h.f13143b - this.f13139m));
    }

    /* renamed from: u */
    private void m17520u(long j, ByteBuffer byteBuffer, int i) {
        m17514e(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.f13133g.f13143b - j));
            C4139a aVar = this.f13133g;
            byteBuffer.put(aVar.f13145d.f13537a, aVar.mo13172c(j), min);
            i -= min;
            j += (long) min;
            C4139a aVar2 = this.f13133g;
            if (j == aVar2.f13143b) {
                this.f13133g = aVar2.f13146e;
            }
        }
    }

    /* renamed from: v */
    private void m17521v(long j, byte[] bArr, int i) {
        m17514e(j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.f13133g.f13143b - j));
            C4139a aVar = this.f13133g;
            System.arraycopy(aVar.f13145d.f13537a, aVar.mo13172c(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            C4139a aVar2 = this.f13133g;
            if (j == aVar2.f13143b) {
                this.f13133g = aVar2.f13146e;
            }
        }
    }

    /* renamed from: w */
    private void m17522w(C3895e eVar, C4136h.C4137a aVar) {
        int i;
        C3895e eVar2 = eVar;
        C4136h.C4137a aVar2 = aVar;
        long j = aVar2.f13125b;
        this.f13131e.mo13451G(1);
        m17521v(j, this.f13131e.f13643a, 1);
        long j2 = j + 1;
        byte b = this.f13131e.f13643a[0];
        boolean z = (b & 128) != 0;
        byte b2 = b & Byte.MAX_VALUE;
        C3890b bVar = eVar2.f11821g;
        if (bVar.f11800a == null) {
            bVar.f11800a = new byte[16];
        }
        m17521v(j2, eVar2.f11821g.f11800a, b2);
        long j3 = j2 + ((long) b2);
        if (z) {
            this.f13131e.mo13451G(2);
            m17521v(j3, this.f13131e.f13643a, 2);
            j3 += 2;
            i = this.f13131e.mo13448D();
        } else {
            i = 1;
        }
        int[] iArr = eVar2.f11821g.f11803d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = eVar2.f11821g.f11804e;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i2 = i * 6;
            this.f13131e.mo13451G(i2);
            m17521v(j3, this.f13131e.f13643a, i2);
            j3 += (long) i2;
            this.f13131e.mo13454J(0);
            for (int i3 = 0; i3 < i; i3++) {
                iArr2[i3] = this.f13131e.mo13448D();
                iArr4[i3] = this.f13131e.mo13446B();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar2.f13124a - ((int) (j3 - aVar2.f13125b));
        }
        C3927n.C3928a aVar3 = aVar2.f13126c;
        C3890b bVar2 = eVar2.f11821g;
        bVar2.mo12663c(i, iArr2, iArr4, aVar3.f11918b, bVar2.f11800a, aVar3.f11917a, aVar3.f11919c, aVar3.f11920d);
        long j4 = aVar2.f13125b;
        int i4 = (int) (j3 - j4);
        aVar2.f13125b = j4 + ((long) i4);
        aVar2.f13124a -= i4;
    }

    /* renamed from: A */
    public void mo13156A(C4140b bVar) {
        this.f13141o = bVar;
    }

    /* renamed from: a */
    public void mo12734a(C4274m mVar, int i) {
        while (i > 0) {
            int s = m17519s(i);
            C4139a aVar = this.f13134h;
            mVar.mo13462g(aVar.f13145d.f13537a, aVar.mo13172c(this.f13139m), s);
            i -= s;
            m17518r(s);
        }
    }

    /* renamed from: b */
    public int mo12735b(C3916f fVar, int i, boolean z) throws IOException, InterruptedException {
        int s = m17519s(i);
        C4139a aVar = this.f13134h;
        int a = fVar.mo12719a(aVar.f13145d.f13537a, aVar.mo13172c(this.f13139m), s);
        if (a != -1) {
            m17518r(a);
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: c */
    public void mo12736c(long j, int i, int i2, int i3, C3927n.C3928a aVar) {
        long j2 = j;
        if (this.f13136j) {
            mo12737d(this.f13137k);
        }
        if (this.f13140n) {
            if ((i & 1) != 0 && this.f13129c.mo13141c(j)) {
                this.f13140n = false;
            } else {
                return;
            }
        }
        this.f13129c.mo13142d(j2 + this.f13138l, i, (this.f13139m - ((long) i2)) - ((long) i3), i2, aVar);
    }

    /* renamed from: d */
    public void mo12737d(C4109n nVar) {
        C4109n l = m17517l(nVar, this.f13138l);
        boolean k = this.f13129c.mo13147k(l);
        this.f13137k = nVar;
        this.f13136j = false;
        C4140b bVar = this.f13141o;
        if (bVar != null && k) {
            bVar.mo13102k(l);
        }
    }

    /* renamed from: f */
    public int mo13157f(long j, boolean z, boolean z2) {
        return this.f13129c.mo13139a(j, z, z2);
    }

    /* renamed from: g */
    public int mo13158g() {
        return this.f13129c.mo13140b();
    }

    /* renamed from: j */
    public void mo13159j(long j, boolean z, boolean z2) {
        m17516i(this.f13129c.mo13144g(j, z, z2));
    }

    /* renamed from: k */
    public void mo13160k() {
        m17516i(this.f13129c.mo13145h());
    }

    /* renamed from: m */
    public long mo13161m() {
        return this.f13129c.mo13148l();
    }

    /* renamed from: n */
    public int mo13162n() {
        return this.f13129c.mo13149n();
    }

    /* renamed from: o */
    public C4109n mo13163o() {
        return this.f13129c.mo13150p();
    }

    /* renamed from: p */
    public int mo13164p() {
        return this.f13129c.mo13151q();
    }

    /* renamed from: q */
    public boolean mo13165q() {
        return this.f13129c.mo13152r();
    }

    /* renamed from: t */
    public int mo13166t(C4150o oVar, C3895e eVar, boolean z, boolean z2, long j) {
        int s = this.f13129c.mo13153s(oVar, eVar, z, z2, this.f13135i, this.f13130d);
        if (s == -5) {
            this.f13135i = oVar.f13171a;
            return -5;
        } else if (s == -4) {
            if (!eVar.mo12659o()) {
                if (eVar.f11823i < j) {
                    eVar.mo12654j(Integer.MIN_VALUE);
                }
                if (eVar.mo12672v()) {
                    m17522w(eVar, this.f13130d);
                }
                eVar.mo12670t(this.f13130d.f13124a);
                C4136h.C4137a aVar = this.f13130d;
                m17520u(aVar.f13125b, eVar.f11822h, aVar.f13124a);
            }
            return -4;
        } else if (s == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: x */
    public void mo13167x() {
        mo13168y(false);
    }

    /* renamed from: y */
    public void mo13168y(boolean z) {
        this.f13129c.mo13154t(z);
        m17515h(this.f13132f);
        C4139a aVar = new C4139a(0, this.f13128b);
        this.f13132f = aVar;
        this.f13133g = aVar;
        this.f13134h = aVar;
        this.f13139m = 0;
        this.f13127a.mo13364a();
    }

    /* renamed from: z */
    public void mo13169z() {
        this.f13129c.mo13155u();
        this.f13133g = this.f13132f;
    }
}
