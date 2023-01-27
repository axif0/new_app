package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import p148g.p189d.p190a.p232c.p236c.C4332a;
import p148g.p189d.p190a.p232c.p236c.C4334b;
import p148g.p189d.p190a.p232c.p251i.C4944k;

public final class FirebaseInstanceIdReceiver extends C4334b {
    /* renamed from: h */
    private static Intent m11389h(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo9428b(Context context, C4332a aVar) {
        try {
            return ((Integer) C4944k.m20945a(new C2551f(context).mo9444g(aVar.mo13620d()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to send message to service.", e);
            return 500;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo9429c(Context context, Bundle bundle) {
        try {
            C4944k.m20945a(new C2551f(context).mo9444g(m11389h(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle)));
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to send notification dismissed event to service.", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo9430d(Context context, Bundle bundle) {
        try {
            C4944k.m20945a(new C2551f(context).mo9444g(m11389h(context, "com.google.firebase.messaging.NOTIFICATION_OPEN", bundle)));
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to send notification open event to service.", e);
        }
    }
}
