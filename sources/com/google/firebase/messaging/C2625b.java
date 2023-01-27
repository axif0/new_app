package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import p086f.p102e.C3190a;

/* renamed from: com.google.firebase.messaging.b */
public final class C2625b {

    /* renamed from: a */
    public static final long f8426a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.b$a */
    public static final class C2626a {
        /* renamed from: a */
        public static C3190a<String, String> m11695a(Bundle bundle) {
            C3190a<String, String> aVar = new C3190a<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            return aVar;
        }
    }
}
