package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.p7 */
public class C4726p7 {

    /* renamed from: a */
    private volatile C4655l8 f14384a;

    /* renamed from: b */
    private volatile C4773s5 f14385b;

    static {
        C4673m6.m19962a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p148g.p189d.p190a.p232c.p241f.p247f.C4655l8 m20115c(p148g.p189d.p190a.p232c.p241f.p247f.C4655l8 r2) {
        /*
            r1 = this;
            g.d.a.c.f.f.l8 r0 = r1.f14384a
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            g.d.a.c.f.f.l8 r0 = r1.f14384a     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f14384a = r2     // Catch:{ k7 -> 0x0012 }
            g.d.a.c.f.f.s5 r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4773s5.f14473g     // Catch:{ k7 -> 0x0012 }
            r1.f14385b = r0     // Catch:{ k7 -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f14384a = r2     // Catch:{ all -> 0x0019 }
            g.d.a.c.f.f.s5 r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4773s5.f14473g     // Catch:{ all -> 0x0019 }
            r1.f14385b = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            g.d.a.c.f.f.l8 r2 = r1.f14384a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4726p7.m20115c(g.d.a.c.f.f.l8):g.d.a.c.f.f.l8");
    }

    /* renamed from: a */
    public final C4655l8 mo14533a(C4655l8 l8Var) {
        C4655l8 l8Var2 = this.f14384a;
        this.f14385b = null;
        this.f14384a = l8Var;
        return l8Var2;
    }

    /* renamed from: b */
    public final int mo14534b() {
        if (this.f14385b != null) {
            return this.f14385b.mo13854d();
        }
        if (this.f14384a != null) {
            return this.f14384a.mo14431c();
        }
        return 0;
    }

    /* renamed from: d */
    public final C4773s5 mo14535d() {
        if (this.f14385b != null) {
            return this.f14385b;
        }
        synchronized (this) {
            if (this.f14385b != null) {
                C4773s5 s5Var = this.f14385b;
                return s5Var;
            }
            this.f14385b = this.f14384a == null ? C4773s5.f14473g : this.f14384a.mo14267b();
            C4773s5 s5Var2 = this.f14385b;
            return s5Var2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4726p7)) {
            return false;
        }
        C4726p7 p7Var = (C4726p7) obj;
        C4655l8 l8Var = this.f14384a;
        C4655l8 l8Var2 = p7Var.f14384a;
        return (l8Var == null && l8Var2 == null) ? mo14535d().equals(p7Var.mo14535d()) : (l8Var == null || l8Var2 == null) ? l8Var != null ? l8Var.equals(p7Var.m20115c(l8Var.mo14481i())) : m20115c(l8Var2.mo14481i()).equals(l8Var2) : l8Var.equals(l8Var2);
    }

    public int hashCode() {
        return 1;
    }
}
