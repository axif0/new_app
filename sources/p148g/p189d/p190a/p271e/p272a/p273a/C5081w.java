package p148g.p189d.p190a.p271e.p272a.p273a;

import android.app.PendingIntent;

/* renamed from: g.d.a.e.a.a.w */
final class C5081w extends C5056a {

    /* renamed from: a */
    private final String f15103a;

    /* renamed from: b */
    private final int f15104b;

    /* renamed from: c */
    private final int f15105c;

    /* renamed from: d */
    private final int f15106d;

    /* renamed from: e */
    private final Integer f15107e;

    /* renamed from: f */
    private final int f15108f;

    /* renamed from: g */
    private final long f15109g;

    /* renamed from: h */
    private final long f15110h;

    /* renamed from: i */
    private final long f15111i;

    /* renamed from: j */
    private final long f15112j;

    /* renamed from: k */
    private final PendingIntent f15113k;

    /* renamed from: l */
    private final PendingIntent f15114l;

    /* renamed from: m */
    private final PendingIntent f15115m;

    /* renamed from: n */
    private final PendingIntent f15116n;

    C5081w(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        String str2 = str;
        if (str2 != null) {
            this.f15103a = str2;
            this.f15104b = i;
            this.f15105c = i2;
            this.f15106d = i3;
            this.f15107e = num;
            this.f15108f = i4;
            this.f15109g = j;
            this.f15110h = j2;
            this.f15111i = j3;
            this.f15112j = j4;
            this.f15113k = pendingIntent;
            this.f15114l = pendingIntent2;
            this.f15115m = pendingIntent3;
            this.f15116n = pendingIntent4;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo15147a() {
        return this.f15111i;
    }

    /* renamed from: d */
    public final int mo15149d() {
        return this.f15104b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo15150e() {
        return this.f15112j;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5056a) {
            C5056a aVar = (C5056a) obj;
            if (this.f15103a.equals(aVar.mo15160p()) && this.f15104b == aVar.mo15149d() && this.f15105c == aVar.mo15162r() && this.f15106d == aVar.mo15157m() && ((num = this.f15107e) != null ? num.equals(aVar.mo15153i()) : aVar.mo15153i() == null) && this.f15108f == aVar.mo15163s() && this.f15109g == aVar.mo15151g() && this.f15110h == aVar.mo15161q() && this.f15111i == aVar.mo15147a() && this.f15112j == aVar.mo15150e() && ((pendingIntent = this.f15113k) != null ? pendingIntent.equals(aVar.mo15152h()) : aVar.mo15152h() == null) && ((pendingIntent2 = this.f15114l) != null ? pendingIntent2.equals(aVar.mo15154j()) : aVar.mo15154j() == null) && ((pendingIntent3 = this.f15115m) != null ? pendingIntent3.equals(aVar.mo15155k()) : aVar.mo15155k() == null)) {
                PendingIntent pendingIntent4 = this.f15116n;
                PendingIntent l = aVar.mo15156l();
                if (pendingIntent4 != null ? pendingIntent4.equals(l) : l == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public final long mo15151g() {
        return this.f15109g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final PendingIntent mo15152h() {
        return this.f15113k;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f15103a.hashCode() ^ 1000003) * 1000003) ^ this.f15104b) * 1000003) ^ this.f15105c) * 1000003) ^ this.f15106d) * 1000003;
        Integer num = this.f15107e;
        int i = 0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i2 = this.f15108f;
        long j = this.f15109g;
        long j2 = this.f15110h;
        long j3 = this.f15111i;
        long j4 = this.f15112j;
        int i3 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        PendingIntent pendingIntent = this.f15113k;
        int hashCode3 = (i3 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.f15114l;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 1000003;
        PendingIntent pendingIntent3 = this.f15115m;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 1000003;
        PendingIntent pendingIntent4 = this.f15116n;
        if (pendingIntent4 != null) {
            i = pendingIntent4.hashCode();
        }
        return hashCode5 ^ i;
    }

    /* renamed from: i */
    public final Integer mo15153i() {
        return this.f15107e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final PendingIntent mo15154j() {
        return this.f15114l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final PendingIntent mo15155k() {
        return this.f15115m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final PendingIntent mo15156l() {
        return this.f15116n;
    }

    /* renamed from: m */
    public final int mo15157m() {
        return this.f15106d;
    }

    /* renamed from: p */
    public final String mo15160p() {
        return this.f15103a;
    }

    /* renamed from: q */
    public final long mo15161q() {
        return this.f15110h;
    }

    /* renamed from: r */
    public final int mo15162r() {
        return this.f15105c;
    }

    /* renamed from: s */
    public final int mo15163s() {
        return this.f15108f;
    }

    public final String toString() {
        String str = this.f15103a;
        int i = this.f15104b;
        int i2 = this.f15105c;
        int i3 = this.f15106d;
        String valueOf = String.valueOf(this.f15107e);
        int i4 = this.f15108f;
        long j = this.f15109g;
        long j2 = this.f15110h;
        long j3 = this.f15111i;
        long j4 = this.f15112j;
        String valueOf2 = String.valueOf(this.f15113k);
        long j5 = j4;
        String valueOf3 = String.valueOf(this.f15114l);
        String valueOf4 = String.valueOf(this.f15115m);
        long j6 = j3;
        String valueOf5 = String.valueOf(this.f15116n);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i);
        sb.append(", updateAvailability=");
        sb.append(i2);
        sb.append(", installStatus=");
        sb.append(i3);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", additionalSpaceRequired=");
        sb.append(j6);
        sb.append(", assetPackStorageSize=");
        sb.append(j5);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf2);
        sb.append(", flexibleUpdateIntent=");
        sb.append(valueOf3);
        sb.append(", immediateDestructiveUpdateIntent=");
        sb.append(valueOf4);
        sb.append(", flexibleDestructiveUpdateIntent=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
