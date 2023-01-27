package p148g.p189d.p190a.p232c.p241f.p247f;

import android.content.Context;

/* renamed from: g.d.a.c.f.f.s1 */
final class C4769s1 extends C4705o2 {

    /* renamed from: a */
    private final Context f14464a;

    /* renamed from: b */
    private final C4539f3<C4465b3<C4464b2>> f14465b;

    C4769s1(Context context, C4539f3<C4465b3<C4464b2>> f3Var) {
        if (context != null) {
            this.f14464a = context;
            this.f14465b = f3Var;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo14495a() {
        return this.f14464a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C4539f3<C4465b3<C4464b2>> mo14496b() {
        return this.f14465b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4705o2) {
            C4705o2 o2Var = (C4705o2) obj;
            if (this.f14464a.equals(o2Var.mo14495a())) {
                C4539f3<C4465b3<C4464b2>> f3Var = this.f14465b;
                C4539f3<C4465b3<C4464b2>> b = o2Var.mo14496b();
                return f3Var != null ? f3Var.equals(b) : b == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.f14464a.hashCode() ^ 1000003) * 1000003;
        C4539f3<C4465b3<C4464b2>> f3Var = this.f14465b;
        return hashCode ^ (f3Var == null ? 0 : f3Var.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14464a);
        String valueOf2 = String.valueOf(this.f14465b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
