package com.bumptech.glide.load.p006n;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.p006n.C1010d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.n.b */
public abstract class C1008b<T> implements C1010d<T> {

    /* renamed from: f */
    private final String f3964f;

    /* renamed from: g */
    private final AssetManager f3965g;

    /* renamed from: h */
    private T f3966h;

    public C1008b(AssetManager assetManager, String str) {
        this.f3965g = assetManager;
        this.f3964f = str;
    }

    /* renamed from: b */
    public void mo5167b() {
        T t = this.f3966h;
        if (t != null) {
            try {
                mo5168c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo5168c(T t) throws IOException;

    public void cancel() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract T mo5170d(AssetManager assetManager, String str) throws IOException;

    /* renamed from: e */
    public C0992a mo5171e() {
        return C0992a.LOCAL;
    }

    /* renamed from: f */
    public void mo5172f(C0969f fVar, C1010d.C1011a<? super T> aVar) {
        try {
            T d = mo5170d(this.f3965g, this.f3964f);
            this.f3966h = d;
            aVar.mo5179d(d);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.mo5178c(e);
        }
    }
}
