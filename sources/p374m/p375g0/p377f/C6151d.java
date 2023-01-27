package p374m.p375g0.p377f;

import java.util.LinkedHashSet;
import java.util.Set;
import p374m.C6122e0;

/* renamed from: m.g0.f.d */
public final class C6151d {

    /* renamed from: a */
    private final Set<C6122e0> f17295a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void mo17401a(C6122e0 e0Var) {
        this.f17295a.remove(e0Var);
    }

    /* renamed from: b */
    public synchronized void mo17402b(C6122e0 e0Var) {
        this.f17295a.add(e0Var);
    }

    /* renamed from: c */
    public synchronized boolean mo17403c(C6122e0 e0Var) {
        return this.f17295a.contains(e0Var);
    }
}
