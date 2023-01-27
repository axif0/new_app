package p370l.p371a.p372a.p373a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: l.a.a.a.a */
public abstract class C6091a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final Activity f17051f;

    C6091a(Activity activity) {
        this.f17051f = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17187a();

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        Activity activity2 = this.f17051f;
        if (activity == activity2) {
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
            mo17187a();
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
