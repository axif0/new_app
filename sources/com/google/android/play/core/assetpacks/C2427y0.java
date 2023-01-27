package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.y0 */
final class C2427y0 {

    /* renamed from: a */
    private final Map<String, Double> f8050a = new HashMap();

    C2427y0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized double mo9265a(String str, C2388o1 o1Var) {
        double d;
        double d2 = (double) ((C2399r0) o1Var).f7936g;
        Double.isNaN(d2);
        double d3 = d2 + 1.0d;
        double d4 = (double) ((C2399r0) o1Var).f7937h;
        Double.isNaN(d4);
        d = d3 / d4;
        this.f8050a.put(str, Double.valueOf(d));
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo9266b(String str) {
        this.f8050a.put(str, Double.valueOf(0.0d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized double mo9267c(String str) {
        Double d = this.f8050a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }
}
