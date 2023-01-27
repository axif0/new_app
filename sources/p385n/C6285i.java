package p385n;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: n.i */
public class C6285i extends C6301t {

    /* renamed from: e */
    private C6301t f17787e;

    public C6285i(C6301t tVar) {
        if (tVar != null) {
            this.f17787e = tVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public C6301t mo17898a() {
        return this.f17787e.mo17898a();
    }

    /* renamed from: b */
    public C6301t mo17899b() {
        return this.f17787e.mo17899b();
    }

    /* renamed from: c */
    public long mo17900c() {
        return this.f17787e.mo17900c();
    }

    /* renamed from: d */
    public C6301t mo17901d(long j) {
        return this.f17787e.mo17901d(j);
    }

    /* renamed from: e */
    public boolean mo17902e() {
        return this.f17787e.mo17902e();
    }

    /* renamed from: f */
    public void mo17903f() throws IOException {
        this.f17787e.mo17903f();
    }

    /* renamed from: g */
    public C6301t mo17904g(long j, TimeUnit timeUnit) {
        return this.f17787e.mo17904g(j, timeUnit);
    }

    /* renamed from: h */
    public long mo17905h() {
        return this.f17787e.mo17905h();
    }

    /* renamed from: i */
    public final C6301t mo17906i() {
        return this.f17787e;
    }

    /* renamed from: j */
    public final C6285i mo17907j(C6301t tVar) {
        if (tVar != null) {
            this.f17787e = tVar;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
