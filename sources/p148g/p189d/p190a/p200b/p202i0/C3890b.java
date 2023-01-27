package p148g.p189d.p190a.p200b.p202i0;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.i0.b */
public final class C3890b {

    /* renamed from: a */
    public byte[] f11800a;

    /* renamed from: b */
    public byte[] f11801b;

    /* renamed from: c */
    public int f11802c;

    /* renamed from: d */
    public int[] f11803d;

    /* renamed from: e */
    public int[] f11804e;

    /* renamed from: f */
    public int f11805f;

    /* renamed from: g */
    public int f11806g;

    /* renamed from: h */
    public int f11807h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f11808i;

    /* renamed from: j */
    private final C3892b f11809j;

    @TargetApi(24)
    /* renamed from: g.d.a.b.i0.b$b */
    private static final class C3892b {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f11810a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f11811b;

        private C3892b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f11810a = cryptoInfo;
            this.f11811b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m16333b(int i, int i2) {
            this.f11811b.set(i, i2);
            this.f11810a.setPattern(this.f11811b);
        }
    }

    public C3890b() {
        C3892b bVar = null;
        MediaCodec.CryptoInfo b = C4284w.f13659a >= 16 ? m16328b() : null;
        this.f11808i = b;
        this.f11809j = C4284w.f13659a >= 24 ? new C3892b(b) : bVar;
    }

    @TargetApi(16)
    /* renamed from: b */
    private MediaCodec.CryptoInfo m16328b() {
        return new MediaCodec.CryptoInfo();
    }

    @TargetApi(16)
    /* renamed from: d */
    private void m16329d() {
        MediaCodec.CryptoInfo cryptoInfo = this.f11808i;
        cryptoInfo.numSubSamples = this.f11805f;
        cryptoInfo.numBytesOfClearData = this.f11803d;
        cryptoInfo.numBytesOfEncryptedData = this.f11804e;
        cryptoInfo.key = this.f11801b;
        cryptoInfo.iv = this.f11800a;
        cryptoInfo.mode = this.f11802c;
        if (C4284w.f13659a >= 24) {
            this.f11809j.m16333b(this.f11806g, this.f11807h);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public MediaCodec.CryptoInfo mo12662a() {
        return this.f11808i;
    }

    /* renamed from: c */
    public void mo12663c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f11805f = i;
        this.f11803d = iArr;
        this.f11804e = iArr2;
        this.f11801b = bArr;
        this.f11800a = bArr2;
        this.f11802c = i2;
        this.f11806g = i3;
        this.f11807h = i4;
        if (C4284w.f13659a >= 16) {
            m16329d();
        }
    }
}
