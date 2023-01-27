package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.q */
final class C1909q implements Iterator<String> {

    /* renamed from: f */
    private Iterator<String> f6178f = this.f6179g.f6072f.keySet().iterator();

    /* renamed from: g */
    private final /* synthetic */ C1873n f6179g;

    C1909q(C1873n nVar) {
        this.f6179g = nVar;
    }

    public final boolean hasNext() {
        return this.f6178f.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f6178f.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
