package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p269y.C5045b;
import p148g.p189d.p190a.p252d.p269y.C5046c;

/* renamed from: com.google.android.material.datepicker.c */
final class C2101c {

    /* renamed from: a */
    final C2100b f6965a;

    /* renamed from: b */
    final C2100b f6966b;

    /* renamed from: c */
    final C2100b f6967c;

    /* renamed from: d */
    final C2100b f6968d;

    /* renamed from: e */
    final C2100b f6969e;

    /* renamed from: f */
    final C2100b f6970f;

    /* renamed from: g */
    final C2100b f6971g;

    /* renamed from: h */
    final Paint f6972h;

    C2101c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C5045b.m21333c(context, C4965b.materialCalendarStyle, C2107h.class.getCanonicalName()), C5006l.MaterialCalendar);
        this.f6965a = C2100b.m9820a(context, obtainStyledAttributes.getResourceId(C5006l.MaterialCalendar_dayStyle, 0));
        this.f6971g = C2100b.m9820a(context, obtainStyledAttributes.getResourceId(C5006l.MaterialCalendar_dayInvalidStyle, 0));
        this.f6966b = C2100b.m9820a(context, obtainStyledAttributes.getResourceId(C5006l.MaterialCalendar_daySelectedStyle, 0));
        this.f6967c = C2100b.m9820a(context, obtainStyledAttributes.getResourceId(C5006l.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a = C5046c.m21335a(context, obtainStyledAttributes, C5006l.MaterialCalendar_rangeFillColor);
        this.f6968d = C2100b.m9820a(context, obtainStyledAttributes.getResourceId(C5006l.MaterialCalendar_yearStyle, 0));
        this.f6969e = C2100b.m9820a(context, obtainStyledAttributes.getResourceId(C5006l.MaterialCalendar_yearSelectedStyle, 0));
        this.f6970f = C2100b.m9820a(context, obtainStyledAttributes.getResourceId(C5006l.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f6972h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
