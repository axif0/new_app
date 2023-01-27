package com.bumptech.glide.load.p012p;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p006n.p007o.C1029b;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.p028r.C1387b;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.p.k */
public final class C1181k implements C1188n<Uri, File> {

    /* renamed from: a */
    private final Context f4350a;

    /* renamed from: com.bumptech.glide.load.p.k$a */
    public static final class C1182a implements C1190o<Uri, File> {

        /* renamed from: a */
        private final Context f4351a;

        public C1182a(Context context) {
            this.f4351a = context;
        }

        /* renamed from: b */
        public C1188n<Uri, File> mo5458b(C1196r rVar) {
            return new C1181k(this.f4351a);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.k$b */
    private static class C1183b implements C1010d<File> {

        /* renamed from: h */
        private static final String[] f4352h = {"_data"};

        /* renamed from: f */
        private final Context f4353f;

        /* renamed from: g */
        private final Uri f4354g;

        C1183b(Context context, Uri uri) {
            this.f4353f = context;
            this.f4354g = uri;
        }

        /* renamed from: a */
        public Class<File> mo5162a() {
            return File.class;
        }

        /* renamed from: b */
        public void mo5167b() {
        }

        public void cancel() {
        }

        /* renamed from: e */
        public C0992a mo5171e() {
            return C0992a.LOCAL;
        }

        /* renamed from: f */
        public void mo5172f(C0969f fVar, C1010d.C1011a<? super File> aVar) {
            Cursor query = this.f4353f.getContentResolver().query(this.f4354g, f4352h, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo5178c(new FileNotFoundException("Failed to find file path for: " + this.f4354g));
                return;
            }
            aVar.mo5179d(new File(str));
        }
    }

    public C1181k(Context context) {
        this.f4350a = context;
    }

    /* renamed from: c */
    public C1188n.C1189a<File> mo5453a(Uri uri, int i, int i2, C1002i iVar) {
        return new C1188n.C1189a<>(new C1387b(uri), new C1183b(this.f4350a, uri));
    }

    /* renamed from: d */
    public boolean mo5454b(Uri uri) {
        return C1029b.m5636b(uri);
    }
}
