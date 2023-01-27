package com.google.android.gms.common.util;

import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.common.util.n */
public class C1691n {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    /* renamed from: a */
    public static boolean m7971a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
