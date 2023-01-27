package p148g.p189d.p190a.p200b.p230r0;

import java.util.Arrays;

/* renamed from: g.d.a.b.r0.h */
public final class C4267h {

    /* renamed from: a */
    private int f13620a;

    /* renamed from: b */
    private long[] f13621b;

    public C4267h() {
        this(32);
    }

    public C4267h(int i) {
        this.f13621b = new long[i];
    }

    /* renamed from: a */
    public void mo13426a(long j) {
        int i = this.f13620a;
        long[] jArr = this.f13621b;
        if (i == jArr.length) {
            this.f13621b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f13621b;
        int i2 = this.f13620a;
        this.f13620a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long mo13427b(int i) {
        if (i >= 0 && i < this.f13620a) {
            return this.f13621b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f13620a);
    }

    /* renamed from: c */
    public int mo13428c() {
        return this.f13620a;
    }

    /* renamed from: d */
    public long[] mo13429d() {
        return Arrays.copyOf(this.f13621b, this.f13620a);
    }
}
