package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import p148g.p189d.p190a.p271e.p272a.p276c.C5094c;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p276c.C5120p;
import p148g.p189d.p190a.p271e.p272a.p280g.C5152e;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.review.j */
public final class C2449j {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C5100f f8080c = new C5100f("ReviewService");

    /* renamed from: a */
    final C5120p<C5094c> f8081a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f8082b;

    public C2449j(Context context) {
        this.f8082b = context.getPackageName();
        Context context2 = context;
        this.f8081a = new C5120p(context2, f8080c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), C2445f.f8074a);
    }

    /* renamed from: a */
    public final C5152e<ReviewInfo> mo9292a() {
        f8080c.mo15206f("requestInAppReview (%s)", this.f8082b);
        C5163p pVar = new C5163p();
        this.f8081a.mo15222c(new C2446g(this, pVar, pVar));
        return pVar.mo15261a();
    }
}
