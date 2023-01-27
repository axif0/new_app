package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.h0 */
final class C2353h0 extends C2327c {

    /* renamed from: a */
    private final String f7783a;

    /* renamed from: b */
    private final int f7784b;

    /* renamed from: c */
    private final int f7785c;

    /* renamed from: d */
    private final long f7786d;

    /* renamed from: e */
    private final long f7787e;

    /* renamed from: f */
    private final int f7788f;

    /* renamed from: g */
    private final int f7789g;

    C2353h0(String str, int i, int i2, long j, long j2, int i3, int i4) {
        if (str != null) {
            this.f7783a = str;
            this.f7784b = i;
            this.f7785c = i2;
            this.f7786d = j;
            this.f7787e = j2;
            this.f7788f = i3;
            this.f7789g = i4;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final int mo9106a() {
        return this.f7789g;
    }

    /* renamed from: d */
    public final long mo9107d() {
        return this.f7786d;
    }

    /* renamed from: e */
    public final int mo9108e() {
        return this.f7785c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2327c) {
            C2327c cVar = (C2327c) obj;
            return this.f7783a.equals(cVar.mo9109f()) && this.f7784b == cVar.mo9110g() && this.f7785c == cVar.mo9108e() && this.f7786d == cVar.mo9107d() && this.f7787e == cVar.mo9111h() && this.f7788f == cVar.mo9112i() && this.f7789g == cVar.mo9106a();
        }
    }

    /* renamed from: f */
    public final String mo9109f() {
        return this.f7783a;
    }

    /* renamed from: g */
    public final int mo9110g() {
        return this.f7784b;
    }

    /* renamed from: h */
    public final long mo9111h() {
        return this.f7787e;
    }

    public final int hashCode() {
        int hashCode = this.f7783a.hashCode();
        int i = this.f7784b;
        int i2 = this.f7785c;
        long j = this.f7786d;
        long j2 = this.f7787e;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f7788f) * 1000003) ^ this.f7789g;
    }

    /* renamed from: i */
    public final int mo9112i() {
        return this.f7788f;
    }

    public final String toString() {
        String str = this.f7783a;
        int i = this.f7784b;
        int i2 = this.f7785c;
        long j = this.f7786d;
        long j2 = this.f7787e;
        int i3 = this.f7788f;
        int i4 = this.f7789g;
        StringBuilder sb = new StringBuilder(str.length() + 217);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
