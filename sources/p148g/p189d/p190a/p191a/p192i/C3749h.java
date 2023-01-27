package p148g.p189d.p190a.p191a.p192i;

import com.karumi.dexter.BuildConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p148g.p189d.p190a.p191a.p192i.C3734a;

/* renamed from: g.d.a.a.i.h */
public abstract class C3749h {

    /* renamed from: g.d.a.a.i.h$a */
    public static abstract class C3750a {
        /* renamed from: a */
        public final C3750a mo12343a(String str, int i) {
            mo12298e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C3750a mo12344b(String str, long j) {
            mo12298e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final C3750a mo12345c(String str, String str2) {
            mo12298e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract C3749h mo12297d();

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract Map<String, String> mo12298e();

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract C3750a mo12299f(Map<String, String> map);

        /* renamed from: g */
        public abstract C3750a mo12300g(Integer num);

        /* renamed from: h */
        public abstract C3750a mo12301h(C3748g gVar);

        /* renamed from: i */
        public abstract C3750a mo12302i(long j);

        /* renamed from: j */
        public abstract C3750a mo12303j(String str);

        /* renamed from: k */
        public abstract C3750a mo12304k(long j);
    }

    /* renamed from: a */
    public static C3750a m15635a() {
        C3734a.C3736b bVar = new C3734a.C3736b();
        bVar.mo12299f(new HashMap());
        return bVar;
    }

    /* renamed from: b */
    public final String mo12338b(String str) {
        String str2 = mo12288c().get(str);
        return str2 == null ? BuildConfig.FLAVOR : str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<String, String> mo12288c();

    /* renamed from: d */
    public abstract Integer mo12289d();

    /* renamed from: e */
    public abstract C3748g mo12290e();

    /* renamed from: f */
    public abstract long mo12292f();

    /* renamed from: g */
    public final int mo12339g(String str) {
        String str2 = mo12288c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long mo12340h(String str) {
        String str2 = mo12288c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> mo12341i() {
        return Collections.unmodifiableMap(mo12288c());
    }

    /* renamed from: j */
    public abstract String mo12294j();

    /* renamed from: k */
    public abstract long mo12295k();

    /* renamed from: l */
    public C3750a mo12342l() {
        C3734a.C3736b bVar = new C3734a.C3736b();
        bVar.mo12303j(mo12294j());
        bVar.mo12300g(mo12289d());
        bVar.mo12301h(mo12290e());
        bVar.mo12302i(mo12292f());
        bVar.mo12304k(mo12295k());
        bVar.mo12299f(new HashMap(mo12288c()));
        return bVar;
    }
}
