package com.bumptech.glide.load.p008o.p010b0;

import android.util.Log;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.p008o.p010b0.C1066a;
import com.bumptech.glide.p005l.C0983a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.o.b0.e */
public class C1075e implements C1066a {

    /* renamed from: a */
    private final C1085j f4067a;

    /* renamed from: b */
    private final File f4068b;

    /* renamed from: c */
    private final long f4069c;

    /* renamed from: d */
    private final C1070c f4070d = new C1070c();

    /* renamed from: e */
    private C0983a f4071e;

    @Deprecated
    protected C1075e(File file, long j) {
        this.f4068b = file;
        this.f4069c = j;
        this.f4067a = new C1085j();
    }

    /* renamed from: c */
    public static C1066a m5794c(File file, long j) {
        return new C1075e(file, j);
    }

    /* renamed from: d */
    private synchronized C0983a m5795d() throws IOException {
        if (this.f4071e == null) {
            this.f4071e = C0983a.m5485a0(this.f4068b, 1, 1, this.f4069c);
        }
        return this.f4071e;
    }

    /* renamed from: a */
    public void mo5278a(C0998g gVar, C1066a.C1068b bVar) {
        C0983a.C0986c J;
        String b = this.f4067a.mo5303b(gVar);
        this.f4070d.mo5282a(b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b + " for for Key: " + gVar);
            }
            try {
                C0983a d = m5795d();
                if (d.mo5122V(b) == null) {
                    J = d.mo5121J(b);
                    if (J != null) {
                        if (bVar.mo5281a(J.mo5131f(0))) {
                            J.mo5130e();
                        }
                        J.mo5129b();
                        this.f4070d.mo5283b(b);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b);
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            } catch (Throwable th) {
                J.mo5129b();
                throw th;
            }
        } finally {
            this.f4070d.mo5283b(b);
        }
    }

    /* renamed from: b */
    public File mo5279b(C0998g gVar) {
        String b = this.f4067a.mo5303b(gVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b + " for for Key: " + gVar);
        }
        try {
            C0983a.C0988e V = m5795d().mo5122V(b);
            if (V != null) {
                return V.mo5135a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }
}
