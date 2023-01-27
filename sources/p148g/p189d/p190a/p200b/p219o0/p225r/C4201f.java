package p148g.p189d.p190a.p200b.p219o0.p225r;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4155e;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.o0.r.f */
final class C4201f implements C4155e {

    /* renamed from: f */
    private final C4197b f13415f;

    /* renamed from: g */
    private final long[] f13416g;

    /* renamed from: h */
    private final Map<String, C4200e> f13417h;

    /* renamed from: i */
    private final Map<String, C4198c> f13418i;

    public C4201f(C4197b bVar, Map<String, C4200e> map, Map<String, C4198c> map2) {
        this.f13415f = bVar;
        this.f13418i = map2;
        this.f13417h = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f13416g = bVar.mo13258j();
    }

    /* renamed from: e */
    public int mo13194e(long j) {
        int c = C4284w.m18237c(this.f13416g, j, false, false);
        if (c < this.f13416g.length) {
            return c;
        }
        return -1;
    }

    /* renamed from: g */
    public long mo13195g(int i) {
        return this.f13416g[i];
    }

    /* renamed from: h */
    public List<C4152b> mo13196h(long j) {
        return this.f13415f.mo13257h(j, this.f13417h, this.f13418i);
    }

    /* renamed from: i */
    public int mo13197i() {
        return this.f13416g.length;
    }
}
