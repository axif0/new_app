package com.google.android.play.core.common;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.common.d */
public final class C2437d {

    /* renamed from: a */
    private final Map<String, Object> f8068a = new HashMap();

    /* renamed from: a */
    public final synchronized void mo9278a(Bundle bundle) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && this.f8068a.get(str) == null) {
                this.f8068a.put(str, obj);
            }
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo9279b() {
        Object obj = this.f8068a.get("usingExtractorStream");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
