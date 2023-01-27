package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.C1692o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p148g.p189d.p190a.p232c.p237d.C4379j;
import p148g.p189d.p190a.p232c.p237d.C4380k;
import p148g.p189d.p190a.p232c.p241f.p247f.C4602ib;
import p148g.p189d.p190a.p232c.p241f.p247f.C4907zc;

/* renamed from: com.google.android.gms.measurement.internal.i5 */
public final class C1819i5 extends C1949t3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2003x9 f5917a;

    /* renamed from: b */
    private Boolean f5918b;

    /* renamed from: c */
    private String f5919c;

    public C1819i5(C2003x9 x9Var) {
        this(x9Var, (String) null);
    }

    private C1819i5(C2003x9 x9Var, String str) {
        C1658o.m7845j(x9Var);
        this.f5917a = x9Var;
        this.f5919c = null;
    }

    /* renamed from: S0 */
    private final void m8589S0(Runnable runnable) {
        C1658o.m7845j(runnable);
        if (this.f5917a.mo6706e().mo6698H()) {
            runnable.run();
        } else {
            this.f5917a.mo6706e().mo6703y(runnable);
        }
    }

    /* renamed from: T0 */
    private final void m8590T0(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f5918b == null) {
                        if (!"com.google.android.gms".equals(this.f5919c) && !C1692o.m7972a(this.f5917a.mo6710j(), Binder.getCallingUid())) {
                            if (!C4380k.m18605a(this.f5917a.mo6710j()).mo13711c(Binder.getCallingUid())) {
                                z2 = false;
                                this.f5918b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f5918b = Boolean.valueOf(z2);
                    }
                    if (this.f5918b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f5917a.mo6709i().mo6764E().mo6886b("Measurement Service called with invalid calling package. appId", C1746c4.m8178w(str));
                    throw e;
                }
            }
            if (this.f5919c == null && C4379j.m18603k(this.f5917a.mo6710j(), Binder.getCallingUid(), str)) {
                this.f5919c = str;
            }
            if (!str.equals(this.f5919c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f5917a.mo6709i().mo6764E().mo6885a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: V0 */
    private final void m8591V0(C1860la laVar, boolean z) {
        C1658o.m7845j(laVar);
        m8590T0(laVar.f6014f, false);
        this.f5917a.mo7452f0().mo6999i0(laVar.f6015g, laVar.f6031w, laVar.f6012A);
    }

    /* renamed from: A */
    public final List<C1776ea> mo7121A(String str, String str2, boolean z, C1860la laVar) {
        m8591V0(laVar, false);
        try {
            List<C1800ga> list = (List) this.f5917a.mo6706e().mo6702v(new C1903p5(this, laVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1800ga gaVar : list) {
                if (z || !C1788fa.m8443C0(gaVar.f5854c)) {
                    arrayList.add(new C1776ea(gaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f5917a.mo6709i().mo6764E().mo6887c("Failed to query user properties. appId", C1746c4.m8178w(laVar.f6014f), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: A0 */
    public final void mo7122A0(long j, String str, String str2, String str3) {
        m8589S0(new C1736b6(this, str2, str3, str, j));
    }

    /* renamed from: B */
    public final List<C1776ea> mo7123B(C1860la laVar, boolean z) {
        m8591V0(laVar, false);
        try {
            List<C1800ga> list = (List) this.f5917a.mo6706e().mo6702v(new C2023z5(this, laVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1800ga gaVar : list) {
                if (z || !C1788fa.m8443C0(gaVar.f5854c)) {
                    arrayList.add(new C1776ea(gaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f5917a.mo6709i().mo6764E().mo6887c("Failed to get user properties. appId", C1746c4.m8178w(laVar.f6014f), e);
            return null;
        }
    }

    /* renamed from: C */
    public final void mo7124C(C1968ua uaVar, C1860la laVar) {
        C1658o.m7845j(uaVar);
        C1658o.m7845j(uaVar.f6436h);
        m8591V0(laVar, false);
        C1968ua uaVar2 = new C1968ua(uaVar);
        uaVar2.f6434f = laVar.f6014f;
        m8589S0(new C1879n5(this, uaVar2, laVar));
    }

    /* renamed from: D */
    public final void mo7125D(C1860la laVar) {
        m8591V0(laVar, false);
        m8589S0(new C2012y5(this, laVar));
    }

    /* renamed from: E0 */
    public final void mo7126E0(C1860la laVar) {
        m8590T0(laVar.f6014f, false);
        m8589S0(new C1951t5(this, laVar));
    }

    /* renamed from: F0 */
    public final List<C1968ua> mo7127F0(String str, String str2, String str3) {
        m8590T0(str, true);
        try {
            return (List) this.f5917a.mo6706e().mo6702v(new C1915q5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f5917a.mo6709i().mo6764E().mo6886b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: G0 */
    public final void mo7128G0(C1933s sVar, String str, String str2) {
        C1658o.m7845j(sVar);
        C1658o.m7841f(str);
        m8590T0(str, true);
        m8589S0(new C1963u5(this, sVar, str));
    }

    /* renamed from: H0 */
    public final List<C1968ua> mo7129H0(String str, String str2, C1860la laVar) {
        m8591V0(laVar, false);
        try {
            return (List) this.f5917a.mo6706e().mo6702v(new C1927r5(this, laVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f5917a.mo6709i().mo6764E().mo6886b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: I */
    public final void mo7130I(C1860la laVar) {
        if (C4602ib.m19620b() && this.f5917a.mo7437L().mo7415s(C1957u.f6340Q0)) {
            C1658o.m7841f(laVar.f6014f);
            C1658o.m7845j(laVar.f6013B);
            C1939s5 s5Var = new C1939s5(this, laVar);
            C1658o.m7845j(s5Var);
            if (this.f5917a.mo6706e().mo6698H()) {
                s5Var.run();
            } else {
                this.f5917a.mo6706e().mo6696B(s5Var);
            }
        }
    }

    /* renamed from: P */
    public final void mo7131P(C1968ua uaVar) {
        C1658o.m7845j(uaVar);
        C1658o.m7845j(uaVar.f6436h);
        m8590T0(uaVar.f6434f, true);
        m8589S0(new C1867m5(this, new C1968ua(uaVar)));
    }

    /* renamed from: T */
    public final void mo7132T(C1776ea eaVar, C1860la laVar) {
        C1658o.m7845j(eaVar);
        m8591V0(laVar, false);
        m8589S0(new C1987w5(this, eaVar, laVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public final C1933s mo7133U0(C1933s sVar, C1860la laVar) {
        C1873n nVar;
        boolean z = false;
        if (!(!"_cmp".equals(sVar.f6237f) || (nVar = sVar.f6238g) == null || nVar.mo7243d() == 0)) {
            String o = sVar.f6238g.mo7249o("_cis");
            if (!TextUtils.isEmpty(o) && (("referrer broadcast".equals(o) || "referrer API".equals(o)) && this.f5917a.mo7437L().mo7398C(laVar.f6014f, C1957u.f6343S))) {
                z = true;
            }
        }
        if (!z) {
            return sVar;
        }
        this.f5917a.mo6709i().mo6770K().mo6886b("Event has been filtered ", sVar.toString());
        return new C1933s("_cmpx", sVar.f6238g, sVar.f6239h, sVar.f6240i);
    }

    /* renamed from: W */
    public final void mo7134W(C1860la laVar) {
        m8591V0(laVar, false);
        m8589S0(new C1843k5(this, laVar));
    }

    /* renamed from: X */
    public final List<C1776ea> mo7135X(String str, String str2, String str3, boolean z) {
        m8590T0(str, true);
        try {
            List<C1800ga> list = (List) this.f5917a.mo6706e().mo6702v(new C1891o5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1800ga gaVar : list) {
                if (z || !C1788fa.m8443C0(gaVar.f5854c)) {
                    arrayList.add(new C1776ea(gaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f5917a.mo6709i().mo6764E().mo6887c("Failed to get user properties as. appId", C1746c4.m8178w(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: Z */
    public final byte[] mo7136Z(C1933s sVar, String str) {
        C1658o.m7841f(str);
        C1658o.m7845j(sVar);
        m8590T0(str, true);
        this.f5917a.mo6709i().mo6771L().mo6886b("Log and bundle. event", this.f5917a.mo7451e0().mo6692v(sVar.f6237f));
        long b = this.f5917a.mo6708g().mo6586b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f5917a.mo6706e().mo6695A(new C1999x5(this, sVar, str)).get();
            if (bArr == null) {
                this.f5917a.mo6709i().mo6764E().mo6886b("Log and bundle returned null. appId", C1746c4.m8178w(str));
                bArr = new byte[0];
            }
            this.f5917a.mo6709i().mo6771L().mo6888d("Log and bundle processed. event, size, time_ms", this.f5917a.mo7451e0().mo6692v(sVar.f6237f), Integer.valueOf(bArr.length), Long.valueOf((this.f5917a.mo6708g().mo6586b() / 1000000) - b));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f5917a.mo6709i().mo6764E().mo6888d("Failed to log and bundle. appId, event, error", C1746c4.m8178w(str), this.f5917a.mo7451e0().mo6692v(sVar.f6237f), e);
            return null;
        }
    }

    /* renamed from: a0 */
    public final void mo7137a0(C1933s sVar, C1860la laVar) {
        C1658o.m7845j(sVar);
        m8591V0(laVar, false);
        m8589S0(new C1975v5(this, sVar, laVar));
    }

    /* renamed from: n0 */
    public final String mo7138n0(C1860la laVar) {
        m8591V0(laVar, false);
        return this.f5917a.mo7445Y(laVar);
    }

    /* renamed from: q0 */
    public final void mo7139q0(Bundle bundle, C1860la laVar) {
        if (C4907zc.m20843b() && this.f5917a.mo7437L().mo7415s(C1957u.f6324I0)) {
            m8591V0(laVar, false);
            m8589S0(new C1855l5(this, laVar, bundle));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final /* synthetic */ void mo7140w(C1860la laVar, Bundle bundle) {
        this.f5917a.mo7446Z().mo6830X(laVar.f6014f, bundle);
    }
}
