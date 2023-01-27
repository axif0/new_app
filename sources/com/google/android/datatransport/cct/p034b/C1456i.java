package com.google.android.datatransport.cct.p034b;

/* renamed from: com.google.android.datatransport.cct.b.i */
final class C1456i extends C1473t {

    /* renamed from: a */
    private final long f4984a;

    C1456i(long j) {
        this.f4984a = j;
    }

    /* renamed from: a */
    public long mo6096a() {
        return this.f4984a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1473t) && this.f4984a == ((C1473t) obj).mo6096a();
    }

    public int hashCode() {
        long j = this.f4984a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f4984a + "}";
    }
}
