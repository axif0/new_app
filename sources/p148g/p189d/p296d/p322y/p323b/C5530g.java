package p148g.p189d.p296d.p322y.p323b;

/* renamed from: g.d.d.y.b.g */
final class C5530g {

    /* renamed from: c */
    private static final int[][] f15981c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    private final C5529f f15982a;

    /* renamed from: b */
    private final byte f15983b;

    private C5530g(int i) {
        this.f15982a = C5529f.m22851e((i >> 3) & 3);
        this.f15983b = (byte) (i & 7);
    }

    /* renamed from: a */
    static C5530g m22852a(int i, int i2) {
        C5530g b = m22853b(i, i2);
        return b != null ? b : m22853b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    private static C5530g m22853b(int i, int i2) {
        int e;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr : f15981c) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new C5530g(iArr[1]);
            }
            int e2 = m22854e(i, i5);
            if (e2 < i3) {
                i4 = iArr[1];
                i3 = e2;
            }
            if (i != i2 && (e = m22854e(i2, i5)) < i3) {
                i4 = iArr[1];
                i3 = e;
            }
        }
        if (i3 <= 3) {
            return new C5530g(i4);
        }
        return null;
    }

    /* renamed from: e */
    static int m22854e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte mo15922c() {
        return this.f15983b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C5529f mo15923d() {
        return this.f15982a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5530g)) {
            return false;
        }
        C5530g gVar = (C5530g) obj;
        return this.f15982a == gVar.f15982a && this.f15983b == gVar.f15983b;
    }

    public int hashCode() {
        return (this.f15982a.ordinal() << 3) | this.f15983b;
    }
}
