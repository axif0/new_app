package p148g.p189d.p190a.p200b.p212l0;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.karumi.dexter.BuildConfig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p190a.p200b.C3828a;
import p148g.p189d.p190a.p200b.C3848h;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4150o;
import p148g.p189d.p190a.p200b.p202i0.C3894d;
import p148g.p189d.p190a.p200b.p202i0.C3895e;
import p148g.p189d.p190a.p200b.p203j0.C3904b;
import p148g.p189d.p190a.p200b.p203j0.C3906c;
import p148g.p189d.p190a.p200b.p203j0.C3908e;
import p148g.p189d.p190a.p200b.p212l0.C4051d;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4270k;
import p148g.p189d.p190a.p200b.p230r0.C4283v;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

@TargetApi(16)
/* renamed from: g.d.a.b.l0.b */
public abstract class C4047b extends C3828a {

    /* renamed from: a0 */
    private static final byte[] f12790a0 = C4284w.m18246l("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private int f12791A;

    /* renamed from: B */
    private boolean f12792B;

    /* renamed from: C */
    private boolean f12793C;

    /* renamed from: D */
    private boolean f12794D;

    /* renamed from: E */
    private boolean f12795E;

    /* renamed from: F */
    private boolean f12796F;

    /* renamed from: G */
    private boolean f12797G;

    /* renamed from: H */
    private boolean f12798H;

    /* renamed from: I */
    private boolean f12799I;

    /* renamed from: J */
    private ByteBuffer[] f12800J;

    /* renamed from: K */
    private ByteBuffer[] f12801K;

    /* renamed from: L */
    private long f12802L;

    /* renamed from: M */
    private int f12803M;

    /* renamed from: N */
    private int f12804N;

    /* renamed from: O */
    private ByteBuffer f12805O;

    /* renamed from: P */
    private boolean f12806P;

    /* renamed from: Q */
    private boolean f12807Q;

    /* renamed from: R */
    private int f12808R;

    /* renamed from: S */
    private int f12809S;

    /* renamed from: T */
    private boolean f12810T;

    /* renamed from: U */
    private boolean f12811U;

    /* renamed from: V */
    private boolean f12812V;

    /* renamed from: W */
    private boolean f12813W;

    /* renamed from: X */
    private boolean f12814X;

    /* renamed from: Y */
    private boolean f12815Y;

    /* renamed from: Z */
    protected C3894d f12816Z;

    /* renamed from: n */
    private final C4049c f12817n;

    /* renamed from: o */
    private final C3906c<C3908e> f12818o;

    /* renamed from: p */
    private final boolean f12819p;

    /* renamed from: q */
    private final C3895e f12820q;

    /* renamed from: r */
    private final C3895e f12821r;

    /* renamed from: s */
    private final C4150o f12822s;

    /* renamed from: t */
    private final List<Long> f12823t;

    /* renamed from: u */
    private final MediaCodec.BufferInfo f12824u;

    /* renamed from: v */
    private C4109n f12825v;

    /* renamed from: w */
    private C3904b<C3908e> f12826w;

    /* renamed from: x */
    private C3904b<C3908e> f12827x;

    /* renamed from: y */
    private MediaCodec f12828y;

    /* renamed from: z */
    private C4046a f12829z;

    /* renamed from: g.d.a.b.l0.b$a */
    public static class C4048a extends Exception {
        public C4048a(C4109n nVar, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + nVar, th);
            String str = nVar.f12949k;
            m17204a(i);
        }

        public C4048a(C4109n nVar, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + nVar, th);
            String str2 = nVar.f12949k;
            if (C4284w.f13659a >= 21) {
                m17205b(th);
            }
        }

