package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.c */
class C2041c<V extends View> extends CoordinatorLayout.C0548c<V> {

    /* renamed from: a */
    private C2042d f6635a;

    /* renamed from: b */
    private int f6636b = 0;

    /* renamed from: c */
    private int f6637c = 0;

    public C2041c() {
    }

    public C2041c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: E */
    public int mo7579E() {
        C2042d dVar = this.f6635a;
        if (dVar != null) {
            return dVar.mo7582b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo7573F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo2683I(v, i);
    }

    /* renamed from: G */
    public boolean mo7580G(int i) {
        C2042d dVar = this.f6635a;
        if (dVar != null) {
            return dVar.mo7585e(i);
        }
        this.f6636b = i;
        return false;
    }

    /* renamed from: l */
    public boolean mo2747l(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo7573F(coordinatorLayout, v, i);
        if (this.f6635a == null) {
            this.f6635a = new C2042d(v);
        }
        this.f6635a.mo7583c();
        this.f6635a.mo7581a();
        int i2 = this.f6636b;
        if (i2 != 0) {
            this.f6635a.mo7585e(i2);
            this.f6636b = 0;
        }
        int i3 = this.f6637c;
        if (i3 == 0) {
            return true;
        }
        this.f6635a.mo7584d(i3);
        this.f6637c = 0;
        return true;
    }
}
