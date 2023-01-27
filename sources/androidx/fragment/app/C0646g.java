package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import p086f.p131l.C3452c;

/* renamed from: androidx.fragment.app.g */
public final class C0646g extends FrameLayout {

    /* renamed from: f */
    private ArrayList<View> f2724f;

    /* renamed from: g */
    private ArrayList<View> f2725g;

    /* renamed from: h */
    private boolean f2726h = true;

    C0646g(Context context, AttributeSet attributeSet, C0653m mVar) {
        super(context, attributeSet);
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3452c.FragmentContainerView);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C3452c.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(C3452c.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment W = mVar.mo3425W(id);
        if (classAttribute != null && W == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = BuildConfig.FLAVOR;
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = mVar.mo3433e0().mo3375a(context.getClassLoader(), classAttribute);
            a.mo3133B0(context, attributeSet, (Bundle) null);
            C0675u i = mVar.mo3440i();
            i.mo3571t(true);
            i.mo3563d(this, a, string);
            i.mo3265l();
        }
    }

    /* renamed from: a */
    private void m3205a(View view) {
        ArrayList<View> arrayList;
        if (view.getAnimation() != null || ((arrayList = this.f2725g) != null && arrayList.contains(view))) {
            if (this.f2724f == null) {
                this.f2724f = new ArrayList<>();
            }
            this.f2724f.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (C0653m.m3282k0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (C0653m.m3282k0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f2726h && this.f2724f != null) {
            for (int i = 0; i < this.f2724f.size(); i++) {
                super.drawChild(canvas, this.f2724f.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f2726h || (arrayList = this.f2724f) == null || arrayList.size() <= 0 || !this.f2724f.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f2725g;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f2724f;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2726h = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m3205a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m3205a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        m3205a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        m3205a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        m3205a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m3205a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m3205a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    /* access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f2726h = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2725g == null) {
                this.f2725g = new ArrayList<>();
            }
            this.f2725g.add(view);
        }
        super.startViewTransition(view);
    }
}
