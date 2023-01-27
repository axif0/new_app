package com.google.android.datatransport.cct.p034b;

import java.util.List;

/* renamed from: com.google.android.datatransport.cct.b.e */
final class C1446e extends C1460k {

    /* renamed from: a */
    private final List<C1470r> f4951a;

    C1446e(List<C1470r> list) {
        if (list != null) {
            this.f4951a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    /* renamed from: b */
    public List<C1470r> mo6049b() {
        return this.f4951a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1460k) {
            return this.f4951a.equals(((C1460k) obj).mo6049b());
        }
        return false;
    }

    public int hashCode() {
        return this.f4951a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f4951a + "}";
    }
}
