package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1658o;
import java.util.ArrayList;
import java.util.Map;
import p086f.p102e.C3190a;
import p148g.p189d.p190a.p232c.p241f.p247f.C4636k7;
import p148g.p189d.p190a.p232c.p241f.p247f.C4714ob;
import p148g.p189d.p190a.p232c.p241f.p247f.C4729pa;
import p148g.p189d.p190a.p232c.p241f.p247f.C4767s0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4784t0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4801u0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
public final class C1735b5 extends C1967u9 implements C1729b {

    /* renamed from: j */
    private static int f5659j = 65535;

    /* renamed from: k */
    private static int f5660k = 2;

    /* renamed from: d */
    private final Map<String, Map<String, String>> f5661d = new C3190a();

    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f5662e = new C3190a();

    /* renamed from: f */
    private final Map<String, Map<String, Boolean>> f5663f = new C3190a();

    /* renamed from: g */
    private final Map<String, C4784t0> f5664g = new C3190a();

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f5665h = new C3190a();

    /* renamed from: i */
    private final Map<String, String> f5666i = new C3190a();

    C1735b5(C2003x9 x9Var) {
        super(x9Var);
    }

    /* renamed from: J */
    private final void m8107J(String str) {
        mo7366r();
        mo6700b();
        C1658o.m7841f(str);
        if (this.f5664g.get(str) == null) {
            byte[] q0 = mo7384o().mo6838q0(str);
            if (q0 == null) {
                this.f5661d.put(str, (Object) null);
                this.f5662e.put(str, (Object) null);
                this.f5663f.put(str, (Object) null);
                this.f5664g.put(str, (Object) null);
                this.f5666i.put(str, (Object) null);
                this.f5665h.put(str, (Object) null);
                return;
            }
            C4784t0.C4785a aVar = (C4784t0.C4785a) m8108v(str, q0).mo14813x();
            m8110x(str, aVar);
            this.f5661d.put(str, m8109w((C4784t0) ((C4895z6) aVar.mo14350h())));
            this.f5664g.put(str, (C4784t0) ((C4895z6) aVar.mo14350h()));
            this.f5666i.put(str, (Object) null);
        }
    }

    /* renamed from: v */
    private final C4784t0 m8108v(String str, byte[] bArr) {
        if (bArr == null) {
            return C4784t0.m20407P();
        }
        try {
            C4784t0.C4785a O = C4784t0.m20406O();
            C1740ba.m8151z(O, bArr);
            C4784t0 t0Var = (C4784t0) ((C4895z6) O.mo14350h());
            C1770e4 M = mo6709i().mo6772M();
            String str2 = null;
            Long valueOf = t0Var.mo14638F() ? Long.valueOf(t0Var.mo14639G()) : null;
            if (t0Var.mo14640I()) {
                str2 = t0Var.mo14641J();
            }
            M.mo6887c("Parsed config. version, gmp_app_id", valueOf, str2);
            return t0Var;
        } catch (C4636k7 | RuntimeException e) {
            mo6709i().mo6767H().mo6887c("Unable to merge remote config. appId", C1746c4.m8178w(str), e);
            return C4784t0.m20407P();
        }
    }

    /* renamed from: w */
    private static Map<String, String> m8109w(C4784t0 t0Var) {
        C3190a aVar = new C3190a();
        if (t0Var != null) {
            for (C4801u0 next : t0Var.mo14642K()) {
                aVar.put(next.mo14663B(), next.mo14664C());
            }
        }
        return aVar;
    }

