package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0441i;
import androidx.appcompat.widget.C0457m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0588a;
import androidx.core.widget.C0612l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C2152b;
import com.google.android.material.internal.C2174c;
import com.google.android.material.internal.C2211q;
import java.util.List;
import p086f.p111h.p121l.C3349h;
import p086f.p111h.p122m.C3402s;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p253a0.C4964b;
import p148g.p189d.p190a.p252d.p254b0.C4979k;
import p148g.p189d.p190a.p252d.p254b0.C4994n;
import p148g.p189d.p190a.p252d.p255c0.C4996a;
import p148g.p189d.p190a.p252d.p256m.C5014h;
import p148g.p189d.p190a.p252d.p256m.C5017k;
import p148g.p189d.p190a.p252d.p266v.C5039a;
import p148g.p189d.p190a.p252d.p266v.C5040b;

public class FloatingActionButton extends C2211q implements C3402s, C0612l, C5039a, C4994n, CoordinatorLayout.C0547b {

    /* renamed from: g */
    private ColorStateList f7083g;

    /* renamed from: h */
    private PorterDuff.Mode f7084h;

    /* renamed from: i */
    private ColorStateList f7085i;

    /* renamed from: j */
    private PorterDuff.Mode f7086j;

    /* renamed from: k */
    private ColorStateList f7087k;

    /* renamed from: l */
    private int f7088l;

    /* renamed from: m */
    private int f7089m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f7090n;

    /* renamed from: o */
    private int f7091o;

    /* renamed from: p */
    boolean f7092p;

    /* renamed from: q */
    final Rect f7093q;

    /* renamed from: r */
    private final Rect f7094r;

    /* renamed from: s */
    private final C0457m f7095s;

    /* renamed from: t */
    private final C5040b f7096t;

