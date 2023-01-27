package com.google.android.gms.common.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.util.f */
public final class C1683f {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m7941a() {
        return Collections.emptyList();
    }

    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m7942b(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    /* renamed from: c */
    public static <T> List<T> m7943c(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : m7942b(tArr[0]) : m7941a();
    }
}
