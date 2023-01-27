package p148g.p189d.p190a.p232c.p241f.p247f;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* renamed from: g.d.a.c.f.f.p1 */
public class C4720p1 {

    /* renamed from: a */
    private static UserManager f14361a;

    /* renamed from: b */
    private static volatile boolean f14362b = (!m20074a());

    private C4720p1() {
    }

    /* renamed from: a */
    public static boolean m20074a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: b */
    public static boolean m20075b(Context context) {
        return !m20074a() || m20077d(context);
    }

    @TargetApi(24)
    /* renamed from: c */
    private static boolean m20076c(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (f14361a == null) {
                f14361a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f14361a;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
                z = z2;
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                f14361a = null;
                i++;
            }
        }
        if (z) {
            f14361a = null;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        return r3;
     */
    @android.annotation.TargetApi(24)
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m20077d(android.content.Context r3) {
        /*
            boolean r0 = f14362b
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<g.d.a.c.f.f.p1> r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4720p1.class
            monitor-enter(r0)
            boolean r2 = f14362b     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x000f:
            boolean r3 = m20076c(r3)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            f14362b = r3     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r3
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4720p1.m20077d(android.content.Context):boolean");
    }
}
