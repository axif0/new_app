package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: com.google.android.play.core.assetpacks.b3 */
final class C2326b3 {

    /* renamed from: a */
    private final Context f7722a;

    public C2326b3(Context context) {
        this.f7722a = context;
    }

    /* renamed from: b */
    static String m10808b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo9105a() {
        return this.f7722a;
    }
}
