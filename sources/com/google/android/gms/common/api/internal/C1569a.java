package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C1689l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.a */
public final class C1569a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: j */
    private static final C1569a f5335j = new C1569a();

    /* renamed from: f */
    private final AtomicBoolean f5336f = new AtomicBoolean();

    /* renamed from: g */
    private final AtomicBoolean f5337g = new AtomicBoolean();

    /* renamed from: h */
    private final ArrayList<C1570a> f5338h = new ArrayList<>();

    /* renamed from: i */
    private boolean f5339i = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a */
    public interface C1570a {
        /* renamed from: a */
        void mo6374a(boolean z);
    }

    private C1569a() {
    }

    /* renamed from: b */
    public static C1569a m7543b() {
        return f5335j;
    }

    /* renamed from: c */
    public static void m7544c(Application application) {
        synchronized (f5335j) {
            if (!f5335j.f5339i) {
                application.registerActivityLifecycleCallbacks(f5335j);
                application.registerComponentCallbacks(f5335j);
                f5335j.f5339i = true;
            }
        }
    }

    /* renamed from: e */
    private final void m7545e(boolean z) {
        synchronized (f5335j) {
            ArrayList<C1570a> arrayList = this.f5338h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                C1570a aVar = arrayList.get(i);
                i++;
                aVar.mo6374a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo6361a(C1570a aVar) {
        synchronized (f5335j) {
            this.f5338h.add(aVar);
        }
    }

    /* renamed from: d */
    public final boolean mo6362d() {
        return this.f5336f.get();
    }

    @TargetApi(16)
    /* renamed from: f */
    public final boolean mo6363f(boolean z) {
        if (!this.f5337g.get()) {
            if (!C1689l.m7960c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f5337g.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f5336f.set(true);
            }
        }
        return mo6362d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f5336f.compareAndSet(true, false);
        this.f5337g.set(true);
        if (compareAndSet) {
            m7545e(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f5336f.compareAndSet(true, false);
        this.f5337g.set(true);
        if (compareAndSet) {
            m7545e(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f5336f.compareAndSet(false, true)) {
            this.f5337g.set(true);
            m7545e(true);
        }
    }
}
