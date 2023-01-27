package com.google.android.youtube.player.p042f;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.youtube.player.YouTubeThumbnailView;
import com.google.android.youtube.player.p042f.C2471h;

/* renamed from: com.google.android.youtube.player.f.m */
public final class C2481m extends C2461a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Handler f8129d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private C2465e f8130e;

    /* renamed from: f */
    private C2473i f8131f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f8132g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f8133h;

    /* renamed from: com.google.android.youtube.player.f.m$a */
    private final class C2482a extends C2471h.C2472a {

        /* renamed from: com.google.android.youtube.player.f.m$a$a */
        class C2483a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ boolean f8135f;

            /* renamed from: g */
            final /* synthetic */ boolean f8136g;

            /* renamed from: h */
            final /* synthetic */ Bitmap f8137h;

            /* renamed from: i */
            final /* synthetic */ String f8138i;

            C2483a(boolean z, boolean z2, Bitmap bitmap, String str) {
                this.f8135f = z;
                this.f8136g = z2;
                this.f8137h = bitmap;
                this.f8138i = str;
            }

            public final void run() {
                boolean unused = C2481m.this.f8132g = this.f8135f;
                boolean unused2 = C2481m.this.f8133h = this.f8136g;
                C2481m.this.mo9306b(this.f8137h, this.f8138i);
            }
        }

        /* renamed from: com.google.android.youtube.player.f.m$a$b */
        class C2484b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ boolean f8140f;

            /* renamed from: g */
            final /* synthetic */ boolean f8141g;

            /* renamed from: h */
            final /* synthetic */ String f8142h;

            C2484b(boolean z, boolean z2, String str) {
                this.f8140f = z;
                this.f8141g = z2;
                this.f8142h = str;
            }

            public final void run() {
                boolean unused = C2481m.this.f8132g = this.f8140f;
                boolean unused2 = C2481m.this.f8133h = this.f8141g;
                C2481m.this.mo9310f(this.f8142h);
            }
        }

        private C2482a() {
        }

        /* synthetic */ C2482a(C2481m mVar, byte b) {
            this();
        }

        /* renamed from: L0 */
        public final void mo9321L0(String str, boolean z, boolean z2) {
            C2481m.this.f8129d.post(new C2484b(z, z2, str));
        }

        /* renamed from: b0 */
        public final void mo9322b0(Bitmap bitmap, String str, boolean z, boolean z2) {
            C2481m.this.f8129d.post(new C2483a(z, z2, bitmap, str));
        }
    }

    public C2481m(C2465e eVar, YouTubeThumbnailView youTubeThumbnailView) {
        super(youTubeThumbnailView);
        C2463c.m11154b(eVar, "connectionClient cannot be null");
        this.f8130e = eVar;
        this.f8131f = eVar.mo9315v(new C2482a(this, (byte) 0));
    }

    /* renamed from: c */
    public final void mo9307c(String str) {
        try {
            this.f8131f.mo9325N(str);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo9308d() {
        return super.mo9308d() && this.f8131f != null;
    }

    /* renamed from: g */
    public final void mo9311g() {
        try {
            this.f8131f.mo9326t();
        } catch (RemoteException unused) {
        }
        this.f8130e.mo9335t();
        this.f8131f = null;
        this.f8130e = null;
    }
}
