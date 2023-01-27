package com.google.android.datatransport.cct.p034b;

import com.google.android.datatransport.cct.p034b.C1470r;
import com.karumi.dexter.BuildConfig;
import java.util.List;

/* renamed from: com.google.android.datatransport.cct.b.h */
final class C1453h extends C1470r {

    /* renamed from: a */
    private final long f4970a;

    /* renamed from: b */
    private final long f4971b;

    /* renamed from: c */
    private final C1462m f4972c;

    /* renamed from: d */
    private final int f4973d;

    /* renamed from: e */
    private final String f4974e;

    /* renamed from: f */
    private final List<C1467p> f4975f;

    /* renamed from: g */
    private final C1441b f4976g;

    /* renamed from: com.google.android.datatransport.cct.b.h$b */
    static final class C1455b extends C1470r.C1471a {

        /* renamed from: a */
        private Long f4977a;

        /* renamed from: b */
        private Long f4978b;

        /* renamed from: c */
        private C1462m f4979c;

        /* renamed from: d */
        private Integer f4980d;

        /* renamed from: e */
        private String f4981e;

        /* renamed from: f */
        private List<C1467p> f4982f;

        /* renamed from: g */
        private C1441b f4983g;

        C1455b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1470r.C1471a mo6088a(int i) {
            this.f4980d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: b */
        public C1470r.C1471a mo6089b(long j) {
            this.f4977a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C1470r.C1471a mo6090c(C1441b bVar) {
            this.f4983g = bVar;
            return this;
        }

        /* renamed from: d */
        public C1470r.C1471a mo6091d(C1462m mVar) {
            this.f4979c = mVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1470r.C1471a mo6092e(String str) {
            this.f4981e = str;
            return this;
        }

        /* renamed from: f */
        public C1470r.C1471a mo6093f(List<C1467p> list) {
            this.f4982f = list;
            return this;
        }

        /* renamed from: g */
        public C1470r mo6094g() {
            Long l = this.f4977a;
            String str = BuildConfig.FLAVOR;
            if (l == null) {
                str = str + " requestTimeMs";
            }
            if (this.f4978b == null) {
                str = str + " requestUptimeMs";
            }
            if (this.f4980d == null) {
                str = str + " logSource";
            }
            if (str.isEmpty()) {
                return new C1453h(this.f4977a.longValue(), this.f4978b.longValue(), this.f4979c, this.f4980d.intValue(), this.f4981e, this.f4982f, this.f4983g, (C1454a) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: i */
        public C1470r.C1471a mo6095i(long j) {
            this.f4978b = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ C1453h(long j, long j2, C1462m mVar, int i, String str, List list, C1441b bVar, C1454a aVar) {
        this.f4970a = j;
        this.f4971b = j2;
        this.f4972c = mVar;
        this.f4973d = i;
        this.f4974e = str;
        this.f4975f = list;
        this.f4976g = bVar;
    }

    /* renamed from: b */
    public C1462m mo6079b() {
        return this.f4972c;
    }

    /* renamed from: c */
    public List<C1467p> mo6080c() {
        return this.f4975f;
    }

    /* renamed from: d */
    public int mo6081d() {
        return this.f4973d;
    }

    /* renamed from: e */
    public String mo6082e() {
        return this.f4974e;
    }

    public boolean equals(Object obj) {
        C1462m mVar;
        String str;
        List<C1467p> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1470r)) {
            return false;
        }
        C1453h hVar = (C1453h) ((C1470r) obj);
        if (this.f4970a == hVar.f4970a && this.f4971b == hVar.f4971b && ((mVar = this.f4972c) != null ? mVar.equals(hVar.f4972c) : hVar.f4972c == null) && this.f4973d == hVar.f4973d && ((str = this.f4974e) != null ? str.equals(hVar.f4974e) : hVar.f4974e == null) && ((list = this.f4975f) != null ? list.equals(hVar.f4975f) : hVar.f4975f == null)) {
            C1441b bVar = this.f4976g;
            C1441b bVar2 = hVar.f4976g;
            if (bVar == null) {
                if (bVar2 == null) {
                    return true;
                }
            } else if (bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public long mo6084f() {
        return this.f4970a;
    }

    /* renamed from: g */
    public long mo6085g() {
        return this.f4971b;
    }

    public int hashCode() {
        long j = this.f4970a;
        long j2 = this.f4971b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        C1462m mVar = this.f4972c;
        int i2 = 0;
        int hashCode = (((i ^ (mVar == null ? 0 : mVar.hashCode())) * 1000003) ^ this.f4973d) * 1000003;
        String str = this.f4974e;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<C1467p> list = this.f4975f;
        int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        C1441b bVar = this.f4976g;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode3 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f4970a + ", requestUptimeMs=" + this.f4971b + ", clientInfo=" + this.f4972c + ", logSource=" + this.f4973d + ", logSourceName=" + this.f4974e + ", logEvents=" + this.f4975f + ", qosTier=" + this.f4976g + "}";
    }
}
