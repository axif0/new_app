package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1658o;

/* renamed from: com.google.android.gms.measurement.internal.o */
final class C1885o {

    /* renamed from: a */
    final String f6090a;

    /* renamed from: b */
    final String f6091b;

    /* renamed from: c */
    final long f6092c;

    /* renamed from: d */
    final long f6093d;

    /* renamed from: e */
    final long f6094e;

    /* renamed from: f */
    final long f6095f;

    /* renamed from: g */
    final long f6096g;

    /* renamed from: h */
    final Long f6097h;

    /* renamed from: i */
    final Long f6098i;

    /* renamed from: j */
    final Long f6099j;

    /* renamed from: k */
    final Boolean f6100k;

    C1885o(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C1658o.m7841f(str);
        C1658o.m7841f(str2);
        boolean z = true;
        C1658o.m7836a(j6 >= 0);
        C1658o.m7836a(j7 >= 0);
        C1658o.m7836a(j8 >= 0);
        C1658o.m7836a(j9 < 0 ? false : z);
        this.f6090a = str;
        this.f6091b = str2;
        this.f6092c = j6;
        this.f6093d = j7;
        this.f6094e = j8;
        this.f6095f = j4;
        this.f6096g = j9;
        this.f6097h = l;
        this.f6098i = l2;
        this.f6099j = l3;
        this.f6100k = bool;
    }

    C1885o(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, 0, 0, 0, j3, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1885o mo7262a(long j) {
        return new C1885o(this.f6090a, this.f6091b, this.f6092c, this.f6093d, this.f6094e, j, this.f6096g, this.f6097h, this.f6098i, this.f6099j, this.f6100k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1885o mo7263b(long j, long j2) {
        return new C1885o(this.f6090a, this.f6091b, this.f6092c, this.f6093d, this.f6094e, this.f6095f, j, Long.valueOf(j2), this.f6098i, this.f6099j, this.f6100k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C1885o mo7264c(Long l, Long l2, Boolean bool) {
        return new C1885o(this.f6090a, this.f6091b, this.f6092c, this.f6093d, this.f6094e, this.f6095f, this.f6096g, this.f6097h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
