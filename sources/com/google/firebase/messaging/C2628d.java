package com.google.firebase.messaging;

import android.content.Intent;
import p148g.p189d.p190a.p232c.p251i.C4941i;

/* renamed from: com.google.firebase.messaging.d */
final /* synthetic */ class C2628d implements Runnable {

    /* renamed from: f */
    private final C2631g f8430f;

    /* renamed from: g */
    private final Intent f8431g;

    /* renamed from: h */
    private final C4941i f8432h;

    C2628d(C2631g gVar, Intent intent, C4941i iVar) {
        this.f8430f = gVar;
        this.f8431g = intent;
        this.f8432h = iVar;
    }

    public final void run() {
        this.f8430f.mo9580g(this.f8431g, this.f8432h);
    }
}
