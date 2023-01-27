package academia.bracu.com.academia.boommenu;

import academia.bracu.com.academia.boommenu.p001a.C0014a;
import academia.bracu.com.academia.boommenu.p001a.C0016b;
import academia.bracu.com.academia.boommenu.p001a.C0017c;
import academia.bracu.com.academia.boommenu.p001a.C0019d;
import academia.bracu.com.academia.boommenu.p001a.C0020e;
import academia.bracu.com.academia.boommenu.p001a.C0021f;
import academia.bracu.com.academia.boommenu.p001a.C0022g;
import academia.bracu.com.academia.boommenu.p001a.C0023h;
import academia.bracu.com.academia.boommenu.p001a.C0024i;
import academia.bracu.com.academia.boommenu.p002c.C0027a;
import academia.bracu.com.academia.boommenu.p002c.C0032b;
import academia.bracu.com.academia.boommenu.p002c.C0034d;
import academia.bracu.com.academia.boommenu.p002c.C0035e;
import academia.bracu.com.academia.boommenu.p002c.C0039g;
import academia.bracu.com.academia.boommenu.p002c.C0042h;
import academia.bracu.com.academia.boommenu.p002c.C0044j;
import academia.bracu.com.academia.boommenu.p002c.C0047k;
import academia.bracu.com.academia.boommenu.p002c.C0050l;
import academia.bracu.com.academia.boommenu.p003h.C0057a;
import academia.bracu.com.academia.boommenu.p003h.C0060d;
import academia.bracu.com.academia.boommenu.p003h.C0062e;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

public class BoomMenuButton extends FrameLayout implements C0042h {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f7A;

    /* renamed from: A0 */
    private ArrayList<C0027a> f8A0 = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public float f9B;

    /* renamed from: B0 */
    private ArrayList<C0032b> f10B0 = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: C */
    public float f11C;

    /* renamed from: C0 */
    private float f12C0;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f13D = false;

    /* renamed from: D0 */
    private float f14D0;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f15E = false;

    /* renamed from: E0 */
    private float f16E0;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public float f17F = -1.0f;

    /* renamed from: F0 */
    private float f18F0;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public float f19G = -1.0f;

    /* renamed from: G0 */
    private float f20G0;

    /* renamed from: H */
    private Rect f21H;

    /* renamed from: H0 */
    private float f22H0;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public FrameLayout f23I;

    /* renamed from: I0 */
    private C0035e f24I0 = C0035e.Unknown;

    /* renamed from: J */
    private ArrayList<C0057a> f25J;

    /* renamed from: J0 */
    private ArrayList<PointF> f26J0 = new ArrayList<>();

    /* renamed from: K */
    private ArrayList<RectF> f27K;

    /* renamed from: K0 */
    private C0034d f28K0;

    /* renamed from: L */
    private float f29L;

    /* renamed from: L0 */
    private float f30L0;

    /* renamed from: M */
    private float f31M;

    /* renamed from: M0 */
    private float f32M0;

    /* renamed from: N */
    private float f33N;

    /* renamed from: N0 */
    private float f34N0;

    /* renamed from: O */
    private float f35O = -1.0f;

    /* renamed from: O0 */
    private float f36O0;

    /* renamed from: P */
    private float f37P;

    /* renamed from: P0 */
    private float f38P0;

    /* renamed from: Q */
    private float f39Q;

    /* renamed from: Q0 */
    private float f40Q0;

    /* renamed from: R */
    private float f41R;

    /* renamed from: R0 */
    private float f42R0;

    /* renamed from: S */
    private float f43S;

    /* renamed from: S0 */
    private ArrayList<PointF> f44S0;

    /* renamed from: T */
    private int f45T;

    /* renamed from: T0 */
    private ArrayList<PointF> f46T0;

    /* renamed from: U */
    private int f47U;

    /* renamed from: U0 */
    private float f48U0;

    /* renamed from: V */
    private float f49V;

    /* renamed from: V0 */
    private boolean f50V0 = true;

    /* renamed from: W */
    private C0023h f51W;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public boolean f52W0 = true;

    /* renamed from: X0 */
    private int f53X0 = -1;

    /* renamed from: Y0 */
    private boolean f54Y0;
    /* access modifiers changed from: private */

    /* renamed from: Z0 */
    public int f55Z0 = -1;

    /* renamed from: a0 */
    private C0060d f56a0 = C0060d.Unknown;
    /* access modifiers changed from: private */

    /* renamed from: a1 */
    public boolean f57a1 = false;

    /* renamed from: b0 */
    private ArrayList<PointF> f58b0 = new ArrayList<>();

    /* renamed from: b1 */
    private OrientationEventListener f59b1;

    /* renamed from: c0 */
    private int f60c0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public C0056g f61d0;

    /* renamed from: e0 */
    private int f62e0;

    /* renamed from: f */
    private Context f63f;

    /* renamed from: f0 */
    private long f64f0;

    /* renamed from: g */
    private boolean f65g = true;

    /* renamed from: g0 */
    private long f66g0;

    /* renamed from: h */
    private boolean f67h;

    /* renamed from: h0 */
    private long f68h0;

    /* renamed from: i */
    private boolean f69i;

    /* renamed from: i0 */
    private long f70i0;

    /* renamed from: j */
    private boolean f71j;

    /* renamed from: j0 */
    private boolean f72j0;

    /* renamed from: k */
    private boolean f73k;

    /* renamed from: k0 */
    private boolean f74k0;

    /* renamed from: l */
    private boolean f75l = true;

    /* renamed from: l0 */
    private C0021f f76l0;

    /* renamed from: m */
    private Runnable f77m;

    /* renamed from: m0 */
    private int f78m0;

    /* renamed from: n */
    private boolean f79n;

    /* renamed from: n0 */
    private C0016b f80n0;

    /* renamed from: o */
    private int f81o;

    /* renamed from: o0 */
    private C0019d f82o0;

    /* renamed from: p */
    private int f83p;

    /* renamed from: p0 */
    private C0019d f84p0;

    /* renamed from: q */
    private int f85q;

    /* renamed from: q0 */
    private C0019d f86q0;

    /* renamed from: r */
    private int f87r;

    /* renamed from: r0 */
    private C0019d f88r0;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public BMBShadow f89s;

    /* renamed from: s0 */
    private C0019d f90s0;

    /* renamed from: t */
    private int f91t;

    /* renamed from: t0 */
    private C0019d f92t0;

    /* renamed from: u */
    private C0054e f93u = C0054e.Unknown;

    /* renamed from: u0 */
    private int f94u0;

    /* renamed from: v */
    private boolean f95v;

    /* renamed from: v0 */
    private boolean f96v0;

    /* renamed from: w */
    private boolean f97w;

    /* renamed from: w0 */
    private boolean f98w0;

    /* renamed from: x */
    private int f99x;

    /* renamed from: x0 */
    private boolean f100x0;

    /* renamed from: y */
    private int f101y;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public C0053d f102y0 = C0053d.DidReboom;

    /* renamed from: z */
    private int f103z;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public C0025b f104z0;

    /* renamed from: academia.bracu.com.academia.boommenu.BoomMenuButton$a */
    class C0002a implements TimeInterpolator {
        C0002a() {
        }

