package com.google.android.exoplayer2.p035ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.p035ui.C1543i;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import p148g.p189d.p190a.p200b.C3830b;
import p148g.p189d.p190a.p200b.C3832c;
import p148g.p189d.p190a.p200b.C3834d;
import p148g.p189d.p190a.p200b.C3844g0;
import p148g.p189d.p190a.p200b.C4058m;
import p148g.p189d.p190a.p200b.C4316x;
import p148g.p189d.p190a.p200b.C4317y;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4278q;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: com.google.android.exoplayer2.ui.a */
public class C1531a extends FrameLayout {

    /* renamed from: A */
    private final String f5205A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C4317y f5206B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C3832c f5207C;

    /* renamed from: D */
    private C1535d f5208D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C4316x f5209E;

    /* renamed from: F */
    private boolean f5210F;

    /* renamed from: G */
    private boolean f5211G;

    /* renamed from: H */
    private boolean f5212H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f5213I;

    /* renamed from: J */
    private int f5214J;

    /* renamed from: K */
    private int f5215K;

    /* renamed from: L */
    private int f5216L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public int f5217M;

    /* renamed from: N */
    private boolean f5218N;

    /* renamed from: O */
    private long f5219O;

    /* renamed from: P */
    private long[] f5220P;

    /* renamed from: Q */
    private boolean[] f5221Q;

    /* renamed from: R */
    private long[] f5222R;

    /* renamed from: S */
    private boolean[] f5223S;

    /* renamed from: T */
    private final Runnable f5224T = new C1532a();
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final Runnable f5225U = new C1533b();

    /* renamed from: f */
    private final C1534c f5226f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final View f5227g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final View f5228h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final View f5229i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final View f5230j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final View f5231k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final View f5232l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final ImageView f5233m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final View f5234n;

    /* renamed from: o */
    private final TextView f5235o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final TextView f5236p;

    /* renamed from: q */
    private final C1543i f5237q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final StringBuilder f5238r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Formatter f5239s;

    /* renamed from: t */
    private final C3844g0.C3846b f5240t;

    /* renamed from: u */
    private final C3844g0.C3847c f5241u;

    /* renamed from: v */
    private final Drawable f5242v;

    /* renamed from: w */
    private final Drawable f5243w;

    /* renamed from: x */
    private final Drawable f5244x;

    /* renamed from: y */
    private final String f5245y;

    /* renamed from: z */
    private final String f5246z;

    /* renamed from: com.google.android.exoplayer2.ui.a$a */
    class C1532a implements Runnable {
        C1532a() {
        }

