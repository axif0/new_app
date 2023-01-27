package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.view.menu.C0339i;
import androidx.appcompat.widget.C0479u0;
import com.google.android.material.internal.C2173b;
import com.google.android.material.internal.C2178g;
import com.google.android.material.internal.C2179h;
import com.google.android.material.internal.C2195k;
import com.google.android.material.internal.C2205o;
import com.google.android.material.theme.p040a.C2306a;
import p086f.p087a.C3123a;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p087a.p094o.C3162g;
import p086f.p111h.p112e.C3267a;
import p086f.p111h.p122m.C3356b0;
import p086f.p111h.p122m.C3403t;
import p086f.p126j.p127a.C3430a;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4976h;
import p148g.p189d.p190a.p252d.p254b0.C4979k;
import p148g.p189d.p190a.p252d.p269y.C5046c;

public class NavigationView extends C2195k {

    /* renamed from: r */
    private static final int[] f7320r = {16842912};

    /* renamed from: s */
    private static final int[] f7321s = {-16842910};

    /* renamed from: t */
    private static final int f7322t = C5005k.Widget_Design_NavigationView;

    /* renamed from: k */
    private final C2178g f7323k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C2179h f7324l;

    /* renamed from: m */
    C2214c f7325m;

    /* renamed from: n */
    private final int f7326n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final int[] f7327o;

    /* renamed from: p */
    private MenuInflater f7328p;

