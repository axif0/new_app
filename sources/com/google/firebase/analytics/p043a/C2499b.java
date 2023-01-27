package com.google.firebase.analytics.p043a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.measurement.p039a.C1714a;
import com.google.firebase.analytics.connector.internal.C2504b;
import java.util.concurrent.ConcurrentHashMap;
import p148g.p189d.p190a.p232c.p241f.p247f.C4552g;
import p148g.p189d.p281b.C5169a;
import p148g.p189d.p281b.C5171c;
import p148g.p189d.p281b.p284g.C5191a;
import p148g.p189d.p281b.p284g.C5194d;

/* renamed from: com.google.firebase.analytics.a.b */
public class C2499b implements C2498a {

    /* renamed from: b */
    private static volatile C2498a f8166b;

    /* renamed from: a */
    private final C1714a f8167a;

    private C2499b(C1714a aVar) {
        C1658o.m7845j(aVar);
        this.f8167a = aVar;
        new ConcurrentHashMap();
    }

    /* renamed from: c */
    public static C2498a m11238c(C5171c cVar, Context context, C5194d dVar) {
        C1658o.m7845j(cVar);
        C1658o.m7845j(context);
        C1658o.m7845j(dVar);
        C1658o.m7845j(context.getApplicationContext());
        if (f8166b == null) {
            synchronized (C2499b.class) {
                if (f8166b == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.mo15281q()) {
                        dVar.mo9402b(C5169a.class, C2501d.f8169a, C2500c.f8168a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.mo15280p());
                    }
                    f8166b = new C2499b(C4552g.m19453b(context, (String) null, (String) null, (String) null, bundle).mo14147e());
                }
            }
        }
        return f8166b;
    }

    /* renamed from: d */
    static final /* synthetic */ void m11239d(C5191a aVar) {
        boolean z = ((C5169a) aVar.mo15316a()).f15202a;
        synchronized (C2499b.class) {
            ((C2499b) f8166b).f8167a.mo6639c(z);
        }
    }

    /* renamed from: a */
    public void mo9355a(String str, String str2, Object obj) {
        if (C2504b.m11257a(str) && C2504b.m11259c(str, str2)) {
            this.f8167a.mo6638b(str, str2, obj);
        }
    }

    /* renamed from: b */
    public void mo9356b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C2504b.m11257a(str) && C2504b.m11258b(str2, bundle) && C2504b.m11260d(str, str2, bundle)) {
            C2504b.m11261e(str, str2, bundle);
            this.f8167a.mo6637a(str, str2, bundle);
        }
    }
}
