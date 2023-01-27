package p374m.p375g0.p380i;

import java.util.Arrays;

/* renamed from: m.g0.i.m */
public final class C6215m {

    /* renamed from: a */
    private int f17540a;

    /* renamed from: b */
    private final int[] f17541b = new int[10];

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17556a() {
        this.f17540a = 0;
        Arrays.fill(this.f17541b, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo17557b(int i) {
        return this.f17541b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo17558c() {
        if ((this.f17540a & 2) != 0) {
            return this.f17541b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo17559d() {
        if ((this.f17540a & 128) != 0) {
            return this.f17541b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo17560e(int i) {
        return (this.f17540a & 16) != 0 ? this.f17541b[4] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo17561f(int i) {
        return (this.f17540a & 32) != 0 ? this.f17541b[5] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo17562g(int i) {
        return ((1 << i) & this.f17540a) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo17563h(C6215m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.mo17562g(i)) {
                mo17564i(i, mVar.mo17557b(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C6215m mo17564i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f17541b;
            if (i < iArr.length) {
                this.f17540a = (1 << i) | this.f17540a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo17565j() {
        return Integer.bitCount(this.f17540a);
    }
}
