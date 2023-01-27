package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.m0 */
class C0458m0 {

    /* renamed from: a */
    private int f1780a = 0;

    /* renamed from: b */
    private int f1781b = 0;

    /* renamed from: c */
    private int f1782c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1783d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1784e = 0;

    /* renamed from: f */
    private int f1785f = 0;

    /* renamed from: g */
    private boolean f1786g = false;

    /* renamed from: h */
    private boolean f1787h = false;

    C0458m0() {
    }

    /* renamed from: a */
    public int mo2261a() {
        return this.f1786g ? this.f1780a : this.f1781b;
    }

    /* renamed from: b */
    public int mo2262b() {
        return this.f1780a;
    }

    /* renamed from: c */
    public int mo2263c() {
        return this.f1781b;
    }

    /* renamed from: d */
    public int mo2264d() {
        return this.f1786g ? this.f1781b : this.f1780a;
    }

    /* renamed from: e */
    public void mo2265e(int i, int i2) {
        this.f1787h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1784e = i;
            this.f1780a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1785f = i2;
            this.f1781b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2266f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1786g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f1786g = r2
            boolean r0 = r1.f1787h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f1783d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f1784e
        L_0x0016:
            r1.f1780a = r2
            int r2 = r1.f1782c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f1782c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f1784e
        L_0x0024:
            r1.f1780a = r2
            int r2 = r1.f1783d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f1784e
            r1.f1780a = r2
        L_0x002f:
            int r2 = r1.f1785f
        L_0x0031:
            r1.f1781b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0458m0.mo2266f(boolean):void");
    }

    /* renamed from: g */
    public void mo2267g(int i, int i2) {
        this.f1782c = i;
        this.f1783d = i2;
        this.f1787h = true;
        if (this.f1786g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1780a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1781b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1780a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1781b = i2;
        }
    }
}
