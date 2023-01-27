package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p335h.p336a.C5599b;
import p349j.p350a.C5825a;

/* renamed from: com.google.android.datatransport.runtime.backends.l */
public final class C1501l implements C5599b<C1499k> {

    /* renamed from: a */
    private final C5825a<Context> f5074a;

    /* renamed from: b */
    private final C5825a<C1497i> f5075b;

    public C1501l(C5825a<Context> aVar, C5825a<C1497i> aVar2) {
        this.f5074a = aVar;
        this.f5075b = aVar2;
    }

    /* renamed from: a */
    public static C1501l m7280a(C5825a<Context> aVar, C5825a<C1497i> aVar2) {
        return new C1501l(aVar, aVar2);
    }

    /* renamed from: b */
    public C1499k get() {
        return new C1499k(this.f5074a.get(), this.f5075b.get());
    }
}
