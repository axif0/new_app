package academia.bracu.com.academia.boommenu.p002c;

import academia.bracu.com.academia.boommenu.BMBShadow;
import academia.bracu.com.academia.boommenu.C0054e;
import academia.bracu.com.academia.boommenu.C0069m;
import academia.bracu.com.academia.boommenu.C0073q;
import academia.bracu.com.academia.boommenu.p002c.C0050l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: academia.bracu.com.academia.boommenu.c.a */
public abstract class C0027a extends FrameLayout {

    /* renamed from: A */
    protected int f170A = 0;

    /* renamed from: A0 */
    protected int f171A0;

    /* renamed from: B */
    protected int f172B = 0;

    /* renamed from: B0 */
    protected int f173B0;

    /* renamed from: C */
    protected int f174C = 0;

    /* renamed from: C0 */
    protected int f175C0;

    /* renamed from: D */
    protected int f176D;

    /* renamed from: D0 */
    protected int f177D0;

    /* renamed from: E */
    protected BMBShadow f178E;

    /* renamed from: E0 */
    protected int f179E0;

    /* renamed from: F */
    protected int f180F = 0;

    /* renamed from: F0 */
    protected boolean f181F0 = true;

    /* renamed from: G */
    protected Drawable f182G;

    /* renamed from: G0 */
    protected int f183G0;

    /* renamed from: H */
    protected int f184H = 0;

    /* renamed from: H0 */
    protected int f185H0 = 0;

    /* renamed from: I */
    protected Drawable f186I;

    /* renamed from: I0 */
    protected int f187I0;

    /* renamed from: J */
    protected int f188J = 0;

    /* renamed from: J0 */
    protected int f189J0 = 0;

    /* renamed from: K */
    protected Drawable f190K;

    /* renamed from: K0 */
    protected int f191K0;

    /* renamed from: L */
    protected Rect f192L = null;

    /* renamed from: L0 */
    protected int f193L0 = 0;

    /* renamed from: M */
    protected Rect f194M = null;

    /* renamed from: M0 */
    protected boolean f195M0 = false;

    /* renamed from: N */
    protected int f196N = 0;

    /* renamed from: N0 */
    protected boolean f197N0 = true;

    /* renamed from: O */
    protected String f198O;

    /* renamed from: O0 */
    protected RippleDrawable f199O0;

    /* renamed from: P */
    protected int f200P = 0;

    /* renamed from: P0 */
    protected StateListDrawable f201P0;

    /* renamed from: Q */
    protected String f202Q;

    /* renamed from: Q0 */
    protected GradientDrawable f203Q0;

    /* renamed from: R */
    protected int f204R = 0;

    /* renamed from: R0 */
    protected ViewGroup f205R0;

    /* renamed from: S */
    protected String f206S;

    /* renamed from: S0 */
    protected ImageView f207S0;

    /* renamed from: T */
    protected int f208T;

    /* renamed from: T0 */
    protected TextView f209T0;

    /* renamed from: U */
    protected int f210U = 0;

    /* renamed from: U0 */
    protected TextView f211U0;

    /* renamed from: V */
    protected int f212V;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public boolean f213V0 = false;

    /* renamed from: W */
    protected int f214W = 0;

    /* renamed from: a0 */
    protected int f215a0;

    /* renamed from: b0 */
    protected int f216b0 = 0;

    /* renamed from: c0 */
    protected Rect f217c0 = null;

    /* renamed from: d0 */
    protected Rect f218d0 = null;

    /* renamed from: e0 */
    protected Typeface f219e0;

    /* renamed from: f */
    public PointF f220f;

    /* renamed from: f0 */
    protected int f221f0;

    /* renamed from: g */
    protected Context f222g;

    /* renamed from: g0 */
    protected int f223g0;

    /* renamed from: h */
    protected int f224h = -1;

    /* renamed from: h0 */
    protected TextUtils.TruncateAt f225h0;

