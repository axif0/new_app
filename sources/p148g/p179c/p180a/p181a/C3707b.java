package p148g.p179c.p180a.p181a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p122m.C3403t;
import p148g.p179c.p180a.p181a.p182c.C3709a;
import p148g.p179c.p180a.p181a.p182c.C3710b;

/* renamed from: g.c.a.a.b */
public class C3707b extends FrameLayout {

    /* renamed from: f */
    private final Paint f11306f = new Paint(1);

    /* renamed from: g */
    private final Path f11307g = new Path();

    /* renamed from: h */
    protected PorterDuffXfermode f11308h = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);

    /* renamed from: i */
    protected Drawable f11309i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3709a f11310j = new C3710b();

    /* renamed from: k */
    private boolean f11311k = true;

    /* renamed from: l */
    private Bitmap f11312l;

    /* renamed from: m */
    final Path f11313m = new Path();

    /* renamed from: g.c.a.a.b$a */
    class C3708a extends ViewOutlineProvider {
        C3708a() {
        }

        public void getOutline(View view, Outline outline) {
            Path e;
            if (C3707b.this.f11310j != null && !C3707b.this.isInEditMode() && (e = C3707b.this.f11310j.mo12241e()) != null) {
                try {
                    outline.setConvexPath(e);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public C3707b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15516d(context, attributeSet);
    }

    /* renamed from: b */
    private void m15515b(int i, int i2) {
        this.f11313m.reset();
        this.f11313m.addRect(0.0f, 0.0f, ((float) getWidth()) * 1.0f, ((float) getHeight()) * 1.0f, Path.Direction.CW);
        C3709a aVar = this.f11310j;
        if (aVar != null && i > 0 && i2 > 0) {
            aVar.mo12238b(i, i2);
            this.f11307g.reset();
            this.f11307g.set(this.f11310j.mo12239c(i, i2));
            if (m15517f()) {
                Bitmap bitmap = this.f11312l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f11312l = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f11312l);
                Drawable drawable = this.f11309i;
                if (drawable != null) {
                    drawable.setBounds(0, 0, i, i2);
                    this.f11309i.draw(canvas);
                } else {
                    canvas.drawPath(this.f11307g, this.f11310j.mo12240d());
                }
            }
            if (Build.VERSION.SDK_INT > 27) {
                this.f11313m.op(this.f11307g, Path.Op.DIFFERENCE);
            }
            if (Build.VERSION.SDK_INT >= 21 && C3403t.m14664t(this) > 0.0f) {
                try {
                    setOutlineProvider(getOutlineProvider());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        postInvalidate();
    }

    /* renamed from: d */
    private void m15516d(Context context, AttributeSet attributeSet) {
        Paint paint;
        int resourceId;
        this.f11306f.setAntiAlias(true);
        setDrawingCacheEnabled(true);
        setWillNotDraw(false);
        this.f11306f.setColor(-16776961);
        this.f11306f.setStyle(Paint.Style.FILL);
        this.f11306f.setStrokeWidth(1.0f);
        if (Build.VERSION.SDK_INT <= 27) {
            this.f11306f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            paint = this.f11306f;
        } else {
            this.f11306f.setXfermode(this.f11308h);
            paint = null;
        }
        setLayerType(1, paint);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3706a.ShapeOfView);
            if (obtainStyledAttributes.hasValue(C3706a.ShapeOfView_shape_clip_drawable) && -1 != (resourceId = obtainStyledAttributes.getResourceId(C3706a.ShapeOfView_shape_clip_drawable, -1))) {
                setDrawable(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f11310j;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15517f() {
        /*
            r1 = this;
            boolean r0 = r1.isInEditMode()
            if (r0 != 0) goto L_0x0017
            g.c.a.a.c.a r0 = r1.f11310j
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.mo12237a()
            if (r0 != 0) goto L_0x0017
        L_0x0010:
            android.graphics.drawable.Drawable r0 = r1.f11309i
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p179c.p180a.p181a.C3707b.m15517f():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo12225c(float f) {
        return f * getContext().getResources().getDisplayMetrics().density;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f11311k) {
            m15515b(canvas.getWidth(), canvas.getHeight());
            this.f11311k = false;
        }
        if (m15517f()) {
            this.f11306f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(this.f11312l, 0.0f, 0.0f, this.f11306f);
        } else {
            canvas.drawPath(Build.VERSION.SDK_INT <= 27 ? this.f11307g : this.f11313m, this.f11306f);
        }
        if (Build.VERSION.SDK_INT <= 27) {
            setLayerType(2, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public float mo12226e(float f) {
        return f / getContext().getResources().getDisplayMetrics().density;
    }

    /* renamed from: g */
    public void mo12227g() {
        this.f11311k = true;
        postInvalidate();
    }

    @TargetApi(21)
    public ViewOutlineProvider getOutlineProvider() {
        return new C3708a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo12227g();
        }
    }

    public void setBackground(Drawable drawable) {
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundResource(int i) {
    }

    public void setClipPathCreator(C3710b.C3711a aVar) {
        ((C3710b) this.f11310j).mo12243g(aVar);
        mo12227g();
    }

    public void setDrawable(int i) {
        setDrawable(C3133a.m13388d(getContext(), i));
    }

    public void setDrawable(Drawable drawable) {
        this.f11309i = drawable;
        mo12227g();
    }
}
