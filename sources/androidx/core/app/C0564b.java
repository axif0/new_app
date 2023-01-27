package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.b */
final class C0564b {

    /* renamed from: a */
    protected static final Class<?> f2333a = m2644a();

    /* renamed from: b */
    protected static final Field f2334b = m2645b();

    /* renamed from: c */
    protected static final Field f2335c = m2649f();

    /* renamed from: d */
    protected static final Method f2336d = m2647d(f2333a);

    /* renamed from: e */
    protected static final Method f2337e = m2646c(f2333a);

    /* renamed from: f */
    protected static final Method f2338f = m2648e(f2333a);

    /* renamed from: g */
    private static final Handler f2339g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.b$a */
    class C0565a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0568d f2340f;

        /* renamed from: g */
        final /* synthetic */ Object f2341g;

        C0565a(C0568d dVar, Object obj) {
            this.f2340f = dVar;
            this.f2341g = obj;
        }

        public void run() {
            this.f2340f.f2346f = this.f2341g;
        }
    }

    /* renamed from: androidx.core.app.b$b */
    class C0566b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Application f2342f;

        /* renamed from: g */
        final /* synthetic */ C0568d f2343g;

        C0566b(Application application, C0568d dVar) {
            this.f2342f = application;
            this.f2343g = dVar;
        }

        public void run() {
            this.f2342f.unregisterActivityLifecycleCallbacks(this.f2343g);
        }
    }

    /* renamed from: androidx.core.app.b$c */
    class C0567c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f2344f;

        /* renamed from: g */
        final /* synthetic */ Object f2345g;

        C0567c(Object obj, Object obj2) {
            this.f2344f = obj;
            this.f2345g = obj2;
        }

        public void run() {
            try {
                if (C0564b.f2336d != null) {
                    C0564b.f2336d.invoke(this.f2344f, new Object[]{this.f2345g, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                C0564b.f2337e.invoke(this.f2344f, new Object[]{this.f2345g, Boolean.FALSE});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.b$d */
    private static final class C0568d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: f */
        Object f2346f;

        /* renamed from: g */
        private Activity f2347g;

        /* renamed from: h */
        private boolean f2348h = false;

        /* renamed from: i */
        private boolean f2349i = false;

        /* renamed from: j */
        private boolean f2350j = false;

        C0568d(Activity activity) {
            this.f2347g = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f2347g == activity) {
                this.f2347g = null;
                this.f2349i = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f2349i && !this.f2350j && !this.f2348h && C0564b.m2651h(this.f2346f, activity)) {
                this.f2350j = true;
                this.f2346f = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f2347g == activity) {
                this.f2348h = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    private static Class<?> m2644a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m2645b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m2646c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m2647d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m2648e(Class<?> cls) {
        if (m2650g() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m2649f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m2650g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m2651h(Object obj, Activity activity) {
        try {
            Object obj2 = f2335c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f2339g.postAtFrontOfQueue(new C0567c(f2334b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    static boolean m2652i(Activity activity) {
        Object obj;
        Application application;
        C0568d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m2650g() && f2338f == null) {
            return false;
        } else {
            if (f2337e == null && f2336d == null) {
                return false;
            }
            try {
                Object obj2 = f2335c.get(activity);
                if (obj2 == null || (obj = f2334b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0568d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                f2339g.post(new C0565a(dVar, obj2));
                if (m2650g()) {
                    f2338f.invoke(obj, new Object[]{obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE});
                } else {
                    activity.recreate();
                }
                f2339g.post(new C0566b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
