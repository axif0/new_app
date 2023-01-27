package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.f */
public final class C1583f<L> {

    /* renamed from: a */
    private final L f5393a;

    /* renamed from: b */
    private final String f5394b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1583f)) {
            return false;
        }
        C1583f fVar = (C1583f) obj;
        return this.f5393a == fVar.f5393a && this.f5394b.equals(fVar.f5394b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f5393a) * 31) + this.f5394b.hashCode();
    }
}
