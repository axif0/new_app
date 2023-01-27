package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.theme.p040a.C2306a;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p269y.C5045b;
import p148g.p189d.p190a.p252d.p269y.C5046c;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C2306a.m10749c(context, attributeSet, i, i2), attributeSet, i);
        int h;
        Context context2 = getContext();
        if (m10738g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (!m10741j(context2, theme, attributeSet, i, i2) && (h = m10739h(theme, attributeSet, i, i2)) != -1) {
                m10737f(theme, h);
            }
        }
    }

    /* renamed from: f */
    private void m10737f(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C5006l.MaterialTextAppearance);
        int i2 = m10740i(getContext(), obtainStyledAttributes, C5006l.MaterialTextAppearance_android_lineHeight, C5006l.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (i2 >= 0) {
            setLineHeight(i2);
        }
    }

    /* renamed from: g */
    private static boolean m10738g(Context context) {
        return C5045b.m21332b(context, C4965b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: h */
    private static int m10739h(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C5006l.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C5006l.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: i */
    private static int m10740i(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C5046c.m21337c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: j */
    private static boolean m10741j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C5006l.MaterialTextView, i, i2);
        int i3 = m10740i(context, obtainStyledAttributes, C5006l.MaterialTextView_android_lineHeight, C5006l.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return i3 != -1;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m10738g(context)) {
            m10737f(context.getTheme(), i);
        }
    }
}