    /* renamed from: u */
    private C2152b f7097u;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.C0548c<T> {

        /* renamed from: a */
        private Rect f7098a;

        /* renamed from: b */
        private C2148b f7099b;

        /* renamed from: c */
        private boolean f7100c;

        public BaseBehavior() {
            this.f7100c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5006l.FloatingActionButton_Behavior_Layout);
            this.f7100c = obtainStyledAttributes.getBoolean(C5006l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: F */
        private static boolean m10015F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0551f) {
                return ((CoordinatorLayout.C0551f) layoutParams).mo2770f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m10016G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f7093q;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0551f fVar = (CoordinatorLayout.C0551f) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    C3403t.m14620U(floatingActionButton, i);
                }
                if (i2 != 0) {
                    C3403t.m14619T(floatingActionButton, i2);
                }
            }
        }

        /* renamed from: J */
        private boolean m10017J(View view, FloatingActionButton floatingActionButton) {
            return this.f7100c && ((CoordinatorLayout.C0551f) floatingActionButton.getLayoutParams()).mo2769e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: K */
        private boolean m10018K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m10017J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f7098a == null) {
                this.f7098a = new Rect();
            }
            Rect rect = this.f7098a;
            C2174c.m10197a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo8332m(this.f7099b, false);
                return true;
            }
            floatingActionButton.mo8374t(this.f7099b, false);
            return true;
        }

        /* renamed from: L */
        private boolean m10019L(View view, FloatingActionButton floatingActionButton) {
            if (!m10017J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0551f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo8332m(this.f7099b, false);
                return true;
            }
            floatingActionButton.mo8374t(this.f7099b, false);
            return true;
        }

        /* renamed from: E */
        public boolean mo2737b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f7093q;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean mo2743h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m10018K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m10015F(view)) {
                return false;
            } else {
                m10019L(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo2747l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> r = coordinatorLayout.mo2716r(floatingActionButton);
            int size = r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = r.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m10015F(view) && m10019L(view, floatingActionButton)) {
                        break;
                    }
                } else if (m10018K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2683I(floatingActionButton, i);
            m10016G(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: g */
        public void mo2742g(CoordinatorLayout.C0551f fVar) {
            if (fVar.f2305h == 0) {
                fVar.f2305h = 80;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    class C2147a implements C2152b.C2162j {

        /* renamed from: a */
        final /* synthetic */ C2148b f7101a;

        C2147a(C2148b bVar) {
            this.f7101a = bVar;
        }

        /* renamed from: a */
        public void mo8378a() {
            this.f7101a.mo7623b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo8379b() {
            this.f7101a.mo7622a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C2148b {
        /* renamed from: a */
        public void mo7622a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo7623b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    private class C2149c implements C4964b {
        C2149c() {
        }

        /* renamed from: a */
        public void mo8380a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f7093q.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f7090n, i2 + FloatingActionButton.this.f7090n, i3 + FloatingActionButton.this.f7090n, i4 + FloatingActionButton.this.f7090n);
        }

        /* renamed from: b */
        public void mo8381b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        /* renamed from: c */
        public boolean mo8382c() {
            return FloatingActionButton.this.f7092p;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    class C2150d<T extends FloatingActionButton> implements C2152b.C2161i {

        /* renamed from: a */
        private final C5017k<T> f7104a;

        C2150d(C5017k<T> kVar) {
            this.f7104a = kVar;
        }

        /* renamed from: a */
        public void mo8383a() {
            this.f7104a.mo15048a(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo8384b() {
            this.f7104a.mo15049b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2150d) && ((C2150d) obj).f7104a.equals(this.f7104a);
        }

        public int hashCode() {
            return this.f7104a.hashCode();
        }
    }

    private C2152b getImpl() {
        if (this.f7097u == null) {
            this.f7097u = m9997h();
        }
        return this.f7097u;
    }

    /* renamed from: h */
    private C2152b m9997h() {
        return Build.VERSION.SDK_INT >= 21 ? new C2165c(this, new C2149c()) : new C2152b(this, new C2149c());
    }

    /* renamed from: k */
    private int m9998k(int i) {
        int i2 = this.f7089m;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m9998k(1) : m9998k(0);
        }
        return resources.getDimensionPixelSize(i != 1 ? C4998d.design_fab_size_normal : C4998d.design_fab_size_mini);
    }

    /* renamed from: p */
    private void m9999p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f7093q;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    private void m10000q() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f7085i;
            if (colorStateList == null) {
                C0588a.m2760c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f7086j;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0441i.m2010e(colorForState, mode));
        }
    }

    /* renamed from: r */
    private static int m10001r(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: u */
    private C2152b.C2162j m10002u(C2148b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C2147a(bVar);
    }

    /* renamed from: a */
    public boolean mo8307a() {
        this.f7096t.mo15120b();
        throw null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo8391C(getDrawableState());
    }

    /* renamed from: e */
    public void mo8309e(Animator.AnimatorListener animatorListener) {
        getImpl().mo8417d(animatorListener);
    }

    /* renamed from: f */
    public void mo8310f(Animator.AnimatorListener animatorListener) {
        getImpl().mo8418e(animatorListener);
    }

    /* renamed from: g */
    public void mo8311g(C5017k<? extends FloatingActionButton> kVar) {
        getImpl().mo8419f(new C2150d(kVar));
    }

    public ColorStateList getBackgroundTintList() {
        return this.f7083g;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f7084h;
    }

    public CoordinatorLayout.C0548c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo8421m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo8424p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo8426s();
    }

    public Drawable getContentBackground() {
        return getImpl().mo8420j();
    }

    public int getCustomSize() {
        return this.f7089m;
    }

    public int getExpandedComponentIdHint() {
        this.f7096t.mo15119a();
        throw null;
    }

    public C5014h getHideMotionSpec() {
        return getImpl().mo8423o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f7087k;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f7087k;
    }

    public C4979k getShapeAppearanceModel() {
        C4979k t = getImpl().mo8427t();
        C3349h.m14361c(t);
        return t;
    }

    public C5014h getShowMotionSpec() {
        return getImpl().mo8428u();
    }

    public int getSize() {
        return this.f7088l;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m9998k(this.f7088l);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f7085i;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f7086j;
    }

    public boolean getUseCompatPadding() {
        return this.f7092p;
    }

    @Deprecated
    /* renamed from: i */
    public boolean mo8328i(Rect rect) {
        if (!C3403t.m14614O(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m9999p(rect);
        return true;
    }

    /* renamed from: j */
    public void mo8329j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m9999p(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo8432y();
    }

    /* renamed from: l */
    public void mo8331l(C2148b bVar) {
        mo8332m(bVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo8332m(C2148b bVar, boolean z) {
        getImpl().mo8429v(m10002u(bVar), z);
    }

    /* renamed from: n */
    public boolean mo8333n() {
        return getImpl().mo8430w();
    }

    /* renamed from: o */
    public boolean mo8334o() {
        return getImpl().mo8431x();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo8433z();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo8390B();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f7090n = (sizeDimension - this.f7091o) / 2;
        getImpl().mo8415b0();
        int min = Math.min(m10001r(sizeDimension, i), m10001r(sizeDimension, i2));
        Rect rect = this.f7093q;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4996a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4996a aVar = (C4996a) parcelable;
        super.onRestoreInstanceState(aVar.mo11760a());
        C5040b bVar = this.f7096t;
        Bundle bundle = aVar.f14926h.get("expandableWidgetHelper");
        C3349h.m14361c(bundle);
        bVar.mo15121c(bundle);
        throw null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new C4996a(onSaveInstanceState);
        this.f7096t.mo15122d();
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo8328i(this.f7094r) || this.f7094r.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: s */
    public void mo8341s(C2148b bVar) {
        mo8374t(bVar, true);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f7083g != colorStateList) {
            this.f7083g = colorStateList;
            getImpl().mo8398J(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f7084h != mode) {
            this.f7084h = mode;
            getImpl().mo8399K(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo8400L(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo8403O(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo8405Q(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f7089m) {
            this.f7089m = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo8416c0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo8422n()) {
            getImpl().mo8401M(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f7096t.mo15123e(i);
        throw null;
    }

    public void setHideMotionSpec(C5014h hVar) {
        getImpl().mo8402N(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C5014h.m21214c(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo8414a0();
            if (this.f7085i != null) {
                m10000q();
            }
        }
    }

    public void setImageResource(int i) {
        this.f7095s.mo2258g(i);
        m10000q();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f7087k != colorStateList) {
            this.f7087k = colorStateList;
            getImpl().mo8406R(this.f7087k);
        }
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo8395G();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo8395G();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo8407S(z);
    }

    public void setShapeAppearanceModel(C4979k kVar) {
        getImpl().mo8408T(kVar);
    }

    public void setShowMotionSpec(C5014h hVar) {
        getImpl().mo8409U(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C5014h.m21214c(getContext(), i));
    }

    public void setSize(int i) {
        this.f7089m = 0;
        if (i != this.f7088l) {
            this.f7088l = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f7085i != colorStateList) {
            this.f7085i = colorStateList;
            m10000q();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f7086j != mode) {
            this.f7086j = mode;
            m10000q();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo8396H();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo8396H();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo8396H();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f7092p != z) {
            this.f7092p = z;
            getImpl().mo8389A();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo8374t(C2148b bVar, boolean z) {
        getImpl().mo8412Y(m10002u(bVar), z);
    }
}
