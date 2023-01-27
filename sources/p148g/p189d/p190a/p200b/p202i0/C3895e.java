package p148g.p189d.p190a.p200b.p202i0;

import java.nio.ByteBuffer;

/* renamed from: g.d.a.b.i0.e */
public class C3895e extends C3889a {

    /* renamed from: g */
    public final C3890b f11821g = new C3890b();

    /* renamed from: h */
    public ByteBuffer f11822h;

    /* renamed from: i */
    public long f11823i;

    /* renamed from: j */
    private final int f11824j;

    public C3895e(int i) {
        this.f11824j = i;
    }

    /* renamed from: s */
    private ByteBuffer m16339s(int i) {
        int i2 = this.f11824j;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f11822h;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }

    /* renamed from: x */
    public static C3895e m16340x() {
        return new C3895e(0);
    }

    /* renamed from: k */
    public void mo12655k() {
        super.mo12655k();
        ByteBuffer byteBuffer = this.f11822h;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: t */
    public void mo12670t(int i) throws IllegalStateException {
        ByteBuffer byteBuffer = this.f11822h;
        if (byteBuffer == null) {
            this.f11822h = m16339s(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f11822h.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer s = m16339s(i2);
            if (position > 0) {
                this.f11822h.position(0);
                this.f11822h.limit(position);
                s.put(this.f11822h);
            }
            this.f11822h = s;
        }
    }

    /* renamed from: u */
    public final void mo12671u() {
        this.f11822h.flip();
    }

    /* renamed from: v */
    public final boolean mo12672v() {
        return mo12657m(1073741824);
    }

    /* renamed from: w */
    public final boolean mo12673w() {
        return this.f11822h == null && this.f11824j == 0;
    }
}
