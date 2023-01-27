package com.bumptech.glide.p022n;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.p022n.C1326c;
import com.bumptech.glide.p029s.C1401j;

/* renamed from: com.bumptech.glide.n.e */
final class C1329e implements C1326c {

    /* renamed from: f */
    private final Context f4624f;

    /* renamed from: g */
    final C1326c.C1327a f4625g;

    /* renamed from: h */
    boolean f4626h;

    /* renamed from: i */
    private boolean f4627i;

    /* renamed from: j */
    private final BroadcastReceiver f4628j = new C1330a();

    /* renamed from: com.bumptech.glide.n.e$a */
    class C1330a extends BroadcastReceiver {
        C1330a() {
        }

        public void onReceive(Context context, Intent intent) {
            C1329e eVar = C1329e.this;
            boolean z = eVar.f4626h;
            eVar.f4626h = eVar.mo5701l(context);
            if (z != C1329e.this.f4626h) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C1329e.this.f4626h);
                }
                C1329e eVar2 = C1329e.this;
                eVar2.f4625g.mo5116a(eVar2.f4626h);
            }
        }
    }

    C1329e(Context context, C1326c.C1327a aVar) {
        this.f4624f = context.getApplicationContext();
        this.f4625g = aVar;
    }

    /* renamed from: m */
    private void m6626m() {
        if (!this.f4627i) {
            this.f4626h = mo5701l(this.f4624f);
            try {
                this.f4624f.registerReceiver(this.f4628j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f4627i = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: n */
    private void m6627n() {
        if (this.f4627i) {
            this.f4624f.unregisterReceiver(this.f4628j);
            this.f4627i = false;
        }
    }

    /* renamed from: a */
    public void mo5093a() {
        m6626m();
    }

    /* renamed from: e */
    public void mo5094e() {
        m6627n();
    }

    /* renamed from: k */
    public void mo5095k() {
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: l */
    public boolean mo5701l(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C1401j.m6972d(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }
}
