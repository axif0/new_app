package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p368c1.C6020k;
import kotlinx.coroutines.p368c1.C6025p;
import kotlinx.coroutines.p369d1.C6036b;
import kotlinx.coroutines.p369d1.C6037c;
import p351k.C5850j;
import p351k.C5853k;
import p351k.C5856n;
import p351k.C5859q;
import p351k.p355t.C5895d;
import p351k.p355t.C5899f;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.a0 */
public abstract class C5993a0<T> extends C6036b {

    /* renamed from: g */
    public int f16944g;

    public C5993a0(int i) {
        this.f16944g = i;
    }

    /* renamed from: f */
    public void mo17033f(Object obj, Throwable th) {
        C5956g.m24501f(th, "cause");
    }

    /* renamed from: g */
    public abstract C5895d<T> mo17034g();

    /* renamed from: h */
    public final Throwable mo17035h(Object obj) {
        if (!(obj instanceof C6049i)) {
            obj = null;
        }
        C6049i iVar = (C6049i) obj;
        if (iVar != null) {
            return iVar.f17015a;
        }
        return null;
    }

    /* renamed from: i */
    public <T> T mo17036i(Object obj) {
        return obj;
    }

    /* renamed from: j */
    public final void mo17037j(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C5842b.m24354a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            String str = "Fatal exception in coroutines machinery for " + this + ". " + "Please read KDoc to 'handleFatalException' method and report this incident to maintainers";
            if (th != null) {
                C6069r.m24780a(mo17034g().mo16969c(), new C6078u(str, th));
                return;
            }
            C5956g.m24506k();
            throw null;
        }
    }

    /* renamed from: k */
    public abstract Object mo17038k();

    public final void run() {
        Object obj;
        C5899f c;
        Object c2;
        Object i;
        Object obj2;
        C6037c cVar = this.f16997f;
        try {
            C5895d g = mo17034g();
            if (g != null) {
                C6087y yVar = (C6087y) g;
                C5895d<T> dVar = yVar.f17047l;
                c = dVar.mo16969c();
                Object k = mo17038k();
                c2 = C6025p.m24649c(c, yVar.f17045j);
                Throwable h = mo17035h(k);
                C6060n0 n0Var = C6083w0.m24819a(this.f16944g) ? (C6060n0) c.get(C6060n0.f17024e) : null;
                if (h == null && n0Var != null && !n0Var.mo17140d()) {
                    CancellationException f = n0Var.mo17142f();
                    mo17033f(k, f);
                    C5850j.C5851a aVar = C5850j.f16880f;
                    i = C5853k.m24367a(C6020k.m24642j(f, dVar));
                    C5850j.m24363a(i);
                } else if (h != null) {
                    C5850j.C5851a aVar2 = C5850j.f16880f;
                    i = C5853k.m24367a(C6020k.m24642j(h, dVar));
                    C5850j.m24363a(i);
                } else {
                    i = mo17036i(k);
                    C5850j.C5851a aVar3 = C5850j.f16880f;
                    C5850j.m24363a(i);
                }
                dVar.mo16968b(i);
                C5859q qVar = C5859q.f16886a;
                C6025p.m24647a(c, c2);
                try {
                    C5850j.C5851a aVar4 = C5850j.f16880f;
                    cVar.mo17108a();
                    obj2 = C5859q.f16886a;
                    C5850j.m24363a(obj2);
                } catch (Throwable th) {
                    C5850j.C5851a aVar5 = C5850j.f16880f;
                    obj2 = C5853k.m24367a(th);
                    C5850j.m24363a(obj2);
                }
                mo17037j((Throwable) null, C5850j.m24364b(obj2));
                return;
            }
            throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th2) {
            try {
                C5850j.C5851a aVar6 = C5850j.f16880f;
                cVar.mo17108a();
                obj = C5859q.f16886a;
                C5850j.m24363a(obj);
            } catch (Throwable th3) {
                C5850j.C5851a aVar7 = C5850j.f16880f;
                obj = C5853k.m24367a(th3);
                C5850j.m24363a(obj);
            }
            mo17037j(th2, C5850j.m24364b(obj));
        }
    }
}
