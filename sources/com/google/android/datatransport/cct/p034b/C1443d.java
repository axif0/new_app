package com.google.android.datatransport.cct.p034b;

import com.google.android.datatransport.cct.p034b.C1439a;
import com.karumi.dexter.BuildConfig;

/* renamed from: com.google.android.datatransport.cct.b.d */
final class C1443d extends C1439a {

    /* renamed from: a */
    private final int f4935a;

    /* renamed from: b */
    private final String f4936b;

    /* renamed from: c */
    private final String f4937c;

    /* renamed from: d */
    private final String f4938d;

    /* renamed from: e */
    private final String f4939e;

    /* renamed from: f */
    private final String f4940f;

    /* renamed from: g */
    private final String f4941g;

    /* renamed from: h */
    private final String f4942h;

    /* renamed from: com.google.android.datatransport.cct.b.d$b */
    static final class C1445b extends C1439a.C1440a {

        /* renamed from: a */
        private Integer f4943a;

        /* renamed from: b */
        private String f4944b;

        /* renamed from: c */
        private String f4945c;

        /* renamed from: d */
        private String f4946d;

        /* renamed from: e */
        private String f4947e;

        /* renamed from: f */
        private String f4948f;

        /* renamed from: g */
        private String f4949g;

        /* renamed from: h */
        private String f4950h;

        C1445b() {
        }

        /* renamed from: a */
        public C1439a.C1440a mo6028a(int i) {
            this.f4943a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: b */
        public C1439a.C1440a mo6029b(String str) {
            this.f4946d = str;
            return this;
        }

        /* renamed from: c */
        public C1439a mo6030c() {
            Integer num = this.f4943a;
            String str = BuildConfig.FLAVOR;
            if (num == null) {
                str = str + " sdkVersion";
            }
            if (str.isEmpty()) {
                return new C1443d(this.f4943a.intValue(), this.f4944b, this.f4945c, this.f4946d, this.f4947e, this.f4948f, this.f4949g, this.f4950h, (C1444a) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: d */
        public C1439a.C1440a mo6031d(String str) {
            this.f4950h = str;
            return this;
        }

        /* renamed from: e */
        public C1439a.C1440a mo6032e(String str) {
            this.f4945c = str;
            return this;
        }

        /* renamed from: f */
        public C1439a.C1440a mo6033f(String str) {
            this.f4949g = str;
            return this;
        }

        /* renamed from: g */
        public C1439a.C1440a mo6034g(String str) {
            this.f4944b = str;
            return this;
        }

        /* renamed from: h */
        public C1439a.C1440a mo6035h(String str) {
            this.f4948f = str;
            return this;
        }

        /* renamed from: i */
        public C1439a.C1440a mo6036i(String str) {
            this.f4947e = str;
            return this;
        }
    }

    /* synthetic */ C1443d(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, C1444a aVar) {
        this.f4935a = i;
        this.f4936b = str;
        this.f4937c = str2;
        this.f4938d = str3;
        this.f4939e = str4;
        this.f4940f = str5;
        this.f4941g = str6;
        this.f4942h = str7;
    }

    /* renamed from: b */
    public String mo6038b() {
        return this.f4938d;
    }

    /* renamed from: c */
    public String mo6039c() {
        return this.f4942h;
    }

    /* renamed from: d */
    public String mo6040d() {
        return this.f4937c;
    }

    /* renamed from: e */
    public String mo6041e() {
        return this.f4941g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1439a)) {
            return false;
        }
        C1443d dVar = (C1443d) ((C1439a) obj);
        if (this.f4935a == dVar.f4935a && ((str = this.f4936b) != null ? str.equals(dVar.f4936b) : dVar.f4936b == null) && ((str2 = this.f4937c) != null ? str2.equals(dVar.f4937c) : dVar.f4937c == null) && ((str3 = this.f4938d) != null ? str3.equals(dVar.f4938d) : dVar.f4938d == null) && ((str4 = this.f4939e) != null ? str4.equals(dVar.f4939e) : dVar.f4939e == null) && ((str5 = this.f4940f) != null ? str5.equals(dVar.f4940f) : dVar.f4940f == null) && ((str6 = this.f4941g) != null ? str6.equals(dVar.f4941g) : dVar.f4941g == null)) {
            String str7 = this.f4942h;
            String str8 = dVar.f4942h;
            if (str7 == null) {
                if (str8 == null) {
                    return true;
                }
            } else if (str7.equals(str8)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo6043f() {
        return this.f4936b;
    }

    /* renamed from: g */
    public String mo6044g() {
        return this.f4940f;
    }

    /* renamed from: h */
    public String mo6045h() {
        return this.f4939e;
    }

    public int hashCode() {
        int i = (this.f4935a ^ 1000003) * 1000003;
        String str = this.f4936b;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f4937c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4938d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f4939e;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f4940f;
        int hashCode5 = (hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f4941g;
        int hashCode6 = (hashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f4942h;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return hashCode6 ^ i2;
    }

    /* renamed from: i */
    public int mo6047i() {
        return this.f4935a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f4935a + ", model=" + this.f4936b + ", hardware=" + this.f4937c + ", device=" + this.f4938d + ", product=" + this.f4939e + ", osBuild=" + this.f4940f + ", manufacturer=" + this.f4941g + ", fingerprint=" + this.f4942h + "}";
    }
}
