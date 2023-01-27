package p148g.p189d.p190a.p191a.p192i;

import java.util.concurrent.Executor;
import p335h.p336a.C5599b;
import p335h.p336a.C5601d;

/* renamed from: g.d.a.a.i.j */
public final class C3752j implements C5599b<Executor> {

    /* renamed from: a */
    private static final C3752j f11413a = new C3752j();

    /* renamed from: a */
    public static C3752j m15659a() {
        return f11413a;
    }

    /* renamed from: b */
    public static Executor m15660b() {
        Executor a = C3751i.m15658a();
        C5601d.m23200c(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: c */
    public Executor get() {
        return m15660b();
    }
}
