package com.google.firebase.iid;

import java.util.concurrent.CountDownLatch;
import p148g.p189d.p190a.p232c.p251i.C4933c;
import p148g.p189d.p190a.p232c.p251i.C4940h;

/* renamed from: com.google.firebase.iid.l */
final /* synthetic */ class C2561l implements C4933c {

    /* renamed from: a */
    private final CountDownLatch f8282a;

    C2561l(CountDownLatch countDownLatch) {
        this.f8282a = countDownLatch;
    }

    /* renamed from: a */
    public final void mo9440a(C4940h hVar) {
        this.f8282a.countDown();
    }
}
