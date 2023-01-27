package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C0710e;

/* renamed from: androidx.lifecycle.r */
public class C0732r extends Fragment {

    /* renamed from: f */
    private C0733a f2988f;

    /* renamed from: androidx.lifecycle.r$a */
    interface C0733a {
        /* renamed from: a */
        void mo3685a();

        /* renamed from: b */
        void mo3686b();

        /* renamed from: c */
        void mo3687c();
    }

    /* renamed from: androidx.lifecycle.r$b */
    static class C0734b implements Application.ActivityLifecycleCallbacks {
        C0734b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C0732r.m3651a(activity, C0710e.C0711a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C0732r.m3651a(activity, C0710e.C0711a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C0732r.m3651a(activity, C0710e.C0711a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C0732r.m3651a(activity, C0710e.C0711a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C0732r.m3651a(activity, C0710e.C0711a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C0732r.m3651a(activity, C0710e.C0711a.ON_STOP);
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

    /* renamed from: a */
    static void m3651a(Activity activity, C0710e.C0711a aVar) {
        if (activity instanceof C0721k) {
            ((C0721k) activity).mo720a().mo3671i(aVar);
        } else if (activity instanceof C0717i) {
            C0710e a = ((C0717i) activity).mo720a();
            if (a instanceof C0718j) {
                ((C0718j) a).mo3671i(aVar);
            }
        }
    }

    /* renamed from: b */
    private void m3652b(C0710e.C0711a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m3651a(getActivity(), aVar);
        }
    }

    /* renamed from: c */
    private void m3653c(C0733a aVar) {
        if (aVar != null) {
            aVar.mo3686b();
        }
    }

    /* renamed from: d */
    private void m3654d(C0733a aVar) {
        if (aVar != null) {
            aVar.mo3687c();
        }
    }

    /* renamed from: e */
    private void m3655e(C0733a aVar) {
        if (aVar != null) {
            aVar.mo3685a();
        }
    }

    /* renamed from: f */
    static C0732r m3656f(Activity activity) {
        return (C0732r) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m3657g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new C0734b());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0732r(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3691h(C0733a aVar) {
        this.f2988f = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m3653c(this.f2988f);
        m3652b(C0710e.C0711a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m3652b(C0710e.C0711a.ON_DESTROY);
        this.f2988f = null;
    }

    public void onPause() {
        super.onPause();
        m3652b(C0710e.C0711a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m3654d(this.f2988f);
        m3652b(C0710e.C0711a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m3655e(this.f2988f);
        m3652b(C0710e.C0711a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m3652b(C0710e.C0711a.ON_STOP);
    }
}
