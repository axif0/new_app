package com.google.android.play.core.common;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;

/* renamed from: com.google.android.play.core.common.c */
public class C2436c {

    /* renamed from: a */
    private static final Map<String, Map<String, Integer>> f8067a = new HashMap();

    static {
        new HashSet(Arrays.asList(new String[]{"review"}));
        new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        new C5100f("PlayCoreVersion");
    }

    /* renamed from: a */
    public static Bundle m11088a() {
        Bundle bundle = new Bundle();
        Map<String, Integer> b = m11089b("review");
        bundle.putInt("playcore_version_code", b.get("java").intValue());
        if (b.containsKey("native")) {
            bundle.putInt("playcore_native_version", b.get("native").intValue());
        }
        if (b.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", b.get("unity").intValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public static synchronized Map<String, Integer> m11089b(String str) {
        Map<String, Integer> map;
        synchronized (C2436c.class) {
            if (!f8067a.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 10802);
                f8067a.put(str, hashMap);
            }
            map = f8067a.get(str);
        }
        return map;
    }
}
