package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1658o;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;
import p148g.p189d.p190a.p232c.p241f.p246e.C4431h;
import p148g.p189d.p190a.p232c.p241f.p246e.C4432i;
import p148g.p189d.p190a.p232c.p241f.p246e.C4434k;
import p148g.p189d.p190a.p232c.p251i.C4940h;
import p148g.p189d.p190a.p232c.p251i.C4944k;

/* renamed from: com.google.firebase.messaging.n */
class C2642n implements Closeable {

    /* renamed from: f */
    private final URL f8449f;

    /* renamed from: g */
    private C4940h<Bitmap> f8450g;

    /* renamed from: h */
    private volatile InputStream f8451h;

    private C2642n(URL url) {
        this.f8449f = url;
    }

    /* renamed from: h */
    private byte[] m11727h() throws IOException {
        URLConnection openConnection = this.f8449f.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f8451h = inputStream;
                byte[] b = C4431h.m18678b(C4431h.m18677a(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    int length = b.length;
                    String valueOf = String.valueOf(this.f8449f);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("Downloaded ");
                    sb.append(length);
                    sb.append(" bytes from ");
                    sb.append(valueOf);
                    Log.v("FirebaseMessaging", sb.toString());
                }
                if (b.length <= 1048576) {
                    return b;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                C4434k.m18682b(th, th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    /* renamed from: j */
    public static C2642n m11728j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C2642n(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    /* renamed from: a */
    public Bitmap mo9593a() throws IOException {
        String valueOf = String.valueOf(this.f8449f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        Log.i("FirebaseMessaging", sb.toString());
        byte[] h = m11727h();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(h, 0, h.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf2 = String.valueOf(this.f8449f);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                sb2.append("Successfully downloaded image: ");
                sb2.append(valueOf2);
                Log.d("FirebaseMessaging", sb2.toString());
            }
            return decodeByteArray;
        }
        String valueOf3 = String.valueOf(this.f8449f);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
        sb3.append("Failed to decode image: ");
        sb3.append(valueOf3);
        throw new IOException(sb3.toString());
    }

    public void close() {
        try {
            C4432i.m18680a(this.f8451h);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }

    /* renamed from: m */
    public C4940h<Bitmap> mo9595m() {
        C4940h<Bitmap> hVar = this.f8450g;
        C1658o.m7845j(hVar);
        return hVar;
    }

    /* renamed from: o */
    public void mo9596o(Executor executor) {
        this.f8450g = C4944k.m20947c(executor, new C2641m(this));
    }
}
