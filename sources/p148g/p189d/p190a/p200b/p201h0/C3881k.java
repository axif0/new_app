package p148g.p189d.p190a.p200b.p201h0;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p148g.p189d.p190a.p200b.C3828a;
import p148g.p189d.p190a.p200b.C3848h;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4315w;
import p148g.p189d.p190a.p200b.p201h0.C3858e;
import p148g.p189d.p190a.p200b.p201h0.C3866f;
import p148g.p189d.p190a.p200b.p202i0.C3895e;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p203j0.C3906c;
import p148g.p189d.p190a.p200b.p203j0.C3908e;
import p148g.p189d.p190a.p200b.p212l0.C4046a;
import p148g.p189d.p190a.p200b.p212l0.C4047b;
import p148g.p189d.p190a.p200b.p212l0.C4049c;
import p148g.p189d.p190a.p200b.p212l0.C4051d;
import p148g.p189d.p190a.p200b.p230r0.C4268i;
import p148g.p189d.p190a.p200b.p230r0.C4269j;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

@TargetApi(16)
/* renamed from: g.d.a.b.h0.k */
public class C3881k extends C4047b implements C4268i {
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final C3858e.C3859a f11731b0;

    /* renamed from: c0 */
    private final C3866f f11732c0;

    /* renamed from: d0 */
    private boolean f11733d0;

    /* renamed from: e0 */
    private boolean f11734e0;

    /* renamed from: f0 */
    private MediaFormat f11735f0;

    /* renamed from: g0 */
    private int f11736g0;

    /* renamed from: h0 */
    private int f11737h0;

    /* renamed from: i0 */
    private int f11738i0;

    /* renamed from: j0 */
    private int f11739j0;

    /* renamed from: k0 */
    private long f11740k0;

    /* renamed from: l0 */
    private boolean f11741l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public boolean f11742m0;

    /* renamed from: g.d.a.b.h0.k$b */
    private final class C3883b implements C3866f.C3869c {
        private C3883b() {
        }

        /* renamed from: a */
        public void mo12618a() {
            C3881k.this.mo12635E0();
            boolean unused = C3881k.this.f11742m0 = true;
        }

        /* renamed from: b */
        public void mo12619b(int i) {
            C3881k.this.f11731b0.mo12587b(i);
            C3881k.this.mo12634D0(i);
        }

        /* renamed from: c */
        public void mo12620c(int i, long j, long j2) {
            C3881k.this.f11731b0.mo12588c(i, j, j2);
            C3881k.this.mo12636F0(i, j, j2);
        }
    }

    public C3881k(C4049c cVar, C3906c<C3908e> cVar2, boolean z, Handler handler, C3858e eVar, C3855c cVar3, C3856d... dVarArr) {
        this(cVar, cVar2, z, handler, eVar, new C3872h(cVar3, dVarArr));
    }

    public C3881k(C4049c cVar, C3906c<C3908e> cVar2, boolean z, Handler handler, C3858e eVar, C3866f fVar) {
        super(1, cVar, cVar2, z);
        this.f11731b0 = new C3858e.C3859a(handler, eVar);
        this.f11732c0 = fVar;
        fVar.mo12611o(new C3883b());
    }

    /* renamed from: C0 */
    private static boolean m16231C0(String str) {
        return C4284w.f13659a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(C4284w.f13661c) && (C4284w.f13660b.startsWith("zeroflte") || C4284w.f13660b.startsWith("herolte") || C4284w.f13660b.startsWith("heroqlte"));
    }

