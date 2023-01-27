package p148g.p189d.p190a.p200b.p201h0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p148g.p189d.p190a.p200b.p201h0.C3856d;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.h0.j */
final class C3880j implements C3856d {

    /* renamed from: h */
    private static final int f11724h = Float.floatToIntBits(Float.NaN);

    /* renamed from: b */
    private int f11725b = -1;

    /* renamed from: c */
    private int f11726c = -1;

    /* renamed from: d */
    private int f11727d = 0;

    /* renamed from: e */
    private ByteBuffer f11728e;

    /* renamed from: f */
    private ByteBuffer f11729f;

    /* renamed from: g */
    private boolean f11730g;

    public C3880j() {
        ByteBuffer byteBuffer = C3856d.f11609a;
        this.f11728e = byteBuffer;
        this.f11729f = byteBuffer;
    }

    /* renamed from: a */
    private static void m16219a(int i, ByteBuffer byteBuffer) {
        double d = (double) i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == f11724h) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: b */
    public void mo12576b() {
        flush();
        this.f11728e = C3856d.f11609a;
        this.f11725b = -1;
        this.f11726c = -1;
        this.f11727d = 0;
    }

    /* renamed from: c */
    public boolean mo12577c() {
        return this.f11730g && this.f11729f == C3856d.f11609a;
    }

    /* renamed from: d */
    public boolean mo12578d() {
        return C4284w.m18257w(this.f11727d);
    }

    /* renamed from: e */
    public ByteBuffer mo12579e() {
        ByteBuffer byteBuffer = this.f11729f;
        this.f11729f = C3856d.f11609a;
        return byteBuffer;
    }

    /* renamed from: f */
    public void mo12580f() {
        this.f11730g = true;
    }

    public void flush() {
        this.f11729f = C3856d.f11609a;
        this.f11730g = false;
    }

    /* renamed from: g */
    public void mo12582g(ByteBuffer byteBuffer) {
        C4260a.m18074f(mo12578d());
        boolean z = this.f11727d == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (!z) {
            i = (i / 3) * 4;
        }
        if (this.f11728e.capacity() < i) {
            this.f11728e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f11728e.clear();
        }
        if (z) {
            while (position < limit) {
                m16219a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), this.f11728e);
                position += 4;
            }
        } else {
            while (position < limit) {
                m16219a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), this.f11728e);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f11728e.flip();
        this.f11729f = this.f11728e;
    }

    /* renamed from: h */
    public int mo12583h() {
        return this.f11726c;
    }

    /* renamed from: i */
    public boolean mo12584i(int i, int i2, int i3) throws C3856d.C3857a {
        if (!C4284w.m18257w(i3)) {
            throw new C3856d.C3857a(i, i2, i3);
        } else if (this.f11725b == i && this.f11726c == i2 && this.f11727d == i3) {
            return false;
        } else {
            this.f11725b = i;
            this.f11726c = i2;
            this.f11727d = i3;
            return true;
        }
    }

    /* renamed from: j */
    public int mo12585j() {
        return this.f11725b;
    }

    /* renamed from: k */
    public int mo12586k() {
        return 4;
    }
}
