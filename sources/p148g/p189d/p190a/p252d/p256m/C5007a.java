package p148g.p189d.p190a.p252d.p256m;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p086f.p132m.p133a.p134a.C3453a;
import p086f.p132m.p133a.p134a.C3454b;
import p086f.p132m.p133a.p134a.C3455c;

/* renamed from: g.d.a.d.m.a */
public class C5007a {

    /* renamed from: a */
    public static final TimeInterpolator f14947a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f14948b = new C3454b();

    /* renamed from: c */
    public static final TimeInterpolator f14949c = new C3453a();

    /* renamed from: d */
    public static final TimeInterpolator f14950d = new C3455c();

    /* renamed from: e */
    public static final TimeInterpolator f14951e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m21200a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static int m21201b(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
