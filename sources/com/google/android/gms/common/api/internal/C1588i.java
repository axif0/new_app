package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1558b;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p148g.p189d.p190a.p232c.p251i.C4941i;

/* renamed from: com.google.android.gms.common.api.internal.i */
public final class C1588i {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f5395a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<C4941i<?>, Boolean> f5396b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    private final void m7637a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f5395a) {
            hashMap = new HashMap(this.f5395a);
        }
        synchronized (this.f5396b) {
            hashMap2 = new HashMap(this.f5396b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo6357h(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C4941i) entry2.getKey()).mo14886d(new C1558b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo6423b() {
        return !this.f5395a.isEmpty() || !this.f5396b.isEmpty();
    }

    /* renamed from: c */
    public final void mo6424c() {
        m7637a(false, C1572b.f5340r);
    }

    /* renamed from: d */
    public final void mo6425d() {
        m7637a(true, C1605z.f5422a);
    }
}
