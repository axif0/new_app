package p148g.p189d.p190a.p271e.p272a.p280g;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: g.d.a.e.a.g.s */
final class C5166s implements Executor {

    /* renamed from: a */
    private final Handler f15195a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f15195a.post(runnable);
    }
}
