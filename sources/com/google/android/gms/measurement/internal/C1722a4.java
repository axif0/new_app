package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C1658o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p148g.p189d.p190a.p232c.p241f.p247f.C4714ob;

/* renamed from: com.google.android.gms.measurement.internal.a4 */
public final class C1722a4 extends C1760d6 {

    /* renamed from: c */
    private static final AtomicReference<String[]> f5621c = new AtomicReference<>();

    /* renamed from: d */
    private static final AtomicReference<String[]> f5622d = new AtomicReference<>();

    /* renamed from: e */
    private static final AtomicReference<String[]> f5623e = new AtomicReference<>();

    C1722a4(C1807h5 h5Var) {
        super(h5Var);
    }

    /* renamed from: A */
    private final boolean m8063A() {
        return this.f5634a.mo7027J() && this.f5634a.mo6709i().mo6763B(3);
    }

    /* renamed from: w */
    private static String m8064w(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C1658o.m7845j(strArr);
        C1658o.m7845j(strArr2);
        C1658o.m7845j(atomicReference);
        C1658o.m7836a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C1788fa.m8442B0(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: x */
    private final String m8065x(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            String t = bundle instanceof Bundle ? mo6690t(bundle) : String.valueOf(bundle);
            if (t != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(t);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo6689r() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final String mo6690t(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m8063A()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo6693y(str));
            sb.append("=");
            if (!C4714ob.m20059b() || !mo6712l().mo7415s(C1957u.f6403y0)) {
                sb.append(bundle.get(str));
            } else {
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? m8065x(new Object[]{obj}) : obj instanceof Object[] ? m8065x((Object[]) obj) : obj instanceof ArrayList ? m8065x(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final String mo6691u(C1933s sVar) {
        String str = null;
        if (sVar == null) {
            return null;
        }
        if (!m8063A()) {
            return sVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(sVar.f6239h);
        sb.append(",name=");
        sb.append(mo6692v(sVar.f6237f));
        sb.append(",params=");
        C1873n nVar = sVar.f6238g;
        if (nVar != null) {
            str = !m8063A() ? nVar.toString() : mo6690t(nVar.mo7245i());
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final String mo6692v(String str) {
        if (str == null) {
            return null;
        }
        return !m8063A() ? str : m8064w(str, C1772e6.f5759c, C1772e6.f5757a, f5621c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final String mo6693y(String str) {
        if (str == null) {
            return null;
        }
        return !m8063A() ? str : m8064w(str, C1820i6.f5921b, C1820i6.f5920a, f5622d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo6694z(String str) {
        if (str == null) {
            return null;
        }
        if (!m8063A()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m8064w(str, C1808h6.f5900b, C1808h6.f5899a, f5623e);
        }
        return "experiment_id" + "(" + str + ")";
    }
}
