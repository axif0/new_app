package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0588a;
import androidx.core.graphics.drawable.C0589b;
import com.google.android.material.internal.C2202n;
import com.karumi.dexter.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p114f.C3287a;
import p086f.p111h.p120k.C3326a;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p256m.C5014h;
import p148g.p189d.p190a.p252d.p258o.C5022a;
import p148g.p189d.p190a.p252d.p264t.C5037a;
import p148g.p189d.p190a.p252d.p269y.C5047d;
import p148g.p189d.p190a.p252d.p270z.C5055b;

/* renamed from: com.google.android.material.chip.a */
public class C2093a extends C4972g implements C0589b, Drawable.Callback, C2202n.C2204b {

    /* renamed from: N0 */
    private static final int[] f6881N0 = {16842910};

    /* renamed from: O0 */
    private static final ShapeDrawable f6882O0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private int f6883A0 = 255;

    /* renamed from: B0 */
    private ColorFilter f6884B0;

    /* renamed from: C0 */
    private PorterDuffColorFilter f6885C0;

    /* renamed from: D */
    private ColorStateList f6886D;

    /* renamed from: D0 */
    private ColorStateList f6887D0;

    /* renamed from: E */
    private ColorStateList f6888E;

    /* renamed from: E0 */
    private PorterDuff.Mode f6889E0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: F */
    private float f6890F;

    /* renamed from: F0 */
    private int[] f6891F0;

    /* renamed from: G */
    private float f6892G = -1.0f;

    /* renamed from: G0 */
    private boolean f6893G0;

    /* renamed from: H */
    private ColorStateList f6894H;

    /* renamed from: H0 */
    private ColorStateList f6895H0;

    /* renamed from: I */
    private float f6896I;

    /* renamed from: I0 */
    private WeakReference<C2094a> f6897I0;

    /* renamed from: J */
    private ColorStateList f6898J;

    /* renamed from: J0 */
    private TextUtils.TruncateAt f6899J0;

    /* renamed from: K */
    private CharSequence f6900K;

    /* renamed from: K0 */
    private boolean f6901K0;

    /* renamed from: L */
    private boolean f6902L;

    /* renamed from: L0 */
    private int f6903L0;

    /* renamed from: M */
    private Drawable f6904M;

    /* renamed from: M0 */
    private boolean f6905M0;

    /* renamed from: N */
    private ColorStateList f6906N;

    /* renamed from: O */
    private float f6907O;

    /* renamed from: P */
    private boolean f6908P;

    /* renamed from: Q */
    private boolean f6909Q;

    /* renamed from: R */
    private Drawable f6910R;

    /* renamed from: S */
    private Drawable f6911S;

    /* renamed from: T */
    private ColorStateList f6912T;

    /* renamed from: U */
    private float f6913U;

    /* renamed from: V */
    private CharSequence f6914V;

    /* renamed from: W */
    private boolean f6915W;

    /* renamed from: X */
    private boolean f6916X;

    /* renamed from: Y */
    private Drawable f6917Y;

    /* renamed from: Z */
    private ColorStateList f6918Z;

    /* renamed from: a0 */
    private C5014h f6919a0;

    /* renamed from: b0 */
    private C5014h f6920b0;

    /* renamed from: c0 */
    private float f6921c0;

    /* renamed from: d0 */
    private float f6922d0;

    /* renamed from: e0 */
    private float f6923e0;

    /* renamed from: f0 */
    private float f6924f0;

    /* renamed from: g0 */
    private float f6925g0;

    /* renamed from: h0 */
    private float f6926h0;

    /* renamed from: i0 */
    private float f6927i0;

    /* renamed from: j0 */
    private float f6928j0;

    /* renamed from: k0 */
    private final Context f6929k0;

    /* renamed from: l0 */
    private final Paint f6930l0 = new Paint(1);

    /* renamed from: m0 */
    private final Paint f6931m0;

    /* renamed from: n0 */
    private final Paint.FontMetrics f6932n0 = new Paint.FontMetrics();

    /* renamed from: o0 */
    private final RectF f6933o0 = new RectF();

    /* renamed from: p0 */
    private final PointF f6934p0 = new PointF();

    /* renamed from: q0 */
    private final Path f6935q0 = new Path();

    /* renamed from: r0 */
    private final C2202n f6936r0;

    /* renamed from: s0 */
    private int f6937s0;

    /* renamed from: t0 */
    private int f6938t0;

    /* renamed from: u0 */
    private int f6939u0;

    /* renamed from: v0 */
    private int f6940v0;

    /* renamed from: w0 */
    private int f6941w0;

    /* renamed from: x0 */
    private int f6942x0;

    /* renamed from: y0 */
    private boolean f6943y0;

    /* renamed from: z0 */
    private int f6944z0;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface C2094a {
        /* renamed from: a */
        void mo7852a();
    }

