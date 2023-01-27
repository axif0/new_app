package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.C0872a;
import androidx.recyclerview.widget.C0877d;
import androidx.recyclerview.widget.C0903h;
import androidx.recyclerview.widget.C0916o;
import androidx.recyclerview.widget.C0923s;
import androidx.recyclerview.widget.C0926t;
import com.karumi.dexter.BuildConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p086f.p111h.p118i.C3309b;
import p086f.p111h.p121l.C3349h;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3392i;
import p086f.p111h.p122m.C3393j;
import p086f.p111h.p122m.C3394k;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.C3415u;
import p086f.p111h.p122m.p123c0.C3368b;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p126j.p127a.C3430a;
import p086f.p143r.C3482a;
import p086f.p143r.C3483b;
import p086f.p143r.C3484c;

public class RecyclerView extends ViewGroup implements C3393j {

    /* renamed from: D0 */
    private static final int[] f3249D0 = {16843830};

    /* renamed from: E0 */
    static final boolean f3250E0;

    /* renamed from: F0 */
    static final boolean f3251F0 = (Build.VERSION.SDK_INT >= 23);

    /* renamed from: G0 */
    static final boolean f3252G0 = (Build.VERSION.SDK_INT >= 16);

    /* renamed from: H0 */
    static final boolean f3253H0 = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: I0 */
    private static final boolean f3254I0 = (Build.VERSION.SDK_INT <= 15);

    /* renamed from: J0 */
    private static final boolean f3255J0 = (Build.VERSION.SDK_INT <= 15);

    /* renamed from: K0 */
    private static final Class<?>[] f3256K0;

    /* renamed from: L0 */
    static final Interpolator f3257L0 = new C0826c();

    /* renamed from: A */
    private int f3258A;

    /* renamed from: A0 */
    final List<C0829d0> f3259A0;

    /* renamed from: B */
    boolean f3260B;

    /* renamed from: B0 */
    private Runnable f3261B0;

    /* renamed from: C */
    boolean f3262C;

    /* renamed from: C0 */
    private final C0926t.C0928b f3263C0;

    /* renamed from: D */
    private boolean f3264D;

    /* renamed from: E */
    private int f3265E;

    /* renamed from: F */
    boolean f3266F;

    /* renamed from: G */
    private final AccessibilityManager f3267G;

    /* renamed from: H */
    private List<C0849q> f3268H;

    /* renamed from: I */
    boolean f3269I;

    /* renamed from: J */
    boolean f3270J;

    /* renamed from: K */
    private int f3271K;

    /* renamed from: L */
    private int f3272L;

    /* renamed from: M */
    private C0836k f3273M;

    /* renamed from: N */
    private EdgeEffect f3274N;

    /* renamed from: O */
    private EdgeEffect f3275O;

    /* renamed from: P */
    private EdgeEffect f3276P;

    /* renamed from: Q */
    private EdgeEffect f3277Q;

    /* renamed from: R */
    C0837l f3278R;

    /* renamed from: S */
    private int f3279S;

    /* renamed from: T */
    private int f3280T;

    /* renamed from: U */
    private VelocityTracker f3281U;

    /* renamed from: V */
    private int f3282V;

    /* renamed from: W */
    private int f3283W;

    /* renamed from: a0 */
    private int f3284a0;

    /* renamed from: b0 */
    private int f3285b0;

    /* renamed from: c0 */
    private int f3286c0;

    /* renamed from: d0 */
    private C0850r f3287d0;

    /* renamed from: e0 */
    private final int f3288e0;

    /* renamed from: f */
    private final C0857x f3289f;

    /* renamed from: f0 */
    private final int f3290f0;

    /* renamed from: g */
    final C0855v f3291g;

    /* renamed from: g0 */
    private float f3292g0;

    /* renamed from: h */
    private C0858y f3293h;

    /* renamed from: h0 */
    private float f3294h0;

    /* renamed from: i */
    C0872a f3295i;

    /* renamed from: i0 */
    private boolean f3296i0;

    /* renamed from: j */
    C0877d f3297j;

    /* renamed from: j0 */
    final C0827c0 f3298j0;

    /* renamed from: k */
    final C0926t f3299k;

    /* renamed from: k0 */
    C0903h f3300k0;

    /* renamed from: l */
    boolean f3301l;

    /* renamed from: l0 */
    C0903h.C0905b f3302l0;

    /* renamed from: m */
    final Runnable f3303m;

    /* renamed from: m0 */
    final C0823a0 f3304m0;

    /* renamed from: n */
    final Rect f3305n;

    /* renamed from: n0 */
    private C0852t f3306n0;

    /* renamed from: o */
    private final Rect f3307o;

    /* renamed from: o0 */
    private List<C0852t> f3308o0;

    /* renamed from: p */
    final RectF f3309p;

    /* renamed from: p0 */
    boolean f3310p0;

    /* renamed from: q */
    C0832g f3311q;

    /* renamed from: q0 */
    boolean f3312q0;

    /* renamed from: r */
    C0843o f3313r;

    /* renamed from: r0 */
    private C0837l.C0839b f3314r0;

    /* renamed from: s */
    C0856w f3315s;

    /* renamed from: s0 */
    boolean f3316s0;

    /* renamed from: t */
    final ArrayList<C0842n> f3317t;

    /* renamed from: t0 */
    C0916o f3318t0;

    /* renamed from: u */
    private final ArrayList<C0851s> f3319u;

    /* renamed from: u0 */
    private C0835j f3320u0;

    /* renamed from: v */
    private C0851s f3321v;

    /* renamed from: v0 */
    private final int[] f3322v0;

    /* renamed from: w */
    boolean f3323w;

    /* renamed from: w0 */
    private C3394k f3324w0;

    /* renamed from: x */
    boolean f3325x;

    /* renamed from: x0 */
    private final int[] f3326x0;

    /* renamed from: y */
    boolean f3327y;

    /* renamed from: y0 */
    private final int[] f3328y0;

    /* renamed from: z */
    boolean f3329z;

