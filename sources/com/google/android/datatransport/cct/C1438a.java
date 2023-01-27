package com.google.android.datatransport.cct;

import com.karumi.dexter.BuildConfig;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p148g.p189d.p190a.p191a.C3727b;
import p148g.p189d.p190a.p191a.p192i.C3747f;

/* renamed from: com.google.android.datatransport.cct.a */
public final class C1438a implements C3747f {

    /* renamed from: c */
    static final String f4921c = C1484f.m7243a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d */
    static final String f4922d = C1484f.m7243a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: e */
    private static final String f4923e = C1484f.m7243a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: f */
    private static final Set<C3727b> f4924f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C3727b[]{C3727b.m15581b("proto"), C3727b.m15581b("json")})));

    /* renamed from: g */
    public static final C1438a f4925g = new C1438a(f4922d, f4923e);

    /* renamed from: a */
    private final String f4926a;

    /* renamed from: b */
    private final String f4927b;

    public C1438a(String str, String str2) {
        this.f4926a = str;
        this.f4927b = str2;
    }

    /* renamed from: e */
    public static C1438a m7110e(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C1438a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: a */
    public Set<C3727b> mo6022a() {
        return f4924f;
    }

    /* renamed from: b */
    public String mo6023b() {
        return "cct";
    }

    /* renamed from: c */
    public byte[] mo6024c() {
        return mo6025d();
    }

    /* renamed from: d */
    public byte[] mo6025d() {
        if (this.f4927b == null && this.f4926a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f4926a;
        objArr[2] = "\\";
        String str = this.f4927b;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: f */
    public String mo6026f() {
        return this.f4927b;
    }

    /* renamed from: g */
    public String mo6027g() {
        return this.f4926a;
    }
}
