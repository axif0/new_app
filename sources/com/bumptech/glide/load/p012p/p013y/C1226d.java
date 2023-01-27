package com.bumptech.glide.load.p012p.p013y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.p007o.C1029b;
import com.bumptech.glide.load.p006n.p007o.C1030c;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.load.p012p.C1190o;
import com.bumptech.glide.load.p012p.C1196r;
import com.bumptech.glide.load.p014q.p015d.C1276z;
import com.bumptech.glide.p028r.C1387b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.y.d */
public class C1226d implements C1188n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f4410a;

    /* renamed from: com.bumptech.glide.load.p.y.d$a */
    public static class C1227a implements C1190o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f4411a;

        public C1227a(Context context) {
            this.f4411a = context;
        }

        /* renamed from: b */
        public C1188n<Uri, InputStream> mo5458b(C1196r rVar) {
            return new C1226d(this.f4411a);
        }
    }

    public C1226d(Context context) {
        this.f4410a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m6241e(C1002i iVar) {
        Long l = (Long) iVar.mo5154c(C1276z.f4496d);
        return l != null && l.longValue() == -1;
    }

    /* renamed from: c */
    public C1188n.C1189a<InputStream> mo5453a(Uri uri, int i, int i2, C1002i iVar) {
        if (!C1029b.m5638d(i, i2) || !m6241e(iVar)) {
            return null;
        }
        return new C1188n.C1189a<>(new C1387b(uri), C1030c.m5642g(this.f4410a, uri));
    }

    /* renamed from: d */
    public boolean mo5454b(Uri uri) {
        return C1029b.m5637c(uri);
    }
}
