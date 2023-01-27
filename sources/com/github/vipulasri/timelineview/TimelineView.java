package com.github.vipulasri.timelineview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class TimelineView extends View {

    /* renamed from: A */
    private int f4840A;

    /* renamed from: B */
    private int f4841B;

    /* renamed from: C */
    private int f4842C;

    /* renamed from: D */
    private int f4843D;

    /* renamed from: E */
    private int f4844E;

    /* renamed from: F */
    private Rect f4845F;

    /* renamed from: f */
    private Drawable f4846f;

    /* renamed from: g */
    private int f4847g;

    /* renamed from: h */
    private int f4848h;

    /* renamed from: i */
    private int f4849i;

    /* renamed from: j */
    private int f4850j;

    /* renamed from: k */
    private int f4851k;

    /* renamed from: l */
    private boolean f4852l;

    /* renamed from: m */
    private Paint f4853m = new Paint();

    /* renamed from: n */
    private boolean f4854n = false;

    /* renamed from: o */
    private boolean f4855o = false;

    /* renamed from: p */
    private float f4856p;

    /* renamed from: q */
    private float f4857q;

    /* renamed from: r */
    private float f4858r;

    /* renamed from: s */
    private float f4859s;

    /* renamed from: t */
    private float f4860t;

    /* renamed from: u */
    private float f4861u;

    /* renamed from: v */
    private float f4862v;

    /* renamed from: w */
    private float f4863w;

    /* renamed from: x */
    private int f4864x;

    /* renamed from: y */
    private int f4865y;

    /* renamed from: z */
    private int f4866z;

    static {
        Class<TimelineView> cls = TimelineView.class;
    }

    public TimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7055b(attributeSet);
    }

    /* renamed from: a */
    public static int m7054a(int i, int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i == 0) {
            return 1;
        }
        return i == i2 - 1 ? 2 : 0;
    }

    /* renamed from: b */
    private void m7055b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1426b.TimelineView);
        this.f4846f = obtainStyledAttributes.getDrawable(C1426b.TimelineView_marker);
        this.f4847g = obtainStyledAttributes.getDimensionPixelSize(C1426b.TimelineView_markerSize, C1427c.m7062a(20.0f, getContext()));
        this.f4848h = obtainStyledAttributes.getDimensionPixelSize(C1426b.TimelineView_markerPaddingLeft, 0);
        this.f4849i = obtainStyledAttributes.getDimensionPixelSize(C1426b.TimelineView_markerPaddingTop, 0);
        this.f4850j = obtainStyledAttributes.getDimensionPixelSize(C1426b.TimelineView_markerPaddingRight, 0);
        this.f4851k = obtainStyledAttributes.getDimensionPixelSize(C1426b.TimelineView_markerPaddingBottom, 0);
        this.f4852l = obtainStyledAttributes.getBoolean(C1426b.TimelineView_markerInCenter, true);
        this.f4864x = obtainStyledAttributes.getColor(C1426b.TimelineView_startLineColor, getResources().getColor(17170432));
        this.f4865y = obtainStyledAttributes.getColor(C1426b.TimelineView_endLineColor, getResources().getColor(17170432));
        this.f4866z = obtainStyledAttributes.getDimensionPixelSize(C1426b.TimelineView_lineWidth, C1427c.m7062a(2.0f, getContext()));
        this.f4840A = obtainStyledAttributes.getInt(C1426b.TimelineView_lineOrientation, 1);
        this.f4844E = obtainStyledAttributes.getDimensionPixelSize(C1426b.TimelineView_linePadding, 0);
        this.f4841B = obtainStyledAttributes.getInt(C1426b.TimelineView_lineStyle, 0);
        this.f4842C = obtainStyledAttributes.getDimensionPixelSize(C1426b.TimelineView_lineStyleDashLength, C1427c.m7062a(8.0f, getContext()));
        this.f4843D = obtainStyledAttributes.getDimensionPixelSize(C1426b.TimelineView_lineStyleDashGap, C1427c.m7062a(4.0f, getContext()));
        obtainStyledAttributes.recycle();
        if (isInEditMode()) {
            this.f4854n = true;
            this.f4855o = true;
        }
        if (this.f4846f == null) {
            this.f4846f = getResources().getDrawable(C1425a.marker);
        }
        m7057e();
        m7056d();
        setLayerType(1, (Paint) null);
    }

    /* renamed from: d */
    private void m7056d() {
        this.f4853m.setAlpha(0);
        this.f4853m.setAntiAlias(true);
        this.f4853m.setColor(this.f4864x);
        this.f4853m.setStyle(Paint.Style.STROKE);
        this.f4853m.setStrokeWidth((float) this.f4866z);
        if (this.f4841B == 1) {
            this.f4853m.setPathEffect(new DashPathEffect(new float[]{(float) this.f4842C, (float) this.f4843D}, 0.0f));
        } else {
            this.f4853m.setPathEffect(new PathEffect());
        }
        invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f6  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7057e() {
        /*
            r10 = this;
            int r0 = r10.getPaddingLeft()
            int r1 = r10.getPaddingRight()
            int r2 = r10.getPaddingTop()
            int r3 = r10.getPaddingBottom()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = r4 - r0
            int r6 = r6 - r1
            int r1 = r5 - r2
            int r1 = r1 - r3
            int r3 = r10.f4847g
            int r1 = java.lang.Math.min(r6, r1)
            int r1 = java.lang.Math.min(r3, r1)
            boolean r3 = r10.f4852l
            r6 = 1
            if (r3 == 0) goto L_0x005b
            int r4 = r4 / 2
            int r1 = r1 / 2
            int r3 = r4 - r1
            int r5 = r5 / 2
            int r7 = r5 - r1
            int r4 = r4 + r1
            int r5 = r5 + r1
            int r1 = r10.f4840A
            if (r1 == 0) goto L_0x004a
            if (r1 == r6) goto L_0x0040
            goto L_0x0053
        L_0x0040:
            int r1 = r10.f4849i
            int r8 = r10.f4851k
            int r9 = r1 - r8
            int r7 = r7 + r9
            int r1 = r1 - r8
            int r5 = r5 + r1
            goto L_0x0053
        L_0x004a:
            int r1 = r10.f4848h
            int r8 = r10.f4850j
            int r9 = r1 - r8
            int r3 = r3 + r9
            int r1 = r1 - r8
            int r4 = r4 + r1
        L_0x0053:
            android.graphics.drawable.Drawable r1 = r10.f4846f
            if (r1 == 0) goto L_0x008c
            r1.setBounds(r3, r7, r4, r5)
            goto L_0x0084
        L_0x005b:
            int r3 = r0 + r1
            int r4 = r10.f4840A
            if (r4 == 0) goto L_0x0073
            if (r4 == r6) goto L_0x0067
            r5 = r0
        L_0x0064:
            r1 = r2
            r7 = r1
            goto L_0x007d
        L_0x0067:
            int r4 = r10.f4849i
            int r5 = r10.f4851k
            int r7 = r4 - r5
            int r7 = r7 + r2
            int r1 = r1 + r4
            int r1 = r1 - r5
            int r1 = r1 + r2
            r5 = r0
            goto L_0x007d
        L_0x0073:
            int r1 = r10.f4848h
            int r4 = r10.f4850j
            int r5 = r1 - r4
            int r5 = r5 + r0
            int r1 = r1 - r4
            int r3 = r3 + r1
            goto L_0x0064
        L_0x007d:
            android.graphics.drawable.Drawable r4 = r10.f4846f
            if (r4 == 0) goto L_0x008c
            r4.setBounds(r5, r7, r3, r1)
        L_0x0084:
            android.graphics.drawable.Drawable r1 = r10.f4846f
            android.graphics.Rect r1 = r1.getBounds()
            r10.f4845F = r1
        L_0x008c:
            int r1 = r10.f4840A
            if (r1 != 0) goto L_0x00f6
            boolean r1 = r10.f4854n
            if (r1 == 0) goto L_0x00b1
            float r0 = (float) r0
            r10.f4856p = r0
            android.graphics.Rect r0 = r10.f4845F
            int r0 = r0.centerY()
            float r0 = (float) r0
            r10.f4857q = r0
            android.graphics.Rect r0 = r10.f4845F
            int r1 = r0.left
            int r2 = r10.f4844E
            int r1 = r1 - r2
            float r1 = (float) r1
            r10.f4858r = r1
            int r0 = r0.centerY()
            float r0 = (float) r0
            r10.f4859s = r0
        L_0x00b1:
            boolean r0 = r10.f4855o
            if (r0 == 0) goto L_0x0166
            int r0 = r10.f4841B
            if (r0 != r6) goto L_0x00d7
            int r0 = r10.getWidth()
            int r1 = r10.f4843D
            int r0 = r0 - r1
            float r0 = (float) r0
            r10.f4860t = r0
            android.graphics.Rect r0 = r10.f4845F
            int r0 = r0.centerY()
            float r0 = (float) r0
            r10.f4861u = r0
            android.graphics.Rect r0 = r10.f4845F
            int r1 = r0.right
            int r2 = r10.f4844E
            int r1 = r1 + r2
            float r1 = (float) r1
            r10.f4862v = r1
            goto L_0x00f1
        L_0x00d7:
            android.graphics.Rect r0 = r10.f4845F
            int r1 = r0.right
            int r2 = r10.f4844E
            int r1 = r1 + r2
            float r1 = (float) r1
            r10.f4860t = r1
            int r0 = r0.centerY()
            float r0 = (float) r0
            r10.f4861u = r0
            int r0 = r10.getWidth()
            float r0 = (float) r0
            r10.f4862v = r0
            android.graphics.Rect r0 = r10.f4845F
        L_0x00f1:
            int r0 = r0.centerY()
            goto L_0x0163
        L_0x00f6:
            boolean r0 = r10.f4854n
            if (r0 == 0) goto L_0x0119
            android.graphics.Rect r0 = r10.f4845F
            int r0 = r0.centerX()
            float r0 = (float) r0
            r10.f4856p = r0
            float r0 = (float) r2
            r10.f4857q = r0
            android.graphics.Rect r0 = r10.f4845F
            int r0 = r0.centerX()
            float r0 = (float) r0
            r10.f4858r = r0
            android.graphics.Rect r0 = r10.f4845F
            int r0 = r0.top
            int r1 = r10.f4844E
            int r0 = r0 - r1
            float r0 = (float) r0
            r10.f4859s = r0
        L_0x0119:
            boolean r0 = r10.f4855o
            if (r0 == 0) goto L_0x0166
            int r0 = r10.f4841B
            if (r0 != r6) goto L_0x0145
            android.graphics.Rect r0 = r10.f4845F
            int r0 = r0.centerX()
            float r0 = (float) r0
            r10.f4860t = r0
            int r0 = r10.getHeight()
            int r1 = r10.f4843D
            int r0 = r0 - r1
            float r0 = (float) r0
            r10.f4861u = r0
            android.graphics.Rect r0 = r10.f4845F
            int r0 = r0.centerX()
            float r0 = (float) r0
            r10.f4862v = r0
            android.graphics.Rect r0 = r10.f4845F
            int r0 = r0.bottom
            int r1 = r10.f4844E
            int r0 = r0 + r1
            goto L_0x0163
        L_0x0145:
            android.graphics.Rect r0 = r10.f4845F
            int r0 = r0.centerX()
            float r0 = (float) r0
            r10.f4860t = r0
            android.graphics.Rect r0 = r10.f4845F
            int r1 = r0.bottom
            int r2 = r10.f4844E
            int r1 = r1 + r2
            float r1 = (float) r1
            r10.f4861u = r1
            int r0 = r0.centerX()
            float r0 = (float) r0
            r10.f4862v = r0
            int r0 = r10.getHeight()
        L_0x0163:
            float r0 = (float) r0
            r10.f4863w = r0
        L_0x0166:
            r10.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.vipulasri.timelineview.TimelineView.m7057e():void");
    }

    /* renamed from: g */
    private void m7058g(boolean z) {
        this.f4855o = z;
    }

    /* renamed from: h */
    private void m7059h(boolean z) {
        this.f4854n = z;
    }

    /* renamed from: c */
    public void mo5954c(int i) {
        if (i == 1) {
            m7059h(false);
        } else {
            if (i == 2) {
                m7059h(true);
            } else if (i == 3) {
                m7059h(false);
            } else {
                m7059h(true);
            }
            m7058g(false);
            m7057e();
        }
        m7058g(true);
        m7057e();
    }

    /* renamed from: f */
    public void mo5955f(Drawable drawable, int i) {
        this.f4846f = drawable;
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        m7057e();
    }

    public int getEndLineColor() {
        return this.f4865y;
    }

    public int getLineOrientation() {
        return this.f4840A;
    }

    public int getLinePadding() {
        return this.f4844E;
    }

    public int getLineStyle() {
        return this.f4841B;
    }

    public int getLineStyleDashGap() {
        return this.f4843D;
    }

    public int getLineStyleDashLength() {
        return this.f4842C;
    }

    public int getLineWidth() {
        return this.f4866z;
    }

    public Drawable getMarker() {
        return this.f4846f;
    }

    public int getMarkerPaddingBottom() {
        return this.f4851k;
    }

    public int getMarkerPaddingLeft() {
        return this.f4848h;
    }

    public int getMarkerPaddingRight() {
        return this.f4850j;
    }

    public int getMarkerPaddingTop() {
        return this.f4849i;
    }

    public int getMarkerSize() {
        return this.f4847g;
    }

    public int getStartLineColor() {
        return this.f4864x;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f4846f;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (this.f4854n) {
            this.f4853m.setColor(this.f4864x);
            canvas.drawLine(this.f4856p, this.f4857q, this.f4858r, this.f4859s, this.f4853m);
        }
        if (this.f4855o) {
            this.f4853m.setColor(this.f4865y);
            canvas.drawLine(this.f4860t, this.f4861u, this.f4862v, this.f4863w, this.f4853m);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.resolveSizeAndState(this.f4847g + getPaddingLeft() + getPaddingRight(), i, 0), View.resolveSizeAndState(this.f4847g + getPaddingTop() + getPaddingBottom(), i2, 0));
        m7057e();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m7057e();
    }

    public void setLineOrientation(int i) {
        this.f4840A = i;
    }

    public void setLinePadding(int i) {
        this.f4844E = i;
        m7057e();
    }

    public void setLineStyle(int i) {
        this.f4841B = i;
        m7056d();
    }

    public void setLineStyleDashGap(int i) {
        this.f4843D = i;
        m7056d();
    }

    public void setLineStyleDashLength(int i) {
        this.f4842C = i;
        m7056d();
    }

    public void setLineWidth(int i) {
        this.f4866z = i;
        m7057e();
    }

    public void setMarker(Drawable drawable) {
        this.f4846f = drawable;
        m7057e();
    }

    public void setMarkerColor(int i) {
        this.f4846f.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        m7057e();
    }

    public void setMarkerInCenter(boolean z) {
        this.f4852l = z;
        m7057e();
    }

    public void setMarkerPaddingBottom(int i) {
        this.f4851k = i;
        m7057e();
    }

    public void setMarkerPaddingLeft(int i) {
        this.f4848h = i;
        m7057e();
    }

    public void setMarkerPaddingRight(int i) {
        this.f4850j = i;
        m7057e();
    }

    public void setMarkerPaddingTop(int i) {
        this.f4849i = i;
        m7057e();
    }

    public void setMarkerSize(int i) {
        this.f4847g = i;
        m7057e();
    }
}
