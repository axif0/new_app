package p340io.realm;

/* renamed from: io.realm.z */
public class C5823z {

    /* renamed from: a */
    private final long f16871a;

    /* renamed from: b */
    private final long f16872b;

    C5823z(long j, long j2) {
        this.f16871a = j;
        this.f16872b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5823z.class != obj.getClass()) {
            return false;
        }
        C5823z zVar = (C5823z) obj;
        return this.f16871a == zVar.f16871a && this.f16872b == zVar.f16872b;
    }

    public int hashCode() {
        long j = this.f16871a;
        long j2 = this.f16872b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Progress{transferredBytes=" + this.f16871a + ", transferableBytes=" + this.f16872b + '}';
    }
}
