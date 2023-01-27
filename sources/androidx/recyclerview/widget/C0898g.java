package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.recyclerview.widget.g */
class C0898g extends RecyclerView.C0842n implements RecyclerView.C0851s {

    /* renamed from: D */
    private static final int[] f3600D = {16842919};

    /* renamed from: E */
    private static final int[] f3601E = new int[0];

    /* renamed from: A */
    int f3602A = 0;

    /* renamed from: B */
    private final Runnable f3603B = new C0899a();

    /* renamed from: C */
    private final RecyclerView.C0852t f3604C = new C0900b();

    /* renamed from: a */
    private final int f3605a;

    /* renamed from: b */
    private final int f3606b;

    /* renamed from: c */
    final StateListDrawable f3607c;

    /* renamed from: d */
    final Drawable f3608d;

    /* renamed from: e */
    private final int f3609e;

    /* renamed from: f */
    private final int f3610f;

    /* renamed from: g */
    private final StateListDrawable f3611g;

    /* renamed from: h */
    private final Drawable f3612h;

    /* renamed from: i */
    private final int f3613i;

    /* renamed from: j */
    private final int f3614j;

    /* renamed from: k */
    int f3615k;

    /* renamed from: l */
    int f3616l;

    /* renamed from: m */
    float f3617m;

    /* renamed from: n */
    int f3618n;

    /* renamed from: o */
    int f3619o;

    /* renamed from: p */
    float f3620p;

    /* renamed from: q */
    private int f3621q = 0;

    /* renamed from: r */
    private int f3622r = 0;

    /* renamed from: s */
    private RecyclerView f3623s;

    /* renamed from: t */
    private boolean f3624t = false;

    /* renamed from: u */
    private boolean f3625u = false;

    /* renamed from: v */
    private int f3626v = 0;

    /* renamed from: w */
    private int f3627w = 0;

    /* renamed from: x */
    private final int[] f3628x = new int[2];

    /* renamed from: y */
    private final int[] f3629y = new int[2];

    /* renamed from: z */
    final ValueAnimator f3630z = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: androidx.recyclerview.widget.g$a */
    class C0899a implements Runnable {
        C0899a() {
        }

