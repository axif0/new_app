package p148g.p189d.p289c.p291y;

import java.math.BigDecimal;

/* renamed from: g.d.c.y.g */
public final class C5277g extends Number {

    /* renamed from: f */
    private final String f15343f;

    public C5277g(String str) {
        this.f15343f = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.f15343f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5277g)) {
            return false;
        }
        String str = this.f15343f;
        String str2 = ((C5277g) obj).f15343f;
        return str == str2 || str.equals(str2);
    }

    public float floatValue() {
        return Float.parseFloat(this.f15343f);
    }

    public int hashCode() {
        return this.f15343f.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f15343f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f15343f).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f15343f     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f15343f     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f15343f
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p289c.p291y.C5277g.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f15343f);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f15343f).longValue();
        }
    }

    public String toString() {
        return this.f15343f;
    }
}
