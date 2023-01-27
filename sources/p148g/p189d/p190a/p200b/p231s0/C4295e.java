package p148g.p189d.p190a.p200b.p231s0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import p148g.p189d.p190a.p200b.C3828a;
import p148g.p189d.p190a.p200b.C3848h;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p202i0.C3894d;
import p148g.p189d.p190a.p200b.p202i0.C3895e;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p203j0.C3906c;
import p148g.p189d.p190a.p200b.p203j0.C3908e;
import p148g.p189d.p190a.p200b.p212l0.C4046a;
import p148g.p189d.p190a.p200b.p212l0.C4047b;
import p148g.p189d.p190a.p200b.p212l0.C4049c;
import p148g.p189d.p190a.p200b.p212l0.C4051d;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4269j;
import p148g.p189d.p190a.p200b.p230r0.C4283v;
import p148g.p189d.p190a.p200b.p230r0.C4284w;
import p148g.p189d.p190a.p200b.p231s0.C4303h;

@TargetApi(16)
/* renamed from: g.d.a.b.s0.e */
public class C4295e extends C4047b {

    /* renamed from: K0 */
    private static final int[] f13698K0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: A0 */
    private float f13699A0 = -1.0f;

    /* renamed from: B0 */
    private int f13700B0;

    /* renamed from: C0 */
    private int f13701C0;

    /* renamed from: D0 */
    private int f13702D0;

    /* renamed from: E0 */
    private float f13703E0;

    /* renamed from: F0 */
    private boolean f13704F0;

    /* renamed from: G0 */
    private int f13705G0;

    /* renamed from: H0 */
    C4298c f13706H0;

    /* renamed from: I0 */
    private long f13707I0 = -9223372036854775807L;

    /* renamed from: J0 */
    private int f13708J0;

    /* renamed from: b0 */
    private final Context f13709b0;

    /* renamed from: c0 */
    private final C4299f f13710c0;

    /* renamed from: d0 */
    private final C4303h.C4304a f13711d0;

    /* renamed from: e0 */
    private final long f13712e0;

    /* renamed from: f0 */
    private final int f13713f0;

    /* renamed from: g0 */
    private final boolean f13714g0 = m18285E0();

    /* renamed from: h0 */
    private final long[] f13715h0 = new long[10];

    /* renamed from: i0 */
    private C4109n[] f13716i0;

    /* renamed from: j0 */
    private C4297b f13717j0;

    /* renamed from: k0 */
    private boolean f13718k0;

    /* renamed from: l0 */
    private Surface f13719l0;

    /* renamed from: m0 */
    private Surface f13720m0;

    /* renamed from: n0 */
    private int f13721n0 = 1;

    /* renamed from: o0 */
    private boolean f13722o0;

    /* renamed from: p0 */
    private long f13723p0 = -9223372036854775807L;

    /* renamed from: q0 */
    private long f13724q0;

    /* renamed from: r0 */
    private int f13725r0;

    /* renamed from: s0 */
    private int f13726s0;

    /* renamed from: t0 */
    private int f13727t0;

    /* renamed from: u0 */
    private long f13728u0;

    /* renamed from: v0 */
    private int f13729v0;

    /* renamed from: w0 */
    private float f13730w0 = -1.0f;

    /* renamed from: x0 */
    private int f13731x0 = -1;

    /* renamed from: y0 */
    private int f13732y0 = -1;

    /* renamed from: z0 */
    private int f13733z0;

    /* renamed from: g.d.a.b.s0.e$b */
    protected static final class C4297b {

        /* renamed from: a */
        public final int f13734a;

        /* renamed from: b */
        public final int f13735b;

        /* renamed from: c */
        public final int f13736c;

        public C4297b(int i, int i2, int i3) {
            this.f13734a = i;
            this.f13735b = i2;
            this.f13736c = i3;
        }
    }

