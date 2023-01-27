package p086f.p135n.p136a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* renamed from: f.n.a.a */
public abstract class C3457a extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<PowerManager.WakeLock> f10852a = new SparseArray<>();

    /* renamed from: b */
    private static int f10853b = 1;

    /* renamed from: b */
    public static boolean m14936b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f10852a) {
            PowerManager.WakeLock wakeLock = f10852a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f10852a.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    /* renamed from: c */
    public static ComponentName m14937c(Context context, Intent intent) {
        synchronized (f10852a) {
            int i = f10853b;
            int i2 = f10853b + 1;
            f10853b = i2;
            if (i2 <= 0) {
                f10853b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f10852a.put(i, newWakeLock);
            return startService;
        }
    }
}