    /* renamed from: G0 */
    private void m16232G0() {
        long m = this.f11732c0.mo12609m(mo12434c());
        if (m != Long.MIN_VALUE) {
            if (!this.f11742m0) {
                m = Math.max(this.f11740k0, m);
            }
            this.f11740k0 = m;
            this.f11742m0 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo12405A(boolean z) throws C3848h {
        super.mo12405A(z);
        this.f11731b0.mo12591f(this.f12816Z);
        int i = mo12430w().f11531a;
        if (i != 0) {
            this.f11732c0.mo12617u(i);
        } else {
            this.f11732c0.mo12610n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo12406B(long j, boolean z) throws C3848h {
        super.mo12406B(j, z);
        this.f11732c0.mo12600b();
        this.f11740k0 = j;
        this.f11741l0 = true;
        this.f11742m0 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public boolean mo12633B0(String str) {
        int a = C4269j.m18110a(str);
        return a != 0 && this.f11732c0.mo12613q(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo12407C() {
        super.mo12407C();
        this.f11732c0.mo12608l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo12408D() {
        this.f11732c0.mo12603e();
        m16232G0();
        super.mo12408D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public void mo12634D0(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E0 */
    public void mo12635E0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public void mo12636F0(int i, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo12637Q(C4046a aVar, MediaCodec mediaCodec, C4109n nVar, MediaCrypto mediaCrypto) {
        this.f11734e0 = m16231C0(aVar.f12784a);
        MediaFormat c0 = mo12928c0(nVar);
        if (this.f11733d0) {
            this.f11735f0 = c0;
            c0.setString("mime", "audio/raw");
            mediaCodec.configure(this.f11735f0, (Surface) null, mediaCrypto, 0);
            this.f11735f0.setString("mime", nVar.f12949k);
            return;
        }
        mediaCodec.configure(c0, (Surface) null, mediaCrypto, 0);
        this.f11735f0 = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public C4046a mo12638Y(C4049c cVar, C4109n nVar, boolean z) throws C4051d.C4054c {
        C4046a a;
        if (!mo12633B0(nVar.f12949k) || (a = cVar.mo12933a()) == null) {
            this.f11733d0 = false;
            return super.mo12638Y(cVar, nVar, z);
        }
        this.f11733d0 = true;
        return a;
    }

    /* renamed from: c */
    public boolean mo12434c() {
        return super.mo12434c() && this.f11732c0.mo12601c();
    }

    /* renamed from: d */
    public C4315w mo12458d() {
        return this.f11732c0.mo12602d();
    }

    /* renamed from: g */
    public boolean mo12435g() {
        return this.f11732c0.mo12607k() || super.mo12435g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public void mo12639g0(String str, long j, long j2) {
        this.f11731b0.mo12589d(str, j, j2);
    }

    /* renamed from: h */
    public C4315w mo12462h(C4315w wVar) {
        return this.f11732c0.mo12604h(wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public void mo12640h0(C4109n nVar) throws C3848h {
        super.mo12640h0(nVar);
        this.f11731b0.mo12592g(nVar);
        this.f11736g0 = "audio/raw".equals(nVar.f12949k) ? nVar.f12963y : 2;
        this.f11737h0 = nVar.f12961w;
        int i = nVar.f12964z;
        int i2 = 0;
        if (i == -1) {
            i = 0;
        }
        this.f11738i0 = i;
        int i3 = nVar.f12938A;
        if (i3 != -1) {
            i2 = i3;
        }
        this.f11739j0 = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void mo12641i0(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C3848h {
        int i;
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.f11735f0;
        if (mediaFormat2 != null) {
            i = C4269j.m18110a(mediaFormat2.getString("mime"));
            mediaFormat = this.f11735f0;
        } else {
            i = this.f11736g0;
        }
        int i3 = i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f11734e0 || integer != 6 || (i2 = this.f11737h0) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i2];
            for (int i4 = 0; i4 < this.f11737h0; i4++) {
                iArr[i4] = i4;
            }
        }
        try {
            this.f11732c0.mo12605i(i3, integer, integer2, 0, iArr, this.f11738i0, this.f11739j0);
        } catch (C3866f.C3867a e) {
            throw C3848h.m16074a(e, mo12431x());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public void mo12642k0(C3895e eVar) {
        if (this.f11741l0 && !eVar.mo12658n()) {
            if (Math.abs(eVar.f11823i - this.f11740k0) > 500000) {
                this.f11740k0 = eVar.f11823i;
            }
            this.f11741l0 = false;
        }
    }

    /* renamed from: m */
    public void mo12419m(int i, Object obj) throws C3848h {
        if (i == 2) {
            this.f11732c0.mo12615s(((Float) obj).floatValue());
        } else if (i != 3) {
            super.mo12419m(i, obj);
        } else {
            this.f11732c0.mo12612p((C3852b) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public boolean mo12643m0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C3848h {
        if (this.f11733d0 && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f12816Z.f11817f++;
            this.f11732c0.mo12614r();
            return true;
        } else {
            try {
                if (!this.f11732c0.mo12616t(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.f12816Z.f11816e++;
                return true;
            } catch (C3866f.C3868b | C3866f.C3870d e) {
                throw C3848h.m16074a(e, mo12431x());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo12644q0() throws C3848h {
        try {
            this.f11732c0.mo12606j();
        } catch (C3866f.C3870d e) {
            throw C3848h.m16074a(e, mo12431x());
        }
    }

    /* renamed from: s */
    public C4268i mo12425s() {
        return this;
    }

    /* renamed from: u */
    public long mo12465u() {
        if (getState() == 2) {
            m16232G0();
        }
        return this.f11740k0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public int mo12645x0(C4049c cVar, C3906c<C3908e> cVar2, C4109n nVar) throws C4051d.C4054c {
        boolean z;
        int i;
        int i2;
        String str = nVar.f12949k;
        boolean z2 = false;
        if (!C4269j.m18115f(str)) {
            return 0;
        }
        int i3 = C4284w.f13659a >= 21 ? 32 : 0;
        boolean H = C3828a.m15879H(cVar2, nVar.f12952n);
        int i4 = 4;
        if (H && mo12633B0(str) && cVar.mo12933a() != null) {
            return i3 | 8 | 4;
        }
        if (("audio/raw".equals(str) && !this.f11732c0.mo12613q(nVar.f12963y)) || !this.f11732c0.mo12613q(2)) {
            return 1;
        }
        C3900a aVar = nVar.f12952n;
        if (aVar != null) {
            z = false;
            for (int i5 = 0; i5 < aVar.f11844i; i5++) {
                z |= aVar.mo12686c(i5).f11849j;
            }
        } else {
            z = false;
        }
        C4046a b = cVar.mo12934b(str, z);
        if (b == null) {
            return (!z || cVar.mo12934b(str, false) == null) ? 1 : 2;
        }
        if (!H) {
            return 2;
        }
        if (C4284w.f13659a < 21 || (((i = nVar.f12962x) == -1 || b.mo12920h(i)) && ((i2 = nVar.f12961w) == -1 || b.mo12919g(i2)))) {
            z2 = true;
        }
        if (!z2) {
            i4 = 3;
        }
        return i3 | 8 | i4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo12433z() {
        try {
            this.f11732c0.mo12599a();
            try {
                super.mo12433z();
            } finally {
                this.f12816Z.mo12669a();
                this.f11731b0.mo12590e(this.f12816Z);
            }
        } catch (Throwable th) {
            super.mo12433z();
            throw th;
        } finally {
            this.f12816Z.mo12669a();
            this.f11731b0.mo12590e(this.f12816Z);
        }
    }
}
