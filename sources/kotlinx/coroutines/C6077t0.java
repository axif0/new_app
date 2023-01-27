package kotlinx.coroutines;

import kotlinx.coroutines.p368c1.C6011e;
import kotlinx.coroutines.p368c1.C6013g;
import p351k.C5856n;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.t0 */
public final class C6077t0 extends C6011e implements C6052j0 {
    /* renamed from: a */
    public C6077t0 mo17042a() {
        return this;
    }

    /* renamed from: d */
    public boolean mo17043d() {
        return true;
    }

    /* renamed from: t */
    public final String mo17174t(String str) {
        C5956g.m24501f(str, "state");
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object l = mo17061l();
        if (l != null) {
            boolean z = true;
            for (C6013g gVar = (C6013g) l; !C5956g.m24496a(gVar, this); gVar = gVar.mo17062m()) {
                if (gVar instanceof C6068q0) {
                    C6068q0 q0Var = (C6068q0) gVar;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(q0Var);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            C5956g.m24497b(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    public String toString() {
        return C6080v.m24814b() ? mo17174t("Active") : super.toString();
    }
}
