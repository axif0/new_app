package p148g.p189d.p190a.p200b.p201h0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p148g.p189d.p190a.p200b.p201h0.C3856d;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.h0.o */
final class C3887o implements C3856d {

    /* renamed from: b */
    private boolean f11788b;

    /* renamed from: c */
    private int f11789c;

    /* renamed from: d */
    private int f11790d;

    /* renamed from: e */
    private int f11791e = -1;

    /* renamed from: f */
    private int f11792f;

    /* renamed from: g */
    private int f11793g;

    /* renamed from: h */
    private ByteBuffer f11794h;

    /* renamed from: i */
    private ByteBuffer f11795i;

    /* renamed from: j */
    private byte[] f11796j;

    /* renamed from: k */
    private int f11797k;

    /* renamed from: l */
    private boolean f11798l;

    public C3887o() {
        ByteBuffer byteBuffer = C3856d.f11609a;
        this.f11794h = byteBuffer;
        this.f11795i = byteBuffer;
    }

    /* renamed from: a */
    public void mo12653a(int i, int i2) {
        this.f11789c = i;
        this.f11790d = i2;
    }

    /* renamed from: b */
    public void mo12576b() {
        flush();
        this.f11794h = C3856d.f11609a;
        this.f11791e = -1;
        this.f11792f = -1;
        this.f11796j = null;
    }

    /* renamed from: c */
    public boolean mo12577c() {
        return this.f11798l && this.f11795i == C3856d.f11609a;
    }

    /* renamed from: d */
    public boolean mo12578d() {
        return this.f11788b;
    }

    /* renamed from: e */
    public ByteBuffer mo12579e() {
        ByteBuffer byteBuffer = this.f11795i;
        this.f11795i = C3856d.f11609a;
        return byteBuffer;
    }

    /* renamed from: f */
    public void mo12580f() {
        this.f11798l = true;
    }

    public void flush() {
        this.f11795i = C3856d.f11609a;
        this.f11798l = false;
        this.f11793g = 0;
        this.f11797k = 0;
    }

    /* renamed from: g */
    public void mo12582g(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int min = Math.min(i, this.f11793g);
        this.f11793g -= min;
        byteBuffer.position(position + min);
        if (this.f11793g <= 0) {
            int i2 = i - min;
            int length = (this.f11797k + i2) - this.f11796j.length;
            if (this.f11794h.capacity() < length) {
                this.f11794h = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
            } else {
                this.f11794h.clear();
            }
            int i3 = C4284w.m18243i(length, 0, this.f11797k);
            this.f11794h.put(this.f11796j, 0, i3);
            int i4 = C4284w.m18243i(length - i3, 0, i2);
            byteBuffer.limit(byteBuffer.position() + i4);
            this.f11794h.put(byteBuffer);
            byteBuffer.limit(limit);
            int i5 = i2 - i4;
            int i6 = this.f11797k - i3;
            this.f11797k = i6;
            byte[] bArr = this.f11796j;
            System.arraycopy(bArr, i3, bArr, 0, i6);
            byteBuffer.get(this.f11796j, this.f11797k, i5);
            this.f11797k += i5;
            this.f11794h.flip();
            this.f11795i = this.f11794h;
        }
    }

    /* renamed from: h */
    public int mo12583h() {
        return this.f11791e;
    }

    /* renamed from: i */
    public boolean mo12584i(int i, int i2, int i3) throws C3856d.C3857a {
        if (i3 == 2) {
            this.f11791e = i2;
            this.f11792f = i;
            int i4 = this.f11790d;
            this.f11796j = new byte[(i4 * i2 * 2)];
            this.f11797k = 0;
            int i5 = this.f11789c;
            this.f11793g = i2 * i5 * 2;
            boolean z = this.f11788b;
            boolean z2 = (i5 == 0 && i4 == 0) ? false : true;
            this.f11788b = z2;
            return z != z2;
        }
        throw new C3856d.C3857a(i, i2, i3);
    }

    /* renamed from: j */
    public int mo12585j() {
        return this.f11792f;
    }

    /* renamed from: k */
    public int mo12586k() {
        return 2;
    }
}
