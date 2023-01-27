package com.google.android.youtube.player.p042f;

import android.graphics.Bitmap;
import com.google.android.youtube.player.C2458e;
import com.google.android.youtube.player.YouTubeThumbnailView;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.youtube.player.f.a */
public abstract class C2461a implements C2458e {

    /* renamed from: a */
    private final WeakReference<YouTubeThumbnailView> f8109a;

    /* renamed from: b */
    private C2458e.C2460b f8110b;

    /* renamed from: c */
    private boolean f8111c;

    public C2461a(YouTubeThumbnailView youTubeThumbnailView) {
        C2463c.m11153a(youTubeThumbnailView);
        this.f8109a = new WeakReference<>(youTubeThumbnailView);
    }

    /* renamed from: h */
    private void m11140h() {
        if (!mo9308d()) {
            throw new IllegalStateException("This YouTubeThumbnailLoader has been released");
        }
    }

    /* renamed from: a */
    public final void mo9303a(String str) {
        m11140h();
        mo9307c(str);
    }

    /* renamed from: b */
    public final void mo9306b(Bitmap bitmap, String str) {
        YouTubeThumbnailView youTubeThumbnailView = (YouTubeThumbnailView) this.f8109a.get();
        if (mo9308d() && youTubeThumbnailView != null) {
            youTubeThumbnailView.setImageBitmap(bitmap);
            C2458e.C2460b bVar = this.f8110b;
            if (bVar != null) {
                bVar.mo9304a(youTubeThumbnailView, str);
            }
        }
    }

    /* renamed from: c */
    public abstract void mo9307c(String str);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo9308d() {
        return !this.f8111c;
    }

    /* renamed from: e */
    public final void mo9309e() {
        if (mo9308d()) {
            C2496q.m11227b("The finalize() method for a YouTubeThumbnailLoader has work to do. You should have called release().", new Object[0]);
            mo9312i();
        }
    }

    /* renamed from: f */
    public final void mo9310f(String str) {
        C2458e.C2459a aVar;
        YouTubeThumbnailView youTubeThumbnailView = (YouTubeThumbnailView) this.f8109a.get();
        if (mo9308d() && this.f8110b != null && youTubeThumbnailView != null) {
            try {
                aVar = C2458e.C2459a.valueOf(str);
            } catch (IllegalArgumentException | NullPointerException unused) {
                aVar = C2458e.C2459a.UNKNOWN;
            }
            this.f8110b.mo9305b(youTubeThumbnailView, aVar);
        }
    }

    /* renamed from: g */
    public abstract void mo9311g();

    /* renamed from: i */
    public final void mo9312i() {
        if (mo9308d()) {
            this.f8111c = true;
            this.f8110b = null;
            mo9311g();
        }
    }
}
