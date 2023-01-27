package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C1689l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p148g.p189d.p190a.p232c.p251i.C4940h;
import p148g.p189d.p190a.p232c.p251i.C4944k;

/* renamed from: com.google.firebase.iid.f */
public class C2551f {

    /* renamed from: c */
    private static final Object f8262c = new Object();

    /* renamed from: d */
    private static C2554g0 f8263d;

    /* renamed from: a */
    private final Context f8264a;

    /* renamed from: b */
    private final Executor f8265b;

    public C2551f(Context context) {
        this.f8264a = context;
        this.f8265b = C2539a.f8244a;
    }

    public C2551f(Context context, ExecutorService executorService) {
        this.f8264a = context;
        this.f8265b = executorService;
    }

    /* renamed from: a */
    private static C4940h<Integer> m11411a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        return m11412b(context, "com.google.firebase.MESSAGING_EVENT").mo9447c(intent).mo14867e(C2556h.m11429a(), C2546d.f8258a);
    }

    /* renamed from: b */
    private static C2554g0 m11412b(Context context, String str) {
        C2554g0 g0Var;
        synchronized (f8262c) {
            if (f8263d == null) {
                f8263d = new C2554g0(context, str);
            }
            g0Var = f8263d;
        }
        return g0Var;
    }

    /* renamed from: c */
    static final /* synthetic */ Integer m11413c(C4940h hVar) throws Exception {
        return -1;
    }

    /* renamed from: e */
    static final /* synthetic */ Integer m11415e(C4940h hVar) throws Exception {
        return 403;
    }

    /* renamed from: f */
    static final /* synthetic */ C4940h m11416f(Context context, Intent intent, C4940h hVar) throws Exception {
        return (!C1689l.m7966i() || ((Integer) hVar.mo14870h()).intValue() != 402) ? hVar : m11411a(context, intent).mo14867e(C2556h.m11429a(), C2549e.f8260a);
    }

    /* renamed from: g */
    public C4940h<Integer> mo9444g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return mo9445h(this.f8264a, intent);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: h */
    public C4940h<Integer> mo9445h(Context context, Intent intent) {
        boolean z = true;
        boolean z2 = C1689l.m7966i() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        return (!z2 || z) ? C4944k.m20947c(this.f8265b, new C2542b(context, intent)).mo14868f(this.f8265b, new C2544c(context, intent)) : m11411a(context, intent);
    }
}
