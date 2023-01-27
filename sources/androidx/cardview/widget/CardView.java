package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p086f.p101d.C3185a;
import p086f.p101d.C3186b;
import p086f.p101d.C3188d;
import p086f.p101d.C3189e;

public class CardView extends FrameLayout {

    /* renamed from: m */
    private static final int[] f1975m = {16842801};

    /* renamed from: n */
    private static final C0516e f1976n;

    /* renamed from: f */
    private boolean f1977f;

    /* renamed from: g */
    private boolean f1978g;

    /* renamed from: h */
    int f1979h;

    /* renamed from: i */
    int f1980i;

    /* renamed from: j */
    final Rect f1981j;

    /* renamed from: k */
    final Rect f1982k;

    /* renamed from: l */
    private final C0515d f1983l;

    /* renamed from: androidx.cardview.widget.CardView$a */
    class C0509a implements C0515d {

        /* renamed from: a */
        private Drawable f1984a;

        C0509a() {
        }

        /* renamed from: a */
        public void mo2512a(int i, int i2, int i3, int i4) {
            CardView.this.f1982k.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1981j;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: b */
        public View mo2513b() {
            return CardView.this;
        }

        /* renamed from: c */
        public void mo2514c(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f1979h) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f1980i) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        /* renamed from: d */
        public void mo2515d(Drawable drawable) {
            this.f1984a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        /* renamed from: e */
        public boolean mo2516e() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* renamed from: f */
        public boolean mo2517f() {
            return CardView.this.getUseCompatPadding();
        }

        /* renamed from: g */
        public Drawable mo2518g() {
            return this.f1984a;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f1976n = i >= 21 ? new C0512b() : i >= 17 ? new C0510a() : new C0513c();
        f1976n.mo2519g();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3185a.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources;
        int i2;
        ColorStateList valueOf;
        this.f1981j = new Rect();
        this.f1982k = new Rect();
        this.f1983l = new C0509a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3189e.CardView, i, C3188d.CardView);
        if (obtainStyledAttributes.hasValue(C3189e.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(C3189e.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1975m);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i2 = C3186b.cardview_light_background;
            } else {
                resources = getResources();
                i2 = C3186b.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i2));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C3189e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C3189e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C3189e.CardView_cardMaxElevation, 0.0f);
        this.f1977f = obtainStyledAttributes.getBoolean(C3189e.CardView_cardUseCompatPadding, false);
        this.f1978g = obtainStyledAttributes.getBoolean(C3189e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C3189e.CardView_contentPadding, 0);
        this.f1981j.left = obtainStyledAttributes.getDimensionPixelSize(C3189e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f1981j.top = obtainStyledAttributes.getDimensionPixelSize(C3189e.CardView_contentPaddingTop, dimensionPixelSize);
        this.f1981j.right = obtainStyledAttributes.getDimensionPixelSize(C3189e.CardView_contentPaddingRight, dimensionPixelSize);
        this.f1981j.bottom = obtainStyledAttributes.getDimensionPixelSize(C3189e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1979h = obtainStyledAttributes.getDimensionPixelSize(C3189e.CardView_android_minWidth, 0);
        this.f1980i = obtainStyledAttributes.getDimensionPixelSize(C3189e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f1976n.mo2523c(this.f1983l, context, colorStateList, dimension, dimension2, f);
    }

    /* renamed from: f */
    public void mo2489f(int i, int i2, int i3, int i4) {
        this.f1981j.set(i, i2, i3, i4);
        f1976n.mo2526f(this.f1983l);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1976n.mo2522b(this.f1983l);
    }

    public float getCardElevation() {
        return f1976n.mo2525e(this.f1983l);
    }

    public int getContentPaddingBottom() {
        return this.f1981j.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1981j.left;
    }

    public int getContentPaddingRight() {
        return this.f1981j.right;
    }

    public int getContentPaddingTop() {
        return this.f1981j.top;
    }

    public float getMaxCardElevation() {
        return f1976n.mo2521a(this.f1983l);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1978g;
    }

    public float getRadius() {
        return f1976n.mo2527h(this.f1983l);
    }

    public boolean getUseCompatPadding() {
        return this.f1977f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f1976n instanceof C0512b)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f1976n.mo2529j(this.f1983l)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f1976n.mo2528i(this.f1983l)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f1976n.mo2533n(this.f1983l, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1976n.mo2533n(this.f1983l, colorStateList);
    }

    public void setCardElevation(float f) {
        f1976n.mo2531l(this.f1983l, f);
    }

    public void setMaxCardElevation(float f) {
        f1976n.mo2534o(this.f1983l, f);
    }

    public void setMinimumHeight(int i) {
        this.f1980i = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f1979h = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1978g) {
            this.f1978g = z;
            f1976n.mo2532m(this.f1983l);
        }
    }

    public void setRadius(float f) {
        f1976n.mo2524d(this.f1983l, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1977f != z) {
            this.f1977f = z;
            f1976n.mo2530k(this.f1983l);
        }
    }
}
