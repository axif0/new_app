package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.C2776t;
import com.squareup.picasso.C2793y;
import java.io.IOException;
import p385n.C6288l;
import p385n.C6300s;

/* renamed from: com.squareup.picasso.o */
class C2768o extends C2754g {

    /* renamed from: b */
    private static final String[] f8833b = {"orientation"};

    /* renamed from: com.squareup.picasso.o$a */
    enum C2769a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: f */
        final int f8838f;

        /* renamed from: g */
        final int f8839g;

        /* renamed from: h */
        final int f8840h;

        private C2769a(int i, int i2, int i3) {
            this.f8838f = i;
            this.f8839g = i2;
            this.f8840h = i3;
        }
    }

    C2768o(Context context) {
        super(context);
    }

    /* renamed from: k */
    static int m12207k(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f8833b, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    if (query != null) {
                        query.close();
                    }
                    return i;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: l */
    static C2769a m12208l(int i, int i2) {
        C2769a aVar = C2769a.MICRO;
        if (i <= aVar.f8839g && i2 <= aVar.f8840h) {
            return aVar;
        }
        C2769a aVar2 = C2769a.MINI;
        return (i > aVar2.f8839g || i2 > aVar2.f8840h) ? C2769a.FULL : aVar2;
    }

    /* renamed from: c */
    public boolean mo10008c(C2789w wVar) {
        Uri uri = wVar.f8909d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: f */
    public C2793y.C2794a mo10009f(C2789w wVar, int i) throws IOException {
        Bitmap bitmap;
        C2789w wVar2 = wVar;
        ContentResolver contentResolver = this.f8799a.getContentResolver();
        int k = m12207k(contentResolver, wVar2.f8909d);
        String type = contentResolver.getType(wVar2.f8909d);
        boolean z = type != null && type.startsWith("video/");
        if (wVar.mo10120c()) {
            C2769a l = m12208l(wVar2.f8913h, wVar2.f8914i);
            if (!z && l == C2769a.FULL) {
                return new C2793y.C2794a((Bitmap) null, C6288l.m25940k(mo10047j(wVar)), C2776t.C2782e.DISK, k);
            }
            long parseId = ContentUris.parseId(wVar2.f8909d);
            BitmapFactory.Options d = C2793y.m12269d(wVar);
            d.inJustDecodeBounds = true;
            BitmapFactory.Options options = d;
            C2793y.m12267a(wVar2.f8913h, wVar2.f8914i, l.f8839g, l.f8840h, d, wVar);
            if (z) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, l == C2769a.FULL ? 1 : l.f8838f, options);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l.f8838f, options);
            }
            if (bitmap != null) {
                return new C2793y.C2794a(bitmap, (C6300s) null, C2776t.C2782e.DISK, k);
            }
        }
        return new C2793y.C2794a((Bitmap) null, C6288l.m25940k(mo10047j(wVar)), C2776t.C2782e.DISK, k);
    }
}
