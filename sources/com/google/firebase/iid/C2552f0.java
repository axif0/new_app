package com.google.firebase.iid;

import java.util.concurrent.ScheduledFuture;
import p148g.p189d.p190a.p232c.p251i.C4933c;
import p148g.p189d.p190a.p232c.p251i.C4940h;

/* renamed from: com.google.firebase.iid.f0 */
final /* synthetic */ class C2552f0 implements C4933c {

    /* renamed from: a */
    private final ScheduledFuture f8266a;

    C2552f0(ScheduledFuture scheduledFuture) {
        this.f8266a = scheduledFuture;
    }

    /* renamed from: a */
    public final void mo9440a(C4940h hVar) {
        this.f8266a.cancel(false);
    }
}
