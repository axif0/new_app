package com.google.android.datatransport.cct.p034b;

import com.google.android.datatransport.cct.p034b.C1467p;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.cct.b.g */
final class C1450g extends C1467p {

    /* renamed from: a */
    private final long f4956a;

    /* renamed from: b */
    private final int f4957b;

    /* renamed from: c */
    private final long f4958c;

    /* renamed from: d */
    private final byte[] f4959d;

    /* renamed from: e */
    private final String f4960e;

    /* renamed from: f */
    private final long f4961f;

    /* renamed from: g */
    private final C1474u f4962g;

    /* renamed from: com.google.android.datatransport.cct.b.g$b */
    static final class C1452b extends C1467p.C1468a {

        /* renamed from: a */
        private Long f4963a;

        /* renamed from: b */
        private Integer f4964b;

        /* renamed from: c */
        private Long f4965c;

        /* renamed from: d */
        private byte[] f4966d;

        /* renamed from: e */
        private String f4967e;

        /* renamed from: f */
        private Long f4968f;

        /* renamed from: g */
        private C1474u f4969g;

        C1452b() {
        }

        /* renamed from: a */
        public C1467p.C1468a mo6071a(int i) {
            this.f4964b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: b */
        public C1467p.C1468a mo6072b(long j) {
            this.f4963a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C1467p.C1468a mo6073c(C1474u uVar) {
            this.f4969g = uVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C1467p.C1468a mo6074d(String str) {
            this.f4967e = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1467p.C1468a mo6075e(byte[] bArr) {
            this.f4966d = bArr;
            return this;
        }

        /* renamed from: f */
        public C1467p mo6076f() {
            Long l = this.f4963a;
            String str = BuildConfig.FLAVOR;
            if (l == null) {
                str = str + " eventTimeMs";
            }
            if (this.f4964b == null) {
                str = str + " eventCode";
            }
            if (this.f4965c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f4968f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C1450g(this.f4963a.longValue(), this.f4964b.intValue(), this.f4965c.longValue(), this.f4966d, this.f4967e, this.f4968f.longValue(), this.f4969g, (C1451a) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: g */
        public C1467p.C1468a mo6077g(long j) {
            this.f4965c = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public C1467p.C1468a mo6078h(long j) {
            this.f4968f = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ C1450g(long j, int i, long j2, byte[] bArr, String str, long j3, C1474u uVar, C1451a aVar) {
        this.f4956a = j;
        this.f4957b = i;
        this.f4958c = j2;
        this.f4959d = bArr;
        this.f4960e = str;
        this.f4961f = j3;
        this.f4962g = uVar;
    }

    /* renamed from: a */
    public long mo6061a() {
        return this.f4956a;
    }

    /* renamed from: d */
    public long mo6062d() {
        return this.f4958c;
    }

    /* renamed from: e */
    public long mo6063e() {
        return this.f4961f;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1467p)) {
            return false;
        }
        C1467p pVar = (C1467p) obj;
        if (this.f4956a == pVar.mo6061a()) {
            C1450g gVar = (C1450g) pVar;
            if (this.f4957b == gVar.f4957b && this.f4958c == pVar.mo6062d()) {
                boolean z = pVar instanceof C1450g;
                if (Arrays.equals(this.f4959d, gVar.f4959d) && ((str = this.f4960e) != null ? str.equals(gVar.f4960e) : gVar.f4960e == null) && this.f4961f == pVar.mo6063e()) {
                    C1474u uVar = this.f4962g;
                    if (uVar == null) {
                        if (gVar.f4962g == null) {
                            return true;
                        }
                    } else if (uVar.equals(gVar.f4962g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public int mo6065f() {
        return this.f4957b;
    }

    /* renamed from: g */
    public C1474u mo6066g() {
        return this.f4962g;
    }

    /* renamed from: h */
    public byte[] mo6067h() {
        return this.f4959d;
    }

    public int hashCode() {
        long j = this.f4956a;
        long j2 = this.f4958c;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f4957b) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f4959d)) * 1000003;
        String str = this.f4960e;
        int i = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.f4961f;
        int i2 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        C1474u uVar = this.f4962g;
        if (uVar != null) {
            i = uVar.hashCode();
        }
        return i2 ^ i;
    }

    /* renamed from: i */
    public String mo6069i() {
        return this.f4960e;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f4956a + ", eventCode=" + this.f4957b + ", eventUptimeMs=" + this.f4958c + ", sourceExtension=" + Arrays.toString(this.f4959d) + ", sourceExtensionJsonProto3=" + this.f4960e + ", timezoneOffsetSeconds=" + this.f4961f + ", networkConnectionInfo=" + this.f4962g + "}";
    }
}
