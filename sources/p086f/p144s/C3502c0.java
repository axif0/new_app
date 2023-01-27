package p086f.p144s;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import p086f.p111h.p122m.C3403t;

/* renamed from: f.s.c0 */
class C3502c0 {

    /* renamed from: a */
    private static final C3522i0 f10930a;

    /* renamed from: b */
    static final Property<View, Float> f10931b = new C3503a(Float.class, "translationAlpha");

    /* renamed from: f.s.c0$a */
    static class C3503a extends Property<View, Float> {
        C3503a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C3502c0.m15038c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C3502c0.m15042g(view, f.floatValue());
        }
    }

    /* renamed from: f.s.c0$b */
    static class C3504b extends Property<View, Rect> {
        C3504b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C3403t.m14660r(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            C3403t.m14655o0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f10930a = i >= 29 ? new C3520h0() : i >= 23 ? new C3518g0() : i >= 22 ? new C3516f0() : i >= 21 ? new C3514e0() : i >= 19 ? new C3508d0() : new C3522i0();
        new C3504b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    static void m15036a(View view) {
        f10930a.mo11921a(view);
    }

    /* renamed from: b */
    static C3489b0 m15037b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C3487a0(view) : C3557z.m15258e(view);
    }

    /* renamed from: c */
    static float m15038c(View view) {
        return f10930a.mo11922c(view);
    }

    /* renamed from: d */
    static C3539m0 m15039d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C3531l0(view) : new C3529k0(view.getWindowToken());
    }

    /* renamed from: e */
    static void m15040e(View view) {
        f10930a.mo11923d(view);
    }

    /* renamed from: f */
    static void m15041f(View view, int i, int i2, int i3, int i4) {
        f10930a.mo11928e(view, i, i2, i3, i4);
    }

    /* renamed from: g */
    static void m15042g(View view, float f) {
        f10930a.mo11924f(view, f);
    }

    /* renamed from: h */
    static void m15043h(View view, int i) {
        f10930a.mo11930g(view, i);
    }

    /* renamed from: i */
    static void m15044i(View view, Matrix matrix) {
        f10930a.mo11926h(view, matrix);
    }

    /* renamed from: j */
    static void m15045j(View view, Matrix matrix) {
        f10930a.mo11927i(view, matrix);
    }
}
