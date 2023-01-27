package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.karumi.dexter.BuildConfig;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import p148g.p189d.p190a.p232c.p233a.p234a.C4325a;
import p148g.p189d.p190a.p232c.p241f.p247f.C4602ib;

/* renamed from: com.google.android.gms.measurement.internal.c9 */
public final class C1751c9 extends C1967u9 {

    /* renamed from: d */
    private String f5709d;

    /* renamed from: e */
    private boolean f5710e;

    /* renamed from: f */
    private long f5711f;

    C1751c9(C2003x9 x9Var) {
        super(x9Var);
    }

    @Deprecated
    /* renamed from: w */
    private final Pair<String, Boolean> m8239w(String str) {
        mo6700b();
        long a = mo6708g().mo6585a();
        if (this.f5709d != null && a < this.f5711f) {
            return new Pair<>(this.f5709d, Boolean.valueOf(this.f5710e));
        }
        this.f5711f = a + mo6712l().mo7396A(str);
        C4325a.m18477d(true);
        try {
            C4325a.C4326a b = C4325a.m18476b(mo6710j());
            if (b != null) {
                this.f5709d = b.mo13612a();
                this.f5710e = b.mo13613b();
            }
            if (this.f5709d == null) {
                this.f5709d = BuildConfig.FLAVOR;
            }
        } catch (Exception e) {
            mo6709i().mo6771L().mo6886b("Unable to get advertising id", e);
            this.f5709d = BuildConfig.FLAVOR;
        }
        C4325a.m18477d(false);
        return new Pair<>(this.f5709d, Boolean.valueOf(this.f5710e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo6730t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final Pair<String, Boolean> mo6802u(String str, C1765e eVar) {
        return (!C4602ib.m19620b() || !mo6712l().mo7415s(C1957u.f6340Q0) || eVar.mo6880o()) ? m8239w(str) : new Pair<>(BuildConfig.FLAVOR, Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: v */
    public final String mo6803v(String str) {
        mo6700b();
        String str2 = (String) m8239w(str).first;
        MessageDigest J0 = C1788fa.m8450J0();
        if (J0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, J0.digest(str2.getBytes()))});
    }
}
