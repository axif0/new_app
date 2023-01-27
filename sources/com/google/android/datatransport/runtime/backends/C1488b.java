package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.C1494g;

/* renamed from: com.google.android.datatransport.runtime.backends.b */
final class C1488b extends C1494g {

    /* renamed from: a */
    private final C1494g.C1495a f5053a;

    /* renamed from: b */
    private final long f5054b;

    C1488b(C1494g.C1495a aVar, long j) {
        if (aVar != null) {
            this.f5053a = aVar;
            this.f5054b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: b */
    public long mo6126b() {
        return this.f5054b;
    }

    /* renamed from: c */
    public C1494g.C1495a mo6127c() {
        return this.f5053a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1494g)) {
            return false;
        }
        C1494g gVar = (C1494g) obj;
        return this.f5053a.equals(gVar.mo6127c()) && this.f5054b == gVar.mo6126b();
    }

    public int hashCode() {
        long j = this.f5054b;
        return ((this.f5053a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f5053a + ", nextRequestWaitMillis=" + this.f5054b + "}";
    }
}
