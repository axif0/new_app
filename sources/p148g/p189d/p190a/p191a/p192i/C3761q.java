package p148g.p189d.p190a.p191a.p192i;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1521m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1525q;
import java.util.Collections;
import java.util.Set;
import p148g.p189d.p190a.p191a.C3727b;
import p148g.p189d.p190a.p191a.C3732g;
import p148g.p189d.p190a.p191a.C3733h;
import p148g.p189d.p190a.p191a.p192i.C3749h;
import p148g.p189d.p190a.p191a.p192i.C3755l;
import p148g.p189d.p190a.p191a.p192i.C3762r;
import p148g.p189d.p190a.p191a.p192i.p195v.C3773e;
import p148g.p189d.p190a.p191a.p192i.p198x.C3821a;

/* renamed from: g.d.a.a.i.q */
public class C3761q implements C3760p {

    /* renamed from: e */
    private static volatile C3762r f11423e;

    /* renamed from: a */
    private final C3821a f11424a;

    /* renamed from: b */
    private final C3821a f11425b;

    /* renamed from: c */
    private final C3773e f11426c;

    /* renamed from: d */
    private final C1521m f11427d;

    C3761q(C3821a aVar, C3821a aVar2, C3773e eVar, C1521m mVar, C1525q qVar) {
        this.f11424a = aVar;
        this.f11425b = aVar2;
        this.f11426c = eVar;
        this.f11427d = mVar;
        qVar.mo6179a();
    }

    /* renamed from: b */
    private C3749h m15691b(C3753k kVar) {
        C3749h.C3750a a = C3749h.m15635a();
        a.mo12302i(this.f11424a.mo12402a());
        a.mo12304k(this.f11425b.mo12402a());
        a.mo12303j(kVar.mo12310g());
        a.mo12301h(new C3748g(kVar.mo12305b(), kVar.mo12347d()));
        a.mo12300g(kVar.mo12306c().mo12277a());
        return a.mo12297d();
    }

    /* renamed from: c */
    public static C3761q m15692c() {
        C3762r rVar = f11423e;
        if (rVar != null) {
            return rVar.mo12329h();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C3727b> m15693d(C3746e eVar) {
        return eVar instanceof C3747f ? Collections.unmodifiableSet(((C3747f) eVar).mo6022a()) : Collections.singleton(C3727b.m15581b("proto"));
    }

    /* renamed from: f */
    public static void m15694f(Context context) {
        if (f11423e == null) {
            synchronized (C3761q.class) {
                if (f11423e == null) {
                    C3762r.C3763a j = C3743d.m15623j();
                    j.mo12331b(context);
                    f11423e = j.mo12330a();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo12351a(C3753k kVar, C3733h hVar) {
        this.f11426c.mo12357a(kVar.mo12309f().mo12348e(kVar.mo12306c().mo12279c()), m15691b(kVar), hVar);
    }

    /* renamed from: e */
    public C1521m mo12352e() {
        return this.f11427d;
    }

    /* renamed from: g */
    public C3732g mo12353g(C3746e eVar) {
        Set<C3727b> d = m15693d(eVar);
        C3755l.C3756a a = C3755l.m15675a();
        a.mo12325b(eVar.mo6023b());
        a.mo12326c(eVar.mo6024c());
        return new C3757m(d, a.mo12324a(), this);
    }
}
