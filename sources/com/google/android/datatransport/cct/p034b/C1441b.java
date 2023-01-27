package com.google.android.datatransport.cct.p034b;

import android.util.SparseArray;

/* renamed from: com.google.android.datatransport.cct.b.b */
public enum C1441b {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: l */
    private static final SparseArray<C1441b> f4934l = null;

    static {
        DEFAULT = new C1441b("DEFAULT", 0, 0);
        UNMETERED_ONLY = new C1441b("UNMETERED_ONLY", 1, 1);
        UNMETERED_OR_DAILY = new C1441b("UNMETERED_OR_DAILY", 2, 2);
        FAST_IF_RADIO_AWAKE = new C1441b("FAST_IF_RADIO_AWAKE", 3, 3);
        NEVER = new C1441b("NEVER", 4, 4);
        UNRECOGNIZED = new C1441b("UNRECOGNIZED", 5, -1);
        SparseArray<C1441b> sparseArray = new SparseArray<>();
        f4934l = sparseArray;
        sparseArray.put(0, DEFAULT);
        f4934l.put(1, UNMETERED_ONLY);
        f4934l.put(2, UNMETERED_OR_DAILY);
        f4934l.put(3, FAST_IF_RADIO_AWAKE);
        f4934l.put(4, NEVER);
        f4934l.put(-1, UNRECOGNIZED);
    }

    private C1441b(int i) {
    }
}
