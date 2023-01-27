package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.e */
public abstract class C1633e implements DialogInterface.OnClickListener {
    /* renamed from: a */
    public static C1633e m7786a(Activity activity, Intent intent, int i) {
        return new C1667u(intent, activity, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo6528b();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo6528b();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
