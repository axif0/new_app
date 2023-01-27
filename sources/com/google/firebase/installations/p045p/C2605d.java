package com.google.firebase.installations.p045p;

import com.google.firebase.installations.p045p.C2599a;
import com.google.firebase.installations.p045p.C2603c;

/* renamed from: com.google.firebase.installations.p.d */
public abstract class C2605d {

    /* renamed from: com.google.firebase.installations.p.d$a */
    public static abstract class C2606a {
        /* renamed from: a */
        public abstract C2605d mo9517a();

        /* renamed from: b */
        public abstract C2606a mo9518b(String str);

        /* renamed from: c */
        public abstract C2606a mo9519c(long j);

        /* renamed from: d */
        public abstract C2606a mo9520d(String str);

        /* renamed from: e */
        public abstract C2606a mo9521e(String str);

        /* renamed from: f */
        public abstract C2606a mo9522f(String str);

        /* renamed from: g */
        public abstract C2606a mo9523g(C2603c.C2604a aVar);

        /* renamed from: h */
        public abstract C2606a mo9524h(long j);
    }

    static {
        m11575a().mo9517a();
    }

    /* renamed from: a */
    public static C2606a m11575a() {
        C2599a.C2601b bVar = new C2599a.C2601b();
        bVar.mo9524h(0);
        bVar.mo9523g(C2603c.C2604a.ATTEMPT_MIGRATION);
        bVar.mo9519c(0);
        return bVar;
    }

    /* renamed from: b */
    public abstract String mo9506b();

    /* renamed from: c */
    public abstract long mo9507c();

    /* renamed from: d */
    public abstract String mo9508d();

    /* renamed from: e */
    public abstract String mo9509e();

    /* renamed from: f */
    public abstract String mo9511f();

    /* renamed from: g */
    public abstract C2603c.C2604a mo9512g();

    /* renamed from: h */
    public abstract long mo9513h();

    /* renamed from: i */
    public boolean mo9529i() {
        return mo9512g() == C2603c.C2604a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean mo9530j() {
        return mo9512g() == C2603c.C2604a.NOT_GENERATED || mo9512g() == C2603c.C2604a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean mo9531k() {
        return mo9512g() == C2603c.C2604a.REGISTERED;
    }

    /* renamed from: l */
    public boolean mo9532l() {
        return mo9512g() == C2603c.C2604a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean mo9533m() {
        return mo9512g() == C2603c.C2604a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract C2606a mo9515n();

    /* renamed from: o */
    public C2605d mo9534o(String str, long j, long j2) {
        C2606a n = mo9515n();
        n.mo9518b(str);
        n.mo9519c(j);
        n.mo9524h(j2);
        return n.mo9517a();
    }

    /* renamed from: p */
    public C2605d mo9535p() {
        C2606a n = mo9515n();
        n.mo9518b((String) null);
        return n.mo9517a();
    }

    /* renamed from: q */
    public C2605d mo9536q(String str) {
        C2606a n = mo9515n();
        n.mo9521e(str);
        n.mo9523g(C2603c.C2604a.REGISTER_ERROR);
        return n.mo9517a();
    }

    /* renamed from: r */
    public C2605d mo9537r() {
        C2606a n = mo9515n();
        n.mo9523g(C2603c.C2604a.NOT_GENERATED);
        return n.mo9517a();
    }

    /* renamed from: s */
    public C2605d mo9538s(String str, String str2, long j, String str3, long j2) {
        C2606a n = mo9515n();
        n.mo9520d(str);
        n.mo9523g(C2603c.C2604a.REGISTERED);
        n.mo9518b(str3);
        n.mo9522f(str2);
        n.mo9519c(j2);
        n.mo9524h(j);
        return n.mo9517a();
    }

    /* renamed from: t */
    public C2605d mo9539t(String str) {
        C2606a n = mo9515n();
        n.mo9520d(str);
        n.mo9523g(C2603c.C2604a.UNREGISTERED);
        return n.mo9517a();
    }
}
