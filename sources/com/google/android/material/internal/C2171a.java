package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.material.internal.C2200m;
import p086f.p111h.p117h.C3306a;
import p086f.p111h.p120k.C3334e;
import p086f.p111h.p121l.C3349h;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.p256m.C5007a;
import p148g.p189d.p190a.p252d.p269y.C5043a;
import p148g.p189d.p190a.p252d.p269y.C5047d;

/* renamed from: com.google.android.material.internal.a */
public final class C2171a {

    /* renamed from: Z */
    private static final boolean f7180Z = (Build.VERSION.SDK_INT < 18);

    /* renamed from: a0 */
    private static final Paint f7181a0;

    /* renamed from: A */
    private boolean f7182A;

    /* renamed from: B */
    private Bitmap f7183B;

    /* renamed from: C */
    private Paint f7184C;

    /* renamed from: D */
    private float f7185D;

    /* renamed from: E */
    private float f7186E;

    /* renamed from: F */
    private int[] f7187F;

    /* renamed from: G */
    private boolean f7188G;

    /* renamed from: H */
    private final TextPaint f7189H;

    /* renamed from: I */
    private final TextPaint f7190I;

    /* renamed from: J */
    private TimeInterpolator f7191J;

    /* renamed from: K */
    private TimeInterpolator f7192K;

    /* renamed from: L */
    private float f7193L;

    /* renamed from: M */
    private float f7194M;

    /* renamed from: N */
    private float f7195N;

    /* renamed from: O */
    private ColorStateList f7196O;

    /* renamed from: P */
    private float f7197P;

    /* renamed from: Q */
    private float f7198Q;

    /* renamed from: R */
    private float f7199R;

    /* renamed from: S */
    private ColorStateList f7200S;

    /* renamed from: T */
    private StaticLayout f7201T;

    /* renamed from: U */
    private float f7202U;

    /* renamed from: V */
    private float f7203V;

    /* renamed from: W */
    private float f7204W;

    /* renamed from: X */
    private CharSequence f7205X;

    /* renamed from: Y */
    private int f7206Y = 1;

    /* renamed from: a */
    private final View f7207a;

    /* renamed from: b */
    private boolean f7208b;

    /* renamed from: c */
    private float f7209c;

    /* renamed from: d */
    private final Rect f7210d;

    /* renamed from: e */
    private final Rect f7211e;

    /* renamed from: f */
    private final RectF f7212f;

    /* renamed from: g */
    private int f7213g = 16;

    /* renamed from: h */
    private int f7214h = 16;

    /* renamed from: i */
    private float f7215i = 15.0f;

    /* renamed from: j */
    private float f7216j = 15.0f;

    /* renamed from: k */
    private ColorStateList f7217k;

    /* renamed from: l */
    private ColorStateList f7218l;

    /* renamed from: m */
    private float f7219m;

    /* renamed from: n */
    private float f7220n;

    /* renamed from: o */
    private float f7221o;

    /* renamed from: p */
    private float f7222p;

    /* renamed from: q */
    private float f7223q;

    /* renamed from: r */
    private float f7224r;

    /* renamed from: s */
    private Typeface f7225s;

    /* renamed from: t */
    private Typeface f7226t;

    /* renamed from: u */
    private Typeface f7227u;

    /* renamed from: v */
    private C5043a f7228v;

    /* renamed from: w */
    private C5043a f7229w;

    /* renamed from: x */
    private CharSequence f7230x;

    /* renamed from: y */
    private CharSequence f7231y;

    /* renamed from: z */
    private boolean f7232z;

    /* renamed from: com.google.android.material.internal.a$a */
    class C2172a implements C5043a.C5044a {
        C2172a() {
        }

        /* renamed from: a */
        public void mo8519a(Typeface typeface) {
            C2171a.this.mo8499M(typeface);
        }
    }

    static {
        Paint paint = null;
        f7181a0 = paint;
        if (paint != null) {
            paint.setAntiAlias(true);
            f7181a0.setColor(-65281);
        }
    }

