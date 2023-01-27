package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C0710e;
import androidx.lifecycle.C0732r;

/* renamed from: androidx.lifecycle.q */
public class C0727q implements C0717i {

    /* renamed from: n */
    private static final C0727q f2977n = new C0727q();

    /* renamed from: f */
    private int f2978f = 0;

    /* renamed from: g */
    private int f2979g = 0;

    /* renamed from: h */
    private boolean f2980h = true;

    /* renamed from: i */
    private boolean f2981i = true;

    /* renamed from: j */
    private Handler f2982j;

    /* renamed from: k */
    private final C0718j f2983k = new C0718j(this);

    /* renamed from: l */
    private Runnable f2984l = new C0728a();

    /* renamed from: m */
    C0732r.C0733a f2985m = new C0729b();

    /* renamed from: androidx.lifecycle.q$a */
    class C0728a implements Runnable {
        C0728a() {
        }

        public void run() {
            C0727q.this.mo3682i();
            C0727q.this.mo3683j();
        }
    }

    /* renamed from: androidx.lifecycle.q$b */
    class C0729b implements C0732r.C0733a {
        C0729b() {
        }

        /* renamed from: a */
        public void mo3685a() {
            C0727q.this.mo3679f();
        }

        /* renamed from: b */
        public void mo3686b() {
        }

        /* renamed from: c */
        public void mo3687c() {
            C0727q.this.mo3678e();
        }
    }

    /* renamed from: androidx.lifecycle.q$c */
    class C0730c extends C0707b {

        /* renamed from: androidx.lifecycle.q$c$a */
        class C0731a extends C0707b {
            C0731a() {
            }

            public void onActivityPostResumed(Activity activity) {
                C0727q.this.mo3678e();
            }

            public void onActivityPostStarted(Activity activity) {
                C0727q.this.mo3679f();
            }
        }

        C0730c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                C0732r.m3656f(activity).mo3691h(C0727q.this.f2985m);
            }
        }

        public void onActivityPaused(Activity activity) {
            C0727q.this.mo3677b();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C0731a());
        }

        public void onActivityStopped(Activity activity) {
            C0727q.this.mo3680g();
        }
    }

    private C0727q() {
    }

    /* renamed from: k */
    static void m3639k(Context context) {
        f2977n.mo3681h(context);
    }

    /* renamed from: a */
    public C0710e mo720a() {
        return this.f2983k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3677b() {
        int i = this.f2979g - 1;
        this.f2979g = i;
        if (i == 0) {
            this.f2982j.postDelayed(this.f2984l, 700);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3678e() {
        int i = this.f2979g + 1;
        this.f2979g = i;
        if (i != 1) {
            return;
        }
        if (this.f2980h) {
            this.f2983k.mo3671i(C0710e.C0711a.ON_RESUME);
            this.f2980h = false;
            return;
        }
        this.f2982j.removeCallbacks(this.f2984l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3679f() {
        int i = this.f2978f + 1;
        this.f2978f = i;
        if (i == 1 && this.f2981i) {
            this.f2983k.mo3671i(C0710e.C0711a.ON_START);
            this.f2981i = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3680g() {
        this.f2978f--;
        mo3683j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3681h(Context context) {
        this.f2982j = new Handler();
        this.f2983k.mo3671i(C0710e.C0711a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0730c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3682i() {
        if (this.f2979g == 0) {
            this.f2980h = true;
            this.f2983k.mo3671i(C0710e.C0711a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3683j() {
        if (this.f2978f == 0 && this.f2980h) {
            this.f2983k.mo3671i(C0710e.C0711a.ON_STOP);
            this.f2981i = true;
        }
    }
}
