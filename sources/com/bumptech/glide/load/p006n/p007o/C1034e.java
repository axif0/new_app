package com.bumptech.glide.load.p006n.p007o;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C0997f;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.o.e */
class C1034e {

    /* renamed from: f */
    private static final C1028a f3999f = new C1028a();

    /* renamed from: a */
    private final C1028a f4000a;

    /* renamed from: b */
    private final C1033d f4001b;

    /* renamed from: c */
    private final C1042b f4002c;

    /* renamed from: d */
    private final ContentResolver f4003d;

    /* renamed from: e */
    private final List<ImageHeaderParser> f4004e;

    C1034e(List<ImageHeaderParser> list, C1028a aVar, C1033d dVar, C1042b bVar, ContentResolver contentResolver) {
        this.f4000a = aVar;
        this.f4001b = dVar;
        this.f4002c = bVar;
        this.f4003d = contentResolver;
        this.f4004e = list;
    }

    C1034e(List<ImageHeaderParser> list, C1033d dVar, C1042b bVar, ContentResolver contentResolver) {
        this(list, f3999f, dVar, bVar, contentResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f A[Catch:{ all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m5651b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            com.bumptech.glide.load.n.o.d r2 = r6.f4001b     // Catch:{ SecurityException -> 0x0026, all -> 0x0024 }
            android.database.Cursor r2 = r2.mo5206a(r7)     // Catch:{ SecurityException -> 0x0026, all -> 0x0024 }
            if (r2 == 0) goto L_0x001e
            boolean r3 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x001c }
            if (r3 == 0) goto L_0x001e
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch:{ SecurityException -> 0x001c }
            if (r2 == 0) goto L_0x001b
            r2.close()
        L_0x001b:
            return r7
        L_0x001c:
            r3 = move-exception
            goto L_0x0028
        L_0x001e:
            if (r2 == 0) goto L_0x0023
            r2.close()
        L_0x0023:
            return r1
        L_0x0024:
            r7 = move-exception
            goto L_0x004b
        L_0x0026:
            r3 = move-exception
            r2 = r1
        L_0x0028:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0043
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            r4.append(r7)     // Catch:{ all -> 0x0049 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0049 }
            android.util.Log.d(r0, r7, r3)     // Catch:{ all -> 0x0049 }
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.close()
        L_0x0048:
            return r1
        L_0x0049:
            r7 = move-exception
            r1 = r2
        L_0x004b:
            if (r1 == 0) goto L_0x0050
            r1.close()
        L_0x0050:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p006n.p007o.C1034e.m5651b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    private boolean m5652c(File file) {
        return this.f4000a.mo5203a(file) && 0 < this.f4000a.mo5205c(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo5207a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.f4003d.openInputStream(uri);
            int a = C0997f.m5538a(this.f4004e, openInputStream, this.f4002c);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return a;
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    public InputStream mo5208d(Uri uri) throws FileNotFoundException {
        String b = m5651b(uri);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        File b2 = this.f4000a.mo5204b(b);
        if (!m5652c(b2)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b2);
        try {
            return this.f4003d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }
}
