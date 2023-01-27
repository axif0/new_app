package com.google.android.datatransport.cct.p034b;

import com.google.android.datatransport.cct.p034b.C1447f;

/* renamed from: com.google.android.datatransport.cct.b.m */
public abstract class C1462m {

    /* renamed from: com.google.android.datatransport.cct.b.m$a */
    public static abstract class C1463a {
        /* renamed from: a */
        public abstract C1463a mo6058a(C1439a aVar);

        /* renamed from: b */
        public abstract C1463a mo6059b(C1464b bVar);

        /* renamed from: c */
        public abstract C1462m mo6060c();
    }

    /* renamed from: com.google.android.datatransport.cct.b.m$b */
    public enum C1464b {
        UNKNOWN(0),
        ANDROID(4);

        static {
            UNKNOWN = new C1464b("UNKNOWN", 0, 0);
            ANDROID = new C1464b("ANDROID", 1, 4);
        }

        private C1464b(int i) {
        }
    }

    /* renamed from: a */
    public static C1463a m7189a() {
        return new C1447f.C1449b();
    }
}
