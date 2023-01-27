package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1658o;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.l4 */
final class C1854l4 implements Runnable {

    /* renamed from: f */
    private final C1818i4 f5987f;

    /* renamed from: g */
    private final int f5988g;

    /* renamed from: h */
    private final Throwable f5989h;

    /* renamed from: i */
    private final byte[] f5990i;

    /* renamed from: j */
    private final String f5991j;

    /* renamed from: k */
    private final Map<String, List<String>> f5992k;

    private C1854l4(String str, C1818i4 i4Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C1658o.m7845j(i4Var);
        this.f5987f = i4Var;
        this.f5988g = i;
        this.f5989h = th;
        this.f5990i = bArr;
        this.f5991j = str;
        this.f5992k = map;
    }

    public final void run() {
        this.f5987f.mo7120a(this.f5991j, this.f5988g, this.f5989h, this.f5990i, this.f5992k);
    }
}
