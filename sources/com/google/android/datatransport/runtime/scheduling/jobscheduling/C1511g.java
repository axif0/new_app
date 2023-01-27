package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1506d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p148g.p189d.p190a.p191a.C3729d;
import p148g.p189d.p190a.p191a.p192i.p198x.C3821a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g */
public abstract class C1511g {

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$a */
    public static class C1512a {

        /* renamed from: a */
        private C3821a f5095a;

        /* renamed from: b */
        private Map<C3729d, C1513b> f5096b = new HashMap();

        /* renamed from: a */
        public C1512a mo6169a(C3729d dVar, C1513b bVar) {
            this.f5096b.put(dVar, bVar);
            return this;
        }

        /* renamed from: b */
        public C1511g mo6170b() {
            if (this.f5095a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f5096b.keySet().size() >= C3729d.values().length) {
                Map<C3729d, C1513b> map = this.f5096b;
                this.f5096b = new HashMap();
                return C1511g.m7303c(this.f5095a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        /* renamed from: c */
        public C1512a mo6171c(C3821a aVar) {
            this.f5095a = aVar;
            return this;
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b */
    public static abstract class C1513b {

        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b$a */
        public static abstract class C1514a {
            /* renamed from: a */
            public abstract C1513b mo6161a();

            /* renamed from: b */
            public abstract C1514a mo6162b(long j);

            /* renamed from: c */
            public abstract C1514a mo6163c(Set<C1515c> set);

            /* renamed from: d */
            public abstract C1514a mo6164d(long j);
        }

        /* renamed from: a */
        public static C1514a m7314a() {
            C1506d.C1508b bVar = new C1506d.C1508b();
            bVar.mo6163c(Collections.emptySet());
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo6155b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<C1515c> mo6156c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo6157d();
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$c */
    public enum C1515c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    public static C1512a m7302a() {
        return new C1512a();
    }

    /* renamed from: c */
    static C1511g m7303c(C3821a aVar, Map<C3729d, C1513b> map) {
        return new C1505c(aVar, map);
    }

    /* renamed from: e */
    public static C1511g m7304e(C3821a aVar) {
        C1512a a = m7302a();
        C3729d dVar = C3729d.DEFAULT;
        C1513b.C1514a a2 = C1513b.m7314a();
        a2.mo6162b(30000);
        a2.mo6164d(86400000);
        a.mo6169a(dVar, a2.mo6161a());
        C3729d dVar2 = C3729d.HIGHEST;
        C1513b.C1514a a3 = C1513b.m7314a();
        a3.mo6162b(1000);
        a3.mo6164d(86400000);
        a.mo6169a(dVar2, a3.mo6161a());
        C3729d dVar3 = C3729d.VERY_LOW;
        C1513b.C1514a a4 = C1513b.m7314a();
        a4.mo6162b(86400000);
        a4.mo6164d(86400000);
        a4.mo6163c(m7305h(C1515c.NETWORK_UNMETERED, C1515c.DEVICE_IDLE));
        a.mo6169a(dVar3, a4.mo6161a());
        a.mo6171c(aVar);
        return a.mo6170b();
    }

    /* renamed from: h */
    private static <T> Set<T> m7305h(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: i */
    private void m7306i(JobInfo.Builder builder, Set<C1515c> set) {
        if (set.contains(C1515c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(C1515c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(C1515c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: b */
    public JobInfo.Builder mo6167b(JobInfo.Builder builder, C3729d dVar, long j, int i) {
        builder.setMinimumLatency(mo6168f(dVar, j, i));
        m7306i(builder, mo6152g().get(dVar).mo6156c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract C3821a mo6150d();

    /* renamed from: f */
    public long mo6168f(C3729d dVar, long j, int i) {
        long a = j - mo6150d().mo12402a();
        C1513b bVar = mo6152g().get(dVar);
        return Math.min(Math.max(((long) Math.pow(2.0d, (double) (i - 1))) * bVar.mo6155b(), a), bVar.mo6157d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract Map<C3729d, C1513b> mo6152g();
}
