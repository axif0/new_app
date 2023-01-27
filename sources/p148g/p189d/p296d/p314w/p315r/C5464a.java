package p148g.p189d.p296d.p314w.p315r;

import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.p314w.C5457k;

/* renamed from: g.d.d.w.r.a */
public abstract class C5464a extends C5457k {

    /* renamed from: a */
    private final int[] f15830a = new int[4];

    /* renamed from: b */
    private final int[] f15831b;

    /* renamed from: c */
    private final float[] f15832c;

    /* renamed from: d */
    private final float[] f15833d;

    /* renamed from: e */
    private final int[] f15834e;

    /* renamed from: f */
    private final int[] f15835f;

    protected C5464a() {
        int[] iArr = new int[8];
        this.f15831b = iArr;
        this.f15832c = new float[4];
        this.f15833d = new float[4];
        this.f15834e = new int[(iArr.length / 2)];
        this.f15835f = new int[(iArr.length / 2)];
    }

    /* renamed from: i */
    protected static void m22548i(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: p */
    protected static void m22549p(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: q */
    protected static boolean m22550q(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    protected static int m22551r(int[] iArr, int[][] iArr2) throws C5377i {
        for (int i = 0; i < iArr2.length; i++) {
            if (C5457k.m22506f(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw C5377i.m22193a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int[] mo15762j() {
        return this.f15831b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int[] mo15763k() {
        return this.f15830a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int[] mo15764l() {
        return this.f15835f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final float[] mo15765m() {
        return this.f15833d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int[] mo15766n() {
        return this.f15834e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final float[] mo15767o() {
        return this.f15832c;
    }
}
