package kotlinx.coroutines;

import kotlinx.coroutines.p368c1.C6025p;
import p351k.C5859q;
import p351k.p355t.C5895d;
import p351k.p355t.C5899f;
import p351k.p355t.p357i.p358a.C5913d;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.y */
public final class C6087y<T> extends C5993a0<T> implements C5913d, C5895d<T> {

    /* renamed from: h */
    public Object f17043h = C6089z.f17050a;

    /* renamed from: i */
    private final C5913d f17044i;

    /* renamed from: j */
    public final Object f17045j;

    /* renamed from: k */
    public final C6065p f17046k;

    /* renamed from: l */
    public final C5895d<T> f17047l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6087y(C6065p pVar, C5895d<? super T> dVar) {
        super(0);
        C5956g.m24501f(pVar, "dispatcher");
        C5956g.m24501f(dVar, "continuation");
        this.f17046k = pVar;
        this.f17047l = dVar;
        C5895d<T> dVar2 = this.f17047l;
        this.f17044i = (C5913d) (!(dVar2 instanceof C5913d) ? null : dVar2);
        this.f17045j = C6025p.m24648b(mo16969c());
    }

    /* renamed from: a */
    public C5913d mo16975a() {
        return this.f17044i;
    }

    /* renamed from: b */
    public void mo16968b(Object obj) {
        C5899f c;
        Object c2;
        C5899f c3 = this.f17047l.mo16969c();
        Object a = C6051j.m24752a(obj);
        if (this.f17046k.mo17151j(c3)) {
            this.f17043h = a;
            this.f16944g = 0;
            this.f17046k.mo17115h(c3, this);
            return;
        }
        C6034d0 a2 = C6088y0.f17049b.mo17179a();
        if (a2.mo17104q()) {
            this.f17043h = a;
            this.f16944g = 0;
            a2.mo17101m(this);
            return;
        }
        a2.mo17103o(true);
        try {
            c = mo16969c();
            c2 = C6025p.m24649c(c, this.f17045j);
            this.f17047l.mo16968b(obj);
            C5859q qVar = C5859q.f16886a;
            C6025p.m24647a(c, c2);
            do {
            } while (a2.mo17106s());
        } catch (Throwable th) {
            try {
                mo17037j(th, (Throwable) null);
            } catch (Throwable th2) {
                a2.mo17100k(true);
                throw th2;
            }
        }
        a2.mo17100k(true);
    }

    /* renamed from: c */
    public C5899f mo16969c() {
        return this.f17047l.mo16969c();
    }

    /* renamed from: e */
    public StackTraceElement mo16976e() {
        return null;
    }

    /* renamed from: g */
    public C5895d<T> mo17034g() {
        return this;
    }

    /* renamed from: k */
    public Object mo17038k() {
        Object obj = this.f17043h;
        if (C6080v.m24813a()) {
            if (!(obj != C6089z.f17050a)) {
                throw new AssertionError();
            }
        }
        this.f17043h = C6089z.f17050a;
        return obj;
    }

    /* renamed from: l */
    public final void mo17177l(T t) {
        C5899f c = this.f17047l.mo16969c();
        this.f17043h = t;
        this.f16944g = 1;
        this.f17046k.mo17150i(c, this);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f17046k + ", " + C6082w.m24818c(this.f17047l) + ']';
    }
}
