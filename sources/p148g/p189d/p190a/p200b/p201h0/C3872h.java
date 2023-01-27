package p148g.p189d.p190a.p200b.p201h0;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import p148g.p189d.p190a.p200b.C3830b;
import p148g.p189d.p190a.p200b.C4315w;
import p148g.p189d.p190a.p200b.p201h0.C3866f;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.h0.h */
public final class C3872h implements C3866f {

    /* renamed from: l0 */
    public static boolean f11636l0 = false;

    /* renamed from: m0 */
    public static boolean f11637m0 = false;

    /* renamed from: A */
    private C4315w f11638A;

    /* renamed from: B */
    private long f11639B;

    /* renamed from: C */
    private long f11640C;

    /* renamed from: D */
    private ByteBuffer f11641D;

    /* renamed from: E */
    private int f11642E;

    /* renamed from: F */
    private int f11643F;

    /* renamed from: G */
    private int f11644G;

    /* renamed from: H */
    private long f11645H;

    /* renamed from: I */
    private long f11646I;

    /* renamed from: J */
    private boolean f11647J;

    /* renamed from: K */
    private long f11648K;

    /* renamed from: L */
    private Method f11649L;

    /* renamed from: M */
    private int f11650M;

    /* renamed from: N */
    private long f11651N;

    /* renamed from: O */
    private long f11652O;

    /* renamed from: P */
    private int f11653P;

    /* renamed from: Q */
    private long f11654Q;

    /* renamed from: R */
    private long f11655R;

    /* renamed from: S */
    private int f11656S;

    /* renamed from: T */
    private int f11657T;

    /* renamed from: U */
    private long f11658U;

    /* renamed from: V */
    private long f11659V;

    /* renamed from: W */
    private long f11660W;

    /* renamed from: X */
    private float f11661X;

    /* renamed from: Y */
    private C3856d[] f11662Y;

    /* renamed from: Z */
    private ByteBuffer[] f11663Z;

    /* renamed from: a */
    private final C3855c f11664a;

    /* renamed from: a0 */
    private ByteBuffer f11665a0;

    /* renamed from: b */
    private final boolean f11666b;

    /* renamed from: b0 */
    private ByteBuffer f11667b0;

    /* renamed from: c */
    private final C3871g f11668c;

    /* renamed from: c0 */
    private byte[] f11669c0;

    /* renamed from: d */
    private final C3887o f11670d;

    /* renamed from: d0 */
    private int f11671d0;

    /* renamed from: e */
    private final C3886n f11672e;

    /* renamed from: e0 */
    private int f11673e0;

    /* renamed from: f */
    private final C3856d[] f11674f;

    /* renamed from: f0 */
    private boolean f11675f0;

    /* renamed from: g */
    private final C3856d[] f11676g;

    /* renamed from: g0 */
    private boolean f11677g0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ConditionVariable f11678h;

    /* renamed from: h0 */
    private int f11679h0;

    /* renamed from: i */
    private final long[] f11680i;

    /* renamed from: i0 */
    private boolean f11681i0;

    /* renamed from: j */
    private final C3875c f11682j;

    /* renamed from: j0 */
    private boolean f11683j0;

    /* renamed from: k */
    private final ArrayDeque<C3878f> f11684k;

    /* renamed from: k0 */
    private long f11685k0;

    /* renamed from: l */
    private C3866f.C3869c f11686l;

    /* renamed from: m */
    private AudioTrack f11687m;

    /* renamed from: n */
    private AudioTrack f11688n;

    /* renamed from: o */
    private boolean f11689o;

    /* renamed from: p */
    private boolean f11690p;

    /* renamed from: q */
    private int f11691q;

    /* renamed from: r */
    private int f11692r;

    /* renamed from: s */
    private int f11693s;

    /* renamed from: t */
    private int f11694t;

    /* renamed from: u */
    private C3852b f11695u;

    /* renamed from: v */
    private boolean f11696v;

    /* renamed from: w */
    private boolean f11697w;

    /* renamed from: x */
    private int f11698x;

    /* renamed from: y */
    private long f11699y;

    /* renamed from: z */
    private C4315w f11700z;

    /* renamed from: g.d.a.b.h0.h$a */
    class C3873a extends Thread {

        /* renamed from: f */
        final /* synthetic */ AudioTrack f11701f;

        C3873a(AudioTrack audioTrack) {
            this.f11701f = audioTrack;
        }

        public void run() {
            try {
                this.f11701f.flush();
                this.f11701f.release();
            } finally {
                C3872h.this.f11678h.open();
            }
        }
    }

    /* renamed from: g.d.a.b.h0.h$b */
    class C3874b extends Thread {

        /* renamed from: f */
        final /* synthetic */ AudioTrack f11703f;

        C3874b(C3872h hVar, AudioTrack audioTrack) {
            this.f11703f = audioTrack;
        }

        public void run() {
            this.f11703f.release();
        }
    }

    /* renamed from: g.d.a.b.h0.h$c */
    private static class C3875c {

        /* renamed from: a */
        protected AudioTrack f11704a;

        /* renamed from: b */
        private boolean f11705b;

        /* renamed from: c */
        private int f11706c;

        /* renamed from: d */
        private long f11707d;

        /* renamed from: e */
        private long f11708e;

