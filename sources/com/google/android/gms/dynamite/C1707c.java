package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.c */
final class C1707c implements DynamiteModule.C1700b {
    C1707c() {
    }

    /* renamed from: a */
    public final DynamiteModule.C1700b.C1702b mo6591a(Context context, String str, DynamiteModule.C1700b.C1701a aVar) throws DynamiteModule.C1699a {
        DynamiteModule.C1700b.C1702b bVar = new DynamiteModule.C1700b.C1702b();
        int a = aVar.mo6592a(context, str);
        bVar.f5595a = a;
        bVar.f5596b = a != 0 ? aVar.mo6593b(context, str, false) : aVar.mo6593b(context, str, true);
        if (bVar.f5595a == 0 && bVar.f5596b == 0) {
            bVar.f5597c = 0;
        } else if (bVar.f5595a >= bVar.f5596b) {
            bVar.f5597c = -1;
        } else {
            bVar.f5597c = 1;
        }
        return bVar;
    }
}
