package com.google.android.material.theme.p040a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p086f.p087a.p094o.C3158d;
import p148g.p189d.p190a.p252d.C4965b;

/* renamed from: com.google.android.material.theme.a.a */
public class C2306a {

    /* renamed from: a */
    private static final int[] f7675a = {16842752, C4965b.theme};

    /* renamed from: b */
    private static final int[] f7676b = {C4965b.materialThemeOverlay};

    /* renamed from: a */
    private static int m10747a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7675a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    private static int m10748b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7676b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m10749c(Context context, AttributeSet attributeSet, int i, int i2) {
        int b = m10748b(context, attributeSet, i, i2);
        boolean z = (context instanceof C3158d) && ((C3158d) context).mo10914c() == b;
        if (b == 0 || z) {
            return context;
        }
        C3158d dVar = new C3158d(context, b);
        int a = m10747a(context, attributeSet);
        if (a != 0) {
            dVar.getTheme().applyStyle(a, true);
        }
        return dVar;
    }
}
