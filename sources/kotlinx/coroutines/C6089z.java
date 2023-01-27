package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p368c1.C6020k;
import kotlinx.coroutines.p368c1.C6021l;
import kotlinx.coroutines.p368c1.C6025p;
import p351k.C5850j;
import p351k.C5853k;
import p351k.C5859q;
import p351k.p355t.C5895d;
import p351k.p355t.C5899f;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.z */
public final class C6089z {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C6021l f17050a = new C6021l("UNDEFINED");

    /* renamed from: b */
    public static final <T> void m24845b(C5993a0<? super T> a0Var, int i) {
        C5956g.m24501f(a0Var, "$this$dispatch");
        C5895d<? super T> g = a0Var.mo17034g();
        if (!C6083w0.m24820b(i) || !(g instanceof C6087y) || C6083w0.m24819a(i) != C6083w0.m24819a(a0Var.f16944g)) {
            m24846c(a0Var, g, i);
            return;
        }
        C6065p pVar = ((C6087y) g).f17046k;
        C5899f c = g.mo16969c();
        if (pVar.mo17151j(c)) {
            pVar.mo17115h(c, a0Var);
        } else {
            m24851h(a0Var);
        }
    }

    /* renamed from: c */
    public static final <T> void m24846c(C5993a0<? super T> a0Var, C5895d<? super T> dVar, int i) {
        C5956g.m24501f(a0Var, "$this$resume");
        C5956g.m24501f(dVar, "delegate");
        Object k = a0Var.mo17038k();
        Throwable h = a0Var.mo17035h(k);
        if (h != null) {
            if (!(dVar instanceof C5993a0)) {
                h = C6020k.m24642j(h, dVar);
            }
            C6083w0.m24822d(dVar, h, i);
            return;
        }
        C6083w0.m24821c(dVar, a0Var.mo17036i(k), i);
    }

    /* renamed from: d */
    public static final <T> void m24847d(C5895d<? super T> dVar, T t) {
        boolean z;
        C5899f c;
        Object c2;
        C5956g.m24501f(dVar, "$this$resumeCancellable");
        if (dVar instanceof C6087y) {
            C6087y yVar = (C6087y) dVar;
            if (yVar.f17046k.mo17151j(yVar.mo16969c())) {
                yVar.f17043h = t;
                yVar.f16944g = 1;
                yVar.f17046k.mo17115h(yVar.mo16969c(), yVar);
                return;
            }
            C6034d0 a = C6088y0.f17049b.mo17179a();
            if (a.mo17104q()) {
                yVar.f17043h = t;
                yVar.f16944g = 1;
                a.mo17101m(yVar);
                return;
            }
            a.mo17103o(true);
            try {
                C6060n0 n0Var = (C6060n0) yVar.mo16969c().get(C6060n0.f17024e);
                if (n0Var == null || n0Var.mo17140d()) {
                    z = false;
                } else {
                    CancellationException f = n0Var.mo17142f();
                    C5850j.C5851a aVar = C5850j.f16880f;
                    Object a2 = C5853k.m24367a(f);
                    C5850j.m24363a(a2);
                    yVar.mo16968b(a2);
                    z = true;
                }
                if (!z) {
                    c = yVar.mo16969c();
                    c2 = C6025p.m24649c(c, yVar.f17045j);
                    C5895d<T> dVar2 = yVar.f17047l;
                    C5850j.C5851a aVar2 = C5850j.f16880f;
                    C5850j.m24363a(t);
                    dVar2.mo16968b(t);
                    C5859q qVar = C5859q.f16886a;
                    C6025p.m24647a(c, c2);
                }
                do {
                } while (a.mo17106s());
            } catch (Throwable th) {
                try {
                    yVar.mo17037j(th, (Throwable) null);
                } catch (Throwable th2) {
                    a.mo17100k(true);
                    throw th2;
                }
            }
            a.mo17100k(true);
            return;
        }
        C5850j.C5851a aVar3 = C5850j.f16880f;
        C5850j.m24363a(t);
        dVar.mo16968b(t);
    }

