package p148g.p189d.p190a.p200b;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p148g.p189d.p190a.p200b.C4317y;
import p148g.p189d.p190a.p200b.C4322z;
import p148g.p189d.p190a.p200b.p201h0.C3852b;
import p148g.p189d.p190a.p200b.p201h0.C3858e;
import p148g.p189d.p190a.p200b.p202i0.C3894d;
import p148g.p189d.p190a.p200b.p213m0.C4059a;
import p148g.p189d.p190a.p200b.p213m0.C4067f;
import p148g.p189d.p190a.p200b.p217n0.C4126f;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4162k;
import p148g.p189d.p190a.p200b.p228p0.C4231f;
import p148g.p189d.p190a.p200b.p228p0.C4232g;
import p148g.p189d.p190a.p200b.p230r0.C4261b;
import p148g.p189d.p190a.p200b.p231s0.C4302g;
import p148g.p189d.p190a.p200b.p231s0.C4303h;

@TargetApi(16)
/* renamed from: g.d.a.b.f0 */
public class C3840f0 implements C3888i, C4317y.C4321d, C4317y.C4320c {

    /* renamed from: a */
    protected final C3829a0[] f11550a;

    /* renamed from: b */
    private final C3888i f11551b;

    /* renamed from: c */
    private final C3842b f11552c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final CopyOnWriteArraySet<C4302g> f11553d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final CopyOnWriteArraySet<C4162k> f11554e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final CopyOnWriteArraySet<C4067f> f11555f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final CopyOnWriteArraySet<C4303h> f11556g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final CopyOnWriteArraySet<C3858e> f11557h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4109n f11558i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4109n f11559j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Surface f11560k;

    /* renamed from: l */
    private boolean f11561l;

    /* renamed from: m */
    private SurfaceHolder f11562m;

    /* renamed from: n */
    private TextureView f11563n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C3894d f11564o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C3894d f11565p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f11566q;

    /* renamed from: g.d.a.b.f0$b */
    private final class C3842b implements C4303h, C3858e, C4162k, C4067f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        private C3842b() {
        }

        /* renamed from: a */
        public void mo12504a(int i, int i2, int i3, float f) {
            Iterator it = C3840f0.this.f11553d.iterator();
            while (it.hasNext()) {
                ((C4302g) it.next()).mo6240a(i, i2, i3, f);
            }
            Iterator it2 = C3840f0.this.f11556g.iterator();
            while (it2.hasNext()) {
                ((C4303h) it2.next()).mo12504a(i, i2, i3, f);
            }
        }

        /* renamed from: b */
        public void mo12505b(int i) {
            int unused = C3840f0.this.f11566q = i;
            Iterator it = C3840f0.this.f11557h.iterator();
            while (it.hasNext()) {
                ((C3858e) it.next()).mo12505b(i);
            }
        }

        /* renamed from: c */
        public void mo12506c(C3894d dVar) {
            Iterator it = C3840f0.this.f11557h.iterator();
            while (it.hasNext()) {
                ((C3858e) it.next()).mo12506c(dVar);
            }
            C4109n unused = C3840f0.this.f11559j = null;
            C3894d unused2 = C3840f0.this.f11565p = null;
            int unused3 = C3840f0.this.f11566q = 0;
        }

        /* renamed from: d */
        public void mo12507d(C3894d dVar) {
            C3894d unused = C3840f0.this.f11565p = dVar;
            Iterator it = C3840f0.this.f11557h.iterator();
            while (it.hasNext()) {
                ((C3858e) it.next()).mo12507d(dVar);
            }
        }

        /* renamed from: e */
        public void mo12508e(String str, long j, long j2) {
            Iterator it = C3840f0.this.f11556g.iterator();
            while (it.hasNext()) {
                ((C4303h) it.next()).mo12508e(str, j, j2);
            }
        }

        /* renamed from: f */
        public void mo12509f(C4109n nVar) {
            C4109n unused = C3840f0.this.f11558i = nVar;
            Iterator it = C3840f0.this.f11556g.iterator();
            while (it.hasNext()) {
                ((C4303h) it.next()).mo12509f(nVar);
            }
        }

        /* renamed from: g */
        public void mo12510g(C3894d dVar) {
            C3894d unused = C3840f0.this.f11564o = dVar;
            Iterator it = C3840f0.this.f11556g.iterator();
            while (it.hasNext()) {
                ((C4303h) it.next()).mo12510g(dVar);
            }
        }

        /* renamed from: h */
        public void mo12511h(C4109n nVar) {
            C4109n unused = C3840f0.this.f11559j = nVar;
            Iterator it = C3840f0.this.f11557h.iterator();
            while (it.hasNext()) {
                ((C3858e) it.next()).mo12511h(nVar);
            }
        }

