package p340io.realm.internal.objectstore;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p340io.realm.C5765m;
import p340io.realm.C5803v;
import p340io.realm.internal.KeepMember;
import p340io.realm.internal.OsRealmConfig;

@KeepMember
/* renamed from: io.realm.internal.objectstore.OsAsyncOpenTask */
public class OsAsyncOpenTask {

    /* renamed from: a */
    private final OsRealmConfig f16526a;

    /* renamed from: b */
    private long f16527b;

    /* renamed from: c */
    private final CountDownLatch f16528c = new CountDownLatch(1);

    /* renamed from: d */
    private final AtomicReference<String> f16529d = new AtomicReference<>((Object) null);

    public OsAsyncOpenTask(OsRealmConfig osRealmConfig) {
        this.f16526a = osRealmConfig;
    }

    private native void cancel(long j);

    @KeepMember
    private void notifyError(String str) {
        this.f16529d.set(str);
        this.f16528c.countDown();
    }

    @KeepMember
    private void notifyRealmReady() {
        this.f16529d.set((Object) null);
        this.f16528c.countDown();
    }

    private native long start(long j);

    /* renamed from: a */
    public void mo16642a(long j, TimeUnit timeUnit) throws InterruptedException {
        this.f16527b = start(this.f16526a.getNativePtr());
        try {
            this.f16528c.await(j, timeUnit);
            String str = this.f16529d.get();
            if (str != null) {
                throw new C5803v(C5765m.UNKNOWN, str);
            }
        } catch (InterruptedException e) {
            cancel(this.f16527b);
            throw e;
        }
    }
}
