package com.google.android.gms.common.api;

import p148g.p189d.p190a.p232c.p237d.C4370d;

/* renamed from: com.google.android.gms.common.api.l */
public final class C1608l extends UnsupportedOperationException {

    /* renamed from: f */
    private final C4370d f5423f;

    public C1608l(C4370d dVar) {
        this.f5423f = dVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f5423f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
