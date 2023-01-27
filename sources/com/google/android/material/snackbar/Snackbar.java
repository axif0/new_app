package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5002h;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: y */
    private static final int[] f7387y = {C4965b.snackbarButtonStyle, C4965b.snackbarTextViewStyle};

    /* renamed from: w */
    private final AccessibilityManager f7388w;

    /* renamed from: x */
    private boolean f7389x;

    public static final class SnackbarLayout extends BaseTransientBottomBar.C2239v {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    class C2241a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ View.OnClickListener f7390f;

        C2241a(View.OnClickListener onClickListener) {
            this.f7390f = onClickListener;
        }

        public void onClick(View view) {
            this.f7390f.onClick(view);
            Snackbar.this.mo8668u(1);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$b */
    public static class C2242b extends BaseTransientBottomBar.C2235r<Snackbar> {
    }

    private Snackbar(ViewGroup viewGroup, View view, C2243a aVar) {
        super(viewGroup, view, aVar);
        this.f7388w = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: X */
    private static ViewGroup m10400X(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: Y */
    private static boolean m10401Y(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f7387y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* renamed from: Z */
    public static Snackbar m10402Z(View view, CharSequence charSequence, int i) {
        ViewGroup X = m10400X(view);
        if (X != null) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(X.getContext()).inflate(m10401Y(X.getContext()) ? C5002h.mtrl_layout_snackbar_include : C5002h.design_layout_snackbar_include, X, false);
            Snackbar snackbar = new Snackbar(X, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo8712c0(charSequence);
            snackbar.mo8661L(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: G */
    public boolean mo8657G() {
        return super.mo8657G();
    }

    /* renamed from: P */
    public void mo8663P() {
        super.mo8663P();
    }

    /* renamed from: a0 */
    public Snackbar mo8710a0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f7339c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener((View.OnClickListener) null);
            this.f7389x = false;
        } else {
            this.f7389x = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new C2241a(onClickListener));
        }
        return this;
    }

    /* renamed from: b0 */
    public Snackbar mo8711b0(int i) {
        ((SnackbarContentLayout) this.f7339c.getChildAt(0)).getActionView().setTextColor(i);
        return this;
    }

    /* renamed from: c0 */
    public Snackbar mo8712c0(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f7339c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    /* renamed from: t */
    public void mo8667t() {
        super.mo8667t();
    }

    /* renamed from: w */
    public int mo8669w() {
        int w = super.mo8669w();
        if (w == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f7388w.getRecommendedTimeoutMillis(w, (this.f7389x ? 4 : 0) | 1 | 2);
        } else if (!this.f7389x || !this.f7388w.isTouchExplorationEnabled()) {
            return w;
        } else {
            return -2;
        }
    }
}
