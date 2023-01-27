package p148g.p189d.p190a.p200b.p219o0;

import java.util.List;
import p148g.p189d.p190a.p200b.p202i0.C3896f;

/* renamed from: g.d.a.b.o0.j */
public abstract class C4161j extends C3896f implements C4155e {

    /* renamed from: i */
    private C4155e f13194i;

    /* renamed from: j */
    private long f13195j;

    /* renamed from: e */
    public int mo13194e(long j) {
        return this.f13194i.mo13194e(j - this.f13195j);
    }

    /* renamed from: g */
    public long mo13195g(int i) {
        return this.f13194i.mo13195g(i) + this.f13195j;
    }

    /* renamed from: h */
    public List<C4152b> mo13196h(long j) {
        return this.f13194i.mo13196h(j - this.f13195j);
    }

    /* renamed from: i */
    public int mo13197i() {
        return this.f13194i.mo13197i();
    }

    /* renamed from: k */
    public void mo12655k() {
        super.mo12655k();
        this.f13194i = null;
    }

    /* renamed from: s */
    public abstract void mo13193s();

    /* renamed from: t */
    public void mo13200t(long j, C4155e eVar, long j2) {
        this.f11825g = j;
        this.f13194i = eVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f13195j = j;
    }
}
