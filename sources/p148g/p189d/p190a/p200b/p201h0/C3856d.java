package p148g.p189d.p190a.p200b.p201h0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: g.d.a.b.h0.d */
public interface C3856d {

    /* renamed from: a */
    public static final ByteBuffer f11609a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: g.d.a.b.h0.d$a */
    public static final class C3857a extends Exception {
        public C3857a(int i, int i2, int i3) {
            super("Unhandled format: " + i + " Hz, " + i2 + " channels in encoding " + i3);
        }
    }

    /* renamed from: b */
    void mo12576b();

    /* renamed from: c */
    boolean mo12577c();

    /* renamed from: d */
    boolean mo12578d();

    /* renamed from: e */
    ByteBuffer mo12579e();

    /* renamed from: f */
    void mo12580f();

    void flush();

    /* renamed from: g */
    void mo12582g(ByteBuffer byteBuffer);

    /* renamed from: h */
    int mo12583h();

    /* renamed from: i */
    boolean mo12584i(int i, int i2, int i3) throws C3857a;

    /* renamed from: j */
    int mo12585j();

    /* renamed from: k */
    int mo12586k();
}
