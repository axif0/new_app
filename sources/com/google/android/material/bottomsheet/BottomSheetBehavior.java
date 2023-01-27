package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.C2206p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p086f.p111h.p117h.C3306a;
import p086f.p111h.p122m.C3356b0;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p111h.p122m.p123c0.C3377f;
import p086f.p126j.p127a.C3430a;
import p086f.p126j.p128b.C3441c;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4979k;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C0548c<V> {

    /* renamed from: Q */
    private static final int f6707Q = C5005k.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    C3441c f6708A;

    /* renamed from: B */
    private boolean f6709B;

    /* renamed from: C */
    private int f6710C;

    /* renamed from: D */
    private boolean f6711D;

    /* renamed from: E */
    private int f6712E;

    /* renamed from: F */
    int f6713F;

    /* renamed from: G */
    int f6714G;

    /* renamed from: H */
    WeakReference<V> f6715H;

    /* renamed from: I */
    WeakReference<View> f6716I;

    /* renamed from: J */
    private final ArrayList<C2065f> f6717J = new ArrayList<>();

    /* renamed from: K */
    private VelocityTracker f6718K;

    /* renamed from: L */
    int f6719L;

    /* renamed from: M */
    private int f6720M;

    /* renamed from: N */
    boolean f6721N;

    /* renamed from: O */
    private Map<View, Integer> f6722O;

    /* renamed from: P */
    private final C3441c.C3444c f6723P = new C2063d();

    /* renamed from: a */
    private int f6724a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f6725b = true;

    /* renamed from: c */
    private boolean f6726c = false;

    /* renamed from: d */
    private float f6727d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f6728e;

    /* renamed from: f */
    private boolean f6729f;

    /* renamed from: g */
    private int f6730g;

    /* renamed from: h */
    private int f6731h;

    /* renamed from: i */
    private boolean f6732i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4972g f6733j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f6734k;

    /* renamed from: l */
    private boolean f6735l;

    /* renamed from: m */
    private C4979k f6736m;

    /* renamed from: n */
    private boolean f6737n;

    /* renamed from: o */
    private BottomSheetBehavior<V>.h f6738o = null;

    /* renamed from: p */
    private ValueAnimator f6739p;

    /* renamed from: q */
    int f6740q;

    /* renamed from: r */
    int f6741r;

    /* renamed from: s */
    int f6742s;

    /* renamed from: t */
    float f6743t = 0.5f;

    /* renamed from: u */
    int f6744u;

    /* renamed from: v */
    float f6745v = -1.0f;

    /* renamed from: w */
    boolean f6746w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f6747x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f6748y = true;

    /* renamed from: z */
    int f6749z = 4;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class C2060a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f6750f;

        /* renamed from: g */
        final /* synthetic */ int f6751g;

        C2060a(View view, int i) {
            this.f6750f = view;
            this.f6751g = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo7667r0(this.f6750f, this.f6751g);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C2061b implements ValueAnimator.AnimatorUpdateListener {
        C2061b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f6733j != null) {
                BottomSheetBehavior.this.f6733j.mo14927Y(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C2062c implements C2206p.C2209c {
        C2062c() {
        }

        /* renamed from: a */
        public C3356b0 mo7672a(View view, C3356b0 b0Var, C2206p.C2210d dVar) {
            int unused = BottomSheetBehavior.this.f6734k = b0Var.mo11560d().f10521d;
            BottomSheetBehavior.this.m9436y0(false);
            return b0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C2063d extends C3441c.C3444c {
        C2063d() {
        }

        /* renamed from: n */
        private boolean m9473n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f6714G + bottomSheetBehavior.mo7650W()) / 2;
        }

        /* renamed from: a */
        public int mo3114a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo3115b(View view, int i, int i2) {
            int W = BottomSheetBehavior.this.mo7650W();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C3306a.m14255b(i, W, bottomSheetBehavior.f6746w ? bottomSheetBehavior.f6714G : bottomSheetBehavior.f6744u);
        }

        /* renamed from: e */
        public int mo7673e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f6746w ? bottomSheetBehavior.f6714G : bottomSheetBehavior.f6744u;
        }

        /* renamed from: j */
        public void mo3121j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f6748y) {
                BottomSheetBehavior.this.mo7666p0(1);
            }
        }

        /* renamed from: k */
        public void mo3122k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo7648T(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
            if (java.lang.Math.abs(r7.getTop() - r6.f6755a.f6740q) < java.lang.Math.abs(r7.getTop() - r6.f6755a.f6742s)) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
            if (java.lang.Math.abs(r8 - r6.f6755a.f6742s) < java.lang.Math.abs(r8 - r6.f6755a.f6744u)) goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
            if (java.lang.Math.abs(r8 - r6.f6755a.f6741r) < java.lang.Math.abs(r8 - r6.f6755a.f6744u)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ea, code lost:
            if (r8 < java.lang.Math.abs(r8 - r9.f6744u)) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fc, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f6755a.f6744u)) goto L_0x00b3;
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3123l(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r0 = 0
                r1 = 4
                r2 = 6
                r3 = 3
                int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r4 >= 0) goto L_0x0027
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f6725b
                if (r8 == 0) goto L_0x0017
            L_0x0010:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f6741r
            L_0x0014:
                r1 = 3
                goto L_0x00ff
            L_0x0017:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f6742s
                if (r8 <= r0) goto L_0x0024
                r8 = r0
                goto L_0x00b7
            L_0x0024:
                int r8 = r9.f6740q
                goto L_0x0014
            L_0x0027:
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r4.f6746w
                if (r5 == 0) goto L_0x007c
                boolean r4 = r4.mo7668t0(r7, r9)
                if (r4 == 0) goto L_0x007c
                float r8 = java.lang.Math.abs(r8)
                float r0 = java.lang.Math.abs(r9)
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x0045
                r8 = 1140457472(0x43fa0000, float:500.0)
                int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
                if (r8 > 0) goto L_0x004b
            L_0x0045:
                boolean r8 = r6.m9473n(r7)
                if (r8 == 0) goto L_0x0052
            L_0x004b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f6714G
                r1 = 5
                goto L_0x00ff
            L_0x0052:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f6725b
                if (r8 == 0) goto L_0x005b
                goto L_0x0010
            L_0x005b:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f6740q
                int r8 = r8 - r9
                int r8 = java.lang.Math.abs(r8)
                int r9 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f6742s
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r8 >= r9) goto L_0x00b3
            L_0x0077:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f6740q
                goto L_0x0014
            L_0x007c:
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00b9
                float r8 = java.lang.Math.abs(r8)
                float r9 = java.lang.Math.abs(r9)
                int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
                if (r8 <= 0) goto L_0x008d
                goto L_0x00b9
            L_0x008d:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f6725b
                if (r8 == 0) goto L_0x009a
            L_0x0095:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f6744u
                goto L_0x00ff
            L_0x009a:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f6742s
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f6744u
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
            L_0x00b3:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f6742s
            L_0x00b7:
                r1 = 6
                goto L_0x00ff
            L_0x00b9:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f6725b
                if (r9 == 0) goto L_0x00dc
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f6741r
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f6744u
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
                goto L_0x0010
            L_0x00dc:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f6742s
                if (r8 >= r0) goto L_0x00ed
                int r9 = r9.f6744u
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                if (r8 >= r9) goto L_0x00b3
                goto L_0x0077
            L_0x00ed:
                int r9 = r8 - r0
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f6744u
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
                goto L_0x00b3
            L_0x00ff:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r0 = 1
                r9.mo7669u0(r7, r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C2063d.mo3123l(android.view.View, float, float):void");
        }

        /* renamed from: m */
        public boolean mo3124m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f6749z;
            if (i2 == 1 || bottomSheetBehavior.f6721N) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f6719L == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f6716I;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f6715H;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    class C2064e implements C3377f {

        /* renamed from: a */
        final /* synthetic */ int f6756a;

        C2064e(int i) {
            this.f6756a = i;
        }

        /* renamed from: a */
        public boolean mo7550a(View view, C3377f.C3378a aVar) {
            BottomSheetBehavior.this.mo7665o0(this.f6756a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public static abstract class C2065f {
        /* renamed from: a */
        public abstract void mo7674a(View view, float f);

        /* renamed from: b */
        public abstract void mo7675b(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    protected static class C2066g extends C3430a {
        public static final Parcelable.Creator<C2066g> CREATOR = new C2067a();

        /* renamed from: h */
        final int f6758h;

        /* renamed from: i */
        int f6759i;

        /* renamed from: j */
        boolean f6760j;

        /* renamed from: k */
        boolean f6761k;

        /* renamed from: l */
        boolean f6762l;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g$a */
        static class C2067a implements Parcelable.ClassLoaderCreator<C2066g> {
            C2067a() {
            }

            /* renamed from: a */
            public C2066g createFromParcel(Parcel parcel) {
                return new C2066g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C2066g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2066g(parcel, classLoader);
            }

            /* renamed from: c */
            public C2066g[] newArray(int i) {
                return new C2066g[i];
            }
        }

        public C2066g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6758h = parcel.readInt();
            this.f6759i = parcel.readInt();
            boolean z = false;
            this.f6760j = parcel.readInt() == 1;
            this.f6761k = parcel.readInt() == 1;
            this.f6762l = parcel.readInt() == 1 ? true : z;
        }

        public C2066g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f6758h = bottomSheetBehavior.f6749z;
            this.f6759i = bottomSheetBehavior.f6728e;
            this.f6760j = bottomSheetBehavior.f6725b;
            this.f6761k = bottomSheetBehavior.f6746w;
            this.f6762l = bottomSheetBehavior.f6747x;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6758h);
            parcel.writeInt(this.f6759i);
            parcel.writeInt(this.f6760j ? 1 : 0);
            parcel.writeInt(this.f6761k ? 1 : 0);
            parcel.writeInt(this.f6762l ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    private class C2068h implements Runnable {

        /* renamed from: f */
        private final View f6763f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f6764g;

        /* renamed from: h */
        int f6765h;

        C2068h(View view, int i) {
            this.f6763f = view;
            this.f6765h = i;
        }

        public void run() {
            C3441c cVar = BottomSheetBehavior.this.f6708A;
            if (cVar == null || !cVar.mo11802m(true)) {
                BottomSheetBehavior.this.mo7666p0(this.f6765h);
            } else {
                C3403t.m14627a0(this.f6763f, this);
            }
            this.f6764g = false;
        }
    }

    public BottomSheetBehavior() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0072, code lost:
        r9 = r9.data;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomSheetBehavior(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            r7.<init>(r8, r9)
            r0 = 0
            r7.f6724a = r0
            r1 = 1
            r7.f6725b = r1
            r7.f6726c = r0
            r2 = 0
            r7.f6738o = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r7.f6743t = r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.f6745v = r3
            r7.f6748y = r1
            r4 = 4
            r7.f6749z = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7.f6717J = r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$d r4 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d
            r4.<init>()
            r7.f6723P = r4
            android.content.res.Resources r4 = r8.getResources()
            int r5 = p148g.p189d.p190a.p252d.C4998d.mtrl_min_touch_target_size
            int r4 = r4.getDimensionPixelSize(r5)
            r7.f6731h = r4
            int[] r4 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout
            android.content.res.TypedArray r4 = r8.obtainStyledAttributes(r9, r4)
            int r5 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_shapeAppearance
            boolean r5 = r4.hasValue(r5)
            r7.f6732i = r5
            int r5 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_backgroundTint
            boolean r5 = r4.hasValue(r5)
            if (r5 == 0) goto L_0x0055
            int r6 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_backgroundTint
            android.content.res.ColorStateList r6 = p148g.p189d.p190a.p252d.p269y.C5046c.m21335a(r8, r4, r6)
            r7.m9425R(r8, r9, r5, r6)
            goto L_0x0058
        L_0x0055:
            r7.m9424Q(r8, r9, r5)
        L_0x0058:
            r7.m9426S()
            int r9 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r9 < r5) goto L_0x0069
            int r9 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_android_elevation
            float r9 = r4.getDimension(r9, r3)
            r7.f6745v = r9
        L_0x0069:
            int r9 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_behavior_peekHeight
            android.util.TypedValue r9 = r4.peekValue(r9)
            r3 = -1
            if (r9 == 0) goto L_0x0077
            int r9 = r9.data
            if (r9 != r3) goto L_0x0077
            goto L_0x007d
        L_0x0077:
            int r9 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_behavior_peekHeight
            int r9 = r4.getDimensionPixelSize(r9, r3)
        L_0x007d:
            r7.mo7661k0(r9)
            int r9 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_behavior_hideable
            boolean r9 = r4.getBoolean(r9, r0)
            r7.mo7660j0(r9)
            int r9 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_gestureInsetBottomIgnored
            boolean r9 = r4.getBoolean(r9, r0)
            r7.mo7658h0(r9)
            int r9 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_behavior_fitToContents
            boolean r9 = r4.getBoolean(r9, r1)
            r7.mo7657g0(r9)
            int r9 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_behavior_skipCollapsed
            boolean r9 = r4.getBoolean(r9, r0)
            r7.mo7664n0(r9)
            int r9 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_behavior_draggable
            boolean r9 = r4.getBoolean(r9, r1)
            r7.mo7655e0(r9)
            int r9 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_behavior_saveFlags
            int r9 = r4.getInt(r9, r0)
            r7.mo7663m0(r9)
            int r9 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio
            float r9 = r4.getFloat(r9, r2)
            r7.mo7659i0(r9)
            int r9 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_behavior_expandedOffset
            android.util.TypedValue r9 = r4.peekValue(r9)
            if (r9 == 0) goto L_0x00d0
            int r1 = r9.type
            r2 = 16
            if (r1 != r2) goto L_0x00d0
            int r9 = r9.data
            goto L_0x00d6
        L_0x00d0:
            int r9 = p148g.p189d.p190a.p252d.C5006l.BottomSheetBehavior_Layout_behavior_expandedOffset
            int r9 = r4.getDimensionPixelOffset(r9, r0)
        L_0x00d6:
            r7.mo7656f0(r9)
            r4.recycle()
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)
            int r8 = r8.getScaledMaximumFlingVelocity()
            float r8 = (float) r8
            r7.f6727d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: L */
    private void m9420L(V v, C3369c.C3370a aVar, int i) {
        C3403t.m14635e0(v, aVar, (CharSequence) null, new C2064e(i));
    }

    /* renamed from: N */
    private void m9421N() {
        int P = m9423P();
        if (this.f6725b) {
            this.f6744u = Math.max(this.f6714G - P, this.f6741r);
        } else {
            this.f6744u = this.f6714G - P;
        }
    }

    /* renamed from: O */
    private void m9422O() {
        this.f6742s = (int) (((float) this.f6714G) * (1.0f - this.f6743t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = r3.f6734k;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m9423P() {
        /*
            r3 = this;
            boolean r0 = r3.f6729f
            if (r0 == 0) goto L_0x001a
            int r0 = r3.f6730g
            int r1 = r3.f6714G
            int r2 = r3.f6713F
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.f6712E
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L_0x001a:
            boolean r0 = r3.f6735l
            if (r0 != 0) goto L_0x002c
            int r0 = r3.f6734k
            if (r0 <= 0) goto L_0x002c
            int r1 = r3.f6728e
            int r2 = r3.f6731h
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x002c:
            int r0 = r3.f6728e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m9423P():int");
    }

    /* renamed from: Q */
    private void m9424Q(Context context, AttributeSet attributeSet, boolean z) {
        m9425R(context, attributeSet, z, (ColorStateList) null);
    }

    /* renamed from: R */
    private void m9425R(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f6732i) {
            this.f6736m = C4979k.m21076e(context, attributeSet, C4965b.bottomSheetStyle, f6707Q).mo14980m();
            C4972g gVar = new C4972g(this.f6736m);
            this.f6733j = gVar;
            gVar.mo14920N(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f6733j.setTint(typedValue.data);
                return;
            }
            this.f6733j.mo14926X(colorStateList);
        }
    }

    /* renamed from: S */
    private void m9426S() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f6739p = ofFloat;
        ofFloat.setDuration(500);
        this.f6739p.addUpdateListener(new C2061b());
    }

    /* renamed from: V */
    public static <V extends View> BottomSheetBehavior<V> m9427V(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0551f) {
            CoordinatorLayout.C0548c f = ((CoordinatorLayout.C0551f) layoutParams).mo2770f();
            if (f instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: Y */
    private float m9428Y() {
        VelocityTracker velocityTracker = this.f6718K;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f6727d);
        return this.f6718K.getYVelocity(this.f6719L);
    }

    /* renamed from: c0 */
    private void m9429c0() {
        this.f6719L = -1;
        VelocityTracker velocityTracker = this.f6718K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6718K = null;
        }
    }

    /* renamed from: d0 */
    private void m9430d0(C2066g gVar) {
        int i = this.f6724a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f6728e = gVar.f6759i;
            }
            int i2 = this.f6724a;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f6725b = gVar.f6760j;
            }
            int i3 = this.f6724a;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.f6746w = gVar.f6761k;
            }
            int i4 = this.f6724a;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f6747x = gVar.f6762l;
            }
        }
    }

    /* renamed from: q0 */
    private void m9431q0(View view) {
        if (Build.VERSION.SDK_INT >= 29 && !mo7652Z() && !this.f6729f) {
            C2206p.m10307a(view, new C2062c());
        }
    }

    /* renamed from: s0 */
    private void m9432s0(int i) {
        View view = (View) this.f6715H.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C3403t.m14613N(view)) {
                mo7667r0(view, i);
            } else {
                view.post(new C2060a(view, i));
            }
        }
    }

    /* renamed from: v0 */
    private void m9433v0() {
        View view;
        C3369c.C3370a aVar;
        WeakReference<V> weakReference = this.f6715H;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C3403t.m14631c0(view, 524288);
            C3403t.m14631c0(view, 262144);
            C3403t.m14631c0(view, 1048576);
            if (this.f6746w && this.f6749z != 5) {
                m9420L(view, C3369c.C3370a.f10678l, 5);
            }
            int i = this.f6749z;
            int i2 = 6;
            if (i == 3) {
                if (this.f6725b) {
                    i2 = 4;
                }
                aVar = C3369c.C3370a.f10677k;
            } else if (i == 4) {
                if (this.f6725b) {
                    i2 = 3;
                }
                aVar = C3369c.C3370a.f10676j;
            } else if (i == 6) {
                m9420L(view, C3369c.C3370a.f10677k, 4);
                m9420L(view, C3369c.C3370a.f10676j, 3);
                return;
            } else {
                return;
            }
            m9420L(view, aVar, i2);
        }
    }

    /* renamed from: w0 */
    private void m9434w0(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f6737n != z) {
                this.f6737n = z;
                if (this.f6733j != null && (valueAnimator = this.f6739p) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f6739p.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f6739p.setFloatValues(new float[]{1.0f - f, f});
                    this.f6739p.start();
                }
            }
        }
    }

    /* renamed from: x0 */
    private void m9435x0(boolean z) {
        Map<View, Integer> map;
        int intValue;
        WeakReference<V> weakReference = this.f6715H;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.f6722O == null) {
                        this.f6722O = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f6715H.get()) {
                        if (z) {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.f6722O.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            if (this.f6726c) {
                                intValue = 4;
                            }
                        } else if (this.f6726c && (map = this.f6722O) != null && map.containsKey(childAt)) {
                            intValue = this.f6722O.get(childAt).intValue();
                        }
                        C3403t.m14663s0(childAt, intValue);
                    }
                }
                if (!z) {
                    this.f6722O = null;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m9436y0(boolean z) {
        View view;
        if (this.f6715H != null) {
            m9421N();
            if (this.f6749z == 4 && (view = (View) this.f6715H.get()) != null) {
                if (z) {
                    m9432s0(this.f6749z);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: A */
    public boolean mo2732A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f6710C = 0;
        this.f6711D = false;
        return (i & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (java.lang.Math.abs(r3 - r2.f6741r) < java.lang.Math.abs(r3 - r2.f6744u)) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.f6744u)) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f6744u)) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        if (java.lang.Math.abs(r3 - r2.f6742s) < java.lang.Math.abs(r3 - r2.f6744u)) goto L_0x00a8;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2734C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.mo7650W()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.mo7666p0(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f6716I
            if (r3 == 0) goto L_0x00b1
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00b1
            boolean r3 = r2.f6711D
            if (r3 != 0) goto L_0x001f
            goto L_0x00b1
        L_0x001f:
            int r3 = r2.f6710C
            r5 = 4
            r6 = 6
            if (r3 <= 0) goto L_0x003c
            boolean r3 = r2.f6725b
            if (r3 == 0) goto L_0x002d
        L_0x0029:
            int r3 = r2.f6741r
            goto L_0x00ab
        L_0x002d:
            int r3 = r4.getTop()
            int r5 = r2.f6742s
            if (r3 <= r5) goto L_0x0038
            r3 = r5
            goto L_0x00aa
        L_0x0038:
            int r3 = r2.f6740q
            goto L_0x00ab
        L_0x003c:
            boolean r3 = r2.f6746w
            if (r3 == 0) goto L_0x004e
            float r3 = r2.m9428Y()
            boolean r3 = r2.mo7668t0(r4, r3)
            if (r3 == 0) goto L_0x004e
            int r3 = r2.f6714G
            r0 = 5
            goto L_0x00ab
        L_0x004e:
            int r3 = r2.f6710C
            if (r3 != 0) goto L_0x008b
            int r3 = r4.getTop()
            boolean r1 = r2.f6725b
            if (r1 == 0) goto L_0x006c
            int r6 = r2.f6741r
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            int r1 = r2.f6744u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r6 >= r3) goto L_0x008f
            goto L_0x0029
        L_0x006c:
            int r1 = r2.f6742s
            if (r3 >= r1) goto L_0x007b
            int r5 = r2.f6744u
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r3 >= r5) goto L_0x00a8
            goto L_0x0038
        L_0x007b:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f6744u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x008f
            goto L_0x00a8
        L_0x008b:
            boolean r3 = r2.f6725b
            if (r3 == 0) goto L_0x0093
        L_0x008f:
            int r3 = r2.f6744u
            r0 = 4
            goto L_0x00ab
        L_0x0093:
            int r3 = r4.getTop()
            int r0 = r2.f6742s
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f6744u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x008f
        L_0x00a8:
            int r3 = r2.f6742s
        L_0x00aa:
            r0 = 6
        L_0x00ab:
            r5 = 0
            r2.mo7669u0(r4, r0, r3, r5)
            r2.f6711D = r5
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo2734C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: D */
    public boolean mo2735D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6749z == 1 && actionMasked == 0) {
            return true;
        }
        C3441c cVar = this.f6708A;
        if (cVar != null) {
            cVar.mo11790E(motionEvent);
        }
        if (actionMasked == 0) {
            m9429c0();
        }
        if (this.f6718K == null) {
            this.f6718K = VelocityTracker.obtain();
        }
        this.f6718K.addMovement(motionEvent);
        if (this.f6708A != null && actionMasked == 2 && !this.f6709B && Math.abs(((float) this.f6720M) - motionEvent.getY()) > ((float) this.f6708A.mo11806y())) {
            this.f6708A.mo11799b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f6709B;
    }

    /* renamed from: M */
    public void mo7647M(C2065f fVar) {
        if (!this.f6717J.contains(fVar)) {
            this.f6717J.add(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo7648T(int i) {
        float f;
        float f2;
        View view = (View) this.f6715H.get();
        if (view != null && !this.f6717J.isEmpty()) {
            int i2 = this.f6744u;
            if (i > i2 || i2 == mo7650W()) {
                int i3 = this.f6744u;
                f = (float) (i3 - i);
                f2 = (float) (this.f6714G - i3);
            } else {
                int i4 = this.f6744u;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo7650W());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f6717J.size(); i5++) {
                this.f6717J.get(i5).mo7674a(view, f3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public View mo7649U(View view) {
        if (C3403t.m14615P(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View U = mo7649U(viewGroup.getChildAt(i));
            if (U != null) {
                return U;
            }
        }
        return null;
    }

    /* renamed from: W */
    public int mo7650W() {
        return this.f6725b ? this.f6741r : this.f6740q;
    }

    /* renamed from: X */
    public int mo7651X() {
        return this.f6749z;
    }

    /* renamed from: Z */
    public boolean mo7652Z() {
        return this.f6735l;
    }

    /* renamed from: a0 */
    public boolean mo7653a0() {
        return this.f6746w;
    }

    /* renamed from: b0 */
    public void mo7654b0(C2065f fVar) {
        this.f6717J.remove(fVar);
    }

    /* renamed from: e0 */
    public void mo7655e0(boolean z) {
        this.f6748y = z;
    }

    /* renamed from: f0 */
    public void mo7656f0(int i) {
        if (i >= 0) {
            this.f6740q = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: g */
    public void mo2742g(CoordinatorLayout.C0551f fVar) {
        super.mo2742g(fVar);
        this.f6715H = null;
        this.f6708A = null;
    }

    /* renamed from: g0 */
    public void mo7657g0(boolean z) {
        if (this.f6725b != z) {
            this.f6725b = z;
            if (this.f6715H != null) {
                m9421N();
            }
            mo7666p0((!this.f6725b || this.f6749z != 6) ? this.f6749z : 3);
            m9433v0();
        }
    }

    /* renamed from: h0 */
    public void mo7658h0(boolean z) {
        this.f6735l = z;
    }

    /* renamed from: i0 */
    public void mo7659i0(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f6743t = f;
        if (this.f6715H != null) {
            m9422O();
        }
    }

    /* renamed from: j */
    public void mo2745j() {
        super.mo2745j();
        this.f6715H = null;
        this.f6708A = null;
    }

    /* renamed from: j0 */
    public void mo7660j0(boolean z) {
        if (this.f6746w != z) {
            this.f6746w = z;
            if (!z && this.f6749z == 5) {
                mo7665o0(4);
            }
            m9433v0();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2746k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r9.f6748y
            if (r0 != 0) goto L_0x000e
            goto L_0x00d2
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.m9429c0()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.f6718K
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f6718K = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.f6718K
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.f6721N = r1
            r9.f6719L = r4
            boolean r11 = r9.f6709B
            if (r11 == 0) goto L_0x007f
            r9.f6709B = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f6720M = r7
            int r7 = r9.f6749z
            if (r7 == r5) goto L_0x006e
            java.lang.ref.WeakReference<android.view.View> r7 = r9.f6716I
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.f6720M
            boolean r7 = r10.mo2680B(r7, r6, r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f6719L = r7
            r9.f6721N = r2
        L_0x006e:
            int r7 = r9.f6719L
            if (r7 != r4) goto L_0x007c
            int r4 = r9.f6720M
            boolean r11 = r10.mo2680B(r11, r6, r4)
            if (r11 != 0) goto L_0x007c
            r11 = 1
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            r9.f6709B = r11
        L_0x007f:
            boolean r11 = r9.f6709B
            if (r11 != 0) goto L_0x008e
            f.j.b.c r11 = r9.f6708A
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.mo11795N(r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.f6716I
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r5) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r11 = r9.f6709B
            if (r11 != 0) goto L_0x00d1
            int r11 = r9.f6749z
            if (r11 == r2) goto L_0x00d1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.mo2680B(r3, r11, r0)
            if (r10 != 0) goto L_0x00d1
            f.j.b.c r10 = r9.f6708A
            if (r10 == 0) goto L_0x00d1
            int r10 = r9.f6720M
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            f.j.b.c r11 = r9.f6708A
            int r11 = r11.mo11806y()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d1
            r1 = 1
        L_0x00d1:
            return r1
        L_0x00d2:
            r9.f6709B = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo2746k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: k0 */
    public void mo7661k0(int i) {
        mo7662l0(i, false);
    }

    /* renamed from: l */
    public boolean mo2747l(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        C4972g gVar;
        if (C3403t.m14668v(coordinatorLayout) && !C3403t.m14668v(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f6715H == null) {
            this.f6730g = coordinatorLayout.getResources().getDimensionPixelSize(C4998d.design_bottom_sheet_peek_height_min);
            m9431q0(v);
            this.f6715H = new WeakReference<>(v);
            if (this.f6732i && (gVar = this.f6733j) != null) {
                C3403t.m14649l0(v, gVar);
            }
            C4972g gVar2 = this.f6733j;
            if (gVar2 != null) {
                float f = this.f6745v;
                if (f == -1.0f) {
                    f = C3403t.m14664t(v);
                }
                gVar2.mo14925W(f);
                boolean z = this.f6749z == 3;
                this.f6737n = z;
                this.f6733j.mo14927Y(z ? 0.0f : 1.0f);
            }
            m9433v0();
            if (C3403t.m14670w(v) == 0) {
                C3403t.m14663s0(v, 1);
            }
        }
        if (this.f6708A == null) {
            this.f6708A = C3441c.m14848o(coordinatorLayout, this.f6723P);
        }
        int top = v.getTop();
        coordinatorLayout.mo2683I(v, i);
        this.f6713F = coordinatorLayout.getWidth();
        this.f6714G = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f6712E = height;
        this.f6741r = Math.max(0, this.f6714G - height);
        m9422O();
        m9421N();
        int i3 = this.f6749z;
        if (i3 == 3) {
            i2 = mo7650W();
        } else if (i3 == 6) {
            i2 = this.f6742s;
        } else if (!this.f6746w || i3 != 5) {
            int i4 = this.f6749z;
            if (i4 == 4) {
                i2 = this.f6744u;
            } else {
                if (i4 == 1 || i4 == 2) {
                    C3403t.m14620U(v, top - v.getTop());
                }
                this.f6716I = new WeakReference<>(mo7649U(v));
                return true;
            }
        } else {
            i2 = this.f6714G;
        }
        C3403t.m14620U(v, i2);
        this.f6716I = new WeakReference<>(mo7649U(v));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7662l0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f6729f
            if (r4 != 0) goto L_0x0015
            r3.f6729f = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f6729f
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f6728e
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f6729f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f6728e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.m9436y0(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo7662l0(int, boolean):void");
    }

    /* renamed from: m0 */
    public void mo7663m0(int i) {
        this.f6724a = i;
    }

    /* renamed from: n0 */
    public void mo7664n0(boolean z) {
        this.f6747x = z;
    }

    /* renamed from: o */
    public boolean mo2750o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f6716I;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f6749z != 3 || super.mo2750o(coordinatorLayout, v, view, f, f2);
    }

    /* renamed from: o0 */
    public void mo7665o0(int i) {
        if (i != this.f6749z) {
            if (this.f6715H != null) {
                m9432s0(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f6746w && i == 5)) {
                this.f6749z = i;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo7666p0(int i) {
        View view;
        if (this.f6749z != i) {
            this.f6749z = i;
            WeakReference<V> weakReference = this.f6715H;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    m9435x0(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    m9435x0(false);
                }
                m9434w0(i);
                for (int i2 = 0; i2 < this.f6717J.size(); i2++) {
                    this.f6717J.get(i2).mo7675b(view, i);
                }
                m9433v0();
            }
        }
    }

    /* renamed from: q */
    public void mo2752q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f6716I;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i5 = top - i2;
                if (i2 <= 0) {
                    if (i2 < 0 && !view.canScrollVertically(-1)) {
                        int i6 = this.f6744u;
                        if (i5 > i6 && !this.f6746w) {
                            iArr[1] = top - i6;
                            C3403t.m14620U(v, -iArr[1]);
                            i4 = 4;
                        } else if (this.f6748y) {
                            iArr[1] = i2;
                            C3403t.m14620U(v, -i2);
                            mo7666p0(1);
                        } else {
                            return;
                        }
                    }
                    mo7648T(v.getTop());
                    this.f6710C = i2;
                    this.f6711D = true;
                } else if (i5 < mo7650W()) {
                    iArr[1] = top - mo7650W();
                    C3403t.m14620U(v, -iArr[1]);
                    i4 = 3;
                } else if (this.f6748y) {
                    iArr[1] = i2;
                    C3403t.m14620U(v, -i2);
                    mo7666p0(1);
                    mo7648T(v.getTop());
                    this.f6710C = i2;
                    this.f6711D = true;
                } else {
                    return;
                }
                mo7666p0(i4);
                mo7648T(v.getTop());
                this.f6710C = i2;
                this.f6711D = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void mo7667r0(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f6744u;
        } else if (i == 6) {
            int i4 = this.f6742s;
            if (!this.f6725b || i4 > (i3 = this.f6741r)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo7650W();
        } else if (!this.f6746w || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f6714G;
        }
        mo7669u0(view, i, i2, false);
    }

    /* renamed from: t */
    public void mo2755t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public boolean mo7668t0(View view, float f) {
        if (this.f6747x) {
            return true;
        }
        if (view.getTop() < this.f6744u) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f6744u)) / ((float) m9423P()) > 0.5f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo7669u0(View view, int i, int i2, boolean z) {
        C3441c cVar = this.f6708A;
        if (cVar != null && (!z ? cVar.mo11796O(view, view.getLeft(), i2) : cVar.mo11794M(view.getLeft(), i2))) {
            mo7666p0(2);
            m9434w0(i);
            if (this.f6738o == null) {
                this.f6738o = new C2068h(view, i);
            }
            if (!this.f6738o.f6764g) {
                BottomSheetBehavior<V>.h hVar = this.f6738o;
                hVar.f6765h = i;
                C3403t.m14627a0(view, hVar);
                boolean unused = this.f6738o.f6764g = true;
                return;
            }
            this.f6738o.f6765h = i;
            return;
        }
        mo7666p0(i);
    }

    /* renamed from: x */
    public void mo2759x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C2066g gVar = (C2066g) parcelable;
        super.mo2759x(coordinatorLayout, v, gVar.mo11760a());
        m9430d0(gVar);
        int i = gVar.f6758h;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.f6749z = i;
    }

    /* renamed from: y */
    public Parcelable mo2760y(CoordinatorLayout coordinatorLayout, V v) {
        return new C2066g(super.mo2760y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }
}