        /* renamed from: i */
        public void mo12512i(int i, long j, long j2) {
            Iterator it = C3840f0.this.f11557h.iterator();
            while (it.hasNext()) {
                ((C3858e) it.next()).mo12512i(i, j, j2);
            }
        }

        /* renamed from: j */
        public void mo12513j(Surface surface) {
            if (C3840f0.this.f11560k == surface) {
                Iterator it = C3840f0.this.f11553d.iterator();
                while (it.hasNext()) {
                    ((C4302g) it.next()).mo6243i();
                }
            }
            Iterator it2 = C3840f0.this.f11556g.iterator();
            while (it2.hasNext()) {
                ((C4303h) it2.next()).mo12513j(surface);
            }
        }

        /* renamed from: k */
        public void mo6244k(List<C4152b> list) {
            Iterator it = C3840f0.this.f11554e.iterator();
            while (it.hasNext()) {
                ((C4162k) it.next()).mo6244k(list);
            }
        }

        /* renamed from: l */
        public void mo12514l(C3894d dVar) {
            Iterator it = C3840f0.this.f11556g.iterator();
            while (it.hasNext()) {
                ((C4303h) it.next()).mo12514l(dVar);
            }
            C4109n unused = C3840f0.this.f11558i = null;
            C3894d unused2 = C3840f0.this.f11564o = null;
        }

        /* renamed from: m */
        public void mo12515m(String str, long j, long j2) {
            Iterator it = C3840f0.this.f11557h.iterator();
            while (it.hasNext()) {
                ((C3858e) it.next()).mo12515m(str, j, j2);
            }
        }

        /* renamed from: n */
        public void mo12516n(C4059a aVar) {
            Iterator it = C3840f0.this.f11555f.iterator();
            while (it.hasNext()) {
                ((C4067f) it.next()).mo12516n(aVar);
            }
        }

        /* renamed from: o */
        public void mo12517o(int i, long j) {
            Iterator it = C3840f0.this.f11556g.iterator();
            while (it.hasNext()) {
                ((C4303h) it.next()).mo12517o(i, j);
            }
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C3840f0.this.m15972Y(new Surface(surfaceTexture), true);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C3840f0.this.m15972Y((Surface) null, true);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C3840f0.this.m15972Y(surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C3840f0.this.m15972Y((Surface) null, false);
        }
    }

    protected C3840f0(C3835d0 d0Var, C4232g gVar, C4235q qVar) {
        this(d0Var, gVar, qVar, C4261b.f13607a);
    }

    protected C3840f0(C3835d0 d0Var, C4232g gVar, C4235q qVar, C4261b bVar) {
        this.f11552c = new C3842b();
        this.f11553d = new CopyOnWriteArraySet<>();
        this.f11554e = new CopyOnWriteArraySet<>();
        this.f11555f = new CopyOnWriteArraySet<>();
        this.f11556g = new CopyOnWriteArraySet<>();
        this.f11557h = new CopyOnWriteArraySet<>();
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        C3842b bVar2 = this.f11552c;
        C3829a0[] a = d0Var.mo12444a(handler, bVar2, bVar2, bVar2, bVar2);
        this.f11550a = a;
        C3852b bVar3 = C3852b.f11598e;
        this.f11551b = mo12476V(a, gVar, qVar, bVar);
    }

