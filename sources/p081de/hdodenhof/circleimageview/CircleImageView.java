package p081de.hdodenhof.circleimageview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;

/* renamed from: de.hdodenhof.circleimageview.CircleImageView */
public class CircleImageView extends ImageView {

    /* renamed from: A */
    private static final Bitmap.Config f9899A = Bitmap.Config.ARGB_8888;

    /* renamed from: z */
    private static final ImageView.ScaleType f9900z = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: f */
    private final RectF f9901f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final RectF f9902g;

    /* renamed from: h */
    private final Matrix f9903h;

    /* renamed from: i */
    private final Paint f9904i;

    /* renamed from: j */
    private final Paint f9905j;

    /* renamed from: k */
    private final Paint f9906k;

    /* renamed from: l */
    private int f9907l;

    /* renamed from: m */
    private int f9908m;

    /* renamed from: n */
    private int f9909n;

    /* renamed from: o */
    private Bitmap f9910o;

    /* renamed from: p */
    private BitmapShader f9911p;

    /* renamed from: q */
    private int f9912q;

    /* renamed from: r */
    private int f9913r;

    /* renamed from: s */
    private float f9914s;

    /* renamed from: t */
    private float f9915t;

    /* renamed from: u */
    private ColorFilter f9916u;

    /* renamed from: v */
    private boolean f9917v;

    /* renamed from: w */
    private boolean f9918w;

    /* renamed from: x */
    private boolean f9919x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f9920y;

    /* renamed from: de.hdodenhof.circleimageview.CircleImageView$b */
    private class C3114b extends ViewOutlineProvider {
        private C3114b() {
        }

        public void getOutline(View view, Outline outline) {
            if (CircleImageView.this.f9920y) {
                ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                return;
            }
            Rect rect = new Rect();
            CircleImageView.this.f9902g.roundOut(rect);
            outline.setRoundRect(rect, ((float) rect.width()) / 2.0f);
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9901f = new RectF();
        this.f9902g = new RectF();
        this.f9903h = new Matrix();
        this.f9904i = new Paint();
        this.f9905j = new Paint();
        this.f9906k = new Paint();
        this.f9907l = -16777216;
        this.f9908m = 0;
        this.f9909n = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3115a.CircleImageView, i, 0);
        this.f9908m = obtainStyledAttributes.getDimensionPixelSize(C3115a.CircleImageView_civ_border_width, 0);
        this.f9907l = obtainStyledAttributes.getColor(C3115a.CircleImageView_civ_border_color, -16777216);
        this.f9919x = obtainStyledAttributes.getBoolean(C3115a.CircleImageView_civ_border_overlay, false);
        this.f9909n = obtainStyledAttributes.getColor(C3115a.CircleImageView_civ_circle_background_color, 0);
        obtainStyledAttributes.recycle();
        m13373g();
    }

    /* renamed from: c */
    private void m13369c() {
        Paint paint = this.f9904i;
        if (paint != null) {
            paint.setColorFilter(this.f9916u);
        }
    }

