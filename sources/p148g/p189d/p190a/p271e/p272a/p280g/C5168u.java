package p148g.p189d.p190a.p271e.p272a.p280g;

import java.util.concurrent.CountDownLatch;

/* renamed from: g.d.a.e.a.g.u */
final class C5168u implements C5150c, C5149b {

    /* renamed from: a */
    private final CountDownLatch f15201a = new CountDownLatch(1);

    /* synthetic */ C5168u(byte[] bArr) {
    }

    /* renamed from: a */
    public final void mo15272a() throws InterruptedException {
        this.f15201a.await();
    }

    /* renamed from: b */
    public final void mo334b(Object obj) {
        this.f15201a.countDown();
    }

    /* renamed from: c */
    public final void mo390c(Exception exc) {
        this.f15201a.countDown();
    }
}
