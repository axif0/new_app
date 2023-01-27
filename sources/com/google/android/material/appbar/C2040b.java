package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p086f.p111h.p117h.C3306a;
import p086f.p111h.p122m.C3356b0;
import p086f.p111h.p122m.C3386d;
import p086f.p111h.p122m.C3403t;

/* renamed from: com.google.android.material.appbar.b */
abstract class C2040b extends C2041c<View> {

    /* renamed from: d */
    final Rect f6631d = new Rect();

    /* renamed from: e */
    final Rect f6632e = new Rect();

    /* renamed from: f */
    private int f6633f = 0;

    /* renamed from: g */
    private int f6634g;

    public C2040b() {
    }

    public C2040b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: N */
    private static int m9301N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo7573F(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View H = mo7558H(coordinatorLayout.mo2716r(view));
        if (H != null) {
            CoordinatorLayout.C0551f fVar = (CoordinatorLayout.C0551f) view.getLayoutParams();
            Rect rect = this.f6631d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, H.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            C3356b0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C3403t.m14668v(coordinatorLayout) && !C3403t.m14668v(view)) {
                rect.left += lastWindowInsets.mo11563f();
                rect.right -= lastWindowInsets.mo11564g();
            }
            Rect rect2 = this.f6632e;
            C3386d.m14543a(m9301N(fVar.f2300c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int I = mo7574I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            i2 = rect2.top - H.getBottom();
        } else {
            super.mo7573F(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f6633f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract View mo7558H(List<View> list);

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final int mo7574I(View view) {
        if (this.f6634g == 0) {
            return 0;
        }
        float J = mo7559J(view);
        int i = this.f6634g;
        return C3306a.m14255b((int) (J * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public abstract float mo7559J(View view);

    /* renamed from: K */
    public final int mo7575K() {
        return this.f6634g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo7560L(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final int mo7576M() {
        return this.f6633f;
    }

    /* renamed from: O */
    public final void mo7577O(int i) {
        this.f6634g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public boolean mo7578P() {
        return false;
    }

    /* renamed from: m */
    public boolean mo2748m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View H;
        C3356b0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (H = mo7558H(coordinatorLayout.mo2716r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C3403t.m14668v(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo11565h() + lastWindowInsets.mo11561e();
        }
        int L = size + mo7560L(H);
        int measuredHeight = H.getMeasuredHeight();
        if (mo7578P()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            L -= measuredHeight;
        }
        coordinatorLayout.mo2684J(view, i, i2, View.MeasureSpec.makeMeasureSpec(L, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }
}
