package com.google.android.exoplayer2.p035ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.p035ui.C1543i;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: com.google.android.exoplayer2.ui.DefaultTimeBar */
public class DefaultTimeBar extends View implements C1543i {

    /* renamed from: A */
    private final Runnable f5142A;

    /* renamed from: B */
    private final CopyOnWriteArraySet<C1543i.C1544a> f5143B;

    /* renamed from: C */
    private int f5144C;

    /* renamed from: D */
    private long f5145D;

    /* renamed from: E */
    private int f5146E;

    /* renamed from: F */
    private int[] f5147F;

    /* renamed from: G */
    private Point f5148G;

    /* renamed from: H */
    private boolean f5149H;

    /* renamed from: I */
    private long f5150I;

    /* renamed from: J */
    private long f5151J;

    /* renamed from: K */
    private long f5152K;

    /* renamed from: L */
    private long f5153L;

    /* renamed from: M */
    private int f5154M;

    /* renamed from: N */
    private long[] f5155N;

    /* renamed from: O */
    private boolean[] f5156O;

    /* renamed from: f */
    private final Rect f5157f = new Rect();

    /* renamed from: g */
    private final Rect f5158g = new Rect();

    /* renamed from: h */
    private final Rect f5159h = new Rect();

    /* renamed from: i */
    private final Rect f5160i = new Rect();

    /* renamed from: j */
    private final Paint f5161j = new Paint();

    /* renamed from: k */
    private final Paint f5162k = new Paint();

    /* renamed from: l */
    private final Paint f5163l = new Paint();

    /* renamed from: m */
    private final Paint f5164m = new Paint();

    /* renamed from: n */
    private final Paint f5165n = new Paint();

    /* renamed from: o */
    private final Paint f5166o;

    /* renamed from: p */
    private final Drawable f5167p;

    /* renamed from: q */
    private final int f5168q;

    /* renamed from: r */
    private final int f5169r;

    /* renamed from: s */
    private final int f5170s;

    /* renamed from: t */
    private final int f5171t;

    /* renamed from: u */
    private final int f5172u;

    /* renamed from: v */
    private final int f5173v;

    /* renamed from: w */
    private final int f5174w;

    /* renamed from: x */
    private final int f5175x;

    /* renamed from: y */
    private final StringBuilder f5176y;

    /* renamed from: z */
    private final Formatter f5177z;

    /* renamed from: com.google.android.exoplayer2.ui.DefaultTimeBar$a */
    class C1528a implements Runnable {
        C1528a() {
        }

