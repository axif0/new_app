package p148g.p189d.p296d.p314w.p315r;

import p148g.p189d.p296d.C5383o;

/* renamed from: g.d.d.w.r.c */
public final class C5466c {

    /* renamed from: a */
    private final int f15838a;

    /* renamed from: b */
    private final int[] f15839b;

    /* renamed from: c */
    private final C5383o[] f15840c;

    public C5466c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f15838a = i;
        this.f15839b = iArr;
        float f = (float) i4;
        this.f15840c = new C5383o[]{new C5383o((float) i2, f), new C5383o((float) i3, f)};
    }

    /* renamed from: a */
    public C5383o[] mo15773a() {
        return this.f15840c;
    }

    /* renamed from: b */
    public int[] mo15774b() {
        return this.f15839b;
    }

    /* renamed from: c */
    public int mo15775c() {
        return this.f15838a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5466c) && this.f15838a == ((C5466c) obj).f15838a;
    }

    public int hashCode() {
        return this.f15838a;
    }
}
