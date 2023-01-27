package academia.bracu.com.academia.mediaslider;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.appcompat.widget.C0459n;

public class TouchImageView extends C0459n {

    /* renamed from: A */
    private ImageView.ScaleType f516A;

    /* renamed from: B */
    private boolean f517B;

    /* renamed from: C */
    private boolean f518C;

    /* renamed from: D */
    private C0161k f519D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f520E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f521F;

    /* renamed from: G */
    private int f522G;

    /* renamed from: H */
    private int f523H;

    /* renamed from: I */
    private float f524I;

    /* renamed from: J */
    private float f525J;

    /* renamed from: K */
    private float f526K;

    /* renamed from: L */
    private float f527L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public ScaleGestureDetector f528M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public GestureDetector f529N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public GestureDetector.OnDoubleTapListener f530O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public View.OnTouchListener f531P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C0157g f532Q;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f533h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Matrix f534i;

    /* renamed from: j */
    private Matrix f535j;

    /* renamed from: k */
    private boolean f536k;

    /* renamed from: l */
    private C0154d f537l;

    /* renamed from: m */
    private C0154d f538m;

    /* renamed from: n */
    private boolean f539n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C0160j f540o;

    /* renamed from: p */
    private float f541p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f542q;

    /* renamed from: r */
    private boolean f543r;

    /* renamed from: s */
    private float f544s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f545t;

    /* renamed from: u */
    private float f546u;

    /* renamed from: v */
    private float f547v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public float[] f548w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public Context f549x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C0155e f550y;

    /* renamed from: z */
    private int f551z;

