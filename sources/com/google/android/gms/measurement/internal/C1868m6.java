package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1658o;
import p148g.p189d.p190a.p232c.p241f.p247f.C4515e;

/* renamed from: com.google.android.gms.measurement.internal.m6 */
public final class C1868m6 {

    /* renamed from: a */
    final Context f6049a;

    /* renamed from: b */
    String f6050b;

    /* renamed from: c */
    String f6051c;

    /* renamed from: d */
    String f6052d;

    /* renamed from: e */
    Boolean f6053e;

    /* renamed from: f */
    long f6054f;

    /* renamed from: g */
    C4515e f6055g;

    /* renamed from: h */
    boolean f6056h = true;

    /* renamed from: i */
    Long f6057i;

    public C1868m6(Context context, C4515e eVar, Long l) {
        C1658o.m7845j(context);
        Context applicationContext = context.getApplicationContext();
        C1658o.m7845j(applicationContext);
        this.f6049a = applicationContext;
        this.f6057i = l;
        if (eVar != null) {
            this.f6055g = eVar;
            this.f6050b = eVar.f14074k;
            this.f6051c = eVar.f14073j;
            this.f6052d = eVar.f14072i;
            this.f6056h = eVar.f14071h;
            this.f6054f = eVar.f14070g;
            Bundle bundle = eVar.f14075l;
            if (bundle != null) {
                this.f6053e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
