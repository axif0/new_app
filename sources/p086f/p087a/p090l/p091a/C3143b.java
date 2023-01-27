package p086f.p087a.p090l.p091a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0588a;

/* renamed from: f.a.l.a.b */
class C3143b extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private C3146c f9951f;

    /* renamed from: g */
    private Rect f9952g;

    /* renamed from: h */
    private Drawable f9953h;

    /* renamed from: i */
    private Drawable f9954i;

    /* renamed from: j */
    private int f9955j = 255;

    /* renamed from: k */
    private boolean f9956k;

    /* renamed from: l */
    private int f9957l = -1;

    /* renamed from: m */
    private boolean f9958m;

    /* renamed from: n */
    private Runnable f9959n;

    /* renamed from: o */
    private long f9960o;

    /* renamed from: p */
    private long f9961p;

    /* renamed from: q */
    private C3145b f9962q;

    /* renamed from: f.a.l.a.b$a */
    class C3144a implements Runnable {
        C3144a() {
        }

        public void run() {
            C3143b.this.mo10792a(true);
            C3143b.this.invalidateSelf();
        }
    }

    /* renamed from: f.a.l.a.b$b */
    static class C3145b implements Drawable.Callback {

        /* renamed from: f */
        private Drawable.Callback f9964f;

        C3145b() {
        }

        /* renamed from: a */
        public Drawable.Callback mo10827a() {
            Drawable.Callback callback = this.f9964f;
            this.f9964f = null;
            return callback;
        }

        /* renamed from: b */
        public C3145b mo10828b(Drawable.Callback callback) {
            this.f9964f = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f9964f;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f9964f;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: f.a.l.a.b$c */
    static abstract class C3146c extends Drawable.ConstantState {

        /* renamed from: A */
        int f9965A;

        /* renamed from: B */
        int f9966B;

        /* renamed from: C */
        boolean f9967C;

        /* renamed from: D */
        ColorFilter f9968D;

        /* renamed from: E */
        boolean f9969E;

        /* renamed from: F */
        ColorStateList f9970F;

        /* renamed from: G */
        PorterDuff.Mode f9971G;

        /* renamed from: H */
        boolean f9972H;

        /* renamed from: I */
        boolean f9973I;

        /* renamed from: a */
        final C3143b f9974a;

        /* renamed from: b */
        Resources f9975b;

        /* renamed from: c */
        int f9976c = 160;

        /* renamed from: d */
        int f9977d;

        /* renamed from: e */
        int f9978e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f9979f;

        /* renamed from: g */
        Drawable[] f9980g;

        /* renamed from: h */
        int f9981h;

        /* renamed from: i */
        boolean f9982i;

        /* renamed from: j */
        boolean f9983j;

        /* renamed from: k */
        Rect f9984k;

        /* renamed from: l */
        boolean f9985l;

        /* renamed from: m */
        boolean f9986m;

        /* renamed from: n */
        int f9987n;

        /* renamed from: o */
        int f9988o;

        /* renamed from: p */
        int f9989p;

        /* renamed from: q */
        int f9990q;

        /* renamed from: r */
        boolean f9991r;

        /* renamed from: s */
        int f9992s;

        /* renamed from: t */
        boolean f9993t;

        /* renamed from: u */
        boolean f9994u;

        /* renamed from: v */
        boolean f9995v;

        /* renamed from: w */
        boolean f9996w;

        /* renamed from: x */
        boolean f9997x;

        /* renamed from: y */
        boolean f9998y;

        /* renamed from: z */
        int f9999z;

        C3146c(C3146c cVar, C3143b bVar, Resources resources) {
            this.f9982i = false;
            this.f9985l = false;
            this.f9997x = true;
            this.f9965A = 0;
            this.f9966B = 0;
            this.f9974a = bVar;
            this.f9975b = resources != null ? resources : cVar != null ? cVar.f9975b : null;
            int f = C3143b.m13429f(resources, cVar != null ? cVar.f9976c : 0);
            this.f9976c = f;
            if (cVar != null) {
                this.f9977d = cVar.f9977d;
                this.f9978e = cVar.f9978e;
                this.f9995v = true;
                this.f9996w = true;
                this.f9982i = cVar.f9982i;
                this.f9985l = cVar.f9985l;
                this.f9997x = cVar.f9997x;
                this.f9998y = cVar.f9998y;
                this.f9999z = cVar.f9999z;
                this.f9965A = cVar.f9965A;
                this.f9966B = cVar.f9966B;
                this.f9967C = cVar.f9967C;
                this.f9968D = cVar.f9968D;
                this.f9969E = cVar.f9969E;
                this.f9970F = cVar.f9970F;
                this.f9971G = cVar.f9971G;
                this.f9972H = cVar.f9972H;
                this.f9973I = cVar.f9973I;
                if (cVar.f9976c == f) {
                    if (cVar.f9983j) {
                        this.f9984k = new Rect(cVar.f9984k);
                        this.f9983j = true;
                    }
                    if (cVar.f9986m) {
                        this.f9987n = cVar.f9987n;
                        this.f9988o = cVar.f9988o;
                        this.f9989p = cVar.f9989p;
                        this.f9990q = cVar.f9990q;
                        this.f9986m = true;
                    }
                }
                if (cVar.f9991r) {
                    this.f9992s = cVar.f9992s;
                    this.f9991r = true;
                }
                if (cVar.f9993t) {
                    this.f9994u = cVar.f9994u;
                    this.f9993t = true;
                }
                Drawable[] drawableArr = cVar.f9980g;
                this.f9980g = new Drawable[drawableArr.length];
                this.f9981h = cVar.f9981h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f9979f;
                this.f9979f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f9981h);
                int i = this.f9981h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f9979f.put(i2, constantState);
                        } else {
                            this.f9980g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f9980g = new Drawable[10];
            this.f9981h = 0;
        }

        /* renamed from: e */
        private void m13438e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f9979f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f9980g[this.f9979f.keyAt(i)] = m13439s(this.f9979f.valueAt(i).newDrawable(this.f9975b));
                }
                this.f9979f = null;
            }
        }

        /* renamed from: s */
        private Drawable m13439s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f9999z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f9974a);
            return mutate;
        }

        /* renamed from: a */
        public final int mo10832a(Drawable drawable) {
            int i = this.f9981h;
            if (i >= this.f9980g.length) {
                mo10847o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f9974a);
            this.f9980g[i] = drawable;
            this.f9981h++;
            this.f9978e = drawable.getChangingConfigurations() | this.f9978e;
            mo10848p();
            this.f9984k = null;
            this.f9983j = false;
            this.f9986m = false;
            this.f9995v = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo10833b(Resources.Theme theme) {
            if (theme != null) {
                m13438e();
                int i = this.f9981h;
                Drawable[] drawableArr = this.f9980g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f9978e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo10855y(theme.getResources());
            }
        }

        /* renamed from: c */
        public synchronized boolean mo10834c() {
            if (this.f9995v) {
                return this.f9996w;
            }
            m13438e();
            this.f9995v = true;
            int i = this.f9981h;
            Drawable[] drawableArr = this.f9980g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f9996w = false;
                    return false;
                }
            }
            this.f9996w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i = this.f9981h;
            Drawable[] drawableArr = this.f9980g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f9979f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo10836d() {
            this.f9986m = true;
            m13438e();
            int i = this.f9981h;
            Drawable[] drawableArr = this.f9980g;
            this.f9988o = -1;
            this.f9987n = -1;
            this.f9990q = 0;
            this.f9989p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f9987n) {
                    this.f9987n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f9988o) {
                    this.f9988o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f9989p) {
                    this.f9989p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f9990q) {
                    this.f9990q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo10837f() {
            return this.f9980g.length;
        }

        /* renamed from: g */
        public final Drawable mo10838g(int i) {
            int indexOfKey;
            Drawable drawable = this.f9980g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f9979f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = m13439s(this.f9979f.valueAt(indexOfKey).newDrawable(this.f9975b));
            this.f9980g[i] = s;
            this.f9979f.removeAt(indexOfKey);
            if (this.f9979f.size() == 0) {
                this.f9979f = null;
            }
            return s;
        }

        public int getChangingConfigurations() {
            return this.f9977d | this.f9978e;
        }

        /* renamed from: h */
        public final int mo10840h() {
            return this.f9981h;
        }

        /* renamed from: i */
        public final int mo10841i() {
            if (!this.f9986m) {
                mo10836d();
            }
            return this.f9988o;
        }

        /* renamed from: j */
        public final int mo10842j() {
            if (!this.f9986m) {
                mo10836d();
            }
            return this.f9990q;
        }

        /* renamed from: k */
        public final int mo10843k() {
            if (!this.f9986m) {
                mo10836d();
            }
            return this.f9989p;
        }

        /* renamed from: l */
        public final Rect mo10844l() {
            Rect rect = null;
            if (this.f9982i) {
                return null;
            }
            if (this.f9984k != null || this.f9983j) {
                return this.f9984k;
            }
            m13438e();
            Rect rect2 = new Rect();
            int i = this.f9981h;
            Drawable[] drawableArr = this.f9980g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect2)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect2.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect2.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect2.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect2.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f9983j = true;
            this.f9984k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int mo10845m() {
            if (!this.f9986m) {
                mo10836d();
            }
            return this.f9987n;
        }

        /* renamed from: n */
        public final int mo10846n() {
            if (this.f9991r) {
                return this.f9992s;
            }
            m13438e();
            int i = this.f9981h;
            Drawable[] drawableArr = this.f9980g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f9992s = opacity;
            this.f9991r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo10847o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f9980g, 0, drawableArr, 0, i);
            this.f9980g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo10848p() {
            this.f9991r = false;
            this.f9993t = false;
        }

        /* renamed from: q */
        public final boolean mo10849q() {
            return this.f9985l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public abstract void mo10786r();

        /* renamed from: t */
        public final void mo10850t(boolean z) {
            this.f9985l = z;
        }

        /* renamed from: u */
        public final void mo10851u(int i) {
            this.f9965A = i;
        }

        /* renamed from: v */
        public final void mo10852v(int i) {
            this.f9966B = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final boolean mo10853w(int i, int i2) {
            int i3 = this.f9981h;
            Drawable[] drawableArr = this.f9980g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f9999z = i;
            return z;
        }

        /* renamed from: x */
        public final void mo10854x(boolean z) {
            this.f9982i = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final void mo10855y(Resources resources) {
            if (resources != null) {
                this.f9975b = resources;
                int f = C3143b.m13429f(resources, this.f9976c);
                int i = this.f9976c;
                this.f9976c = f;
                if (i != f) {
                    this.f9986m = false;
                    this.f9983j = false;
                }
            }
        }
    }

    C3143b() {
    }

    /* renamed from: d */
    private void m13427d(Drawable drawable) {
        if (this.f9962q == null) {
            this.f9962q = new C3145b();
        }
        C3145b bVar = this.f9962q;
        bVar.mo10828b(drawable.getCallback());
        drawable.setCallback(bVar);
        try {
            if (this.f9951f.f9965A <= 0 && this.f9956k) {
                drawable.setAlpha(this.f9955j);
            }
            if (this.f9951f.f9969E) {
                drawable.setColorFilter(this.f9951f.f9968D);
            } else {
                if (this.f9951f.f9972H) {
                    C0588a.m2772o(drawable, this.f9951f.f9970F);
                }
                if (this.f9951f.f9973I) {
                    C0588a.m2773p(drawable, this.f9951f.f9971G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f9951f.f9997x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f9951f.f9967C);
            }
            Rect rect = this.f9952g;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f9962q.mo10827a());
        }
    }

    /* renamed from: e */
    private boolean m13428e() {
        return isAutoMirrored() && C0588a.m2763f(this) == 1;
    }

    /* renamed from: f */
    static int m13429f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10792a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f9956k = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f9953h
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f9960o
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f9955j
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            f.a.l.a.b$c r9 = r13.f9951f
            int r9 = r9.f9965A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f9955j
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f9960o = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f9954i
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f9961p
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f9954i = r0
            goto L_0x0061
        L_0x004e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            f.a.l.a.b$c r4 = r13.f9951f
            int r4 = r4.f9966B
            int r3 = r3 / r4
            int r4 = r13.f9955j
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f9961p = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f9959n
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p087a.p090l.p091a.C3143b.mo10792a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f9951f.mo10833b(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3146c mo10765b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo10794c() {
        return this.f9957l;
    }

    public boolean canApplyTheme() {
        return this.f9951f.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f9953h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f9954i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10797g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f9957l
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            f.a.l.a.b$c r0 = r9.f9951f
            int r0 = r0.f9966B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f9954i
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f9953h
            if (r0 == 0) goto L_0x0029
            r9.f9954i = r0
            f.a.l.a.b$c r0 = r9.f9951f
            int r0 = r0.f9966B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f9961p = r0
            goto L_0x0035
        L_0x0029:
            r9.f9954i = r4
            r9.f9961p = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f9953h
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            f.a.l.a.b$c r0 = r9.f9951f
            int r1 = r0.f9981h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo10838g(r10)
            r9.f9953h = r0
            r9.f9957l = r10
            if (r0 == 0) goto L_0x005a
            f.a.l.a.b$c r10 = r9.f9951f
            int r10 = r10.f9965A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f9960o = r2
        L_0x0051:
            r9.m13427d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f9953h = r4
            r10 = -1
            r9.f9957l = r10
        L_0x005a:
            long r0 = r9.f9960o
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f9961p
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f9959n
            if (r0 != 0) goto L_0x0073
            f.a.l.a.b$a r0 = new f.a.l.a.b$a
            r0.<init>()
            r9.f9959n = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo10792a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p087a.p090l.p091a.C3143b.mo10797g(int):boolean");
    }

    public int getAlpha() {
        return this.f9955j;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f9951f.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f9951f.mo10834c()) {
            return null;
        }
        this.f9951f.f9977d = getChangingConfigurations();
        return this.f9951f;
    }

    public Drawable getCurrent() {
        return this.f9953h;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f9952g;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f9951f.mo10849q()) {
            return this.f9951f.mo10841i();
        }
        Drawable drawable = this.f9953h;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f9951f.mo10849q()) {
            return this.f9951f.mo10845m();
        }
        Drawable drawable = this.f9953h;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f9951f.mo10849q()) {
            return this.f9951f.mo10842j();
        }
        Drawable drawable = this.f9953h;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f9951f.mo10849q()) {
            return this.f9951f.mo10843k();
        }
        Drawable drawable = this.f9953h;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f9953h;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f9951f.mo10846n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f9953h;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f9951f.mo10844l();
        if (l != null) {
            rect.set(l);
            z = (l.right | ((l.left | l.top) | l.bottom)) != 0;
        } else {
            Drawable drawable = this.f9953h;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m13428e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10766h(C3146c cVar) {
        this.f9951f = cVar;
        int i = this.f9957l;
        if (i >= 0) {
            Drawable g = cVar.mo10838g(i);
            this.f9953h = g;
            if (g != null) {
                m13427d(g);
            }
        }
        this.f9954i = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo10810i(Resources resources) {
        this.f9951f.mo10855y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        C3146c cVar = this.f9951f;
        if (cVar != null) {
            cVar.mo10848p();
        }
        if (drawable == this.f9953h && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f9951f.f9967C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f9954i;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f9954i = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f9953h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f9956k) {
                this.f9953h.setAlpha(this.f9955j);
            }
        }
        if (this.f9961p != 0) {
            this.f9961p = 0;
            z = true;
        }
        if (this.f9960o != 0) {
            this.f9960o = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f9958m && super.mutate() == this) {
            C3146c b = mo10765b();
            b.mo10786r();
            mo10766h(b);
            this.f9958m = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9954i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f9953h;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f9951f.mo10853w(i, mo10794c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f9954i;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f9953h;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f9954i;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f9953h;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f9953h && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f9956k || this.f9955j != i) {
            this.f9956k = true;
            this.f9955j = i;
            Drawable drawable = this.f9953h;
            if (drawable == null) {
                return;
            }
            if (this.f9960o == 0) {
                drawable.setAlpha(i);
            } else {
                mo10792a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C3146c cVar = this.f9951f;
        if (cVar.f9967C != z) {
            cVar.f9967C = z;
            Drawable drawable = this.f9953h;
            if (drawable != null) {
                C0588a.m2767j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C3146c cVar = this.f9951f;
        cVar.f9969E = true;
        if (cVar.f9968D != colorFilter) {
            cVar.f9968D = colorFilter;
            Drawable drawable = this.f9953h;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C3146c cVar = this.f9951f;
        if (cVar.f9997x != z) {
            cVar.f9997x = z;
            Drawable drawable = this.f9953h;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f9953h;
        if (drawable != null) {
            C0588a.m2768k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f9952g;
        if (rect == null) {
            this.f9952g = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f9953h;
        if (drawable != null) {
            C0588a.m2769l(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C3146c cVar = this.f9951f;
        cVar.f9972H = true;
        if (cVar.f9970F != colorStateList) {
            cVar.f9970F = colorStateList;
            C0588a.m2772o(this.f9953h, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C3146c cVar = this.f9951f;
        cVar.f9973I = true;
        if (cVar.f9971G != mode) {
            cVar.f9971G = mode;
            C0588a.m2773p(this.f9953h, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f9954i;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f9953h;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f9953h && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