    /* renamed from: i */
    protected C0042h f226i;

    /* renamed from: i0 */
    protected int f227i0;

    /* renamed from: j */
    protected C0043i f228j;

    /* renamed from: j0 */
    protected int f229j0 = 0;

    /* renamed from: k */
    protected boolean f230k = true;

    /* renamed from: k0 */
    protected String f231k0;

    /* renamed from: l */
    protected boolean f232l = true;

    /* renamed from: l0 */
    protected int f233l0 = 0;

    /* renamed from: m */
    protected FrameLayout f234m;

    /* renamed from: m0 */
    protected String f235m0;

    /* renamed from: n */
    protected int f236n;

    /* renamed from: n0 */
    protected int f237n0 = 0;

    /* renamed from: o */
    protected int f238o;

    /* renamed from: o0 */
    protected String f239o0;

    /* renamed from: p */
    protected int f240p;

    /* renamed from: p0 */
    protected int f241p0;

    /* renamed from: q */
    protected int f242q;

    /* renamed from: q0 */
    protected int f243q0 = 0;

    /* renamed from: r */
    protected boolean f244r;

    /* renamed from: r0 */
    protected int f245r0;

    /* renamed from: s */
    protected boolean f246s;

    /* renamed from: s0 */
    protected int f247s0 = 0;

    /* renamed from: t */
    protected boolean f248t;

    /* renamed from: t0 */
    protected int f249t0;

    /* renamed from: u */
    protected boolean f250u;

    /* renamed from: u0 */
    protected int f251u0 = 0;

    /* renamed from: v */
    protected C0054e f252v = C0054e.Unknown;

    /* renamed from: v0 */
    protected Rect f253v0 = null;

    /* renamed from: w */
    protected Integer f254w = null;

    /* renamed from: w0 */
    protected Rect f255w0 = null;

    /* renamed from: x */
    protected int f256x = 0;

    /* renamed from: x0 */
    protected Typeface f257x0;

    /* renamed from: y */
    protected boolean f258y = true;

    /* renamed from: y0 */
    protected int f259y0;

    /* renamed from: z */
    protected int f260z = 0;

    /* renamed from: z0 */
    protected TextUtils.TruncateAt f261z0;

    /* renamed from: academia.bracu.com.academia.boommenu.c.a$a */
    class C0028a implements View.OnClickListener {
        C0028a() {
        }

