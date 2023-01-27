package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.p7 */
final /* synthetic */ class C1905p7 implements Runnable {

    /* renamed from: f */
    private final C1917q7 f6161f;

    /* renamed from: g */
    private final int f6162g;

    /* renamed from: h */
    private final Exception f6163h;

    /* renamed from: i */
    private final byte[] f6164i;

    /* renamed from: j */
    private final Map f6165j;

    C1905p7(C1917q7 q7Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f6161f = q7Var;
        this.f6162g = i;
        this.f6163h = exc;
        this.f6164i = bArr;
        this.f6165j = map;
    }

    public final void run() {
        this.f6161f.mo7311a(this.f6162g, this.f6163h, this.f6164i, this.f6165j);
    }
}
