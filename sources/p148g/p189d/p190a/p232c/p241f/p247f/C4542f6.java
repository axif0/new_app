package p148g.p189d.p190a.p232c.p241f.p247f;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: g.d.a.c.f.f.f6 */
public final class C4542f6 {

    /* renamed from: b */
    private static final Method f14092b = m19402c();

    /* renamed from: c */
    private static final Method f14093c = m19403d();

    /* renamed from: a */
    private final JobScheduler f14094a;

    private C4542f6(JobScheduler jobScheduler) {
        this.f14094a = jobScheduler;
    }

    /* renamed from: a */
    private final int m19400a(JobInfo jobInfo, String str, int i, String str2) {
        Method method = f14092b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f14094a, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.f14094a.schedule(jobInfo);
    }

    /* renamed from: b */
    public static int m19401b(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return (f14092b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new C4542f6(jobScheduler).m19400a(jobInfo, str, m19404e(), str2);
    }

    /* renamed from: c */
    private static Method m19402c() {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, cls, Integer.TYPE, cls});
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }

    /* renamed from: d */
    private static Method m19403d() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", (Class[]) null);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    private static int m19404e() {
        Method method = f14093c;
        if (method != null) {
            try {
                return ((Integer) method.invoke((Object) null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }
}
