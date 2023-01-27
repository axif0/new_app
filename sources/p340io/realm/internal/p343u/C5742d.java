package p340io.realm.internal.p343u;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p340io.realm.SyncManager;
import p340io.realm.internal.Util;

/* renamed from: io.realm.internal.u.d */
public class C5742d extends BroadcastReceiver {

    /* renamed from: a */
    private static List<C5743a> f16582a = new CopyOnWriteArrayList();

    /* renamed from: io.realm.internal.u.d$a */
    public interface C5743a {
        /* renamed from: a */
        void mo16170a(boolean z);
    }

    /* renamed from: a */
    public static void m24003a(C5743a aVar) {
        f16582a.add(aVar);
    }

    /* renamed from: b */
    public static boolean m24004b(Context context) {
        if (SyncManager.C5620d.f16205a) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) || Util.m23793f();
    }

    /* renamed from: c */
    public static synchronized void m24005c(C5743a aVar) {
        synchronized (C5742d.class) {
            f16582a.remove(aVar);
        }
    }

    public void onReceive(Context context, Intent intent) {
        boolean b = m24004b(context);
        for (C5743a a : f16582a) {
            a.mo16170a(b);
        }
    }
}