    /* renamed from: q */
    private ViewTreeObserver.OnGlobalLayoutListener f7329q;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    class C2212a implements C0335g.C0336a {
        C2212a() {
        }

        /* renamed from: a */
        public boolean mo904a(C0335g gVar, MenuItem menuItem) {
            C2214c cVar = NavigationView.this.f7325m;
            return cVar != null && cVar.mo335a(menuItem);
        }

        /* renamed from: b */
        public void mo906b(C0335g gVar) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    class C2213b implements ViewTreeObserver.OnGlobalLayoutListener {
        C2213b() {
        }

        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f7327o);
            boolean z = true;
            boolean z2 = NavigationView.this.f7327o[1] == 0;
            NavigationView.this.f7324l.mo8563z(z2);
            NavigationView.this.setDrawTopInsetForeground(z2);
            Activity a = C2173b.m10196a(NavigationView.this.getContext());
            if (a != null && Build.VERSION.SDK_INT >= 21) {
                boolean z3 = a.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
                boolean z4 = Color.alpha(a.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView2 = NavigationView.this;
                if (!z3 || !z4) {
                    z = false;
                }
                navigationView2.setDrawBottomInsetForeground(z);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    public interface C2214c {
        /* renamed from: a */
        boolean mo335a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$d */
    public static class C2215d extends C3430a {
        public static final Parcelable.Creator<C2215d> CREATOR = new C2216a();

        /* renamed from: h */
        public Bundle f7332h;

        /* renamed from: com.google.android.material.navigation.NavigationView$d$a */
        static class C2216a implements Parcelable.ClassLoaderCreator<C2215d> {
            C2216a() {
            }

            /* renamed from: a */
            public C2215d createFromParcel(Parcel parcel) {
                return new C2215d(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C2215d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2215d(parcel, classLoader);
            }

            /* renamed from: c */
            public C2215d[] newArray(int i) {
                return new C2215d[i];
            }
        }

        public C2215d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7332h = parcel.readBundle(classLoader);
        }

        public C2215d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f7332h);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4965b.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(C2306a.m10749c(context, attributeSet, i, f7322t), attributeSet, i);
        boolean z;
        int i2;
        this.f7324l = new C2179h();
        this.f7327o = new int[2];
        Context context2 = getContext();
        this.f7323k = new C2178g(context2);
        C0479u0 i3 = C2205o.m10306i(context2, attributeSet, C5006l.NavigationView, i, f7322t, new int[0]);
        if (i3.mo2361s(C5006l.NavigationView_android_background)) {
            C3403t.m14649l0(this, i3.mo2349g(C5006l.NavigationView_android_background));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Drawable background = getBackground();
            C4972g gVar = new C4972g();
            if (background instanceof ColorDrawable) {
                gVar.mo14926X(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            gVar.mo14920N(context2);
            C3403t.m14649l0(this, gVar);
        }
        if (i3.mo2361s(C5006l.NavigationView_elevation)) {
            setElevation((float) i3.mo2348f(C5006l.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(i3.mo2343a(C5006l.NavigationView_android_fitsSystemWindows, false));
        this.f7326n = i3.mo2348f(C5006l.NavigationView_android_maxWidth, 0);
        ColorStateList c = i3.mo2361s(C5006l.NavigationView_itemIconTint) ? i3.mo2345c(C5006l.NavigationView_itemIconTint) : m10318d(16842808);
        if (i3.mo2361s(C5006l.NavigationView_itemTextAppearance)) {
            i2 = i3.mo2356n(C5006l.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            i2 = 0;
            z = false;
        }
        if (i3.mo2361s(C5006l.NavigationView_itemIconSize)) {
            setItemIconSize(i3.mo2348f(C5006l.NavigationView_itemIconSize, 0));
        }
        ColorStateList c2 = i3.mo2361s(C5006l.NavigationView_itemTextColor) ? i3.mo2345c(C5006l.NavigationView_itemTextColor) : null;
        if (!z && c2 == null) {
            c2 = m10318d(16842806);
        }
        Drawable g = i3.mo2349g(C5006l.NavigationView_itemBackground);
        if (g == null && m10320g(i3)) {
            g = m10319e(i3);
        }
        if (i3.mo2361s(C5006l.NavigationView_itemHorizontalPadding)) {
            this.f7324l.mo8541D(i3.mo2348f(C5006l.NavigationView_itemHorizontalPadding, 0));
        }
        int f = i3.mo2348f(C5006l.NavigationView_itemIconPadding, 0);
        setItemMaxLines(i3.mo2353k(C5006l.NavigationView_itemMaxLines, 1));
        this.f7323k.mo1214V(new C2212a());
        this.f7324l.mo8539B(1);
        this.f7324l.mo1133g(context2, this.f7323k);
        this.f7324l.mo8544G(c);
        this.f7324l.mo8548K(getOverScrollMode());
        if (z) {
            this.f7324l.mo8546I(i2);
        }
        this.f7324l.mo8547J(c2);
        this.f7324l.mo8540C(g);
        this.f7324l.mo8542E(f);
        this.f7323k.mo1229b(this.f7324l);
        addView((View) this.f7324l.mo8561x(this));
        if (i3.mo2361s(C5006l.NavigationView_menu)) {
            mo8626i(i3.mo2356n(C5006l.NavigationView_menu, 0));
        }
        if (i3.mo2361s(C5006l.NavigationView_headerLayout)) {
            mo8625h(i3.mo2356n(C5006l.NavigationView_headerLayout, 0));
        }
        i3.mo2362w();
        m10321j();
    }

    /* renamed from: d */
    private ColorStateList m10318d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList c = C3133a.m13387c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C3123a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = c.getDefaultColor();
        return new ColorStateList(new int[][]{f7321s, f7320r, FrameLayout.EMPTY_STATE_SET}, new int[]{c.getColorForState(f7321s, defaultColor), i2, defaultColor});
    }

    /* renamed from: e */
    private final Drawable m10319e(C0479u0 u0Var) {
        C4972g gVar = new C4972g(C4979k.m21073b(getContext(), u0Var.mo2356n(C5006l.NavigationView_itemShapeAppearance, 0), u0Var.mo2356n(C5006l.NavigationView_itemShapeAppearanceOverlay, 0)).mo14980m());
        gVar.mo14926X(C5046c.m21336b(getContext(), u0Var, C5006l.NavigationView_itemShapeFillColor));
        return new InsetDrawable(gVar, u0Var.mo2348f(C5006l.NavigationView_itemShapeInsetStart, 0), u0Var.mo2348f(C5006l.NavigationView_itemShapeInsetTop, 0), u0Var.mo2348f(C5006l.NavigationView_itemShapeInsetEnd, 0), u0Var.mo2348f(C5006l.NavigationView_itemShapeInsetBottom, 0));
    }

    /* renamed from: g */
    private boolean m10320g(C0479u0 u0Var) {
        return u0Var.mo2361s(C5006l.NavigationView_itemShapeAppearance) || u0Var.mo2361s(C5006l.NavigationView_itemShapeAppearanceOverlay);
    }

    private MenuInflater getMenuInflater() {
        if (this.f7328p == null) {
            this.f7328p = new C3162g(getContext());
        }
        return this.f7328p;
    }

    /* renamed from: j */
    private void m10321j() {
        this.f7329q = new C2213b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f7329q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8586a(C3356b0 b0Var) {
        this.f7324l.mo8551d(b0Var);
    }

    /* renamed from: f */
    public View mo8615f(int i) {
        return this.f7324l.mo8554q(i);
    }

    public MenuItem getCheckedItem() {
        return this.f7324l.mo8552e();
    }

    public int getHeaderCount() {
        return this.f7324l.mo8553i();
    }

    public Drawable getItemBackground() {
        return this.f7324l.mo8555r();
    }

    public int getItemHorizontalPadding() {
        return this.f7324l.mo8556s();
    }

    public int getItemIconPadding() {
        return this.f7324l.mo8557t();
    }

    public ColorStateList getItemIconTintList() {
        return this.f7324l.mo8560w();
    }

    public int getItemMaxLines() {
        return this.f7324l.mo8558u();
    }

    public ColorStateList getItemTextColor() {
        return this.f7324l.mo8559v();
    }

    public Menu getMenu() {
        return this.f7323k;
    }

    /* renamed from: h */
    public View mo8625h(int i) {
        return this.f7324l.mo8562y(i);
    }

    /* renamed from: i */
    public void mo8626i(int i) {
        this.f7324l.mo8549L(true);
        getMenuInflater().inflate(i, this.f7323k);
        this.f7324l.mo8549L(false);
        this.f7324l.mo1136k(false);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4976h.m21068e(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.f7329q);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f7329q);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = this.f7326n;
            }
            super.onMeasure(i, i2);
        }
        i3 = Math.min(View.MeasureSpec.getSize(i), this.f7326n);
        i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2215d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2215d dVar = (C2215d) parcelable;
        super.onRestoreInstanceState(dVar.mo11760a());
        this.f7323k.mo1211S(dVar.f7332h);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C2215d dVar = new C2215d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f7332h = bundle;
        this.f7323k.mo1213U(bundle);
        return dVar;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f7323k.findItem(i);
        if (findItem != null) {
            this.f7324l.mo8538A((C0339i) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f7323k.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f7324l.mo8538A((C0339i) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C4976h.m21067d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f7324l.mo8540C(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C3267a.m14076f(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.f7324l.mo8541D(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f7324l.mo8541D(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.f7324l.mo8542E(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f7324l.mo8542E(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.f7324l.mo8543F(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f7324l.mo8544G(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f7324l.mo8545H(i);
    }

    public void setItemTextAppearance(int i) {
        this.f7324l.mo8546I(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f7324l.mo8547J(colorStateList);
    }

    public void setNavigationItemSelectedListener(C2214c cVar) {
        this.f7325m = cVar;
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C2179h hVar = this.f7324l;
        if (hVar != null) {
            hVar.mo8548K(i);
        }
    }
}
