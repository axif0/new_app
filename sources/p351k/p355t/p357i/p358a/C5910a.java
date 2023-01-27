package p351k.p355t.p357i.p358a;

import java.io.Serializable;
import p351k.p355t.C5895d;

/* renamed from: k.t.i.a.a */
public abstract class C5910a implements C5895d<Object>, C5913d, Serializable {

    /* renamed from: f */
    private final C5895d<Object> f16902f;

    public C5910a(C5895d<Object> dVar) {
        this.f16902f = dVar;
    }

    /* renamed from: a */
    public C5913d mo16975a() {
        C5895d<Object> dVar = this.f16902f;
        if (!(dVar instanceof C5913d)) {
            dVar = null;
        }
        return (C5913d) dVar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [k.t.d<java.lang.Object>, java.lang.Object, k.t.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16968b(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r3
        L_0x0001:
            p351k.p355t.p357i.p358a.C5916g.m24469a(r0)
            k.t.d<java.lang.Object> r1 = r0.f16902f
            p351k.p361v.p363d.C5956g.m24498c(r1)
            r0.mo16977f(r4)     // Catch:{ all -> 0x0010 }
            java.lang.Object unused = p351k.p355t.p356h.C5909d.m24447b()     // Catch:{ all -> 0x0010 }
            return
        L_0x0010:
            r4 = move-exception
            k.j$a r2 = p351k.C5850j.f16880f
            java.lang.Object r4 = p351k.C5853k.m24367a(r4)
            p351k.C5850j.m24363a(r4)
            r0.mo16978g()
            boolean r0 = r1 instanceof p351k.p355t.p357i.p358a.C5910a
            if (r0 == 0) goto L_0x0025
            r0 = r1
            k.t.i.a.a r0 = (p351k.p355t.p357i.p358a.C5910a) r0
            goto L_0x0001
        L_0x0025:
            r1.mo16968b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p351k.p355t.p357i.p358a.C5910a.mo16968b(java.lang.Object):void");
    }

    /* renamed from: e */
    public StackTraceElement mo16976e() {
        return C5915f.m24468d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Object mo16977f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo16978g() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object e = mo16976e();
        if (e == null) {
            e = getClass().getName();
        }
        sb.append(e);
        return sb.toString();
    }
}
