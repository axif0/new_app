package p086f.p111h.p122m;

import android.view.View;
import android.view.ViewParent;

/* renamed from: f.h.m.k */
public class C3394k {

    /* renamed from: a */
    private ViewParent f10695a;

    /* renamed from: b */
    private ViewParent f10696b;

    /* renamed from: c */
    private final View f10697c;

    /* renamed from: d */
    private boolean f10698d;

    /* renamed from: e */
    private int[] f10699e;

    public C3394k(View view) {
        this.f10697c = view;
    }

    /* renamed from: g */
    private boolean m14566g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent h;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!mo11693l() || (h = m14567h(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f10697c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] i8 = m14568i();
            i8[0] = 0;
            i8[1] = 0;
            iArr3 = i8;
        } else {
            iArr3 = iArr2;
        }
        C3417w.m14726d(h, this.f10697c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f10697c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: h */
    private ViewParent m14567h(int i) {
        if (i == 0) {
            return this.f10695a;
        }
        if (i != 1) {
            return null;
        }
        return this.f10696b;
    }

    /* renamed from: i */
    private int[] m14568i() {
        if (this.f10699e == null) {
            this.f10699e = new int[2];
        }
        return this.f10699e;
    }

    /* renamed from: n */
    private void m14569n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f10695a = viewParent;
        } else if (i == 1) {
            this.f10696b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean mo11685a(float f, float f2, boolean z) {
        ViewParent h;
        if (!mo11693l() || (h = m14567h(0)) == null) {
            return false;
        }
        return C3417w.m14723a(h, this.f10697c, f, f2, z);
    }

    /* renamed from: b */
    public boolean mo11686b(float f, float f2) {
        ViewParent h;
        if (!mo11693l() || (h = m14567h(0)) == null) {
            return false;
        }
        return C3417w.m14724b(h, this.f10697c, f, f2);
    }

    /* renamed from: c */
    public boolean mo11687c(int i, int i2, int[] iArr, int[] iArr2) {
        return mo11688d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean mo11688d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent h;
        int i4;
        int i5;
        if (!mo11693l() || (h = m14567h(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f10697c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                iArr = m14568i();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C3417w.m14725c(h, this.f10697c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f10697c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: e */
    public void mo11689e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m14566g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean mo11690f(int i, int i2, int i3, int i4, int[] iArr) {
        return m14566g(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: j */
    public boolean mo11691j() {
        return mo11692k(0);
    }

    /* renamed from: k */
    public boolean mo11692k(int i) {
        return m14567h(i) != null;
    }

    /* renamed from: l */
    public boolean mo11693l() {
        return this.f10698d;
    }

    /* renamed from: m */
    public void mo11694m(boolean z) {
        if (this.f10698d) {
            C3403t.m14677z0(this.f10697c);
        }
        this.f10698d = z;
    }

    /* renamed from: o */
    public boolean mo11695o(int i) {
        return mo11696p(i, 0);
    }

    /* renamed from: p */
    public boolean mo11696p(int i, int i2) {
        if (mo11692k(i2)) {
            return true;
        }
        if (!mo11693l()) {
            return false;
        }
        View view = this.f10697c;
        for (ViewParent parent = this.f10697c.getParent(); parent != null; parent = parent.getParent()) {
            if (C3417w.m14728f(parent, view, this.f10697c, i, i2)) {
                m14569n(i2, parent);
                C3417w.m14727e(parent, view, this.f10697c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void mo11697q() {
        mo11698r(0);
    }

    /* renamed from: r */
    public void mo11698r(int i) {
        ViewParent h = m14567h(i);
        if (h != null) {
            C3417w.m14729g(h, this.f10697c, i);
            m14569n(i, (ViewParent) null);
        }
    }
}
