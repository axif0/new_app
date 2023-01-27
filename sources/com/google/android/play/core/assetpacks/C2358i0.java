package com.google.android.play.core.assetpacks;

import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.i0 */
final class C2358i0 extends C2332d {

    /* renamed from: a */
    private final long f7798a;

    /* renamed from: b */
    private final Map<String, C2327c> f7799b;

    C2358i0(long j, Map<String, C2327c> map) {
        this.f7798a = j;
        this.f7799b = map;
    }

    /* renamed from: e */
    public final Map<String, C2327c> mo9136e() {
        return this.f7799b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2332d) {
            C2332d dVar = (C2332d) obj;
            return this.f7798a == dVar.mo9137f() && this.f7799b.equals(dVar.mo9136e());
        }
    }

    /* renamed from: f */
    public final long mo9137f() {
        return this.f7798a;
    }

    public final int hashCode() {
        long j = this.f7798a;
        return this.f7799b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f7798a;
        String valueOf = String.valueOf(this.f7799b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
