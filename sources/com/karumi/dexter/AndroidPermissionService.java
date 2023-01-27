package com.karumi.dexter;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.app.C0559a;
import p086f.p111h.p112e.C3268b;

class AndroidPermissionService {
    AndroidPermissionService() {
    }

    /* access modifiers changed from: package-private */
    public int checkSelfPermission(Context context, String str) {
        return C3268b.m14082b(context, str);
    }

    /* access modifiers changed from: package-private */
    public boolean isPermissionPermanentlyDenied(Activity activity, String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return !shouldShowRequestPermissionRationale(activity, str);
    }

    /* access modifiers changed from: package-private */
    public void requestPermissions(Activity activity, String[] strArr, int i) {
        if (activity != null) {
            C0559a.m2638n(activity, strArr, i);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        if (activity == null) {
            return false;
        }
        return C0559a.m2639o(activity, str);
    }
}