        public void run() {
            C0898g.this.mo4768q(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    class C0900b extends RecyclerView.C0852t {
        C0900b() {
        }

        /* renamed from: b */
        public void mo4528b(RecyclerView recyclerView, int i, int i2) {
            C0898g.this.mo4766B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    private class C0901c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3633a = false;

        C0901c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f3633a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3633a) {
                this.f3633a = false;
            } else if (((Float) C0898g.this.f3630z.getAnimatedValue()).floatValue() == 0.0f) {
                C0898g gVar = C0898g.this;
                gVar.f3602A = 0;
                gVar.mo4772y(0);
            } else {
                C0898g gVar2 = C0898g.this;
                gVar2.f3602A = 2;
                gVar2.mo4771v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    private class C0902d implements ValueAnimator.AnimatorUpdateListener {
        C0902d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0898g.this.f3607c.setAlpha(floatValue);
            C0898g.this.f3608d.setAlpha(floatValue);
            C0898g.this.mo4771v();
        }
    }

    C0898g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f3607c = stateListDrawable;
        this.f3608d = drawable;
        this.f3611g = stateListDrawable2;
        this.f3612h = drawable2;
        this.f3609e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3610f = Math.max(i, drawable.getIntrinsicWidth());
        this.f3613i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3614j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3605a = i2;
        this.f3606b = i3;
        this.f3607c.setAlpha(255);
        this.f3608d.setAlpha(255);
        this.f3630z.addListener(new C0901c());
        this.f3630z.addUpdateListener(new C0902d());
        mo4767j(recyclerView);
    }

    /* renamed from: C */
    private void m4994C(float f) {
        int[] p = m5000p();
        float max = Math.max((float) p[0], Math.min((float) p[1], f));
        if (Math.abs(((float) this.f3616l) - max) >= 2.0f) {
            int x = m5004x(this.f3617m, max, p, this.f3623s.computeVerticalScrollRange(), this.f3623s.computeVerticalScrollOffset(), this.f3622r);
            if (x != 0) {
                this.f3623s.scrollBy(0, x);
            }
            this.f3617m = max;
        }
    }

    /* renamed from: k */
    private void m4995k() {
        this.f3623s.removeCallbacks(this.f3603B);
    }

    /* renamed from: l */
    private void m4996l() {
        this.f3623s.mo4138X0(this);
        this.f3623s.mo4140Y0(this);
        this.f3623s.mo4142Z0(this.f3604C);
        m4995k();
    }

    /* renamed from: m */
    private void m4997m(Canvas canvas) {
        int i = this.f3622r;
        int i2 = this.f3613i;
        int i3 = i - i2;
        int i4 = this.f3619o;
        int i5 = this.f3618n;
        int i6 = i4 - (i5 / 2);
        this.f3611g.setBounds(0, 0, i5, i2);
        this.f3612h.setBounds(0, 0, this.f3621q, this.f3614j);
        canvas.translate(0.0f, (float) i3);
        this.f3612h.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f3611g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: n */
    private void m4998n(Canvas canvas) {
        int i = this.f3621q;
        int i2 = this.f3609e;
        int i3 = i - i2;
        int i4 = this.f3616l;
        int i5 = this.f3615k;
        int i6 = i4 - (i5 / 2);
        this.f3607c.setBounds(0, 0, i2, i5);
        this.f3608d.setBounds(0, 0, this.f3610f, this.f3622r);
        if (m5002s()) {
            this.f3608d.draw(canvas);
            canvas.translate((float) this.f3609e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f3607c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f3609e;
        } else {
            canvas.translate((float) i3, 0.0f);
            this.f3608d.draw(canvas);
            canvas.translate(0.0f, (float) i6);
            this.f3607c.draw(canvas);
        }
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: o */
    private int[] m4999o() {
        int[] iArr = this.f3629y;
        int i = this.f3606b;
        iArr[0] = i;
        iArr[1] = this.f3621q - i;
        return iArr;
    }

    /* renamed from: p */
    private int[] m5000p() {
        int[] iArr = this.f3628x;
        int i = this.f3606b;
        iArr[0] = i;
        iArr[1] = this.f3622r - i;
        return iArr;
    }

    /* renamed from: r */
    private void m5001r(float f) {
        int[] o = m4999o();
        float max = Math.max((float) o[0], Math.min((float) o[1], f));
        if (Math.abs(((float) this.f3619o) - max) >= 2.0f) {
            int x = m5004x(this.f3620p, max, o, this.f3623s.computeHorizontalScrollRange(), this.f3623s.computeHorizontalScrollOffset(), this.f3621q);
            if (x != 0) {
                this.f3623s.scrollBy(x, 0);
            }
            this.f3620p = max;
        }
    }

    /* renamed from: s */
    private boolean m5002s() {
        return C3403t.m14674y(this.f3623s) == 1;
    }

    /* renamed from: w */
    private void m5003w(int i) {
        m4995k();
        this.f3623s.postDelayed(this.f3603B, (long) i);
    }

    /* renamed from: x */
    private int m5004x(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: z */
    private void m5005z() {
        this.f3623s.mo4191h(this);
        this.f3623s.mo4198j(this);
        this.f3623s.mo4199k(this.f3604C);
    }

    /* renamed from: A */
    public void mo4765A() {
        int i = this.f3602A;
        if (i != 0) {
            if (i == 3) {
                this.f3630z.cancel();
            } else {
                return;
            }
        }
        this.f3602A = 1;
        ValueAnimator valueAnimator = this.f3630z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f3630z.setDuration(500);
        this.f3630z.setStartDelay(0);
        this.f3630z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo4766B(int i, int i2) {
        int computeVerticalScrollRange = this.f3623s.computeVerticalScrollRange();
        int i3 = this.f3622r;
        this.f3624t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f3605a;
        int computeHorizontalScrollRange = this.f3623s.computeHorizontalScrollRange();
        int i4 = this.f3621q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f3605a;
        this.f3625u = z;
        if (this.f3624t || z) {
            if (this.f3624t) {
                float f = (float) i3;
                this.f3616l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f3615k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f3625u) {
                float f2 = (float) i4;
                this.f3619o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f3618n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f3626v;
            if (i5 == 0 || i5 == 1) {
                mo4772y(1);
            }
        } else if (this.f3626v != 0) {
            mo4772y(0);
        }
    }

    /* renamed from: a */
    public boolean mo4524a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f3626v;
        if (i != 1) {
            return i == 2;
        }
        boolean u = mo4770u(motionEvent.getX(), motionEvent.getY());
        boolean t = mo4769t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!u && !t) {
            return false;
        }
        if (t) {
            this.f3627w = 1;
            this.f3620p = (float) ((int) motionEvent.getX());
        } else if (u) {
            this.f3627w = 2;
            this.f3617m = (float) ((int) motionEvent.getY());
        }
        mo4772y(2);
    }

    /* renamed from: b */
    public void mo4525b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3626v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u = mo4770u(motionEvent.getX(), motionEvent.getY());
                boolean t = mo4769t(motionEvent.getX(), motionEvent.getY());
                if (u || t) {
                    if (t) {
                        this.f3627w = 1;
                        this.f3620p = (float) ((int) motionEvent.getX());
                    } else if (u) {
                        this.f3627w = 2;
                        this.f3617m = (float) ((int) motionEvent.getY());
                    }
                    mo4772y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3626v == 2) {
                this.f3617m = 0.0f;
                this.f3620p = 0.0f;
                mo4772y(1);
                this.f3627w = 0;
            } else if (motionEvent.getAction() == 2 && this.f3626v == 2) {
                mo4765A();
                if (this.f3627w == 1) {
                    m5001r(motionEvent.getX());
                }
                if (this.f3627w == 2) {
                    m4994C(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4526c(boolean z) {
    }

    /* renamed from: i */
    public void mo3952i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0823a0 a0Var) {
        if (this.f3621q != this.f3623s.getWidth() || this.f3622r != this.f3623s.getHeight()) {
            this.f3621q = this.f3623s.getWidth();
            this.f3622r = this.f3623s.getHeight();
            mo4772y(0);
        } else if (this.f3602A != 0) {
            if (this.f3624t) {
                m4998n(canvas);
            }
            if (this.f3625u) {
                m4997m(canvas);
            }
        }
    }

    /* renamed from: j */
    public void mo4767j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3623s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m4996l();
            }
            this.f3623s = recyclerView;
            if (recyclerView != null) {
                m5005z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4768q(int i) {
        int i2 = this.f3602A;
        if (i2 == 1) {
            this.f3630z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f3602A = 3;
        ValueAnimator valueAnimator = this.f3630z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f3630z.setDuration((long) i);
        this.f3630z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo4769t(float f, float f2) {
        if (f2 >= ((float) (this.f3622r - this.f3613i))) {
            int i = this.f3619o;
            int i2 = this.f3618n;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo4770u(float f, float f2) {
        if (!m5002s() ? f >= ((float) (this.f3621q - this.f3609e)) : f <= ((float) (this.f3609e / 2))) {
            int i = this.f3616l;
            int i2 = this.f3615k;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4771v() {
        this.f3623s.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4772y(int i) {
        int i2;
        if (i == 2 && this.f3626v != 2) {
            this.f3607c.setState(f3600D);
            m4995k();
        }
        if (i == 0) {
            mo4771v();
        } else {
            mo4765A();
        }
        if (this.f3626v != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f3626v = i;
        }
        this.f3607c.setState(f3601E);
        i2 = 1200;
        m5003w(i2);
        this.f3626v = i;
    }
}