        public float getInterpolation(float f) {
            return Math.min(f * 2.0f, 1.0f);
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.BoomMenuButton$b */
    class C0003b implements TimeInterpolator {
        C0003b() {
        }

        public float getInterpolation(float f) {
            if (((double) f) <= 0.5d) {
                return 0.0f;
            }
            return Math.min((f - 0.5f) * 2.0f, 1.0f);
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.BoomMenuButton$c */
    static /* synthetic */ class C0004c {

        /* renamed from: a */
        static final /* synthetic */ int[] f107a;

        /* renamed from: b */
        static final /* synthetic */ int[] f108b;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        static {
            /*
                academia.bracu.com.academia.boommenu.d[] r0 = academia.bracu.com.academia.boommenu.C0053d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f108b = r0
                r1 = 1
                academia.bracu.com.academia.boommenu.d r2 = academia.bracu.com.academia.boommenu.C0053d.DidReboom     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f108b     // Catch:{ NoSuchFieldError -> 0x001d }
                academia.bracu.com.academia.boommenu.d r3 = academia.bracu.com.academia.boommenu.C0053d.DidBoom     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f108b     // Catch:{ NoSuchFieldError -> 0x0028 }
                academia.bracu.com.academia.boommenu.d r4 = academia.bracu.com.academia.boommenu.C0053d.WillBoom     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f108b     // Catch:{ NoSuchFieldError -> 0x0033 }
                academia.bracu.com.academia.boommenu.d r5 = academia.bracu.com.academia.boommenu.C0053d.WillReboom     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                academia.bracu.com.academia.boommenu.e[] r4 = academia.bracu.com.academia.boommenu.C0054e.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f107a = r4
                academia.bracu.com.academia.boommenu.e r5 = academia.bracu.com.academia.boommenu.C0054e.SimpleCircle     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f107a     // Catch:{ NoSuchFieldError -> 0x004e }
                academia.bracu.com.academia.boommenu.e r4 = academia.bracu.com.academia.boommenu.C0054e.TextInsideCircle     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f107a     // Catch:{ NoSuchFieldError -> 0x0058 }
                academia.bracu.com.academia.boommenu.e r1 = academia.bracu.com.academia.boommenu.C0054e.TextOutsideCircle     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f107a     // Catch:{ NoSuchFieldError -> 0x0062 }
                academia.bracu.com.academia.boommenu.e r1 = academia.bracu.com.academia.boommenu.C0054e.Ham     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f107a     // Catch:{ NoSuchFieldError -> 0x006d }
                academia.bracu.com.academia.boommenu.e r1 = academia.bracu.com.academia.boommenu.C0054e.Unknown     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.boommenu.BoomMenuButton.C0004c.<clinit>():void");
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.BoomMenuButton$d */
    class C0005d implements View.OnClickListener {
        C0005d() {
        }

        public void onClick(View view) {
            BoomMenuButton.this.mo14I();
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.BoomMenuButton$e */
    class C0006e implements View.OnTouchListener {
        C0006e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (Math.abs(BoomMenuButton.this.f17F - motionEvent.getRawX()) > 10.0f || Math.abs(BoomMenuButton.this.f19G - motionEvent.getRawY()) > 10.0f) {
                            boolean unused = BoomMenuButton.this.f13D = true;
                        }
                        if (!BoomMenuButton.this.f7A || !BoomMenuButton.this.f13D) {
                            boolean unused2 = BoomMenuButton.this.f13D = false;
                        } else {
                            boolean unused3 = BoomMenuButton.this.f15E = true;
                            if (BoomMenuButton.this.f89s != null) {
                                BoomMenuButton.this.setX(motionEvent.getRawX() + BoomMenuButton.this.f9B);
                                BoomMenuButton.this.setY(motionEvent.getRawY() + BoomMenuButton.this.f11C);
                            }
                        }
                    } else if (actionMasked == 3 && BoomMenuButton.this.f15E) {
                        boolean unused4 = BoomMenuButton.this.f13D = false;
                        boolean unused5 = BoomMenuButton.this.f15E = false;
                        boolean unused6 = BoomMenuButton.this.f52W0 = true;
                        BoomMenuButton.this.m74s0();
                        return true;
                    }
                } else if (BoomMenuButton.this.f15E) {
                    boolean unused7 = BoomMenuButton.this.f13D = false;
                    boolean unused8 = BoomMenuButton.this.f15E = false;
                    boolean unused9 = BoomMenuButton.this.f52W0 = true;
                    BoomMenuButton.this.m74s0();
                    BoomMenuButton.this.f23I.setPressed(false);
                    return true;
                }
            } else if (BoomMenuButton.this.f7A) {
                BoomMenuButton boomMenuButton = BoomMenuButton.this;
                float unused10 = boomMenuButton.f9B = boomMenuButton.getX() - motionEvent.getRawX();
                BoomMenuButton boomMenuButton2 = BoomMenuButton.this;
                float unused11 = boomMenuButton2.f11C = boomMenuButton2.getY() - motionEvent.getRawY();
                float unused12 = BoomMenuButton.this.f17F = motionEvent.getRawX();
                float unused13 = BoomMenuButton.this.f19G = motionEvent.getRawY();
            }
            return false;
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.BoomMenuButton$f */
    class C0007f extends AnimatorListenerAdapter {
        C0007f() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C0053d unused = BoomMenuButton.this.f102y0 = C0053d.DidBoom;
            if (BoomMenuButton.this.f61d0 != null) {
                BoomMenuButton.this.f61d0.mo277d();
            }
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.BoomMenuButton$g */
    class C0008g implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0057a f112f;

        /* renamed from: g */
        final /* synthetic */ C0027a f113g;

        /* renamed from: h */
        final /* synthetic */ PointF f114h;

        /* renamed from: i */
        final /* synthetic */ PointF f115i;

        /* renamed from: j */
        final /* synthetic */ int f116j;

        /* renamed from: k */
        final /* synthetic */ boolean f117k;

        C0008g(C0057a aVar, C0027a aVar2, PointF pointF, PointF pointF2, int i, boolean z) {
            this.f112f = aVar;
            this.f113g = aVar2;
            this.f114h = pointF;
            this.f115i = pointF2;
            this.f116j = i;
            this.f117k = z;
        }

        public void run() {
            BoomMenuButton.this.m56i0(this.f112f, this.f113g, this.f114h, this.f115i, this.f116j, this.f117k);
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.BoomMenuButton$h */
    class C0009h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0057a f119a;

        /* renamed from: b */
        final /* synthetic */ C0027a f120b;

        C0009h(C0057a aVar, C0027a aVar2) {
            this.f119a = aVar;
            this.f120b = aVar2;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f120b.mo209f();
            BoomMenuButton.m57j(BoomMenuButton.this);
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C0073q.m289D(4, this.f119a);
            C0073q.m289D(0, this.f120b);
            this.f120b.mo204W();
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.BoomMenuButton$i */
    class C0010i extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0027a f122a;

        /* renamed from: b */
        final /* synthetic */ C0057a f123b;

        C0010i(C0027a aVar, C0057a aVar2) {
            this.f122a = aVar;
            this.f123b = aVar2;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C0073q.m289D(0, this.f123b);
            C0073q.m289D(4, this.f122a);
            this.f122a.mo208e();
            BoomMenuButton.m57j(BoomMenuButton.this);
            BoomMenuButton.this.m39Z();
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f122a.mo203V();
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.BoomMenuButton$j */
    class C0011j implements Runnable {
        C0011j() {
        }

        public void run() {
            BoomMenuButton.this.m38Y();
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.BoomMenuButton$k */
    class C0012k extends OrientationEventListener {
        C0012k(Context context) {
            super(context);
        }

        public void onOrientationChanged(int i) {
            if (!(i == BoomMenuButton.this.f55Z0 || BoomMenuButton.this.f55Z0 == -1)) {
                boolean unused = BoomMenuButton.this.f57a1 = true;
            }
            int unused2 = BoomMenuButton.this.f55Z0 = i;
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.BoomMenuButton$l */
    class C0013l implements Runnable {
        C0013l() {
        }

        public void run() {
            if (BoomMenuButton.this.f104z0 != null) {
                BoomMenuButton.this.f104z0.mo180c(BoomMenuButton.this);
            }
            boolean z = true;
            BoomMenuButton.this.m27M(true);
            BoomMenuButton.this.m25K();
            int i = C0004c.f108b[BoomMenuButton.this.f102y0.ordinal()];
            if (i != 2) {
                if (i == 3 || i == 4) {
                    BoomMenuButton boomMenuButton = BoomMenuButton.this;
                    if (boomMenuButton.f102y0 != C0053d.WillBoom) {
                        z = false;
                    }
                    boomMenuButton.m21F0(z);
                } else {
                    return;
                }
            }
            BoomMenuButton.this.m66o0();
        }
    }

    static {
        Class<BoomMenuButton> cls = BoomMenuButton.class;
    }

    public BoomMenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40a0(context, attributeSet);
    }

    /* renamed from: A0 */
    private void m11A0(boolean z) {
        C0025b bVar = this.f104z0;
        if (bVar != null) {
            bVar.removeAllViews();
        }
        m25K();
        ArrayList<Integer> j = C0014a.m105j(this.f56a0 == C0060d.Share ? C0021f.DEFAULT : this.f76l0, this.f25J.size());
        int i = this.f53X0;
        if (i != -1 && this.f96v0) {
            ArrayList<C0027a> arrayList = this.f8A0;
            C0032b bVar2 = this.f10B0.get(i);
            bVar2.mo247d(this);
            bVar2.mo246c(this.f53X0);
            arrayList.set(i, bVar2.mo244a(this.f63f));
        }
        for (int size = j.size() - 1; size >= 0; size--) {
            int intValue = j.get(size).intValue();
            C0027a aVar = this.f8A0.get(intValue);
            PointF pointF = new PointF(this.f44S0.get(intValue).x - aVar.f220f.x, this.f44S0.get(intValue).y - aVar.f220f.y);
            m76t0(aVar, pointF);
            m13B0(this.f25J.get(intValue), aVar, pointF, this.f46T0.get(intValue), size, z);
        }
    }

    /* renamed from: B0 */
    private void m13B0(C0057a aVar, C0027a aVar2, PointF pointF, PointF pointF2, int i, boolean z) {
        if (m59k0()) {
            post(new C0008g(aVar, aVar2, pointF, pointF2, i, z));
        } else {
            m56i0(aVar, aVar2, pointF, pointF2, i, z);
        }
    }

    /* renamed from: C0 */
    private void m15C0(C0057a aVar, C0027a aVar2, PointF pointF, PointF pointF2, int i, boolean z) {
        int i2;
        C0027a aVar3 = aVar2;
        PointF pointF3 = pointF2;
        this.f60c0++;
        int i3 = this.f78m0;
        float[] fArr = new float[(i3 + 1)];
        float[] fArr2 = new float[(i3 + 1)];
        float width = (((float) aVar.getWidth()) * 1.0f) / ((float) aVar2.mo207d());
        float height = (((float) aVar.getHeight()) * 1.0f) / ((float) aVar2.mo206c());
        long j = 1;
        long j2 = z ? 1 : this.f70i0 * ((long) i);
        if (!z) {
            j = this.f68h0;
        }
        long j3 = j;
        C0014a.m102g(this.f80n0, new PointF((float) this.f104z0.getLayoutParams().width, (float) this.f104z0.getLayoutParams().height), C0017c.m119j(this.f88r0), this.f78m0, pointF, pointF2, fArr, fArr2);
        if (!aVar2.mo233t()) {
            i2 = 2;
        } else if (aVar2.mo237x()) {
            i2 = 2;
            C0014a.m100e(aVar2, "rippleButtonColor", j2, j3, C0020e.m122a(), aVar2.mo205b(), aVar2.mo235v());
        } else {
            i2 = 2;
            C0014a.m100e(aVar2, "nonRippleButtonColor", j2, j3, C0020e.m122a(), aVar2.mo205b(), aVar2.mo235v());
        }
        C0027a aVar4 = aVar2;
        long j4 = j2;
        long j5 = j3;
        C0014a.m98c(aVar4, "x", j4, j5, new LinearInterpolator(), fArr);
        C0014a.m98c(aVar4, "y", j4, j5, new LinearInterpolator(), fArr2);
        C0017c j6 = C0017c.m119j(this.f92t0);
        float[] fArr3 = new float[i2];
        fArr3[0] = 0.0f;
        fArr3[1] = (float) (-this.f94u0);
        C0014a.m109n(aVar2, j2, j3, j6, fArr3);
        float[] fArr4 = new float[i2];
        // fill-array-data instruction
        fArr4[0] = 1065353216;
        fArr4[1] = 0;
        C0014a.m101f("alpha", j2, j3, fArr4, C0017c.m119j(C0019d.Linear), aVar2.mo210g());
        C0017c j7 = C0017c.m119j(this.f90s0);
        float[] fArr5 = new float[i2];
        fArr5[0] = 1.0f;
        fArr5[1] = width;
        long j8 = j2;
        float[] fArr6 = fArr5;
        long j9 = j3;
        C0014a.m98c(aVar2, "scaleX", j8, j9, j7, fArr6);
        C0017c j10 = C0017c.m119j(this.f90s0);
        C0010i iVar = new C0010i(aVar3, aVar);
        float[] fArr7 = new float[i2];
        fArr7[0] = 1.0f;
        fArr7[1] = height;
        C0014a.m97b(aVar2, "scaleY", j8, j9, j10, iVar, fArr7);
        if (this.f96v0) {
            C0022g k = C0014a.m106k(fArr, fArr2, j2, j3, aVar2);
            k.mo169b(aVar3, pointF3.x, pointF3.y);
            aVar3.setCameraDistance(0.0f);
            aVar3.startAnimation(k);
        }
    }

    /* renamed from: D0 */
    private void m17D0(boolean z) {
        C0014a.m101f("alpha", 0, z ? 1 : this.f68h0 + (this.f70i0 * ((long) (this.f25J.size() - 1))), new float[]{0.0f, 1.0f}, new C0003b(), getFadeViews());
    }

    /* renamed from: E0 */
    private void m19E0(boolean z) {
        ArrayList<Integer> j = C0014a.m105j(this.f56a0 == C0060d.Share ? C0021f.REVERSE : this.f76l0, this.f25J.size());
        this.f53X0 = j.get(j.size() - 1).intValue();
        Iterator<Integer> it = j.iterator();
        while (it.hasNext()) {
            this.f8A0.get(it.next().intValue()).bringToFront();
        }
        for (int i = 0; i < j.size(); i++) {
            int intValue = j.get(i).intValue();
            C0027a aVar = this.f8A0.get(intValue);
            m15C0(this.f25J.get(intValue), aVar, this.f46T0.get(intValue), new PointF(this.f44S0.get(intValue).x - aVar.f220f.x, this.f44S0.get(intValue).y - aVar.f220f.y), i, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public void m21F0(boolean z) {
        C0025b bVar = this.f104z0;
        if (bVar != null) {
            bVar.clearAnimation();
        }
        Iterator<C0027a> it = this.f8A0.iterator();
        while (it.hasNext()) {
            it.next().clearAnimation();
        }
    }

    /* renamed from: G0 */
    private void m23G0() {
        if (!this.f65g) {
            this.f65g = true;
            if (!isInLayout()) {
                requestLayout();
            }
        }
    }

    /* renamed from: H0 */
    private boolean m24H0() {
        return this.f93u.equals(C0054e.Unknown) || this.f56a0.equals(C0060d.Unknown) || this.f24I0.equals(C0035e.Unknown);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a A[LOOP:0: B:16:0x0052->B:18:0x005a, LOOP_END] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m25K() {
        /*
            r4 = this;
            android.graphics.Point r0 = new android.graphics.Point
            academia.bracu.com.academia.boommenu.b r1 = r4.f104z0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r1 = r1.width
            academia.bracu.com.academia.boommenu.b r2 = r4.f104z0
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r2 = r2.height
            r0.<init>(r1, r2)
            int[] r1 = academia.bracu.com.academia.boommenu.BoomMenuButton.C0004c.f107a
            academia.bracu.com.academia.boommenu.e r2 = r4.f93u
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0043
            r2 = 2
            if (r1 == r2) goto L_0x0040
            r2 = 3
            if (r1 == r2) goto L_0x0031
            r2 = 4
            if (r1 == r2) goto L_0x002c
            goto L_0x0051
        L_0x002c:
            float r1 = r4.f20G0
            float r2 = r4.f22H0
            goto L_0x0035
        L_0x0031:
            float r1 = r4.f16E0
            float r2 = r4.f18F0
        L_0x0035:
            java.util.ArrayList<academia.bracu.com.academia.boommenu.c.b> r3 = r4.f10B0
            int r3 = r3.size()
            java.util.ArrayList r0 = academia.bracu.com.academia.boommenu.p002c.C0037f.m194c(r0, r1, r2, r3, r4)
            goto L_0x004f
        L_0x0040:
            float r1 = r4.f14D0
            goto L_0x0045
        L_0x0043:
            float r1 = r4.f12C0
        L_0x0045:
            java.util.ArrayList<academia.bracu.com.academia.boommenu.c.b> r2 = r4.f10B0
            int r2 = r2.size()
            java.util.ArrayList r0 = academia.bracu.com.academia.boommenu.p002c.C0037f.m195d(r0, r1, r2, r4)
        L_0x004f:
            r4.f46T0 = r0
        L_0x0051:
            r0 = 0
        L_0x0052:
            java.util.ArrayList<academia.bracu.com.academia.boommenu.c.a> r1 = r4.f8A0
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0082
            java.util.ArrayList<android.graphics.PointF> r1 = r4.f46T0
            java.lang.Object r1 = r1.get(r0)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            java.util.ArrayList<academia.bracu.com.academia.boommenu.c.a> r2 = r4.f8A0
            java.lang.Object r2 = r2.get(r0)
            academia.bracu.com.academia.boommenu.c.a r2 = (academia.bracu.com.academia.boommenu.p002c.C0027a) r2
            android.graphics.PointF r2 = r2.f220f
            float r2 = r2.x
            float r2 = -r2
            java.util.ArrayList<academia.bracu.com.academia.boommenu.c.a> r3 = r4.f8A0
            java.lang.Object r3 = r3.get(r0)
            academia.bracu.com.academia.boommenu.c.a r3 = (academia.bracu.com.academia.boommenu.p002c.C0027a) r3
            android.graphics.PointF r3 = r3.f220f
            float r3 = r3.y
            float r3 = -r3
            r1.offset(r2, r3)
            int r0 = r0 + 1
            goto L_0x0052
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.boommenu.BoomMenuButton.m25K():void");
    }

    /* renamed from: L */
    private void m26L() {
        ArrayList<RectF> f;
        int i = C0004c.f107a[this.f93u.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            f = this.f56a0 == C0060d.Share ? C0062e.m282f(this, new Point(this.f23I.getWidth(), this.f23I.getHeight()), this.f10B0.size()) : C0062e.m280d(this, new Point(this.f23I.getWidth(), this.f23I.getHeight()));
        } else if (i == 4) {
            f = C0062e.m281e(this, new Point(this.f23I.getWidth(), this.f23I.getHeight()));
        } else if (i == 5) {
            throw new RuntimeException("The button-enum is unknown!");
        } else {
            return;
        }
        this.f27K = f;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m27M(boolean z) {
        if (z || this.f52W0 || this.f71j || this.f73k) {
            if (!z) {
                this.f52W0 = false;
            }
            this.f44S0 = new ArrayList<>(m64n0());
            int[] iArr = new int[2];
            getParentView().getLocationOnScreen(iArr);
            for (int i = 0; i < this.f25J.size(); i++) {
                PointF pointF = new PointF();
                int[] iArr2 = new int[2];
                this.f23I.getLocationOnScreen(iArr2);
                pointF.x = ((((float) iArr2[0]) + this.f27K.get(i).left) - ((float) iArr[0])) + ((float) (this.f25J.get(i).getLayoutParams().width >> 1));
                pointF.y = ((((float) iArr2[1]) + this.f27K.get(i).top) - ((float) iArr[1])) + ((float) (this.f25J.get(i).getLayoutParams().height >> 1));
                this.f44S0.add(pointF);
            }
        }
    }

    /* renamed from: N */
    private void m28N() {
        if (this.f100x0) {
            mo15J();
        } else if (this.f98w0) {
            mo14I();
        }
        this.f98w0 = false;
        this.f100x0 = false;
    }

    /* renamed from: O */
    private void m29O() {
        C0073q.m289D(8, this.f104z0);
        if (!this.f67h || this.f71j || this.f73k) {
            this.f104z0.removeAllViews();
            ((ViewGroup) this.f104z0.getParent()).removeView(this.f104z0);
            this.f104z0 = null;
        }
    }

    /* renamed from: Q */
    private void m30Q() {
        this.f50V0 = true;
        if (this.f104z0 != null) {
            Iterator<C0027a> it = this.f8A0.iterator();
            while (it.hasNext()) {
                this.f104z0.removeView(it.next());
            }
        }
        this.f8A0.clear();
    }

    /* renamed from: R */
    private void m31R() {
        ArrayList<C0057a> arrayList = this.f25J;
        if (arrayList != null) {
            Iterator<C0057a> it = arrayList.iterator();
            while (it.hasNext()) {
                this.f23I.removeView(it.next());
            }
        }
        ArrayList<C0057a> arrayList2 = this.f25J;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
    }

    /* renamed from: S */
    private void m32S() {
        if (!this.f67h || this.f71j || this.f73k) {
            m30Q();
            m29O();
        }
    }

    /* renamed from: T */
    private void m33T() {
        if (this.f104z0 == null) {
            this.f104z0 = new C0025b(this.f63f, this);
        }
    }

    /* renamed from: U */
    private void m34U() {
        if (this.f50V0) {
            this.f50V0 = false;
            this.f8A0 = new ArrayList<>(this.f25J.size());
            this.f25J.size();
            for (int i = 0; i < this.f10B0.size(); i++) {
                ArrayList<C0027a> arrayList = this.f8A0;
                C0032b bVar = this.f10B0.get(i);
                bVar.mo247d(this);
                bVar.mo246c(i);
                arrayList.add(bVar.mo244a(this.f63f));
            }
            int i2 = C0004c.f107a[this.f93u.ordinal()];
            if (i2 == 1) {
                this.f12C0 = (float) ((C0044j.C0046b) this.f10B0.get(0)).mo265m();
            } else if (i2 == 2) {
                this.f14D0 = (float) ((C0047k.C0049b) this.f10B0.get(0)).mo268n();
            } else if (i2 == 3) {
                this.f16E0 = (float) ((C0050l.C0052b) this.f10B0.get(0)).mo272n();
                this.f18F0 = (float) ((C0050l.C0052b) this.f10B0.get(0)).mo271m();
            } else if (i2 == 4) {
                this.f20G0 = (float) ((C0039g.C0041b) this.f10B0.get(0)).mo262n();
                this.f22H0 = (float) ((C0039g.C0041b) this.f10B0.get(0)).mo261m();
            }
        }
    }

    /* renamed from: V */
    private void m35V() {
        m26L();
        int n0 = m64n0();
        this.f25J = new ArrayList<>(n0);
        for (int i = 0; i < n0; i++) {
            if (this.f10B0.size() > i) {
                this.f25J.add(C0062e.m279c(this, this.f10B0.get(i)));
            }
        }
    }

    /* renamed from: W */
    private void m36W() {
        if (this.f77m == null) {
            this.f77m = new C0011j();
        }
        post(this.f77m);
    }

    /* renamed from: X */
    private void m37X(boolean z) {
        m33T();
        C0073q.m289D(0, this.f104z0);
        long size = z ? 1 : this.f64f0 + (this.f66g0 * ((long) (this.f25J.size() - 1)));
        this.f104z0.mo178a(size, new C0007f());
        if (this.f56a0 == C0060d.Share) {
            C0014a.m98c(this.f51W, "showProcess", 0, size, C0017c.m119j(C0019d.Linear), 0.0f, 1.0f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m38Y() {
        if (!m24H0()) {
            m31R();
            m35V();
            m72r0();
            m68p0();
            m70q0();
            m27M(false);
            m85y0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m39Z() {
        if (!mo72j0()) {
            this.f102y0 = C0053d.DidReboom;
            C0056g gVar = this.f61d0;
            if (gVar != null) {
                gVar.mo275b();
            }
            this.f104z0.setVisibility(8);
            m32S();
        }
    }

    /* renamed from: a0 */
    private void m40a0(Context context, AttributeSet attributeSet) {
        this.f63f = context;
        LayoutInflater.from(context).inflate(C0071o.bmb, this, true);
        m42b0(context, attributeSet);
        m50f0();
        m44c0();
    }

    /* renamed from: b0 */
    private void m42b0(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0072p.BoomMenuButton, 0, 0);
        try {
            this.f67h = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_cacheOptimization, C0065i.default_bmb_cacheOptimization);
            this.f69i = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_boomInWholeScreen, C0065i.default_bmb_boomInWholeScreen);
            this.f71j = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_inList, C0065i.default_bmb_inList);
            this.f73k = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_inFragment, C0065i.default_bmb_inFragment);
            this.f75l = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_backPressListened, C0065i.default_bmb_backPressListened);
            this.f54Y0 = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_orientationAdaptable, C0065i.default_bmb_orientationAdaptable);
            this.f79n = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_shadowEffect, C0065i.default_bmb_shadow_effect);
            this.f85q = C0073q.m301l(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_shadowRadius, C0067k.default_bmb_shadow_radius);
            this.f81o = C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_shadowOffsetX, C0067k.default_bmb_shadow_offset_x);
            this.f83p = C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_shadowOffsetY, C0067k.default_bmb_shadow_offset_y);
            this.f87r = C0073q.m297h(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_shadowColor, C0066j.default_bmb_shadow_color);
            this.f91t = C0073q.m301l(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_buttonRadius, C0067k.default_bmb_button_radius);
            this.f93u = C0054e.getEnum(C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_buttonEnum, C0070n.default_bmb_button_enum));
            this.f95v = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_backgroundEffect, C0065i.default_bmb_background_effect);
            this.f97w = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_rippleEffect, C0065i.default_bmb_ripple_effect);
            this.f99x = C0073q.m297h(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_normalColor, C0066j.default_bmb_normal_color);
            int h = C0073q.m297h(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_highlightedColor, C0066j.default_bmb_highlighted_color);
            this.f101y = h;
            if (h == 0) {
                this.f101y = C0073q.m299j(this.f99x);
            }
            int h2 = C0073q.m297h(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_unableColor, C0066j.default_bmb_unable_color);
            this.f103z = h2;
            if (h2 == 0) {
                this.f103z = C0073q.m305p(this.f99x);
            }
            this.f7A = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_draggable, C0065i.default_bmb_draggable);
            Rect rect = new Rect(0, 0, 0, 0);
            this.f21H = rect;
            rect.left = C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_edgeInsetsLeft, C0067k.default_bmb_edgeInsetsLeft);
            this.f21H.top = C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_edgeInsetsTop, C0067k.default_bmb_edgeInsetsTop);
            this.f21H.right = C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_edgeInsetsRight, C0067k.default_bmb_edgeInsetsRight);
            this.f21H.bottom = C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_edgeInsetsBottom, C0067k.default_bmb_edgeInsetsBottom);
            this.f29L = (float) C0073q.m301l(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_dotRadius, C0067k.default_bmb_dotRadius);
            this.f31M = (float) C0073q.m301l(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_hamWidth, C0067k.default_bmb_hamWidth);
            this.f33N = (float) C0073q.m301l(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_hamHeight, C0067k.default_bmb_hamHeight);
            this.f35O = (float) C0073q.m301l(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_pieceCornerRadius, C0067k.default_bmb_pieceCornerRadius);
            this.f37P = (float) C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_pieceHorizontalMargin, C0067k.default_bmb_pieceHorizontalMargin);
            this.f39Q = (float) C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_pieceVerticalMargin, C0067k.default_bmb_pieceVerticalMargin);
            this.f41R = (float) C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_pieceInclinedMargin, C0067k.default_bmb_pieceInclinedMargin);
            this.f43S = (float) C0073q.m301l(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_sharedLineLength, C0067k.default_bmb_sharedLineLength);
            this.f45T = C0073q.m297h(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_shareLine1Color, C0066j.default_bmb_shareLine1Color);
            this.f47U = C0073q.m297h(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_shareLine2Color, C0066j.default_bmb_shareLine2Color);
            this.f49V = (float) C0073q.m301l(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_shareLineWidth, C0067k.default_bmb_shareLineWidth);
            this.f56a0 = C0060d.getEnum(C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_piecePlaceEnum, C0070n.default_bmb_pieceEnum));
            this.f62e0 = C0073q.m297h(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_dimColor, C0066j.default_bmb_dimColor);
            this.f64f0 = (long) C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_showDuration, C0070n.default_bmb_showDuration);
            this.f66g0 = (long) C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_showDelay, C0070n.default_bmb_showDelay);
            this.f68h0 = (long) C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_hideDuration, C0070n.default_bmb_hideDuration);
            this.f70i0 = (long) C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_hideDelay, C0070n.default_bmb_hideDelay);
            this.f72j0 = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_cancelable, C0065i.default_bmb_cancelable);
            this.f74k0 = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_autoHide, C0065i.default_bmb_autoHide);
            this.f76l0 = C0021f.getEnum(C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_orderEnum, C0070n.default_bmb_orderEnum));
            this.f78m0 = C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_frames, C0070n.default_bmb_frames);
            this.f80n0 = C0016b.getEnum(C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_boomEnum, C0070n.default_bmb_boomEnum));
            this.f82o0 = C0019d.getEnum(C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_showMoveEaseEnum, C0070n.default_bmb_showMoveEaseEnum));
            this.f84p0 = C0019d.getEnum(C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_showScaleEaseEnum, C0070n.default_bmb_showScaleEaseEnum));
            this.f86q0 = C0019d.getEnum(C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_showRotateEaseEnum, C0070n.default_bmb_showRotateEaseEnum));
            this.f88r0 = C0019d.getEnum(C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_hideMoveEaseEnum, C0070n.default_bmb_hideMoveEaseEnum));
            this.f90s0 = C0019d.getEnum(C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_hideScaleEaseEnum, C0070n.default_bmb_hideScaleEaseEnum));
            this.f92t0 = C0019d.getEnum(C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_hideRotateEaseEnum, C0070n.default_bmb_hideRotateEaseEnum));
            this.f94u0 = C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_rotateDegree, C0070n.default_bmb_rotateDegree);
            this.f96v0 = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_use3DTransformAnimation, C0065i.default_bmb_use3DTransformAnimation);
            this.f98w0 = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_autoBoom, C0065i.default_bmb_autoBoom);
            this.f100x0 = C0073q.m292c(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_autoBoomImmediately, C0065i.default_bmb_autoBoomImmediately);
            this.f24I0 = C0035e.getEnum(C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_buttonPlaceEnum, C0070n.default_bmb_buttonPlaceEnum));
            this.f28K0 = C0034d.getEnum(C0073q.m304o(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_buttonPlaceAlignmentEnum, C0070n.default_bmb_buttonPlaceAlignmentEnum));
            this.f30L0 = (float) C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_buttonHorizontalMargin, C0067k.default_bmb_buttonHorizontalMargin);
            this.f32M0 = (float) C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_buttonVerticalMargin, C0067k.default_bmb_buttonVerticalMargin);
            this.f34N0 = (float) C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_buttonInclinedMargin, C0067k.default_bmb_buttonInclinedMargin);
            this.f36O0 = (float) C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_buttonTopMargin, C0067k.default_bmb_buttonTopMargin);
            this.f38P0 = (float) C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_buttonBottomMargin, C0067k.default_bmb_buttonBottomMargin);
            this.f40Q0 = (float) C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_buttonLeftMargin, C0067k.default_bmb_buttonLeftMargin);
            this.f42R0 = (float) C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_buttonRightMargin, C0067k.default_bmb_buttonRightMargin);
            this.f48U0 = (float) C0073q.m300k(obtainStyledAttributes, C0072p.BoomMenuButton_bmb_bottomHamButtonTopMargin, C0067k.default_bmb_bottomHamButtonTopMargin);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c0 */
    private void m44c0() {
        if (this.f23I == null) {
            this.f23I = (FrameLayout) findViewById(C0069m.button);
        }
        this.f23I.setOnClickListener(new C0005d());
        m46d0();
        m83x0();
        m81w0();
    }

    /* renamed from: d0 */
    private void m46d0() {
        FrameLayout frameLayout = this.f23I;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(!this.f7A ? null : new C0006e());
        }
    }

    /* renamed from: e0 */
    private void m48e0() {
        if (this.f59b1 == null) {
            this.f59b1 = new C0012k(this.f63f);
        }
        if (this.f59b1.canDetectOrientation()) {
            this.f59b1.enable();
        }
    }

    /* renamed from: f0 */
    private void m50f0() {
        if (this.f89s == null) {
            this.f89s = (BMBShadow) findViewById(C0069m.shadow);
        }
        boolean z = this.f79n && this.f95v && !this.f71j;
        this.f89s.setShadowEffect(z);
        if (z) {
            this.f89s.setShadowOffsetX(this.f81o);
            this.f89s.setShadowOffsetY(this.f83p);
            this.f89s.setShadowColor(this.f87r);
            this.f89s.setShadowRadius(this.f85q);
            this.f89s.setShadowCornerRadius(this.f85q + this.f91t);
            return;
        }
        this.f89s.mo4a();
    }

    /* renamed from: g0 */
    private void m52g0(boolean z) {
        if (!mo72j0() && this.f102y0 == C0053d.DidReboom) {
            C0055f.m267a(this, this.f10B0);
            this.f102y0 = C0053d.WillBoom;
            C0056g gVar = this.f61d0;
            if (gVar != null) {
                gVar.mo278e();
            }
            m27M(false);
            m34U();
            m37X(z);
            m11A0(z);
            m87z0(z);
            if (this.f75l) {
                setFocusable(true);
                setFocusableInTouchMode(true);
                requestFocus();
            }
        }
    }

    private ArrayList<View> getFadeViews() {
        ArrayList<View> arrayList = new ArrayList<>();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt == this.f89s || childAt == this.f23I || childAt == this.f51W)) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    /* renamed from: h0 */
    private void m54h0(boolean z) {
        if (!mo72j0() && this.f102y0 == C0053d.DidBoom) {
            this.f102y0 = C0053d.WillReboom;
            C0056g gVar = this.f61d0;
            if (gVar != null) {
                gVar.mo279f();
            }
            m61l0(z);
            m19E0(z);
            m17D0(z);
            if (this.f75l) {
                setFocusable(false);
                setFocusableInTouchMode(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m56i0(C0057a aVar, C0027a aVar2, PointF pointF, PointF pointF2, int i, boolean z) {
        int i2;
        C0027a aVar3 = aVar2;
        PointF pointF3 = pointF;
        this.f60c0++;
        int i3 = this.f78m0;
        float[] fArr = new float[(i3 + 1)];
        float[] fArr2 = new float[(i3 + 1)];
        float width = (((float) aVar.getWidth()) * 1.0f) / ((float) aVar2.mo207d());
        float height = (((float) aVar.getHeight()) * 1.0f) / ((float) aVar2.mo206c());
        long j = 1;
        long j2 = z ? 1 : this.f66g0 * ((long) i);
        if (!z) {
            j = this.f64f0;
        }
        long j3 = j;
        aVar2.mo182A();
        aVar3.setScaleX(width);
        aVar3.setScaleY(height);
        aVar2.mo217h();
        float f = height;
        C0014a.m103h(this.f80n0, new PointF((float) this.f104z0.getLayoutParams().width, (float) this.f104z0.getLayoutParams().height), C0017c.m119j(this.f82o0), this.f78m0, pointF, pointF2, fArr, fArr2);
        if (!aVar2.mo233t()) {
            i2 = 2;
        } else if (aVar2.mo237x()) {
            i2 = 2;
            C0014a.m100e(aVar2, "rippleButtonColor", j2, j3, C0024i.m127a(), aVar2.mo235v(), aVar2.mo205b());
        } else {
            i2 = 2;
            C0014a.m100e(aVar2, "nonRippleButtonColor", j2, j3, C0024i.m127a(), aVar2.mo235v(), aVar2.mo205b());
        }
        C0027a aVar4 = aVar2;
        long j4 = j2;
        long j5 = j3;
        C0014a.m98c(aVar4, "x", j4, j5, new LinearInterpolator(), fArr);
        C0014a.m98c(aVar4, "y", j4, j5, new LinearInterpolator(), fArr2);
        C0017c j6 = C0017c.m119j(this.f86q0);
        float[] fArr3 = new float[i2];
        fArr3[0] = 0.0f;
        fArr3[1] = (float) this.f94u0;
        C0014a.m109n(aVar2, j2, j3, j6, fArr3);
        float[] fArr4 = new float[i2];
        // fill-array-data instruction
        fArr4[0] = 0;
        fArr4[1] = 1065353216;
        C0014a.m101f("alpha", j2, j3, fArr4, C0017c.m119j(C0019d.Linear), aVar2.mo210g());
        C0017c j7 = C0017c.m119j(this.f84p0);
        float[] fArr5 = new float[i2];
        fArr5[0] = width;
        fArr5[1] = 1.0f;
        long j8 = j2;
        float[] fArr6 = fArr5;
        long j9 = j3;
        C0014a.m98c(aVar2, "scaleX", j8, j9, j7, fArr6);
        C0017c j10 = C0017c.m119j(this.f84p0);
        C0009h hVar = new C0009h(aVar, aVar3);
        float[] fArr7 = new float[i2];
        fArr7[0] = f;
        fArr7[1] = 1.0f;
        C0014a.m97b(aVar2, "scaleY", j8, j9, j10, hVar, fArr7);
        if (this.f96v0) {
            C0022g k = C0014a.m106k(fArr, fArr2, j2, j3, aVar2);
            k.mo169b(aVar3, pointF3.x, pointF3.y);
            aVar3.setCameraDistance(0.0f);
            aVar3.startAnimation(k);
        }
    }

    /* renamed from: j */
    static /* synthetic */ int m57j(BoomMenuButton boomMenuButton) {
        int i = boomMenuButton.f60c0;
        boomMenuButton.f60c0 = i - 1;
        return i;
    }

    /* renamed from: k0 */
    private boolean m59k0() {
        return Build.VERSION.SDK_INT >= 21 && ((PowerManager) getContext().getSystemService("power")).isPowerSaveMode();
    }

    /* renamed from: l0 */
    private void m61l0(boolean z) {
        m33T();
        long size = z ? 1 : this.f68h0 + (this.f70i0 * ((long) (this.f25J.size() - 1)));
        this.f104z0.mo179b(size, (AnimatorListenerAdapter) null);
        if (this.f56a0 == C0060d.Share) {
            C0014a.m98c(this.f51W, "hideProcess", 0, size, C0017c.m119j(C0019d.Linear), 0.0f, 1.0f);
        }
    }

    /* renamed from: n0 */
    private int m64n0() {
        if (this.f56a0.equals(C0060d.Unknown)) {
            return 0;
        }
        return this.f56a0.equals(C0060d.Share) ? this.f10B0.size() : this.f56a0.equals(C0060d.Custom) ? this.f58b0.size() : this.f56a0.pieceNumber();
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m66o0() {
        for (int i = 0; i < this.f8A0.size(); i++) {
            C0027a aVar = this.f8A0.get(i);
            PointF pointF = this.f46T0.get(i);
            aVar.setX(pointF.x);
            aVar.setY(pointF.y);
        }
    }

    /* renamed from: p0 */
    private void m68p0() {
        ArrayList<Integer> j = C0014a.m105j(this.f56a0 == C0060d.Share ? C0021f.DEFAULT : this.f76l0, this.f25J.size());
        for (int size = j.size() - 1; size >= 0; size--) {
            this.f23I.addView(this.f25J.get(j.get(size).intValue()));
        }
    }

    /* renamed from: q0 */
    private void m70q0() {
        int n0 = m64n0();
        for (int i = 0; i < n0; i++) {
            if (this.f25J.size() > i && this.f27K.size() > i) {
                this.f25J.get(i).mo280a(this.f27K.get(i));
            }
        }
    }

    /* renamed from: r0 */
    private void m72r0() {
        if (this.f56a0 == C0060d.Share) {
            C0023h hVar = this.f51W;
            if (hVar != null) {
                this.f23I.removeView(hVar);
            }
            C0023h hVar2 = new C0023h(this.f63f);
            this.f51W = hVar2;
            hVar2.setLine1Color(this.f45T);
            this.f51W.setLine2Color(this.f47U);
            this.f51W.setLineWidth(this.f49V);
            this.f23I.addView(this.f51W);
            this.f51W.mo171a(0, 0, this.f23I.getWidth(), this.f23I.getHeight());
            return;
        }
        C0023h hVar3 = this.f51W;
        if (hVar3 != null) {
            this.f23I.removeView(hVar3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m74s0() {
        boolean z;
        float f;
        float x = getX();
        float y = getY();
        ViewGroup viewGroup = (ViewGroup) getParent();
        int i = this.f21H.left;
        if (x < ((float) i)) {
            x = (float) i;
            z = true;
        } else {
            z = false;
        }
        int i2 = this.f21H.top;
        if (y < ((float) i2)) {
            y = (float) i2;
            z = true;
        }
        if (x > ((float) ((viewGroup.getWidth() - this.f21H.right) - getWidth()))) {
            x = (float) ((viewGroup.getWidth() - this.f21H.right) - getWidth());
            z = true;
        }
        if (y > ((float) ((viewGroup.getHeight() - this.f21H.bottom) - getHeight()))) {
            f = (float) ((viewGroup.getHeight() - this.f21H.bottom) - getHeight());
            z = true;
        } else {
            f = y;
        }
        if (z) {
            C0014a.m98c(this, "x", 0, 300, C0017c.m119j(C0019d.EaseOutBack), getX(), x);
            C0014a.m98c(this, "y", 0, 300, C0017c.m119j(C0019d.EaseOutBack), getY(), f);
        }
    }

    /* renamed from: t0 */
    private void m76t0(C0027a aVar, PointF pointF) {
        m33T();
        aVar.mo236w((int) pointF.x, (int) pointF.y, aVar.mo192K(), aVar.mo191J());
        aVar.setVisibility(4);
        this.f104z0.addView(aVar);
    }

    /* renamed from: u0 */
    private void m78u0() {
        post(new C0013l());
    }

    /* renamed from: w0 */
    private void m81w0() {
        int i;
        Context context;
        FrameLayout frameLayout;
        if (!this.f95v || this.f71j) {
            if (Build.VERSION.SDK_INT >= 21) {
                frameLayout = this.f23I;
                context = this.f63f;
                i = 16843868;
            } else {
                frameLayout = this.f23I;
                context = this.f63f;
                i = 16843534;
            }
            C0073q.m315z(frameLayout, C0073q.m312w(context, i));
            return;
        }
        C0073q.m315z(this.f23I, (!this.f97w || Build.VERSION.SDK_INT < 21) ? C0073q.m308s(this.f23I, this.f91t, this.f99x, this.f101y, this.f103z) : new RippleDrawable(ColorStateList.valueOf(this.f101y), C0073q.m307r(this.f23I, this.f99x), (Drawable) null));
    }

    /* renamed from: x0 */
    private void m83x0() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23I.getLayoutParams();
        int i = this.f91t;
        layoutParams.width = i * 2;
        layoutParams.height = i * 2;
        this.f23I.setLayoutParams(layoutParams);
    }

    /* renamed from: y0 */
    private void m85y0() {
        if (this.f56a0 == C0060d.Share) {
            this.f51W.mo172b(this.f27K, this);
        }
    }

    /* renamed from: z0 */
    private void m87z0(boolean z) {
        C0014a.m101f("alpha", 0, z ? 1 : this.f64f0 + (this.f66g0 * ((long) (this.f25J.size() - 1))), new float[]{1.0f, 0.0f}, new C0002a(), getFadeViews());
    }

    /* renamed from: H */
    public void mo13H(C0032b bVar) {
        this.f10B0.add(bVar);
        m23G0();
    }

    /* renamed from: I */
    public void mo14I() {
        m52g0(false);
    }

    /* renamed from: J */
    public void mo15J() {
        m52g0(true);
    }

    /* renamed from: P */
    public void mo16P() {
        this.f10B0.clear();
    }

    /* renamed from: a */
    public void mo17a(int i, C0027a aVar) {
        if (!mo72j0()) {
            C0056g gVar = this.f61d0;
            if (gVar != null) {
                gVar.mo274a(i, aVar);
            }
            if (this.f74k0) {
                mo149v0();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m28N();
    }

    public ArrayList<C0027a> getBoomButtons() {
        return this.f8A0;
    }

    public C0016b getBoomEnum() {
        return this.f80n0;
    }

    public float getBottomHamButtonTopMargin() {
        return this.f48U0;
    }

    public ArrayList<C0032b> getBuilders() {
        return this.f10B0;
    }

    public float getButtonBottomMargin() {
        return this.f38P0;
    }

    public C0054e getButtonEnum() {
        return this.f93u;
    }

    public float getButtonHorizontalMargin() {
        return this.f30L0;
    }

    public float getButtonInclinedMargin() {
        return this.f34N0;
    }

    public float getButtonLeftMargin() {
        return this.f40Q0;
    }

    public C0034d getButtonPlaceAlignmentEnum() {
        return this.f28K0;
    }

    public C0035e getButtonPlaceEnum() {
        return this.f24I0;
    }

    public int getButtonRadius() {
        return this.f91t;
    }

    public float getButtonRightMargin() {
        return this.f42R0;
    }

    public float getButtonTopMargin() {
        return this.f36O0;
    }

    public float getButtonVerticalMargin() {
        return this.f32M0;
    }

    public ArrayList<PointF> getCustomButtonPlacePositions() {
        return this.f26J0;
    }

    public ArrayList<PointF> getCustomPiecePlacePositions() {
        return this.f58b0;
    }

    public int getDimColor() {
        return this.f62e0;
    }

    public float getDotRadius() {
        return this.f29L;
    }

    public Rect getEdgeInsetsInParentView() {
        return this.f21H;
    }

    public int getFrames() {
        return this.f78m0;
    }

    public float getHamHeight() {
        return this.f33N;
    }

    public float getHamWidth() {
        return this.f31M;
    }

    public long getHideDelay() {
        return this.f70i0;
    }

    public long getHideDuration() {
        return this.f68h0;
    }

    public C0019d getHideMoveEaseEnum() {
        return this.f88r0;
    }

    public C0019d getHideRotateEaseEnum() {
        return this.f92t0;
    }

    public C0019d getHideScaleEaseEnum() {
        return this.f90s0;
    }

    public int getHighlightedColor() {
        return this.f101y;
    }

    public int getNormalColor() {
        return this.f99x;
    }

    public C0056g getOnBoomListener() {
        return this.f61d0;
    }

    public C0021f getOrderEnum() {
        return this.f76l0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = academia.bracu.com.academia.boommenu.C0073q.m314y(r1.f63f);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.ViewGroup getParentView() {
        /*
            r1 = this;
            boolean r0 = r1.f69i
            if (r0 == 0) goto L_0x000c
            android.content.Context r0 = r1.f63f
            android.app.Activity r0 = academia.bracu.com.academia.boommenu.C0073q.m314y(r0)
            if (r0 != 0) goto L_0x0013
        L_0x000c:
            android.view.ViewParent r0 = r1.getParent()
        L_0x0010:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
        L_0x0013:
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.boommenu.BoomMenuButton.getParentView():android.view.ViewGroup");
    }

    public float getPieceCornerRadius() {
        return this.f35O;
    }

    public float getPieceHorizontalMargin() {
        return this.f37P;
    }

    public float getPieceInclinedMargin() {
        return this.f41R;
    }

    public C0060d getPiecePlaceEnum() {
        return this.f56a0;
    }

    public float getPieceVerticalMargin() {
        return this.f39Q;
    }

    public int getRotateDegree() {
        return this.f94u0;
    }

    public int getShadowColor() {
        return this.f87r;
    }

    public int getShadowOffsetX() {
        return this.f81o;
    }

    public int getShadowOffsetY() {
        return this.f83p;
    }

    public int getShadowRadius() {
        return this.f85q;
    }

    public int getShareLine1Color() {
        return this.f45T;
    }

    public int getShareLine2Color() {
        return this.f47U;
    }

    public float getShareLineLength() {
        return this.f43S;
    }

    public float getShareLineWidth() {
        return this.f49V;
    }

    public long getShowDelay() {
        return this.f66g0;
    }

    public long getShowDuration() {
        return this.f64f0;
    }

    public C0019d getShowMoveEaseEnum() {
        return this.f82o0;
    }

    public C0019d getShowRotateEaseEnum() {
        return this.f86q0;
    }

    public C0019d getShowScaleEaseEnum() {
        return this.f84p0;
    }

    public int getUnableColor() {
        return this.f103z;
    }

    /* renamed from: j0 */
    public boolean mo72j0() {
        return this.f60c0 != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public void mo73m0() {
        if (!mo72j0()) {
            C0056g gVar = this.f61d0;
            if (gVar != null) {
                gVar.mo276c();
            }
            if (this.f72j0) {
                mo149v0();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f54Y0) {
            m48e0();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OrientationEventListener orientationEventListener = this.f59b1;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C0053d dVar;
        if (4 != i || !this.f75l || ((dVar = this.f102y0) != C0053d.WillBoom && dVar != C0053d.DidBoom)) {
            return super.onKeyDown(i, keyEvent);
        }
        mo149v0();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f57a1) {
            m78u0();
        }
        if (this.f65g) {
            if (this.f71j) {
                m36W();
            } else {
                m38Y();
            }
        }
        this.f65g = false;
    }

    public void setAutoBoom(boolean z) {
        this.f98w0 = z;
    }

    public void setAutoBoomImmediately(boolean z) {
        this.f100x0 = z;
    }

    public void setAutoHide(boolean z) {
        this.f74k0 = z;
    }

    public void setBackPressListened(boolean z) {
        this.f75l = z;
    }

    public void setBackgroundEffect(boolean z) {
        if (this.f95v != z) {
            this.f95v = z;
            m81w0();
            m23G0();
        }
    }

    public void setBoomEnum(C0016b bVar) {
        this.f80n0 = bVar;
    }

    public void setBoomInWholeScreen(boolean z) {
        this.f69i = z;
    }

    public void setBottomHamButtonTopMargin(float f) {
        this.f48U0 = f;
    }

    public void setBuilders(ArrayList<C0032b> arrayList) {
        this.f10B0 = arrayList;
        m23G0();
    }

    public void setButtonBottomMargin(float f) {
        this.f38P0 = f;
    }

    public void setButtonEnum(C0054e eVar) {
        if (!this.f93u.equals(eVar)) {
            this.f93u = eVar;
            m31R();
            mo16P();
            m30Q();
            m23G0();
        }
    }

    public void setButtonHorizontalMargin(float f) {
        this.f30L0 = f;
    }

    public void setButtonInclinedMargin(float f) {
        this.f34N0 = f;
    }

    public void setButtonLeftMargin(float f) {
        this.f40Q0 = f;
    }

    public void setButtonPlaceAlignmentEnum(C0034d dVar) {
        this.f28K0 = dVar;
    }

    public void setButtonPlaceEnum(C0035e eVar) {
        this.f24I0 = eVar;
        m30Q();
        this.f52W0 = true;
    }

    public void setButtonRadius(int i) {
        if (this.f91t != i) {
            this.f91t = i;
            m44c0();
            m23G0();
        }
    }

    public void setButtonRightMargin(float f) {
        this.f42R0 = f;
    }

    public void setButtonTopMargin(float f) {
        this.f36O0 = f;
    }

    public void setButtonVerticalMargin(float f) {
        this.f32M0 = f;
    }

    public void setCacheOptimization(boolean z) {
        this.f67h = z;
    }

    public void setCancelable(boolean z) {
        this.f72j0 = z;
    }

    public void setCustomButtonPlacePositions(ArrayList<PointF> arrayList) {
        this.f26J0 = arrayList;
        m30Q();
        this.f52W0 = true;
    }

    public void setCustomPiecePlacePositions(ArrayList<PointF> arrayList) {
        if (!this.f58b0.equals(arrayList)) {
            this.f58b0 = arrayList;
            m31R();
            m23G0();
        }
    }

    public void setDelay(long j) {
        setShowDelay(j);
        setHideDelay(j);
    }

    public void setDimColor(int i) {
        C0025b bVar;
        if (this.f62e0 != i) {
            this.f62e0 = i;
            if (this.f102y0 == C0053d.DidBoom && (bVar = this.f104z0) != null) {
                bVar.setBackgroundColor(i);
            }
        }
    }

    public void setDotRadius(float f) {
        if (this.f29L != f) {
            this.f29L = f;
            m23G0();
        }
    }

    public void setDraggable(boolean z) {
        if (this.f7A != z) {
            this.f7A = z;
            m46d0();
        }
    }

    public void setDuration(long j) {
        setShowDuration(j);
        setHideDuration(j);
    }

    public void setEdgeInsetsInParentView(Rect rect) {
        if (!this.f21H.equals(rect)) {
            this.f21H = rect;
            m74s0();
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f23I.setEnabled(z);
        m81w0();
    }

    public void setFrames(int i) {
        this.f78m0 = i;
    }

    public void setHamHeight(int i) {
        float f = (float) i;
        if (this.f33N != f) {
            this.f33N = f;
            m23G0();
        }
    }

    public void setHamWidth(float f) {
        if (this.f31M != f) {
            this.f31M = f;
            m23G0();
        }
    }

    public void setHideDelay(long j) {
        this.f70i0 = j;
        m85y0();
    }

    public void setHideDuration(long j) {
        if (this.f68h0 != j) {
            this.f68h0 = Math.max(1, j);
            m85y0();
        }
    }

    public void setHideEaseEnum(C0019d dVar) {
        setHideMoveEaseEnum(dVar);
        setHideScaleEaseEnum(dVar);
        setHideRotateEaseEnum(dVar);
    }

    public void setHideMoveEaseEnum(C0019d dVar) {
        this.f88r0 = dVar;
    }

    public void setHideRotateEaseEnum(C0019d dVar) {
        this.f92t0 = dVar;
    }

    public void setHideScaleEaseEnum(C0019d dVar) {
        this.f90s0 = dVar;
    }

    public void setHighlightedColor(int i) {
        if (this.f101y != i) {
            this.f101y = i;
            m81w0();
            m23G0();
        }
    }

    public void setInFragment(boolean z) {
        this.f73k = z;
    }

    public void setInList(boolean z) {
        this.f71j = z;
    }

    public void setNormalColor(int i) {
        if (this.f99x != i) {
            this.f99x = i;
            m81w0();
            m23G0();
        }
    }

    public void setOnBoomListener(C0056g gVar) {
        this.f61d0 = gVar;
    }

    public void setOrderEnum(C0021f fVar) {
        this.f76l0 = fVar;
    }

    public void setOrientationAdaptable(boolean z) {
        this.f54Y0 = z;
        if (z) {
            m48e0();
        }
    }

    public void setPieceCornerRadius(float f) {
        if (this.f35O != f) {
            this.f35O = f;
            m23G0();
        }
    }

    public void setPieceHorizontalMargin(float f) {
        if (this.f37P != f) {
            this.f37P = f;
            m23G0();
        }
    }

    public void setPieceInclinedMargin(float f) {
        if (this.f41R != f) {
            this.f41R = f;
            m23G0();
        }
    }

    public void setPiecePlaceEnum(C0060d dVar) {
        this.f56a0 = dVar;
        m31R();
        m23G0();
    }

    public void setPieceVerticalMargin(float f) {
        if (this.f39Q != f) {
            this.f39Q = f;
            m23G0();
        }
    }

    public void setRippleEffect(boolean z) {
        if (this.f97w != z) {
            this.f97w = z;
            m81w0();
            m23G0();
        }
    }

    public void setRotateDegree(int i) {
        this.f94u0 = i;
    }

    public void setShadowColor(int i) {
        if (this.f87r != i) {
            this.f87r = i;
            m50f0();
        }
    }

    public void setShadowEffect(boolean z) {
        if (this.f79n != z) {
            this.f79n = z;
            m50f0();
        }
    }

    public void setShadowOffsetX(int i) {
        if (this.f81o != i) {
            this.f81o = i;
            m50f0();
        }
    }

    public void setShadowOffsetY(int i) {
        if (this.f83p != i) {
            this.f83p = i;
            m50f0();
        }
    }

    public void setShadowRadius(int i) {
        if (this.f85q != i) {
            this.f85q = i;
            m50f0();
        }
    }

    public void setShareLine1Color(int i) {
        if (this.f45T != i) {
            this.f45T = i;
            C0023h hVar = this.f51W;
            if (hVar != null) {
                hVar.setLine1Color(i);
                this.f51W.invalidate();
            }
        }
    }

    public void setShareLine2Color(int i) {
        if (this.f47U != i) {
            this.f47U = i;
            C0023h hVar = this.f51W;
            if (hVar != null) {
                hVar.setLine2Color(i);
                this.f51W.invalidate();
            }
        }
    }

    public void setShareLineLength(float f) {
        if (this.f43S != f) {
            this.f43S = f;
            m23G0();
        }
    }

    public void setShareLineWidth(float f) {
        if (this.f49V != f) {
            this.f49V = f;
            C0023h hVar = this.f51W;
            if (hVar != null) {
                hVar.setLineWidth(f);
                this.f51W.invalidate();
            }
        }
    }

    public void setShowDelay(long j) {
        this.f66g0 = j;
        m85y0();
    }

    public void setShowDuration(long j) {
        if (this.f64f0 != j) {
            this.f64f0 = Math.max(1, j);
            m85y0();
        }
    }

    public void setShowEaseEnum(C0019d dVar) {
        setShowMoveEaseEnum(dVar);
        setShowScaleEaseEnum(dVar);
        setShowRotateEaseEnum(dVar);
    }

    public void setShowMoveEaseEnum(C0019d dVar) {
        this.f82o0 = dVar;
    }

    public void setShowRotateEaseEnum(C0019d dVar) {
        this.f86q0 = dVar;
    }

    public void setShowScaleEaseEnum(C0019d dVar) {
        this.f84p0 = dVar;
    }

    public void setUnableColor(int i) {
        if (this.f103z != i) {
            this.f103z = i;
            m81w0();
            m23G0();
        }
    }

    public void setUse3DTransformAnimation(boolean z) {
        this.f96v0 = z;
    }

    /* renamed from: v0 */
    public void mo149v0() {
        m54h0(false);
    }
}
