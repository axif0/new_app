package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0479u0;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5006l;

/* renamed from: com.google.android.material.internal.o */
public final class C2205o {

    /* renamed from: a */
    private static final int[] f7311a = {C4965b.colorPrimary};

    /* renamed from: b */
    private static final int[] f7312b = {C4965b.colorPrimaryVariant};

    /* renamed from: a */
    public static void m10298a(Context context) {
        m10302e(context, f7311a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m10299b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5006l.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C5006l.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C4965b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m10300c(context);
            }
        }
        m10298a(context);
    }

    /* renamed from: c */
    public static void m10300c(Context context) {
        m10302e(context, f7312b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m10301d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5006l.ThemeEnforcement, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C5006l.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C5006l.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m10303f(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m10302e(Context context, int[] iArr, String str) {
        if (!m10304g(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: f */
    private static boolean m10303f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    private static boolean m10304g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m10305h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m10299b(context, attributeSet, i, i2);
        m10301d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: i */
    public static C0479u0 m10306i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m10299b(context, attributeSet, i, i2);
        m10301d(context, attributeSet, iArr, i, i2, iArr2);
        return C0479u0.m2148v(context, attributeSet, iArr, i, i2);
    }
}