    private C2093a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Paint paint = null;
        this.f6897I0 = new WeakReference<>(paint);
        mo14920N(context);
        this.f6929k0 = context;
        C2202n nVar = new C2202n(this);
        this.f6936r0 = nVar;
        this.f6900K = BuildConfig.FLAVOR;
        nVar.mo8604e().density = context.getResources().getDisplayMetrics().density;
        this.f6931m0 = paint;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(f6881N0);
        mo8125k2(f6881N0);
        this.f6901K0 = true;
        if (C5055b.f15051a) {
            f6882O0.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private void m9661A0(Canvas canvas, Rect rect) {
        if (this.f6896I > 0.0f && !this.f6905M0) {
            this.f6930l0.setColor(this.f6940v0);
            this.f6930l0.setStyle(Paint.Style.STROKE);
            if (!this.f6905M0) {
                this.f6930l0.setColorFilter(m9674k1());
            }
            RectF rectF = this.f6933o0;
            float f = this.f6896I;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f6892G - (this.f6896I / 2.0f);
            canvas.drawRoundRect(this.f6933o0, f2, f2, this.f6930l0);
        }
    }

    /* renamed from: B0 */
    private void m9662B0(Canvas canvas, Rect rect) {
        if (!this.f6905M0) {
            this.f6930l0.setColor(this.f6937s0);
            this.f6930l0.setStyle(Paint.Style.FILL);
            this.f6933o0.set(rect);
            canvas.drawRoundRect(this.f6933o0, mo8060J0(), mo8060J0(), this.f6930l0);
        }
    }

    /* renamed from: C0 */
    private void m9663C0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (m9669N2()) {
            m9679p0(rect, this.f6933o0);
            RectF rectF = this.f6933o0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f6910R.setBounds(0, 0, (int) this.f6933o0.width(), (int) this.f6933o0.height());
            if (C5055b.f15051a) {
                this.f6911S.setBounds(this.f6910R.getBounds());
                this.f6911S.jumpToCurrentState();
                drawable = this.f6911S;
            } else {
                drawable = this.f6910R;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: D0 */
    private void m9664D0(Canvas canvas, Rect rect) {
        this.f6930l0.setColor(this.f6941w0);
        this.f6930l0.setStyle(Paint.Style.FILL);
        this.f6933o0.set(rect);
        if (!this.f6905M0) {
            canvas.drawRoundRect(this.f6933o0, mo8060J0(), mo8060J0(), this.f6930l0);
            return;
        }
        mo14939h(new RectF(rect), this.f6935q0);
        super.mo14944p(canvas, this.f6930l0, this.f6935q0, mo14947u());
    }

    /* renamed from: E0 */
    private void m9665E0(Canvas canvas, Rect rect) {
        Paint paint = this.f6931m0;
        if (paint != null) {
            paint.setColor(C3287a.m14162d(-16777216, 127));
            canvas.drawRect(rect, this.f6931m0);
            if (m9668M2() || m9667L2()) {
                m9676m0(rect, this.f6933o0);
                canvas.drawRect(this.f6933o0, this.f6931m0);
            }
            if (this.f6900K != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f6931m0);
            }
            if (m9669N2()) {
                m9679p0(rect, this.f6933o0);
                canvas.drawRect(this.f6933o0, this.f6931m0);
            }
            this.f6931m0.setColor(C3287a.m14162d(-65536, 127));
            m9678o0(rect, this.f6933o0);
            canvas.drawRect(this.f6933o0, this.f6931m0);
            this.f6931m0.setColor(C3287a.m14162d(-16711936, 127));
            m9680q0(rect, this.f6933o0);
            canvas.drawRect(this.f6933o0, this.f6931m0);
        }
    }

    /* renamed from: F0 */
    private void m9666F0(Canvas canvas, Rect rect) {
        if (this.f6900K != null) {
            Paint.Align u0 = mo8148u0(rect, this.f6934p0);
            m9683s0(rect, this.f6933o0);
            if (this.f6936r0.mo8603d() != null) {
                this.f6936r0.mo8604e().drawableState = getState();
                this.f6936r0.mo8609j(this.f6929k0);
            }
            this.f6936r0.mo8604e().setTextAlign(u0);
            int i = 0;
            boolean z = Math.round(this.f6936r0.mo8605f(mo8109g1().toString())) > Math.round(this.f6933o0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f6933o0);
            }
            CharSequence charSequence = this.f6900K;
            if (z && this.f6899J0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f6936r0.mo8604e(), this.f6933o0.width(), this.f6899J0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f6934p0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f6936r0.mo8604e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: L2 */
    private boolean m9667L2() {
        return this.f6916X && this.f6917Y != null && this.f6943y0;
    }

    /* renamed from: M2 */
    private boolean m9668M2() {
        return this.f6902L && this.f6904M != null;
    }

    /* renamed from: N2 */
    private boolean m9669N2() {
        return this.f6909Q && this.f6910R != null;
    }

    /* renamed from: O2 */
    private void m9670O2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: P2 */
    private void m9671P2() {
        this.f6895H0 = this.f6893G0 ? C5055b.m21364d(this.f6898J) : null;
    }

    @TargetApi(21)
    /* renamed from: Q2 */
    private void m9672Q2() {
        this.f6911S = new RippleDrawable(C5055b.m21364d(mo8105e1()), this.f6910R, f6882O0);
    }

    /* renamed from: a2 */
    private void m9673a2(ColorStateList colorStateList) {
        if (this.f6886D != colorStateList) {
            this.f6886D = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: k1 */
    private ColorFilter m9674k1() {
        ColorFilter colorFilter = this.f6884B0;
        return colorFilter != null ? colorFilter : this.f6885C0;
    }

    /* renamed from: l0 */
    private void m9675l0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0588a.m2770m(drawable, C0588a.m2763f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f6910R) {
                if (drawable.isStateful()) {
                    drawable.setState(mo8090X0());
                }
                C0588a.m2772o(drawable, this.f6912T);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f6904M;
            if (drawable == drawable2 && this.f6908P) {
                C0588a.m2772o(drawable2, this.f6906N);
            }
        }
    }

    /* renamed from: m0 */
    private void m9676m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m9668M2() || m9667L2()) {
            float f = this.f6921c0 + this.f6922d0;
            if (C0588a.m2763f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.f6907O;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.f6907O;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f6907O;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: m1 */
    private static boolean m9677m1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o0 */
    private void m9678o0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m9669N2()) {
            float f = this.f6928j0 + this.f6927i0 + this.f6913U + this.f6926h0 + this.f6925g0;
            if (C0588a.m2763f(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: p0 */
    private void m9679p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m9669N2()) {
            float f = this.f6928j0 + this.f6927i0;
            if (C0588a.m2763f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f6913U;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f6913U;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f6913U;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: q0 */
    private void m9680q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m9669N2()) {
            float f = this.f6928j0 + this.f6927i0 + this.f6913U + this.f6926h0 + this.f6925g0;
            if (C0588a.m2763f(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: q1 */
    private static boolean m9681q1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: r1 */
    private static boolean m9682r1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: s0 */
    private void m9683s0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f6900K != null) {
            float n0 = this.f6921c0 + mo8129n0() + this.f6924f0;
            float r0 = this.f6928j0 + mo8140r0() + this.f6925g0;
            if (C0588a.m2763f(this) == 0) {
                rectF.left = ((float) rect.left) + n0;
                rectF.right = ((float) rect.right) - r0;
            } else {
                rectF.left = ((float) rect.left) + r0;
                rectF.right = ((float) rect.right) - n0;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f15031b;
     */
    /* renamed from: s1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m9684s1(p148g.p189d.p190a.p252d.p269y.C5047d r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.f15031b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C2093a.m9684s1(g.d.a.d.y.d):boolean");
    }

    /* renamed from: t0 */
    private float m9685t0() {
        this.f6936r0.mo8604e().getFontMetrics(this.f6932n0);
        Paint.FontMetrics fontMetrics = this.f6932n0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0165  */
    /* renamed from: t1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9686t1(android.util.AttributeSet r8, int r9, int r10) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f6929k0
            int[] r2 = p148g.p189d.p190a.p252d.C5006l.Chip
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r8
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C2205o.m10305h(r0, r1, r2, r3, r4, r5)
            int r10 = p148g.p189d.p190a.p252d.C5006l.Chip_shapeAppearance
            boolean r10 = r9.hasValue(r10)
            r7.f6905M0 = r10
            android.content.Context r10 = r7.f6929k0
            int r0 = p148g.p189d.p190a.p252d.C5006l.Chip_chipSurfaceColor
            android.content.res.ColorStateList r10 = p148g.p189d.p190a.p252d.p269y.C5046c.m21335a(r10, r9, r0)
            r7.m9673a2(r10)
            android.content.Context r10 = r7.f6929k0
            int r0 = p148g.p189d.p190a.p252d.C5006l.Chip_chipBackgroundColor
            android.content.res.ColorStateList r10 = p148g.p189d.p190a.p252d.p269y.C5046c.m21335a(r10, r9, r0)
            r7.mo8047E1(r10)
            int r10 = p148g.p189d.p190a.p252d.C5006l.Chip_chipMinHeight
            r0 = 0
            float r10 = r9.getDimension(r10, r0)
            r7.mo8081S1(r10)
            int r10 = p148g.p189d.p190a.p252d.C5006l.Chip_chipCornerRadius
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L_0x0047
            int r10 = p148g.p189d.p190a.p252d.C5006l.Chip_chipCornerRadius
            float r10 = r9.getDimension(r10, r0)
            r7.mo8052G1(r10)
        L_0x0047:
            android.content.Context r10 = r7.f6929k0
            int r1 = p148g.p189d.p190a.p252d.C5006l.Chip_chipStrokeColor
            android.content.res.ColorStateList r10 = p148g.p189d.p190a.p252d.p269y.C5046c.m21335a(r10, r9, r1)
            r7.mo8089W1(r10)
            int r10 = p148g.p189d.p190a.p252d.C5006l.Chip_chipStrokeWidth
            float r10 = r9.getDimension(r10, r0)
            r7.mo8093Y1(r10)
            android.content.Context r10 = r7.f6929k0
            int r1 = p148g.p189d.p190a.p252d.C5006l.Chip_rippleColor
            android.content.res.ColorStateList r10 = p148g.p189d.p190a.p252d.p269y.C5046c.m21335a(r10, r9, r1)
            r7.mo8156x2(r10)
            int r10 = p148g.p189d.p190a.p252d.C5006l.Chip_android_text
            java.lang.CharSequence r10 = r9.getText(r10)
            r7.mo8044C2(r10)
            android.content.Context r10 = r7.f6929k0
            int r1 = p148g.p189d.p190a.p252d.C5006l.Chip_android_textAppearance
            g.d.a.d.y.d r10 = p148g.p189d.p190a.p252d.p269y.C5046c.m21340f(r10, r9, r1)
            r7.mo8046D2(r10)
            int r10 = p148g.p189d.p190a.p252d.C5006l.Chip_android_ellipsize
            int r10 = r9.getInt(r10, r6)
            r1 = 1
            if (r10 == r1) goto L_0x0090
            r1 = 2
            if (r10 == r1) goto L_0x008d
            r1 = 3
            if (r10 == r1) goto L_0x008a
            goto L_0x0095
        L_0x008a:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            goto L_0x0092
        L_0x008d:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x0092
        L_0x0090:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.START
        L_0x0092:
            r7.mo8138p2(r10)
        L_0x0095:
            int r10 = p148g.p189d.p190a.p252d.C5006l.Chip_chipIconVisible
            boolean r10 = r9.getBoolean(r10, r6)
            r7.mo8079R1(r10)
            java.lang.String r10 = "http://schemas.android.com/apk/res-auto"
            if (r8 == 0) goto L_0x00bb
            java.lang.String r1 = "chipIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x00bb
            java.lang.String r1 = "chipIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x00bb
            int r1 = p148g.p189d.p190a.p252d.C5006l.Chip_chipIconEnabled
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo8079R1(r1)
        L_0x00bb:
            android.content.Context r1 = r7.f6929k0
            int r2 = p148g.p189d.p190a.p252d.C5006l.Chip_chipIcon
            android.graphics.drawable.Drawable r1 = p148g.p189d.p190a.p252d.p269y.C5046c.m21338d(r1, r9, r2)
            r7.mo8064K1(r1)
            int r1 = p148g.p189d.p190a.p252d.C5006l.Chip_chipIconTint
            boolean r1 = r9.hasValue(r1)
            if (r1 == 0) goto L_0x00d9
            android.content.Context r1 = r7.f6929k0
            int r2 = p148g.p189d.p190a.p252d.C5006l.Chip_chipIconTint
            android.content.res.ColorStateList r1 = p148g.p189d.p190a.p252d.p269y.C5046c.m21335a(r1, r9, r2)
            r7.mo8073O1(r1)
        L_0x00d9:
            int r1 = p148g.p189d.p190a.p252d.C5006l.Chip_chipIconSize
            float r1 = r9.getDimension(r1, r0)
            r7.mo8069M1(r1)
            int r1 = p148g.p189d.p190a.p252d.C5006l.Chip_closeIconVisible
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo8131n2(r1)
            if (r8 == 0) goto L_0x0106
            java.lang.String r1 = "closeIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "closeIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x0106
            int r1 = p148g.p189d.p190a.p252d.C5006l.Chip_closeIconEnabled
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo8131n2(r1)
        L_0x0106:
            android.content.Context r1 = r7.f6929k0
            int r2 = p148g.p189d.p190a.p252d.C5006l.Chip_closeIcon
            android.graphics.drawable.Drawable r1 = p148g.p189d.p190a.p252d.p269y.C5046c.m21338d(r1, r9, r2)
            r7.mo8099b2(r1)
            android.content.Context r1 = r7.f6929k0
            int r2 = p148g.p189d.p190a.p252d.C5006l.Chip_closeIconTint
            android.content.res.ColorStateList r1 = p148g.p189d.p190a.p252d.p269y.C5046c.m21335a(r1, r9, r2)
            r7.mo8127l2(r1)
            int r1 = p148g.p189d.p190a.p252d.C5006l.Chip_closeIconSize
            float r1 = r9.getDimension(r1, r0)
            r7.mo8110g2(r1)
            int r1 = p148g.p189d.p190a.p252d.C5006l.Chip_android_checkable
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo8153w1(r1)
            int r1 = p148g.p189d.p190a.p252d.C5006l.Chip_checkedIconVisible
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo8045D1(r1)
            if (r8 == 0) goto L_0x0152
            java.lang.String r1 = "checkedIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x0152
            java.lang.String r1 = "checkedIconVisible"
            java.lang.String r8 = r8.getAttributeValue(r10, r1)
            if (r8 != 0) goto L_0x0152
            int r8 = p148g.p189d.p190a.p252d.C5006l.Chip_checkedIconEnabled
            boolean r8 = r9.getBoolean(r8, r6)
            r7.mo8045D1(r8)
        L_0x0152:
            android.content.Context r8 = r7.f6929k0
            int r10 = p148g.p189d.p190a.p252d.C5006l.Chip_checkedIcon
            android.graphics.drawable.Drawable r8 = p148g.p189d.p190a.p252d.p269y.C5046c.m21338d(r8, r9, r10)
            r7.mo8157y1(r8)
            int r8 = p148g.p189d.p190a.p252d.C5006l.Chip_checkedIconTint
            boolean r8 = r9.hasValue(r8)
            if (r8 == 0) goto L_0x0170
            android.content.Context r8 = r7.f6929k0
            int r10 = p148g.p189d.p190a.p252d.C5006l.Chip_checkedIconTint
            android.content.res.ColorStateList r8 = p148g.p189d.p190a.p252d.p269y.C5046c.m21335a(r8, r9, r10)
            r7.mo8039A1(r8)
        L_0x0170:
            android.content.Context r8 = r7.f6929k0
            int r10 = p148g.p189d.p190a.p252d.C5006l.Chip_showMotionSpec
            g.d.a.d.m.h r8 = p148g.p189d.p190a.p252d.p256m.C5014h.m21213b(r8, r9, r10)
            r7.mo8040A2(r8)
            android.content.Context r8 = r7.f6929k0
            int r10 = p148g.p189d.p190a.p252d.C5006l.Chip_hideMotionSpec
            g.d.a.d.m.h r8 = p148g.p189d.p190a.p252d.p256m.C5014h.m21213b(r8, r9, r10)
            r7.mo8139q2(r8)
            int r8 = p148g.p189d.p190a.p252d.C5006l.Chip_chipStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8085U1(r8)
            int r8 = p148g.p189d.p190a.p252d.C5006l.Chip_iconStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8150u2(r8)
            int r8 = p148g.p189d.p190a.p252d.C5006l.Chip_iconEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8142s2(r8)
            int r8 = p148g.p189d.p190a.p252d.C5006l.Chip_textStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8056H2(r8)
            int r8 = p148g.p189d.p190a.p252d.C5006l.Chip_textEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8050F2(r8)
            int r8 = p148g.p189d.p190a.p252d.C5006l.Chip_closeIconStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8120i2(r8)
            int r8 = p148g.p189d.p190a.p252d.C5006l.Chip_closeIconEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8103d2(r8)
            int r8 = p148g.p189d.p190a.p252d.C5006l.Chip_chipEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8058I1(r8)
            int r8 = p148g.p189d.p190a.p252d.C5006l.Chip_android_maxWidth
            r10 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r9.getDimensionPixelSize(r8, r10)
            r7.mo8154w2(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C2093a.m9686t1(android.util.AttributeSet, int, int):void");
    }

    /* renamed from: v0 */
    private boolean m9687v0() {
        return this.f6916X && this.f6917Y != null && this.f6915W;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014a  */
    /* renamed from: v1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m9688v1(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f6886D
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f6937s0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r6.f6937s0
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r6.f6937s0 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r3 = r6.f6888E
            if (r3 == 0) goto L_0x0024
            int r5 = r6.f6938t0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            int r5 = r6.f6938t0
            if (r5 == r3) goto L_0x002c
            r6.f6938t0 = r3
            r0 = 1
        L_0x002c:
            int r1 = p148g.p189d.p190a.p252d.p262r.C5035a.m21307e(r1, r3)
            int r3 = r6.f6939u0
            if (r3 == r1) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            android.content.res.ColorStateList r5 = r6.mo14949x()
            if (r5 != 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x004d
            r6.f6939u0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.mo14926X(r0)
            r0 = 1
        L_0x004d:
            android.content.res.ColorStateList r1 = r6.f6894H
            if (r1 == 0) goto L_0x0058
            int r3 = r6.f6940v0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            int r3 = r6.f6940v0
            if (r3 == r1) goto L_0x0060
            r6.f6940v0 = r1
            r0 = 1
        L_0x0060:
            android.content.res.ColorStateList r1 = r6.f6895H0
            if (r1 == 0) goto L_0x0073
            boolean r1 = p148g.p189d.p190a.p252d.p270z.C5055b.m21365e(r7)
            if (r1 == 0) goto L_0x0073
            android.content.res.ColorStateList r1 = r6.f6895H0
            int r3 = r6.f6941w0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            int r3 = r6.f6941w0
            if (r3 == r1) goto L_0x007f
            r6.f6941w0 = r1
            boolean r1 = r6.f6893G0
            if (r1 == 0) goto L_0x007f
            r0 = 1
        L_0x007f:
            com.google.android.material.internal.n r1 = r6.f6936r0
            g.d.a.d.y.d r1 = r1.mo8603d()
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.n r1 = r6.f6936r0
            g.d.a.d.y.d r1 = r1.mo8603d()
            android.content.res.ColorStateList r1 = r1.f15031b
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.n r1 = r6.f6936r0
            g.d.a.d.y.d r1 = r1.mo8603d()
            android.content.res.ColorStateList r1 = r1.f15031b
            int r3 = r6.f6942x0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            int r3 = r6.f6942x0
            if (r3 == r1) goto L_0x00a8
            r6.f6942x0 = r1
            r0 = 1
        L_0x00a8:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m9677m1(r1, r3)
            if (r1 == 0) goto L_0x00bb
            boolean r1 = r6.f6915W
            if (r1 == 0) goto L_0x00bb
            r1 = 1
            goto L_0x00bc
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            boolean r3 = r6.f6943y0
            if (r3 == r1) goto L_0x00d6
            android.graphics.drawable.Drawable r3 = r6.f6917Y
            if (r3 == 0) goto L_0x00d6
            float r0 = r6.mo8129n0()
            r6.f6943y0 = r1
            float r1 = r6.mo8129n0()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            r0 = 1
            r1 = 1
            goto L_0x00d7
        L_0x00d5:
            r0 = 1
        L_0x00d6:
            r1 = 0
        L_0x00d7:
            android.content.res.ColorStateList r3 = r6.f6887D0
            if (r3 == 0) goto L_0x00e2
            int r5 = r6.f6944z0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00e3
        L_0x00e2:
            r3 = 0
        L_0x00e3:
            int r5 = r6.f6944z0
            if (r5 == r3) goto L_0x00f4
            r6.f6944z0 = r3
            android.content.res.ColorStateList r0 = r6.f6887D0
            android.graphics.PorterDuff$Mode r3 = r6.f6889E0
            android.graphics.PorterDuffColorFilter r0 = p148g.p189d.p190a.p252d.p264t.C5037a.m21310a(r6, r0, r3)
            r6.f6885C0 = r0
            goto L_0x00f5
        L_0x00f4:
            r4 = r0
        L_0x00f5:
            android.graphics.drawable.Drawable r0 = r6.f6904M
            boolean r0 = m9682r1(r0)
            if (r0 == 0) goto L_0x0104
            android.graphics.drawable.Drawable r0 = r6.f6904M
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0104:
            android.graphics.drawable.Drawable r0 = r6.f6917Y
            boolean r0 = m9682r1(r0)
            if (r0 == 0) goto L_0x0113
            android.graphics.drawable.Drawable r0 = r6.f6917Y
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0113:
            android.graphics.drawable.Drawable r0 = r6.f6910R
            boolean r0 = m9682r1(r0)
            if (r0 == 0) goto L_0x0130
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.f6910R
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x0130:
            boolean r7 = p148g.p189d.p190a.p252d.p270z.C5055b.f15051a
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.f6911S
            boolean r7 = m9682r1(r7)
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.f6911S
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x0143:
            if (r4 == 0) goto L_0x0148
            r6.invalidateSelf()
        L_0x0148:
            if (r1 == 0) goto L_0x014d
            r6.mo8149u1()
        L_0x014d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C2093a.m9688v1(int[], int[]):boolean");
    }

    /* renamed from: w0 */
    public static C2093a m9689w0(Context context, AttributeSet attributeSet, int i, int i2) {
        C2093a aVar = new C2093a(context, attributeSet, i, i2);
        aVar.m9686t1(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: x0 */
    private void m9690x0(Canvas canvas, Rect rect) {
        if (m9667L2()) {
            m9676m0(rect, this.f6933o0);
            RectF rectF = this.f6933o0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f6917Y.setBounds(0, 0, (int) this.f6933o0.width(), (int) this.f6933o0.height());
            this.f6917Y.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: y0 */
    private void m9691y0(Canvas canvas, Rect rect) {
        if (!this.f6905M0) {
            this.f6930l0.setColor(this.f6938t0);
            this.f6930l0.setStyle(Paint.Style.FILL);
            this.f6930l0.setColorFilter(m9674k1());
            this.f6933o0.set(rect);
            canvas.drawRoundRect(this.f6933o0, mo8060J0(), mo8060J0(), this.f6930l0);
        }
    }

    /* renamed from: z0 */
    private void m9692z0(Canvas canvas, Rect rect) {
        if (m9668M2()) {
            m9676m0(rect, this.f6933o0);
            RectF rectF = this.f6933o0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f6904M.setBounds(0, 0, (int) this.f6933o0.width(), (int) this.f6933o0.height());
            this.f6904M.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: A1 */
    public void mo8039A1(ColorStateList colorStateList) {
        if (this.f6918Z != colorStateList) {
            this.f6918Z = colorStateList;
            if (m9687v0()) {
                C0588a.m2772o(this.f6917Y, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: A2 */
    public void mo8040A2(C5014h hVar) {
        this.f6919a0 = hVar;
    }

    /* renamed from: B1 */
    public void mo8041B1(int i) {
        mo8039A1(C3133a.m13387c(this.f6929k0, i));
    }

    /* renamed from: B2 */
    public void mo8042B2(int i) {
        mo8040A2(C5014h.m21214c(this.f6929k0, i));
    }

    /* renamed from: C1 */
    public void mo8043C1(int i) {
        mo8045D1(this.f6929k0.getResources().getBoolean(i));
    }

    /* renamed from: C2 */
    public void mo8044C2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (!TextUtils.equals(this.f6900K, charSequence)) {
            this.f6900K = charSequence;
            this.f6936r0.mo8608i(true);
            invalidateSelf();
            mo8149u1();
        }
    }

    /* renamed from: D1 */
    public void mo8045D1(boolean z) {
        if (this.f6916X != z) {
            boolean L2 = m9667L2();
            this.f6916X = z;
            boolean L22 = m9667L2();
            if (L2 != L22) {
                if (L22) {
                    m9675l0(this.f6917Y);
                } else {
                    m9670O2(this.f6917Y);
                }
                invalidateSelf();
                mo8149u1();
            }
        }
    }

    /* renamed from: D2 */
    public void mo8046D2(C5047d dVar) {
        this.f6936r0.mo8607h(dVar, this.f6929k0);
    }

    /* renamed from: E1 */
    public void mo8047E1(ColorStateList colorStateList) {
        if (this.f6888E != colorStateList) {
            this.f6888E = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: E2 */
    public void mo8048E2(int i) {
        mo8046D2(new C5047d(this.f6929k0, i));
    }

    /* renamed from: F1 */
    public void mo8049F1(int i) {
        mo8047E1(C3133a.m13387c(this.f6929k0, i));
    }

    /* renamed from: F2 */
    public void mo8050F2(float f) {
        if (this.f6925g0 != f) {
            this.f6925g0 = f;
            invalidateSelf();
            mo8149u1();
        }
    }

    /* renamed from: G0 */
    public Drawable mo8051G0() {
        return this.f6917Y;
    }

    @Deprecated
    /* renamed from: G1 */
    public void mo8052G1(float f) {
        if (this.f6892G != f) {
            this.f6892G = f;
            setShapeAppearanceModel(mo14914D().mo14973w(f));
        }
    }

    /* renamed from: G2 */
    public void mo8053G2(int i) {
        mo8050F2(this.f6929k0.getResources().getDimension(i));
    }

    /* renamed from: H0 */
    public ColorStateList mo8054H0() {
        return this.f6918Z;
    }

    @Deprecated
    /* renamed from: H1 */
    public void mo8055H1(int i) {
        mo8052G1(this.f6929k0.getResources().getDimension(i));
    }

    /* renamed from: H2 */
    public void mo8056H2(float f) {
        if (this.f6924f0 != f) {
            this.f6924f0 = f;
            invalidateSelf();
            mo8149u1();
        }
    }

    /* renamed from: I0 */
    public ColorStateList mo8057I0() {
        return this.f6888E;
    }

    /* renamed from: I1 */
    public void mo8058I1(float f) {
        if (this.f6928j0 != f) {
            this.f6928j0 = f;
            invalidateSelf();
            mo8149u1();
        }
    }

    /* renamed from: I2 */
    public void mo8059I2(int i) {
        mo8056H2(this.f6929k0.getResources().getDimension(i));
    }

    /* renamed from: J0 */
    public float mo8060J0() {
        return this.f6905M0 ? mo14916G() : this.f6892G;
    }

    /* renamed from: J1 */
    public void mo8061J1(int i) {
        mo8058I1(this.f6929k0.getResources().getDimension(i));
    }

    /* renamed from: J2 */
    public void mo8062J2(boolean z) {
        if (this.f6893G0 != z) {
            this.f6893G0 = z;
            m9671P2();
            onStateChange(getState());
        }
    }

    /* renamed from: K0 */
    public float mo8063K0() {
        return this.f6928j0;
    }

    /* renamed from: K1 */
    public void mo8064K1(Drawable drawable) {
        Drawable L0 = mo8066L0();
        if (L0 != drawable) {
            float n0 = mo8129n0();
            this.f6904M = drawable != null ? C0588a.m2775r(drawable).mutate() : null;
            float n02 = mo8129n0();
            m9670O2(L0);
            if (m9668M2()) {
                m9675l0(this.f6904M);
            }
            invalidateSelf();
            if (n0 != n02) {
                mo8149u1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K2 */
    public boolean mo8065K2() {
        return this.f6901K0;
    }

    /* renamed from: L0 */
    public Drawable mo8066L0() {
        Drawable drawable = this.f6904M;
        if (drawable != null) {
            return C0588a.m2774q(drawable);
        }
        return null;
    }

    /* renamed from: L1 */
    public void mo8067L1(int i) {
        mo8064K1(C3133a.m13388d(this.f6929k0, i));
    }

    /* renamed from: M0 */
    public float mo8068M0() {
        return this.f6907O;
    }

    /* renamed from: M1 */
    public void mo8069M1(float f) {
        if (this.f6907O != f) {
            float n0 = mo8129n0();
            this.f6907O = f;
            float n02 = mo8129n0();
            invalidateSelf();
            if (n0 != n02) {
                mo8149u1();
            }
        }
    }

    /* renamed from: N0 */
    public ColorStateList mo8070N0() {
        return this.f6906N;
    }

    /* renamed from: N1 */
    public void mo8071N1(int i) {
        mo8069M1(this.f6929k0.getResources().getDimension(i));
    }

    /* renamed from: O0 */
    public float mo8072O0() {
        return this.f6890F;
    }

    /* renamed from: O1 */
    public void mo8073O1(ColorStateList colorStateList) {
        this.f6908P = true;
        if (this.f6906N != colorStateList) {
            this.f6906N = colorStateList;
            if (m9668M2()) {
                C0588a.m2772o(this.f6904M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: P0 */
    public float mo8074P0() {
        return this.f6921c0;
    }

    /* renamed from: P1 */
    public void mo8075P1(int i) {
        mo8073O1(C3133a.m13387c(this.f6929k0, i));
    }

    /* renamed from: Q0 */
    public ColorStateList mo8076Q0() {
        return this.f6894H;
    }

    /* renamed from: Q1 */
    public void mo8077Q1(int i) {
        mo8079R1(this.f6929k0.getResources().getBoolean(i));
    }

    /* renamed from: R0 */
    public float mo8078R0() {
        return this.f6896I;
    }

    /* renamed from: R1 */
    public void mo8079R1(boolean z) {
        if (this.f6902L != z) {
            boolean M2 = m9668M2();
            this.f6902L = z;
            boolean M22 = m9668M2();
            if (M2 != M22) {
                if (M22) {
                    m9675l0(this.f6904M);
                } else {
                    m9670O2(this.f6904M);
                }
                invalidateSelf();
                mo8149u1();
            }
        }
    }

    /* renamed from: S0 */
    public Drawable mo8080S0() {
        Drawable drawable = this.f6910R;
        if (drawable != null) {
            return C0588a.m2774q(drawable);
        }
        return null;
    }

    /* renamed from: S1 */
    public void mo8081S1(float f) {
        if (this.f6890F != f) {
            this.f6890F = f;
            invalidateSelf();
            mo8149u1();
        }
    }

    /* renamed from: T0 */
    public CharSequence mo8082T0() {
        return this.f6914V;
    }

    /* renamed from: T1 */
    public void mo8083T1(int i) {
        mo8081S1(this.f6929k0.getResources().getDimension(i));
    }

    /* renamed from: U0 */
    public float mo8084U0() {
        return this.f6927i0;
    }

    /* renamed from: U1 */
    public void mo8085U1(float f) {
        if (this.f6921c0 != f) {
            this.f6921c0 = f;
            invalidateSelf();
            mo8149u1();
        }
    }

    /* renamed from: V0 */
    public float mo8086V0() {
        return this.f6913U;
    }

    /* renamed from: V1 */
    public void mo8087V1(int i) {
        mo8085U1(this.f6929k0.getResources().getDimension(i));
    }

    /* renamed from: W0 */
    public float mo8088W0() {
        return this.f6926h0;
    }

    /* renamed from: W1 */
    public void mo8089W1(ColorStateList colorStateList) {
        if (this.f6894H != colorStateList) {
            this.f6894H = colorStateList;
            if (this.f6905M0) {
                mo14935g0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: X0 */
    public int[] mo8090X0() {
        return this.f6891F0;
    }

    /* renamed from: X1 */
    public void mo8091X1(int i) {
        mo8089W1(C3133a.m13387c(this.f6929k0, i));
    }

    /* renamed from: Y0 */
    public ColorStateList mo8092Y0() {
        return this.f6912T;
    }

    /* renamed from: Y1 */
    public void mo8093Y1(float f) {
        if (this.f6896I != f) {
            this.f6896I = f;
            this.f6930l0.setStrokeWidth(f);
            if (this.f6905M0) {
                super.mo14940h0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: Z0 */
    public void mo8094Z0(RectF rectF) {
        m9680q0(getBounds(), rectF);
    }

    /* renamed from: Z1 */
    public void mo8095Z1(int i) {
        mo8093Y1(this.f6929k0.getResources().getDimension(i));
    }

    /* renamed from: a */
    public void mo8096a() {
        mo8149u1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public TextUtils.TruncateAt mo8097a1() {
        return this.f6899J0;
    }

    /* renamed from: b1 */
    public C5014h mo8098b1() {
        return this.f6920b0;
    }

    /* renamed from: b2 */
    public void mo8099b2(Drawable drawable) {
        Drawable S0 = mo8080S0();
        if (S0 != drawable) {
            float r0 = mo8140r0();
            this.f6910R = drawable != null ? C0588a.m2775r(drawable).mutate() : null;
            if (C5055b.f15051a) {
                m9672Q2();
            }
            float r02 = mo8140r0();
            m9670O2(S0);
            if (m9669N2()) {
                m9675l0(this.f6910R);
            }
            invalidateSelf();
            if (r0 != r02) {
                mo8149u1();
            }
        }
    }

    /* renamed from: c1 */
    public float mo8100c1() {
        return this.f6923e0;
    }

    /* renamed from: c2 */
    public void mo8101c2(CharSequence charSequence) {
        if (this.f6914V != charSequence) {
            this.f6914V = C3326a.m14300c().mo11502h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: d1 */
    public float mo8102d1() {
        return this.f6922d0;
    }

    /* renamed from: d2 */
    public void mo8103d2(float f) {
        if (this.f6927i0 != f) {
            this.f6927i0 = f;
            invalidateSelf();
            if (m9669N2()) {
                mo8149u1();
            }
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f6883A0;
            if (i2 < 255) {
                i = C5022a.m21278a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m9662B0(canvas, bounds);
            m9691y0(canvas, bounds);
            if (this.f6905M0) {
                super.draw(canvas);
            }
            m9661A0(canvas, bounds);
            m9664D0(canvas, bounds);
            m9692z0(canvas, bounds);
            m9690x0(canvas, bounds);
            if (this.f6901K0) {
                m9666F0(canvas, bounds);
            }
            m9663C0(canvas, bounds);
            m9665E0(canvas, bounds);
            if (this.f6883A0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public ColorStateList mo8105e1() {
        return this.f6898J;
    }

    /* renamed from: e2 */
    public void mo8106e2(int i) {
        mo8103d2(this.f6929k0.getResources().getDimension(i));
    }

    /* renamed from: f1 */
    public C5014h mo8107f1() {
        return this.f6919a0;
    }

    /* renamed from: f2 */
    public void mo8108f2(int i) {
        mo8099b2(C3133a.m13388d(this.f6929k0, i));
    }

    /* renamed from: g1 */
    public CharSequence mo8109g1() {
        return this.f6900K;
    }

    /* renamed from: g2 */
    public void mo8110g2(float f) {
        if (this.f6913U != f) {
            this.f6913U = f;
            invalidateSelf();
            if (m9669N2()) {
                mo8149u1();
            }
        }
    }

    public int getAlpha() {
        return this.f6883A0;
    }

    public ColorFilter getColorFilter() {
        return this.f6884B0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f6890F;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f6921c0 + mo8129n0() + this.f6924f0 + this.f6936r0.mo8605f(mo8109g1().toString()) + this.f6925g0 + mo8140r0() + this.f6928j0), this.f6903L0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f6905M0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f6892G);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f6892G);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h1 */
    public C5047d mo8117h1() {
        return this.f6936r0.mo8603d();
    }

    /* renamed from: h2 */
    public void mo8118h2(int i) {
        mo8110g2(this.f6929k0.getResources().getDimension(i));
    }

    /* renamed from: i1 */
    public float mo8119i1() {
        return this.f6925g0;
    }

    /* renamed from: i2 */
    public void mo8120i2(float f) {
        if (this.f6926h0 != f) {
            this.f6926h0 = f;
            invalidateSelf();
            if (m9669N2()) {
                mo8149u1();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m9681q1(this.f6886D) || m9681q1(this.f6888E) || m9681q1(this.f6894H) || (this.f6893G0 && m9681q1(this.f6895H0)) || m9684s1(this.f6936r0.mo8603d()) || m9687v0() || m9682r1(this.f6904M) || m9682r1(this.f6917Y) || m9681q1(this.f6887D0);
    }

    /* renamed from: j1 */
    public float mo8123j1() {
        return this.f6924f0;
    }

    /* renamed from: j2 */
    public void mo8124j2(int i) {
        mo8120i2(this.f6929k0.getResources().getDimension(i));
    }

    /* renamed from: k2 */
    public boolean mo8125k2(int[] iArr) {
        if (Arrays.equals(this.f6891F0, iArr)) {
            return false;
        }
        this.f6891F0 = iArr;
        if (m9669N2()) {
            return m9688v1(getState(), iArr);
        }
        return false;
    }

    /* renamed from: l1 */
    public boolean mo8126l1() {
        return this.f6893G0;
    }

    /* renamed from: l2 */
    public void mo8127l2(ColorStateList colorStateList) {
        if (this.f6912T != colorStateList) {
            this.f6912T = colorStateList;
            if (m9669N2()) {
                C0588a.m2772o(this.f6910R, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: m2 */
    public void mo8128m2(int i) {
        mo8127l2(C3133a.m13387c(this.f6929k0, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public float mo8129n0() {
        if (m9668M2() || m9667L2()) {
            return this.f6922d0 + this.f6907O + this.f6923e0;
        }
        return 0.0f;
    }

    /* renamed from: n1 */
    public boolean mo8130n1() {
        return this.f6915W;
    }

    /* renamed from: n2 */
    public void mo8131n2(boolean z) {
        if (this.f6909Q != z) {
            boolean N2 = m9669N2();
            this.f6909Q = z;
            boolean N22 = m9669N2();
            if (N2 != N22) {
                if (N22) {
                    m9675l0(this.f6910R);
                } else {
                    m9670O2(this.f6910R);
                }
                invalidateSelf();
                mo8149u1();
            }
        }
    }

    /* renamed from: o1 */
    public boolean mo8132o1() {
        return m9682r1(this.f6910R);
    }

    /* renamed from: o2 */
    public void mo8133o2(C2094a aVar) {
        this.f6897I0 = new WeakReference<>(aVar);
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m9668M2()) {
            onLayoutDirectionChanged |= C0588a.m2770m(this.f6904M, i);
        }
        if (m9667L2()) {
            onLayoutDirectionChanged |= C0588a.m2770m(this.f6917Y, i);
        }
        if (m9669N2()) {
            onLayoutDirectionChanged |= C0588a.m2770m(this.f6910R, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m9668M2()) {
            onLevelChange |= this.f6904M.setLevel(i);
        }
        if (m9667L2()) {
            onLevelChange |= this.f6917Y.setLevel(i);
        }
        if (m9669N2()) {
            onLevelChange |= this.f6910R.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f6905M0) {
            super.onStateChange(iArr);
        }
        return m9688v1(iArr, mo8090X0());
    }

    /* renamed from: p1 */
    public boolean mo8137p1() {
        return this.f6909Q;
    }

    /* renamed from: p2 */
    public void mo8138p2(TextUtils.TruncateAt truncateAt) {
        this.f6899J0 = truncateAt;
    }

    /* renamed from: q2 */
    public void mo8139q2(C5014h hVar) {
        this.f6920b0 = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public float mo8140r0() {
        if (m9669N2()) {
            return this.f6926h0 + this.f6913U + this.f6927i0;
        }
        return 0.0f;
    }

    /* renamed from: r2 */
    public void mo8141r2(int i) {
        mo8139q2(C5014h.m21214c(this.f6929k0, i));
    }

    /* renamed from: s2 */
    public void mo8142s2(float f) {
        if (this.f6923e0 != f) {
            float n0 = mo8129n0();
            this.f6923e0 = f;
            float n02 = mo8129n0();
            invalidateSelf();
            if (n0 != n02) {
                mo8149u1();
            }
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f6883A0 != i) {
            this.f6883A0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f6884B0 != colorFilter) {
            this.f6884B0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f6887D0 != colorStateList) {
            this.f6887D0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f6889E0 != mode) {
            this.f6889E0 = mode;
            this.f6885C0 = C5037a.m21310a(this, this.f6887D0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m9668M2()) {
            visible |= this.f6904M.setVisible(z, z2);
        }
        if (m9667L2()) {
            visible |= this.f6917Y.setVisible(z, z2);
        }
        if (m9669N2()) {
            visible |= this.f6910R.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t2 */
    public void mo8147t2(int i) {
        mo8142s2(this.f6929k0.getResources().getDimension(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public Paint.Align mo8148u0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f6900K != null) {
            float n0 = this.f6921c0 + mo8129n0() + this.f6924f0;
            if (C0588a.m2763f(this) == 0) {
                pointF.x = ((float) rect.left) + n0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - n0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m9685t0();
        }
        return align;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo8149u1() {
        C2094a aVar = (C2094a) this.f6897I0.get();
        if (aVar != null) {
            aVar.mo7852a();
        }
    }

    /* renamed from: u2 */
    public void mo8150u2(float f) {
        if (this.f6922d0 != f) {
            float n0 = mo8129n0();
            this.f6922d0 = f;
            float n02 = mo8129n0();
            invalidateSelf();
            if (n0 != n02) {
                mo8149u1();
            }
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v2 */
    public void mo8152v2(int i) {
        mo8150u2(this.f6929k0.getResources().getDimension(i));
    }

    /* renamed from: w1 */
    public void mo8153w1(boolean z) {
        if (this.f6915W != z) {
            this.f6915W = z;
            float n0 = mo8129n0();
            if (!z && this.f6943y0) {
                this.f6943y0 = false;
            }
            float n02 = mo8129n0();
            invalidateSelf();
            if (n0 != n02) {
                mo8149u1();
            }
        }
    }

    /* renamed from: w2 */
    public void mo8154w2(int i) {
        this.f6903L0 = i;
    }

    /* renamed from: x1 */
    public void mo8155x1(int i) {
        mo8153w1(this.f6929k0.getResources().getBoolean(i));
    }

    /* renamed from: x2 */
    public void mo8156x2(ColorStateList colorStateList) {
        if (this.f6898J != colorStateList) {
            this.f6898J = colorStateList;
            m9671P2();
            onStateChange(getState());
        }
    }

    /* renamed from: y1 */
    public void mo8157y1(Drawable drawable) {
        if (this.f6917Y != drawable) {
            float n0 = mo8129n0();
            this.f6917Y = drawable;
            float n02 = mo8129n0();
            m9670O2(this.f6917Y);
            m9675l0(this.f6917Y);
            invalidateSelf();
            if (n0 != n02) {
                mo8149u1();
            }
        }
    }

    /* renamed from: y2 */
    public void mo8158y2(int i) {
        mo8156x2(C3133a.m13387c(this.f6929k0, i));
    }

    /* renamed from: z1 */
    public void mo8159z1(int i) {
        mo8157y1(C3133a.m13388d(this.f6929k0, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z2 */
    public void mo8160z2(boolean z) {
        this.f6901K0 = z;
    }
}
