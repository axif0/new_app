package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.a */
public final class C2096a implements Parcelable {
    public static final Parcelable.Creator<C2096a> CREATOR = new C2097a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2128l f6947f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2128l f6948g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2128l f6949h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2099c f6950i;

    /* renamed from: j */
    private final int f6951j;

    /* renamed from: k */
    private final int f6952k;

    /* renamed from: com.google.android.material.datepicker.a$a */
    static class C2097a implements Parcelable.Creator<C2096a> {
        C2097a() {
        }

        /* renamed from: a */
        public C2096a createFromParcel(Parcel parcel) {
            return new C2096a((C2128l) parcel.readParcelable(C2128l.class.getClassLoader()), (C2128l) parcel.readParcelable(C2128l.class.getClassLoader()), (C2128l) parcel.readParcelable(C2128l.class.getClassLoader()), (C2099c) parcel.readParcelable(C2099c.class.getClassLoader()), (C2097a) null);
        }

        /* renamed from: b */
        public C2096a[] newArray(int i) {
            return new C2096a[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    public static final class C2098b {

        /* renamed from: e */
        static final long f6953e = C2139s.m9946a(C2128l.m9906g(1900, 0).f7045l);

        /* renamed from: f */
        static final long f6954f = C2139s.m9946a(C2128l.m9906g(2100, 11).f7045l);

        /* renamed from: a */
        private long f6955a = f6953e;

        /* renamed from: b */
        private long f6956b = f6954f;

        /* renamed from: c */
        private Long f6957c;

        /* renamed from: d */
        private C2099c f6958d = C2104f.m9836a(Long.MIN_VALUE);

        C2098b(C2096a aVar) {
            this.f6955a = aVar.f6947f.f7045l;
            this.f6956b = aVar.f6948g.f7045l;
            this.f6957c = Long.valueOf(aVar.f6949h.f7045l);
            this.f6958d = aVar.f6950i;
        }

        /* renamed from: a */
        public C2096a mo8185a() {
            if (this.f6957c == null) {
                long o2 = C2120i.m9888o2();
                if (this.f6955a > o2 || o2 > this.f6956b) {
                    o2 = this.f6955a;
                }
                this.f6957c = Long.valueOf(o2);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f6958d);
            return new C2096a(C2128l.m9907h(this.f6955a), C2128l.m9907h(this.f6956b), C2128l.m9907h(this.f6957c.longValue()), (C2099c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), (C2097a) null);
        }

        /* renamed from: b */
        public C2098b mo8186b(long j) {
            this.f6957c = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    public interface C2099c extends Parcelable {
        /* renamed from: u */
        boolean mo8187u(long j);
    }

    private C2096a(C2128l lVar, C2128l lVar2, C2128l lVar3, C2099c cVar) {
        this.f6947f = lVar;
        this.f6948g = lVar2;
        this.f6949h = lVar3;
        this.f6950i = cVar;
        if (lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (lVar3.compareTo(lVar2) <= 0) {
            this.f6952k = lVar.mo8242o(lVar2) + 1;
            this.f6951j = (lVar2.f7042i - lVar.f7042i) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    /* synthetic */ C2096a(C2128l lVar, C2128l lVar2, C2128l lVar3, C2099c cVar, C2097a aVar) {
        this(lVar, lVar2, lVar3, cVar);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C2128l mo8171e(C2128l lVar) {
        return lVar.compareTo(this.f6947f) < 0 ? this.f6947f : lVar.compareTo(this.f6948g) > 0 ? this.f6948g : lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2096a)) {
            return false;
        }
        C2096a aVar = (C2096a) obj;
        return this.f6947f.equals(aVar.f6947f) && this.f6948g.equals(aVar.f6948g) && this.f6949h.equals(aVar.f6949h) && this.f6950i.equals(aVar.f6950i);
    }

    /* renamed from: f */
    public C2099c mo8173f() {
        return this.f6950i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2128l mo8174g() {
        return this.f6948g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo8175h() {
        return this.f6952k;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6947f, this.f6948g, this.f6949h, this.f6950i});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C2128l mo8177i() {
        return this.f6949h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C2128l mo8178j() {
        return this.f6947f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo8179k() {
        return this.f6951j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6947f, 0);
        parcel.writeParcelable(this.f6948g, 0);
        parcel.writeParcelable(this.f6949h, 0);
        parcel.writeParcelable(this.f6950i, 0);
    }
}