    /* renamed from: d */
    private RectF m13370d() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = Math.min(width, height);
        float paddingLeft = ((float) getPaddingLeft()) + (((float) (width - min)) / 2.0f);
        float paddingTop = ((float) getPaddingTop()) + (((float) (height - min)) / 2.0f);
        float f = (float) min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    /* renamed from: e */
    private Bitmap m13371e(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f9899A) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f9899A);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    private boolean m13372f(float f, float f2) {
        return this.f9902g.isEmpty() || Math.pow((double) (f - this.f9902g.centerX()), 2.0d) + Math.pow((double) (f2 - this.f9902g.centerY()), 2.0d) <= Math.pow((double) this.f9915t, 2.0d);
    }

    /* renamed from: g */
    private void m13373g() {
        super.setScaleType(f9900z);
        this.f9917v = true;
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C3114b());
        }
        if (this.f9918w) {
            m13375i();
            this.f9918w = false;
        }
    }

    /* renamed from: h */
    private void m13374h() {
        this.f9910o = this.f9920y ? null : m13371e(getDrawable());
        m13375i();
    }

    /* renamed from: i */
    private void m13375i() {
        int i;
        if (!this.f9917v) {
            this.f9918w = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.f9910o == null) {
                invalidate();
                return;
            }
            Bitmap bitmap = this.f9910o;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f9911p = new BitmapShader(bitmap, tileMode, tileMode);
            this.f9904i.setAntiAlias(true);
            this.f9904i.setDither(true);
            this.f9904i.setFilterBitmap(true);
            this.f9904i.setShader(this.f9911p);
            this.f9905j.setStyle(Paint.Style.STROKE);
            this.f9905j.setAntiAlias(true);
            this.f9905j.setColor(this.f9907l);
            this.f9905j.setStrokeWidth((float) this.f9908m);
            this.f9906k.setStyle(Paint.Style.FILL);
            this.f9906k.setAntiAlias(true);
            this.f9906k.setColor(this.f9909n);
            this.f9913r = this.f9910o.getHeight();
            this.f9912q = this.f9910o.getWidth();
            this.f9902g.set(m13370d());
            this.f9915t = Math.min((this.f9902g.height() - ((float) this.f9908m)) / 2.0f, (this.f9902g.width() - ((float) this.f9908m)) / 2.0f);
            this.f9901f.set(this.f9902g);
            if (!this.f9919x && (i = this.f9908m) > 0) {
                this.f9901f.inset(((float) i) - 1.0f, ((float) i) - 1.0f);
            }
            this.f9914s = Math.min(this.f9901f.height() / 2.0f, this.f9901f.width() / 2.0f);
            m13369c();
            m13376j();
            invalidate();
        }
    }

    /* renamed from: j */
    private void m13376j() {
        float f;
        float f2;
        this.f9903h.set((Matrix) null);
        float f3 = 0.0f;
        if (((float) this.f9912q) * this.f9901f.height() > this.f9901f.width() * ((float) this.f9913r)) {
            f2 = this.f9901f.height() / ((float) this.f9913r);
            f3 = (this.f9901f.width() - (((float) this.f9912q) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = this.f9901f.width() / ((float) this.f9912q);
            f = (this.f9901f.height() - (((float) this.f9913r) * f2)) * 0.5f;
        }
        this.f9903h.setScale(f2, f2);
        Matrix matrix = this.f9903h;
        RectF rectF = this.f9901f;
        matrix.postTranslate(((float) ((int) (f3 + 0.5f))) + rectF.left, ((float) ((int) (f + 0.5f))) + rectF.top);
        this.f9911p.setLocalMatrix(this.f9903h);
    }

    public int getBorderColor() {
        return this.f9907l;
    }

    public int getBorderWidth() {
        return this.f9908m;
    }

    public int getCircleBackgroundColor() {
        return this.f9909n;
    }

    public ColorFilter getColorFilter() {
        return this.f9916u;
    }

    public ImageView.ScaleType getScaleType() {
        return f9900z;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f9920y) {
            super.onDraw(canvas);
        } else if (this.f9910o != null) {
            if (this.f9909n != 0) {
                canvas.drawCircle(this.f9901f.centerX(), this.f9901f.centerY(), this.f9914s, this.f9906k);
            }
            canvas.drawCircle(this.f9901f.centerX(), this.f9901f.centerY(), this.f9914s, this.f9904i);
            if (this.f9908m > 0) {
                canvas.drawCircle(this.f9902g.centerX(), this.f9902g.centerY(), this.f9915t, this.f9905j);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m13375i();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f9920y ? super.onTouchEvent(motionEvent) : m13372f(motionEvent.getX(), motionEvent.getY()) && super.onTouchEvent(motionEvent);
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i) {
        if (i != this.f9907l) {
            this.f9907l = i;
            this.f9905j.setColor(i);
            invalidate();
        }
    }

    public void setBorderOverlay(boolean z) {
        if (z != this.f9919x) {
            this.f9919x = z;
            m13375i();
        }
    }

    public void setBorderWidth(int i) {
        if (i != this.f9908m) {
            this.f9908m = i;
            m13375i();
        }
    }

    public void setCircleBackgroundColor(int i) {
        if (i != this.f9909n) {
            this.f9909n = i;
            this.f9906k.setColor(i);
            invalidate();
        }
    }

    public void setCircleBackgroundColorResource(int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f9916u) {
            this.f9916u = colorFilter;
            m13369c();
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.f9920y != z) {
            this.f9920y = z;
            m13374h();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m13374h();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m13374h();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        m13374h();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m13374h();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m13375i();
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m13375i();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f9900z) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[]{scaleType}));
        }
    }
}
