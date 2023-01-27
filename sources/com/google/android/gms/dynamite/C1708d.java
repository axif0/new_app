package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.d */
final class C1708d implements DynamiteModule.C1700b {
    C1708d() {
    }

    /* renamed from: a */
    public final DynamiteModule.C1700b.C1702b mo6591a(Context context, String str, DynamiteModule.C1700b.C1701a aVar) throws DynamiteModule.C1699a {
        int i;
        DynamiteModule.C1700b.C1702b bVar = new DynamiteModule.C1700b.C1702b();
        bVar.f5595a = aVar.mo6592a(context, str);
        int b = aVar.mo6593b(context, str, true);
        bVar.f5596b = b;
        if (bVar.f5595a == 0 && b == 0) {
            i = 0;
        } else if (bVar.f5596b >= bVar.f5595a) {
            bVar.f5597c = 1;
            return bVar;
        } else {
            i = -1;
        }
        bVar.f5597c = i;
        return bVar;
    }
}
