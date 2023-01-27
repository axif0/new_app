package p148g.p189d.p190a.p200b.p201h0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p148g.p189d.p190a.p200b.p201h0.C3856d;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.h0.n */
public final class C3886n implements C3856d {

    /* renamed from: b */
    private int f11775b;

    /* renamed from: c */
    private int f11776c = -1;

    /* renamed from: d */
    private int f11777d = -1;

    /* renamed from: e */
    private C3885m f11778e;

    /* renamed from: f */
    private float f11779f = 1.0f;

    /* renamed from: g */
    private float f11780g = 1.0f;

    /* renamed from: h */
    private int f11781h = -1;

    /* renamed from: i */
    private ByteBuffer f11782i;

    /* renamed from: j */
    private ShortBuffer f11783j;

    /* renamed from: k */
    private ByteBuffer f11784k;

    /* renamed from: l */
    private long f11785l;

    /* renamed from: m */
    private long f11786m;

    /* renamed from: n */
    private boolean f11787n;

    public C3886n() {
        ByteBuffer byteBuffer = C3856d.f11609a;
        this.f11782i = byteBuffer;
        this.f11783j = byteBuffer.asShortBuffer();
        this.f11784k = C3856d.f11609a;
        this.f11775b = -1;
    }

    /* renamed from: a */
    public long mo12650a(long j) {
        long j2 = this.f11786m;
        if (j2 >= 1024) {
            int i = this.f11781h;
            int i2 = this.f11777d;
            long j3 = this.f11785l;
            if (i == i2) {
                return C4284w.m18229B(j, j3, j2);
            }
            return C4284w.m18229B(j, j3 * ((long) i), j2 * ((long) i2));
        }
        double d = (double) this.f11779f;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (long) (d * d2);
    }

    /* renamed from: b */
    public void mo12576b() {
        this.f11778e = null;
        ByteBuffer byteBuffer = C3856d.f11609a;
        this.f11782i = byteBuffer;
        this.f11783j = byteBuffer.asShortBuffer();
        this.f11784k = C3856d.f11609a;
        this.f11776c = -1;
        this.f11777d = -1;
        this.f11781h = -1;
        this.f11785l = 0;
        this.f11786m = 0;
        this.f11787n = false;
        this.f11775b = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f11778e;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12577c() {
        /*
            r1 = this;
            boolean r0 = r1.f11787n
            if (r0 == 0) goto L_0x0010
            g.d.a.b.h0.m r0 = r1.f11778e
            if (r0 == 0) goto L_0x000e
            int r0 = r0.mo12647k()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p201h0.C3886n.mo12577c():boolean");
    }

    /* renamed from: d */
    public boolean mo12578d() {
        return Math.abs(this.f11779f - 1.0f) >= 0.01f || Math.abs(this.f11780g - 1.0f) >= 0.01f || this.f11781h != this.f11777d;
    }

    /* renamed from: e */
    public ByteBuffer mo12579e() {
        ByteBuffer byteBuffer = this.f11784k;
        this.f11784k = C3856d.f11609a;
        return byteBuffer;
    }

    /* renamed from: f */
    public void mo12580f() {
        this.f11778e.mo12648r();
        this.f11787n = true;
    }

    public void flush() {
        this.f11778e = new C3885m(this.f11777d, this.f11776c, this.f11779f, this.f11780g, this.f11781h);
        this.f11784k = C3856d.f11609a;
        this.f11785l = 0;
        this.f11786m = 0;
        this.f11787n = false;
    }

    /* renamed from: g */
    public void mo12582g(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f11785l += (long) remaining;
            this.f11778e.mo12649s(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int k = this.f11778e.mo12647k() * this.f11776c * 2;
        if (k > 0) {
            if (this.f11782i.capacity() < k) {
                ByteBuffer order = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
                this.f11782i = order;
                this.f11783j = order.asShortBuffer();
            } else {
                this.f11782i.clear();
                this.f11783j.clear();
            }
            this.f11778e.mo12646j(this.f11783j);
            this.f11786m += (long) k;
            this.f11782i.limit(k);
            this.f11784k = this.f11782i;
        }
    }

    /* renamed from: h */
    public int mo12583h() {
        return this.f11776c;
    }

    /* renamed from: i */
    public boolean mo12584i(int i, int i2, int i3) throws C3856d.C3857a {
        if (i3 == 2) {
            int i4 = this.f11775b;
            if (i4 == -1) {
                i4 = i;
            }
            if (this.f11777d == i && this.f11776c == i2 && this.f11781h == i4) {
                return false;
            }
            this.f11777d = i;
            this.f11776c = i2;
            this.f11781h = i4;
            return true;
        }
        throw new C3856d.C3857a(i, i2, i3);
    }

    /* renamed from: j */
    public int mo12585j() {
        return this.f11781h;
    }

    /* renamed from: k */
    public int mo12586k() {
        return 2;
    }

    /* renamed from: l */
    public float mo12651l(float f) {
        this.f11780g = C4284w.m18242h(f, 0.1f, 8.0f);
        return f;
    }

    /* renamed from: m */
    public float mo12652m(float f) {
        float h = C4284w.m18242h(f, 0.1f, 8.0f);
        this.f11779f = h;
        return h;
    }
}
