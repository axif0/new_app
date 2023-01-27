package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.d */
public abstract class C2332d {
    /* renamed from: a */
    public static C2332d m10854a(long j, Map<String, C2327c> map) {
        return new C2358i0(j, map);
    }

    /* renamed from: b */
    public static C2332d m10855b(Bundle bundle, C2427y0 y0Var) {
        return m10856c(bundle, y0Var, new ArrayList());
    }

    /* renamed from: c */
    public static C2332d m10856c(Bundle bundle, C2427y0 y0Var, List<String> list) {
        return m10857d(bundle, y0Var, list, C2323b0.f7718a);
    }

    /* renamed from: d */
    private static C2332d m10857d(Bundle bundle, C2427y0 y0Var, List<String> list, C2430z zVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, C2327c.m10810b(bundle, str, y0Var, zVar));
        }
        for (String next : list) {
            hashMap.put(next, C2327c.m10811c(next, 4, 0, 0, 0, 0.0d, 1));
        }
        return m10854a(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    /* renamed from: e */
    public abstract Map<String, C2327c> mo9136e();

    /* renamed from: f */
    public abstract long mo9137f();
}