    public C2171a(View view) {
        this.f7207a = view;
        this.f7189H = new TextPaint(129);
        this.f7190I = new TextPaint(this.f7189H);
        this.f7211e = new Rect();
        this.f7210d = new Rect();
        this.f7212f = new RectF();
    }

    /* renamed from: A */
    private boolean m10140A() {
        return C3403t.m14674y(this.f7207a) == 1;
    }

    /* renamed from: C */
    private static float m10141C(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C5007a.m21200a(f, f2, f3);
    }

    /* renamed from: F */
    private static boolean m10142F(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: J */
    private void m10143J(float f) {
        this.f7202U = f;
        C3403t.m14625Z(this.f7207a);
    }

    /* renamed from: N */
    private boolean m10144N(Typeface typeface) {
        C5043a aVar = this.f7229w;
        if (aVar != null) {
            aVar.mo15126c();
        }
        if (this.f7225s == typeface) {
            return false;
        }
        this.f7225s = typeface;
        return true;
    }

    /* renamed from: Q */
    private void m10145Q(float f) {
        this.f7203V = f;
        C3403t.m14625Z(this.f7207a);
    }

    /* renamed from: U */
    private boolean m10146U(Typeface typeface) {
        C5043a aVar = this.f7228v;
        if (aVar != null) {
            aVar.mo15126c();
        }
        if (this.f7226t == typeface) {
            return false;
        }
        this.f7226t = typeface;
        return true;
    }

    /* renamed from: W */
    private void m10147W(float f) {
        m10154g(f);
        boolean z = f7180Z && this.f7185D != 1.0f;
        this.f7182A = z;
        if (z) {
            m10158l();
        }
        C3403t.m14625Z(this.f7207a);
    }

    /* renamed from: a */
    private static int m10148a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0110  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10149b() {
        /*
            r13 = this;
            float r0 = r13.f7186E
            float r1 = r13.f7216j
            r13.m10154g(r1)
            java.lang.CharSequence r1 = r13.f7231y
            if (r1 == 0) goto L_0x001e
            android.text.StaticLayout r2 = r13.f7201T
            if (r2 == 0) goto L_0x001e
            android.text.TextPaint r3 = r13.f7189H
            int r2 = r2.getWidth()
            float r2 = (float) r2
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r1 = android.text.TextUtils.ellipsize(r1, r3, r2, r4)
            r13.f7205X = r1
        L_0x001e:
            java.lang.CharSequence r1 = r13.f7205X
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x002f
            android.text.TextPaint r4 = r13.f7189H
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            int r4 = r13.f7214h
            boolean r5 = r13.f7232z
            int r4 = p086f.p111h.p122m.C3386d.m14544b(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x006a
            if (r5 == r6) goto L_0x005d
            android.text.TextPaint r5 = r13.f7189H
            float r5 = r5.descent()
            android.text.TextPaint r9 = r13.f7189H
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.graphics.Rect r9 = r13.f7211e
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 - r5
            r13.f7220n = r9
            goto L_0x0071
        L_0x005d:
            android.graphics.Rect r5 = r13.f7211e
            int r5 = r5.bottom
            float r5 = (float) r5
            android.text.TextPaint r9 = r13.f7189H
            float r9 = r9.ascent()
            float r5 = r5 + r9
            goto L_0x006f
        L_0x006a:
            android.graphics.Rect r5 = r13.f7211e
            int r5 = r5.top
            float r5 = (float) r5
        L_0x006f:
            r13.f7220n = r5
        L_0x0071:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L_0x0089
            if (r4 == r9) goto L_0x0083
            android.graphics.Rect r1 = r13.f7211e
            int r1 = r1.left
            float r1 = (float) r1
            r13.f7222p = r1
            goto L_0x0094
        L_0x0083:
            android.graphics.Rect r4 = r13.f7211e
            int r4 = r4.right
            float r4 = (float) r4
            goto L_0x0091
        L_0x0089:
            android.graphics.Rect r4 = r13.f7211e
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        L_0x0091:
            float r4 = r4 - r1
            r13.f7222p = r4
        L_0x0094:
            float r1 = r13.f7215i
            r13.m10154g(r1)
            android.text.StaticLayout r1 = r13.f7201T
            if (r1 == 0) goto L_0x00a3
            int r1 = r1.getHeight()
            float r1 = (float) r1
            goto L_0x00a4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            java.lang.CharSequence r4 = r13.f7231y
            if (r4 == 0) goto L_0x00b3
            android.text.TextPaint r11 = r13.f7189H
            int r12 = r4.length()
            float r4 = r11.measureText(r4, r2, r12)
            goto L_0x00b4
        L_0x00b3:
            r4 = 0
        L_0x00b4:
            android.text.StaticLayout r11 = r13.f7201T
            if (r11 == 0) goto L_0x00c5
            int r12 = r13.f7206Y
            if (r12 <= r10) goto L_0x00c5
            boolean r12 = r13.f7232z
            if (r12 != 0) goto L_0x00c5
            int r4 = r11.getWidth()
            float r4 = (float) r4
        L_0x00c5:
            android.text.StaticLayout r11 = r13.f7201T
            if (r11 == 0) goto L_0x00cd
            float r3 = r11.getLineLeft(r2)
        L_0x00cd:
            r13.f7204W = r3
            int r2 = r13.f7213g
            boolean r3 = r13.f7232z
            int r2 = p086f.p111h.p122m.C3386d.m14544b(r2, r3)
            r3 = r2 & 112(0x70, float:1.57E-43)
            if (r3 == r7) goto L_0x00f7
            if (r3 == r6) goto L_0x00e9
            float r1 = r1 / r8
            android.graphics.Rect r3 = r13.f7210d
            int r3 = r3.centerY()
            float r3 = (float) r3
            float r3 = r3 - r1
        L_0x00e6:
            r13.f7219m = r3
            goto L_0x00fe
        L_0x00e9:
            android.graphics.Rect r3 = r13.f7210d
            int r3 = r3.bottom
            float r3 = (float) r3
            float r3 = r3 - r1
            android.text.TextPaint r1 = r13.f7189H
            float r1 = r1.descent()
            float r3 = r3 + r1
            goto L_0x00e6
        L_0x00f7:
            android.graphics.Rect r1 = r13.f7210d
            int r1 = r1.top
            float r1 = (float) r1
            r13.f7219m = r1
        L_0x00fe:
            r1 = r2 & r5
            if (r1 == r10) goto L_0x0110
            if (r1 == r9) goto L_0x010a
            android.graphics.Rect r1 = r13.f7210d
            int r1 = r1.left
            float r1 = (float) r1
            goto L_0x0119
        L_0x010a:
            android.graphics.Rect r1 = r13.f7210d
            int r1 = r1.right
            float r1 = (float) r1
            goto L_0x0118
        L_0x0110:
            android.graphics.Rect r1 = r13.f7210d
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r4 = r4 / r8
        L_0x0118:
            float r1 = r1 - r4
        L_0x0119:
            r13.f7221o = r1
            r13.m10155h()
            r13.m10147W(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C2171a.m10149b():void");
    }

    /* renamed from: c0 */
    private boolean m10150c0() {
        return this.f7206Y > 1 && !this.f7232z && !this.f7182A;
    }

    /* renamed from: d */
    private void m10151d() {
        m10153f(this.f7209c);
    }

    /* renamed from: e */
    private boolean m10152e(CharSequence charSequence) {
        return (m10140A() ? C3334e.f10628d : C3334e.f10627c).mo11536a(charSequence, 0, charSequence.length());
    }

    /* renamed from: f */
    private void m10153f(float f) {
        int i;
        TextPaint textPaint;
        m10165y(f);
        this.f7223q = m10141C(this.f7221o, this.f7222p, f, this.f7191J);
        this.f7224r = m10141C(this.f7219m, this.f7220n, f, this.f7191J);
        m10147W(m10141C(this.f7215i, this.f7216j, f, this.f7192K));
        m10143J(1.0f - m10141C(0.0f, 1.0f, 1.0f - f, C5007a.f14948b));
        m10145Q(m10141C(1.0f, 0.0f, f, C5007a.f14948b));
        if (this.f7218l != this.f7217k) {
            textPaint = this.f7189H;
            i = m10148a(m10162t(), mo8516r(), f);
        } else {
            textPaint = this.f7189H;
            i = mo8516r();
        }
        textPaint.setColor(i);
        this.f7189H.setShadowLayer(m10141C(this.f7197P, this.f7193L, f, (TimeInterpolator) null), m10141C(this.f7198Q, this.f7194M, f, (TimeInterpolator) null), m10141C(this.f7199R, this.f7195N, f, (TimeInterpolator) null), m10148a(m10161s(this.f7200S), m10161s(this.f7196O), f));
        C3403t.m14625Z(this.f7207a);
    }

    /* renamed from: g */
    private void m10154g(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.f7230x != null) {
            float width = (float) this.f7211e.width();
            float width2 = (float) this.f7210d.width();
            boolean z3 = false;
            int i = 1;
            if (m10166z(f, this.f7216j)) {
                f2 = this.f7216j;
                this.f7185D = 1.0f;
                Typeface typeface = this.f7227u;
                Typeface typeface2 = this.f7225s;
                if (typeface != typeface2) {
                    this.f7227u = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.f7215i;
                Typeface typeface3 = this.f7227u;
                Typeface typeface4 = this.f7226t;
                if (typeface3 != typeface4) {
                    this.f7227u = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m10166z(f, this.f7215i)) {
                    this.f7185D = 1.0f;
                } else {
                    this.f7185D = f / this.f7215i;
                }
                float f4 = this.f7216j / this.f7215i;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
                z = z2;
            }
            if (width > 0.0f) {
                z = this.f7186E != f2 || this.f7188G || z;
                this.f7186E = f2;
                this.f7188G = false;
            }
            if (this.f7231y == null || z) {
                this.f7189H.setTextSize(this.f7186E);
                this.f7189H.setTypeface(this.f7227u);
                TextPaint textPaint = this.f7189H;
                if (this.f7185D != 1.0f) {
                    z3 = true;
                }
                textPaint.setLinearText(z3);
                this.f7232z = m10152e(this.f7230x);
                if (m10150c0()) {
                    i = this.f7206Y;
                }
                StaticLayout i2 = m10156i(i, width, this.f7232z);
                this.f7201T = i2;
                this.f7231y = i2.getText();
            }
        }
    }

    /* renamed from: h */
    private void m10155h() {
        Bitmap bitmap = this.f7183B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f7183B = null;
        }
    }

    /* renamed from: i */
    private StaticLayout m10156i(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            C2200m c = C2200m.m10278c(this.f7230x, this.f7189H, (int) f);
            c.mo8599e(TextUtils.TruncateAt.END);
            c.mo8601g(z);
            c.mo8598d(Layout.Alignment.ALIGN_NORMAL);
            c.mo8600f(false);
            c.mo8602h(i);
            staticLayout = c.mo8597a();
        } catch (C2200m.C2201a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        C3349h.m14361c(staticLayout);
        return staticLayout;
    }

    /* renamed from: k */
    private void m10157k(Canvas canvas, float f, float f2) {
        int alpha = this.f7189H.getAlpha();
        canvas.translate(f, f2);
        float f3 = (float) alpha;
        this.f7189H.setAlpha((int) (this.f7203V * f3));
        this.f7201T.draw(canvas);
        this.f7189H.setAlpha((int) (this.f7202U * f3));
        int lineBaseline = this.f7201T.getLineBaseline(0);
        CharSequence charSequence = this.f7205X;
        float f4 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f7189H);
        String trim = this.f7205X.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.f7189H.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f7201T.getLineEnd(0), str.length()), 0.0f, f4, this.f7189H);
    }

    /* renamed from: l */
    private void m10158l() {
        if (this.f7183B == null && !this.f7210d.isEmpty() && !TextUtils.isEmpty(this.f7231y)) {
            m10153f(0.0f);
            int width = this.f7201T.getWidth();
            int height = this.f7201T.getHeight();
            if (width > 0 && height > 0) {
                this.f7183B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f7201T.draw(new Canvas(this.f7183B));
                if (this.f7184C == null) {
                    this.f7184C = new Paint(3);
                }
            }
        }
    }

    /* renamed from: p */
    private float m10159p(int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (((float) i) / 2.0f) - (mo8511c() / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f7232z ? (float) this.f7211e.left : ((float) this.f7211e.right) - mo8511c() : this.f7232z ? ((float) this.f7211e.right) - mo8511c() : (float) this.f7211e.left;
    }

    /* renamed from: q */
    private float m10160q(RectF rectF, int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (((float) i) / 2.0f) + (mo8511c() / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f7232z ? rectF.left + mo8511c() : (float) this.f7211e.right : this.f7232z ? (float) this.f7211e.right : rectF.left + mo8511c();
    }

    /* renamed from: s */
    private int m10161s(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f7187F;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: t */
    private int m10162t() {
        return m10161s(this.f7217k);
    }

    /* renamed from: w */
    private void m10163w(TextPaint textPaint) {
        textPaint.setTextSize(this.f7216j);
        textPaint.setTypeface(this.f7225s);
    }

    /* renamed from: x */
    private void m10164x(TextPaint textPaint) {
        textPaint.setTextSize(this.f7215i);
        textPaint.setTypeface(this.f7226t);
    }

    /* renamed from: y */
    private void m10165y(float f) {
        this.f7212f.left = m10141C((float) this.f7210d.left, (float) this.f7211e.left, f, this.f7191J);
        this.f7212f.top = m10141C(this.f7219m, this.f7220n, f, this.f7191J);
        this.f7212f.right = m10141C((float) this.f7210d.right, (float) this.f7211e.right, f, this.f7191J);
        this.f7212f.bottom = m10141C((float) this.f7210d.bottom, (float) this.f7211e.bottom, f, this.f7191J);
    }

    /* renamed from: z */
    private static boolean m10166z(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f7217k;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8491B() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f7218l
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f7217k
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C2171a.mo8491B():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo8492D() {
        this.f7208b = this.f7211e.width() > 0 && this.f7211e.height() > 0 && this.f7210d.width() > 0 && this.f7210d.height() > 0;
    }

    /* renamed from: E */
    public void mo8493E() {
        if (this.f7207a.getHeight() > 0 && this.f7207a.getWidth() > 0) {
            m10149b();
            m10151d();
        }
    }

    /* renamed from: G */
    public void mo8494G(int i, int i2, int i3, int i4) {
        if (!m10142F(this.f7211e, i, i2, i3, i4)) {
            this.f7211e.set(i, i2, i3, i4);
            this.f7188G = true;
            mo8492D();
        }
    }

    /* renamed from: H */
    public void mo8495H(Rect rect) {
        mo8494G(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: I */
    public void mo8496I(int i) {
        C5047d dVar = new C5047d(this.f7207a.getContext(), i);
        ColorStateList colorStateList = dVar.f15031b;
        if (colorStateList != null) {
            this.f7218l = colorStateList;
        }
        float f = dVar.f15030a;
        if (f != 0.0f) {
            this.f7216j = f;
        }
        ColorStateList colorStateList2 = dVar.f15035f;
        if (colorStateList2 != null) {
            this.f7196O = colorStateList2;
        }
        this.f7194M = dVar.f15036g;
        this.f7195N = dVar.f15037h;
        this.f7193L = dVar.f15038i;
        C5043a aVar = this.f7229w;
        if (aVar != null) {
            aVar.mo15126c();
        }
        this.f7229w = new C5043a(new C2172a(), dVar.mo15127e());
        dVar.mo15130h(this.f7207a.getContext(), this.f7229w);
        mo8493E();
    }

    /* renamed from: K */
    public void mo8497K(ColorStateList colorStateList) {
        if (this.f7218l != colorStateList) {
            this.f7218l = colorStateList;
            mo8493E();
        }
    }

    /* renamed from: L */
    public void mo8498L(int i) {
        if (this.f7214h != i) {
            this.f7214h = i;
            mo8493E();
        }
    }

    /* renamed from: M */
    public void mo8499M(Typeface typeface) {
        if (m10144N(typeface)) {
            mo8493E();
        }
    }

    /* renamed from: O */
    public void mo8500O(int i, int i2, int i3, int i4) {
        if (!m10142F(this.f7210d, i, i2, i3, i4)) {
            this.f7210d.set(i, i2, i3, i4);
            this.f7188G = true;
            mo8492D();
        }
    }

    /* renamed from: P */
    public void mo8501P(Rect rect) {
        mo8500O(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: R */
    public void mo8502R(ColorStateList colorStateList) {
        if (this.f7217k != colorStateList) {
            this.f7217k = colorStateList;
            mo8493E();
        }
    }

    /* renamed from: S */
    public void mo8503S(int i) {
        if (this.f7213g != i) {
            this.f7213g = i;
            mo8493E();
        }
    }

    /* renamed from: T */
    public void mo8504T(float f) {
        if (this.f7215i != f) {
            this.f7215i = f;
            mo8493E();
        }
    }

    /* renamed from: V */
    public void mo8505V(float f) {
        float a = C3306a.m14254a(f, 0.0f, 1.0f);
        if (a != this.f7209c) {
            this.f7209c = a;
            m10151d();
        }
    }

    /* renamed from: X */
    public void mo8506X(TimeInterpolator timeInterpolator) {
        this.f7191J = timeInterpolator;
        mo8493E();
    }

    /* renamed from: Y */
    public final boolean mo8507Y(int[] iArr) {
        this.f7187F = iArr;
        if (!mo8491B()) {
            return false;
        }
        mo8493E();
        return true;
    }

    /* renamed from: Z */
    public void mo8508Z(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f7230x, charSequence)) {
            this.f7230x = charSequence;
            this.f7231y = null;
            m10155h();
            mo8493E();
        }
    }

    /* renamed from: a0 */
    public void mo8509a0(TimeInterpolator timeInterpolator) {
        this.f7192K = timeInterpolator;
        mo8493E();
    }

    /* renamed from: b0 */
    public void mo8510b0(Typeface typeface) {
        boolean N = m10144N(typeface);
        boolean U = m10146U(typeface);
        if (N || U) {
            mo8493E();
        }
    }

    /* renamed from: c */
    public float mo8511c() {
        if (this.f7230x == null) {
            return 0.0f;
        }
        m10163w(this.f7190I);
        TextPaint textPaint = this.f7190I;
        CharSequence charSequence = this.f7230x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: j */
    public void mo8512j(Canvas canvas) {
        int save = canvas.save();
        if (this.f7231y != null && this.f7208b) {
            boolean z = false;
            float lineLeft = (this.f7223q + this.f7201T.getLineLeft(0)) - (this.f7204W * 2.0f);
            this.f7189H.setTextSize(this.f7186E);
            float f = this.f7223q;
            float f2 = this.f7224r;
            if (this.f7182A && this.f7183B != null) {
                z = true;
            }
            float f3 = this.f7185D;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f7183B, f, f2, this.f7184C);
                canvas.restoreToCount(save);
                return;
            }
            if (m10150c0()) {
                m10157k(canvas, lineLeft, f2);
            } else {
                canvas.translate(f, f2);
                this.f7201T.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: m */
    public void mo8513m(RectF rectF, int i, int i2) {
        this.f7232z = m10152e(this.f7230x);
        rectF.left = m10159p(i, i2);
        rectF.top = (float) this.f7211e.top;
        rectF.right = m10160q(rectF, i, i2);
        rectF.bottom = ((float) this.f7211e.top) + mo8515o();
    }

    /* renamed from: n */
    public ColorStateList mo8514n() {
        return this.f7218l;
    }

    /* renamed from: o */
    public float mo8515o() {
        m10163w(this.f7190I);
        return -this.f7190I.ascent();
    }

    /* renamed from: r */
    public int mo8516r() {
        return m10161s(this.f7218l);
    }

    /* renamed from: u */
    public float mo8517u() {
        m10164x(this.f7190I);
        return -this.f7190I.ascent();
    }

    /* renamed from: v */
    public float mo8518v() {
        return this.f7209c;
    }
}
