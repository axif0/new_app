package com.google.android.exoplayer2.p035ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import p148g.p189d.p190a.p200b.p219o0.C4151a;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: com.google.android.exoplayer2.ui.h */
final class C1542h {

    /* renamed from: A */
    private float f5250A;

    /* renamed from: B */
    private float f5251B;

    /* renamed from: C */
    private int f5252C;

    /* renamed from: D */
    private int f5253D;

    /* renamed from: E */
    private int f5254E;

    /* renamed from: F */
    private int f5255F;

    /* renamed from: G */
    private StaticLayout f5256G;

    /* renamed from: H */
    private int f5257H;

    /* renamed from: I */
    private int f5258I;

    /* renamed from: J */
    private int f5259J;

    /* renamed from: K */
    private Rect f5260K;

    /* renamed from: a */
    private final RectF f5261a = new RectF();

    /* renamed from: b */
    private final float f5262b;

    /* renamed from: c */
    private final float f5263c;

    /* renamed from: d */
    private final float f5264d;

    /* renamed from: e */
    private final float f5265e;

    /* renamed from: f */
    private final float f5266f;

    /* renamed from: g */
    private final float f5267g;

    /* renamed from: h */
    private final TextPaint f5268h;

    /* renamed from: i */
    private final Paint f5269i;

    /* renamed from: j */
    private CharSequence f5270j;

    /* renamed from: k */
    private Layout.Alignment f5271k;

    /* renamed from: l */
    private Bitmap f5272l;

    /* renamed from: m */
    private float f5273m;

    /* renamed from: n */
    private int f5274n;

    /* renamed from: o */
    private int f5275o;

    /* renamed from: p */
    private float f5276p;

    /* renamed from: q */
    private int f5277q;

    /* renamed from: r */
    private float f5278r;

    /* renamed from: s */
    private float f5279s;

    /* renamed from: t */
    private boolean f5280t;

    /* renamed from: u */
    private boolean f5281u;

    /* renamed from: v */
    private int f5282v;

    /* renamed from: w */
    private int f5283w;

    /* renamed from: x */
    private int f5284x;

    /* renamed from: y */
    private int f5285y;

    /* renamed from: z */
    private int f5286z;

