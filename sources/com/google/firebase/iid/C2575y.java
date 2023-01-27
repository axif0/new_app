package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.iid.y */
public class C2575y {

    /* renamed from: e */
    private static C2575y f8312e;

    /* renamed from: a */
    private String f8313a = null;

    /* renamed from: b */
    private Boolean f8314b = null;

    /* renamed from: c */
    private Boolean f8315c = null;

    /* renamed from: d */
    private final Queue<Intent> f8316d = new ArrayDeque();

    private C2575y() {
    }

    /* renamed from: a */
    private int m11464a(Context context, Intent intent) {
        ComponentName componentName;
        String f = m11466f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(f);
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Restricting intent to a specific service: ".concat(valueOf) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            if (mo9473e(context)) {
                componentName = C2543b0.m11403e(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e);
            return 401;
        } catch (IllegalStateException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(valueOf2);
            Log.e("FirebaseInstanceId", sb.toString());
            return 402;
        }
    }

    /* renamed from: b */
    public static synchronized C2575y m11465b() {
        C2575y yVar;
        synchronized (C2575y.class) {
            if (f8312e == null) {
                f8312e = new C2575y();
            }
            yVar = f8312e;
        }
        return yVar;
    }

    /* renamed from: f */
    private synchronized String m11466f(Context context, Intent intent) {
        String str;
        if (this.f8313a != null) {
            return this.f8313a;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            if (resolveService.serviceInfo != null) {
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    if (serviceInfo.name != null) {
                        if (serviceInfo.name.startsWith(".")) {
                            String valueOf = String.valueOf(context.getPackageName());
                            String valueOf2 = String.valueOf(serviceInfo.name);
                            str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                        } else {
                            str = serviceInfo.name;
                        }
                        this.f8313a = str;
                        return this.f8313a;
                    }
                }
                String str2 = serviceInfo.packageName;
                String str3 = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 94 + String.valueOf(str3).length());
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(str2);
                sb.append("/");
                sb.append(str3);
                Log.e("FirebaseInstanceId", sb.toString());
                return null;
            }
        }
        Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* renamed from: c */
    public Intent mo9471c() {
        return this.f8316d.poll();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9472d(Context context) {
        if (this.f8315c == null) {
            this.f8315c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f8314b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f8315c.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9473e(Context context) {
        if (this.f8314b == null) {
            this.f8314b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f8314b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f8314b.booleanValue();
    }

    /* renamed from: g */
    public int mo9474g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Starting service");
        }
        this.f8316d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m11464a(context, intent2);
    }
}
