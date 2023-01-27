package com.google.firebase.installations.p046q;

import com.google.firebase.installations.p046q.C2610b;

/* renamed from: com.google.firebase.installations.q.e */
public abstract class C2617e {

    /* renamed from: com.google.firebase.installations.q.e$a */
    public static abstract class C2618a {
        /* renamed from: a */
        public abstract C2617e mo9560a();

        /* renamed from: b */
        public abstract C2618a mo9561b(C2619b bVar);

        /* renamed from: c */
        public abstract C2618a mo9562c(String str);

        /* renamed from: d */
        public abstract C2618a mo9563d(long j);
    }

    /* renamed from: com.google.firebase.installations.q.e$b */
    public enum C2619b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static C2618a m11651a() {
        C2610b.C2612b bVar = new C2610b.C2612b();
        bVar.mo9563d(0);
        return bVar;
    }

    /* renamed from: b */
    public abstract C2619b mo9554b();

    /* renamed from: c */
    public abstract String mo9555c();

    /* renamed from: d */
    public abstract long mo9556d();
}