    /* renamed from: x */
    private final void m8110x(String str, C4784t0.C4785a aVar) {
        C3190a aVar2 = new C3190a();
        C3190a aVar3 = new C3190a();
        C3190a aVar4 = new C3190a();
        if (aVar != null) {
            for (int i = 0; i < aVar.mo14647v(); i++) {
                C4767s0.C4768a aVar5 = (C4767s0.C4768a) aVar.mo14648x(i).mo14813x();
                if (TextUtils.isEmpty(aVar5.mo14593x())) {
                    mo6709i().mo6767H().mo6885a("EventConfig contained null event name");
                } else {
                    String x = aVar5.mo14593x();
                    String b = C1772e6.m8358b(aVar5.mo14593x());
                    if (!TextUtils.isEmpty(b)) {
                        aVar5.mo14592v(b);
                        aVar.mo14649y(i, aVar5);
                    }
                    if (!C4729pa.m20169b() || !mo6712l().mo7415s(C1957u.f6348U0)) {
                        x = aVar5.mo14593x();
                    }
                    aVar2.put(x, Boolean.valueOf(aVar5.mo14594y()));
                    aVar3.put(aVar5.mo14593x(), Boolean.valueOf(aVar5.mo14595z()));
                    if (aVar5.mo14590A()) {
                        if (aVar5.mo14591B() < f5660k || aVar5.mo14591B() > f5659j) {
                            mo6709i().mo6767H().mo6887c("Invalid sampling rate. Event name, sample rate", aVar5.mo14593x(), Integer.valueOf(aVar5.mo14591B()));
                        } else {
                            aVar4.put(aVar5.mo14593x(), Integer.valueOf(aVar5.mo14591B()));
                        }
                    }
                }
            }
        }
        this.f5662e.put(str, aVar2);
        this.f5663f.put(str, aVar3);
        this.f5665h.put(str, aVar4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo6721A(String str, String str2) {
        Boolean bool;
        mo6700b();
        m8107J(str);
        if (mo6728H(str) && C1788fa.m8443C0(str2)) {
            return true;
        }
        if (mo6729I(str) && C1788fa.m8460d0(str2)) {
            return true;
        }
        Map map = this.f5662e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo6722B(String str) {
        mo6700b();
        this.f5666i.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final boolean mo6723C(String str, String str2) {
        Boolean bool;
        mo6700b();
        m8107J(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (C4714ob.m20059b() && mo6712l().mo7415s(C1957u.f6314D0) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map map = this.f5663f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final int mo6724D(String str, String str2) {
        Integer num;
        mo6700b();
        m8107J(str);
        Map map = this.f5665h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo6725E(String str) {
        mo6700b();
        this.f5664g.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean mo6726F(String str) {
        mo6700b();
        C4784t0 u = mo6731u(str);
        if (u == null) {
            return false;
        }
        return u.mo14645N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final long mo6727G(String str) {
        String h = mo6718h(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(h)) {
            return 0;
        }
        try {
            return Long.parseLong(h);
        } catch (NumberFormatException e) {
            mo6709i().mo6767H().mo6887c("Unable to parse timezone offset. appId", C1746c4.m8178w(str), e);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final boolean mo6728H(String str) {
        return "1".equals(mo6718h(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final boolean mo6729I(String str) {
        return "1".equals(mo6718h(str, "measurement.upload.blacklist_public"));
    }

    /* renamed from: h */
    public final String mo6718h(String str, String str2) {
        mo6700b();
        m8107J(str);
        Map map = this.f5661d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo6730t() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C4784t0 mo6731u(String str) {
        mo7366r();
        mo6700b();
        C1658o.m7841f(str);
        m8107J(str);
        return this.f5664g.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo6732y(String str, byte[] bArr, String str2) {
        mo7366r();
        mo6700b();
        C1658o.m7841f(str);
        C4784t0.C4785a aVar = (C4784t0.C4785a) m8108v(str, bArr).mo14813x();
        if (aVar == null) {
            return false;
        }
        m8110x(str, aVar);
        this.f5664g.put(str, (C4784t0) ((C4895z6) aVar.mo14350h()));
        this.f5666i.put(str, str2);
        this.f5661d.put(str, m8109w((C4784t0) ((C4895z6) aVar.mo14350h())));
        mo7384o().mo6824P(str, new ArrayList(aVar.mo14650z()));
        try {
            aVar.mo14646A();
            bArr = ((C4784t0) ((C4895z6) aVar.mo14350h())).mo14268k();
        } catch (RuntimeException e) {
            mo6709i().mo6767H().mo6887c("Unable to serialize reduced-size config. Storing full config instead. appId", C1746c4.m8178w(str), e);
        }
        C1753d o = mo7384o();
        C1658o.m7841f(str);
        o.mo6700b();
        o.mo7366r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) o.mo6844v().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                o.mo6709i().mo6764E().mo6886b("Failed to update remote config (got 0). appId", C1746c4.m8178w(str));
            }
        } catch (SQLiteException e2) {
            o.mo6709i().mo6764E().mo6887c("Error storing remote config. appId", C1746c4.m8178w(str), e2);
        }
        this.f5664g.put(str, (C4784t0) ((C4895z6) aVar.mo14350h()));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo6733z(String str) {
        mo6700b();
        return this.f5666i.get(str);
    }
}
