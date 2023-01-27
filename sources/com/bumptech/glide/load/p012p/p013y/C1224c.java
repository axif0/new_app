package com.bumptech.glide.load.p012p.p013y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.p007o.C1029b;
import com.bumptech.glide.load.p006n.p007o.C1030c;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.load.p012p.C1190o;
import com.bumptech.glide.load.p012p.C1196r;
import com.bumptech.glide.p028r.C1387b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.y.c */
public class C1224c implements C1188n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f4408a;

    /* renamed from: com.bumptech.glide.load.p.y.c$a */
    public static class C1225a implements C1190o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f4409a;

        public C1225a(Context context) {
            this.f4409a = context;
        }

        /* renamed from: b */
        public C1188n<Uri, InputStream> mo5458b(C1196r rVar) {
            return new C1224c(this.f4409a);
        }
    }

    public C1224c(Context context) {
        this.f4408a = context.getApplicationContext();
    }

    /* renamed from: c */
    public C1188n.C1189a<InputStream> mo5453a(Uri uri, int i, int i2, C1002i iVar) {
        if (C1029b.m5638d(i, i2)) {
            return new C1188n.C1189a<>(new C1387b(uri), C1030c.m5641d(this.f4408a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo5454b(Uri uri) {
        return C1029b.m5635a(uri);
    }
}
