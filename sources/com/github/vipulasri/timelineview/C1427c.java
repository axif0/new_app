package com.github.vipulasri.timelineview;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: com.github.vipulasri.timelineview.c */
class C1427c {
    /* renamed from: a */
    public static int m7062a(float f, Context context) {
        return m7063b(f, context.getResources());
    }

    /* renamed from: b */
    private static int m7063b(float f, Resources resources) {
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }
}
