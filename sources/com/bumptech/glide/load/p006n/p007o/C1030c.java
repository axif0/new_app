package com.bumptech.glide.load.p006n.p007o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.C0963b;
import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p006n.C1017g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.o.c */
public class C1030c implements C1010d<InputStream> {

    /* renamed from: f */
    private final Uri f3992f;

    /* renamed from: g */
    private final C1034e f3993g;

    /* renamed from: h */
    private InputStream f3994h;

    /* renamed from: com.bumptech.glide.load.n.o.c$a */
    static class C1031a implements C1033d {

        /* renamed from: b */
        private static final String[] f3995b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f3996a;

        C1031a(ContentResolver contentResolver) {
            this.f3996a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo5206a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f3996a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f3995b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.o.c$b */
    static class C1032b implements C1033d {

        /* renamed from: b */
        private static final String[] f3997b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f3998a;

        C1032b(ContentResolver contentResolver) {
            this.f3998a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo5206a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f3998a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f3997b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    C1030c(Uri uri, C1034e eVar) {
        this.f3992f = uri;
        this.f3993g = eVar;
    }

    /* renamed from: c */
    private static C1030c m5640c(Context context, Uri uri, C1033d dVar) {
        return new C1030c(uri, new C1034e(C0963b.m5388c(context).mo5043j().mo5069g(), dVar, C0963b.m5388c(context).mo5038e(), context.getContentResolver()));
    }

    /* renamed from: d */
    public static C1030c m5641d(Context context, Uri uri) {
        return m5640c(context, uri, new C1031a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C1030c m5642g(Context context, Uri uri) {
        return m5640c(context, uri, new C1032b(context.getContentResolver()));
    }

    /* renamed from: h */
    private InputStream m5643h() throws FileNotFoundException {
        InputStream d = this.f3993g.mo5208d(this.f3992f);
        int a = d != null ? this.f3993g.mo5207a(this.f3992f) : -1;
        return a != -1 ? new C1017g(d, a) : d;
    }

    /* renamed from: a */
    public Class<InputStream> mo5162a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo5167b() {
        InputStream inputStream = this.f3994h;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    /* renamed from: e */
    public C0992a mo5171e() {
        return C0992a.LOCAL;
    }

    /* renamed from: f */
    public void mo5172f(C0969f fVar, C1010d.C1011a<? super InputStream> aVar) {
        try {
            InputStream h = m5643h();
            this.f3994h = h;
            aVar.mo5179d(h);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.mo5178c(e);
        }
    }
}
