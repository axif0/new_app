package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.e */
class C2103e {
    /* renamed from: a */
    static String m9832a(long j) {
        return m9833b(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m9833b(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? C2139s.m9947b(locale).format(new Date(j)) : C2139s.m9951f(locale).format(new Date(j));
    }

    /* renamed from: c */
    static String m9834c(long j) {
        return m9835d(j, Locale.getDefault());
    }

    /* renamed from: d */
    static String m9835d(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? C2139s.m9959n(locale).format(new Date(j)) : C2139s.m9951f(locale).format(new Date(j));
    }
}