        /* renamed from: a */
        private static String m17204a(int i) {
            String str = i < 0 ? "neg_" : BuildConfig.FLAVOR;
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i);
        }

        @TargetApi(21)
        /* renamed from: b */
        private static String m17205b(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    public C4047b(int i, C4049c cVar, C3906c<C3908e> cVar2, boolean z) {
        super(i);
        C4260a.m18074f(C4284w.f13659a >= 16);
        C4260a.m18073e(cVar);
        this.f12817n = cVar;
        this.f12818o = cVar2;
        this.f12819p = z;
        this.f12820q = new C3895e(0);
        this.f12821r = C3895e.m16340x();
        this.f12822s = new C4150o();
        this.f12823t = new ArrayList();
        this.f12824u = new MediaCodec.BufferInfo();
        this.f12808R = 0;
        this.f12809S = 0;
    }

    /* renamed from: J */
    private int m17151J(String str) {
        if (C4284w.f13659a <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (C4284w.f13662d.startsWith("SM-T585") || C4284w.f13662d.startsWith("SM-A510") || C4284w.f13662d.startsWith("SM-A520") || C4284w.f13662d.startsWith("SM-J700"))) {
            return 2;
        }
        if (C4284w.f13659a >= 24) {
            return 0;
        }
        if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
            return ("flounder".equals(C4284w.f13660b) || "flounder_lte".equals(C4284w.f13660b) || "grouper".equals(C4284w.f13660b) || "tilapia".equals(C4284w.f13660b)) ? 1 : 0;
        }
        return 0;
    }

    /* renamed from: K */
    private static boolean m17152K(String str, C4109n nVar) {
        return C4284w.f13659a < 21 && nVar.f12951m.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* renamed from: L */
    private static boolean m17153L(String str) {
        return (C4284w.f13659a <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (C4284w.f13659a <= 19 && "hb2000".equals(C4284w.f13660b) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
    }

    /* renamed from: M */
    private static boolean m17154M(String str) {
        return C4284w.f13659a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: N */
    private static boolean m17155N(String str) {
        return C4284w.f13659a <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
    }

    /* renamed from: O */
    private static boolean m17156O(String str) {
        int i = C4284w.f13659a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (C4284w.f13659a == 19 && C4284w.f13662d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    /* renamed from: P */
    private static boolean m17157P(String str, C4109n nVar) {
        return C4284w.f13659a <= 18 && nVar.f12961w == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    @TargetApi(23)
    /* renamed from: R */
    private static void m17158R(MediaFormat mediaFormat) {
        mediaFormat.setInteger("priority", 0);
    }

    /* renamed from: S */
    private boolean m17159S(long j, long j2) throws C3848h {
        boolean z;
        int i;
        if (!m17165e0()) {
            if (!this.f12796F || !this.f12811U) {
                i = this.f12828y.dequeueOutputBuffer(this.f12824u, mo12927Z());
            } else {
                try {
                    i = this.f12828y.dequeueOutputBuffer(this.f12824u, mo12927Z());
                } catch (IllegalStateException unused) {
                    m17166l0();
                    if (this.f12813W) {
                        mo12931p0();
                    }
                    return false;
                }
            }
            if (i >= 0) {
                if (this.f12799I) {
                    this.f12799I = false;
                    this.f12828y.releaseOutputBuffer(i, false);
                    return true;
                } else if ((this.f12824u.flags & 4) != 0) {
                    m17166l0();
                    return false;
                } else {
                    this.f12804N = i;
                    ByteBuffer d0 = m17164d0(i);
                    this.f12805O = d0;
                    if (d0 != null) {
                        d0.position(this.f12824u.offset);
                        ByteBuffer byteBuffer = this.f12805O;
                        MediaCodec.BufferInfo bufferInfo = this.f12824u;
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    }
                    this.f12806P = m17172v0(this.f12824u.presentationTimeUs);
                }
            } else if (i == -2) {
                m17168o0();
                return true;
            } else if (i == -3) {
                m17167n0();
                return true;
            } else {
                if (this.f12794D && (this.f12812V || this.f12809S == 2)) {
                    m17166l0();
                }
                return false;
            }
        }
        if (!this.f12796F || !this.f12811U) {
            MediaCodec mediaCodec = this.f12828y;
            ByteBuffer byteBuffer2 = this.f12805O;
            int i2 = this.f12804N;
            MediaCodec.BufferInfo bufferInfo2 = this.f12824u;
            z = mo12643m0(j, j2, mediaCodec, byteBuffer2, i2, bufferInfo2.flags, bufferInfo2.presentationTimeUs, this.f12806P);
        } else {
            try {
                z = mo12643m0(j, j2, this.f12828y, this.f12805O, this.f12804N, this.f12824u.flags, this.f12824u.presentationTimeUs, this.f12806P);
            } catch (IllegalStateException unused2) {
                m17166l0();
                if (this.f12813W) {
                    mo12931p0();
                }
                return false;
            }
        }
        if (!z) {
            return false;
        }
        mo12930j0(this.f12824u.presentationTimeUs);
        m17171t0();
        return true;
    }

    /* renamed from: T */
    private boolean m17160T() throws C3848h {
        int i;
        int i2;
        MediaCodec mediaCodec = this.f12828y;
        if (mediaCodec == null || this.f12809S == 2 || this.f12812V) {
            return false;
        }
        if (this.f12803M < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            this.f12803M = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            this.f12820q.f11822h = m17163b0(dequeueInputBuffer);
            this.f12820q.mo12655k();
        }
        if (this.f12809S == 1) {
            if (!this.f12794D) {
                this.f12811U = true;
                this.f12828y.queueInputBuffer(this.f12803M, 0, 0, 0, 4);
                m17170s0();
            }
            this.f12809S = 2;
            return false;
        } else if (this.f12798H) {
            this.f12798H = false;
            this.f12820q.f11822h.put(f12790a0);
            this.f12828y.queueInputBuffer(this.f12803M, 0, f12790a0.length, 0, 0);
            m17170s0();
            this.f12810T = true;
            return true;
        } else {
            if (this.f12814X) {
                i2 = -4;
                i = 0;
            } else {
                if (this.f12808R == 1) {
                    for (int i3 = 0; i3 < this.f12825v.f12951m.size(); i3++) {
                        this.f12820q.f11822h.put(this.f12825v.f12951m.get(i3));
                    }
                    this.f12808R = 2;
                }
                i = this.f12820q.f11822h.position();
                i2 = mo12410F(this.f12822s, this.f12820q, false);
            }
            if (i2 == -3) {
                return false;
            }
            if (i2 == -5) {
                if (this.f12808R == 2) {
                    this.f12820q.mo12655k();
                    this.f12808R = 1;
                }
                mo12640h0(this.f12822s.f13171a);
                return true;
            } else if (this.f12820q.mo12659o()) {
                if (this.f12808R == 2) {
                    this.f12820q.mo12655k();
                    this.f12808R = 1;
                }
                this.f12812V = true;
                if (!this.f12810T) {
                    m17166l0();
                    return false;
                }
                try {
                    if (!this.f12794D) {
                        this.f12811U = true;
                        this.f12828y.queueInputBuffer(this.f12803M, 0, 0, 0, 4);
                        m17170s0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw C3848h.m16074a(e, mo12431x());
                }
            } else if (!this.f12815Y || this.f12820q.mo12660q()) {
                this.f12815Y = false;
                boolean v = this.f12820q.mo12672v();
                boolean w0 = m17173w0(v);
                this.f12814X = w0;
                if (w0) {
                    return false;
                }
                if (this.f12792B && !v) {
                    C4270k.m18119b(this.f12820q.f11822h);
                    if (this.f12820q.f11822h.position() == 0) {
                        return true;
                    }
                    this.f12792B = false;
                }
                try {
                    long j = this.f12820q.f11823i;
                    if (this.f12820q.mo12658n()) {
                        this.f12823t.add(Long.valueOf(j));
                    }
                    this.f12820q.mo12671u();
                    mo12642k0(this.f12820q);
                    if (v) {
                        this.f12828y.queueSecureInputBuffer(this.f12803M, 0, m17162a0(this.f12820q, i), j, 0);
                    } else {
                        this.f12828y.queueInputBuffer(this.f12803M, 0, this.f12820q.f11822h.limit(), j, 0);
                    }
                    m17170s0();
                    this.f12810T = true;
                    this.f12808R = 0;
                    this.f12816Z.f11814c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw C3848h.m16074a(e2, mo12431x());
                }
            } else {
                this.f12820q.mo12655k();
                if (this.f12808R == 2) {
                    this.f12808R = 1;
                }
                return true;
            }
        }
    }

    /* renamed from: W */
    private void m17161W() {
        if (C4284w.f13659a < 21) {
            this.f12800J = this.f12828y.getInputBuffers();
            this.f12801K = this.f12828y.getOutputBuffers();
        }
    }

    /* renamed from: a0 */
    private static MediaCodec.CryptoInfo m17162a0(C3895e eVar, int i) {
        MediaCodec.CryptoInfo a = eVar.f11821g.mo12662a();
        if (i == 0) {
            return a;
        }
        if (a.numBytesOfClearData == null) {
            a.numBytesOfClearData = new int[1];
        }
        int[] iArr = a.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return a;
    }

    /* renamed from: b0 */
    private ByteBuffer m17163b0(int i) {
        return C4284w.f13659a >= 21 ? this.f12828y.getInputBuffer(i) : this.f12800J[i];
    }

    /* renamed from: d0 */
    private ByteBuffer m17164d0(int i) {
        return C4284w.f13659a >= 21 ? this.f12828y.getOutputBuffer(i) : this.f12801K[i];
    }

    /* renamed from: e0 */
    private boolean m17165e0() {
        return this.f12804N >= 0;
    }

    /* renamed from: l0 */
    private void m17166l0() throws C3848h {
        if (this.f12809S == 2) {
            mo12931p0();
            mo12929f0();
            return;
        }
        this.f12813W = true;
        mo12644q0();
    }

    /* renamed from: n0 */
    private void m17167n0() {
        if (C4284w.f13659a < 21) {
            this.f12801K = this.f12828y.getOutputBuffers();
        }
    }

    /* renamed from: o0 */
    private void m17168o0() throws C3848h {
        MediaFormat outputFormat = this.f12828y.getOutputFormat();
        if (this.f12791A != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f12799I = true;
            return;
        }
        if (this.f12797G) {
            outputFormat.setInteger("channel-count", 1);
        }
        mo12641i0(this.f12828y, outputFormat);
    }

    /* renamed from: r0 */
    private void m17169r0() {
        if (C4284w.f13659a < 21) {
            this.f12800J = null;
            this.f12801K = null;
        }
    }

    /* renamed from: s0 */
    private void m17170s0() {
        this.f12803M = -1;
        this.f12820q.f11822h = null;
    }

    /* renamed from: t0 */
    private void m17171t0() {
        this.f12804N = -1;
        this.f12805O = null;
    }

    /* renamed from: v0 */
    private boolean m17172v0(long j) {
        int size = this.f12823t.size();
        for (int i = 0; i < size; i++) {
            if (this.f12823t.get(i).longValue() == j) {
                this.f12823t.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: w0 */
    private boolean m17173w0(boolean z) throws C3848h {
        if (this.f12826w == null || (!z && this.f12819p)) {
            return false;
        }
        int state = this.f12826w.getState();
        if (state != 1) {
            return state != 4;
        }
        throw C3848h.m16074a(this.f12826w.mo12705b(), mo12431x());
    }

    /* renamed from: y0 */
    private void m17174y0(C4048a aVar) throws C3848h {
        throw C3848h.m16074a(aVar, mo12431x());
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo12405A(boolean z) throws C3848h {
        this.f12816Z = new C3894d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo12406B(long j, boolean z) throws C3848h {
        this.f12812V = false;
        this.f12813W = false;
        if (this.f12828y != null) {
            mo12924U();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo12407C() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo12408D() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo12923I(MediaCodec mediaCodec, boolean z, C4109n nVar, C4109n nVar2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public abstract void mo12637Q(C4046a aVar, MediaCodec mediaCodec, C4109n nVar, MediaCrypto mediaCrypto) throws C4051d.C4054c;

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo12924U() throws C3848h {
        this.f12802L = -9223372036854775807L;
        m17170s0();
        m17171t0();
        this.f12815Y = true;
        this.f12814X = false;
        this.f12806P = false;
        this.f12823t.clear();
        this.f12798H = false;
        this.f12799I = false;
        if (this.f12793C || ((this.f12795E && this.f12811U) || this.f12809S != 0)) {
            mo12931p0();
            mo12929f0();
        } else {
            this.f12828y.flush();
            this.f12810T = false;
        }
        if (this.f12807Q && this.f12825v != null) {
            this.f12808R = 1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final MediaCodec mo12925V() {
        return this.f12828y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final C4046a mo12926X() {
        return this.f12829z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public C4046a mo12638Y(C4049c cVar, C4109n nVar, boolean z) throws C4051d.C4054c {
        return cVar.mo12934b(nVar.f12949k, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public long mo12927Z() {
        return 0;
    }

    /* renamed from: a */
    public final int mo12437a(C4109n nVar) throws C3848h {
        try {
            return mo12645x0(this.f12817n, this.f12818o, nVar);
        } catch (C4051d.C4054c e) {
            throw C3848h.m16074a(e, mo12431x());
        }
    }

    /* renamed from: b */
    public final int mo12412b() {
        return 8;
    }

    /* renamed from: c */
    public boolean mo12434c() {
        return this.f12813W;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public final MediaFormat mo12928c0(C4109n nVar) {
        MediaFormat v = nVar.mo13064v();
        if (C4284w.f13659a >= 23) {
            m17158R(v);
        }
        return v;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035 A[SYNTHETIC, Splitter:B:15:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12929f0() throws p148g.p189d.p190a.p200b.C3848h {
        /*
            r11 = this;
            android.media.MediaCodec r0 = r11.f12828y
            if (r0 != 0) goto L_0x0153
            g.d.a.b.n r0 = r11.f12825v
            if (r0 != 0) goto L_0x000a
            goto L_0x0153
        L_0x000a:
            g.d.a.b.j0.b<g.d.a.b.j0.e> r1 = r11.f12827x
            r11.f12826w = r1
            java.lang.String r0 = r0.f12949k
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x002f
            g.d.a.b.j0.d r1 = r1.mo12704a()
            g.d.a.b.j0.e r1 = (p148g.p189d.p190a.p200b.p203j0.C3908e) r1
            if (r1 != 0) goto L_0x0026
            g.d.a.b.j0.b<g.d.a.b.j0.e> r1 = r11.f12826w
            g.d.a.b.j0.b$a r1 = r1.mo12705b()
            if (r1 == 0) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            return
        L_0x0026:
            android.media.MediaCrypto r4 = r1.mo12710a()
            boolean r1 = r1.mo12711b(r0)
            goto L_0x0031
        L_0x002f:
            r4 = r3
            r1 = 0
        L_0x0031:
            g.d.a.b.l0.a r5 = r11.f12829z
            if (r5 != 0) goto L_0x0098
            g.d.a.b.l0.c r5 = r11.f12817n     // Catch:{ c -> 0x0089 }
            g.d.a.b.n r6 = r11.f12825v     // Catch:{ c -> 0x0089 }
            g.d.a.b.l0.a r5 = r11.mo12638Y(r5, r6, r1)     // Catch:{ c -> 0x0089 }
            r11.f12829z = r5     // Catch:{ c -> 0x0089 }
            if (r5 != 0) goto L_0x0076
            if (r1 == 0) goto L_0x0076
            g.d.a.b.l0.c r5 = r11.f12817n     // Catch:{ c -> 0x0089 }
            g.d.a.b.n r6 = r11.f12825v     // Catch:{ c -> 0x0089 }
            g.d.a.b.l0.a r2 = r11.mo12638Y(r5, r6, r2)     // Catch:{ c -> 0x0089 }
            r11.f12829z = r2     // Catch:{ c -> 0x0089 }
            if (r2 == 0) goto L_0x0076
            java.lang.String r2 = "MediaCodecRenderer"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ c -> 0x0089 }
            r5.<init>()     // Catch:{ c -> 0x0089 }
            java.lang.String r6 = "Drm session requires secure decoder for "
            r5.append(r6)     // Catch:{ c -> 0x0089 }
            r5.append(r0)     // Catch:{ c -> 0x0089 }
            java.lang.String r0 = ", but no secure decoder available. Trying to proceed with "
            r5.append(r0)     // Catch:{ c -> 0x0089 }
            g.d.a.b.l0.a r0 = r11.f12829z     // Catch:{ c -> 0x0089 }
            java.lang.String r0 = r0.f12784a     // Catch:{ c -> 0x0089 }
            r5.append(r0)     // Catch:{ c -> 0x0089 }
            java.lang.String r0 = "."
            r5.append(r0)     // Catch:{ c -> 0x0089 }
            java.lang.String r0 = r5.toString()     // Catch:{ c -> 0x0089 }
            android.util.Log.w(r2, r0)     // Catch:{ c -> 0x0089 }
        L_0x0076:
            g.d.a.b.l0.a r0 = r11.f12829z
            if (r0 == 0) goto L_0x007b
            goto L_0x0098
        L_0x007b:
            g.d.a.b.l0.b$a r0 = new g.d.a.b.l0.b$a
            g.d.a.b.n r2 = r11.f12825v
            r4 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>((p148g.p189d.p190a.p200b.C4109n) r2, (java.lang.Throwable) r3, (boolean) r1, (int) r4)
            r11.m17174y0(r0)
            throw r3
        L_0x0089:
            r0 = move-exception
            g.d.a.b.l0.b$a r2 = new g.d.a.b.l0.b$a
            g.d.a.b.n r4 = r11.f12825v
            r5 = -49998(0xffffffffffff3cb2, float:NaN)
            r2.<init>((p148g.p189d.p190a.p200b.C4109n) r4, (java.lang.Throwable) r0, (boolean) r1, (int) r5)
            r11.m17174y0(r2)
            throw r3
        L_0x0098:
            g.d.a.b.l0.a r0 = r11.f12829z
            boolean r0 = r11.mo12932u0(r0)
            if (r0 != 0) goto L_0x00a1
            return
        L_0x00a1:
            g.d.a.b.l0.a r0 = r11.f12829z
            java.lang.String r0 = r0.f12784a
            int r2 = r11.m17151J(r0)
            r11.f12791A = r2
            g.d.a.b.n r2 = r11.f12825v
            boolean r2 = m17152K(r0, r2)
            r11.f12792B = r2
            boolean r2 = m17156O(r0)
            r11.f12793C = r2
            boolean r2 = m17155N(r0)
            r11.f12794D = r2
            boolean r2 = m17153L(r0)
            r11.f12795E = r2
            boolean r2 = m17154M(r0)
            r11.f12796F = r2
            g.d.a.b.n r2 = r11.f12825v
            boolean r2 = m17157P(r0, r2)
            r11.f12797G = r2
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0147 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0147 }
            r2.<init>()     // Catch:{ Exception -> 0x0147 }
            java.lang.String r7 = "createCodec:"
            r2.append(r7)     // Catch:{ Exception -> 0x0147 }
            r2.append(r0)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0147 }
            p148g.p189d.p190a.p200b.p230r0.C4283v.m18224a(r2)     // Catch:{ Exception -> 0x0147 }
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0147 }
            r11.f12828y = r2     // Catch:{ Exception -> 0x0147 }
            p148g.p189d.p190a.p200b.p230r0.C4283v.m18226c()     // Catch:{ Exception -> 0x0147 }
            java.lang.String r2 = "configureCodec"
            p148g.p189d.p190a.p200b.p230r0.C4283v.m18224a(r2)     // Catch:{ Exception -> 0x0147 }
            g.d.a.b.l0.a r2 = r11.f12829z     // Catch:{ Exception -> 0x0147 }
            android.media.MediaCodec r7 = r11.f12828y     // Catch:{ Exception -> 0x0147 }
            g.d.a.b.n r8 = r11.f12825v     // Catch:{ Exception -> 0x0147 }
            r11.mo12637Q(r2, r7, r8, r4)     // Catch:{ Exception -> 0x0147 }
            p148g.p189d.p190a.p200b.p230r0.C4283v.m18226c()     // Catch:{ Exception -> 0x0147 }
            java.lang.String r2 = "startCodec"
            p148g.p189d.p190a.p200b.p230r0.C4283v.m18224a(r2)     // Catch:{ Exception -> 0x0147 }
            android.media.MediaCodec r2 = r11.f12828y     // Catch:{ Exception -> 0x0147 }
            r2.start()     // Catch:{ Exception -> 0x0147 }
            p148g.p189d.p190a.p200b.p230r0.C4283v.m18226c()     // Catch:{ Exception -> 0x0147 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0147 }
            long r9 = r7 - r5
            r5 = r11
            r6 = r0
            r5.mo12639g0(r6, r7, r9)     // Catch:{ Exception -> 0x0147 }
            r11.m17161W()     // Catch:{ Exception -> 0x0147 }
            int r0 = r11.getState()
            r1 = 2
            if (r0 != r1) goto L_0x012f
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x0134
        L_0x012f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0134:
            r11.f12802L = r0
            r11.m17170s0()
            r11.m17171t0()
            r0 = 1
            r11.f12815Y = r0
            g.d.a.b.i0.d r1 = r11.f12816Z
            int r2 = r1.f11812a
            int r2 = r2 + r0
            r1.f11812a = r2
            return
        L_0x0147:
            r2 = move-exception
            g.d.a.b.l0.b$a r4 = new g.d.a.b.l0.b$a
            g.d.a.b.n r5 = r11.f12825v
            r4.<init>((p148g.p189d.p190a.p200b.C4109n) r5, (java.lang.Throwable) r2, (boolean) r1, (java.lang.String) r0)
            r11.m17174y0(r4)
            throw r3
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p212l0.C4047b.mo12929f0():void");
    }

    /* renamed from: g */
    public boolean mo12435g() {
        return this.f12825v != null && !this.f12814X && (mo12432y() || m17165e0() || (this.f12802L != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f12802L));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public abstract void mo12639g0(String str, long j, long j2);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r5.f12954p == r0.f12954p) goto L_0x007a;
     */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12640h0(p148g.p189d.p190a.p200b.C4109n r5) throws p148g.p189d.p190a.p200b.C3848h {
        /*
            r4 = this;
            g.d.a.b.n r0 = r4.f12825v
            r4.f12825v = r5
            g.d.a.b.j0.a r5 = r5.f12952n
            r1 = 0
            if (r0 != 0) goto L_0x000b
            r2 = r1
            goto L_0x000d
        L_0x000b:
            g.d.a.b.j0.a r2 = r0.f12952n
        L_0x000d:
            boolean r5 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18236b(r5, r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0049
            g.d.a.b.n r5 = r4.f12825v
            g.d.a.b.j0.a r5 = r5.f12952n
            if (r5 == 0) goto L_0x0047
            g.d.a.b.j0.c<g.d.a.b.j0.e> r5 = r4.f12818o
            if (r5 == 0) goto L_0x0037
            android.os.Looper r1 = android.os.Looper.myLooper()
            g.d.a.b.n r3 = r4.f12825v
            g.d.a.b.j0.a r3 = r3.f12952n
            g.d.a.b.j0.b r5 = r5.mo12707a(r1, r3)
            r4.f12827x = r5
            g.d.a.b.j0.b<g.d.a.b.j0.e> r1 = r4.f12826w
            if (r5 != r1) goto L_0x0049
            g.d.a.b.j0.c<g.d.a.b.j0.e> r1 = r4.f12818o
            r1.mo12709c(r5)
            goto L_0x0049
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.mo12431x()
            g.d.a.b.h r5 = p148g.p189d.p190a.p200b.C3848h.m16074a(r5, r0)
            throw r5
        L_0x0047:
            r4.f12827x = r1
        L_0x0049:
            g.d.a.b.j0.b<g.d.a.b.j0.e> r5 = r4.f12827x
            g.d.a.b.j0.b<g.d.a.b.j0.e> r1 = r4.f12826w
            if (r5 != r1) goto L_0x007d
            android.media.MediaCodec r5 = r4.f12828y
            if (r5 == 0) goto L_0x007d
            g.d.a.b.l0.a r1 = r4.f12829z
            boolean r1 = r1.f12785b
            g.d.a.b.n r3 = r4.f12825v
            boolean r5 = r4.mo12923I(r5, r1, r0, r3)
            if (r5 == 0) goto L_0x007d
            r4.f12807Q = r2
            r4.f12808R = r2
            int r5 = r4.f12791A
            r1 = 2
            if (r5 == r1) goto L_0x007a
            if (r5 != r2) goto L_0x0079
            g.d.a.b.n r5 = r4.f12825v
            int r1 = r5.f12953o
            int r3 = r0.f12953o
            if (r1 != r3) goto L_0x0079
            int r5 = r5.f12954p
            int r0 = r0.f12954p
            if (r5 != r0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r2 = 0
        L_0x007a:
            r4.f12798H = r2
            goto L_0x008a
        L_0x007d:
            boolean r5 = r4.f12810T
            if (r5 == 0) goto L_0x0084
            r4.f12809S = r2
            goto L_0x008a
        L_0x0084:
            r4.mo12931p0()
            r4.mo12929f0()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p212l0.C4047b.mo12640h0(g.d.a.b.n):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public abstract void mo12641i0(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C3848h;

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void mo12930j0(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public abstract void mo12642k0(C3895e eVar);

    /* renamed from: l */
    public void mo12436l(long j, long j2) throws C3848h {
        if (this.f12813W) {
            mo12644q0();
            return;
        }
        if (this.f12825v == null) {
            this.f12821r.mo12655k();
            int F = mo12410F(this.f12822s, this.f12821r, true);
            if (F == -5) {
                mo12640h0(this.f12822s.f13171a);
            } else if (F == -4) {
                C4260a.m18074f(this.f12821r.mo12659o());
                this.f12812V = true;
                m17166l0();
                return;
            } else {
                return;
            }
        }
        mo12929f0();
        if (this.f12828y != null) {
            C4283v.m18224a("drainAndFeed");
            do {
            } while (m17159S(j, j2));
            do {
            } while (m17160T());
            C4283v.m18226c();
        } else {
            this.f12816Z.f11815d += mo12411G(j);
            this.f12821r.mo12655k();
            int F2 = mo12410F(this.f12822s, this.f12821r, false);
            if (F2 == -5) {
                mo12640h0(this.f12822s.f13171a);
            } else if (F2 == -4) {
                C4260a.m18074f(this.f12821r.mo12659o());
                this.f12812V = true;
                m17166l0();
            }
        }
        this.f12816Z.mo12669a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public abstract boolean mo12643m0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C3848h;

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo12931p0() {
        this.f12802L = -9223372036854775807L;
        m17170s0();
        m17171t0();
        this.f12814X = false;
        this.f12806P = false;
        this.f12823t.clear();
        m17169r0();
        this.f12829z = null;
        this.f12807Q = false;
        this.f12810T = false;
        this.f12792B = false;
        this.f12793C = false;
        this.f12791A = 0;
        this.f12794D = false;
        this.f12795E = false;
        this.f12797G = false;
        this.f12798H = false;
        this.f12799I = false;
        this.f12811U = false;
        this.f12808R = 0;
        this.f12809S = 0;
        MediaCodec mediaCodec = this.f12828y;
        if (mediaCodec != null) {
            this.f12816Z.f11813b++;
            try {
                mediaCodec.stop();
                try {
                    this.f12828y.release();
                    this.f12828y = null;
                    C3904b<C3908e> bVar = this.f12826w;
                    if (bVar != null && this.f12827x != bVar) {
                        try {
                            this.f12818o.mo12709c(bVar);
                        } finally {
                            this.f12826w = null;
                        }
                    }
                } catch (Throwable th) {
                    this.f12828y = null;
                    C3904b<C3908e> bVar2 = this.f12826w;
                    if (!(bVar2 == null || this.f12827x == bVar2)) {
                        this.f12818o.mo12709c(bVar2);
                    }
                    throw th;
                } finally {
                    this.f12826w = null;
                }
            } catch (Throwable th2) {
                this.f12828y = null;
                C3904b<C3908e> bVar3 = this.f12826w;
                if (!(bVar3 == null || this.f12827x == bVar3)) {
                    try {
                        this.f12818o.mo12709c(bVar3);
                    } finally {
                        this.f12826w = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo12644q0() throws C3848h {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public boolean mo12932u0(C4046a aVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public abstract int mo12645x0(C4049c cVar, C3906c<C3908e> cVar2, C4109n nVar) throws C4051d.C4054c;

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo12433z() {
        this.f12825v = null;
        try {
            mo12931p0();
            try {
                if (this.f12826w != null) {
                    this.f12818o.mo12709c(this.f12826w);
                }
                try {
                    if (!(this.f12827x == null || this.f12827x == this.f12826w)) {
                        this.f12818o.mo12709c(this.f12827x);
                    }
                } finally {
                    this.f12826w = null;
                    this.f12827x = null;
                }
            } catch (Throwable th) {
                if (!(this.f12827x == null || this.f12827x == this.f12826w)) {
                    this.f12818o.mo12709c(this.f12827x);
                }
                throw th;
            } finally {
                this.f12826w = null;
                this.f12827x = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.f12827x == null || this.f12827x == this.f12826w)) {
                    this.f12818o.mo12709c(this.f12827x);
                }
                throw th2;
            } finally {
                this.f12826w = null;
                this.f12827x = null;
            }
        } finally {
        }
    }
}
