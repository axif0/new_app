package p148g.p149a.p150a.p151a;

import android.view.View;
import android.view.animation.Interpolator;
import p148g.p325e.p326a.C5544a;
import p148g.p325e.p326a.C5547c;
import p148g.p325e.p328c.C5591a;

/* renamed from: g.a.a.a.a */
public abstract class C3581a {

    /* renamed from: a */
    private C5547c f11158a = new C5547c();

    /* renamed from: b */
    private long f11159b = 1000;

    /* renamed from: a */
    public C3581a mo12175a(C5544a.C5545a aVar) {
        this.f11158a.mo15959b(aVar);
        return this;
    }

    /* renamed from: b */
    public void mo12176b(View view) {
        mo12180f(view);
        mo12179e(view);
        mo12184j();
    }

    /* renamed from: c */
    public C5547c mo12177c() {
        return this.f11158a;
    }

    /* renamed from: d */
    public long mo12178d() {
        return this.f11159b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo12179e(View view);

    /* renamed from: f */
    public void mo12180f(View view) {
        C5591a.m23111a(view, 1.0f);
        C5591a.m23117g(view, 1.0f);
        C5591a.m23118h(view, 1.0f);
        C5591a.m23119i(view, 0.0f);
        C5591a.m23120j(view, 0.0f);
        C5591a.m23114d(view, 0.0f);
        C5591a.m23116f(view, 0.0f);
        C5591a.m23115e(view, 0.0f);
        C5591a.m23112b(view, ((float) view.getMeasuredWidth()) / 2.0f);
        C5591a.m23113c(view, ((float) view.getMeasuredHeight()) / 2.0f);
    }

    /* renamed from: g */
    public C3581a mo12181g(long j) {
        this.f11159b = j;
        return this;
    }

    /* renamed from: h */
    public C3581a mo12182h(Interpolator interpolator) {
        this.f11158a.mo15965g(interpolator);
        return this;
    }

    /* renamed from: i */
    public C3581a mo12183i(long j) {
        mo12177c().mo15971v(j);
        return this;
    }

    /* renamed from: j */
    public void mo12184j() {
        this.f11158a.mo15964f(this.f11159b);
        this.f11158a.mo15966i();
    }
}