    public C1542h(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.f5267g = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f5266f = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f5262b = round;
        this.f5263c = round;
        this.f5264d = round;
        this.f5265e = round;
        TextPaint textPaint = new TextPaint();
        this.f5268h = textPaint;
        textPaint.setAntiAlias(true);
        this.f5268h.setSubpixelText(true);
        Paint paint = new Paint();
        this.f5269i = paint;
        paint.setAntiAlias(true);
        this.f5269i.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    private static boolean m7466a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    /* renamed from: c */
    private void m7467c(Canvas canvas) {
        canvas.drawBitmap(this.f5272l, (Rect) null, this.f5260K, (Paint) null);
    }

    /* renamed from: d */
    private void m7468d(Canvas canvas, boolean z) {
        if (z) {
            m7469e(canvas);
        } else {
            m7467c(canvas);
        }
    }

    /* renamed from: e */
    private void m7469e(Canvas canvas) {
        StaticLayout staticLayout = this.f5256G;
        if (staticLayout != null) {
            int save = canvas.save();
            canvas.translate((float) this.f5257H, (float) this.f5258I);
            if (Color.alpha(this.f5284x) > 0) {
                this.f5269i.setColor(this.f5284x);
                canvas.drawRect((float) (-this.f5259J), 0.0f, (float) (staticLayout.getWidth() + this.f5259J), (float) staticLayout.getHeight(), this.f5269i);
            }
            if (Color.alpha(this.f5283w) > 0) {
                this.f5269i.setColor(this.f5283w);
                float lineTop = (float) staticLayout.getLineTop(0);
                int lineCount = staticLayout.getLineCount();
                int i = 0;
                while (i < lineCount) {
                    this.f5261a.left = staticLayout.getLineLeft(i) - ((float) this.f5259J);
                    this.f5261a.right = staticLayout.getLineRight(i) + ((float) this.f5259J);
                    RectF rectF = this.f5261a;
                    rectF.top = lineTop;
                    rectF.bottom = (float) staticLayout.getLineBottom(i);
                    RectF rectF2 = this.f5261a;
                    float f = rectF2.bottom;
                    float f2 = this.f5262b;
                    canvas.drawRoundRect(rectF2, f2, f2, this.f5269i);
                    i++;
                    lineTop = f;
                }
            }
            int i2 = this.f5286z;
            boolean z = true;
            if (i2 == 1) {
                this.f5268h.setStrokeJoin(Paint.Join.ROUND);
                this.f5268h.setStrokeWidth(this.f5263c);
                this.f5268h.setColor(this.f5285y);
                this.f5268h.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout.draw(canvas);
            } else if (i2 == 2) {
                TextPaint textPaint = this.f5268h;
                float f3 = this.f5264d;
                float f4 = this.f5265e;
                textPaint.setShadowLayer(f3, f4, f4, this.f5285y);
            } else if (i2 == 3 || i2 == 4) {
                if (this.f5286z != 3) {
                    z = false;
                }
                int i3 = -1;
                int i4 = z ? -1 : this.f5285y;
                if (z) {
                    i3 = this.f5285y;
                }
                float f5 = this.f5264d / 2.0f;
                this.f5268h.setColor(this.f5282v);
                this.f5268h.setStyle(Paint.Style.FILL);
                float f6 = -f5;
                this.f5268h.setShadowLayer(this.f5264d, f6, f6, i4);
                staticLayout.draw(canvas);
                this.f5268h.setShadowLayer(this.f5264d, f5, f5, i3);
            }
            this.f5268h.setColor(this.f5282v);
            this.f5268h.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f5268h.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7470f() {
        /*
            r7 = this;
            int r0 = r7.f5254E
            int r1 = r7.f5252C
            int r0 = r0 - r1
            int r2 = r7.f5255F
            int r3 = r7.f5253D
            int r2 = r2 - r3
            float r1 = (float) r1
            float r0 = (float) r0
            float r4 = r7.f5276p
            float r4 = r4 * r0
            float r1 = r1 + r4
            float r3 = (float) r3
            float r2 = (float) r2
            float r4 = r7.f5273m
            float r4 = r4 * r2
            float r3 = r3 + r4
            float r4 = r7.f5278r
            float r0 = r0 * r4
            int r0 = java.lang.Math.round(r0)
            float r4 = r7.f5279s
            r5 = 1
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0028
            goto L_0x0038
        L_0x0028:
            float r2 = (float) r0
            android.graphics.Bitmap r4 = r7.f5272l
            int r4 = r4.getHeight()
            float r4 = (float) r4
            android.graphics.Bitmap r5 = r7.f5272l
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
        L_0x0038:
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r7.f5275o
            r5 = 1
            r6 = 2
            if (r4 != r6) goto L_0x0047
            float r4 = (float) r0
        L_0x0045:
            float r1 = r1 - r4
            goto L_0x004d
        L_0x0047:
            if (r4 != r5) goto L_0x004d
            int r4 = r0 / 2
            float r4 = (float) r4
            goto L_0x0045
        L_0x004d:
            int r1 = java.lang.Math.round(r1)
            int r4 = r7.f5277q
            if (r4 != r6) goto L_0x0058
            float r4 = (float) r2
        L_0x0056:
            float r3 = r3 - r4
            goto L_0x005e
        L_0x0058:
            if (r4 != r5) goto L_0x005e
            int r4 = r2 / 2
            float r4 = (float) r4
            goto L_0x0056
        L_0x005e:
            int r3 = java.lang.Math.round(r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r0 = r0 + r1
            int r2 = r2 + r3
            r4.<init>(r1, r3, r0, r2)
            r7.f5260K = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p035ui.C1542h.m7470f():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0163  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7471g() {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f5254E
            int r2 = r0.f5252C
            int r1 = r1 - r2
            int r2 = r0.f5255F
            int r3 = r0.f5253D
            int r2 = r2 - r3
            android.text.TextPaint r3 = r0.f5268h
            float r4 = r0.f5250A
            r3.setTextSize(r4)
            float r3 = r0.f5250A
            r4 = 1040187392(0x3e000000, float:0.125)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            int r4 = r3 * 2
            int r5 = r1 - r4
            float r6 = r0.f5278r
            r7 = 1
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x002c
            float r5 = (float) r5
            float r5 = r5 * r6
            int r5 = (int) r5
        L_0x002c:
            java.lang.String r6 = "SubtitlePainter"
            if (r5 > 0) goto L_0x0036
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
            android.util.Log.w(r6, r1)
            return
        L_0x0036:
            boolean r8 = r0.f5281u
            r15 = 0
            if (r8 == 0) goto L_0x0042
            boolean r8 = r0.f5280t
            if (r8 == 0) goto L_0x0042
            java.lang.CharSequence r8 = r0.f5270j
            goto L_0x004c
        L_0x0042:
            boolean r8 = r0.f5280t
            if (r8 != 0) goto L_0x004f
            java.lang.CharSequence r8 = r0.f5270j
            java.lang.String r8 = r8.toString()
        L_0x004c:
            r17 = r8
            goto L_0x0082
        L_0x004f:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r9 = r0.f5270j
            r8.<init>(r9)
            int r9 = r8.length()
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r10 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object[] r10 = r8.getSpans(r15, r9, r10)
            android.text.style.AbsoluteSizeSpan[] r10 = (android.text.style.AbsoluteSizeSpan[]) r10
            java.lang.Class<android.text.style.RelativeSizeSpan> r11 = android.text.style.RelativeSizeSpan.class
            java.lang.Object[] r9 = r8.getSpans(r15, r9, r11)
            android.text.style.RelativeSizeSpan[] r9 = (android.text.style.RelativeSizeSpan[]) r9
            int r11 = r10.length
            r12 = 0
        L_0x006c:
            if (r12 >= r11) goto L_0x0076
            r13 = r10[r12]
            r8.removeSpan(r13)
            int r12 = r12 + 1
            goto L_0x006c
        L_0x0076:
            int r10 = r9.length
            r11 = 0
        L_0x0078:
            if (r11 >= r10) goto L_0x004c
            r12 = r9[r11]
            r8.removeSpan(r12)
            int r11 = r11 + 1
            goto L_0x0078
        L_0x0082:
            android.text.Layout$Alignment r8 = r0.f5271k
            if (r8 != 0) goto L_0x0088
            android.text.Layout$Alignment r8 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x0088:
            r20 = r8
            android.text.StaticLayout r14 = new android.text.StaticLayout
            android.text.TextPaint r10 = r0.f5268h
            float r13 = r0.f5266f
            float r12 = r0.f5267g
            r16 = 1
            r8 = r14
            r9 = r17
            r11 = r5
            r18 = r12
            r12 = r20
            r7 = r14
            r14 = r18
            r24 = r3
            r3 = 0
            r15 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.f5256G = r7
            int r7 = r7.getHeight()
            android.text.StaticLayout r8 = r0.f5256G
            int r8 = r8.getLineCount()
            r9 = 0
            r15 = 0
        L_0x00b5:
            if (r15 >= r8) goto L_0x00ca
            android.text.StaticLayout r10 = r0.f5256G
            float r10 = r10.getLineWidth(r15)
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            int r9 = java.lang.Math.max(r10, r9)
            int r15 = r15 + 1
            goto L_0x00b5
        L_0x00ca:
            float r8 = r0.f5278r
            r10 = 1
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x00d4
            if (r9 >= r5) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r5 = r9
        L_0x00d5:
            int r5 = r5 + r4
            float r4 = r0.f5276p
            r8 = 1
            r9 = 2
            int r11 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r11 == 0) goto L_0x0102
            float r1 = (float) r1
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)
            int r4 = r0.f5252C
            int r1 = r1 + r4
            int r4 = r0.f5277q
            if (r4 != r9) goto L_0x00ee
            int r1 = r1 - r5
            goto L_0x00f4
        L_0x00ee:
            if (r4 != r8) goto L_0x00f4
            int r1 = r1 * 2
            int r1 = r1 - r5
            int r1 = r1 / r9
        L_0x00f4:
            int r4 = r0.f5252C
            int r1 = java.lang.Math.max(r1, r4)
            int r5 = r5 + r1
            int r4 = r0.f5254E
            int r4 = java.lang.Math.min(r5, r4)
            goto L_0x0106
        L_0x0102:
            int r1 = r1 - r5
            int r1 = r1 / r9
            int r4 = r1 + r5
        L_0x0106:
            int r4 = r4 - r1
            if (r4 > 0) goto L_0x010f
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            android.util.Log.w(r6, r1)
            return
        L_0x010f:
            float r5 = r0.f5273m
            r6 = 1
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0169
            int r6 = r0.f5274n
            if (r6 != 0) goto L_0x0125
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = java.lang.Math.round(r2)
        L_0x0121:
            int r3 = r0.f5253D
        L_0x0123:
            int r2 = r2 + r3
            goto L_0x014e
        L_0x0125:
            android.text.StaticLayout r2 = r0.f5256G
            int r2 = r2.getLineBottom(r3)
            android.text.StaticLayout r5 = r0.f5256G
            int r3 = r5.getLineTop(r3)
            int r2 = r2 - r3
            float r3 = r0.f5273m
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0141
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            goto L_0x0121
        L_0x0141:
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r5
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            int r3 = r0.f5255F
            goto L_0x0123
        L_0x014e:
            int r3 = r0.f5275o
            if (r3 != r9) goto L_0x0154
            int r2 = r2 - r7
            goto L_0x015a
        L_0x0154:
            if (r3 != r8) goto L_0x015a
            int r2 = r2 * 2
            int r2 = r2 - r7
            int r2 = r2 / r9
        L_0x015a:
            int r3 = r2 + r7
            int r5 = r0.f5255F
            if (r3 <= r5) goto L_0x0163
            int r2 = r5 - r7
            goto L_0x0174
        L_0x0163:
            int r3 = r0.f5253D
            if (r2 >= r3) goto L_0x0174
            r2 = r3
            goto L_0x0174
        L_0x0169:
            int r3 = r0.f5255F
            int r3 = r3 - r7
            float r2 = (float) r2
            float r5 = r0.f5251B
            float r2 = r2 * r5
            int r2 = (int) r2
            int r2 = r3 - r2
        L_0x0174:
            android.text.StaticLayout r3 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f5268h
            float r6 = r0.f5266f
            float r7 = r0.f5267g
            r23 = 1
            r16 = r3
            r18 = r5
            r19 = r4
            r21 = r6
            r22 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r0.f5256G = r3
            r0.f5257H = r1
            r0.f5258I = r2
            r1 = r24
            r0.f5259J = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p035ui.C1542h.m7471g():void");
    }

    /* renamed from: b */
    public void mo6288b(C4152b bVar, boolean z, boolean z2, C4151a aVar, float f, float f2, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z3 = bVar.f13181h == null;
        int i5 = -16777216;
        if (z3) {
            if (!TextUtils.isEmpty(bVar.f13179f)) {
                i5 = (!bVar.f13189p || !z) ? aVar.f13175c : bVar.f13190q;
            } else {
                return;
            }
        }
        if (m7466a(this.f5270j, bVar.f13179f) && C4284w.m18236b(this.f5271k, bVar.f13180g) && this.f5272l == bVar.f13181h && this.f5273m == bVar.f13182i && this.f5274n == bVar.f13183j && C4284w.m18236b(Integer.valueOf(this.f5275o), Integer.valueOf(bVar.f13184k)) && this.f5276p == bVar.f13185l && C4284w.m18236b(Integer.valueOf(this.f5277q), Integer.valueOf(bVar.f13186m)) && this.f5278r == bVar.f13187n && this.f5279s == bVar.f13188o && this.f5280t == z && this.f5281u == z2 && this.f5282v == aVar.f13173a && this.f5283w == aVar.f13174b && this.f5284x == i5 && this.f5286z == aVar.f13176d && this.f5285y == aVar.f13177e && C4284w.m18236b(this.f5268h.getTypeface(), aVar.f13178f) && this.f5250A == f && this.f5251B == f2 && this.f5252C == i && this.f5253D == i2 && this.f5254E == i3 && this.f5255F == i4) {
            m7468d(canvas, z3);
            return;
        }
        this.f5270j = bVar.f13179f;
        this.f5271k = bVar.f13180g;
        this.f5272l = bVar.f13181h;
        this.f5273m = bVar.f13182i;
        this.f5274n = bVar.f13183j;
        this.f5275o = bVar.f13184k;
        this.f5276p = bVar.f13185l;
        this.f5277q = bVar.f13186m;
        this.f5278r = bVar.f13187n;
        this.f5279s = bVar.f13188o;
        this.f5280t = z;
        this.f5281u = z2;
        this.f5282v = aVar.f13173a;
        this.f5283w = aVar.f13174b;
        this.f5284x = i5;
        this.f5286z = aVar.f13176d;
        this.f5285y = aVar.f13177e;
        this.f5268h.setTypeface(aVar.f13178f);
        this.f5250A = f;
        this.f5251B = f2;
        this.f5252C = i;
        this.f5253D = i2;
        this.f5254E = i3;
        this.f5255F = i4;
        if (z3) {
            m7471g();
        } else {
            m7470f();
        }
        m7468d(canvas, z3);
    }
}
