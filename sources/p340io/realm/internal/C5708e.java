package p340io.realm.internal;

import java.lang.ref.ReferenceQueue;
import p340io.realm.log.RealmLog;

/* renamed from: io.realm.internal.e */
class C5708e implements Runnable {

    /* renamed from: f */
    private final ReferenceQueue<C5712i> f16507f;

    C5708e(ReferenceQueue<C5712i> referenceQueue) {
        this.f16507f = referenceQueue;
    }

    public void run() {
        while (true) {
            try {
                ((NativeObjectReference) this.f16507f.remove()).mo16369e();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                RealmLog.m24080f("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
                return;
            }
        }
    }
}
