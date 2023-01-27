package p148g.p189d.p190a.p200b.p219o0.p226s;

import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4155e;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.o0.s.b */
final class C4203b implements C4155e {

    /* renamed from: g */
    public static final C4203b f13428g = new C4203b();

    /* renamed from: f */
    private final List<C4152b> f13429f;

    private C4203b() {
        this.f13429f = Collections.emptyList();
    }

    public C4203b(C4152b bVar) {
        this.f13429f = Collections.singletonList(bVar);
    }

    /* renamed from: e */
    public int mo13194e(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: g */
    public long mo13195g(int i) {
        C4260a.m18069a(i == 0);
        return 0;
    }

    /* renamed from: h */
    public List<C4152b> mo13196h(long j) {
        return j >= 0 ? this.f13429f : Collections.emptyList();
    }

    /* renamed from: i */
    public int mo13197i() {
        return 1;
    }
}
