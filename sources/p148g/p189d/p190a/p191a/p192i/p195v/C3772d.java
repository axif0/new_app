package p148g.p189d.p190a.p191a.p192i.p195v;

import com.google.android.datatransport.runtime.backends.C1491e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1527s;
import java.util.concurrent.Executor;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3784c;
import p148g.p189d.p190a.p191a.p192i.p197w.C3819b;
import p335h.p336a.C5599b;
import p349j.p350a.C5825a;

/* renamed from: g.d.a.a.i.v.d */
public final class C3772d implements C5599b<C3771c> {

    /* renamed from: a */
    private final C5825a<Executor> f11446a;

    /* renamed from: b */
    private final C5825a<C1491e> f11447b;

    /* renamed from: c */
    private final C5825a<C1527s> f11448c;

    /* renamed from: d */
    private final C5825a<C3784c> f11449d;

    /* renamed from: e */
    private final C5825a<C3819b> f11450e;

    public C3772d(C5825a<Executor> aVar, C5825a<C1491e> aVar2, C5825a<C1527s> aVar3, C5825a<C3784c> aVar4, C5825a<C3819b> aVar5) {
        this.f11446a = aVar;
        this.f11447b = aVar2;
        this.f11448c = aVar3;
        this.f11449d = aVar4;
        this.f11450e = aVar5;
    }

    /* renamed from: a */
    public static C3772d m15718a(C5825a<Executor> aVar, C5825a<C1491e> aVar2, C5825a<C1527s> aVar3, C5825a<C3784c> aVar4, C5825a<C3819b> aVar5) {
        return new C3772d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: b */
    public C3771c get() {
        return new C3771c(this.f11446a.get(), this.f11447b.get(), this.f11448c.get(), this.f11449d.get(), this.f11450e.get());
    }
}
