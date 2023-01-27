package kotlinx.coroutines;

import kotlinx.coroutines.p368c1.C6020k;
import kotlinx.coroutines.p368c1.C6025p;
import p351k.C5850j;
import p351k.C5853k;
import p351k.C5859q;
import p351k.p355t.C5895d;
import p351k.p355t.C5899f;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.w0 */
public final class C6083w0 {
    /* renamed from: a */
    public static final boolean m24819a(int i) {
        return i == 1;
    }

    /* renamed from: b */
    public static final boolean m24820b(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: c */
    public static final <T> void m24821c(C5895d<? super T> dVar, T t, int i) {
        C5956g.m24501f(dVar, "$this$resumeMode");
        if (i == 0) {
            C5850j.C5851a aVar = C5850j.f16880f;
            C5850j.m24363a(t);
            dVar.mo16968b(t);
        } else if (i == 1) {
            C6089z.m24847d(dVar, t);
        } else if (i == 2) {
            C6089z.m24849f(dVar, t);
        } else if (i == 3) {
            C6087y yVar = (C6087y) dVar;
            C5899f c = yVar.mo16969c();
            Object c2 = C6025p.m24649c(c, yVar.f17045j);
            try {
                C5895d<T> dVar2 = yVar.f17047l;
                C5850j.C5851a aVar2 = C5850j.f16880f;
                C5850j.m24363a(t);
                dVar2.mo16968b(t);
                C5859q qVar = C5859q.f16886a;
            } finally {
                C6025p.m24647a(c, c2);
            }
        } else if (i != 4) {
            throw new IllegalStateException(("Invalid mode " + i).toString());
        }
    }

    /* renamed from: d */
    public static final <T> void m24822d(C5895d<? super T> dVar, Throwable th, int i) {
        C5956g.m24501f(dVar, "$this$resumeWithExceptionMode");
        C5956g.m24501f(th, "exception");
        if (i == 0) {
            C5850j.C5851a aVar = C5850j.f16880f;
            Object a = C5853k.m24367a(th);
            C5850j.m24363a(a);
            dVar.mo16968b(a);
        } else if (i == 1) {
            C6089z.m24848e(dVar, th);
        } else if (i == 2) {
            C6089z.m24850g(dVar, th);
        } else if (i == 3) {
            C6087y yVar = (C6087y) dVar;
            C5899f c = yVar.mo16969c();
            Object c2 = C6025p.m24649c(c, yVar.f17045j);
            try {
                C5895d<T> dVar2 = yVar.f17047l;
                C5850j.C5851a aVar2 = C5850j.f16880f;
                Object a2 = C5853k.m24367a(C6020k.m24642j(th, dVar2));
                C5850j.m24363a(a2);
                dVar2.mo16968b(a2);
                C5859q qVar = C5859q.f16886a;
            } finally {
                C6025p.m24647a(c, c2);
            }
        } else if (i != 4) {
            throw new IllegalStateException(("Invalid mode " + i).toString());
        }
    }
}
