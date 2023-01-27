package com.bumptech.glide.p029s;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.s.e */
public final class C1394e {

    /* renamed from: a */
    private static final Executor f4787a = new C1395a();

    /* renamed from: b */
    private static final Executor f4788b = new C1396b();

    /* renamed from: com.bumptech.glide.s.e$a */
    class C1395a implements Executor {

        /* renamed from: a */
        private final Handler f4789a = new Handler(Looper.getMainLooper());

        C1395a() {
        }

        public void execute(Runnable runnable) {
            this.f4789a.post(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.s.e$b */
    class C1396b implements Executor {
        C1396b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m6953a() {
        return f4788b;
    }

    /* renamed from: b */
    public static Executor m6954b() {
        return f4787a;
    }
}
