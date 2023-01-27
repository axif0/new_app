package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.p266v.C5039a;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.C0548c<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f7677a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class C2307a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f */
        final /* synthetic */ View f7678f;

        /* renamed from: g */
        final /* synthetic */ int f7679g;

        /* renamed from: h */
        final /* synthetic */ C5039a f7680h;

        C2307a(View view, int i, C5039a aVar) {
            this.f7678f = view;
            this.f7679g = i;
            this.f7680h = aVar;
        }

        public boolean onPreDraw() {
            this.f7678f.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f7677a == this.f7679g) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                C5039a aVar = this.f7680h;
                expandableBehavior.mo9079H((View) aVar, this.f7678f, aVar.mo8307a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: F */
    private boolean m10751F(boolean z) {
        if (!z) {
            return this.f7677a == 1;
        }
        int i = this.f7677a;
        return i == 0 || i == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public C5039a mo9078G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r = coordinatorLayout.mo2716r(view);
        int size = r.size();
        for (int i = 0; i < size; i++) {
            View view2 = r.get(i);
            if (mo2740e(coordinatorLayout, view, view2)) {
                return (C5039a) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract boolean mo9079H(View view, View view2, boolean z, boolean z2);

    /* renamed from: h */
    public boolean mo2743h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C5039a aVar = (C5039a) view2;
        if (!m10751F(aVar.mo8307a())) {
            return false;
        }
        this.f7677a = aVar.mo8307a() ? 1 : 2;
        return mo9079H((View) aVar, view, aVar.mo8307a(), true);
    }

    /* renamed from: l */
    public boolean mo2747l(CoordinatorLayout coordinatorLayout, View view, int i) {
        C5039a G;
        if (C3403t.m14614O(view) || (G = mo9078G(coordinatorLayout, view)) == null || !m10751F(G.mo8307a())) {
            return false;
        }
        int i2 = G.mo8307a() ? 1 : 2;
        this.f7677a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new C2307a(view, i2, G));
        return false;
    }
}