    @TargetApi(23)
    /* renamed from: g.d.a.b.s0.e$c */
    private final class C4298c implements MediaCodec.OnFrameRenderedListener {
        private C4298c(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            C4295e eVar = C4295e.this;
            if (this == eVar.f13706H0) {
                eVar.mo13525R0();
            }
        }
    }

    public C4295e(Context context, C4049c cVar, long j, C3906c<C3908e> cVar2, boolean z, Handler handler, C4303h hVar, int i) {
        super(2, cVar, cVar2, z);
        this.f13712e0 = j;
        this.f13713f0 = i;
        this.f13709b0 = context.getApplicationContext();
        this.f13710c0 = new C4299f(context);
        this.f13711d0 = new C4303h.C4304a(handler, hVar);
        m18282B0();
    }

    /* renamed from: A0 */
    private void m18281A0() {
        MediaCodec V;
        this.f13722o0 = false;
        if (C4284w.f13659a >= 23 && this.f13704F0 && (V = mo12925V()) != null) {
            this.f13706H0 = new C4298c(V);
        }
    }

    /* renamed from: B0 */
    private void m18282B0() {
        this.f13700B0 = -1;
        this.f13701C0 = -1;
        this.f13703E0 = -1.0f;
        this.f13702D0 = -1;
    }

    /* renamed from: C0 */
    private static boolean m18283C0(String str) {
        return (("deb".equals(C4284w.f13660b) || "flo".equals(C4284w.f13660b) || "mido".equals(C4284w.f13660b) || "santoni".equals(C4284w.f13660b)) && "OMX.qcom.video.decoder.avc".equals(str)) || (("tcl_eu".equals(C4284w.f13660b) || "SVP-DTV15".equals(C4284w.f13660b) || "BRAVIA_ATV2".equals(C4284w.f13660b) || C4284w.f13660b.startsWith("panell_") || "F3311".equals(C4284w.f13660b) || "M5c".equals(C4284w.f13660b) || "A7010a48".equals(C4284w.f13660b)) && "OMX.MTK.VIDEO.DECODER.AVC".equals(str)) || (("ALE-L21".equals(C4284w.f13662d) || "CAM-L21".equals(C4284w.f13662d)) && "OMX.k3.video.decoder.avc".equals(str));
    }

