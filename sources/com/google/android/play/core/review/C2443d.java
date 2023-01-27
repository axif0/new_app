package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.review.d */
final class C2443d extends ResultReceiver {

    /* renamed from: f */
    final /* synthetic */ C5163p f8071f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2443d(Handler handler, C5163p pVar) {
        super(handler);
        this.f8071f = pVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.f8071f.mo15265e(null);
    }
}
