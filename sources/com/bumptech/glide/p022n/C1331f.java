package com.bumptech.glide.p022n;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.p022n.C1326c;
import p086f.p111h.p112e.C3267a;

/* renamed from: com.bumptech.glide.n.f */
public class C1331f implements C1328d {
    /* renamed from: a */
    public C1326c mo5700a(Context context, C1326c.C1327a aVar) {
        boolean z = C3267a.m14071a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new C1329e(context, aVar) : new C1335j();
    }
}
