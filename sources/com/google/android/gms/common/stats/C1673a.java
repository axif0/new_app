package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C1681d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.a */
public class C1673a {

    /* renamed from: a */
    private static final Object f5560a = new Object();

    /* renamed from: b */
    private static volatile C1673a f5561b;

    private C1673a() {
        List list = Collections.EMPTY_LIST;
    }

    /* renamed from: b */
    public static C1673a m7920b() {
        if (f5561b == null) {
            synchronized (f5560a) {
                if (f5561b == null) {
                    f5561b = new C1673a();
                }
            }
        }
        return f5561b;
    }

    /* renamed from: a */
    public boolean mo6578a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo6580d(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: c */
    public void mo6579c(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    /* renamed from: d */
    public final boolean mo6580d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : C1681d.m7937a(context, component.getPackageName()))) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
