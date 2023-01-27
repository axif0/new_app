package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.r */
class C2138r {

    /* renamed from: c */
    private static final C2138r f7060c = new C2138r((Long) null, (TimeZone) null);

    /* renamed from: a */
    private final Long f7061a;

    /* renamed from: b */
    private final TimeZone f7062b;

    private C2138r(Long l, TimeZone timeZone) {
        this.f7061a = l;
        this.f7062b = timeZone;
    }

    /* renamed from: c */
    static C2138r m9943c() {
        return f7060c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Calendar mo8270a() {
        return mo8271b(this.f7062b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Calendar mo8271b(TimeZone timeZone) {
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f7061a;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        return instance;
    }
}
