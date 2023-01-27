package p148g.p189d.p190a.p232c.p251i;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: g.d.a.c.i.j */
public final class C4942j {

    /* renamed from: a */
    static final Executor f14758a = new C4932b0();

    /* renamed from: g.d.a.c.i.j$a */
    private static final class C4943a implements Executor {

        /* renamed from: a */
        private final Handler f14759a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f14759a.post(runnable);
        }
    }

    static {
        new C4943a();
    }
}
