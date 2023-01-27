package p086f.p126j.p128b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p086f.p111h.p122m.C3403t;

/* renamed from: f.j.b.c */
public class C3441c {

    /* renamed from: w */
    private static final Interpolator f10769w = new C3442a();

    /* renamed from: a */
    private int f10770a;

    /* renamed from: b */
    private int f10771b;

    /* renamed from: c */
    private int f10772c = -1;

    /* renamed from: d */
    private float[] f10773d;

    /* renamed from: e */
    private float[] f10774e;

    /* renamed from: f */
    private float[] f10775f;

    /* renamed from: g */
    private float[] f10776g;

    /* renamed from: h */
    private int[] f10777h;

    /* renamed from: i */
    private int[] f10778i;

    /* renamed from: j */
    private int[] f10779j;

    /* renamed from: k */
    private int f10780k;

    /* renamed from: l */
    private VelocityTracker f10781l;

    /* renamed from: m */
    private float f10782m;

    /* renamed from: n */
    private float f10783n;

    /* renamed from: o */
    private int f10784o;

    /* renamed from: p */
    private int f10785p;

    /* renamed from: q */
    private OverScroller f10786q;

    /* renamed from: r */
    private final C3444c f10787r;

    /* renamed from: s */
    private View f10788s;

    /* renamed from: t */
    private boolean f10789t;

    /* renamed from: u */
    private final ViewGroup f10790u;

    /* renamed from: v */
    private final Runnable f10791v = new C3443b();

    /* renamed from: f.j.b.c$a */
    static class C3442a implements Interpolator {
        C3442a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: f.j.b.c$b */
    class C3443b implements Runnable {
        C3443b() {
        }

        public void run() {
            C3441c.this.mo11791J(0);
        }
    }

    /* renamed from: f.j.b.c$c */
    public static abstract class C3444c {
        /* renamed from: a */
        public abstract int mo3114a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo3115b(View view, int i, int i2);

        /* renamed from: c */
        public int mo11810c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo3116d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo7673e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo3117f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo3118g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo3119h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo3120i(View view, int i) {
        }

        /* renamed from: j */
        public abstract void mo3121j(int i);

        /* renamed from: k */
        public abstract void mo3122k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo3123l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo3124m(View view, int i);
    }

