package com.bumptech.glide.load.p006n;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.p006n.C1010d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.n.l */
public abstract class C1025l<T> implements C1010d<T> {

    /* renamed from: f */
    private final Uri f3988f;

    /* renamed from: g */
    private final ContentResolver f3989g;

    /* renamed from: h */
    private T f3990h;

    public C1025l(ContentResolver contentResolver, Uri uri) {
        this.f3989g = contentResolver;
        this.f3988f = uri;
    }

    /* renamed from: b */
    public void mo5167b() {
        T t = this.f3990h;
        if (t != null) {
            try {
                mo5163c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo5163c(T t) throws IOException;

    public void cancel() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract T mo5164d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    /* renamed from: e */
    public C0992a mo5171e() {
        return C0992a.LOCAL;
    }

    /* renamed from: f */
    public final void mo5172f(C0969f fVar, C1010d.C1011a<? super T> aVar) {
        try {
            T d = mo5164d(this.f3988f, this.f3989g);
            this.f3990h = d;
            aVar.mo5179d(d);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.mo5178c(e);
        }
    }
}
