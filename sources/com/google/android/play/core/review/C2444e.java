package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import p148g.p189d.p190a.p271e.p272a.p280g.C5152e;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.review.e */
public final class C2444e implements C2440a {

    /* renamed from: a */
    private final C2449j f8072a;

    /* renamed from: b */
    private final Handler f8073b = new Handler(Looper.getMainLooper());

    C2444e(C2449j jVar) {
        this.f8072a = jVar;
    }

    /* renamed from: a */
    public final C5152e<Void> mo9285a(Activity activity, ReviewInfo reviewInfo) {
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.mo9282a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C5163p pVar = new C5163p();
        intent.putExtra("result_receiver", new C2443d(this.f8073b, pVar));
        activity.startActivity(intent);
        return pVar.mo15261a();
    }

    /* renamed from: b */
    public final C5152e<ReviewInfo> mo9286b() {
        return this.f8072a.mo9292a();
    }
}
