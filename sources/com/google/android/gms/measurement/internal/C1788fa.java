package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.C1683f;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p148g.p189d.p190a.p232c.p237d.C4375f;
import p148g.p189d.p190a.p232c.p237d.C4379j;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;
import p148g.p189d.p190a.p232c.p241f.p247f.C4571gf;
import p148g.p189d.p190a.p232c.p241f.p247f.C4714ob;
import p148g.p189d.p190a.p232c.p241f.p247f.C4884yc;

/* renamed from: com.google.android.gms.measurement.internal.fa */
public final class C1788fa extends C1760d6 {

    /* renamed from: g */
    private static final String[] f5822g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    private static final String[] f5823h = {"_err"};

    /* renamed from: c */
    private SecureRandom f5824c;

    /* renamed from: d */
    private final AtomicLong f5825d = new AtomicLong(0);

    /* renamed from: e */
    private int f5826e;

    /* renamed from: f */
    private Integer f5827f = null;

    C1788fa(C1807h5 h5Var) {
        super(h5Var);
    }

    /* renamed from: B0 */
    static boolean m8442B0(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: C0 */
    static boolean m8443C0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: D */
    public static Bundle m8444D(List<C1776ea> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (C1776ea next : list) {
            String str = next.f5777j;
            if (str != null) {
                bundle.putString(next.f5774g, str);
            } else {
                Long l = next.f5776i;
                if (l != null) {
                    bundle.putLong(next.f5774g, l.longValue());
                } else {
                    Double d = next.f5779l;
                    if (d != null) {
                        bundle.putDouble(next.f5774g, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: F */
    private final Object m8445F(int i, Object obj, boolean z, boolean z2) {
        Bundle B;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m8448H(String.valueOf(obj), i, z);
            }
            if (!C4714ob.m20059b() || !mo6712l().mo7415s(C1957u.f6310B0) || !mo6712l().mo7415s(C1957u.f6308A0) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (B = mo6972B((Bundle) parcelable)) != null && !B.isEmpty()) {
                    arrayList.add(B);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: F0 */
    public static boolean m8446F0(String str) {
        for (String equals : f5823h) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G0 */
    private final int m8447G0(String str) {
        if (!mo6997g0("event param", str)) {
            return 3;
        }
        if (!mo7000l0("event param", (String[]) null, str)) {
            return 14;
        }
        return !mo6996f0("event param", 40, str) ? 3 : 0;
    }

    /* renamed from: H */
    public static String m8448H(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: I0 */
    private final int m8449I0(String str) {
        if (!mo7006v0("event param", str)) {
            return 3;
        }
        if (!mo7000l0("event param", (String[]) null, str)) {
            return 14;
        }
        return !mo6996f0("event param", 40, str) ? 3 : 0;
    }

    /* renamed from: J0 */
    static MessageDigest m8450J0() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: K */
    private static void m8451K(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m8469u0(bundle, i)) {
            bundle.putString("_ev", m8448H(str, 40, true));
            if (obj != null) {
                C1658o.m7845j(bundle);
                if (obj == null) {
                    return;
                }
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    /* renamed from: L0 */
    private static boolean m8452L0(String str) {
        C1658o.m7845j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: M0 */
    private final int m8453M0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (!mo6712l().mo7415s(C1957u.f6371i0) || !"_lgclid".equals(str)) ? 36 : 100;
    }

    /* renamed from: X */
    private final void m8454X(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i;
        String str4;
        int i2;
        String str5;
        String str6 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            boolean s = mo6712l().mo7415s(C1957u.f6312C0);
            int x = s ? 0 : mo6712l().mo7420x();
            int i3 = 0;
            for (String str7 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str7)) {
                    i = z ? m8447G0(str7) : 0;
                    if (i == 0) {
                        i = m8449I0(str7);
                    }
                } else {
                    i = 0;
                }
                if (i != 0) {
                    m8451K(bundle2, i, str7, str7, i == 3 ? str7 : null);
                    bundle2.remove(str7);
                } else {
                    if (m8459c0(bundle2.get(str7))) {
                        mo6709i().mo6769J().mo6888d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str3, str7);
                        i2 = 22;
                        str4 = str7;
                    } else {
                        String str8 = str3;
                        str4 = str7;
                        i2 = m8468u(str, str2, str7, bundle2.get(str7), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        m8451K(bundle2, i2, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (m8460d0(str4) && (!s || !m8462k0(str4, C1820i6.f5923d))) {
                        int i4 = i3 + 1;
                        if (i4 > x) {
                            if (s) {
                                str5 = "Item cannot contain custom parameters";
                            } else {
                                StringBuilder sb = new StringBuilder(63);
                                sb.append("Child bundles can't contain more than ");
                                sb.append(x);
                                sb.append(" custom params");
                                str5 = sb.toString();
                            }
                            mo6709i().mo6766G().mo6887c(str5, mo6705d().mo6692v(str6), mo6705d().mo6690t(bundle2));
                            m8469u0(bundle2, s ? 23 : 5);
                            bundle2.remove(str4);
                        }
                        i3 = i4;
                    }
                }
            }
        }
    }

    /* renamed from: Y */
    static boolean m8455Y(Context context, boolean z) {
        C1658o.m7845j(context);
        return m8467t0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: Z */
    static boolean m8456Z(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* renamed from: a0 */
    static boolean m8457a0(Bundle bundle, int i) {
        int i2 = 0;
        if (bundle.size() <= i) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i2++;
            if (i2 > i) {
                bundle.remove(str);
            }
        }
        return true;
    }

    /* renamed from: b0 */
    static boolean m8458b0(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    /* renamed from: c0 */
    static boolean m8459c0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: d0 */
    static boolean m8460d0(String str) {
        C1658o.m7841f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: j0 */
    static boolean m8461j0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: k0 */
    private static boolean m8462k0(String str, String[] strArr) {
        C1658o.m7845j(strArr);
        for (String B0 : strArr) {
            if (m8442B0(str, B0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n0 */
    static boolean m8463n0(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    /* renamed from: o0 */
    static byte[] m8464o0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: r0 */
    public static Bundle m8465r0(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: s0 */
    public static ArrayList<Bundle> m8466s0(List<C1968ua> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C1968ua next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f6434f);
            bundle.putString("origin", next.f6435g);
            bundle.putLong("creation_timestamp", next.f6437i);
            bundle.putString("name", next.f6436h.f5774g);
            C1784f6.m8438b(bundle, next.f6436h.mo6894d());
            bundle.putBoolean("active", next.f6438j);
            String str = next.f6439k;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C1933s sVar = next.f6440l;
            if (sVar != null) {
                bundle.putString("timed_out_event_name", sVar.f6237f);
                C1873n nVar = next.f6440l.f6238g;
                if (nVar != null) {
                    bundle.putBundle("timed_out_event_params", nVar.mo7245i());
                }
            }
            bundle.putLong("trigger_timeout", next.f6441m);
            C1933s sVar2 = next.f6442n;
            if (sVar2 != null) {
                bundle.putString("triggered_event_name", sVar2.f6237f);
                C1873n nVar2 = next.f6442n.f6238g;
                if (nVar2 != null) {
                    bundle.putBundle("triggered_event_params", nVar2.mo7245i());
                }
            }
            bundle.putLong("triggered_timestamp", next.f6436h.f5775h);
            bundle.putLong("time_to_live", next.f6443o);
            C1933s sVar3 = next.f6444p;
            if (sVar3 != null) {
                bundle.putString("expired_event_name", sVar3.f6237f);
                C1873n nVar3 = next.f6444p.f6238g;
                if (nVar3 != null) {
                    bundle.putBundle("expired_event_params", nVar3.mo7245i());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m8467t0(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0019 }
            r2.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            r3 = 1
            return r3
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1788fa.m8467t0(android.content.Context, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0166 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m8468u(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            r17 = this;
            r7 = r17
            r8 = r20
            r0 = r21
            r1 = r22
            r17.mo6700b()
            boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4714ob.m20059b()
            r3 = 17
            java.lang.String r4 = "param"
            r9 = 0
            if (r2 == 0) goto L_0x007f
            com.google.android.gms.measurement.internal.wa r2 = r17.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C1957u.f6312C0
            boolean r2 = r2.mo7415s(r5)
            if (r2 == 0) goto L_0x007f
            boolean r2 = m8459c0(r21)
            if (r2 == 0) goto L_0x008a
            if (r25 == 0) goto L_0x007c
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.C1820i6.f5922c
            boolean r2 = m8462k0(r8, r2)
            if (r2 != 0) goto L_0x0035
            r0 = 20
            return r0
        L_0x0035:
            com.google.android.gms.measurement.internal.h5 r2 = r7.f5634a
            com.google.android.gms.measurement.internal.c8 r2 = r2.mo7033P()
            boolean r2 = r2.mo6799c0()
            if (r2 != 0) goto L_0x0044
            r0 = 25
            return r0
        L_0x0044:
            r2 = 200(0xc8, float:2.8E-43)
            boolean r5 = r7.m8471w0(r4, r8, r2, r0)
            if (r5 != 0) goto L_0x008a
            boolean r5 = r0 instanceof android.os.Parcelable[]
            if (r5 == 0) goto L_0x0060
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            if (r6 <= r2) goto L_0x0079
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x0079
        L_0x0060:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x0079
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            if (r6 <= r2) goto L_0x0079
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r5.subList(r9, r2)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x0079:
            r10 = 17
            goto L_0x008b
        L_0x007c:
            r0 = 21
            return r0
        L_0x007f:
            if (r25 == 0) goto L_0x008a
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r1 = r7.m8471w0(r4, r8, r1, r0)
            if (r1 != 0) goto L_0x008a
            return r3
        L_0x008a:
            r10 = 0
        L_0x008b:
            com.google.android.gms.measurement.internal.wa r1 = r17.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C1957u.f6341R
            r11 = r18
            boolean r1 = r1.mo7398C(r11, r2)
            if (r1 == 0) goto L_0x009f
            boolean r1 = m8443C0(r19)
            if (r1 != 0) goto L_0x00a5
        L_0x009f:
            boolean r1 = m8443C0(r20)
            if (r1 == 0) goto L_0x00a8
        L_0x00a5:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00aa
        L_0x00a8:
            r1 = 100
        L_0x00aa:
            boolean r1 = r7.mo6998h0(r4, r8, r1, r0)
            if (r1 == 0) goto L_0x00b1
            return r10
        L_0x00b1:
            if (r25 == 0) goto L_0x0167
            boolean r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4714ob.m20059b()
            r12 = 1
            if (r1 == 0) goto L_0x00c8
            com.google.android.gms.measurement.internal.wa r1 = r17.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C1957u.f6310B0
            boolean r1 = r1.mo7415s(r2)
            if (r1 == 0) goto L_0x00c8
            r13 = 1
            goto L_0x00c9
        L_0x00c8:
            r13 = 0
        L_0x00c9:
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e4
            if (r13 == 0) goto L_0x00e1
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.m8454X(r1, r2, r3, r4, r5, r6)
        L_0x00e1:
            r9 = 1
            goto L_0x0164
        L_0x00e4:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0123
            r14 = r0
            android.os.Parcelable[] r14 = (android.os.Parcelable[]) r14
            int r15 = r14.length
            r6 = 0
        L_0x00ed:
            if (r6 >= r15) goto L_0x00e1
            r0 = r14[r6]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0107
            com.google.android.gms.measurement.internal.c4 r1 = r17.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6769J()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.mo6887c(r2, r0, r8)
            goto L_0x0164
        L_0x0107:
            if (r13 == 0) goto L_0x011e
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r16 = r6
            r6 = r24
            r0.m8454X(r1, r2, r3, r4, r5, r6)
            goto L_0x0120
        L_0x011e:
            r16 = r6
        L_0x0120:
            int r6 = r16 + 1
            goto L_0x00ed
        L_0x0123:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0164
            r14 = r0
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r15 = r14.size()
            r0 = 0
        L_0x012f:
            if (r0 >= r15) goto L_0x00e1
            java.lang.Object r1 = r14.get(r0)
            int r16 = r0 + 1
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 != 0) goto L_0x014d
            com.google.android.gms.measurement.internal.c4 r0 = r17.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6769J()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r0.mo6887c(r2, r1, r8)
            goto L_0x0164
        L_0x014d:
            if (r13 == 0) goto L_0x0161
            r4 = r1
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.m8454X(r1, r2, r3, r4, r5, r6)
        L_0x0161:
            r0 = r16
            goto L_0x012f
        L_0x0164:
            if (r9 == 0) goto L_0x0167
            return r10
        L_0x0167:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1788fa.m8468u(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: u0 */
    private static boolean m8469u0(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: w */
    public static long m8470w(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* renamed from: w0 */
    private final boolean m8471w0(String str, String str2, int i, Object obj) {
        int i2;
        if (obj instanceof Parcelable[]) {
            i2 = ((Parcelable[]) obj).length;
        } else {
            if (obj instanceof ArrayList) {
                i2 = ((ArrayList) obj).size();
            }
            return true;
        }
        if (i2 > i) {
            mo6709i().mo6769J().mo6888d("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(i2));
            return false;
        }
        return true;
    }

    /* renamed from: x0 */
    static Bundle[] m8472x0(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    /* renamed from: y */
    public static long m8473y(C1873n nVar) {
        long j = 0;
        if (nVar == null) {
            return 0;
        }
        Iterator<String> it = nVar.iterator();
        while (it.hasNext()) {
            Object h = nVar.mo7244h(it.next());
            if (h instanceof Parcelable[]) {
                j += (long) ((Parcelable[]) h).length;
            }
        }
        return j;
    }

    /* renamed from: z */
    static long m8474z(byte[] bArr) {
        C1658o.m7845j(bArr);
        int i = 0;
        C1658o.m7848m(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* renamed from: z0 */
    private final boolean m8475z0(Context context, String str) {
        C1770e4 e4Var;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e = C4389c.m18627a(context).mo13717e(str, 64);
            if (e == null || e.signatures == null || e.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(e.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            e = e2;
            e4Var = mo6709i().mo6764E();
            str2 = "Error obtaining certificate";
            e4Var.mo6886b(str2, e);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            e4Var = mo6709i().mo6764E();
            str2 = "Package name not found";
            e4Var.mo6886b(str2, e);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final Bundle mo6970A(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo6709i().mo6767H().mo6886b("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public final boolean mo6971A0(String str) {
        mo6700b();
        if (C4389c.m18627a(mo6710j()).mo13713a(str) == 0) {
            return true;
        }
        mo6709i().mo6771L().mo6886b("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final Bundle mo6972B(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object G = mo6977G(str, bundle.get(str));
                if (G == null) {
                    mo6709i().mo6769J().mo6886b("Param value can't be null", mo6705d().mo6693y(str));
                } else {
                    mo6984N(bundle2, str, G);
                }
            }
        }
        return bundle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo6973C(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            boolean r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4714ob.m20059b()
            if (r0 == 0) goto L_0x001d
            com.google.android.gms.measurement.internal.wa r0 = r19.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C1957u.f6312C0
            boolean r0 = r0.mo7415s(r1)
            if (r0 == 0) goto L_0x001d
            r0 = 1
            r14 = 1
            goto L_0x001e
        L_0x001d:
            r14 = 0
        L_0x001e:
            if (r14 == 0) goto L_0x0028
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.C1772e6.f5760d
            boolean r0 = m8462k0(r10, r0)
            r15 = r0
            goto L_0x002a
        L_0x0028:
            r15 = r25
        L_0x002a:
            r16 = 0
            if (r11 == 0) goto L_0x012c
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r11)
            com.google.android.gms.measurement.internal.wa r0 = r19.mo6712l()
            int r7 = r0.mo7420x()
            com.google.android.gms.measurement.internal.wa r0 = r19.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C1957u.f6355a0
            r6 = r20
            boolean r0 = r0.mo7398C(r6, r1)
            if (r0 == 0) goto L_0x0053
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            goto L_0x0057
        L_0x0053:
            java.util.Set r0 = r22.keySet()
        L_0x0057:
            java.util.Iterator r17 = r0.iterator()
            r18 = 0
        L_0x005d:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r0 = r17.next()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            if (r12 == 0) goto L_0x0075
            boolean r0 = r12.contains(r5)
            if (r0 != 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r0 = 0
            goto L_0x0083
        L_0x0075:
            if (r24 == 0) goto L_0x007c
            int r0 = r9.m8447G0(r5)
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            if (r0 != 0) goto L_0x0083
            int r0 = r9.m8449I0(r5)
        L_0x0083:
            if (r0 == 0) goto L_0x0095
            r1 = 3
            if (r0 != r1) goto L_0x008a
            r1 = r5
            goto L_0x008c
        L_0x008a:
            r1 = r16
        L_0x008c:
            m8451K(r8, r0, r5, r5, r1)
            r8.remove(r5)
            r9 = r7
            r12 = r8
            goto L_0x00d4
        L_0x0095:
            java.lang.Object r4 = r11.get(r5)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r5
            r13 = r5
            r5 = r8
            r6 = r23
            r9 = r7
            r7 = r24
            r12 = r8
            r8 = r15
            int r0 = r0.m8468u(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 == 0) goto L_0x00b9
            r1 = 17
            if (r0 != r1) goto L_0x00b9
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            m8451K(r12, r0, r13, r13, r1)
            goto L_0x00dd
        L_0x00b9:
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x00dd
            r1 = 21
            if (r0 != r1) goto L_0x00c9
            r5 = r10
            goto L_0x00ca
        L_0x00c9:
            r5 = r13
        L_0x00ca:
            java.lang.Object r1 = r11.get(r13)
            m8451K(r12, r0, r5, r13, r1)
            r12.remove(r13)
        L_0x00d4:
            r6 = r20
        L_0x00d6:
            r7 = r9
            r8 = r12
            r9 = r19
            r12 = r23
            goto L_0x005d
        L_0x00dd:
            boolean r0 = m8460d0(r13)
            if (r0 == 0) goto L_0x00d4
            int r0 = r18 + 1
            if (r0 <= r9) goto L_0x0126
            r1 = 48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Event can't contain more than "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r1 = " params"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.measurement.internal.c4 r2 = r19.mo6709i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6766G()
            com.google.android.gms.measurement.internal.a4 r3 = r19.mo6705d()
            java.lang.String r3 = r3.mo6692v(r10)
            com.google.android.gms.measurement.internal.a4 r4 = r19.mo6705d()
            java.lang.String r4 = r4.mo6690t(r11)
            r2.mo6887c(r1, r3, r4)
            r1 = 5
            m8469u0(r12, r1)
            r12.remove(r13)
            r6 = r20
            r18 = r0
            goto L_0x00d6
        L_0x0126:
            r18 = r0
            goto L_0x00d4
        L_0x0129:
            r12 = r8
            r16 = r12
        L_0x012c:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1788fa.mo6973C(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public final boolean mo6974D0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return mo6712l().mo7408O().equals(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final C1933s mo6975E(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2, boolean z3) {
        String str4 = str2;
        Bundle bundle2 = bundle;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo7005v(str2, z3) == 0) {
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle) : new Bundle();
            String str5 = str3;
            bundle3.putString("_o", str3);
            return new C1933s(str2, new C1873n(mo6972B(mo6973C(str, str2, bundle3, C1683f.m7942b("_o"), false, false))), str3, j);
        }
        mo6709i().mo6764E().mo6886b("Invalid conditional property event name", mo6705d().mo6694z(str2));
        throw new IllegalArgumentException();
    }

    /* renamed from: E0 */
    public final long mo6976E0() {
        int i = (this.f5825d.get() > 0 ? 1 : (this.f5825d.get() == 0 ? 0 : -1));
        synchronized (this.f5825d) {
            if (i == 0) {
                long nextLong = new Random(System.nanoTime() ^ mo6708g().mo6587c()).nextLong();
                int i2 = this.f5826e + 1;
                this.f5826e = i2;
                long j = nextLong + ((long) i2);
                return j;
            }
            this.f5825d.compareAndSet(-1, 1);
            long andIncrement = this.f5825d.getAndIncrement();
            return andIncrement;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final Object mo6977G(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return m8445F(256, obj, true, true);
        }
        if (!m8443C0(str)) {
            i = 100;
        }
        return m8445F(i, obj, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public final SecureRandom mo6978H0() {
        mo6700b();
        if (this.f5824c == null) {
            this.f5824c = new SecureRandom();
        }
        return this.f5824c;
    }

    /* renamed from: I */
    public final URL mo6979I(long j, String str, String str2, long j2) {
        try {
            C1658o.m7841f(str2);
            C1658o.m7841f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j), Integer.valueOf(mo6981K0())}), str2, str, Long.valueOf(j2)});
            if (str.equals(mo6712l().mo7409P())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            mo6709i().mo6764E().mo6886b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: J */
    public final void mo6980J(int i, String str, String str2, int i2) {
        mo6994W((String) null, i, str, str2, i2);
    }

    /* renamed from: K0 */
    public final int mo6981K0() {
        if (this.f5827f == null) {
            this.f5827f = Integer.valueOf(C4375f.m18582f().mo13708a(mo6710j()) / 1000);
        }
        return this.f5827f.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo6982L(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            mo6709i().mo6767H().mo6886b("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo6983M(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    mo6707f().mo6984N(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final void mo6984N(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (C4714ob.m20059b() && mo6712l().mo7415s(C1957u.f6310B0) && mo6712l().mo7415s(C1957u.f6308A0) && (obj instanceof Bundle[])) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                mo6709i().mo6769J().mo6887c("Not putting event parameter. Invalid value type. name, type", mo6705d().mo6693y(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* renamed from: N0 */
    public final boolean mo6985N0() {
        try {
            mo6710j().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: O */
    public final void mo6986O(C4571gf gfVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            gfVar.mo14082g(bundle);
        } catch (RemoteException e) {
            this.f5634a.mo6709i().mo6767H().mo6886b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: P */
    public final void mo6987P(C4571gf gfVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            gfVar.mo14082g(bundle);
        } catch (RemoteException e) {
            this.f5634a.mo6709i().mo6767H().mo6886b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: Q */
    public final void mo6988Q(C4571gf gfVar, Bundle bundle) {
        try {
            gfVar.mo14082g(bundle);
        } catch (RemoteException e) {
            this.f5634a.mo6709i().mo6767H().mo6886b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: R */
    public final void mo6989R(C4571gf gfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            gfVar.mo14082g(bundle);
        } catch (RemoteException e) {
            this.f5634a.mo6709i().mo6767H().mo6886b("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: S */
    public final void mo6990S(C4571gf gfVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            gfVar.mo14082g(bundle);
        } catch (RemoteException e) {
            this.f5634a.mo6709i().mo6767H().mo6886b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: T */
    public final void mo6991T(C4571gf gfVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            gfVar.mo14082g(bundle);
        } catch (RemoteException e) {
            this.f5634a.mo6709i().mo6767H().mo6886b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: U */
    public final void mo6992U(C4571gf gfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            gfVar.mo14082g(bundle);
        } catch (RemoteException e) {
            this.f5634a.mo6709i().mo6767H().mo6886b("Error returning byte array to wrapper", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final void mo6993V(C1806h4 h4Var, int i) {
        int i2 = 0;
        for (String str : new TreeSet(h4Var.f5864d.keySet())) {
            if (m8460d0(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                mo6709i().mo6766G().mo6887c(sb.toString(), mo6705d().mo6692v(h4Var.f5861a), mo6705d().mo6690t(h4Var.f5864d));
                m8469u0(h4Var.f5864d, 5);
                h4Var.f5864d.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final void mo6994W(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m8469u0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f5634a.mo7023F().mo7195X("auto", "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    /* renamed from: e0 */
    public final boolean mo6995e0(String str, double d) {
        try {
            SharedPreferences.Editor edit = mo6710j().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return edit.commit();
        } catch (Exception e) {
            mo6709i().mo6764E().mo6886b("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final boolean mo6996f0(String str, int i, String str2) {
        if (str2 == null) {
            mo6709i().mo6766G().mo6886b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo6709i().mo6766G().mo6888d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final boolean mo6997g0(String str, String str2) {
        if (str2 == null) {
            mo6709i().mo6766G().mo6886b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo6709i().mo6766G().mo6886b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                mo6709i().mo6766G().mo6887c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo6709i().mo6766G().mo6887c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final boolean mo6998h0(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                mo6709i().mo6769J().mo6888d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final boolean mo6999i0(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (m8452L0(str)) {
                return true;
            }
            if (this.f5634a.mo7027J()) {
                mo6709i().mo6766G().mo6886b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C1746c4.m8178w(str));
            }
            return false;
        } else if (C4884yc.m20730b() && mo6712l().mo7415s(C1957u.f6375k0) && !TextUtils.isEmpty(str3)) {
            return true;
        } else {
            if (TextUtils.isEmpty(str2)) {
                if (this.f5634a.mo7027J()) {
                    mo6709i().mo6766G().mo6885a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (m8452L0(str2)) {
                return true;
            } else {
                mo6709i().mo6766G().mo6886b("Invalid admob_app_id. Analytics disabled.", C1746c4.m8178w(str2));
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final boolean mo7000l0(String str, String[] strArr, String str2) {
        return mo7001m0(str, strArr, (String[]) null, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo6863m() {
        mo6700b();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo6709i().mo6767H().mo6885a("Utils falling back to Random for random id");
            }
        }
        this.f5825d.set(nextLong);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public final boolean mo7001m0(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z;
        if (str2 == null) {
            mo6709i().mo6766G().mo6886b("Name is required and can't be null. Type", str);
            return false;
        }
        C1658o.m7845j(str2);
        String[] strArr3 = f5822g;
        int length = strArr3.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr3[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo6709i().mo6766G().mo6887c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (strArr == null || !m8462k0(str2, strArr) || (strArr2 != null && m8462k0(str2, strArr2))) {
            return true;
        } else {
            mo6709i().mo6766G().mo6887c("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public final int mo7002p0(String str) {
        if (!mo7006v0("user property", str)) {
            return 6;
        }
        if (!mo7000l0("user property", C1808h6.f5899a, str)) {
            return 15;
        }
        return !mo6996f0("user property", 24, str) ? 6 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public final int mo7003q0(String str, Object obj) {
        String str2;
        int i;
        if ("_ldl".equals(str)) {
            i = m8453M0(str);
            str2 = "user property referrer";
        } else {
            i = m8453M0(str);
            str2 = "user property";
        }
        return mo6998h0(str2, str, i, obj) ? 0 : 7;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo6689r() {
        return true;
    }

    /* renamed from: t */
    public final int mo7004t(int i) {
        return C4375f.m18582f().mo13699h(mo6710j(), C4379j.f13918a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final int mo7005v(String str, boolean z) {
        if (!mo7006v0("event", str)) {
            return 2;
        }
        if (z) {
            if (!mo7001m0("event", C1772e6.f5757a, C1772e6.f5758b, str)) {
                return 13;
            }
        } else if (!mo7000l0("event", C1772e6.f5757a, str)) {
            return 13;
        }
        return !mo6996f0("event", 40, str) ? 2 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public final boolean mo7006v0(String str, String str2) {
        if (str2 == null) {
            mo6709i().mo6766G().mo6886b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo6709i().mo6766G().mo6886b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        mo6709i().mo6766G().mo6887c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo6709i().mo6766G().mo6887c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final long mo7007x(Context context, String str) {
        mo6700b();
        C1658o.m7845j(context);
        C1658o.m7841f(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest J0 = m8450J0();
        if (J0 == null) {
            mo6709i().mo6764E().mo6885a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m8475z0(context, str)) {
                    PackageInfo e = C4389c.m18627a(context).mo13717e(mo6710j().getPackageName(), 64);
                    if (e.signatures != null && e.signatures.length > 0) {
                        return m8474z(J0.digest(e.signatures[0].toByteArray()));
                    }
                    mo6709i().mo6767H().mo6885a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                mo6709i().mo6764E().mo6886b("Package name not found", e2);
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public final Object mo7008y0(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int M0 = m8453M0(str);
        return equals ? m8445F(M0, obj, true, false) : m8445F(M0, obj, false, false);
    }
}
