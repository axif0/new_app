package com.github.vipulasri.timelineview.p031d.p032d;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import p086f.p111h.p112e.C3267a;
import p351k.p361v.p363d.C5956g;

/* renamed from: com.github.vipulasri.timelineview.d.d.a */
public final class C1434a {
    /* renamed from: a */
    private static final int m7106a(float f, Resources resources) {
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    /* renamed from: b */
    public static final int m7107b(Resources resources, float f) {
        C5956g.m24500e(resources, "resources");
        return m7106a(f, resources);
    }

    /* renamed from: c */
    public static final int m7108c(Context context, int i) {
        C5956g.m24500e(context, "context");
        return C3267a.m14074d(context, i);
    }
}