    /* renamed from: W */
    private void m15971W() {
        TextureView textureView = this.f11563n;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f11552c) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f11563n.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f11563n = null;
        }
        SurfaceHolder surfaceHolder = this.f11562m;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f11552c);
            this.f11562m = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m15972Y(Surface surface, boolean z) {
        ArrayList<C4322z> arrayList = new ArrayList<>();
        for (C3829a0 a0Var : this.f11550a) {
            if (a0Var.mo12416i() == 2) {
                C4322z x = this.f11551b.mo12501x(a0Var);
                x.mo13608m(1);
                x.mo13607l(surface);
                x.mo13606k();
                arrayList.add(x);
            }
        }
        Surface surface2 = this.f11560k;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (C4322z a : arrayList) {
                    a.mo13596a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.f11561l) {
                this.f11560k.release();
            }
        }
        this.f11560k = surface;
        this.f11561l = z;
    }

    /* renamed from: A */
    public int mo12467A() {
        return this.f11551b.mo12467A();
    }

    /* renamed from: B */
    public void mo12468B(TextureView textureView) {
        m15971W();
        this.f11563n = textureView;
        Surface surface = null;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != null) {
                Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener(this.f11552c);
            SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
            if (surfaceTexture != null) {
                surface = new Surface(surfaceTexture);
            }
        }
        m15972Y(surface, true);
    }

    /* renamed from: C */
    public C4231f mo12469C() {
        return this.f11551b.mo12469C();
    }

    /* renamed from: D */
    public int mo12470D(int i) {
        return this.f11551b.mo12470D(i);
    }

    /* renamed from: E */
    public void mo12471E(C4302g gVar) {
        this.f11553d.remove(gVar);
    }

    /* renamed from: F */
    public long mo12472F() {
        return this.f11551b.mo12472F();
    }

    /* renamed from: G */
    public void mo12473G(C4302g gVar) {
        this.f11553d.add(gVar);
    }

    /* renamed from: H */
    public C4317y.C4320c mo12474H() {
        return this;
    }

    /* renamed from: U */
    public void mo12475U(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null && surfaceHolder == this.f11562m) {
            mo12477X((SurfaceHolder) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public C3888i mo12476V(C3829a0[] a0VarArr, C4232g gVar, C4235q qVar, C4261b bVar) {
        return new C3909k(a0VarArr, gVar, qVar, bVar);
    }

    /* renamed from: X */
    public void mo12477X(SurfaceHolder surfaceHolder) {
        m15971W();
        this.f11562m = surfaceHolder;
        Surface surface = null;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.f11552c);
            Surface surface2 = surfaceHolder.getSurface();
            if (surface2 != null && surface2.isValid()) {
                surface = surface2;
            }
        }
        m15972Y(surface, false);
    }

    /* renamed from: a */
    public void mo12478a(C4126f fVar, boolean z, boolean z2) {
        this.f11551b.mo12478a(fVar, z, z2);
    }

    /* renamed from: b */
    public void mo12479b(TextureView textureView) {
        if (textureView != null && textureView == this.f11563n) {
            mo12468B((TextureView) null);
        }
    }

    /* renamed from: c */
    public void mo12480c(SurfaceView surfaceView) {
        mo12477X(surfaceView == null ? null : surfaceView.getHolder());
    }

    /* renamed from: d */
    public C4315w mo12481d() {
        return this.f11551b.mo12481d();
    }

    /* renamed from: e */
    public void mo12482e(boolean z) {
        this.f11551b.mo12482e(z);
    }

    /* renamed from: f */
    public C4317y.C4321d mo12483f() {
        return this;
    }

    /* renamed from: g */
    public boolean mo12484g() {
        return this.f11551b.mo12484g();
    }

    /* renamed from: h */
    public long mo12485h() {
        return this.f11551b.mo12485h();
    }

    /* renamed from: i */
    public void mo12486i(int i, long j) {
        this.f11551b.mo12486i(i, j);
    }

    /* renamed from: j */
    public int mo12487j() {
        return this.f11551b.mo12487j();
    }

    /* renamed from: k */
    public long mo12488k() {
        return this.f11551b.mo12488k();
    }

    /* renamed from: l */
    public boolean mo12489l() {
        return this.f11551b.mo12489l();
    }

    /* renamed from: m */
    public void mo12490m(boolean z) {
        this.f11551b.mo12490m(z);
    }

    /* renamed from: n */
    public int mo12491n() {
        return this.f11551b.mo12491n();
    }

    /* renamed from: o */
    public void mo12492o(int i) {
        this.f11551b.mo12492o(i);
    }

    /* renamed from: p */
    public int mo12493p() {
        return this.f11551b.mo12493p();
    }

    /* renamed from: q */
    public void mo12494q(C4317y.C4319b bVar) {
        this.f11551b.mo12494q(bVar);
    }

    /* renamed from: r */
    public void mo12495r(SurfaceView surfaceView) {
        mo12475U(surfaceView == null ? null : surfaceView.getHolder());
    }

    /* renamed from: s */
    public void mo12496s(C4162k kVar) {
        this.f11554e.add(kVar);
    }

    /* renamed from: t */
    public void mo12497t(C4162k kVar) {
        this.f11554e.remove(kVar);
    }

    /* renamed from: u */
    public int mo12498u() {
        return this.f11551b.mo12498u();
    }

    /* renamed from: v */
    public long mo12499v() {
        return this.f11551b.mo12499v();
    }

    /* renamed from: w */
    public C3844g0 mo12500w() {
        return this.f11551b.mo12500w();
    }

    /* renamed from: x */
    public C4322z mo12501x(C4322z.C4324b bVar) {
        return this.f11551b.mo12501x(bVar);
    }

    /* renamed from: y */
    public boolean mo12502y() {
        return this.f11551b.mo12502y();
    }

    /* renamed from: z */
    public void mo12503z(C4317y.C4319b bVar) {
        this.f11551b.mo12503z(bVar);
    }
}
