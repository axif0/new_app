package p148g.p189d.p190a.p271e.p272a.p274b;

/* renamed from: g.d.a.e.a.b.d */
final class C5088d extends C5086b {

    /* renamed from: a */
    private final int f15122a;

    /* renamed from: b */
    private final long f15123b;

    /* renamed from: c */
    private final long f15124c;

    /* renamed from: d */
    private final int f15125d;

    /* renamed from: e */
    private final String f15126e;

    C5088d(int i, long j, long j2, int i2, String str) {
        this.f15122a = i;
        this.f15123b = j;
        this.f15124c = j2;
        this.f15125d = i2;
        if (str != null) {
            this.f15126e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: b */
    public final long mo15191b() {
        return this.f15123b;
    }

    /* renamed from: c */
    public final int mo15192c() {
        return this.f15125d;
    }

    /* renamed from: d */
    public final int mo15193d() {
        return this.f15122a;
    }

    /* renamed from: e */
    public final String mo15194e() {
        return this.f15126e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5086b) {
            C5086b bVar = (C5086b) obj;
            return this.f15122a == bVar.mo15193d() && this.f15123b == bVar.mo15191b() && this.f15124c == bVar.mo15195f() && this.f15125d == bVar.mo15192c() && this.f15126e.equals(bVar.mo15194e());
        }
    }

    /* renamed from: f */
    public final long mo15195f() {
        return this.f15124c;
    }

    public final int hashCode() {
        int i = this.f15122a;
        long j = this.f15123b;
        long j2 = this.f15124c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f15125d) * 1000003) ^ this.f15126e.hashCode();
    }

    public final String toString() {
        int i = this.f15122a;
        long j = this.f15123b;
        long j2 = this.f15124c;
        int i2 = this.f15125d;
        String str = this.f15126e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
