package p148g.p189d.p190a.p200b.p201h0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.p201h0.C3856d;

/* renamed from: g.d.a.b.h0.g */
final class C3871g implements C3856d {

    /* renamed from: b */
    private int f11628b = -1;

    /* renamed from: c */
    private int f11629c = -1;

    /* renamed from: d */
    private int[] f11630d;

    /* renamed from: e */
    private boolean f11631e;

    /* renamed from: f */
    private int[] f11632f;

    /* renamed from: g */
    private ByteBuffer f11633g;

    /* renamed from: h */
    private ByteBuffer f11634h;

    /* renamed from: i */
    private boolean f11635i;

    public C3871g() {
        ByteBuffer byteBuffer = C3856d.f11609a;
        this.f11633g = byteBuffer;
        this.f11634h = byteBuffer;
    }

    /* renamed from: a */
    public void mo12621a(int[] iArr) {
        this.f11630d = iArr;
    }

    /* renamed from: b */
    public void mo12576b() {
        flush();
        this.f11633g = C3856d.f11609a;
        this.f11628b = -1;
        this.f11629c = -1;
        this.f11632f = null;
        this.f11631e = false;
    }

    /* renamed from: c */
    public boolean mo12577c() {
        return this.f11635i && this.f11634h == C3856d.f11609a;
    }

    /* renamed from: d */
    public boolean mo12578d() {
        return this.f11631e;
    }

    /* renamed from: e */
    public ByteBuffer mo12579e() {
        ByteBuffer byteBuffer = this.f11634h;
        this.f11634h = C3856d.f11609a;
        return byteBuffer;
    }

    /* renamed from: f */
    public void mo12580f() {
        this.f11635i = true;
    }

    public void flush() {
        this.f11634h = C3856d.f11609a;
        this.f11635i = false;
    }

    /* renamed from: g */
    public void mo12582g(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f11628b * 2)) * this.f11632f.length * 2;
        if (this.f11633g.capacity() < length) {
            this.f11633g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f11633g.clear();
        }
        while (position < limit) {
            for (int i : this.f11632f) {
                this.f11633g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f11628b * 2;
        }
        byteBuffer.position(limit);
        this.f11633g.flip();
        this.f11634h = this.f11633g;
    }

    /* renamed from: h */
    public int mo12583h() {
        int[] iArr = this.f11632f;
        return iArr == null ? this.f11628b : iArr.length;
    }

    /* renamed from: i */
    public boolean mo12584i(int i, int i2, int i3) throws C3856d.C3857a {
        boolean z = !Arrays.equals(this.f11630d, this.f11632f);
        int[] iArr = this.f11630d;
        this.f11632f = iArr;
        if (iArr == null) {
            this.f11631e = false;
            return z;
        } else if (i3 != 2) {
            throw new C3856d.C3857a(i, i2, i3);
        } else if (!z && this.f11629c == i && this.f11628b == i2) {
            return false;
        } else {
            this.f11629c = i;
            this.f11628b = i2;
            this.f11631e = i2 != this.f11632f.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f11632f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f11631e = (i5 != i4) | this.f11631e;
                    i4++;
                } else {
                    throw new C3856d.C3857a(i, i2, i3);
                }
            }
        }
    }

    /* renamed from: j */
    public int mo12585j() {
        return this.f11629c;
    }

    /* renamed from: k */
    public int mo12586k() {
        return 2;
    }
}
