package p148g.p189d.p190a.p271e.p272a.p273a;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.play.core.common.C2434a;

/* renamed from: g.d.a.e.a.a.g */
final class C5065g implements C2434a {

    /* renamed from: a */
    final /* synthetic */ Activity f15071a;

    C5065g(Activity activity) {
        this.f15071a = activity;
    }

    /* renamed from: a */
    public final void mo9277a(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.f15071a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
