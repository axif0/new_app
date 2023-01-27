package p148g.p189d.p190a.p252d.p254b0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.C0589b;
import java.util.BitSet;
import p086f.p111h.p121l.C3344c;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.p253a0.C4963a;
import p148g.p189d.p190a.p252d.p254b0.C4979k;
import p148g.p189d.p190a.p252d.p254b0.C4983l;
import p148g.p189d.p190a.p252d.p254b0.C4986m;
import p148g.p189d.p190a.p252d.p262r.C5035a;
import p148g.p189d.p190a.p252d.p265u.C5038a;

/* renamed from: g.d.a.d.b0.g */
public class C4972g extends Drawable implements C0589b, C4994n {

    /* renamed from: B */
    private static final String f14811B = C4972g.class.getSimpleName();

    /* renamed from: C */
    private static final Paint f14812C = new Paint(1);

    /* renamed from: A */
    private boolean f14813A;

    /* renamed from: f */
    private C4975c f14814f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4986m.C4993g[] f14815g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C4986m.C4993g[] f14816h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final BitSet f14817i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f14818j;

    /* renamed from: k */
    private final Matrix f14819k;

    /* renamed from: l */
    private final Path f14820l;

    /* renamed from: m */
    private final Path f14821m;

    /* renamed from: n */
    private final RectF f14822n;

    /* renamed from: o */
    private final RectF f14823o;

    /* renamed from: p */
    private final Region f14824p;

    /* renamed from: q */
    private final Region f14825q;

    /* renamed from: r */
    private C4979k f14826r;

    /* renamed from: s */
    private final Paint f14827s;

    /* renamed from: t */
    private final Paint f14828t;

    /* renamed from: u */
    private final C4963a f14829u;

    /* renamed from: v */
    private final C4983l.C4984a f14830v;

    /* renamed from: w */
    private final C4983l f14831w;

    /* renamed from: x */
    private PorterDuffColorFilter f14832x;

    /* renamed from: y */
    private PorterDuffColorFilter f14833y;

    /* renamed from: z */
    private final RectF f14834z;

    /* renamed from: g.d.a.d.b0.g$a */
    class C4973a implements C4983l.C4984a {
        C4973a() {
        }

        /* renamed from: a */
        public void mo14952a(C4986m mVar, Matrix matrix, int i) {
            C4972g.this.f14817i.set(i + 4, mVar.mo14997e());
            C4972g.this.f14816h[i] = mVar.mo14998f(matrix);
        }

        /* renamed from: b */
        public void mo14953b(C4986m mVar, Matrix matrix, int i) {
            C4972g.this.f14817i.set(i, mVar.mo14997e());
            C4972g.this.f14815g[i] = mVar.mo14998f(matrix);
        }
    }

    /* renamed from: g.d.a.d.b0.g$b */
    class C4974b implements C4979k.C4982c {

        /* renamed from: a */
        final /* synthetic */ float f14836a;

        C4974b(C4972g gVar, float f) {
            this.f14836a = f;
        }

        /* renamed from: a */
        public C4968c mo14954a(C4968c cVar) {
            return cVar instanceof C4977i ? cVar : new C4967b(this.f14836a, cVar);
        }
    }

    /* renamed from: g.d.a.d.b0.g$c */
    static final class C4975c extends Drawable.ConstantState {

        /* renamed from: a */
        public C4979k f14837a;

        /* renamed from: b */
        public C5038a f14838b;

        /* renamed from: c */
        public ColorFilter f14839c;

        /* renamed from: d */
        public ColorStateList f14840d = null;

        /* renamed from: e */
        public ColorStateList f14841e = null;

        /* renamed from: f */
        public ColorStateList f14842f = null;

        /* renamed from: g */
        public ColorStateList f14843g = null;

        /* renamed from: h */
        public PorterDuff.Mode f14844h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f14845i = null;

        /* renamed from: j */
        public float f14846j = 1.0f;

        /* renamed from: k */
        public float f14847k = 1.0f;

        /* renamed from: l */
        public float f14848l;

        /* renamed from: m */
        public int f14849m = 255;

        /* renamed from: n */
        public float f14850n = 0.0f;

        /* renamed from: o */
        public float f14851o = 0.0f;

        /* renamed from: p */
        public float f14852p = 0.0f;

        /* renamed from: q */
        public int f14853q = 0;

        /* renamed from: r */
        public int f14854r = 0;

        /* renamed from: s */
        public int f14855s = 0;

        /* renamed from: t */
        public int f14856t = 0;

