package academia.bracu.com.academia.splash;

import android.graphics.Color;
import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.C0273e;
import androidx.appcompat.widget.AppCompatTextView;
import com.karumi.dexter.C2722R;
import p148g.p149a.p150a.p151a.C3583c;
import p148g.p179c.p183b.C3712a;
import p148g.p179c.p183b.C3713b;
import p148g.p179c.p183b.p184d.C3716b;
import p148g.p179c.p183b.p186f.C3720a;
import p148g.p325e.p326a.C5544a;
import p148g.p330f.p331a.p332a.p333b.C5595a;
import p148g.p330f.p331a.p332a.p334c.C5596a;
import p148g.p330f.p331a.p332a.p334c.C5597b;
import p337i.p338a.p339a.C5608b;
import p337i.p338a.p339a.C5614e;
import p340io.codetail.widget.RevealFrameLayout;

/* renamed from: academia.bracu.com.academia.splash.a */
public abstract class C0182a extends C0273e {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C3712a f631A;

    /* renamed from: B */
    private FrameLayout f632B;

    /* renamed from: C */
    private C5595a f633C;

    /* renamed from: D */
    private boolean f634D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f635E = 0;

    /* renamed from: F */
    private RevealFrameLayout f636F;

    /* renamed from: x */
    private RelativeLayout f637x;

    /* renamed from: y */
    private ImageView f638y;

    /* renamed from: z */
    private AppCompatTextView f639z;

    /* renamed from: academia.bracu.com.academia.splash.a$a */
    class C0183a implements C3720a {
        C0183a() {
        }

        /* renamed from: a */
        public void mo560a(int i) {
            if (i == 3) {
                C0182a.this.mo558a0();
            }
        }
    }

    /* renamed from: academia.bracu.com.academia.splash.a$b */
    class C0184b implements C5608b.C5609a {
        C0184b() {
        }

        /* renamed from: a */
        public void mo561a() {
            if (C0182a.this.f635E == 1) {
                C0182a.this.f631A.mo12246m();
            } else {
                C0182a.this.mo557Z();
            }
        }

        /* renamed from: b */
        public void mo562b() {
        }

        /* renamed from: c */
        public void mo563c() {
        }

        /* renamed from: d */
        public void mo564d() {
        }
    }

    /* renamed from: academia.bracu.com.academia.splash.a$c */
    class C0185c implements C5544a.C5545a {
        C0185c() {
        }

        /* renamed from: a */
        public void mo565a(C5544a aVar) {
            C0182a.this.mo558a0();
        }

        /* renamed from: b */
        public void mo566b(C5544a aVar) {
        }

        /* renamed from: c */
        public void mo567c(C5544a aVar) {
        }
    }

    /* renamed from: academia.bracu.com.academia.splash.a$d */
    class C0186d implements C5544a.C5545a {
        C0186d() {
        }

        /* renamed from: a */
        public void mo565a(C5544a aVar) {
            C0182a.this.mo552U();
        }

        /* renamed from: b */
        public void mo566b(C5544a aVar) {
        }

        /* renamed from: c */
        public void mo567c(C5544a aVar) {
        }
    }

    /* renamed from: U */
    public abstract void mo552U();

    /* renamed from: V */
    public void mo554V() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(C2722R.dimen.fourthSampleViewSize);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.setMargins(0, 0, 0, 50);
        C3713b bVar = new C3713b();
        bVar.mo12263g(this.f632B);
        bVar.mo12261e(layoutParams);
        bVar.mo12267k(this.f633C.mo16113m());
        bVar.mo12262f(this.f633C.mo16112l(), this.f633C.mo16111k());
        bVar.mo12266j(this.f633C.mo16116p());
        bVar.mo12264h(Color.parseColor(String.format("#%06X", new Object[]{Integer.valueOf(getResources().getColor(this.f633C.mo16115o()) & 16777215)})));
        bVar.mo12259c(Color.parseColor(String.format("#%06X", new Object[]{Integer.valueOf(getResources().getColor(this.f633C.mo16114n()) & 16777215)})));
        bVar.mo12265i(this.f633C.mo16106e());
        bVar.mo12260d(this.f633C.mo16105d());
        bVar.mo12258b(new C3716b());
        C3712a a = bVar.mo12257a();
        this.f631A = a;
        a.setOnStateChangeListener(new C0183a());
    }

    /* renamed from: W */
    public abstract void mo553W(C5595a aVar);

    /* renamed from: X */
    public void mo555X(int i) {
        setContentView((int) C2722R.layout.activity_main_lib);
        this.f636F = (RevealFrameLayout) findViewById(C2722R.C2724id.rfParent);
        this.f637x = (RelativeLayout) findViewById(C2722R.C2724id.rlColor);
        this.f639z = (AppCompatTextView) findViewById(C2722R.C2724id.txtTitle);
        if (i == 1) {
            this.f632B = (FrameLayout) findViewById(C2722R.C2724id.flCentral);
            mo554V();
        } else if (i == 2) {
            ImageView imageView = (ImageView) findViewById(C2722R.C2724id.imgLogo);
            this.f638y = imageView;
            imageView.setImageResource(this.f633C.mo16110j());
        }
    }

    /* renamed from: Y */
    public void mo556Y() {
        int max = Math.max(this.f637x.getWidth(), this.f637x.getHeight()) + (this.f637x.getHeight() / 2);
        int a = C5596a.m23193a(this.f637x, this.f633C.mo16118r());
        int a2 = C5596a.m23193a(this.f637x, this.f633C.mo16117q());
        this.f637x.setBackgroundColor(getResources().getColor(this.f633C.mo16109h()));
        C5608b a3 = C5614e.m23232a(this.f637x, a2, a, 0.0f, (float) max);
        a3.mo16137c(new AccelerateDecelerateInterpolator());
        a3.mo16136b(this.f633C.mo16102a());
        a3.mo16135a(new C0184b());
        a3.mo16138d();
        this.f634D = true;
    }

    /* renamed from: Z */
    public void mo557Z() {
        this.f638y.setVisibility(0);
        this.f638y.setImageResource(this.f633C.mo16110j());
        C3583c.C3585b c = C3583c.m15359c(this.f633C.mo16104c());
        c.mo12188i(new C0185c());
        c.mo12186g((long) this.f633C.mo16103b());
        c.mo12187h(this.f638y);
    }

    /* renamed from: a0 */
    public void mo558a0() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, C2722R.C2724id.flCentral);
        layoutParams.addRule(14);
        this.f639z.setLayoutParams(layoutParams);
        this.f639z.setVisibility(0);
        C3583c.C3585b c = C3583c.m15359c(this.f633C.mo16108g());
        c.mo12188i(new C0186d());
        c.mo12186g((long) this.f633C.mo16107f());
        c.mo12187h(this.f639z);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5595a aVar = new C5595a();
        this.f633C = aVar;
        mo553W(aVar);
        int a = C5597b.m23194a(this.f633C);
        this.f635E = a;
        mo555X(a);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && !this.f634D) {
            mo556Y();
        }
    }
}
