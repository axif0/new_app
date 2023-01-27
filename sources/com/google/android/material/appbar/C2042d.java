package com.google.android.material.appbar;

import android.view.View;
import p086f.p111h.p122m.C3403t;

/* renamed from: com.google.android.material.appbar.d */
class C2042d {

    /* renamed from: a */
    private final View f6638a;

    /* renamed from: b */
    private int f6639b;

    /* renamed from: c */
    private int f6640c;

    /* renamed from: d */
    private int f6641d;

    /* renamed from: e */
    private int f6642e;

    /* renamed from: f */
    private boolean f6643f = true;

    /* renamed from: g */
    private boolean f6644g = true;

    public C2042d(View view) {
        this.f6638a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7581a() {
        View view = this.f6638a;
        C3403t.m14620U(view, this.f6641d - (view.getTop() - this.f6639b));
        View view2 = this.f6638a;
        C3403t.m14619T(view2, this.f6642e - (view2.getLeft() - this.f6640c));
    }

    /* renamed from: b */
    public int mo7582b() {
        return this.f6641d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7583c() {
        this.f6639b = this.f6638a.getTop();
        this.f6640c = this.f6638a.getLeft();
    }

    /* renamed from: d */
    public boolean mo7584d(int i) {
        if (!this.f6644g || this.f6642e == i) {
            return false;
        }
        this.f6642e = i;
        mo7581a();
        return true;
    }

    /* renamed from: e */
    public boolean mo7585e(int i) {
        if (!this.f6643f || this.f6641d == i) {
            return false;
        }
        this.f6641d = i;
        mo7581a();
        return true;
    }
}
