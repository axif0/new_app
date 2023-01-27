package p148g.p189d.p190a.p232c.p236c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.C1689l;
import java.util.List;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;

/* renamed from: g.d.a.c.c.v */
public final class C4359v {

    /* renamed from: a */
    private final Context f13883a;

    /* renamed from: b */
    private int f13884b;

    /* renamed from: c */
    private int f13885c = 0;

    public C4359v(Context context) {
        this.f13883a = context;
    }

    /* renamed from: b */
    private final PackageInfo m18539b(String str) {
        try {
            return C4389c.m18627a(this.f13883a).mo13717e(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("Metadata", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized int mo13666a() {
        if (this.f13885c != 0) {
            return this.f13885c;
        }
        PackageManager packageManager = this.f13883a.getPackageManager();
        if (C4389c.m18627a(this.f13883a).mo13714b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C1689l.m7966i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f13885c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (C1689l.m7966i()) {
                this.f13885c = 2;
            } else {
                this.f13885c = 1;
            }
            return this.f13885c;
        }
        this.f13885c = 2;
        return 2;
    }

    /* renamed from: c */
    public final synchronized int mo13667c() {
        PackageInfo b;
        if (this.f13884b == 0 && (b = m18539b("com.google.android.gms")) != null) {
            this.f13884b = b.versionCode;
        }
        return this.f13884b;
    }
}