    /* renamed from: z0 */
    final int[] f3330z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C0822a implements Runnable {
        C0822a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3329z && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f3323w) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f3262C) {
                    recyclerView2.f3260B = true;
                } else {
                    recyclerView2.mo4264u();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static class C0823a0 {

        /* renamed from: a */
        int f3332a = -1;

        /* renamed from: b */
        private SparseArray<Object> f3333b;

        /* renamed from: c */
        int f3334c = 0;

        /* renamed from: d */
        int f3335d = 0;

        /* renamed from: e */
        int f3336e = 1;

        /* renamed from: f */
        int f3337f = 0;

        /* renamed from: g */
        boolean f3338g = false;

        /* renamed from: h */
        boolean f3339h = false;

        /* renamed from: i */
        boolean f3340i = false;

        /* renamed from: j */
        boolean f3341j = false;

        /* renamed from: k */
        boolean f3342k = false;

        /* renamed from: l */
        boolean f3343l = false;

        /* renamed from: m */
        int f3344m;

        /* renamed from: n */
        long f3345n;

        /* renamed from: o */
        int f3346o;

        /* renamed from: p */
        int f3347p;

        /* renamed from: q */
        int f3348q;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4277a(int i) {
            if ((this.f3336e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3336e));
            }
        }

        /* renamed from: b */
        public int mo4278b() {
            return this.f3339h ? this.f3334c - this.f3335d : this.f3337f;
        }

        /* renamed from: c */
        public int mo4279c() {
            return this.f3332a;
        }

        /* renamed from: d */
        public boolean mo4280d() {
            return this.f3332a != -1;
        }

        /* renamed from: e */
        public boolean mo4281e() {
            return this.f3339h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4282f(C0832g gVar) {
            this.f3336e = 1;
            this.f3337f = gVar.mo3963e();
            this.f3339h = false;
            this.f3340i = false;
            this.f3341j = false;
        }

        /* renamed from: g */
        public boolean mo4283g() {
            return this.f3343l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3332a + ", mData=" + this.f3333b + ", mItemCount=" + this.f3337f + ", mIsMeasuring=" + this.f3341j + ", mPreviousLayoutItemCount=" + this.f3334c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3335d + ", mStructureChanged=" + this.f3338g + ", mInPreLayout=" + this.f3339h + ", mRunSimpleAnimations=" + this.f3342k + ", mRunPredictiveAnimations=" + this.f3343l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C0824b implements Runnable {
        C0824b() {
        }

        public void run() {
            C0837l lVar = RecyclerView.this.f3278R;
            if (lVar != null) {
                lVar.mo4408u();
            }
            RecyclerView.this.f3316s0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class C0825b0 {
        /* renamed from: a */
        public abstract View mo4286a(C0855v vVar, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    static class C0826c implements Interpolator {
        C0826c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    class C0827c0 implements Runnable {

        /* renamed from: f */
        private int f3350f;

        /* renamed from: g */
        private int f3351g;

        /* renamed from: h */
        OverScroller f3352h;

        /* renamed from: i */
        Interpolator f3353i = RecyclerView.f3257L0;

        /* renamed from: j */
        private boolean f3354j = false;

        /* renamed from: k */
        private boolean f3355k = false;

        C0827c0() {
            this.f3352h = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f3257L0);
        }

        /* renamed from: a */
        private int m4334a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float b = f2 + (m4335b(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(b / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: b */
        private float m4335b(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: d */
        private void m4336d() {
            RecyclerView.this.removeCallbacks(this);
            C3403t.m14627a0(RecyclerView.this, this);
        }

        /* renamed from: c */
        public void mo4288c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f3351g = 0;
            this.f3350f = 0;
            Interpolator interpolator = this.f3353i;
            Interpolator interpolator2 = RecyclerView.f3257L0;
            if (interpolator != interpolator2) {
                this.f3353i = interpolator2;
                this.f3352h = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f3257L0);
            }
            this.f3352h.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo4289e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4289e() {
            if (this.f3354j) {
                this.f3355k = true;
            } else {
                m4336d();
            }
        }

        /* renamed from: f */
        public void mo4290f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m4334a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f3257L0;
            }
            if (this.f3353i != interpolator) {
                this.f3353i = interpolator;
                this.f3352h = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3351g = 0;
            this.f3350f = 0;
            RecyclerView.this.setScrollState(2);
            this.f3352h.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3352h.computeScrollOffset();
            }
            mo4289e();
        }

        /* renamed from: g */
        public void mo4291g() {
            RecyclerView.this.removeCallbacks(this);
            this.f3352h.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3313r == null) {
                mo4291g();
                return;
            }
            this.f3355k = false;
            this.f3354j = true;
            recyclerView.mo4264u();
            OverScroller overScroller = this.f3352h;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f3350f;
                int i4 = currY - this.f3351g;
                this.f3350f = currX;
                this.f3351g = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f3330z0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo4112F(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f3330z0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo4261t(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f3311q != null) {
                    int[] iArr3 = recyclerView3.f3330z0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo4192h1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f3330z0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C0860z zVar = recyclerView4.f3313r.f3396g;
                    if (zVar != null && !zVar.mo4590g() && zVar.mo4591h()) {
                        int b = RecyclerView.this.f3304m0.mo4278b();
                        if (b == 0) {
                            zVar.mo4601r();
                        } else {
                            if (zVar.mo4589f() >= b) {
                                zVar.mo4599p(b - 1);
                            }
                            zVar.mo4593j(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f3317t.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f3330z0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo4114G(i, i2, i3, i4, (int[]) null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.f3330z0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    RecyclerView.this.mo4118I(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                C0860z zVar2 = RecyclerView.this.f3313r.f3396g;
                if ((zVar2 != null && zVar2.mo4590g()) || !z) {
                    mo4289e();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    C0903h hVar = recyclerView6.f3300k0;
                    if (hVar != null) {
                        hVar.mo4778f(recyclerView6, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.mo4143a(i7, currVelocity);
                    }
                    if (RecyclerView.f3253H0) {
                        RecyclerView.this.f3302l0.mo4784b();
                    }
                }
            }
            C0860z zVar3 = RecyclerView.this.f3313r.f3396g;
            if (zVar3 != null && zVar3.mo4590g()) {
                zVar3.mo4593j(0, 0);
            }
            this.f3354j = false;
            if (this.f3355k) {
                m4336d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo4266u1(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C0828d implements C0926t.C0928b {
        C0828d() {
        }

        /* renamed from: a */
        public void mo4293a(C0829d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3313r.mo4488m1(d0Var.f3359a, recyclerView.f3291g);
        }

        /* renamed from: b */
        public void mo4294b(C0829d0 d0Var, C0837l.C0840c cVar, C0837l.C0840c cVar2) {
            RecyclerView.this.mo4202l(d0Var, cVar, cVar2);
        }

        /* renamed from: c */
        public void mo4295c(C0829d0 d0Var, C0837l.C0840c cVar, C0837l.C0840c cVar2) {
            RecyclerView.this.f3291g.mo4548J(d0Var);
            RecyclerView.this.mo4206n(d0Var, cVar, cVar2);
        }

        /* renamed from: d */
        public void mo4296d(C0829d0 d0Var, C0837l.C0840c cVar, C0837l.C0840c cVar2) {
            d0Var.mo4303G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.f3269I;
            C0837l lVar = recyclerView.f3278R;
            if (z) {
                if (!lVar.mo4390b(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.mo4392d(d0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.mo4127N0();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class C0829d0 {

        /* renamed from: s */
        private static final List<Object> f3358s = Collections.emptyList();

        /* renamed from: a */
        public final View f3359a;

        /* renamed from: b */
        WeakReference<RecyclerView> f3360b;

        /* renamed from: c */
        int f3361c = -1;

        /* renamed from: d */
        int f3362d = -1;

        /* renamed from: e */
        long f3363e = -1;

        /* renamed from: f */
        int f3364f = -1;

        /* renamed from: g */
        int f3365g = -1;

        /* renamed from: h */
        C0829d0 f3366h = null;

        /* renamed from: i */
        C0829d0 f3367i = null;

        /* renamed from: j */
        int f3368j;

        /* renamed from: k */
        List<Object> f3369k = null;

        /* renamed from: l */
        List<Object> f3370l = null;

        /* renamed from: m */
        private int f3371m = 0;

        /* renamed from: n */
        C0855v f3372n = null;

        /* renamed from: o */
        boolean f3373o = false;

        /* renamed from: p */
        private int f3374p = 0;

        /* renamed from: q */
        int f3375q = -1;

        /* renamed from: r */
        RecyclerView f3376r;

        public C0829d0(View view) {
            if (view != null) {
                this.f3359a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: g */
        private void m4345g() {
            if (this.f3369k == null) {
                ArrayList arrayList = new ArrayList();
                this.f3369k = arrayList;
                this.f3370l = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4297A(int i, boolean z) {
            if (this.f3362d == -1) {
                this.f3362d = this.f3361c;
            }
            if (this.f3365g == -1) {
                this.f3365g = this.f3361c;
            }
            if (z) {
                this.f3365g += i;
            }
            this.f3361c += i;
            if (this.f3359a.getLayoutParams() != null) {
                ((C0848p) this.f3359a.getLayoutParams()).f3416c = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo4298B(RecyclerView recyclerView) {
            int i = this.f3375q;
            if (i == -1) {
                i = C3403t.m14670w(this.f3359a);
            }
            this.f3374p = i;
            recyclerView.mo4201k1(this, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo4299C(RecyclerView recyclerView) {
            recyclerView.mo4201k1(this, this.f3374p);
            this.f3374p = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo4300D() {
            this.f3368j = 0;
            this.f3361c = -1;
            this.f3362d = -1;
            this.f3363e = -1;
            this.f3365g = -1;
            this.f3371m = 0;
            this.f3366h = null;
            this.f3367i = null;
            mo4312d();
            this.f3374p = 0;
            this.f3375q = -1;
            RecyclerView.m4234r(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo4301E() {
            if (this.f3362d == -1) {
                this.f3362d = this.f3361c;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo4302F(int i, int i2) {
            this.f3368j = (i & i2) | (this.f3368j & (i2 ^ -1));
        }

        /* renamed from: G */
        public final void mo4303G(boolean z) {
            int i;
            int i2 = this.f3371m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f3371m = i3;
            if (i3 < 0) {
                this.f3371m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f3368j | 16;
            } else if (z && this.f3371m == 0) {
                i = this.f3368j & -17;
            } else {
                return;
            }
            this.f3368j = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public void mo4304H(C0855v vVar, boolean z) {
            this.f3372n = vVar;
            this.f3373o = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo4305I() {
            return (this.f3368j & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo4306J() {
            return (this.f3368j & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo4307K() {
            this.f3372n.mo4548J(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo4308L() {
            return (this.f3368j & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4309a(Object obj) {
            if (obj == null) {
                mo4310b(1024);
            } else if ((1024 & this.f3368j) == 0) {
                m4345g();
                this.f3369k.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4310b(int i) {
            this.f3368j = i | this.f3368j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4311c() {
            this.f3362d = -1;
            this.f3365g = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4312d() {
            List<Object> list = this.f3369k;
            if (list != null) {
                list.clear();
            }
            this.f3368j &= -1025;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4313e() {
            this.f3368j &= -33;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4314f() {
            this.f3368j &= -257;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo4315h() {
            return (this.f3368j & 16) == 0 && C3403t.m14611L(this.f3359a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4316i(int i, int i2, boolean z) {
            mo4310b(8);
            mo4297A(i2, z);
            this.f3361c = i;
        }

        /* renamed from: j */
        public final int mo4317j() {
            RecyclerView recyclerView = this.f3376r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo4147b0(this);
        }

        /* renamed from: k */
        public final long mo4318k() {
            return this.f3363e;
        }

        /* renamed from: l */
        public final int mo4319l() {
            return this.f3364f;
        }

        /* renamed from: m */
        public final int mo4320m() {
            int i = this.f3365g;
            return i == -1 ? this.f3361c : i;
        }

        /* renamed from: n */
        public final int mo4321n() {
            return this.f3362d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public List<Object> mo4322o() {
            if ((this.f3368j & 1024) != 0) {
                return f3358s;
            }
            List<Object> list = this.f3369k;
            return (list == null || list.size() == 0) ? f3358s : this.f3370l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean mo4323p(int i) {
            return (i & this.f3368j) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo4324q() {
            return (this.f3368j & 512) != 0 || mo4327t();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public boolean mo4325r() {
            return (this.f3359a.getParent() == null || this.f3359a.getParent() == this.f3376r) ? false : true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean mo4326s() {
            return (this.f3368j & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public boolean mo4327t() {
            return (this.f3368j & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3361c + " id=" + this.f3363e + ", oldPos=" + this.f3362d + ", pLpos:" + this.f3365g);
            if (mo4331w()) {
                sb.append(" scrap ");
                sb.append(this.f3373o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo4327t()) {
                sb.append(" invalid");
            }
            if (!mo4326s()) {
                sb.append(" unbound");
            }
            if (mo4334z()) {
                sb.append(" update");
            }
            if (mo4330v()) {
                sb.append(" removed");
            }
            if (mo4306J()) {
                sb.append(" ignored");
            }
            if (mo4332x()) {
                sb.append(" tmpDetached");
            }
            if (!mo4329u()) {
                sb.append(" not recyclable(" + this.f3371m + ")");
            }
            if (mo4324q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f3359a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public final boolean mo4329u() {
            return (this.f3368j & 16) == 0 && !C3403t.m14611L(this.f3359a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public boolean mo4330v() {
            return (this.f3368j & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public boolean mo4331w() {
            return this.f3372n != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean mo4332x() {
            return (this.f3368j & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public boolean mo4333y() {
            return (this.f3368j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public boolean mo4334z() {
            return (this.f3368j & 2) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C0830e implements C0877d.C0879b {
        C0830e() {
        }

        /* renamed from: a */
        public View mo4335a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: b */
        public void mo4336b(View view) {
            C0829d0 g0 = RecyclerView.m4223g0(view);
            if (g0 != null) {
                g0.mo4298B(RecyclerView.this);
            }
        }

        /* renamed from: c */
        public C0829d0 mo4337c(View view) {
            return RecyclerView.m4223g0(view);
        }

        /* renamed from: d */
        public void mo4338d(int i) {
            C0829d0 g0;
            View a = mo4335a(i);
            if (!(a == null || (g0 = RecyclerView.m4223g0(a)) == null)) {
                if (!g0.mo4332x() || g0.mo4306J()) {
                    g0.mo4310b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + g0 + RecyclerView.this.mo4129P());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: e */
        public void mo4339e(View view) {
            C0829d0 g0 = RecyclerView.m4223g0(view);
            if (g0 != null) {
                g0.mo4299C(RecyclerView.this);
            }
        }

        /* renamed from: f */
        public void mo4340f(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.mo4272y(view);
        }

        /* renamed from: g */
        public int mo4341g() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: h */
        public void mo4342h(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.mo4274z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: i */
        public void mo4343i() {
            int g = mo4341g();
            for (int i = 0; i < g; i++) {
                View a = mo4335a(i);
                RecyclerView.this.mo4274z(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: j */
        public void mo4344j(View view, int i, ViewGroup.LayoutParams layoutParams) {
            C0829d0 g0 = RecyclerView.m4223g0(view);
            if (g0 != null) {
                if (g0.mo4332x() || g0.mo4306J()) {
                    g0.mo4314f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + g0 + RecyclerView.this.mo4129P());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        /* renamed from: k */
        public int mo4345k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C0831f implements C0872a.C0873a {
        C0831f() {
        }

        /* renamed from: a */
        public void mo4346a(int i, int i2) {
            RecyclerView.this.mo4110D0(i, i2);
            RecyclerView.this.f3310p0 = true;
        }

        /* renamed from: b */
        public void mo4347b(C0872a.C0874b bVar) {
            mo4354i(bVar);
        }

        /* renamed from: c */
        public C0829d0 mo4348c(int i) {
            C0829d0 Z = RecyclerView.this.mo4141Z(i, true);
            if (Z != null && !RecyclerView.this.f3297j.mo4720n(Z.f3359a)) {
                return Z;
            }
            return null;
        }

        /* renamed from: d */
        public void mo4349d(int i, int i2) {
            RecyclerView.this.mo4111E0(i, i2, false);
            RecyclerView.this.f3310p0 = true;
        }

        /* renamed from: e */
        public void mo4350e(int i, int i2) {
            RecyclerView.this.mo4109C0(i, i2);
            RecyclerView.this.f3310p0 = true;
        }

        /* renamed from: f */
        public void mo4351f(int i, int i2) {
            RecyclerView.this.mo4111E0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3310p0 = true;
            recyclerView.f3304m0.f3335d += i2;
        }

        /* renamed from: g */
        public void mo4352g(C0872a.C0874b bVar) {
            mo4354i(bVar);
        }

        /* renamed from: h */
        public void mo4353h(int i, int i2, Object obj) {
            RecyclerView.this.mo4271x1(i, i2, obj);
            RecyclerView.this.f3312q0 = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4354i(C0872a.C0874b bVar) {
            int i = bVar.f3514a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f3313r.mo4020R0(recyclerView, bVar.f3515b, bVar.f3517d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f3313r.mo4023U0(recyclerView2, bVar.f3515b, bVar.f3517d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f3313r.mo4024W0(recyclerView3, bVar.f3515b, bVar.f3517d, bVar.f3516c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f3313r.mo4022T0(recyclerView4, bVar.f3515b, bVar.f3517d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C0832g<VH extends C0829d0> {

        /* renamed from: f */
        private final C0833h f3379f = new C0833h();

        /* renamed from: g */
        private boolean f3380g = false;

        /* renamed from: A */
        public void mo4355A(C0834i iVar) {
            this.f3379f.unregisterObserver(iVar);
        }

        /* renamed from: c */
        public final void mo4356c(VH vh, int i) {
            vh.f3361c = i;
            if (mo4359i()) {
                vh.f3363e = mo3964f(i);
            }
            vh.mo4302F(1, 519);
            C3309b.m14261a("RV OnBindView");
            mo4367r(vh, i, vh.mo4322o());
            vh.mo4312d();
            ViewGroup.LayoutParams layoutParams = vh.f3359a.getLayoutParams();
            if (layoutParams instanceof C0848p) {
                ((C0848p) layoutParams).f3416c = true;
            }
            C3309b.m14262b();
        }

        /* renamed from: d */
        public final VH mo4357d(ViewGroup viewGroup, int i) {
            try {
                C3309b.m14261a("RV CreateView");
                VH s = mo3967s(viewGroup, i);
                if (s.f3359a.getParent() == null) {
                    s.f3364f = i;
                    return s;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C3309b.m14262b();
            }
        }

        /* renamed from: e */
        public abstract int mo3963e();

        /* renamed from: f */
        public long mo3964f(int i) {
            return -1;
        }

        /* renamed from: g */
        public int mo3965g(int i) {
            return 0;
        }

        /* renamed from: h */
        public final boolean mo4358h() {
            return this.f3379f.mo4375a();
        }

        /* renamed from: i */
        public final boolean mo4359i() {
            return this.f3380g;
        }

        /* renamed from: j */
        public final void mo4360j() {
            this.f3379f.mo4376b();
        }

        /* renamed from: k */
        public final void mo4361k(int i, Object obj) {
            this.f3379f.mo4378d(i, 1, obj);
        }

        /* renamed from: l */
        public final void mo4362l(int i, int i2) {
            this.f3379f.mo4377c(i, i2);
        }

        /* renamed from: m */
        public final void mo4363m(int i, int i2, Object obj) {
            this.f3379f.mo4378d(i, i2, obj);
        }

        /* renamed from: n */
        public final void mo4364n(int i, int i2) {
            this.f3379f.mo4379e(i, i2);
        }

        /* renamed from: o */
        public final void mo4365o(int i, int i2) {
            this.f3379f.mo4380f(i, i2);
        }

        /* renamed from: p */
        public void mo4366p(RecyclerView recyclerView) {
        }

        /* renamed from: q */
        public abstract void mo3966q(VH vh, int i);

        /* renamed from: r */
        public void mo4367r(VH vh, int i, List<Object> list) {
            mo3966q(vh, i);
        }

        /* renamed from: s */
        public abstract VH mo3967s(ViewGroup viewGroup, int i);

        /* renamed from: t */
        public void mo4368t(RecyclerView recyclerView) {
        }

        /* renamed from: u */
        public boolean mo4369u(VH vh) {
            return false;
        }

        /* renamed from: v */
        public void mo4370v(VH vh) {
        }

        /* renamed from: w */
        public void mo4371w(VH vh) {
        }

        /* renamed from: x */
        public void mo4372x(VH vh) {
        }

        /* renamed from: y */
        public void mo4373y(C0834i iVar) {
            this.f3379f.registerObserver(iVar);
        }

        /* renamed from: z */
        public void mo4374z(boolean z) {
            if (!mo4358h()) {
                this.f3380g = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    static class C0833h extends Observable<C0834i> {
        C0833h() {
        }

        /* renamed from: a */
        public boolean mo4375a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo4376b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0834i) this.mObservers.get(size)).mo4381a();
            }
        }

        /* renamed from: c */
        public void mo4377c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0834i) this.mObservers.get(size)).mo4385e(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void mo4378d(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0834i) this.mObservers.get(size)).mo4383c(i, i2, obj);
            }
        }

        /* renamed from: e */
        public void mo4379e(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0834i) this.mObservers.get(size)).mo4384d(i, i2);
            }
        }

        /* renamed from: f */
        public void mo4380f(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0834i) this.mObservers.get(size)).mo4386f(i, i2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C0834i {
        /* renamed from: a */
        public void mo4381a() {
        }

        /* renamed from: b */
        public void mo4382b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo4383c(int i, int i2, Object obj) {
            mo4382b(i, i2);
        }

        /* renamed from: d */
        public void mo4384d(int i, int i2) {
        }

        /* renamed from: e */
        public void mo4385e(int i, int i2, int i3) {
        }

        /* renamed from: f */
        public void mo4386f(int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C0835j {
        /* renamed from: a */
        int mo4387a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C0836k {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo4388a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C0837l {

        /* renamed from: a */
        private C0839b f3381a = null;

        /* renamed from: b */
        private ArrayList<C0838a> f3382b = new ArrayList<>();

        /* renamed from: c */
        private long f3383c = 120;

        /* renamed from: d */
        private long f3384d = 120;

        /* renamed from: e */
        private long f3385e = 250;

        /* renamed from: f */
        private long f3386f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface C0838a {
            /* renamed from: a */
            void mo4410a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        interface C0839b {
            /* renamed from: a */
            void mo4411a(C0829d0 d0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class C0840c {

            /* renamed from: a */
            public int f3387a;

            /* renamed from: b */
            public int f3388b;

            /* renamed from: a */
            public C0840c mo4412a(C0829d0 d0Var) {
                mo4413b(d0Var, 0);
                return this;
            }

            /* renamed from: b */
            public C0840c mo4413b(C0829d0 d0Var, int i) {
                View view = d0Var.f3359a;
                this.f3387a = view.getLeft();
                this.f3388b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m4442e(C0829d0 d0Var) {
            int i = d0Var.f3368j & 14;
            if (d0Var.mo4327t()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int n = d0Var.mo4321n();
            int j = d0Var.mo4317j();
            return (n == -1 || j == -1 || n == j) ? i : i | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo4389a(C0829d0 d0Var, C0840c cVar, C0840c cVar2);

        /* renamed from: b */
        public abstract boolean mo4390b(C0829d0 d0Var, C0829d0 d0Var2, C0840c cVar, C0840c cVar2);

        /* renamed from: c */
        public abstract boolean mo4391c(C0829d0 d0Var, C0840c cVar, C0840c cVar2);

        /* renamed from: d */
        public abstract boolean mo4392d(C0829d0 d0Var, C0840c cVar, C0840c cVar2);

        /* renamed from: f */
        public abstract boolean mo4393f(C0829d0 d0Var);

        /* renamed from: g */
        public boolean mo4394g(C0829d0 d0Var, List<Object> list) {
            return mo4393f(d0Var);
        }

        /* renamed from: h */
        public final void mo4395h(C0829d0 d0Var) {
            mo4405r(d0Var);
            C0839b bVar = this.f3381a;
            if (bVar != null) {
                bVar.mo4411a(d0Var);
            }
        }

        /* renamed from: i */
        public final void mo4396i() {
            int size = this.f3382b.size();
            for (int i = 0; i < size; i++) {
                this.f3382b.get(i).mo4410a();
            }
            this.f3382b.clear();
        }

        /* renamed from: j */
        public abstract void mo4397j(C0829d0 d0Var);

        /* renamed from: k */
        public abstract void mo4398k();

        /* renamed from: l */
        public long mo4399l() {
            return this.f3383c;
        }

        /* renamed from: m */
        public long mo4400m() {
            return this.f3386f;
        }

        /* renamed from: n */
        public long mo4401n() {
            return this.f3385e;
        }

        /* renamed from: o */
        public long mo4402o() {
            return this.f3384d;
        }

        /* renamed from: p */
        public abstract boolean mo4403p();

        /* renamed from: q */
        public C0840c mo4404q() {
            return new C0840c();
        }

        /* renamed from: r */
        public void mo4405r(C0829d0 d0Var) {
        }

        /* renamed from: s */
        public C0840c mo4406s(C0823a0 a0Var, C0829d0 d0Var) {
            C0840c q = mo4404q();
            q.mo4412a(d0Var);
            return q;
        }

        /* renamed from: t */
        public C0840c mo4407t(C0823a0 a0Var, C0829d0 d0Var, int i, List<Object> list) {
            C0840c q = mo4404q();
            q.mo4412a(d0Var);
            return q;
        }

        /* renamed from: u */
        public abstract void mo4408u();

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4409v(C0839b bVar) {
            this.f3381a = bVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    private class C0841m implements C0837l.C0839b {
        C0841m() {
        }

        /* renamed from: a */
        public void mo4411a(C0829d0 d0Var) {
            d0Var.mo4303G(true);
            if (d0Var.f3366h != null && d0Var.f3367i == null) {
                d0Var.f3366h = null;
            }
            d0Var.f3367i = null;
            if (!d0Var.mo4305I() && !RecyclerView.this.mo4136W0(d0Var.f3359a) && d0Var.mo4332x()) {
                RecyclerView.this.removeDetachedView(d0Var.f3359a, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C0842n {
        @Deprecated
        /* renamed from: d */
        public void mo4414d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void mo3951e(Rect rect, View view, RecyclerView recyclerView, C0823a0 a0Var) {
            mo4414d(rect, ((C0848p) view.getLayoutParams()).mo4517a(), recyclerView);
        }

        @Deprecated
        /* renamed from: f */
        public void mo4415f(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo4416g(Canvas canvas, RecyclerView recyclerView, C0823a0 a0Var) {
            mo4415f(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void mo4417h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo3952i(Canvas canvas, RecyclerView recyclerView, C0823a0 a0Var) {
            mo4417h(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C0843o {

        /* renamed from: a */
        C0877d f3390a;

        /* renamed from: b */
        RecyclerView f3391b;

        /* renamed from: c */
        private final C0923s.C0925b f3392c = new C0844a();

        /* renamed from: d */
        private final C0923s.C0925b f3393d = new C0845b();

        /* renamed from: e */
        C0923s f3394e = new C0923s(this.f3392c);

        /* renamed from: f */
        C0923s f3395f = new C0923s(this.f3393d);

        /* renamed from: g */
        C0860z f3396g;

        /* renamed from: h */
        boolean f3397h = false;

        /* renamed from: i */
        boolean f3398i = false;

        /* renamed from: j */
        boolean f3399j = false;

        /* renamed from: k */
        private boolean f3400k = true;

        /* renamed from: l */
        private boolean f3401l = true;

        /* renamed from: m */
        int f3402m;

        /* renamed from: n */
        boolean f3403n;

        /* renamed from: o */
        private int f3404o;

        /* renamed from: p */
        private int f3405p;

        /* renamed from: q */
        private int f3406q;

        /* renamed from: r */
        private int f3407r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        class C0844a implements C0923s.C0925b {
            C0844a() {
            }

            /* renamed from: a */
            public View mo4511a(int i) {
                return C0843o.this.mo4436I(i);
            }

            /* renamed from: b */
            public int mo4512b() {
                return C0843o.this.mo4491o0() - C0843o.this.mo4472f0();
            }

            /* renamed from: c */
            public int mo4513c(View view) {
                return C0843o.this.mo4447Q(view) - ((C0848p) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: d */
            public int mo4514d() {
                return C0843o.this.mo4470e0();
            }

            /* renamed from: e */
            public int mo4515e(View view) {
                return C0843o.this.mo4451T(view) + ((C0848p) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        class C0845b implements C0923s.C0925b {
            C0845b() {
            }

            /* renamed from: a */
            public View mo4511a(int i) {
                return C0843o.this.mo4436I(i);
            }

            /* renamed from: b */
            public int mo4512b() {
                return C0843o.this.mo4455W() - C0843o.this.mo4468d0();
            }

            /* renamed from: c */
            public int mo4513c(View view) {
                return C0843o.this.mo4452U(view) - ((C0848p) view.getLayoutParams()).topMargin;
            }

            /* renamed from: d */
            public int mo4514d() {
                return C0843o.this.mo4474g0();
            }

            /* renamed from: e */
            public int mo4515e(View view) {
                return C0843o.this.mo4444O(view) + ((C0848p) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface C0846c {
            /* renamed from: a */
            void mo4516a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C0847d {

            /* renamed from: a */
            public int f3410a;

            /* renamed from: b */
            public int f3411b;

            /* renamed from: c */
            public boolean f3412c;

            /* renamed from: d */
            public boolean f3413d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m4475K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0843o.m4475K(int, int, int, int, boolean):int");
        }

        /* renamed from: L */
        private int[] m4476L(View view, Rect rect) {
            int[] iArr = new int[2];
            int e0 = mo4470e0();
            int g0 = mo4474g0();
            int o0 = mo4491o0() - mo4472f0();
            int W = mo4455W() - mo4468d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - e0;
            int min = Math.min(0, i);
            int i2 = top - g0;
            int min2 = Math.min(0, i2);
            int i3 = width - o0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - W);
            if (mo4458Z() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: f */
        private void m4477f(View view, int i, boolean z) {
            C0829d0 g0 = RecyclerView.m4223g0(view);
            if (z || g0.mo4330v()) {
                this.f3391b.f3299k.mo4859b(g0);
            } else {
                this.f3391b.f3299k.mo4872p(g0);
            }
            C0848p pVar = (C0848p) view.getLayoutParams();
            if (g0.mo4308L() || g0.mo4331w()) {
                if (g0.mo4331w()) {
                    g0.mo4307K();
                } else {
                    g0.mo4313e();
                }
                this.f3390a.mo4711c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3391b) {
                int m = this.f3390a.mo4719m(view);
                if (i == -1) {
                    i = this.f3390a.mo4715g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3391b.indexOfChild(view) + this.f3391b.mo4129P());
                } else if (m != i) {
                    this.f3391b.f3313r.mo4422B0(m, i);
                }
            } else {
                this.f3390a.mo4709a(view, i, false);
                pVar.f3416c = true;
                C0860z zVar = this.f3396g;
                if (zVar != null && zVar.mo4591h()) {
                    this.f3396g.mo4594k(view);
                }
            }
            if (pVar.f3417d) {
                g0.f3359a.invalidate();
                pVar.f3417d = false;
            }
        }

        /* renamed from: i0 */
        public static C0847d m4478i0(Context context, AttributeSet attributeSet, int i, int i2) {
            C0847d dVar = new C0847d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3484c.RecyclerView, i, i2);
            dVar.f3410a = obtainStyledAttributes.getInt(C3484c.RecyclerView_android_orientation, 1);
            dVar.f3411b = obtainStyledAttributes.getInt(C3484c.RecyclerView_spanCount, 1);
            dVar.f3412c = obtainStyledAttributes.getBoolean(C3484c.RecyclerView_reverseLayout, false);
            dVar.f3413d = obtainStyledAttributes.getBoolean(C3484c.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: n */
        public static int m4479n(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: t0 */
        private boolean m4480t0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e0 = mo4470e0();
            int g0 = mo4474g0();
            int o0 = mo4491o0() - mo4472f0();
            int W = mo4455W() - mo4468d0();
            Rect rect = this.f3391b.f3305n;
            mo4446P(focusedChild, rect);
            return rect.left - i < o0 && rect.right - i > e0 && rect.top - i2 < W && rect.bottom - i2 > g0;
        }

        /* renamed from: v1 */
        private void m4481v1(C0855v vVar, int i, View view) {
            C0829d0 g0 = RecyclerView.m4223g0(view);
            if (!g0.mo4306J()) {
                if (!g0.mo4327t() || g0.mo4330v() || this.f3391b.f3311q.mo4359i()) {
                    mo4505x(i);
                    vVar.mo4543D(view);
                    this.f3391b.f3299k.mo4868k(g0);
                    return;
                }
                mo4496q1(i);
                vVar.mo4542C(g0);
            }
        }

        /* renamed from: w0 */
        private static boolean m4482w0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: y */
        private void m4483y(int i, View view) {
            this.f3390a.mo4712d(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4418A(RecyclerView recyclerView, C0855v vVar) {
            this.f3398i = false;
            mo4055I0(recyclerView, vVar);
        }

        /* renamed from: A0 */
        public void mo4419A0(View view, int i, int i2) {
            C0848p pVar = (C0848p) view.getLayoutParams();
            Rect k0 = this.f3391b.mo4200k0(view);
            int i3 = i + k0.left + k0.right;
            int i4 = i2 + k0.top + k0.bottom;
            int K = m4475K(mo4491o0(), mo4493p0(), mo4470e0() + mo4472f0() + pVar.leftMargin + pVar.rightMargin + i3, pVar.width, mo4073k());
            int K2 = m4475K(mo4455W(), mo4456X(), mo4474g0() + mo4468d0() + pVar.topMargin + pVar.bottomMargin + i4, pVar.height, mo4074l());
            if (mo4430F1(view, K, K2, pVar)) {
                view.measure(K, K2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A1 */
        public void mo4420A1(int i, int i2) {
            this.f3406q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f3404o = mode;
            if (mode == 0 && !RecyclerView.f3251F0) {
                this.f3406q = 0;
            }
            this.f3407r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3405p = mode2;
            if (mode2 == 0 && !RecyclerView.f3251F0) {
                this.f3407r = 0;
            }
        }

        /* renamed from: B */
        public View mo4421B(View view) {
            View R;
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView == null || (R = recyclerView.mo4132R(view)) == null || this.f3390a.mo4720n(R)) {
                return null;
            }
            return R;
        }

        /* renamed from: B0 */
        public void mo4422B0(int i, int i2) {
            View I = mo4436I(i);
            if (I != null) {
                mo4505x(i);
                mo4476h(I, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f3391b.toString());
        }

        /* renamed from: B1 */
        public void mo4423B1(int i, int i2) {
            this.f3391b.setMeasuredDimension(i, i2);
        }

        /* renamed from: C */
        public View mo4051C(int i) {
            int J = mo4437J();
            for (int i2 = 0; i2 < J; i2++) {
                View I = mo4436I(i2);
                C0829d0 g0 = RecyclerView.m4223g0(I);
                if (g0 != null && g0.mo4320m() == i && !g0.mo4306J() && (this.f3391b.f3304m0.mo4281e() || !g0.mo4330v())) {
                    return I;
                }
            }
            return null;
        }

        /* renamed from: C0 */
        public void mo4424C0(int i) {
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView != null) {
                recyclerView.mo4106A0(i);
            }
        }

        /* renamed from: C1 */
        public void mo4010C1(Rect rect, int i, int i2) {
            mo4423B1(m4479n(i, rect.width() + mo4470e0() + mo4472f0(), mo4466c0()), m4479n(i2, rect.height() + mo4474g0() + mo4468d0(), mo4463b0()));
        }

        /* renamed from: D */
        public abstract C0848p mo4011D();

        /* renamed from: D0 */
        public void mo4425D0(int i) {
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView != null) {
                recyclerView.mo4108B0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D1 */
        public void mo4426D1(int i, int i2) {
            int J = mo4437J();
            if (J == 0) {
                this.f3391b.mo4269w(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < J; i7++) {
                View I = mo4436I(i7);
                Rect rect = this.f3391b.f3305n;
                mo4446P(I, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f3391b.f3305n.set(i5, i6, i3, i4);
            mo4010C1(this.f3391b.f3305n, i, i2);
        }

        /* renamed from: E */
        public C0848p mo4012E(Context context, AttributeSet attributeSet) {
            return new C0848p(context, attributeSet);
        }

        /* renamed from: E0 */
        public void mo4427E0(C0832g gVar, C0832g gVar2) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E1 */
        public void mo4428E1(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f3391b = null;
                this.f3390a = null;
                i = 0;
                this.f3406q = 0;
            } else {
                this.f3391b = recyclerView;
                this.f3390a = recyclerView.f3297j;
                this.f3406q = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.f3407r = i;
            this.f3404o = 1073741824;
            this.f3405p = 1073741824;
        }

        /* renamed from: F */
        public C0848p mo4014F(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0848p ? new C0848p((C0848p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0848p((ViewGroup.MarginLayoutParams) layoutParams) : new C0848p(layoutParams);
        }

        /* renamed from: F0 */
        public boolean mo4429F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F1 */
        public boolean mo4430F1(View view, int i, int i2, C0848p pVar) {
            return view.isLayoutRequested() || !this.f3400k || !m4482w0(view.getWidth(), i, pVar.width) || !m4482w0(view.getHeight(), i2, pVar.height);
        }

        /* renamed from: G */
        public int mo4431G() {
            return -1;
        }

        /* renamed from: G0 */
        public void mo4432G0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G1 */
        public boolean mo4054G1() {
            return false;
        }

        /* renamed from: H */
        public int mo4433H(View view) {
            return ((C0848p) view.getLayoutParams()).f3415b.bottom;
        }

        @Deprecated
        /* renamed from: H0 */
        public void mo4434H0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H1 */
        public boolean mo4435H1(View view, int i, int i2, C0848p pVar) {
            return !this.f3400k || !m4482w0(view.getMeasuredWidth(), i, pVar.width) || !m4482w0(view.getMeasuredHeight(), i2, pVar.height);
        }

        /* renamed from: I */
        public View mo4436I(int i) {
            C0877d dVar = this.f3390a;
            if (dVar != null) {
                return dVar.mo4714f(i);
            }
            return null;
        }

        /* renamed from: I0 */
        public void mo4055I0(RecyclerView recyclerView, C0855v vVar) {
            mo4434H0(recyclerView);
        }

        /* renamed from: I1 */
        public void mo4056I1(RecyclerView recyclerView, C0823a0 a0Var, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: J */
        public int mo4437J() {
            C0877d dVar = this.f3390a;
            if (dVar != null) {
                return dVar.mo4715g();
            }
            return 0;
        }

        /* renamed from: J0 */
        public View mo4015J0(View view, int i, C0855v vVar, C0823a0 a0Var) {
            return null;
        }

        /* renamed from: J1 */
        public void mo4438J1(C0860z zVar) {
            C0860z zVar2 = this.f3396g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.mo4591h())) {
                this.f3396g.mo4601r();
            }
            this.f3396g = zVar;
            zVar.mo4600q(this.f3391b, this);
        }

        /* renamed from: K0 */
        public void mo4057K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3391b;
            mo4440L0(recyclerView.f3291g, recyclerView.f3304m0, accessibilityEvent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K1 */
        public void mo4439K1() {
            C0860z zVar = this.f3396g;
            if (zVar != null) {
                zVar.mo4601r();
            }
        }

        /* renamed from: L0 */
        public void mo4440L0(C0855v vVar, C0823a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f3391b.canScrollVertically(-1) && !this.f3391b.canScrollHorizontally(-1) && !this.f3391b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C0832g gVar = this.f3391b.f3311q;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.mo3963e());
                }
            }
        }

        /* renamed from: L1 */
        public boolean mo4016L1() {
            return false;
        }

        /* renamed from: M */
        public boolean mo4441M() {
            RecyclerView recyclerView = this.f3391b;
            return recyclerView != null && recyclerView.f3301l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M0 */
        public void mo4442M0(C3369c cVar) {
            RecyclerView recyclerView = this.f3391b;
            mo4443N0(recyclerView.f3291g, recyclerView.f3304m0, cVar);
        }

        /* renamed from: N */
        public int mo4017N(C0855v vVar, C0823a0 a0Var) {
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView == null || recyclerView.f3311q == null || !mo4073k()) {
                return 1;
            }
            return this.f3391b.f3311q.mo3963e();
        }

        /* renamed from: N0 */
        public void mo4443N0(C0855v vVar, C0823a0 a0Var, C3369c cVar) {
            if (this.f3391b.canScrollVertically(-1) || this.f3391b.canScrollHorizontally(-1)) {
                cVar.mo11618a(8192);
                cVar.mo11657v0(true);
            }
            if (this.f3391b.canScrollVertically(1) || this.f3391b.canScrollHorizontally(1)) {
                cVar.mo11618a(4096);
                cVar.mo11657v0(true);
            }
            cVar.mo11625d0(C3369c.C3371b.m14526b(mo4031k0(vVar, a0Var), mo4017N(vVar, a0Var), mo4503v0(vVar, a0Var), mo4485l0(vVar, a0Var)));
        }

        /* renamed from: O */
        public int mo4444O(View view) {
            return view.getBottom() + mo4433H(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O0 */
        public void mo4445O0(View view, C3369c cVar) {
            C0829d0 g0 = RecyclerView.m4223g0(view);
            if (g0 != null && !g0.mo4330v() && !this.f3390a.mo4720n(g0.f3359a)) {
                RecyclerView recyclerView = this.f3391b;
                mo4019P0(recyclerView.f3291g, recyclerView.f3304m0, view, cVar);
            }
        }

        /* renamed from: P */
        public void mo4446P(View view, Rect rect) {
            RecyclerView.m4224h0(view, rect);
        }

        /* renamed from: P0 */
        public void mo4019P0(C0855v vVar, C0823a0 a0Var, View view, C3369c cVar) {
            cVar.mo11626e0(C3369c.C3372c.m14527f(mo4074l() ? mo4477h0(view) : 0, 1, mo4073k() ? mo4477h0(view) : 0, 1, false, false));
        }

        /* renamed from: Q */
        public int mo4447Q(View view) {
            return view.getLeft() - mo4460a0(view);
        }

        /* renamed from: Q0 */
        public View mo4448Q0(View view, int i) {
            return null;
        }

        /* renamed from: R */
        public int mo4449R(View view) {
            Rect rect = ((C0848p) view.getLayoutParams()).f3415b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: R0 */
        public void mo4020R0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: S */
        public int mo4450S(View view) {
            Rect rect = ((C0848p) view.getLayoutParams()).f3415b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: S0 */
        public void mo4021S0(RecyclerView recyclerView) {
        }

        /* renamed from: T */
        public int mo4451T(View view) {
            return view.getRight() + mo4482j0(view);
        }

        /* renamed from: T0 */
        public void mo4022T0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: U */
        public int mo4452U(View view) {
            return view.getTop() - mo4487m0(view);
        }

        /* renamed from: U0 */
        public void mo4023U0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: V */
        public View mo4453V() {
            View focusedChild;
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3390a.mo4720n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: V0 */
        public void mo4454V0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: W */
        public int mo4455W() {
            return this.f3407r;
        }

        /* renamed from: W0 */
        public void mo4024W0(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo4454V0(recyclerView, i, i2);
        }

        /* renamed from: X */
        public int mo4456X() {
            return this.f3405p;
        }

        /* renamed from: X0 */
        public void mo4026X0(C0855v vVar, C0823a0 a0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: Y */
        public int mo4457Y() {
            RecyclerView recyclerView = this.f3391b;
            C0832g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo3963e();
            }
            return 0;
        }

        /* renamed from: Y0 */
        public void mo4028Y0(C0823a0 a0Var) {
        }

        /* renamed from: Z */
        public int mo4458Z() {
            return C3403t.m14674y(this.f3391b);
        }

        /* renamed from: Z0 */
        public void mo4459Z0(C0855v vVar, C0823a0 a0Var, int i, int i2) {
            this.f3391b.mo4269w(i, i2);
        }

        /* renamed from: a0 */
        public int mo4460a0(View view) {
            return ((C0848p) view.getLayoutParams()).f3415b.left;
        }

        @Deprecated
        /* renamed from: a1 */
        public boolean mo4461a1(RecyclerView recyclerView, View view, View view2) {
            return mo4506x0() || recyclerView.mo4267v0();
        }

        /* renamed from: b */
        public void mo4462b(View view) {
            mo4465c(view, -1);
        }

        /* renamed from: b0 */
        public int mo4463b0() {
            return C3403t.m14676z(this.f3391b);
        }

        /* renamed from: b1 */
        public boolean mo4464b1(RecyclerView recyclerView, C0823a0 a0Var, View view, View view2) {
            return mo4461a1(recyclerView, view, view2);
        }

        /* renamed from: c */
        public void mo4465c(View view, int i) {
            m4477f(view, i, true);
        }

        /* renamed from: c0 */
        public int mo4466c0() {
            return C3403t.m14599A(this.f3391b);
        }

        /* renamed from: c1 */
        public void mo4067c1(Parcelable parcelable) {
        }

        /* renamed from: d */
        public void mo4467d(View view) {
            mo4469e(view, -1);
        }

        /* renamed from: d0 */
        public int mo4468d0() {
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: d1 */
        public Parcelable mo4069d1() {
            return null;
        }

        /* renamed from: e */
        public void mo4469e(View view, int i) {
            m4477f(view, i, false);
        }

        /* renamed from: e0 */
        public int mo4470e0() {
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: e1 */
        public void mo4471e1(int i) {
        }

        /* renamed from: f0 */
        public int mo4472f0() {
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f1 */
        public void mo4473f1(C0860z zVar) {
            if (this.f3396g == zVar) {
                this.f3396g = null;
            }
        }

        /* renamed from: g */
        public void mo4072g(String str) {
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView != null) {
                recyclerView.mo4208o(str);
            }
        }

        /* renamed from: g0 */
        public int mo4474g0() {
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g1 */
        public boolean mo4475g1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3391b;
            return mo4478h1(recyclerView.f3291g, recyclerView.f3304m0, i, bundle);
        }

        /* renamed from: h */
        public void mo4476h(View view, int i) {
            mo4479i(view, i, (C0848p) view.getLayoutParams());
        }

        /* renamed from: h0 */
        public int mo4477h0(View view) {
            return ((C0848p) view.getLayoutParams()).mo4517a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: h1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4478h1(androidx.recyclerview.widget.RecyclerView.C0855v r8, androidx.recyclerview.widget.RecyclerView.C0823a0 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f3391b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo4455W()
                int r11 = r7.mo4474g0()
                int r8 = r8 - r11
                int r11 = r7.mo4468d0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f3391b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo4491o0()
                int r11 = r7.mo4470e0()
                int r10 = r10 - r11
                int r11 = r7.mo4472f0()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo4455W()
                int r10 = r7.mo4474g0()
                int r8 = r8 - r10
                int r10 = r7.mo4468d0()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f3391b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo4491o0()
                int r11 = r7.mo4470e0()
                int r10 = r10 - r11
                int r11 = r7.mo4472f0()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f3391b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.mo4224p1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0843o.mo4478h1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        /* renamed from: i */
        public void mo4479i(View view, int i, C0848p pVar) {
            C0829d0 g0 = RecyclerView.m4223g0(view);
            if (g0.mo4330v()) {
                this.f3391b.f3299k.mo4859b(g0);
            } else {
                this.f3391b.f3299k.mo4872p(g0);
            }
            this.f3390a.mo4711c(view, i, pVar, g0.mo4330v());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i1 */
        public boolean mo4480i1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3391b;
            return mo4483j1(recyclerView.f3291g, recyclerView.f3304m0, view, i, bundle);
        }

        /* renamed from: j */
        public void mo4481j(View view, Rect rect) {
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo4200k0(view));
            }
        }

        /* renamed from: j0 */
        public int mo4482j0(View view) {
            return ((C0848p) view.getLayoutParams()).f3415b.right;
        }

        /* renamed from: j1 */
        public boolean mo4483j1(C0855v vVar, C0823a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: k */
        public boolean mo4073k() {
            return false;
        }

        /* renamed from: k0 */
        public int mo4031k0(C0855v vVar, C0823a0 a0Var) {
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView == null || recyclerView.f3311q == null || !mo4074l()) {
                return 1;
            }
            return this.f3391b.f3311q.mo3963e();
        }

        /* renamed from: k1 */
        public void mo4484k1(C0855v vVar) {
            for (int J = mo4437J() - 1; J >= 0; J--) {
                if (!RecyclerView.m4223g0(mo4436I(J)).mo4306J()) {
                    mo4490n1(J, vVar);
                }
            }
        }

        /* renamed from: l */
        public boolean mo4074l() {
            return false;
        }

        /* renamed from: l0 */
        public int mo4485l0(C0855v vVar, C0823a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l1 */
        public void mo4486l1(C0855v vVar) {
            int j = vVar.mo4560j();
            for (int i = j - 1; i >= 0; i--) {
                View n = vVar.mo4564n(i);
                C0829d0 g0 = RecyclerView.m4223g0(n);
                if (!g0.mo4306J()) {
                    g0.mo4303G(false);
                    if (g0.mo4332x()) {
                        this.f3391b.removeDetachedView(n, false);
                    }
                    C0837l lVar = this.f3391b.f3278R;
                    if (lVar != null) {
                        lVar.mo4397j(g0);
                    }
                    g0.mo4303G(true);
                    vVar.mo4573y(n);
                }
            }
            vVar.mo4555e();
            if (j > 0) {
                this.f3391b.invalidate();
            }
        }

        /* renamed from: m */
        public boolean mo4032m(C0848p pVar) {
            return pVar != null;
        }

        /* renamed from: m0 */
        public int mo4487m0(View view) {
            return ((C0848p) view.getLayoutParams()).f3415b.top;
        }

        /* renamed from: m1 */
        public void mo4488m1(View view, C0855v vVar) {
            mo4494p1(view);
            vVar.mo4541B(view);
        }

        /* renamed from: n0 */
        public void mo4489n0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0848p) view.getLayoutParams()).f3415b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f3391b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f3391b.f3309p;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: n1 */
        public void mo4490n1(int i, C0855v vVar) {
            View I = mo4436I(i);
            mo4496q1(i);
            vVar.mo4541B(I);
        }

        /* renamed from: o */
        public void mo4075o(int i, int i2, C0823a0 a0Var, C0846c cVar) {
        }

        /* renamed from: o0 */
        public int mo4491o0() {
            return this.f3406q;
        }

        /* renamed from: o1 */
        public boolean mo4492o1(Runnable runnable) {
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: p */
        public void mo4077p(int i, C0846c cVar) {
        }

        /* renamed from: p0 */
        public int mo4493p0() {
            return this.f3404o;
        }

        /* renamed from: p1 */
        public void mo4494p1(View view) {
            this.f3390a.mo4722p(view);
        }

        /* renamed from: q */
        public int mo4079q(C0823a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q0 */
        public boolean mo4495q0() {
            int J = mo4437J();
            for (int i = 0; i < J; i++) {
                ViewGroup.LayoutParams layoutParams = mo4436I(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: q1 */
        public void mo4496q1(int i) {
            if (mo4436I(i) != null) {
                this.f3390a.mo4723q(i);
            }
        }

        /* renamed from: r */
        public int mo4033r(C0823a0 a0Var) {
            return 0;
        }

        /* renamed from: r0 */
        public boolean mo4497r0() {
            return this.f3398i;
        }

        /* renamed from: r1 */
        public boolean mo4498r1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo4499s1(recyclerView, view, rect, z, false);
        }

        /* renamed from: s */
        public int mo4034s(C0823a0 a0Var) {
            return 0;
        }

        /* renamed from: s0 */
        public boolean mo4082s0() {
            return this.f3399j;
        }

        /* renamed from: s1 */
        public boolean mo4499s1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] L = m4476L(view, rect);
            int i = L[0];
            int i2 = L[1];
            if ((z2 && !m4480t0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo4205m1(i, i2);
            }
            return true;
        }

        /* renamed from: t */
        public int mo4083t(C0823a0 a0Var) {
            return 0;
        }

        /* renamed from: t1 */
        public void mo4500t1() {
            RecyclerView recyclerView = this.f3391b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: u */
        public int mo4036u(C0823a0 a0Var) {
            return 0;
        }

        /* renamed from: u0 */
        public final boolean mo4501u0() {
            return this.f3401l;
        }

        /* renamed from: u1 */
        public void mo4502u1() {
            this.f3397h = true;
        }

        /* renamed from: v */
        public int mo4038v(C0823a0 a0Var) {
            return 0;
        }

        /* renamed from: v0 */
        public boolean mo4503v0(C0855v vVar, C0823a0 a0Var) {
            return false;
        }

        /* renamed from: w */
        public void mo4504w(C0855v vVar) {
            for (int J = mo4437J() - 1; J >= 0; J--) {
                m4481v1(vVar, J, mo4436I(J));
            }
        }

        /* renamed from: w1 */
        public int mo4039w1(int i, C0855v vVar, C0823a0 a0Var) {
            return 0;
        }

        /* renamed from: x */
        public void mo4505x(int i) {
            m4483y(i, mo4436I(i));
        }

        /* renamed from: x0 */
        public boolean mo4506x0() {
            C0860z zVar = this.f3396g;
            return zVar != null && zVar.mo4591h();
        }

        /* renamed from: x1 */
        public void mo4084x1(int i) {
        }

        /* renamed from: y0 */
        public boolean mo4507y0(View view, boolean z, boolean z2) {
            boolean z3 = this.f3394e.mo4852b(view, 24579) && this.f3395f.mo4852b(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: y1 */
        public int mo4040y1(int i, C0855v vVar, C0823a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo4508z(RecyclerView recyclerView) {
            this.f3398i = true;
            mo4432G0(recyclerView);
        }

        /* renamed from: z0 */
        public void mo4509z0(View view, int i, int i2, int i3, int i4) {
            C0848p pVar = (C0848p) view.getLayoutParams();
            Rect rect = pVar.f3415b;
            view.layout(i + rect.left + pVar.leftMargin, i2 + rect.top + pVar.topMargin, (i3 - rect.right) - pVar.rightMargin, (i4 - rect.bottom) - pVar.bottomMargin);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z1 */
        public void mo4510z1(RecyclerView recyclerView) {
            mo4420A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C0848p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C0829d0 f3414a;

        /* renamed from: b */
        final Rect f3415b = new Rect();

        /* renamed from: c */
        boolean f3416c = true;

        /* renamed from: d */
        boolean f3417d = false;

        public C0848p(int i, int i2) {
            super(i, i2);
        }

        public C0848p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0848p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0848p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0848p(C0848p pVar) {
            super(pVar);
        }

        /* renamed from: a */
        public int mo4517a() {
            return this.f3414a.mo4320m();
        }

        /* renamed from: b */
        public boolean mo4518b() {
            return this.f3414a.mo4333y();
        }

        /* renamed from: c */
        public boolean mo4519c() {
            return this.f3414a.mo4330v();
        }

        /* renamed from: d */
        public boolean mo4520d() {
            return this.f3414a.mo4327t();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C0849q {
        /* renamed from: a */
        void mo4521a(View view);

        /* renamed from: b */
        void mo4522b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C0850r {
        /* renamed from: a */
        public abstract boolean mo4523a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C0851s {
        /* renamed from: a */
        boolean mo4524a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo4525b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo4526c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C0852t {
        /* renamed from: a */
        public void mo4527a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo4528b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0853u {

        /* renamed from: a */
        SparseArray<C0854a> f3418a = new SparseArray<>();

        /* renamed from: b */
        private int f3419b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        static class C0854a {

            /* renamed from: a */
            final ArrayList<C0829d0> f3420a = new ArrayList<>();

            /* renamed from: b */
            int f3421b = 5;

            /* renamed from: c */
            long f3422c = 0;

            /* renamed from: d */
            long f3423d = 0;

            C0854a() {
            }
        }

        /* renamed from: g */
        private C0854a m4639g(int i) {
            C0854a aVar = this.f3418a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0854a aVar2 = new C0854a();
            this.f3418a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4529a() {
            this.f3419b++;
        }

        /* renamed from: b */
        public void mo4530b() {
            for (int i = 0; i < this.f3418a.size(); i++) {
                this.f3418a.valueAt(i).f3420a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4531c() {
            this.f3419b--;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4532d(int i, long j) {
            C0854a g = m4639g(i);
            g.f3423d = mo4537j(g.f3423d, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4533e(int i, long j) {
            C0854a g = m4639g(i);
            g.f3422c = mo4537j(g.f3422c, j);
        }

        /* renamed from: f */
        public C0829d0 mo4534f(int i) {
            C0854a aVar = this.f3418a.get(i);
            if (aVar == null || aVar.f3420a.isEmpty()) {
                return null;
            }
            ArrayList<C0829d0> arrayList = aVar.f3420a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).mo4325r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4535h(C0832g gVar, C0832g gVar2, boolean z) {
            if (gVar != null) {
                mo4531c();
            }
            if (!z && this.f3419b == 0) {
                mo4530b();
            }
            if (gVar2 != null) {
                mo4529a();
            }
        }

        /* renamed from: i */
        public void mo4536i(C0829d0 d0Var) {
            int l = d0Var.mo4319l();
            ArrayList<C0829d0> arrayList = m4639g(l).f3420a;
            if (this.f3418a.get(l).f3421b > arrayList.size()) {
                d0Var.mo4300D();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public long mo4537j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo4538k(int i, long j, long j2) {
            long j3 = m4639g(i).f3423d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo4539l(int i, long j, long j2) {
            long j3 = m4639g(i).f3422c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C0855v {

        /* renamed from: a */
        final ArrayList<C0829d0> f3424a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C0829d0> f3425b = null;

        /* renamed from: c */
        final ArrayList<C0829d0> f3426c = new ArrayList<>();

        /* renamed from: d */
        private final List<C0829d0> f3427d = Collections.unmodifiableList(this.f3424a);

        /* renamed from: e */
        private int f3428e = 2;

        /* renamed from: f */
        int f3429f = 2;

        /* renamed from: g */
        C0853u f3430g;

        /* renamed from: h */
        private C0825b0 f3431h;

        public C0855v() {
        }

        /* renamed from: H */
        private boolean m4651H(C0829d0 d0Var, int i, int i2, long j) {
            d0Var.f3376r = RecyclerView.this;
            int l = d0Var.mo4319l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f3430g.mo4538k(l, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f3311q.mo4356c(d0Var, i);
            this.f3430g.mo4532d(d0Var.mo4319l(), RecyclerView.this.getNanoTime() - nanoTime);
            m4652b(d0Var);
            if (!RecyclerView.this.f3304m0.mo4281e()) {
                return true;
            }
            d0Var.f3365g = i2;
            return true;
        }

        /* renamed from: b */
        private void m4652b(C0829d0 d0Var) {
            if (RecyclerView.this.mo4265u0()) {
                View view = d0Var.f3359a;
                if (C3403t.m14670w(view) == 0) {
                    C3403t.m14663s0(view, 1);
                }
                C0916o oVar = RecyclerView.this.f3318t0;
                if (oVar != null) {
                    C3350a n = oVar.mo4004n();
                    if (n instanceof C0916o.C0917a) {
                        ((C0916o.C0917a) n).mo4829o(view);
                    }
                    C3403t.m14643i0(view, n);
                }
            }
        }

        /* renamed from: q */
        private void m4653q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m4653q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m4654r(C0829d0 d0Var) {
            View view = d0Var.f3359a;
            if (view instanceof ViewGroup) {
                m4653q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4540A(int i) {
            mo4552a(this.f3426c.get(i), true);
            this.f3426c.remove(i);
        }

        /* renamed from: B */
        public void mo4541B(View view) {
            C0829d0 g0 = RecyclerView.m4223g0(view);
            if (g0.mo4332x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (g0.mo4331w()) {
                g0.mo4307K();
            } else if (g0.mo4308L()) {
                g0.mo4313e();
            }
            mo4542C(g0);
            if (RecyclerView.this.f3278R != null && !g0.mo4329u()) {
                RecyclerView.this.f3278R.mo4397j(g0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo4542C(C0829d0 d0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (d0Var.mo4331w() || d0Var.f3359a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.mo4331w());
                sb.append(" isAttached:");
                if (d0Var.f3359a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.mo4129P());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.mo4332x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.mo4129P());
            } else if (!d0Var.mo4306J()) {
                boolean h = d0Var.mo4315h();
                C0832g gVar = RecyclerView.this.f3311q;
                if ((gVar != null && h && gVar.mo4369u(d0Var)) || d0Var.mo4329u()) {
                    if (this.f3429f <= 0 || d0Var.mo4323p(526)) {
                        z = false;
                    } else {
                        int size = this.f3426c.size();
                        if (size >= this.f3429f && size > 0) {
                            mo4540A(0);
                            size--;
                        }
                        if (RecyclerView.f3253H0 && size > 0 && !RecyclerView.this.f3302l0.mo4786d(d0Var.f3361c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f3302l0.mo4786d(this.f3426c.get(i).f3361c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f3426c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        mo4552a(d0Var, true);
                        z2 = z;
                        RecyclerView.this.f3299k.mo4873q(d0Var);
                        if (!z2 && !z3 && h) {
                            d0Var.f3376r = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.f3299k.mo4873q(d0Var);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.mo4129P());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo4543D(View view) {
            ArrayList<C0829d0> arrayList;
            C0829d0 g0 = RecyclerView.m4223g0(view);
            if (!g0.mo4323p(12) && g0.mo4333y() && !RecyclerView.this.mo4223p(g0)) {
                if (this.f3425b == null) {
                    this.f3425b = new ArrayList<>();
                }
                g0.mo4304H(this, true);
                arrayList = this.f3425b;
            } else if (!g0.mo4327t() || g0.mo4330v() || RecyclerView.this.f3311q.mo4359i()) {
                g0.mo4304H(this, false);
                arrayList = this.f3424a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.mo4129P());
            }
            arrayList.add(g0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo4544E(C0853u uVar) {
            C0853u uVar2 = this.f3430g;
            if (uVar2 != null) {
                uVar2.mo4531c();
            }
            this.f3430g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f3430g.mo4529a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo4545F(C0825b0 b0Var) {
            this.f3431h = b0Var;
        }

        /* renamed from: G */
        public void mo4546G(int i) {
            this.f3428e = i;
            mo4549K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01cb  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01ce  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01fe  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x020c  */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C0829d0 mo4547I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x0228
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f3304m0
                int r1 = r1.mo4278b()
                if (r3 >= r1) goto L_0x0228
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f3304m0
                boolean r1 = r1.mo4281e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo4558h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo4563m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo4550L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.mo4310b(r5)
                boolean r5 = r1.mo4331w()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f3359a
                r5.removeDetachedView(r9, r8)
                r1.mo4307K()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.mo4308L()
                if (r5 == 0) goto L_0x0057
                r1.mo4313e()
            L_0x0057:
                r6.mo4542C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f3295i
                int r5 = r5.mo4688m(r3)
                if (r5 < 0) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f3311q
                int r9 = r9.mo3963e()
                if (r5 >= r9) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f3311q
                int r9 = r9.mo3965g(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.f3311q
                boolean r10 = r10.mo4359i()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.f3311q
                long r10 = r1.mo3964f(r5)
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r6.mo4562l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f3361c = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r6.f3431h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.mo4286a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r1.mo4167f0(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.mo4306J()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4129P()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4129P()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0102
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.mo4559i()
                androidx.recyclerview.widget.RecyclerView$d0 r0 = r0.mo4534f(r9)
                if (r0 == 0) goto L_0x0101
                r0.mo4300D()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f3250E0
                if (r1 == 0) goto L_0x0101
                r6.m4654r(r0)
            L_0x0101:
                r1 = r0
            L_0x0102:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x0120
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f3430g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo4539l(r11, r12, r14)
                if (r5 != 0) goto L_0x0120
                return r2
            L_0x0120:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.f3311q
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r5.mo4357d(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f3253H0
                if (r5 == 0) goto L_0x013b
                android.view.View r5 = r2.f3359a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.m4212V(r5)
                if (r5 == 0) goto L_0x013b
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f3360b = r10
            L_0x013b:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f3430g
                long r10 = r10 - r0
                r5.mo4533e(r9, r10)
                r9 = r2
                goto L_0x0182
            L_0x0149:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.f3304m0
                int r2 = r2.mo4278b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4129P()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0181:
                r9 = r1
            L_0x0182:
                r10 = r4
                if (r10 == 0) goto L_0x01bb
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f3304m0
                boolean r0 = r0.mo4281e()
                if (r0 != 0) goto L_0x01bb
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.mo4323p(r0)
                if (r1 == 0) goto L_0x01bb
                r9.mo4302F(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f3304m0
                boolean r0 = r0.f3342k
                if (r0 == 0) goto L_0x01bb
                int r0 = androidx.recyclerview.widget.RecyclerView.C0837l.m4442e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.f3278R
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f3304m0
                java.util.List r4 = r9.mo4322o()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.mo4407t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo4134S0(r9, r0)
            L_0x01bb:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f3304m0
                boolean r0 = r0.mo4281e()
                if (r0 == 0) goto L_0x01ce
                boolean r0 = r9.mo4326s()
                if (r0 == 0) goto L_0x01ce
                r9.f3365g = r3
                goto L_0x01e1
            L_0x01ce:
                boolean r0 = r9.mo4326s()
                if (r0 == 0) goto L_0x01e3
                boolean r0 = r9.mo4334z()
                if (r0 != 0) goto L_0x01e3
                boolean r0 = r9.mo4327t()
                if (r0 == 0) goto L_0x01e1
                goto L_0x01e3
            L_0x01e1:
                r0 = 0
                goto L_0x01f6
            L_0x01e3:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f3295i
                int r2 = r0.mo4688m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.m4651H(r1, r2, r3, r4)
            L_0x01f6:
                android.view.View r1 = r9.f3359a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020c
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x0204:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C0848p) r1
                android.view.View r2 = r9.f3359a
                r2.setLayoutParams(r1)
                goto L_0x021d
            L_0x020c:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x021b
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                goto L_0x0204
            L_0x021b:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C0848p) r1
            L_0x021d:
                r1.f3414a = r9
                if (r10 == 0) goto L_0x0224
                if (r0 == 0) goto L_0x0224
                goto L_0x0225
            L_0x0224:
                r7 = 0
            L_0x0225:
                r1.f3417d = r7
                return r9
            L_0x0228:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.f3304m0
                int r2 = r2.mo4278b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4129P()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                goto L_0x0261
            L_0x0260:
                throw r0
            L_0x0261:
                goto L_0x0260
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0855v.mo4547I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public void mo4548J(C0829d0 d0Var) {
            (d0Var.f3373o ? this.f3425b : this.f3424a).remove(d0Var);
            d0Var.f3372n = null;
            d0Var.f3373o = false;
            d0Var.mo4313e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo4549K() {
            C0843o oVar = RecyclerView.this.f3313r;
            this.f3429f = this.f3428e + (oVar != null ? oVar.f3402m : 0);
            for (int size = this.f3426c.size() - 1; size >= 0 && this.f3426c.size() > this.f3429f; size--) {
                mo4540A(size);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo4550L(C0829d0 d0Var) {
            if (d0Var.mo4330v()) {
                return RecyclerView.this.f3304m0.mo4281e();
            }
            int i = d0Var.f3361c;
            if (i < 0 || i >= RecyclerView.this.f3311q.mo3963e()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.mo4129P());
            } else if (RecyclerView.this.f3304m0.mo4281e() || RecyclerView.this.f3311q.mo3965g(d0Var.f3361c) == d0Var.mo4319l()) {
                return !RecyclerView.this.f3311q.mo4359i() || d0Var.mo4318k() == RecyclerView.this.f3311q.mo3964f(d0Var.f3361c);
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public void mo4551M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f3426c.size() - 1; size >= 0; size--) {
                C0829d0 d0Var = this.f3426c.get(size);
                if (d0Var != null && (i3 = d0Var.f3361c) >= i && i3 < i4) {
                    d0Var.mo4310b(2);
                    mo4540A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4552a(C0829d0 d0Var, boolean z) {
            RecyclerView.m4234r(d0Var);
            View view = d0Var.f3359a;
            C0916o oVar = RecyclerView.this.f3318t0;
            if (oVar != null) {
                C3350a n = oVar.mo4004n();
                C3403t.m14643i0(view, n instanceof C0916o.C0917a ? ((C0916o.C0917a) n).mo4828n(view) : null);
            }
            if (z) {
                mo4557g(d0Var);
            }
            d0Var.f3376r = null;
            mo4559i().mo4536i(d0Var);
        }

        /* renamed from: c */
        public void mo4553c() {
            this.f3424a.clear();
            mo4574z();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4554d() {
            int size = this.f3426c.size();
            for (int i = 0; i < size; i++) {
                this.f3426c.get(i).mo4311c();
            }
            int size2 = this.f3424a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f3424a.get(i2).mo4311c();
            }
            ArrayList<C0829d0> arrayList = this.f3425b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f3425b.get(i3).mo4311c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4555e() {
            this.f3424a.clear();
            ArrayList<C0829d0> arrayList = this.f3425b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int mo4556f(int i) {
            if (i >= 0 && i < RecyclerView.this.f3304m0.mo4278b()) {
                return !RecyclerView.this.f3304m0.mo4281e() ? i : RecyclerView.this.f3295i.mo4688m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f3304m0.mo4278b() + RecyclerView.this.mo4129P());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4557g(C0829d0 d0Var) {
            C0856w wVar = RecyclerView.this.f3315s;
            if (wVar != null) {
                wVar.mo4575a(d0Var);
            }
            C0832g gVar = RecyclerView.this.f3311q;
            if (gVar != null) {
                gVar.mo4372x(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3304m0 != null) {
                recyclerView.f3299k.mo4873q(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0829d0 mo4558h(int i) {
            int size;
            int m;
            ArrayList<C0829d0> arrayList = this.f3425b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C0829d0 d0Var = this.f3425b.get(i3);
                    if (d0Var.mo4308L() || d0Var.mo4320m() != i) {
                        i3++;
                    } else {
                        d0Var.mo4310b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.f3311q.mo4359i() && (m = RecyclerView.this.f3295i.mo4688m(i)) > 0 && m < RecyclerView.this.f3311q.mo3963e()) {
                    long f = RecyclerView.this.f3311q.mo3964f(m);
                    while (i2 < size) {
                        C0829d0 d0Var2 = this.f3425b.get(i2);
                        if (d0Var2.mo4308L() || d0Var2.mo4318k() != f) {
                            i2++;
                        } else {
                            d0Var2.mo4310b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C0853u mo4559i() {
            if (this.f3430g == null) {
                this.f3430g = new C0853u();
            }
            return this.f3430g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo4560j() {
            return this.f3424a.size();
        }

        /* renamed from: k */
        public List<C0829d0> mo4561k() {
            return this.f3427d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C0829d0 mo4562l(long j, int i, boolean z) {
            for (int size = this.f3424a.size() - 1; size >= 0; size--) {
                C0829d0 d0Var = this.f3424a.get(size);
                if (d0Var.mo4318k() == j && !d0Var.mo4308L()) {
                    if (i == d0Var.mo4319l()) {
                        d0Var.mo4310b(32);
                        if (d0Var.mo4330v() && !RecyclerView.this.f3304m0.mo4281e()) {
                            d0Var.mo4302F(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f3424a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f3359a, false);
                        mo4573y(d0Var.f3359a);
                    }
                }
            }
            int size2 = this.f3426c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C0829d0 d0Var2 = this.f3426c.get(size2);
                if (d0Var2.mo4318k() == j && !d0Var2.mo4325r()) {
                    if (i == d0Var2.mo4319l()) {
                        if (!z) {
                            this.f3426c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        mo4540A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C0829d0 mo4563m(int i, boolean z) {
            View e;
            int size = this.f3424a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0829d0 d0Var = this.f3424a.get(i3);
                if (d0Var.mo4308L() || d0Var.mo4320m() != i || d0Var.mo4327t() || (!RecyclerView.this.f3304m0.f3339h && d0Var.mo4330v())) {
                    i3++;
                } else {
                    d0Var.mo4310b(32);
                    return d0Var;
                }
            }
            if (z || (e = RecyclerView.this.f3297j.mo4713e(i)) == null) {
                int size2 = this.f3426c.size();
                while (i2 < size2) {
                    C0829d0 d0Var2 = this.f3426c.get(i2);
                    if (d0Var2.mo4327t() || d0Var2.mo4320m() != i || d0Var2.mo4325r()) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f3426c.remove(i2);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            C0829d0 g0 = RecyclerView.m4223g0(e);
            RecyclerView.this.f3297j.mo4725s(e);
            int m = RecyclerView.this.f3297j.mo4719m(e);
            if (m != -1) {
                RecyclerView.this.f3297j.mo4712d(m);
                mo4543D(e);
                g0.mo4310b(8224);
                return g0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + g0 + RecyclerView.this.mo4129P());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public View mo4564n(int i) {
            return this.f3424a.get(i).f3359a;
        }

        /* renamed from: o */
        public View mo4565o(int i) {
            return mo4566p(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public View mo4566p(int i, boolean z) {
            return mo4547I(i, z, Long.MAX_VALUE).f3359a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo4567s() {
            int size = this.f3426c.size();
            for (int i = 0; i < size; i++) {
                C0848p pVar = (C0848p) this.f3426c.get(i).f3359a.getLayoutParams();
                if (pVar != null) {
                    pVar.f3416c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo4568t() {
            int size = this.f3426c.size();
            for (int i = 0; i < size; i++) {
                C0829d0 d0Var = this.f3426c.get(i);
                if (d0Var != null) {
                    d0Var.mo4310b(6);
                    d0Var.mo4309a((Object) null);
                }
            }
            C0832g gVar = RecyclerView.this.f3311q;
            if (gVar == null || !gVar.mo4359i()) {
                mo4574z();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo4569u(int i, int i2) {
            int size = this.f3426c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0829d0 d0Var = this.f3426c.get(i3);
                if (d0Var != null && d0Var.f3361c >= i) {
                    d0Var.mo4297A(i2, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4570v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f3426c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0829d0 d0Var = this.f3426c.get(i7);
                if (d0Var != null && (i6 = d0Var.f3361c) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        d0Var.mo4297A(i2 - i, false);
                    } else {
                        d0Var.mo4297A(i5, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo4571w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f3426c.size() - 1; size >= 0; size--) {
                C0829d0 d0Var = this.f3426c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f3361c;
                    if (i4 >= i3) {
                        d0Var.mo4297A(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.mo4310b(8);
                        mo4540A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo4572x(C0832g gVar, C0832g gVar2, boolean z) {
            mo4553c();
            mo4559i().mo4535h(gVar, gVar2, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo4573y(View view) {
            C0829d0 g0 = RecyclerView.m4223g0(view);
            g0.f3372n = null;
            g0.f3373o = false;
            g0.mo4313e();
            mo4542C(g0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo4574z() {
            for (int size = this.f3426c.size() - 1; size >= 0; size--) {
                mo4540A(size);
            }
            this.f3426c.clear();
            if (RecyclerView.f3253H0) {
                RecyclerView.this.f3302l0.mo4784b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface C0856w {
        /* renamed from: a */
        void mo4575a(C0829d0 d0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    private class C0857x extends C0834i {
        C0857x() {
        }

        /* renamed from: a */
        public void mo4381a() {
            RecyclerView.this.mo4208o((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3304m0.f3338g = true;
            recyclerView.mo4131Q0(true);
            if (!RecyclerView.this.f3295i.mo4691p()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: c */
        public void mo4383c(int i, int i2, Object obj) {
            RecyclerView.this.mo4208o((String) null);
            if (RecyclerView.this.f3295i.mo4693r(i, i2, obj)) {
                mo4576g();
            }
        }

        /* renamed from: d */
        public void mo4384d(int i, int i2) {
            RecyclerView.this.mo4208o((String) null);
            if (RecyclerView.this.f3295i.mo4694s(i, i2)) {
                mo4576g();
            }
        }

        /* renamed from: e */
        public void mo4385e(int i, int i2, int i3) {
            RecyclerView.this.mo4208o((String) null);
            if (RecyclerView.this.f3295i.mo4695t(i, i2, i3)) {
                mo4576g();
            }
        }

        /* renamed from: f */
        public void mo4386f(int i, int i2) {
            RecyclerView.this.mo4208o((String) null);
            if (RecyclerView.this.f3295i.mo4696u(i, i2)) {
                mo4576g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4576g() {
            if (RecyclerView.f3252G0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f3325x && recyclerView.f3323w) {
                    C3403t.m14627a0(recyclerView, recyclerView.f3303m);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f3266F = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C0858y extends C3430a {
        public static final Parcelable.Creator<C0858y> CREATOR = new C0859a();

        /* renamed from: h */
        Parcelable f3434h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        static class C0859a implements Parcelable.ClassLoaderCreator<C0858y> {
            C0859a() {
            }

            /* renamed from: a */
            public C0858y createFromParcel(Parcel parcel) {
                return new C0858y(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0858y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0858y(parcel, classLoader);
            }

            /* renamed from: c */
            public C0858y[] newArray(int i) {
                return new C0858y[i];
            }
        }

        C0858y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3434h = parcel.readParcelable(classLoader == null ? C0843o.class.getClassLoader() : classLoader);
        }

        C0858y(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4577b(C0858y yVar) {
            this.f3434h = yVar.f3434h;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3434h, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C0860z {

        /* renamed from: a */
        private int f3435a = -1;

        /* renamed from: b */
        private RecyclerView f3436b;

        /* renamed from: c */
        private C0843o f3437c;

        /* renamed from: d */
        private boolean f3438d;

        /* renamed from: e */
        private boolean f3439e;

        /* renamed from: f */
        private View f3440f;

        /* renamed from: g */
        private final C0861a f3441g = new C0861a(0, 0);

        /* renamed from: h */
        private boolean f3442h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public static class C0861a {

            /* renamed from: a */
            private int f3443a;

            /* renamed from: b */
            private int f3444b;

            /* renamed from: c */
            private int f3445c;

            /* renamed from: d */
            private int f3446d;

            /* renamed from: e */
            private Interpolator f3447e;

            /* renamed from: f */
            private boolean f3448f;

            /* renamed from: g */
            private int f3449g;

            public C0861a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }

            public C0861a(int i, int i2, int i3, Interpolator interpolator) {
                this.f3446d = -1;
                this.f3448f = false;
                this.f3449g = 0;
                this.f3443a = i;
                this.f3444b = i2;
                this.f3445c = i3;
                this.f3447e = interpolator;
            }

            /* renamed from: e */
            private void m4719e() {
                if (this.f3447e != null && this.f3445c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f3445c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo4602a() {
                return this.f3446d >= 0;
            }

            /* renamed from: b */
            public void mo4603b(int i) {
                this.f3446d = i;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo4604c(RecyclerView recyclerView) {
                int i = this.f3446d;
                if (i >= 0) {
                    this.f3446d = -1;
                    recyclerView.mo4270x0(i);
                    this.f3448f = false;
                } else if (this.f3448f) {
                    m4719e();
                    recyclerView.f3298j0.mo4290f(this.f3443a, this.f3444b, this.f3445c, this.f3447e);
                    int i2 = this.f3449g + 1;
                    this.f3449g = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3448f = false;
                } else {
                    this.f3449g = 0;
                }
            }

            /* renamed from: d */
            public void mo4605d(int i, int i2, int i3, Interpolator interpolator) {
                this.f3443a = i;
                this.f3444b = i2;
                this.f3445c = i3;
                this.f3447e = interpolator;
                this.f3448f = true;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        public interface C0862b {
            /* renamed from: a */
            PointF mo4066a(int i);
        }

        /* renamed from: a */
        public PointF mo4584a(int i) {
            C0843o e = mo4588e();
            if (e instanceof C0862b) {
                return ((C0862b) e).mo4066a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C0862b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View mo4585b(int i) {
            return this.f3436b.f3313r.mo4051C(i);
        }

        /* renamed from: c */
        public int mo4586c() {
            return this.f3436b.f3313r.mo4437J();
        }

        /* renamed from: d */
        public int mo4587d(View view) {
            return this.f3436b.mo4166e0(view);
        }

        /* renamed from: e */
        public C0843o mo4588e() {
            return this.f3437c;
        }

        /* renamed from: f */
        public int mo4589f() {
            return this.f3435a;
        }

        /* renamed from: g */
        public boolean mo4590g() {
            return this.f3438d;
        }

        /* renamed from: h */
        public boolean mo4591h() {
            return this.f3439e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo4592i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4593j(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f3436b;
            if (this.f3435a == -1 || recyclerView == null) {
                mo4601r();
            }
            if (!(!this.f3438d || this.f3440f != null || this.f3437c == null || (a = mo4584a(this.f3435a)) == null || (a.x == 0.0f && a.y == 0.0f))) {
                recyclerView.mo4192h1((int) Math.signum(a.x), (int) Math.signum(a.y), (int[]) null);
            }
            this.f3438d = false;
            View view = this.f3440f;
            if (view != null) {
                if (mo4587d(view) == this.f3435a) {
                    mo4598o(this.f3440f, recyclerView.f3304m0, this.f3441g);
                    this.f3441g.mo4604c(recyclerView);
                    mo4601r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3440f = null;
                }
            }
            if (this.f3439e) {
                mo4595l(i, i2, recyclerView.f3304m0, this.f3441g);
                boolean a2 = this.f3441g.mo4602a();
                this.f3441g.mo4604c(recyclerView);
                if (a2 && this.f3439e) {
                    this.f3438d = true;
                    recyclerView.f3298j0.mo4289e();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo4594k(View view) {
            if (mo4587d(view) == mo4589f()) {
                this.f3440f = view;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public abstract void mo4595l(int i, int i2, C0823a0 a0Var, C0861a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract void mo4596m();

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract void mo4597n();

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public abstract void mo4598o(View view, C0823a0 a0Var, C0861a aVar);

        /* renamed from: p */
        public void mo4599p(int i) {
            this.f3435a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo4600q(RecyclerView recyclerView, C0843o oVar) {
            recyclerView.f3298j0.mo4291g();
            if (this.f3442h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3436b = recyclerView;
            this.f3437c = oVar;
            int i = this.f3435a;
            if (i != -1) {
                recyclerView.f3304m0.f3332a = i;
                this.f3439e = true;
                this.f3438d = true;
                this.f3440f = mo4585b(mo4589f());
                mo4596m();
                this.f3436b.f3298j0.mo4289e();
                this.f3442h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public final void mo4601r() {
            if (this.f3439e) {
                this.f3439e = false;
                mo4597n();
                this.f3436b.f3304m0.f3332a = -1;
                this.f3440f = null;
                this.f3435a = -1;
                this.f3438d = false;
                this.f3437c.mo4473f1(this);
                this.f3437c = null;
                this.f3436b = null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            f3249D0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 == r2) goto L_0x001c
            r2 = 19
            if (r1 == r2) goto L_0x001c
            r2 = 20
            if (r1 != r2) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = 0
            goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            f3250E0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x0027
            r1 = 1
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            f3251F0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x0032
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            f3252G0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x003d
            r1 = 1
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            f3253H0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 15
            if (r1 > r2) goto L_0x0048
            r1 = 1
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            f3254I0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 > r2) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            f3255J0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            f3256K0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            f3257L0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3482a.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3289f = new C0857x();
        this.f3291g = new C0855v();
        this.f3299k = new C0926t();
        this.f3303m = new C0822a();
        this.f3305n = new Rect();
        this.f3307o = new Rect();
        this.f3309p = new RectF();
        this.f3317t = new ArrayList<>();
        this.f3319u = new ArrayList<>();
        this.f3258A = 0;
        this.f3269I = false;
        this.f3270J = false;
        this.f3271K = 0;
        this.f3272L = 0;
        this.f3273M = new C0836k();
        this.f3278R = new C0880e();
        this.f3279S = 0;
        this.f3280T = -1;
        this.f3292g0 = Float.MIN_VALUE;
        this.f3294h0 = Float.MIN_VALUE;
        boolean z = true;
        this.f3296i0 = true;
        this.f3298j0 = new C0827c0();
        this.f3302l0 = f3253H0 ? new C0903h.C0905b() : null;
        this.f3304m0 = new C0823a0();
        this.f3310p0 = false;
        this.f3312q0 = false;
        this.f3314r0 = new C0841m();
        this.f3316s0 = false;
        this.f3322v0 = new int[2];
        this.f3326x0 = new int[2];
        this.f3328y0 = new int[2];
        this.f3330z0 = new int[2];
        this.f3259A0 = new ArrayList();
        this.f3261B0 = new C0824b();
        this.f3263C0 = new C0828d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3286c0 = viewConfiguration.getScaledTouchSlop();
        this.f3292g0 = C3415u.m14718b(viewConfiguration, context);
        this.f3294h0 = C3415u.m14720d(viewConfiguration, context);
        this.f3288e0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3290f0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3278R.mo4409v(this.f3314r0);
        mo4209o0();
        m4233q0();
        m4231p0();
        if (C3403t.m14670w(this) == 0) {
            C3403t.m14663s0(this, 1);
        }
        this.f3267G = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0916o(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3484c.RecyclerView, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C3484c.RecyclerView, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(C3484c.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(C3484c.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f3301l = obtainStyledAttributes.getBoolean(C3484c.RecyclerView_android_clipToPadding, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C3484c.RecyclerView_fastScrollEnabled, false);
        this.f3327y = z2;
        if (z2) {
            mo4226r0((StateListDrawable) obtainStyledAttributes.getDrawable(C3484c.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(C3484c.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(C3484c.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(C3484c.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        m4235v(context, string, attributeSet, i, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f3249D0, i, 0);
            if (Build.VERSION.SDK_INT >= 29) {
                saveAttributeDataForStyleable(context, f3249D0, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: A */
    private void m4199A() {
        int i = this.f3265E;
        this.f3265E = 0;
        if (i != 0 && mo4265u0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C3368b.m14438b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: C */
    private void m4200C() {
        boolean z = true;
        this.f3304m0.mo4277a(1);
        mo4130Q(this.f3304m0);
        this.f3304m0.f3341j = false;
        mo4227r1();
        this.f3299k.mo4863f();
        mo4117H0();
        m4206P0();
        m4220e1();
        C0823a0 a0Var = this.f3304m0;
        if (!a0Var.f3342k || !this.f3312q0) {
            z = false;
        }
        a0Var.f3340i = z;
        this.f3312q0 = false;
        this.f3310p0 = false;
        C0823a0 a0Var2 = this.f3304m0;
        a0Var2.f3339h = a0Var2.f3343l;
        a0Var2.f3337f = this.f3311q.mo3963e();
        m4210U(this.f3322v0);
        if (this.f3304m0.f3342k) {
            int g = this.f3297j.mo4715g();
            for (int i = 0; i < g; i++) {
                C0829d0 g0 = m4223g0(this.f3297j.mo4714f(i));
                if (!g0.mo4306J() && (!g0.mo4327t() || this.f3311q.mo4359i())) {
                    this.f3299k.mo4862e(g0, this.f3278R.mo4407t(this.f3304m0, g0, C0837l.m4442e(g0), g0.mo4322o()));
                    if (this.f3304m0.f3340i && g0.mo4333y() && !g0.mo4330v() && !g0.mo4306J() && !g0.mo4327t()) {
                        this.f3299k.mo4860c(mo4148c0(g0), g0);
                    }
                }
            }
        }
        if (this.f3304m0.f3343l) {
            mo4168f1();
            C0823a0 a0Var3 = this.f3304m0;
            boolean z2 = a0Var3.f3338g;
            a0Var3.f3338g = false;
            this.f3313r.mo4026X0(this.f3291g, a0Var3);
            this.f3304m0.f3338g = z2;
            for (int i2 = 0; i2 < this.f3297j.mo4715g(); i2++) {
                C0829d0 g02 = m4223g0(this.f3297j.mo4714f(i2));
                if (!g02.mo4306J() && !this.f3299k.mo4866i(g02)) {
                    int e = C0837l.m4442e(g02);
                    boolean p = g02.mo4323p(8192);
                    if (!p) {
                        e |= 4096;
                    }
                    C0837l.C0840c t = this.f3278R.mo4407t(this.f3304m0, g02, e, g02.mo4322o());
                    if (p) {
                        mo4134S0(g02, t);
                    } else {
                        this.f3299k.mo4858a(g02, t);
                    }
                }
            }
        }
        mo4233s();
        mo4119I0();
        mo4263t1(false);
        this.f3304m0.f3336e = 2;
    }

    /* renamed from: D */
    private void m4201D() {
        mo4227r1();
        mo4117H0();
        this.f3304m0.mo4277a(6);
        this.f3295i.mo4686j();
        this.f3304m0.f3337f = this.f3311q.mo3963e();
        C0823a0 a0Var = this.f3304m0;
        a0Var.f3335d = 0;
        a0Var.f3339h = false;
        this.f3313r.mo4026X0(this.f3291g, a0Var);
        C0823a0 a0Var2 = this.f3304m0;
        a0Var2.f3338g = false;
        this.f3293h = null;
        a0Var2.f3342k = a0Var2.f3342k && this.f3278R != null;
        this.f3304m0.f3336e = 4;
        mo4119I0();
        mo4263t1(false);
    }

    /* renamed from: E */
    private void m4202E() {
        this.f3304m0.mo4277a(4);
        mo4227r1();
        mo4117H0();
        C0823a0 a0Var = this.f3304m0;
        a0Var.f3336e = 1;
        if (a0Var.f3342k) {
            for (int g = this.f3297j.mo4715g() - 1; g >= 0; g--) {
                C0829d0 g0 = m4223g0(this.f3297j.mo4714f(g));
                if (!g0.mo4306J()) {
                    long c0 = mo4148c0(g0);
                    C0837l.C0840c s = this.f3278R.mo4406s(this.f3304m0, g0);
                    C0829d0 g2 = this.f3299k.mo4864g(c0);
                    if (g2 != null && !g2.mo4306J()) {
                        boolean h = this.f3299k.mo4865h(g2);
                        boolean h2 = this.f3299k.mo4865h(g0);
                        if (!h || g2 != g0) {
                            C0837l.C0840c n = this.f3299k.mo4870n(g2);
                            this.f3299k.mo4861d(g0, s);
                            C0837l.C0840c m = this.f3299k.mo4869m(g0);
                            if (n == null) {
                                m4228l0(c0, g0, g2);
                            } else {
                                m4229m(g2, g0, n, m, h, h2);
                            }
                        }
                    }
                    this.f3299k.mo4861d(g0, s);
                }
            }
            this.f3299k.mo4871o(this.f3263C0);
        }
        this.f3313r.mo4486l1(this.f3291g);
        C0823a0 a0Var2 = this.f3304m0;
        a0Var2.f3334c = a0Var2.f3337f;
        this.f3269I = false;
        this.f3270J = false;
        a0Var2.f3342k = false;
        a0Var2.f3343l = false;
        this.f3313r.f3397h = false;
        ArrayList<C0829d0> arrayList = this.f3291g.f3425b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C0843o oVar = this.f3313r;
        if (oVar.f3403n) {
            oVar.f3402m = 0;
            oVar.f3403n = false;
            this.f3291g.mo4549K();
        }
        this.f3313r.mo4028Y0(this.f3304m0);
        mo4119I0();
        mo4263t1(false);
        this.f3299k.mo4863f();
        int[] iArr = this.f3322v0;
        if (m4238x(iArr[0], iArr[1])) {
            mo4118I(0, 0);
        }
        m4209T0();
        m4216c1();
    }

    /* renamed from: K */
    private boolean m4203K(MotionEvent motionEvent) {
        C0851s sVar = this.f3321v;
        if (sVar != null) {
            sVar.mo4525b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f3321v = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return m4208T(motionEvent);
        }
    }

    /* renamed from: K0 */
    private void m4204K0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3280T) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3280T = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f3284a0 = x;
            this.f3282V = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f3285b0 = y;
            this.f3283W = y;
        }
    }

    /* renamed from: O0 */
    private boolean m4205O0() {
        return this.f3278R != null && this.f3313r.mo4016L1();
    }

    /* renamed from: P0 */
    private void m4206P0() {
        if (this.f3269I) {
            this.f3295i.mo4699y();
            if (this.f3270J) {
                this.f3313r.mo4021S0(this);
            }
        }
        if (m4205O0()) {
            this.f3295i.mo4697w();
        } else {
            this.f3295i.mo4686j();
        }
        boolean z = false;
        boolean z2 = this.f3310p0 || this.f3312q0;
        this.f3304m0.f3342k = this.f3329z && this.f3278R != null && (this.f3269I || z2 || this.f3313r.f3397h) && (!this.f3269I || this.f3311q.mo4359i());
        C0823a0 a0Var = this.f3304m0;
        if (a0Var.f3342k && z2 && !this.f3269I && m4205O0()) {
            z = true;
        }
        a0Var.f3343l = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4207R0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.mo4124M()
            android.widget.EdgeEffect r3 = r6.f3274N
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L_0x001c:
            androidx.core.widget.C0603d.m2875a(r3, r4, r9)
            r9 = 1
            goto L_0x0039
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
            r6.mo4126N()
            android.widget.EdgeEffect r3 = r6.f3276P
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            r6.mo4128O()
            android.widget.EdgeEffect r9 = r6.f3275O
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0603d.m2875a(r9, r0, r7)
            goto L_0x006f
        L_0x0053:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x006e
            r6.mo4122L()
            android.widget.EdgeEffect r9 = r6.f3277Q
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0603d.m2875a(r9, r3, r0)
            goto L_0x006f
        L_0x006e:
            r1 = r9
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            p086f.p111h.p122m.C3403t.m14625Z(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4207R0(float, float, float, float):void");
    }

    /* renamed from: T */
    private boolean m4208T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f3319u.size();
        int i = 0;
        while (i < size) {
            C0851s sVar = this.f3319u.get(i);
            if (!sVar.mo4524a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f3321v = sVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: T0 */
    private void m4209T0() {
        View findViewById;
        if (this.f3296i0 && this.f3311q != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f3255J0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f3297j.mo4720n(focusedChild)) {
                            return;
                        }
                    } else if (this.f3297j.mo4715g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                C0829d0 Y = (this.f3304m0.f3345n == -1 || !this.f3311q.mo4359i()) ? null : mo4139Y(this.f3304m0.f3345n);
                if (Y != null && !this.f3297j.mo4720n(Y.f3359a) && Y.f3359a.hasFocusable()) {
                    view = Y.f3359a;
                } else if (this.f3297j.mo4715g() > 0) {
                    view = m4213W();
                }
                if (view != null) {
                    int i = this.f3304m0.f3346o;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: U */
    private void m4210U(int[] iArr) {
        int g = this.f3297j.mo4715g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < g; i3++) {
            C0829d0 g0 = m4223g0(this.f3297j.mo4714f(i3));
            if (!g0.mo4306J()) {
                int m = g0.mo4320m();
                if (m < i) {
                    i = m;
                }
                if (m > i2) {
                    i2 = m;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: U0 */
    private void m4211U0() {
        boolean z;
        EdgeEffect edgeEffect = this.f3274N;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f3274N.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f3275O;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f3275O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3276P;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f3276P.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3277Q;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f3277Q.isFinished();
        }
        if (z) {
            C3403t.m14625Z(this);
        }
    }

    /* renamed from: V */
    static RecyclerView m4212V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView V = m4212V(viewGroup.getChildAt(i));
            if (V != null) {
                return V;
            }
        }
        return null;
    }

    /* renamed from: W */
    private View m4213W() {
        C0829d0 X;
        int i = this.f3304m0.f3344m;
        if (i == -1) {
            i = 0;
        }
        int b = this.f3304m0.mo4278b();
        int i2 = i;
        while (i2 < b) {
            C0829d0 X2 = mo4137X(i2);
            if (X2 == null) {
                break;
            } else if (X2.f3359a.hasFocusable()) {
                return X2.f3359a;
            } else {
                i2++;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0 || (X = mo4137X(min)) == null) {
                return null;
            }
            if (X.f3359a.hasFocusable()) {
                return X.f3359a;
            }
        }
    }

    /* renamed from: b1 */
    private void m4214b1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3305n.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0848p) {
            C0848p pVar = (C0848p) layoutParams;
            if (!pVar.f3416c) {
                Rect rect = pVar.f3415b;
                Rect rect2 = this.f3305n;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3305n);
            offsetRectIntoDescendantCoords(view, this.f3305n);
        }
        this.f3313r.mo4499s1(this, view, this.f3305n, !this.f3329z, view2 == null);
    }

    /* renamed from: c1 */
    private void m4216c1() {
        C0823a0 a0Var = this.f3304m0;
        a0Var.f3345n = -1;
        a0Var.f3344m = -1;
        a0Var.f3346o = -1;
    }

    /* renamed from: d1 */
    private void m4218d1() {
        VelocityTracker velocityTracker = this.f3281U;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo4266u1(0);
        m4211U0();
    }

    /* renamed from: e1 */
    private void m4220e1() {
        C0829d0 d0Var = null;
        View focusedChild = (!this.f3296i0 || !hasFocus() || this.f3311q == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = mo4133S(focusedChild);
        }
        if (d0Var == null) {
            m4216c1();
            return;
        }
        this.f3304m0.f3345n = this.f3311q.mo4359i() ? d0Var.mo4318k() : -1;
        this.f3304m0.f3344m = this.f3269I ? -1 : d0Var.mo4330v() ? d0Var.f3362d : d0Var.mo4317j();
        this.f3304m0.f3346o = m4225i0(d0Var.f3359a);
    }

    /* renamed from: g */
    private void m4222g(C0829d0 d0Var) {
        View view = d0Var.f3359a;
        boolean z = view.getParent() == this;
        this.f3291g.mo4548J(mo4167f0(view));
        if (d0Var.mo4332x()) {
            this.f3297j.mo4711c(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0877d dVar = this.f3297j;
        if (!z) {
            dVar.mo4710b(view, true);
        } else {
            dVar.mo4718k(view);
        }
    }

    /* renamed from: g0 */
    static C0829d0 m4223g0(View view) {
        if (view == null) {
            return null;
        }
        return ((C0848p) view.getLayoutParams()).f3414a;
    }

    private C3394k getScrollingChildHelper() {
        if (this.f3324w0 == null) {
            this.f3324w0 = new C3394k(this);
        }
        return this.f3324w0;
    }

    /* renamed from: h0 */
    static void m4224h0(View view, Rect rect) {
        C0848p pVar = (C0848p) view.getLayoutParams();
        Rect rect2 = pVar.f3415b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    /* renamed from: i0 */
    private int m4225i0(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    /* renamed from: j0 */
    private String m4226j0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: j1 */
    private void m4227j1(C0832g gVar, boolean z, boolean z2) {
        C0832g gVar2 = this.f3311q;
        if (gVar2 != null) {
            gVar2.mo4355A(this.f3289f);
            this.f3311q.mo4368t(this);
        }
        if (!z || z2) {
            mo4135V0();
        }
        this.f3295i.mo4699y();
        C0832g gVar3 = this.f3311q;
        this.f3311q = gVar;
        if (gVar != null) {
            gVar.mo4373y(this.f3289f);
            gVar.mo4366p(this);
        }
        C0843o oVar = this.f3313r;
        if (oVar != null) {
            oVar.mo4427E0(gVar3, this.f3311q);
        }
        this.f3291g.mo4572x(gVar3, this.f3311q, z);
        this.f3304m0.f3338g = true;
    }

    /* renamed from: l0 */
    private void m4228l0(long j, C0829d0 d0Var, C0829d0 d0Var2) {
        int g = this.f3297j.mo4715g();
        for (int i = 0; i < g; i++) {
            C0829d0 g0 = m4223g0(this.f3297j.mo4714f(i));
            if (g0 != d0Var && mo4148c0(g0) == j) {
                C0832g gVar = this.f3311q;
                if (gVar == null || !gVar.mo4359i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + g0 + " \n View Holder 2:" + d0Var + mo4129P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + g0 + " \n View Holder 2:" + d0Var + mo4129P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + mo4129P());
    }

    /* renamed from: m */
    private void m4229m(C0829d0 d0Var, C0829d0 d0Var2, C0837l.C0840c cVar, C0837l.C0840c cVar2, boolean z, boolean z2) {
        d0Var.mo4303G(false);
        if (z) {
            m4222g(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z2) {
                m4222g(d0Var2);
            }
            d0Var.f3366h = d0Var2;
            m4222g(d0Var);
            this.f3291g.mo4548J(d0Var);
            d0Var2.mo4303G(false);
            d0Var2.f3367i = d0Var;
        }
        if (this.f3278R.mo4390b(d0Var, d0Var2, cVar, cVar2)) {
            mo4127N0();
        }
    }

    /* renamed from: n0 */
    private boolean m4230n0() {
        int g = this.f3297j.mo4715g();
        for (int i = 0; i < g; i++) {
            C0829d0 g0 = m4223g0(this.f3297j.mo4714f(i));
            if (g0 != null && !g0.mo4306J() && g0.mo4333y()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: p0 */
    private void m4231p0() {
        if (C3403t.m14672x(this) == 0) {
            C3403t.m14665t0(this, 8);
        }
    }

    /* renamed from: q */
    private void m4232q() {
        m4218d1();
        setScrollState(0);
    }

    /* renamed from: q0 */
    private void m4233q0() {
        this.f3297j = new C0877d(new C0830e());
    }

    /* renamed from: r */
    static void m4234r(C0829d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f3360b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        d0Var.f3360b = null;
                        return;
                    } else if (view != d0Var.f3359a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: v */
    private void m4235v(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String j0 = m4226j0(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(j0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(C0843o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f3256K0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0843o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + j0, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + j0, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + j0, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + j0, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + j0, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + j0, e7);
                }
            }
        }
    }

    /* renamed from: w0 */
    private boolean m4236w0(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || mo4132R(view2) == null) {
            return false;
        }
        if (view == null || mo4132R(view) == null) {
            return true;
        }
        this.f3305n.set(0, 0, view.getWidth(), view.getHeight());
        this.f3307o.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3305n);
        offsetDescendantRectToMyCoords(view2, this.f3307o);
        char c = 65535;
        int i3 = this.f3313r.mo4458Z() == 1 ? -1 : 1;
        Rect rect = this.f3305n;
        int i4 = rect.left;
        int i5 = this.f3307o.left;
        if ((i4 < i5 || rect.right <= i5) && this.f3305n.right < this.f3307o.right) {
            i2 = 1;
        } else {
            Rect rect2 = this.f3305n;
            int i6 = rect2.right;
            int i7 = this.f3307o.right;
            i2 = ((i6 > i7 || rect2.left >= i7) && this.f3305n.left > this.f3307o.left) ? -1 : 0;
        }
        Rect rect3 = this.f3305n;
        int i8 = rect3.top;
        int i9 = this.f3307o.top;
        if ((i8 < i9 || rect3.bottom <= i9) && this.f3305n.bottom < this.f3307o.bottom) {
            c = 1;
        } else {
            Rect rect4 = this.f3305n;
            int i10 = rect4.bottom;
            int i11 = this.f3307o.bottom;
            if ((i10 <= i11 && rect4.top < i11) || this.f3305n.top <= this.f3307o.top) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 <= 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 >= 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + mo4129P());
    }

    /* renamed from: w1 */
    private void m4237w1() {
        this.f3298j0.mo4291g();
        C0843o oVar = this.f3313r;
        if (oVar != null) {
            oVar.mo4439K1();
        }
    }

    /* renamed from: x */
    private boolean m4238x(int i, int i2) {
        m4210U(this.f3322v0);
        int[] iArr = this.f3322v0;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* renamed from: A0 */
    public void mo4106A0(int i) {
        int g = this.f3297j.mo4715g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f3297j.mo4714f(i2).offsetLeftAndRight(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo4107B() {
        String str;
        if (this.f3311q == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.f3313r == null) {
            str = "No layout manager attached; skipping layout";
        } else {
            C0823a0 a0Var = this.f3304m0;
            a0Var.f3341j = false;
            if (a0Var.f3336e == 1) {
                m4200C();
            } else if (!this.f3295i.mo4692q() && this.f3313r.mo4491o0() == getWidth() && this.f3313r.mo4455W() == getHeight()) {
                this.f3313r.mo4510z1(this);
                m4202E();
                return;
            }
            this.f3313r.mo4510z1(this);
            m4201D();
            m4202E();
            return;
        }
        Log.e("RecyclerView", str);
    }

    /* renamed from: B0 */
    public void mo4108B0(int i) {
        int g = this.f3297j.mo4715g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f3297j.mo4714f(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void mo4109C0(int i, int i2) {
        int j = this.f3297j.mo4717j();
        for (int i3 = 0; i3 < j; i3++) {
            C0829d0 g0 = m4223g0(this.f3297j.mo4716i(i3));
            if (g0 != null && !g0.mo4306J() && g0.f3361c >= i) {
                g0.mo4297A(i2, false);
                this.f3304m0.f3338g = true;
            }
        }
        this.f3291g.mo4569u(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo4110D0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int j = this.f3297j.mo4717j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < j; i7++) {
            C0829d0 g0 = m4223g0(this.f3297j.mo4716i(i7));
            if (g0 != null && (i6 = g0.f3361c) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    g0.mo4297A(i2 - i, false);
                } else {
                    g0.mo4297A(i5, false);
                }
                this.f3304m0.f3338g = true;
            }
        }
        this.f3291g.mo4570v(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void mo4111E0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.f3297j.mo4717j();
        for (int i4 = 0; i4 < j; i4++) {
            C0829d0 g0 = m4223g0(this.f3297j.mo4716i(i4));
            if (g0 != null && !g0.mo4306J()) {
                int i5 = g0.f3361c;
                if (i5 >= i3) {
                    g0.mo4297A(-i2, z);
                } else if (i5 >= i) {
                    g0.mo4316i(i - 1, -i2, z);
                }
                this.f3304m0.f3338g = true;
            }
        }
        this.f3291g.mo4571w(i, i2, z);
        requestLayout();
    }

    /* renamed from: F */
    public boolean mo4112F(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo11688d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: F0 */
    public void mo4113F0(View view) {
    }

    /* renamed from: G */
    public final void mo4114G(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo11689e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: G0 */
    public void mo4115G0(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo4116H(int i) {
        C0843o oVar = this.f3313r;
        if (oVar != null) {
            oVar.mo4471e1(i);
        }
        mo4123L0(i);
        C0852t tVar = this.f3306n0;
        if (tVar != null) {
            tVar.mo4527a(this, i);
        }
        List<C0852t> list = this.f3308o0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3308o0.get(size).mo4527a(this, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public void mo4117H0() {
        this.f3271K++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo4118I(int i, int i2) {
        this.f3272L++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo4125M0(i, i2);
        C0852t tVar = this.f3306n0;
        if (tVar != null) {
            tVar.mo4528b(this, i, i2);
        }
        List<C0852t> list = this.f3308o0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3308o0.get(size).mo4528b(this, i, i2);
            }
        }
        this.f3272L--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public void mo4119I0() {
        mo4121J0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo4120J() {
        int i;
        for (int size = this.f3259A0.size() - 1; size >= 0; size--) {
            C0829d0 d0Var = this.f3259A0.get(size);
            if (d0Var.f3359a.getParent() == this && !d0Var.mo4306J() && (i = d0Var.f3375q) != -1) {
                C3403t.m14663s0(d0Var.f3359a, i);
                d0Var.f3375q = -1;
            }
        }
        this.f3259A0.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void mo4121J0(boolean z) {
        int i = this.f3271K - 1;
        this.f3271K = i;
        if (i < 1) {
            this.f3271K = 0;
            if (z) {
                m4199A();
                mo4120J();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo4122L() {
        int i;
        int i2;
        if (this.f3277Q == null) {
            EdgeEffect a = this.f3273M.mo4388a(this, 3);
            this.f3277Q = a;
            if (this.f3301l) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: L0 */
    public void mo4123L0(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo4124M() {
        int i;
        int i2;
        if (this.f3274N == null) {
            EdgeEffect a = this.f3273M.mo4388a(this, 0);
            this.f3274N = a;
            if (this.f3301l) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: M0 */
    public void mo4125M0(int i, int i2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo4126N() {
        int i;
        int i2;
        if (this.f3276P == null) {
            EdgeEffect a = this.f3273M.mo4388a(this, 2);
            this.f3276P = a;
            if (this.f3301l) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void mo4127N0() {
        if (!this.f3316s0 && this.f3323w) {
            C3403t.m14627a0(this, this.f3261B0);
            this.f3316s0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo4128O() {
        int i;
        int i2;
        if (this.f3275O == null) {
            EdgeEffect a = this.f3273M.mo4388a(this, 1);
            this.f3275O = a;
            if (this.f3301l) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public String mo4129P() {
        return " " + super.toString() + ", adapter:" + this.f3311q + ", layout:" + this.f3313r + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo4130Q(C0823a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f3298j0.f3352h;
            a0Var.f3347p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f3348q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.f3347p = 0;
        a0Var.f3348q = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo4131Q0(boolean z) {
        this.f3270J = z | this.f3270J;
        this.f3269I = true;
        mo4275z0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4132R(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo4132R(android.view.View):android.view.View");
    }

    /* renamed from: S */
    public C0829d0 mo4133S(View view) {
        View R = mo4132R(view);
        if (R == null) {
            return null;
        }
        return mo4167f0(R);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void mo4134S0(C0829d0 d0Var, C0837l.C0840c cVar) {
        d0Var.mo4302F(0, 8192);
        if (this.f3304m0.f3340i && d0Var.mo4333y() && !d0Var.mo4330v() && !d0Var.mo4306J()) {
            this.f3299k.mo4860c(mo4148c0(d0Var), d0Var);
        }
        this.f3299k.mo4862e(d0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void mo4135V0() {
        C0837l lVar = this.f3278R;
        if (lVar != null) {
            lVar.mo4398k();
        }
        C0843o oVar = this.f3313r;
        if (oVar != null) {
            oVar.mo4484k1(this.f3291g);
            this.f3313r.mo4486l1(this.f3291g);
        }
        this.f3291g.mo4553c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public boolean mo4136W0(View view) {
        mo4227r1();
        boolean r = this.f3297j.mo4724r(view);
        if (r) {
            C0829d0 g0 = m4223g0(view);
            this.f3291g.mo4548J(g0);
            this.f3291g.mo4542C(g0);
        }
        mo4263t1(!r);
        return r;
    }

    /* renamed from: X */
    public C0829d0 mo4137X(int i) {
        C0829d0 d0Var = null;
        if (this.f3269I) {
            return null;
        }
        int j = this.f3297j.mo4717j();
        for (int i2 = 0; i2 < j; i2++) {
            C0829d0 g0 = m4223g0(this.f3297j.mo4716i(i2));
            if (g0 != null && !g0.mo4330v() && mo4147b0(g0) == i) {
                if (!this.f3297j.mo4720n(g0.f3359a)) {
                    return g0;
                }
                d0Var = g0;
            }
        }
        return d0Var;
    }

    /* renamed from: X0 */
    public void mo4138X0(C0842n nVar) {
        C0843o oVar = this.f3313r;
        if (oVar != null) {
            oVar.mo4072g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3317t.remove(nVar);
        if (this.f3317t.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo4273y0();
        requestLayout();
    }

    /* renamed from: Y */
    public C0829d0 mo4139Y(long j) {
        C0832g gVar = this.f3311q;
        C0829d0 d0Var = null;
        if (gVar != null && gVar.mo4359i()) {
            int j2 = this.f3297j.mo4717j();
            for (int i = 0; i < j2; i++) {
                C0829d0 g0 = m4223g0(this.f3297j.mo4716i(i));
                if (g0 != null && !g0.mo4330v() && g0.mo4318k() == j) {
                    if (!this.f3297j.mo4720n(g0.f3359a)) {
                        return g0;
                    }
                    d0Var = g0;
                }
            }
        }
        return d0Var;
    }

    /* renamed from: Y0 */
    public void mo4140Y0(C0851s sVar) {
        this.f3319u.remove(sVar);
        if (this.f3321v == sVar) {
            this.f3321v = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public C0829d0 mo4141Z(int i, boolean z) {
        int j = this.f3297j.mo4717j();
        C0829d0 d0Var = null;
        for (int i2 = 0; i2 < j; i2++) {
            C0829d0 g0 = m4223g0(this.f3297j.mo4716i(i2));
            if (g0 != null && !g0.mo4330v()) {
                if (z) {
                    if (g0.f3361c != i) {
                        continue;
                    }
                } else if (g0.mo4320m() != i) {
                    continue;
                }
                if (!this.f3297j.mo4720n(g0.f3359a)) {
                    return g0;
                }
                d0Var = g0;
            }
        }
        return d0Var;
    }

    /* renamed from: Z0 */
    public void mo4142Z0(C0852t tVar) {
        List<C0852t> list = this.f3308o0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4143a(int i, int i2) {
        if (i < 0) {
            mo4124M();
            if (this.f3274N.isFinished()) {
                this.f3274N.onAbsorb(-i);
            }
        } else if (i > 0) {
            mo4126N();
            if (this.f3276P.isFinished()) {
                this.f3276P.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            mo4128O();
            if (this.f3275O.isFinished()) {
                this.f3275O.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            mo4122L();
            if (this.f3277Q.isFinished()) {
                this.f3277Q.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C3403t.m14625Z(this);
        }
    }

    /* renamed from: a0 */
    public boolean mo4144a0(int i, int i2) {
        C0843o oVar = this.f3313r;
        int i3 = 0;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f3262C) {
            return false;
        } else {
            boolean k = oVar.mo4073k();
            boolean l = this.f3313r.mo4074l();
            if (!k || Math.abs(i) < this.f3288e0) {
                i = 0;
            }
            if (!l || Math.abs(i2) < this.f3288e0) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = k || l;
                dispatchNestedFling(f, f2, z);
                C0850r rVar = this.f3287d0;
                if (rVar != null && rVar.mo4523a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (k) {
                        i3 = 1;
                    }
                    if (l) {
                        i3 |= 2;
                    }
                    mo4235s1(i3, 1);
                    int i4 = this.f3290f0;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.f3290f0;
                    this.f3298j0.mo4288c(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public void mo4145a1() {
        C0829d0 d0Var;
        int g = this.f3297j.mo4715g();
        for (int i = 0; i < g; i++) {
            View f = this.f3297j.mo4714f(i);
            C0829d0 f0 = mo4167f0(f);
            if (!(f0 == null || (d0Var = f0.f3367i) == null)) {
                View view = d0Var.f3359a;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0843o oVar = this.f3313r;
        if (oVar == null || !oVar.mo4429F0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public int mo4147b0(C0829d0 d0Var) {
        if (d0Var.mo4323p(524) || !d0Var.mo4326s()) {
            return -1;
        }
        return this.f3295i.mo4684e(d0Var.f3361c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public long mo4148c0(C0829d0 d0Var) {
        return this.f3311q.mo4359i() ? d0Var.mo4318k() : (long) d0Var.f3361c;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0848p) && this.f3313r.mo4032m((C0848p) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C0843o oVar = this.f3313r;
        if (oVar != null && oVar.mo4073k()) {
            return this.f3313r.mo4079q(this.f3304m0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C0843o oVar = this.f3313r;
        if (oVar != null && oVar.mo4073k()) {
            return this.f3313r.mo4033r(this.f3304m0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C0843o oVar = this.f3313r;
        if (oVar != null && oVar.mo4073k()) {
            return this.f3313r.mo4034s(this.f3304m0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C0843o oVar = this.f3313r;
        if (oVar != null && oVar.mo4074l()) {
            return this.f3313r.mo4083t(this.f3304m0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C0843o oVar = this.f3313r;
        if (oVar != null && oVar.mo4074l()) {
            return this.f3313r.mo4036u(this.f3304m0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C0843o oVar = this.f3313r;
        if (oVar != null && oVar.mo4074l()) {
            return this.f3313r.mo4038v(this.f3304m0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public int mo4156d0(View view) {
        C0829d0 g0 = m4223g0(view);
        if (g0 != null) {
            return g0.mo4317j();
        }
        return -1;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo11685a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo11686b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo11687c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo11690f(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        float f;
        super.draw(canvas);
        int size = this.f3317t.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f3317t.get(i2).mo3952i(canvas, this, this.f3304m0);
        }
        EdgeEffect edgeEffect = this.f3274N;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3301l ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f3274N;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f3275O;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3301l) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3275O;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3276P;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3301l ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f3276P;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3277Q;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3301l) {
                f = (float) ((-getWidth()) + getPaddingRight());
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = (float) (-getWidth());
                i = -getHeight();
            }
            canvas.translate(f, (float) i);
            EdgeEffect edgeEffect8 = this.f3277Q;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f3278R == null || this.f3317t.size() <= 0 || !this.f3278R.mo4403p()) {
            z3 = z;
        }
        if (z3) {
            C3403t.m14625Z(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public int mo4166e0(View view) {
        C0829d0 g0 = m4223g0(view);
        if (g0 != null) {
            return g0.mo4320m();
        }
        return -1;
    }

    /* renamed from: f0 */
    public C0829d0 mo4167f0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4223g0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void mo4168f1() {
        int j = this.f3297j.mo4717j();
        for (int i = 0; i < j; i++) {
            C0829d0 g0 = m4223g0(this.f3297j.mo4716i(i));
            if (!g0.mo4306J()) {
                g0.mo4301E();
            }
        }
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View Q0 = this.f3313r.mo4448Q0(view, i);
        if (Q0 != null) {
            return Q0;
        }
        boolean z2 = true;
        boolean z3 = this.f3311q != null && this.f3313r != null && !mo4267v0() && !this.f3262C;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                mo4264u();
                if (mo4132R(view) == null) {
                    return null;
                }
                mo4227r1();
                view2 = this.f3313r.mo4015J0(view, i, this.f3291g, this.f3304m0);
                mo4263t1(false);
            }
        } else {
            if (this.f3313r.mo4074l()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f3254I0) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f3313r.mo4073k()) {
                int i3 = (this.f3313r.mo4458Z() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (f3254I0) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                mo4264u();
                if (mo4132R(view) == null) {
                    return null;
                }
                mo4227r1();
                this.f3313r.mo4015J0(view, i, this.f3291g, this.f3304m0);
                mo4263t1(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return m4236w0(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m4214b1(view2, (View) null);
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public boolean mo4170g1(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo4264u();
        if (this.f3311q != null) {
            int[] iArr = this.f3330z0;
            iArr[0] = 0;
            iArr[1] = 0;
            mo4192h1(i7, i8, iArr);
            int[] iArr2 = this.f3330z0;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i6 = i10;
            i5 = i9;
            i4 = i7 - i9;
            i3 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.f3317t.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f3330z0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        mo4114G(i5, i6, i4, i3, this.f3326x0, 0, iArr3);
        int[] iArr4 = this.f3330z0;
        int i11 = i4 - iArr4[0];
        int i12 = i3 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i13 = this.f3284a0;
        int[] iArr5 = this.f3326x0;
        this.f3284a0 = i13 - iArr5[0];
        this.f3285b0 -= iArr5[1];
        int[] iArr6 = this.f3328y0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C3392i.m14565a(motionEvent2, 8194)) {
                m4207R0(motionEvent.getX(), (float) i11, motionEvent.getY(), (float) i12);
            }
            mo4261t(i, i2);
        }
        if (!(i5 == 0 && i6 == 0)) {
            mo4118I(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i6 == 0) ? false : true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0843o oVar = this.f3313r;
        if (oVar != null) {
            return oVar.mo4011D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4129P());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0843o oVar = this.f3313r;
        if (oVar != null) {
            return oVar.mo4012E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4129P());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0843o oVar = this.f3313r;
        if (oVar != null) {
            return oVar.mo4014F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4129P());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C0832g getAdapter() {
        return this.f3311q;
    }

    public int getBaseline() {
        C0843o oVar = this.f3313r;
        return oVar != null ? oVar.mo4431G() : super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C0835j jVar = this.f3320u0;
        return jVar == null ? super.getChildDrawingOrder(i, i2) : jVar.mo4387a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f3301l;
    }

    public C0916o getCompatAccessibilityDelegate() {
        return this.f3318t0;
    }

    public C0836k getEdgeEffectFactory() {
        return this.f3273M;
    }

    public C0837l getItemAnimator() {
        return this.f3278R;
    }

    public int getItemDecorationCount() {
        return this.f3317t.size();
    }

    public C0843o getLayoutManager() {
        return this.f3313r;
    }

    public int getMaxFlingVelocity() {
        return this.f3290f0;
    }

    public int getMinFlingVelocity() {
        return this.f3288e0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f3253H0) {
            return System.nanoTime();
        }
        return 0;
    }

    public C0850r getOnFlingListener() {
        return this.f3287d0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3296i0;
    }

    public C0853u getRecycledViewPool() {
        return this.f3291g.mo4559i();
    }

    public int getScrollState() {
        return this.f3279S;
    }

    /* renamed from: h */
    public void mo4191h(C0842n nVar) {
        mo4194i(nVar, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void mo4192h1(int i, int i2, int[] iArr) {
        mo4227r1();
        mo4117H0();
        C3309b.m14261a("RV Scroll");
        mo4130Q(this.f3304m0);
        int w1 = i != 0 ? this.f3313r.mo4039w1(i, this.f3291g, this.f3304m0) : 0;
        int y1 = i2 != 0 ? this.f3313r.mo4040y1(i2, this.f3291g, this.f3304m0) : 0;
        C3309b.m14262b();
        mo4145a1();
        mo4119I0();
        mo4263t1(false);
        if (iArr != null) {
            iArr[0] = w1;
            iArr[1] = y1;
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo11691j();
    }

    /* renamed from: i */
    public void mo4194i(C0842n nVar, int i) {
        C0843o oVar = this.f3313r;
        if (oVar != null) {
            oVar.mo4072g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3317t.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f3317t.add(nVar);
        } else {
            this.f3317t.add(i, nVar);
        }
        mo4273y0();
        requestLayout();
    }

    /* renamed from: i1 */
    public void mo4195i1(int i) {
        if (!this.f3262C) {
            mo4268v1();
            C0843o oVar = this.f3313r;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.mo4084x1(i);
            awakenScrollBars();
        }
    }

    public boolean isAttachedToWindow() {
        return this.f3323w;
    }

    public final boolean isLayoutSuppressed() {
        return this.f3262C;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo11693l();
    }

    /* renamed from: j */
    public void mo4198j(C0851s sVar) {
        this.f3319u.add(sVar);
    }

    /* renamed from: k */
    public void mo4199k(C0852t tVar) {
        if (this.f3308o0 == null) {
            this.f3308o0 = new ArrayList();
        }
        this.f3308o0.add(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public Rect mo4200k0(View view) {
        C0848p pVar = (C0848p) view.getLayoutParams();
        if (!pVar.f3416c) {
            return pVar.f3415b;
        }
        if (this.f3304m0.mo4281e() && (pVar.mo4518b() || pVar.mo4520d())) {
            return pVar.f3415b;
        }
        Rect rect = pVar.f3415b;
        rect.set(0, 0, 0, 0);
        int size = this.f3317t.size();
        for (int i = 0; i < size; i++) {
            this.f3305n.set(0, 0, 0, 0);
            this.f3317t.get(i).mo3951e(this.f3305n, view, this, this.f3304m0);
            int i2 = rect.left;
            Rect rect2 = this.f3305n;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f3416c = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public boolean mo4201k1(C0829d0 d0Var, int i) {
        if (mo4267v0()) {
            d0Var.f3375q = i;
            this.f3259A0.add(d0Var);
            return false;
        }
        C3403t.m14663s0(d0Var.f3359a, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4202l(C0829d0 d0Var, C0837l.C0840c cVar, C0837l.C0840c cVar2) {
        d0Var.mo4303G(false);
        if (this.f3278R.mo4389a(d0Var, cVar, cVar2)) {
            mo4127N0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public boolean mo4203l1(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!mo4267v0()) {
            return false;
        }
        int a = accessibilityEvent != null ? C3368b.m14437a(accessibilityEvent) : 0;
        if (a != 0) {
            i = a;
        }
        this.f3265E |= i;
        return true;
    }

    /* renamed from: m0 */
    public boolean mo4204m0() {
        return !this.f3329z || this.f3269I || this.f3295i.mo4691p();
    }

    /* renamed from: m1 */
    public void mo4205m1(int i, int i2) {
        mo4207n1(i, i2, (Interpolator) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4206n(C0829d0 d0Var, C0837l.C0840c cVar, C0837l.C0840c cVar2) {
        m4222g(d0Var);
        d0Var.mo4303G(false);
        if (this.f3278R.mo4391c(d0Var, cVar, cVar2)) {
            mo4127N0();
        }
    }

    /* renamed from: n1 */
    public void mo4207n1(int i, int i2, Interpolator interpolator) {
        mo4210o1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4208o(String str) {
        if (mo4267v0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo4129P());
            }
            throw new IllegalStateException(str);
        } else if (this.f3272L > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR + mo4129P()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo4209o0() {
        this.f3295i = new C0872a(new C0831f());
    }

    /* renamed from: o1 */
    public void mo4210o1(int i, int i2, Interpolator interpolator, int i3) {
        mo4224p1(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3271K = 0;
        boolean z = true;
        this.f3323w = true;
        if (!this.f3329z || isLayoutRequested()) {
            z = false;
        }
        this.f3329z = z;
        C0843o oVar = this.f3313r;
        if (oVar != null) {
            oVar.mo4508z(this);
        }
        this.f3316s0 = false;
        if (f3253H0) {
            C0903h hVar = C0903h.f3636j.get();
            this.f3300k0 = hVar;
            if (hVar == null) {
                this.f3300k0 = new C0903h();
                Display s = C3403t.m14662s(this);
                float f = 60.0f;
                if (!isInEditMode() && s != null) {
                    float refreshRate = s.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C0903h hVar2 = this.f3300k0;
                hVar2.f3640h = (long) (1.0E9f / f);
                C0903h.f3636j.set(hVar2);
            }
            this.f3300k0.mo4777a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C0903h hVar;
        super.onDetachedFromWindow();
        C0837l lVar = this.f3278R;
        if (lVar != null) {
            lVar.mo4398k();
        }
        mo4268v1();
        this.f3323w = false;
        C0843o oVar = this.f3313r;
        if (oVar != null) {
            oVar.mo4418A(this, this.f3291g);
        }
        this.f3259A0.clear();
        removeCallbacks(this.f3261B0);
        this.f3299k.mo4867j();
        if (f3253H0 && (hVar = this.f3300k0) != null) {
            hVar.mo4780j(this);
            this.f3300k0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3317t.size();
        for (int i = 0; i < size; i++) {
            this.f3317t.get(i).mo4416g(canvas, this, this.f3304m0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f3313r != null && !this.f3262C && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f3313r.mo4074l() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f3313r.mo4073k()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo4170g1((int) (f * this.f3292g0), (int) (f2 * this.f3294h0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f3313r.mo4074l()) {
                        f2 = -axisValue;
                    } else if (this.f3313r.mo4073k()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo4170g1((int) (f * this.f3292g0), (int) (f2 * this.f3294h0), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            mo4170g1((int) (f * this.f3292g0), (int) (f2 * this.f3294h0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f3262C) {
            return false;
        }
        this.f3321v = null;
        if (m4208T(motionEvent)) {
            m4232q();
            return true;
        }
        C0843o oVar = this.f3313r;
        if (oVar == null) {
            return false;
        }
        boolean k = oVar.mo4073k();
        boolean l = this.f3313r.mo4074l();
        if (this.f3281U == null) {
            this.f3281U = VelocityTracker.obtain();
        }
        this.f3281U.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3264D) {
                this.f3264D = false;
            }
            this.f3280T = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f3284a0 = x;
            this.f3282V = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f3285b0 = y;
            this.f3283W = y;
            if (this.f3279S == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo4266u1(1);
            }
            int[] iArr = this.f3328y0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = k ? 1 : 0;
            if (l) {
                i |= 2;
            }
            mo4235s1(i, 0);
        } else if (actionMasked == 1) {
            this.f3281U.clear();
            mo4266u1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3280T);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3280T + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f3279S != 1) {
                int i2 = x2 - this.f3282V;
                int i3 = y2 - this.f3283W;
                if (!k || Math.abs(i2) <= this.f3286c0) {
                    z = false;
                } else {
                    this.f3284a0 = x2;
                    z = true;
                }
                if (l && Math.abs(i3) > this.f3286c0) {
                    this.f3285b0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m4232q();
        } else if (actionMasked == 5) {
            this.f3280T = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f3284a0 = x3;
            this.f3282V = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f3285b0 = y3;
            this.f3283W = y3;
        } else if (actionMasked == 6) {
            m4204K0(motionEvent);
        }
        return this.f3279S == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C3309b.m14261a("RV OnLayout");
        mo4107B();
        C3309b.m14262b();
        this.f3329z = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0843o oVar = this.f3313r;
        if (oVar == null) {
            mo4269w(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo4082s0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3313r.mo4459Z0(this.f3291g, this.f3304m0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f3311q != null) {
                if (this.f3304m0.f3336e == 1) {
                    m4200C();
                }
                this.f3313r.mo4420A1(i, i2);
                this.f3304m0.f3341j = true;
                m4201D();
                this.f3313r.mo4426D1(i, i2);
                if (this.f3313r.mo4054G1()) {
                    this.f3313r.mo4420A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f3304m0.f3341j = true;
                    m4201D();
                    this.f3313r.mo4426D1(i, i2);
                }
            }
        } else if (this.f3325x) {
            this.f3313r.mo4459Z0(this.f3291g, this.f3304m0, i, i2);
        } else {
            if (this.f3266F) {
                mo4227r1();
                mo4117H0();
                m4206P0();
                mo4119I0();
                C0823a0 a0Var = this.f3304m0;
                if (a0Var.f3343l) {
                    a0Var.f3339h = true;
                } else {
                    this.f3295i.mo4686j();
                    this.f3304m0.f3339h = false;
                }
                this.f3266F = false;
                mo4263t1(false);
            } else if (this.f3304m0.f3343l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0832g gVar = this.f3311q;
            if (gVar != null) {
                this.f3304m0.f3337f = gVar.mo3963e();
            } else {
                this.f3304m0.f3337f = 0;
            }
            mo4227r1();
            this.f3313r.mo4459Z0(this.f3291g, this.f3304m0, i, i2);
            mo4263t1(false);
            this.f3304m0.f3339h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo4267v0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0858y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0858y yVar = (C0858y) parcelable;
        this.f3293h = yVar;
        super.onRestoreInstanceState(yVar.mo11760a());
        C0843o oVar = this.f3313r;
        if (oVar != null && (parcelable2 = this.f3293h.f3434h) != null) {
            oVar.mo4067c1(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0858y yVar = new C0858y(super.onSaveInstanceState());
        C0858y yVar2 = this.f3293h;
        if (yVar2 != null) {
            yVar.mo4577b(yVar2);
        } else {
            C0843o oVar = this.f3313r;
            yVar.f3434h = oVar != null ? oVar.mo4069d1() : null;
        }
        return yVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo4234s0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f3262C
            r8 = 0
            if (r0 != 0) goto L_0x01e4
            boolean r0 = r6.f3264D
            if (r0 == 0) goto L_0x000f
            goto L_0x01e4
        L_0x000f:
            boolean r0 = r17.m4203K(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.m4232q()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f3313r
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo4073k()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f3313r
            boolean r11 = r0.mo4074l()
            android.view.VelocityTracker r0 = r6.f3281U
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f3281U = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f3328y0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f3328y0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01b3
            if (r0 == r9) goto L_0x0171
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d9
        L_0x0066:
            r17.m4204K0(r18)
            goto L_0x01d9
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f3280T = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3284a0 = r0
            r6.f3282V = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3285b0 = r0
            r6.f3283W = r0
            goto L_0x01d9
        L_0x0087:
            r17.m4232q()
            goto L_0x01d9
        L_0x008c:
            int r0 = r6.f3280T
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f3280T
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f3284a0
            int r0 = r0 - r13
            int r1 = r6.f3285b0
            int r1 = r1 - r14
            int r2 = r6.f3279S
            if (r2 == r9) goto L_0x00f7
            if (r10 == 0) goto L_0x00dd
            int r2 = r6.f3286c0
            if (r0 <= 0) goto L_0x00d4
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d9
        L_0x00d4:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d9:
            if (r0 == 0) goto L_0x00dd
            r2 = 1
            goto L_0x00de
        L_0x00dd:
            r2 = 0
        L_0x00de:
            if (r11 == 0) goto L_0x00f2
            int r3 = r6.f3286c0
            if (r1 <= 0) goto L_0x00ea
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00ef
        L_0x00ea:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00ef:
            if (r1 == 0) goto L_0x00f2
            r2 = 1
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            r6.setScrollState(r9)
        L_0x00f7:
            r15 = r0
            r16 = r1
            int r0 = r6.f3279S
            if (r0 != r9) goto L_0x01d9
            int[] r0 = r6.f3330z0
            r0[r8] = r8
            r0[r9] = r8
            if (r10 == 0) goto L_0x0108
            r1 = r15
            goto L_0x0109
        L_0x0108:
            r1 = 0
        L_0x0109:
            if (r11 == 0) goto L_0x010e
            r2 = r16
            goto L_0x010f
        L_0x010e:
            r2 = 0
        L_0x010f:
            int[] r3 = r6.f3330z0
            int[] r4 = r6.f3326x0
            r5 = 0
            r0 = r17
            boolean r0 = r0.mo4112F(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x013e
            int[] r0 = r6.f3330z0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f3328y0
            r1 = r0[r8]
            int[] r2 = r6.f3326x0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x013e:
            r0 = r16
            int[] r1 = r6.f3326x0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f3284a0 = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f3285b0 = r14
            if (r10 == 0) goto L_0x0150
            r1 = r15
            goto L_0x0151
        L_0x0150:
            r1 = 0
        L_0x0151:
            if (r11 == 0) goto L_0x0155
            r2 = r0
            goto L_0x0156
        L_0x0155:
            r2 = 0
        L_0x0156:
            boolean r1 = r6.mo4170g1(r1, r2, r7)
            if (r1 == 0) goto L_0x0163
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0163:
            androidx.recyclerview.widget.h r1 = r6.f3300k0
            if (r1 == 0) goto L_0x01d9
            if (r15 != 0) goto L_0x016b
            if (r0 == 0) goto L_0x01d9
        L_0x016b:
            androidx.recyclerview.widget.h r1 = r6.f3300k0
            r1.mo4778f(r6, r15, r0)
            goto L_0x01d9
        L_0x0171:
            android.view.VelocityTracker r0 = r6.f3281U
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f3281U
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.f3290f0
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x018d
            android.view.VelocityTracker r1 = r6.f3281U
            int r2 = r6.f3280T
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018e
        L_0x018d:
            r1 = 0
        L_0x018e:
            if (r11 == 0) goto L_0x019a
            android.view.VelocityTracker r2 = r6.f3281U
            int r3 = r6.f3280T
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01a3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01ab
        L_0x01a3:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.mo4144a0(r0, r1)
            if (r0 != 0) goto L_0x01ae
        L_0x01ab:
            r6.setScrollState(r8)
        L_0x01ae:
            r17.m4218d1()
            r8 = 1
            goto L_0x01d9
        L_0x01b3:
            int r0 = r7.getPointerId(r8)
            r6.f3280T = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3284a0 = r0
            r6.f3282V = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3285b0 = r0
            r6.f3283W = r0
            if (r10 == 0) goto L_0x01d1
            r0 = 1
            goto L_0x01d2
        L_0x01d1:
            r0 = 0
        L_0x01d2:
            if (r11 == 0) goto L_0x01d6
            r0 = r0 | 2
        L_0x01d6:
            r6.mo4235s1(r0, r8)
        L_0x01d9:
            if (r8 != 0) goto L_0x01e0
            android.view.VelocityTracker r0 = r6.f3281U
            r0.addMovement(r12)
        L_0x01e0:
            r12.recycle()
            return r9
        L_0x01e4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo4223p(C0829d0 d0Var) {
        C0837l lVar = this.f3278R;
        return lVar == null || lVar.mo4394g(d0Var, d0Var.mo4322o());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public void mo4224p1(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C0843o oVar = this.f3313r;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3262C) {
            int i4 = 0;
            if (!oVar.mo4073k()) {
                i = 0;
            }
            if (!this.f3313r.mo4074l()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo4235s1(i4, 1);
                    }
                    this.f3298j0.mo4290f(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    /* renamed from: q1 */
    public void mo4225q1(int i) {
        if (!this.f3262C) {
            C0843o oVar = this.f3313r;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.mo4056I1(this, this.f3304m0, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void mo4226r0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo4129P());
        }
        Resources resources = getContext().getResources();
        new C0898g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C3483b.fastscroll_default_thickness), resources.getDimensionPixelSize(C3483b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C3483b.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void mo4227r1() {
        int i = this.f3258A + 1;
        this.f3258A = i;
        if (i == 1 && !this.f3262C) {
            this.f3260B = false;
        }
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C0829d0 g0 = m4223g0(view);
        if (g0 != null) {
            if (g0.mo4332x()) {
                g0.mo4314f();
            } else if (!g0.mo4306J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + g0 + mo4129P());
            }
        }
        view.clearAnimation();
        mo4274z(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3313r.mo4464b1(this, this.f3304m0, view, view2) && view2 != null) {
            m4214b1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f3313r.mo4498r1(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f3319u.size();
        for (int i = 0; i < size; i++) {
            this.f3319u.get(i).mo4526c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f3258A != 0 || this.f3262C) {
            this.f3260B = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4233s() {
        int j = this.f3297j.mo4717j();
        for (int i = 0; i < j; i++) {
            C0829d0 g0 = m4223g0(this.f3297j.mo4716i(i));
            if (!g0.mo4306J()) {
                g0.mo4311c();
            }
        }
        this.f3291g.mo4554d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public void mo4234s0() {
        this.f3277Q = null;
        this.f3275O = null;
        this.f3276P = null;
        this.f3274N = null;
    }

    /* renamed from: s1 */
    public boolean mo4235s1(int i, int i2) {
        return getScrollingChildHelper().mo11696p(i, i2);
    }

    public void scrollBy(int i, int i2) {
        C0843o oVar = this.f3313r;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3262C) {
            boolean k = oVar.mo4073k();
            boolean l = this.f3313r.mo4074l();
            if (k || l) {
                if (!k) {
                    i = 0;
                }
                if (!l) {
                    i2 = 0;
                }
                mo4170g1(i, i2, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo4203l1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C0916o oVar) {
        this.f3318t0 = oVar;
        C3403t.m14643i0(this, oVar);
    }

    public void setAdapter(C0832g gVar) {
        setLayoutFrozen(false);
        m4227j1(gVar, false, true);
        mo4131Q0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0835j jVar) {
        if (jVar != this.f3320u0) {
            this.f3320u0 = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f3301l) {
            mo4234s0();
        }
        this.f3301l = z;
        super.setClipToPadding(z);
        if (this.f3329z) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0836k kVar) {
        C3349h.m14361c(kVar);
        this.f3273M = kVar;
        mo4234s0();
    }

    public void setHasFixedSize(boolean z) {
        this.f3325x = z;
    }

    public void setItemAnimator(C0837l lVar) {
        C0837l lVar2 = this.f3278R;
        if (lVar2 != null) {
            lVar2.mo4398k();
            this.f3278R.mo4409v((C0837l.C0839b) null);
        }
        this.f3278R = lVar;
        if (lVar != null) {
            lVar.mo4409v(this.f3314r0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f3291g.mo4546G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C0843o oVar) {
        if (oVar != this.f3313r) {
            mo4268v1();
            if (this.f3313r != null) {
                C0837l lVar = this.f3278R;
                if (lVar != null) {
                    lVar.mo4398k();
                }
                this.f3313r.mo4484k1(this.f3291g);
                this.f3313r.mo4486l1(this.f3291g);
                this.f3291g.mo4553c();
                if (this.f3323w) {
                    this.f3313r.mo4418A(this, this.f3291g);
                }
                this.f3313r.mo4428E1((RecyclerView) null);
                this.f3313r = null;
            } else {
                this.f3291g.mo4553c();
            }
            this.f3297j.mo4721o();
            this.f3313r = oVar;
            if (oVar != null) {
                if (oVar.f3391b == null) {
                    oVar.mo4428E1(this);
                    if (this.f3323w) {
                        this.f3313r.mo4508z(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f3391b.mo4129P());
                }
            }
            this.f3291g.mo4549K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo11694m(z);
    }

    public void setOnFlingListener(C0850r rVar) {
        this.f3287d0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(C0852t tVar) {
        this.f3306n0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f3296i0 = z;
    }

    public void setRecycledViewPool(C0853u uVar) {
        this.f3291g.mo4544E(uVar);
    }

    public void setRecyclerListener(C0856w wVar) {
        this.f3315s = wVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f3279S) {
            this.f3279S = i;
            if (i != 2) {
                m4237w1();
            }
            mo4116H(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.f3286c0 = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.f3286c0 = i2;
    }

    public void setViewCacheExtension(C0825b0 b0Var) {
        this.f3291g.mo4545F(b0Var);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo11695o(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo11697q();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f3262C) {
            mo4208o("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f3262C = false;
                if (!(!this.f3260B || this.f3313r == null || this.f3311q == null)) {
                    requestLayout();
                }
                this.f3260B = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3262C = true;
            this.f3264D = true;
            mo4268v1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4261t(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f3274N;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f3274N.onRelease();
            z = this.f3274N.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3276P;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f3276P.onRelease();
            z |= this.f3276P.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3275O;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f3275O.onRelease();
            z |= this.f3275O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3277Q;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f3277Q.onRelease();
            z |= this.f3277Q.isFinished();
        }
        if (z) {
            C3403t.m14625Z(this);
        }
    }

    /* renamed from: t0 */
    public void mo4262t0() {
        if (this.f3317t.size() != 0) {
            C0843o oVar = this.f3313r;
            if (oVar != null) {
                oVar.mo4072g("Cannot invalidate item decorations during a scroll or layout");
            }
            mo4273y0();
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public void mo4263t1(boolean z) {
        if (this.f3258A < 1) {
            this.f3258A = 1;
        }
        if (!z && !this.f3262C) {
            this.f3260B = false;
        }
        if (this.f3258A == 1) {
            if (z && this.f3260B && !this.f3262C && this.f3313r != null && this.f3311q != null) {
                mo4107B();
            }
            if (!this.f3262C) {
                this.f3260B = false;
            }
        }
        this.f3258A--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4264u() {
        if (!this.f3329z || this.f3269I) {
            C3309b.m14261a("RV FullInvalidate");
            mo4107B();
            C3309b.m14262b();
        } else if (this.f3295i.mo4691p()) {
            if (this.f3295i.mo4690o(4) && !this.f3295i.mo4690o(11)) {
                C3309b.m14261a("RV PartialInvalidate");
                mo4227r1();
                mo4117H0();
                this.f3295i.mo4697w();
                if (!this.f3260B) {
                    if (m4230n0()) {
                        mo4107B();
                    } else {
                        this.f3295i.mo4685i();
                    }
                }
                mo4263t1(true);
                mo4119I0();
            } else if (this.f3295i.mo4691p()) {
                C3309b.m14261a("RV FullInvalidate");
                mo4107B();
            } else {
                return;
            }
            C3309b.m14262b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public boolean mo4265u0() {
        AccessibilityManager accessibilityManager = this.f3267G;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: u1 */
    public void mo4266u1(int i) {
        getScrollingChildHelper().mo11698r(i);
    }

    /* renamed from: v0 */
    public boolean mo4267v0() {
        return this.f3271K > 0;
    }

    /* renamed from: v1 */
    public void mo4268v1() {
        setScrollState(0);
        m4237w1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo4269w(int i, int i2) {
        setMeasuredDimension(C0843o.m4479n(i, getPaddingLeft() + getPaddingRight(), C3403t.m14599A(this)), C0843o.m4479n(i2, getPaddingTop() + getPaddingBottom(), C3403t.m14676z(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void mo4270x0(int i) {
        if (this.f3313r != null) {
            setScrollState(2);
            this.f3313r.mo4084x1(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public void mo4271x1(int i, int i2, Object obj) {
        int i3;
        int j = this.f3297j.mo4717j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < j; i5++) {
            View i6 = this.f3297j.mo4716i(i5);
            C0829d0 g0 = m4223g0(i6);
            if (g0 != null && !g0.mo4306J() && (i3 = g0.f3361c) >= i && i3 < i4) {
                g0.mo4310b(2);
                g0.mo4309a(obj);
                ((C0848p) i6.getLayoutParams()).f3416c = true;
            }
        }
        this.f3291g.mo4551M(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4272y(View view) {
        C0829d0 g0 = m4223g0(view);
        mo4113F0(view);
        C0832g gVar = this.f3311q;
        if (!(gVar == null || g0 == null)) {
            gVar.mo4370v(g0);
        }
        List<C0849q> list = this.f3268H;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3268H.get(size).mo4521a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo4273y0() {
        int j = this.f3297j.mo4717j();
        for (int i = 0; i < j; i++) {
            ((C0848p) this.f3297j.mo4716i(i).getLayoutParams()).f3416c = true;
        }
        this.f3291g.mo4567s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo4274z(View view) {
        C0829d0 g0 = m4223g0(view);
        mo4115G0(view);
        C0832g gVar = this.f3311q;
        if (!(gVar == null || g0 == null)) {
            gVar.mo4371w(g0);
        }
        List<C0849q> list = this.f3268H;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3268H.get(size).mo4522b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void mo4275z0() {
        int j = this.f3297j.mo4717j();
        for (int i = 0; i < j; i++) {
            C0829d0 g0 = m4223g0(this.f3297j.mo4716i(i));
            if (g0 != null && !g0.mo4306J()) {
                g0.mo4310b(6);
            }
        }
        mo4273y0();
        this.f3291g.mo4568t();
    }
}
