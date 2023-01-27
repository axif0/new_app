package com.google.android.datatransport.cct.p034b;

import android.util.SparseArray;
import com.google.android.datatransport.cct.p034b.C1457j;

/* renamed from: com.google.android.datatransport.cct.b.u */
public abstract class C1474u {

    /* renamed from: com.google.android.datatransport.cct.b.u$a */
    public static abstract class C1475a {
        /* renamed from: a */
        public abstract C1475a mo6105a(C1476b bVar);

        /* renamed from: b */
        public abstract C1475a mo6106b(C1477c cVar);

        /* renamed from: c */
        public abstract C1474u mo6107c();
    }

    /* renamed from: com.google.android.datatransport.cct.b.u$b */
    public enum C1476b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: B */
        private static final SparseArray<C1476b> f4992B = null;

        /* renamed from: f */
        private final int f5013f;

        static {
            UNKNOWN_MOBILE_SUBTYPE = new C1476b("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
            GPRS = new C1476b("GPRS", 1, 1);
            EDGE = new C1476b("EDGE", 2, 2);
            UMTS = new C1476b("UMTS", 3, 3);
            CDMA = new C1476b("CDMA", 4, 4);
            EVDO_0 = new C1476b("EVDO_0", 5, 5);
            EVDO_A = new C1476b("EVDO_A", 6, 6);
            RTT = new C1476b("RTT", 7, 7);
            HSDPA = new C1476b("HSDPA", 8, 8);
            HSUPA = new C1476b("HSUPA", 9, 9);
            HSPA = new C1476b("HSPA", 10, 10);
            IDEN = new C1476b("IDEN", 11, 11);
            EVDO_B = new C1476b("EVDO_B", 12, 12);
            LTE = new C1476b("LTE", 13, 13);
            EHRPD = new C1476b("EHRPD", 14, 14);
            HSPAP = new C1476b("HSPAP", 15, 15);
            GSM = new C1476b("GSM", 16, 16);
            TD_SCDMA = new C1476b("TD_SCDMA", 17, 17);
            IWLAN = new C1476b("IWLAN", 18, 18);
            LTE_CA = new C1476b("LTE_CA", 19, 19);
            COMBINED = new C1476b("COMBINED", 20, 100);
            SparseArray<C1476b> sparseArray = new SparseArray<>();
            f4992B = sparseArray;
            sparseArray.put(0, UNKNOWN_MOBILE_SUBTYPE);
            f4992B.put(1, GPRS);
            f4992B.put(2, EDGE);
            f4992B.put(3, UMTS);
            f4992B.put(4, CDMA);
            f4992B.put(5, EVDO_0);
            f4992B.put(6, EVDO_A);
            f4992B.put(7, RTT);
            f4992B.put(8, HSDPA);
            f4992B.put(9, HSUPA);
            f4992B.put(10, HSPA);
            f4992B.put(11, IDEN);
            f4992B.put(12, EVDO_B);
            f4992B.put(13, LTE);
            f4992B.put(14, EHRPD);
            f4992B.put(15, HSPAP);
            f4992B.put(16, GSM);
            f4992B.put(17, TD_SCDMA);
            f4992B.put(18, IWLAN);
            f4992B.put(19, LTE_CA);
        }

        private C1476b(int i) {
            this.f5013f = i;
        }

        /* renamed from: e */
        public static C1476b m7227e(int i) {
            return f4992B.get(i);
        }

        /* renamed from: a */
        public int mo6110a() {
            return this.f5013f;
        }
    }

    /* renamed from: com.google.android.datatransport.cct.b.u$c */
    public enum C1477c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: z */
        private static final SparseArray<C1477c> f5033z = null;

        /* renamed from: f */
        private final int f5034f;

        static {
            MOBILE = new C1477c("MOBILE", 0, 0);
            WIFI = new C1477c("WIFI", 1, 1);
            MOBILE_MMS = new C1477c("MOBILE_MMS", 2, 2);
            MOBILE_SUPL = new C1477c("MOBILE_SUPL", 3, 3);
            MOBILE_DUN = new C1477c("MOBILE_DUN", 4, 4);
            MOBILE_HIPRI = new C1477c("MOBILE_HIPRI", 5, 5);
            WIMAX = new C1477c("WIMAX", 6, 6);
            BLUETOOTH = new C1477c("BLUETOOTH", 7, 7);
            DUMMY = new C1477c("DUMMY", 8, 8);
            ETHERNET = new C1477c("ETHERNET", 9, 9);
            MOBILE_FOTA = new C1477c("MOBILE_FOTA", 10, 10);
            MOBILE_IMS = new C1477c("MOBILE_IMS", 11, 11);
            MOBILE_CBS = new C1477c("MOBILE_CBS", 12, 12);
            WIFI_P2P = new C1477c("WIFI_P2P", 13, 13);
            MOBILE_IA = new C1477c("MOBILE_IA", 14, 14);
            MOBILE_EMERGENCY = new C1477c("MOBILE_EMERGENCY", 15, 15);
            PROXY = new C1477c("PROXY", 16, 16);
            VPN = new C1477c("VPN", 17, 17);
            NONE = new C1477c("NONE", 18, -1);
            SparseArray<C1477c> sparseArray = new SparseArray<>();
            f5033z = sparseArray;
            sparseArray.put(0, MOBILE);
            f5033z.put(1, WIFI);
            f5033z.put(2, MOBILE_MMS);
            f5033z.put(3, MOBILE_SUPL);
            f5033z.put(4, MOBILE_DUN);
            f5033z.put(5, MOBILE_HIPRI);
            f5033z.put(6, WIMAX);
            f5033z.put(7, BLUETOOTH);
            f5033z.put(8, DUMMY);
            f5033z.put(9, ETHERNET);
            f5033z.put(10, MOBILE_FOTA);
            f5033z.put(11, MOBILE_IMS);
            f5033z.put(12, MOBILE_CBS);
            f5033z.put(13, WIFI_P2P);
            f5033z.put(14, MOBILE_IA);
            f5033z.put(15, MOBILE_EMERGENCY);
            f5033z.put(16, PROXY);
            f5033z.put(17, VPN);
            f5033z.put(-1, NONE);
        }

        private C1477c(int i) {
            this.f5034f = i;
        }

        /* renamed from: e */
        public static C1477c m7229e(int i) {
            return f5033z.get(i);
        }

        /* renamed from: a */
        public int mo6111a() {
            return this.f5034f;
        }
    }

    /* renamed from: a */
    public static C1475a m7223a() {
        return new C1457j.C1459b();
    }
}
