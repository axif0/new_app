package com.google.android.youtube.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.youtube.player.p042f.C2461a;
import com.google.android.youtube.player.p042f.C2462b;
import com.google.android.youtube.player.p042f.C2463c;
import com.google.android.youtube.player.p042f.C2465e;
import com.google.android.youtube.player.p042f.C2492o;

public final class YouTubeThumbnailView extends ImageView {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2465e f8083f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2461a f8084g;

    /* renamed from: com.google.android.youtube.player.YouTubeThumbnailView$a */
    public interface C2450a {
        /* renamed from: a */
        void mo9295a(YouTubeThumbnailView youTubeThumbnailView, C2453b bVar);

        /* renamed from: b */
        void mo9296b(YouTubeThumbnailView youTubeThumbnailView, C2458e eVar);
    }

    /* renamed from: com.google.android.youtube.player.YouTubeThumbnailView$b */
    private static final class C2451b implements C2492o.C2493a, C2492o.C2494b {

        /* renamed from: a */
        private YouTubeThumbnailView f8085a;

        /* renamed from: b */
        private C2450a f8086b;

        public C2451b(YouTubeThumbnailView youTubeThumbnailView, C2450a aVar) {
            C2463c.m11154b(youTubeThumbnailView, "thumbnailView cannot be null");
            this.f8085a = youTubeThumbnailView;
            C2463c.m11154b(aVar, "onInitializedlistener cannot be null");
            this.f8086b = aVar;
        }

        /* renamed from: b */
        private void m11120b() {
            YouTubeThumbnailView youTubeThumbnailView = this.f8085a;
            if (youTubeThumbnailView != null) {
                C2465e unused = youTubeThumbnailView.f8083f = null;
                this.f8085a = null;
                this.f8086b = null;
            }
        }

        /* renamed from: a */
        public final void mo9297a(C2453b bVar) {
            this.f8086b.mo9295a(this.f8085a, bVar);
            m11120b();
        }

        /* renamed from: d */
        public final void mo9298d() {
            YouTubeThumbnailView youTubeThumbnailView = this.f8085a;
            if (youTubeThumbnailView != null && youTubeThumbnailView.f8083f != null) {
                C2461a unused = this.f8085a.f8084g = C2462b.m11149b().mo9313a(this.f8085a.f8083f, this.f8085a);
                C2450a aVar = this.f8086b;
                YouTubeThumbnailView youTubeThumbnailView2 = this.f8085a;
                aVar.mo9296b(youTubeThumbnailView2, youTubeThumbnailView2.f8084g);
                m11120b();
            }
        }

        /* renamed from: o */
        public final void mo9299o() {
            m11120b();
        }
    }

    public YouTubeThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YouTubeThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: e */
    public final void mo9293e(String str, C2450a aVar) {
        C2451b bVar = new C2451b(this, aVar);
        C2465e c = C2462b.m11149b().mo9314c(getContext(), str, bVar, bVar);
        this.f8083f = c;
        c.mo9339a();
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        C2461a aVar = this.f8084g;
        if (aVar != null) {
            aVar.mo9309e();
            this.f8084g = null;
        }
        super.finalize();
    }
}
