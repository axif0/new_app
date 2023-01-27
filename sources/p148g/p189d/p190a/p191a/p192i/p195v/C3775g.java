package p148g.p189d.p190a.p191a.p192i.p195v;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1511g;
import p148g.p189d.p190a.p191a.p192i.p198x.C3821a;
import p335h.p336a.C5599b;
import p335h.p336a.C5601d;
import p349j.p350a.C5825a;

/* renamed from: g.d.a.a.i.v.g */
public final class C3775g implements C5599b<C1511g> {

    /* renamed from: a */
    private final C5825a<C3821a> f11451a;

    public C3775g(C5825a<C3821a> aVar) {
        this.f11451a = aVar;
    }

    /* renamed from: a */
    public static C1511g m15722a(C3821a aVar) {
        C1511g a = C3774f.m15721a(aVar);
        C5601d.m23200c(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: b */
    public static C3775g m15723b(C5825a<C3821a> aVar) {
        return new C3775g(aVar);
    }

    /* renamed from: c */
    public C1511g get() {
        return m15722a(this.f11451a.get());
    }
}
