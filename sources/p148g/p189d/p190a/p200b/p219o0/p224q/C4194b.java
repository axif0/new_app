package p148g.p189d.p190a.p200b.p219o0.p224q;

import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4155e;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.o0.q.b */
final class C4194b implements C4155e {

    /* renamed from: f */
    private final C4152b[] f13373f;

    /* renamed from: g */
    private final long[] f13374g;

    public C4194b(C4152b[] bVarArr, long[] jArr) {
        this.f13373f = bVarArr;
        this.f13374g = jArr;
    }

    /* renamed from: e */
    public int mo13194e(long j) {
        int c = C4284w.m18237c(this.f13374g, j, false, false);
        if (c < this.f13374g.length) {
            return c;
        }
        return -1;
    }

    /* renamed from: g */
    public long mo13195g(int i) {
        boolean z = true;
        C4260a.m18069a(i >= 0);
        if (i >= this.f13374g.length) {
            z = false;
        }
        C4260a.m18069a(z);
        return this.f13374g[i];
    }

    /* renamed from: h */
    public List<C4152b> mo13196h(long j) {
        int d = C4284w.m18238d(this.f13374g, j, true, false);
        if (d != -1) {
            C4152b[] bVarArr = this.f13373f;
            if (bVarArr[d] != null) {
                return Collections.singletonList(bVarArr[d]);
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: i */
    public int mo13197i() {
        return this.f13374g.length;
    }
}
