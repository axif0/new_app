package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.s */
class C2139s {

    /* renamed from: a */
    static AtomicReference<C2138r> f7063a = new AtomicReference<>();

    /* renamed from: a */
    static long m9946a(long j) {
        Calendar l = m9957l();
        l.setTimeInMillis(j);
        return m9949d(l).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: b */
    static DateFormat m9947b(Locale locale) {
        return m9948c("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    private static DateFormat m9948c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m9956k());
        return instanceForSkeleton;
    }

    /* renamed from: d */
    static Calendar m9949d(Calendar calendar) {
        Calendar m = m9958m(calendar);
        Calendar l = m9957l();
        l.set(m.get(1), m.get(2), m.get(5));
        return l;
    }

    /* renamed from: e */
    private static java.text.DateFormat m9950e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m9954i());
        return dateInstance;
    }

    /* renamed from: f */
    static java.text.DateFormat m9951f(Locale locale) {
        return m9950e(0, locale);
    }

    /* renamed from: g */
    private static SimpleDateFormat m9952g(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(m9954i());
        return simpleDateFormat;
    }

    /* renamed from: h */
    static C2138r m9953h() {
        C2138r rVar = f7063a.get();
        return rVar == null ? C2138r.m9943c() : rVar;
    }

    /* renamed from: i */
    private static TimeZone m9954i() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: j */
    static Calendar m9955j() {
        Calendar a = m9953h().mo8270a();
        a.set(11, 0);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        a.setTimeZone(m9954i());
        return a;
    }

    @TargetApi(24)
    /* renamed from: k */
    private static android.icu.util.TimeZone m9956k() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: l */
    static Calendar m9957l() {
        return m9958m((Calendar) null);
    }

    /* renamed from: m */
    static Calendar m9958m(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m9954i());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    /* renamed from: n */
    static DateFormat m9959n(Locale locale) {
        return m9948c("yMMMEd", locale);
    }

    /* renamed from: o */
    static SimpleDateFormat m9960o() {
        return m9961p(Locale.getDefault());
    }

    /* renamed from: p */
    private static SimpleDateFormat m9961p(Locale locale) {
        return m9952g("LLLL, yyyy", locale);
    }
}
