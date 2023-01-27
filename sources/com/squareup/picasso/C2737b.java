package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.C2776t;
import com.squareup.picasso.C2793y;
import java.io.IOException;
import p385n.C6288l;

/* renamed from: com.squareup.picasso.b */
class C2737b extends C2793y {

    /* renamed from: d */
    private static final int f8748d = 22;

    /* renamed from: a */
    private final Context f8749a;

    /* renamed from: b */
    private final Object f8750b = new Object();

    /* renamed from: c */
    private AssetManager f8751c;

    C2737b(Context context) {
        this.f8749a = context;
    }

    /* renamed from: j */
    static String m12101j(C2789w wVar) {
        return wVar.f8909d.toString().substring(f8748d);
    }

    /* renamed from: c */
    public boolean mo10008c(C2789w wVar) {
        Uri uri = wVar.f8909d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    /* renamed from: f */
    public C2793y.C2794a mo10009f(C2789w wVar, int i) throws IOException {
        if (this.f8751c == null) {
            synchronized (this.f8750b) {
                if (this.f8751c == null) {
                    this.f8751c = this.f8749a.getAssets();
                }
            }
        }
        return new C2793y.C2794a(C6288l.m25940k(this.f8751c.open(m12101j(wVar))), C2776t.C2782e.DISK);
    }
}