    /* renamed from: e */
    public static final <T> void m24848e(C5895d<? super T> dVar, Throwable th) {
        C5899f c;
        Object c2;
        C5956g.m24501f(dVar, "$this$resumeCancellableWithException");
        C5956g.m24501f(th, "exception");
        if (dVar instanceof C6087y) {
            C6087y yVar = (C6087y) dVar;
            C5899f c3 = yVar.f17047l.mo16969c();
            boolean z = false;
            C6049i iVar = new C6049i(th, false, 2, (C5954e) null);
            if (yVar.f17046k.mo17151j(c3)) {
                yVar.f17043h = new C6049i(th, false, 2, (C5954e) null);
                yVar.f16944g = 1;
                yVar.f17046k.mo17115h(c3, yVar);
                return;
            }
            C6034d0 a = C6088y0.f17049b.mo17179a();
            if (a.mo17104q()) {
                yVar.f17043h = iVar;
                yVar.f16944g = 1;
                a.mo17101m(yVar);
                return;
            }
            a.mo17103o(true);
            try {
                C6060n0 n0Var = (C6060n0) yVar.mo16969c().get(C6060n0.f17024e);
                if (n0Var != null && !n0Var.mo17140d()) {
                    CancellationException f = n0Var.mo17142f();
                    C5850j.C5851a aVar = C5850j.f16880f;
                    Object a2 = C5853k.m24367a(f);
                    C5850j.m24363a(a2);
                    yVar.mo16968b(a2);
                    z = true;
                }
                if (!z) {
                    c = yVar.mo16969c();
                    c2 = C6025p.m24649c(c, yVar.f17045j);
                    C5895d<T> dVar2 = yVar.f17047l;
                    C5850j.C5851a aVar2 = C5850j.f16880f;
                    Object a3 = C5853k.m24367a(C6020k.m24642j(th, dVar2));
                    C5850j.m24363a(a3);
                    dVar2.mo16968b(a3);
                    C5859q qVar = C5859q.f16886a;
                    C6025p.m24647a(c, c2);
                }
                do {
                } while (a.mo17106s());
            } catch (Throwable th2) {
                try {
                    yVar.mo17037j(th2, (Throwable) null);
                } catch (Throwable th3) {
                    a.mo17100k(true);
                    throw th3;
                }
            }
            a.mo17100k(true);
            return;
        }
        C5850j.C5851a aVar3 = C5850j.f16880f;
        Object a4 = C5853k.m24367a(C6020k.m24642j(th, dVar));
        C5850j.m24363a(a4);
        dVar.mo16968b(a4);
    }

    /* renamed from: f */
    public static final <T> void m24849f(C5895d<? super T> dVar, T t) {
        C5956g.m24501f(dVar, "$this$resumeDirect");
        boolean z = dVar instanceof C6087y;
        C5895d<T> dVar2 = dVar;
        if (z) {
            dVar2 = ((C6087y) dVar).f17047l;
        }
        C5850j.C5851a aVar = C5850j.f16880f;
        C5850j.m24363a(t);
        dVar2.mo16968b(t);
    }

    /* renamed from: g */
    public static final <T> void m24850g(C5895d<? super T> dVar, Throwable th) {
        C5956g.m24501f(dVar, "$this$resumeDirectWithException");
        C5956g.m24501f(th, "exception");
        boolean z = dVar instanceof C6087y;
        C5895d<T> dVar2 = dVar;
        if (z) {
            dVar2 = ((C6087y) dVar).f17047l;
        }
        C5850j.C5851a aVar = C5850j.f16880f;
        Object a = C5853k.m24367a(C6020k.m24642j(th, dVar2));
        C5850j.m24363a(a);
        dVar2.mo16968b(a);
    }

    /* renamed from: h */
    private static final void m24851h(C5993a0<?> a0Var) {
        C6034d0 a = C6088y0.f17049b.mo17179a();
        if (a.mo17104q()) {
            a.mo17101m(a0Var);
            return;
        }
        a.mo17103o(true);
        try {
            m24846c(a0Var, a0Var.mo17034g(), 3);
            do {
            } while (a.mo17106s());
        } catch (Throwable th) {
            a.mo17100k(true);
            throw th;
        }
        a.mo17100k(true);
    }

    /* renamed from: i */
    public static final boolean m24852i(C6087y<? super C5859q> yVar) {
        C5956g.m24501f(yVar, "$this$yieldUndispatched");
        C5859q qVar = C5859q.f16886a;
        C6034d0 a = C6088y0.f17049b.mo17179a();
        if (a.mo17105r()) {
            return false;
        }
        if (a.mo17104q()) {
            yVar.f17043h = qVar;
            yVar.f16944g = 1;
            a.mo17101m(yVar);
            return true;
        }
        a.mo17103o(true);
        try {
            yVar.run();
            do {
            } while (a.mo17106s());
        } catch (Throwable th) {
            a.mo17100k(true);
            throw th;
        }
        a.mo17100k(true);
        return false;
    }
}