        /* renamed from: f */
        private long f11709f;

        /* renamed from: g */
        private long f11710g;

        /* renamed from: h */
        private long f11711h;

        /* renamed from: i */
        private long f11712i;

        /* renamed from: j */
        private long f11713j;

        private C3875c() {
        }

        /* synthetic */ C3875c(C3873a aVar) {
            this();
        }

        /* renamed from: a */
        public long mo12624a() {
            if (this.f11710g != -9223372036854775807L) {
                return Math.min(this.f11713j, this.f11712i + ((((SystemClock.elapsedRealtime() * 1000) - this.f11710g) * ((long) this.f11706c)) / 1000000));
            }
            int playState = this.f11704a.getPlayState();
            if (playState == 1) {
                return 0;
            }
            long playbackHeadPosition = 4294967295L & ((long) this.f11704a.getPlaybackHeadPosition());
            if (this.f11705b) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f11709f = this.f11707d;
                }
                playbackHeadPosition += this.f11709f;
            }
            if (C4284w.f13659a <= 28) {
                if (playbackHeadPosition == 0 && this.f11707d > 0 && playState == 3) {
                    if (this.f11711h == -9223372036854775807L) {
                        this.f11711h = SystemClock.elapsedRealtime();
                    }
                    return this.f11707d;
                }
                this.f11711h = -9223372036854775807L;
            }
            if (this.f11707d > playbackHeadPosition) {
                this.f11708e++;
            }
            this.f11707d = playbackHeadPosition;
            return playbackHeadPosition + (this.f11708e << 32);
        }

        /* renamed from: b */
        public long mo12625b() {
            return (mo12624a() * 1000000) / ((long) this.f11706c);
        }

        /* renamed from: c */
        public long mo12626c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public long mo12627d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public void mo12628e(long j) {
            this.f11712i = mo12624a();
            this.f11710g = SystemClock.elapsedRealtime() * 1000;
            this.f11713j = j;
            this.f11704a.stop();
        }

        /* renamed from: f */
        public boolean mo12629f(long j) {
            return this.f11711h != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f11711h >= 200;
        }

        /* renamed from: g */
        public void mo12630g() {
            if (this.f11710g == -9223372036854775807L) {
                this.f11704a.pause();
            }
        }

        /* renamed from: h */
        public void mo12631h(AudioTrack audioTrack, boolean z) {
            this.f11704a = audioTrack;
            this.f11705b = z;
            this.f11710g = -9223372036854775807L;
            this.f11711h = -9223372036854775807L;
            this.f11707d = 0;
            this.f11708e = 0;
            this.f11709f = 0;
            if (audioTrack != null) {
                this.f11706c = audioTrack.getSampleRate();
            }
        }

        /* renamed from: i */
        public boolean mo12632i() {
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: g.d.a.b.h0.h$d */
    private static class C3876d extends C3875c {

        /* renamed from: k */
        private final AudioTimestamp f11714k = new AudioTimestamp();

        /* renamed from: l */
        private long f11715l;

        /* renamed from: m */
        private long f11716m;

        /* renamed from: n */
        private long f11717n;

        public C3876d() {
            super((C3873a) null);
        }

        /* renamed from: c */
        public long mo12626c() {
            return this.f11717n;
        }

        /* renamed from: d */
        public long mo12627d() {
            return this.f11714k.nanoTime;
        }

        /* renamed from: h */
        public void mo12631h(AudioTrack audioTrack, boolean z) {
            super.mo12631h(audioTrack, z);
            this.f11715l = 0;
            this.f11716m = 0;
            this.f11717n = 0;
        }

        /* renamed from: i */
        public boolean mo12632i() {
            boolean timestamp = this.f11704a.getTimestamp(this.f11714k);
            if (timestamp) {
                long j = this.f11714k.framePosition;
                if (this.f11716m > j) {
                    this.f11715l++;
                }
                this.f11716m = j;
                this.f11717n = j + (this.f11715l << 32);
            }
            return timestamp;
        }
    }

    /* renamed from: g.d.a.b.h0.h$e */
    public static final class C3877e extends RuntimeException {
        public C3877e(String str) {
            super(str);
        }
    }

    /* renamed from: g.d.a.b.h0.h$f */
    private static final class C3878f {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C4315w f11718a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f11719b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f11720c;

        private C3878f(C4315w wVar, long j, long j2) {
            this.f11718a = wVar;
            this.f11719b = j;
            this.f11720c = j2;
        }

        /* synthetic */ C3878f(C4315w wVar, long j, long j2, C3873a aVar) {
            this(wVar, j, j2);
        }
    }

    public C3872h(C3855c cVar, C3856d[] dVarArr) {
        this(cVar, dVarArr, false);
    }

    public C3872h(C3855c cVar, C3856d[] dVarArr, boolean z) {
        this.f11664a = cVar;
        this.f11666b = z;
        this.f11678h = new ConditionVariable(true);
        if (C4284w.f13659a >= 18) {
            try {
                this.f11649L = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f11682j = C4284w.f13659a >= 19 ? new C3876d() : new C3875c((C3873a) null);
        this.f11668c = new C3871g();
        this.f11670d = new C3887o();
        this.f11672e = new C3886n();
        C3856d[] dVarArr2 = new C3856d[(dVarArr.length + 4)];
        this.f11674f = dVarArr2;
        dVarArr2[0] = new C3884l();
        C3856d[] dVarArr3 = this.f11674f;
        dVarArr3[1] = this.f11668c;
        dVarArr3[2] = this.f11670d;
        System.arraycopy(dVarArr, 0, dVarArr3, 3, dVarArr.length);
        this.f11674f[dVarArr.length + 3] = this.f11672e;
        this.f11676g = new C3856d[]{new C3880j()};
        this.f11680i = new long[10];
        this.f11661X = 1.0f;
        this.f11657T = 0;
        this.f11695u = C3852b.f11598e;
        this.f11679h0 = 0;
        this.f11638A = C4315w.f13800d;
        this.f11673e0 = -1;
        this.f11662Y = new C3856d[0];
        this.f11663Z = new ByteBuffer[0];
        this.f11684k = new ArrayDeque<>();
    }

    /* renamed from: A */
    private static int m16147A(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return C3879i.m16216e(byteBuffer);
        }
        if (i == 5) {
            return C3849a.m16077a();
        }
        if (i == 6) {
            return C3849a.m16083g(byteBuffer);
        }
        if (i == 14) {
            return C3849a.m16084h(byteBuffer) * 8;
        }
        throw new IllegalStateException("Unexpected audio encoding: " + i);
    }

    /* renamed from: B */
    private long m16148B() {
        return this.f11689o ? this.f11651N / ((long) this.f11650M) : this.f11652O;
    }

    /* renamed from: C */
    private long m16149C() {
        return this.f11689o ? this.f11654Q / ((long) this.f11653P) : this.f11655R;
    }

    /* renamed from: D */
    private boolean m16150D() {
        return m16156J() && this.f11657T != 0;
    }

    /* renamed from: E */
    private void m16151E() throws C3866f.C3868b {
        this.f11678h.block();
        this.f11688n = m16152F();
        mo12604h(this.f11638A);
        m16162P();
        int audioSessionId = this.f11688n.getAudioSessionId();
        if (f11636l0 && C4284w.f13659a < 21) {
            AudioTrack audioTrack = this.f11687m;
            if (!(audioTrack == null || audioSessionId == audioTrack.getAudioSessionId())) {
                m16161O();
            }
            if (this.f11687m == null) {
                this.f11687m = m16153G(audioSessionId);
            }
        }
        if (this.f11679h0 != audioSessionId) {
            this.f11679h0 = audioSessionId;
            C3866f.C3869c cVar = this.f11686l;
            if (cVar != null) {
                cVar.mo12619b(audioSessionId);
            }
        }
        this.f11682j.mo12631h(this.f11688n, m16158L());
        m16164R();
        this.f11683j0 = false;
    }

    /* renamed from: F */
    private AudioTrack m16152F() throws C3866f.C3868b {
        AudioTrack audioTrack;
        if (C4284w.f13659a >= 21) {
            audioTrack = m16172v();
        } else {
            int t = C4284w.m18254t(this.f11695u.f11601c);
            audioTrack = this.f11679h0 == 0 ? new AudioTrack(t, this.f11692r, this.f11693s, this.f11694t, this.f11698x, 1) : new AudioTrack(t, this.f11692r, this.f11693s, this.f11694t, this.f11698x, 1, this.f11679h0);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new C3866f.C3868b(state, this.f11692r, this.f11693s, this.f11698x);
    }

    /* renamed from: G */
    private AudioTrack m16153G(int i) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i);
    }

    /* renamed from: H */
    private long m16154H(long j) {
        return (j * 1000000) / ((long) this.f11691q);
    }

    /* renamed from: I */
    private static boolean m16155I(int i) {
        return i == 3 || i == 2 || i == Integer.MIN_VALUE || i == 1073741824 || i == 4;
    }

    /* renamed from: J */
    private boolean m16156J() {
        return this.f11688n != null;
    }

    /* renamed from: K */
    private void m16157K() {
        String str;
        long b = this.f11682j.mo12625b();
        if (b != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f11646I >= 30000) {
                long[] jArr = this.f11680i;
                int i = this.f11643F;
                jArr[i] = b - nanoTime;
                this.f11643F = (i + 1) % 10;
                int i2 = this.f11644G;
                if (i2 < 10) {
                    this.f11644G = i2 + 1;
                }
                this.f11646I = nanoTime;
                this.f11645H = 0;
                int i3 = 0;
                while (true) {
                    int i4 = this.f11644G;
                    if (i3 >= i4) {
                        break;
                    }
                    this.f11645H += this.f11680i[i3] / ((long) i4);
                    i3++;
                }
            }
            if (!m16158L() && nanoTime - this.f11648K >= 500000) {
                boolean i5 = this.f11682j.mo12632i();
                this.f11647J = i5;
                if (i5) {
                    long d = this.f11682j.mo12627d() / 1000;
                    long c = this.f11682j.mo12626c();
                    if (d >= this.f11659V) {
                        if (Math.abs(d - nanoTime) > 5000000) {
                            str = "Spurious audio timestamp (system clock mismatch): " + c + ", " + d + ", " + nanoTime + ", " + b + ", " + m16148B() + ", " + m16149C();
                            if (f11637m0) {
                                throw new C3877e(str);
                            }
                        } else if (Math.abs(m16175y(c) - b) > 5000000) {
                            str = "Spurious audio timestamp (frame position mismatch): " + c + ", " + d + ", " + nanoTime + ", " + b + ", " + m16148B() + ", " + m16149C();
                            if (f11637m0) {
                                throw new C3877e(str);
                            }
                        }
                        Log.w("AudioTrack", str);
                    }
                    this.f11647J = false;
                }
                Method method = this.f11649L;
                if (method != null && this.f11689o) {
                    try {
                        long intValue = (((long) ((Integer) method.invoke(this.f11688n, (Object[]) null)).intValue()) * 1000) - this.f11699y;
                        this.f11660W = intValue;
                        long max = Math.max(intValue, 0);
                        this.f11660W = max;
                        if (max > 5000000) {
                            Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + this.f11660W);
                            this.f11660W = 0;
                        }
                    } catch (Exception unused) {
                        this.f11649L = null;
                    }
                }
                this.f11648K = nanoTime;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f11694t;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16158L() {
        /*
            r2 = this;
            int r0 = p148g.p189d.p190a.p200b.p230r0.C4284w.f13659a
            r1 = 23
            if (r0 >= r1) goto L_0x0010
            int r0 = r2.f11694t
            r1 = 5
            if (r0 == r1) goto L_0x000e
            r1 = 6
            if (r0 != r1) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p201h0.C3872h.m16158L():boolean");
    }

    /* renamed from: M */
    private boolean m16159M() {
        return m16158L() && this.f11688n.getPlayState() == 2 && this.f11688n.getPlaybackHeadPosition() == 0;
    }

    /* renamed from: N */
    private void m16160N(long j) throws C3866f.C3870d {
        ByteBuffer byteBuffer;
        int length = this.f11662Y.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f11663Z[i - 1];
            } else {
                byteBuffer = this.f11665a0;
                if (byteBuffer == null) {
                    byteBuffer = C3856d.f11609a;
                }
            }
            if (i == length) {
                m16167U(byteBuffer, j);
            } else {
                C3856d dVar = this.f11662Y[i];
                dVar.mo12582g(byteBuffer);
                ByteBuffer e = dVar.mo12579e();
                this.f11663Z[i] = e;
                if (e.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: O */
    private void m16161O() {
        AudioTrack audioTrack = this.f11687m;
        if (audioTrack != null) {
            this.f11687m = null;
            new C3874b(this, audioTrack).start();
        }
    }

    /* renamed from: P */
    private void m16162P() {
        ArrayList arrayList = new ArrayList();
        for (C3856d dVar : m16176z()) {
            if (dVar.mo12578d()) {
                arrayList.add(dVar);
            } else {
                dVar.flush();
            }
        }
        int size = arrayList.size();
        this.f11662Y = (C3856d[]) arrayList.toArray(new C3856d[size]);
        this.f11663Z = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            C3856d dVar2 = this.f11662Y[i];
            dVar2.flush();
            this.f11663Z[i] = dVar2.mo12579e();
        }
    }

    /* renamed from: Q */
    private void m16163Q() {
        this.f11645H = 0;
        this.f11644G = 0;
        this.f11643F = 0;
        this.f11646I = 0;
        this.f11647J = false;
        this.f11648K = 0;
    }

    /* renamed from: R */
    private void m16164R() {
        if (m16156J()) {
            if (C4284w.f13659a >= 21) {
                m16165S(this.f11688n, this.f11661X);
            } else {
                m16166T(this.f11688n, this.f11661X);
            }
        }
    }

    @TargetApi(21)
    /* renamed from: S */
    private static void m16165S(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* renamed from: T */
    private static void m16166T(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: U */
    private void m16167U(ByteBuffer byteBuffer, long j) throws C3866f.C3870d {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f11667b0;
            boolean z = true;
            int i = 0;
            if (byteBuffer2 != null) {
                C4260a.m18069a(byteBuffer2 == byteBuffer);
            } else {
                this.f11667b0 = byteBuffer;
                if (C4284w.f13659a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f11669c0;
                    if (bArr == null || bArr.length < remaining) {
                        this.f11669c0 = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f11669c0, 0, remaining);
                    byteBuffer.position(position);
                    this.f11671d0 = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (C4284w.f13659a < 21) {
                int a = this.f11698x - ((int) (this.f11654Q - (this.f11682j.mo12624a() * ((long) this.f11653P))));
                if (a > 0 && (i = this.f11688n.write(this.f11669c0, this.f11671d0, Math.min(remaining2, a))) > 0) {
                    this.f11671d0 += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            } else if (this.f11681i0) {
                if (j == -9223372036854775807L) {
                    z = false;
                }
                C4260a.m18074f(z);
                i = m16169W(this.f11688n, byteBuffer, remaining2, j);
            } else {
                i = m16168V(this.f11688n, byteBuffer, remaining2);
            }
            this.f11685k0 = SystemClock.elapsedRealtime();
            if (i >= 0) {
                if (this.f11689o) {
                    this.f11654Q += (long) i;
                }
                if (i == remaining2) {
                    if (!this.f11689o) {
                        this.f11655R += (long) this.f11656S;
                    }
                    this.f11667b0 = null;
                    return;
                }
                return;
            }
            throw new C3866f.C3870d(i);
        }
    }

    @TargetApi(21)
    /* renamed from: V */
    private static int m16168V(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    /* renamed from: W */
    private int m16169W(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.f11641D == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f11641D = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f11641D.putInt(1431633921);
        }
        if (this.f11642E == 0) {
            this.f11641D.putInt(4, i);
            this.f11641D.putLong(8, j * 1000);
            this.f11641D.position(0);
            this.f11642E = i;
        }
        int remaining = this.f11641D.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f11641D, remaining, 1);
            if (write < 0) {
                this.f11642E = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int V = m16168V(audioTrack, byteBuffer, i);
        if (V < 0) {
            this.f11642E = 0;
            return V;
        }
        this.f11642E -= V;
        return V;
    }

    /* renamed from: g */
    private long m16171g(long j) {
        long j2;
        long p;
        while (!this.f11684k.isEmpty() && j >= this.f11684k.getFirst().f11720c) {
            C3878f remove = this.f11684k.remove();
            this.f11638A = remove.f11718a;
            this.f11640C = remove.f11720c;
            this.f11639B = remove.f11719b - this.f11658U;
        }
        if (this.f11638A.f13801a == 1.0f) {
            return (j + this.f11639B) - this.f11640C;
        }
        if (this.f11684k.isEmpty()) {
            j2 = this.f11639B;
            p = this.f11672e.mo12650a(j - this.f11640C);
        } else {
            j2 = this.f11639B;
            p = C4284w.m18250p(j - this.f11640C, this.f11638A.f13801a);
        }
        return j2 + p;
    }

    @TargetApi(21)
    /* renamed from: v */
    private AudioTrack m16172v() {
        AudioAttributes build = this.f11681i0 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.f11695u.mo12568a();
        AudioFormat build2 = new AudioFormat.Builder().setChannelMask(this.f11693s).setEncoding(this.f11694t).setSampleRate(this.f11692r).build();
        int i = this.f11679h0;
        return new AudioTrack(build, build2, this.f11698x, 1, i != 0 ? i : 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16173w() throws p148g.p189d.p190a.p200b.p201h0.C3866f.C3870d {
        /*
            r9 = this;
            int r0 = r9.f11673e0
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f11696v
            if (r0 == 0) goto L_0x000d
            r0 = 0
            goto L_0x0010
        L_0x000d:
            g.d.a.b.h0.d[] r0 = r9.f11662Y
            int r0 = r0.length
        L_0x0010:
            r9.f11673e0 = r0
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.f11673e0
            g.d.a.b.h0.d[] r5 = r9.f11662Y
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0036
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.mo12580f()
        L_0x0028:
            r9.m16160N(r7)
            boolean r0 = r4.mo12577c()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.f11673e0
            int r0 = r0 + r2
            goto L_0x0010
        L_0x0036:
            java.nio.ByteBuffer r0 = r9.f11667b0
            if (r0 == 0) goto L_0x0042
            r9.m16167U(r0, r7)
            java.nio.ByteBuffer r0 = r9.f11667b0
            if (r0 == 0) goto L_0x0042
            return r3
        L_0x0042:
            r9.f11673e0 = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p201h0.C3872h.m16173w():boolean");
    }

    /* renamed from: x */
    private long m16174x(long j) {
        return (j * ((long) this.f11692r)) / 1000000;
    }

    /* renamed from: y */
    private long m16175y(long j) {
        return (j * 1000000) / ((long) this.f11692r);
    }

    /* renamed from: z */
    private C3856d[] m16176z() {
        return this.f11690p ? this.f11676g : this.f11674f;
    }

    /* renamed from: a */
    public void mo12599a() {
        mo12600b();
        m16161O();
        for (C3856d b : this.f11674f) {
            b.mo12576b();
        }
        for (C3856d b2 : this.f11676g) {
            b2.mo12576b();
        }
        this.f11679h0 = 0;
        this.f11677g0 = false;
    }

    /* renamed from: b */
    public void mo12600b() {
        if (m16156J()) {
            this.f11651N = 0;
            this.f11652O = 0;
            this.f11654Q = 0;
            this.f11655R = 0;
            this.f11656S = 0;
            C4315w wVar = this.f11700z;
            if (wVar != null) {
                this.f11638A = wVar;
                this.f11700z = null;
            } else if (!this.f11684k.isEmpty()) {
                this.f11638A = this.f11684k.getLast().f11718a;
            }
            this.f11684k.clear();
            this.f11639B = 0;
            this.f11640C = 0;
            this.f11665a0 = null;
            this.f11667b0 = null;
            int i = 0;
            while (true) {
                C3856d[] dVarArr = this.f11662Y;
                if (i >= dVarArr.length) {
                    break;
                }
                C3856d dVar = dVarArr[i];
                dVar.flush();
                this.f11663Z[i] = dVar.mo12579e();
                i++;
            }
            this.f11675f0 = false;
            this.f11673e0 = -1;
            this.f11641D = null;
            this.f11642E = 0;
            this.f11657T = 0;
            this.f11660W = 0;
            m16163Q();
            if (this.f11688n.getPlayState() == 3) {
                this.f11688n.pause();
            }
            AudioTrack audioTrack = this.f11688n;
            this.f11688n = null;
            this.f11682j.mo12631h((AudioTrack) null, false);
            this.f11678h.close();
            new C3873a(audioTrack).start();
        }
    }

    /* renamed from: c */
    public boolean mo12601c() {
        return !m16156J() || (this.f11675f0 && !mo12607k());
    }

    /* renamed from: d */
    public C4315w mo12602d() {
        return this.f11638A;
    }

    /* renamed from: e */
    public void mo12603e() {
        this.f11677g0 = false;
        if (m16156J()) {
            m16163Q();
            this.f11682j.mo12630g();
        }
    }

    /* renamed from: h */
    public C4315w mo12604h(C4315w wVar) {
        if (!m16156J() || this.f11697w) {
            float m = this.f11672e.mo12652m(wVar.f13801a);
            C3886n nVar = this.f11672e;
            float f = wVar.f13802b;
            nVar.mo12651l(f);
            C4315w wVar2 = new C4315w(m, f);
            C4315w wVar3 = this.f11700z;
            if (wVar3 == null) {
                wVar3 = !this.f11684k.isEmpty() ? this.f11684k.getLast().f11718a : this.f11638A;
            }
            if (!wVar2.equals(wVar3)) {
                if (m16156J()) {
                    this.f11700z = wVar2;
                } else {
                    this.f11638A = wVar2;
                }
            }
            return this.f11638A;
        }
        C4315w wVar4 = C4315w.f13800d;
        this.f11638A = wVar4;
        return wVar4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12605i(int r18, int r19, int r20, int r21, int[] r22, int r23, int r24) throws p148g.p189d.p190a.p200b.p201h0.C3866f.C3867a {
        /*
            r17 = this;
            r1 = r17
            r0 = r21
            r2 = r20
            r1.f11691q = r2
            boolean r3 = m16155I(r18)
            r1.f11689o = r3
            boolean r3 = r1.f11666b
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0024
            r3 = 1073741824(0x40000000, float:2.0)
            boolean r3 = r1.mo12613q(r3)
            if (r3 == 0) goto L_0x0024
            boolean r3 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18257w(r18)
            if (r3 == 0) goto L_0x0024
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            r1.f11690p = r3
            boolean r3 = r1.f11689o
            if (r3 == 0) goto L_0x0031
            int r3 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18252r(r18, r19)
            r1.f11650M = r3
        L_0x0031:
            boolean r3 = r1.f11689o
            r6 = 4
            if (r3 == 0) goto L_0x003c
            r3 = r18
            if (r3 == r6) goto L_0x003e
            r7 = 1
            goto L_0x003f
        L_0x003c:
            r3 = r18
        L_0x003e:
            r7 = 0
        L_0x003f:
            if (r7 == 0) goto L_0x0047
            boolean r8 = r1.f11690p
            if (r8 != 0) goto L_0x0047
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            r1.f11697w = r8
            if (r7 == 0) goto L_0x0091
            g.d.a.b.h0.o r8 = r1.f11670d
            r9 = r23
            r10 = r24
            r8.mo12653a(r9, r10)
            g.d.a.b.h0.g r8 = r1.f11668c
            r9 = r22
            r8.mo12621a(r9)
            g.d.a.b.h0.d[] r8 = r17.m16176z()
            int r9 = r8.length
            r10 = r2
            r11 = 0
            r12 = 0
            r2 = r19
        L_0x0066:
            if (r11 >= r9) goto L_0x0095
            r13 = r8[r11]
            boolean r14 = r13.mo12584i(r10, r2, r3)     // Catch:{ a -> 0x0089 }
            r12 = r12 | r14
            boolean r14 = r13.mo12578d()
            if (r14 == 0) goto L_0x0086
            int r2 = r13.mo12583h()
            int r3 = r13.mo12585j()
            int r10 = r13.mo12586k()
            r16 = r10
            r10 = r3
            r3 = r16
        L_0x0086:
            int r11 = r11 + 1
            goto L_0x0066
        L_0x0089:
            r0 = move-exception
            r2 = r0
            g.d.a.b.h0.f$a r0 = new g.d.a.b.h0.f$a
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0091:
            r10 = r2
            r12 = 0
            r2 = r19
        L_0x0095:
            r8 = 252(0xfc, float:3.53E-43)
            r9 = 12
            switch(r2) {
                case 1: goto L_0x00c7;
                case 2: goto L_0x00c5;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00bc;
                case 6: goto L_0x00b9;
                case 7: goto L_0x00b6;
                case 8: goto L_0x00b3;
                default: goto L_0x009c;
            }
        L_0x009c:
            g.d.a.b.h0.f$a r0 = new g.d.a.b.h0.f$a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported channel count: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x00b3:
            int r6 = p148g.p189d.p190a.p200b.C3830b.f11528a
            goto L_0x00c7
        L_0x00b6:
            r6 = 1276(0x4fc, float:1.788E-42)
            goto L_0x00c7
        L_0x00b9:
            r6 = 252(0xfc, float:3.53E-43)
            goto L_0x00c7
        L_0x00bc:
            r6 = 220(0xdc, float:3.08E-43)
            goto L_0x00c7
        L_0x00bf:
            r6 = 204(0xcc, float:2.86E-43)
            goto L_0x00c7
        L_0x00c2:
            r6 = 28
            goto L_0x00c7
        L_0x00c5:
            r6 = 12
        L_0x00c7:
            int r11 = p148g.p189d.p190a.p200b.p230r0.C4284w.f13659a
            r13 = 23
            r14 = 7
            r15 = 5
            if (r11 > r13) goto L_0x00ee
            java.lang.String r11 = p148g.p189d.p190a.p200b.p230r0.C4284w.f13660b
            java.lang.String r13 = "foster"
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x00ee
            java.lang.String r11 = p148g.p189d.p190a.p200b.p230r0.C4284w.f13661c
            java.lang.String r13 = "NVIDIA"
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x00ee
            r11 = 3
            if (r2 == r11) goto L_0x00ef
            if (r2 == r15) goto L_0x00ef
            if (r2 == r14) goto L_0x00eb
            goto L_0x00ee
        L_0x00eb:
            int r8 = p148g.p189d.p190a.p200b.C3830b.f11528a
            goto L_0x00ef
        L_0x00ee:
            r8 = r6
        L_0x00ef:
            int r6 = p148g.p189d.p190a.p200b.p230r0.C4284w.f13659a
            r11 = 25
            if (r6 > r11) goto L_0x0106
            java.lang.String r6 = p148g.p189d.p190a.p200b.p230r0.C4284w.f13660b
            java.lang.String r11 = "fugu"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x0106
            boolean r6 = r1.f11689o
            if (r6 != 0) goto L_0x0106
            if (r2 != r4) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r9 = r8
        L_0x0107:
            if (r12 != 0) goto L_0x011c
            boolean r6 = r17.m16156J()
            if (r6 == 0) goto L_0x011c
            int r6 = r1.f11694t
            if (r6 != r3) goto L_0x011c
            int r6 = r1.f11692r
            if (r6 != r10) goto L_0x011c
            int r6 = r1.f11693s
            if (r6 != r9) goto L_0x011c
            return
        L_0x011c:
            r17.mo12600b()
            r1.f11696v = r7
            r1.f11692r = r10
            r1.f11693s = r9
            r1.f11694t = r3
            boolean r6 = r1.f11689o
            if (r6 == 0) goto L_0x0131
            int r2 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18252r(r3, r2)
            r1.f11653P = r2
        L_0x0131:
            if (r0 == 0) goto L_0x0136
        L_0x0133:
            r1.f11698x = r0
            goto L_0x0182
        L_0x0136:
            boolean r0 = r1.f11689o
            if (r0 == 0) goto L_0x016d
            int r0 = r1.f11694t
            int r0 = android.media.AudioTrack.getMinBufferSize(r10, r9, r0)
            r2 = -2
            if (r0 == r2) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r4 = 0
        L_0x0145:
            p148g.p189d.p190a.p200b.p230r0.C4260a.m18074f(r4)
            int r2 = r0 * 4
            r3 = 250000(0x3d090, double:1.235164E-318)
            long r3 = r1.m16174x(r3)
            int r4 = (int) r3
            int r3 = r1.f11653P
            int r4 = r4 * r3
            long r5 = (long) r0
            r7 = 750000(0xb71b0, double:3.70549E-318)
            long r7 = r1.m16174x(r7)
            int r0 = r1.f11653P
            long r9 = (long) r0
            long r7 = r7 * r9
            long r5 = java.lang.Math.max(r5, r7)
            int r0 = (int) r5
            int r0 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18243i(r2, r4, r0)
            goto L_0x0133
        L_0x016d:
            int r0 = r1.f11694t
            if (r0 == r15) goto L_0x017f
            r2 = 6
            if (r0 != r2) goto L_0x0175
            goto L_0x017f
        L_0x0175:
            if (r0 != r14) goto L_0x017b
            r0 = 49152(0xc000, float:6.8877E-41)
            goto L_0x0133
        L_0x017b:
            r0 = 294912(0x48000, float:4.1326E-40)
            goto L_0x0133
        L_0x017f:
            r0 = 20480(0x5000, float:2.8699E-41)
            goto L_0x0133
        L_0x0182:
            boolean r0 = r1.f11689o
            if (r0 == 0) goto L_0x0191
            int r0 = r1.f11698x
            int r2 = r1.f11653P
            int r0 = r0 / r2
            long r2 = (long) r0
            long r2 = r1.m16175y(r2)
            goto L_0x0196
        L_0x0191:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0196:
            r1.f11699y = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p201h0.C3872h.mo12605i(int, int, int, int, int[], int, int):void");
    }

    /* renamed from: j */
    public void mo12606j() throws C3866f.C3870d {
        if (!this.f11675f0 && m16156J() && m16173w()) {
            this.f11682j.mo12628e(m16149C());
            this.f11642E = 0;
            this.f11675f0 = true;
        }
    }

    /* renamed from: k */
    public boolean mo12607k() {
        return m16156J() && (m16149C() > this.f11682j.mo12624a() || m16159M());
    }

    /* renamed from: l */
    public void mo12608l() {
        this.f11677g0 = true;
        if (m16156J()) {
            this.f11659V = System.nanoTime() / 1000;
            this.f11688n.play();
        }
    }

    /* renamed from: m */
    public long mo12609m(boolean z) {
        long j;
        if (!m16150D()) {
            return Long.MIN_VALUE;
        }
        if (this.f11688n.getPlayState() == 3) {
            m16157K();
        }
        long nanoTime = System.nanoTime() / 1000;
        if (this.f11647J) {
            j = m16175y(this.f11682j.mo12626c() + m16174x(nanoTime - (this.f11682j.mo12627d() / 1000)));
        } else {
            j = this.f11644G == 0 ? this.f11682j.mo12625b() : nanoTime + this.f11645H;
            if (!z) {
                j -= this.f11660W;
            }
        }
        return this.f11658U + m16171g(Math.min(j, m16175y(m16149C())));
    }

    /* renamed from: n */
    public void mo12610n() {
        if (this.f11681i0) {
            this.f11681i0 = false;
            this.f11679h0 = 0;
            mo12600b();
        }
    }

    /* renamed from: o */
    public void mo12611o(C3866f.C3869c cVar) {
        this.f11686l = cVar;
    }

    /* renamed from: p */
    public void mo12612p(C3852b bVar) {
        if (!this.f11695u.equals(bVar)) {
            this.f11695u = bVar;
            if (!this.f11681i0) {
                mo12600b();
                this.f11679h0 = 0;
            }
        }
    }

    /* renamed from: q */
    public boolean mo12613q(int i) {
        if (m16155I(i)) {
            return i != 4 || C4284w.f13659a >= 21;
        }
        C3855c cVar = this.f11664a;
        return cVar != null && cVar.mo12572c(i);
    }

    /* renamed from: r */
    public void mo12614r() {
        if (this.f11657T == 1) {
            this.f11657T = 2;
        }
    }

    /* renamed from: s */
    public void mo12615s(float f) {
        if (this.f11661X != f) {
            this.f11661X = f;
            m16164R();
        }
    }

    /* renamed from: t */
    public boolean mo12616t(ByteBuffer byteBuffer, long j) throws C3866f.C3868b, C3866f.C3870d {
        String str;
        String str2;
        int i;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        ByteBuffer byteBuffer3 = this.f11665a0;
        C4260a.m18069a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!m16156J()) {
            m16151E();
            if (this.f11677g0) {
                mo12608l();
            }
        }
        if (m16158L()) {
            if (this.f11688n.getPlayState() == 2) {
                this.f11683j0 = false;
                return false;
            } else if (this.f11688n.getPlayState() == 1 && this.f11682j.mo12624a() != 0) {
                return false;
            }
        }
        boolean z = this.f11683j0;
        boolean k = mo12607k();
        this.f11683j0 = k;
        if (z && !k && this.f11688n.getPlayState() != 1 && this.f11686l != null) {
            this.f11686l.mo12620c(this.f11698x, C3830b.m15923b(this.f11699y), SystemClock.elapsedRealtime() - this.f11685k0);
        }
        if (this.f11665a0 != null) {
            str = "AudioTrack";
        } else if (!byteBuffer.hasRemaining()) {
            return true;
        } else {
            if (!this.f11689o && this.f11656S == 0) {
                int A = m16147A(this.f11694t, byteBuffer2);
                this.f11656S = A;
                if (A == 0) {
                    return true;
                }
            }
            if (this.f11700z == null) {
                str2 = "AudioTrack";
            } else if (!m16173w()) {
                return false;
            } else {
                ArrayDeque<C3878f> arrayDeque = this.f11684k;
                str2 = "AudioTrack";
                C3878f fVar = r12;
                C3878f fVar2 = new C3878f(this.f11700z, Math.max(0, j2), m16175y(m16149C()), (C3873a) null);
                arrayDeque.add(fVar);
                this.f11700z = null;
                m16162P();
            }
            if (this.f11657T == 0) {
                this.f11658U = Math.max(0, j2);
                this.f11657T = 1;
                str = str2;
            } else {
                long H = this.f11658U + m16154H(m16148B());
                if (this.f11657T != 1 || Math.abs(H - j2) <= 200000) {
                    str = str2;
                    i = 2;
                } else {
                    str = str2;
                    Log.e(str, "Discontinuity detected [expected " + H + ", got " + j2 + "]");
                    i = 2;
                    this.f11657T = 2;
                }
                if (this.f11657T == i) {
                    this.f11658U += j2 - H;
                    this.f11657T = 1;
                    C3866f.C3869c cVar = this.f11686l;
                    if (cVar != null) {
                        cVar.mo12618a();
                    }
                }
            }
            if (this.f11689o) {
                this.f11651N += (long) byteBuffer.remaining();
            } else {
                this.f11652O += (long) this.f11656S;
            }
            this.f11665a0 = byteBuffer2;
        }
        if (this.f11696v) {
            m16160N(j2);
        } else {
            m16167U(this.f11665a0, j2);
        }
        if (!this.f11665a0.hasRemaining()) {
            this.f11665a0 = null;
            return true;
        } else if (!this.f11682j.mo12629f(m16149C())) {
            return false;
        } else {
            Log.w(str, "Resetting stalled audio track");
            mo12600b();
            return true;
        }
    }

    /* renamed from: u */
    public void mo12617u(int i) {
        C4260a.m18074f(C4284w.f13659a >= 21);
        if (!this.f11681i0 || this.f11679h0 != i) {
            this.f11681i0 = true;
            this.f11679h0 = i;
            mo12600b();
        }
    }
}
