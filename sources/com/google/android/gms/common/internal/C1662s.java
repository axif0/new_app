package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import p148g.p189d.p190a.p232c.p237d.C4381l;

/* renamed from: com.google.android.gms.common.internal.s */
public class C1662s {

    /* renamed from: a */
    private final Resources f5535a;

    /* renamed from: b */
    private final String f5536b;

    public C1662s(Context context) {
        C1658o.m7845j(context);
        Resources resources = context.getResources();
        this.f5535a = resources;
        this.f5536b = resources.getResourcePackageName(C4381l.common_google_play_services_unknown_issue);
    }

    /* renamed from: a */
    public String mo6565a(String str) {
        int identifier = this.f5535a.getIdentifier(str, "string", this.f5536b);
        if (identifier == 0) {
            return null;
        }
        return this.f5535a.getString(identifier);
    }
}
