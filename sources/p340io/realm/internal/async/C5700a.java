package p340io.realm.internal.async;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import p340io.realm.C5652e0;

/* renamed from: io.realm.internal.async.a */
public final class C5700a implements C5652e0 {

    /* renamed from: a */
    private final Future<?> f16485a;

    /* renamed from: b */
    private final ThreadPoolExecutor f16486b;

    /* renamed from: c */
    private volatile boolean f16487c = false;

    public C5700a(Future<?> future, ThreadPoolExecutor threadPoolExecutor) {
        this.f16485a = future;
        this.f16486b = threadPoolExecutor;
    }

    public void cancel() {
        this.f16485a.cancel(true);
        this.f16487c = true;
        this.f16486b.getQueue().remove(this.f16485a);
    }

    public boolean isCancelled() {
        return this.f16487c;
    }
}
