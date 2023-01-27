package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: com.google.android.material.datepicker.l */
final class C2128l implements Comparable<C2128l>, Parcelable {
    public static final Parcelable.Creator<C2128l> CREATOR = new C2129a();

    /* renamed from: f */
    private final Calendar f7039f;

    /* renamed from: g */
    private final String f7040g = C2139s.m9960o().format(this.f7039f.getTime());

    /* renamed from: h */
    final int f7041h;

    /* renamed from: i */
    final int f7042i = this.f7039f.get(1);

    /* renamed from: j */
    final int f7043j = this.f7039f.getMaximum(7);

    /* renamed from: k */
    final int f7044k = this.f7039f.getActualMaximum(5);

    /* renamed from: l */
    final long f7045l = this.f7039f.getTimeInMillis();

    /* renamed from: com.google.android.material.datepicker.l$a */
    static class C2129a implements Parcelable.Creator<C2128l> {
        C2129a() {
        }

        /* renamed from: a */
        public C2128l createFromParcel(Parcel parcel) {
            return C2128l.m9906g(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public C2128l[] newArray(int i) {
            return new C2128l[i];
        }
    }

    private C2128l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d = C2139s.m9949d(calendar);
        this.f7039f = d;
        this.f7041h = d.get(2);
    }

    /* renamed from: g */
    static C2128l m9906g(int i, int i2) {
        Calendar l = C2139s.m9957l();
        l.set(1, i);
        l.set(2, i2);
        return new C2128l(l);
    }

    /* renamed from: h */
    static C2128l m9907h(long j) {
        Calendar l = C2139s.m9957l();
        l.setTimeInMillis(j);
        return new C2128l(l);
    }

    /* renamed from: i */
    static C2128l m9908i() {
        return new C2128l(C2139s.m9955j());
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int compareTo(C2128l lVar) {
        return this.f7039f.compareTo(lVar.f7039f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2128l)) {
            return false;
        }
        C2128l lVar = (C2128l) obj;
        return this.f7041h == lVar.f7041h && this.f7042i == lVar.f7042i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7041h), Integer.valueOf(this.f7042i)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo8237j() {
        int firstDayOfWeek = this.f7039f.get(7) - this.f7039f.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f7043j : firstDayOfWeek;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public long mo8238k(int i) {
        Calendar d = C2139s.m9949d(this.f7039f);
        d.set(5, i);
        return d.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public String mo8239l() {
        return this.f7040g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public long mo8240m() {
        return this.f7039f.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C2128l mo8241n(int i) {
        Calendar d = C2139s.m9949d(this.f7039f);
        d.add(2, i);
        return new C2128l(d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo8242o(C2128l lVar) {
        if (this.f7039f instanceof GregorianCalendar) {
            return ((lVar.f7042i - this.f7042i) * 12) + (lVar.f7041h - this.f7041h);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7042i);
        parcel.writeInt(this.f7041h);
    }
}
