package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import p086f.p111h.p121l.C3349h;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4979k;
import p148g.p189d.p190a.p252d.p269y.C5046c;

/* renamed from: com.google.android.material.datepicker.b */
final class C2100b {

    /* renamed from: a */
    private final Rect f6959a;

    /* renamed from: b */
    private final ColorStateList f6960b;

    /* renamed from: c */
    private final ColorStateList f6961c;

    /* renamed from: d */
    private final ColorStateList f6962d;

    /* renamed from: e */
    private final int f6963e;

    /* renamed from: f */
    private final C4979k f6964f;

    private C2100b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C4979k kVar, Rect rect) {
        C3349h.m14360b(rect.left);
        C3349h.m14360b(rect.top);
        C3349h.m14360b(rect.right);
        C3349h.m14360b(rect.bottom);
        this.f6959a = rect;
        this.f6960b = colorStateList2;
        this.f6961c = colorStateList;
        this.f6962d = colorStateList3;
        this.f6963e = i;
        this.f6964f = kVar;
    }

    /* renamed from: a */
    static C2100b m9820a(Context context, int i) {
        C3349h.m14359a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C5006l.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C5006l.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C5006l.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C5006l.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C5006l.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a = C5046c.m21335a(context, obtainStyledAttributes, C5006l.MaterialCalendarItem_itemFillColor);
        ColorStateList a2 = C5046c.m21335a(context, obtainStyledAttributes, C5006l.MaterialCalendarItem_itemTextColor);
        ColorStateList a3 = C5046c.m21335a(context, obtainStyledAttributes, C5006l.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C5006l.MaterialCalendarItem_itemStrokeWidth, 0);
        C4979k m = C4979k.m21073b(context, obtainStyledAttributes.getResourceId(C5006l.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C5006l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).mo14980m();
        obtainStyledAttributes.recycle();
        return new C2100b(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo8188b() {
        return this.f6959a.bottom;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo8189c() {
        return this.f6959a.top;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8190d(TextView textView) {
        C4972g gVar = new C4972g();
        C4972g gVar2 = new C4972g();
        gVar.setShapeAppearanceModel(this.f6964f);
        gVar2.setShapeAppearanceModel(this.f6964f);
        gVar.mo14926X(this.f6961c);
        gVar.mo14934f0((float) this.f6963e, this.f6962d);
        textView.setTextColor(this.f6960b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f6960b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f6959a;
        C3403t.m14649l0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