    /* renamed from: academia.bracu.com.academia.mediaslider.TouchImageView$a */
    static /* synthetic */ class C0151a {

        /* renamed from: a */
        static final /* synthetic */ int[] f552a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f552a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f552a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f552a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f552a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f552a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f552a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f552a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.mediaslider.TouchImageView.C0151a.<clinit>():void");
        }
    }

    /* renamed from: academia.bracu.com.academia.mediaslider.TouchImageView$b */
    private class C0152b {

        /* renamed from: a */
        OverScroller f553a;

        C0152b(Context context) {
            this.f553a = new OverScroller(context);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo479a() {
            this.f553a.computeScrollOffset();
            return this.f553a.computeScrollOffset();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo480b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f553a.fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo481c(boolean z) {
            this.f553a.forceFinished(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo482d() {
            return this.f553a.getCurrX();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo483e() {
            return this.f553a.getCurrY();
        }

        /* renamed from: f */
        public boolean mo484f() {
            return this.f553a.isFinished();
        }
    }

    /* renamed from: academia.bracu.com.academia.mediaslider.TouchImageView$c */
    private class C0153c implements Runnable {

        /* renamed from: f */
        private long f555f;

        /* renamed from: g */
        private float f556g;

        /* renamed from: h */
        private float f557h;

        /* renamed from: i */
        private float f558i;

        /* renamed from: j */
        private float f559j;

        /* renamed from: k */
        private boolean f560k;

        /* renamed from: l */
        private AccelerateDecelerateInterpolator f561l = new AccelerateDecelerateInterpolator();

        /* renamed from: m */
        private PointF f562m;

        /* renamed from: n */
        private PointF f563n;

        C0153c(float f, float f2, float f3, boolean z) {
            TouchImageView.this.setState(C0160j.ANIMATE_ZOOM);
            this.f555f = System.currentTimeMillis();
            this.f556g = TouchImageView.this.f533h;
            this.f557h = f;
            this.f560k = z;
            PointF p = TouchImageView.this.m565T(f2, f3, false);
            float f4 = p.x;
            this.f558i = f4;
            float f5 = p.y;
            this.f559j = f5;
            this.f562m = TouchImageView.this.m564S(f4, f5);
            this.f563n = new PointF((float) (TouchImageView.this.f520E / 2), (float) (TouchImageView.this.f521F / 2));
        }

        /* renamed from: a */
        private double m602a(float f) {
            float f2 = this.f556g;
            double d = (double) (f2 + (f * (this.f557h - f2)));
            double z = (double) TouchImageView.this.f533h;
            Double.isNaN(d);
            Double.isNaN(z);
            return d / z;
        }

        /* renamed from: b */
        private float m603b() {
            return this.f561l.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f555f)) / 500.0f));
        }

        /* renamed from: c */
        private void m604c(float f) {
            PointF pointF = this.f562m;
            float f2 = pointF.x;
            PointF pointF2 = this.f563n;
            float f3 = f2 + ((pointF2.x - f2) * f);
            float f4 = pointF.y;
            float f5 = f4 + (f * (pointF2.y - f4));
            PointF q = TouchImageView.this.m564S(this.f558i, this.f559j);
            TouchImageView.this.f534i.postTranslate(f3 - q.x, f5 - q.y);
        }

        public void run() {
            if (TouchImageView.this.getDrawable() == null) {
                TouchImageView.this.setState(C0160j.NONE);
                return;
            }
            float b = m603b();
            TouchImageView.this.m562O(m602a(b), this.f558i, this.f559j, this.f560k);
            m604c(b);
            TouchImageView.this.m557F();
            TouchImageView touchImageView = TouchImageView.this;
            touchImageView.setImageMatrix(touchImageView.f534i);
            if (TouchImageView.this.f532Q != null) {
                TouchImageView.this.f532Q.mo493a();
            }
            if (b < 1.0f) {
                TouchImageView.this.m554C(this);
            } else {
                TouchImageView.this.setState(C0160j.NONE);
            }
        }
    }

    /* renamed from: academia.bracu.com.academia.mediaslider.TouchImageView$d */
    public enum C0154d {
        CENTER,
        TOP_LEFT,
        BOTTOM_RIGHT
    }

    /* renamed from: academia.bracu.com.academia.mediaslider.TouchImageView$e */
    private class C0155e implements Runnable {

        /* renamed from: f */
        C0152b f565f;

        /* renamed from: g */
        int f566g;

        /* renamed from: h */
        int f567h;

        C0155e(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            TouchImageView.this.setState(C0160j.FLING);
            this.f565f = new C0152b(TouchImageView.this.f549x);
            TouchImageView.this.f534i.getValues(TouchImageView.this.f548w);
            int i7 = (int) TouchImageView.this.f548w[2];
            int i8 = (int) TouchImageView.this.f548w[5];
            if (TouchImageView.this.getImageWidth() > ((float) TouchImageView.this.f520E)) {
                i4 = TouchImageView.this.f520E - ((int) TouchImageView.this.getImageWidth());
                i3 = 0;
            } else {
                i4 = i7;
                i3 = i4;
            }
            if (TouchImageView.this.getImageHeight() > ((float) TouchImageView.this.f521F)) {
                i6 = TouchImageView.this.f521F - ((int) TouchImageView.this.getImageHeight());
                i5 = 0;
            } else {
                i6 = i8;
                i5 = i6;
            }
            this.f565f.mo480b(i7, i8, i, i2, i4, i3, i6, i5);
            this.f566g = i7;
            this.f567h = i8;
        }

        /* renamed from: a */
        public void mo486a() {
            if (this.f565f != null) {
                TouchImageView.this.setState(C0160j.NONE);
                this.f565f.mo481c(true);
            }
        }

        public void run() {
            if (TouchImageView.this.f532Q != null) {
                TouchImageView.this.f532Q.mo493a();
            }
            if (this.f565f.mo484f()) {
                this.f565f = null;
            } else if (this.f565f.mo479a()) {
                int d = this.f565f.mo482d();
                int e = this.f565f.mo483e();
                int i = d - this.f566g;
                int i2 = e - this.f567h;
                this.f566g = d;
                this.f567h = e;
                TouchImageView.this.f534i.postTranslate((float) i, (float) i2);
                TouchImageView.this.m558G();
                TouchImageView touchImageView = TouchImageView.this;
                touchImageView.setImageMatrix(touchImageView.f534i);
                TouchImageView.this.m554C(this);
            }
        }
    }

    /* renamed from: academia.bracu.com.academia.mediaslider.TouchImageView$f */
    private class C0156f extends GestureDetector.SimpleOnGestureListener {
        private C0156f() {
        }

        /* synthetic */ C0156f(TouchImageView touchImageView, C0151a aVar) {
            this();
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean z = false;
            if (!TouchImageView.this.mo441J()) {
                return false;
            }
            if (TouchImageView.this.f530O != null) {
                z = TouchImageView.this.f530O.onDoubleTap(motionEvent);
            }
            if (TouchImageView.this.f540o != C0160j.NONE) {
                return z;
            }
            TouchImageView.this.m554C(new C0153c(TouchImageView.this.f533h == TouchImageView.this.f542q ? TouchImageView.this.f545t : TouchImageView.this.f542q, motionEvent.getX(), motionEvent.getY(), false));
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (TouchImageView.this.f530O != null) {
                return TouchImageView.this.f530O.onDoubleTapEvent(motionEvent);
            }
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (TouchImageView.this.f550y != null) {
                TouchImageView.this.f550y.mo486a();
            }
            TouchImageView touchImageView = TouchImageView.this;
            C0155e unused = touchImageView.f550y = new C0155e((int) f, (int) f2);
            TouchImageView touchImageView2 = TouchImageView.this;
            touchImageView2.m554C(touchImageView2.f550y);
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public void onLongPress(MotionEvent motionEvent) {
            TouchImageView.this.performLongClick();
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return TouchImageView.this.f530O != null ? TouchImageView.this.f530O.onSingleTapConfirmed(motionEvent) : TouchImageView.this.performClick();
        }
    }

    /* renamed from: academia.bracu.com.academia.mediaslider.TouchImageView$g */
    public interface C0157g {
        /* renamed from: a */
        void mo493a();
    }

    /* renamed from: academia.bracu.com.academia.mediaslider.TouchImageView$h */
    private class C0158h implements View.OnTouchListener {

        /* renamed from: f */
        private PointF f570f;

        private C0158h() {
            this.f570f = new PointF();
        }

        /* synthetic */ C0158h(TouchImageView touchImageView, C0151a aVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
            if (r1 != 6) goto L_0x00d1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            /*
                r7 = this;
                academia.bracu.com.academia.mediaslider.TouchImageView r0 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                android.graphics.drawable.Drawable r0 = r0.getDrawable()
                if (r0 != 0) goto L_0x0011
                academia.bracu.com.academia.mediaslider.TouchImageView r8 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                academia.bracu.com.academia.mediaslider.TouchImageView$j r9 = academia.bracu.com.academia.mediaslider.TouchImageView.C0160j.NONE
                r8.setState(r9)
                r8 = 0
                return r8
            L_0x0011:
                academia.bracu.com.academia.mediaslider.TouchImageView r0 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                android.view.ScaleGestureDetector r0 = r0.f528M
                r0.onTouchEvent(r9)
                academia.bracu.com.academia.mediaslider.TouchImageView r0 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                android.view.GestureDetector r0 = r0.f529N
                r0.onTouchEvent(r9)
                android.graphics.PointF r0 = new android.graphics.PointF
                float r1 = r9.getX()
                float r2 = r9.getY()
                r0.<init>(r1, r2)
                academia.bracu.com.academia.mediaslider.TouchImageView r1 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                academia.bracu.com.academia.mediaslider.TouchImageView$j r1 = r1.f540o
                academia.bracu.com.academia.mediaslider.TouchImageView$j r2 = academia.bracu.com.academia.mediaslider.TouchImageView.C0160j.NONE
                r3 = 1
                if (r1 == r2) goto L_0x004f
                academia.bracu.com.academia.mediaslider.TouchImageView r1 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                academia.bracu.com.academia.mediaslider.TouchImageView$j r1 = r1.f540o
                academia.bracu.com.academia.mediaslider.TouchImageView$j r2 = academia.bracu.com.academia.mediaslider.TouchImageView.C0160j.DRAG
                if (r1 == r2) goto L_0x004f
                academia.bracu.com.academia.mediaslider.TouchImageView r1 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                academia.bracu.com.academia.mediaslider.TouchImageView$j r1 = r1.f540o
                academia.bracu.com.academia.mediaslider.TouchImageView$j r2 = academia.bracu.com.academia.mediaslider.TouchImageView.C0160j.FLING
                if (r1 != r2) goto L_0x00d1
            L_0x004f:
                int r1 = r9.getAction()
                if (r1 == 0) goto L_0x00b6
                if (r1 == r3) goto L_0x00ae
                r2 = 2
                if (r1 == r2) goto L_0x005e
                r0 = 6
                if (r1 == r0) goto L_0x00ae
                goto L_0x00d1
            L_0x005e:
                academia.bracu.com.academia.mediaslider.TouchImageView r1 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                academia.bracu.com.academia.mediaslider.TouchImageView$j r1 = r1.f540o
                academia.bracu.com.academia.mediaslider.TouchImageView$j r2 = academia.bracu.com.academia.mediaslider.TouchImageView.C0160j.DRAG
                if (r1 != r2) goto L_0x00d1
                float r1 = r0.x
                android.graphics.PointF r2 = r7.f570f
                float r4 = r2.x
                float r1 = r1 - r4
                float r4 = r0.y
                float r2 = r2.y
                float r4 = r4 - r2
                academia.bracu.com.academia.mediaslider.TouchImageView r2 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                int r5 = r2.f520E
                float r5 = (float) r5
                academia.bracu.com.academia.mediaslider.TouchImageView r6 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                float r6 = r6.getImageWidth()
                float r1 = r2.m559H(r1, r5, r6)
                academia.bracu.com.academia.mediaslider.TouchImageView r2 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                int r5 = r2.f521F
                float r5 = (float) r5
                academia.bracu.com.academia.mediaslider.TouchImageView r6 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                float r6 = r6.getImageHeight()
                float r2 = r2.m559H(r4, r5, r6)
                academia.bracu.com.academia.mediaslider.TouchImageView r4 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                android.graphics.Matrix r4 = r4.f534i
                r4.postTranslate(r1, r2)
                academia.bracu.com.academia.mediaslider.TouchImageView r1 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                r1.m558G()
                android.graphics.PointF r1 = r7.f570f
                float r2 = r0.x
                float r0 = r0.y
                r1.set(r2, r0)
                goto L_0x00d1
            L_0x00ae:
                academia.bracu.com.academia.mediaslider.TouchImageView r0 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                academia.bracu.com.academia.mediaslider.TouchImageView$j r1 = academia.bracu.com.academia.mediaslider.TouchImageView.C0160j.NONE
            L_0x00b2:
                r0.setState(r1)
                goto L_0x00d1
            L_0x00b6:
                android.graphics.PointF r1 = r7.f570f
                r1.set(r0)
                academia.bracu.com.academia.mediaslider.TouchImageView r0 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                academia.bracu.com.academia.mediaslider.TouchImageView$e r0 = r0.f550y
                if (r0 == 0) goto L_0x00cc
                academia.bracu.com.academia.mediaslider.TouchImageView r0 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                academia.bracu.com.academia.mediaslider.TouchImageView$e r0 = r0.f550y
                r0.mo486a()
            L_0x00cc:
                academia.bracu.com.academia.mediaslider.TouchImageView r0 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                academia.bracu.com.academia.mediaslider.TouchImageView$j r1 = academia.bracu.com.academia.mediaslider.TouchImageView.C0160j.DRAG
                goto L_0x00b2
            L_0x00d1:
                academia.bracu.com.academia.mediaslider.TouchImageView r0 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                android.graphics.Matrix r1 = r0.f534i
                r0.setImageMatrix(r1)
                academia.bracu.com.academia.mediaslider.TouchImageView r0 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                android.view.View$OnTouchListener r0 = r0.f531P
                if (r0 == 0) goto L_0x00eb
                academia.bracu.com.academia.mediaslider.TouchImageView r0 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                android.view.View$OnTouchListener r0 = r0.f531P
                r0.onTouch(r8, r9)
            L_0x00eb:
                academia.bracu.com.academia.mediaslider.TouchImageView r8 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                academia.bracu.com.academia.mediaslider.TouchImageView$g r8 = r8.f532Q
                if (r8 == 0) goto L_0x00fc
                academia.bracu.com.academia.mediaslider.TouchImageView r8 = academia.bracu.com.academia.mediaslider.TouchImageView.this
                academia.bracu.com.academia.mediaslider.TouchImageView$g r8 = r8.f532Q
                r8.mo493a()
            L_0x00fc:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.mediaslider.TouchImageView.C0158h.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: academia.bracu.com.academia.mediaslider.TouchImageView$i */
    private class C0159i extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private C0159i() {
        }

        /* synthetic */ C0159i(TouchImageView touchImageView, C0151a aVar) {
            this();
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            TouchImageView.this.m562O((double) scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), true);
            if (TouchImageView.this.f532Q == null) {
                return true;
            }
            TouchImageView.this.f532Q.mo493a();
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            TouchImageView.this.setState(C0160j.ZOOM);
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
            TouchImageView.this.setState(C0160j.NONE);
            float z = TouchImageView.this.f533h;
            boolean z2 = true;
            if (TouchImageView.this.f533h > TouchImageView.this.f545t) {
                z = TouchImageView.this.f545t;
            } else if (TouchImageView.this.f533h < TouchImageView.this.f542q) {
                z = TouchImageView.this.f542q;
            } else {
                z2 = false;
            }
            float f = z;
            if (z2) {
                TouchImageView touchImageView = TouchImageView.this;
                TouchImageView.this.m554C(new C0153c(f, (float) (touchImageView.f520E / 2), (float) (TouchImageView.this.f521F / 2), true));
            }
        }
    }

    /* renamed from: academia.bracu.com.academia.mediaslider.TouchImageView$j */
    private enum C0160j {
        NONE,
        DRAG,
        ZOOM,
        FLING,
        ANIMATE_ZOOM
    }

    /* renamed from: academia.bracu.com.academia.mediaslider.TouchImageView$k */
    private class C0161k {

        /* renamed from: a */
        float f573a;

        /* renamed from: b */
        float f574b;

        /* renamed from: c */
        float f575c;

        /* renamed from: d */
        ImageView.ScaleType f576d;

        C0161k(float f, float f2, float f3, ImageView.ScaleType scaleType) {
            this.f573a = f;
            this.f574b = f2;
            this.f575c = f3;
            this.f576d = scaleType;
        }
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0154d dVar = C0154d.CENTER;
        this.f537l = dVar;
        this.f538m = dVar;
        this.f539n = false;
        this.f543r = false;
        this.f530O = null;
        this.f531P = null;
        this.f532Q = null;
        m555D(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    @TargetApi(16)
    /* renamed from: C */
    public void m554C(Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            postOnAnimation(runnable);
        } else {
            postDelayed(runnable, 16);
        }
    }

    /* renamed from: D */
    private void m555D(Context context, AttributeSet attributeSet, int i) {
        this.f549x = context;
        super.setClickable(true);
        this.f551z = getResources().getConfiguration().orientation;
        this.f528M = new ScaleGestureDetector(context, new C0159i(this, (C0151a) null));
        this.f529N = new GestureDetector(context, new C0156f(this, (C0151a) null));
        this.f534i = new Matrix();
        this.f535j = new Matrix();
        this.f548w = new float[9];
        this.f533h = 1.0f;
        if (this.f516A == null) {
            this.f516A = ImageView.ScaleType.FIT_CENTER;
        }
        this.f542q = 1.0f;
        this.f545t = 3.0f;
        this.f546u = 1.0f * 0.75f;
        this.f547v = 3.0f * 1.25f;
        setImageMatrix(this.f534i);
        setScaleType(ImageView.ScaleType.MATRIX);
        setState(C0160j.NONE);
        this.f518C = false;
        super.setOnTouchListener(new C0158h(this, (C0151a) null));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0173i.TouchImageView, i, 0);
        if (obtainStyledAttributes != null) {
            try {
                if (!isInEditMode()) {
                    setZoomEnabled(obtainStyledAttributes.getBoolean(C0173i.TouchImageView_zoom_enabled, true));
                }
            } catch (Throwable th) {
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                throw th;
            }
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r2 = java.lang.Math.min(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r6 = r14.f520E;
        r10 = ((float) r6) - (r2 * r3);
        r11 = r14.f521F;
        r12 = ((float) r11) - (r4 * r5);
        r14.f524I = ((float) r6) - r10;
        r14.f525J = ((float) r11) - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        if (mo442K() != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        if (r14.f517B != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r14.f534i.setScale(r2, r4);
        r0 = academia.bracu.com.academia.mediaslider.TouchImageView.C0151a.f552a[r14.f516A.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        if (r0 == 5) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        if (r0 == 6) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
        r0 = r14.f534i;
        r10 = r10 / 2.0f;
        r12 = r12 / 2.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
        r0 = r14.f534i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b6, code lost:
        r0.postTranslate(r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        r14.f534i.postTranslate(0.0f, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        r14.f533h = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c6, code lost:
        if (r14.f526K == 0.0f) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        if (r14.f527L != 0.0f) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ce, code lost:
        mo444N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d1, code lost:
        r14.f535j.getValues(r14.f548w);
        r2 = r14.f548w;
        r4 = r14.f524I / r3;
        r3 = r14.f533h;
        r2[0] = r4 * r3;
        r2[4] = (r14.f525J / r5) * r3;
        r4 = r2[2];
        r12 = r2[5];
        r8 = r0;
        r14.f548w[2] = m561L(r4, r3 * r14.f526K, getImageWidth(), r14.f522G, r14.f520E, r7, r8);
        r14.f548w[5] = m561L(r12, r14.f527L * r14.f533h, getImageHeight(), r14.f523H, r14.f521F, r9, r8);
        r14.f534i.setValues(r14.f548w);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012a, code lost:
        m558G();
        setImageMatrix(r14.f534i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m556E() {
        /*
            r14 = this;
            boolean r0 = r14.f539n
            if (r0 == 0) goto L_0x0007
            academia.bracu.com.academia.mediaslider.TouchImageView$d r0 = r14.f537l
            goto L_0x0009
        L_0x0007:
            academia.bracu.com.academia.mediaslider.TouchImageView$d r0 = r14.f538m
        L_0x0009:
            r1 = 0
            r14.f539n = r1
            android.graphics.drawable.Drawable r2 = r14.getDrawable()
            if (r2 == 0) goto L_0x0132
            int r3 = r2.getIntrinsicWidth()
            if (r3 == 0) goto L_0x0132
            int r3 = r2.getIntrinsicHeight()
            if (r3 != 0) goto L_0x0020
            goto L_0x0132
        L_0x0020:
            android.graphics.Matrix r3 = r14.f534i
            if (r3 == 0) goto L_0x0132
            android.graphics.Matrix r3 = r14.f535j
            if (r3 != 0) goto L_0x002a
            goto L_0x0132
        L_0x002a:
            float r3 = r14.f541p
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x003f
            r14.setMinZoom(r4)
            float r3 = r14.f533h
            float r4 = r14.f542q
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x003f
            r14.f533h = r4
        L_0x003f:
            int r7 = r2.getIntrinsicWidth()
            int r9 = r2.getIntrinsicHeight()
            int r2 = r14.f520E
            float r2 = (float) r2
            float r3 = (float) r7
            float r2 = r2 / r3
            int r4 = r14.f521F
            float r4 = (float) r4
            float r5 = (float) r9
            float r4 = r4 / r5
            int[] r6 = academia.bracu.com.academia.mediaslider.TouchImageView.C0151a.f552a
            android.widget.ImageView$ScaleType r8 = r14.f516A
            int r8 = r8.ordinal()
            r6 = r6[r8]
            r8 = 1065353216(0x3f800000, float:1.0)
            switch(r6) {
                case 1: goto L_0x0075;
                case 2: goto L_0x0070;
                case 3: goto L_0x0061;
                case 4: goto L_0x006a;
                case 5: goto L_0x006a;
                case 6: goto L_0x006a;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0079
        L_0x0061:
            float r2 = java.lang.Math.min(r2, r4)
            float r2 = java.lang.Math.min(r8, r2)
            r4 = r2
        L_0x006a:
            float r2 = java.lang.Math.min(r2, r4)
        L_0x006e:
            r4 = r2
            goto L_0x0079
        L_0x0070:
            float r2 = java.lang.Math.max(r2, r4)
            goto L_0x006e
        L_0x0075:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0079:
            int r6 = r14.f520E
            float r10 = (float) r6
            float r11 = r2 * r3
            float r10 = r10 - r11
            int r11 = r14.f521F
            float r12 = (float) r11
            float r13 = r4 * r5
            float r12 = r12 - r13
            float r6 = (float) r6
            float r6 = r6 - r10
            r14.f524I = r6
            float r6 = (float) r11
            float r6 = r6 - r12
            r14.f525J = r6
            boolean r6 = r14.mo442K()
            r11 = 5
            r13 = 0
            if (r6 != 0) goto L_0x00c2
            boolean r6 = r14.f517B
            if (r6 != 0) goto L_0x00c2
            android.graphics.Matrix r0 = r14.f534i
            r0.setScale(r2, r4)
            int[] r0 = academia.bracu.com.academia.mediaslider.TouchImageView.C0151a.f552a
            android.widget.ImageView$ScaleType r1 = r14.f516A
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r11) goto L_0x00ba
            r1 = 6
            if (r0 == r1) goto L_0x00b4
            android.graphics.Matrix r0 = r14.f534i
            r1 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r1
            float r12 = r12 / r1
            goto L_0x00b6
        L_0x00b4:
            android.graphics.Matrix r0 = r14.f534i
        L_0x00b6:
            r0.postTranslate(r10, r12)
            goto L_0x00bf
        L_0x00ba:
            android.graphics.Matrix r0 = r14.f534i
            r0.postTranslate(r13, r13)
        L_0x00bf:
            r14.f533h = r8
            goto L_0x012a
        L_0x00c2:
            float r2 = r14.f526K
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x00ce
            float r2 = r14.f527L
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00d1
        L_0x00ce:
            r14.mo444N()
        L_0x00d1:
            android.graphics.Matrix r2 = r14.f535j
            float[] r4 = r14.f548w
            r2.getValues(r4)
            float[] r2 = r14.f548w
            float r4 = r14.f524I
            float r4 = r4 / r3
            float r3 = r14.f533h
            float r4 = r4 * r3
            r2[r1] = r4
            r1 = 4
            float r4 = r14.f525J
            float r4 = r4 / r5
            float r4 = r4 * r3
            r2[r1] = r4
            r10 = 2
            r4 = r2[r10]
            r12 = r2[r11]
            float r1 = r14.f526K
            float r3 = r3 * r1
            float r5 = r14.getImageWidth()
            float[] r13 = r14.f548w
            int r6 = r14.f522G
            int r8 = r14.f520E
            r1 = r14
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r0
            float r1 = r1.m561L(r2, r3, r4, r5, r6, r7, r8)
            r13[r10] = r1
            float r1 = r14.f527L
            float r2 = r14.f533h
            float r3 = r1 * r2
            float r4 = r14.getImageHeight()
            float[] r10 = r14.f548w
            int r5 = r14.f523H
            int r6 = r14.f521F
            r1 = r14
            r2 = r12
            r7 = r9
            float r0 = r1.m561L(r2, r3, r4, r5, r6, r7, r8)
            r10[r11] = r0
            android.graphics.Matrix r0 = r14.f534i
            float[] r1 = r14.f548w
            r0.setValues(r1)
        L_0x012a:
            r14.m558G()
            android.graphics.Matrix r0 = r14.f534i
            r14.setImageMatrix(r0)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.mediaslider.TouchImageView.m556E():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m557F() {
        m558G();
        this.f534i.getValues(this.f548w);
        float imageWidth = getImageWidth();
        int i = this.f520E;
        if (imageWidth < ((float) i)) {
            this.f548w[2] = (((float) i) - getImageWidth()) / 2.0f;
        }
        float imageHeight = getImageHeight();
        int i2 = this.f521F;
        if (imageHeight < ((float) i2)) {
            this.f548w[5] = (((float) i2) - getImageHeight()) / 2.0f;
        }
        this.f534i.setValues(this.f548w);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m558G() {
        this.f534i.getValues(this.f548w);
        float[] fArr = this.f548w;
        float f = fArr[2];
        float f2 = fArr[5];
        float I = m560I(f, (float) this.f520E, getImageWidth());
        float I2 = m560I(f2, (float) this.f521F, getImageHeight());
        if (I != 0.0f || I2 != 0.0f) {
            this.f534i.postTranslate(I, I2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public float m559H(float f, float f2, float f3) {
        if (f3 <= f2) {
            return 0.0f;
        }
        return f;
    }

    /* renamed from: I */
    private float m560I(float f, float f2, float f3) {
        float f4;
        int i = (f3 > f2 ? 1 : (f3 == f2 ? 0 : -1));
        float f5 = f2 - f3;
        if (i <= 0) {
            f4 = f5;
            f5 = 0.0f;
        } else {
            f4 = 0.0f;
        }
        if (f < f5) {
            return (-f) + f5;
        }
        if (f > f4) {
            return (-f) + f4;
        }
        return 0.0f;
    }

    /* renamed from: L */
    private float m561L(float f, float f2, float f3, int i, int i2, int i3, C0154d dVar) {
        float f4 = (float) i2;
        float f5 = 0.5f;
        if (f3 < f4) {
            return (f4 - (((float) i3) * this.f548w[0])) * 0.5f;
        }
        if (f > 0.0f) {
            return -((f3 - f4) * 0.5f);
        }
        if (dVar == C0154d.BOTTOM_RIGHT) {
            f5 = 1.0f;
        } else if (dVar == C0154d.TOP_LEFT) {
            f5 = 0.0f;
        }
        return -(((((-f) + (((float) i) * f5)) / f2) * f3) - (f4 * f5));
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m562O(double d, float f, float f2, boolean z) {
        float f3;
        float f4;
        if (z) {
            f3 = this.f546u;
            f4 = this.f547v;
        } else {
            f3 = this.f542q;
            f4 = this.f545t;
        }
        float f5 = this.f533h;
        double d2 = (double) f5;
        Double.isNaN(d2);
        float f6 = (float) (d2 * d);
        this.f533h = f6;
        if (f6 > f4) {
            this.f533h = f4;
            d = (double) (f4 / f5);
        } else if (f6 < f3) {
            this.f533h = f3;
            d = (double) (f3 / f5);
        }
        float f7 = (float) d;
        this.f534i.postScale(f7, f7, f, f2);
        m557F();
    }

    /* renamed from: P */
    private int m563P(int i, int i2, int i3) {
        return i != Integer.MIN_VALUE ? i != 0 ? i2 : i3 : Math.min(i3, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public PointF m564S(float f, float f2) {
        this.f534i.getValues(this.f548w);
        return new PointF(this.f548w[2] + (getImageWidth() * (f / ((float) getDrawable().getIntrinsicWidth()))), this.f548w[5] + (getImageHeight() * (f2 / ((float) getDrawable().getIntrinsicHeight()))));
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public PointF m565T(float f, float f2, boolean z) {
        this.f534i.getValues(this.f548w);
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
        float[] fArr = this.f548w;
        float f3 = fArr[2];
        float f4 = fArr[5];
        float imageWidth = ((f - f3) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((f2 - f4) * intrinsicHeight) / getImageHeight();
        if (z) {
            imageWidth = Math.min(Math.max(imageWidth, 0.0f), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, 0.0f), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    /* access modifiers changed from: private */
    public float getImageHeight() {
        return this.f525J * this.f533h;
    }

    /* access modifiers changed from: private */
    public float getImageWidth() {
        return this.f524I * this.f533h;
    }

    /* access modifiers changed from: private */
    public void setState(C0160j jVar) {
        this.f540o = jVar;
    }

    /* renamed from: J */
    public boolean mo441J() {
        return this.f536k;
    }

    /* renamed from: K */
    public boolean mo442K() {
        return this.f533h != 1.0f;
    }

    /* renamed from: M */
    public void mo443M() {
        this.f533h = 1.0f;
        m556E();
    }

    /* renamed from: N */
    public void mo444N() {
        Matrix matrix = this.f534i;
        if (matrix != null && this.f521F != 0 && this.f520E != 0) {
            matrix.getValues(this.f548w);
            this.f535j.setValues(this.f548w);
            this.f527L = this.f525J;
            this.f526K = this.f524I;
            this.f523H = this.f521F;
            this.f522G = this.f520E;
        }
    }

    /* renamed from: Q */
    public void mo445Q(float f, float f2, float f3) {
        mo446R(f, f2, f3, this.f516A);
    }

    /* renamed from: R */
    public void mo446R(float f, float f2, float f3, ImageView.ScaleType scaleType) {
        if (!this.f518C) {
            this.f519D = new C0161k(f, f2, f3, scaleType);
            return;
        }
        if (this.f541p == -1.0f) {
            setMinZoom(-1.0f);
            float f4 = this.f533h;
            float f5 = this.f542q;
            if (f4 < f5) {
                this.f533h = f5;
            }
        }
        if (scaleType != this.f516A) {
            setScaleType(scaleType);
        }
        mo443M();
        m562O((double) f, (float) (this.f520E / 2), (float) (this.f521F / 2), true);
        this.f534i.getValues(this.f548w);
        this.f548w[2] = -((f2 * getImageWidth()) - (((float) this.f520E) * 0.5f));
        this.f548w[5] = -((f3 * getImageHeight()) - (((float) this.f521F) * 0.5f));
        this.f534i.setValues(this.f548w);
        m558G();
        setImageMatrix(this.f534i);
    }

    public boolean canScrollHorizontally(int i) {
        this.f534i.getValues(this.f548w);
        float f = this.f548w[2];
        if (getImageWidth() < ((float) this.f520E)) {
            return false;
        }
        if (f < -1.0f || i >= 0) {
            return (Math.abs(f) + ((float) this.f520E)) + 1.0f < getImageWidth() || i <= 0;
        }
        return false;
    }

    public boolean canScrollVertically(int i) {
        this.f534i.getValues(this.f548w);
        float f = this.f548w[5];
        if (getImageHeight() < ((float) this.f521F)) {
            return false;
        }
        if (f < -1.0f || i >= 0) {
            return (Math.abs(f) + ((float) this.f521F)) + 1.0f < getImageHeight() || i <= 0;
        }
        return false;
    }

    public float getCurrentZoom() {
        return this.f533h;
    }

    public float getMaxZoom() {
        return this.f545t;
    }

    public float getMinZoom() {
        return this.f542q;
    }

    public C0154d getOrientationChangeFixedPixel() {
        return this.f537l;
    }

    public ImageView.ScaleType getScaleType() {
        return this.f516A;
    }

    public PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        PointF T = m565T((float) (this.f520E / 2), (float) (this.f521F / 2), true);
        T.x /= (float) intrinsicWidth;
        T.y /= (float) intrinsicHeight;
        return T;
    }

    public C0154d getViewSizeChangeFixedPixel() {
        return this.f538m;
    }

    public RectF getZoomedRect() {
        if (this.f516A != ImageView.ScaleType.FIT_XY) {
            PointF T = m565T(0.0f, 0.0f, true);
            PointF T2 = m565T((float) this.f520E, (float) this.f521F, true);
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            return new RectF(T.x / intrinsicWidth, T.y / intrinsicHeight, T2.x / intrinsicWidth, T2.y / intrinsicHeight);
        }
        throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = getResources().getConfiguration().orientation;
        if (i != this.f551z) {
            this.f539n = true;
            this.f551z = i;
        }
        mo444N();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f518C = true;
        this.f517B = true;
        C0161k kVar = this.f519D;
        if (kVar != null) {
            mo446R(kVar.f573a, kVar.f574b, kVar.f575c, kVar.f576d);
            this.f519D = null;
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        int i3 = 0;
        int intrinsicWidth = drawable == null ? 0 : drawable.getIntrinsicWidth();
        if (drawable != null) {
            i3 = drawable.getIntrinsicHeight();
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int P = m563P(mode, size, intrinsicWidth);
        int P2 = m563P(mode2, size2, i3);
        if (!this.f539n) {
            mo444N();
        }
        setMeasuredDimension((P - getPaddingLeft()) - getPaddingRight(), (P2 - getPaddingTop()) - getPaddingBottom());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f533h = bundle.getFloat("saveScale");
            float[] floatArray = bundle.getFloatArray("matrix");
            this.f548w = floatArray;
            this.f535j.setValues(floatArray);
            this.f527L = bundle.getFloat("matchViewHeight");
            this.f526K = bundle.getFloat("matchViewWidth");
            this.f523H = bundle.getInt("viewHeight");
            this.f522G = bundle.getInt("viewWidth");
            this.f517B = bundle.getBoolean("imageRendered");
            this.f538m = (C0154d) bundle.getSerializable("viewSizeChangeFixedPixel");
            this.f537l = (C0154d) bundle.getSerializable("orientationChangeFixedPixel");
            if (this.f551z != bundle.getInt("orientation")) {
                this.f539n = true;
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("orientation", this.f551z);
        bundle.putFloat("saveScale", this.f533h);
        bundle.putFloat("matchViewHeight", this.f525J);
        bundle.putFloat("matchViewWidth", this.f524I);
        bundle.putInt("viewWidth", this.f520E);
        bundle.putInt("viewHeight", this.f521F);
        this.f534i.getValues(this.f548w);
        bundle.putFloatArray("matrix", this.f548w);
        bundle.putBoolean("imageRendered", this.f517B);
        bundle.putSerializable("viewSizeChangeFixedPixel", this.f538m);
        bundle.putSerializable("orientationChangeFixedPixel", this.f537l);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f520E = i;
        this.f521F = i2;
        m556E();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f517B = false;
        super.setImageBitmap(bitmap);
        mo444N();
        m556E();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f517B = false;
        super.setImageDrawable(drawable);
        mo444N();
        m556E();
    }

    public void setImageResource(int i) {
        this.f517B = false;
        super.setImageResource(i);
        mo444N();
        m556E();
    }

    public void setImageURI(Uri uri) {
        this.f517B = false;
        super.setImageURI(uri);
        mo444N();
        m556E();
    }

    public void setMaxZoom(float f) {
        this.f545t = f;
        this.f547v = f * 1.25f;
        this.f543r = false;
    }

    public void setMaxZoomRatio(float f) {
        this.f544s = f;
        float f2 = this.f542q * f;
        this.f545t = f2;
        this.f547v = f2 * 1.25f;
        this.f543r = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMinZoom(float r4) {
        /*
            r3 = this;
            r3.f541p = r4
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            android.widget.ImageView$ScaleType r4 = r3.f516A
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            if (r4 == r0) goto L_0x0016
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            if (r4 != r0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0049
        L_0x0016:
            android.graphics.drawable.Drawable r4 = r3.getDrawable()
            int r0 = r4.getIntrinsicWidth()
            int r1 = r4.getIntrinsicHeight()
            if (r4 == 0) goto L_0x004b
            if (r0 <= 0) goto L_0x004b
            if (r1 <= 0) goto L_0x004b
            int r4 = r3.f520E
            float r4 = (float) r4
            float r0 = (float) r0
            float r4 = r4 / r0
            int r0 = r3.f521F
            float r0 = (float) r0
            float r1 = (float) r1
            float r0 = r0 / r1
            android.widget.ImageView$ScaleType r1 = r3.f516A
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER
            if (r1 != r2) goto L_0x003d
            float r4 = java.lang.Math.min(r4, r0)
            goto L_0x0049
        L_0x003d:
            float r1 = java.lang.Math.min(r4, r0)
            float r4 = java.lang.Math.max(r4, r0)
            float r1 = r1 / r4
            r3.f542q = r1
            goto L_0x004b
        L_0x0049:
            r3.f542q = r4
        L_0x004b:
            boolean r4 = r3.f543r
            if (r4 == 0) goto L_0x0054
            float r4 = r3.f544s
            r3.setMaxZoomRatio(r4)
        L_0x0054:
            r4 = 1061158912(0x3f400000, float:0.75)
            float r0 = r3.f542q
            float r0 = r0 * r4
            r3.f546u = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.mediaslider.TouchImageView.setMinZoom(float):void");
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f530O = onDoubleTapListener;
    }

    public void setOnTouchImageViewListener(C0157g gVar) {
        this.f532Q = gVar;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f531P = onTouchListener;
    }

    public void setOrientationChangeFixedPixel(C0154d dVar) {
        this.f537l = dVar;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
        if (scaleType == scaleType2) {
            super.setScaleType(scaleType2);
            return;
        }
        this.f516A = scaleType;
        if (this.f518C) {
            setZoom(this);
        }
    }

    public void setViewSizeChangeFixedPixel(C0154d dVar) {
        this.f538m = dVar;
    }

    public void setZoom(float f) {
        mo445Q(f, 0.5f, 0.5f);
    }

    public void setZoom(TouchImageView touchImageView) {
        PointF scrollPosition = touchImageView.getScrollPosition();
        mo446R(touchImageView.getCurrentZoom(), scrollPosition.x, scrollPosition.y, touchImageView.getScaleType());
    }

    public void setZoomEnabled(boolean z) {
        this.f536k = z;
    }
}
