package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p086f.p103f.p107b.p108k.C3238k;

/* renamed from: androidx.constraintlayout.widget.l */
public abstract class C0545l extends C0528c {

    /* renamed from: m */
    private boolean f2269m;

    /* renamed from: n */
    private boolean f2270n;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2615g(AttributeSet attributeSet) {
        super.mo2615g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0544k.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0544k.ConstraintLayout_Layout_android_visibility) {
                    this.f2269m = true;
                } else if (index == C0544k.ConstraintLayout_Layout_android_elevation) {
                    this.f2270n = true;
                }
            }
        }
    }

    /* renamed from: n */
    public void mo2677n(C3238k kVar, int i, int i2) {
    }

    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f2269m || this.f2270n) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.f2130g; i++) {
                View g = constraintLayout.mo2579g(this.f2129f[i]);
                if (g != null) {
                    if (this.f2269m) {
                        g.setVisibility(visibility);
                    }
                    if (this.f2270n && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        g.setTranslationZ(g.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo2625c();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo2625c();
    }
}
