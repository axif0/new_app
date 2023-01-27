package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1658o;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p148g.p189d.p190a.p232c.p241f.p247f.C4567gb;

/* renamed from: com.google.android.gms.measurement.internal.e5 */
final class C1771e5<V> extends FutureTask<V> implements Comparable<C1771e5<V>> {

    /* renamed from: f */
    private final long f5753f;

    /* renamed from: g */
    final boolean f5754g;

    /* renamed from: h */
    private final String f5755h;

    /* renamed from: i */
    private final /* synthetic */ C1723a5 f5756i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1771e5(C1723a5 a5Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f5756i = a5Var;
        C4567gb.m19534a().mo14229b(runnable);
        C1658o.m7845j(str);
        long andIncrement = C1723a5.f5624l.getAndIncrement();
        this.f5753f = andIncrement;
        this.f5755h = str;
        this.f5754g = z;
        if (andIncrement == Long.MAX_VALUE) {
            a5Var.mo6709i().mo6764E().mo6885a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1771e5(C1723a5 a5Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f5756i = a5Var;
        C4567gb.m19534a().mo14228a(callable);
        C1658o.m7845j(str);
        long andIncrement = C1723a5.f5624l.getAndIncrement();
        this.f5753f = andIncrement;
        this.f5755h = str;
        this.f5754g = z;
        if (andIncrement == Long.MAX_VALUE) {
            a5Var.mo6709i().mo6764E().mo6885a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C1771e5 e5Var = (C1771e5) obj;
        boolean z = this.f5754g;
        if (z != e5Var.f5754g) {
            return z ? -1 : 1;
        }
        long j = this.f5753f;
        long j2 = e5Var.f5753f;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f5756i.mo6709i().mo6765F().mo6886b("Two tasks share the same index. index", Long.valueOf(this.f5753f));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f5756i.mo6709i().mo6764E().mo6886b(this.f5755h, th);
        super.setException(th);
    }
}
