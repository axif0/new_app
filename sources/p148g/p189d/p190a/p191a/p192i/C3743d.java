package p148g.p189d.p190a.p191a.p192i;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C1498j;
import com.google.android.datatransport.runtime.backends.C1501l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1511g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1521m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1522n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1525q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1526r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1527s;
import java.util.concurrent.Executor;
import p148g.p189d.p190a.p191a.p192i.C3762r;
import p148g.p189d.p190a.p191a.p192i.p195v.C3771c;
import p148g.p189d.p190a.p191a.p192i.p195v.C3772d;
import p148g.p189d.p190a.p191a.p192i.p195v.C3775g;
import p148g.p189d.p190a.p191a.p192i.p195v.C3777i;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3781a0;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3784c;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3792f;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3793f0;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3794g;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3813z;
import p148g.p189d.p190a.p191a.p192i.p198x.C3823c;
import p148g.p189d.p190a.p191a.p192i.p198x.C3824d;
import p335h.p336a.C5598a;
import p335h.p336a.C5599b;
import p335h.p336a.C5600c;
import p335h.p336a.C5601d;
import p349j.p350a.C5825a;

/* renamed from: g.d.a.a.i.d */
final class C3743d extends C3762r {

    /* renamed from: f */
    private C5825a<Executor> f11398f;

    /* renamed from: g */
    private C5825a<Context> f11399g;

    /* renamed from: h */
    private C5825a f11400h;

    /* renamed from: i */
    private C5825a f11401i;

    /* renamed from: j */
    private C5825a f11402j;

    /* renamed from: k */
    private C5825a<C3813z> f11403k;

    /* renamed from: l */
    private C5825a<C1511g> f11404l;

    /* renamed from: m */
    private C5825a<C1527s> f11405m;

    /* renamed from: n */
    private C5825a<C3771c> f11406n;

    /* renamed from: o */
    private C5825a<C1521m> f11407o;

    /* renamed from: p */
    private C5825a<C1525q> f11408p;

    /* renamed from: q */
    private C5825a<C3761q> f11409q;

    /* renamed from: g.d.a.a.i.d$b */
    private static final class C3745b implements C3762r.C3763a {

        /* renamed from: a */
        private Context f11410a;

        private C3745b() {
        }

        /* renamed from: a */
        public C3762r mo12330a() {
            C5601d.m23198a(this.f11410a, Context.class);
            return new C3743d(this.f11410a);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C3762r.C3763a mo12331b(Context context) {
            mo12332c(context);
            return this;
        }

        /* renamed from: c */
        public C3745b mo12332c(Context context) {
            C5601d.m23199b(context);
            this.f11410a = context;
            return this;
        }
    }

    private C3743d(Context context) {
        m15624m(context);
    }

    /* renamed from: j */
    public static C3762r.C3763a m15623j() {
        return new C3745b();
    }

    /* renamed from: m */
    private void m15624m(Context context) {
        this.f11398f = C5598a.m23195a(C3752j.m15659a());
        C5599b a = C5600c.m23197a(context);
        this.f11399g = a;
        C1498j a2 = C1498j.m7273a(a, C3823c.m15869a(), C3824d.m15872a());
        this.f11400h = a2;
        this.f11401i = C5598a.m23195a(C1501l.m7280a(this.f11399g, a2));
        this.f11402j = C3793f0.m15779a(this.f11399g, C3792f.m15776a());
        this.f11403k = C5598a.m23195a(C3781a0.m15738a(C3823c.m15869a(), C3824d.m15872a(), C3794g.m15781a(), this.f11402j));
        C3775g b = C3775g.m15723b(C3823c.m15869a());
        this.f11404l = b;
        C3777i a3 = C3777i.m15726a(this.f11399g, this.f11403k, b, C3824d.m15872a());
        this.f11405m = a3;
        C5825a<Executor> aVar = this.f11398f;
        C5825a aVar2 = this.f11401i;
        C5825a<C3813z> aVar3 = this.f11403k;
        this.f11406n = C3772d.m15718a(aVar, aVar2, a3, aVar3, aVar3);
        C5825a<Context> aVar4 = this.f11399g;
        C5825a aVar5 = this.f11401i;
        C5825a<C3813z> aVar6 = this.f11403k;
        this.f11407o = C1522n.m7334a(aVar4, aVar5, aVar6, this.f11405m, this.f11398f, aVar6, C3823c.m15869a());
        C5825a<Executor> aVar7 = this.f11398f;
        C5825a<C3813z> aVar8 = this.f11403k;
        this.f11408p = C1526r.m7341a(aVar7, aVar8, this.f11405m, aVar8);
        this.f11409q = C5598a.m23195a(C3764s.m15702a(C3823c.m15869a(), C3824d.m15872a(), this.f11406n, this.f11407o, this.f11408p));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3784c mo12328a() {
        return this.f11403k.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C3761q mo12329h() {
        return this.f11409q.get();
    }
}
