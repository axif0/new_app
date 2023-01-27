package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.f */
class C0713f {

    /* renamed from: a */
    private static AtomicBoolean f2963a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.f$a */
    static class C0714a extends C0707b {
        C0714a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0732r.m3657g(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m3607a(Context context) {
        if (!f2963a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0714a());
        }
    }
}
