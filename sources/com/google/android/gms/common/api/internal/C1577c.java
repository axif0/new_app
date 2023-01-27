package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1654m0;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.internal.C1662s;
import p148g.p189d.p190a.p232c.p237d.C4381l;

@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.c */
public final class C1577c {

    /* renamed from: d */
    private static final Object f5378d = new Object();

    /* renamed from: e */
    private static C1577c f5379e;

    /* renamed from: a */
    private final String f5380a;

    /* renamed from: b */
    private final Status f5381b;

    /* renamed from: c */
    private final boolean f5382c;

    C1577c(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C4381l.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            this.f5382c = !(resources.getInteger(identifier) != 0 ? true : z);
        } else {
            this.f5382c = false;
        }
        String a = C1654m0.m7829a(context);
        a = a == null ? new C1662s(context).mo6565a("google_app_id") : a;
        if (TextUtils.isEmpty(a)) {
            this.f5381b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f5380a = null;
            return;
        }
        this.f5380a = a;
        this.f5381b = Status.f5308j;
    }

    /* renamed from: a */
    private static C1577c m7620a(String str) {
        C1577c cVar;
        synchronized (f5378d) {
            if (f5379e != null) {
                cVar = f5379e;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return cVar;
    }

    /* renamed from: b */
    public static String m7621b() {
        return m7620a("getGoogleAppId").f5380a;
    }

    /* renamed from: c */
    public static Status m7622c(Context context) {
        Status status;
        C1658o.m7846k(context, "Context must not be null.");
        synchronized (f5378d) {
            if (f5379e == null) {
                f5379e = new C1577c(context);
            }
            status = f5379e.f5381b;
        }
        return status;
    }

    /* renamed from: d */
    public static boolean m7623d() {
        return m7620a("isMeasurementExplicitlyDisabled").f5382c;
    }
}