        public void onClick(View view) {
            if (C0027a.this.f213V0) {
                C0027a aVar = C0027a.this;
                C0042h hVar = aVar.f226i;
                if (hVar != null) {
                    hVar.mo17a(aVar.f224h, aVar);
                }
                C0027a aVar2 = C0027a.this;
                C0043i iVar = aVar2.f228j;
                if (iVar != null) {
                    iVar.mo263a(aVar2.f224h);
                }
            }
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.c.a$b */
    class C0029b implements View.OnTouchListener {
        C0029b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r4 != 3) goto L_0x005f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
            /*
                r3 = this;
                academia.bracu.com.academia.boommenu.c.a r4 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                boolean r4 = r4.f213V0
                r0 = 0
                if (r4 != 0) goto L_0x000a
                return r0
            L_0x000a:
                int r4 = r5.getAction()
                r1 = 1
                if (r4 == 0) goto L_0x003f
                if (r4 == r1) goto L_0x0037
                r1 = 2
                if (r4 == r1) goto L_0x001a
                r5 = 3
                if (r4 == r5) goto L_0x0037
                goto L_0x005f
            L_0x001a:
                android.graphics.PointF r4 = new android.graphics.PointF
                float r1 = r5.getX()
                float r5 = r5.getY()
                r4.<init>(r1, r5)
                academia.bracu.com.academia.boommenu.c.a r5 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                android.widget.FrameLayout r5 = r5.f234m
                boolean r4 = academia.bracu.com.academia.boommenu.C0073q.m313x(r4, r5)
                if (r4 == 0) goto L_0x0037
                academia.bracu.com.academia.boommenu.c.a r4 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                r4.mo183B()
                goto L_0x005f
            L_0x0037:
                academia.bracu.com.academia.boommenu.c.a r4 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                r4.f232l = r0
                r4.mo187F()
                goto L_0x005f
            L_0x003f:
                android.graphics.PointF r4 = new android.graphics.PointF
                float r2 = r5.getX()
                float r5 = r5.getY()
                r4.<init>(r2, r5)
                academia.bracu.com.academia.boommenu.c.a r5 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                android.widget.FrameLayout r5 = r5.f234m
                boolean r4 = academia.bracu.com.academia.boommenu.C0073q.m313x(r4, r5)
                if (r4 == 0) goto L_0x005f
                academia.bracu.com.academia.boommenu.c.a r4 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                r4.mo183B()
                academia.bracu.com.academia.boommenu.c.a r4 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                r4.f232l = r1
            L_0x005f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.boommenu.p002c.C0027a.C0029b.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.c.a$c */
    class C0030c implements View.OnClickListener {
        C0030c() {
        }

        public void onClick(View view) {
            if (C0027a.this.f213V0) {
                C0027a aVar = C0027a.this;
                C0042h hVar = aVar.f226i;
                if (hVar != null) {
                    hVar.mo17a(aVar.f224h, aVar);
                }
                C0027a aVar2 = C0027a.this;
                C0043i iVar = aVar2.f228j;
                if (iVar != null) {
                    iVar.mo263a(aVar2.f224h);
                }
            }
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.c.a$d */
    class C0031d implements View.OnTouchListener {
        C0031d() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r4 != 3) goto L_0x005f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
            /*
                r3 = this;
                academia.bracu.com.academia.boommenu.c.a r4 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                boolean r4 = r4.f213V0
                r0 = 0
                if (r4 != 0) goto L_0x000a
                return r0
            L_0x000a:
                int r4 = r5.getAction()
                r1 = 1
                if (r4 == 0) goto L_0x003f
                if (r4 == r1) goto L_0x0037
                r1 = 2
                if (r4 == r1) goto L_0x001a
                r5 = 3
                if (r4 == r5) goto L_0x0037
                goto L_0x005f
            L_0x001a:
                android.graphics.PointF r4 = new android.graphics.PointF
                float r1 = r5.getX()
                float r5 = r5.getY()
                r4.<init>(r1, r5)
                academia.bracu.com.academia.boommenu.c.a r5 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                android.widget.FrameLayout r5 = r5.f234m
                boolean r4 = academia.bracu.com.academia.boommenu.C0073q.m313x(r4, r5)
                if (r4 == 0) goto L_0x0037
                academia.bracu.com.academia.boommenu.c.a r4 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                r4.mo183B()
                goto L_0x005f
            L_0x0037:
                academia.bracu.com.academia.boommenu.c.a r4 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                r4.f232l = r0
                r4.mo187F()
                goto L_0x005f
            L_0x003f:
                android.graphics.PointF r4 = new android.graphics.PointF
                float r2 = r5.getX()
                float r5 = r5.getY()
                r4.<init>(r2, r5)
                academia.bracu.com.academia.boommenu.c.a r5 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                android.widget.FrameLayout r5 = r5.f234m
                boolean r4 = academia.bracu.com.academia.boommenu.C0073q.m313x(r4, r5)
                if (r4 == 0) goto L_0x005f
                academia.bracu.com.academia.boommenu.c.a r4 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                r4.mo183B()
                academia.bracu.com.academia.boommenu.c.a r4 = academia.bracu.com.academia.boommenu.p002c.C0027a.this
                r4.f232l = r1
            L_0x005f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.boommenu.p002c.C0027a.C0031d.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    protected C0027a(Context context) {
        super(context);
    }

    /* renamed from: A */
    public abstract void mo182A();

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract void mo183B();

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo184C() {
        Drawable drawable;
        int i;
        ImageView imageView;
        if (this.f195M0) {
            imageView = this.f207S0;
            i = this.f188J;
            drawable = this.f190K;
        } else {
            imageView = this.f207S0;
            i = this.f184H;
            drawable = this.f186I;
        }
        C0073q.m286A(imageView, i, drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo185D() {
        int i;
        int i2;
        TextView textView;
        if (this.f195M0) {
            C0073q.m287B(this.f211U0, this.f237n0, this.f239o0);
            textView = this.f211U0;
            i2 = this.f251u0;
            i = this.f249t0;
        } else {
            C0073q.m287B(this.f211U0, this.f233l0, this.f235m0);
            textView = this.f211U0;
            i2 = this.f247s0;
            i = this.f245r0;
        }
        C0073q.m288C(textView, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo186E() {
        int i;
        int i2;
        TextView textView;
        if (this.f195M0) {
            C0073q.m287B(this.f209T0, this.f204R, this.f206S);
            textView = this.f209T0;
            i2 = this.f216b0;
            i = this.f215a0;
        } else {
            C0073q.m287B(this.f209T0, this.f200P, this.f202Q);
            textView = this.f209T0;
            i2 = this.f214W;
            i = this.f212V;
        }
        C0073q.m288C(textView, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract void mo187F();

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo188G() {
        Drawable drawable;
        int i;
        ImageView imageView;
        if (this.f195M0) {
            imageView = this.f207S0;
            i = this.f188J;
            drawable = this.f190K;
        } else {
            imageView = this.f207S0;
            i = this.f180F;
            drawable = this.f182G;
        }
        C0073q.m286A(imageView, i, drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo189H() {
        int i;
        int i2;
        TextView textView;
        if (this.f195M0) {
            C0073q.m287B(this.f211U0, this.f237n0, this.f239o0);
            textView = this.f211U0;
            i2 = this.f251u0;
            i = this.f249t0;
        } else {
            C0073q.m287B(this.f211U0, this.f229j0, this.f231k0);
            textView = this.f211U0;
            i2 = this.f243q0;
            i = this.f241p0;
        }
        C0073q.m288C(textView, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo190I() {
        int i;
        int i2;
        TextView textView;
        if (this.f195M0) {
            C0073q.m287B(this.f209T0, this.f204R, this.f206S);
            textView = this.f209T0;
            i2 = this.f216b0;
            i = this.f215a0;
        } else {
            C0073q.m287B(this.f209T0, this.f196N, this.f198O);
            textView = this.f209T0;
            i2 = this.f210U;
            i = this.f208T;
        }
        C0073q.m288C(textView, i2, i);
    }

    /* renamed from: J */
    public abstract int mo191J();

    /* renamed from: K */
    public abstract int mo192K();

    /* renamed from: L */
    public abstract C0054e mo193L();

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public int mo194M() {
        return C0073q.m295f(this.f222g, this.f193L0, this.f191K0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo195N() {
        C0054e eVar = this.f252v;
        if (eVar == C0054e.SimpleCircle || eVar == C0054e.TextInsideCircle || eVar == C0054e.TextOutsideCircle) {
            mo221l();
        } else {
            mo223n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo196O() {
        if (this.f230k) {
            mo188G();
        } else {
            mo184C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo197P() {
        ImageView imageView;
        Rect rect = this.f194M;
        if (rect != null && (imageView = this.f207S0) != null) {
            imageView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo198Q() {
        Rect rect = this.f192L;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.right - rect.left, rect.bottom - rect.top);
        int i = this.f192L.left;
        layoutParams.leftMargin = i;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(i);
        }
        layoutParams.topMargin = this.f192L.top;
        ImageView imageView = this.f207S0;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo199R() {
        TextView textView;
        Rect rect = this.f255w0;
        if (rect != null && (textView = this.f211U0) != null) {
            textView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo200S() {
        Rect rect = this.f253v0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.right - rect.left, rect.bottom - rect.top);
        int i = this.f253v0.left;
        layoutParams.leftMargin = i;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(i);
        }
        layoutParams.topMargin = this.f253v0.top;
        TextView textView = this.f211U0;
        if (textView != null) {
            textView.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo201T() {
        TextView textView;
        Rect rect = this.f218d0;
        if (rect != null && (textView = this.f209T0) != null) {
            textView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo202U() {
        Rect rect = this.f217c0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.right - rect.left, rect.bottom - rect.top);
        int i = this.f217c0.left;
        layoutParams.leftMargin = i;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(i);
        }
        layoutParams.topMargin = this.f217c0.top;
        TextView textView = this.f209T0;
        if (textView != null) {
            textView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: V */
    public void mo203V() {
        this.f213V0 = false;
        if (!this.f197N0 && mo233t()) {
            C0073q.m315z(this.f234m, this.f203Q0);
        }
    }

    /* renamed from: W */
    public void mo204W() {
        this.f213V0 = false;
        if (this.f197N0 || !mo233t()) {
            mo195N();
        } else {
            C0073q.m315z(this.f234m, this.f203Q0);
        }
    }

    /* renamed from: b */
    public int mo205b() {
        return this.f195M0 ? mo194M() : mo234u();
    }

    /* renamed from: c */
    public abstract int mo206c();

    /* renamed from: d */
    public abstract int mo207d();

    /* renamed from: e */
    public void mo208e() {
        TextView textView = this.f209T0;
        if (textView != null) {
            textView.setSelected(false);
        }
        TextView textView2 = this.f211U0;
        if (textView2 != null) {
            textView2.setSelected(false);
        }
    }

    /* renamed from: f */
    public void mo209f() {
        this.f213V0 = true;
        if (!this.f197N0 && mo233t()) {
            C0073q.m315z(this.f234m, this.f201P0);
        }
        TextView textView = this.f209T0;
        if (textView != null) {
            textView.setSelected(true);
        }
        TextView textView2 = this.f211U0;
        if (textView2 != null) {
            textView2.setSelected(true);
        }
    }

    /* renamed from: g */
    public abstract ArrayList<View> mo210g();

    public FrameLayout getButton() {
        return this.f234m;
    }

    public ImageView getImageView() {
        return this.f207S0;
    }

    public ViewGroup getLayout() {
        return this.f205R0;
    }

    public BMBShadow getShadow() {
        return this.f178E;
    }

    public TextView getSubTextView() {
        return this.f211U0;
    }

    public TextView getTextView() {
        return this.f209T0;
    }

    /* renamed from: h */
    public void mo217h() {
        Iterator<View> it = mo210g().iterator();
        while (it.hasNext()) {
            it.next().setAlpha(0.0f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo218i() {
        return C0073q.m295f(this.f222g, this.f189J0, this.f187I0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo219j(C0032b bVar) {
        Rect rect;
        Rect rect2;
        int i;
        int i2;
        this.f224h = bVar.f292a;
        this.f226i = bVar.f294b;
        this.f228j = bVar.f296c;
        this.f246s = bVar.f298d;
        this.f248t = bVar.f300e;
        this.f250u = bVar.f302f;
        this.f254w = bVar.f304g;
        this.f256x = bVar.f306h;
        boolean z = bVar.f308i;
        this.f258y = z;
        if (z) {
            this.f260z = bVar.f310j;
            this.f170A = bVar.f312k;
            this.f172B = bVar.f314l;
            this.f174C = bVar.f318n;
            this.f176D = bVar.f316m;
        }
        this.f180F = bVar.f320o;
        this.f184H = bVar.f322p;
        this.f188J = bVar.f324q;
        this.f182G = bVar.f326r;
        this.f186I = bVar.f328s;
        this.f190K = bVar.f330t;
        this.f192L = bVar.f332u;
        this.f194M = bVar.f334v;
        this.f198O = bVar.f342z;
        this.f196N = bVar.f336w;
        this.f202Q = bVar.f266A;
        this.f200P = bVar.f338x;
        this.f206S = bVar.f267B;
        this.f204R = bVar.f340y;
        this.f208T = bVar.f268C;
        this.f210U = bVar.f269D;
        this.f212V = bVar.f270E;
        this.f214W = bVar.f271F;
        this.f215a0 = bVar.f272G;
        this.f216b0 = bVar.f273H;
        this.f217c0 = bVar.f274I;
        this.f218d0 = bVar.f275J;
        this.f219e0 = bVar.f276K;
        this.f221f0 = bVar.f277L;
        this.f223g0 = bVar.f278M;
        this.f225h0 = bVar.f279N;
        this.f227i0 = bVar.f280O;
        this.f231k0 = bVar.f284S;
        this.f229j0 = bVar.f281P;
        this.f235m0 = bVar.f285T;
        this.f233l0 = bVar.f282Q;
        this.f239o0 = bVar.f286U;
        this.f237n0 = bVar.f283R;
        this.f241p0 = bVar.f287V;
        this.f243q0 = bVar.f288W;
        this.f245r0 = bVar.f289X;
        this.f247s0 = bVar.f290Y;
        this.f249t0 = bVar.f291Z;
        this.f251u0 = bVar.f293a0;
        this.f253v0 = bVar.f295b0;
        this.f255w0 = bVar.f297c0;
        this.f257x0 = bVar.f299d0;
        int i3 = bVar.f301e0;
        this.f259y0 = bVar.f303f0;
        this.f261z0 = bVar.f305g0;
        this.f171A0 = bVar.f307h0;
        this.f181F0 = bVar.f315l0;
        this.f183G0 = bVar.f317m0;
        this.f185H0 = bVar.f319n0;
        this.f187I0 = bVar.f321o0;
        this.f189J0 = bVar.f323p0;
        this.f191K0 = bVar.f325q0;
        this.f193L0 = bVar.f327r0;
        this.f195M0 = bVar.f329s0;
        this.f236n = bVar.f331t0;
        this.f238o = bVar.f333u0;
        this.f240p = bVar.f335v0;
        this.f244r = bVar.f339x0;
        C0054e eVar = this.f252v;
        this.f242q = ((eVar == C0054e.SimpleCircle || eVar == C0054e.TextInsideCircle || eVar == C0054e.TextOutsideCircle) && this.f244r) ? bVar.f331t0 : bVar.f337w0;
        this.f242q = bVar.f337w0;
        this.f197N0 = this.f181F0 && Build.VERSION.SDK_INT >= 21;
        this.f173B0 = bVar.f309i0;
        int i4 = bVar.f311j0;
        this.f175C0 = i4;
        this.f177D0 = bVar.f313k0;
        if (bVar instanceof C0050l.C0052b) {
            int i5 = (this.f236n * 2) + (this.f260z * 2) + (this.f172B * 2);
            if (i4 > i5) {
                int i6 = this.f170A;
                int i7 = this.f172B;
                int i8 = this.f236n;
                int i9 = this.f173B0;
                rect = new Rect(0, i6 + i7 + (i8 * 2) + i9, this.f175C0, i6 + i7 + (i8 * 2) + i9 + this.f177D0);
            } else {
                int i10 = this.f175C0;
                int i11 = this.f170A;
                int i12 = this.f172B;
                int i13 = this.f236n;
                int i14 = this.f173B0;
                rect = new Rect((i5 - i10) / 2, i11 + i12 + (i13 * 2) + i14, ((i5 - i10) / 2) + i10, i11 + i12 + (i13 * 2) + i14 + this.f177D0);
            }
            this.f217c0 = rect;
            int i15 = this.f260z;
            int i16 = this.f172B;
            int i17 = this.f236n;
            Point point = new Point(i15 + i16 + i17, this.f170A + i16 + i17);
            Rect rect3 = this.f217c0;
            int a = (int) (C0073q.m290a(point, new Point(rect3.right, rect3.bottom)) + 1.0f);
            this.f179E0 = a;
            int i18 = this.f175C0;
            if (i18 > i5) {
                rect2 = this.f217c0;
                i = a - (i18 / 2);
                i2 = a - ((this.f170A + this.f172B) + this.f236n);
            } else {
                rect2 = this.f217c0;
                int i19 = this.f260z;
                int i20 = this.f172B;
                int i21 = this.f236n;
                i = a - ((i19 + i20) + i21);
                i2 = a - ((this.f170A + i20) + i21);
            }
            rect2.offset(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: k */
    public void mo220k() {
        FrameLayout frameLayout = (FrameLayout) findViewById(C0069m.button);
        this.f234m = frameLayout;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i = this.f236n;
        layoutParams.width = i * 2;
        layoutParams.height = i * 2;
        this.f234m.setLayoutParams(layoutParams);
        this.f234m.setEnabled(!this.f195M0);
        this.f234m.setOnClickListener(new C0028a());
        mo221l();
        this.f234m.setOnTouchListener(new C0029b());
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: l */
    public void mo221l() {
        GradientDrawable gradientDrawable;
        if (this.f197N0) {
            if (this.f244r) {
                gradientDrawable = C0073q.m307r(this.f234m, this.f195M0 ? mo194M() : mo234u());
            } else {
                gradientDrawable = C0073q.m310u(this.f234m, this.f242q, this.f195M0 ? mo194M() : mo234u());
            }
            RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(mo218i()), gradientDrawable, (Drawable) null);
            C0073q.m315z(this.f234m, rippleDrawable);
            this.f199O0 = rippleDrawable;
            return;
        }
        this.f201P0 = this.f244r ? C0073q.m308s(this.f234m, this.f236n, mo234u(), mo218i(), mo194M()) : C0073q.m311v(this.f234m, this.f238o, this.f240p, this.f242q, mo234u(), mo218i(), mo194M());
        if (mo233t()) {
            this.f203Q0 = C0073q.m307r(this.f234m, this.f195M0 ? mo194M() : mo234u());
        }
        C0073q.m315z(this.f234m, this.f201P0);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: m */
    public void mo222m() {
        FrameLayout frameLayout = (FrameLayout) findViewById(C0069m.button);
        this.f234m = frameLayout;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = this.f238o;
        layoutParams.height = this.f240p;
        this.f234m.setLayoutParams(layoutParams);
        this.f234m.setEnabled(!this.f195M0);
        this.f234m.setOnClickListener(new C0030c());
        mo223n();
        this.f234m.setOnTouchListener(new C0031d());
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: n */
    public void mo223n() {
        if (this.f197N0) {
            RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(mo218i()), C0073q.m310u(this.f234m, this.f242q, this.f195M0 ? mo194M() : mo234u()), (Drawable) null);
            C0073q.m315z(this.f234m, rippleDrawable);
            this.f199O0 = rippleDrawable;
            return;
        }
        this.f201P0 = C0073q.m311v(this.f234m, this.f238o, this.f240p, this.f242q, mo234u(), mo218i(), mo194M());
        if (mo233t()) {
            this.f203Q0 = C0073q.m310u(this.f234m, this.f242q, this.f195M0 ? mo194M() : mo234u());
        }
        C0073q.m315z(this.f234m, this.f201P0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo224o() {
        this.f207S0 = new ImageView(this.f222g);
        mo198Q();
        mo197P();
        this.f234m.addView(this.f207S0);
        this.f230k = false;
        mo187F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo225p(int i) {
        if (this.f258y) {
            BMBShadow bMBShadow = (BMBShadow) findViewById(C0069m.shadow);
            this.f178E = bMBShadow;
            bMBShadow.setShadowOffsetX(this.f260z);
            this.f178E.setShadowOffsetY(this.f170A);
            this.f178E.setShadowColor(this.f176D);
            this.f178E.setShadowRadius(this.f172B);
            this.f178E.setShadowCornerRadius(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo226q(ViewGroup viewGroup) {
        if (this.f250u) {
            this.f211U0 = new TextView(this.f222g);
            mo200S();
            mo199R();
            Typeface typeface = this.f257x0;
            if (typeface != null) {
                this.f211U0.setTypeface(typeface);
            }
            this.f211U0.setMaxLines(this.f221f0);
            this.f211U0.setTextSize(2, (float) this.f171A0);
            this.f211U0.setGravity(this.f259y0);
            this.f211U0.setEllipsize(this.f261z0);
            if (this.f261z0 == TextUtils.TruncateAt.MARQUEE) {
                this.f211U0.setSingleLine(true);
                this.f211U0.setMarqueeRepeatLimit(-1);
                this.f211U0.setHorizontallyScrolling(true);
                this.f211U0.setFocusable(true);
                this.f211U0.setFocusableInTouchMode(true);
                this.f211U0.setFreezesText(true);
            }
            viewGroup.addView(this.f211U0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo227r(ViewGroup viewGroup) {
        this.f209T0 = new TextView(this.f222g);
        mo202U();
        mo201T();
        Typeface typeface = this.f219e0;
        if (typeface != null) {
            this.f209T0.setTypeface(typeface);
        }
        this.f209T0.setMaxLines(this.f221f0);
        this.f209T0.setTextSize(2, (float) this.f227i0);
        this.f209T0.setGravity(this.f223g0);
        this.f209T0.setEllipsize(this.f225h0);
        if (this.f225h0 == TextUtils.TruncateAt.MARQUEE) {
            this.f209T0.setSingleLine(true);
            this.f209T0.setMarqueeRepeatLimit(-1);
            this.f209T0.setHorizontallyScrolling(true);
            this.f209T0.setFocusable(true);
            this.f209T0.setFocusableInTouchMode(true);
            this.f209T0.setFreezesText(true);
        }
        viewGroup.addView(this.f209T0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo228s() {
        this.f205R0 = (ViewGroup) findViewById(C0069m.layout);
        int i = this.f179E0;
        this.f205R0.setLayoutParams(new FrameLayout.LayoutParams(i * 2, i * 2));
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f234m.setClickable(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f195M0 = !z;
    }

    /* access modifiers changed from: protected */
    public void setNonRippleButtonColor(int i) {
        this.f203Q0.setColor(i);
    }

    /* access modifiers changed from: protected */
    public void setRippleButtonColor(int i) {
        ((GradientDrawable) this.f199O0.getDrawable(0)).setColor(i);
    }

    /* renamed from: t */
    public boolean mo233t() {
        Integer valueOf = Integer.valueOf(mo235v());
        return this.f195M0 ? valueOf.compareTo(Integer.valueOf(mo194M())) != 0 : valueOf.compareTo(Integer.valueOf(mo234u())) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public int mo234u() {
        return C0073q.m295f(this.f222g, this.f185H0, this.f183G0);
    }

    /* renamed from: v */
    public int mo235v() {
        if (this.f254w == null && this.f256x == 0) {
            return this.f195M0 ? mo194M() : mo234u();
        }
        Integer num = this.f254w;
        return num == null ? C0073q.m294e(this.f222g, this.f256x) : C0073q.m295f(this.f222g, this.f256x, num.intValue());
    }

    /* renamed from: w */
    public FrameLayout.LayoutParams mo236w(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
        return layoutParams;
    }

    /* renamed from: x */
    public boolean mo237x() {
        if (this.f197N0) {
            if (this.f199O0 == null) {
                throw new RuntimeException("Background drawable is null!");
            }
        } else if (this.f203Q0 == null) {
            throw new RuntimeException("Background drawable is null!");
        }
        return this.f197N0;
    }

    /* renamed from: y */
    public abstract ArrayList<View> mo238y();

    /* renamed from: z */
    public abstract void mo239z();
}
