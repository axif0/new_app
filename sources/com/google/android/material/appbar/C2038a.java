package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p086f.p111h.p122m.C3403t;

/* renamed from: com.google.android.material.appbar.a */
abstract class C2038a<V extends View> extends C2041c<V> {

    /* renamed from: d */
    private Runnable f6621d;

    /* renamed from: e */
    OverScroller f6622e;

    /* renamed from: f */
    private boolean f6623f;

    /* renamed from: g */
    private int f6624g = -1;

    /* renamed from: h */
    private int f6625h;

    /* renamed from: i */
    private int f6626i = -1;

    /* renamed from: j */
    private VelocityTracker f6627j;

    /* renamed from: com.google.android.material.appbar.a$a */
    private class C2039a implements Runnable {

        /* renamed from: f */
        private final CoordinatorLayout f6628f;

        /* renamed from: g */
        private final V f6629g;

        C2039a(CoordinatorLayout coordinatorLayout, V v) {
            this.f6628f = coordinatorLayout;
            this.f6629g = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f6629g != null && (overScroller = C2038a.this.f6622e) != null) {
                if (overScroller.computeScrollOffset()) {
                    C2038a aVar = C2038a.this;
                    aVar.mo7571P(this.f6628f, this.f6629g, aVar.f6622e.getCurrY());
                    C3403t.m14627a0(this.f6629g, this);
                    return;
                }
                C2038a.this.mo7534N(this.f6628f, this.f6629g);
            }
        }
    }

    public C2038a() {
    }

    public C2038a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: I */
    private void m9289I() {
        if (this.f6627j == null) {
            this.f6627j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2735D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = 1
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f6624g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f6625h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f6624g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f6625h
            int r7 = r1 - r0
            r11.f6625h = r0
            int r8 = r11.mo7531K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.mo7570O(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = 0
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f6627j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f6627j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f6627j
            int r4 = r11.f6624g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo7532L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo7569J(r6, r7, r8, r9, r10)
            r12 = 1
            goto L_0x0073
        L_0x0072:
            r12 = 0
        L_0x0073:
            r11.f6623f = r3
            r11.f6624g = r1
            android.view.VelocityTracker r13 = r11.f6627j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f6627j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f6627j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f6623f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C2038a.mo2735D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract boolean mo7530H(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean mo7569J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f6621d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f6621d = null;
        }
        if (this.f6622e == null) {
            this.f6622e = new OverScroller(v.getContext());
        }
        this.f6622e.fling(0, mo7579E(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f6622e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C2039a aVar = new C2039a(coordinatorLayout, v);
            this.f6621d = aVar;
            C3403t.m14627a0(v, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo7534N(coordinatorLayout, v);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public abstract int mo7531K(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public abstract int mo7532L(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public abstract int mo7533M();

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public abstract void mo7534N(CoordinatorLayout coordinatorLayout, V v);

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final int mo7570O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo7535Q(coordinatorLayout, v, mo7533M() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public int mo7571P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo7535Q(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public abstract int mo7535Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* renamed from: k */
    public boolean mo2746k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f6626i < 0) {
            this.f6626i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f6623f) {
            int i = this.f6624g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f6625h) > this.f6626i) {
                this.f6625h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f6624g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo7530H(v) && coordinatorLayout.mo2680B(v, x, y2);
            this.f6623f = z;
            if (z) {
                this.f6625h = y2;
                this.f6624g = motionEvent.getPointerId(0);
                m9289I();
                OverScroller overScroller = this.f6622e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f6622e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f6627j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
