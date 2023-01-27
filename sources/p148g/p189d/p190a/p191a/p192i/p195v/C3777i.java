package p148g.p189d.p190a.p191a.p192i.p195v;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1511g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1527s;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3784c;
import p148g.p189d.p190a.p191a.p192i.p198x.C3821a;
import p335h.p336a.C5599b;
import p335h.p336a.C5601d;
import p349j.p350a.C5825a;

/* renamed from: g.d.a.a.i.v.i */
public final class C3777i implements C5599b<C1527s> {

    /* renamed from: a */
    private final C5825a<Context> f11452a;

    /* renamed from: b */
    private final C5825a<C3784c> f11453b;

    /* renamed from: c */
    private final C5825a<C1511g> f11454c;

    /* renamed from: d */
    private final C5825a<C3821a> f11455d;

    public C3777i(C5825a<Context> aVar, C5825a<C3784c> aVar2, C5825a<C1511g> aVar3, C5825a<C3821a> aVar4) {
        this.f11452a = aVar;
        this.f11453b = aVar2;
        this.f11454c = aVar3;
        this.f11455d = aVar4;
    }

    /* renamed from: a */
    public static C3777i m15726a(C5825a<Context> aVar, C5825a<C3784c> aVar2, C5825a<C1511g> aVar3, C5825a<C3821a> aVar4) {
        return new C3777i(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C1527s m15727c(Context context, C3784c cVar, C1511g gVar, C3821a aVar) {
        C1527s a = C3776h.m15725a(context, cVar, gVar, aVar);
        C5601d.m23200c(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: b */
    public C1527s get() {
        return m15727c(this.f11452a.get(), this.f11453b.get(), this.f11454c.get(), this.f11455d.get());
    }
}