        public void run() {
            C1531a.this.m7423Y();
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.a$b */
    class C1533b implements Runnable {
        C1533b() {
        }

        public void run() {
            C1531a.this.mo6258H();
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.a$c */
    private final class C1534c extends C4317y.C4318a implements C1543i.C1544a, View.OnClickListener {
        private C1534c() {
        }

        /* synthetic */ C1534c(C1531a aVar, C1532a aVar2) {
            this();
        }

        /* renamed from: c */
        public void mo6241c(boolean z, int i) {
            C1531a.this.m7422X();
            C1531a.this.m7423Y();
        }

        /* renamed from: e */
        public void mo6242e(int i) {
            C1531a.this.m7421W();
            C1531a.this.m7423Y();
        }

        /* renamed from: f */
        public void mo6280f(C1543i iVar, long j) {
            if (C1531a.this.f5236p != null) {
                C1531a.this.f5236p.setText(C4284w.m18255u(C1531a.this.f5238r, C1531a.this.f5239s, j));
            }
        }

        /* renamed from: g */
        public void mo6281g(C3844g0 g0Var, Object obj, int i) {
            C1531a.this.m7421W();
            C1531a.this.m7428b0();
            C1531a.this.m7423Y();
        }

        /* renamed from: l */
        public void mo6282l(C1543i iVar, long j) {
            C1531a aVar = C1531a.this;
            aVar.removeCallbacks(aVar.f5225U);
            boolean unused = C1531a.this.f5213I = true;
        }

        /* renamed from: m */
        public void mo6283m(int i) {
            C1531a.this.m7424Z();
            C1531a.this.m7421W();
        }

        /* renamed from: n */
        public void mo6284n(C1543i iVar, long j, boolean z) {
            boolean unused = C1531a.this.f5213I = false;
            if (!z && C1531a.this.f5206B != null) {
                C1531a.this.m7418S(j);
            }
            C1531a.this.m7409I();
        }

        public void onClick(View view) {
            C3832c cVar;
            C4317y yVar;
            if (C1531a.this.f5206B != null) {
                if (C1531a.this.f5228h == view) {
                    C1531a.this.m7412M();
                } else if (C1531a.this.f5227g == view) {
                    C1531a.this.m7413N();
                } else if (C1531a.this.f5231k == view) {
                    C1531a.this.m7407F();
                } else if (C1531a.this.f5232l == view) {
                    C1531a.this.m7415P();
                } else {
                    boolean z = true;
                    if (C1531a.this.f5229i == view) {
                        if (C1531a.this.f5206B.mo12491n() == 1) {
                            if (C1531a.this.f5209E != null) {
                                C1531a.this.f5209E.mo13590a();
                            }
                        } else if (C1531a.this.f5206B.mo12491n() == 4) {
                            C1531a.this.f5207C.mo12441d(C1531a.this.f5206B, C1531a.this.f5206B.mo12467A(), -9223372036854775807L);
                        }
                        cVar = C1531a.this.f5207C;
                        yVar = C1531a.this.f5206B;
                    } else if (C1531a.this.f5230j == view) {
                        cVar = C1531a.this.f5207C;
                        yVar = C1531a.this.f5206B;
                        z = false;
                    } else if (C1531a.this.f5233m == view) {
                        C1531a.this.f5207C.mo12438a(C1531a.this.f5206B, C4278q.m18197a(C1531a.this.f5206B.mo12498u(), C1531a.this.f5217M));
                    } else if (C1531a.this.f5234n == view) {
                        C1531a.this.f5207C.mo12439b(C1531a.this.f5206B, true ^ C1531a.this.f5206B.mo12502y());
                    }
                    cVar.mo12440c(yVar, z);
                }
            }
            C1531a.this.m7409I();
        }

        /* renamed from: p */
        public void mo6286p(boolean z) {
            C1531a.this.m7426a0();
            C1531a.this.m7421W();
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.a$d */
    public interface C1535d {
        /* renamed from: a */
        void mo6287a(int i);
    }

    static {
        C4058m.m17235a("goog.exo.ui");
    }

    public C1531a(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2 = C1539e.exo_player_control_view;
        this.f5214J = 5000;
        this.f5215K = 15000;
        this.f5216L = 5000;
        this.f5217M = 0;
        this.f5219O = -9223372036854775807L;
        this.f5218N = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C1541g.PlayerControlView, 0, 0);
            try {
                this.f5214J = obtainStyledAttributes.getInt(C1541g.PlayerControlView_rewind_increment, this.f5214J);
                this.f5215K = obtainStyledAttributes.getInt(C1541g.PlayerControlView_fastforward_increment, this.f5215K);
                this.f5216L = obtainStyledAttributes.getInt(C1541g.PlayerControlView_show_timeout, this.f5216L);
                i2 = obtainStyledAttributes.getResourceId(C1541g.PlayerControlView_controller_layout_id, i2);
                this.f5217M = m7408G(obtainStyledAttributes, this.f5217M);
                this.f5218N = obtainStyledAttributes.getBoolean(C1541g.PlayerControlView_show_shuffle_button, this.f5218N);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f5240t = new C3844g0.C3846b();
        this.f5241u = new C3844g0.C3847c();
        this.f5238r = new StringBuilder();
        this.f5239s = new Formatter(this.f5238r, Locale.getDefault());
        this.f5220P = new long[0];
        this.f5221Q = new boolean[0];
        this.f5222R = new long[0];
        this.f5223S = new boolean[0];
        this.f5226f = new C1534c(this, (C1532a) null);
        this.f5207C = new C3834d();
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        this.f5235o = (TextView) findViewById(C1538d.exo_duration);
        this.f5236p = (TextView) findViewById(C1538d.exo_position);
        C1543i iVar = (C1543i) findViewById(C1538d.exo_progress);
        this.f5237q = iVar;
        if (iVar != null) {
            iVar.mo6186b(this.f5226f);
        }
        View findViewById = findViewById(C1538d.exo_play);
        this.f5229i = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this.f5226f);
        }
        View findViewById2 = findViewById(C1538d.exo_pause);
        this.f5230j = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this.f5226f);
        }
        View findViewById3 = findViewById(C1538d.exo_prev);
        this.f5227g = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this.f5226f);
        }
        View findViewById4 = findViewById(C1538d.exo_next);
        this.f5228h = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(this.f5226f);
        }
        View findViewById5 = findViewById(C1538d.exo_rew);
        this.f5232l = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(this.f5226f);
        }
        View findViewById6 = findViewById(C1538d.exo_ffwd);
        this.f5231k = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(this.f5226f);
        }
        ImageView imageView = (ImageView) findViewById(C1538d.exo_repeat_toggle);
        this.f5233m = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.f5226f);
        }
        View findViewById7 = findViewById(C1538d.exo_shuffle);
        this.f5234n = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(this.f5226f);
        }
        Resources resources = context.getResources();
        this.f5242v = resources.getDrawable(C1537c.exo_controls_repeat_off);
        this.f5243w = resources.getDrawable(C1537c.exo_controls_repeat_one);
        this.f5244x = resources.getDrawable(C1537c.exo_controls_repeat_all);
        this.f5245y = resources.getString(C1540f.exo_controls_repeat_off_description);
        this.f5246z = resources.getString(C1540f.exo_controls_repeat_one_description);
        this.f5205A = resources.getString(C1540f.exo_controls_repeat_all_description);
    }

    /* renamed from: D */
    private static boolean m7406D(C3844g0 g0Var, C3844g0.C3847c cVar) {
        if (g0Var.mo12545o() > 100) {
            return false;
        }
        int o = g0Var.mo12545o();
        for (int i = 0; i < o; i++) {
            if (g0Var.mo12542l(i, cVar).f11585g == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m7407F() {
        if (this.f5215K > 0) {
            long v = this.f5206B.mo12499v();
            long F = this.f5206B.mo12472F() + ((long) this.f5215K);
            if (v != -9223372036854775807L) {
                F = Math.min(F, v);
            }
            m7417R(F);
        }
    }

    /* renamed from: G */
    private static int m7408G(TypedArray typedArray, int i) {
        return typedArray.getInt(C1541g.PlayerControlView_repeat_toggle_modes, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m7409I() {
        removeCallbacks(this.f5225U);
        if (this.f5216L > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = this.f5216L;
            this.f5219O = uptimeMillis + ((long) i);
            if (this.f5210F) {
                postDelayed(this.f5225U, (long) i);
                return;
            }
            return;
        }
        this.f5219O = -9223372036854775807L;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: J */
    private static boolean m7410J(int i) {
        return i == 90 || i == 89 || i == 85 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* renamed from: K */
    private boolean m7411K() {
        C4317y yVar = this.f5206B;
        return (yVar == null || yVar.mo12491n() == 4 || this.f5206B.mo12491n() == 1 || !this.f5206B.mo12489l()) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m7412M() {
        C3844g0 w = this.f5206B.mo12500w();
        if (!w.mo12546p()) {
            int A = this.f5206B.mo12467A();
            int p = this.f5206B.mo12493p();
            if (p != -1) {
                m7416Q(p, -9223372036854775807L);
            } else if (w.mo12543m(A, this.f5241u, false).f11581c) {
                m7416Q(A, -9223372036854775807L);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r1.f11580b == false) goto L_0x0037;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m7413N() {
        /*
            r6 = this;
            g.d.a.b.y r0 = r6.f5206B
            g.d.a.b.g0 r0 = r0.mo12500w()
            boolean r1 = r0.mo12546p()
            if (r1 == 0) goto L_0x000d
            return
        L_0x000d:
            g.d.a.b.y r1 = r6.f5206B
            int r1 = r1.mo12467A()
            g.d.a.b.g0$c r2 = r6.f5241u
            r0.mo12542l(r1, r2)
            g.d.a.b.y r0 = r6.f5206B
            int r0 = r0.mo12487j()
            r1 = -1
            if (r0 == r1) goto L_0x0040
            g.d.a.b.y r1 = r6.f5206B
            long r1 = r1.mo12472F()
            r3 = 3000(0xbb8, double:1.482E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0037
            g.d.a.b.g0$c r1 = r6.f5241u
            boolean r2 = r1.f11581c
            if (r2 == 0) goto L_0x0040
            boolean r1 = r1.f11580b
            if (r1 != 0) goto L_0x0040
        L_0x0037:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.m7416Q(r0, r1)
            goto L_0x0045
        L_0x0040:
            r0 = 0
            r6.m7417R(r0)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p035ui.C1531a.m7413N():void");
    }

    /* renamed from: O */
    private void m7414O() {
        View view;
        View view2;
        boolean K = m7411K();
        if (!K && (view2 = this.f5229i) != null) {
            view2.requestFocus();
        } else if (K && (view = this.f5230j) != null) {
            view.requestFocus();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m7415P() {
        if (this.f5214J > 0) {
            m7417R(Math.max(this.f5206B.mo12472F() - ((long) this.f5214J), 0));
        }
    }

    /* renamed from: Q */
    private void m7416Q(int i, long j) {
        if (!this.f5207C.mo12441d(this.f5206B, i, j)) {
            m7423Y();
        }
    }

    /* renamed from: R */
    private void m7417R(long j) {
        m7416Q(this.f5206B.mo12467A(), j);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m7418S(long j) {
        int i;
        C3844g0 w = this.f5206B.mo12500w();
        if (this.f5212H && !w.mo12546p()) {
            int o = w.mo12545o();
            i = 0;
            while (true) {
                long b = w.mo12542l(i, this.f5241u).mo12565b();
                if (j < b) {
                    break;
                } else if (i == o - 1) {
                    j = b;
                    break;
                } else {
                    j -= b;
                    i++;
                }
            }
        } else {
            i = this.f5206B.mo12467A();
        }
        m7416Q(i, j);
    }

    /* renamed from: T */
    private void m7419T(boolean z, View view) {
        if (view != null) {
            view.setEnabled(z);
            view.setAlpha(z ? 1.0f : 0.3f);
            view.setVisibility(0);
        }
    }

    /* renamed from: V */
    private void m7420V() {
        m7422X();
        m7421W();
        m7424Z();
        m7426a0();
        m7423Y();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m7421W() {
        /*
            r6 = this;
            boolean r0 = r6.mo6259L()
            if (r0 == 0) goto L_0x008e
            boolean r0 = r6.f5210F
            if (r0 != 0) goto L_0x000c
            goto L_0x008e
        L_0x000c:
            g.d.a.b.y r0 = r6.f5206B
            if (r0 == 0) goto L_0x0015
            g.d.a.b.g0 r0 = r0.mo12500w()
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            boolean r3 = r0.mo12546p()
            if (r3 != 0) goto L_0x0022
            r3 = 1
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            if (r3 == 0) goto L_0x005f
            g.d.a.b.y r3 = r6.f5206B
            boolean r3 = r3.mo12484g()
            if (r3 != 0) goto L_0x005f
            g.d.a.b.y r3 = r6.f5206B
            int r3 = r3.mo12467A()
            g.d.a.b.g0$c r4 = r6.f5241u
            r0.mo12542l(r3, r4)
            g.d.a.b.g0$c r0 = r6.f5241u
            boolean r3 = r0.f11580b
            r4 = -1
            if (r3 != 0) goto L_0x004e
            boolean r0 = r0.f11581c
            if (r0 == 0) goto L_0x004e
            g.d.a.b.y r0 = r6.f5206B
            int r0 = r0.mo12487j()
            if (r0 == r4) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r0 = 0
            goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            g.d.a.b.g0$c r5 = r6.f5241u
            boolean r5 = r5.f11581c
            if (r5 != 0) goto L_0x005d
            g.d.a.b.y r5 = r6.f5206B
            int r5 = r5.mo12493p()
            if (r5 == r4) goto L_0x0061
        L_0x005d:
            r4 = 1
            goto L_0x0062
        L_0x005f:
            r0 = 0
            r3 = 0
        L_0x0061:
            r4 = 0
        L_0x0062:
            android.view.View r5 = r6.f5227g
            r6.m7419T(r0, r5)
            android.view.View r0 = r6.f5228h
            r6.m7419T(r4, r0)
            int r0 = r6.f5215K
            if (r0 <= 0) goto L_0x0074
            if (r3 == 0) goto L_0x0074
            r0 = 1
            goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            android.view.View r4 = r6.f5231k
            r6.m7419T(r0, r4)
            int r0 = r6.f5214J
            if (r0 <= 0) goto L_0x0081
            if (r3 == 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r1 = 0
        L_0x0082:
            android.view.View r0 = r6.f5232l
            r6.m7419T(r1, r0)
            com.google.android.exoplayer2.ui.i r0 = r6.f5237q
            if (r0 == 0) goto L_0x008e
            r0.setEnabled(r3)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p035ui.C1531a.m7421W():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m7422X() {
        boolean z;
        if (mo6259L() && this.f5210F) {
            boolean K = m7411K();
            View view = this.f5229i;
            int i = 8;
            boolean z2 = true;
            if (view != null) {
                z = (K && view.isFocused()) | false;
                this.f5229i.setVisibility(K ? 8 : 0);
            } else {
                z = false;
            }
            View view2 = this.f5230j;
            if (view2 != null) {
                if (K || !view2.isFocused()) {
                    z2 = false;
                }
                z |= z2;
                View view3 = this.f5230j;
                if (K) {
                    i = 0;
                }
                view3.setVisibility(i);
            }
            if (z) {
                m7414O();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m7423Y() {
        long j;
        long j2;
        int i;
        long j3;
        C3844g0.C3847c cVar;
        int i2;
        if (mo6259L() && this.f5210F) {
            C4317y yVar = this.f5206B;
            long j4 = 0;
            boolean z = true;
            if (yVar != null) {
                C3844g0 w = yVar.mo12500w();
                if (!w.mo12546p()) {
                    int A = this.f5206B.mo12467A();
                    int i3 = this.f5212H ? 0 : A;
                    int o = this.f5212H ? w.mo12545o() - 1 : A;
                    long j5 = 0;
                    j3 = 0;
                    i = 0;
                    while (true) {
                        if (i3 > o) {
                            break;
                        }
                        if (i3 == A) {
                            j3 = j5;
                        }
                        w.mo12542l(i3, this.f5241u);
                        C3844g0.C3847c cVar2 = this.f5241u;
                        int i4 = i3;
                        if (cVar2.f11585g == -9223372036854775807L) {
                            C4260a.m18074f(this.f5212H ^ z);
                            break;
                        }
                        int i5 = cVar2.f11582d;
                        while (true) {
                            cVar = this.f5241u;
                            if (i5 > cVar.f11583e) {
                                break;
                            }
                            w.mo12536f(i5, this.f5240t);
                            int c = this.f5240t.mo12550c();
                            int i6 = 0;
                            while (i6 < c) {
                                long f = this.f5240t.mo12553f(i6);
                                if (f == Long.MIN_VALUE) {
                                    i2 = A;
                                    long j6 = this.f5240t.f11576d;
                                    if (j6 == -9223372036854775807L) {
                                        i6++;
                                        A = i2;
                                    } else {
                                        f = j6;
                                    }
                                } else {
                                    i2 = A;
                                }
                                long l = f + this.f5240t.mo12559l();
                                if (l >= 0 && l <= this.f5241u.f11585g) {
                                    long[] jArr = this.f5220P;
                                    if (i == jArr.length) {
                                        int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                        this.f5220P = Arrays.copyOf(this.f5220P, length);
                                        this.f5221Q = Arrays.copyOf(this.f5221Q, length);
                                    }
                                    this.f5220P[i] = C3830b.m15923b(j5 + l);
                                    this.f5221Q[i] = this.f5240t.mo12560m(i6);
                                    i++;
                                }
                                i6++;
                                A = i2;
                            }
                            int i7 = A;
                            i5++;
                        }
                        j5 += cVar.f11585g;
                        i3 = i4 + 1;
                        A = A;
                        z = true;
                    }
                    j4 = j5;
                } else {
                    j3 = 0;
                    i = 0;
                }
                j4 = C3830b.m15923b(j4);
                long b = C3830b.m15923b(j3);
                if (this.f5206B.mo12484g()) {
                    j2 = b + this.f5206B.mo12485h();
                    j = j2;
                } else {
                    long F = this.f5206B.mo12472F() + b;
                    long k = b + this.f5206B.mo12488k();
                    j2 = F;
                    j = k;
                }
                if (this.f5237q != null) {
                    int length2 = this.f5222R.length;
                    int i8 = i + length2;
                    long[] jArr2 = this.f5220P;
                    if (i8 > jArr2.length) {
                        this.f5220P = Arrays.copyOf(jArr2, i8);
                        this.f5221Q = Arrays.copyOf(this.f5221Q, i8);
                    }
                    System.arraycopy(this.f5222R, 0, this.f5220P, i, length2);
                    System.arraycopy(this.f5223S, 0, this.f5221Q, i, length2);
                    this.f5237q.mo6185a(this.f5220P, this.f5221Q, i8);
                }
            } else {
                j2 = 0;
                j = 0;
            }
            TextView textView = this.f5235o;
            if (textView != null) {
                textView.setText(C4284w.m18255u(this.f5238r, this.f5239s, j4));
            }
            TextView textView2 = this.f5236p;
            if (textView2 != null && !this.f5213I) {
                textView2.setText(C4284w.m18255u(this.f5238r, this.f5239s, j2));
            }
            C1543i iVar = this.f5237q;
            if (iVar != null) {
                iVar.setPosition(j2);
                this.f5237q.setBufferedPosition(j);
                this.f5237q.setDuration(j4);
            }
            removeCallbacks(this.f5224T);
            C4317y yVar2 = this.f5206B;
            int n = yVar2 == null ? 1 : yVar2.mo12491n();
            if (n != 1 && n != 4) {
                long j7 = 1000;
                if (this.f5206B.mo12489l() && n == 3) {
                    float f2 = this.f5206B.mo12481d().f13801a;
                    if (f2 > 0.1f) {
                        if (f2 <= 5.0f) {
                            long max = (long) (1000 / Math.max(1, Math.round(1.0f / f2)));
                            long j8 = max - (j2 % max);
                            if (j8 < max / 5) {
                                j8 += max;
                            }
                            if (f2 != 1.0f) {
                                j8 = (long) (((float) j8) / f2);
                            }
                            j7 = j8;
                        } else {
                            j7 = 200;
                        }
                    }
                }
                postDelayed(this.f5224T, j7);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m7424Z() {
        ImageView imageView;
        String str;
        ImageView imageView2;
        if (mo6259L() && this.f5210F && (imageView = this.f5233m) != null) {
            if (this.f5217M == 0) {
                imageView.setVisibility(8);
            } else if (this.f5206B == null) {
                m7419T(false, imageView);
            } else {
                m7419T(true, imageView);
                int u = this.f5206B.mo12498u();
                if (u == 0) {
                    this.f5233m.setImageDrawable(this.f5242v);
                    imageView2 = this.f5233m;
                    str = this.f5245y;
                } else if (u != 1) {
                    if (u == 2) {
                        this.f5233m.setImageDrawable(this.f5244x);
                        imageView2 = this.f5233m;
                        str = this.f5205A;
                    }
                    this.f5233m.setVisibility(0);
                } else {
                    this.f5233m.setImageDrawable(this.f5243w);
                    imageView2 = this.f5233m;
                    str = this.f5246z;
                }
                imageView2.setContentDescription(str);
                this.f5233m.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m7426a0() {
        View view;
        if (mo6259L() && this.f5210F && (view = this.f5234n) != null) {
            if (!this.f5218N) {
                view.setVisibility(8);
                return;
            }
            C4317y yVar = this.f5206B;
            if (yVar == null) {
                m7419T(false, view);
                return;
            }
            view.setAlpha(yVar.mo12502y() ? 1.0f : 0.3f);
            this.f5234n.setEnabled(true);
            this.f5234n.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m7428b0() {
        C4317y yVar = this.f5206B;
        if (yVar != null) {
            this.f5212H = this.f5211G && m7406D(yVar.mo12500w(), this.f5241u);
        }
    }

    /* renamed from: E */
    public boolean mo6257E(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f5206B == null || !m7410J(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                m7407F();
            } else if (keyCode == 89) {
                m7415P();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 85) {
                    C3832c cVar = this.f5207C;
                    C4317y yVar = this.f5206B;
                    cVar.mo12440c(yVar, !yVar.mo12489l());
                } else if (keyCode == 87) {
                    m7412M();
                } else if (keyCode == 88) {
                    m7413N();
                } else if (keyCode == 126) {
                    this.f5207C.mo12440c(this.f5206B, true);
                } else if (keyCode == 127) {
                    this.f5207C.mo12440c(this.f5206B, false);
                }
            }
        }
        return true;
    }

    /* renamed from: H */
    public void mo6258H() {
        if (mo6259L()) {
            setVisibility(8);
            C1535d dVar = this.f5208D;
            if (dVar != null) {
                dVar.mo6287a(getVisibility());
            }
            removeCallbacks(this.f5224T);
            removeCallbacks(this.f5225U);
            this.f5219O = -9223372036854775807L;
        }
    }

    /* renamed from: L */
    public boolean mo6259L() {
        return getVisibility() == 0;
    }

    /* renamed from: U */
    public void mo6260U() {
        if (!mo6259L()) {
            setVisibility(0);
            C1535d dVar = this.f5208D;
            if (dVar != null) {
                dVar.mo6287a(getVisibility());
            }
            m7420V();
            m7414O();
        }
        m7409I();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return mo6257E(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public C4317y getPlayer() {
        return this.f5206B;
    }

    public int getRepeatToggleModes() {
        return this.f5217M;
    }

    public boolean getShowShuffleButton() {
        return this.f5218N;
    }

    public int getShowTimeoutMs() {
        return this.f5216L;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5210F = true;
        long j = this.f5219O;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                mo6258H();
            } else {
                postDelayed(this.f5225U, uptimeMillis);
            }
        } else if (mo6259L()) {
            m7409I();
        }
        m7420V();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5210F = false;
        removeCallbacks(this.f5224T);
        removeCallbacks(this.f5225U);
    }

    public void setControlDispatcher(C3832c cVar) {
        if (cVar == null) {
            cVar = new C3834d();
        }
        this.f5207C = cVar;
    }

    public void setFastForwardIncrementMs(int i) {
        this.f5215K = i;
        m7421W();
    }

    public void setPlaybackPreparer(C4316x xVar) {
        this.f5209E = xVar;
    }

    public void setPlayer(C4317y yVar) {
        C4317y yVar2 = this.f5206B;
        if (yVar2 != yVar) {
            if (yVar2 != null) {
                yVar2.mo12503z(this.f5226f);
            }
            this.f5206B = yVar;
            if (yVar != null) {
                yVar.mo12494q(this.f5226f);
            }
            m7420V();
        }
    }

    public void setRepeatToggleModes(int i) {
        int i2;
        C3832c cVar;
        C4317y yVar;
        this.f5217M = i;
        C4317y yVar2 = this.f5206B;
        if (yVar2 != null) {
            int u = yVar2.mo12498u();
            if (i != 0 || u == 0) {
                i2 = 2;
                if (i == 1 && u == 2) {
                    this.f5207C.mo12438a(this.f5206B, 1);
                    return;
                } else if (i == 2 && u == 1) {
                    cVar = this.f5207C;
                    yVar = this.f5206B;
                } else {
                    return;
                }
            } else {
                cVar = this.f5207C;
                yVar = this.f5206B;
                i2 = 0;
            }
            cVar.mo12438a(yVar, i2);
        }
    }

    public void setRewindIncrementMs(int i) {
        this.f5214J = i;
        m7421W();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f5211G = z;
        m7428b0();
    }

    public void setShowShuffleButton(boolean z) {
        this.f5218N = z;
        m7426a0();
    }

    public void setShowTimeoutMs(int i) {
        this.f5216L = i;
        if (mo6259L()) {
            m7409I();
        }
    }

    public void setVisibilityListener(C1535d dVar) {
        this.f5208D = dVar;
    }
}
