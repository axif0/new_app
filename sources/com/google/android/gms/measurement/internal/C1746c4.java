package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C1658o;
import com.karumi.dexter.BuildConfig;

/* renamed from: com.google.android.gms.measurement.internal.c4 */
public final class C1746c4 extends C1760d6 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public char f5686c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f5687d = -1;

    /* renamed from: e */
    private String f5688e;

    /* renamed from: f */
    private final C1770e4 f5689f = new C1770e4(this, 6, false, false);

    /* renamed from: g */
    private final C1770e4 f5690g = new C1770e4(this, 6, true, false);

    /* renamed from: h */
    private final C1770e4 f5691h = new C1770e4(this, 6, false, true);

    /* renamed from: i */
    private final C1770e4 f5692i = new C1770e4(this, 5, false, false);

    /* renamed from: j */
    private final C1770e4 f5693j = new C1770e4(this, 5, true, false);

    /* renamed from: k */
    private final C1770e4 f5694k = new C1770e4(this, 5, false, true);

    /* renamed from: l */
    private final C1770e4 f5695l = new C1770e4(this, 4, false, false);

    /* renamed from: m */
    private final C1770e4 f5696m = new C1770e4(this, 3, false, false);

    /* renamed from: n */
    private final C1770e4 f5697n = new C1770e4(this, 2, false, false);

    C1746c4(C1807h5 h5Var) {
        super(h5Var);
    }

    /* renamed from: D */
    private static String m8173D(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: O */
    private final String m8174O() {
        String str;
        synchronized (this) {
            if (this.f5688e == null) {
                this.f5688e = this.f5634a.mo7030M() != null ? this.f5634a.mo7030M() : "FA";
            }
            str = this.f5688e;
        }
        return str;
    }

    /* renamed from: w */
    protected static Object m8178w(String str) {
        if (str == null) {
            return null;
        }
        return new C1758d4(str);
    }

    /* renamed from: x */
    private static String m8179x(boolean z, Object obj) {
        String className;
        String str = BuildConfig.FLAVOR;
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof C1758d4 ? ((C1758d4) obj).f5726a : z ? "-" : String.valueOf(obj);
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String D = m8173D(C1807h5.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m8173D(className).equals(D)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb2.toString();
        }
    }

    /* renamed from: y */
    static String m8180y(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = str2;
        }
        String x = m8179x(z, obj);
        String x2 = m8179x(z, obj2);
        String x3 = m8179x(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(x)) {
            sb.append(str2);
            sb.append(x);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(x2)) {
            sb.append(str2);
            sb.append(x2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(x3)) {
            sb.append(str3);
            sb.append(x3);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo6762A(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z && mo6763B(i)) {
            mo6774z(i, m8180y(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C1658o.m7845j(str);
            C1723a5 E = this.f5634a.mo7022E();
            if (E == null) {
                str2 = "Scheduler not set. Not logging error/warn";
            } else if (!E.mo6867s()) {
                str2 = "Scheduler not initialized. Not logging error/warn";
            } else {
                if (i < 0) {
                    i = 0;
                }
                E.mo6703y(new C1734b4(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
                return;
            }
            mo6774z(6, str2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final boolean mo6763B(int i) {
        return Log.isLoggable(m8174O(), i);
    }

    /* renamed from: E */
    public final C1770e4 mo6764E() {
        return this.f5689f;
    }

    /* renamed from: F */
    public final C1770e4 mo6765F() {
        return this.f5690g;
    }

    /* renamed from: G */
    public final C1770e4 mo6766G() {
        return this.f5691h;
    }

    /* renamed from: H */
    public final C1770e4 mo6767H() {
        return this.f5692i;
    }

    /* renamed from: I */
    public final C1770e4 mo6768I() {
        return this.f5693j;
    }

    /* renamed from: J */
    public final C1770e4 mo6769J() {
        return this.f5694k;
    }

    /* renamed from: K */
    public final C1770e4 mo6770K() {
        return this.f5695l;
    }

    /* renamed from: L */
    public final C1770e4 mo6771L() {
        return this.f5696m;
    }

    /* renamed from: M */
    public final C1770e4 mo6772M() {
        return this.f5697n;
    }

    /* renamed from: N */
    public final String mo6773N() {
        Pair<String, Long> a = mo6711k().f6133d.mo7335a();
        if (a == null || a == C1902p4.f6128D) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo6689r() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo6774z(int i, String str) {
        Log.println(i, m8174O(), str);
    }
}
