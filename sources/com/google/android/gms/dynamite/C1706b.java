package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.b */
final class C1706b implements DynamiteModule.C1700b {
    C1706b() {
    }

    /* renamed from: a */
    public final DynamiteModule.C1700b.C1702b mo6591a(Context context, String str, DynamiteModule.C1700b.C1701a aVar) throws DynamiteModule.C1699a {
        DynamiteModule.C1700b.C1702b bVar = new DynamiteModule.C1700b.C1702b();
        int a = aVar.mo6592a(context, str);
        bVar.f5595a = a;
        if (a != 0) {
            bVar.f5597c = -1;
        } else {
            int b = aVar.mo6593b(context, str, true);
            bVar.f5596b = b;
            if (b != 0) {
                bVar.f5597c = 1;
            }
        }
        return bVar;
    }
}
