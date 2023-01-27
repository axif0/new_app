package android.support.p004v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p004v4.media.session.MediaSessionCompat;
import p082e.p083a.p084a.p085a.C3119b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
class MediaBrowserCompat$ItemReceiver extends C3119b {

    /* renamed from: h */
    private final String f677h;

    /* renamed from: i */
    private final C0206b f678i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo586a(int i, Bundle bundle) {
        MediaSessionCompat.m792a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            this.f678i.mo627a(this.f677h);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.f678i.mo628b((MediaBrowserCompat$MediaItem) parcelable);
        } else {
            this.f678i.mo627a(this.f677h);
        }
    }
}
