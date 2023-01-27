package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.theme.p040a.C2306a;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4976h;

public class MaterialToolbar extends Toolbar {

    /* renamed from: U */
    private static final int f6620U = C5005k.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4965b.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C2306a.m10749c(context, attributeSet, i, f6620U), attributeSet, i);
        m9288P(getContext());
    }

    /* renamed from: P */
    private void m9288P(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C4972g gVar = new C4972g();
            gVar.mo14926X(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.mo14920N(context);
            gVar.mo14925W(C3403t.m14664t(this));
            C3403t.m14649l0(this, gVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4976h.m21068e(this);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C4976h.m21067d(this, f);
    }
}
