package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import p086f.p111h.p122m.C3356b0;
import p086f.p111h.p122m.C3399p;
import p086f.p111h.p122m.C3403t;

/* renamed from: com.google.android.material.internal.p */
public class C2206p {

    /* renamed from: com.google.android.material.internal.p$a */
    static class C2207a implements C3399p {

        /* renamed from: a */
        final /* synthetic */ C2209c f7313a;

        /* renamed from: b */
        final /* synthetic */ C2210d f7314b;

        C2207a(C2209c cVar, C2210d dVar) {
            this.f7313a = cVar;
            this.f7314b = dVar;
        }

        /* renamed from: a */
        public C3356b0 mo923a(View view, C3356b0 b0Var) {
            this.f7313a.mo7672a(view, b0Var, new C2210d(this.f7314b));
            return b0Var;
        }
    }

    /* renamed from: com.google.android.material.internal.p$b */
    static class C2208b implements View.OnAttachStateChangeListener {
        C2208b() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C3403t.m14637f0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.p$c */
    public interface C2209c {
        /* renamed from: a */
        C3356b0 mo7672a(View view, C3356b0 b0Var, C2210d dVar);
    }

    /* renamed from: com.google.android.material.internal.p$d */
    public static class C2210d {

        /* renamed from: a */
        public int f7315a;

        /* renamed from: b */
        public int f7316b;

        /* renamed from: c */
        public int f7317c;

        /* renamed from: d */
        public int f7318d;

        public C2210d(int i, int i2, int i3, int i4) {
            this.f7315a = i;
            this.f7316b = i2;
            this.f7317c = i3;
            this.f7318d = i4;
        }

        public C2210d(C2210d dVar) {
            this.f7315a = dVar.f7315a;
            this.f7316b = dVar.f7316b;
            this.f7317c = dVar.f7317c;
            this.f7318d = dVar.f7318d;
        }
    }

    /* renamed from: a */
    public static void m10307a(View view, C2209c cVar) {
        C3403t.m14667u0(view, new C2207a(cVar, new C2210d(C3403t.m14603D(view), view.getPaddingTop(), C3403t.m14602C(view), view.getPaddingBottom())));
        m10312f(view);
    }

    /* renamed from: b */
    public static float m10308b(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static float m10309c(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C3403t.m14664t((View) parent);
        }
        return f;
    }

    /* renamed from: d */
    public static boolean m10310d(View view) {
        return C3403t.m14674y(view) == 1;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m10311e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: f */
    public static void m10312f(View view) {
        if (C3403t.m14613N(view)) {
            C3403t.m14637f0(view);
        } else {
            view.addOnAttachStateChangeListener(new C2208b());
        }
    }
}
