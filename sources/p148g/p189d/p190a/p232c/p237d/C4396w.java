package p148g.p189d.p190a.p232c.p237d;

import java.lang.ref.WeakReference;

/* renamed from: g.d.a.c.d.w */
abstract class C4396w extends C4394u {

    /* renamed from: c */
    private static final WeakReference<byte[]> f13941c = new WeakReference<>((Object) null);

    /* renamed from: b */
    private WeakReference<byte[]> f13942b = f13941c;

    C4396w(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T0 */
    public abstract byte[] mo13730T0();

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final byte[] mo13729w() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f13942b.get();
            if (bArr == null) {
                bArr = mo13730T0();
                this.f13942b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