    private C3441c(Context context, ViewGroup viewGroup, C3444c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f10790u = viewGroup;
            this.f10787r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f10784o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f10771b = viewConfiguration.getScaledTouchSlop();
            this.f10782m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f10783n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f10786q = new OverScroller(context, f10769w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: C */
    private boolean m14834C(int i) {
        if (mo11788B(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: F */
    private void m14835F() {
        this.f10781l.computeCurrentVelocity(1000, this.f10782m);
        m14849p(m14841g(this.f10781l.getXVelocity(this.f10772c), this.f10783n, this.f10782m), m14841g(this.f10781l.getYVelocity(this.f10772c), this.f10783n, this.f10782m));
    }

    /* renamed from: G */
    private void m14836G(float f, float f2, int i) {
        int i2 = 1;
        if (!m14839c(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m14839c(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m14839c(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m14839c(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f10778i;
            iArr[i] = iArr[i] | i2;
            this.f10787r.mo3117f(i2, i);
        }
    }

    /* renamed from: H */
    private void m14837H(float f, float f2, int i) {
        m14852s(i);
        float[] fArr = this.f10773d;
        this.f10775f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f10774e;
        this.f10776g[i] = f2;
        fArr2[i] = f2;
        this.f10777h[i] = m14854x((int) f, (int) f2);
        this.f10780k |= 1 << i;
    }

    /* renamed from: I */
    private void m14838I(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m14834C(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f10775f[pointerId] = x;
                this.f10776g[pointerId] = y;
            }
        }
    }

    /* renamed from: c */
    private boolean m14839c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f10777h[i] & i2) != i2 || (this.f10785p & i2) == 0 || (this.f10779j[i] & i2) == i2 || (this.f10778i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f10771b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f10787r.mo3118g(i2)) {
            return (this.f10778i[i] & i2) == 0 && abs > ((float) this.f10771b);
        }
        int[] iArr = this.f10779j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: f */
    private boolean m14840f(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f10787r.mo3116d(view) > 0;
        boolean z2 = this.f10787r.mo7673e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f10771b) : z2 && Math.abs(f2) > ((float) this.f10771b);
        }
        int i = this.f10771b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: g */
    private float m14841g(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: h */
    private int m14842h(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: i */
    private void m14843i() {
        float[] fArr = this.f10773d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f10774e, 0.0f);
            Arrays.fill(this.f10775f, 0.0f);
            Arrays.fill(this.f10776g, 0.0f);
            Arrays.fill(this.f10777h, 0);
            Arrays.fill(this.f10778i, 0);
            Arrays.fill(this.f10779j, 0);
            this.f10780k = 0;
        }
    }

    /* renamed from: j */
    private void m14844j(int i) {
        if (this.f10773d != null && mo11788B(i)) {
            this.f10773d[i] = 0.0f;
            this.f10774e[i] = 0.0f;
            this.f10775f[i] = 0.0f;
            this.f10776g[i] = 0.0f;
            this.f10777h[i] = 0;
            this.f10778i[i] = 0;
            this.f10779j[i] = 0;
            this.f10780k = ((1 << i) ^ -1) & this.f10780k;
        }
    }

    /* renamed from: k */
    private int m14845k(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f10790u.getWidth();
        float f = (float) (width / 2);
        float q = f + (m14850q(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(q / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: l */
    private int m14846l(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int h = m14842h(i3, (int) this.f10783n, (int) this.f10782m);
        int h2 = m14842h(i4, (int) this.f10783n, (int) this.f10782m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(h);
        int abs4 = Math.abs(h2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (h != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (h2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m14845k(i, h, this.f10787r.mo3116d(view))) * f5) + (((float) m14845k(i2, h2, this.f10787r.mo7673e(view))) * f6));
    }

    /* renamed from: n */
    public static C3441c m14847n(ViewGroup viewGroup, float f, C3444c cVar) {
        C3441c o = m14848o(viewGroup, cVar);
        o.f10771b = (int) (((float) o.f10771b) * (1.0f / f));
        return o;
    }

    /* renamed from: o */
    public static C3441c m14848o(ViewGroup viewGroup, C3444c cVar) {
        return new C3441c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: p */
    private void m14849p(float f, float f2) {
        this.f10789t = true;
        this.f10787r.mo3123l(this.f10788s, f, f2);
        this.f10789t = false;
        if (this.f10770a == 1) {
            mo11791J(0);
        }
    }

    /* renamed from: q */
    private float m14850q(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: r */
    private void m14851r(int i, int i2, int i3, int i4) {
        int left = this.f10788s.getLeft();
        int top = this.f10788s.getTop();
        if (i3 != 0) {
            i = this.f10787r.mo3114a(this.f10788s, i, i3);
            C3403t.m14619T(this.f10788s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f10787r.mo3115b(this.f10788s, i2, i4);
            C3403t.m14620U(this.f10788s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f10787r.mo3122k(this.f10788s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: s */
    private void m14852s(int i) {
        float[] fArr = this.f10773d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f10773d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f10774e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f10775f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f10776g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f10777h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f10778i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f10779j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f10773d = fArr2;
            this.f10774e = fArr3;
            this.f10775f = fArr4;
            this.f10776g = fArr5;
            this.f10777h = iArr;
            this.f10778i = iArr2;
            this.f10779j = iArr3;
        }
    }

    /* renamed from: u */
    private boolean m14853u(int i, int i2, int i3, int i4) {
        int left = this.f10788s.getLeft();
        int top = this.f10788s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f10786q.abortAnimation();
            mo11791J(0);
            return false;
        }
        this.f10786q.startScroll(left, top, i5, i6, m14846l(this.f10788s, i5, i6, i3, i4));
        mo11791J(2);
        return true;
    }

    /* renamed from: x */
    private int m14854x(int i, int i2) {
        int i3 = i < this.f10790u.getLeft() + this.f10784o ? 1 : 0;
        if (i2 < this.f10790u.getTop() + this.f10784o) {
            i3 |= 4;
        }
        if (i > this.f10790u.getRight() - this.f10784o) {
            i3 |= 2;
        }
        return i2 > this.f10790u.getBottom() - this.f10784o ? i3 | 8 : i3;
    }

    /* renamed from: A */
    public boolean mo11787A(int i, int i2) {
        return mo11789D(this.f10788s, i, i2);
    }

    /* renamed from: B */
    public boolean mo11788B(int i) {
        return ((1 << i) & this.f10780k) != 0;
    }

    /* renamed from: D */
    public boolean mo11789D(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: E */
    public void mo11790E(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo11798a();
        }
        if (this.f10781l == null) {
            this.f10781l = VelocityTracker.obtain();
        }
        this.f10781l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f10770a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (m14834C(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.f10773d[pointerId];
                                float f2 = y - this.f10774e[pointerId];
                                m14836G(f, f2, pointerId);
                                if (this.f10770a != 1) {
                                    View t = mo11803t((int) x, (int) y);
                                    if (m14840f(t, f, f2) && mo11797P(t, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (m14834C(this.f10772c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f10772c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f10775f;
                        int i3 = this.f10772c;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f10776g[i3]);
                        m14851r(this.f10788s.getLeft() + i4, this.f10788s.getTop() + i5, i4, i5);
                    } else {
                        return;
                    }
                    m14838I(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        m14837H(x3, y3, pointerId2);
                        if (this.f10770a == 0) {
                            mo11797P(mo11803t((int) x3, (int) y3), pointerId2);
                            int i6 = this.f10777h[pointerId2];
                            int i7 = this.f10785p;
                            if ((i6 & i7) != 0) {
                                this.f10787r.mo3119h(i6 & i7, pointerId2);
                                return;
                            }
                            return;
                        } else if (mo11787A((int) x3, (int) y3)) {
                            mo11797P(this.f10788s, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f10770a == 1 && pointerId3 == this.f10772c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i2);
                                if (pointerId4 != this.f10772c) {
                                    View t2 = mo11803t((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view = this.f10788s;
                                    if (t2 == view && mo11797P(view, pointerId4)) {
                                        i = this.f10772c;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                m14835F();
                            }
                        }
                        m14844j(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f10770a == 1) {
                    m14849p(0.0f, 0.0f);
                }
            } else if (this.f10770a == 1) {
                m14835F();
            }
            mo11798a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View t3 = mo11803t((int) x4, (int) y4);
        m14837H(x4, y4, pointerId5);
        mo11797P(t3, pointerId5);
        int i8 = this.f10777h[pointerId5];
        int i9 = this.f10785p;
        if ((i8 & i9) != 0) {
            this.f10787r.mo3119h(i8 & i9, pointerId5);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo11791J(int i) {
        this.f10790u.removeCallbacks(this.f10791v);
        if (this.f10770a != i) {
            this.f10770a = i;
            this.f10787r.mo3121j(i);
            if (this.f10770a == 0) {
                this.f10788s = null;
            }
        }
    }

    /* renamed from: K */
    public void mo11792K(int i) {
        this.f10785p = i;
    }

    /* renamed from: L */
    public void mo11793L(float f) {
        this.f10783n = f;
    }

    /* renamed from: M */
    public boolean mo11794M(int i, int i2) {
        if (this.f10789t) {
            return m14853u(i, i2, (int) this.f10781l.getXVelocity(this.f10772c), (int) this.f10781l.getYVelocity(this.f10772c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11795N(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo11798a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f10781l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f10781l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f10781l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m14844j(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m14837H(r7, r1, r2)
            int r3 = r0.f10770a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f10777h
            r1 = r1[r2]
            int r3 = r0.f10785p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            f.j.b.c$c r4 = r0.f10787r
            r1 = r1 & r3
            r4.mo3119h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo11803t(r3, r1)
            android.view.View r3 = r0.f10788s
            if (r1 != r3) goto L_0x0031
            r0.mo11797P(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f10773d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f10774e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m14834C(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f10773d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f10774e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo11803t(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m14840f(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            f.j.b.c$c r14 = r0.f10787r
            int r12 = r14.mo3114a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            f.j.b.c$c r5 = r0.f10787r
            int r5 = r5.mo3115b(r7, r15, r14)
            f.j.b.c$c r14 = r0.f10787r
            int r14 = r14.mo3116d(r7)
            f.j.b.c$c r15 = r0.f10787r
            int r15 = r15.mo7673e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m14836G(r9, r10, r4)
            int r5 = r0.f10770a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo11797P(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m14838I(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo11798a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m14837H(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo11803t(r2, r3)
            android.view.View r3 = r0.f10788s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f10770a
            if (r3 != r4) goto L_0x0125
            r0.mo11797P(r2, r1)
        L_0x0125:
            int[] r2 = r0.f10777h
            r2 = r2[r1]
            int r3 = r0.f10785p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            f.j.b.c$c r4 = r0.f10787r
            r2 = r2 & r3
            r4.mo3119h(r2, r1)
        L_0x0135:
            int r1 = r0.f10770a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p126j.p128b.C3441c.mo11795N(android.view.MotionEvent):boolean");
    }

    /* renamed from: O */
    public boolean mo11796O(View view, int i, int i2) {
        this.f10788s = view;
        this.f10772c = -1;
        boolean u = m14853u(i, i2, 0, 0);
        if (!u && this.f10770a == 0 && this.f10788s != null) {
            this.f10788s = null;
        }
        return u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo11797P(View view, int i) {
        if (view == this.f10788s && this.f10772c == i) {
            return true;
        }
        if (view == null || !this.f10787r.mo3124m(view, i)) {
            return false;
        }
        this.f10772c = i;
        mo11799b(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo11798a() {
        this.f10772c = -1;
        m14843i();
        VelocityTracker velocityTracker = this.f10781l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10781l = null;
        }
    }

    /* renamed from: b */
    public void mo11799b(View view, int i) {
        if (view.getParent() == this.f10790u) {
            this.f10788s = view;
            this.f10772c = i;
            this.f10787r.mo3120i(view, i);
            mo11791J(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f10790u + ")");
    }

    /* renamed from: d */
    public boolean mo11800d(int i) {
        int length = this.f10773d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo11801e(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo11801e(int i, int i2) {
        if (!mo11788B(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f10775f[i2] - this.f10773d[i2];
        float f2 = this.f10776g[i2] - this.f10774e[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f10771b) : z2 && Math.abs(f2) > ((float) this.f10771b);
        }
        int i3 = this.f10771b;
        return (f * f) + (f2 * f2) > ((float) (i3 * i3));
    }

    /* renamed from: m */
    public boolean mo11802m(boolean z) {
        if (this.f10770a == 2) {
            boolean computeScrollOffset = this.f10786q.computeScrollOffset();
            int currX = this.f10786q.getCurrX();
            int currY = this.f10786q.getCurrY();
            int left = currX - this.f10788s.getLeft();
            int top = currY - this.f10788s.getTop();
            if (left != 0) {
                C3403t.m14619T(this.f10788s, left);
            }
            if (top != 0) {
                C3403t.m14620U(this.f10788s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f10787r.mo3122k(this.f10788s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f10786q.getFinalX() && currY == this.f10786q.getFinalY()) {
                this.f10786q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f10790u.post(this.f10791v);
                } else {
                    mo11791J(0);
                }
            }
        }
        return this.f10770a == 2;
    }

    /* renamed from: t */
    public View mo11803t(int i, int i2) {
        for (int childCount = this.f10790u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f10790u;
            this.f10787r.mo11810c(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: v */
    public View mo11804v() {
        return this.f10788s;
    }

    /* renamed from: w */
    public int mo11805w() {
        return this.f10784o;
    }

    /* renamed from: y */
    public int mo11806y() {
        return this.f10771b;
    }

    /* renamed from: z */
    public int mo11807z() {
        return this.f10770a;
    }
}
