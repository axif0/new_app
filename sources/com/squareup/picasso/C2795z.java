package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.C2776t;
import com.squareup.picasso.C2793y;
import java.io.IOException;

/* renamed from: com.squareup.picasso.z */
class C2795z extends C2793y {

    /* renamed from: a */
    private final Context f8960a;

    C2795z(Context context) {
        this.f8960a = context;
    }

    /* renamed from: j */
    private static Bitmap m12280j(Resources resources, int i, C2789w wVar) {
        BitmapFactory.Options d = C2793y.m12269d(wVar);
        if (C2793y.m12270g(d)) {
            BitmapFactory.decodeResource(resources, i, d);
            C2793y.m12268b(wVar.f8913h, wVar.f8914i, d, wVar);
        }
        return BitmapFactory.decodeResource(resources, i, d);
    }

    /* renamed from: c */
    public boolean mo10008c(C2789w wVar) {
        if (wVar.f8910e != 0) {
            return true;
        }
        return "android.resource".equals(wVar.f8909d.getScheme());
    }

    /* renamed from: f */
    public C2793y.C2794a mo10009f(C2789w wVar, int i) throws IOException {
        Resources m = C2748d0.m12150m(this.f8960a, wVar);
        return new C2793y.C2794a(m12280j(m, C2748d0.m12149l(m, wVar), wVar), C2776t.C2782e.DISK);
    }
}
