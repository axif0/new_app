package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0607h;
import p086f.p087a.C3132j;

/* renamed from: androidx.appcompat.widget.p */
class C0468p extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1831b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a */
    private boolean f1832a;

    public C0468p(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m2124a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m2124a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0479u0 v = C0479u0.m2148v(context, attributeSet, C3132j.PopupWindow, i, i2);
        if (v.mo2361s(C3132j.PopupWindow_overlapAnchor)) {
            m2125b(v.mo2343a(C3132j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(v.mo2349g(C3132j.PopupWindow_android_popupBackground));
        v.mo2362w();
    }

    /* renamed from: b */
    private void m2125b(boolean z) {
        if (f1831b) {
            this.f1832a = z;
        } else {
            C0607h.m2884a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1831b && this.f1832a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1831b && this.f1832a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1831b && this.f1832a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
