package p148g.p189d.p190a.p271e.p272a.p276c;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: g.d.a.e.a.c.w */
public final class C5134w extends C5132v {

    /* renamed from: f */
    private final C5132v f15160f;

    /* renamed from: g */
    private final long f15161g;

    /* renamed from: h */
    private final long f15162h;

    public C5134w(C5132v vVar, long j, long j2) {
        this.f15160f = vVar;
        long m = m21574m(j);
        this.f15161g = m;
        this.f15162h = m21574m(m + j2);
    }

    /* renamed from: m */
    private final long m21574m(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.f15160f.mo9145a() ? this.f15160f.mo9145a() : j;
    }

    /* renamed from: a */
    public final long mo9145a() {
        return this.f15162h - this.f15161g;
    }

    public final void close() throws IOException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final InputStream mo9147h(long j, long j2) throws IOException {
        long m = m21574m(this.f15161g);
        return this.f15160f.mo9147h(m, m21574m(j2 + m) - m);
    }
}