        /* renamed from: u */
        public boolean f14857u = false;

        /* renamed from: v */
        public Paint.Style f14858v = Paint.Style.FILL_AND_STROKE;

        public C4975c(C4975c cVar) {
            this.f14837a = cVar.f14837a;
            this.f14838b = cVar.f14838b;
            this.f14848l = cVar.f14848l;
            this.f14839c = cVar.f14839c;
            this.f14840d = cVar.f14840d;
            this.f14841e = cVar.f14841e;
            this.f14844h = cVar.f14844h;
            this.f14843g = cVar.f14843g;
            this.f14849m = cVar.f14849m;
            this.f14846j = cVar.f14846j;
            this.f14855s = cVar.f14855s;
            this.f14853q = cVar.f14853q;
            this.f14857u = cVar.f14857u;
            this.f14847k = cVar.f14847k;
            this.f14850n = cVar.f14850n;
            this.f14851o = cVar.f14851o;
            this.f14852p = cVar.f14852p;
            this.f14854r = cVar.f14854r;
            this.f14856t = cVar.f14856t;
            this.f14842f = cVar.f14842f;
            this.f14858v = cVar.f14858v;
            if (cVar.f14845i != null) {
                this.f14845i = new Rect(cVar.f14845i);
            }
        }

        public C4975c(C4979k kVar, C5038a aVar) {
            this.f14837a = kVar;
            this.f14838b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C4972g gVar = new C4972g(this, (C4973a) null);
            boolean unused = gVar.f14818j = true;
            return gVar;
        }
    }

    public C4972g() {
        this(new C4979k());
    }

