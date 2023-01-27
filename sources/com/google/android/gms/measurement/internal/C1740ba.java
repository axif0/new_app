package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1658o;
import com.karumi.dexter.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p148g.p189d.p190a.p232c.p241f.p247f.C4462b1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4481c1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4499d1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4536f1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4556g1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4574h1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4628k0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4636k7;
import p148g.p189d.p190a.p232c.p241f.p247f.C4637k8;
import p148g.p189d.p190a.p232c.p241f.p247f.C4645l0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4663m0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4673m6;
import p148g.p189d.p190a.p232c.p241f.p247f.C4684n0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4701o0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4714ob;
import p148g.p189d.p190a.p232c.p241f.p247f.C4850x0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4867y0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4888z0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: com.google.android.gms.measurement.internal.ba */
public final class C1740ba extends C1967u9 {
    C1740ba(C2003x9 x9Var) {
        super(x9Var);
    }

    /* renamed from: D */
    private static String m8137D(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: E */
    static List<Long> m8138E(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: G */
    private static List<C4462b1> m8139G(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                C4462b1.C4463a g0 = C4462b1.m18758g0();
                for (String str : bundle.keySet()) {
                    C4462b1.C4463a g02 = C4462b1.m18758g0();
                    g02.mo13825B(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        g02.mo13833y(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        g02.mo13827D((String) obj);
                    } else if (obj instanceof Double) {
                        g02.mo13832x(((Double) obj).doubleValue());
                    }
                    g0.mo13834z(g02);
                }
                if (g0.mo13829F() > 0) {
                    arrayList.add((C4462b1) ((C4895z6) g0.mo14350h()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: K */
    private static void m8140K(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: L */
    private final void m8141L(StringBuilder sb, int i, C4645l0 l0Var) {
        if (l0Var != null) {
            m8140K(sb, i);
            sb.append("filter {\n");
            if (l0Var.mo14372I()) {
                m8144O(sb, i, "complement", Boolean.valueOf(l0Var.mo14373J()));
            }
            if (l0Var.mo14374K()) {
                m8144O(sb, i, "param_name", mo6705d().mo6693y(l0Var.mo14375L()));
            }
            if (l0Var.mo14368D()) {
                int i2 = i + 1;
                C4701o0 E = l0Var.mo14369E();
                if (E != null) {
                    m8140K(sb, i2);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if (E.mo14486B()) {
                        m8144O(sb, i2, "match_type", E.mo14487C().name());
                    }
                    if (E.mo14488D()) {
                        m8144O(sb, i2, "expression", E.mo14489E());
                    }
                    if (E.mo14490F()) {
                        m8144O(sb, i2, "case_sensitive", Boolean.valueOf(E.mo14491G()));
                    }
                    if (E.mo14493J() > 0) {
                        m8140K(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : E.mo14492I()) {
                            m8140K(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m8140K(sb, i2);
                    sb.append("}\n");
                }
            }
            if (l0Var.mo14370F()) {
                m8142M(sb, i + 1, "number_filter", l0Var.mo14371G());
            }
            m8140K(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: M */
    private static void m8142M(StringBuilder sb, int i, String str, C4663m0 m0Var) {
        if (m0Var != null) {
            m8140K(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (m0Var.mo14438B()) {
                m8144O(sb, i, "comparison_type", m0Var.mo14439C().name());
            }
            if (m0Var.mo14440D()) {
                m8144O(sb, i, "match_as_float", Boolean.valueOf(m0Var.mo14441E()));
            }
            if (m0Var.mo14442F()) {
                m8144O(sb, i, "comparison_value", m0Var.mo14443G());
            }
            if (m0Var.mo14444I()) {
                m8144O(sb, i, "min_comparison_value", m0Var.mo14445J());
            }
            if (m0Var.mo14446K()) {
                m8144O(sb, i, "max_comparison_value", m0Var.mo14447L());
            }
            m8140K(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: N */
    private static void m8143N(StringBuilder sb, int i, String str, C4536f1 f1Var, String str2) {
        if (f1Var != null) {
            m8140K(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (f1Var.mo14096T() != 0) {
                m8140K(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long next : f1Var.mo14095O()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (f1Var.mo14093I() != 0) {
                m8140K(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long next2 : f1Var.mo14092C()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (f1Var.mo14098Z() != 0) {
                m8140K(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C4867y0 next3 : f1Var.mo14097X()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next3.mo14741F() ? Integer.valueOf(next3.mo14742G()) : null);
                    sb.append(":");
                    sb.append(next3.mo14743I() ? Long.valueOf(next3.mo14744J()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (f1Var.mo14100b0() != 0) {
                m8140K(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C4556g1 next4 : f1Var.mo14099a0()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next4.mo14167F() ? Integer.valueOf(next4.mo14168G()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : next4.mo14169J()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m8140K(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: O */
    private static void m8144O(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m8140K(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: P */
    private final void m8145P(StringBuilder sb, int i, List<C4462b1> list) {
        if (list != null) {
            int i2 = i + 1;
            for (C4462b1 next : list) {
                if (next != null) {
                    m8140K(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (!C4714ob.m20059b() || !mo6712l().mo7415s(C1957u.f6403y0)) {
                        m8144O(sb, i2, "name", mo6705d().mo6693y(next.mo13813N()));
                        m8144O(sb, i2, "string_value", next.mo13815V());
                        m8144O(sb, i2, "int_value", next.mo13816Y() ? Long.valueOf(next.mo13817Z()) : null);
                        if (next.mo13820c0()) {
                            d = Double.valueOf(next.mo13821d0());
                        }
                        m8144O(sb, i2, "double_value", d);
                    } else {
                        m8144O(sb, i2, "name", next.mo13812M() ? mo6705d().mo6693y(next.mo13813N()) : null);
                        m8144O(sb, i2, "string_value", next.mo13814U() ? next.mo13815V() : null);
                        m8144O(sb, i2, "int_value", next.mo13816Y() ? Long.valueOf(next.mo13817Z()) : null);
                        if (next.mo13820c0()) {
                            d = Double.valueOf(next.mo13821d0());
                        }
                        m8144O(sb, i2, "double_value", d);
                        if (next.mo13823f0() > 0) {
                            m8145P(sb, i2, next.mo13822e0());
                        }
                    }
                    m8140K(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: R */
    static boolean m8146R(C1933s sVar, C1860la laVar) {
        C1658o.m7845j(sVar);
        C1658o.m7845j(laVar);
        return !TextUtils.isEmpty(laVar.f6015g) || !TextUtils.isEmpty(laVar.f6031w);
    }

    /* renamed from: S */
    static boolean m8147S(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: T */
    static boolean m8148T(List<Long> list, int i) {
        if (i >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
    }

    /* renamed from: u */
    static int m8149u(C4499d1.C4500a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.mo14002a0(); i++) {
            if (str.equals(aVar.mo14000Y(i).mo14205R())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: y */
    static C4462b1 m8150y(C4888z0 z0Var, String str) {
        for (C4462b1 next : z0Var.mo14782C()) {
            if (next.mo13813N().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: z */
    static <Builder extends C4637k8> Builder m8151z(Builder builder, byte[] bArr) throws C4636k7 {
        C4673m6 c = C4673m6.m19963c();
        if (c != null) {
            builder.mo14347H(bArr, c);
            return builder;
        }
        builder.mo14348Q(bArr);
        return builder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final String mo6746A(C4628k0 k0Var) {
        if (k0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (k0Var.mo14312G()) {
            m8144O(sb, 0, "filter_id", Integer.valueOf(k0Var.mo14313I()));
        }
        m8144O(sb, 0, "event_name", mo6705d().mo6692v(k0Var.mo14314J()));
        String D = m8137D(k0Var.mo14319O(), k0Var.mo14320P(), k0Var.mo14322T());
        if (!D.isEmpty()) {
            m8144O(sb, 0, "filter_type", D);
        }
        if (k0Var.mo14317M()) {
            m8142M(sb, 1, "event_count_filter", k0Var.mo14318N());
        }
        if (k0Var.mo14316L() > 0) {
            sb.append("  filters {\n");
            for (C4645l0 L : k0Var.mo14315K()) {
                m8141L(sb, 2, L);
            }
        }
        m8140K(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final String mo6747B(C4684n0 n0Var) {
        if (n0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (n0Var.mo14467D()) {
            m8144O(sb, 0, "filter_id", Integer.valueOf(n0Var.mo14468E()));
        }
        m8144O(sb, 0, "property_name", mo6705d().mo6694z(n0Var.mo14469F()));
        String D = m8137D(n0Var.mo14471I(), n0Var.mo14472J(), n0Var.mo14474L());
        if (!D.isEmpty()) {
            m8144O(sb, 0, "filter_type", D);
        }
        m8141L(sb, 1, n0Var.mo14470G());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final String mo6748C(C4481c1 c1Var) {
        if (c1Var == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C4499d1 next : c1Var.mo13871C()) {
            if (next != null) {
                m8140K(sb, 1);
                sb.append("bundle {\n");
                if (next.mo13930X()) {
                    m8144O(sb, 1, "protocol_version", Integer.valueOf(next.mo13963y0()));
                }
                m8144O(sb, 1, "platform", next.mo13914L2());
                if (next.mo13929W2()) {
                    m8144O(sb, 1, "gmp_version", Long.valueOf(next.mo13931Y()));
                }
                if (next.mo13932Z()) {
                    m8144O(sb, 1, "uploading_gmp_version", Long.valueOf(next.mo13933a0()));
                }
                if (next.mo13912K0()) {
                    m8144O(sb, 1, "dynamite_version", Long.valueOf(next.mo13913L0()));
                }
                if (next.mo13954s0()) {
                    m8144O(sb, 1, "config_version", Long.valueOf(next.mo13955t0()));
                }
                m8144O(sb, 1, "gmp_app_id", next.mo13945k0());
                m8144O(sb, 1, "admob_app_id", next.mo13911J0());
                m8144O(sb, 1, "app_id", next.mo13926U2());
                m8144O(sb, 1, "app_version", next.mo13928V2());
                if (next.mo13951p0()) {
                    m8144O(sb, 1, "app_version_major", Integer.valueOf(next.mo13952q0()));
                }
                m8144O(sb, 1, "firebase_instance_id", next.mo13950o0());
                if (next.mo13938f0()) {
                    m8144O(sb, 1, "dev_cert_hash", Long.valueOf(next.mo13939g0()));
                }
                m8144O(sb, 1, "app_store", next.mo13924T2());
                if (next.mo13923T1()) {
                    m8144O(sb, 1, "upload_timestamp_millis", Long.valueOf(next.mo13925U1()));
                }
                if (next.mo13941h2()) {
                    m8144O(sb, 1, "start_timestamp_millis", Long.valueOf(next.mo13943i2()));
                }
                if (next.mo13956t2()) {
                    m8144O(sb, 1, "end_timestamp_millis", Long.valueOf(next.mo13958u2()));
                }
                if (next.mo13905B2()) {
                    m8144O(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.mo13906C2()));
                }
                if (next.mo13908H2()) {
                    m8144O(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.mo13910I2()));
                }
                m8144O(sb, 1, "app_instance_id", next.mo13937e0());
                m8144O(sb, 1, "resettable_device_id", next.mo13934b0());
                m8144O(sb, 1, "device_id", next.mo13953r0());
                m8144O(sb, 1, "ds_id", next.mo13960w0());
                if (next.mo13935c0()) {
                    m8144O(sb, 1, "limited_ad_tracking", Boolean.valueOf(next.mo13936d0()));
                }
                m8144O(sb, 1, "os_version", next.mo13918O2());
                m8144O(sb, 1, "device_model", next.mo13919P2());
                m8144O(sb, 1, "user_default_language", next.mo13920Q2());
                if (next.mo13921R2()) {
                    m8144O(sb, 1, "time_zone_offset_minutes", Integer.valueOf(next.mo13922S2()));
                }
                if (next.mo13940h0()) {
                    m8144O(sb, 1, "bundle_sequential_index", Integer.valueOf(next.mo13942i0()));
                }
                if (next.mo13946l0()) {
                    m8144O(sb, 1, "service_upload", Boolean.valueOf(next.mo13947m0()));
                }
                m8144O(sb, 1, "health_monitor", next.mo13944j0());
                if (!mo6712l().mo7415s(C1957u.f6320G0) && next.mo13957u0() && next.mo13959v0() != 0) {
                    m8144O(sb, 1, "android_id", Long.valueOf(next.mo13959v0()));
                }
                if (next.mo13962x0()) {
                    m8144O(sb, 1, "retry_counter", Integer.valueOf(next.mo13909I0()));
                }
                if (next.mo13916N0()) {
                    m8144O(sb, 1, "consent_signals", next.mo13917O0());
                }
                List<C4574h1> w1 = next.mo13961w1();
                if (w1 != null) {
                    for (C4574h1 next2 : w1) {
                        if (next2 != null) {
                            m8140K(sb, 2);
                            sb.append("user_property {\n");
                            Double d = null;
                            m8144O(sb, 2, "set_timestamp_millis", next2.mo14203J() ? Long.valueOf(next2.mo14204K()) : null);
                            m8144O(sb, 2, "name", mo6705d().mo6694z(next2.mo14205R()));
                            m8144O(sb, 2, "string_value", next2.mo14207V());
                            m8144O(sb, 2, "int_value", next2.mo14208W() ? Long.valueOf(next2.mo14209X()) : null);
                            if (next2.mo14210Y()) {
                                d = Double.valueOf(next2.mo14211Z());
                            }
                            m8144O(sb, 2, "double_value", d);
                            m8140K(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C4850x0> n0 = next.mo13949n0();
                String U2 = next.mo13926U2();
                if (n0 != null) {
                    for (C4850x0 next3 : n0) {
                        if (next3 != null) {
                            m8140K(sb, 2);
                            sb.append("audience_membership {\n");
                            if (next3.mo14717I()) {
                                m8144O(sb, 2, "audience_id", Integer.valueOf(next3.mo14718J()));
                            }
                            if (next3.mo14722P()) {
                                m8144O(sb, 2, "new_audience", Boolean.valueOf(next3.mo14723R()));
                            }
                            m8143N(sb, 2, "current_data", next3.mo14719M(), U2);
                            if (next3.mo14720N()) {
                                m8143N(sb, 2, "previous_data", next3.mo14721O(), U2);
                            }
                            m8140K(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C4888z0> V0 = next.mo13927V0();
                if (V0 != null) {
                    for (C4888z0 next4 : V0) {
                        if (next4 != null) {
                            m8140K(sb, 2);
                            sb.append("event {\n");
                            m8144O(sb, 2, "name", mo6705d().mo6692v(next4.mo14784W()));
                            if (next4.mo14785X()) {
                                m8144O(sb, 2, "timestamp_millis", Long.valueOf(next4.mo14786Y()));
                            }
                            if (next4.mo14787Z()) {
                                m8144O(sb, 2, "previous_timestamp_millis", Long.valueOf(next4.mo14788a0()));
                            }
                            if (next4.mo14789b0()) {
                                m8144O(sb, 2, "count", Integer.valueOf(next4.mo14790c0()));
                            }
                            if (next4.mo14783R() != 0) {
                                m8145P(sb, 2, next4.mo14782C());
                            }
                            m8140K(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m8140K(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final List<Long> mo6749F(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                mo6709i().mo6767H().mo6886b("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    mo6709i().mo6767H().mo6887c("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (next.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo6750H(C4888z0.C4889a aVar, String str, Object obj) {
        List<C4462b1> E = aVar.mo14795E();
        int i = 0;
        while (true) {
            if (i >= E.size()) {
                i = -1;
                break;
            } else if (str.equals(E.get(i).mo13813N())) {
                break;
            } else {
                i++;
            }
        }
        C4462b1.C4463a g0 = C4462b1.m18758g0();
        g0.mo13825B(str);
        if (obj instanceof Long) {
            g0.mo13833y(((Long) obj).longValue());
        } else if (obj instanceof String) {
            g0.mo13827D((String) obj);
        } else if (obj instanceof Double) {
            g0.mo13832x(((Double) obj).doubleValue());
        } else if (C4714ob.m20059b() && mo6712l().mo7415s(C1957u.f6308A0) && (obj instanceof Bundle[])) {
            g0.mo13824A(m8139G((Bundle[]) obj));
        }
        if (i >= 0) {
            aVar.mo14803v(i, g0);
        } else {
            aVar.mo14806z(g0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo6751I(C4462b1.C4463a aVar, Object obj) {
        C1658o.m7845j(obj);
        aVar.mo13831v();
        aVar.mo13826C();
        aVar.mo13828E();
        aVar.mo13830G();
        if (obj instanceof String) {
            aVar.mo13827D((String) obj);
        } else if (obj instanceof Long) {
            aVar.mo13833y(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.mo13832x(((Double) obj).doubleValue());
        } else if (!C4714ob.m20059b() || !mo6712l().mo7415s(C1957u.f6308A0) || !(obj instanceof Bundle[])) {
            mo6709i().mo6764E().mo6886b("Ignoring invalid (type) event param value", obj);
        } else {
            aVar.mo13824A(m8139G((Bundle[]) obj));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo6752J(C4574h1.C4575a aVar, Object obj) {
        C1658o.m7845j(obj);
        aVar.mo14216v();
        aVar.mo14212A();
        aVar.mo14215D();
        if (obj instanceof String) {
            aVar.mo14214C((String) obj);
        } else if (obj instanceof Long) {
            aVar.mo14213B(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.mo14217x(((Double) obj).doubleValue());
        } else {
            mo6709i().mo6764E().mo6886b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean mo6753Q(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo6708g().mo6587c() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final Object mo6754U(C4888z0 z0Var, String str) {
        C4462b1 y = m8150y(z0Var, str);
        if (y == null) {
            return null;
        }
        if (y.mo13814U()) {
            return y.mo13815V();
        }
        if (y.mo13816Y()) {
            return Long.valueOf(y.mo13817Z());
        }
        if (y.mo13820c0()) {
            return Double.valueOf(y.mo13821d0());
        }
        if (!C4714ob.m20059b() || !mo6712l().mo7415s(C1957u.f6308A0) || y.mo13823f0() <= 0) {
            return null;
        }
        List<C4462b1> e0 = y.mo13822e0();
        ArrayList arrayList = new ArrayList();
        for (C4462b1 next : e0) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (C4462b1 next2 : next.mo13822e0()) {
                    if (next2.mo13814U()) {
                        bundle.putString(next2.mo13813N(), next2.mo13815V());
                    } else if (next2.mo13816Y()) {
                        bundle.putLong(next2.mo13813N(), next2.mo13817Z());
                    } else if (next2.mo13820c0()) {
                        bundle.putDouble(next2.mo13813N(), next2.mo13821d0());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final byte[] mo6755V(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            mo6709i().mo6764E().mo6886b("Failed to ungzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final byte[] mo6756W(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo6709i().mo6764E().mo6886b("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final List<Integer> mo6757X() {
        Map<String, String> c = C1957u.m8939c(this.f6476b.mo6710j());
        if (c == null || c.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = C1957u.f6337P.mo7323a(null).intValue();
        Iterator<Map.Entry<String, String>> it = c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((String) next.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            mo6709i().mo6767H().mo6886b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo6709i().mo6767H().mo6886b("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo6730t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final long mo6758v(byte[] bArr) {
        C1658o.m7845j(bArr);
        mo6707f().mo6700b();
        MessageDigest J0 = C1788fa.m8450J0();
        if (J0 != null) {
            return C1788fa.m8474z(J0.digest(bArr));
        }
        mo6709i().mo6764E().mo6885a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo6709i().mo6764E().mo6885a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo6759w(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.c4 r5 = r4.mo6709i()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.e4 r5 = r5.mo6764E()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo6885a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1740ba.mo6759w(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final C4888z0 mo6760x(C1849l lVar) {
        C4888z0.C4889a d0 = C4888z0.m20752d0();
        d0.mo14798I(lVar.f5981e);
        Iterator<String> it = lVar.f5982f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            C4462b1.C4463a g0 = C4462b1.m18758g0();
            g0.mo13825B(next);
            mo6751I(g0, lVar.f5982f.mo7244h(next));
            d0.mo14806z(g0);
        }
        return (C4888z0) ((C4895z6) d0.mo14350h());
    }
}
