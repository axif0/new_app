package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1547a;
import com.google.android.gms.common.api.C1547a.C1551d;
import com.google.android.gms.common.internal.C1655n;

/* renamed from: com.google.android.gms.common.api.internal.d0 */
public final class C1580d0<O extends C1547a.C1551d> {

    /* renamed from: a */
    private final boolean f5384a;

    /* renamed from: b */
    private final int f5385b;

    /* renamed from: c */
    private final C1547a<O> f5386c;

    /* renamed from: d */
    private final O f5387d;

    /* renamed from: a */
    public final String mo6409a() {
        return this.f5386c.mo6323a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1580d0)) {
            return false;
        }
        C1580d0 d0Var = (C1580d0) obj;
        return !this.f5384a && !d0Var.f5384a && C1655n.m7832a(this.f5386c, d0Var.f5386c) && C1655n.m7832a(this.f5387d, d0Var.f5387d);
    }

    public final int hashCode() {
        return this.f5385b;
    }
}
