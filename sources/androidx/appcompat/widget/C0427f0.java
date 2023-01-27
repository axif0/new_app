package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.C0355p;

/* renamed from: androidx.appcompat.widget.f0 */
public abstract class C0427f0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final float f1669f;

    /* renamed from: g */
    private final int f1670g;

    /* renamed from: h */
    private final int f1671h;

    /* renamed from: i */
    final View f1672i;

    /* renamed from: j */
    private Runnable f1673j;

    /* renamed from: k */
    private Runnable f1674k;

    /* renamed from: l */
    private boolean f1675l;

    /* renamed from: m */
    private int f1676m;

    /* renamed from: n */
    private final int[] f1677n = new int[2];

    /* renamed from: androidx.appcompat.widget.f0$a */
    private class C0428a implements Runnable {
        C0428a() {
        }

        public void run() {
            ViewParent parent = C0427f0.this.f1672i.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$b */
    private class C0429b implements Runnable {
        C0429b() {
        }

        public void run() {
            C0427f0.this.mo2064e();
        }
    }

    public C0427f0(View view) {
        this.f1672i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1669f = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1670g = tapTimeout;
        this.f1671h = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m1932a() {
        Runnable runnable = this.f1674k;
        if (runnable != null) {
            this.f1672i.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1673j;
        if (runnable2 != null) {
            this.f1672i.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m1933f(MotionEvent motionEvent) {
        C0420d0 d0Var;
        View view = this.f1672i;
        C0355p b = mo1050b();
        if (b == null || !b.mo1150c() || (d0Var = (C0420d0) b.mo1155i()) == null || !d0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1936i(view, obtainNoHistory);
        m1937j(d0Var, obtainNoHistory);
        boolean e = d0Var.mo2015e(obtainNoHistory, this.f1676m);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1934g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1672i
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1676m
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1669f
            boolean r6 = m1935h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m1932a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m1932a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1676m = r6
            java.lang.Runnable r6 = r5.f1673j
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.f0$a r6 = new androidx.appcompat.widget.f0$a
            r6.<init>()
            r5.f1673j = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1673j
            int r1 = r5.f1670g
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1674k
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.f0$b r6 = new androidx.appcompat.widget.f0$b
            r6.<init>()
            r5.f1674k = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1674k
            int r1 = r5.f1671h
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0427f0.m1934g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m1935h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: i */
    private boolean m1936i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1677n;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m1937j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1677n;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    public abstract C0355p mo1050b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo1051c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo1999d() {
        C0355p b = mo1050b();
        if (b == null || !b.mo1150c()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2064e() {
        m1932a();
        View view = this.f1672i;
        if (view.isEnabled() && !view.isLongClickable() && mo1051c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1675l = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1675l;
        if (z2) {
            z = m1933f(motionEvent) || !mo1999d();
        } else {
            z = m1934g(motionEvent) && mo1051c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1672i.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1675l = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1675l = false;
        this.f1676m = -1;
        Runnable runnable = this.f1673j;
        if (runnable != null) {
            this.f1672i.removeCallbacks(runnable);
        }
    }
}