    public C4972g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C4979k.m21076e(context, attributeSet, i, i2).mo14980m());
    }

    private C4972g(C4975c cVar) {
        this.f14815g = new C4986m.C4993g[4];
        this.f14816h = new C4986m.C4993g[4];
        this.f14817i = new BitSet(8);
        this.f14819k = new Matrix();
        this.f14820l = new Path();
        this.f14821m = new Path();
        this.f14822n = new RectF();
        this.f14823o = new RectF();
        this.f14824p = new Region();
        this.f14825q = new Region();
        this.f14827s = new Paint(1);
        this.f14828t = new Paint(1);
        this.f14829u = new C4963a();
        this.f14831w = new C4983l();
        this.f14834z = new RectF();
        this.f14813A = true;
        this.f14814f = cVar;
        this.f14828t.setStyle(Paint.Style.STROKE);
        this.f14827s.setStyle(Paint.Style.FILL);
        f14812C.setColor(-1);
        f14812C.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m21016j0();
        m21014i0(getState());
        this.f14830v = new C4973a();
    }

    /* synthetic */ C4972g(C4975c cVar, C4973a aVar) {
        this(cVar);
    }

    public C4972g(C4979k kVar) {
        this(new C4975c(kVar, (C5038a) null));
    }

    /* renamed from: E */
    private float m20999E() {
        if (m21002M()) {
            return this.f14828t.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: K */
    private boolean m21000K() {
        C4975c cVar = this.f14814f;
        int i = cVar.f14853q;
        return i != 1 && cVar.f14854r > 0 && (i == 2 || mo14923U());
    }

    /* renamed from: L */
    private boolean m21001L() {
        Paint.Style style = this.f14814f.f14858v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: M */
    private boolean m21002M() {
        Paint.Style style = this.f14814f.f14858v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f14828t.getStrokeWidth() > 0.0f;
    }

    /* renamed from: O */
    private void m21003O() {
        super.invalidateSelf();
    }

    /* renamed from: R */
    private void m21004R(Canvas canvas) {
        if (m21000K()) {
            canvas.save();
            m21006T(canvas);
            if (!this.f14813A) {
                m21021n(canvas);
            } else {
                int width = (int) (this.f14834z.width() - ((float) getBounds().width()));
                int height = (int) (this.f14834z.height() - ((float) getBounds().height()));
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f14834z.width()) + (this.f14814f.f14854r * 2) + width, ((int) this.f14834z.height()) + (this.f14814f.f14854r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f = (float) ((getBounds().left - this.f14814f.f14854r) - width);
                float f2 = (float) ((getBounds().top - this.f14814f.f14854r) - height);
                canvas2.translate(-f, -f2);
                m21021n(canvas2);
                canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                createBitmap.recycle();
            }
            canvas.restore();
        }
    }

    /* renamed from: S */
    private static int m21005S(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: T */
    private void m21006T(Canvas canvas) {
        int A = mo14911A();
        int B = mo14912B();
        if (Build.VERSION.SDK_INT < 21 && this.f14813A) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f14814f.f14854r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(A, B);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) A, (float) B);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.PorterDuffColorFilter m21011f(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.m21019l(r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p252d.p254b0.C4972g.m21011f(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    /* renamed from: g */
    private void m21012g(RectF rectF, Path path) {
        mo14939h(rectF, path);
        if (this.f14814f.f14846j != 1.0f) {
            this.f14819k.reset();
            Matrix matrix = this.f14819k;
            float f = this.f14814f.f14846j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f14819k);
        }
        path.computeBounds(this.f14834z, true);
    }

    /* renamed from: i */
    private void m21013i() {
        C4979k x = mo14914D().mo14974x(new C4974b(this, -m20999E()));
        this.f14826r = x;
        this.f14831w.mo14993d(x, this.f14814f.f14847k, m21025v(), this.f14821m);
    }

    /* renamed from: i0 */
    private boolean m21014i0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f14814f.f14840d == null || (color2 = this.f14827s.getColor()) == (colorForState2 = this.f14814f.f14840d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f14827s.setColor(colorForState2);
            z = true;
        }
        if (this.f14814f.f14841e == null || (color = this.f14828t.getColor()) == (colorForState = this.f14814f.f14841e.getColorForState(iArr, color))) {
            return z;
        }
        this.f14828t.setColor(colorForState);
        return true;
    }

    /* renamed from: j */
    private PorterDuffColorFilter m21015j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m21019l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j0 */
    private boolean m21016j0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f14832x;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f14833y;
        C4975c cVar = this.f14814f;
        this.f14832x = m21017k(cVar.f14843g, cVar.f14844h, this.f14827s, true);
        C4975c cVar2 = this.f14814f;
        this.f14833y = m21017k(cVar2.f14842f, cVar2.f14844h, this.f14828t, false);
        C4975c cVar3 = this.f14814f;
        if (cVar3.f14857u) {
            this.f14829u.mo14902d(cVar3.f14843g.getColorForState(getState(), 0));
        }
        return !C3344c.m14350a(porterDuffColorFilter, this.f14832x) || !C3344c.m14350a(porterDuffColorFilter2, this.f14833y);
    }

    /* renamed from: k */
    private PorterDuffColorFilter m21017k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? m21011f(paint, z) : m21015j(colorStateList, mode, z);
    }

    /* renamed from: k0 */
    private void m21018k0() {
        float J = mo14919J();
        this.f14814f.f14854r = (int) Math.ceil((double) (0.75f * J));
        this.f14814f.f14855s = (int) Math.ceil((double) (J * 0.25f));
        m21016j0();
        m21003O();
    }

    /* renamed from: l */
    private int m21019l(int i) {
        float J = mo14919J() + mo14951z();
        C5038a aVar = this.f14814f.f14838b;
        return aVar != null ? aVar.mo15117c(i, J) : i;
    }

    /* renamed from: m */
    public static C4972g m21020m(Context context, float f) {
        int b = C5035a.m21304b(context, C4965b.colorSurface, C4972g.class.getSimpleName());
        C4972g gVar = new C4972g();
        gVar.mo14920N(context);
        gVar.mo14926X(ColorStateList.valueOf(b));
        gVar.mo14925W(f);
        return gVar;
    }

    /* renamed from: n */
    private void m21021n(Canvas canvas) {
        if (this.f14817i.cardinality() > 0) {
            Log.w(f14811B, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f14814f.f14855s != 0) {
            canvas.drawPath(this.f14820l, this.f14829u.mo14901c());
        }
        for (int i = 0; i < 4; i++) {
            this.f14815g[i].mo15009b(this.f14829u, this.f14814f.f14854r, canvas);
            this.f14816h[i].mo15009b(this.f14829u, this.f14814f.f14854r, canvas);
        }
        if (this.f14813A) {
            int A = mo14911A();
            int B = mo14912B();
            canvas.translate((float) (-A), (float) (-B));
            canvas.drawPath(this.f14820l, f14812C);
            canvas.translate((float) A, (float) B);
        }
    }

    /* renamed from: o */
    private void m21022o(Canvas canvas) {
        m21023q(canvas, this.f14827s, this.f14820l, this.f14814f.f14837a, mo14947u());
    }

    /* renamed from: q */
    private void m21023q(Canvas canvas, Paint paint, Path path, C4979k kVar, RectF rectF) {
        if (kVar.mo14971u(rectF)) {
            float a = kVar.mo14970t().mo14903a(rectF) * this.f14814f.f14847k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: r */
    private void m21024r(Canvas canvas) {
        m21023q(canvas, this.f14828t, this.f14821m, this.f14826r, m21025v());
    }

    /* renamed from: v */
    private RectF m21025v() {
        this.f14823o.set(mo14947u());
        float E = m20999E();
        this.f14823o.inset(E, E);
        return this.f14823o;
    }

    /* renamed from: A */
    public int mo14911A() {
        C4975c cVar = this.f14814f;
        double d = (double) cVar.f14855s;
        double sin = Math.sin(Math.toRadians((double) cVar.f14856t));
        Double.isNaN(d);
        return (int) (d * sin);
    }

    /* renamed from: B */
    public int mo14912B() {
        C4975c cVar = this.f14814f;
        double d = (double) cVar.f14855s;
        double cos = Math.cos(Math.toRadians((double) cVar.f14856t));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    /* renamed from: C */
    public int mo14913C() {
        return this.f14814f.f14854r;
    }

    /* renamed from: D */
    public C4979k mo14914D() {
        return this.f14814f.f14837a;
    }

    /* renamed from: F */
    public ColorStateList mo14915F() {
        return this.f14814f.f14843g;
    }

    /* renamed from: G */
    public float mo14916G() {
        return this.f14814f.f14837a.mo14968r().mo14903a(mo14947u());
    }

    /* renamed from: H */
    public float mo14917H() {
        return this.f14814f.f14837a.mo14970t().mo14903a(mo14947u());
    }

    /* renamed from: I */
    public float mo14918I() {
        return this.f14814f.f14852p;
    }

    /* renamed from: J */
    public float mo14919J() {
        return mo14948w() + mo14918I();
    }

    /* renamed from: N */
    public void mo14920N(Context context) {
        this.f14814f.f14838b = new C5038a(context);
        m21018k0();
    }

    /* renamed from: P */
    public boolean mo14921P() {
        C5038a aVar = this.f14814f.f14838b;
        return aVar != null && aVar.mo15118d();
    }

    /* renamed from: Q */
    public boolean mo14922Q() {
        return this.f14814f.f14837a.mo14971u(mo14947u());
    }

    /* renamed from: U */
    public boolean mo14923U() {
        return Build.VERSION.SDK_INT < 21 || (!mo14922Q() && !this.f14820l.isConvex() && Build.VERSION.SDK_INT < 29);
    }

    /* renamed from: V */
    public void mo14924V(float f) {
        setShapeAppearanceModel(this.f14814f.f14837a.mo14973w(f));
    }

    /* renamed from: W */
    public void mo14925W(float f) {
        C4975c cVar = this.f14814f;
        if (cVar.f14851o != f) {
            cVar.f14851o = f;
            m21018k0();
        }
    }

    /* renamed from: X */
    public void mo14926X(ColorStateList colorStateList) {
        C4975c cVar = this.f14814f;
        if (cVar.f14840d != colorStateList) {
            cVar.f14840d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: Y */
    public void mo14927Y(float f) {
        C4975c cVar = this.f14814f;
        if (cVar.f14847k != f) {
            cVar.f14847k = f;
            this.f14818j = true;
            invalidateSelf();
        }
    }

    /* renamed from: Z */
    public void mo14928Z(int i, int i2, int i3, int i4) {
        C4975c cVar = this.f14814f;
        if (cVar.f14845i == null) {
            cVar.f14845i = new Rect();
        }
        this.f14814f.f14845i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void mo14929a0(float f) {
        C4975c cVar = this.f14814f;
        if (cVar.f14850n != f) {
            cVar.f14850n = f;
            m21018k0();
        }
    }

    /* renamed from: b0 */
    public void mo14930b0(boolean z) {
        this.f14813A = z;
    }

    /* renamed from: c0 */
    public void mo14931c0(int i) {
        this.f14829u.mo14902d(i);
        this.f14814f.f14857u = false;
        m21003O();
    }

    /* renamed from: d0 */
    public void mo14932d0(int i) {
        C4975c cVar = this.f14814f;
        if (cVar.f14856t != i) {
            cVar.f14856t = i;
            m21003O();
        }
    }

    public void draw(Canvas canvas) {
        this.f14827s.setColorFilter(this.f14832x);
        int alpha = this.f14827s.getAlpha();
        this.f14827s.setAlpha(m21005S(alpha, this.f14814f.f14849m));
        this.f14828t.setColorFilter(this.f14833y);
        this.f14828t.setStrokeWidth(this.f14814f.f14848l);
        int alpha2 = this.f14828t.getAlpha();
        this.f14828t.setAlpha(m21005S(alpha2, this.f14814f.f14849m));
        if (this.f14818j) {
            m21013i();
            m21012g(mo14947u(), this.f14820l);
            this.f14818j = false;
        }
        m21004R(canvas);
        if (m21001L()) {
            m21022o(canvas);
        }
        if (m21002M()) {
            m21024r(canvas);
        }
        this.f14827s.setAlpha(alpha);
        this.f14828t.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void mo14933e0(float f, int i) {
        mo14940h0(f);
        mo14935g0(ColorStateList.valueOf(i));
    }

    /* renamed from: f0 */
    public void mo14934f0(float f, ColorStateList colorStateList) {
        mo14940h0(f);
        mo14935g0(colorStateList);
    }

    /* renamed from: g0 */
    public void mo14935g0(ColorStateList colorStateList) {
        C4975c cVar = this.f14814f;
        if (cVar.f14841e != colorStateList) {
            cVar.f14841e = colorStateList;
            onStateChange(getState());
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f14814f;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f14814f.f14853q != 2) {
            if (mo14922Q()) {
                outline.setRoundRect(getBounds(), mo14916G() * this.f14814f.f14847k);
                return;
            }
            m21012g(mo14947u(), this.f14820l);
            if (this.f14820l.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f14820l);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f14814f.f14845i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f14824p.set(getBounds());
        m21012g(mo14947u(), this.f14820l);
        this.f14825q.setPath(this.f14820l, this.f14824p);
        this.f14824p.op(this.f14825q, Region.Op.DIFFERENCE);
        return this.f14824p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo14939h(RectF rectF, Path path) {
        C4983l lVar = this.f14831w;
        C4975c cVar = this.f14814f;
        C4979k kVar = cVar.f14837a;
        float f = cVar.f14847k;
        lVar.mo14994e(kVar, f, rectF, this.f14830v, path);
    }

    /* renamed from: h0 */
    public void mo14940h0(float f) {
        this.f14814f.f14848l = f;
        invalidateSelf();
    }

    public void invalidateSelf() {
        this.f14818j = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f14814f.f14841e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f14814f.f14840d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f14814f.f14843g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f14814f.f14842f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            g.d.a.d.b0.g$c r0 = r1.f14814f
            android.content.res.ColorStateList r0 = r0.f14843g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            g.d.a.d.b0.g$c r0 = r1.f14814f
            android.content.res.ColorStateList r0 = r0.f14842f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            g.d.a.d.b0.g$c r0 = r1.f14814f
            android.content.res.ColorStateList r0 = r0.f14841e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            g.d.a.d.b0.g$c r0 = r1.f14814f
            android.content.res.ColorStateList r0 = r0.f14840d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p252d.p254b0.C4972g.isStateful():boolean");
    }

    public Drawable mutate() {
        this.f14814f = new C4975c(this.f14814f);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f14818j = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = m21014i0(iArr) || m21016j0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo14944p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m21023q(canvas, paint, path, this.f14814f.f14837a, rectF);
    }

    /* renamed from: s */
    public float mo14945s() {
        return this.f14814f.f14837a.mo14961j().mo14903a(mo14947u());
    }

    public void setAlpha(int i) {
        C4975c cVar = this.f14814f;
        if (cVar.f14849m != i) {
            cVar.f14849m = i;
            m21003O();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f14814f.f14839c = colorFilter;
        m21003O();
    }

    public void setShapeAppearanceModel(C4979k kVar) {
        this.f14814f.f14837a = kVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f14814f.f14843g = colorStateList;
        m21016j0();
        m21003O();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C4975c cVar = this.f14814f;
        if (cVar.f14844h != mode) {
            cVar.f14844h = mode;
            m21016j0();
            m21003O();
        }
    }

    /* renamed from: t */
    public float mo14946t() {
        return this.f14814f.f14837a.mo14963l().mo14903a(mo14947u());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public RectF mo14947u() {
        this.f14822n.set(getBounds());
        return this.f14822n;
    }

    /* renamed from: w */
    public float mo14948w() {
        return this.f14814f.f14851o;
    }

    /* renamed from: x */
    public ColorStateList mo14949x() {
        return this.f14814f.f14840d;
    }

    /* renamed from: y */
    public float mo14950y() {
        return this.f14814f.f14847k;
    }

    /* renamed from: z */
    public float mo14951z() {
        return this.f14814f.f14850n;
    }
}
