package android.support.p004v4.media;

import android.os.Bundle;
import android.support.p004v4.media.session.MediaSessionCompat;
import android.util.Log;
import p082e.p083a.p084a.p085a.C3119b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
class MediaBrowserCompat$CustomActionResultReceiver extends C3119b {

    /* renamed from: h */
    private final String f674h;

    /* renamed from: i */
    private final Bundle f675i;

    /* renamed from: j */
    private final C0205a f676j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo586a(int i, Bundle bundle) {
        if (this.f676j != null) {
            MediaSessionCompat.m792a(bundle);
            if (i == -1) {
                this.f676j.mo624a(this.f674h, this.f675i, bundle);
            } else if (i == 0) {
                this.f676j.mo626c(this.f674h, this.f675i, bundle);
            } else if (i != 1) {
                Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f675i + ", resultData=" + bundle + ")");
            } else {
                this.f676j.mo625b(this.f674h, this.f675i, bundle);
            }
        }
    }
}
