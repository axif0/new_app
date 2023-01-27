package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p086f.p087a.C3132j;
import p086f.p111h.p114f.C3287a;

/* renamed from: androidx.appcompat.widget.p0 */
public class C0469p0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1833a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1834b = {-16842910};

    /* renamed from: c */
    static final int[] f1835c = {16842908};

    /* renamed from: d */
    static final int[] f1836d = {16842919};

    /* renamed from: e */
    static final int[] f1837e = {16842912};

    /* renamed from: f */
    static final int[] f1838f = new int[0];

    /* renamed from: g */
    private static final int[] f1839g = new int[1];

    /* renamed from: a */
    public static void m2126a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C3132j.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(C3132j.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m2127b(Context context, int i) {
        ColorStateList e = m2130e(context, i);
        if (e != null && e.isStateful()) {
            return e.getColorForState(f1834b, e.getDefaultColor());
        }
        TypedValue f = m2131f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return m2129d(context, i, f.getFloat());
    }

    /* renamed from: c */
    public static int m2128c(Context context, int i) {
        int[] iArr = f1839g;
        iArr[0] = i;
        C0479u0 u = C0479u0.m2147u(context, (AttributeSet) null, iArr);
        try {
            return u.mo2344b(0, 0);
        } finally {
            u.mo2362w();
        }
    }

    /* renamed from: d */
    static int m2129d(Context context, int i, float f) {
        int c = m2128c(context, i);
        return C3287a.m14162d(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: e */
    public static ColorStateList m2130e(Context context, int i) {
        int[] iArr = f1839g;
        iArr[0] = i;
        C0479u0 u = C0479u0.m2147u(context, (AttributeSet) null, iArr);
        try {
            return u.mo2345c(0);
        } finally {
            u.mo2362w();
        }
    }

    /* renamed from: f */
    private static TypedValue m2131f() {
        TypedValue typedValue = f1833a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1833a.set(typedValue2);
        return typedValue2;
    }
}
