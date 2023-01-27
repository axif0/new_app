package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p111h.p122m.p123c0.C3377f;
import p086f.p126j.p128b.C3441c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C0548c<V> {

    /* renamed from: a */
    C3441c f6651a;

    /* renamed from: b */
    C2047c f6652b;

    /* renamed from: c */
    private boolean f6653c;

    /* renamed from: d */
    private float f6654d = 0.0f;

    /* renamed from: e */
    private boolean f6655e;

    /* renamed from: f */
    int f6656f = 2;

    /* renamed from: g */
    float f6657g = 0.5f;

    /* renamed from: h */
    float f6658h = 0.0f;

    /* renamed from: i */
    float f6659i = 0.5f;

    /* renamed from: j */
    private final C3441c.C3444c f6660j = new C2045a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C2045a extends C3441c.C3444c {

        /* renamed from: a */
        private int f6661a;

        /* renamed from: b */
        private int f6662b = -1;

        C2045a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0025 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m9345n(android.view.View r6, float r7) {
            /*
                r5 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0036
                int r6 = p086f.p111h.p122m.C3403t.m14674y(r6)
                if (r6 != r2) goto L_0x000f
                r6 = 1
                goto L_0x0010
            L_0x000f:
                r6 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r3 = r3.f6656f
                r4 = 2
                if (r3 != r4) goto L_0x0018
                return r2
            L_0x0018:
                if (r3 != 0) goto L_0x0027
                if (r6 == 0) goto L_0x0021
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0026
                goto L_0x0025
            L_0x0021:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x0026
            L_0x0025:
                r1 = 1
            L_0x0026:
                return r1
            L_0x0027:
                if (r3 != r2) goto L_0x0035
                if (r6 == 0) goto L_0x0030
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x0035
                goto L_0x0034
            L_0x0030:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0035
            L_0x0034:
                r1 = 1
            L_0x0035:
                return r1
            L_0x0036:
                int r7 = r6.getLeft()
                int r0 = r5.f6661a
                int r7 = r7 - r0
                int r6 = r6.getWidth()
                float r6 = (float) r6
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f6657g
                float r6 = r6 * r0
                int r6 = java.lang.Math.round(r6)
                int r7 = java.lang.Math.abs(r7)
                if (r7 < r6) goto L_0x0053
                r1 = 1
            L_0x0053:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C2045a.m9345n(android.view.View, float):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f6661a;
            r3 = r3.getWidth() + r5;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3114a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = p086f.p111h.p122m.C3403t.m14674y(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f6656f
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f6661a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f6661a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f6661a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f6661a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f6661a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.m9333G(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C2045a.mo3114a(android.view.View, int, int):int");
        }

        /* renamed from: b */
        public int mo3115b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo3116d(View view) {
            return view.getWidth();
        }

        /* renamed from: i */
        public void mo3120i(View view, int i) {
            this.f6662b = i;
            this.f6661a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: j */
        public void mo3121j(int i) {
            C2047c cVar = SwipeDismissBehavior.this.f6652b;
            if (cVar != null) {
                cVar.mo7596b(i);
            }
        }

        /* renamed from: k */
        public void mo3122k(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f6661a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f6658h);
            float width2 = ((float) this.f6661a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f6659i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m9332F(0.0f, 1.0f - SwipeDismissBehavior.m9335I(width, width2, f), 1.0f));
            }
        }

        /* renamed from: l */
        public void mo3123l(View view, float f, float f2) {
            boolean z;
            int i;
            C2047c cVar;
            this.f6662b = -1;
            int width = view.getWidth();
            if (m9345n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f6661a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f6661a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f6651a.mo11794M(i, view.getTop())) {
                C3403t.m14627a0(view, new C2048d(view, z));
            } else if (z && (cVar = SwipeDismissBehavior.this.f6652b) != null) {
                cVar.mo7595a(view);
            }
        }

        /* renamed from: m */
        public boolean mo3124m(View view, int i) {
            int i2 = this.f6662b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo7590E(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    class C2046b implements C3377f {
        C2046b() {
        }

        /* renamed from: a */
        public boolean mo7550a(View view, C3377f.C3378a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.mo7590E(view)) {
                return false;
            }
            boolean z2 = C3403t.m14674y(view) == 1;
            if ((SwipeDismissBehavior.this.f6656f == 0 && z2) || (SwipeDismissBehavior.this.f6656f == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            C3403t.m14619T(view, width);
            view.setAlpha(0.0f);
            C2047c cVar = SwipeDismissBehavior.this.f6652b;
            if (cVar != null) {
                cVar.mo7595a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface C2047c {
        /* renamed from: a */
        void mo7595a(View view);

        /* renamed from: b */
        void mo7596b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    private class C2048d implements Runnable {

        /* renamed from: f */
        private final View f6665f;

        /* renamed from: g */
        private final boolean f6666g;

        C2048d(View view, boolean z) {
            this.f6665f = view;
            this.f6666g = z;
        }

        public void run() {
            C2047c cVar;
            C3441c cVar2 = SwipeDismissBehavior.this.f6651a;
            if (cVar2 != null && cVar2.mo11802m(true)) {
                C3403t.m14627a0(this.f6665f, this);
            } else if (this.f6666g && (cVar = SwipeDismissBehavior.this.f6652b) != null) {
                cVar.mo7595a(this.f6665f);
            }
        }
    }

    /* renamed from: F */
    static float m9332F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    static int m9333G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: H */
    private void m9334H(ViewGroup viewGroup) {
        if (this.f6651a == null) {
            this.f6651a = this.f6655e ? C3441c.m14847n(viewGroup, this.f6654d, this.f6660j) : C3441c.m14848o(viewGroup, this.f6660j);
        }
    }

    /* renamed from: I */
    static float m9335I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: N */
    private void m9336N(View view) {
        C3403t.m14631c0(view, 1048576);
        if (mo7590E(view)) {
            C3403t.m14635e0(view, C3369c.C3370a.f10678l, (CharSequence) null, new C2046b());
        }
    }

    /* renamed from: D */
    public boolean mo2735D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C3441c cVar = this.f6651a;
        if (cVar == null) {
            return false;
        }
        cVar.mo11790E(motionEvent);
        return true;
    }

    /* renamed from: E */
    public boolean mo7590E(View view) {
        return true;
    }

    /* renamed from: J */
    public void mo7591J(float f) {
        this.f6659i = m9332F(0.0f, f, 1.0f);
    }

    /* renamed from: K */
    public void mo7592K(C2047c cVar) {
        this.f6652b = cVar;
    }

    /* renamed from: L */
    public void mo7593L(float f) {
        this.f6658h = m9332F(0.0f, f, 1.0f);
    }

    /* renamed from: M */
    public void mo7594M(int i) {
        this.f6656f = i;
    }

    /* renamed from: k */
    public boolean mo2746k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f6653c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo2680B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f6653c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6653c = false;
        }
        if (!z) {
            return false;
        }
        m9334H(coordinatorLayout);
        return this.f6651a.mo11795N(motionEvent);
    }

    /* renamed from: l */
    public boolean mo2747l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean l = super.mo2747l(coordinatorLayout, v, i);
        if (C3403t.m14670w(v) == 0) {
            C3403t.m14663s0(v, 1);
            m9336N(v);
        }
        return l;
    }
}
