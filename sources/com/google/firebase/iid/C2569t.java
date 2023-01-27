package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.C1689l;
import java.util.List;
import p148g.p189d.p281b.C5171c;

/* renamed from: com.google.firebase.iid.t */
public class C2569t {

    /* renamed from: a */
    private final Context f8301a;

    /* renamed from: b */
    private String f8302b;

    /* renamed from: c */
    private String f8303c;

    /* renamed from: d */
    private int f8304d;

    /* renamed from: e */
    private int f8305e = 0;

    public C2569t(Context context) {
        this.f8301a = context;
    }

    /* renamed from: c */
    public static String m11451c(C5171c cVar) {
        String d = cVar.mo15278j().mo15289d();
        if (d != null) {
            return d;
        }
        String c = cVar.mo15278j().mo15288c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private PackageInfo m11452f(String str) {
        try {
            return this.f8301a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m11453h() {
        PackageInfo f = m11452f(this.f8301a.getPackageName());
        if (f != null) {
            this.f8302b = Integer.toString(f.versionCode);
            this.f8303c = f.versionName;
        }
    }

    /* renamed from: a */
    public synchronized String mo9464a() {
        if (this.f8302b == null) {
            m11453h();
        }
        return this.f8302b;
    }

    /* renamed from: b */
    public synchronized String mo9465b() {
        if (this.f8303c == null) {
            m11453h();
        }
        return this.f8303c;
    }

    /* renamed from: d */
    public synchronized int mo9466d() {
        PackageInfo f;
        if (this.f8304d == 0 && (f = m11452f("com.google.android.gms")) != null) {
            this.f8304d = f.versionCode;
        }
        return this.f8304d;
    }

    /* renamed from: e */
    public synchronized int mo9467e() {
        if (this.f8305e != 0) {
            return this.f8305e;
        }
        PackageManager packageManager = this.f8301a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C1689l.m7966i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f8305e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (C1689l.m7966i()) {
                this.f8305e = 2;
            } else {
                this.f8305e = 1;
            }
            return this.f8305e;
        }
        this.f8305e = 2;
        return 2;
    }

    /* renamed from: g */
    public boolean mo9468g() {
        return mo9467e() != 0;
    }
}
