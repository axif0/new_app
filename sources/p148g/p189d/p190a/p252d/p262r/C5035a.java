package p148g.p189d.p190a.p252d.p262r;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p086f.p111h.p114f.C3287a;
import p148g.p189d.p190a.p252d.p269y.C5045b;

/* renamed from: g.d.a.d.r.a */
public class C5035a {
    /* renamed from: a */
    public static int m21303a(Context context, int i, int i2) {
        TypedValue a = C5045b.m21331a(context, i);
        return a != null ? a.data : i2;
    }

    /* renamed from: b */
    public static int m21304b(Context context, int i, String str) {
        return C5045b.m21333c(context, i, str);
    }

    /* renamed from: c */
    public static int m21305c(View view, int i) {
        return C5045b.m21334d(view, i);
    }

    /* renamed from: d */
    public static int m21306d(View view, int i, int i2) {
        return m21303a(view.getContext(), i, i2);
    }

    /* renamed from: e */
    public static int m21307e(int i, int i2) {
        return C3287a.m14160b(i2, i);
    }

    /* renamed from: f */
    public static int m21308f(int i, int i2, float f) {
        return m21307e(i, C3287a.m14162d(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    /* renamed from: g */
    public static int m21309g(View view, int i, int i2, float f) {
        return m21308f(m21305c(view, i), m21305c(view, i2), f);
    }
}