    @TargetApi(21)
    /* renamed from: D0 */
    private static void m18284D0(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* renamed from: E0 */
    private static boolean m18285E0() {
        return C4284w.f13659a <= 22 && "foster".equals(C4284w.f13660b) && "NVIDIA".equals(C4284w.f13661c);
    }

    /* renamed from: G0 */
    private static Point m18286G0(C4046a aVar, C4109n nVar) throws C4051d.C4054c {
        boolean z = nVar.f12954p > nVar.f12953o;
        int i = z ? nVar.f12954p : nVar.f12953o;
        int i2 = z ? nVar.f12953o : nVar.f12954p;
        float f = ((float) i2) / ((float) i);
        for (int i3 : f13698K0) {
            int i4 = (int) (((float) i3) * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (C4284w.f13659a >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point b = aVar.mo12917b(i5, i3);
                if (aVar.mo12922n(b.x, b.y, (double) nVar.f12955q)) {
                    return b;
                }
            } else {
                int e = C4284w.m18239e(i3, 16) * 16;
                int e2 = C4284w.m18239e(i4, 16) * 16;
                if (e * e2 <= C4051d.m17221l()) {
                    int i6 = z ? e2 : e;
                    if (!z) {
                        e = e2;
                    }
                    return new Point(i6, e);
                }
            }
        }
        return null;
    }

    /* renamed from: I0 */
    private static int m18287I0(C4109n nVar) {
        if (nVar.f12950l == -1) {
            return m18288J0(nVar.f12949k, nVar.f12953o, nVar.f12954p);
        }
        int size = nVar.f12951m.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += nVar.f12951m.get(i2).length;
        }
        return nVar.f12950l + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m18288J0(java.lang.String r7, int r8, int r9) {
        /*
            r0 = -1
            if (r8 == r0) goto L_0x0086
            if (r9 != r0) goto L_0x0007
            goto L_0x0086
        L_0x0007:
            int r1 = r7.hashCode()
            r2 = 5
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x0046;
                case -1662541442: goto L_0x003c;
                case 1187890754: goto L_0x0032;
                case 1331836730: goto L_0x0028;
                case 1599127256: goto L_0x001e;
                case 1599127257: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 5
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 3
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "video/avc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 2
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "video/mp4v-es"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 1
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "video/hevc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 4
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "video/3gpp"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 0
            goto L_0x0051
        L_0x0050:
            r7 = -1
        L_0x0051:
            if (r7 == 0) goto L_0x007d
            if (r7 == r3) goto L_0x007d
            if (r7 == r6) goto L_0x0061
            if (r7 == r5) goto L_0x007d
            if (r7 == r4) goto L_0x005e
            if (r7 == r2) goto L_0x005e
            return r0
        L_0x005e:
            int r8 = r8 * r9
            goto L_0x0080
        L_0x0061:
            java.lang.String r7 = p148g.p189d.p190a.p200b.p230r0.C4284w.f13662d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x006c
            return r0
        L_0x006c:
            r7 = 16
            int r8 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18239e(r8, r7)
            int r9 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18239e(r9, r7)
            int r8 = r8 * r9
            int r8 = r8 * 16
            int r8 = r8 * 16
            goto L_0x007f
        L_0x007d:
            int r8 = r8 * r9
        L_0x007f:
            r4 = 2
        L_0x0080:
            int r8 = r8 * 3
            int r4 = r4 * 2
            int r8 = r8 / r4
            return r8
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p231s0.C4295e.m18288J0(java.lang.String, int, int):int");
    }

    /* renamed from: L0 */
    private static float m18289L0(C4109n nVar) {
        float f = nVar.f12957s;
        if (f == -1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: M0 */
    private static int m18290M0(C4109n nVar) {
        int i = nVar.f12956r;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* renamed from: N0 */
    private static boolean m18291N0(long j) {
        return j < -30000;
    }

    /* renamed from: O0 */
    private static boolean m18292O0(long j) {
        return j < -500000;
    }

    /* renamed from: Q0 */
    private void m18293Q0() {
        if (this.f13725r0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f13711d0.mo13548d(this.f13725r0, elapsedRealtime - this.f13724q0);
            this.f13725r0 = 0;
            this.f13724q0 = elapsedRealtime;
        }
    }

    /* renamed from: S0 */
    private void m18294S0() {
        if (this.f13731x0 != -1 || this.f13732y0 != -1) {
            if (this.f13700B0 != this.f13731x0 || this.f13701C0 != this.f13732y0 || this.f13702D0 != this.f13733z0 || this.f13703E0 != this.f13699A0) {
                this.f13711d0.mo13552h(this.f13731x0, this.f13732y0, this.f13733z0, this.f13699A0);
                this.f13700B0 = this.f13731x0;
                this.f13701C0 = this.f13732y0;
                this.f13702D0 = this.f13733z0;
                this.f13703E0 = this.f13699A0;
            }
        }
    }

    /* renamed from: T0 */
    private void m18295T0() {
        if (this.f13722o0) {
            this.f13711d0.mo13551g(this.f13719l0);
        }
    }

    /* renamed from: U0 */
    private void m18296U0() {
        if (this.f13700B0 != -1 || this.f13701C0 != -1) {
            this.f13711d0.mo13552h(this.f13700B0, this.f13701C0, this.f13702D0, this.f13703E0);
        }
    }

    /* renamed from: X0 */
    private void m18297X0() {
        this.f13723p0 = this.f13712e0 > 0 ? SystemClock.elapsedRealtime() + this.f13712e0 : -9223372036854775807L;
    }

    @TargetApi(23)
    /* renamed from: Y0 */
    private static void m18298Y0(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    /* renamed from: Z0 */
    private void m18299Z0(Surface surface) throws C3848h {
        if (surface == null) {
            Surface surface2 = this.f13720m0;
            if (surface2 != null) {
                surface = surface2;
            } else {
                C4046a X = mo12926X();
                if (X != null && m18301e1(X)) {
                    surface = C4291c.m18275d(this.f13709b0, X.f12787d);
                    this.f13720m0 = surface;
                }
            }
        }
        if (this.f13719l0 != surface) {
            this.f13719l0 = surface;
            int state = getState();
            if (state == 1 || state == 2) {
                MediaCodec V = mo12925V();
                if (C4284w.f13659a < 23 || V == null || surface == null || this.f13718k0) {
                    mo12931p0();
                    mo12929f0();
                } else {
                    m18298Y0(V, surface);
                }
            }
            if (surface == null || surface == this.f13720m0) {
                m18282B0();
                m18281A0();
                return;
            }
            m18296U0();
            m18281A0();
            if (state == 2) {
                m18297X0();
            }
        } else if (surface != null && surface != this.f13720m0) {
            m18296U0();
            m18295T0();
        }
    }

    /* renamed from: a1 */
    private static void m18300a1(MediaCodec mediaCodec, int i) {
        mediaCodec.setVideoScalingMode(i);
    }

    /* renamed from: e1 */
    private boolean m18301e1(C4046a aVar) {
        return C4284w.f13659a >= 23 && !this.f13704F0 && !m18283C0(aVar.f12784a) && (!aVar.f12787d || C4291c.m18274c(this.f13709b0));
    }

    /* renamed from: z0 */
    private static boolean m18302z0(boolean z, C4109n nVar, C4109n nVar2) {
        return nVar.f12949k.equals(nVar2.f12949k) && m18290M0(nVar) == m18290M0(nVar2) && (z || (nVar.f12953o == nVar2.f12953o && nVar.f12954p == nVar2.f12954p));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo12405A(boolean z) throws C3848h {
        super.mo12405A(z);
        int i = mo12430w().f11531a;
        this.f13705G0 = i;
        this.f13704F0 = i != 0;
        this.f13711d0.mo13549e(this.f12816Z);
        this.f13710c0.mo13536e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo12406B(long j, boolean z) throws C3848h {
        super.mo12406B(j, z);
        m18281A0();
        this.f13726s0 = 0;
        int i = this.f13708J0;
        if (i != 0) {
            this.f13707I0 = this.f13715h0[i - 1];
            this.f13708J0 = 0;
        }
        if (z) {
            m18297X0();
        } else {
            this.f13723p0 = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo12407C() {
        super.mo12407C();
        this.f13725r0 = 0;
        this.f13724q0 = SystemClock.elapsedRealtime();
        this.f13728u0 = SystemClock.elapsedRealtime() * 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo12408D() {
        this.f13723p0 = -9223372036854775807L;
        m18293Q0();
        super.mo12408D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo12409E(C4109n[] nVarArr, long j) throws C3848h {
        this.f13716i0 = nVarArr;
        if (this.f13707I0 == -9223372036854775807L) {
            this.f13707I0 = j;
        } else {
            int i = this.f13708J0;
            if (i == this.f13715h0.length) {
                Log.w("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + this.f13715h0[this.f13708J0 - 1]);
            } else {
                this.f13708J0 = i + 1;
            }
            this.f13715h0[this.f13708J0 - 1] = j;
        }
        super.mo12409E(nVarArr, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public void mo13521F0(MediaCodec mediaCodec, int i, long j) {
        C4283v.m18224a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C4283v.m18226c();
        mo13532g1(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public C4297b mo13522H0(C4046a aVar, C4109n nVar, C4109n[] nVarArr) throws C4051d.C4054c {
        int i = nVar.f12953o;
        int i2 = nVar.f12954p;
        int I0 = m18287I0(nVar);
        if (nVarArr.length == 1) {
            return new C4297b(i, i2, I0);
        }
        boolean z = false;
        for (C4109n nVar2 : nVarArr) {
            if (m18302z0(aVar.f12785b, nVar, nVar2)) {
                z |= nVar2.f12953o == -1 || nVar2.f12954p == -1;
                i = Math.max(i, nVar2.f12953o);
                i2 = Math.max(i2, nVar2.f12954p);
                I0 = Math.max(I0, m18287I0(nVar2));
            }
        }
        if (z) {
            Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point G0 = m18286G0(aVar, nVar);
            if (G0 != null) {
                i = Math.max(i, G0.x);
                i2 = Math.max(i2, G0.y);
                I0 = Math.max(I0, m18288J0(nVar.f12949k, i, i2));
                Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new C4297b(i, i2, I0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo12923I(MediaCodec mediaCodec, boolean z, C4109n nVar, C4109n nVar2) {
        if (m18302z0(z, nVar, nVar2)) {
            int i = nVar2.f12953o;
            C4297b bVar = this.f13717j0;
            return i <= bVar.f13734a && nVar2.f12954p <= bVar.f13735b && m18287I0(nVar2) <= this.f13717j0.f13736c;
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    /* renamed from: K0 */
    public MediaFormat mo13523K0(C4109n nVar, C4297b bVar, boolean z, int i) {
        MediaFormat c0 = mo12928c0(nVar);
        c0.setInteger("max-width", bVar.f13734a);
        c0.setInteger("max-height", bVar.f13735b);
        int i2 = bVar.f13736c;
        if (i2 != -1) {
            c0.setInteger("max-input-size", i2);
        }
        if (z) {
            c0.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m18284D0(c0, i);
        }
        return c0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public boolean mo13524P0(MediaCodec mediaCodec, int i, long j, long j2) throws C3848h {
        int G = mo12411G(j2);
        if (G == 0) {
            return false;
        }
        this.f12816Z.f11820i++;
        mo13532g1(this.f13727t0 + G);
        mo12924U();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo12637Q(C4046a aVar, MediaCodec mediaCodec, C4109n nVar, MediaCrypto mediaCrypto) throws C4051d.C4054c {
        C4297b H0 = mo13522H0(aVar, nVar, this.f13716i0);
        this.f13717j0 = H0;
        MediaFormat K0 = mo13523K0(nVar, H0, this.f13714g0, this.f13705G0);
        if (this.f13719l0 == null) {
            C4260a.m18074f(m18301e1(aVar));
            if (this.f13720m0 == null) {
                this.f13720m0 = C4291c.m18275d(this.f13709b0, aVar.f12787d);
            }
            this.f13719l0 = this.f13720m0;
        }
        mediaCodec.configure(K0, this.f13719l0, mediaCrypto, 0);
        if (C4284w.f13659a >= 23 && this.f13704F0) {
            this.f13706H0 = new C4298c(mediaCodec);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void mo13525R0() {
        if (!this.f13722o0) {
            this.f13722o0 = true;
            this.f13711d0.mo13551g(this.f13719l0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo12924U() throws C3848h {
        super.mo12924U();
        this.f13727t0 = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public void mo13526V0(MediaCodec mediaCodec, int i, long j) {
        m18294S0();
        C4283v.m18224a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C4283v.m18226c();
        this.f13728u0 = SystemClock.elapsedRealtime() * 1000;
        this.f12816Z.f11816e++;
        this.f13726s0 = 0;
        mo13525R0();
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    /* renamed from: W0 */
    public void mo13527W0(MediaCodec mediaCodec, int i, long j, long j2) {
        m18294S0();
        C4283v.m18224a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        C4283v.m18226c();
        this.f13728u0 = SystemClock.elapsedRealtime() * 1000;
        this.f12816Z.f11816e++;
        this.f13726s0 = 0;
        mo13525R0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b1 */
    public boolean mo13528b1(long j, long j2) {
        return m18292O0(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c1 */
    public boolean mo13529c1(long j, long j2) {
        return m18291N0(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d1 */
    public boolean mo13530d1(long j, long j2) {
        return m18291N0(j) && j2 > 100000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f1 */
    public void mo13531f1(MediaCodec mediaCodec, int i, long j) {
        C4283v.m18224a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C4283v.m18226c();
        this.f12816Z.f11817f++;
    }

    /* renamed from: g */
    public boolean mo12435g() {
        Surface surface;
        if (super.mo12435g() && (this.f13722o0 || (((surface = this.f13720m0) != null && this.f13719l0 == surface) || mo12925V() == null || this.f13704F0))) {
            this.f13723p0 = -9223372036854775807L;
            return true;
        } else if (this.f13723p0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f13723p0) {
                return true;
            }
            this.f13723p0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public void mo12639g0(String str, long j, long j2) {
        this.f13711d0.mo13546b(str, j, j2);
        this.f13718k0 = m18283C0(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public void mo13532g1(int i) {
        C3894d dVar = this.f12816Z;
        dVar.f11818g += i;
        this.f13725r0 += i;
        int i2 = this.f13726s0 + i;
        this.f13726s0 = i2;
        dVar.f11819h = Math.max(i2, dVar.f11819h);
        if (this.f13725r0 >= this.f13713f0) {
            m18293Q0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public void mo12640h0(C4109n nVar) throws C3848h {
        super.mo12640h0(nVar);
        this.f13711d0.mo13550f(nVar);
        this.f13730w0 = m18289L0(nVar);
        this.f13729v0 = m18290M0(nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void mo12641i0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.f13731x0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        this.f13732y0 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f13699A0 = this.f13730w0;
        if (C4284w.f13659a >= 21) {
            int i = this.f13729v0;
            if (i == 90 || i == 270) {
                int i2 = this.f13731x0;
                this.f13731x0 = this.f13732y0;
                this.f13732y0 = i2;
                this.f13699A0 = 1.0f / this.f13699A0;
            }
        } else {
            this.f13733z0 = this.f13729v0;
        }
        m18300a1(mediaCodec, this.f13721n0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void mo12930j0(long j) {
        this.f13727t0--;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public void mo12642k0(C3895e eVar) {
        this.f13727t0++;
        if (C4284w.f13659a < 23 && this.f13704F0) {
            mo13525R0();
        }
    }

    /* renamed from: m */
    public void mo12419m(int i, Object obj) throws C3848h {
        if (i == 1) {
            m18299Z0((Surface) obj);
        } else if (i == 4) {
            this.f13721n0 = ((Integer) obj).intValue();
            MediaCodec V = mo12925V();
            if (V != null) {
                m18300a1(V, this.f13721n0);
            }
        } else {
            super.mo12419m(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public boolean mo12643m0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C3848h {
        long j4;
        long j5 = j2;
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j6 = j3;
        while (true) {
            int i4 = this.f13708J0;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.f13715h0;
            if (j6 < jArr[0]) {
                break;
            }
            this.f13707I0 = jArr[0];
            int i5 = i4 - 1;
            this.f13708J0 = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j7 = j6 - this.f13707I0;
        if (z) {
            mo13531f1(mediaCodec2, i3, j7);
            return true;
        }
        long j8 = j6 - j;
        if (this.f13719l0 != this.f13720m0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            boolean z2 = getState() == 2;
            if (this.f13722o0) {
                long j9 = j7;
                if (z2 && mo13530d1(j8, elapsedRealtime - this.f13728u0)) {
                    j4 = j9;
                } else if (!z2) {
                    return false;
                } else {
                    long j10 = j8 - (elapsedRealtime - j5);
                    long nanoTime = System.nanoTime();
                    long b = this.f13710c0.mo13534b(j6, (j10 * 1000) + nanoTime);
                    long j11 = (b - nanoTime) / 1000;
                    if (mo13528b1(j11, j5) && mo13524P0(mediaCodec, i, j9, j)) {
                        return false;
                    }
                    long j12 = j9;
                    if (mo13529c1(j11, j5)) {
                        mo13521F0(mediaCodec2, i3, j12);
                        return true;
                    } else if (C4284w.f13659a >= 21) {
                        if (j11 >= 50000) {
                            return false;
                        }
                        mo13527W0(mediaCodec, i, j12, b);
                        return true;
                    } else if (j11 >= 30000) {
                        return false;
                    } else {
                        if (j11 > 11000) {
                            try {
                                Thread.sleep((j11 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        mo13526V0(mediaCodec2, i3, j12);
                        return true;
                    }
                }
            } else {
                j4 = j7;
            }
            if (C4284w.f13659a >= 21) {
                mo13527W0(mediaCodec, i, j4, System.nanoTime());
                return true;
            }
            mo13526V0(mediaCodec2, i3, j4);
            return true;
        } else if (!m18291N0(j8)) {
            return false;
        } else {
            mo13531f1(mediaCodec2, i3, j7);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo12931p0() {
        try {
            super.mo12931p0();
        } finally {
            this.f13727t0 = 0;
            Surface surface = this.f13720m0;
            if (surface != null) {
                if (this.f13719l0 == surface) {
                    this.f13719l0 = null;
                }
                this.f13720m0.release();
                this.f13720m0 = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public boolean mo12932u0(C4046a aVar) {
        return this.f13719l0 != null || m18301e1(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public int mo12645x0(C4049c cVar, C3906c<C3908e> cVar2, C4109n nVar) throws C4051d.C4054c {
        boolean z;
        int i;
        int i2;
        String str = nVar.f12949k;
        int i3 = 0;
        if (!C4269j.m18117h(str)) {
            return 0;
        }
        C3900a aVar = nVar.f12952n;
        if (aVar != null) {
            z = false;
            for (int i4 = 0; i4 < aVar.f11844i; i4++) {
                z |= aVar.mo12686c(i4).f11849j;
            }
        } else {
            z = false;
        }
        C4046a b = cVar.mo12934b(str, z);
        boolean z2 = true;
        if (b == null) {
            return (!z || cVar.mo12934b(str, false) == null) ? 1 : 2;
        }
        if (!C3828a.m15879H(cVar2, aVar)) {
            return 2;
        }
        boolean i5 = b.mo12921i(nVar.f12946h);
        if (i5 && (i = nVar.f12953o) > 0 && (i2 = nVar.f12954p) > 0) {
            if (C4284w.f13659a >= 21) {
                i5 = b.mo12922n(i, i2, (double) nVar.f12955q);
            } else {
                if (i * i2 > C4051d.m17221l()) {
                    z2 = false;
                }
                if (!z2) {
                    Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + nVar.f12953o + "x" + nVar.f12954p + "] [" + C4284w.f13663e + "]");
                }
                i5 = z2;
            }
        }
        int i6 = b.f12785b ? 16 : 8;
        if (b.f12786c) {
            i3 = 32;
        }
        return (i5 ? 4 : 3) | i6 | i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo12433z() {
        this.f13731x0 = -1;
        this.f13732y0 = -1;
        this.f13699A0 = -1.0f;
        this.f13730w0 = -1.0f;
        this.f13707I0 = -9223372036854775807L;
        this.f13708J0 = 0;
        m18282B0();
        m18281A0();
        this.f13710c0.mo13535d();
        this.f13706H0 = null;
        this.f13704F0 = false;
        try {
            super.mo12433z();
        } finally {
            this.f12816Z.mo12669a();
            this.f13711d0.mo13547c(this.f12816Z);
        }
    }
}
