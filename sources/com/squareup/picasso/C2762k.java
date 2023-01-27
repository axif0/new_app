package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.C2776t;
import com.squareup.picasso.C2793y;
import java.io.IOException;
import p086f.p129k.p130a.C3445a;
import p385n.C6288l;

/* renamed from: com.squareup.picasso.k */
class C2762k extends C2754g {
    C2762k(Context context) {
        super(context);
    }

    /* renamed from: k */
    static int m12192k(Uri uri) throws IOException {
        return new C3445a(uri.getPath()).mo11812e("Orientation", 1);
    }

    /* renamed from: c */
    public boolean mo10008c(C2789w wVar) {
        return "file".equals(wVar.f8909d.getScheme());
    }

    /* renamed from: f */
    public C2793y.C2794a mo10009f(C2789w wVar, int i) throws IOException {
        return new C2793y.C2794a((Bitmap) null, C6288l.m25940k(mo10047j(wVar)), C2776t.C2782e.DISK, m12192k(wVar.f8909d));
    }
}