        public void run() {
            DefaultTimeBar.this.m7360s(false);
        }
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f5166o = paint;
        paint.setAntiAlias(true);
        this.f5143B = new CopyOnWriteArraySet<>();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f5175x = m7345d(displayMetrics, -50);
        int d = m7345d(displayMetrics, 4);
        int d2 = m7345d(displayMetrics, 26);
        int d3 = m7345d(displayMetrics, 4);
        int d4 = m7345d(displayMetrics, 12);
        int d5 = m7345d(displayMetrics, 0);
        int d6 = m7345d(displayMetrics, 16);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1541g.DefaultTimeBar, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(C1541g.DefaultTimeBar_scrubber_drawable);
                this.f5167p = drawable;
                if (drawable != null) {
                    m7357p(drawable);
                    d2 = Math.max(this.f5167p.getMinimumHeight(), d2);
                }
                this.f5168q = obtainStyledAttributes.getDimensionPixelSize(C1541g.DefaultTimeBar_bar_height, d);
                this.f5169r = obtainStyledAttributes.getDimensionPixelSize(C1541g.DefaultTimeBar_touch_target_height, d2);
                this.f5170s = obtainStyledAttributes.getDimensionPixelSize(C1541g.DefaultTimeBar_ad_marker_width, d3);
                this.f5171t = obtainStyledAttributes.getDimensionPixelSize(C1541g.DefaultTimeBar_scrubber_enabled_size, d4);
                this.f5172u = obtainStyledAttributes.getDimensionPixelSize(C1541g.DefaultTimeBar_scrubber_disabled_size, d5);
                this.f5173v = obtainStyledAttributes.getDimensionPixelSize(C1541g.DefaultTimeBar_scrubber_dragged_size, d6);
                int i = obtainStyledAttributes.getInt(C1541g.DefaultTimeBar_played_color, -1);
                int i2 = obtainStyledAttributes.getInt(C1541g.DefaultTimeBar_scrubber_color, m7350i(i));
                int i3 = obtainStyledAttributes.getInt(C1541g.DefaultTimeBar_buffered_color, m7348g(i));
                int i4 = obtainStyledAttributes.getInt(C1541g.DefaultTimeBar_unplayed_color, m7351j(i));
                int i5 = obtainStyledAttributes.getInt(C1541g.DefaultTimeBar_ad_marker_color, -1291845888);
                int i6 = obtainStyledAttributes.getInt(C1541g.DefaultTimeBar_played_ad_marker_color, m7349h(i5));
                this.f5161j.setColor(i);
                this.f5166o.setColor(i2);
                this.f5162k.setColor(i3);
                this.f5163l.setColor(i4);
                this.f5164m.setColor(i5);
                this.f5165n.setColor(i6);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f5168q = d;
            this.f5169r = d2;
            this.f5170s = d3;
            this.f5171t = d4;
            this.f5172u = d5;
            this.f5173v = d6;
            this.f5161j.setColor(-1);
            this.f5166o.setColor(m7350i(-1));
            this.f5162k.setColor(m7348g(-1));
            this.f5163l.setColor(m7351j(-1));
            this.f5164m.setColor(-1291845888);
            this.f5167p = null;
        }
        this.f5176y = new StringBuilder();
        this.f5177z = new Formatter(this.f5176y, Locale.getDefault());
        this.f5142A = new C1528a();
        Drawable drawable2 = this.f5167p;
        this.f5174w = ((drawable2 != null ? drawable2.getMinimumWidth() : Math.max(this.f5172u, Math.max(this.f5171t, this.f5173v))) + 1) / 2;
        this.f5151J = -9223372036854775807L;
        this.f5145D = -9223372036854775807L;
        this.f5144C = 20;
        setFocusable(true);
        if (C4284w.f13659a >= 16) {
            m7353l();
        }
    }

    /* renamed from: d */
    private static int m7345d(DisplayMetrics displayMetrics, int i) {
        return (int) ((((float) i) * displayMetrics.density) + 0.5f);
    }

    /* renamed from: e */
    private void m7346e(Canvas canvas) {
        if (this.f5151J > 0) {
            Rect rect = this.f5160i;
            int i = C4284w.m18243i(rect.right, rect.left, this.f5158g.right);
            int centerY = this.f5160i.centerY();
            Drawable drawable = this.f5167p;
            if (drawable == null) {
                canvas.drawCircle((float) i, (float) centerY, (float) (((this.f5149H || isFocused()) ? this.f5173v : isEnabled() ? this.f5171t : this.f5172u) / 2), this.f5166o);
                return;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.f5167p.getIntrinsicHeight() / 2;
            this.f5167p.setBounds(i - intrinsicWidth, centerY - intrinsicHeight, i + intrinsicWidth, centerY + intrinsicHeight);
            this.f5167p.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m7347f(Canvas canvas) {
        int height = this.f5158g.height();
        int centerY = this.f5158g.centerY() - (height / 2);
        int i = height + centerY;
        if (this.f5151J <= 0) {
            Rect rect = this.f5158g;
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i, this.f5163l);
            return;
        }
        Rect rect2 = this.f5159h;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.f5158g.left, i3), this.f5160i.right);
        int i4 = this.f5158g.right;
        if (max < i4) {
            canvas.drawRect((float) max, (float) centerY, (float) i4, (float) i, this.f5163l);
        }
        int max2 = Math.max(i2, this.f5160i.right);
        if (i3 > max2) {
            canvas.drawRect((float) max2, (float) centerY, (float) i3, (float) i, this.f5162k);
        }
        if (this.f5160i.width() > 0) {
            Rect rect3 = this.f5160i;
            canvas.drawRect((float) rect3.left, (float) centerY, (float) rect3.right, (float) i, this.f5161j);
        }
        int i5 = this.f5170s / 2;
        for (int i6 = 0; i6 < this.f5154M; i6++) {
            long j = C4284w.m18244j(this.f5155N[i6], 0, this.f5151J);
            Rect rect4 = this.f5158g;
            int min = rect4.left + Math.min(rect4.width() - this.f5170s, Math.max(0, ((int) ((((long) this.f5158g.width()) * j) / this.f5151J)) - i5));
            canvas.drawRect((float) min, (float) centerY, (float) (min + this.f5170s), (float) i, this.f5156O[i6] ? this.f5165n : this.f5164m);
        }
    }

    /* renamed from: g */
    public static int m7348g(int i) {
        return (i & 16777215) | -872415232;
    }

    private long getPositionIncrement() {
        long j = this.f5145D;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f5151J;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        return j2 / ((long) this.f5144C);
    }

    private String getProgressText() {
        return C4284w.m18255u(this.f5176y, this.f5177z, this.f5152K);
    }

    private long getScrubberPosition() {
        if (this.f5158g.width() <= 0 || this.f5151J == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.f5160i.width()) * this.f5151J) / ((long) this.f5158g.width());
    }

    /* renamed from: h */
    public static int m7349h(int i) {
        return (i & 16777215) | 855638016;
    }

    /* renamed from: i */
    public static int m7350i(int i) {
        return i | -16777216;
    }

    /* renamed from: j */
    public static int m7351j(int i) {
        return (i & 16777215) | 855638016;
    }

    /* renamed from: k */
    private boolean m7352k(float f, float f2) {
        return this.f5157f.contains((int) f, (int) f2);
    }

    @TargetApi(16)
    /* renamed from: l */
    private void m7353l() {
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: m */
    private void m7354m(float f) {
        Rect rect = this.f5160i;
        Rect rect2 = this.f5158g;
        rect.right = C4284w.m18243i((int) f, rect2.left, rect2.right);
    }

    /* renamed from: n */
    private Point m7355n(MotionEvent motionEvent) {
        if (this.f5147F == null) {
            this.f5147F = new int[2];
            this.f5148G = new Point();
        }
        getLocationOnScreen(this.f5147F);
        this.f5148G.set(((int) motionEvent.getRawX()) - this.f5147F[0], ((int) motionEvent.getRawY()) - this.f5147F[1]);
        return this.f5148G;
    }

    /* renamed from: o */
    private boolean m7356o(long j) {
        if (this.f5151J <= 0) {
            return false;
        }
        long scrubberPosition = getScrubberPosition();
        long j2 = C4284w.m18244j(scrubberPosition + j, 0, this.f5151J);
        this.f5150I = j2;
        if (j2 == scrubberPosition) {
            return false;
        }
        if (!this.f5149H) {
            m7359r();
        }
        Iterator<C1543i.C1544a> it = this.f5143B.iterator();
        while (it.hasNext()) {
            it.next().mo6280f(this, this.f5150I);
        }
        m7361t();
        return true;
    }

    /* renamed from: p */
    private boolean m7357p(Drawable drawable) {
        return C4284w.f13659a >= 23 && m7358q(drawable, getLayoutDirection());
    }

    /* renamed from: q */
    private static boolean m7358q(Drawable drawable, int i) {
        return C4284w.f13659a >= 23 && drawable.setLayoutDirection(i);
    }

    /* renamed from: r */
    private void m7359r() {
        this.f5149H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<C1543i.C1544a> it = this.f5143B.iterator();
        while (it.hasNext()) {
            it.next().mo6282l(this, getScrubberPosition());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m7360s(boolean z) {
        this.f5149H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<C1543i.C1544a> it = this.f5143B.iterator();
        while (it.hasNext()) {
            it.next().mo6284n(this, getScrubberPosition(), z);
        }
    }

    /* renamed from: t */
    private void m7361t() {
        this.f5159h.set(this.f5158g);
        this.f5160i.set(this.f5158g);
        long j = this.f5149H ? this.f5150I : this.f5152K;
        if (this.f5151J > 0) {
            int width = (int) ((((long) this.f5158g.width()) * this.f5153L) / this.f5151J);
            Rect rect = this.f5159h;
            Rect rect2 = this.f5158g;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((((long) this.f5158g.width()) * j) / this.f5151J);
            Rect rect3 = this.f5160i;
            Rect rect4 = this.f5158g;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f5159h;
            int i = this.f5158g.left;
            rect5.right = i;
            this.f5160i.right = i;
        }
        invalidate(this.f5157f);
    }

    /* renamed from: u */
    private void m7362u() {
        Drawable drawable = this.f5167p;
        if (drawable != null && drawable.isStateful() && this.f5167p.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo6185a(long[] jArr, boolean[] zArr, int i) {
        C4260a.m18069a(i == 0 || !(jArr == null || zArr == null));
        this.f5154M = i;
        this.f5155N = jArr;
        this.f5156O = zArr;
        m7361t();
    }

    /* renamed from: b */
    public void mo6186b(C1543i.C1544a aVar) {
        this.f5143B.add(aVar);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m7362u();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5167p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        m7347f(canvas);
        m7346e(canvas);
        canvas.restore();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(DefaultTimeBar.class.getName());
    }

    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DefaultTimeBar.class.getCanonicalName());
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f5151J > 0) {
            int i = C4284w.f13659a;
            if (i >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            } else if (i >= 16) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.addAction(8192);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (m7356o(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.f5142A);
        postDelayed(r4.f5142A, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0036
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0036
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.m7356o(r0)
            if (r0 == 0) goto L_0x0036
            java.lang.Runnable r5 = r4.f5142A
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f5142A
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.f5149H
            if (r0 == 0) goto L_0x0036
            java.lang.Runnable r5 = r4.f5142A
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f5142A
            r5.run()
            return r3
        L_0x0036:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p035ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = ((i4 - i2) - this.f5169r) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int i6 = this.f5169r;
        int i7 = ((i6 - this.f5168q) / 2) + i5;
        this.f5157f.set(paddingLeft, i5, paddingRight, i6 + i5);
        Rect rect = this.f5158g;
        Rect rect2 = this.f5157f;
        int i8 = rect2.left;
        int i9 = this.f5174w;
        rect.set(i8 + i9, i7, rect2.right - i9, this.f5168q + i7);
        m7361t();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f5169r;
        } else if (mode != 1073741824) {
            size = Math.min(this.f5169r, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        m7362u();
    }

    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f5167p;
        if (drawable != null && m7358q(drawable, i)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r3 != 3) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x0087
            long r2 = r7.f5151J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0011
            goto L_0x0087
        L_0x0011:
            android.graphics.Point r0 = r7.m7355n(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x0072
            r5 = 3
            if (r3 == r4) goto L_0x0063
            r6 = 2
            if (r3 == r6) goto L_0x0029
            if (r3 == r5) goto L_0x0063
            goto L_0x0087
        L_0x0029:
            boolean r8 = r7.f5149H
            if (r8 == 0) goto L_0x0087
            int r8 = r7.f5175x
            if (r0 >= r8) goto L_0x0038
            int r8 = r7.f5146E
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            goto L_0x003b
        L_0x0038:
            r7.f5146E = r2
            float r8 = (float) r2
        L_0x003b:
            r7.m7354m(r8)
            long r0 = r7.getScrubberPosition()
            r7.f5150I = r0
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ui.i$a> r8 = r7.f5143B
            java.util.Iterator r8 = r8.iterator()
        L_0x004a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r8.next()
            com.google.android.exoplayer2.ui.i$a r0 = (com.google.android.exoplayer2.p035ui.C1543i.C1544a) r0
            long r1 = r7.f5150I
            r0.mo6280f(r7, r1)
            goto L_0x004a
        L_0x005c:
            r7.m7361t()
            r7.invalidate()
            return r4
        L_0x0063:
            boolean r0 = r7.f5149H
            if (r0 == 0) goto L_0x0087
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x006e
            r1 = 1
        L_0x006e:
            r7.m7360s(r1)
            return r4
        L_0x0072:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.m7352k(r8, r0)
            if (r0 == 0) goto L_0x0087
            r7.m7359r()
            r7.m7354m(r8)
            long r0 = r7.getScrubberPosition()
            r7.f5150I = r0
            goto L_0x005c
        L_0x0087:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p035ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (m7356o(getPositionIncrement()) != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (m7356o(-getPositionIncrement()) != false) goto L_0x0021;
     */
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performAccessibilityAction(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            boolean r8 = super.performAccessibilityAction(r7, r8)
            r0 = 1
            if (r8 == 0) goto L_0x0008
            return r0
        L_0x0008:
            long r1 = r6.f5151J
            r3 = 0
            r8 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0012
            return r8
        L_0x0012:
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r7 != r1) goto L_0x0025
            long r1 = r6.getPositionIncrement()
            long r1 = -r1
            boolean r7 = r6.m7356o(r1)
            if (r7 == 0) goto L_0x0034
        L_0x0021:
            r6.m7360s(r8)
            goto L_0x0034
        L_0x0025:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r7 != r1) goto L_0x0039
            long r1 = r6.getPositionIncrement()
            boolean r7 = r6.m7356o(r1)
            if (r7 == 0) goto L_0x0034
            goto L_0x0021
        L_0x0034:
            r7 = 4
            r6.sendAccessibilityEvent(r7)
            return r0
        L_0x0039:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p035ui.DefaultTimeBar.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public void setBufferedPosition(long j) {
        this.f5153L = j;
        m7361t();
    }

    public void setDuration(long j) {
        this.f5151J = j;
        if (this.f5149H && j == -9223372036854775807L) {
            m7360s(true);
        }
        m7361t();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f5149H && !z) {
            m7360s(true);
        }
    }

    public void setKeyCountIncrement(int i) {
        C4260a.m18069a(i > 0);
        this.f5144C = i;
        this.f5145D = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        C4260a.m18069a(j > 0);
        this.f5144C = -1;
        this.f5145D = j;
    }

    public void setPosition(long j) {
        this.f5152K = j;
        setContentDescription(getProgressText());
        m7361t();
    }
}
